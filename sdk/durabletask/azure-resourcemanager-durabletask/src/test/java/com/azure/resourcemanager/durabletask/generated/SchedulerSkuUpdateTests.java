// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.durabletask.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.durabletask.models.SchedulerSkuUpdate;
import org.junit.jupiter.api.Assertions;

public final class SchedulerSkuUpdateTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        SchedulerSkuUpdate model
            = BinaryData.fromString("{\"name\":\"vamih\",\"capacity\":774982264,\"redundancyState\":\"Zone\"}")
                .toObject(SchedulerSkuUpdate.class);
        Assertions.assertEquals("vamih", model.name());
        Assertions.assertEquals(774982264, model.capacity());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        SchedulerSkuUpdate model = new SchedulerSkuUpdate().withName("vamih").withCapacity(774982264);
        model = BinaryData.fromObject(model).toObject(SchedulerSkuUpdate.class);
        Assertions.assertEquals("vamih", model.name());
        Assertions.assertEquals(774982264, model.capacity());
    }
}
