// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.messaging.eventhubs;

import com.azure.core.amqp.AmqpMessageConstant;
import com.azure.core.amqp.implementation.MessageSerializer;
import com.azure.core.credential.TokenCredential;
import com.azure.core.util.Configuration;
import com.azure.core.util.CoreUtils;
import com.azure.core.util.logging.ClientLogger;
import com.azure.identity.AzurePipelinesCredentialBuilder;
import com.azure.messaging.eventhubs.models.PartitionEvent;
import org.apache.qpid.proton.Proton;
import org.apache.qpid.proton.amqp.Binary;
import org.apache.qpid.proton.amqp.Symbol;
import org.apache.qpid.proton.amqp.messaging.ApplicationProperties;
import org.apache.qpid.proton.amqp.messaging.Data;
import org.apache.qpid.proton.amqp.messaging.MessageAnnotations;
import org.apache.qpid.proton.codec.ReadableBuffer;
import org.apache.qpid.proton.message.Message;
import reactor.core.publisher.Mono;
import reactor.core.scheduler.Schedulers;

import java.time.Instant;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static com.azure.core.amqp.AmqpMessageConstant.ENQUEUED_TIME_UTC_ANNOTATION_NAME;
import static com.azure.core.amqp.AmqpMessageConstant.OFFSET_ANNOTATION_NAME;
import static com.azure.core.amqp.AmqpMessageConstant.PARTITION_KEY_ANNOTATION_NAME;
import static com.azure.core.amqp.AmqpMessageConstant.SEQUENCE_NUMBER_ANNOTATION_NAME;
import static java.nio.charset.StandardCharsets.UTF_8;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

/**
 * Contains helper methods for working with AMQP messages
 */
public final class TestUtils {
    private static final MessageSerializer MESSAGE_SERIALIZER = new EventHubMessageSerializer();
    private static final ClientLogger LOGGER = new ClientLogger(TestUtils.class);

    // System and application properties from the generated test message.
    static final Instant ENQUEUED_TIME = Instant.ofEpochSecond(1561344661);
    static final Long OFFSET = 1534L;
    static final String PARTITION_KEY = "a-partition-key";
    static final Long SEQUENCE_NUMBER = 1025L;
    static final String OTHER_SYSTEM_PROPERTY = "Some-other-system-property";
    static final Boolean OTHER_SYSTEM_PROPERTY_VALUE = Boolean.TRUE;
    static final Map<String, Object> APPLICATION_PROPERTIES = new HashMap<>();

    // An application property key used to identify that the request belongs to a test set.
    public static final String MESSAGE_ID = "message-id";
    // An application property key to identify where in the stream this event was created.
    public static final String MESSAGE_POSITION_ID = "message-position";

    /**
     * For integration tests.
     */
    public static final String INTEGRATION = "integration";

    static {
        APPLICATION_PROPERTIES.put("test-name", EventDataTest.class.getName());
        APPLICATION_PROPERTIES.put("a-number", 10L);
    }

    static Symbol getSymbol(AmqpMessageConstant messageConstant) {
        return Symbol.getSymbol(messageConstant.getValue());
    }

    /**
     * Creates a mock message with the contents provided.
     */
    static Message getMessage(byte[] contents) {
        return getMessage(contents, null);
    }

    /**
     * Creates a mock message with the contents provided.
     */
    static Message getMessage(byte[] contents, String messageTrackingValue) {
        return getMessage(contents, messageTrackingValue, Collections.emptyMap());
    }

    /**
     * Creates a message with the given contents, default system properties, and adds a {@code messageTrackingValue} in
     * the application properties. Useful for helping filter messages.
     */
    static Message getMessage(byte[] contents, String messageTrackingValue, Map<String, String> additionalProperties) {
        final Message message = getMessage(contents, SEQUENCE_NUMBER, OFFSET, Date.from(ENQUEUED_TIME));

        message.getMessageAnnotations().getValue()
            .put(Symbol.getSymbol(OTHER_SYSTEM_PROPERTY), OTHER_SYSTEM_PROPERTY_VALUE);

        Map<String, Object> applicationProperties = new HashMap<>(APPLICATION_PROPERTIES);

        if (!CoreUtils.isNullOrEmpty(messageTrackingValue)) {
            applicationProperties.put(MESSAGE_ID, messageTrackingValue);
        }

        if (additionalProperties != null) {
            applicationProperties.putAll(additionalProperties);
        }

        message.setApplicationProperties(new ApplicationProperties(applicationProperties));

        return message;
    }

    /**
     * Creates a message with the required system properties set.
     */
    static Message getMessage(byte[] contents, Long sequenceNumber, Long offsetNumber, Date enqueuedTime) {
        final Map<Symbol, Object> systemProperties = new HashMap<>();
        systemProperties.put(getSymbol(OFFSET_ANNOTATION_NAME), offsetNumber);
        systemProperties.put(getSymbol(ENQUEUED_TIME_UTC_ANNOTATION_NAME), enqueuedTime);
        systemProperties.put(getSymbol(SEQUENCE_NUMBER_ANNOTATION_NAME), sequenceNumber);
        systemProperties.put(getSymbol(PARTITION_KEY_ANNOTATION_NAME), PARTITION_KEY);

        final Message message = Proton.message();
        message.setMessageAnnotations(new MessageAnnotations(systemProperties));

        final Data body;
        if (contents != null) {
            body = new Data(new Binary(contents));
        } else {
            body = new Data(Binary.create((ReadableBuffer) null));
        }

        message.setBody(body);

        return message;
    }

    /**
     * Creates an EventData with the received properties set.
     */
    public static EventData getEventData(byte[] contents, Long sequenceNumber, Long offsetNumber, Date enqueuedTime) {
        final Message message = getMessage(contents, sequenceNumber, offsetNumber, enqueuedTime);
        return MESSAGE_SERIALIZER.deserialize(message, EventData.class);
    }

    public static List<EventData> getEvents(int numberOfEvents, String messageTrackingValue) {
        return IntStream.range(0, numberOfEvents)
            .mapToObj(number -> getEvent("Event " + number, messageTrackingValue, number))
            .collect(Collectors.toList());
    }

    static EventData getEvent(String body, String messageTrackingValue, int position) {
        final EventData eventData = new EventData(body.getBytes(UTF_8));
        eventData.getProperties().put(MESSAGE_ID, messageTrackingValue);
        eventData.getProperties().put(MESSAGE_POSITION_ID, position);
        return eventData;
    }

    /**
     * Checks the {@link #MESSAGE_ID} to see if it matches the {@code expectedValue}.
     */
    public static boolean isMatchingEvent(PartitionEvent partitionEvent, String expectedValue) {
        return isMatchingEvent(partitionEvent.getData(), expectedValue);
    }

    /**
     * Checks the {@link #MESSAGE_ID} to see if it matches the {@code expectedValue}.
     */
    public static boolean isMatchingEvent(EventData event, String expectedValue) {
        LOGGER.atInfo()
            .addKeyValue("expectedMessageId", expectedValue)
            .addKeyValue("sequenceNo", event.getSequenceNumber())
            .addKeyValue("enqueuedTime", event.getEnqueuedTime())
            .addKeyValue("MESSAGE_ID", event.getProperties() == null ? null : event.getProperties().get(MESSAGE_ID))
            .log("isMatchingEvent");

        return event.getProperties() != null && event.getProperties().containsKey(MESSAGE_ID)
            && expectedValue.equals(event.getProperties().get(MESSAGE_ID));
    }

    /**
     * Obtain a {@link com.azure.identity.AzurePipelinesCredentialBuilder} when running in Azure pipelines that is
     * configured with service connections federated identity.
     *
     * @return A {@link com.azure.identity.AzurePipelinesCredentialBuilder} when running in Azure pipelines that is
     *   configured with service connections federated identity, {@code null} otherwise.
     */
    private static TokenCredential getPipelineCredential() {
        final String serviceConnectionId  = getPropertyValue("AZURESUBSCRIPTION_SERVICE_CONNECTION_ID");
        final String clientId = getPropertyValue("AZURESUBSCRIPTION_CLIENT_ID");
        final String tenantId = getPropertyValue("AZURESUBSCRIPTION_TENANT_ID");
        final String systemAccessToken = getPropertyValue("SYSTEM_ACCESSTOKEN");

        if (CoreUtils.isNullOrEmpty(serviceConnectionId) || CoreUtils.isNullOrEmpty(clientId)
            || CoreUtils.isNullOrEmpty(tenantId) || CoreUtils.isNullOrEmpty(systemAccessToken)) {
            return null;
        }

        return new AzurePipelinesCredentialBuilder()
            .systemAccessToken(systemAccessToken)
            .clientId(clientId)
            .tenantId(tenantId)
            .serviceConnectionId(serviceConnectionId)
            .build();
    }

    /**
     * Obtain the Azure Pipelines credential if running in Azure Pipelines configured with service connections federated identity.
     *
     * @return the Azure Pipelines credential.
     * @throws org.opentest4j.TestAbortedException if the test is not running in Azure Pipelines configured with service connections federated identity.
     */
    public static TokenCredential getPipelineCredential(AtomicReference<TokenCredential> credentialCached) {
        return credentialCached.updateAndGet(cached -> {
            if (cached != null) {
                return cached;
            }

            final TokenCredential tokenCredential = TestUtils.getPipelineCredential();

            assumeTrue(tokenCredential != null, "Test required to run on Azure Pipelines that is configured with service connections federated identity.");

            return request -> Mono.defer(() -> tokenCredential.getToken(request))
                .subscribeOn(Schedulers.boundedElastic());
        });
    }

    private static String getPropertyValue(String propertyName) {
        return Configuration.getGlobalConfiguration().get(propertyName, System.getenv(propertyName));
    }

    private static String getPropertyValue(String propertyName, String defaultValue) {
        return Configuration.getGlobalConfiguration().get(propertyName, defaultValue);
    }

    private TestUtils() {
    }
}
