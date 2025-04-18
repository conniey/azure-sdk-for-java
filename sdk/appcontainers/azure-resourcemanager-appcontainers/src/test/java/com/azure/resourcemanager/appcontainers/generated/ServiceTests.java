// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcontainers.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.appcontainers.models.Service;
import org.junit.jupiter.api.Assertions;

public final class ServiceTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        Service model = BinaryData.fromString("{\"type\":\"vpgylgqgitxmed\"}").toObject(Service.class);
        Assertions.assertEquals("vpgylgqgitxmed", model.type());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        Service model = new Service().withType("vpgylgqgitxmed");
        model = BinaryData.fromObject(model).toObject(Service.class);
        Assertions.assertEquals("vpgylgqgitxmed", model.type());
    }
}
