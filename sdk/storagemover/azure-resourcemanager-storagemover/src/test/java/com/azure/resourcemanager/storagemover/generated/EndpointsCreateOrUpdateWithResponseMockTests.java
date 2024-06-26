// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storagemover.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.storagemover.StorageMoverManager;
import com.azure.resourcemanager.storagemover.models.Endpoint;
import com.azure.resourcemanager.storagemover.models.EndpointBaseProperties;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class EndpointsCreateOrUpdateWithResponseMockTests {
    @Test
    public void testCreateOrUpdateWithResponse() throws Exception {
        String responseStr
            = "{\"properties\":{\"endpointType\":\"EndpointBaseProperties\",\"description\":\"hhuao\",\"provisioningState\":\"Canceled\"},\"id\":\"qeqxo\",\"name\":\"z\",\"type\":\"ahzxctobgbk\"}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        StorageMoverManager manager = StorageMoverManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        Endpoint response = manager.endpoints()
            .define("gqgitxmedjvcsl")
            .withExistingStorageMover("dtpnapnyiropuhp", "gvpgy")
            .withProperties(new EndpointBaseProperties().withDescription("qwwncw"))
            .create();

        Assertions.assertEquals("hhuao", response.properties().description());
    }
}
