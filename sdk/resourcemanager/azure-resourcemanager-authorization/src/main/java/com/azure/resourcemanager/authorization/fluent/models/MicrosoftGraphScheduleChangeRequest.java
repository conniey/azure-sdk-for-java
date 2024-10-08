// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.CoreUtils;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * scheduleChangeRequest.
 */
@Fluent
public class MicrosoftGraphScheduleChangeRequest extends MicrosoftGraphChangeTrackedEntity {
    /*
     * scheduleChangeRequestActor
     */
    private MicrosoftGraphScheduleChangeRequestActor assignedTo;

    /*
     * The managerActionDateTime property.
     */
    private OffsetDateTime managerActionDateTime;

    /*
     * The managerActionMessage property.
     */
    private String managerActionMessage;

    /*
     * The managerUserId property.
     */
    private String managerUserId;

    /*
     * The senderDateTime property.
     */
    private OffsetDateTime senderDateTime;

    /*
     * The senderMessage property.
     */
    private String senderMessage;

    /*
     * The senderUserId property.
     */
    private String senderUserId;

    /*
     * scheduleChangeState
     */
    private MicrosoftGraphScheduleChangeState state;

    /*
     * scheduleChangeRequest
     */
    private Map<String, Object> additionalProperties;

    /**
     * Creates an instance of MicrosoftGraphScheduleChangeRequest class.
     */
    public MicrosoftGraphScheduleChangeRequest() {
    }

    /**
     * Get the assignedTo property: scheduleChangeRequestActor.
     * 
     * @return the assignedTo value.
     */
    public MicrosoftGraphScheduleChangeRequestActor assignedTo() {
        return this.assignedTo;
    }

    /**
     * Set the assignedTo property: scheduleChangeRequestActor.
     * 
     * @param assignedTo the assignedTo value to set.
     * @return the MicrosoftGraphScheduleChangeRequest object itself.
     */
    public MicrosoftGraphScheduleChangeRequest withAssignedTo(MicrosoftGraphScheduleChangeRequestActor assignedTo) {
        this.assignedTo = assignedTo;
        return this;
    }

    /**
     * Get the managerActionDateTime property: The managerActionDateTime property.
     * 
     * @return the managerActionDateTime value.
     */
    public OffsetDateTime managerActionDateTime() {
        return this.managerActionDateTime;
    }

    /**
     * Set the managerActionDateTime property: The managerActionDateTime property.
     * 
     * @param managerActionDateTime the managerActionDateTime value to set.
     * @return the MicrosoftGraphScheduleChangeRequest object itself.
     */
    public MicrosoftGraphScheduleChangeRequest withManagerActionDateTime(OffsetDateTime managerActionDateTime) {
        this.managerActionDateTime = managerActionDateTime;
        return this;
    }

    /**
     * Get the managerActionMessage property: The managerActionMessage property.
     * 
     * @return the managerActionMessage value.
     */
    public String managerActionMessage() {
        return this.managerActionMessage;
    }

    /**
     * Set the managerActionMessage property: The managerActionMessage property.
     * 
     * @param managerActionMessage the managerActionMessage value to set.
     * @return the MicrosoftGraphScheduleChangeRequest object itself.
     */
    public MicrosoftGraphScheduleChangeRequest withManagerActionMessage(String managerActionMessage) {
        this.managerActionMessage = managerActionMessage;
        return this;
    }

    /**
     * Get the managerUserId property: The managerUserId property.
     * 
     * @return the managerUserId value.
     */
    public String managerUserId() {
        return this.managerUserId;
    }

    /**
     * Set the managerUserId property: The managerUserId property.
     * 
     * @param managerUserId the managerUserId value to set.
     * @return the MicrosoftGraphScheduleChangeRequest object itself.
     */
    public MicrosoftGraphScheduleChangeRequest withManagerUserId(String managerUserId) {
        this.managerUserId = managerUserId;
        return this;
    }

    /**
     * Get the senderDateTime property: The senderDateTime property.
     * 
     * @return the senderDateTime value.
     */
    public OffsetDateTime senderDateTime() {
        return this.senderDateTime;
    }

    /**
     * Set the senderDateTime property: The senderDateTime property.
     * 
     * @param senderDateTime the senderDateTime value to set.
     * @return the MicrosoftGraphScheduleChangeRequest object itself.
     */
    public MicrosoftGraphScheduleChangeRequest withSenderDateTime(OffsetDateTime senderDateTime) {
        this.senderDateTime = senderDateTime;
        return this;
    }

    /**
     * Get the senderMessage property: The senderMessage property.
     * 
     * @return the senderMessage value.
     */
    public String senderMessage() {
        return this.senderMessage;
    }

    /**
     * Set the senderMessage property: The senderMessage property.
     * 
     * @param senderMessage the senderMessage value to set.
     * @return the MicrosoftGraphScheduleChangeRequest object itself.
     */
    public MicrosoftGraphScheduleChangeRequest withSenderMessage(String senderMessage) {
        this.senderMessage = senderMessage;
        return this;
    }

    /**
     * Get the senderUserId property: The senderUserId property.
     * 
     * @return the senderUserId value.
     */
    public String senderUserId() {
        return this.senderUserId;
    }

    /**
     * Set the senderUserId property: The senderUserId property.
     * 
     * @param senderUserId the senderUserId value to set.
     * @return the MicrosoftGraphScheduleChangeRequest object itself.
     */
    public MicrosoftGraphScheduleChangeRequest withSenderUserId(String senderUserId) {
        this.senderUserId = senderUserId;
        return this;
    }

    /**
     * Get the state property: scheduleChangeState.
     * 
     * @return the state value.
     */
    public MicrosoftGraphScheduleChangeState state() {
        return this.state;
    }

    /**
     * Set the state property: scheduleChangeState.
     * 
     * @param state the state value to set.
     * @return the MicrosoftGraphScheduleChangeRequest object itself.
     */
    public MicrosoftGraphScheduleChangeRequest withState(MicrosoftGraphScheduleChangeState state) {
        this.state = state;
        return this;
    }

    /**
     * Get the additionalProperties property: scheduleChangeRequest.
     * 
     * @return the additionalProperties value.
     */
    public Map<String, Object> additionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties property: scheduleChangeRequest.
     * 
     * @param additionalProperties the additionalProperties value to set.
     * @return the MicrosoftGraphScheduleChangeRequest object itself.
     */
    public MicrosoftGraphScheduleChangeRequest withAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MicrosoftGraphScheduleChangeRequest withCreatedDateTime(OffsetDateTime createdDateTime) {
        super.withCreatedDateTime(createdDateTime);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MicrosoftGraphScheduleChangeRequest withLastModifiedBy(MicrosoftGraphIdentitySet lastModifiedBy) {
        super.withLastModifiedBy(lastModifiedBy);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MicrosoftGraphScheduleChangeRequest withLastModifiedDateTime(OffsetDateTime lastModifiedDateTime) {
        super.withLastModifiedDateTime(lastModifiedDateTime);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MicrosoftGraphScheduleChangeRequest withId(String id) {
        super.withId(id);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("id", id());
        jsonWriter.writeStringField("createdDateTime",
            createdDateTime() == null ? null : DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(createdDateTime()));
        jsonWriter.writeJsonField("lastModifiedBy", lastModifiedBy());
        jsonWriter.writeStringField("lastModifiedDateTime",
            lastModifiedDateTime() == null
                ? null
                : DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(lastModifiedDateTime()));
        jsonWriter.writeStringField("assignedTo", this.assignedTo == null ? null : this.assignedTo.toString());
        jsonWriter.writeStringField("managerActionDateTime",
            this.managerActionDateTime == null
                ? null
                : DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(this.managerActionDateTime));
        jsonWriter.writeStringField("managerActionMessage", this.managerActionMessage);
        jsonWriter.writeStringField("managerUserId", this.managerUserId);
        jsonWriter.writeStringField("senderDateTime",
            this.senderDateTime == null ? null : DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(this.senderDateTime));
        jsonWriter.writeStringField("senderMessage", this.senderMessage);
        jsonWriter.writeStringField("senderUserId", this.senderUserId);
        jsonWriter.writeStringField("state", this.state == null ? null : this.state.toString());
        if (additionalProperties != null) {
            for (Map.Entry<String, Object> additionalProperty : additionalProperties.entrySet()) {
                jsonWriter.writeUntypedField(additionalProperty.getKey(), additionalProperty.getValue());
            }
        }
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of MicrosoftGraphScheduleChangeRequest from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of MicrosoftGraphScheduleChangeRequest if the JsonReader was pointing to an instance of it,
     * or null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the MicrosoftGraphScheduleChangeRequest.
     */
    public static MicrosoftGraphScheduleChangeRequest fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            MicrosoftGraphScheduleChangeRequest deserializedMicrosoftGraphScheduleChangeRequest
                = new MicrosoftGraphScheduleChangeRequest();
            Map<String, Object> additionalProperties = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedMicrosoftGraphScheduleChangeRequest.withId(reader.getString());
                } else if ("createdDateTime".equals(fieldName)) {
                    deserializedMicrosoftGraphScheduleChangeRequest.withCreatedDateTime(reader
                        .getNullable(nonNullReader -> CoreUtils.parseBestOffsetDateTime(nonNullReader.getString())));
                } else if ("lastModifiedBy".equals(fieldName)) {
                    deserializedMicrosoftGraphScheduleChangeRequest
                        .withLastModifiedBy(MicrosoftGraphIdentitySet.fromJson(reader));
                } else if ("lastModifiedDateTime".equals(fieldName)) {
                    deserializedMicrosoftGraphScheduleChangeRequest.withLastModifiedDateTime(reader
                        .getNullable(nonNullReader -> CoreUtils.parseBestOffsetDateTime(nonNullReader.getString())));
                } else if ("assignedTo".equals(fieldName)) {
                    deserializedMicrosoftGraphScheduleChangeRequest.assignedTo
                        = MicrosoftGraphScheduleChangeRequestActor.fromString(reader.getString());
                } else if ("managerActionDateTime".equals(fieldName)) {
                    deserializedMicrosoftGraphScheduleChangeRequest.managerActionDateTime = reader
                        .getNullable(nonNullReader -> CoreUtils.parseBestOffsetDateTime(nonNullReader.getString()));
                } else if ("managerActionMessage".equals(fieldName)) {
                    deserializedMicrosoftGraphScheduleChangeRequest.managerActionMessage = reader.getString();
                } else if ("managerUserId".equals(fieldName)) {
                    deserializedMicrosoftGraphScheduleChangeRequest.managerUserId = reader.getString();
                } else if ("senderDateTime".equals(fieldName)) {
                    deserializedMicrosoftGraphScheduleChangeRequest.senderDateTime = reader
                        .getNullable(nonNullReader -> CoreUtils.parseBestOffsetDateTime(nonNullReader.getString()));
                } else if ("senderMessage".equals(fieldName)) {
                    deserializedMicrosoftGraphScheduleChangeRequest.senderMessage = reader.getString();
                } else if ("senderUserId".equals(fieldName)) {
                    deserializedMicrosoftGraphScheduleChangeRequest.senderUserId = reader.getString();
                } else if ("state".equals(fieldName)) {
                    deserializedMicrosoftGraphScheduleChangeRequest.state
                        = MicrosoftGraphScheduleChangeState.fromString(reader.getString());
                } else {
                    if (additionalProperties == null) {
                        additionalProperties = new LinkedHashMap<>();
                    }

                    additionalProperties.put(fieldName, reader.readUntyped());
                }
            }
            deserializedMicrosoftGraphScheduleChangeRequest.additionalProperties = additionalProperties;

            return deserializedMicrosoftGraphScheduleChangeRequest;
        });
    }
}
