// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.workloads.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * SSH configuration for Linux based VMs running on Azure.
 */
@Fluent
public final class SshConfiguration implements JsonSerializable<SshConfiguration> {
    /*
     * The list of SSH public keys used to authenticate with linux based VMs.
     */
    private List<SshPublicKey> publicKeys;

    /**
     * Creates an instance of SshConfiguration class.
     */
    public SshConfiguration() {
    }

    /**
     * Get the publicKeys property: The list of SSH public keys used to authenticate with linux based VMs.
     * 
     * @return the publicKeys value.
     */
    public List<SshPublicKey> publicKeys() {
        return this.publicKeys;
    }

    /**
     * Set the publicKeys property: The list of SSH public keys used to authenticate with linux based VMs.
     * 
     * @param publicKeys the publicKeys value to set.
     * @return the SshConfiguration object itself.
     */
    public SshConfiguration withPublicKeys(List<SshPublicKey> publicKeys) {
        this.publicKeys = publicKeys;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (publicKeys() != null) {
            publicKeys().forEach(e -> e.validate());
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeArrayField("publicKeys", this.publicKeys, (writer, element) -> writer.writeJson(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of SshConfiguration from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of SshConfiguration if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the SshConfiguration.
     */
    public static SshConfiguration fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            SshConfiguration deserializedSshConfiguration = new SshConfiguration();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("publicKeys".equals(fieldName)) {
                    List<SshPublicKey> publicKeys = reader.readArray(reader1 -> SshPublicKey.fromJson(reader1));
                    deserializedSshConfiguration.publicKeys = publicKeys;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedSshConfiguration;
        });
    }
}
