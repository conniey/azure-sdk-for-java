// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.migration.assessment.generated;

/**
 * Samples for ServerCollectorsOperations ListByAssessmentProject.
 */
public final class ServerCollectorsOperationsListByAssessmentProjectSamples {
    /*
     * x-ms-original-file:
     * specification/migrate/resource-manager/Microsoft.Migrate/AssessmentProjects/stable/2023-03-15/examples/
     * ServerCollectorsOperations_ListByAssessmentProject_MaximumSet_Gen.json
     */
    /**
     * Sample code: ServerCollectorsOperations_ListByAssessmentProject_MaximumSet_Gen.
     * 
     * @param manager Entry point to MigrationAssessmentManager.
     */
    public static void serverCollectorsOperationsListByAssessmentProjectMaximumSetGen(
        com.azure.resourcemanager.migration.assessment.MigrationAssessmentManager manager) {
        manager.serverCollectorsOperations()
            .listByAssessmentProject("ayagrawRG", "app18700project", com.azure.core.util.Context.NONE);
    }
}
