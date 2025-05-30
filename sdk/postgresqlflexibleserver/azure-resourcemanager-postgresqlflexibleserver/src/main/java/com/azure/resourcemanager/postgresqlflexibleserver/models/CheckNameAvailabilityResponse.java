// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.postgresqlflexibleserver.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * The check availability result.
 */
@Fluent
public class CheckNameAvailabilityResponse implements JsonSerializable<CheckNameAvailabilityResponse> {
    /*
     * Indicates if the resource name is available.
     */
    private Boolean nameAvailable;

    /*
     * The reason why the given name is not available.
     */
    private CheckNameAvailabilityReason reason;

    /*
     * Detailed reason why the given name is available.
     */
    private String message;

    /**
     * Creates an instance of CheckNameAvailabilityResponse class.
     */
    public CheckNameAvailabilityResponse() {
    }

    /**
     * Get the nameAvailable property: Indicates if the resource name is available.
     * 
     * @return the nameAvailable value.
     */
    public Boolean nameAvailable() {
        return this.nameAvailable;
    }

    /**
     * Set the nameAvailable property: Indicates if the resource name is available.
     * 
     * @param nameAvailable the nameAvailable value to set.
     * @return the CheckNameAvailabilityResponse object itself.
     */
    public CheckNameAvailabilityResponse withNameAvailable(Boolean nameAvailable) {
        this.nameAvailable = nameAvailable;
        return this;
    }

    /**
     * Get the reason property: The reason why the given name is not available.
     * 
     * @return the reason value.
     */
    public CheckNameAvailabilityReason reason() {
        return this.reason;
    }

    /**
     * Set the reason property: The reason why the given name is not available.
     * 
     * @param reason the reason value to set.
     * @return the CheckNameAvailabilityResponse object itself.
     */
    public CheckNameAvailabilityResponse withReason(CheckNameAvailabilityReason reason) {
        this.reason = reason;
        return this;
    }

    /**
     * Get the message property: Detailed reason why the given name is available.
     * 
     * @return the message value.
     */
    public String message() {
        return this.message;
    }

    /**
     * Set the message property: Detailed reason why the given name is available.
     * 
     * @param message the message value to set.
     * @return the CheckNameAvailabilityResponse object itself.
     */
    public CheckNameAvailabilityResponse withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeBooleanField("nameAvailable", this.nameAvailable);
        jsonWriter.writeStringField("reason", this.reason == null ? null : this.reason.toString());
        jsonWriter.writeStringField("message", this.message);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of CheckNameAvailabilityResponse from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of CheckNameAvailabilityResponse if the JsonReader was pointing to an instance of it, or null
     * if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the CheckNameAvailabilityResponse.
     */
    public static CheckNameAvailabilityResponse fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            CheckNameAvailabilityResponse deserializedCheckNameAvailabilityResponse
                = new CheckNameAvailabilityResponse();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("nameAvailable".equals(fieldName)) {
                    deserializedCheckNameAvailabilityResponse.nameAvailable
                        = reader.getNullable(JsonReader::getBoolean);
                } else if ("reason".equals(fieldName)) {
                    deserializedCheckNameAvailabilityResponse.reason
                        = CheckNameAvailabilityReason.fromString(reader.getString());
                } else if ("message".equals(fieldName)) {
                    deserializedCheckNameAvailabilityResponse.message = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedCheckNameAvailabilityResponse;
        });
    }
}
