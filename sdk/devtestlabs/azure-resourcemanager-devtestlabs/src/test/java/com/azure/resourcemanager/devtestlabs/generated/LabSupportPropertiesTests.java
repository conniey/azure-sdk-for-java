// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devtestlabs.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.devtestlabs.models.EnableStatus;
import com.azure.resourcemanager.devtestlabs.models.LabSupportProperties;
import org.junit.jupiter.api.Assertions;

public final class LabSupportPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        LabSupportProperties model = BinaryData.fromString("{\"enabled\":\"Disabled\",\"markdown\":\"jugwdkcglhsl\"}")
            .toObject(LabSupportProperties.class);
        Assertions.assertEquals(EnableStatus.DISABLED, model.enabled());
        Assertions.assertEquals("jugwdkcglhsl", model.markdown());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        LabSupportProperties model
            = new LabSupportProperties().withEnabled(EnableStatus.DISABLED).withMarkdown("jugwdkcglhsl");
        model = BinaryData.fromObject(model).toObject(LabSupportProperties.class);
        Assertions.assertEquals(EnableStatus.DISABLED, model.enabled());
        Assertions.assertEquals("jugwdkcglhsl", model.markdown());
    }
}
