// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.generated;

/**
 * Samples for WorkspaceApiVersionSet Get.
 */
public final class WorkspaceApiVersionSetGetSamples {
    /*
     * x-ms-original-file:
     * specification/apimanagement/resource-manager/Microsoft.ApiManagement/stable/2024-05-01/examples/
     * ApiManagementGetWorkspaceApiVersionSet.json
     */
    /**
     * Sample code: ApiManagementGetWorkspaceApiVersionSet.
     * 
     * @param manager Entry point to ApiManagementManager.
     */
    public static void
        apiManagementGetWorkspaceApiVersionSet(com.azure.resourcemanager.apimanagement.ApiManagementManager manager) {
        manager.workspaceApiVersionSets()
            .getWithResponse("rg1", "apimService1", "wks1", "vs1", com.azure.core.util.Context.NONE);
    }
}
