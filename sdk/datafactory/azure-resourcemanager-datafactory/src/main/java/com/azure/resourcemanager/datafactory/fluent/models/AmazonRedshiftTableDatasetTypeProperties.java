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
 * Amazon Redshift table dataset properties.
 */
@Fluent
public final class AmazonRedshiftTableDatasetTypeProperties
    implements JsonSerializable<AmazonRedshiftTableDatasetTypeProperties> {
    /*
     * This property will be retired. Please consider using schema + table properties instead.
     */
    private Object tableName;

    /*
     * The Amazon Redshift table name. Type: string (or Expression with resultType string).
     */
    private Object table;

    /*
     * The Amazon Redshift schema name. Type: string (or Expression with resultType string).
     */
    private Object schema;

    /**
     * Creates an instance of AmazonRedshiftTableDatasetTypeProperties class.
     */
    public AmazonRedshiftTableDatasetTypeProperties() {
    }

    /**
     * Get the tableName property: This property will be retired. Please consider using schema + table properties
     * instead.
     * 
     * @return the tableName value.
     */
    public Object tableName() {
        return this.tableName;
    }

    /**
     * Set the tableName property: This property will be retired. Please consider using schema + table properties
     * instead.
     * 
     * @param tableName the tableName value to set.
     * @return the AmazonRedshiftTableDatasetTypeProperties object itself.
     */
    public AmazonRedshiftTableDatasetTypeProperties withTableName(Object tableName) {
        this.tableName = tableName;
        return this;
    }

    /**
     * Get the table property: The Amazon Redshift table name. Type: string (or Expression with resultType string).
     * 
     * @return the table value.
     */
    public Object table() {
        return this.table;
    }

    /**
     * Set the table property: The Amazon Redshift table name. Type: string (or Expression with resultType string).
     * 
     * @param table the table value to set.
     * @return the AmazonRedshiftTableDatasetTypeProperties object itself.
     */
    public AmazonRedshiftTableDatasetTypeProperties withTable(Object table) {
        this.table = table;
        return this;
    }

    /**
     * Get the schema property: The Amazon Redshift schema name. Type: string (or Expression with resultType string).
     * 
     * @return the schema value.
     */
    public Object schema() {
        return this.schema;
    }

    /**
     * Set the schema property: The Amazon Redshift schema name. Type: string (or Expression with resultType string).
     * 
     * @param schema the schema value to set.
     * @return the AmazonRedshiftTableDatasetTypeProperties object itself.
     */
    public AmazonRedshiftTableDatasetTypeProperties withSchema(Object schema) {
        this.schema = schema;
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
        if (this.table != null) {
            jsonWriter.writeUntypedField("table", this.table);
        }
        if (this.schema != null) {
            jsonWriter.writeUntypedField("schema", this.schema);
        }
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of AmazonRedshiftTableDatasetTypeProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of AmazonRedshiftTableDatasetTypeProperties if the JsonReader was pointing to an instance of
     * it, or null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the AmazonRedshiftTableDatasetTypeProperties.
     */
    public static AmazonRedshiftTableDatasetTypeProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            AmazonRedshiftTableDatasetTypeProperties deserializedAmazonRedshiftTableDatasetTypeProperties
                = new AmazonRedshiftTableDatasetTypeProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("tableName".equals(fieldName)) {
                    deserializedAmazonRedshiftTableDatasetTypeProperties.tableName = reader.readUntyped();
                } else if ("table".equals(fieldName)) {
                    deserializedAmazonRedshiftTableDatasetTypeProperties.table = reader.readUntyped();
                } else if ("schema".equals(fieldName)) {
                    deserializedAmazonRedshiftTableDatasetTypeProperties.schema = reader.readUntyped();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedAmazonRedshiftTableDatasetTypeProperties;
        });
    }
}
