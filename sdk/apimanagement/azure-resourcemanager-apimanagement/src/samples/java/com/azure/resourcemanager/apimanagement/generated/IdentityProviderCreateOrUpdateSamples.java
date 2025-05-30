// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.generated;

import com.azure.resourcemanager.apimanagement.models.IdentityProviderType;

/**
 * Samples for IdentityProvider CreateOrUpdate.
 */
public final class IdentityProviderCreateOrUpdateSamples {
    /*
     * x-ms-original-file:
     * specification/apimanagement/resource-manager/Microsoft.ApiManagement/stable/2024-05-01/examples/
     * ApiManagementCreateIdentityProvider.json
     */
    /**
     * Sample code: ApiManagementCreateIdentityProvider.
     * 
     * @param manager Entry point to ApiManagementManager.
     */
    public static void
        apiManagementCreateIdentityProvider(com.azure.resourcemanager.apimanagement.ApiManagementManager manager) {
        manager.identityProviders()
            .define(IdentityProviderType.FACEBOOK)
            .withExistingService("rg1", "apimService1")
            .withClientId("facebookid")
            .withClientSecret("facebookapplicationsecret")
            .create();
    }
}
