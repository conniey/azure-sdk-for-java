// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurestackhci.generated;

import com.azure.resourcemanager.azurestackhci.models.ValidateRequest;
import java.util.Arrays;

/**
 * Samples for EdgeDevices Validate.
 */
public final class EdgeDevicesValidateSamples {
    /*
     * x-ms-original-file:
     * specification/azurestackhci/resource-manager/Microsoft.AzureStackHCI/StackHCI/stable/2024-04-01/examples/
     * ValidateEdgeDevices.json
     */
    /**
     * Sample code: Validate Edge Devices.
     * 
     * @param manager Entry point to AzureStackHciManager.
     */
    public static void validateEdgeDevices(com.azure.resourcemanager.azurestackhci.AzureStackHciManager manager) {
        manager.edgeDevices()
            .validate(
                "subscriptions/fd3c3665-1729-4b7b-9a38-238e83b0f98b/resourceGroups/ArcInstance-rg/providers/Microsoft.HybridCompute/machines/Node-1",
                "default",
                new ValidateRequest().withEdgeDeviceIds(Arrays.asList(
                    "/subscriptions/fd3c3665-1729-4b7b-9a38-238e83b0f98b/resourceGroups/ArcInstance-rg/providers/Microsoft.HybridCompute/machines/Node-1/edgeDevices/default",
                    "/subscriptions/fd3c3665-1729-4b7b-9a38-238e83b0f98b/resourceGroups/ArcInstance-rg/providers/Microsoft.HybridCompute/machines/Node-2/edgeDevices/default"))
                    .withAdditionalInfo("test"),
                com.azure.core.util.Context.NONE);
    }
}
