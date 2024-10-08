// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurestackhci.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.core.management.SystemData;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.azurestackhci.models.ComplianceAssignmentType;
import com.azure.resourcemanager.azurestackhci.models.ProvisioningState;
import com.azure.resourcemanager.azurestackhci.models.SecurityComplianceStatus;
import java.io.IOException;

/**
 * Security settings proxy resource.
 */
@Fluent
public final class SecuritySettingInner extends ProxyResource {
    /*
     * The resource-specific properties for this resource.
     */
    private SecurityProperties innerProperties;

    /*
     * Azure Resource Manager metadata containing createdBy and modifiedBy information.
     */
    private SystemData systemData;

    /*
     * Fully qualified resource Id for the resource.
     */
    private String id;

    /*
     * The name of the resource.
     */
    private String name;

    /*
     * The type of the resource.
     */
    private String type;

    /**
     * Creates an instance of SecuritySettingInner class.
     */
    public SecuritySettingInner() {
    }

    /**
     * Get the innerProperties property: The resource-specific properties for this resource.
     * 
     * @return the innerProperties value.
     */
    private SecurityProperties innerProperties() {
        return this.innerProperties;
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
     * Get the id property: Fully qualified resource Id for the resource.
     * 
     * @return the id value.
     */
    @Override
    public String id() {
        return this.id;
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
     * Get the type property: The type of the resource.
     * 
     * @return the type value.
     */
    @Override
    public String type() {
        return this.type;
    }

    /**
     * Get the securedCoreComplianceAssignment property: Secured Core Compliance Assignment.
     * 
     * @return the securedCoreComplianceAssignment value.
     */
    public ComplianceAssignmentType securedCoreComplianceAssignment() {
        return this.innerProperties() == null ? null : this.innerProperties().securedCoreComplianceAssignment();
    }

    /**
     * Set the securedCoreComplianceAssignment property: Secured Core Compliance Assignment.
     * 
     * @param securedCoreComplianceAssignment the securedCoreComplianceAssignment value to set.
     * @return the SecuritySettingInner object itself.
     */
    public SecuritySettingInner
        withSecuredCoreComplianceAssignment(ComplianceAssignmentType securedCoreComplianceAssignment) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SecurityProperties();
        }
        this.innerProperties().withSecuredCoreComplianceAssignment(securedCoreComplianceAssignment);
        return this;
    }

    /**
     * Get the wdacComplianceAssignment property: WDAC Compliance Assignment.
     * 
     * @return the wdacComplianceAssignment value.
     */
    public ComplianceAssignmentType wdacComplianceAssignment() {
        return this.innerProperties() == null ? null : this.innerProperties().wdacComplianceAssignment();
    }

    /**
     * Set the wdacComplianceAssignment property: WDAC Compliance Assignment.
     * 
     * @param wdacComplianceAssignment the wdacComplianceAssignment value to set.
     * @return the SecuritySettingInner object itself.
     */
    public SecuritySettingInner withWdacComplianceAssignment(ComplianceAssignmentType wdacComplianceAssignment) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SecurityProperties();
        }
        this.innerProperties().withWdacComplianceAssignment(wdacComplianceAssignment);
        return this;
    }

    /**
     * Get the smbEncryptionForIntraClusterTrafficComplianceAssignment property: SMB encryption for intra-cluster
     * traffic Compliance Assignment.
     * 
     * @return the smbEncryptionForIntraClusterTrafficComplianceAssignment value.
     */
    public ComplianceAssignmentType smbEncryptionForIntraClusterTrafficComplianceAssignment() {
        return this.innerProperties() == null
            ? null
            : this.innerProperties().smbEncryptionForIntraClusterTrafficComplianceAssignment();
    }

    /**
     * Set the smbEncryptionForIntraClusterTrafficComplianceAssignment property: SMB encryption for intra-cluster
     * traffic Compliance Assignment.
     * 
     * @param smbEncryptionForIntraClusterTrafficComplianceAssignment the
     * smbEncryptionForIntraClusterTrafficComplianceAssignment value to set.
     * @return the SecuritySettingInner object itself.
     */
    public SecuritySettingInner withSmbEncryptionForIntraClusterTrafficComplianceAssignment(
        ComplianceAssignmentType smbEncryptionForIntraClusterTrafficComplianceAssignment) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SecurityProperties();
        }
        this.innerProperties()
            .withSmbEncryptionForIntraClusterTrafficComplianceAssignment(
                smbEncryptionForIntraClusterTrafficComplianceAssignment);
        return this;
    }

    /**
     * Get the securityComplianceStatus property: Security Compliance Status.
     * 
     * @return the securityComplianceStatus value.
     */
    public SecurityComplianceStatus securityComplianceStatus() {
        return this.innerProperties() == null ? null : this.innerProperties().securityComplianceStatus();
    }

    /**
     * Get the provisioningState property: The status of the last operation.
     * 
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Set the provisioningState property: The status of the last operation.
     * 
     * @param provisioningState the provisioningState value to set.
     * @return the SecuritySettingInner object itself.
     */
    public SecuritySettingInner withProvisioningState(ProvisioningState provisioningState) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SecurityProperties();
        }
        this.innerProperties().withProvisioningState(provisioningState);
        return this;
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
     * Reads an instance of SecuritySettingInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of SecuritySettingInner if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the SecuritySettingInner.
     */
    public static SecuritySettingInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            SecuritySettingInner deserializedSecuritySettingInner = new SecuritySettingInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedSecuritySettingInner.id = reader.getString();
                } else if ("name".equals(fieldName)) {
                    deserializedSecuritySettingInner.name = reader.getString();
                } else if ("type".equals(fieldName)) {
                    deserializedSecuritySettingInner.type = reader.getString();
                } else if ("properties".equals(fieldName)) {
                    deserializedSecuritySettingInner.innerProperties = SecurityProperties.fromJson(reader);
                } else if ("systemData".equals(fieldName)) {
                    deserializedSecuritySettingInner.systemData = SystemData.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedSecuritySettingInner;
        });
    }
}
