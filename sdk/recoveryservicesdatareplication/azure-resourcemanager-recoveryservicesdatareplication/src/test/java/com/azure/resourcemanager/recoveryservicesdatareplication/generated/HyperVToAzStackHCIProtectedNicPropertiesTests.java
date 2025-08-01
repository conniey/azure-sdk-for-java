// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.recoveryservicesdatareplication.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicesdatareplication.models.HyperVToAzStackHCIProtectedNicProperties;

public final class HyperVToAzStackHCIProtectedNicPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        HyperVToAzStackHCIProtectedNicProperties model = BinaryData.fromString(
            "{\"nicId\":\"awpfajnjwltlwtjj\",\"macAddress\":\"ktalhsnvkcdmxz\",\"networkName\":\"oaimlnw\",\"targetNetworkId\":\"aomylwea\",\"testNetworkId\":\"lcsethwwnpj\",\"selectionTypeForFailover\":\"NotSelected\"}")
            .toObject(HyperVToAzStackHCIProtectedNicProperties.class);
    }
}
