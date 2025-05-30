// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * VMwareCbt container mapping input.
 */
@Fluent
public final class VMwareCbtContainerMappingInput extends ReplicationProviderSpecificContainerMappingInput {
    /*
     * The class type.
     */
    private String instanceType = "VMwareCbt";

    /*
     * The target key vault ARM Id.
     */
    private String keyVaultId;

    /*
     * The target key vault URL.
     */
    private String keyVaultUri;

    /*
     * The storage account ARM Id.
     */
    private String storageAccountId;

    /*
     * The secret name of the storage account.
     */
    private String storageAccountSasSecretName;

    /*
     * The secret name of the service bus connection string.
     */
    private String serviceBusConnectionStringSecretName;

    /*
     * The target location.
     */
    private String targetLocation;

    /**
     * Creates an instance of VMwareCbtContainerMappingInput class.
     */
    public VMwareCbtContainerMappingInput() {
    }

    /**
     * Get the instanceType property: The class type.
     * 
     * @return the instanceType value.
     */
    @Override
    public String instanceType() {
        return this.instanceType;
    }

    /**
     * Get the keyVaultId property: The target key vault ARM Id.
     * 
     * @return the keyVaultId value.
     */
    public String keyVaultId() {
        return this.keyVaultId;
    }

    /**
     * Set the keyVaultId property: The target key vault ARM Id.
     * 
     * @param keyVaultId the keyVaultId value to set.
     * @return the VMwareCbtContainerMappingInput object itself.
     */
    public VMwareCbtContainerMappingInput withKeyVaultId(String keyVaultId) {
        this.keyVaultId = keyVaultId;
        return this;
    }

    /**
     * Get the keyVaultUri property: The target key vault URL.
     * 
     * @return the keyVaultUri value.
     */
    public String keyVaultUri() {
        return this.keyVaultUri;
    }

    /**
     * Set the keyVaultUri property: The target key vault URL.
     * 
     * @param keyVaultUri the keyVaultUri value to set.
     * @return the VMwareCbtContainerMappingInput object itself.
     */
    public VMwareCbtContainerMappingInput withKeyVaultUri(String keyVaultUri) {
        this.keyVaultUri = keyVaultUri;
        return this;
    }

    /**
     * Get the storageAccountId property: The storage account ARM Id.
     * 
     * @return the storageAccountId value.
     */
    public String storageAccountId() {
        return this.storageAccountId;
    }

    /**
     * Set the storageAccountId property: The storage account ARM Id.
     * 
     * @param storageAccountId the storageAccountId value to set.
     * @return the VMwareCbtContainerMappingInput object itself.
     */
    public VMwareCbtContainerMappingInput withStorageAccountId(String storageAccountId) {
        this.storageAccountId = storageAccountId;
        return this;
    }

    /**
     * Get the storageAccountSasSecretName property: The secret name of the storage account.
     * 
     * @return the storageAccountSasSecretName value.
     */
    public String storageAccountSasSecretName() {
        return this.storageAccountSasSecretName;
    }

    /**
     * Set the storageAccountSasSecretName property: The secret name of the storage account.
     * 
     * @param storageAccountSasSecretName the storageAccountSasSecretName value to set.
     * @return the VMwareCbtContainerMappingInput object itself.
     */
    public VMwareCbtContainerMappingInput withStorageAccountSasSecretName(String storageAccountSasSecretName) {
        this.storageAccountSasSecretName = storageAccountSasSecretName;
        return this;
    }

    /**
     * Get the serviceBusConnectionStringSecretName property: The secret name of the service bus connection string.
     * 
     * @return the serviceBusConnectionStringSecretName value.
     */
    public String serviceBusConnectionStringSecretName() {
        return this.serviceBusConnectionStringSecretName;
    }

    /**
     * Set the serviceBusConnectionStringSecretName property: The secret name of the service bus connection string.
     * 
     * @param serviceBusConnectionStringSecretName the serviceBusConnectionStringSecretName value to set.
     * @return the VMwareCbtContainerMappingInput object itself.
     */
    public VMwareCbtContainerMappingInput
        withServiceBusConnectionStringSecretName(String serviceBusConnectionStringSecretName) {
        this.serviceBusConnectionStringSecretName = serviceBusConnectionStringSecretName;
        return this;
    }

    /**
     * Get the targetLocation property: The target location.
     * 
     * @return the targetLocation value.
     */
    public String targetLocation() {
        return this.targetLocation;
    }

    /**
     * Set the targetLocation property: The target location.
     * 
     * @param targetLocation the targetLocation value to set.
     * @return the VMwareCbtContainerMappingInput object itself.
     */
    public VMwareCbtContainerMappingInput withTargetLocation(String targetLocation) {
        this.targetLocation = targetLocation;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        if (storageAccountId() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property storageAccountId in model VMwareCbtContainerMappingInput"));
        }
        if (targetLocation() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property targetLocation in model VMwareCbtContainerMappingInput"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(VMwareCbtContainerMappingInput.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("storageAccountId", this.storageAccountId);
        jsonWriter.writeStringField("targetLocation", this.targetLocation);
        jsonWriter.writeStringField("instanceType", this.instanceType);
        jsonWriter.writeStringField("keyVaultId", this.keyVaultId);
        jsonWriter.writeStringField("keyVaultUri", this.keyVaultUri);
        jsonWriter.writeStringField("storageAccountSasSecretName", this.storageAccountSasSecretName);
        jsonWriter.writeStringField("serviceBusConnectionStringSecretName", this.serviceBusConnectionStringSecretName);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of VMwareCbtContainerMappingInput from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of VMwareCbtContainerMappingInput if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the VMwareCbtContainerMappingInput.
     */
    public static VMwareCbtContainerMappingInput fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            VMwareCbtContainerMappingInput deserializedVMwareCbtContainerMappingInput
                = new VMwareCbtContainerMappingInput();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("storageAccountId".equals(fieldName)) {
                    deserializedVMwareCbtContainerMappingInput.storageAccountId = reader.getString();
                } else if ("targetLocation".equals(fieldName)) {
                    deserializedVMwareCbtContainerMappingInput.targetLocation = reader.getString();
                } else if ("instanceType".equals(fieldName)) {
                    deserializedVMwareCbtContainerMappingInput.instanceType = reader.getString();
                } else if ("keyVaultId".equals(fieldName)) {
                    deserializedVMwareCbtContainerMappingInput.keyVaultId = reader.getString();
                } else if ("keyVaultUri".equals(fieldName)) {
                    deserializedVMwareCbtContainerMappingInput.keyVaultUri = reader.getString();
                } else if ("storageAccountSasSecretName".equals(fieldName)) {
                    deserializedVMwareCbtContainerMappingInput.storageAccountSasSecretName = reader.getString();
                } else if ("serviceBusConnectionStringSecretName".equals(fieldName)) {
                    deserializedVMwareCbtContainerMappingInput.serviceBusConnectionStringSecretName
                        = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedVMwareCbtContainerMappingInput;
        });
    }
}
