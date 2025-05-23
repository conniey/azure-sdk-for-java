// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.apimanagement.models.PolicyFragmentContentFormat;
import java.io.IOException;

/**
 * Policy fragment contract details.
 */
@Fluent
public final class PolicyFragmentContractInner extends ProxyResource {
    /*
     * Properties of the Policy Fragment.
     */
    private PolicyFragmentContractProperties innerProperties;

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
     * Creates an instance of PolicyFragmentContractInner class.
     */
    public PolicyFragmentContractInner() {
    }

    /**
     * Get the innerProperties property: Properties of the Policy Fragment.
     * 
     * @return the innerProperties value.
     */
    private PolicyFragmentContractProperties innerProperties() {
        return this.innerProperties;
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
     * Get the value property: Contents of the policy fragment.
     * 
     * @return the value value.
     */
    public String value() {
        return this.innerProperties() == null ? null : this.innerProperties().value();
    }

    /**
     * Set the value property: Contents of the policy fragment.
     * 
     * @param value the value value to set.
     * @return the PolicyFragmentContractInner object itself.
     */
    public PolicyFragmentContractInner withValue(String value) {
        if (this.innerProperties() == null) {
            this.innerProperties = new PolicyFragmentContractProperties();
        }
        this.innerProperties().withValue(value);
        return this;
    }

    /**
     * Get the description property: Policy fragment description.
     * 
     * @return the description value.
     */
    public String description() {
        return this.innerProperties() == null ? null : this.innerProperties().description();
    }

    /**
     * Set the description property: Policy fragment description.
     * 
     * @param description the description value to set.
     * @return the PolicyFragmentContractInner object itself.
     */
    public PolicyFragmentContractInner withDescription(String description) {
        if (this.innerProperties() == null) {
            this.innerProperties = new PolicyFragmentContractProperties();
        }
        this.innerProperties().withDescription(description);
        return this;
    }

    /**
     * Get the format property: Format of the policy fragment content.
     * 
     * @return the format value.
     */
    public PolicyFragmentContentFormat format() {
        return this.innerProperties() == null ? null : this.innerProperties().format();
    }

    /**
     * Set the format property: Format of the policy fragment content.
     * 
     * @param format the format value to set.
     * @return the PolicyFragmentContractInner object itself.
     */
    public PolicyFragmentContractInner withFormat(PolicyFragmentContentFormat format) {
        if (this.innerProperties() == null) {
            this.innerProperties = new PolicyFragmentContractProperties();
        }
        this.innerProperties().withFormat(format);
        return this;
    }

    /**
     * Get the provisioningState property: The provisioning state.
     * 
     * @return the provisioningState value.
     */
    public String provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
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
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeJsonField("properties", this.innerProperties);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of PolicyFragmentContractInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of PolicyFragmentContractInner if the JsonReader was pointing to an instance of it, or null
     * if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the PolicyFragmentContractInner.
     */
    public static PolicyFragmentContractInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            PolicyFragmentContractInner deserializedPolicyFragmentContractInner = new PolicyFragmentContractInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedPolicyFragmentContractInner.id = reader.getString();
                } else if ("name".equals(fieldName)) {
                    deserializedPolicyFragmentContractInner.name = reader.getString();
                } else if ("type".equals(fieldName)) {
                    deserializedPolicyFragmentContractInner.type = reader.getString();
                } else if ("properties".equals(fieldName)) {
                    deserializedPolicyFragmentContractInner.innerProperties
                        = PolicyFragmentContractProperties.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedPolicyFragmentContractInner;
        });
    }
}
