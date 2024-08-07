// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.network.models.IpAllocationMethod;
import com.azure.resourcemanager.network.models.ProvisioningState;
import java.io.IOException;

/**
 * Properties of IP configuration.
 */
@Fluent
public final class IpConfigurationPropertiesFormatInner
    implements JsonSerializable<IpConfigurationPropertiesFormatInner> {
    /*
     * The private IP address of the IP configuration.
     */
    private String privateIpAddress;

    /*
     * The private IP address allocation method.
     */
    private IpAllocationMethod privateIpAllocationMethod;

    /*
     * The reference to the subnet resource.
     */
    private SubnetInner subnet;

    /*
     * The reference to the public IP resource.
     */
    private PublicIpAddressInner publicIpAddress;

    /*
     * The provisioning state of the IP configuration resource.
     */
    private ProvisioningState provisioningState;

    /**
     * Creates an instance of IpConfigurationPropertiesFormatInner class.
     */
    public IpConfigurationPropertiesFormatInner() {
    }

    /**
     * Get the privateIpAddress property: The private IP address of the IP configuration.
     * 
     * @return the privateIpAddress value.
     */
    public String privateIpAddress() {
        return this.privateIpAddress;
    }

    /**
     * Set the privateIpAddress property: The private IP address of the IP configuration.
     * 
     * @param privateIpAddress the privateIpAddress value to set.
     * @return the IpConfigurationPropertiesFormatInner object itself.
     */
    public IpConfigurationPropertiesFormatInner withPrivateIpAddress(String privateIpAddress) {
        this.privateIpAddress = privateIpAddress;
        return this;
    }

    /**
     * Get the privateIpAllocationMethod property: The private IP address allocation method.
     * 
     * @return the privateIpAllocationMethod value.
     */
    public IpAllocationMethod privateIpAllocationMethod() {
        return this.privateIpAllocationMethod;
    }

    /**
     * Set the privateIpAllocationMethod property: The private IP address allocation method.
     * 
     * @param privateIpAllocationMethod the privateIpAllocationMethod value to set.
     * @return the IpConfigurationPropertiesFormatInner object itself.
     */
    public IpConfigurationPropertiesFormatInner
        withPrivateIpAllocationMethod(IpAllocationMethod privateIpAllocationMethod) {
        this.privateIpAllocationMethod = privateIpAllocationMethod;
        return this;
    }

    /**
     * Get the subnet property: The reference to the subnet resource.
     * 
     * @return the subnet value.
     */
    public SubnetInner subnet() {
        return this.subnet;
    }

    /**
     * Set the subnet property: The reference to the subnet resource.
     * 
     * @param subnet the subnet value to set.
     * @return the IpConfigurationPropertiesFormatInner object itself.
     */
    public IpConfigurationPropertiesFormatInner withSubnet(SubnetInner subnet) {
        this.subnet = subnet;
        return this;
    }

    /**
     * Get the publicIpAddress property: The reference to the public IP resource.
     * 
     * @return the publicIpAddress value.
     */
    public PublicIpAddressInner publicIpAddress() {
        return this.publicIpAddress;
    }

    /**
     * Set the publicIpAddress property: The reference to the public IP resource.
     * 
     * @param publicIpAddress the publicIpAddress value to set.
     * @return the IpConfigurationPropertiesFormatInner object itself.
     */
    public IpConfigurationPropertiesFormatInner withPublicIpAddress(PublicIpAddressInner publicIpAddress) {
        this.publicIpAddress = publicIpAddress;
        return this;
    }

    /**
     * Get the provisioningState property: The provisioning state of the IP configuration resource.
     * 
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (subnet() != null) {
            subnet().validate();
        }
        if (publicIpAddress() != null) {
            publicIpAddress().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("privateIPAddress", this.privateIpAddress);
        jsonWriter.writeStringField("privateIPAllocationMethod",
            this.privateIpAllocationMethod == null ? null : this.privateIpAllocationMethod.toString());
        jsonWriter.writeJsonField("subnet", this.subnet);
        jsonWriter.writeJsonField("publicIPAddress", this.publicIpAddress);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of IpConfigurationPropertiesFormatInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of IpConfigurationPropertiesFormatInner if the JsonReader was pointing to an instance of it,
     * or null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the IpConfigurationPropertiesFormatInner.
     */
    public static IpConfigurationPropertiesFormatInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            IpConfigurationPropertiesFormatInner deserializedIpConfigurationPropertiesFormatInner
                = new IpConfigurationPropertiesFormatInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("privateIPAddress".equals(fieldName)) {
                    deserializedIpConfigurationPropertiesFormatInner.privateIpAddress = reader.getString();
                } else if ("privateIPAllocationMethod".equals(fieldName)) {
                    deserializedIpConfigurationPropertiesFormatInner.privateIpAllocationMethod
                        = IpAllocationMethod.fromString(reader.getString());
                } else if ("subnet".equals(fieldName)) {
                    deserializedIpConfigurationPropertiesFormatInner.subnet = SubnetInner.fromJson(reader);
                } else if ("publicIPAddress".equals(fieldName)) {
                    deserializedIpConfigurationPropertiesFormatInner.publicIpAddress
                        = PublicIpAddressInner.fromJson(reader);
                } else if ("provisioningState".equals(fieldName)) {
                    deserializedIpConfigurationPropertiesFormatInner.provisioningState
                        = ProvisioningState.fromString(reader.getString());
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedIpConfigurationPropertiesFormatInner;
        });
    }
}
