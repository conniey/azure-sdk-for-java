// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.RecoveryPlanActionLocation;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.RecoveryPlanAutomationRunbookActionDetails;
import org.junit.jupiter.api.Assertions;

public final class RecoveryPlanAutomationRunbookActionDetailsTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        RecoveryPlanAutomationRunbookActionDetails model = BinaryData.fromString(
            "{\"instanceType\":\"AutomationRunbookActionDetails\",\"runbookId\":\"yftgpqoswgfqv\",\"timeout\":\"ghpakbqyhlsorn\",\"fabricLocation\":\"Primary\"}")
            .toObject(RecoveryPlanAutomationRunbookActionDetails.class);
        Assertions.assertEquals("yftgpqoswgfqv", model.runbookId());
        Assertions.assertEquals("ghpakbqyhlsorn", model.timeout());
        Assertions.assertEquals(RecoveryPlanActionLocation.PRIMARY, model.fabricLocation());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        RecoveryPlanAutomationRunbookActionDetails model
            = new RecoveryPlanAutomationRunbookActionDetails().withRunbookId("yftgpqoswgfqv")
                .withTimeout("ghpakbqyhlsorn")
                .withFabricLocation(RecoveryPlanActionLocation.PRIMARY);
        model = BinaryData.fromObject(model).toObject(RecoveryPlanAutomationRunbookActionDetails.class);
        Assertions.assertEquals("yftgpqoswgfqv", model.runbookId());
        Assertions.assertEquals("ghpakbqyhlsorn", model.timeout());
        Assertions.assertEquals(RecoveryPlanActionLocation.PRIMARY, model.fabricLocation());
    }
}
