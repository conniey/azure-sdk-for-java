// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.generated;

/**
 * Samples for Authorization ListByAuthorizationProvider.
 */
public final class AuthorizationListByAuthorizationProviderSamples {
    /*
     * x-ms-original-file:
     * specification/apimanagement/resource-manager/Microsoft.ApiManagement/stable/2024-05-01/examples/
     * ApiManagementListAuthorizationsClientCred.json
     */
    /**
     * Sample code: ApiManagementListAuthorizationsClientCred.
     * 
     * @param manager Entry point to ApiManagementManager.
     */
    public static void apiManagementListAuthorizationsClientCred(
        com.azure.resourcemanager.apimanagement.ApiManagementManager manager) {
        manager.authorizations()
            .listByAuthorizationProvider("rg1", "apimService1", "aadwithclientcred", null, null, null,
                com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file:
     * specification/apimanagement/resource-manager/Microsoft.ApiManagement/stable/2024-05-01/examples/
     * ApiManagementListAuthorizationsAuthCode.json
     */
    /**
     * Sample code: ApiManagementListAuthorizationsAuthCode.
     * 
     * @param manager Entry point to ApiManagementManager.
     */
    public static void
        apiManagementListAuthorizationsAuthCode(com.azure.resourcemanager.apimanagement.ApiManagementManager manager) {
        manager.authorizations()
            .listByAuthorizationProvider("rg1", "apimService1", "aadwithauthcode", null, null, null,
                com.azure.core.util.Context.NONE);
    }
}
