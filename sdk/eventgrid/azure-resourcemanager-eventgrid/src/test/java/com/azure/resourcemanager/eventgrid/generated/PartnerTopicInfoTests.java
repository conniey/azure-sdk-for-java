// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.eventgrid.models.EventDefinitionKind;
import com.azure.resourcemanager.eventgrid.models.EventTypeInfo;
import com.azure.resourcemanager.eventgrid.models.InlineEventProperties;
import com.azure.resourcemanager.eventgrid.models.PartnerTopicInfo;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class PartnerTopicInfoTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        PartnerTopicInfo model = BinaryData.fromString(
            "{\"azureSubscriptionId\":\"qtrgqjbpfzfsinzg\",\"resourceGroupName\":\"cjrwzoxxjtfellu\",\"name\":\"zitonpeqfpjkjl\",\"eventTypeInfo\":{\"kind\":\"Inline\",\"inlineEventTypes\":{\"xzxtheo\":{\"description\":\"pfxxy\",\"displayName\":\"ninmayhuyb\",\"documentationUrl\":\"podepoo\",\"dataSchemaUrl\":\"nuvamiheogna\"},\"kufubljo\":{\"description\":\"si\",\"displayName\":\"evcciqihnhun\",\"documentationUrl\":\"wjzrnfygxgisp\",\"dataSchemaUrl\":\"vtz\"},\"clxxwrljdo\":{\"description\":\"qeof\",\"displayName\":\"e\",\"documentationUrl\":\"hqjbasvmsmj\",\"dataSchemaUrl\":\"lngsntnbybkzgcwr\"},\"qpjwnzlljfm\":{\"description\":\"kcqvkocrc\",\"displayName\":\"kwt\",\"documentationUrl\":\"xbnjbiksq\",\"dataSchemaUrl\":\"lssai\"}}},\"source\":\"eebvmgxsab\"}")
            .toObject(PartnerTopicInfo.class);
        Assertions.assertEquals("qtrgqjbpfzfsinzg", model.azureSubscriptionId());
        Assertions.assertEquals("cjrwzoxxjtfellu", model.resourceGroupName());
        Assertions.assertEquals("zitonpeqfpjkjl", model.name());
        Assertions.assertEquals(EventDefinitionKind.INLINE, model.eventTypeInfo().kind());
        Assertions.assertEquals("pfxxy", model.eventTypeInfo().inlineEventTypes().get("xzxtheo").description());
        Assertions.assertEquals("ninmayhuyb", model.eventTypeInfo().inlineEventTypes().get("xzxtheo").displayName());
        Assertions.assertEquals("podepoo", model.eventTypeInfo().inlineEventTypes().get("xzxtheo").documentationUrl());
        Assertions.assertEquals("nuvamiheogna",
            model.eventTypeInfo().inlineEventTypes().get("xzxtheo").dataSchemaUrl());
        Assertions.assertEquals("eebvmgxsab", model.source());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        PartnerTopicInfo model = new PartnerTopicInfo().withAzureSubscriptionId("qtrgqjbpfzfsinzg")
            .withResourceGroupName("cjrwzoxxjtfellu")
            .withName("zitonpeqfpjkjl")
            .withEventTypeInfo(new EventTypeInfo().withKind(EventDefinitionKind.INLINE)
                .withInlineEventTypes(mapOf("xzxtheo",
                    new InlineEventProperties().withDescription("pfxxy")
                        .withDisplayName("ninmayhuyb")
                        .withDocumentationUrl("podepoo")
                        .withDataSchemaUrl("nuvamiheogna"),
                    "kufubljo",
                    new InlineEventProperties().withDescription("si")
                        .withDisplayName("evcciqihnhun")
                        .withDocumentationUrl("wjzrnfygxgisp")
                        .withDataSchemaUrl("vtz"),
                    "clxxwrljdo",
                    new InlineEventProperties().withDescription("qeof")
                        .withDisplayName("e")
                        .withDocumentationUrl("hqjbasvmsmj")
                        .withDataSchemaUrl("lngsntnbybkzgcwr"),
                    "qpjwnzlljfm",
                    new InlineEventProperties().withDescription("kcqvkocrc")
                        .withDisplayName("kwt")
                        .withDocumentationUrl("xbnjbiksq")
                        .withDataSchemaUrl("lssai"))))
            .withSource("eebvmgxsab");
        model = BinaryData.fromObject(model).toObject(PartnerTopicInfo.class);
        Assertions.assertEquals("qtrgqjbpfzfsinzg", model.azureSubscriptionId());
        Assertions.assertEquals("cjrwzoxxjtfellu", model.resourceGroupName());
        Assertions.assertEquals("zitonpeqfpjkjl", model.name());
        Assertions.assertEquals(EventDefinitionKind.INLINE, model.eventTypeInfo().kind());
        Assertions.assertEquals("pfxxy", model.eventTypeInfo().inlineEventTypes().get("xzxtheo").description());
        Assertions.assertEquals("ninmayhuyb", model.eventTypeInfo().inlineEventTypes().get("xzxtheo").displayName());
        Assertions.assertEquals("podepoo", model.eventTypeInfo().inlineEventTypes().get("xzxtheo").documentationUrl());
        Assertions.assertEquals("nuvamiheogna",
            model.eventTypeInfo().inlineEventTypes().get("xzxtheo").dataSchemaUrl());
        Assertions.assertEquals("eebvmgxsab", model.source());
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
