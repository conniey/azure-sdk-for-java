// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerservice.generated;

/**
 * Samples for Machines Get.
 */
public final class MachinesGetSamples {
    /*
     * x-ms-original-file:
     * specification/containerservice/resource-manager/Microsoft.ContainerService/aks/stable/2025-05-01/examples/
     * MachineGet.json
     */
    /**
     * Sample code: Get a Machine in an Agent Pools by Managed Cluster.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void getAMachineInAnAgentPoolsByManagedCluster(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.kubernetesClusters()
            .manager()
            .serviceClient()
            .getMachines()
            .getWithResponse("rg1", "clustername1", "agentpool1", "aks-nodepool1-42263519-vmss00000t",
                com.azure.core.util.Context.NONE);
    }
}
