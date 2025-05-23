// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.kubernetesconfiguration.generated;

/**
 * Samples for SourceControlConfigurations Get.
 */
public final class SourceControlConfigurationsGetSamples {
    /*
     * x-ms-original-file:
     * specification/kubernetesconfiguration/resource-manager/Microsoft.KubernetesConfiguration/stable/2023-05-01/
     * examples/GetSourceControlConfiguration.json
     */
    /**
     * Sample code: Get Source Control Configuration.
     * 
     * @param manager Entry point to SourceControlConfigurationManager.
     */
    public static void getSourceControlConfiguration(
        com.azure.resourcemanager.kubernetesconfiguration.SourceControlConfigurationManager manager) {
        manager.sourceControlConfigurations()
            .getWithResponse("rg1", "Microsoft.Kubernetes", "connectedClusters", "clusterName1", "SRS_GitHubConfig",
                com.azure.core.util.Context.NONE);
    }
}
