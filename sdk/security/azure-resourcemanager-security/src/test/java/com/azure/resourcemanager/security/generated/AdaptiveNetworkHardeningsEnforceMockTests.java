// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.security.SecurityManager;
import com.azure.resourcemanager.security.models.AdaptiveNetworkHardeningEnforceRequest;
import com.azure.resourcemanager.security.models.Direction;
import com.azure.resourcemanager.security.models.Rule;
import com.azure.resourcemanager.security.models.TransportProtocol;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import java.util.Arrays;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class AdaptiveNetworkHardeningsEnforceMockTests {
    @Test
    public void testEnforce() throws Exception {
        String responseStr = "{}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        SecurityManager manager = SecurityManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        manager.adaptiveNetworkHardenings()
            .enforce("hdbitq", "byujs", "omr", "humgr", "sdbvq",
                new AdaptiveNetworkHardeningEnforceRequest()
                    .withRules(
                        Arrays
                            .asList(
                                new Rule().withName("ygfkgxbdpb")
                                    .withDirection(Direction.OUTBOUND)
                                    .withDestinationPort(1130377321)
                                    .withProtocols(Arrays.asList(TransportProtocol.UDP, TransportProtocol.TCP,
                                        TransportProtocol.UDP))
                                    .withIpAddresses(
                                        Arrays.asList("ynpyt", "orrvk", "tfctanetinqxd", "npjnezjighdumltp")),
                                new Rule().withName("zwvwetqf")
                                    .withDirection(Direction.INBOUND)
                                    .withDestinationPort(1960443075)
                                    .withProtocols(Arrays.asList(TransportProtocol.UDP, TransportProtocol.UDP,
                                        TransportProtocol.TCP, TransportProtocol.TCP))
                                    .withIpAddresses(Arrays.asList("xjbso")),
                                new Rule().withName("clmr")
                                    .withDirection(Direction.INBOUND)
                                    .withDestinationPort(2108091407)
                                    .withProtocols(Arrays.asList(TransportProtocol.TCP, TransportProtocol.UDP))
                                    .withIpAddresses(Arrays.asList("pxbxedhxbboceks", "amqchlugfnlvv", "swur"))))
                    .withNetworkSecurityGroups(Arrays.asList("qhvhauimnntf", "q", "wq")),
                com.azure.core.util.Context.NONE);

    }
}
