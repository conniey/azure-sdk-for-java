// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devtestlabs.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.devtestlabs.DevTestLabsManager;
import com.azure.resourcemanager.devtestlabs.models.EnableStatus;
import com.azure.resourcemanager.devtestlabs.models.EnvironmentPermission;
import com.azure.resourcemanager.devtestlabs.models.Lab;
import com.azure.resourcemanager.devtestlabs.models.PremiumDataDisk;
import com.azure.resourcemanager.devtestlabs.models.StorageType;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class LabsListByResourceGroupMockTests {
    @Test
    public void testListByResourceGroup() throws Exception {
        String responseStr
            = "{\"value\":[{\"properties\":{\"defaultStorageAccount\":\"xnafbw\",\"defaultPremiumStorageAccount\":\"oohtuovmaonurjtu\",\"artifactsStorageAccount\":\"hihpvecmsl\",\"premiumDataDiskStorageAccount\":\"bl\",\"vaultName\":\"xltbsjuscvsf\",\"labStorageType\":\"Premium\",\"mandatoryArtifactsResourceIdsLinux\":[\"mgxuupbezqcc\",\"drtc\",\"ukdqkkyihztg\",\"qm\"],\"mandatoryArtifactsResourceIdsWindows\":[\"gwldo\",\"chillcecf\",\"huwaoaguhic\",\"llizs\"],\"createdDate\":\"2021-05-20T02:42:18Z\",\"premiumDataDisks\":\"Disabled\",\"environmentPermission\":\"Reader\",\"announcement\":{\"title\":\"eftkwqe\",\"markdown\":\"mvss\",\"enabled\":\"Disabled\",\"expirationDate\":\"2021-01-17T18:10:52Z\",\"expired\":false,\"provisioningState\":\"cxtczhupeukn\",\"uniqueIdentifier\":\"d\"},\"support\":{\"enabled\":\"Enabled\",\"markdown\":\"pydjfboc\"},\"vmCreationResourceGroup\":\"hhulrtywikdm\",\"publicIpId\":\"akuflgbhgauacdix\",\"loadBalancerId\":\"ufr\",\"networkSecurityGroupId\":\"yjq\",\"extendedProperties\":{\"efgwbmqjc\":\"fnozoeoqbvjh\",\"pzealbmqkyojw\":\"ntasfaymxbu\",\"mbtsuahxsg\":\"vf\"},\"provisioningState\":\"cmmzrrs\",\"uniqueIdentifier\":\"biwsd\"},\"location\":\"npxqwodi\",\"tags\":{\"muabwibvjogjonmc\":\"xcjr\",\"oyzbamwineofvf\":\"e\",\"lz\":\"akpoldtvevbo\",\"ttxpnrupza\":\"zjknyuxg\"},\"id\":\"mrdixtreki\",\"name\":\"swyskbruffg\",\"type\":\"lukkutvlxhrpqhvm\"}]}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        DevTestLabsManager manager = DevTestLabsManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        PagedIterable<Lab> response = manager.labs()
            .listByResourceGroup("ewdogiyetesy", "vidbztjhqtfb", "vnynkb", 885021040, "tnjuhpsprkzyaupi",
                com.azure.core.util.Context.NONE);

        Assertions.assertEquals("npxqwodi", response.iterator().next().location());
        Assertions.assertEquals("xcjr", response.iterator().next().tags().get("muabwibvjogjonmc"));
        Assertions.assertEquals(StorageType.PREMIUM, response.iterator().next().labStorageType());
        Assertions.assertEquals("mgxuupbezqcc", response.iterator().next().mandatoryArtifactsResourceIdsLinux().get(0));
        Assertions.assertEquals("gwldo", response.iterator().next().mandatoryArtifactsResourceIdsWindows().get(0));
        Assertions.assertEquals(PremiumDataDisk.DISABLED, response.iterator().next().premiumDataDisks());
        Assertions.assertEquals(EnvironmentPermission.READER, response.iterator().next().environmentPermission());
        Assertions.assertEquals("eftkwqe", response.iterator().next().announcement().title());
        Assertions.assertEquals("mvss", response.iterator().next().announcement().markdown());
        Assertions.assertEquals(EnableStatus.DISABLED, response.iterator().next().announcement().enabled());
        Assertions.assertEquals(OffsetDateTime.parse("2021-01-17T18:10:52Z"),
            response.iterator().next().announcement().expirationDate());
        Assertions.assertEquals(false, response.iterator().next().announcement().expired());
        Assertions.assertEquals(EnableStatus.ENABLED, response.iterator().next().support().enabled());
        Assertions.assertEquals("pydjfboc", response.iterator().next().support().markdown());
        Assertions.assertEquals("fnozoeoqbvjh", response.iterator().next().extendedProperties().get("efgwbmqjc"));
    }
}
