// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.containerservicesafeguards.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * Specifies the level of Deployment Safeguards.
 */
public final class DeploymentSafeguardsLevel extends ExpandableStringEnum<DeploymentSafeguardsLevel> {
    /**
     * Best practice violations will only show warnings.
     */
    public static final DeploymentSafeguardsLevel WARN = fromString("Warn");

    /**
     * Best practice violations will be denied.
     */
    public static final DeploymentSafeguardsLevel ENFORCE = fromString("Enforce");

    /**
     * Creates a new instance of DeploymentSafeguardsLevel value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public DeploymentSafeguardsLevel() {
    }

    /**
     * Creates or finds a DeploymentSafeguardsLevel from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding DeploymentSafeguardsLevel.
     */
    public static DeploymentSafeguardsLevel fromString(String name) {
        return fromString(name, DeploymentSafeguardsLevel.class);
    }

    /**
     * Gets known DeploymentSafeguardsLevel values.
     * 
     * @return known DeploymentSafeguardsLevel values.
     */
    public static Collection<DeploymentSafeguardsLevel> values() {
        return values(DeploymentSafeguardsLevel.class);
    }
}
