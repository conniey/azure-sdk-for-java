// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.policyinsights.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.policyinsights.PolicyInsightsManager;
import com.azure.resourcemanager.policyinsights.models.PolicyEvent;
import com.azure.resourcemanager.policyinsights.models.PolicyEventsResourceType;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class PolicyEventsListQueryResultsForSubscriptionMockTests {
    @Test
    public void testListQueryResultsForSubscription() throws Exception {
        String responseStr
            = "{\"value\":[{\"@odata.id\":\"n\",\"@odata.context\":\"muii\",\"timestamp\":\"2021-06-27T11:06:31Z\",\"resourceId\":\"fohyk\",\"policyAssignmentId\":\"xbbcbrw\",\"policyDefinitionId\":\"u\",\"effectiveParameters\":\"njizb\",\"isCompliant\":false,\"subscriptionId\":\"iy\",\"resourceType\":\"vzbjuyrsrzi\",\"resourceLocation\":\"tixgbd\",\"resourceGroup\":\"ifrevk\",\"resourceTags\":\"pezkis\",\"policyAssignmentName\":\"jm\",\"policyAssignmentOwner\":\"hsyparybjuf\",\"policyAssignmentParameters\":\"bjczjnciuiyqvlda\",\"policyAssignmentScope\":\"v\",\"policyDefinitionName\":\"i\",\"policyDefinitionAction\":\"qzlgcndhzxrrfcfs\",\"policyDefinitionCategory\":\"khgsnxuwwkpphefs\",\"policySetDefinitionId\":\"xlb\",\"policySetDefinitionName\":\"omeikjcl\",\"policySetDefinitionOwner\":\"acnmwpfsuqtaaz\",\"policySetDefinitionCategory\":\"bxyxoy\",\"policySetDefinitionParameters\":\"uqqiqezxlhd\",\"managementGroupIds\":\"qdcadwvps\",\"policyDefinitionReferenceId\":\"j\",\"complianceState\":\"hjriyb\",\"tenantId\":\"zo\",\"principalOid\":\"nxwdvwnjkg\",\"components\":[{\"id\":\"xaurs\",\"type\":\"tibtyi\",\"name\":\"yvp\",\"timestamp\":\"2021-02-03T04:51:25Z\",\"tenantId\":\"jpnqnoowsbeden\",\"principalOid\":\"xkxbhxvu\",\"policyDefinitionAction\":\"ulgm\",\"\":{\"fajs\":\"dataevdyz\",\"izjixlq\":\"datakskmqozzkivyhjrl\"}}],\"\":{\"solronqqlm\":\"datafkwa\"}}]}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        PolicyInsightsManager manager = PolicyInsightsManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        PagedIterable<PolicyEvent> response = manager.policyEvents()
            .listQueryResultsForSubscription(PolicyEventsResourceType.DEFAULT, "wjcnkottl", 1925848673,
                "hvajmailfemjjzak", "wjiqullqxb", OffsetDateTime.parse("2021-05-07T20:57:39Z"),
                OffsetDateTime.parse("2021-03-20T11:01:22Z"), "rscmqerndbrnye", "fltfnnxr", "adj",
                com.azure.core.util.Context.NONE);

        Assertions.assertEquals(OffsetDateTime.parse("2021-06-27T11:06:31Z"), response.iterator().next().timestamp());
        Assertions.assertEquals("fohyk", response.iterator().next().resourceId());
        Assertions.assertEquals("xbbcbrw", response.iterator().next().policyAssignmentId());
        Assertions.assertEquals("u", response.iterator().next().policyDefinitionId());
        Assertions.assertEquals("njizb", response.iterator().next().effectiveParameters());
        Assertions.assertEquals(false, response.iterator().next().isCompliant());
        Assertions.assertEquals("iy", response.iterator().next().subscriptionId());
        Assertions.assertEquals("vzbjuyrsrzi", response.iterator().next().resourceType());
        Assertions.assertEquals("tixgbd", response.iterator().next().resourceLocation());
        Assertions.assertEquals("ifrevk", response.iterator().next().resourceGroup());
        Assertions.assertEquals("pezkis", response.iterator().next().resourceTags());
        Assertions.assertEquals("jm", response.iterator().next().policyAssignmentName());
        Assertions.assertEquals("hsyparybjuf", response.iterator().next().policyAssignmentOwner());
        Assertions.assertEquals("bjczjnciuiyqvlda", response.iterator().next().policyAssignmentParameters());
        Assertions.assertEquals("v", response.iterator().next().policyAssignmentScope());
        Assertions.assertEquals("i", response.iterator().next().policyDefinitionName());
        Assertions.assertEquals("qzlgcndhzxrrfcfs", response.iterator().next().policyDefinitionAction());
        Assertions.assertEquals("khgsnxuwwkpphefs", response.iterator().next().policyDefinitionCategory());
        Assertions.assertEquals("xlb", response.iterator().next().policySetDefinitionId());
        Assertions.assertEquals("omeikjcl", response.iterator().next().policySetDefinitionName());
        Assertions.assertEquals("acnmwpfsuqtaaz", response.iterator().next().policySetDefinitionOwner());
        Assertions.assertEquals("bxyxoy", response.iterator().next().policySetDefinitionCategory());
        Assertions.assertEquals("uqqiqezxlhd", response.iterator().next().policySetDefinitionParameters());
        Assertions.assertEquals("qdcadwvps", response.iterator().next().managementGroupIds());
        Assertions.assertEquals("j", response.iterator().next().policyDefinitionReferenceId());
        Assertions.assertEquals("hjriyb", response.iterator().next().complianceState());
        Assertions.assertEquals("zo", response.iterator().next().tenantId());
        Assertions.assertEquals("nxwdvwnjkg", response.iterator().next().principalOid());
        Assertions.assertEquals("xaurs", response.iterator().next().components().get(0).id());
        Assertions.assertEquals("tibtyi", response.iterator().next().components().get(0).type());
        Assertions.assertEquals("yvp", response.iterator().next().components().get(0).name());
        Assertions.assertEquals(OffsetDateTime.parse("2021-02-03T04:51:25Z"),
            response.iterator().next().components().get(0).timestamp());
        Assertions.assertEquals("jpnqnoowsbeden", response.iterator().next().components().get(0).tenantId());
        Assertions.assertEquals("xkxbhxvu", response.iterator().next().components().get(0).principalOid());
        Assertions.assertEquals("ulgm", response.iterator().next().components().get(0).policyDefinitionAction());
    }
}
