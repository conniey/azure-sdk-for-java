// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.apimanagement.fluent.models.GroupContractProperties;
import com.azure.resourcemanager.apimanagement.models.GroupType;
import org.junit.jupiter.api.Assertions;

public final class GroupContractPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        GroupContractProperties model = BinaryData.fromString(
            "{\"displayName\":\"eurbtigapdyarik\",\"description\":\"jdpdfhtwmmkfq\",\"builtIn\":true,\"type\":\"system\",\"externalId\":\"wwtrjm\"}")
            .toObject(GroupContractProperties.class);
        Assertions.assertEquals("eurbtigapdyarik", model.displayName());
        Assertions.assertEquals("jdpdfhtwmmkfq", model.description());
        Assertions.assertEquals(GroupType.SYSTEM, model.type());
        Assertions.assertEquals("wwtrjm", model.externalId());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        GroupContractProperties model = new GroupContractProperties().withDisplayName("eurbtigapdyarik")
            .withDescription("jdpdfhtwmmkfq")
            .withType(GroupType.SYSTEM)
            .withExternalId("wwtrjm");
        model = BinaryData.fromObject(model).toObject(GroupContractProperties.class);
        Assertions.assertEquals("eurbtigapdyarik", model.displayName());
        Assertions.assertEquals("jdpdfhtwmmkfq", model.description());
        Assertions.assertEquals(GroupType.SYSTEM, model.type());
        Assertions.assertEquals("wwtrjm", model.externalId());
    }
}
