// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storage.generated;

/**
 * Samples for StorageTaskAssignmentsInstancesReport List.
 */
public final class StorageTaskAssignmentsInstancesReportListSamples {
    /*
     * x-ms-original-file:
     * specification/storage/resource-manager/Microsoft.Storage/stable/2024-01-01/examples/storageTaskAssignmentsList/
     * ListStorageTaskAssignmentsInstancesReportSummary.json
     */
    /**
     * Sample code: ListStorageTaskAssignmentsInstancesReportSummary.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void
        listStorageTaskAssignmentsInstancesReportSummary(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.storageAccounts()
            .manager()
            .serviceClient()
            .getStorageTaskAssignmentsInstancesReports()
            .list("res4228", "sto4445", null, null, com.azure.core.util.Context.NONE);
    }
}
