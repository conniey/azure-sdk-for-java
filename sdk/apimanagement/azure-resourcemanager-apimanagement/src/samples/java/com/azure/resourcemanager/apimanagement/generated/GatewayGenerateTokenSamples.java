// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.generated;

import com.azure.resourcemanager.apimanagement.models.GatewayTokenRequestContract;
import com.azure.resourcemanager.apimanagement.models.KeyType;
import java.time.OffsetDateTime;

/**
 * Samples for Gateway GenerateToken.
 */
public final class GatewayGenerateTokenSamples {
    /*
     * x-ms-original-file:
     * specification/apimanagement/resource-manager/Microsoft.ApiManagement/stable/2024-05-01/examples/
     * ApiManagementGatewayGenerateToken.json
     */
    /**
     * Sample code: ApiManagementGatewayGenerateToken.
     * 
     * @param manager Entry point to ApiManagementManager.
     */
    public static void
        apiManagementGatewayGenerateToken(com.azure.resourcemanager.apimanagement.ApiManagementManager manager) {
        manager.gateways()
            .generateTokenWithResponse("rg1", "apimService1", "gw1",
                new GatewayTokenRequestContract().withKeyType(KeyType.PRIMARY)
                    .withExpiry(OffsetDateTime.parse("2020-04-21T00:44:24.2845269Z")),
                com.azure.core.util.Context.NONE);
    }
}
