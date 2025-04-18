// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.security.SecurityManager;
import com.azure.resourcemanager.security.models.IoTSecuritySolutionAnalyticsModelList;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class IotSecuritySolutionAnalyticsListWithResponseMockTests {
    @Test
    public void testListWithResponse() throws Exception {
        String responseStr
            = "{\"value\":[{\"properties\":{\"metrics\":{\"high\":7281626165756330252,\"medium\":2321157864214140700,\"low\":7622115265571799325},\"unhealthyDeviceCount\":1157921824849244443,\"devicesMetrics\":[{},{},{}],\"topAlertedDevices\":[{},{}],\"mostPrevalentDeviceAlerts\":[{},{}],\"mostPrevalentDeviceRecommendations\":[{}]},\"id\":\"yur\",\"name\":\"phyjdxravj\",\"type\":\"qdbrxmrgc\"},{\"properties\":{\"metrics\":{\"high\":1403759508128220706,\"medium\":1106569210264329065,\"low\":316638403801617867},\"unhealthyDeviceCount\":2373847388322087225,\"devicesMetrics\":[{}],\"topAlertedDevices\":[{},{}],\"mostPrevalentDeviceAlerts\":[{},{},{},{}],\"mostPrevalentDeviceRecommendations\":[{}]},\"id\":\"sioycblevpmcl\",\"name\":\"jy\",\"type\":\"kyxl\"},{\"properties\":{\"metrics\":{\"high\":3754918338714803100,\"medium\":6582954552548768163,\"low\":6631888250026709913},\"unhealthyDeviceCount\":2472774019659326082,\"devicesMetrics\":[{},{},{},{}],\"topAlertedDevices\":[{},{},{},{}],\"mostPrevalentDeviceAlerts\":[{}],\"mostPrevalentDeviceRecommendations\":[{},{},{},{}]},\"id\":\"lz\",\"name\":\"sczpgvdwnapfd\",\"type\":\"wow\"}],\"nextLink\":\"ptnuwjtkschgc\"}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        SecurityManager manager = SecurityManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        IoTSecuritySolutionAnalyticsModelList response = manager.iotSecuritySolutionAnalytics()
            .listWithResponse("vodrrslblxydkxr", "vvbxiwkgfbqljnq", com.azure.core.util.Context.NONE)
            .getValue();

    }
}
