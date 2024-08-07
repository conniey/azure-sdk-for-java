// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridcompute.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.hybridcompute.fluent.models.PatchSettings;
import com.azure.resourcemanager.hybridcompute.models.AssessmentModeTypes;
import com.azure.resourcemanager.hybridcompute.models.PatchModeTypes;
import org.junit.jupiter.api.Assertions;

public final class PatchSettingsTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        PatchSettings model = BinaryData.fromString(
            "{\"assessmentMode\":\"ImageDefault\",\"patchMode\":\"AutomaticByOS\",\"enableHotpatching\":true,\"status\":{\"hotpatchEnablementStatus\":\"Enabled\"}}")
            .toObject(PatchSettings.class);
        Assertions.assertEquals(AssessmentModeTypes.IMAGE_DEFAULT, model.assessmentMode());
        Assertions.assertEquals(PatchModeTypes.AUTOMATIC_BY_OS, model.patchMode());
        Assertions.assertEquals(true, model.enableHotpatching());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        PatchSettings model = new PatchSettings().withAssessmentMode(AssessmentModeTypes.IMAGE_DEFAULT)
            .withPatchMode(PatchModeTypes.AUTOMATIC_BY_OS)
            .withEnableHotpatching(true);
        model = BinaryData.fromObject(model).toObject(PatchSettings.class);
        Assertions.assertEquals(AssessmentModeTypes.IMAGE_DEFAULT, model.assessmentMode());
        Assertions.assertEquals(PatchModeTypes.AUTOMATIC_BY_OS, model.patchMode());
        Assertions.assertEquals(true, model.enableHotpatching());
    }
}
