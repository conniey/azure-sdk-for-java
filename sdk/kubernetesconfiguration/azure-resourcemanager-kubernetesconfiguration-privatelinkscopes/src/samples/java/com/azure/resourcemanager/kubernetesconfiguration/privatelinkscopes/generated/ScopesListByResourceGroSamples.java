// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.kubernetesconfiguration.privatelinkscopes.generated;

/**
 * Samples for Scopes ListByResourceGroup.
 */
public final class ScopesListByResourceGroSamples {
    /*
     * x-ms-original-file:
     * specification/kubernetesconfiguration/resource-manager/Microsoft.KubernetesConfiguration/privateLinkScopes/
     * preview/2024-11-01-preview/examples/PrivateLinkScopesListByResourceGroup.json
     */
    /**
     * Sample code: PrivateLinkScopeListByResourceGroup.
     * 
     * @param manager Entry point to ScopeManager.
     */
    public static void privateLinkScopeListByResourceGroup(
        com.azure.resourcemanager.kubernetesconfiguration.privatelinkscopes.ScopeManager manager) {
        manager.scopes().listByResourceGroup("my-resource-group", com.azure.core.util.Context.NONE);
    }
}
