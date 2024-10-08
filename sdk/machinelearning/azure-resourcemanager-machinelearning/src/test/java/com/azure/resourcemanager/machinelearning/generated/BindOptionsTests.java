// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.machinelearning.models.BindOptions;
import org.junit.jupiter.api.Assertions;

public final class BindOptionsTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        BindOptions model
            = BinaryData.fromString("{\"propagation\":\"arwp\",\"createHostPath\":true,\"selinux\":\"udoejtighsxjp\"}")
                .toObject(BindOptions.class);
        Assertions.assertEquals("arwp", model.propagation());
        Assertions.assertEquals(true, model.createHostPath());
        Assertions.assertEquals("udoejtighsxjp", model.selinux());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        BindOptions model
            = new BindOptions().withPropagation("arwp").withCreateHostPath(true).withSelinux("udoejtighsxjp");
        model = BinaryData.fromObject(model).toObject(BindOptions.class);
        Assertions.assertEquals("arwp", model.propagation());
        Assertions.assertEquals(true, model.createHostPath());
        Assertions.assertEquals("udoejtighsxjp", model.selinux());
    }
}
