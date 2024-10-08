// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.desktopvirtualization.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.desktopvirtualization.DesktopVirtualizationManager;
import com.azure.resourcemanager.desktopvirtualization.models.Desktop;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class DesktopsListMockTests {
    @Test
    public void testList() throws Exception {
        String responseStr
            = "{\"value\":[{\"properties\":{\"objectId\":\"mxhzzysevus\",\"description\":\"vzrrryveimi\",\"friendlyName\":\"kdyzatvfuzk\",\"iconHash\":\"tjvv\"},\"id\":\"wigsyeipqdsm\",\"name\":\"tgrqgdgkkile\",\"type\":\"lkcsmknhwtbbae\"}]}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        DesktopVirtualizationManager manager = DesktopVirtualizationManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        PagedIterable<Desktop> response
            = manager.desktops().list("blhtjq", "qyv", 269491033, false, 792358698, com.azure.core.util.Context.NONE);

        Assertions.assertEquals("vzrrryveimi", response.iterator().next().description());
        Assertions.assertEquals("kdyzatvfuzk", response.iterator().next().friendlyName());
    }
}
