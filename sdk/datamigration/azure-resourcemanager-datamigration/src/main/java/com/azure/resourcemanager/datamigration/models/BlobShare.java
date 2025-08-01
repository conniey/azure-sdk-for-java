// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datamigration.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Blob container storage information.
 */
@Fluent
public final class BlobShare implements JsonSerializable<BlobShare> {
    /*
     * SAS URI of Azure Storage Account Container.
     */
    private String sasUri;

    /**
     * Creates an instance of BlobShare class.
     */
    public BlobShare() {
    }

    /**
     * Get the sasUri property: SAS URI of Azure Storage Account Container.
     * 
     * @return the sasUri value.
     */
    public String sasUri() {
        return this.sasUri;
    }

    /**
     * Set the sasUri property: SAS URI of Azure Storage Account Container.
     * 
     * @param sasUri the sasUri value to set.
     * @return the BlobShare object itself.
     */
    public BlobShare withSasUri(String sasUri) {
        this.sasUri = sasUri;
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
        jsonWriter.writeStringField("sasUri", this.sasUri);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of BlobShare from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of BlobShare if the JsonReader was pointing to an instance of it, or null if it was pointing
     * to JSON null.
     * @throws IOException If an error occurs while reading the BlobShare.
     */
    public static BlobShare fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            BlobShare deserializedBlobShare = new BlobShare();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("sasUri".equals(fieldName)) {
                    deserializedBlobShare.sasUri = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedBlobShare;
        });
    }
}
