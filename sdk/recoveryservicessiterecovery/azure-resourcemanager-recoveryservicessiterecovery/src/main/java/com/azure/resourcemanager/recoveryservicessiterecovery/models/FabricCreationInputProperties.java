// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Properties of site details provided during the time of site creation.
 */
@Fluent
public final class FabricCreationInputProperties {
    /*
     * Fabric provider specific creation input.
     */
    @JsonProperty(value = "customDetails")
    private FabricSpecificCreationInput customDetails;

    /**
     * Creates an instance of FabricCreationInputProperties class.
     */
    public FabricCreationInputProperties() {
    }

    /**
     * Get the customDetails property: Fabric provider specific creation input.
     * 
     * @return the customDetails value.
     */
    public FabricSpecificCreationInput customDetails() {
        return this.customDetails;
    }

    /**
     * Set the customDetails property: Fabric provider specific creation input.
     * 
     * @param customDetails the customDetails value to set.
     * @return the FabricCreationInputProperties object itself.
     */
    public FabricCreationInputProperties withCustomDetails(FabricSpecificCreationInput customDetails) {
        this.customDetails = customDetails;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (customDetails() != null) {
            customDetails().validate();
        }
    }
}
