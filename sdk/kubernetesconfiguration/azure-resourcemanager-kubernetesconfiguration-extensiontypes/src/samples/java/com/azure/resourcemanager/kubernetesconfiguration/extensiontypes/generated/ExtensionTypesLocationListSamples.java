// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.kubernetesconfiguration.extensiontypes.generated;

/**
 * Samples for ExtensionTypes LocationList.
 */
public final class ExtensionTypesLocationListSamples {
    /*
     * x-ms-original-file:
     * specification/kubernetesconfiguration/resource-manager/Microsoft.KubernetesConfiguration/extensionTypes/preview/
     * 2024-11-01-preview/examples/ListExtensionTypesByLocation.json
     */
    /**
     * Sample code: List Extension Types.
     * 
     * @param manager Entry point to ExtensionTypesManager.
     */
    public static void listExtensionTypes(
        com.azure.resourcemanager.kubernetesconfiguration.extensiontypes.ExtensionTypesManager manager) {
        manager.extensionTypes()
            .locationList("westus2", "myPublisherId", "myOfferId", "myPlanId", "stable", "connectedCluster",
                com.azure.core.util.Context.NONE);
    }
}
