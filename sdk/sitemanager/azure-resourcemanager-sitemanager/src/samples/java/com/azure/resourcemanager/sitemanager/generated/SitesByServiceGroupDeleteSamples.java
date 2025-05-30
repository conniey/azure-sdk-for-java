// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.sitemanager.generated;

/**
 * Samples for SitesByServiceGroup Delete.
 */
public final class SitesByServiceGroupDeleteSamples {
    /*
     * x-ms-original-file: 2025-03-01-preview/SitesByServiceGroup_Delete_MaximumSet_Gen.json
     */
    /**
     * Sample code: SitesByServiceGroup_Delete - generated by [MaximumSet] rule.
     * 
     * @param manager Entry point to SiteManagerManager.
     */
    public static void sitesByServiceGroupDeleteGeneratedByMaximumSetRule(
        com.azure.resourcemanager.sitemanager.SiteManagerManager manager) {
        manager.sitesByServiceGroups()
            .deleteByResourceGroupWithResponse("string", "string", com.azure.core.util.Context.NONE);
    }
}
