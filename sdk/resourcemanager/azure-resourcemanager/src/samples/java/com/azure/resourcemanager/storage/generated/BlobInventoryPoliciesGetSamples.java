// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storage.generated;

import com.azure.resourcemanager.storage.models.BlobInventoryPolicyName;

/**
 * Samples for BlobInventoryPolicies Get.
 */
public final class BlobInventoryPoliciesGetSamples {
    /*
     * x-ms-original-file: specification/storage/resource-manager/Microsoft.Storage/stable/2024-01-01/examples/
     * StorageAccountGetBlobInventoryPolicy.json
     */
    /**
     * Sample code: StorageAccountGetBlobInventoryPolicy.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void storageAccountGetBlobInventoryPolicy(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.storageAccounts()
            .manager()
            .serviceClient()
            .getBlobInventoryPolicies()
            .getWithResponse("res7687", "sto9699", BlobInventoryPolicyName.DEFAULT, com.azure.core.util.Context.NONE);
    }
}
