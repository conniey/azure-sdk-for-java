// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * The alert sync setting properties.
 */
@Fluent
public final class AlertSyncSettingProperties implements JsonSerializable<AlertSyncSettingProperties> {
    /*
     * Is the alert sync setting enabled
     */
    private boolean enabled;

    /**
     * Creates an instance of AlertSyncSettingProperties class.
     */
    public AlertSyncSettingProperties() {
    }

    /**
     * Get the enabled property: Is the alert sync setting enabled.
     * 
     * @return the enabled value.
     */
    public boolean enabled() {
        return this.enabled;
    }

    /**
     * Set the enabled property: Is the alert sync setting enabled.
     * 
     * @param enabled the enabled value to set.
     * @return the AlertSyncSettingProperties object itself.
     */
    public AlertSyncSettingProperties withEnabled(boolean enabled) {
        this.enabled = enabled;
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
        jsonWriter.writeBooleanField("enabled", this.enabled);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of AlertSyncSettingProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of AlertSyncSettingProperties if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the AlertSyncSettingProperties.
     */
    public static AlertSyncSettingProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            AlertSyncSettingProperties deserializedAlertSyncSettingProperties = new AlertSyncSettingProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("enabled".equals(fieldName)) {
                    deserializedAlertSyncSettingProperties.enabled = reader.getBoolean();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedAlertSyncSettingProperties;
        });
    }
}
