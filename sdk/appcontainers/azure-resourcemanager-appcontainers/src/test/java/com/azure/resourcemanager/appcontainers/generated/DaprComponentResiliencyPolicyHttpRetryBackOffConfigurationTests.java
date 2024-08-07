// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcontainers.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.appcontainers.models.DaprComponentResiliencyPolicyHttpRetryBackOffConfiguration;
import org.junit.jupiter.api.Assertions;

public final class DaprComponentResiliencyPolicyHttpRetryBackOffConfigurationTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        DaprComponentResiliencyPolicyHttpRetryBackOffConfiguration model = BinaryData
            .fromString("{\"initialDelayInMilliseconds\":1572864361,\"maxIntervalInMilliseconds\":1639161747}")
            .toObject(DaprComponentResiliencyPolicyHttpRetryBackOffConfiguration.class);
        Assertions.assertEquals(1572864361, model.initialDelayInMilliseconds());
        Assertions.assertEquals(1639161747, model.maxIntervalInMilliseconds());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        DaprComponentResiliencyPolicyHttpRetryBackOffConfiguration model
            = new DaprComponentResiliencyPolicyHttpRetryBackOffConfiguration()
                .withInitialDelayInMilliseconds(1572864361)
                .withMaxIntervalInMilliseconds(1639161747);
        model = BinaryData.fromObject(model).toObject(DaprComponentResiliencyPolicyHttpRetryBackOffConfiguration.class);
        Assertions.assertEquals(1572864361, model.initialDelayInMilliseconds());
        Assertions.assertEquals(1639161747, model.maxIntervalInMilliseconds());
    }
}
