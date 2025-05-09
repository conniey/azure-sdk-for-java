// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.redisenterprise.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * Clustering policy - default is OSSCluster. This property can be updated only if the current value is NoCluster. If
 * the value is OSSCluster or EnterpriseCluster, it cannot be updated without deleting the database.
 */
public final class ClusteringPolicy extends ExpandableStringEnum<ClusteringPolicy> {
    /**
     * Static value EnterpriseCluster for ClusteringPolicy.
     */
    public static final ClusteringPolicy ENTERPRISE_CLUSTER = fromString("EnterpriseCluster");

    /**
     * Static value OSSCluster for ClusteringPolicy.
     */
    public static final ClusteringPolicy OSSCLUSTER = fromString("OSSCluster");

    /**
     * Static value NoCluster for ClusteringPolicy.
     */
    public static final ClusteringPolicy NO_CLUSTER = fromString("NoCluster");

    /**
     * Creates a new instance of ClusteringPolicy value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public ClusteringPolicy() {
    }

    /**
     * Creates or finds a ClusteringPolicy from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding ClusteringPolicy.
     */
    public static ClusteringPolicy fromString(String name) {
        return fromString(name, ClusteringPolicy.class);
    }

    /**
     * Gets known ClusteringPolicy values.
     * 
     * @return known ClusteringPolicy values.
     */
    public static Collection<ClusteringPolicy> values() {
        return values(ClusteringPolicy.class);
    }
}
