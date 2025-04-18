// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.generated;

/**
 * Samples for Library Get.
 */
public final class LibraryGetSamples {
    /*
     * x-ms-original-file:
     * specification/synapse/resource-manager/Microsoft.Synapse/stable/2021-03-01/examples/Library_Get.json
     */
    /**
     * Sample code: Get Library by name.
     * 
     * @param manager Entry point to SynapseManager.
     */
    public static void getLibraryByName(com.azure.resourcemanager.synapse.SynapseManager manager) {
        manager.libraries()
            .getWithResponse("exampleResourceGroup", "exampleLibraryName.jar", "exampleWorkspace",
                com.azure.core.util.Context.NONE);
    }
}
