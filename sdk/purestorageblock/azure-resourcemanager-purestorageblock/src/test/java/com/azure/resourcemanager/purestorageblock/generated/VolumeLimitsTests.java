// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.purestorageblock.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.purestorageblock.models.VolumeLimits;
import org.junit.jupiter.api.Assertions;

public final class VolumeLimitsTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        VolumeLimits model
            = BinaryData.fromString("{\"provisionedSize\":{\"min\":4526568806695806079,\"max\":918544931908903685}}")
                .toObject(VolumeLimits.class);
        Assertions.assertEquals(4526568806695806079L, model.provisionedSize().min());
        Assertions.assertEquals(918544931908903685L, model.provisionedSize().max());
    }
}
