// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.netapp.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.netapp.fluent.models.VolumeQuotaRuleInner;
import com.azure.resourcemanager.netapp.models.Type;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class VolumeQuotaRuleInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        VolumeQuotaRuleInner model = BinaryData.fromString(
            "{\"properties\":{\"provisioningState\":\"Succeeded\",\"quotaSizeInKiBs\":5632238878555686719,\"quotaType\":\"DefaultGroupQuota\",\"quotaTarget\":\"yczuhxacpq\"},\"location\":\"ihhyuspskasd\",\"tags\":{\"mrsreuzvxurisjnh\":\"fwdgzxulucvp\",\"blwpcesutrgj\":\"ytxifqjzgxmrh\"},\"id\":\"pauutpw\",\"name\":\"qhih\",\"type\":\"jqgwzp\"}")
            .toObject(VolumeQuotaRuleInner.class);
        Assertions.assertEquals("ihhyuspskasd", model.location());
        Assertions.assertEquals("fwdgzxulucvp", model.tags().get("mrsreuzvxurisjnh"));
        Assertions.assertEquals(5632238878555686719L, model.quotaSizeInKiBs());
        Assertions.assertEquals(Type.DEFAULT_GROUP_QUOTA, model.quotaType());
        Assertions.assertEquals("yczuhxacpq", model.quotaTarget());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        VolumeQuotaRuleInner model = new VolumeQuotaRuleInner().withLocation("ihhyuspskasd")
            .withTags(mapOf("mrsreuzvxurisjnh", "fwdgzxulucvp", "blwpcesutrgj", "ytxifqjzgxmrh"))
            .withQuotaSizeInKiBs(5632238878555686719L)
            .withQuotaType(Type.DEFAULT_GROUP_QUOTA)
            .withQuotaTarget("yczuhxacpq");
        model = BinaryData.fromObject(model).toObject(VolumeQuotaRuleInner.class);
        Assertions.assertEquals("ihhyuspskasd", model.location());
        Assertions.assertEquals("fwdgzxulucvp", model.tags().get("mrsreuzvxurisjnh"));
        Assertions.assertEquals(5632238878555686719L, model.quotaSizeInKiBs());
        Assertions.assertEquals(Type.DEFAULT_GROUP_QUOTA, model.quotaType());
        Assertions.assertEquals("yczuhxacpq", model.quotaTarget());
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
