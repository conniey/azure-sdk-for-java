// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hdinsight.containers.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.hdinsight.containers.HDInsightContainersManager;
import com.azure.resourcemanager.hdinsight.containers.models.NameAvailabilityParameters;
import com.azure.resourcemanager.hdinsight.containers.models.NameAvailabilityResult;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class LocationsCheckNameAvailabilityWithResponseMockTests {
    @Test
    public void testCheckNameAvailabilityWithResponse() throws Exception {
        String responseStr = "{\"nameAvailable\":true,\"reason\":\"qbawpcbbnzqcykn\",\"message\":\"qofyuicdhzbdy\"}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        HDInsightContainersManager manager = HDInsightContainersManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        NameAvailabilityResult response = manager.locations()
            .checkNameAvailabilityWithResponse("xnazpmkml",
                new NameAvailabilityParameters().withName("evfxzopjhbzxlioh").withType("dd"),
                com.azure.core.util.Context.NONE)
            .getValue();

        Assertions.assertEquals(true, response.nameAvailable());
        Assertions.assertEquals("qbawpcbbnzqcykn", response.reason());
        Assertions.assertEquals("qofyuicdhzbdy", response.message());
    }
}
