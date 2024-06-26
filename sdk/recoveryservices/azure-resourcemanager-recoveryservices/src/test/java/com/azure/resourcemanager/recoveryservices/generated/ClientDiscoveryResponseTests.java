// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservices.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservices.fluent.models.ClientDiscoveryValueForSingleApiInner;
import com.azure.resourcemanager.recoveryservices.models.ClientDiscoveryDisplay;
import com.azure.resourcemanager.recoveryservices.models.ClientDiscoveryForLogSpecification;
import com.azure.resourcemanager.recoveryservices.models.ClientDiscoveryForProperties;
import com.azure.resourcemanager.recoveryservices.models.ClientDiscoveryForServiceSpecification;
import com.azure.resourcemanager.recoveryservices.models.ClientDiscoveryResponse;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class ClientDiscoveryResponseTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ClientDiscoveryResponse model = BinaryData.fromString(
            "{\"value\":[{\"name\":\"uimjmvx\",\"display\":{\"provider\":\"uugidyjrrfby\",\"resource\":\"svexcsonpclhoco\",\"operation\":\"lkevle\",\"description\":\"zfbuhf\"},\"origin\":\"faxkffeii\",\"properties\":{\"serviceSpecification\":{\"logSpecifications\":[{}]}}}],\"nextLink\":\"zy\"}")
            .toObject(ClientDiscoveryResponse.class);
        Assertions.assertEquals("uimjmvx", model.value().get(0).name());
        Assertions.assertEquals("uugidyjrrfby", model.value().get(0).display().provider());
        Assertions.assertEquals("svexcsonpclhoco", model.value().get(0).display().resource());
        Assertions.assertEquals("lkevle", model.value().get(0).display().operation());
        Assertions.assertEquals("zfbuhf", model.value().get(0).display().description());
        Assertions.assertEquals("faxkffeii", model.value().get(0).origin());
        Assertions.assertEquals("zy", model.nextLink());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ClientDiscoveryResponse model = new ClientDiscoveryResponse()
            .withValue(Arrays.asList(new ClientDiscoveryValueForSingleApiInner().withName("uimjmvx")
                .withDisplay(new ClientDiscoveryDisplay().withProvider("uugidyjrrfby")
                    .withResource("svexcsonpclhoco")
                    .withOperation("lkevle")
                    .withDescription("zfbuhf"))
                .withOrigin("faxkffeii")
                .withProperties(new ClientDiscoveryForProperties()
                    .withServiceSpecification(new ClientDiscoveryForServiceSpecification()
                        .withLogSpecifications(Arrays.asList(new ClientDiscoveryForLogSpecification()))))))
            .withNextLink("zy");
        model = BinaryData.fromObject(model).toObject(ClientDiscoveryResponse.class);
        Assertions.assertEquals("uimjmvx", model.value().get(0).name());
        Assertions.assertEquals("uugidyjrrfby", model.value().get(0).display().provider());
        Assertions.assertEquals("svexcsonpclhoco", model.value().get(0).display().resource());
        Assertions.assertEquals("lkevle", model.value().get(0).display().operation());
        Assertions.assertEquals("zfbuhf", model.value().get(0).display().description());
        Assertions.assertEquals("faxkffeii", model.value().get(0).origin());
        Assertions.assertEquals("zy", model.nextLink());
    }
}
