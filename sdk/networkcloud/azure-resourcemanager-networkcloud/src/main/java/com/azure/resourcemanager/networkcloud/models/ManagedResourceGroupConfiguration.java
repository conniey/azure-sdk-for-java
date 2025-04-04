// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.networkcloud.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * ManagedResourceGroupConfiguration represents the configuration of the resource group managed by Azure.
 */
@Fluent
public final class ManagedResourceGroupConfiguration implements JsonSerializable<ManagedResourceGroupConfiguration> {
    /*
     * The location of the managed resource group. If not specified, the location of the parent resource is chosen.
     */
    private String location;

    /*
     * The name for the managed resource group. If not specified, the unique name is automatically generated.
     */
    private String name;

    /**
     * Creates an instance of ManagedResourceGroupConfiguration class.
     */
    public ManagedResourceGroupConfiguration() {
    }

    /**
     * Get the location property: The location of the managed resource group. If not specified, the location of the
     * parent resource is chosen.
     * 
     * @return the location value.
     */
    public String location() {
        return this.location;
    }

    /**
     * Set the location property: The location of the managed resource group. If not specified, the location of the
     * parent resource is chosen.
     * 
     * @param location the location value to set.
     * @return the ManagedResourceGroupConfiguration object itself.
     */
    public ManagedResourceGroupConfiguration withLocation(String location) {
        this.location = location;
        return this;
    }

    /**
     * Get the name property: The name for the managed resource group. If not specified, the unique name is
     * automatically generated.
     * 
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The name for the managed resource group. If not specified, the unique name is
     * automatically generated.
     * 
     * @param name the name value to set.
     * @return the ManagedResourceGroupConfiguration object itself.
     */
    public ManagedResourceGroupConfiguration withName(String name) {
        this.name = name;
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
        jsonWriter.writeStringField("location", this.location);
        jsonWriter.writeStringField("name", this.name);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ManagedResourceGroupConfiguration from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ManagedResourceGroupConfiguration if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the ManagedResourceGroupConfiguration.
     */
    public static ManagedResourceGroupConfiguration fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ManagedResourceGroupConfiguration deserializedManagedResourceGroupConfiguration
                = new ManagedResourceGroupConfiguration();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("location".equals(fieldName)) {
                    deserializedManagedResourceGroupConfiguration.location = reader.getString();
                } else if ("name".equals(fieldName)) {
                    deserializedManagedResourceGroupConfiguration.name = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedManagedResourceGroupConfiguration;
        });
    }
}
