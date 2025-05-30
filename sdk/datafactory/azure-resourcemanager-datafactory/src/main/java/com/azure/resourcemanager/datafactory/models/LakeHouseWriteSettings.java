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
import java.util.List;
import java.util.Map;

/**
 * Microsoft Fabric Lakehouse Files write settings.
 */
@Fluent
public final class LakeHouseWriteSettings extends StoreWriteSettings {
    /*
     * The write setting type.
     */
    private String type = "LakeHouseWriteSettings";

    /**
     * Creates an instance of LakeHouseWriteSettings class.
     */
    public LakeHouseWriteSettings() {
    }

    /**
     * Get the type property: The write setting type.
     * 
     * @return the type value.
     */
    @Override
    public String type() {
        return this.type;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LakeHouseWriteSettings withMaxConcurrentConnections(Object maxConcurrentConnections) {
        super.withMaxConcurrentConnections(maxConcurrentConnections);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LakeHouseWriteSettings withDisableMetricsCollection(Object disableMetricsCollection) {
        super.withDisableMetricsCollection(disableMetricsCollection);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LakeHouseWriteSettings withCopyBehavior(Object copyBehavior) {
        super.withCopyBehavior(copyBehavior);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LakeHouseWriteSettings withMetadata(List<MetadataItem> metadata) {
        super.withMetadata(metadata);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        if (metadata() != null) {
            metadata().forEach(e -> e.validate());
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        if (maxConcurrentConnections() != null) {
            jsonWriter.writeUntypedField("maxConcurrentConnections", maxConcurrentConnections());
        }
        if (disableMetricsCollection() != null) {
            jsonWriter.writeUntypedField("disableMetricsCollection", disableMetricsCollection());
        }
        if (copyBehavior() != null) {
            jsonWriter.writeUntypedField("copyBehavior", copyBehavior());
        }
        jsonWriter.writeArrayField("metadata", metadata(), (writer, element) -> writer.writeJson(element));
        jsonWriter.writeStringField("type", this.type);
        if (additionalProperties() != null) {
            for (Map.Entry<String, Object> additionalProperty : additionalProperties().entrySet()) {
                jsonWriter.writeUntypedField(additionalProperty.getKey(), additionalProperty.getValue());
            }
        }
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of LakeHouseWriteSettings from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of LakeHouseWriteSettings if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IOException If an error occurs while reading the LakeHouseWriteSettings.
     */
    public static LakeHouseWriteSettings fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            LakeHouseWriteSettings deserializedLakeHouseWriteSettings = new LakeHouseWriteSettings();
            Map<String, Object> additionalProperties = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("maxConcurrentConnections".equals(fieldName)) {
                    deserializedLakeHouseWriteSettings.withMaxConcurrentConnections(reader.readUntyped());
                } else if ("disableMetricsCollection".equals(fieldName)) {
                    deserializedLakeHouseWriteSettings.withDisableMetricsCollection(reader.readUntyped());
                } else if ("copyBehavior".equals(fieldName)) {
                    deserializedLakeHouseWriteSettings.withCopyBehavior(reader.readUntyped());
                } else if ("metadata".equals(fieldName)) {
                    List<MetadataItem> metadata = reader.readArray(reader1 -> MetadataItem.fromJson(reader1));
                    deserializedLakeHouseWriteSettings.withMetadata(metadata);
                } else if ("type".equals(fieldName)) {
                    deserializedLakeHouseWriteSettings.type = reader.getString();
                } else {
                    if (additionalProperties == null) {
                        additionalProperties = new LinkedHashMap<>();
                    }

                    additionalProperties.put(fieldName, reader.readUntyped());
                }
            }
            deserializedLakeHouseWriteSettings.withAdditionalProperties(additionalProperties);

            return deserializedLakeHouseWriteSettings;
        });
    }
}
