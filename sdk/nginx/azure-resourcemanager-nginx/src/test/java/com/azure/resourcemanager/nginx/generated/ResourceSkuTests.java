// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.nginx.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.nginx.models.ResourceSku;
import org.junit.jupiter.api.Assertions;

public final class ResourceSkuTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ResourceSku model = BinaryData.fromString("{\"name\":\"jdauwhvy\"}").toObject(ResourceSku.class);
        Assertions.assertEquals("jdauwhvy", model.name());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ResourceSku model = new ResourceSku().withName("jdauwhvy");
        model = BinaryData.fromObject(model).toObject(ResourceSku.class);
        Assertions.assertEquals("jdauwhvy", model.name());
    }
}
