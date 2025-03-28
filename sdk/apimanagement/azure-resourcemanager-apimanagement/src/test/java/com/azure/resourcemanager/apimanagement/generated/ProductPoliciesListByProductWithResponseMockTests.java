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
import com.azure.resourcemanager.apimanagement.models.PolicyCollection;
import com.azure.resourcemanager.apimanagement.models.PolicyContentFormat;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class ProductPoliciesListByProductWithResponseMockTests {
    @Test
    public void testListByProductWithResponse() throws Exception {
        String responseStr
            = "{\"value\":[{\"properties\":{\"value\":\"fvg\",\"format\":\"xml-link\"},\"id\":\"giqmbr\",\"name\":\"skmbuihtqfvyqmm\",\"type\":\"zugu\"},{\"properties\":{\"value\":\"ieegjnqwhfjox\",\"format\":\"xml\"},\"id\":\"jscgqcr\",\"name\":\"aucftotedhjxdl\",\"type\":\"uhffjjqvjyqmpmsk\"},{\"properties\":{\"value\":\"xrhljwqufud\",\"format\":\"xml-link\"},\"id\":\"boqlefxf\",\"name\":\"wmajvwfijf\",\"type\":\"jjrvsvhmsmrihdd\"}],\"count\":1203028630875951701,\"nextLink\":\"qnt\"}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        ApiManagementManager manager = ApiManagementManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        PolicyCollection response = manager.productPolicies()
            .listByProductWithResponse("dta", "xy", "lkgjhomywlypghhu", com.azure.core.util.Context.NONE)
            .getValue();

        Assertions.assertEquals("fvg", response.value().get(0).value());
        Assertions.assertEquals(PolicyContentFormat.XML_LINK, response.value().get(0).format());
        Assertions.assertEquals(1203028630875951701L, response.count());
        Assertions.assertEquals("qnt", response.nextLink());
    }
}
