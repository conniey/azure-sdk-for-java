// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.generated;

/**
 * Samples for WorkspaceBackend Delete.
 */
public final class WorkspaceBackendDeleteSamples {
    /*
     * x-ms-original-file:
     * specification/apimanagement/resource-manager/Microsoft.ApiManagement/stable/2024-05-01/examples/
     * ApiManagementDeleteWorkspaceBackend.json
     */
    /**
     * Sample code: ApiManagementDeleteWorkspaceBackend.
     * 
     * @param manager Entry point to ApiManagementManager.
     */
    public static void
        apiManagementDeleteWorkspaceBackend(com.azure.resourcemanager.apimanagement.ApiManagementManager manager) {
        manager.workspaceBackends()
            .deleteWithResponse("rg1", "apimService1", "wks1", "sfbackend", "*", com.azure.core.util.Context.NONE);
    }
}
