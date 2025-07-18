// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.purestorageblock.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.purestorageblock.models.AvsVmVolumeUpdate;
import com.azure.resourcemanager.purestorageblock.models.AvsVmVolumeUpdateProperties;
import com.azure.resourcemanager.purestorageblock.models.SoftDeletion;
import org.junit.jupiter.api.Assertions;

public final class AvsVmVolumeUpdateTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AvsVmVolumeUpdate model = BinaryData
            .fromString(
                "{\"properties\":{\"softDeletion\":{\"destroyed\":true,\"eradicationTimestamp\":\"xnfaazpxdtnk\"}}}")
            .toObject(AvsVmVolumeUpdate.class);
        Assertions.assertTrue(model.properties().softDeletion().destroyed());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AvsVmVolumeUpdate model = new AvsVmVolumeUpdate()
            .withProperties(new AvsVmVolumeUpdateProperties().withSoftDeletion(new SoftDeletion().withDestroyed(true)));
        model = BinaryData.fromObject(model).toObject(AvsVmVolumeUpdate.class);
        Assertions.assertTrue(model.properties().softDeletion().destroyed());
    }
}
