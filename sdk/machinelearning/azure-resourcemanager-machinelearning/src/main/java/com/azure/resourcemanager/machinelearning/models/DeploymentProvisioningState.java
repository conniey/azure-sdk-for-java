// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * Possible values for DeploymentProvisioningState.
 */
public final class DeploymentProvisioningState extends ExpandableStringEnum<DeploymentProvisioningState> {
    /**
     * Static value Creating for DeploymentProvisioningState.
     */
    public static final DeploymentProvisioningState CREATING = fromString("Creating");

    /**
     * Static value Deleting for DeploymentProvisioningState.
     */
    public static final DeploymentProvisioningState DELETING = fromString("Deleting");

    /**
     * Static value Scaling for DeploymentProvisioningState.
     */
    public static final DeploymentProvisioningState SCALING = fromString("Scaling");

    /**
     * Static value Updating for DeploymentProvisioningState.
     */
    public static final DeploymentProvisioningState UPDATING = fromString("Updating");

    /**
     * Static value Succeeded for DeploymentProvisioningState.
     */
    public static final DeploymentProvisioningState SUCCEEDED = fromString("Succeeded");

    /**
     * Static value Failed for DeploymentProvisioningState.
     */
    public static final DeploymentProvisioningState FAILED = fromString("Failed");

    /**
     * Static value Canceled for DeploymentProvisioningState.
     */
    public static final DeploymentProvisioningState CANCELED = fromString("Canceled");

    /**
     * Creates a new instance of DeploymentProvisioningState value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public DeploymentProvisioningState() {
    }

    /**
     * Creates or finds a DeploymentProvisioningState from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding DeploymentProvisioningState.
     */
    public static DeploymentProvisioningState fromString(String name) {
        return fromString(name, DeploymentProvisioningState.class);
    }

    /**
     * Gets known DeploymentProvisioningState values.
     * 
     * @return known DeploymentProvisioningState values.
     */
    public static Collection<DeploymentProvisioningState> values() {
        return values(DeploymentProvisioningState.class);
    }
}
