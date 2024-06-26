// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridcompute.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.hybridcompute.HybridComputeManager;
import com.azure.resourcemanager.hybridcompute.models.HybridComputePrivateLinkScope;
import com.azure.resourcemanager.hybridcompute.models.PublicNetworkAccessType;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class PrivateLinkScopesGetByResourceGroupWithResponseMockTests {
    @Test
    public void testGetByResourceGroupWithResponse() throws Exception {
        String responseStr
            = "{\"properties\":{\"publicNetworkAccess\":\"Enabled\",\"provisioningState\":\"aqa\",\"privateLinkScopeId\":\"ipietgbe\",\"privateEndpointConnections\":[{\"id\":\"lbmoichd\",\"name\":\"nfpubntnbatz\",\"type\":\"qs\",\"properties\":{\"privateEndpoint\":{},\"privateLinkServiceConnectionState\":{\"status\":\"aelcat\",\"description\":\"cjuhplrvkm\"},\"provisioningState\":\"wmj\",\"groupIds\":[\"fggc\",\"kyylizr\",\"bjpsfxsfuztlvtm\",\"agb\"]}},{\"id\":\"dqlvhukoveof\",\"name\":\"rvjfnmjmvlw\",\"type\":\"giblkujrllf\",\"properties\":{\"privateEndpoint\":{},\"privateLinkServiceConnectionState\":{\"status\":\"djpuuyjucej\",\"description\":\"kzoeovvtzejetj\"},\"provisioningState\":\"nt\",\"groupIds\":[\"juzkdbqz\",\"lxrzvhqjwtr\"]}},{\"id\":\"gv\",\"name\":\"pcrrk\",\"type\":\"awjmjsmw\",\"properties\":{\"privateEndpoint\":{},\"privateLinkServiceConnectionState\":{\"status\":\"dxfzzzwyjaf\",\"description\":\"tlhguynuchl\"},\"provisioningState\":\"ltxdwhmozu\",\"groupIds\":[\"vlnsnnjz\",\"pafolp\",\"mwamxqzragpgdph\"]}}]},\"location\":\"dulajvlejchcs\",\"tags\":{\"cnzqtpjhmqr\":\"knmzlanrupdwvnp\",\"hlaiwd\":\"v\",\"hzdtxetlgydlh\":\"xsmlz\"},\"id\":\"vlnnpx\",\"name\":\"b\",\"type\":\"fiqgeaar\"}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        HybridComputeManager manager = HybridComputeManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        HybridComputePrivateLinkScope response = manager.privateLinkScopes()
            .getByResourceGroupWithResponse("qotoihiqakydiwfb", "kwpzdqtvh", com.azure.core.util.Context.NONE)
            .getValue();

        Assertions.assertEquals("dulajvlejchcs", response.location());
        Assertions.assertEquals("knmzlanrupdwvnp", response.tags().get("cnzqtpjhmqr"));
        Assertions.assertEquals(PublicNetworkAccessType.ENABLED, response.properties().publicNetworkAccess());
    }
}
