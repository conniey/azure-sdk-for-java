// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.providerhub.generated;

/**
 * Samples for Skus ListByResourceTypeRegistrations.
 */
public final class SkusListByResourceTypeRegistrationsSamples {
    /*
     * x-ms-original-file: specification/providerhub/resource-manager/Microsoft.ProviderHub/stable/2024-09-01/examples/
     * Skus_ListByResourceTypeRegistrations.json
     */
    /**
     * Sample code: Skus_ListByResourceTypeRegistrations.
     * 
     * @param manager Entry point to ProviderHubManager.
     */
    public static void
        skusListByResourceTypeRegistrations(com.azure.resourcemanager.providerhub.ProviderHubManager manager) {
        manager.skus()
            .listByResourceTypeRegistrations("Microsoft.Contoso", "testResourceType", com.azure.core.util.Context.NONE);
    }
}
