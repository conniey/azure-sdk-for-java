// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.TargetComputeSizeProperties;
import java.io.IOException;

/**
 * Represents applicable recovery vm sizes.
 */
@Fluent
public final class TargetComputeSizeInner implements JsonSerializable<TargetComputeSizeInner> {
    /*
     * The Id.
     */
    private String id;

    /*
     * The name.
     */
    private String name;

    /*
     * The Type of the object.
     */
    private String type;

    /*
     * The custom data.
     */
    private TargetComputeSizeProperties properties;

    /**
     * Creates an instance of TargetComputeSizeInner class.
     */
    public TargetComputeSizeInner() {
    }

    /**
     * Get the id property: The Id.
     * 
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id property: The Id.
     * 
     * @param id the id value to set.
     * @return the TargetComputeSizeInner object itself.
     */
    public TargetComputeSizeInner withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the name property: The name.
     * 
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The name.
     * 
     * @param name the name value to set.
     * @return the TargetComputeSizeInner object itself.
     */
    public TargetComputeSizeInner withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the type property: The Type of the object.
     * 
     * @return the type value.
     */
    public String type() {
        return this.type;
    }

    /**
     * Set the type property: The Type of the object.
     * 
     * @param type the type value to set.
     * @return the TargetComputeSizeInner object itself.
     */
    public TargetComputeSizeInner withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Get the properties property: The custom data.
     * 
     * @return the properties value.
     */
    public TargetComputeSizeProperties properties() {
        return this.properties;
    }

    /**
     * Set the properties property: The custom data.
     * 
     * @param properties the properties value to set.
     * @return the TargetComputeSizeInner object itself.
     */
    public TargetComputeSizeInner withProperties(TargetComputeSizeProperties properties) {
        this.properties = properties;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (properties() != null) {
            properties().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("id", this.id);
        jsonWriter.writeStringField("name", this.name);
        jsonWriter.writeStringField("type", this.type);
        jsonWriter.writeJsonField("properties", this.properties);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of TargetComputeSizeInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of TargetComputeSizeInner if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IOException If an error occurs while reading the TargetComputeSizeInner.
     */
    public static TargetComputeSizeInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            TargetComputeSizeInner deserializedTargetComputeSizeInner = new TargetComputeSizeInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedTargetComputeSizeInner.id = reader.getString();
                } else if ("name".equals(fieldName)) {
                    deserializedTargetComputeSizeInner.name = reader.getString();
                } else if ("type".equals(fieldName)) {
                    deserializedTargetComputeSizeInner.type = reader.getString();
                } else if ("properties".equals(fieldName)) {
                    deserializedTargetComputeSizeInner.properties = TargetComputeSizeProperties.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedTargetComputeSizeInner;
        });
    }
}
