// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.signalr.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.signalr.models.LiveTraceCategory;
import org.junit.jupiter.api.Assertions;

public final class LiveTraceCategoryTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        LiveTraceCategory model = BinaryData.fromString("{\"name\":\"ejjoqkagfhsxtta\",\"enabled\":\"zxnfaaz\"}")
            .toObject(LiveTraceCategory.class);
        Assertions.assertEquals("ejjoqkagfhsxtta", model.name());
        Assertions.assertEquals("zxnfaaz", model.enabled());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        LiveTraceCategory model = new LiveTraceCategory().withName("ejjoqkagfhsxtta").withEnabled("zxnfaaz");
        model = BinaryData.fromObject(model).toObject(LiveTraceCategory.class);
        Assertions.assertEquals("ejjoqkagfhsxtta", model.name());
        Assertions.assertEquals("zxnfaaz", model.enabled());
    }
}
