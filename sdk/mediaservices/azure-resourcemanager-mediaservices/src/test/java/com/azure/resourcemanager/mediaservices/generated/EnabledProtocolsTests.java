// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.mediaservices.models.EnabledProtocols;
import org.junit.jupiter.api.Assertions;

public final class EnabledProtocolsTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        EnabledProtocols model
            = BinaryData.fromString("{\"download\":false,\"dash\":false,\"hls\":false,\"smoothStreaming\":true}")
                .toObject(EnabledProtocols.class);
        Assertions.assertEquals(false, model.download());
        Assertions.assertEquals(false, model.dash());
        Assertions.assertEquals(false, model.hls());
        Assertions.assertEquals(true, model.smoothStreaming());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        EnabledProtocols model
            = new EnabledProtocols().withDownload(false).withDash(false).withHls(false).withSmoothStreaming(true);
        model = BinaryData.fromObject(model).toObject(EnabledProtocols.class);
        Assertions.assertEquals(false, model.download());
        Assertions.assertEquals(false, model.dash());
        Assertions.assertEquals(false, model.hls());
        Assertions.assertEquals(true, model.smoothStreaming());
    }
}
