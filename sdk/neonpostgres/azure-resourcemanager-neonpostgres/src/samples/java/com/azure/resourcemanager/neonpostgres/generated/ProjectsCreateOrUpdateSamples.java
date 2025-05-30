// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.neonpostgres.generated;

import com.azure.resourcemanager.neonpostgres.models.Attributes;
import com.azure.resourcemanager.neonpostgres.models.BranchProperties;
import com.azure.resourcemanager.neonpostgres.models.DefaultEndpointSettings;
import com.azure.resourcemanager.neonpostgres.models.EndpointProperties;
import com.azure.resourcemanager.neonpostgres.models.EndpointType;
import com.azure.resourcemanager.neonpostgres.models.NeonDatabaseProperties;
import com.azure.resourcemanager.neonpostgres.models.NeonRoleProperties;
import com.azure.resourcemanager.neonpostgres.models.ProjectProperties;
import java.util.Arrays;

/**
 * Samples for Projects CreateOrUpdate.
 */
public final class ProjectsCreateOrUpdateSamples {
    /*
     * x-ms-original-file: 2025-03-01/Projects_CreateOrUpdate_MaximumSet_Gen.json
     */
    /**
     * Sample code: Projects_CreateOrUpdate_MaximumSet - generated by [MaximumSet] rule - generated by [MaximumSet]
     * rule.
     * 
     * @param manager Entry point to NeonPostgresManager.
     */
    public static void projectsCreateOrUpdateMaximumSetGeneratedByMaximumSetRuleGeneratedByMaximumSetRule(
        com.azure.resourcemanager.neonpostgres.NeonPostgresManager manager) {
        manager.projects()
            .define("sample-resource")
            .withExistingOrganization("rgneon", "contoso-org")
            .withProperties(new ProjectProperties().withEntityName("entity-name")
                .withAttributes(Arrays.asList(new Attributes().withName("trhvzyvaqy").withValue("evpkgsskyavybxwwssm")))
                .withRegionId("tlcltldfrnxh")
                .withStorage(7L)
                .withPgVersion(10)
                .withHistoryRetention(7)
                .withDefaultEndpointSettings(
                    new DefaultEndpointSettings().withAutoscalingLimitMinCu(26.0).withAutoscalingLimitMaxCu(20.0))
                .withBranch(new BranchProperties().withEntityName("entity-name")
                    .withAttributes(
                        Arrays.asList(new Attributes().withName("trhvzyvaqy").withValue("evpkgsskyavybxwwssm")))
                    .withProjectId("oik")
                    .withParentId("entity-id")
                    .withRoleName("qrrairsupyosxnqotdwhbpc")
                    .withDatabaseName("duhxebzhd")
                    .withRoles(Arrays.asList(new NeonRoleProperties().withEntityName("entity-name")
                        .withAttributes(
                            Arrays.asList(new Attributes().withName("trhvzyvaqy").withValue("evpkgsskyavybxwwssm")))
                        .withBranchId("wxbojkmdgaggkfiwqfakdkbyztm")
                        .withPermissions(Arrays.asList("myucqecpjriewzohxvadgkhiudnyx"))
                        .withIsSuperUser(true)))
                    .withDatabases(Arrays.asList(new NeonDatabaseProperties().withEntityName("entity-name")
                        .withAttributes(
                            Arrays.asList(new Attributes().withName("trhvzyvaqy").withValue("evpkgsskyavybxwwssm")))
                        .withBranchId("orfdwdmzvfvlnrgussvcvoek")
                        .withOwnerName("odmbeg")))
                    .withEndpoints(Arrays.asList(new EndpointProperties().withEntityName("entity-name")
                        .withAttributes(
                            Arrays.asList(new Attributes().withName("trhvzyvaqy").withValue("evpkgsskyavybxwwssm")))
                        .withProjectId("rtvdeeflqzlrpfzhjqhcsfbldw")
                        .withBranchId("rzsyrhpfbydxtfkpaa")
                        .withEndpointType(EndpointType.READ_ONLY))))
                .withRoles(Arrays.asList(new NeonRoleProperties().withEntityName("entity-name")
                    .withAttributes(
                        Arrays.asList(new Attributes().withName("trhvzyvaqy").withValue("evpkgsskyavybxwwssm")))
                    .withBranchId("wxbojkmdgaggkfiwqfakdkbyztm")
                    .withPermissions(Arrays.asList("myucqecpjriewzohxvadgkhiudnyx"))
                    .withIsSuperUser(true)))
                .withDatabases(Arrays.asList(new NeonDatabaseProperties().withEntityName("entity-name")
                    .withAttributes(
                        Arrays.asList(new Attributes().withName("trhvzyvaqy").withValue("evpkgsskyavybxwwssm")))
                    .withBranchId("orfdwdmzvfvlnrgussvcvoek")
                    .withOwnerName("odmbeg")))
                .withEndpoints(Arrays.asList(new EndpointProperties().withEntityName("entity-name")
                    .withAttributes(
                        Arrays.asList(new Attributes().withName("trhvzyvaqy").withValue("evpkgsskyavybxwwssm")))
                    .withProjectId("rtvdeeflqzlrpfzhjqhcsfbldw")
                    .withBranchId("rzsyrhpfbydxtfkpaa")
                    .withEndpointType(EndpointType.READ_ONLY))))
            .create();
    }
}
