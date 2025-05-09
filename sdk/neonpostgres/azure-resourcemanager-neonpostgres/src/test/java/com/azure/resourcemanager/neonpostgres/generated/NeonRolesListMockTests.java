// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.neonpostgres.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.models.AzureCloud;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.neonpostgres.NeonPostgresManager;
import com.azure.resourcemanager.neonpostgres.models.NeonRole;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class NeonRolesListMockTests {
    @Test
    public void testList() throws Exception {
        String responseStr
            = "{\"value\":[{\"properties\":{\"entityId\":\"rxxhyrkqakof\",\"entityName\":\"freprfvm\",\"createdAt\":\"nwt\",\"provisioningState\":\"Failed\",\"attributes\":[{\"name\":\"hi\",\"value\":\"bcejopylbl\"},{\"name\":\"sp\",\"value\":\"r\"},{\"name\":\"cspimtcvvfxrdy\",\"value\":\"zfslxizhqikmgob\"},{\"name\":\"iqemcdiiisklbon\",\"value\":\"xu\"}],\"branchId\":\"xvtrkfk\",\"permissions\":[\"jqnnpjwkosnyxi\",\"fou\",\"jcxgdqmrlhnzkwo\",\"swnyinxuprrxyxwj\"],\"isSuperUser\":false},\"id\":\"qployu\",\"name\":\"kdcpvu\",\"type\":\"trsvjmnsvujnjkt\"}]}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        NeonPostgresManager manager = NeonPostgresManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureCloud.AZURE_PUBLIC_CLOUD));

        PagedIterable<NeonRole> response = manager.neonRoles()
            .list("yo", "aadcndazabundt", "ewkaupwhl", "yckremgjlmsvdo", com.azure.core.util.Context.NONE);

        Assertions.assertEquals("freprfvm", response.iterator().next().properties().entityName());
        Assertions.assertEquals("hi", response.iterator().next().properties().attributes().get(0).name());
        Assertions.assertEquals("bcejopylbl", response.iterator().next().properties().attributes().get(0).value());
        Assertions.assertEquals("xvtrkfk", response.iterator().next().properties().branchId());
        Assertions.assertEquals("jqnnpjwkosnyxi", response.iterator().next().properties().permissions().get(0));
        Assertions.assertFalse(response.iterator().next().properties().isSuperUser());
    }
}
