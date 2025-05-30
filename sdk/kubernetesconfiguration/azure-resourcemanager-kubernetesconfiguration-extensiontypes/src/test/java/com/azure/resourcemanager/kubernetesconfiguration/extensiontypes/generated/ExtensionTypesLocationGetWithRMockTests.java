// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.kubernetesconfiguration.extensiontypes.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.models.AzureCloud;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.kubernetesconfiguration.extensiontypes.ExtensionTypesManager;
import com.azure.resourcemanager.kubernetesconfiguration.extensiontypes.models.ExtensionType;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class ExtensionTypesLocationGetWithRMockTests {
    @Test
    public void testLocationGetWithResponse() throws Exception {
        String responseStr
            = "{\"properties\":{\"isSystemExtension\":true,\"isManagedIdentityRequired\":false,\"description\":\"conuqszfkbeype\",\"publisher\":\"mjmwvvjektcx\",\"planInfo\":{\"publisherId\":\"hwlrsf\",\"planId\":\"zpwv\",\"offerId\":\"dqgbiqylihkaetc\"},\"supportedClusterTypes\":[\"fcivfsnkym\",\"ctq\",\"jf\",\"ebrjcxe\"],\"supportedScopes\":{\"defaultScope\":\"wutttxfvjrbi\",\"clusterScopeSettings\":{\"properties\":{\"allowMultipleInstances\":true,\"defaultReleaseNamespace\":\"c\"},\"id\":\"vahfn\",\"name\":\"jky\",\"type\":\"xjvuujqgidokg\"}}},\"id\":\"ljyoxgvcltb\",\"name\":\"sncghkjeszz\",\"type\":\"bijhtxfvgxbf\"}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        ExtensionTypesManager manager = ExtensionTypesManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureCloud.AZURE_PUBLIC_CLOUD));

        ExtensionType response = manager.extensionTypes()
            .locationGetWithResponse("heun", "mqhgyxzkonocuk", com.azure.core.util.Context.NONE)
            .getValue();

        Assertions.assertTrue(response.properties().isSystemExtension());
        Assertions.assertFalse(response.properties().isManagedIdentityRequired());
        Assertions.assertEquals("conuqszfkbeype", response.properties().description());
        Assertions.assertEquals("mjmwvvjektcx", response.properties().publisher());
        Assertions.assertEquals("hwlrsf", response.properties().planInfo().publisherId());
        Assertions.assertEquals("zpwv", response.properties().planInfo().planId());
        Assertions.assertEquals("dqgbiqylihkaetc", response.properties().planInfo().offerId());
        Assertions.assertEquals("fcivfsnkym", response.properties().supportedClusterTypes().get(0));
        Assertions.assertEquals("wutttxfvjrbi", response.properties().supportedScopes().defaultScope());
        Assertions.assertTrue(response.properties().supportedScopes().clusterScopeSettings().allowMultipleInstances());
        Assertions.assertEquals("c",
            response.properties().supportedScopes().clusterScopeSettings().defaultReleaseNamespace());
    }
}
