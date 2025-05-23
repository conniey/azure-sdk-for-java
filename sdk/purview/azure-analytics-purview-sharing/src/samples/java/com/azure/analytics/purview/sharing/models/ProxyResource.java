// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.purview.sharing.models;

import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;

import java.io.IOException;

/**
 * Base data transfer object implementation for proxy resources.
 */
@Immutable
public class ProxyResource implements JsonSerializable<ProxyResource> {
    /*
     * The unique id of the resource.
     */
    private String id;

    /*
     * Type of the resource.
     */
    private String type;

    /**
     * Creates an instance of ProxyResource class.
     */
    public ProxyResource() {
    }

    /**
     * Get the id property: The unique id of the resource.
     *
     * @return the id value.
     */
    public String getId() {
        return this.id;
    }

    /**
     * Set the id property: The unique id of the resource.
     *
     * @param id the id value to set.
     * @return the ProxyResource object itself.
     */
    ProxyResource setId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the type property: Type of the resource.
     *
     * @return the type value.
     */
    public String getType() {
        return this.type;
    }

    /**
     * Set the type property: Type of the resource.
     *
     * @param type the type value to set.
     * @return the ProxyResource object itself.
     */
    ProxyResource setType(String type) {
        this.type = type;
        return this;
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
     * Reads an instance of ProxyResource from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of ProxyResource if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the ProxyResource.
     */
    public static ProxyResource fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ProxyResource deserializedProxyResource = new ProxyResource();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedProxyResource.id = reader.getString();
                } else if ("type".equals(fieldName)) {
                    deserializedProxyResource.type = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedProxyResource;
        });
    }
}
