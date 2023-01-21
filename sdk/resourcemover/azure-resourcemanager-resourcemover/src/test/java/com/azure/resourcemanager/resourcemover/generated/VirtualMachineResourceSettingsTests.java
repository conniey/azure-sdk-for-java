// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resourcemover.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.resourcemover.models.TargetAvailabilityZone;
import com.azure.resourcemanager.resourcemover.models.VirtualMachineResourceSettings;
import org.junit.jupiter.api.Assertions;

public final class VirtualMachineResourceSettingsTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        VirtualMachineResourceSettings model =
            BinaryData
                .fromString(
                    "{\"resourceType\":\"Microsoft.Compute/virtualMachines\",\"targetAvailabilityZone\":\"1\",\"targetVmSize\":\"sonpclhocohs\",\"targetAvailabilitySetId\":\"ev\",\"targetResourceName\":\"eggzfb\"}")
                .toObject(VirtualMachineResourceSettings.class);
        Assertions.assertEquals("eggzfb", model.targetResourceName());
        Assertions.assertEquals(TargetAvailabilityZone.ONE, model.targetAvailabilityZone());
        Assertions.assertEquals("sonpclhocohs", model.targetVmSize());
        Assertions.assertEquals("ev", model.targetAvailabilitySetId());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        VirtualMachineResourceSettings model =
            new VirtualMachineResourceSettings()
                .withTargetResourceName("eggzfb")
                .withTargetAvailabilityZone(TargetAvailabilityZone.ONE)
                .withTargetVmSize("sonpclhocohs")
                .withTargetAvailabilitySetId("ev");
        model = BinaryData.fromObject(model).toObject(VirtualMachineResourceSettings.class);
        Assertions.assertEquals("eggzfb", model.targetResourceName());
        Assertions.assertEquals(TargetAvailabilityZone.ONE, model.targetAvailabilityZone());
        Assertions.assertEquals("sonpclhocohs", model.targetVmSize());
        Assertions.assertEquals("ev", model.targetAvailabilitySetId());
    }
}