// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.costmanagement.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * Type of timegrain cadence.
 */
public final class AlertTimeGrainType extends ExpandableStringEnum<AlertTimeGrainType> {
    /**
     * Static value None for AlertTimeGrainType.
     */
    public static final AlertTimeGrainType NONE = fromString("None");

    /**
     * Static value Monthly for AlertTimeGrainType.
     */
    public static final AlertTimeGrainType MONTHLY = fromString("Monthly");

    /**
     * Static value Quarterly for AlertTimeGrainType.
     */
    public static final AlertTimeGrainType QUARTERLY = fromString("Quarterly");

    /**
     * Static value Annually for AlertTimeGrainType.
     */
    public static final AlertTimeGrainType ANNUALLY = fromString("Annually");

    /**
     * Static value BillingMonth for AlertTimeGrainType.
     */
    public static final AlertTimeGrainType BILLING_MONTH = fromString("BillingMonth");

    /**
     * Static value BillingQuarter for AlertTimeGrainType.
     */
    public static final AlertTimeGrainType BILLING_QUARTER = fromString("BillingQuarter");

    /**
     * Static value BillingAnnual for AlertTimeGrainType.
     */
    public static final AlertTimeGrainType BILLING_ANNUAL = fromString("BillingAnnual");

    /**
     * Creates a new instance of AlertTimeGrainType value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public AlertTimeGrainType() {
    }

    /**
     * Creates or finds a AlertTimeGrainType from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding AlertTimeGrainType.
     */
    public static AlertTimeGrainType fromString(String name) {
        return fromString(name, AlertTimeGrainType.class);
    }

    /**
     * Gets known AlertTimeGrainType values.
     * 
     * @return known AlertTimeGrainType values.
     */
    public static Collection<AlertTimeGrainType> values() {
        return values(AlertTimeGrainType.class);
    }
}
