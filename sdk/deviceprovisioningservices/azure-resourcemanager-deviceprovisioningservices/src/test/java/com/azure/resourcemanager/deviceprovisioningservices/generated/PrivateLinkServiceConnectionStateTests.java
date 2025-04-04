// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.deviceprovisioningservices.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.deviceprovisioningservices.models.PrivateLinkServiceConnectionState;
import com.azure.resourcemanager.deviceprovisioningservices.models.PrivateLinkServiceConnectionStatus;
import org.junit.jupiter.api.Assertions;

public final class PrivateLinkServiceConnectionStateTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        PrivateLinkServiceConnectionState model = BinaryData
            .fromString(
                "{\"status\":\"Disconnected\",\"description\":\"ujysvle\",\"actionsRequired\":\"vfqawrlyxwjkcpr\"}")
            .toObject(PrivateLinkServiceConnectionState.class);
        Assertions.assertEquals(PrivateLinkServiceConnectionStatus.DISCONNECTED, model.status());
        Assertions.assertEquals("ujysvle", model.description());
        Assertions.assertEquals("vfqawrlyxwjkcpr", model.actionsRequired());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        PrivateLinkServiceConnectionState model
            = new PrivateLinkServiceConnectionState().withStatus(PrivateLinkServiceConnectionStatus.DISCONNECTED)
                .withDescription("ujysvle")
                .withActionsRequired("vfqawrlyxwjkcpr");
        model = BinaryData.fromObject(model).toObject(PrivateLinkServiceConnectionState.class);
        Assertions.assertEquals(PrivateLinkServiceConnectionStatus.DISCONNECTED, model.status());
        Assertions.assertEquals("ujysvle", model.description());
        Assertions.assertEquals("vfqawrlyxwjkcpr", model.actionsRequired());
    }
}
