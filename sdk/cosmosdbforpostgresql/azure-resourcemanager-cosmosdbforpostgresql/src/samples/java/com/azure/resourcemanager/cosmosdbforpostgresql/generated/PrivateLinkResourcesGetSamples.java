// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmosdbforpostgresql.generated;

/**
 * Samples for PrivateLinkResources Get.
 */
public final class PrivateLinkResourcesGetSamples {
    /*
     * x-ms-original-file:
     * specification/postgresqlhsc/resource-manager/Microsoft.DBforPostgreSQL/preview/2023-03-02-preview/examples/
     * PrivateLinkResourcesGet.json
     */
    /**
     * Sample code: Gets a private link resource for cluster.
     * 
     * @param manager Entry point to CosmosDBForPostgreSqlManager.
     */
    public static void getsAPrivateLinkResourceForCluster(
        com.azure.resourcemanager.cosmosdbforpostgresql.CosmosDBForPostgreSqlManager manager) {
        manager.privateLinkResources()
            .getWithResponse("TestGroup", "testcluster", "plr", com.azure.core.util.Context.NONE);
    }
}
