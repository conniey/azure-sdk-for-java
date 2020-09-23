// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.messaging.servicebus;

import com.azure.core.util.CoreUtils;
import com.azure.core.util.logging.ClientLogger;
import com.azure.messaging.servicebus.administration.models.DeadLetterOptions;
import com.azure.messaging.servicebus.implementation.DispositionStatus;
import com.azure.messaging.servicebus.models.ReceiveMode;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.time.Duration;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static com.azure.core.util.FluxUtil.monoError;

public class ServiceBusSessionReceiverAsyncClient implements AutoCloseable {
    private static final DeadLetterOptions DEFAULT_DEAD_LETTER_OPTIONS = new DeadLetterOptions();

    private final ClientLogger logger = new ClientLogger(ServiceBusSessionReceiverAsyncClient.class);

    ServiceBusSessionReceiverAsyncClient() {
    }

    /**
     * Gets the fully qualified Service Bus namespace that the connection is associated with. This is likely similar to
     * {@code {yournamespace}.servicebus.windows.net}.
     *
     * @return The fully qualified Service Bus namespace that the connection is associated with.
     */
    public String getFullyQualifiedNamespace() {
        return "fullyQualifiedNamespace";
    }

    /**
     * Gets the Service Bus resource this client interacts with.
     *
     * @return The Service Bus resource this client interacts with.
     */
    public String getEntityPath() {
        return "entityPath";
    }

    /**
     * Abandon a {@link ServiceBusReceivedMessage message}. This will make the message available
     * again for processing. Abandoning a message will increase the delivery count on the message.
     *
     * @param message The {@link ServiceBusReceivedMessage} to perform this operation.
     *
     * @return A {@link Mono} that completes when the Service Bus abandon operation completes.
     * @throws NullPointerException if {@code message} is null.
     * @throws UnsupportedOperationException if the receiver was opened in {@link ReceiveMode#RECEIVE_AND_DELETE}
     *     mode.
     */
    public Mono<Void> abandon(ServiceBusReceivedMessage message) {
        return abandon(message, null);
    }

    /**
     * Abandon a {@link ServiceBusReceivedMessage message} updates the message's properties.
     * This will make the message available again for processing. Abandoning a message will increase the delivery count
     * on the message.
     *
     * @param message The {@link ServiceBusReceivedMessage} to perform this operation.
     * @param propertiesToModify Properties to modify on the message.
     *
     * @return A {@link Mono} that completes when the Service Bus operation finishes.
     * @throws NullPointerException if {@code message} is null.
     * @throws UnsupportedOperationException if the receiver was opened in {@link ReceiveMode#RECEIVE_AND_DELETE}
     *     mode.
     */
    public Mono<Void> abandon(ServiceBusReceivedMessage message, Map<String, Object> propertiesToModify) {
        return updateDisposition(message, DispositionStatus.ABANDONED, null, null,
            propertiesToModify, null);
    }

    /**
     * Completes a {@link ServiceBusReceivedMessage message}. This will delete the message from the service.
     *
     * @param message The {@link ServiceBusReceivedMessage} to perform this operation.
     *
     * @return A {@link Mono} that finishes when the message is completed on Service Bus.
     * @throws NullPointerException if {@code message} is null.
     * @throws UnsupportedOperationException if the receiver was opened in {@link ReceiveMode#RECEIVE_AND_DELETE}
     *     mode.
     */
    public Mono<Void> complete(ServiceBusReceivedMessage message) {
        return updateDisposition(message, DispositionStatus.COMPLETED, null, null,
            null, null);
    }

    /**
     * Defers a {@link ServiceBusReceivedMessage message}. This will move message into the deferred subqueue.
     *
     * @param message The {@link ServiceBusReceivedMessage} to perform this operation.
     *
     * @return A {@link Mono} that completes when the Service Bus defer operation finishes.
     * @throws NullPointerException if {@code message} is null.
     * @throws UnsupportedOperationException if the receiver was opened in {@link ReceiveMode#RECEIVE_AND_DELETE}
     *     mode.
     * @see <a href="https://docs.microsoft.com/azure/service-bus-messaging/message-deferral">Message deferral</a>
     */
    public Mono<Void> defer(ServiceBusReceivedMessage message) {
        return defer(message, null);
    }

    /**
     * Defers a {@link ServiceBusReceivedMessage message} with modified message property. This will move message into
     * the deferred subqueue.
     *
     * @param message The {@link ServiceBusReceivedMessage} to perform this operation.
     * @param propertiesToModify Message properties to modify.
     *
     * @return A {@link Mono} that completes when the defer operation finishes.
     * @throws NullPointerException if {@code message} is null.
     * @throws UnsupportedOperationException if the receiver was opened in {@link ReceiveMode#RECEIVE_AND_DELETE}
     *     mode.
     * @see <a href="https://docs.microsoft.com/azure/service-bus-messaging/message-deferral">Message deferral</a>
     */
    public Mono<Void> defer(ServiceBusReceivedMessage message, Map<String, Object> propertiesToModify) {
        return updateDisposition(message, DispositionStatus.DEFERRED, null, null,
            propertiesToModify, null);
    }

    /**
     * Moves a {@link ServiceBusReceivedMessage message} to the deadletter sub-queue.
     *
     * @param message The {@link ServiceBusReceivedMessage} to perform this operation.
     *
     * @return A {@link Mono} that completes when the dead letter operation finishes.
     * @throws NullPointerException if {@code message} is null.
     * @throws UnsupportedOperationException if the receiver was opened in {@link ReceiveMode#RECEIVE_AND_DELETE}
     *     mode.
     * @see <a href="https://docs.microsoft.com/azure/service-bus-messaging/service-bus-dead-letter-queues">Dead letter
     *     queues</a>
     */
    public Mono<Void> deadLetter(ServiceBusReceivedMessage message) {
        return deadLetter(message, DEFAULT_DEAD_LETTER_OPTIONS);
    }

    /**
     * Moves a {@link ServiceBusReceivedMessage message} to the deadletter subqueue with deadletter reason, error
     * description, and/or modified properties.
     *
     * @param message The {@link ServiceBusReceivedMessage} to perform this operation.
     * @param deadLetterOptions The options to specify when moving message to the deadletter sub-queue.
     *
     * @return A {@link Mono} that completes when the dead letter operation finishes.
     * @throws NullPointerException if {@code message} is null.
     * @throws UnsupportedOperationException if the receiver was opened in {@link ReceiveMode#RECEIVE_AND_DELETE}
     *     mode.
     */
    public Mono<Void> deadLetter(ServiceBusReceivedMessage message, DeadLetterOptions deadLetterOptions) {
        if (Objects.isNull(deadLetterOptions)) {
            return monoError(logger, new NullPointerException("'deadLetterOptions' cannot be null."));
        }

        return updateDisposition(message, DispositionStatus.SUSPENDED, deadLetterOptions.getDeadLetterReason(),
            deadLetterOptions.getDeadLetterErrorDescription(), deadLetterOptions.getPropertiesToModify(),
            null);
    }

    /**
     * Gets the state of a session given its identifier.
     *
     * @param sessionId Identifier of session to get.
     *
     * @return The session state or an empty Mono if there is no state set for the session.
     * @throws IllegalStateException if the receiver is a non-session receiver.
     */
    public Mono<byte[]> getSessionState(String sessionId) {
        if (CoreUtils.isNullOrEmpty(sessionId)) {
            return monoError(logger, new IllegalArgumentException("invalid session id"));
        }

        return Mono.just("foo".getBytes());
    }

    public Flux<ServiceBusReceivedMessageContext> receiveMessages() {
        final String sessionId = "session-0";
        final List<ServiceBusReceivedMessageContext> messages = IntStream.range(0, 10).mapToObj(index -> {
            final ServiceBusReceivedMessage message = new ServiceBusReceivedMessage(("foo " + index).getBytes());
            message.setSessionId(sessionId);
            message.setMessageId(UUID.randomUUID().toString());

            return new ServiceBusReceivedMessageContext(message);
        }).collect(Collectors.toList());

        return Flux.fromIterable(messages);
    }

    /**
     * Renews the session lock.
     *
     * @param sessionId Identifier of session to get.
     *
     * @return The next expiration time for the session lock.
     * @throws IllegalStateException if the receiver is a non-session receiver.
     */
    public Mono<OffsetDateTime> renewSessionLock(String sessionId) {
        if (CoreUtils.isNullOrEmpty(sessionId)) {
            return monoError(logger, new IllegalArgumentException("invalid session id"));
        }

        return Mono.empty();
    }

    /**
     * Starts the auto lock renewal for a session id.
     *
     * @param sessionId Id for the session to renew.
     * @param maxLockRenewalDuration Maximum duration to keep renewing the session lock.
     *
     * @return A lock renewal operation for the message.
     * @throws NullPointerException if {@code sessionId} or {@code maxLockRenewalDuration} is null.
     * @throws IllegalArgumentException if {@code sessionId} is an empty string.
     * @throws IllegalStateException if the receiver is a non-session receiver or the receiver is disposed.
     */
    public Mono<Void> renewSessionLock(String sessionId, Duration maxLockRenewalDuration) {
        if (CoreUtils.isNullOrEmpty(sessionId)) {
            return monoError(logger, new IllegalArgumentException("invalid session id"));
        }

        return Mono.empty();
    }

    /**
     * Sets the state of a session given its identifier.
     *
     * @param sessionId Identifier of session to get.
     * @param sessionState State to set on the session.
     *
     * @return A Mono that completes when the session is set
     * @throws IllegalStateException if the receiver is a non-session receiver.
     */
    public Mono<Void> setSessionState(String sessionId, byte[] sessionState) {
        if (CoreUtils.isNullOrEmpty(sessionId)) {
            return monoError(logger, new IllegalArgumentException("invalid session id"));
        }

        return Mono.empty();
    }

    @Override
    public void close() {
    }

    private Mono<Void> updateDisposition(ServiceBusReceivedMessage message, DispositionStatus dispositionStatus,
        String deadLetterReason, String deadLetterErrorDescription, Map<String, Object> propertiesToModify,
        ServiceBusTransactionContext transactionContext) {
        return Mono.empty();
    }
}
