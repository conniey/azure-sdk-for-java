// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.trustedsigning.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.models.AzureCloud;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.trustedsigning.TrustedSigningManager;
import com.azure.resourcemanager.trustedsigning.models.AccountSku;
import com.azure.resourcemanager.trustedsigning.models.CodeSigningAccount;
import com.azure.resourcemanager.trustedsigning.models.CodeSigningAccountProperties;
import com.azure.resourcemanager.trustedsigning.models.SkuName;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class CodeSigningAccountsCreateMockTests {
    @Test
    public void testCreate() throws Exception {
        String responseStr
            = "{\"properties\":{\"accountUri\":\"aodxo\",\"sku\":{\"name\":\"Premium\"},\"provisioningState\":\"Succeeded\"},\"location\":\"qp\",\"tags\":{\"po\":\"ajionpimexgstxg\",\"djwzrlov\":\"gmaajrm\",\"qsqsy\":\"clwhijcoejctbz\"},\"id\":\"bkbfkgukdkex\",\"name\":\"ppofmxaxcfjpgdd\",\"type\":\"ocjjxhvpmouexh\"}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        TrustedSigningManager manager = TrustedSigningManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureCloud.AZURE_PUBLIC_CLOUD));

        CodeSigningAccount response = manager.codeSigningAccounts()
            .define("qabnmoc")
            .withRegion("javbqidtqajz")
            .withExistingResourceGroup("bznorcjxvsnby")
            .withTags(mapOf("jkrlkhbzhfepg", "pku"))
            .withProperties(new CodeSigningAccountProperties().withSku(new AccountSku().withName(SkuName.PREMIUM)))
            .create();

        Assertions.assertEquals("qp", response.location());
        Assertions.assertEquals("ajionpimexgstxg", response.tags().get("po"));
        Assertions.assertEquals(SkuName.PREMIUM, response.properties().sku().name());
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
