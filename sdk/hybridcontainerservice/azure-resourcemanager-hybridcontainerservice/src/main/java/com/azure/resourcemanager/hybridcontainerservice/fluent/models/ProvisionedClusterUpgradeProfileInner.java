// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridcontainerservice.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.core.management.SystemData;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.hybridcontainerservice.models.ProvisionedClusterUpgradeProfileProperties;
import java.io.IOException;

/**
 * The list of available kubernetes version upgrades for the provisioned cluster.
 */
@Fluent
public final class ProvisionedClusterUpgradeProfileInner extends ProxyResource {
    /*
     * The properties of the upgrade profile.
     */
    private ProvisionedClusterUpgradeProfileProperties properties;

    /*
     * Azure Resource Manager metadata containing createdBy and modifiedBy information.
     */
    private SystemData systemData;

    /*
     * The type of the resource.
     */
    private String type;

    /*
     * The name of the resource.
     */
    private String name;

    /*
     * Fully qualified resource Id for the resource.
     */
    private String id;

    /**
     * Creates an instance of ProvisionedClusterUpgradeProfileInner class.
     */
    public ProvisionedClusterUpgradeProfileInner() {
    }

    /**
     * Get the properties property: The properties of the upgrade profile.
     * 
     * @return the properties value.
     */
    public ProvisionedClusterUpgradeProfileProperties properties() {
        return this.properties;
    }

    /**
     * Set the properties property: The properties of the upgrade profile.
     * 
     * @param properties the properties value to set.
     * @return the ProvisionedClusterUpgradeProfileInner object itself.
     */
    public ProvisionedClusterUpgradeProfileInner withProperties(ProvisionedClusterUpgradeProfileProperties properties) {
        this.properties = properties;
        return this;
    }

    /**
     * Get the systemData property: Azure Resource Manager metadata containing createdBy and modifiedBy information.
     * 
     * @return the systemData value.
     */
    public SystemData systemData() {
        return this.systemData;
    }

    /**
     * Get the type property: The type of the resource.
     * 
     * @return the type value.
     */
    @Override
    public String type() {
        return this.type;
    }

    /**
     * Get the name property: The name of the resource.
     * 
     * @return the name value.
     */
    @Override
    public String name() {
        return this.name;
    }

    /**
     * Get the id property: Fully qualified resource Id for the resource.
     * 
     * @return the id value.
     */
    @Override
    public String id() {
        return this.id;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (properties() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property properties in model ProvisionedClusterUpgradeProfileInner"));
        } else {
            properties().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(ProvisionedClusterUpgradeProfileInner.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeJsonField("properties", this.properties);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ProvisionedClusterUpgradeProfileInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ProvisionedClusterUpgradeProfileInner if the JsonReader was pointing to an instance of it,
     * or null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the ProvisionedClusterUpgradeProfileInner.
     */
    public static ProvisionedClusterUpgradeProfileInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ProvisionedClusterUpgradeProfileInner deserializedProvisionedClusterUpgradeProfileInner
                = new ProvisionedClusterUpgradeProfileInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedProvisionedClusterUpgradeProfileInner.id = reader.getString();
                } else if ("name".equals(fieldName)) {
                    deserializedProvisionedClusterUpgradeProfileInner.name = reader.getString();
                } else if ("type".equals(fieldName)) {
                    deserializedProvisionedClusterUpgradeProfileInner.type = reader.getString();
                } else if ("properties".equals(fieldName)) {
                    deserializedProvisionedClusterUpgradeProfileInner.properties
                        = ProvisionedClusterUpgradeProfileProperties.fromJson(reader);
                } else if ("systemData".equals(fieldName)) {
                    deserializedProvisionedClusterUpgradeProfileInner.systemData = SystemData.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedProvisionedClusterUpgradeProfileInner;
        });
    }
}
