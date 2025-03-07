// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devcenter.generated;

import com.azure.resourcemanager.devcenter.models.NetworkConnection;

/**
 * Samples for NetworkConnections Update.
 */
public final class NetworkConnectionsUpdateSamples {
    /*
     * x-ms-original-file:
     * specification/devcenter/resource-manager/Microsoft.DevCenter/stable/2024-02-01/examples/NetworkConnections_Patch.
     * json
     */
    /**
     * Sample code: NetworkConnections_Update.
     * 
     * @param manager Entry point to DevCenterManager.
     */
    public static void networkConnectionsUpdate(com.azure.resourcemanager.devcenter.DevCenterManager manager) {
        NetworkConnection resource = manager.networkConnections()
            .getByResourceGroupWithResponse("rg1", "uswest3network", com.azure.core.util.Context.NONE)
            .getValue();
        resource.update().withDomainPassword("New Password value for user").apply();
    }
}
