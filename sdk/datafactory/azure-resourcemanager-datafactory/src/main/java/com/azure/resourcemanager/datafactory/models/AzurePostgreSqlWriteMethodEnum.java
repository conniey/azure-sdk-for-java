// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * The write behavior for the operation. Default is Bulk Insert.
 */
public final class AzurePostgreSqlWriteMethodEnum extends ExpandableStringEnum<AzurePostgreSqlWriteMethodEnum> {
    /**
     * Static value BulkInsert for AzurePostgreSqlWriteMethodEnum.
     */
    public static final AzurePostgreSqlWriteMethodEnum BULK_INSERT = fromString("BulkInsert");

    /**
     * Static value CopyCommand for AzurePostgreSqlWriteMethodEnum.
     */
    public static final AzurePostgreSqlWriteMethodEnum COPY_COMMAND = fromString("CopyCommand");

    /**
     * Static value Upsert for AzurePostgreSqlWriteMethodEnum.
     */
    public static final AzurePostgreSqlWriteMethodEnum UPSERT = fromString("Upsert");

    /**
     * Creates a new instance of AzurePostgreSqlWriteMethodEnum value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public AzurePostgreSqlWriteMethodEnum() {
    }

    /**
     * Creates or finds a AzurePostgreSqlWriteMethodEnum from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding AzurePostgreSqlWriteMethodEnum.
     */
    public static AzurePostgreSqlWriteMethodEnum fromString(String name) {
        return fromString(name, AzurePostgreSqlWriteMethodEnum.class);
    }

    /**
     * Gets known AzurePostgreSqlWriteMethodEnum values.
     * 
     * @return known AzurePostgreSqlWriteMethodEnum values.
     */
    public static Collection<AzurePostgreSqlWriteMethodEnum> values() {
        return values(AzurePostgreSqlWriteMethodEnum.class);
    }
}
