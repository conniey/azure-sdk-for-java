// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.servicefabricmanagedclusters.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * The operating system of the cluster. The default means all.
 */
public final class ManagedClusterVersionEnvironment extends ExpandableStringEnum<ManagedClusterVersionEnvironment> {
    /**
     * Indicates os is Windows.
     */
    public static final ManagedClusterVersionEnvironment WINDOWS = fromString("Windows");

    /**
     * Creates a new instance of ManagedClusterVersionEnvironment value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public ManagedClusterVersionEnvironment() {
    }

    /**
     * Creates or finds a ManagedClusterVersionEnvironment from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding ManagedClusterVersionEnvironment.
     */
    public static ManagedClusterVersionEnvironment fromString(String name) {
        return fromString(name, ManagedClusterVersionEnvironment.class);
    }

    /**
     * Gets known ManagedClusterVersionEnvironment values.
     * 
     * @return known ManagedClusterVersionEnvironment values.
     */
    public static Collection<ManagedClusterVersionEnvironment> values() {
        return values(ManagedClusterVersionEnvironment.class);
    }
}
