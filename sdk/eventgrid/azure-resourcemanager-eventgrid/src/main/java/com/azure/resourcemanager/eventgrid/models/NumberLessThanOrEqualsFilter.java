// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * NumberLessThanOrEquals Filter.
 */
@Fluent
public final class NumberLessThanOrEqualsFilter extends Filter {
    /*
     * The operator type used for filtering, e.g., NumberIn, StringContains, BoolEquals and others.
     */
    private FilterOperatorType operatorType = FilterOperatorType.NUMBER_LESS_THAN_OR_EQUALS;

    /*
     * The filter value.
     */
    private Double value;

    /**
     * Creates an instance of NumberLessThanOrEqualsFilter class.
     */
    public NumberLessThanOrEqualsFilter() {
    }

    /**
     * Get the operatorType property: The operator type used for filtering, e.g., NumberIn, StringContains, BoolEquals
     * and others.
     * 
     * @return the operatorType value.
     */
    @Override
    public FilterOperatorType operatorType() {
        return this.operatorType;
    }

    /**
     * Get the value property: The filter value.
     * 
     * @return the value value.
     */
    public Double value() {
        return this.value;
    }

    /**
     * Set the value property: The filter value.
     * 
     * @param value the value value to set.
     * @return the NumberLessThanOrEqualsFilter object itself.
     */
    public NumberLessThanOrEqualsFilter withValue(Double value) {
        this.value = value;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public NumberLessThanOrEqualsFilter withKey(String key) {
        super.withKey(key);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("key", key());
        jsonWriter.writeStringField("operatorType", this.operatorType == null ? null : this.operatorType.toString());
        jsonWriter.writeNumberField("value", this.value);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of NumberLessThanOrEqualsFilter from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of NumberLessThanOrEqualsFilter if the JsonReader was pointing to an instance of it, or null
     * if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the NumberLessThanOrEqualsFilter.
     */
    public static NumberLessThanOrEqualsFilter fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            NumberLessThanOrEqualsFilter deserializedNumberLessThanOrEqualsFilter = new NumberLessThanOrEqualsFilter();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("key".equals(fieldName)) {
                    deserializedNumberLessThanOrEqualsFilter.withKey(reader.getString());
                } else if ("operatorType".equals(fieldName)) {
                    deserializedNumberLessThanOrEqualsFilter.operatorType
                        = FilterOperatorType.fromString(reader.getString());
                } else if ("value".equals(fieldName)) {
                    deserializedNumberLessThanOrEqualsFilter.value = reader.getNullable(JsonReader::getDouble);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedNumberLessThanOrEqualsFilter;
        });
    }
}
