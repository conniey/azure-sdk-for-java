// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.oracledatabase.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * Source type enum.
 */
public final class SourceType extends ExpandableStringEnum<SourceType> {
    /**
     * Static value None for SourceType.
     */
    public static final SourceType NONE = fromString("None");

    /**
     * Static value Database for SourceType.
     */
    public static final SourceType DATABASE = fromString("Database");

    /**
     * Static value BackupFromId for SourceType.
     */
    public static final SourceType BACKUP_FROM_ID = fromString("BackupFromId");

    /**
     * Static value BackupFromTimestamp for SourceType.
     */
    public static final SourceType BACKUP_FROM_TIMESTAMP = fromString("BackupFromTimestamp");

    /**
     * Static value CloneToRefreshable for SourceType.
     */
    public static final SourceType CLONE_TO_REFRESHABLE = fromString("CloneToRefreshable");

    /**
     * Static value CrossRegionDataguard for SourceType.
     */
    public static final SourceType CROSS_REGION_DATAGUARD = fromString("CrossRegionDataguard");

    /**
     * Static value CrossRegionDisasterRecovery for SourceType.
     */
    public static final SourceType CROSS_REGION_DISASTER_RECOVERY = fromString("CrossRegionDisasterRecovery");

    /**
     * Creates a new instance of SourceType value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public SourceType() {
    }

    /**
     * Creates or finds a SourceType from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding SourceType.
     */
    public static SourceType fromString(String name) {
        return fromString(name, SourceType.class);
    }

    /**
     * Gets known SourceType values.
     * 
     * @return known SourceType values.
     */
    public static Collection<SourceType> values() {
        return values(SourceType.class);
    }
}
