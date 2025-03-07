// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.iotoperations.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.iotoperations.IoTOperationsManager;
import com.azure.resourcemanager.iotoperations.models.DataflowProfileProperties;
import com.azure.resourcemanager.iotoperations.models.DataflowProfileResource;
import com.azure.resourcemanager.iotoperations.models.DiagnosticsLogs;
import com.azure.resourcemanager.iotoperations.models.ExtendedLocation;
import com.azure.resourcemanager.iotoperations.models.ExtendedLocationType;
import com.azure.resourcemanager.iotoperations.models.Metrics;
import com.azure.resourcemanager.iotoperations.models.ProfileDiagnostics;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class DataflowProfilesCreateOrUpdateMockTests {
    @Test
    public void testCreateOrUpdate() throws Exception {
        String responseStr
            = "{\"properties\":{\"diagnostics\":{\"logs\":{\"level\":\"khbejdznxc\"},\"metrics\":{\"prometheusPort\":929609340}},\"instanceCount\":986033506,\"provisioningState\":\"Succeeded\"},\"extendedLocation\":{\"name\":\"volvtn\",\"type\":\"CustomLocation\"},\"id\":\"fzg\",\"name\":\"mjdftu\",\"type\":\"jltduceam\"}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        IoTOperationsManager manager = IoTOperationsManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        DataflowProfileResource response = manager.dataflowProfiles()
            .define("foimwkslircizjxv")
            .withExistingInstance("qg", "zpnfqntcypsxj")
            .withExtendedLocation(
                new ExtendedLocation().withName("rtwnawjslbi").withType(ExtendedLocationType.CUSTOM_LOCATION))
            .withProperties(new DataflowProfileProperties()
                .withDiagnostics(new ProfileDiagnostics().withLogs(new DiagnosticsLogs().withLevel("acvlhv"))
                    .withMetrics(new Metrics().withPrometheusPort(370516258)))
                .withInstanceCount(43830655))
            .create();

        Assertions.assertEquals("khbejdznxc", response.properties().diagnostics().logs().level());
        Assertions.assertEquals(929609340, response.properties().diagnostics().metrics().prometheusPort());
        Assertions.assertEquals(986033506, response.properties().instanceCount());
        Assertions.assertEquals("volvtn", response.extendedLocation().name());
        Assertions.assertEquals(ExtendedLocationType.CUSTOM_LOCATION, response.extendedLocation().type());
    }
}
