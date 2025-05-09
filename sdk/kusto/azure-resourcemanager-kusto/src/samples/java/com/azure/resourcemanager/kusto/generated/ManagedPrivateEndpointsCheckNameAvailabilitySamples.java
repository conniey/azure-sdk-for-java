// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.kusto.generated;

import com.azure.resourcemanager.kusto.models.ManagedPrivateEndpointsCheckNameRequest;

/**
 * Samples for ManagedPrivateEndpoints CheckNameAvailability.
 */
public final class ManagedPrivateEndpointsCheckNameAvailabilitySamples {
    /*
     * x-ms-original-file: specification/azure-kusto/resource-manager/Microsoft.Kusto/stable/2024-04-13/examples/
     * KustoManagedPrivateEndpointsCheckNameAvailability.json
     */
    /**
     * Sample code: KustoManagedPrivateEndpointsCheckNameAvailability.
     * 
     * @param manager Entry point to KustoManager.
     */
    public static void
        kustoManagedPrivateEndpointsCheckNameAvailability(com.azure.resourcemanager.kusto.KustoManager manager) {
        manager.managedPrivateEndpoints()
            .checkNameAvailabilityWithResponse("kustorptest", "kustoCluster",
                new ManagedPrivateEndpointsCheckNameRequest().withName("pme1"), com.azure.core.util.Context.NONE);
    }
}
