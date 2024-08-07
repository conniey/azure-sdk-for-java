// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.search.fluent.models;

import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Describes an API key for a given search service that has permissions for query operations only.
 */
@Immutable
public final class QueryKeyInner implements JsonSerializable<QueryKeyInner> {
    /*
     * The name of the query API key; may be empty.
     */
    private String name;

    /*
     * The value of the query API key.
     */
    private String key;

    /**
     * Creates an instance of QueryKeyInner class.
     */
    public QueryKeyInner() {
    }

    /**
     * Get the name property: The name of the query API key; may be empty.
     * 
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Get the key property: The value of the query API key.
     * 
     * @return the key value.
     */
    public String key() {
        return this.key;
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
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of QueryKeyInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of QueryKeyInner if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the QueryKeyInner.
     */
    public static QueryKeyInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            QueryKeyInner deserializedQueryKeyInner = new QueryKeyInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("name".equals(fieldName)) {
                    deserializedQueryKeyInner.name = reader.getString();
                } else if ("key".equals(fieldName)) {
                    deserializedQueryKeyInner.key = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedQueryKeyInner;
        });
    }
}
