// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.confluent.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.confluent.models.ApiKeyResourceEntity;
import org.junit.jupiter.api.Assertions;

public final class ApiKeyResourceEntityTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ApiKeyResourceEntity model = BinaryData.fromString(
            "{\"id\":\"jmsvpkjp\",\"environment\":\"kwcf\",\"related\":\"ljyxgtczhe\",\"resourceName\":\"bsdshmkxmaehvbbx\",\"kind\":\"iplt\"}")
            .toObject(ApiKeyResourceEntity.class);
        Assertions.assertEquals("jmsvpkjp", model.id());
        Assertions.assertEquals("kwcf", model.environment());
        Assertions.assertEquals("ljyxgtczhe", model.related());
        Assertions.assertEquals("bsdshmkxmaehvbbx", model.resourceName());
        Assertions.assertEquals("iplt", model.kind());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ApiKeyResourceEntity model = new ApiKeyResourceEntity().withId("jmsvpkjp")
            .withEnvironment("kwcf")
            .withRelated("ljyxgtczhe")
            .withResourceName("bsdshmkxmaehvbbx")
            .withKind("iplt");
        model = BinaryData.fromObject(model).toObject(ApiKeyResourceEntity.class);
        Assertions.assertEquals("jmsvpkjp", model.id());
        Assertions.assertEquals("kwcf", model.environment());
        Assertions.assertEquals("ljyxgtczhe", model.related());
        Assertions.assertEquals("bsdshmkxmaehvbbx", model.resourceName());
        Assertions.assertEquals("iplt", model.kind());
    }
}
