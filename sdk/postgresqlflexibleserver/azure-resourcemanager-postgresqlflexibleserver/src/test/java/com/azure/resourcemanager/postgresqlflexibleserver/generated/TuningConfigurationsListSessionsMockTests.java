// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.postgresqlflexibleserver.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.models.AzureCloud;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.postgresqlflexibleserver.PostgreSqlManager;
import com.azure.resourcemanager.postgresqlflexibleserver.models.SessionResource;
import com.azure.resourcemanager.postgresqlflexibleserver.models.TuningOptionEnum;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class TuningConfigurationsListSessionsMockTests {
    @Test
    public void testListSessions() throws Exception {
        String responseStr
            = "{\"value\":[{\"sessionStartTime\":\"tlbijpzg\",\"sessionId\":\"srfhf\",\"status\":\"lmknbnxwcdom\",\"preTuningAqr\":\"vfqawzfgbrttuiac\",\"postTuningAqr\":\"iexhajl\",\"preTuningTps\":\"t\",\"postTuningTps\":\"qfyuttd\"}]}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        PostgreSqlManager manager = PostgreSqlManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureCloud.AZURE_PUBLIC_CLOUD));

        PagedIterable<SessionResource> response = manager.tuningConfigurations()
            .listSessions("wvqsgny", "uuzivensrpmeyyvp", TuningOptionEnum.INDEX, com.azure.core.util.Context.NONE);

        Assertions.assertEquals("tlbijpzg", response.iterator().next().sessionStartTime());
        Assertions.assertEquals("srfhf", response.iterator().next().sessionId());
        Assertions.assertEquals("lmknbnxwcdom", response.iterator().next().status());
        Assertions.assertEquals("vfqawzfgbrttuiac", response.iterator().next().preTuningAqr());
        Assertions.assertEquals("iexhajl", response.iterator().next().postTuningAqr());
        Assertions.assertEquals("t", response.iterator().next().preTuningTps());
        Assertions.assertEquals("qfyuttd", response.iterator().next().postTuningTps());
    }
}
