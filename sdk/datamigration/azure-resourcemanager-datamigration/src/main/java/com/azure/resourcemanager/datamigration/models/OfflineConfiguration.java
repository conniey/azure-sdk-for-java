// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datamigration.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Offline configuration.
 */
@Fluent
public final class OfflineConfiguration implements JsonSerializable<OfflineConfiguration> {
    /*
     * Offline migration
     */
    private Boolean offline;

    /*
     * Last backup name for offline migration. This is optional for migrations from file share. If it is not provided,
     * then the service will determine the last backup file name based on latest backup files present in file share.
     */
    private String lastBackupName;

    /**
     * Creates an instance of OfflineConfiguration class.
     */
    public OfflineConfiguration() {
    }

    /**
     * Get the offline property: Offline migration.
     * 
     * @return the offline value.
     */
    public Boolean offline() {
        return this.offline;
    }

    /**
     * Set the offline property: Offline migration.
     * 
     * @param offline the offline value to set.
     * @return the OfflineConfiguration object itself.
     */
    public OfflineConfiguration withOffline(Boolean offline) {
        this.offline = offline;
        return this;
    }

    /**
     * Get the lastBackupName property: Last backup name for offline migration. This is optional for migrations from
     * file share. If it is not provided, then the service will determine the last backup file name based on latest
     * backup files present in file share.
     * 
     * @return the lastBackupName value.
     */
    public String lastBackupName() {
        return this.lastBackupName;
    }

    /**
     * Set the lastBackupName property: Last backup name for offline migration. This is optional for migrations from
     * file share. If it is not provided, then the service will determine the last backup file name based on latest
     * backup files present in file share.
     * 
     * @param lastBackupName the lastBackupName value to set.
     * @return the OfflineConfiguration object itself.
     */
    public OfflineConfiguration withLastBackupName(String lastBackupName) {
        this.lastBackupName = lastBackupName;
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
        jsonWriter.writeBooleanField("offline", this.offline);
        jsonWriter.writeStringField("lastBackupName", this.lastBackupName);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of OfflineConfiguration from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of OfflineConfiguration if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IOException If an error occurs while reading the OfflineConfiguration.
     */
    public static OfflineConfiguration fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            OfflineConfiguration deserializedOfflineConfiguration = new OfflineConfiguration();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("offline".equals(fieldName)) {
                    deserializedOfflineConfiguration.offline = reader.getNullable(JsonReader::getBoolean);
                } else if ("lastBackupName".equals(fieldName)) {
                    deserializedOfflineConfiguration.lastBackupName = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedOfflineConfiguration;
        });
    }
}
