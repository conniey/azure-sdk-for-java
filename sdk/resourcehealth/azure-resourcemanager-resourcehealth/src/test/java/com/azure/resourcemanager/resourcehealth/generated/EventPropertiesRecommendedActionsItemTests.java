// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resourcehealth.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.resourcehealth.models.EventPropertiesRecommendedActionsItem;
import org.junit.jupiter.api.Assertions;

public final class EventPropertiesRecommendedActionsItemTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        EventPropertiesRecommendedActionsItem model
            = BinaryData.fromString("{\"groupId\":597105024,\"actionText\":\"qreyfkzi\"}")
                .toObject(EventPropertiesRecommendedActionsItem.class);
        Assertions.assertEquals(597105024, model.groupId());
        Assertions.assertEquals("qreyfkzi", model.actionText());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        EventPropertiesRecommendedActionsItem model
            = new EventPropertiesRecommendedActionsItem().withGroupId(597105024).withActionText("qreyfkzi");
        model = BinaryData.fromObject(model).toObject(EventPropertiesRecommendedActionsItem.class);
        Assertions.assertEquals(597105024, model.groupId());
        Assertions.assertEquals("qreyfkzi", model.actionText());
    }
}
