// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated;

/**
 * Samples for WorkflowRunActionRepetitionsRequestHistories List.
 */
public final class WorkflowRunActionRepetitionsRequestHistoriesListSamples {
    /*
     * x-ms-original-file: specification/web/resource-manager/Microsoft.Web/stable/2024-11-01/examples/
     * WorkflowRunActionRepetitionsRequestHistories_List.json
     */
    /**
     * Sample code: List repetition request history.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void listRepetitionRequestHistory(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.webApps()
            .manager()
            .serviceClient()
            .getWorkflowRunActionRepetitionsRequestHistories()
            .list("test-resource-group", "test-name", "test-workflow", "08586776228332053161046300351", "HTTP_Webhook",
                "000001", com.azure.core.util.Context.NONE);
    }
}
