// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.changeanalysis.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.changeanalysis.AzureChangeAnalysisManager;
import com.azure.resourcemanager.changeanalysis.models.Change;
import com.azure.resourcemanager.changeanalysis.models.ChangeCategory;
import com.azure.resourcemanager.changeanalysis.models.ChangeType;
import com.azure.resourcemanager.changeanalysis.models.Level;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class ResourceChangesListMockTests {
    @Test
    public void testList() throws Exception {
        String responseStr
            = "{\"value\":[{\"properties\":{\"resourceId\":\"xscpaierhhbc\",\"timeStamp\":\"2021-09-10T20:40:36Z\",\"initiatedByList\":[\"majtjaod\",\"obnbdxkqpxokaj\",\"onpimexgstxg\"],\"changeType\":\"Update\",\"propertyChanges\":[{\"changeType\":\"Add\",\"changeCategory\":\"System\",\"jsonPath\":\"mvdjwzrlovmc\",\"displayName\":\"hijco\",\"level\":\"Important\",\"description\":\"bzaqsqsycbkbfk\",\"oldValue\":\"kdkexxp\",\"newValue\":\"fmxa\",\"isDataMasked\":true},{\"changeType\":\"Add\",\"changeCategory\":\"System\",\"jsonPath\":\"toc\",\"displayName\":\"xhvpmoue\",\"level\":\"Normal\",\"description\":\"xibqeojnx\",\"oldValue\":\"zvddntwndeicbtwn\",\"newValue\":\"aoqvuh\",\"isDataMasked\":true}]},\"id\":\"f\",\"name\":\"cyddglmjthjqk\",\"type\":\"pyeicxm\"}]}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        AzureChangeAnalysisManager manager = AzureChangeAnalysisManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        PagedIterable<Change> response = manager.resourceChanges()
            .list("qajzyulpkudjkr", OffsetDateTime.parse("2021-01-07T15:53:39Z"),
                OffsetDateTime.parse("2021-10-21T07:00:30Z"), "bzhfepgzgqexz", com.azure.core.util.Context.NONE);

        Assertions.assertEquals("xscpaierhhbc", response.iterator().next().properties().resourceId());
        Assertions.assertEquals(OffsetDateTime.parse("2021-09-10T20:40:36Z"),
            response.iterator().next().properties().timestamp());
        Assertions.assertEquals("majtjaod", response.iterator().next().properties().initiatedByList().get(0));
        Assertions.assertEquals(ChangeType.UPDATE, response.iterator().next().properties().changeType());
        Assertions.assertEquals(ChangeType.ADD,
            response.iterator().next().properties().propertyChanges().get(0).changeType());
        Assertions.assertEquals(ChangeCategory.SYSTEM,
            response.iterator().next().properties().propertyChanges().get(0).changeCategory());
        Assertions.assertEquals("mvdjwzrlovmc",
            response.iterator().next().properties().propertyChanges().get(0).jsonPath());
        Assertions.assertEquals("hijco",
            response.iterator().next().properties().propertyChanges().get(0).displayName());
        Assertions.assertEquals(Level.IMPORTANT,
            response.iterator().next().properties().propertyChanges().get(0).level());
        Assertions.assertEquals("bzaqsqsycbkbfk",
            response.iterator().next().properties().propertyChanges().get(0).description());
        Assertions.assertEquals("kdkexxp", response.iterator().next().properties().propertyChanges().get(0).oldValue());
        Assertions.assertEquals("fmxa", response.iterator().next().properties().propertyChanges().get(0).newValue());
        Assertions.assertEquals(true, response.iterator().next().properties().propertyChanges().get(0).isDataMasked());
    }
}
