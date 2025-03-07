// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.botservice.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.botservice.BotServiceManager;
import com.azure.resourcemanager.botservice.models.OperationEntity;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class OperationsListMockTests {
    @Test
    public void testList() throws Exception {
        String responseStr
            = "{\"value\":[{\"name\":\"racstwity\",\"display\":{\"description\":\"vxccedcp\",\"operation\":\"dyodnwzxltj\",\"provider\":\"nhltiugcxn\",\"resource\":\"vwxqibyqunyo\"},\"origin\":\"wlmdjrkv\",\"properties\":\"databvfvpdbod\"}]}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        BotServiceManager manager = BotServiceManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        PagedIterable<OperationEntity> response = manager.operations().list(com.azure.core.util.Context.NONE);

        Assertions.assertEquals("racstwity", response.iterator().next().name());
        Assertions.assertEquals("vxccedcp", response.iterator().next().display().description());
        Assertions.assertEquals("dyodnwzxltj", response.iterator().next().display().operation());
        Assertions.assertEquals("nhltiugcxn", response.iterator().next().display().provider());
        Assertions.assertEquals("vwxqibyqunyo", response.iterator().next().display().resource());
        Assertions.assertEquals("wlmdjrkv", response.iterator().next().origin());
    }
}
