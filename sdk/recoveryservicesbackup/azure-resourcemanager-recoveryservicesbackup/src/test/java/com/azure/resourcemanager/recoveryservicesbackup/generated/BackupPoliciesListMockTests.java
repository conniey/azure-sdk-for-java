// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.models.AzureCloud;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.recoveryservicesbackup.RecoveryServicesBackupManager;
import com.azure.resourcemanager.recoveryservicesbackup.models.ProtectionPolicyResource;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class BackupPoliciesListMockTests {
    @Test
    public void testList() throws Exception {
        String responseStr
            = "{\"value\":[{\"properties\":{\"backupManagementType\":\"ProtectionPolicy\",\"protectedItemsCount\":940682362,\"resourceGuardOperationRequests\":[\"vyoanfbcswqagywv\",\"xigvjrktpgaeuk\"]},\"eTag\":\"wohpmwhqnucs\",\"location\":\"lhsidsjtdl\",\"tags\":{\"e\":\"injgazlsvbzfcpuo\",\"krdre\":\"wjcciklhsy\",\"h\":\"xolriy\"},\"id\":\"beivdlhydwbdbfg\",\"name\":\"lpu\",\"type\":\"ytjlkesmmpath\"}]}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        RecoveryServicesBackupManager manager = RecoveryServicesBackupManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureCloud.AZURE_PUBLIC_CLOUD));

        PagedIterable<ProtectionPolicyResource> response
            = manager.backupPolicies().list("leqioulndh", "yoeojhtollhs", "idmytzln", com.azure.core.util.Context.NONE);

        Assertions.assertEquals("lhsidsjtdl", response.iterator().next().location());
        Assertions.assertEquals("injgazlsvbzfcpuo", response.iterator().next().tags().get("e"));
        Assertions.assertEquals(940682362, response.iterator().next().properties().protectedItemsCount());
        Assertions.assertEquals("vyoanfbcswqagywv",
            response.iterator().next().properties().resourceGuardOperationRequests().get(0));
        Assertions.assertEquals("wohpmwhqnucs", response.iterator().next().etag());
    }
}
