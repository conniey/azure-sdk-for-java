// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.apimanagement.ApiManagementManager;
import com.azure.resourcemanager.apimanagement.models.IssueCommentContract;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class ApiIssueCommentsCreateOrUpdateWithResponseMockTests {
    @Test
    public void testCreateOrUpdateWithResponse() throws Exception {
        String responseStr
            = "{\"properties\":{\"text\":\"unbydlgfap\",\"createdDate\":\"2021-10-10T22:42:50Z\",\"userId\":\"ubwt\"},\"id\":\"ay\",\"name\":\"rtvjfqreeoxv\",\"type\":\"jmrnblihs\"}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        ApiManagementManager manager = ApiManagementManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        IssueCommentContract response = manager.apiIssueComments()
            .define("tzeargvfvkhbj")
            .withExistingIssue("ndi", "upngyhy", "qyafewcmodxwu", "ytxnxrqx")
            .withText("vpjxsdhweignybff")
            .withCreatedDate(OffsetDateTime.parse("2021-07-24T07:29:36Z"))
            .withUserId("wynepktvmwgvco")
            .withIfMatch("kkyporsyn")
            .create();

        Assertions.assertEquals("unbydlgfap", response.text());
        Assertions.assertEquals(OffsetDateTime.parse("2021-10-10T22:42:50Z"), response.createdDate());
        Assertions.assertEquals("ubwt", response.userId());
    }
}
