// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated;

/**
 * Samples for StaticSites DeleteDatabaseConnection.
 */
public final class StaticSitesDeleteDatabaseConnectionSamples {
    /*
     * x-ms-original-file:
     * specification/web/resource-manager/Microsoft.Web/stable/2024-11-01/examples/DeleteStaticSiteDatabaseConnection.
     * json
     */
    /**
     * Sample code: Delete a database connection from a static site.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void deleteADatabaseConnectionFromAStaticSite(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.webApps()
            .manager()
            .serviceClient()
            .getStaticSites()
            .deleteDatabaseConnectionWithResponse("rg", "testStaticSite0", "default", com.azure.core.util.Context.NONE);
    }
}
