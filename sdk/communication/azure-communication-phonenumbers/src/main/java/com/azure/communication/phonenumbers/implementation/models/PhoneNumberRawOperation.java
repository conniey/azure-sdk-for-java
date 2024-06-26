// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.communication.phonenumbers.implementation.models;

import com.azure.communication.phonenumbers.models.PhoneNumberOperationStatus;
import com.azure.communication.phonenumbers.models.PhoneNumberOperationType;
import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;

/**
 * The PhoneNumberRawOperation model.
 */
@Fluent
public final class PhoneNumberRawOperation implements JsonSerializable<PhoneNumberRawOperation> {
    /*
     * The type of operation, e.g. Search
     */
    private PhoneNumberOperationType operationType;

    /*
     * Status of operation.
     */
    private PhoneNumberOperationStatus status;

    /*
     * URL for retrieving the result of the operation, if any.
     */
    private String resourceLocation;

    /*
     * The date that the operation was created.
     */
    private OffsetDateTime createdDateTime;

    /*
     * The Communication Services error.
     */
    private CommunicationError error;

    /*
     * Id of operation.
     */
    private String id;

    /*
     * The most recent date that the operation was changed.
     */
    private OffsetDateTime lastActionDateTime;

    /**
     * Creates an instance of PhoneNumberRawOperation class.
     */
    public PhoneNumberRawOperation() {
    }

    /**
     * Get the operationType property: The type of operation, e.g. Search.
     * 
     * @return the operationType value.
     */
    public PhoneNumberOperationType getOperationType() {
        return this.operationType;
    }

    /**
     * Set the operationType property: The type of operation, e.g. Search.
     * 
     * @param operationType the operationType value to set.
     * @return the PhoneNumberRawOperation object itself.
     */
    public PhoneNumberRawOperation setOperationType(PhoneNumberOperationType operationType) {
        this.operationType = operationType;
        return this;
    }

    /**
     * Get the status property: Status of operation.
     * 
     * @return the status value.
     */
    public PhoneNumberOperationStatus getStatus() {
        return this.status;
    }

    /**
     * Set the status property: Status of operation.
     * 
     * @param status the status value to set.
     * @return the PhoneNumberRawOperation object itself.
     */
    public PhoneNumberRawOperation setStatus(PhoneNumberOperationStatus status) {
        this.status = status;
        return this;
    }

    /**
     * Get the resourceLocation property: URL for retrieving the result of the operation, if any.
     * 
     * @return the resourceLocation value.
     */
    public String getResourceLocation() {
        return this.resourceLocation;
    }

    /**
     * Set the resourceLocation property: URL for retrieving the result of the operation, if any.
     * 
     * @param resourceLocation the resourceLocation value to set.
     * @return the PhoneNumberRawOperation object itself.
     */
    public PhoneNumberRawOperation setResourceLocation(String resourceLocation) {
        this.resourceLocation = resourceLocation;
        return this;
    }

    /**
     * Get the createdDateTime property: The date that the operation was created.
     * 
     * @return the createdDateTime value.
     */
    public OffsetDateTime getCreatedDateTime() {
        return this.createdDateTime;
    }

    /**
     * Set the createdDateTime property: The date that the operation was created.
     * 
     * @param createdDateTime the createdDateTime value to set.
     * @return the PhoneNumberRawOperation object itself.
     */
    public PhoneNumberRawOperation setCreatedDateTime(OffsetDateTime createdDateTime) {
        this.createdDateTime = createdDateTime;
        return this;
    }

    /**
     * Get the error property: The Communication Services error.
     * 
     * @return the error value.
     */
    public CommunicationError getError() {
        return this.error;
    }

    /**
     * Set the error property: The Communication Services error.
     * 
     * @param error the error value to set.
     * @return the PhoneNumberRawOperation object itself.
     */
    public PhoneNumberRawOperation setError(CommunicationError error) {
        this.error = error;
        return this;
    }

    /**
     * Get the id property: Id of operation.
     * 
     * @return the id value.
     */
    public String getId() {
        return this.id;
    }

    /**
     * Set the id property: Id of operation.
     * 
     * @param id the id value to set.
     * @return the PhoneNumberRawOperation object itself.
     */
    public PhoneNumberRawOperation setId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the lastActionDateTime property: The most recent date that the operation was changed.
     * 
     * @return the lastActionDateTime value.
     */
    public OffsetDateTime getLastActionDateTime() {
        return this.lastActionDateTime;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("operationType", this.operationType == null ? null : this.operationType.toString());
        jsonWriter.writeStringField("status", this.status == null ? null : this.status.toString());
        jsonWriter.writeStringField("createdDateTime",
            this.createdDateTime == null ? null : DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(this.createdDateTime));
        jsonWriter.writeStringField("id", this.id);
        jsonWriter.writeStringField("resourceLocation", this.resourceLocation);
        jsonWriter.writeJsonField("error", this.error);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of PhoneNumberRawOperation from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of PhoneNumberRawOperation if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the PhoneNumberRawOperation.
     */
    public static PhoneNumberRawOperation fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            PhoneNumberRawOperation deserializedPhoneNumberRawOperation = new PhoneNumberRawOperation();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("operationType".equals(fieldName)) {
                    deserializedPhoneNumberRawOperation.operationType
                        = PhoneNumberOperationType.fromString(reader.getString());
                } else if ("status".equals(fieldName)) {
                    deserializedPhoneNumberRawOperation.status
                        = PhoneNumberOperationStatus.fromString(reader.getString());
                } else if ("createdDateTime".equals(fieldName)) {
                    deserializedPhoneNumberRawOperation.createdDateTime
                        = reader.getNullable(nonNullReader -> OffsetDateTime.parse(nonNullReader.getString()));
                } else if ("id".equals(fieldName)) {
                    deserializedPhoneNumberRawOperation.id = reader.getString();
                } else if ("resourceLocation".equals(fieldName)) {
                    deserializedPhoneNumberRawOperation.resourceLocation = reader.getString();
                } else if ("error".equals(fieldName)) {
                    deserializedPhoneNumberRawOperation.error = CommunicationError.fromJson(reader);
                } else if ("lastActionDateTime".equals(fieldName)) {
                    deserializedPhoneNumberRawOperation.lastActionDateTime
                        = reader.getNullable(nonNullReader -> OffsetDateTime.parse(nonNullReader.getString()));
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedPhoneNumberRawOperation;
        });
    }
}
