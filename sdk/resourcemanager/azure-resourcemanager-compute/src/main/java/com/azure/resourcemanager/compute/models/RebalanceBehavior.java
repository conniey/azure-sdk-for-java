// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * Type of rebalance behavior that will be used for recreating virtual machines in the scale set across availability
 * zones. Default and only supported value for now is CreateBeforeDelete.
 */
public final class RebalanceBehavior extends ExpandableStringEnum<RebalanceBehavior> {
    /**
     * Static value CreateBeforeDelete for RebalanceBehavior.
     */
    public static final RebalanceBehavior CREATE_BEFORE_DELETE = fromString("CreateBeforeDelete");

    /**
     * Creates a new instance of RebalanceBehavior value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public RebalanceBehavior() {
    }

    /**
     * Creates or finds a RebalanceBehavior from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding RebalanceBehavior.
     */
    public static RebalanceBehavior fromString(String name) {
        return fromString(name, RebalanceBehavior.class);
    }

    /**
     * Gets known RebalanceBehavior values.
     * 
     * @return known RebalanceBehavior values.
     */
    public static Collection<RebalanceBehavior> values() {
        return values(RebalanceBehavior.class);
    }
}
