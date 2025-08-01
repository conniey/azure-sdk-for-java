// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.models.AzureCloud;
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

public final class PartnerTopicsActivateWithResponseMockTests {
    @Test
    public void testActivateWithResponse() throws Exception {
        String responseStr
            = "{\"properties\":{\"partnerRegistrationImmutableId\":\"47babc85-534e-4f52-9b96-b841109b1da4\",\"source\":\"xeezwyhjmbjiqe\",\"eventTypeInfo\":{\"kind\":\"Inline\",\"inlineEventTypes\":{\"vnensmuffiw\":{\"description\":\"hc\",\"displayName\":\"pyvdkgdets\",\"documentationUrl\":\"canzb\",\"dataSchemaUrl\":\"kwuyck\"},\"dxjxdu\":{\"description\":\"ctvbpzujqjtotdx\",\"displayName\":\"scsl\",\"documentationUrl\":\"uusiecktybh\",\"dataSchemaUrl\":\"xidhhxomil\"},\"qqy\":{\"description\":\"wjwi\",\"displayName\":\"qrslaate\",\"documentationUrl\":\"wuj\",\"dataSchemaUrl\":\"gxqgqwlxrhgtvhv\"},\"tyalh\":{\"description\":\"kkt\",\"displayName\":\"zejogmkorvvmvm\",\"documentationUrl\":\"fnqh\",\"dataSchemaUrl\":\"snosnqliwkmzojf\"}}},\"expirationTimeIfNotActivatedUtc\":\"2021-10-17T04:22:16Z\",\"provisioningState\":\"Creating\",\"activationState\":\"Deactivated\",\"partnerTopicFriendlyDescription\":\"bjbhrpgiqsttc\",\"messageForActivation\":\"rcmmaixpqj\"},\"identity\":{\"type\":\"SystemAssigned, UserAssigned\",\"principalId\":\"ksldttohqclnaih\",\"tenantId\":\"siqikvllrht\",\"userAssignedIdentities\":{\"bun\":{\"principalId\":\"xkoi\",\"clientId\":\"trawrqkza\"},\"bduxapgrcq\":{\"principalId\":\"aklwzlwee\",\"clientId\":\"nejzltkaszfjsxs\"},\"esdfedsb\":{\"principalId\":\"mvrdjomlnwsbv\",\"clientId\":\"lsflxk\"},\"i\":{\"principalId\":\"ancoinmphymcqid\",\"clientId\":\"tvdhqnufbxwe\"}}},\"location\":\"ntojovfnybydhuih\",\"tags\":{\"uaorhjk\":\"wud\",\"amqprlo\":\"hwvumosqir\",\"zcmtagelajdyolj\":\"rugejcvjkjy\"},\"id\":\"qy\",\"name\":\"qfmzsizzhravrc\",\"type\":\"kjymgqbgcxh\"}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        EventGridManager manager = EventGridManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureCloud.AZURE_PUBLIC_CLOUD));

        PartnerTopic response = manager.partnerTopics()
            .activateWithResponse("wosstfjxtvlxx", "qfcwr", com.azure.core.util.Context.NONE)
            .getValue();

        Assertions.assertEquals("ntojovfnybydhuih", response.location());
        Assertions.assertEquals("wud", response.tags().get("uaorhjk"));
        Assertions.assertEquals(IdentityType.SYSTEM_ASSIGNED_USER_ASSIGNED, response.identity().type());
        Assertions.assertEquals("ksldttohqclnaih", response.identity().principalId());
        Assertions.assertEquals("siqikvllrht", response.identity().tenantId());
        Assertions.assertEquals("xkoi", response.identity().userAssignedIdentities().get("bun").principalId());
        Assertions.assertEquals("trawrqkza", response.identity().userAssignedIdentities().get("bun").clientId());
        Assertions.assertEquals(UUID.fromString("47babc85-534e-4f52-9b96-b841109b1da4"),
            response.partnerRegistrationImmutableId());
        Assertions.assertEquals("xeezwyhjmbjiqe", response.source());
        Assertions.assertEquals(EventDefinitionKind.INLINE, response.eventTypeInfo().kind());
        Assertions.assertEquals("hc", response.eventTypeInfo().inlineEventTypes().get("vnensmuffiw").description());
        Assertions.assertEquals("pyvdkgdets",
            response.eventTypeInfo().inlineEventTypes().get("vnensmuffiw").displayName());
        Assertions.assertEquals("canzb",
            response.eventTypeInfo().inlineEventTypes().get("vnensmuffiw").documentationUrl());
        Assertions.assertEquals("kwuyck",
            response.eventTypeInfo().inlineEventTypes().get("vnensmuffiw").dataSchemaUrl());
        Assertions.assertEquals(OffsetDateTime.parse("2021-10-17T04:22:16Z"),
            response.expirationTimeIfNotActivatedUtc());
        Assertions.assertEquals(PartnerTopicActivationState.DEACTIVATED, response.activationState());
        Assertions.assertEquals("bjbhrpgiqsttc", response.partnerTopicFriendlyDescription());
        Assertions.assertEquals("rcmmaixpqj", response.messageForActivation());
    }
}
