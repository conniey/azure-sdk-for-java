// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.core.amqp.implementation;

import com.azure.core.amqp.AmqpTransaction;
import com.azure.core.amqp.exception.AmqpErrorCondition;
import com.azure.core.amqp.models.DeliveryOutcome;
import com.azure.core.amqp.models.DeliveryState;
import com.azure.core.amqp.models.RejectedDeliveryOutcome;
import com.azure.core.amqp.models.TransactionalDeliveryOutcome;
import org.apache.qpid.proton.engine.impl.DeliveryImpl;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

import java.nio.ByteBuffer;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.ArgumentMatchers.isNull;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

/**
 * Unit tests for {@link TransactionCoordinator}
 */
public class TransactionCoordinatorTest {

    @Mock
    private MessageSerializer messageSerializer;
    @Mock
    private ReactorSender sendLink;
    private AutoCloseable mocksCloseable;

    @BeforeEach
    public void setup() {
        mocksCloseable = MockitoAnnotations.openMocks(this);
    }

    @AfterEach
    void teardown() throws Exception {
        // Tear down any inline mocks to avoid memory leaks.
        // https://github.com/mockito/mockito/wiki/What's-new-in-Mockito-2#mockito-2250
        Mockito.framework().clearInlineMocks();

        if (mocksCloseable != null) {
            mocksCloseable.close();
        }
    }

    @ParameterizedTest
    @ValueSource(booleans = {true, false})
    public void testCompleteTransactionRejected(boolean isCommit) {
        final RejectedDeliveryOutcome outcome = new RejectedDeliveryOutcome(AmqpErrorCondition.INTERNAL_ERROR);

        final AmqpTransaction transaction = new AmqpTransaction(ByteBuffer.wrap("1".getBytes()));

        TransactionCoordinator transactionCoordinator = new TransactionCoordinator(sendLink, messageSerializer);

        doReturn(Mono.just(outcome)).when(sendLink).send(any(byte[].class), anyInt(), eq(DeliveryImpl.DEFAULT_MESSAGE_FORMAT), isNull());

        StepVerifier.create(transactionCoordinator.discharge(transaction, isCommit))
            .verifyError(IllegalArgumentException.class);

        verify(sendLink, times(1)).send(any(byte[].class), anyInt(), eq(DeliveryImpl.DEFAULT_MESSAGE_FORMAT), isNull());
    }

    @ParameterizedTest
    @ValueSource(booleans = {true, false})
    public void testCompleteTransaction(boolean isCommit) {
        final DeliveryOutcome outcome = new DeliveryOutcome(DeliveryState.ACCEPTED);

        final AmqpTransaction transaction = new AmqpTransaction(ByteBuffer.wrap("1".getBytes()));

        TransactionCoordinator transactionCoordinator = new TransactionCoordinator(sendLink, messageSerializer);

        doReturn(Mono.just(outcome)).when(sendLink).send(any(byte[].class), anyInt(), eq(DeliveryImpl.DEFAULT_MESSAGE_FORMAT), isNull());

        StepVerifier.create(transactionCoordinator.discharge(transaction, isCommit))
            .verifyComplete();

        verify(sendLink).send(any(byte[].class), anyInt(), eq(DeliveryImpl.DEFAULT_MESSAGE_FORMAT), isNull());
    }

    @Test
    public void testCreateTransactionRejected() {
        final RejectedDeliveryOutcome outcome = new RejectedDeliveryOutcome(AmqpErrorCondition.ARGUMENT_ERROR);
        final TransactionCoordinator transactionCoordinator = new TransactionCoordinator(sendLink, messageSerializer);

        doReturn(Mono.just(outcome)).when(sendLink).send(any(byte[].class), anyInt(), eq(DeliveryImpl.DEFAULT_MESSAGE_FORMAT), isNull());

        StepVerifier.create(transactionCoordinator.declare())
            .verifyError(IllegalArgumentException.class);

        verify(sendLink).send(any(byte[].class), anyInt(), eq(DeliveryImpl.DEFAULT_MESSAGE_FORMAT), isNull());
    }

    @Test
    public void testCreateTransaction() {
        // Arrange
        final byte[] transactionId = "1".getBytes();
        final AmqpTransaction transaction = new AmqpTransaction(ByteBuffer.wrap(transactionId));
        final TransactionalDeliveryOutcome transactionalDeliveryOutcome = new TransactionalDeliveryOutcome(transaction);
        final TransactionCoordinator transactionCoordinator = new TransactionCoordinator(sendLink, messageSerializer);

        when(sendLink.send(any(byte[].class), anyInt(), eq(DeliveryImpl.DEFAULT_MESSAGE_FORMAT), isNull()))
            .thenReturn(Mono.just(transactionalDeliveryOutcome));

        // Act & Assert
        StepVerifier.create(transactionCoordinator.declare())
            .assertNext(actual -> {
                Assertions.assertNotNull(actual);
                Assertions.assertArrayEquals(transactionId, actual.getTransactionId().array());
            })
            .verifyComplete();

        verify(sendLink).send(any(byte[].class), anyInt(), eq(DeliveryImpl.DEFAULT_MESSAGE_FORMAT), isNull());
    }
}
