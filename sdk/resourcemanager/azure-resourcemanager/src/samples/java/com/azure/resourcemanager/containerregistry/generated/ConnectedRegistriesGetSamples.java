// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerregistry.generated;

/**
 * Samples for ConnectedRegistries Get.
 */
public final class ConnectedRegistriesGetSamples {
    /*
     * x-ms-original-file:
     * specification/containerregistry/resource-manager/Microsoft.ContainerRegistry/stable/2025-04-01/examples/
     * ConnectedRegistryGet.json
     */
    /**
     * Sample code: ConnectedRegistryGet.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void connectedRegistryGet(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.containerRegistries()
            .manager()
            .serviceClient()
            .getConnectedRegistries()
            .getWithResponse("myResourceGroup", "myRegistry", "myConnectedRegistry", com.azure.core.util.Context.NONE);
    }
}
