// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * A copy activity Netezza source.
 */
@Fluent
public final class NetezzaSource extends TabularSource {
    /*
     * Copy source type.
     */
    private String type = "NetezzaSource";

    /*
     * A query to retrieve data from source. Type: string (or Expression with resultType string).
     */
    private Object query;

    /*
     * The partition mechanism that will be used for Netezza read in parallel. Possible values include: "None",
     * "DataSlice", "DynamicRange".
     */
    private Object partitionOption;

    /*
     * The settings that will be leveraged for Netezza source partitioning.
     */
    private NetezzaPartitionSettings partitionSettings;

    /**
     * Creates an instance of NetezzaSource class.
     */
    public NetezzaSource() {
    }

    /**
     * Get the type property: Copy source type.
     * 
     * @return the type value.
     */
    @Override
    public String type() {
        return this.type;
    }

    /**
     * Get the query property: A query to retrieve data from source. Type: string (or Expression with resultType
     * string).
     * 
     * @return the query value.
     */
    public Object query() {
        return this.query;
    }

    /**
     * Set the query property: A query to retrieve data from source. Type: string (or Expression with resultType
     * string).
     * 
     * @param query the query value to set.
     * @return the NetezzaSource object itself.
     */
    public NetezzaSource withQuery(Object query) {
        this.query = query;
        return this;
    }

    /**
     * Get the partitionOption property: The partition mechanism that will be used for Netezza read in parallel.
     * Possible values include: "None", "DataSlice", "DynamicRange".
     * 
     * @return the partitionOption value.
     */
    public Object partitionOption() {
        return this.partitionOption;
    }

    /**
     * Set the partitionOption property: The partition mechanism that will be used for Netezza read in parallel.
     * Possible values include: "None", "DataSlice", "DynamicRange".
     * 
     * @param partitionOption the partitionOption value to set.
     * @return the NetezzaSource object itself.
     */
    public NetezzaSource withPartitionOption(Object partitionOption) {
        this.partitionOption = partitionOption;
        return this;
    }

    /**
     * Get the partitionSettings property: The settings that will be leveraged for Netezza source partitioning.
     * 
     * @return the partitionSettings value.
     */
    public NetezzaPartitionSettings partitionSettings() {
        return this.partitionSettings;
    }

    /**
     * Set the partitionSettings property: The settings that will be leveraged for Netezza source partitioning.
     * 
     * @param partitionSettings the partitionSettings value to set.
     * @return the NetezzaSource object itself.
     */
    public NetezzaSource withPartitionSettings(NetezzaPartitionSettings partitionSettings) {
        this.partitionSettings = partitionSettings;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public NetezzaSource withQueryTimeout(Object queryTimeout) {
        super.withQueryTimeout(queryTimeout);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public NetezzaSource withAdditionalColumns(Object additionalColumns) {
        super.withAdditionalColumns(additionalColumns);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public NetezzaSource withSourceRetryCount(Object sourceRetryCount) {
        super.withSourceRetryCount(sourceRetryCount);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public NetezzaSource withSourceRetryWait(Object sourceRetryWait) {
        super.withSourceRetryWait(sourceRetryWait);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public NetezzaSource withMaxConcurrentConnections(Object maxConcurrentConnections) {
        super.withMaxConcurrentConnections(maxConcurrentConnections);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public NetezzaSource withDisableMetricsCollection(Object disableMetricsCollection) {
        super.withDisableMetricsCollection(disableMetricsCollection);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        if (partitionSettings() != null) {
            partitionSettings().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        if (sourceRetryCount() != null) {
            jsonWriter.writeUntypedField("sourceRetryCount", sourceRetryCount());
        }
        if (sourceRetryWait() != null) {
            jsonWriter.writeUntypedField("sourceRetryWait", sourceRetryWait());
        }
        if (maxConcurrentConnections() != null) {
            jsonWriter.writeUntypedField("maxConcurrentConnections", maxConcurrentConnections());
        }
        if (disableMetricsCollection() != null) {
            jsonWriter.writeUntypedField("disableMetricsCollection", disableMetricsCollection());
        }
        if (queryTimeout() != null) {
            jsonWriter.writeUntypedField("queryTimeout", queryTimeout());
        }
        if (additionalColumns() != null) {
            jsonWriter.writeUntypedField("additionalColumns", additionalColumns());
        }
        jsonWriter.writeStringField("type", this.type);
        if (this.query != null) {
            jsonWriter.writeUntypedField("query", this.query);
        }
        if (this.partitionOption != null) {
            jsonWriter.writeUntypedField("partitionOption", this.partitionOption);
        }
        jsonWriter.writeJsonField("partitionSettings", this.partitionSettings);
        if (additionalProperties() != null) {
            for (Map.Entry<String, Object> additionalProperty : additionalProperties().entrySet()) {
                jsonWriter.writeUntypedField(additionalProperty.getKey(), additionalProperty.getValue());
            }
        }
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of NetezzaSource from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of NetezzaSource if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the NetezzaSource.
     */
    public static NetezzaSource fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            NetezzaSource deserializedNetezzaSource = new NetezzaSource();
            Map<String, Object> additionalProperties = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("sourceRetryCount".equals(fieldName)) {
                    deserializedNetezzaSource.withSourceRetryCount(reader.readUntyped());
                } else if ("sourceRetryWait".equals(fieldName)) {
                    deserializedNetezzaSource.withSourceRetryWait(reader.readUntyped());
                } else if ("maxConcurrentConnections".equals(fieldName)) {
                    deserializedNetezzaSource.withMaxConcurrentConnections(reader.readUntyped());
                } else if ("disableMetricsCollection".equals(fieldName)) {
                    deserializedNetezzaSource.withDisableMetricsCollection(reader.readUntyped());
                } else if ("queryTimeout".equals(fieldName)) {
                    deserializedNetezzaSource.withQueryTimeout(reader.readUntyped());
                } else if ("additionalColumns".equals(fieldName)) {
                    deserializedNetezzaSource.withAdditionalColumns(reader.readUntyped());
                } else if ("type".equals(fieldName)) {
                    deserializedNetezzaSource.type = reader.getString();
                } else if ("query".equals(fieldName)) {
                    deserializedNetezzaSource.query = reader.readUntyped();
                } else if ("partitionOption".equals(fieldName)) {
                    deserializedNetezzaSource.partitionOption = reader.readUntyped();
                } else if ("partitionSettings".equals(fieldName)) {
                    deserializedNetezzaSource.partitionSettings = NetezzaPartitionSettings.fromJson(reader);
                } else {
                    if (additionalProperties == null) {
                        additionalProperties = new LinkedHashMap<>();
                    }

                    additionalProperties.put(fieldName, reader.readUntyped());
                }
            }
            deserializedNetezzaSource.withAdditionalProperties(additionalProperties);

            return deserializedNetezzaSource;
        });
    }
}
