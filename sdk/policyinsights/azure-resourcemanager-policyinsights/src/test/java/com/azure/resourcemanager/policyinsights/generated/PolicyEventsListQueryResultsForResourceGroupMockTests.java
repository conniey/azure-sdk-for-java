// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.policyinsights.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.models.AzureCloud;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.policyinsights.PolicyInsightsManager;
import com.azure.resourcemanager.policyinsights.models.PolicyEvent;
import com.azure.resourcemanager.policyinsights.models.PolicyEventsResourceType;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class PolicyEventsListQueryResultsForResourceGroupMockTests {
    @Test
    public void testListQueryResultsForResourceGroup() throws Exception {
        String responseStr
            = "{\"value\":[{\"@odata.id\":\"fjmskdchmaiu\",\"@odata.context\":\"vlzw\",\"timestamp\":\"2021-11-14T05:20:15Z\",\"resourceId\":\"falkzazm\",\"policyAssignmentId\":\"kedgj\",\"policyDefinitionId\":\"fkmkrokz\",\"effectiveParameters\":\"hqet\",\"isCompliant\":true,\"subscriptionId\":\"tvaoznqn\",\"resourceType\":\"iezeagm\",\"resourceLocation\":\"it\",\"resourceGroup\":\"gedhfpjstlzm\",\"resourceTags\":\"syjdeolctae\",\"policyAssignmentName\":\"syrled\",\"policyAssignmentOwner\":\"ustbvtqigdx\",\"policyAssignmentParameters\":\"sgeafgfosehx\",\"policyAssignmentScope\":\"sxezppkkwaa\",\"policyDefinitionName\":\"k\",\"policyDefinitionAction\":\"jlpzeqtoyrp\",\"policyDefinitionCategory\":\"xlaj\",\"policySetDefinitionId\":\"lpquevhamfow\",\"policySetDefinitionName\":\"btmkekxpkzwaq\",\"policySetDefinitionOwner\":\"fqovc\",\"policySetDefinitionCategory\":\"qbplvfiduszte\",\"policySetDefinitionParameters\":\"byjgmsfepx\",\"managementGroupIds\":\"hpqadagrhrdicxdw\",\"policyDefinitionReferenceId\":\"fowxwyovcxjsgbi\",\"complianceState\":\"ukdveksbuhoduc\",\"tenantId\":\"lscrdpibfdyjduss\",\"principalOid\":\"szekbh\",\"components\":[{\"id\":\"aggkrehbfrn\",\"type\":\"bffljfiimreoag\",\"name\":\"taadu\",\"timestamp\":\"2021-03-04T00:00:31Z\",\"tenantId\":\"xfavsqwudoh\",\"principalOid\":\"lfmn\",\"policyDefinitionAction\":\"kpsimsfeypofqp\",\"rmmttjxop\":\"datayqgs\",\"htwzmqilr\":\"datagerhsmvg\",\"fni\":\"dataxy\",\"aedrympmlqoin\":\"datasqywwwmhkru\"},{\"id\":\"duewihapfj\",\"type\":\"knjdiqfliejhp\",\"name\":\"bi\",\"timestamp\":\"2021-07-01T22:38:01Z\",\"tenantId\":\"bwceivbvzip\",\"principalOid\":\"xgoooxzprad\",\"policyDefinitionAction\":\"kxknpdg\",\"odkwwnbafocto\":\"datajsugswhgs\"},{\"id\":\"haquvwsxbgnvk\",\"type\":\"vqchoadhrs\",\"name\":\"vzvsp\",\"timestamp\":\"2021-01-16T16:55:45Z\",\"tenantId\":\"r\",\"principalOid\":\"ajglzrsubklr\",\"policyDefinitionAction\":\"jnltcetjdvqydi\",\"ruwdxvqzxoebwgj\":\"datakw\",\"wtzvpakloz\":\"databibanbau\"}],\"s\":\"datazrpejpl\",\"rswgkpjhboyikeb\":\"datanbtttkgsuxu\"}]}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        PolicyInsightsManager manager = PolicyInsightsManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureCloud.AZURE_PUBLIC_CLOUD));

        PagedIterable<PolicyEvent> response = manager.policyEvents()
            .listQueryResultsForResourceGroup(PolicyEventsResourceType.DEFAULT, "tuz", "jctibpvbkae", 1932673407, "smz",
                "g", OffsetDateTime.parse("2021-08-08T07:30:41Z"), OffsetDateTime.parse("2021-06-14T07:19:19Z"), "akw",
                "eivmak", "hysowljuxlkbect", com.azure.core.util.Context.NONE);

        Assertions.assertEquals(OffsetDateTime.parse("2021-11-14T05:20:15Z"), response.iterator().next().timestamp());
        Assertions.assertEquals("falkzazm", response.iterator().next().resourceId());
        Assertions.assertEquals("kedgj", response.iterator().next().policyAssignmentId());
        Assertions.assertEquals("fkmkrokz", response.iterator().next().policyDefinitionId());
        Assertions.assertEquals("hqet", response.iterator().next().effectiveParameters());
        Assertions.assertTrue(response.iterator().next().isCompliant());
        Assertions.assertEquals("tvaoznqn", response.iterator().next().subscriptionId());
        Assertions.assertEquals("iezeagm", response.iterator().next().resourceType());
        Assertions.assertEquals("it", response.iterator().next().resourceLocation());
        Assertions.assertEquals("gedhfpjstlzm", response.iterator().next().resourceGroup());
        Assertions.assertEquals("syjdeolctae", response.iterator().next().resourceTags());
        Assertions.assertEquals("syrled", response.iterator().next().policyAssignmentName());
        Assertions.assertEquals("ustbvtqigdx", response.iterator().next().policyAssignmentOwner());
        Assertions.assertEquals("sgeafgfosehx", response.iterator().next().policyAssignmentParameters());
        Assertions.assertEquals("sxezppkkwaa", response.iterator().next().policyAssignmentScope());
        Assertions.assertEquals("k", response.iterator().next().policyDefinitionName());
        Assertions.assertEquals("jlpzeqtoyrp", response.iterator().next().policyDefinitionAction());
        Assertions.assertEquals("xlaj", response.iterator().next().policyDefinitionCategory());
        Assertions.assertEquals("lpquevhamfow", response.iterator().next().policySetDefinitionId());
        Assertions.assertEquals("btmkekxpkzwaq", response.iterator().next().policySetDefinitionName());
        Assertions.assertEquals("fqovc", response.iterator().next().policySetDefinitionOwner());
        Assertions.assertEquals("qbplvfiduszte", response.iterator().next().policySetDefinitionCategory());
        Assertions.assertEquals("byjgmsfepx", response.iterator().next().policySetDefinitionParameters());
        Assertions.assertEquals("hpqadagrhrdicxdw", response.iterator().next().managementGroupIds());
        Assertions.assertEquals("fowxwyovcxjsgbi", response.iterator().next().policyDefinitionReferenceId());
        Assertions.assertEquals("ukdveksbuhoduc", response.iterator().next().complianceState());
        Assertions.assertEquals("lscrdpibfdyjduss", response.iterator().next().tenantId());
        Assertions.assertEquals("szekbh", response.iterator().next().principalOid());
        Assertions.assertEquals("aggkrehbfrn", response.iterator().next().components().get(0).id());
        Assertions.assertEquals("bffljfiimreoag", response.iterator().next().components().get(0).type());
        Assertions.assertEquals("taadu", response.iterator().next().components().get(0).name());
        Assertions.assertEquals(OffsetDateTime.parse("2021-03-04T00:00:31Z"),
            response.iterator().next().components().get(0).timestamp());
        Assertions.assertEquals("xfavsqwudoh", response.iterator().next().components().get(0).tenantId());
        Assertions.assertEquals("lfmn", response.iterator().next().components().get(0).principalOid());
        Assertions.assertEquals("kpsimsfeypofqp",
            response.iterator().next().components().get(0).policyDefinitionAction());
    }
}
