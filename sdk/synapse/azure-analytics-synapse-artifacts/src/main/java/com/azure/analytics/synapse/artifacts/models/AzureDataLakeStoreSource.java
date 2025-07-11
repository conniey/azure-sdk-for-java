// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Generated;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * A copy activity Azure Data Lake source.
 */
@Fluent
public final class AzureDataLakeStoreSource extends CopySource {
    /*
     * Copy source type.
     */
    @Generated
    private String type = "AzureDataLakeStoreSource";

    /*
     * If true, files under the folder path will be read recursively. Default is true. Type: boolean (or Expression with
     * resultType boolean).
     */
    @Generated
    private Object recursive;

    /**
     * Creates an instance of AzureDataLakeStoreSource class.
     */
    @Generated
    public AzureDataLakeStoreSource() {
    }

    /**
     * Get the type property: Copy source type.
     * 
     * @return the type value.
     */
    @Generated
    @Override
    public String getType() {
        return this.type;
    }

    /**
     * Get the recursive property: If true, files under the folder path will be read recursively. Default is true. Type:
     * boolean (or Expression with resultType boolean).
     * 
     * @return the recursive value.
     */
    @Generated
    public Object getRecursive() {
        return this.recursive;
    }

    /**
     * Set the recursive property: If true, files under the folder path will be read recursively. Default is true. Type:
     * boolean (or Expression with resultType boolean).
     * 
     * @param recursive the recursive value to set.
     * @return the AzureDataLakeStoreSource object itself.
     */
    @Generated
    public AzureDataLakeStoreSource setRecursive(Object recursive) {
        this.recursive = recursive;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public AzureDataLakeStoreSource setSourceRetryCount(Object sourceRetryCount) {
        super.setSourceRetryCount(sourceRetryCount);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public AzureDataLakeStoreSource setSourceRetryWait(Object sourceRetryWait) {
        super.setSourceRetryWait(sourceRetryWait);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public AzureDataLakeStoreSource setMaxConcurrentConnections(Object maxConcurrentConnections) {
        super.setMaxConcurrentConnections(maxConcurrentConnections);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        if (getSourceRetryCount() != null) {
            jsonWriter.writeUntypedField("sourceRetryCount", getSourceRetryCount());
        }
        if (getSourceRetryWait() != null) {
            jsonWriter.writeUntypedField("sourceRetryWait", getSourceRetryWait());
        }
        if (getMaxConcurrentConnections() != null) {
            jsonWriter.writeUntypedField("maxConcurrentConnections", getMaxConcurrentConnections());
        }
        jsonWriter.writeStringField("type", this.type);
        if (this.recursive != null) {
            jsonWriter.writeUntypedField("recursive", this.recursive);
        }
        if (getAdditionalProperties() != null) {
            for (Map.Entry<String, Object> additionalProperty : getAdditionalProperties().entrySet()) {
                jsonWriter.writeUntypedField(additionalProperty.getKey(), additionalProperty.getValue());
            }
        }
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of AzureDataLakeStoreSource from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of AzureDataLakeStoreSource if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the AzureDataLakeStoreSource.
     */
    @Generated
    public static AzureDataLakeStoreSource fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            AzureDataLakeStoreSource deserializedAzureDataLakeStoreSource = new AzureDataLakeStoreSource();
            Map<String, Object> additionalProperties = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("sourceRetryCount".equals(fieldName)) {
                    deserializedAzureDataLakeStoreSource.setSourceRetryCount(reader.readUntyped());
                } else if ("sourceRetryWait".equals(fieldName)) {
                    deserializedAzureDataLakeStoreSource.setSourceRetryWait(reader.readUntyped());
                } else if ("maxConcurrentConnections".equals(fieldName)) {
                    deserializedAzureDataLakeStoreSource.setMaxConcurrentConnections(reader.readUntyped());
                } else if ("type".equals(fieldName)) {
                    deserializedAzureDataLakeStoreSource.type = reader.getString();
                } else if ("recursive".equals(fieldName)) {
                    deserializedAzureDataLakeStoreSource.recursive = reader.readUntyped();
                } else {
                    if (additionalProperties == null) {
                        additionalProperties = new LinkedHashMap<>();
                    }

                    additionalProperties.put(fieldName, reader.readUntyped());
                }
            }
            deserializedAzureDataLakeStoreSource.setAdditionalProperties(additionalProperties);

            return deserializedAzureDataLakeStoreSource;
        });
    }
}
