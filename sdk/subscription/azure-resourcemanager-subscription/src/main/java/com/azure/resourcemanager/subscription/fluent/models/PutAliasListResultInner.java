// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.subscription.fluent.models;

import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * The list of aliases.
 */
@Immutable
public final class PutAliasListResultInner implements JsonSerializable<PutAliasListResultInner> {
    /*
     * The list of alias.
     */
    private List<PutAliasResponseInner> value;

    /*
     * The link (url) to the next page of results.
     */
    private String nextLink;

    /**
     * Creates an instance of PutAliasListResultInner class.
     */
    public PutAliasListResultInner() {
    }

    /**
     * Get the value property: The list of alias.
     * 
     * @return the value value.
     */
    public List<PutAliasResponseInner> value() {
        return this.value;
    }

    /**
     * Get the nextLink property: The link (url) to the next page of results.
     * 
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
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
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of PutAliasListResultInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of PutAliasListResultInner if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IOException If an error occurs while reading the PutAliasListResultInner.
     */
    public static PutAliasListResultInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            PutAliasListResultInner deserializedPutAliasListResultInner = new PutAliasListResultInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("value".equals(fieldName)) {
                    List<PutAliasResponseInner> value
                        = reader.readArray(reader1 -> PutAliasResponseInner.fromJson(reader1));
                    deserializedPutAliasListResultInner.value = value;
                } else if ("nextLink".equals(fieldName)) {
                    deserializedPutAliasListResultInner.nextLink = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedPutAliasListResultInner;
        });
    }
}
