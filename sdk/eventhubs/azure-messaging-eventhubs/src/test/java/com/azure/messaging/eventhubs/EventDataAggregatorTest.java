// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.messaging.eventhubs;

import com.azure.core.amqp.exception.AmqpErrorCondition;
import com.azure.core.amqp.exception.AmqpException;
import com.azure.core.test.utils.metrics.TestGauge;
import com.azure.core.util.logging.ClientLogger;
import com.azure.core.util.logging.LogLevel;
import com.azure.messaging.eventhubs.EventHubBufferedProducerAsyncClient.BufferedProducerClientOptions;
import jdk.jfr.Event;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.reactivestreams.Subscription;
import reactor.core.CoreSubscriber;
import reactor.test.StepVerifier;
import reactor.test.publisher.TestPublisher;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Supplier;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

public class EventDataAggregatorTest {
    private static final ClientLogger LOGGER = new ClientLogger(EventDataAggregatorTest.class);

    private static final String NAMESPACE = "test.namespace";
    private static final String PARTITION_ID = "test-id";

    private AutoCloseable mockCloseable;

    @Mock
    private EventDataBatch batch;

    @Mock
    private EventDataBatch batch2;

    @Mock
    private EventDataBatch batch3;

    @Mock
    private CoreSubscriber<EventDataBatch> downstreamSubscriber;

    private final EventData event1 = new EventData("foo");
    private final EventData event2 = new EventData("bar");
    private final EventData event3 = new EventData("baz");

    @BeforeEach
    public void beforeEach() {
        mockCloseable = MockitoAnnotations.openMocks(this);
    }

    @AfterEach
    public void afterEach() throws Exception {
        if (mockCloseable != null) {
            mockCloseable.close();
        }

        Mockito.framework().clearInlineMock(this);
    }

    /**
     * Tests that it pushes full batches downstream (when tryAdd returns fall). Also, publishes any batches downstream
     * when upstream completes.
     */
    @Test
    public void pushesFullBatchesDownstream() {
        // Arrange
        final List<EventData> batchEvents = new ArrayList<>();
        setupBatchMock(batch, batchEvents, event1, event2);

        final List<EventData> batchEvents2 = new ArrayList<>();
        setupBatchMock(batch2, batchEvents2, event3);

        final Duration waitTime = Duration.ofSeconds(30);
        final BufferedProducerClientOptions options = new BufferedProducerClientOptions();
        options.setMaxWaitTime(waitTime);

        final AtomicInteger first = new AtomicInteger(0);
        final Supplier<EventDataBatch> supplier = () -> {
            final int current = first.getAndIncrement();

            switch (current) {
                case 0:
                    return batch;
                case 1:
                    return batch2;
                default:
                    throw new RuntimeException("pushesFullBatchesDownstream: Did not expect to get this many invocations.");
            }
        };

        final TestPublisher<EventData> publisher = TestPublisher.createCold();
        final EventDataAggregator aggregator = new EventDataAggregator(publisher.flux(), supplier, NAMESPACE, options, PARTITION_ID);

        // Act & Assert
        StepVerifier.create(aggregator)
            .then(() -> {
                publisher.next(event1, event2, event3);
            })
            .expectNext(batch)
            .then(() -> publisher.complete())
            .expectNext(batch2)
            .expectComplete()
            .verify(Duration.ofSeconds(10));
    }

    /**
     * Tests that it pushes partial batches downstream when an error occurs.
     */
    @Test
    public void pushesBatchesAndError() {
        // Arrange
        final List<EventData> batchEvents = new ArrayList<>();
        setupBatchMock(batch, batchEvents, event1, event2);

        final Duration waitTime = Duration.ofSeconds(30);
        final BufferedProducerClientOptions options = new BufferedProducerClientOptions();
        options.setMaxWaitTime(waitTime);

        final AtomicBoolean first = new AtomicBoolean();
        final Supplier<EventDataBatch> supplier = () -> {
            if (first.compareAndSet(false, true)) {
                return batch;
            } else {
                return batch2;
            }
        };

        final TestPublisher<EventData> publisher = TestPublisher.createCold();
        final EventDataAggregator aggregator = new EventDataAggregator(publisher.flux(), supplier, NAMESPACE, options, PARTITION_ID);
        final IllegalArgumentException testException = new IllegalArgumentException("Test exception.");

        // Act & Assert
        StepVerifier.create(aggregator)
            .then(() -> {
                publisher.next(event1, event2);
                publisher.error(testException);
            })
            .expectNext(batch)
            .expectErrorMatches(e -> e.equals(testException))
            .verify(Duration.ofSeconds(10));

        // Verify that these events were added to the batch.
        assertEquals(2, batchEvents.size());
        assertTrue(batchEvents.contains(event1));
        assertTrue(batchEvents.contains(event2));
    }

    /**
     * Tests that batches are pushed downstream when max wait time has elapsed.
     */
    @Test
    public void pushesBatchAfterMaxTime() {
        // Arrange
        final List<EventData> batchEvents = new ArrayList<>();
        setupBatchMock(batch, batchEvents, event1, event2);

        final List<EventData> batchEvents2 = new ArrayList<>();
        setupBatchMock(batch2, batchEvents2, event1, event2, event3);

        final Duration waitTime = Duration.ofSeconds(5);
        final BufferedProducerClientOptions options = new BufferedProducerClientOptions();
        options.setMaxWaitTime(waitTime);

        final AtomicInteger first = new AtomicInteger(0);
        final Supplier<EventDataBatch> supplier = () -> {
            final int current = first.getAndIncrement();

            switch (current) {
                case 0:
                    return batch;
                case 1:
                    return batch2;
                default:
                    LOGGER.log(LogLevel.VERBOSE, () -> "Invoked get batch for the xth time:" + current);
                    return batch3;
            }
        };

        final TestPublisher<EventData> publisher = TestPublisher.createCold();
        final EventDataAggregator aggregator = new EventDataAggregator(publisher.flux(), supplier, NAMESPACE, options, PARTITION_ID);

        // Act & Assert
        StepVerifier.create(aggregator)
            .then(() ->  {
                publisher.next(event1);
                publisher.next(event2);
            })
            .thenAwait(waitTime)
            .assertNext(b -> {
                assertEquals(b, batch);
                assertEquals(2, batchEvents.size());
            })
            .thenCancel()
            .verify();
    }

    /**
     * Verifies that an error is propagated when it is too large for the link.
     */
    @Test
    public void errorsOnEventThatDoesNotFit() {
        // Arrange
        final List<EventData> batchEvents = new ArrayList<>();
        setupBatchMock(batch, batchEvents);

        final Duration waitTime = Duration.ofSeconds(30);
        final BufferedProducerClientOptions options = new BufferedProducerClientOptions();
        options.setMaxWaitTime(waitTime);

        final AtomicBoolean first = new AtomicBoolean();
        final Supplier<EventDataBatch> supplier = () -> {
            if (first.compareAndSet(false, true)) {
                return batch;
            } else {
                throw new IllegalArgumentException("Did not expect another batch call.");
            }
        };

        final TestPublisher<EventData> publisher = TestPublisher.createCold();
        final EventDataAggregator aggregator = new EventDataAggregator(publisher.flux(), supplier, NAMESPACE, options, PARTITION_ID);

        StepVerifier.create(aggregator)
            .then(() -> {
                publisher.next(event1);
            })
            .consumeErrorWith(error -> {
                assertTrue(error instanceof AmqpException);
                assertEquals(AmqpErrorCondition.LINK_PAYLOAD_SIZE_EXCEEDED, ((AmqpException) error).getErrorCondition());
            })
            .verify(Duration.ofSeconds(20));
    }

    /**
     * Verifies that backpressure requests are supported.
     */
    @Test
    public void respectsBackpressure() {
        // Arrange
        final List<EventData> batchEvents = new ArrayList<>();
        setupBatchMock(batch, batchEvents, event1);

        final List<EventData> batchEvents2 = new ArrayList<>();
        setupBatchMock(batch2, batchEvents2);

        final Duration waitTime = Duration.ofSeconds(3);
        final BufferedProducerClientOptions options = new BufferedProducerClientOptions();
        options.setMaxWaitTime(waitTime);

        final AtomicInteger first = new AtomicInteger(0);
        final Supplier<EventDataBatch> supplier = () -> {
            final int current = first.getAndIncrement();

            switch (current) {
                case 0:
                    return batch;
                case 1:
                    return batch2;
                default:
                    throw new RuntimeException("respectsBackpressure: Did not expect to get this many invocations.");
            }
        };

        final TestPublisher<EventData> publisher = TestPublisher.createCold();
        final EventDataAggregator aggregator = new EventDataAggregator(publisher.flux(), supplier, NAMESPACE, options, PARTITION_ID);

        final long request = 1L;

        StepVerifier.create(aggregator, request)
            .then(() -> publisher.next(event1))
            .assertNext(b -> {
                assertEquals(1, b.getCount());
                assertTrue(b.getEvents().contains(event1));
            })
            .expectNoEvent(waitTime)
            .thenCancel()
            .verify();

        publisher.assertMaxRequested(request);
    }

    @Test
    public void enqueuesEvent() {
        // Arrange
        final String namespace = "test-namespace.com";
        final String partitionId = "test-partition-id";

        final Subscription subscription = mock(Subscription.class);
        final List<EventData> batchEvents = new ArrayList<>();

        setupBatchMock(batch, batchEvents, event1, event2);

        final Duration waitTime = Duration.ofSeconds(5);
        final BufferedProducerClientOptions options = new BufferedProducerClientOptions();
        options.setMaxWaitTime(waitTime);

        final AtomicBoolean first = new AtomicBoolean();
        final Supplier<EventDataBatch> supplier = () -> {
            if (first.compareAndSet(false, true)) {
                return batch;
            } else {
                return batch2;
            }
        };

        final EventDataAggregator.EventDataAggregatorMain aggregator = new EventDataAggregator.EventDataAggregatorMain(
            downstreamSubscriber, namespace, options, supplier, partitionId, LOGGER);

        // Act & Arrange
        aggregator.onSubscribe(subscription);
        verify(subscription, times(1)).request(1L);

        aggregator.onNext(event1);
        verify(downstreamSubscriber, times(0)).onNext(any(EventDataBatch.class));

        aggregator.onNext(event3);
        verify(downstreamSubscriber, times(1)).onNext(batch);
    }

    /**
     * Helper method to set up mocked {@link EventDataBatch} to accept the given events in {@code resultSet}.
     *
     * @param batch Mocked batch.
     * @param resultSet List to store added EventData in.
     * @param acceptedEvents EventData that is accepted by the batch when {@link EventDataBatch#tryAdd(EventData)}
     *     is invoked.
     */
    static void setupBatchMock(EventDataBatch batch, List<EventData> resultSet, EventData... acceptedEvents) {
        when(batch.tryAdd(any(EventData.class))).thenAnswer(invocation -> {
            final EventData arg = invocation.getArgument(0);

            final boolean matches = Arrays.asList(acceptedEvents).contains(arg);

            if (matches) {
                resultSet.add(arg);
            }

            return matches;
        });
        when(batch.getEvents()).thenAnswer(invocation -> resultSet);
        when(batch.getCount()).thenAnswer(invocation -> resultSet.size());
    }
}
