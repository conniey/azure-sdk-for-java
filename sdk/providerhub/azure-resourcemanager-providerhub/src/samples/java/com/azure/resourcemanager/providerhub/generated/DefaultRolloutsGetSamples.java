// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.providerhub.generated;

/**
 * Samples for DefaultRollouts Get.
 */
public final class DefaultRolloutsGetSamples {
    /*
     * x-ms-original-file:
     * specification/providerhub/resource-manager/Microsoft.ProviderHub/stable/2024-09-01/examples/DefaultRollouts_Get.
     * json
     */
    /**
     * Sample code: DefaultRollouts_Get.
     * 
     * @param manager Entry point to ProviderHubManager.
     */
    public static void defaultRolloutsGet(com.azure.resourcemanager.providerhub.ProviderHubManager manager) {
        manager.defaultRollouts().getWithResponse("Microsoft.Contoso", "2020week10", com.azure.core.util.Context.NONE);
    }
}
