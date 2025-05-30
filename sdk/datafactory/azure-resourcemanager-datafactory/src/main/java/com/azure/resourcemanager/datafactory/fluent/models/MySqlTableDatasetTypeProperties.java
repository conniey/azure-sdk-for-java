// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * MySql table dataset properties.
 */
@Fluent
public final class MySqlTableDatasetTypeProperties implements JsonSerializable<MySqlTableDatasetTypeProperties> {
    /*
     * The MySQL table name. Type: string (or Expression with resultType string).
     */
    private Object tableName;

    /**
     * Creates an instance of MySqlTableDatasetTypeProperties class.
     */
    public MySqlTableDatasetTypeProperties() {
    }

    /**
     * Get the tableName property: The MySQL table name. Type: string (or Expression with resultType string).
     * 
     * @return the tableName value.
     */
    public Object tableName() {
        return this.tableName;
    }

    /**
     * Set the tableName property: The MySQL table name. Type: string (or Expression with resultType string).
     * 
     * @param tableName the tableName value to set.
     * @return the MySqlTableDatasetTypeProperties object itself.
     */
    public MySqlTableDatasetTypeProperties withTableName(Object tableName) {
        this.tableName = tableName;
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
        if (this.tableName != null) {
            jsonWriter.writeUntypedField("tableName", this.tableName);
        }
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of MySqlTableDatasetTypeProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of MySqlTableDatasetTypeProperties if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the MySqlTableDatasetTypeProperties.
     */
    public static MySqlTableDatasetTypeProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            MySqlTableDatasetTypeProperties deserializedMySqlTableDatasetTypeProperties
                = new MySqlTableDatasetTypeProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("tableName".equals(fieldName)) {
                    deserializedMySqlTableDatasetTypeProperties.tableName = reader.readUntyped();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedMySqlTableDatasetTypeProperties;
        });
    }
}
