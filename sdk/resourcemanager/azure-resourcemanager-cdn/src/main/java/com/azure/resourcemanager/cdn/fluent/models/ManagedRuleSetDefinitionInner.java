// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cdn.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.core.management.SystemData;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.cdn.models.ManagedRuleGroupDefinition;
import com.azure.resourcemanager.cdn.models.Sku;
import java.io.IOException;
import java.util.List;

/**
 * Describes a managed rule set definition.
 */
@Fluent
public final class ManagedRuleSetDefinitionInner extends ProxyResource {
    /*
     * Describes managed rule set definition properties.
     */
    private ManagedRuleSetDefinitionProperties innerProperties;

    /*
     * The pricing tier (defines a CDN provider, feature list and rate) of the CdnWebApplicationFirewallPolicy.
     */
    private Sku sku;

    /*
     * Read only system data
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
     * Creates an instance of ManagedRuleSetDefinitionInner class.
     */
    public ManagedRuleSetDefinitionInner() {
    }

    /**
     * Get the innerProperties property: Describes managed rule set definition properties.
     * 
     * @return the innerProperties value.
     */
    private ManagedRuleSetDefinitionProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the sku property: The pricing tier (defines a CDN provider, feature list and rate) of the
     * CdnWebApplicationFirewallPolicy.
     * 
     * @return the sku value.
     */
    public Sku sku() {
        return this.sku;
    }

    /**
     * Set the sku property: The pricing tier (defines a CDN provider, feature list and rate) of the
     * CdnWebApplicationFirewallPolicy.
     * 
     * @param sku the sku value to set.
     * @return the ManagedRuleSetDefinitionInner object itself.
     */
    public ManagedRuleSetDefinitionInner withSku(Sku sku) {
        this.sku = sku;
        return this;
    }

    /**
     * Get the systemData property: Read only system data.
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
     * Get the provisioningState property: Provisioning state of the managed rule set.
     * 
     * @return the provisioningState value.
     */
    public String provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Get the ruleSetType property: Type of the managed rule set.
     * 
     * @return the ruleSetType value.
     */
    public String ruleSetType() {
        return this.innerProperties() == null ? null : this.innerProperties().ruleSetType();
    }

    /**
     * Get the ruleSetVersion property: Version of the managed rule set type.
     * 
     * @return the ruleSetVersion value.
     */
    public String ruleSetVersion() {
        return this.innerProperties() == null ? null : this.innerProperties().ruleSetVersion();
    }

    /**
     * Get the ruleGroups property: Rule groups of the managed rule set.
     * 
     * @return the ruleGroups value.
     */
    public List<ManagedRuleGroupDefinition> ruleGroups() {
        return this.innerProperties() == null ? null : this.innerProperties().ruleGroups();
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
        if (sku() != null) {
            sku().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeJsonField("properties", this.innerProperties);
        jsonWriter.writeJsonField("sku", this.sku);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ManagedRuleSetDefinitionInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ManagedRuleSetDefinitionInner if the JsonReader was pointing to an instance of it, or null
     * if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the ManagedRuleSetDefinitionInner.
     */
    public static ManagedRuleSetDefinitionInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ManagedRuleSetDefinitionInner deserializedManagedRuleSetDefinitionInner
                = new ManagedRuleSetDefinitionInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedManagedRuleSetDefinitionInner.id = reader.getString();
                } else if ("name".equals(fieldName)) {
                    deserializedManagedRuleSetDefinitionInner.name = reader.getString();
                } else if ("type".equals(fieldName)) {
                    deserializedManagedRuleSetDefinitionInner.type = reader.getString();
                } else if ("properties".equals(fieldName)) {
                    deserializedManagedRuleSetDefinitionInner.innerProperties
                        = ManagedRuleSetDefinitionProperties.fromJson(reader);
                } else if ("sku".equals(fieldName)) {
                    deserializedManagedRuleSetDefinitionInner.sku = Sku.fromJson(reader);
                } else if ("systemData".equals(fieldName)) {
                    deserializedManagedRuleSetDefinitionInner.systemData = SystemData.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedManagedRuleSetDefinitionInner;
        });
    }
}
