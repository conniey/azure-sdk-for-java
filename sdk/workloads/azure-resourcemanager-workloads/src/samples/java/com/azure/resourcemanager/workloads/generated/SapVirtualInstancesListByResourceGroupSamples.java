// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.workloads.generated;

/**
 * Samples for SapVirtualInstances ListByResourceGroup.
 */
public final class SapVirtualInstancesListByResourceGroupSamples {
    /*
     * x-ms-original-file:
     * specification/workloads/resource-manager/Microsoft.Workloads/stable/2023-04-01/examples/sapvirtualinstances/
     * SAPVirtualInstances_ListByResourceGroup.json
     */
    /**
     * Sample code: SAPVirtualInstances_ListByResourceGroup.
     * 
     * @param manager Entry point to WorkloadsManager.
     */
    public static void
        sAPVirtualInstancesListByResourceGroup(com.azure.resourcemanager.workloads.WorkloadsManager manager) {
        manager.sapVirtualInstances().listByResourceGroup("test-rg", com.azure.core.util.Context.NONE);
    }
}
