// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.neonpostgres.generated;

import com.azure.resourcemanager.neonpostgres.models.Attributes;
import com.azure.resourcemanager.neonpostgres.models.ComputeProperties;
import java.util.Arrays;

/**
 * Samples for Computes CreateOrUpdate.
 */
public final class ComputesCreateOrUpdateSamples {
    /*
     * x-ms-original-file: 2025-03-01/Computes_CreateOrUpdate_MaximumSet_Gen.json
     */
    /**
     * Sample code: Computes_CreateOrUpdate_MaximumSet.
     * 
     * @param manager Entry point to NeonPostgresManager.
     */
    public static void
        computesCreateOrUpdateMaximumSet(com.azure.resourcemanager.neonpostgres.NeonPostgresManager manager) {
        manager.computes()
            .define("entity-name")
            .withExistingBranche("rgneon", "test-org", "entity-name", "entity-name")
            .withProperties(new ComputeProperties().withEntityName("entity-name")
                .withAttributes(Arrays.asList(new Attributes().withName("trhvzyvaqy").withValue("evpkgsskyavybxwwssm")))
                .withRegion("mcfyojzptdliawyuxyxzqxif")
                .withCpuCores(29)
                .withMemory(2)
                .withStatus("upwdpznysuwt"))
            .create();
    }
}
