// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated;

import com.azure.resourcemanager.compute.models.AccessControlRulesMode;
import com.azure.resourcemanager.compute.models.EndpointAccess;
import com.azure.resourcemanager.compute.models.GalleryInVMAccessControlProfileVersionUpdate;
import com.azure.resourcemanager.compute.models.TargetRegion;
import java.util.Arrays;

/**
 * Samples for GalleryInVMAccessControlProfileVersions Update.
 */
public final class GalleryInVMAccessControlProfileVersionsUpdateSamples {
    /*
     * x-ms-original-file:
     * specification/compute/resource-manager/Microsoft.Compute/GalleryRP/stable/2024-03-03/examples/
     * galleryResourceProfileExamples/GalleryInVMAccessControlProfileVersion_Update.json
     */
    /**
     * Sample code: Update a Gallery InVMAccessControlProfile Version.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void
        updateAGalleryInVMAccessControlProfileVersion(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.virtualMachines()
            .manager()
            .serviceClient()
            .getGalleryInVMAccessControlProfileVersions()
            .update("myResourceGroup", "myGalleryName", "myInVMAccessControlProfileName", "1.0.0",
                new GalleryInVMAccessControlProfileVersionUpdate().withMode(AccessControlRulesMode.AUDIT)
                    .withDefaultAccess(EndpointAccess.ALLOW)
                    .withTargetLocations(Arrays.asList(new TargetRegion().withName("West US"),
                        new TargetRegion().withName("South Central US"), new TargetRegion().withName("East US")))
                    .withExcludeFromLatest(false),
                com.azure.core.util.Context.NONE);
    }
}
