// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.redhatopenshift.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * PreconfiguredNSG represents whether customers want to use their own NSG attached to the subnets.
 */
public final class PreconfiguredNsg extends ExpandableStringEnum<PreconfiguredNsg> {
    /**
     * Static value Disabled for PreconfiguredNsg.
     */
    public static final PreconfiguredNsg DISABLED = fromString("Disabled");

    /**
     * Static value Enabled for PreconfiguredNsg.
     */
    public static final PreconfiguredNsg ENABLED = fromString("Enabled");

    /**
     * Creates a new instance of PreconfiguredNsg value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public PreconfiguredNsg() {
    }

    /**
     * Creates or finds a PreconfiguredNsg from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding PreconfiguredNsg.
     */
    public static PreconfiguredNsg fromString(String name) {
        return fromString(name, PreconfiguredNsg.class);
    }

    /**
     * Gets known PreconfiguredNsg values.
     * 
     * @return known PreconfiguredNsg values.
     */
    public static Collection<PreconfiguredNsg> values() {
        return values(PreconfiguredNsg.class);
    }
}
