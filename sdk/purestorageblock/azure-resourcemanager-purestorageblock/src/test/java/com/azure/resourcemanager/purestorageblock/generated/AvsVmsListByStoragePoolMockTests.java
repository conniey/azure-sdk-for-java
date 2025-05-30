// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.purestorageblock.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.models.AzureCloud;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.purestorageblock.PureStorageBlockManager;
import com.azure.resourcemanager.purestorageblock.models.AvsVm;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class AvsVmsListByStoragePoolMockTests {
    @Test
    public void testListByStoragePool() throws Exception {
        String responseStr
            = "{\"value\":[{\"properties\":{\"storagePoolInternalId\":\"akchzyvlixqnrk\",\"storagePoolResourceId\":\"kjibnxmysuxswqrn\",\"displayName\":\"lwi\",\"createdTimestamp\":\"sttex\",\"softDeletion\":{\"destroyed\":true,\"eradicationTimestamp\":\"wcyyufmhruncu\"},\"volumeContainerType\":\"avs\",\"avs\":{\"vmId\":\"pkcdqzhlct\",\"vmName\":\"dunqnd\",\"vmType\":\"vvol\",\"avsVmInternalId\":\"pchrqbn\"},\"space\":{\"totalUsed\":7384163367118885266,\"unique\":5708023666168728932,\"snapshots\":5663417988942053637,\"shared\":19081015441774011},\"provisioningState\":\"Canceled\"},\"id\":\"xjumvq\",\"name\":\"olihrra\",\"type\":\"ouau\"}]}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        PureStorageBlockManager manager = PureStorageBlockManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureCloud.AZURE_PUBLIC_CLOUD));

        PagedIterable<AvsVm> response
            = manager.avsVms().listByStoragePool("lalniex", "srzpgepqtybbww", com.azure.core.util.Context.NONE);

        Assertions.assertTrue(response.iterator().next().properties().softDeletion().destroyed());
    }
}
