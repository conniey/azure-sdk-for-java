// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurestackhci.models;

import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * Extensions details for edge device.
 */
@Immutable
public final class ExtensionProfile implements JsonSerializable<ExtensionProfile> {
    /*
     * List of Arc extensions installed on edge device.
     */
    private List<HciEdgeDeviceArcExtension> extensions;

    /**
     * Creates an instance of ExtensionProfile class.
     */
    public ExtensionProfile() {
    }

    /**
     * Get the extensions property: List of Arc extensions installed on edge device.
     * 
     * @return the extensions value.
     */
    public List<HciEdgeDeviceArcExtension> extensions() {
        return this.extensions;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (extensions() != null) {
            extensions().forEach(e -> e.validate());
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ExtensionProfile from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ExtensionProfile if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the ExtensionProfile.
     */
    public static ExtensionProfile fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ExtensionProfile deserializedExtensionProfile = new ExtensionProfile();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("extensions".equals(fieldName)) {
                    List<HciEdgeDeviceArcExtension> extensions
                        = reader.readArray(reader1 -> HciEdgeDeviceArcExtension.fromJson(reader1));
                    deserializedExtensionProfile.extensions = extensions;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedExtensionProfile;
        });
    }
}
