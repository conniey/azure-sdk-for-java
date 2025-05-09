// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.logz.generated;

/**
 * Samples for SubAccount Get.
 */
public final class SubAccountGetSamples {
    /*
     * x-ms-original-file:
     * specification/logz/resource-manager/Microsoft.Logz/stable/2020-10-01/examples/SubAccount_Get.json
     */
    /**
     * Sample code: SubAccount_Get.
     * 
     * @param manager Entry point to LogzManager.
     */
    public static void subAccountGet(com.azure.resourcemanager.logz.LogzManager manager) {
        manager.subAccounts()
            .getWithResponse("myResourceGroup", "myMonitor", "SubAccount1", com.azure.core.util.Context.NONE);
    }
}
