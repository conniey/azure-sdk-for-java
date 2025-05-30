// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated;

/**
 * Samples for VirtualNetworkGateways GetBgpPeerStatus.
 */
public final class VirtualNetworkGatewaysGetBgpPeerStatusSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2024-07-01/examples/
     * VirtualNetworkGatewayGetBGPPeerStatus.json
     */
    /**
     * Sample code: GetVirtualNetworkGatewayBGPPeerStatus.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void getVirtualNetworkGatewayBGPPeerStatus(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.networks()
            .manager()
            .serviceClient()
            .getVirtualNetworkGateways()
            .getBgpPeerStatus("rg1", "vpngw", null, com.azure.core.util.Context.NONE);
    }
}
