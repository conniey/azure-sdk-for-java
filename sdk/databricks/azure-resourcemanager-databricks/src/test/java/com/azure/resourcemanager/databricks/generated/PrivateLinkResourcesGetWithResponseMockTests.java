// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databricks.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.databricks.AzureDatabricksManager;
import com.azure.resourcemanager.databricks.models.GroupIdInformation;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class PrivateLinkResourcesGetWithResponseMockTests {
    @Test
    public void testGetWithResponse() throws Exception {
        String responseStr
            = "{\"properties\":{\"groupId\":\"fqsgzvahapjy\",\"requiredMembers\":[\"vgqzcjrvxd\",\"zlmwlxkvugfhz\",\"vawjvzunlu\",\"hnnpr\"],\"requiredZoneNames\":[\"peilpjzuaejxdu\"]},\"id\":\"tskzbbtdzumveek\",\"name\":\"pwo\",\"type\":\"uh\"}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        AzureDatabricksManager manager = AzureDatabricksManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        GroupIdInformation response = manager.privateLinkResources()
            .getWithResponse("yvxqtayriwwroy", "bexrmcq", "bycnojvkn", com.azure.core.util.Context.NONE)
            .getValue();

        Assertions.assertEquals("fqsgzvahapjy", response.properties().groupId());
        Assertions.assertEquals("vgqzcjrvxd", response.properties().requiredMembers().get(0));
        Assertions.assertEquals("peilpjzuaejxdu", response.properties().requiredZoneNames().get(0));
    }
}
