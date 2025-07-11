// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts.models;

import com.azure.core.annotation.Generated;
import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * All available types of copy behavior.
 */
public final class CopyBehaviorType extends ExpandableStringEnum<CopyBehaviorType> {
    /**
     * Static value PreserveHierarchy for CopyBehaviorType.
     */
    @Generated
    public static final CopyBehaviorType PRESERVE_HIERARCHY = fromString("PreserveHierarchy");

    /**
     * Static value FlattenHierarchy for CopyBehaviorType.
     */
    @Generated
    public static final CopyBehaviorType FLATTEN_HIERARCHY = fromString("FlattenHierarchy");

    /**
     * Static value MergeFiles for CopyBehaviorType.
     */
    @Generated
    public static final CopyBehaviorType MERGE_FILES = fromString("MergeFiles");

    /**
     * Creates a new instance of CopyBehaviorType value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Generated
    @Deprecated
    public CopyBehaviorType() {
    }

    /**
     * Creates or finds a CopyBehaviorType from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding CopyBehaviorType.
     */
    @Generated
    public static CopyBehaviorType fromString(String name) {
        return fromString(name, CopyBehaviorType.class);
    }

    /**
     * Gets known CopyBehaviorType values.
     * 
     * @return known CopyBehaviorType values.
     */
    @Generated
    public static Collection<CopyBehaviorType> values() {
        return values(CopyBehaviorType.class);
    }
}
