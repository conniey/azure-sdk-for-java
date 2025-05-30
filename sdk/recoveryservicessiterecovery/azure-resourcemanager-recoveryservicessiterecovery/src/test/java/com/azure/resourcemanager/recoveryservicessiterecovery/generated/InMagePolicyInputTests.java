// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.InMagePolicyInput;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.SetMultiVmSyncStatus;
import org.junit.jupiter.api.Assertions;

public final class InMagePolicyInputTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        InMagePolicyInput model = BinaryData.fromString(
            "{\"instanceType\":\"InMage\",\"recoveryPointThresholdInMinutes\":494982728,\"recoveryPointHistory\":90618717,\"appConsistentFrequencyInMinutes\":1509898025,\"multiVmSyncStatus\":\"Enable\"}")
            .toObject(InMagePolicyInput.class);
        Assertions.assertEquals(494982728, model.recoveryPointThresholdInMinutes());
        Assertions.assertEquals(90618717, model.recoveryPointHistory());
        Assertions.assertEquals(1509898025, model.appConsistentFrequencyInMinutes());
        Assertions.assertEquals(SetMultiVmSyncStatus.ENABLE, model.multiVmSyncStatus());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        InMagePolicyInput model = new InMagePolicyInput().withRecoveryPointThresholdInMinutes(494982728)
            .withRecoveryPointHistory(90618717)
            .withAppConsistentFrequencyInMinutes(1509898025)
            .withMultiVmSyncStatus(SetMultiVmSyncStatus.ENABLE);
        model = BinaryData.fromObject(model).toObject(InMagePolicyInput.class);
        Assertions.assertEquals(494982728, model.recoveryPointThresholdInMinutes());
        Assertions.assertEquals(90618717, model.recoveryPointHistory());
        Assertions.assertEquals(1509898025, model.appConsistentFrequencyInMinutes());
        Assertions.assertEquals(SetMultiVmSyncStatus.ENABLE, model.multiVmSyncStatus());
    }
}
