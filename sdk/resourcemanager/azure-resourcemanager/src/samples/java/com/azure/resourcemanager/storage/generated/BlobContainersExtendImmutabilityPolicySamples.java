// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storage.generated;

import com.azure.resourcemanager.storage.fluent.models.ImmutabilityPolicyInner;

/**
 * Samples for BlobContainers ExtendImmutabilityPolicy.
 */
public final class BlobContainersExtendImmutabilityPolicySamples {
    /*
     * x-ms-original-file: specification/storage/resource-manager/Microsoft.Storage/stable/2024-01-01/examples/
     * BlobContainersExtendImmutabilityPolicy.json
     */
    /**
     * Sample code: ExtendImmutabilityPolicy.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void extendImmutabilityPolicy(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.storageAccounts()
            .manager()
            .serviceClient()
            .getBlobContainers()
            .extendImmutabilityPolicyWithResponse("res6238", "sto232", "container5023", "8d59f830d0c3bf9",
                new ImmutabilityPolicyInner().withImmutabilityPeriodSinceCreationInDays(100),
                com.azure.core.util.Context.NONE);
    }
}
