// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Generated;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * The settings that will be leveraged for SAP HANA source partitioning.
 */
@Fluent
public final class SapHanaPartitionSettings implements JsonSerializable<SapHanaPartitionSettings> {
    /*
     * The name of the column that will be used for proceeding range partitioning. Type: string (or Expression with
     * resultType string).
     */
    @Generated
    private Object partitionColumnName;

    /**
     * Creates an instance of SapHanaPartitionSettings class.
     */
    @Generated
    public SapHanaPartitionSettings() {
    }

    /**
     * Get the partitionColumnName property: The name of the column that will be used for proceeding range partitioning.
     * Type: string (or Expression with resultType string).
     * 
     * @return the partitionColumnName value.
     */
    @Generated
    public Object getPartitionColumnName() {
        return this.partitionColumnName;
    }

    /**
     * Set the partitionColumnName property: The name of the column that will be used for proceeding range partitioning.
     * Type: string (or Expression with resultType string).
     * 
     * @param partitionColumnName the partitionColumnName value to set.
     * @return the SapHanaPartitionSettings object itself.
     */
    @Generated
    public SapHanaPartitionSettings setPartitionColumnName(Object partitionColumnName) {
        this.partitionColumnName = partitionColumnName;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        if (this.partitionColumnName != null) {
            jsonWriter.writeUntypedField("partitionColumnName", this.partitionColumnName);
        }
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of SapHanaPartitionSettings from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of SapHanaPartitionSettings if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the SapHanaPartitionSettings.
     */
    @Generated
    public static SapHanaPartitionSettings fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            SapHanaPartitionSettings deserializedSapHanaPartitionSettings = new SapHanaPartitionSettings();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("partitionColumnName".equals(fieldName)) {
                    deserializedSapHanaPartitionSettings.partitionColumnName = reader.readUntyped();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedSapHanaPartitionSettings;
        });
    }
}
