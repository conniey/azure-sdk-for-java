// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apicenter.generated;

/**
 * Samples for Workspaces Head.
 */
public final class WorkspacesHeadSamples {
    /*
     * x-ms-original-file:
     * specification/apicenter/resource-manager/Microsoft.ApiCenter/stable/2024-03-01/examples/Workspaces_Head.json
     */
    /**
     * Sample code: Workspaces_Head.
     * 
     * @param manager Entry point to ApiCenterManager.
     */
    public static void workspacesHead(com.azure.resourcemanager.apicenter.ApiCenterManager manager) {
        manager.workspaces()
            .headWithResponse("contoso-resources", "contoso", "default", com.azure.core.util.Context.NONE);
    }
}
