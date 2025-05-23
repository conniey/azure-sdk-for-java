// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.reservations.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * Exchange policy errors.
 */
@Fluent
public final class ExchangePolicyErrors implements JsonSerializable<ExchangePolicyErrors> {
    /*
     * Exchange Policy errors
     */
    private List<ExchangePolicyError> policyErrors;

    /**
     * Creates an instance of ExchangePolicyErrors class.
     */
    public ExchangePolicyErrors() {
    }

    /**
     * Get the policyErrors property: Exchange Policy errors.
     * 
     * @return the policyErrors value.
     */
    public List<ExchangePolicyError> policyErrors() {
        return this.policyErrors;
    }

    /**
     * Set the policyErrors property: Exchange Policy errors.
     * 
     * @param policyErrors the policyErrors value to set.
     * @return the ExchangePolicyErrors object itself.
     */
    public ExchangePolicyErrors withPolicyErrors(List<ExchangePolicyError> policyErrors) {
        this.policyErrors = policyErrors;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (policyErrors() != null) {
            policyErrors().forEach(e -> e.validate());
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeArrayField("policyErrors", this.policyErrors, (writer, element) -> writer.writeJson(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ExchangePolicyErrors from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ExchangePolicyErrors if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IOException If an error occurs while reading the ExchangePolicyErrors.
     */
    public static ExchangePolicyErrors fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ExchangePolicyErrors deserializedExchangePolicyErrors = new ExchangePolicyErrors();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("policyErrors".equals(fieldName)) {
                    List<ExchangePolicyError> policyErrors
                        = reader.readArray(reader1 -> ExchangePolicyError.fromJson(reader1));
                    deserializedExchangePolicyErrors.policyErrors = policyErrors;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedExchangePolicyErrors;
        });
    }
}
