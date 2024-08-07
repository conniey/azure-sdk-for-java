// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * publicInnerError.
 */
@Fluent
public final class MicrosoftGraphPublicInnerError implements JsonSerializable<MicrosoftGraphPublicInnerError> {
    /*
     * The code property.
     */
    private String code;

    /*
     * The details property.
     */
    private List<MicrosoftGraphPublicErrorDetail> details;

    /*
     * The message property.
     */
    private String message;

    /*
     * The target property.
     */
    private String target;

    /*
     * publicInnerError
     */
    private Map<String, Object> additionalProperties;

    /**
     * Creates an instance of MicrosoftGraphPublicInnerError class.
     */
    public MicrosoftGraphPublicInnerError() {
    }

    /**
     * Get the code property: The code property.
     * 
     * @return the code value.
     */
    public String code() {
        return this.code;
    }

    /**
     * Set the code property: The code property.
     * 
     * @param code the code value to set.
     * @return the MicrosoftGraphPublicInnerError object itself.
     */
    public MicrosoftGraphPublicInnerError withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * Get the details property: The details property.
     * 
     * @return the details value.
     */
    public List<MicrosoftGraphPublicErrorDetail> details() {
        return this.details;
    }

    /**
     * Set the details property: The details property.
     * 
     * @param details the details value to set.
     * @return the MicrosoftGraphPublicInnerError object itself.
     */
    public MicrosoftGraphPublicInnerError withDetails(List<MicrosoftGraphPublicErrorDetail> details) {
        this.details = details;
        return this;
    }

    /**
     * Get the message property: The message property.
     * 
     * @return the message value.
     */
    public String message() {
        return this.message;
    }

    /**
     * Set the message property: The message property.
     * 
     * @param message the message value to set.
     * @return the MicrosoftGraphPublicInnerError object itself.
     */
    public MicrosoftGraphPublicInnerError withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * Get the target property: The target property.
     * 
     * @return the target value.
     */
    public String target() {
        return this.target;
    }

    /**
     * Set the target property: The target property.
     * 
     * @param target the target value to set.
     * @return the MicrosoftGraphPublicInnerError object itself.
     */
    public MicrosoftGraphPublicInnerError withTarget(String target) {
        this.target = target;
        return this;
    }

    /**
     * Get the additionalProperties property: publicInnerError.
     * 
     * @return the additionalProperties value.
     */
    public Map<String, Object> additionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties property: publicInnerError.
     * 
     * @param additionalProperties the additionalProperties value to set.
     * @return the MicrosoftGraphPublicInnerError object itself.
     */
    public MicrosoftGraphPublicInnerError withAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (details() != null) {
            details().forEach(e -> e.validate());
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("code", this.code);
        jsonWriter.writeArrayField("details", this.details, (writer, element) -> writer.writeJson(element));
        jsonWriter.writeStringField("message", this.message);
        jsonWriter.writeStringField("target", this.target);
        if (additionalProperties != null) {
            for (Map.Entry<String, Object> additionalProperty : additionalProperties.entrySet()) {
                jsonWriter.writeUntypedField(additionalProperty.getKey(), additionalProperty.getValue());
            }
        }
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of MicrosoftGraphPublicInnerError from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of MicrosoftGraphPublicInnerError if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the MicrosoftGraphPublicInnerError.
     */
    public static MicrosoftGraphPublicInnerError fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            MicrosoftGraphPublicInnerError deserializedMicrosoftGraphPublicInnerError
                = new MicrosoftGraphPublicInnerError();
            Map<String, Object> additionalProperties = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("code".equals(fieldName)) {
                    deserializedMicrosoftGraphPublicInnerError.code = reader.getString();
                } else if ("details".equals(fieldName)) {
                    List<MicrosoftGraphPublicErrorDetail> details
                        = reader.readArray(reader1 -> MicrosoftGraphPublicErrorDetail.fromJson(reader1));
                    deserializedMicrosoftGraphPublicInnerError.details = details;
                } else if ("message".equals(fieldName)) {
                    deserializedMicrosoftGraphPublicInnerError.message = reader.getString();
                } else if ("target".equals(fieldName)) {
                    deserializedMicrosoftGraphPublicInnerError.target = reader.getString();
                } else {
                    if (additionalProperties == null) {
                        additionalProperties = new LinkedHashMap<>();
                    }

                    additionalProperties.put(fieldName, reader.readUntyped());
                }
            }
            deserializedMicrosoftGraphPublicInnerError.additionalProperties = additionalProperties;

            return deserializedMicrosoftGraphPublicInnerError;
        });
    }
}
