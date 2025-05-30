// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datadog.generated;

/**
 * Samples for Operations List.
 */
public final class OperationsListSamples {
    /*
     * x-ms-original-file:
     * specification/datadog/resource-manager/Microsoft.Datadog/stable/2023-01-01/examples/Operations_List.json
     */
    /**
     * Sample code: Operations_List.
     * 
     * @param manager Entry point to MicrosoftDatadogManager.
     */
    public static void operationsList(com.azure.resourcemanager.datadog.MicrosoftDatadogManager manager) {
        manager.operations().list(com.azure.core.util.Context.NONE);
    }
}
