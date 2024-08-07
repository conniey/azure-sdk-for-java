// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcontainers.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.appcontainers.models.DaprComponentResiliencyPolicyCircuitBreakerPolicyConfiguration;
import org.junit.jupiter.api.Assertions;

public final class DaprComponentResiliencyPolicyCircuitBreakerPolicyConfigurationTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        DaprComponentResiliencyPolicyCircuitBreakerPolicyConfiguration model = BinaryData
            .fromString(
                "{\"consecutiveErrors\":575667352,\"timeoutInSeconds\":540074004,\"intervalInSeconds\":534687769}")
            .toObject(DaprComponentResiliencyPolicyCircuitBreakerPolicyConfiguration.class);
        Assertions.assertEquals(575667352, model.consecutiveErrors());
        Assertions.assertEquals(540074004, model.timeoutInSeconds());
        Assertions.assertEquals(534687769, model.intervalInSeconds());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        DaprComponentResiliencyPolicyCircuitBreakerPolicyConfiguration model
            = new DaprComponentResiliencyPolicyCircuitBreakerPolicyConfiguration().withConsecutiveErrors(575667352)
                .withTimeoutInSeconds(540074004)
                .withIntervalInSeconds(534687769);
        model = BinaryData.fromObject(model)
            .toObject(DaprComponentResiliencyPolicyCircuitBreakerPolicyConfiguration.class);
        Assertions.assertEquals(575667352, model.consecutiveErrors());
        Assertions.assertEquals(540074004, model.timeoutInSeconds());
        Assertions.assertEquals(534687769, model.intervalInSeconds());
    }
}
