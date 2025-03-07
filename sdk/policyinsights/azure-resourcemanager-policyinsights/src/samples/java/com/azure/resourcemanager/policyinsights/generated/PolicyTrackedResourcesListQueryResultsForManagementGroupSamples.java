// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.policyinsights.generated;

import com.azure.resourcemanager.policyinsights.models.PolicyTrackedResourcesResourceType;

/**
 * Samples for PolicyTrackedResources ListQueryResultsForManagementGroup.
 */
public final class PolicyTrackedResourcesListQueryResultsForManagementGroupSamples {
    /*
     * x-ms-original-file:
     * specification/policyinsights/resource-manager/Microsoft.PolicyInsights/preview/2018-07-01-preview/examples/
     * PolicyTrackedResources_QueryManagementGroupScopeWithFilterAndTop.json
     */
    /**
     * Sample code: Query at management group scope using query parameters.
     * 
     * @param manager Entry point to PolicyInsightsManager.
     */
    public static void queryAtManagementGroupScopeUsingQueryParameters(
        com.azure.resourcemanager.policyinsights.PolicyInsightsManager manager) {
        manager.policyTrackedResources()
            .listQueryResultsForManagementGroup("myManagementGroup", PolicyTrackedResourcesResourceType.DEFAULT, 1,
                "PolicyAssignmentId eq '/subscriptions/fff8dfdb-fff3-fff0-fff4-fffdcbe6b2ef/resourceGroups/myResourceGroup/providers/Microsoft.Authorization/policyAssignments/myPolicyAssignment' AND TrackedResourceId eq '/subscriptions/fff8dfdb-fff3-fff0-fff4-fffdcbe6b2ef/resourceGroups/myResourceGroup/providers/Microsoft.Example/exampleResourceType/exampleTrackedResourceName'",
                com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file:
     * specification/policyinsights/resource-manager/Microsoft.PolicyInsights/preview/2018-07-01-preview/examples/
     * PolicyTrackedResources_QueryManagementGroupScope.json
     */
    /**
     * Sample code: Query at management group scope.
     * 
     * @param manager Entry point to PolicyInsightsManager.
     */
    public static void
        queryAtManagementGroupScope(com.azure.resourcemanager.policyinsights.PolicyInsightsManager manager) {
        manager.policyTrackedResources()
            .listQueryResultsForManagementGroup("myManagementGroup", PolicyTrackedResourcesResourceType.DEFAULT, null,
                null, com.azure.core.util.Context.NONE);
    }
}
