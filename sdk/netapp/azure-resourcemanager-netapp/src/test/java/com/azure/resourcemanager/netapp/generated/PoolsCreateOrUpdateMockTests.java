// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.netapp.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.models.AzureCloud;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.netapp.NetAppFilesManager;
import com.azure.resourcemanager.netapp.models.CapacityPool;
import com.azure.resourcemanager.netapp.models.EncryptionType;
import com.azure.resourcemanager.netapp.models.QosType;
import com.azure.resourcemanager.netapp.models.ServiceLevel;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class PoolsCreateOrUpdateMockTests {
    @Test
    public void testCreateOrUpdate() throws Exception {
        String responseStr
            = "{\"etag\":\"gleohi\",\"properties\":{\"poolId\":\"tnluankrr\",\"size\":8132506550445245383,\"serviceLevel\":\"StandardZRS\",\"provisioningState\":\"Succeeded\",\"totalThroughputMibps\":39.060837,\"utilizedThroughputMibps\":0.7475734,\"customThroughputMibps\":82.000725,\"qosType\":\"Manual\",\"coolAccess\":false,\"encryptionType\":\"Single\"},\"location\":\"cevehjkuyxoafg\",\"tags\":{\"aeylinm\":\"lt\",\"irpghriypoqeyh\":\"gv\"},\"id\":\"qhykprlpyzn\",\"name\":\"ciqdsme\",\"type\":\"iitdfuxt\"}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        NetAppFilesManager manager = NetAppFilesManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureCloud.AZURE_PUBLIC_CLOUD));

        CapacityPool response = manager.pools()
            .define("boxjumvq")
            .withRegion("dvruzslzojhpctf")
            .withExistingNetAppAccount("unqndyfpchrqb", "jjrcgegydc")
            .withSize(9205555563516540319L)
            .withServiceLevel(ServiceLevel.PREMIUM)
            .withTags(mapOf("zihgrkyu", "xotngfdguge", "mfp", "zabs"))
            .withCustomThroughputMibps(93.34672F)
            .withQosType(QosType.AUTO)
            .withCoolAccess(false)
            .withEncryptionType(EncryptionType.SINGLE)
            .create();

        Assertions.assertEquals("cevehjkuyxoafg", response.location());
        Assertions.assertEquals("lt", response.tags().get("aeylinm"));
        Assertions.assertEquals(8132506550445245383L, response.size());
        Assertions.assertEquals(ServiceLevel.STANDARD_ZRS, response.serviceLevel());
        Assertions.assertEquals(82.000725F, response.customThroughputMibps());
        Assertions.assertEquals(QosType.MANUAL, response.qosType());
        Assertions.assertFalse(response.coolAccess());
        Assertions.assertEquals(EncryptionType.SINGLE, response.encryptionType());
    }

    // Use "Map.of" if available
    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
