// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hdinsight.containers.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.resourcemanager.hdinsight.containers.HDInsightContainersManager;
import com.azure.resourcemanager.hdinsight.containers.models.ClusterPool;
import com.azure.resourcemanager.hdinsight.containers.models.OutboundType;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class ClusterPoolsGetByResourceGroupWithResponseMockTests {
    @Test
    public void testGetByResourceGroupWithResponse() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr
            = "{\"properties\":{\"provisioningState\":\"Canceled\",\"deploymentId\":\"irgne\",\"managedResourceGroupName\":\"twqmsniffcdmqnr\",\"aksManagedResourceGroupName\":\"lpijnkrxfrd\",\"clusterPoolProfile\":{\"clusterPoolVersion\":\"c\"},\"computeProfile\":{\"vmSize\":\"atiz\",\"count\":99900434},\"aksClusterProfile\":{\"aksClusterResourceId\":\"sxiftozq\",\"aksClusterAgentPoolIdentityProfile\":{\"msiResourceId\":\"hftwesgog\",\"msiClientId\":\"zhonnxkrlgnyhmo\",\"msiObjectId\":\"sxkkg\"},\"aksVersion\":\"rrghxjbdhqxvcxgf\"},\"networkProfile\":{\"subnetId\":\"dsofbshrns\",\"outboundType\":\"loadBalancer\",\"enablePrivateApiServer\":false,\"apiServerAuthorizedIpRanges\":[\"z\"]},\"logAnalyticsProfile\":{\"enabled\":true,\"workspaceId\":\"cnunvjsr\"},\"status\":\"f\"},\"location\":\"nopqgikyzirtx\",\"tags\":{\"ejnt\":\"x\",\"dxtqmieoxo\":\"sewgioilqukr\",\"hhavgrvkffovjz\":\"ggufhyaomtb\"},\"id\":\"pjbi\",\"name\":\"gjmfxumvfcl\",\"type\":\"yo\"}";

        Mockito.when(httpResponse.getStatusCode()).thenReturn(200);
        Mockito.when(httpResponse.getHeaders()).thenReturn(new HttpHeaders());
        Mockito.when(httpResponse.getBody())
            .thenReturn(Flux.just(ByteBuffer.wrap(responseStr.getBytes(StandardCharsets.UTF_8))));
        Mockito.when(httpResponse.getBodyAsByteArray())
            .thenReturn(Mono.just(responseStr.getBytes(StandardCharsets.UTF_8)));
        Mockito.when(httpClient.send(httpRequest.capture(), Mockito.any())).thenReturn(Mono.defer(() -> {
            Mockito.when(httpResponse.getRequest()).thenReturn(httpRequest.getValue());
            return Mono.just(httpResponse);
        }));

        HDInsightContainersManager manager = HDInsightContainersManager.configure().withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        ClusterPool response = manager.clusterPools()
            .getByResourceGroupWithResponse("wggytsbwtovvt", "seinqfiuf", com.azure.core.util.Context.NONE).getValue();

        Assertions.assertEquals("nopqgikyzirtx", response.location());
        Assertions.assertEquals("x", response.tags().get("ejnt"));
        Assertions.assertEquals("twqmsniffcdmqnr", response.properties().managedResourceGroupName());
        Assertions.assertEquals("c", response.properties().clusterPoolProfile().clusterPoolVersion());
        Assertions.assertEquals("atiz", response.properties().computeProfile().vmSize());
        Assertions.assertEquals("dsofbshrns", response.properties().networkProfile().subnetId());
        Assertions.assertEquals(OutboundType.LOAD_BALANCER, response.properties().networkProfile().outboundType());
        Assertions.assertEquals(false, response.properties().networkProfile().enablePrivateApiServer());
        Assertions.assertEquals("z", response.properties().networkProfile().apiServerAuthorizedIpRanges().get(0));
        Assertions.assertEquals(true, response.properties().logAnalyticsProfile().enabled());
        Assertions.assertEquals("cnunvjsr", response.properties().logAnalyticsProfile().workspaceId());
    }
}
