// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * The scale type applicable to the sku.
 */
public final class GatewaySkuCapacityScaleType extends ExpandableStringEnum<GatewaySkuCapacityScaleType> {
    /**
     * Static value Automatic for GatewaySkuCapacityScaleType.
     */
    public static final GatewaySkuCapacityScaleType AUTOMATIC = fromString("Automatic");

    /**
     * Static value Manual for GatewaySkuCapacityScaleType.
     */
    public static final GatewaySkuCapacityScaleType MANUAL = fromString("Manual");

    /**
     * Static value None for GatewaySkuCapacityScaleType.
     */
    public static final GatewaySkuCapacityScaleType NONE = fromString("None");

    /**
     * Creates a new instance of GatewaySkuCapacityScaleType value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public GatewaySkuCapacityScaleType() {
    }

    /**
     * Creates or finds a GatewaySkuCapacityScaleType from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding GatewaySkuCapacityScaleType.
     */
    public static GatewaySkuCapacityScaleType fromString(String name) {
        return fromString(name, GatewaySkuCapacityScaleType.class);
    }

    /**
     * Gets known GatewaySkuCapacityScaleType values.
     * 
     * @return known GatewaySkuCapacityScaleType values.
     */
    public static Collection<GatewaySkuCapacityScaleType> values() {
        return values(GatewaySkuCapacityScaleType.class);
    }
}
