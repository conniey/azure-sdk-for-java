// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mobilenetwork.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.mobilenetwork.models.SdfDirection;
import com.azure.resourcemanager.mobilenetwork.models.ServiceDataFlowTemplate;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class ServiceDataFlowTemplateTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ServiceDataFlowTemplate model = BinaryData.fromString(
            "{\"templateName\":\"ljyxgtczhe\",\"direction\":\"Downlink\",\"protocol\":[\"sdshmkxmaehvb\",\"xu\",\"iplt\",\"n\"],\"remoteIpList\":[\"baxk\",\"xywr\"],\"ports\":[\"yklyhpluodpvruud\",\"gzibthostgktstv\",\"xeclzedqbcvhzlhp\",\"odqkdlwwqfb\"]}")
            .toObject(ServiceDataFlowTemplate.class);
        Assertions.assertEquals("ljyxgtczhe", model.templateName());
        Assertions.assertEquals(SdfDirection.DOWNLINK, model.direction());
        Assertions.assertEquals("sdshmkxmaehvb", model.protocol().get(0));
        Assertions.assertEquals("baxk", model.remoteIpList().get(0));
        Assertions.assertEquals("yklyhpluodpvruud", model.ports().get(0));
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ServiceDataFlowTemplate model = new ServiceDataFlowTemplate().withTemplateName("ljyxgtczhe")
            .withDirection(SdfDirection.DOWNLINK)
            .withProtocol(Arrays.asList("sdshmkxmaehvb", "xu", "iplt", "n"))
            .withRemoteIpList(Arrays.asList("baxk", "xywr"))
            .withPorts(Arrays.asList("yklyhpluodpvruud", "gzibthostgktstv", "xeclzedqbcvhzlhp", "odqkdlwwqfb"));
        model = BinaryData.fromObject(model).toObject(ServiceDataFlowTemplate.class);
        Assertions.assertEquals("ljyxgtczhe", model.templateName());
        Assertions.assertEquals(SdfDirection.DOWNLINK, model.direction());
        Assertions.assertEquals("sdshmkxmaehvb", model.protocol().get(0));
        Assertions.assertEquals("baxk", model.remoteIpList().get(0));
        Assertions.assertEquals("yklyhpluodpvruud", model.ports().get(0));
    }
}
