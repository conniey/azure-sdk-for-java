// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datamigration.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.datamigration.models.ServiceProvisioningState;
import java.io.IOException;

/**
 * Properties of the Data Migration service instance.
 */
@Fluent
public final class DataMigrationServiceProperties implements JsonSerializable<DataMigrationServiceProperties> {
    /*
     * The resource's provisioning state
     */
    private ServiceProvisioningState provisioningState;

    /*
     * The public key of the service, used to encrypt secrets sent to the service
     */
    private String publicKey;

    /*
     * The ID of the Microsoft.Network/virtualNetworks/subnets resource to which the service should be joined
     */
    private String virtualSubnetId;

    /**
     * Creates an instance of DataMigrationServiceProperties class.
     */
    public DataMigrationServiceProperties() {
    }

    /**
     * Get the provisioningState property: The resource's provisioning state.
     * 
     * @return the provisioningState value.
     */
    public ServiceProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the publicKey property: The public key of the service, used to encrypt secrets sent to the service.
     * 
     * @return the publicKey value.
     */
    public String publicKey() {
        return this.publicKey;
    }

    /**
     * Set the publicKey property: The public key of the service, used to encrypt secrets sent to the service.
     * 
     * @param publicKey the publicKey value to set.
     * @return the DataMigrationServiceProperties object itself.
     */
    public DataMigrationServiceProperties withPublicKey(String publicKey) {
        this.publicKey = publicKey;
        return this;
    }

    /**
     * Get the virtualSubnetId property: The ID of the Microsoft.Network/virtualNetworks/subnets resource to which the
     * service should be joined.
     * 
     * @return the virtualSubnetId value.
     */
    public String virtualSubnetId() {
        return this.virtualSubnetId;
    }

    /**
     * Set the virtualSubnetId property: The ID of the Microsoft.Network/virtualNetworks/subnets resource to which the
     * service should be joined.
     * 
     * @param virtualSubnetId the virtualSubnetId value to set.
     * @return the DataMigrationServiceProperties object itself.
     */
    public DataMigrationServiceProperties withVirtualSubnetId(String virtualSubnetId) {
        this.virtualSubnetId = virtualSubnetId;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (virtualSubnetId() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property virtualSubnetId in model DataMigrationServiceProperties"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(DataMigrationServiceProperties.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("virtualSubnetId", this.virtualSubnetId);
        jsonWriter.writeStringField("publicKey", this.publicKey);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of DataMigrationServiceProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of DataMigrationServiceProperties if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the DataMigrationServiceProperties.
     */
    public static DataMigrationServiceProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            DataMigrationServiceProperties deserializedDataMigrationServiceProperties
                = new DataMigrationServiceProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("virtualSubnetId".equals(fieldName)) {
                    deserializedDataMigrationServiceProperties.virtualSubnetId = reader.getString();
                } else if ("provisioningState".equals(fieldName)) {
                    deserializedDataMigrationServiceProperties.provisioningState
                        = ServiceProvisioningState.fromString(reader.getString());
                } else if ("publicKey".equals(fieldName)) {
                    deserializedDataMigrationServiceProperties.publicKey = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedDataMigrationServiceProperties;
        });
    }
}
