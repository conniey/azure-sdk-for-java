// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.recoveryservicesdatareplication.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicesdatareplication.models.TestFailoverCleanupJobModelCustomProperties;

public final class TestFailoverCleanupJobModelCustomPropertTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        TestFailoverCleanupJobModelCustomProperties model = BinaryData.fromString(
            "{\"instanceType\":\"TestFailoverCleanupJobDetails\",\"comments\":\"xtibqdxbxwakbog\",\"affectedObjectDetails\":{\"description\":\"dlkzgxhuri\",\"type\":\"object\"}}")
            .toObject(TestFailoverCleanupJobModelCustomProperties.class);
    }
}
