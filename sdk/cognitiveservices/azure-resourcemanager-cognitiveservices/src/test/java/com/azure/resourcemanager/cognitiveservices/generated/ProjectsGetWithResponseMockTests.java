// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cognitiveservices.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.models.AzureCloud;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.cognitiveservices.CognitiveServicesManager;
import com.azure.resourcemanager.cognitiveservices.models.Project;
import com.azure.resourcemanager.cognitiveservices.models.ResourceIdentityType;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class ProjectsGetWithResponseMockTests {
    @Test
    public void testGetWithResponse() throws Exception {
        String responseStr
            = "{\"identity\":{\"type\":\"UserAssigned\",\"tenantId\":\"fwfqchvcze\",\"principalId\":\"nnctagfyvrt\",\"userAssignedIdentities\":{\"ckmzeoxin\":{\"principalId\":\"mhzcgkrepdqh\",\"clientId\":\"hwqwemvxqa\"},\"znzangprbfaxy\":{\"principalId\":\"re\",\"clientId\":\"twhlpuzjpce\"},\"nfee\":{\"principalId\":\"lbciphmsexro\",\"clientId\":\"ndktxfv\"},\"xe\":{\"principalId\":\"pkrietbgni\",\"clientId\":\"owwzkyfwnwpi\"}}},\"tags\":{\"kwsdgkj\":\"mpepkldmaxxijv\",\"o\":\"yacwrasekwefc\"},\"location\":\"woqartwy\",\"properties\":{\"provisioningState\":\"Canceled\",\"displayName\":\"advatdavuqmcb\",\"description\":\"sfobjl\",\"endpoints\":{\"mioyo\":\"jezcjumvps\",\"clibbfqpsp\":\"glkmiqwnnr\",\"exzgpmnmabedd\":\"ladydgnhautwu\",\"gq\":\"ilwgdfpfqfpcvstc\"},\"isDefault\":false},\"etag\":\"rfwxbsmtblj\",\"id\":\"ehhcifkwdv\",\"name\":\"tbrekqhsqhtf\",\"type\":\"wpq\"}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        CognitiveServicesManager manager = CognitiveServicesManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureCloud.AZURE_PUBLIC_CLOUD));

        Project response = manager.projects()
            .getWithResponse("luiyuosnuudte", "vhyibdrqrsw", "buubpyrowt", com.azure.core.util.Context.NONE)
            .getValue();

        Assertions.assertEquals(ResourceIdentityType.USER_ASSIGNED, response.identity().type());
        Assertions.assertEquals("mpepkldmaxxijv", response.tags().get("kwsdgkj"));
        Assertions.assertEquals("woqartwy", response.location());
        Assertions.assertEquals("advatdavuqmcb", response.properties().displayName());
        Assertions.assertEquals("sfobjl", response.properties().description());
    }
}
