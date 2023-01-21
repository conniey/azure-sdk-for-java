// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storagepool.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.resourcemanager.storagepool.StoragePoolManager;
import com.azure.resourcemanager.storagepool.models.DiskPool;
import com.azure.resourcemanager.storagepool.models.OperationalStatus;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class DiskPoolsGetByResourceGroupWithResponseMockTests {
    @Test
    public void testGetByResourceGroupWithResponse() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr =
            "{\"sku\":{\"name\":\"gx\",\"tier\":\"rslpmutwuoeg\"},\"properties\":{\"provisioningState\":\"Canceled\",\"availabilityZones\":[\"hjwniyqsluic\",\"dggkzzlvmbmpa\"],\"status\":\"Stopped"
                + " (deallocated)\",\"disks\":[],\"subnetId\":\"fv\",\"additionalCapabilities\":[\"yw\"]},\"managedBy\":\"pfvmwyhrfou\",\"managedByExtended\":[\"aakc\",\"wiyzvqtmnubexkp\"],\"systemData\":{\"createdBy\":\"mond\",\"createdByType\":\"ManagedIdentity\",\"createdAt\":\"2021-03-05T21:01:30Z\",\"lastModifiedBy\":\"ypomgkopkwho\",\"lastModifiedByType\":\"ManagedIdentity\",\"lastModifiedAt\":\"2021-12-07T09:07:14Z\"},\"location\":\"qgxy\",\"tags\":{\"xozap\":\"cmbqfqvmk\",\"dd\":\"helxprglya\",\"rjxgciqib\":\"kcbcue\",\"sdqrhzoymibmrq\":\"hos\"},\"id\":\"ibahwflus\",\"name\":\"dtmhrkwofyyvoqa\",\"type\":\"piexpbtgiw\"}";

        Mockito.when(httpResponse.getStatusCode()).thenReturn(200);
        Mockito.when(httpResponse.getHeaders()).thenReturn(new HttpHeaders());
        Mockito
            .when(httpResponse.getBody())
            .thenReturn(Flux.just(ByteBuffer.wrap(responseStr.getBytes(StandardCharsets.UTF_8))));
        Mockito
            .when(httpResponse.getBodyAsByteArray())
            .thenReturn(Mono.just(responseStr.getBytes(StandardCharsets.UTF_8)));
        Mockito
            .when(httpClient.send(httpRequest.capture(), Mockito.any()))
            .thenReturn(
                Mono
                    .defer(
                        () -> {
                            Mockito.when(httpResponse.getRequest()).thenReturn(httpRequest.getValue());
                            return Mono.just(httpResponse);
                        }));

        StoragePoolManager manager =
            StoragePoolManager
                .configure()
                .withHttpClient(httpClient)
                .authenticate(
                    tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                    new AzureProfile("", "", AzureEnvironment.AZURE));

        DiskPool response =
            manager
                .diskPools()
                .getByResourceGroupWithResponse("opcjwvnhd", "d", com.azure.core.util.Context.NONE)
                .getValue();

        Assertions.assertEquals("qgxy", response.location());
        Assertions.assertEquals("cmbqfqvmk", response.tags().get("xozap"));
        Assertions.assertEquals("gx", response.nameSkuName());
        Assertions.assertEquals("rslpmutwuoeg", response.tier());
        Assertions.assertEquals("hjwniyqsluic", response.availabilityZones().get(0));
        Assertions.assertEquals(OperationalStatus.STOPPED_DEALLOCATED, response.status());
        Assertions.assertEquals("fv", response.subnetId());
        Assertions.assertEquals("yw", response.additionalCapabilities().get(0));
    }
}