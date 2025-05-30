// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.models.AzureCloud;
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
            = "{\"properties\":{\"text\":\"irtahtu\",\"createdDate\":\"2021-02-23T08:34:34Z\",\"userId\":\"m\"},\"id\":\"caumviudzpsjqr\",\"name\":\"lujm\",\"type\":\"unlofwuzebfq\"}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        ApiManagementManager manager = ApiManagementManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureCloud.AZURE_PUBLIC_CLOUD));

        IssueCommentContract response = manager.apiIssueComments()
            .define("tujydeatwxpxbxed")
            .withExistingIssue("rzwvwetqff", "xvfhuqhn", "qqxjbsot", "clmr")
            .withText("bboceksram")
            .withCreatedDate(OffsetDateTime.parse("2021-12-04T02:33:26Z"))
            .withUserId("l")
            .withIfMatch("dqkzstzpzecdl")
            .create();

        Assertions.assertEquals("irtahtu", response.text());
        Assertions.assertEquals(OffsetDateTime.parse("2021-02-23T08:34:34Z"), response.createdDate());
        Assertions.assertEquals("m", response.userId());
    }
}
