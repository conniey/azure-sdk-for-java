// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.providerhub.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.providerhub.fluent.models.ProviderRegistrationInner;
import java.io.IOException;
import java.util.List;

/**
 * The ProviderRegistrationArrayResponseWithContinuation model.
 */
@Fluent
public final class ProviderRegistrationArrayResponseWithContinuation
    implements JsonSerializable<ProviderRegistrationArrayResponseWithContinuation> {
    /*
     * The value.
     */
    private List<ProviderRegistrationInner> value;

    /*
     * The URL to get to the next set of results, if there are any.
     */
    private String nextLink;

    /**
     * Creates an instance of ProviderRegistrationArrayResponseWithContinuation class.
     */
    public ProviderRegistrationArrayResponseWithContinuation() {
    }

    /**
     * Get the value property: The value.
     * 
     * @return the value value.
     */
    public List<ProviderRegistrationInner> value() {
        return this.value;
    }

    /**
     * Set the value property: The value.
     * 
     * @param value the value value to set.
     * @return the ProviderRegistrationArrayResponseWithContinuation object itself.
     */
    public ProviderRegistrationArrayResponseWithContinuation withValue(List<ProviderRegistrationInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: The URL to get to the next set of results, if there are any.
     * 
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: The URL to get to the next set of results, if there are any.
     * 
     * @param nextLink the nextLink value to set.
     * @return the ProviderRegistrationArrayResponseWithContinuation object itself.
     */
    public ProviderRegistrationArrayResponseWithContinuation withNextLink(String nextLink) {
        this.nextLink = nextLink;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() != null) {
            value().forEach(e -> e.validate());
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeArrayField("value", this.value, (writer, element) -> writer.writeJson(element));
        jsonWriter.writeStringField("nextLink", this.nextLink);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ProviderRegistrationArrayResponseWithContinuation from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ProviderRegistrationArrayResponseWithContinuation if the JsonReader was pointing to an
     * instance of it, or null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the ProviderRegistrationArrayResponseWithContinuation.
     */
    public static ProviderRegistrationArrayResponseWithContinuation fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ProviderRegistrationArrayResponseWithContinuation deserializedProviderRegistrationArrayResponseWithContinuation
                = new ProviderRegistrationArrayResponseWithContinuation();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("value".equals(fieldName)) {
                    List<ProviderRegistrationInner> value
                        = reader.readArray(reader1 -> ProviderRegistrationInner.fromJson(reader1));
                    deserializedProviderRegistrationArrayResponseWithContinuation.value = value;
                } else if ("nextLink".equals(fieldName)) {
                    deserializedProviderRegistrationArrayResponseWithContinuation.nextLink = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedProviderRegistrationArrayResponseWithContinuation;
        });
    }
}
