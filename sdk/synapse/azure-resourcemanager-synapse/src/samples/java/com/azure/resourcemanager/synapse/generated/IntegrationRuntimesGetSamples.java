// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.generated;

/**
 * Samples for IntegrationRuntimes Get.
 */
public final class IntegrationRuntimesGetSamples {
    /*
     * x-ms-original-file:
     * specification/synapse/resource-manager/Microsoft.Synapse/stable/2021-03-01/examples/IntegrationRuntimes_Get.json
     */
    /**
     * Sample code: Get integration runtime.
     * 
     * @param manager Entry point to SynapseManager.
     */
    public static void getIntegrationRuntime(com.azure.resourcemanager.synapse.SynapseManager manager) {
        manager.integrationRuntimes()
            .getWithResponse("exampleResourceGroup", "exampleWorkspace", "exampleIntegrationRuntime", null,
                com.azure.core.util.Context.NONE);
    }
}
