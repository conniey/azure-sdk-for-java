// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * Backend pool information.
 */
@Fluent
public class BackendPool implements JsonSerializable<BackendPool> {
    /*
     * The list of backend entities belonging to a pool.
     */
    private List<BackendPoolItem> services;

    /**
     * Creates an instance of BackendPool class.
     */
    public BackendPool() {
    }

    /**
     * Get the services property: The list of backend entities belonging to a pool.
     * 
     * @return the services value.
     */
    public List<BackendPoolItem> services() {
        return this.services;
    }

    /**
     * Set the services property: The list of backend entities belonging to a pool.
     * 
     * @param services the services value to set.
     * @return the BackendPool object itself.
     */
    public BackendPool withServices(List<BackendPoolItem> services) {
        this.services = services;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (services() != null) {
            services().forEach(e -> e.validate());
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeArrayField("services", this.services, (writer, element) -> writer.writeJson(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of BackendPool from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of BackendPool if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the BackendPool.
     */
    public static BackendPool fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            BackendPool deserializedBackendPool = new BackendPool();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("services".equals(fieldName)) {
                    List<BackendPoolItem> services = reader.readArray(reader1 -> BackendPoolItem.fromJson(reader1));
                    deserializedBackendPool.services = services;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedBackendPool;
        });
    }
}
