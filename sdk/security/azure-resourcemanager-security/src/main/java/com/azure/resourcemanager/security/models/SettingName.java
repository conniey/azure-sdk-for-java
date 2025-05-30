// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * Defines values for SettingName.
 */
public final class SettingName extends ExpandableStringEnum<SettingName> {
    /**
     * Static value MCAS for SettingName.
     */
    public static final SettingName MCAS = fromString("MCAS");

    /**
     * Static value WDATP for SettingName.
     */
    public static final SettingName WDATP = fromString("WDATP");

    /**
     * Static value WDATP_EXCLUDE_LINUX_PUBLIC_PREVIEW for SettingName.
     */
    public static final SettingName WDATP_EXCLUDE_LINUX_PUBLIC_PREVIEW
        = fromString("WDATP_EXCLUDE_LINUX_PUBLIC_PREVIEW");

    /**
     * Static value WDATP_UNIFIED_SOLUTION for SettingName.
     */
    public static final SettingName WDATP_UNIFIED_SOLUTION = fromString("WDATP_UNIFIED_SOLUTION");

    /**
     * Static value Sentinel for SettingName.
     */
    public static final SettingName SENTINEL = fromString("Sentinel");

    /**
     * Creates a new instance of SettingName value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public SettingName() {
    }

    /**
     * Creates or finds a SettingName from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding SettingName.
     */
    public static SettingName fromString(String name) {
        return fromString(name, SettingName.class);
    }

    /**
     * Gets known SettingName values.
     * 
     * @return known SettingName values.
     */
    public static Collection<SettingName> values() {
        return values(SettingName.class);
    }
}
