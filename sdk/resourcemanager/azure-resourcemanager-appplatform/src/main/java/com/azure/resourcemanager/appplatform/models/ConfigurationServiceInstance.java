// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appplatform.models;

import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Collection of instances belong to the Application Configuration Service.
 */
@Immutable
public final class ConfigurationServiceInstance implements JsonSerializable<ConfigurationServiceInstance> {
    /*
     * Name of the Application Configuration Service instance
     */
    private String name;

    /*
     * Status of the Application Configuration Service instance
     */
    private String status;

    /**
     * Creates an instance of ConfigurationServiceInstance class.
     */
    public ConfigurationServiceInstance() {
    }

    /**
     * Get the name property: Name of the Application Configuration Service instance.
     * 
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Get the status property: Status of the Application Configuration Service instance.
     * 
     * @return the status value.
     */
    public String status() {
        return this.status;
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
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ConfigurationServiceInstance from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ConfigurationServiceInstance if the JsonReader was pointing to an instance of it, or null
     * if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the ConfigurationServiceInstance.
     */
    public static ConfigurationServiceInstance fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ConfigurationServiceInstance deserializedConfigurationServiceInstance = new ConfigurationServiceInstance();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("name".equals(fieldName)) {
                    deserializedConfigurationServiceInstance.name = reader.getString();
                } else if ("status".equals(fieldName)) {
                    deserializedConfigurationServiceInstance.status = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedConfigurationServiceInstance;
        });
    }
}
