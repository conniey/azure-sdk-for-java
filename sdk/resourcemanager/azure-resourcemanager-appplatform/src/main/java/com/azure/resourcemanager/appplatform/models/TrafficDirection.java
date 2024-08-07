// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appplatform.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * The direction of required traffic.
 */
public final class TrafficDirection extends ExpandableStringEnum<TrafficDirection> {
    /**
     * Static value Inbound for TrafficDirection.
     */
    public static final TrafficDirection INBOUND = fromString("Inbound");

    /**
     * Static value Outbound for TrafficDirection.
     */
    public static final TrafficDirection OUTBOUND = fromString("Outbound");

    /**
     * Creates a new instance of TrafficDirection value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public TrafficDirection() {
    }

    /**
     * Creates or finds a TrafficDirection from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding TrafficDirection.
     */
    public static TrafficDirection fromString(String name) {
        return fromString(name, TrafficDirection.class);
    }

    /**
     * Gets known TrafficDirection values.
     * 
     * @return known TrafficDirection values.
     */
    public static Collection<TrafficDirection> values() {
        return values(TrafficDirection.class);
    }
}
