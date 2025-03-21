// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.servicelinker.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * The target service type.
 */
public final class TargetServiceType extends ExpandableStringEnum<TargetServiceType> {
    /**
     * Static value AzureResource for TargetServiceType.
     */
    public static final TargetServiceType AZURE_RESOURCE = fromString("AzureResource");

    /**
     * Static value ConfluentBootstrapServer for TargetServiceType.
     */
    public static final TargetServiceType CONFLUENT_BOOTSTRAP_SERVER = fromString("ConfluentBootstrapServer");

    /**
     * Static value ConfluentSchemaRegistry for TargetServiceType.
     */
    public static final TargetServiceType CONFLUENT_SCHEMA_REGISTRY = fromString("ConfluentSchemaRegistry");

    /**
     * Creates a new instance of TargetServiceType value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public TargetServiceType() {
    }

    /**
     * Creates or finds a TargetServiceType from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding TargetServiceType.
     */
    public static TargetServiceType fromString(String name) {
        return fromString(name, TargetServiceType.class);
    }

    /**
     * Gets known TargetServiceType values.
     * 
     * @return known TargetServiceType values.
     */
    public static Collection<TargetServiceType> values() {
        return values(TargetServiceType.class);
    }
}
