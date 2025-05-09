// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.models;

import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Replication cluster provider specific settings.
 */
@Immutable
public class ReplicationClusterProviderSpecificSettings
    implements JsonSerializable<ReplicationClusterProviderSpecificSettings> {
    /*
     * Gets the Instance type.
     */
    private String instanceType = "ReplicationClusterProviderSpecificSettings";

    /**
     * Creates an instance of ReplicationClusterProviderSpecificSettings class.
     */
    public ReplicationClusterProviderSpecificSettings() {
    }

    /**
     * Get the instanceType property: Gets the Instance type.
     * 
     * @return the instanceType value.
     */
    public String instanceType() {
        return this.instanceType;
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
        jsonWriter.writeStringField("instanceType", this.instanceType);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ReplicationClusterProviderSpecificSettings from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ReplicationClusterProviderSpecificSettings if the JsonReader was pointing to an instance
     * of it, or null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the ReplicationClusterProviderSpecificSettings.
     */
    public static ReplicationClusterProviderSpecificSettings fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            String discriminatorValue = null;
            try (JsonReader readerToUse = reader.bufferObject()) {
                readerToUse.nextToken(); // Prepare for reading
                while (readerToUse.nextToken() != JsonToken.END_OBJECT) {
                    String fieldName = readerToUse.getFieldName();
                    readerToUse.nextToken();
                    if ("instanceType".equals(fieldName)) {
                        discriminatorValue = readerToUse.getString();
                        break;
                    } else {
                        readerToUse.skipChildren();
                    }
                }
                // Use the discriminator value to determine which subtype should be deserialized.
                if ("A2A".equals(discriminatorValue)) {
                    return A2AReplicationProtectionClusterDetails.fromJson(readerToUse.reset());
                } else {
                    return fromJsonKnownDiscriminator(readerToUse.reset());
                }
            }
        });
    }

    static ReplicationClusterProviderSpecificSettings fromJsonKnownDiscriminator(JsonReader jsonReader)
        throws IOException {
        return jsonReader.readObject(reader -> {
            ReplicationClusterProviderSpecificSettings deserializedReplicationClusterProviderSpecificSettings
                = new ReplicationClusterProviderSpecificSettings();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("instanceType".equals(fieldName)) {
                    deserializedReplicationClusterProviderSpecificSettings.instanceType = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedReplicationClusterProviderSpecificSettings;
        });
    }
}
