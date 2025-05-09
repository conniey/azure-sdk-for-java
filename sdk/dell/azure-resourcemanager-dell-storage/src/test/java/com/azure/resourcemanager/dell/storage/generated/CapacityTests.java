// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.dell.storage.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.dell.storage.models.Capacity;
import org.junit.jupiter.api.Assertions;

public final class CapacityTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        Capacity model = BinaryData
            .fromString(
                "{\"min\":\"ooginuvamih\",\"max\":\"gnarxzxtheo\",\"incremental\":\"si\",\"current\":\"evcciqihnhun\"}")
            .toObject(Capacity.class);
        Assertions.assertEquals("ooginuvamih", model.min());
        Assertions.assertEquals("gnarxzxtheo", model.max());
        Assertions.assertEquals("si", model.incremental());
        Assertions.assertEquals("evcciqihnhun", model.current());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        Capacity model = new Capacity().withMin("ooginuvamih")
            .withMax("gnarxzxtheo")
            .withIncremental("si")
            .withCurrent("evcciqihnhun");
        model = BinaryData.fromObject(model).toObject(Capacity.class);
        Assertions.assertEquals("ooginuvamih", model.min());
        Assertions.assertEquals("gnarxzxtheo", model.max());
        Assertions.assertEquals("si", model.incremental());
        Assertions.assertEquals("evcciqihnhun", model.current());
    }
}
