// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.eventgrid.EventGridManager;
import com.azure.resourcemanager.eventgrid.models.EventDefinitionKind;
import com.azure.resourcemanager.eventgrid.models.IdentityType;
import com.azure.resourcemanager.eventgrid.models.PartnerTopic;
import com.azure.resourcemanager.eventgrid.models.PartnerTopicActivationState;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import java.util.UUID;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class PartnerTopicsGetByResourceGroupWithResponseMockTests {
    @Test
    public void testGetByResourceGroupWithResponse() throws Exception {
        String responseStr
            = "{\"properties\":{\"partnerRegistrationImmutableId\":\"d2b3e193-7334-4f99-baa2-736c7e7097fd\",\"source\":\"uck\",\"eventTypeInfo\":{\"kind\":\"Inline\",\"inlineEventTypes\":{\"eiqbcbgvsbts\":{\"description\":\"tiiqqcqikclsmaln\",\"displayName\":\"woykdnonaaxwm\",\"documentationUrl\":\"ru\",\"dataSchemaUrl\":\"qcwnynl\"}}},\"expirationTimeIfNotActivatedUtc\":\"2021-07-28T19:39:39Z\",\"provisioningState\":\"Succeeded\",\"activationState\":\"NeverActivated\",\"partnerTopicFriendlyDescription\":\"xuvj\",\"messageForActivation\":\"mnrqstjcmetwml\"},\"identity\":{\"type\":\"UserAssigned\",\"principalId\":\"vvdhgjn\",\"tenantId\":\"yqipslzmvcdsvm\",\"userAssignedIdentities\":{\"ybfzdqekivycp\":{\"principalId\":\"ekdtfobvfiyb\",\"clientId\":\"ich\"},\"lpryf\":{\"principalId\":\"vdizulrqtbh\",\"clientId\":\"ezp\"},\"cgndjgdp\":{\"principalId\":\"mdutzfk\",\"clientId\":\"lnoud\"},\"htujcyohigimwdc\":{\"principalId\":\"ggqqyeqfcb\",\"clientId\":\"lpyuflqjf\"}}},\"location\":\"klkqnqvkixnmb\",\"tags\":{\"zayspzvriet\":\"cuyrzwim\",\"pvdvatlzmgs\":\"fphmdzxplg\"},\"id\":\"hnzrsbkkzovlzdm\",\"name\":\"fmfws\",\"type\":\"afofu\"}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        EventGridManager manager = EventGridManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        PartnerTopic response = manager.partnerTopics()
            .getByResourceGroupWithResponse("rcltungbsoljckm", "i", com.azure.core.util.Context.NONE)
            .getValue();

        Assertions.assertEquals("klkqnqvkixnmb", response.location());
        Assertions.assertEquals("cuyrzwim", response.tags().get("zayspzvriet"));
        Assertions.assertEquals(IdentityType.USER_ASSIGNED, response.identity().type());
        Assertions.assertEquals("vvdhgjn", response.identity().principalId());
        Assertions.assertEquals("yqipslzmvcdsvm", response.identity().tenantId());
        Assertions.assertEquals("ekdtfobvfiyb",
            response.identity().userAssignedIdentities().get("ybfzdqekivycp").principalId());
        Assertions.assertEquals("ich", response.identity().userAssignedIdentities().get("ybfzdqekivycp").clientId());
        Assertions.assertEquals(UUID.fromString("d2b3e193-7334-4f99-baa2-736c7e7097fd"),
            response.partnerRegistrationImmutableId());
        Assertions.assertEquals("uck", response.source());
        Assertions.assertEquals(EventDefinitionKind.INLINE, response.eventTypeInfo().kind());
        Assertions.assertEquals("tiiqqcqikclsmaln",
            response.eventTypeInfo().inlineEventTypes().get("eiqbcbgvsbts").description());
        Assertions.assertEquals("woykdnonaaxwm",
            response.eventTypeInfo().inlineEventTypes().get("eiqbcbgvsbts").displayName());
        Assertions.assertEquals("ru",
            response.eventTypeInfo().inlineEventTypes().get("eiqbcbgvsbts").documentationUrl());
        Assertions.assertEquals("qcwnynl",
            response.eventTypeInfo().inlineEventTypes().get("eiqbcbgvsbts").dataSchemaUrl());
        Assertions.assertEquals(OffsetDateTime.parse("2021-07-28T19:39:39Z"),
            response.expirationTimeIfNotActivatedUtc());
        Assertions.assertEquals(PartnerTopicActivationState.NEVER_ACTIVATED, response.activationState());
        Assertions.assertEquals("xuvj", response.partnerTopicFriendlyDescription());
        Assertions.assertEquals("mnrqstjcmetwml", response.messageForActivation());
    }
}
