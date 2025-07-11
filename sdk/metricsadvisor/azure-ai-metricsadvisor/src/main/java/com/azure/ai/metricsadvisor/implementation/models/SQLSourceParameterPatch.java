// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.metricsadvisor.implementation.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Generated;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * The SQLSourceParameterPatch model.
 */
@Fluent
public final class SQLSourceParameterPatch implements JsonSerializable<SQLSourceParameterPatch> {
    /*
     * The connection string of this database
     */
    @Generated
    private String connectionString;

    /*
     * The script to query this database
     */
    @Generated
    private String query;

    /**
     * Creates an instance of SQLSourceParameterPatch class.
     */
    @Generated
    public SQLSourceParameterPatch() {
    }

    /**
     * Get the connectionString property: The connection string of this database.
     * 
     * @return the connectionString value.
     */
    @Generated
    public String getConnectionString() {
        return this.connectionString;
    }

    /**
     * Set the connectionString property: The connection string of this database.
     * 
     * @param connectionString the connectionString value to set.
     * @return the SQLSourceParameterPatch object itself.
     */
    @Generated
    public SQLSourceParameterPatch setConnectionString(String connectionString) {
        this.connectionString = connectionString;
        return this;
    }

    /**
     * Get the query property: The script to query this database.
     * 
     * @return the query value.
     */
    @Generated
    public String getQuery() {
        return this.query;
    }

    /**
     * Set the query property: The script to query this database.
     * 
     * @param query the query value to set.
     * @return the SQLSourceParameterPatch object itself.
     */
    @Generated
    public SQLSourceParameterPatch setQuery(String query) {
        this.query = query;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("connectionString", this.connectionString);
        jsonWriter.writeStringField("query", this.query);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of SQLSourceParameterPatch from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of SQLSourceParameterPatch if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IOException If an error occurs while reading the SQLSourceParameterPatch.
     */
    @Generated
    public static SQLSourceParameterPatch fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            SQLSourceParameterPatch deserializedSQLSourceParameterPatch = new SQLSourceParameterPatch();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("connectionString".equals(fieldName)) {
                    deserializedSQLSourceParameterPatch.connectionString = reader.getString();
                } else if ("query".equals(fieldName)) {
                    deserializedSQLSourceParameterPatch.query = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedSQLSourceParameterPatch;
        });
    }
}
