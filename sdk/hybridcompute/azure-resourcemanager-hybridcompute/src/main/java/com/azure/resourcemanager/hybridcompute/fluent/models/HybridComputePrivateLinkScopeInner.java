// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridcompute.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.SystemData;
import com.azure.resourcemanager.hybridcompute.models.HybridComputePrivateLinkScopeProperties;
import com.azure.resourcemanager.hybridcompute.models.PrivateLinkScopesResource;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/**
 * An Azure Arc PrivateLinkScope definition.
 */
@Fluent
public final class HybridComputePrivateLinkScopeInner extends PrivateLinkScopesResource {
    /*
     * Properties that define a Azure Arc PrivateLinkScope resource.
     */
    @JsonProperty(value = "properties")
    private HybridComputePrivateLinkScopeProperties properties;

    /*
     * The system meta data relating to this resource.
     */
    @JsonProperty(value = "systemData", access = JsonProperty.Access.WRITE_ONLY)
    private SystemData systemData;

    /**
     * Creates an instance of HybridComputePrivateLinkScopeInner class.
     */
    public HybridComputePrivateLinkScopeInner() {
    }

    /**
     * Get the properties property: Properties that define a Azure Arc PrivateLinkScope resource.
     * 
     * @return the properties value.
     */
    public HybridComputePrivateLinkScopeProperties properties() {
        return this.properties;
    }

    /**
     * Set the properties property: Properties that define a Azure Arc PrivateLinkScope resource.
     * 
     * @param properties the properties value to set.
     * @return the HybridComputePrivateLinkScopeInner object itself.
     */
    public HybridComputePrivateLinkScopeInner withProperties(HybridComputePrivateLinkScopeProperties properties) {
        this.properties = properties;
        return this;
    }

    /**
     * Get the systemData property: The system meta data relating to this resource.
     * 
     * @return the systemData value.
     */
    public SystemData systemData() {
        return this.systemData;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HybridComputePrivateLinkScopeInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HybridComputePrivateLinkScopeInner withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (properties() != null) {
            properties().validate();
        }
    }
}
