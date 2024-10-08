// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.machinelearning.models.AllNodes;

public final class AllNodesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AllNodes model = BinaryData.fromString("{\"nodesValueType\":\"All\"}").toObject(AllNodes.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AllNodes model = new AllNodes();
        model = BinaryData.fromObject(model).toObject(AllNodes.class);
    }
}
