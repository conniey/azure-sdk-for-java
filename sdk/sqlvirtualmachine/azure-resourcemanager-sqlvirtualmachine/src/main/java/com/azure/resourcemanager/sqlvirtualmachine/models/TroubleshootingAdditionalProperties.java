// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sqlvirtualmachine.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** SQL VM Troubleshooting additional properties. */
@Fluent
public final class TroubleshootingAdditionalProperties {
    /*
     * The unhealthy replica information
     */
    @JsonProperty(value = "unhealthyReplicaInfo")
    private UnhealthyReplicaInfo unhealthyReplicaInfo;

    /** Creates an instance of TroubleshootingAdditionalProperties class. */
    public TroubleshootingAdditionalProperties() {
    }

    /**
     * Get the unhealthyReplicaInfo property: The unhealthy replica information.
     *
     * @return the unhealthyReplicaInfo value.
     */
    public UnhealthyReplicaInfo unhealthyReplicaInfo() {
        return this.unhealthyReplicaInfo;
    }

    /**
     * Set the unhealthyReplicaInfo property: The unhealthy replica information.
     *
     * @param unhealthyReplicaInfo the unhealthyReplicaInfo value to set.
     * @return the TroubleshootingAdditionalProperties object itself.
     */
    public TroubleshootingAdditionalProperties withUnhealthyReplicaInfo(UnhealthyReplicaInfo unhealthyReplicaInfo) {
        this.unhealthyReplicaInfo = unhealthyReplicaInfo;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (unhealthyReplicaInfo() != null) {
            unhealthyReplicaInfo().validate();
        }
    }
}
