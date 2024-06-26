// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.iotfirmwaredefense.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.iotfirmwaredefense.models.CveComponent;
import org.junit.jupiter.api.Assertions;

public final class CveComponentTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        CveComponent model
            = BinaryData.fromString("{\"componentId\":\"zmyzydagf\",\"name\":\"xbezyiuokktwh\",\"version\":\"xw\"}")
                .toObject(CveComponent.class);
        Assertions.assertEquals("zmyzydagf", model.componentId());
        Assertions.assertEquals("xbezyiuokktwh", model.name());
        Assertions.assertEquals("xw", model.version());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        CveComponent model
            = new CveComponent().withComponentId("zmyzydagf").withName("xbezyiuokktwh").withVersion("xw");
        model = BinaryData.fromObject(model).toObject(CveComponent.class);
        Assertions.assertEquals("zmyzydagf", model.componentId());
        Assertions.assertEquals("xbezyiuokktwh", model.name());
        Assertions.assertEquals("xw", model.version());
    }
}
