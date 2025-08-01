// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.monitor.query.logs.implementation.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * Contains the columns and rows for one table in a query response.
 */
@Immutable
public final class Table implements JsonSerializable<Table> {

    /*
     * The name of the table.
     */
    @Generated
    private final String name;

    /*
     * The list of columns in this table.
     */
    @Generated
    private final List<Column> columns;

    /*
     * The resulting rows from this query.
     */
    @Generated
    private final List<List<Object>> rows;

    /**
     * Creates an instance of Table class.
     *
     * @param name the name value to set.
     * @param columns the columns value to set.
     * @param rows the rows value to set.
     */
    @Generated
    private Table(String name, List<Column> columns, List<List<Object>> rows) {
        this.name = name;
        this.columns = columns;
        this.rows = rows;
    }

    /**
     * Get the name property: The name of the table.
     *
     * @return the name value.
     */
    @Generated
    public String getName() {
        return this.name;
    }

    /**
     * Get the columns property: The list of columns in this table.
     *
     * @return the columns value.
     */
    @Generated
    public List<Column> getColumns() {
        return this.columns;
    }

    /**
     * Get the rows property: The resulting rows from this query.
     *
     * @return the rows value.
     */
    @Generated
    public List<List<Object>> getRows() {
        return this.rows;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("name", this.name);
        jsonWriter.writeArrayField("columns", this.columns, (writer, element) -> writer.writeJson(element));
        jsonWriter.writeArrayField("rows", this.rows,
            (writer, element) -> writer.writeArray(element, (writer1, element1) -> writer1.writeUntyped(element1)));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of Table from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of Table if the JsonReader was pointing to an instance of it, or null if it was pointing to
     * JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the Table.
     */
    @Generated
    public static Table fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            String name = null;
            List<Column> columns = null;
            List<List<Object>> rows = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();
                if ("name".equals(fieldName)) {
                    name = reader.getString();
                } else if ("columns".equals(fieldName)) {
                    columns = reader.readArray(reader1 -> Column.fromJson(reader1));
                } else if ("rows".equals(fieldName)) {
                    rows = reader.readArray(reader1 -> reader1.readArray(reader2 -> reader2.readUntyped()));
                } else {
                    reader.skipChildren();
                }
            }
            return new Table(name, columns, rows);
        });
    }
}
