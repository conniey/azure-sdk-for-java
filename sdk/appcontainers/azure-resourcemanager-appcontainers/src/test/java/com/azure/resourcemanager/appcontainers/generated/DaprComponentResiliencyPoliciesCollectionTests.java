// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcontainers.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.appcontainers.fluent.models.DaprComponentResiliencyPolicyInner;
import com.azure.resourcemanager.appcontainers.models.DaprComponentResiliencyPoliciesCollection;
import com.azure.resourcemanager.appcontainers.models.DaprComponentResiliencyPolicyCircuitBreakerPolicyConfiguration;
import com.azure.resourcemanager.appcontainers.models.DaprComponentResiliencyPolicyConfiguration;
import com.azure.resourcemanager.appcontainers.models.DaprComponentResiliencyPolicyHttpRetryBackOffConfiguration;
import com.azure.resourcemanager.appcontainers.models.DaprComponentResiliencyPolicyHttpRetryPolicyConfiguration;
import com.azure.resourcemanager.appcontainers.models.DaprComponentResiliencyPolicyTimeoutPolicyConfiguration;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class DaprComponentResiliencyPoliciesCollectionTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        DaprComponentResiliencyPoliciesCollection model = BinaryData.fromString(
            "{\"value\":[{\"properties\":{\"inboundPolicy\":{\"httpRetryPolicy\":{\"maxRetries\":1475377134,\"retryBackOff\":{}},\"timeoutPolicy\":{\"responseTimeoutInSeconds\":415972757},\"circuitBreakerPolicy\":{\"consecutiveErrors\":891937563,\"timeoutInSeconds\":1308734164,\"intervalInSeconds\":1297412957}},\"outboundPolicy\":{\"httpRetryPolicy\":{\"maxRetries\":724293766,\"retryBackOff\":{}},\"timeoutPolicy\":{\"responseTimeoutInSeconds\":1230766667},\"circuitBreakerPolicy\":{\"consecutiveErrors\":949120362,\"timeoutInSeconds\":1827983536,\"intervalInSeconds\":1687085732}}},\"id\":\"xv\",\"name\":\"qtvbczsu\",\"type\":\"mdgglmepjpfs\"},{\"properties\":{\"inboundPolicy\":{\"httpRetryPolicy\":{\"maxRetries\":1561379000,\"retryBackOff\":{}},\"timeoutPolicy\":{\"responseTimeoutInSeconds\":331977522},\"circuitBreakerPolicy\":{\"consecutiveErrors\":2078567583,\"timeoutInSeconds\":2008199597,\"intervalInSeconds\":26308391}},\"outboundPolicy\":{\"httpRetryPolicy\":{\"maxRetries\":1886264089,\"retryBackOff\":{}},\"timeoutPolicy\":{\"responseTimeoutInSeconds\":1515687542},\"circuitBreakerPolicy\":{\"consecutiveErrors\":608285321,\"timeoutInSeconds\":857862524,\"intervalInSeconds\":767274069}}},\"id\":\"edmzrgjfoknub\",\"name\":\"oitpkpztrgdgx\",\"type\":\"coqra\"},{\"properties\":{\"inboundPolicy\":{\"httpRetryPolicy\":{\"maxRetries\":1145778113,\"retryBackOff\":{}},\"timeoutPolicy\":{\"responseTimeoutInSeconds\":2036171481},\"circuitBreakerPolicy\":{\"consecutiveErrors\":1168808481,\"timeoutInSeconds\":248802373,\"intervalInSeconds\":564672857}},\"outboundPolicy\":{\"httpRetryPolicy\":{\"maxRetries\":588976702,\"retryBackOff\":{}},\"timeoutPolicy\":{\"responseTimeoutInSeconds\":977678729},\"circuitBreakerPolicy\":{\"consecutiveErrors\":386534389,\"timeoutInSeconds\":1536605508,\"intervalInSeconds\":324493870}}},\"id\":\"qcujpd\",\"name\":\"xzak\",\"type\":\"ejkm\"},{\"properties\":{\"inboundPolicy\":{\"httpRetryPolicy\":{\"maxRetries\":1361735298,\"retryBackOff\":{}},\"timeoutPolicy\":{\"responseTimeoutInSeconds\":25286412},\"circuitBreakerPolicy\":{\"consecutiveErrors\":826509845,\"timeoutInSeconds\":308325855,\"intervalInSeconds\":179886290}},\"outboundPolicy\":{\"httpRetryPolicy\":{\"maxRetries\":1430457566,\"retryBackOff\":{}},\"timeoutPolicy\":{\"responseTimeoutInSeconds\":1706442332},\"circuitBreakerPolicy\":{\"consecutiveErrors\":1935171064,\"timeoutInSeconds\":1377319728,\"intervalInSeconds\":2023692780}}},\"id\":\"egthortudawl\",\"name\":\"jfel\",\"type\":\"erppt\"}],\"nextLink\":\"gqnzm\"}")
            .toObject(DaprComponentResiliencyPoliciesCollection.class);
        Assertions.assertEquals(1475377134, model.value().get(0).inboundPolicy().httpRetryPolicy().maxRetries());
        Assertions.assertEquals(415972757,
            model.value().get(0).inboundPolicy().timeoutPolicy().responseTimeoutInSeconds());
        Assertions.assertEquals(891937563,
            model.value().get(0).inboundPolicy().circuitBreakerPolicy().consecutiveErrors());
        Assertions.assertEquals(1308734164,
            model.value().get(0).inboundPolicy().circuitBreakerPolicy().timeoutInSeconds());
        Assertions.assertEquals(1297412957,
            model.value().get(0).inboundPolicy().circuitBreakerPolicy().intervalInSeconds());
        Assertions.assertEquals(724293766, model.value().get(0).outboundPolicy().httpRetryPolicy().maxRetries());
        Assertions.assertEquals(1230766667,
            model.value().get(0).outboundPolicy().timeoutPolicy().responseTimeoutInSeconds());
        Assertions.assertEquals(949120362,
            model.value().get(0).outboundPolicy().circuitBreakerPolicy().consecutiveErrors());
        Assertions.assertEquals(1827983536,
            model.value().get(0).outboundPolicy().circuitBreakerPolicy().timeoutInSeconds());
        Assertions.assertEquals(1687085732,
            model.value().get(0).outboundPolicy().circuitBreakerPolicy().intervalInSeconds());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        DaprComponentResiliencyPoliciesCollection model
            = new DaprComponentResiliencyPoliciesCollection().withValue(Arrays.asList(
                new DaprComponentResiliencyPolicyInner()
                    .withInboundPolicy(new DaprComponentResiliencyPolicyConfiguration()
                        .withHttpRetryPolicy(
                            new DaprComponentResiliencyPolicyHttpRetryPolicyConfiguration().withMaxRetries(1475377134)
                                .withRetryBackOff(new DaprComponentResiliencyPolicyHttpRetryBackOffConfiguration()))
                        .withTimeoutPolicy(new DaprComponentResiliencyPolicyTimeoutPolicyConfiguration()
                            .withResponseTimeoutInSeconds(415972757))
                        .withCircuitBreakerPolicy(new DaprComponentResiliencyPolicyCircuitBreakerPolicyConfiguration()
                            .withConsecutiveErrors(891937563)
                            .withTimeoutInSeconds(1308734164)
                            .withIntervalInSeconds(1297412957)))
                    .withOutboundPolicy(new DaprComponentResiliencyPolicyConfiguration()
                        .withHttpRetryPolicy(
                            new DaprComponentResiliencyPolicyHttpRetryPolicyConfiguration().withMaxRetries(724293766)
                                .withRetryBackOff(new DaprComponentResiliencyPolicyHttpRetryBackOffConfiguration()))
                        .withTimeoutPolicy(new DaprComponentResiliencyPolicyTimeoutPolicyConfiguration()
                            .withResponseTimeoutInSeconds(1230766667))
                        .withCircuitBreakerPolicy(new DaprComponentResiliencyPolicyCircuitBreakerPolicyConfiguration()
                            .withConsecutiveErrors(949120362)
                            .withTimeoutInSeconds(1827983536)
                            .withIntervalInSeconds(1687085732))),
                new DaprComponentResiliencyPolicyInner()
                    .withInboundPolicy(new DaprComponentResiliencyPolicyConfiguration()
                        .withHttpRetryPolicy(
                            new DaprComponentResiliencyPolicyHttpRetryPolicyConfiguration().withMaxRetries(1561379000)
                                .withRetryBackOff(new DaprComponentResiliencyPolicyHttpRetryBackOffConfiguration()))
                        .withTimeoutPolicy(new DaprComponentResiliencyPolicyTimeoutPolicyConfiguration()
                            .withResponseTimeoutInSeconds(331977522))
                        .withCircuitBreakerPolicy(new DaprComponentResiliencyPolicyCircuitBreakerPolicyConfiguration()
                            .withConsecutiveErrors(2078567583)
                            .withTimeoutInSeconds(2008199597)
                            .withIntervalInSeconds(26308391)))
                    .withOutboundPolicy(new DaprComponentResiliencyPolicyConfiguration()
                        .withHttpRetryPolicy(
                            new DaprComponentResiliencyPolicyHttpRetryPolicyConfiguration().withMaxRetries(1886264089)
                                .withRetryBackOff(new DaprComponentResiliencyPolicyHttpRetryBackOffConfiguration()))
                        .withTimeoutPolicy(new DaprComponentResiliencyPolicyTimeoutPolicyConfiguration()
                            .withResponseTimeoutInSeconds(1515687542))
                        .withCircuitBreakerPolicy(new DaprComponentResiliencyPolicyCircuitBreakerPolicyConfiguration()
                            .withConsecutiveErrors(608285321)
                            .withTimeoutInSeconds(857862524)
                            .withIntervalInSeconds(767274069))),
                new DaprComponentResiliencyPolicyInner()
                    .withInboundPolicy(new DaprComponentResiliencyPolicyConfiguration()
                        .withHttpRetryPolicy(
                            new DaprComponentResiliencyPolicyHttpRetryPolicyConfiguration().withMaxRetries(1145778113)
                                .withRetryBackOff(new DaprComponentResiliencyPolicyHttpRetryBackOffConfiguration()))
                        .withTimeoutPolicy(new DaprComponentResiliencyPolicyTimeoutPolicyConfiguration()
                            .withResponseTimeoutInSeconds(2036171481))
                        .withCircuitBreakerPolicy(new DaprComponentResiliencyPolicyCircuitBreakerPolicyConfiguration()
                            .withConsecutiveErrors(1168808481)
                            .withTimeoutInSeconds(248802373)
                            .withIntervalInSeconds(564672857)))
                    .withOutboundPolicy(new DaprComponentResiliencyPolicyConfiguration()
                        .withHttpRetryPolicy(
                            new DaprComponentResiliencyPolicyHttpRetryPolicyConfiguration().withMaxRetries(588976702)
                                .withRetryBackOff(new DaprComponentResiliencyPolicyHttpRetryBackOffConfiguration()))
                        .withTimeoutPolicy(new DaprComponentResiliencyPolicyTimeoutPolicyConfiguration()
                            .withResponseTimeoutInSeconds(977678729))
                        .withCircuitBreakerPolicy(new DaprComponentResiliencyPolicyCircuitBreakerPolicyConfiguration()
                            .withConsecutiveErrors(386534389)
                            .withTimeoutInSeconds(1536605508)
                            .withIntervalInSeconds(324493870))),
                new DaprComponentResiliencyPolicyInner()
                    .withInboundPolicy(new DaprComponentResiliencyPolicyConfiguration()
                        .withHttpRetryPolicy(
                            new DaprComponentResiliencyPolicyHttpRetryPolicyConfiguration().withMaxRetries(1361735298)
                                .withRetryBackOff(new DaprComponentResiliencyPolicyHttpRetryBackOffConfiguration()))
                        .withTimeoutPolicy(new DaprComponentResiliencyPolicyTimeoutPolicyConfiguration()
                            .withResponseTimeoutInSeconds(25286412))
                        .withCircuitBreakerPolicy(new DaprComponentResiliencyPolicyCircuitBreakerPolicyConfiguration()
                            .withConsecutiveErrors(826509845)
                            .withTimeoutInSeconds(308325855)
                            .withIntervalInSeconds(179886290)))
                    .withOutboundPolicy(new DaprComponentResiliencyPolicyConfiguration()
                        .withHttpRetryPolicy(
                            new DaprComponentResiliencyPolicyHttpRetryPolicyConfiguration().withMaxRetries(1430457566)
                                .withRetryBackOff(new DaprComponentResiliencyPolicyHttpRetryBackOffConfiguration()))
                        .withTimeoutPolicy(new DaprComponentResiliencyPolicyTimeoutPolicyConfiguration()
                            .withResponseTimeoutInSeconds(1706442332))
                        .withCircuitBreakerPolicy(new DaprComponentResiliencyPolicyCircuitBreakerPolicyConfiguration()
                            .withConsecutiveErrors(1935171064)
                            .withTimeoutInSeconds(1377319728)
                            .withIntervalInSeconds(2023692780)))));
        model = BinaryData.fromObject(model).toObject(DaprComponentResiliencyPoliciesCollection.class);
        Assertions.assertEquals(1475377134, model.value().get(0).inboundPolicy().httpRetryPolicy().maxRetries());
        Assertions.assertEquals(415972757,
            model.value().get(0).inboundPolicy().timeoutPolicy().responseTimeoutInSeconds());
        Assertions.assertEquals(891937563,
            model.value().get(0).inboundPolicy().circuitBreakerPolicy().consecutiveErrors());
        Assertions.assertEquals(1308734164,
            model.value().get(0).inboundPolicy().circuitBreakerPolicy().timeoutInSeconds());
        Assertions.assertEquals(1297412957,
            model.value().get(0).inboundPolicy().circuitBreakerPolicy().intervalInSeconds());
        Assertions.assertEquals(724293766, model.value().get(0).outboundPolicy().httpRetryPolicy().maxRetries());
        Assertions.assertEquals(1230766667,
            model.value().get(0).outboundPolicy().timeoutPolicy().responseTimeoutInSeconds());
        Assertions.assertEquals(949120362,
            model.value().get(0).outboundPolicy().circuitBreakerPolicy().consecutiveErrors());
        Assertions.assertEquals(1827983536,
            model.value().get(0).outboundPolicy().circuitBreakerPolicy().timeoutInSeconds());
        Assertions.assertEquals(1687085732,
            model.value().get(0).outboundPolicy().circuitBreakerPolicy().intervalInSeconds());
    }
}
