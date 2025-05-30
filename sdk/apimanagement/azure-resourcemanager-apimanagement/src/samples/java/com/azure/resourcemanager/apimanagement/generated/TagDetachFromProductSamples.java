// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.generated;

/**
 * Samples for Tag DetachFromProduct.
 */
public final class TagDetachFromProductSamples {
    /*
     * x-ms-original-file:
     * specification/apimanagement/resource-manager/Microsoft.ApiManagement/stable/2024-05-01/examples/
     * ApiManagementDeleteProductTag.json
     */
    /**
     * Sample code: ApiManagementDeleteProductTag.
     * 
     * @param manager Entry point to ApiManagementManager.
     */
    public static void
        apiManagementDeleteProductTag(com.azure.resourcemanager.apimanagement.ApiManagementManager manager) {
        manager.tags()
            .detachFromProductWithResponse("rg1", "apimService1", "59d5b28d1f7fab116c282650",
                "59d5b28e1f7fab116402044e", com.azure.core.util.Context.NONE);
    }
}
