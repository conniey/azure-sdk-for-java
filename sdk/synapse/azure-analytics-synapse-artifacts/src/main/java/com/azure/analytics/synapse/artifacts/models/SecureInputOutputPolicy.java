// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Generated;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Execution policy for an activity that supports secure input and output.
 */
@Fluent
public final class SecureInputOutputPolicy implements JsonSerializable<SecureInputOutputPolicy> {
    /*
     * When set to true, Input from activity is considered as secure and will not be logged to monitoring.
     */
    @Generated
    private Boolean secureInput;

    /*
     * When set to true, Output from activity is considered as secure and will not be logged to monitoring.
     */
    @Generated
    private Boolean secureOutput;

    /**
     * Creates an instance of SecureInputOutputPolicy class.
     */
    @Generated
    public SecureInputOutputPolicy() {
    }

    /**
     * Get the secureInput property: When set to true, Input from activity is considered as secure and will not be
     * logged to monitoring.
     * 
     * @return the secureInput value.
     */
    @Generated
    public Boolean isSecureInput() {
        return this.secureInput;
    }

    /**
     * Set the secureInput property: When set to true, Input from activity is considered as secure and will not be
     * logged to monitoring.
     * 
     * @param secureInput the secureInput value to set.
     * @return the SecureInputOutputPolicy object itself.
     */
    @Generated
    public SecureInputOutputPolicy setSecureInput(Boolean secureInput) {
        this.secureInput = secureInput;
        return this;
    }

    /**
     * Get the secureOutput property: When set to true, Output from activity is considered as secure and will not be
     * logged to monitoring.
     * 
     * @return the secureOutput value.
     */
    @Generated
    public Boolean isSecureOutput() {
        return this.secureOutput;
    }

    /**
     * Set the secureOutput property: When set to true, Output from activity is considered as secure and will not be
     * logged to monitoring.
     * 
     * @param secureOutput the secureOutput value to set.
     * @return the SecureInputOutputPolicy object itself.
     */
    @Generated
    public SecureInputOutputPolicy setSecureOutput(Boolean secureOutput) {
        this.secureOutput = secureOutput;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeBooleanField("secureInput", this.secureInput);
        jsonWriter.writeBooleanField("secureOutput", this.secureOutput);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of SecureInputOutputPolicy from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of SecureInputOutputPolicy if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IOException If an error occurs while reading the SecureInputOutputPolicy.
     */
    @Generated
    public static SecureInputOutputPolicy fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            SecureInputOutputPolicy deserializedSecureInputOutputPolicy = new SecureInputOutputPolicy();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("secureInput".equals(fieldName)) {
                    deserializedSecureInputOutputPolicy.secureInput = reader.getNullable(JsonReader::getBoolean);
                } else if ("secureOutput".equals(fieldName)) {
                    deserializedSecureInputOutputPolicy.secureOutput = reader.getNullable(JsonReader::getBoolean);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedSecureInputOutputPolicy;
        });
    }
}
