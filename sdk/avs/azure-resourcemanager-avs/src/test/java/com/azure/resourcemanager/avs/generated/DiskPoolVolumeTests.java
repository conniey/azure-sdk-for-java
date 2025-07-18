// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.avs.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.avs.models.DiskPoolVolume;
import com.azure.resourcemanager.avs.models.MountOptionEnum;
import org.junit.jupiter.api.Assertions;

public final class DiskPoolVolumeTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        DiskPoolVolume model = BinaryData
            .fromString("{\"targetId\":\"mwzn\",\"lunName\":\"abikns\",\"mountOption\":\"MOUNT\",\"path\":\"hxbld\"}")
            .toObject(DiskPoolVolume.class);
        Assertions.assertEquals("mwzn", model.targetId());
        Assertions.assertEquals("abikns", model.lunName());
        Assertions.assertEquals(MountOptionEnum.MOUNT, model.mountOption());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        DiskPoolVolume model
            = new DiskPoolVolume().withTargetId("mwzn").withLunName("abikns").withMountOption(MountOptionEnum.MOUNT);
        model = BinaryData.fromObject(model).toObject(DiskPoolVolume.class);
        Assertions.assertEquals("mwzn", model.targetId());
        Assertions.assertEquals("abikns", model.lunName());
        Assertions.assertEquals(MountOptionEnum.MOUNT, model.mountOption());
    }
}
