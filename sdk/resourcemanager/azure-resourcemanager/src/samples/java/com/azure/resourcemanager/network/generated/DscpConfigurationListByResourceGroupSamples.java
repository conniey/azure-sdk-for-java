// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated;

/**
 * Samples for DscpConfiguration ListByResourceGroup.
 */
public final class DscpConfigurationListByResourceGroupSamples {
    /*
     * x-ms-original-file:
     * specification/network/resource-manager/Microsoft.Network/stable/2024-07-01/examples/DscpConfigurationList.json
     */
    /**
     * Sample code: Get Dscp Configuration.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void getDscpConfiguration(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.networks()
            .manager()
            .serviceClient()
            .getDscpConfigurations()
            .listByResourceGroup("rg1", com.azure.core.util.Context.NONE);
    }
}
