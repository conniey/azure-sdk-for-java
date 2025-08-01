// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.compute.models.KeyVaultSecretReference;
import com.azure.resourcemanager.compute.models.VirtualMachineExtensionInstanceView;
import java.io.IOException;
import java.util.List;

/**
 * Describes the properties of a Virtual Machine Extension.
 */
@Fluent
public final class VirtualMachineExtensionProperties implements JsonSerializable<VirtualMachineExtensionProperties> {
    /*
     * How the extension handler should be forced to update even if the extension configuration has not changed.
     */
    private String forceUpdateTag;

    /*
     * The name of the extension handler publisher.
     */
    private String publisher;

    /*
     * Specifies the type of the extension; an example is "CustomScriptExtension".
     */
    private String type;

    /*
     * Specifies the version of the script handler.
     */
    private String typeHandlerVersion;

    /*
     * Indicates whether the extension should use a newer minor version if one is available at deployment time. Once
     * deployed, however, the extension will not upgrade minor versions unless redeployed, even with this property set
     * to true.
     */
    private Boolean autoUpgradeMinorVersion;

    /*
     * Indicates whether the extension should be automatically upgraded by the platform if there is a newer version of
     * the extension available.
     */
    private Boolean enableAutomaticUpgrade;

    /*
     * Json formatted public settings for the extension.
     */
    private Object settings;

    /*
     * The extension can contain either protectedSettings or protectedSettingsFromKeyVault or no protected settings at
     * all.
     */
    private Object protectedSettings;

    /*
     * The provisioning state, which only appears in the response.
     */
    private String provisioningState;

    /*
     * The virtual machine extension instance view.
     */
    private VirtualMachineExtensionInstanceView instanceView;

    /*
     * Indicates whether failures stemming from the extension will be suppressed (Operational failures such as not
     * connecting to the VM will not be suppressed regardless of this value). The default is false.
     */
    private Boolean suppressFailures;

    /*
     * The extensions protected settings that are passed by reference, and consumed from key vault
     */
    private KeyVaultSecretReference protectedSettingsFromKeyVault;

    /*
     * Collection of extension names after which this extension needs to be provisioned.
     */
    private List<String> provisionAfterExtensions;

    /**
     * Creates an instance of VirtualMachineExtensionProperties class.
     */
    public VirtualMachineExtensionProperties() {
    }

    /**
     * Get the forceUpdateTag property: How the extension handler should be forced to update even if the extension
     * configuration has not changed.
     * 
     * @return the forceUpdateTag value.
     */
    public String forceUpdateTag() {
        return this.forceUpdateTag;
    }

    /**
     * Set the forceUpdateTag property: How the extension handler should be forced to update even if the extension
     * configuration has not changed.
     * 
     * @param forceUpdateTag the forceUpdateTag value to set.
     * @return the VirtualMachineExtensionProperties object itself.
     */
    public VirtualMachineExtensionProperties withForceUpdateTag(String forceUpdateTag) {
        this.forceUpdateTag = forceUpdateTag;
        return this;
    }

    /**
     * Get the publisher property: The name of the extension handler publisher.
     * 
     * @return the publisher value.
     */
    public String publisher() {
        return this.publisher;
    }

    /**
     * Set the publisher property: The name of the extension handler publisher.
     * 
     * @param publisher the publisher value to set.
     * @return the VirtualMachineExtensionProperties object itself.
     */
    public VirtualMachineExtensionProperties withPublisher(String publisher) {
        this.publisher = publisher;
        return this;
    }

    /**
     * Get the type property: Specifies the type of the extension; an example is "CustomScriptExtension".
     * 
     * @return the type value.
     */
    public String type() {
        return this.type;
    }

    /**
     * Set the type property: Specifies the type of the extension; an example is "CustomScriptExtension".
     * 
     * @param type the type value to set.
     * @return the VirtualMachineExtensionProperties object itself.
     */
    public VirtualMachineExtensionProperties withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Get the typeHandlerVersion property: Specifies the version of the script handler.
     * 
     * @return the typeHandlerVersion value.
     */
    public String typeHandlerVersion() {
        return this.typeHandlerVersion;
    }

    /**
     * Set the typeHandlerVersion property: Specifies the version of the script handler.
     * 
     * @param typeHandlerVersion the typeHandlerVersion value to set.
     * @return the VirtualMachineExtensionProperties object itself.
     */
    public VirtualMachineExtensionProperties withTypeHandlerVersion(String typeHandlerVersion) {
        this.typeHandlerVersion = typeHandlerVersion;
        return this;
    }

    /**
     * Get the autoUpgradeMinorVersion property: Indicates whether the extension should use a newer minor version if one
     * is available at deployment time. Once deployed, however, the extension will not upgrade minor versions unless
     * redeployed, even with this property set to true.
     * 
     * @return the autoUpgradeMinorVersion value.
     */
    public Boolean autoUpgradeMinorVersion() {
        return this.autoUpgradeMinorVersion;
    }

    /**
     * Set the autoUpgradeMinorVersion property: Indicates whether the extension should use a newer minor version if one
     * is available at deployment time. Once deployed, however, the extension will not upgrade minor versions unless
     * redeployed, even with this property set to true.
     * 
     * @param autoUpgradeMinorVersion the autoUpgradeMinorVersion value to set.
     * @return the VirtualMachineExtensionProperties object itself.
     */
    public VirtualMachineExtensionProperties withAutoUpgradeMinorVersion(Boolean autoUpgradeMinorVersion) {
        this.autoUpgradeMinorVersion = autoUpgradeMinorVersion;
        return this;
    }

    /**
     * Get the enableAutomaticUpgrade property: Indicates whether the extension should be automatically upgraded by the
     * platform if there is a newer version of the extension available.
     * 
     * @return the enableAutomaticUpgrade value.
     */
    public Boolean enableAutomaticUpgrade() {
        return this.enableAutomaticUpgrade;
    }

    /**
     * Set the enableAutomaticUpgrade property: Indicates whether the extension should be automatically upgraded by the
     * platform if there is a newer version of the extension available.
     * 
     * @param enableAutomaticUpgrade the enableAutomaticUpgrade value to set.
     * @return the VirtualMachineExtensionProperties object itself.
     */
    public VirtualMachineExtensionProperties withEnableAutomaticUpgrade(Boolean enableAutomaticUpgrade) {
        this.enableAutomaticUpgrade = enableAutomaticUpgrade;
        return this;
    }

    /**
     * Get the settings property: Json formatted public settings for the extension.
     * 
     * @return the settings value.
     */
    public Object settings() {
        return this.settings;
    }

    /**
     * Set the settings property: Json formatted public settings for the extension.
     * 
     * @param settings the settings value to set.
     * @return the VirtualMachineExtensionProperties object itself.
     */
    public VirtualMachineExtensionProperties withSettings(Object settings) {
        this.settings = settings;
        return this;
    }

    /**
     * Get the protectedSettings property: The extension can contain either protectedSettings or
     * protectedSettingsFromKeyVault or no protected settings at all.
     * 
     * @return the protectedSettings value.
     */
    public Object protectedSettings() {
        return this.protectedSettings;
    }

    /**
     * Set the protectedSettings property: The extension can contain either protectedSettings or
     * protectedSettingsFromKeyVault or no protected settings at all.
     * 
     * @param protectedSettings the protectedSettings value to set.
     * @return the VirtualMachineExtensionProperties object itself.
     */
    public VirtualMachineExtensionProperties withProtectedSettings(Object protectedSettings) {
        this.protectedSettings = protectedSettings;
        return this;
    }

    /**
     * Get the provisioningState property: The provisioning state, which only appears in the response.
     * 
     * @return the provisioningState value.
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the instanceView property: The virtual machine extension instance view.
     * 
     * @return the instanceView value.
     */
    public VirtualMachineExtensionInstanceView instanceView() {
        return this.instanceView;
    }

    /**
     * Set the instanceView property: The virtual machine extension instance view.
     * 
     * @param instanceView the instanceView value to set.
     * @return the VirtualMachineExtensionProperties object itself.
     */
    public VirtualMachineExtensionProperties withInstanceView(VirtualMachineExtensionInstanceView instanceView) {
        this.instanceView = instanceView;
        return this;
    }

    /**
     * Get the suppressFailures property: Indicates whether failures stemming from the extension will be suppressed
     * (Operational failures such as not connecting to the VM will not be suppressed regardless of this value). The
     * default is false.
     * 
     * @return the suppressFailures value.
     */
    public Boolean suppressFailures() {
        return this.suppressFailures;
    }

    /**
     * Set the suppressFailures property: Indicates whether failures stemming from the extension will be suppressed
     * (Operational failures such as not connecting to the VM will not be suppressed regardless of this value). The
     * default is false.
     * 
     * @param suppressFailures the suppressFailures value to set.
     * @return the VirtualMachineExtensionProperties object itself.
     */
    public VirtualMachineExtensionProperties withSuppressFailures(Boolean suppressFailures) {
        this.suppressFailures = suppressFailures;
        return this;
    }

    /**
     * Get the protectedSettingsFromKeyVault property: The extensions protected settings that are passed by reference,
     * and consumed from key vault.
     * 
     * @return the protectedSettingsFromKeyVault value.
     */
    public KeyVaultSecretReference protectedSettingsFromKeyVault() {
        return this.protectedSettingsFromKeyVault;
    }

    /**
     * Set the protectedSettingsFromKeyVault property: The extensions protected settings that are passed by reference,
     * and consumed from key vault.
     * 
     * @param protectedSettingsFromKeyVault the protectedSettingsFromKeyVault value to set.
     * @return the VirtualMachineExtensionProperties object itself.
     */
    public VirtualMachineExtensionProperties
        withProtectedSettingsFromKeyVault(KeyVaultSecretReference protectedSettingsFromKeyVault) {
        this.protectedSettingsFromKeyVault = protectedSettingsFromKeyVault;
        return this;
    }

    /**
     * Get the provisionAfterExtensions property: Collection of extension names after which this extension needs to be
     * provisioned.
     * 
     * @return the provisionAfterExtensions value.
     */
    public List<String> provisionAfterExtensions() {
        return this.provisionAfterExtensions;
    }

    /**
     * Set the provisionAfterExtensions property: Collection of extension names after which this extension needs to be
     * provisioned.
     * 
     * @param provisionAfterExtensions the provisionAfterExtensions value to set.
     * @return the VirtualMachineExtensionProperties object itself.
     */
    public VirtualMachineExtensionProperties withProvisionAfterExtensions(List<String> provisionAfterExtensions) {
        this.provisionAfterExtensions = provisionAfterExtensions;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (instanceView() != null) {
            instanceView().validate();
        }
        if (protectedSettingsFromKeyVault() != null) {
            protectedSettingsFromKeyVault().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("forceUpdateTag", this.forceUpdateTag);
        jsonWriter.writeStringField("publisher", this.publisher);
        jsonWriter.writeStringField("type", this.type);
        jsonWriter.writeStringField("typeHandlerVersion", this.typeHandlerVersion);
        jsonWriter.writeBooleanField("autoUpgradeMinorVersion", this.autoUpgradeMinorVersion);
        jsonWriter.writeBooleanField("enableAutomaticUpgrade", this.enableAutomaticUpgrade);
        if (this.settings != null) {
            jsonWriter.writeUntypedField("settings", this.settings);
        }
        if (this.protectedSettings != null) {
            jsonWriter.writeUntypedField("protectedSettings", this.protectedSettings);
        }
        jsonWriter.writeJsonField("instanceView", this.instanceView);
        jsonWriter.writeBooleanField("suppressFailures", this.suppressFailures);
        jsonWriter.writeJsonField("protectedSettingsFromKeyVault", this.protectedSettingsFromKeyVault);
        jsonWriter.writeArrayField("provisionAfterExtensions", this.provisionAfterExtensions,
            (writer, element) -> writer.writeString(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of VirtualMachineExtensionProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of VirtualMachineExtensionProperties if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the VirtualMachineExtensionProperties.
     */
    public static VirtualMachineExtensionProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            VirtualMachineExtensionProperties deserializedVirtualMachineExtensionProperties
                = new VirtualMachineExtensionProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("forceUpdateTag".equals(fieldName)) {
                    deserializedVirtualMachineExtensionProperties.forceUpdateTag = reader.getString();
                } else if ("publisher".equals(fieldName)) {
                    deserializedVirtualMachineExtensionProperties.publisher = reader.getString();
                } else if ("type".equals(fieldName)) {
                    deserializedVirtualMachineExtensionProperties.type = reader.getString();
                } else if ("typeHandlerVersion".equals(fieldName)) {
                    deserializedVirtualMachineExtensionProperties.typeHandlerVersion = reader.getString();
                } else if ("autoUpgradeMinorVersion".equals(fieldName)) {
                    deserializedVirtualMachineExtensionProperties.autoUpgradeMinorVersion
                        = reader.getNullable(JsonReader::getBoolean);
                } else if ("enableAutomaticUpgrade".equals(fieldName)) {
                    deserializedVirtualMachineExtensionProperties.enableAutomaticUpgrade
                        = reader.getNullable(JsonReader::getBoolean);
                } else if ("settings".equals(fieldName)) {
                    deserializedVirtualMachineExtensionProperties.settings = reader.readUntyped();
                } else if ("protectedSettings".equals(fieldName)) {
                    deserializedVirtualMachineExtensionProperties.protectedSettings = reader.readUntyped();
                } else if ("provisioningState".equals(fieldName)) {
                    deserializedVirtualMachineExtensionProperties.provisioningState = reader.getString();
                } else if ("instanceView".equals(fieldName)) {
                    deserializedVirtualMachineExtensionProperties.instanceView
                        = VirtualMachineExtensionInstanceView.fromJson(reader);
                } else if ("suppressFailures".equals(fieldName)) {
                    deserializedVirtualMachineExtensionProperties.suppressFailures
                        = reader.getNullable(JsonReader::getBoolean);
                } else if ("protectedSettingsFromKeyVault".equals(fieldName)) {
                    deserializedVirtualMachineExtensionProperties.protectedSettingsFromKeyVault
                        = KeyVaultSecretReference.fromJson(reader);
                } else if ("provisionAfterExtensions".equals(fieldName)) {
                    List<String> provisionAfterExtensions = reader.readArray(reader1 -> reader1.getString());
                    deserializedVirtualMachineExtensionProperties.provisionAfterExtensions = provisionAfterExtensions;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedVirtualMachineExtensionProperties;
        });
    }
}
