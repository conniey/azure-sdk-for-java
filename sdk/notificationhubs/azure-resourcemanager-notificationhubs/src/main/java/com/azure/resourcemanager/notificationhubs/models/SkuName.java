// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.notificationhubs.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * Name of the notification hub sku.
 */
public final class SkuName extends ExpandableStringEnum<SkuName> {
    /**
     * Static value Free for SkuName.
     */
    public static final SkuName FREE = fromString("Free");

    /**
     * Static value Basic for SkuName.
     */
    public static final SkuName BASIC = fromString("Basic");

    /**
     * Static value Standard for SkuName.
     */
    public static final SkuName STANDARD = fromString("Standard");

    /**
     * Creates a new instance of SkuName value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public SkuName() {
    }

    /**
     * Creates or finds a SkuName from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding SkuName.
     */
    public static SkuName fromString(String name) {
        return fromString(name, SkuName.class);
    }

    /**
     * Gets known SkuName values.
     * 
     * @return known SkuName values.
     */
    public static Collection<SkuName> values() {
        return values(SkuName.class);
    }
}
