// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.v2.data.appconfiguration.implementation.models;

import com.azure.v2.data.appconfiguration.models.SettingLabel;
import io.clientcore.core.annotations.Metadata;
import io.clientcore.core.annotations.MetadataProperties;
import io.clientcore.core.serialization.json.JsonReader;
import io.clientcore.core.serialization.json.JsonSerializable;
import io.clientcore.core.serialization.json.JsonToken;
import io.clientcore.core.serialization.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * The result of a list request.
 */
@Metadata(properties = { MetadataProperties.IMMUTABLE })
public final class LabelListResult implements JsonSerializable<LabelListResult> {
    /*
     * The collection value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private List<SettingLabel> items;

    /*
     * The URI that can be used to request the next set of paged results.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String nextLink;

    /**
     * Creates an instance of LabelListResult class.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private LabelListResult() {
    }

    /**
     * Get the items property: The collection value.
     * 
     * @return the items value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public List<SettingLabel> getItems() {
        return this.items;
    }

    /**
     * Get the nextLink property: The URI that can be used to request the next set of paged results.
     * 
     * @return the nextLink value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getNextLink() {
        return this.nextLink;
    }

    /**
     * {@inheritDoc}
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeArrayField("items", this.items, (writer, element) -> writer.writeJson(element));
        jsonWriter.writeStringField("@nextLink", this.nextLink);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of LabelListResult from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of LabelListResult if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the LabelListResult.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public static LabelListResult fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            LabelListResult deserializedLabelListResult = new LabelListResult();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("items".equals(fieldName)) {
                    List<SettingLabel> items = reader.readArray(reader1 -> SettingLabel.fromJson(reader1));
                    deserializedLabelListResult.items = items;
                } else if ("@nextLink".equals(fieldName)) {
                    deserializedLabelListResult.nextLink = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedLabelListResult;
        });
    }
}
