// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mariadb.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Represents a Query Text.
 */
@Fluent
public final class QueryTextInner extends ProxyResource {
    /*
     * The properties of a query text.
     */
    private QueryTextProperties innerProperties;

    /*
     * The type of the resource.
     */
    private String type;

    /*
     * The name of the resource.
     */
    private String name;

    /*
     * Fully qualified resource Id for the resource.
     */
    private String id;

    /**
     * Creates an instance of QueryTextInner class.
     */
    public QueryTextInner() {
    }

    /**
     * Get the innerProperties property: The properties of a query text.
     * 
     * @return the innerProperties value.
     */
    private QueryTextProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the type property: The type of the resource.
     * 
     * @return the type value.
     */
    @Override
    public String type() {
        return this.type;
    }

    /**
     * Get the name property: The name of the resource.
     * 
     * @return the name value.
     */
    @Override
    public String name() {
        return this.name;
    }

    /**
     * Get the id property: Fully qualified resource Id for the resource.
     * 
     * @return the id value.
     */
    @Override
    public String id() {
        return this.id;
    }

    /**
     * Get the queryId property: Query identifier unique to the server.
     * 
     * @return the queryId value.
     */
    public String queryId() {
        return this.innerProperties() == null ? null : this.innerProperties().queryId();
    }

    /**
     * Set the queryId property: Query identifier unique to the server.
     * 
     * @param queryId the queryId value to set.
     * @return the QueryTextInner object itself.
     */
    public QueryTextInner withQueryId(String queryId) {
        if (this.innerProperties() == null) {
            this.innerProperties = new QueryTextProperties();
        }
        this.innerProperties().withQueryId(queryId);
        return this;
    }

    /**
     * Get the queryText property: Query text.
     * 
     * @return the queryText value.
     */
    public String queryText() {
        return this.innerProperties() == null ? null : this.innerProperties().queryText();
    }

    /**
     * Set the queryText property: Query text.
     * 
     * @param queryText the queryText value to set.
     * @return the QueryTextInner object itself.
     */
    public QueryTextInner withQueryText(String queryText) {
        if (this.innerProperties() == null) {
            this.innerProperties = new QueryTextProperties();
        }
        this.innerProperties().withQueryText(queryText);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeJsonField("properties", this.innerProperties);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of QueryTextInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of QueryTextInner if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the QueryTextInner.
     */
    public static QueryTextInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            QueryTextInner deserializedQueryTextInner = new QueryTextInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedQueryTextInner.id = reader.getString();
                } else if ("name".equals(fieldName)) {
                    deserializedQueryTextInner.name = reader.getString();
                } else if ("type".equals(fieldName)) {
                    deserializedQueryTextInner.type = reader.getString();
                } else if ("properties".equals(fieldName)) {
                    deserializedQueryTextInner.innerProperties = QueryTextProperties.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedQueryTextInner;
        });
    }
}
