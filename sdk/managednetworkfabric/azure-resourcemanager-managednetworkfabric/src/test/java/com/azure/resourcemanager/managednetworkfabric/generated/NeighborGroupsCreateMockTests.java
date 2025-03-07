// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managednetworkfabric.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.managednetworkfabric.ManagedNetworkFabricManager;
import com.azure.resourcemanager.managednetworkfabric.models.NeighborGroup;
import com.azure.resourcemanager.managednetworkfabric.models.NeighborGroupDestination;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class NeighborGroupsCreateMockTests {
    @Test
    public void testCreate() throws Exception {
        String responseStr
            = "{\"properties\":{\"networkTapIds\":[\"ygkxrlfojlclp\",\"mveybodhrv\"],\"networkTapRuleIds\":[\"u\",\"mwb\"],\"provisioningState\":\"Succeeded\",\"destination\":{\"ipv4Addresses\":[\"gpdxtsaujtco\"],\"ipv6Addresses\":[\"bolqoxuptsl\",\"ivmlkwkzli\",\"vamtyk\",\"szde\"]},\"annotation\":\"xcsq\"},\"location\":\"do\",\"tags\":{\"eohpl\":\"kdpc\",\"edaxkuyorfjidqo\":\"gcnbvmhvqp\",\"vfyihuzsbpwn\":\"aweog\",\"zgkooagrlwpame\":\"fjcypazwiimd\"},\"id\":\"itwqadewhu\",\"name\":\"xkyxiatfamrna\",\"type\":\"fllxc\"}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        ManagedNetworkFabricManager manager = ManagedNetworkFabricManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        NeighborGroup response = manager.neighborGroups()
            .define("qmbinpxmiwt")
            .withRegion("tohgpzwxyv")
            .withExistingResourceGroup("fz")
            .withTags(mapOf("xpu", "bhi", "wnfhmjusuqnku", "dd"))
            .withDestination(
                new NeighborGroupDestination().withIpv4Addresses(Arrays.asList("ipssv", "o", "ijcqcjozz", "kug"))
                    .withIpv6Addresses(Arrays.asList("qbtokvocuzxl")))
            .withAnnotation("pwarhw")
            .create();

        Assertions.assertEquals("do", response.location());
        Assertions.assertEquals("kdpc", response.tags().get("eohpl"));
        Assertions.assertEquals("gpdxtsaujtco", response.destination().ipv4Addresses().get(0));
        Assertions.assertEquals("bolqoxuptsl", response.destination().ipv6Addresses().get(0));
        Assertions.assertEquals("xcsq", response.annotation());
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
