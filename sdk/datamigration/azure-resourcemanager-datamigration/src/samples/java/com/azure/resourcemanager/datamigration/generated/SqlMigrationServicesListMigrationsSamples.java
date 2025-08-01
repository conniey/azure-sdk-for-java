// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datamigration.generated;

/**
 * Samples for SqlMigrationServices ListMigrations.
 */
public final class SqlMigrationServicesListMigrationsSamples {
    /*
     * x-ms-original-file:
     * specification/datamigration/resource-manager/Microsoft.DataMigration/preview/2025-03-15-preview/examples/
     * ListMigrationsBySqlMigrationService.json
     */
    /**
     * Sample code: List database migrations attached to the service.
     * 
     * @param manager Entry point to DataMigrationManager.
     */
    public static void listDatabaseMigrationsAttachedToTheService(
        com.azure.resourcemanager.datamigration.DataMigrationManager manager) {
        manager.sqlMigrationServices().listMigrations("testrg", "service1", com.azure.core.util.Context.NONE);
    }
}
