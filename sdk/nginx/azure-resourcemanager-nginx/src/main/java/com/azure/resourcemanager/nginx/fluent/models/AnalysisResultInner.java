// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.nginx.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.nginx.models.AnalysisResultData;
import java.io.IOException;

/**
 * The response body for an analysis request. Contains the status of the analysis and any errors.
 */
@Fluent
public final class AnalysisResultInner implements JsonSerializable<AnalysisResultInner> {
    /*
     * The status of the analysis.
     */
    private String status;

    /*
     * The data property.
     */
    private AnalysisResultData data;

    /**
     * Creates an instance of AnalysisResultInner class.
     */
    public AnalysisResultInner() {
    }

    /**
     * Get the status property: The status of the analysis.
     * 
     * @return the status value.
     */
    public String status() {
        return this.status;
    }

    /**
     * Set the status property: The status of the analysis.
     * 
     * @param status the status value to set.
     * @return the AnalysisResultInner object itself.
     */
    public AnalysisResultInner withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * Get the data property: The data property.
     * 
     * @return the data value.
     */
    public AnalysisResultData data() {
        return this.data;
    }

    /**
     * Set the data property: The data property.
     * 
     * @param data the data value to set.
     * @return the AnalysisResultInner object itself.
     */
    public AnalysisResultInner withData(AnalysisResultData data) {
        this.data = data;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (status() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException("Missing required property status in model AnalysisResultInner"));
        }
        if (data() != null) {
            data().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(AnalysisResultInner.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("status", this.status);
        jsonWriter.writeJsonField("data", this.data);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of AnalysisResultInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of AnalysisResultInner if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the AnalysisResultInner.
     */
    public static AnalysisResultInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            AnalysisResultInner deserializedAnalysisResultInner = new AnalysisResultInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("status".equals(fieldName)) {
                    deserializedAnalysisResultInner.status = reader.getString();
                } else if ("data".equals(fieldName)) {
                    deserializedAnalysisResultInner.data = AnalysisResultData.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedAnalysisResultInner;
        });
    }
}
