// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managednetworkfabric.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.managednetworkfabric.models.ExportRoutePolicy;
import org.junit.jupiter.api.Assertions;

public final class ExportRoutePolicyTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ExportRoutePolicy model = BinaryData
            .fromString("{\"exportIpv4RoutePolicyId\":\"ozjiihj\",\"exportIpv6RoutePolicyId\":\"ybmrzoepnxwd\"}")
            .toObject(ExportRoutePolicy.class);
        Assertions.assertEquals("ozjiihj", model.exportIpv4RoutePolicyId());
        Assertions.assertEquals("ybmrzoepnxwd", model.exportIpv6RoutePolicyId());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ExportRoutePolicy model = new ExportRoutePolicy().withExportIpv4RoutePolicyId("ozjiihj")
            .withExportIpv6RoutePolicyId("ybmrzoepnxwd");
        model = BinaryData.fromObject(model).toObject(ExportRoutePolicy.class);
        Assertions.assertEquals("ozjiihj", model.exportIpv4RoutePolicyId());
        Assertions.assertEquals("ybmrzoepnxwd", model.exportIpv6RoutePolicyId());
    }
}
