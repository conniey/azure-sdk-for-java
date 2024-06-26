// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.extendedlocation.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.extendedlocation.models.EnabledResourceTypePropertiesTypesMetadataItem;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Properties for EnabledResourceType of a custom location. */
@Fluent
public final class EnabledResourceTypeProperties {
    /*
     * Cluster Extension ID
     */
    @JsonProperty(value = "clusterExtensionId")
    private String clusterExtensionId;

    /*
     * Cluster Extension Type
     */
    @JsonProperty(value = "extensionType")
    private String extensionType;

    /*
     * Metadata of the Resource Type
     */
    @JsonProperty(value = "typesMetadata")
    private List<EnabledResourceTypePropertiesTypesMetadataItem> typesMetadata;

    /**
     * Get the clusterExtensionId property: Cluster Extension ID.
     *
     * @return the clusterExtensionId value.
     */
    public String clusterExtensionId() {
        return this.clusterExtensionId;
    }

    /**
     * Set the clusterExtensionId property: Cluster Extension ID.
     *
     * @param clusterExtensionId the clusterExtensionId value to set.
     * @return the EnabledResourceTypeProperties object itself.
     */
    public EnabledResourceTypeProperties withClusterExtensionId(String clusterExtensionId) {
        this.clusterExtensionId = clusterExtensionId;
        return this;
    }

    /**
     * Get the extensionType property: Cluster Extension Type.
     *
     * @return the extensionType value.
     */
    public String extensionType() {
        return this.extensionType;
    }

    /**
     * Set the extensionType property: Cluster Extension Type.
     *
     * @param extensionType the extensionType value to set.
     * @return the EnabledResourceTypeProperties object itself.
     */
    public EnabledResourceTypeProperties withExtensionType(String extensionType) {
        this.extensionType = extensionType;
        return this;
    }

    /**
     * Get the typesMetadata property: Metadata of the Resource Type.
     *
     * @return the typesMetadata value.
     */
    public List<EnabledResourceTypePropertiesTypesMetadataItem> typesMetadata() {
        return this.typesMetadata;
    }

    /**
     * Set the typesMetadata property: Metadata of the Resource Type.
     *
     * @param typesMetadata the typesMetadata value to set.
     * @return the EnabledResourceTypeProperties object itself.
     */
    public EnabledResourceTypeProperties withTypesMetadata(
        List<EnabledResourceTypePropertiesTypesMetadataItem> typesMetadata) {
        this.typesMetadata = typesMetadata;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (typesMetadata() != null) {
            typesMetadata().forEach(e -> e.validate());
        }
    }
}
