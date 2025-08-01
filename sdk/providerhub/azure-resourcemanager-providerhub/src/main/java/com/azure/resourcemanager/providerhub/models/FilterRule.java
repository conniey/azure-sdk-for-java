// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.providerhub.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * The FilterRule model.
 */
@Fluent
public final class FilterRule implements JsonSerializable<FilterRule> {
    /*
     * The filter query.
     */
    private String filterQuery;

    /*
     * The endpoint information.
     */
    private List<EndpointInformation> endpointInformation;

    /**
     * Creates an instance of FilterRule class.
     */
    public FilterRule() {
    }

    /**
     * Get the filterQuery property: The filter query.
     * 
     * @return the filterQuery value.
     */
    public String filterQuery() {
        return this.filterQuery;
    }

    /**
     * Set the filterQuery property: The filter query.
     * 
     * @param filterQuery the filterQuery value to set.
     * @return the FilterRule object itself.
     */
    public FilterRule withFilterQuery(String filterQuery) {
        this.filterQuery = filterQuery;
        return this;
    }

    /**
     * Get the endpointInformation property: The endpoint information.
     * 
     * @return the endpointInformation value.
     */
    public List<EndpointInformation> endpointInformation() {
        return this.endpointInformation;
    }

    /**
     * Set the endpointInformation property: The endpoint information.
     * 
     * @param endpointInformation the endpointInformation value to set.
     * @return the FilterRule object itself.
     */
    public FilterRule withEndpointInformation(List<EndpointInformation> endpointInformation) {
        this.endpointInformation = endpointInformation;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (endpointInformation() != null) {
            endpointInformation().forEach(e -> e.validate());
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("filterQuery", this.filterQuery);
        jsonWriter.writeArrayField("endpointInformation", this.endpointInformation,
            (writer, element) -> writer.writeJson(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of FilterRule from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of FilterRule if the JsonReader was pointing to an instance of it, or null if it was pointing
     * to JSON null.
     * @throws IOException If an error occurs while reading the FilterRule.
     */
    public static FilterRule fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            FilterRule deserializedFilterRule = new FilterRule();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("filterQuery".equals(fieldName)) {
                    deserializedFilterRule.filterQuery = reader.getString();
                } else if ("endpointInformation".equals(fieldName)) {
                    List<EndpointInformation> endpointInformation
                        = reader.readArray(reader1 -> EndpointInformation.fromJson(reader1));
                    deserializedFilterRule.endpointInformation = endpointInformation;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedFilterRule;
        });
    }
}
