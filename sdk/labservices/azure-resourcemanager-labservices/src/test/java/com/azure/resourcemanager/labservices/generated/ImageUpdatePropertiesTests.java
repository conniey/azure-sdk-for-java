// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.labservices.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.labservices.fluent.models.ImageUpdateProperties;
import com.azure.resourcemanager.labservices.models.EnableState;
import org.junit.jupiter.api.Assertions;

public final class ImageUpdatePropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ImageUpdateProperties model
            = BinaryData.fromString("{\"enabledState\":\"Disabled\"}").toObject(ImageUpdateProperties.class);
        Assertions.assertEquals(EnableState.DISABLED, model.enabledState());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ImageUpdateProperties model = new ImageUpdateProperties().withEnabledState(EnableState.DISABLED);
        model = BinaryData.fromObject(model).toObject(ImageUpdateProperties.class);
        Assertions.assertEquals(EnableState.DISABLED, model.enabledState());
    }
}
