// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated;

/**
 * Samples for ExpressRouteGateways Delete.
 */
public final class ExpressRouteGatewaysDeleteSamples {
    /*
     * x-ms-original-file:
     * specification/network/resource-manager/Microsoft.Network/stable/2024-07-01/examples/ExpressRouteGatewayDelete.
     * json
     */
    /**
     * Sample code: ExpressRouteGatewayDelete.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void expressRouteGatewayDelete(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.networks()
            .manager()
            .serviceClient()
            .getExpressRouteGateways()
            .delete("resourceGroupName", "expressRouteGatewayName", com.azure.core.util.Context.NONE);
    }
}
