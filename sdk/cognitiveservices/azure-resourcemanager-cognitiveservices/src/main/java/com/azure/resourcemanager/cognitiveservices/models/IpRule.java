// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cognitiveservices.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * A rule governing the accessibility from a specific ip address or ip range.
 */
@Fluent
public final class IpRule implements JsonSerializable<IpRule> {
    /*
     * An IPv4 address range in CIDR notation, such as '124.56.78.91' (simple IP address) or '124.56.78.0/24' (all
     * addresses that start with 124.56.78).
     */
    private String value;

    /**
     * Creates an instance of IpRule class.
     */
    public IpRule() {
    }

    /**
     * Get the value property: An IPv4 address range in CIDR notation, such as '124.56.78.91' (simple IP address) or
     * '124.56.78.0/24' (all addresses that start with 124.56.78).
     * 
     * @return the value value.
     */
    public String value() {
        return this.value;
    }

    /**
     * Set the value property: An IPv4 address range in CIDR notation, such as '124.56.78.91' (simple IP address) or
     * '124.56.78.0/24' (all addresses that start with 124.56.78).
     * 
     * @param value the value value to set.
     * @return the IpRule object itself.
     */
    public IpRule withValue(String value) {
        this.value = value;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() == null) {
            throw LOGGER.atError().log(new IllegalArgumentException("Missing required property value in model IpRule"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(IpRule.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("value", this.value);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of IpRule from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of IpRule if the JsonReader was pointing to an instance of it, or null if it was pointing to
     * JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the IpRule.
     */
    public static IpRule fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            IpRule deserializedIpRule = new IpRule();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("value".equals(fieldName)) {
                    deserializedIpRule.value = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedIpRule;
        });
    }
}
