// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcontainers.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Optional settings for a Managed Identity that is assigned to the Container App.
 */
@Fluent
public final class IdentitySettings implements JsonSerializable<IdentitySettings> {
    /*
     * The resource ID of a user-assigned managed identity that is assigned to the Container App, or 'system' for
     * system-assigned identity.
     */
    private String identity;

    /*
     * Use to select the lifecycle stages of a Container App during which the Managed Identity should be available.
     */
    private IdentitySettingsLifeCycle lifecycle;

    /**
     * Creates an instance of IdentitySettings class.
     */
    public IdentitySettings() {
    }

    /**
     * Get the identity property: The resource ID of a user-assigned managed identity that is assigned to the Container
     * App, or 'system' for system-assigned identity.
     * 
     * @return the identity value.
     */
    public String identity() {
        return this.identity;
    }

    /**
     * Set the identity property: The resource ID of a user-assigned managed identity that is assigned to the Container
     * App, or 'system' for system-assigned identity.
     * 
     * @param identity the identity value to set.
     * @return the IdentitySettings object itself.
     */
    public IdentitySettings withIdentity(String identity) {
        this.identity = identity;
        return this;
    }

    /**
     * Get the lifecycle property: Use to select the lifecycle stages of a Container App during which the Managed
     * Identity should be available.
     * 
     * @return the lifecycle value.
     */
    public IdentitySettingsLifeCycle lifecycle() {
        return this.lifecycle;
    }

    /**
     * Set the lifecycle property: Use to select the lifecycle stages of a Container App during which the Managed
     * Identity should be available.
     * 
     * @param lifecycle the lifecycle value to set.
     * @return the IdentitySettings object itself.
     */
    public IdentitySettings withLifecycle(IdentitySettingsLifeCycle lifecycle) {
        this.lifecycle = lifecycle;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (identity() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException("Missing required property identity in model IdentitySettings"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(IdentitySettings.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("identity", this.identity);
        jsonWriter.writeStringField("lifecycle", this.lifecycle == null ? null : this.lifecycle.toString());
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of IdentitySettings from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of IdentitySettings if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the IdentitySettings.
     */
    public static IdentitySettings fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            IdentitySettings deserializedIdentitySettings = new IdentitySettings();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("identity".equals(fieldName)) {
                    deserializedIdentitySettings.identity = reader.getString();
                } else if ("lifecycle".equals(fieldName)) {
                    deserializedIdentitySettings.lifecycle = IdentitySettingsLifeCycle.fromString(reader.getString());
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedIdentitySettings;
        });
    }
}
