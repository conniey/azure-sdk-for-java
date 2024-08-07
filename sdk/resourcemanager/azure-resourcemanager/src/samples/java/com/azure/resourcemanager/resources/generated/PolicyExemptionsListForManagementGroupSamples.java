// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resources.generated;

/**
 * Samples for PolicyExemptions ListForManagementGroup.
 */
public final class PolicyExemptionsListForManagementGroupSamples {
    /*
     * x-ms-original-file:
     * specification/resources/resource-manager/Microsoft.Authorization/preview/2022-07-01-preview/examples/
     * listPolicyExemptionsForManagementGroup.json
     */
    /**
     * Sample code: List policy exemptions that apply to a management group.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void
        listPolicyExemptionsThatApplyToAManagementGroup(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.genericResources()
            .manager()
            .policyClient()
            .getPolicyExemptions()
            .listForManagementGroup("DevOrg", "atScope()", com.azure.core.util.Context.NONE);
    }
}
