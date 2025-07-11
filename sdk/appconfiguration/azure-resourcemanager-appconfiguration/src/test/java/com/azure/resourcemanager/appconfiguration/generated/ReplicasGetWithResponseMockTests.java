// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appconfiguration.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.models.AzureCloud;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.appconfiguration.AppConfigurationManager;
import com.azure.resourcemanager.appconfiguration.models.Replica;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class ReplicasGetWithResponseMockTests {
    @Test
    public void testGetWithResponse() throws Exception {
        String responseStr
            = "{\"location\":\"kzevdlhewpusds\",\"properties\":{\"endpoint\":\"ogvbbejdcngq\",\"provisioningState\":\"Failed\"},\"id\":\"akufgmjz\",\"name\":\"wr\",\"type\":\"grtwae\"}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        AppConfigurationManager manager = AppConfigurationManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureCloud.AZURE_PUBLIC_CLOUD));

        Replica response = manager.replicas()
            .getWithResponse("znkbykutwpfhpagm", "r", "kdsnfdsdoakgtdl", com.azure.core.util.Context.NONE)
            .getValue();

        Assertions.assertEquals("kzevdlhewpusds", response.location());
    }
}
