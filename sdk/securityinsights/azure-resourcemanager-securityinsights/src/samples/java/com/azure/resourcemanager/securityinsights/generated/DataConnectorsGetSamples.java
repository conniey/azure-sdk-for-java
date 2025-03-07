// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.securityinsights.generated;

/**
 * Samples for DataConnectors Get.
 */
public final class DataConnectorsGetSamples {
    /*
     * x-ms-original-file:
     * specification/securityinsights/resource-manager/Microsoft.SecurityInsights/stable/2022-11-01/examples/
     * dataConnectors/GetAzureSecurityCenterById.json
     */
    /**
     * Sample code: Get a ASC data connector.
     * 
     * @param manager Entry point to SecurityInsightsManager.
     */
    public static void
        getAASCDataConnector(com.azure.resourcemanager.securityinsights.SecurityInsightsManager manager) {
        manager.dataConnectors()
            .getWithResponse("myRg", "myWorkspace", "763f9fa1-c2d3-4fa2-93e9-bccd4899aa12",
                com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file:
     * specification/securityinsights/resource-manager/Microsoft.SecurityInsights/stable/2022-11-01/examples/
     * dataConnectors/GetOfficeDataConnetorById.json
     */
    /**
     * Sample code: Get an Office365 data connector.
     * 
     * @param manager Entry point to SecurityInsightsManager.
     */
    public static void
        getAnOffice365DataConnector(com.azure.resourcemanager.securityinsights.SecurityInsightsManager manager) {
        manager.dataConnectors()
            .getWithResponse("myRg", "myWorkspace", "73e01a99-5cd7-4139-a149-9f2736ff2ab5",
                com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file:
     * specification/securityinsights/resource-manager/Microsoft.SecurityInsights/stable/2022-11-01/examples/
     * dataConnectors/GetMicrosoftCloudAppSecurityById.json
     */
    /**
     * Sample code: Get a MCAS data connector.
     * 
     * @param manager Entry point to SecurityInsightsManager.
     */
    public static void
        getAMCASDataConnector(com.azure.resourcemanager.securityinsights.SecurityInsightsManager manager) {
        manager.dataConnectors()
            .getWithResponse("myRg", "myWorkspace", "b96d014d-b5c2-4a01-9aba-a8058f629d42",
                com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file:
     * specification/securityinsights/resource-manager/Microsoft.SecurityInsights/stable/2022-11-01/examples/
     * dataConnectors/GetAmazonWebServicesCloudTrailById.json
     */
    /**
     * Sample code: Get an AwsCloudTrail data connector.
     * 
     * @param manager Entry point to SecurityInsightsManager.
     */
    public static void
        getAnAwsCloudTrailDataConnector(com.azure.resourcemanager.securityinsights.SecurityInsightsManager manager) {
        manager.dataConnectors()
            .getWithResponse("myRg", "myWorkspace", "c345bf40-8509-4ed2-b947-50cb773aaf04",
                com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file:
     * specification/securityinsights/resource-manager/Microsoft.SecurityInsights/stable/2022-11-01/examples/
     * dataConnectors/GetAzureAdvancedThreatProtectionById.json
     */
    /**
     * Sample code: Get an AATP data connector.
     * 
     * @param manager Entry point to SecurityInsightsManager.
     */
    public static void
        getAnAATPDataConnector(com.azure.resourcemanager.securityinsights.SecurityInsightsManager manager) {
        manager.dataConnectors()
            .getWithResponse("myRg", "myWorkspace", "07e42cb3-e658-4e90-801c-efa0f29d3d44",
                com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file:
     * specification/securityinsights/resource-manager/Microsoft.SecurityInsights/stable/2022-11-01/examples/
     * dataConnectors/GetMicrosoftDefenderAdvancedThreatProtectionById.json
     */
    /**
     * Sample code: Get a MDATP data connector.
     * 
     * @param manager Entry point to SecurityInsightsManager.
     */
    public static void
        getAMDATPDataConnector(com.azure.resourcemanager.securityinsights.SecurityInsightsManager manager) {
        manager.dataConnectors()
            .getWithResponse("myRg", "myWorkspace", "06b3ccb8-1384-4bcc-aec7-852f6d57161b",
                com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file:
     * specification/securityinsights/resource-manager/Microsoft.SecurityInsights/stable/2022-11-01/examples/
     * dataConnectors/GetThreatIntelligenceById.json
     */
    /**
     * Sample code: Get a TI data connector.
     * 
     * @param manager Entry point to SecurityInsightsManager.
     */
    public static void getATIDataConnector(com.azure.resourcemanager.securityinsights.SecurityInsightsManager manager) {
        manager.dataConnectors()
            .getWithResponse("myRg", "myWorkspace", "c345bf40-8509-4ed2-b947-50cb773aaf04",
                com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file:
     * specification/securityinsights/resource-manager/Microsoft.SecurityInsights/stable/2022-11-01/examples/
     * dataConnectors/GetAzureActiveDirectoryById.json
     */
    /**
     * Sample code: Get an AAD data connector.
     * 
     * @param manager Entry point to SecurityInsightsManager.
     */
    public static void
        getAnAADDataConnector(com.azure.resourcemanager.securityinsights.SecurityInsightsManager manager) {
        manager.dataConnectors()
            .getWithResponse("myRg", "myWorkspace", "f0cd27d2-5f03-4c06-ba31-d2dc82dcb51d",
                com.azure.core.util.Context.NONE);
    }
}
