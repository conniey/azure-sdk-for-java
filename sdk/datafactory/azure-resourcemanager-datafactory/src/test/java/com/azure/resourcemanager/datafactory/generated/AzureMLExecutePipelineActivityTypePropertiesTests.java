// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.fluent.models.AzureMLExecutePipelineActivityTypeProperties;

public final class AzureMLExecutePipelineActivityTypePropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AzureMLExecutePipelineActivityTypeProperties model = BinaryData.fromString(
            "{\"mlPipelineId\":\"datapdtzugwurvpcwy\",\"mlPipelineEndpointId\":\"dataqikouravdqe\",\"version\":\"datawgpmademlo\",\"experimentName\":\"dataayk\",\"mlPipelineParameters\":\"datakk\",\"dataPathAssignments\":\"datafhgdvg\",\"mlParentRunId\":\"dataun\",\"continueOnStepFailure\":\"datatz\"}")
            .toObject(AzureMLExecutePipelineActivityTypeProperties.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AzureMLExecutePipelineActivityTypeProperties model
            = new AzureMLExecutePipelineActivityTypeProperties().withMlPipelineId("datapdtzugwurvpcwy")
                .withMlPipelineEndpointId("dataqikouravdqe")
                .withVersion("datawgpmademlo")
                .withExperimentName("dataayk")
                .withMlPipelineParameters("datakk")
                .withDataPathAssignments("datafhgdvg")
                .withMlParentRunId("dataun")
                .withContinueOnStepFailure("datatz");
        model = BinaryData.fromObject(model).toObject(AzureMLExecutePipelineActivityTypeProperties.class);
    }
}
