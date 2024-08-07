// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcontainers.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * .NET app configuration.
 */
@Fluent
public final class RuntimeDotnet implements JsonSerializable<RuntimeDotnet> {
    /*
     * Auto configure the ASP.NET Core Data Protection feature
     */
    private Boolean autoConfigureDataProtection;

    /**
     * Creates an instance of RuntimeDotnet class.
     */
    public RuntimeDotnet() {
    }

    /**
     * Get the autoConfigureDataProtection property: Auto configure the ASP.NET Core Data Protection feature.
     * 
     * @return the autoConfigureDataProtection value.
     */
    public Boolean autoConfigureDataProtection() {
        return this.autoConfigureDataProtection;
    }

    /**
     * Set the autoConfigureDataProtection property: Auto configure the ASP.NET Core Data Protection feature.
     * 
     * @param autoConfigureDataProtection the autoConfigureDataProtection value to set.
     * @return the RuntimeDotnet object itself.
     */
    public RuntimeDotnet withAutoConfigureDataProtection(Boolean autoConfigureDataProtection) {
        this.autoConfigureDataProtection = autoConfigureDataProtection;
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
        jsonWriter.writeBooleanField("autoConfigureDataProtection", this.autoConfigureDataProtection);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of RuntimeDotnet from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of RuntimeDotnet if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the RuntimeDotnet.
     */
    public static RuntimeDotnet fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            RuntimeDotnet deserializedRuntimeDotnet = new RuntimeDotnet();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("autoConfigureDataProtection".equals(fieldName)) {
                    deserializedRuntimeDotnet.autoConfigureDataProtection = reader.getNullable(JsonReader::getBoolean);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedRuntimeDotnet;
        });
    }
}
