// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

/**
 * Samples for IntegrationRuntimes ListByFactorySync.
 */
public final class IntegrationRuntimesListByFactorySyncSamples {
    /*
     * x-ms-original-file: specification/datafactory/resource-manager/Microsoft.DataFactory/stable/2018-06-01/examples/
     * IntegrationRuntimes_ListByFactory.json
     */
    /**
     * Sample code: IntegrationRuntimes_ListByFactory.
     * 
     * @param manager Entry point to DataFactoryManager.
     */
    public static void
        integrationRuntimesListByFactory(com.azure.resourcemanager.datafactory.DataFactoryManager manager) {
        manager.integrationRuntimes()
            .listByFactory("exampleResourceGroup", "exampleFactoryName", com.azure.core.util.Context.NONE);
    }
}
