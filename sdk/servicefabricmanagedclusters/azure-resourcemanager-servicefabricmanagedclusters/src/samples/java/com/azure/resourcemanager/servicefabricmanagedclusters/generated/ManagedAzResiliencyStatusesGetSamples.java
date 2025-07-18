// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.servicefabricmanagedclusters.generated;

/**
 * Samples for ManagedAzResiliencyStatuses Get.
 */
public final class ManagedAzResiliencyStatusesGetSamples {
    /*
     * x-ms-original-file: 2025-03-01-preview/managedAzResiliencyStatusGet_example.json
     */
    /**
     * Sample code: Az Resiliency status of Base Resources.
     * 
     * @param manager Entry point to ServiceFabricManagedClustersManager.
     */
    public static void azResiliencyStatusOfBaseResources(
        com.azure.resourcemanager.servicefabricmanagedclusters.ServiceFabricManagedClustersManager manager) {
        manager.managedAzResiliencyStatuses()
            .getWithResponse("resourceGroup1", "mycluster1", com.azure.core.util.Context.NONE);
    }
}
