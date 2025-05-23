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
import com.azure.resourcemanager.netapp.models.Backup;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class BackupsCreateMockTests {
    @Test
    public void testCreate() throws Exception {
        String responseStr
            = "{\"properties\":{\"backupId\":\"p\",\"creationDate\":\"2021-02-22T22:51:57Z\",\"snapshotCreationDate\":\"2021-08-25T08:12:27Z\",\"completionDate\":\"2020-12-20T09:21:57Z\",\"provisioningState\":\"Succeeded\",\"size\":6121654459267984810,\"label\":\"dmxzjijpv\",\"backupType\":\"Manual\",\"failureReason\":\"kihcirlde\",\"volumeResourceId\":\"xrdcoxnbkkja\",\"useExistingSnapshot\":false,\"snapshotName\":\"nqbnqb\",\"backupPolicyResourceId\":\"zxqltgrdogypx\",\"isLargeVolume\":true},\"id\":\"fihwu\",\"name\":\"vctafsrb\",\"type\":\"rblmli\"}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        NetAppFilesManager manager = NetAppFilesManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureCloud.AZURE_PUBLIC_CLOUD));

        Backup response = manager.backups()
            .define("lzgaufcshhvnew")
            .withExistingBackupVault("xeiqbpsmg", "mguaml", "dlrgms")
            .withVolumeResourceId("phdrw")
            .withLabel("ypnyghshxc")
            .withUseExistingSnapshot(false)
            .withSnapshotName("vyom")
            .create();

        Assertions.assertEquals("dmxzjijpv", response.label());
        Assertions.assertEquals("xrdcoxnbkkja", response.volumeResourceId());
        Assertions.assertFalse(response.useExistingSnapshot());
        Assertions.assertEquals("nqbnqb", response.snapshotName());
    }
}
