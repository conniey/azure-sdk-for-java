// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.messaging.servicebus;

import com.azure.core.amqp.exception.AmqpErrorContext;
import com.azure.core.amqp.implementation.ErrorContextProvider;
import com.azure.core.amqp.implementation.MessageSerializer;
import com.azure.core.util.BinaryData;
import com.azure.messaging.servicebus.implementation.instrumentation.ServiceBusTracer;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static com.azure.messaging.servicebus.ServiceBusSenderAsyncClient.MAX_MESSAGE_LENGTH_BYTES;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.when;

public class ServiceBusMessageBatchTest {
    @Mock
    private ErrorContextProvider errorContextProvider;

    private MessageSerializer serializer = new ServiceBusMessageSerializer();
    private ServiceBusTracer tracer = new ServiceBusTracer(null, "namespace", "entity");

    @BeforeEach
    public void setup() {
        MockitoAnnotations.initMocks(this);
    }

    @ParameterizedTest
    @ValueSource(booleans = { true, false })
    public void nullMessage(boolean isV2) {
        final ServiceBusMessageBatch batch
            = new ServiceBusMessageBatch(isV2, 1024, errorContextProvider, tracer, serializer);
        assertThrows(NullPointerException.class, () -> batch.tryAddMessage(null));
    }

    /**
     * Verify that if we try to add a payload that is too big for the ServiceBusMessageBatch, it throws.
     */
    @ParameterizedTest
    @ValueSource(booleans = { true, false })
    public void payloadExceededException(boolean isV2) {
        // Arrange
        when(errorContextProvider.getErrorContext()).thenReturn(new AmqpErrorContext("test-namespace"));

        final ServiceBusMessageBatch batch
            = new ServiceBusMessageBatch(isV2, 1024, errorContextProvider, tracer, serializer);
        final ServiceBusMessage tooBig = new ServiceBusMessage(BinaryData.fromBytes(new byte[1024 * 1024 * 2]));

        // Act
        ServiceBusException thrownException
            = assertThrows(ServiceBusException.class, () -> batch.tryAddMessage(tooBig));

        // Assert
        Assertions.assertFalse(thrownException.isTransient());
        Assertions.assertEquals(ServiceBusErrorSource.SEND, thrownException.getErrorSource());
        Assertions.assertEquals(ServiceBusFailureReason.MESSAGE_SIZE_EXCEEDED, thrownException.getReason());
    }

    /**
     * Verify that we can add a message that is within the batch's size limits.
     */
    @ParameterizedTest
    @ValueSource(booleans = { true, false })
    public void withinPayloadSize(boolean isV2) {
        final int maxSize = MAX_MESSAGE_LENGTH_BYTES;
        final ServiceBusMessageBatch batch
            = new ServiceBusMessageBatch(isV2, maxSize, errorContextProvider, tracer, serializer);
        final ServiceBusMessage within = new ServiceBusMessage(BinaryData.fromBytes(new byte[1024]));

        Assertions.assertEquals(maxSize, batch.getMaxSizeInBytes());
        Assertions.assertTrue(maxSize > batch.getSizeInBytes());
        Assertions.assertTrue(batch.tryAddMessage(within));
        Assertions.assertEquals(1, batch.getCount());
    }

    /**
     * Verify that a batch is empty.
     */
    @ParameterizedTest
    @ValueSource(booleans = { true, false })
    public void setsPartitionId(boolean isV2) {
        // Act
        final ServiceBusMessageBatch batch
            = new ServiceBusMessageBatch(isV2, MAX_MESSAGE_LENGTH_BYTES, errorContextProvider, tracer, serializer);

        // Assert
        Assertions.assertTrue(batch.getMessages().isEmpty());
    }
}
