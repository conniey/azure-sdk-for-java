// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurestackhci.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.azurestackhci.models.ExtensionPatchParameters;
import java.io.IOException;

/**
 * Describes Machine Extension Properties that can be updated.
 */
@Fluent
public final class ExtensionPatchProperties implements JsonSerializable<ExtensionPatchProperties> {
    /*
     * Describes the properties of a Machine Extension that can be updated.
     */
    private ExtensionPatchParameters extensionParameters;

    /**
     * Creates an instance of ExtensionPatchProperties class.
     */
    public ExtensionPatchProperties() {
    }

    /**
     * Get the extensionParameters property: Describes the properties of a Machine Extension that can be updated.
     * 
     * @return the extensionParameters value.
     */
    public ExtensionPatchParameters extensionParameters() {
        return this.extensionParameters;
    }

    /**
     * Set the extensionParameters property: Describes the properties of a Machine Extension that can be updated.
     * 
     * @param extensionParameters the extensionParameters value to set.
     * @return the ExtensionPatchProperties object itself.
     */
    public ExtensionPatchProperties withExtensionParameters(ExtensionPatchParameters extensionParameters) {
        this.extensionParameters = extensionParameters;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (extensionParameters() != null) {
            extensionParameters().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeJsonField("extensionParameters", this.extensionParameters);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ExtensionPatchProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ExtensionPatchProperties if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the ExtensionPatchProperties.
     */
    public static ExtensionPatchProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ExtensionPatchProperties deserializedExtensionPatchProperties = new ExtensionPatchProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("extensionParameters".equals(fieldName)) {
                    deserializedExtensionPatchProperties.extensionParameters
                        = ExtensionPatchParameters.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedExtensionPatchProperties;
        });
    }
}
