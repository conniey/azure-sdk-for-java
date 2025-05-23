// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.ClusterUnplannedFailoverInput;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.ClusterUnplannedFailoverInputProperties;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.ClusterUnplannedFailoverProviderSpecificInput;
import org.junit.jupiter.api.Assertions;

public final class ClusterUnplannedFailoverInputTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ClusterUnplannedFailoverInput model = BinaryData.fromString(
            "{\"properties\":{\"failoverDirection\":\"isofieypefojyqd\",\"sourceSiteOperations\":\"u\",\"providerSpecificDetails\":{\"instanceType\":\"ClusterUnplannedFailoverProviderSpecificInput\"}}}")
            .toObject(ClusterUnplannedFailoverInput.class);
        Assertions.assertEquals("isofieypefojyqd", model.properties().failoverDirection());
        Assertions.assertEquals("u", model.properties().sourceSiteOperations());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ClusterUnplannedFailoverInput model = new ClusterUnplannedFailoverInput()
            .withProperties(new ClusterUnplannedFailoverInputProperties().withFailoverDirection("isofieypefojyqd")
                .withSourceSiteOperations("u")
                .withProviderSpecificDetails(new ClusterUnplannedFailoverProviderSpecificInput()));
        model = BinaryData.fromObject(model).toObject(ClusterUnplannedFailoverInput.class);
        Assertions.assertEquals("isofieypefojyqd", model.properties().failoverDirection());
        Assertions.assertEquals("u", model.properties().sourceSiteOperations());
    }
}
