// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.core.amqp.implementation;

import com.azure.core.amqp.AmqpTransaction;
import com.azure.core.amqp.AmqpTransactionCoordinator;
import com.azure.core.util.logging.ClientLogger;
import com.azure.core.amqp.models.TransactionalDeliveryOutcome;
import org.apache.qpid.proton.Proton;
import org.apache.qpid.proton.amqp.Binary;
import org.apache.qpid.proton.amqp.messaging.AmqpValue;
import org.apache.qpid.proton.amqp.transaction.Declare;
import org.apache.qpid.proton.amqp.transaction.Discharge;
import org.apache.qpid.proton.amqp.transport.DeliveryState;
import org.apache.qpid.proton.engine.impl.DeliveryImpl;
import org.apache.qpid.proton.message.Message;
import reactor.core.publisher.Mono;

import static com.azure.core.amqp.implementation.ClientConstants.MAX_AMQP_HEADER_SIZE_BYTES;

/**
 * Encapsulates transaction functions.
 */
final class TransactionCoordinator implements AmqpTransactionCoordinator {
    private final ClientLogger logger = new ClientLogger(TransactionCoordinator.class);
    private final ReactorSender sendLink;
    private final MessageSerializer messageSerializer;

    TransactionCoordinator(ReactorSender sendLink, MessageSerializer messageSerializer) {
        this.sendLink = sendLink;
        this.messageSerializer = messageSerializer;
    }

    /**
     * Completes the transaction. All the work in this transaction will either rollback or committed as one unit of
     * work.
     *
     * @param transaction that needs to be completed.
     * @param isCommit true for commit and false to rollback this transaction.
     *
     * @return a completable {@link Mono} which represent {@link DeliveryState}.
     */
    @Override
    public Mono<Void> discharge(AmqpTransaction transaction, boolean isCommit) {
        final Message message = Proton.message();
        Discharge discharge = new Discharge();
        discharge.setFail(!isCommit);
        discharge.setTxnId(new Binary(transaction.getTransactionId().array()));
        message.setBody(new AmqpValue(discharge));

        final int payloadSize = messageSerializer.getSize(message);
        final int allocationSize = payloadSize + MAX_AMQP_HEADER_SIZE_BYTES;

        final byte[] bytes = new byte[allocationSize];
        final int encodedSize = message.encode(bytes, 0, allocationSize);

        return sendLink.send(bytes, encodedSize, DeliveryImpl.DEFAULT_MESSAGE_FORMAT, null)
            .handle((outcome, sink) -> {
                if (outcome.getDeliveryState() == com.azure.core.amqp.models.DeliveryState.ACCEPTED) {
                    sink.complete();
                } else {
                    sink.error(new IllegalArgumentException("Expected Accepted delivery outcome. Actual: " + outcome));
                }
            });
    }

    /**
     * Creates the transaction in message broker.
     *
     * @return a completable {@link Mono} which represent {@link DeliveryState}.
     */
    @Override
    public Mono<AmqpTransaction> declare() {
        final Message message = Proton.message();
        final Declare declare = new Declare();
        message.setBody(new AmqpValue(declare));

        final int payloadSize = messageSerializer.getSize(message);
        final int allocationSize = payloadSize + MAX_AMQP_HEADER_SIZE_BYTES;

        final byte[] bytes = new byte[allocationSize];
        final int encodedSize = message.encode(bytes, 0, allocationSize);

        return sendLink.send(bytes, encodedSize, DeliveryImpl.DEFAULT_MESSAGE_FORMAT, null)
            .handle((outcome, sink) -> {
                if (outcome instanceof TransactionalDeliveryOutcome) {
                    final TransactionalDeliveryOutcome transaction = (TransactionalDeliveryOutcome) outcome;
                    sink.next(new AmqpTransaction(transaction.getTransactionId()));
                } else {
                    sink.error(new IllegalArgumentException(String.format(
                        "Expected Declared transaction outcome. Actual: %s. Type: %s", outcome.getDeliveryState(),
                        outcome)));
                }
            });
    }
}
