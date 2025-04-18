// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.delegatednetwork.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.delegatednetwork.fluent.models.DelegatedControllerInner;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class DelegatedControllerInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        DelegatedControllerInner model = BinaryData.fromString(
            "{\"properties\":{\"resourceGuid\":\"hq\",\"provisioningState\":\"Provisioning\",\"dncAppId\":\"xpyb\",\"dncTenantId\":\"m\",\"dncEndpoint\":\"mtz\"},\"location\":\"pbsphrupidgs\",\"tags\":{\"sx\":\"ejhphoyc\",\"tbmufpo\":\"obhdxbmtqioqjze\",\"hwlrx\":\"noi\",\"dmbpazlobcufpdz\":\"bqsoqijg\"},\"id\":\"rbt\",\"name\":\"qqjnqgl\",\"type\":\"qgn\"}")
            .toObject(DelegatedControllerInner.class);
        Assertions.assertEquals("pbsphrupidgs", model.location());
        Assertions.assertEquals("ejhphoyc", model.tags().get("sx"));
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        DelegatedControllerInner model = new DelegatedControllerInner().withLocation("pbsphrupidgs")
            .withTags(
                mapOf("sx", "ejhphoyc", "tbmufpo", "obhdxbmtqioqjze", "hwlrx", "noi", "dmbpazlobcufpdz", "bqsoqijg"));
        model = BinaryData.fromObject(model).toObject(DelegatedControllerInner.class);
        Assertions.assertEquals("pbsphrupidgs", model.location());
        Assertions.assertEquals("ejhphoyc", model.tags().get("sx"));
    }

    // Use "Map.of" if available
    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
