// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.providerhub.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.models.AzureCloud;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.providerhub.ProviderHubManager;
import com.azure.resourcemanager.providerhub.models.SkuResource;
import com.azure.resourcemanager.providerhub.models.SkuScaleType;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class SkusListByResourceTypeRegistrationsNestedResourceTypeThirdMockTests {
    @Test
    public void testListByResourceTypeRegistrationsNestedResourceTypeThird() throws Exception {
        String responseStr
            = "{\"value\":[{\"properties\":{\"skuSettings\":[{\"name\":\"dwxmda\",\"tier\":\"iygmgs\",\"size\":\"mdmze\",\"family\":\"rstgfczljdnc\",\"kind\":\"tjva\",\"locations\":[\"znmrgcdogcvucg\"],\"locationInfo\":[{\"location\":\"xuwhttn\"},{\"location\":\"qsaqmebgszplu\"},{\"location\":\"dekpdzzmssg\"},{\"location\":\"gvo\"}],\"requiredQuotaIds\":[\"jidbdqzsqunycwzt\",\"vvw\",\"nmrkkyjtrepwpwf\"],\"requiredFeatures\":[\"uxuva\",\"cpfpdofuckcl\",\"txluevs\",\"lzwilfngojf\"],\"capacity\":{\"minimum\":1778622177,\"maximum\":2050602479,\"default\":2096415973,\"scaleType\":\"Manual\"},\"costs\":[{\"meterId\":\"xfjwp\"},{\"meterId\":\"kktpmbmxbmbr\"}],\"capabilities\":[{\"name\":\"zx\",\"value\":\"jb\"},{\"name\":\"hxsdplaumydmhwe\",\"value\":\"jf\"},{\"name\":\"xydgtokvqbvwg\",\"value\":\"gwzpvxak\"},{\"name\":\"lhpses\",\"value\":\"fga\"}]},{\"name\":\"qiy\",\"tier\":\"xcgdhyhgoqgso\",\"size\":\"yxyj\",\"family\":\"b\",\"kind\":\"bispglqjoxtdah\",\"locations\":[\"oovtyjztivfwjlo\",\"zekfsrmauklajv\",\"foc\"],\"locationInfo\":[{\"location\":\"pejovt\"},{\"location\":\"wxn\"},{\"location\":\"whhnoyrzaa\"}],\"requiredQuotaIds\":[\"hpm\"],\"requiredFeatures\":[\"vjeateax\",\"crxoxdj\",\"l\"],\"capacity\":{\"minimum\":176707467,\"maximum\":601409362,\"default\":902691476,\"scaleType\":\"Automatic\"},\"costs\":[{\"meterId\":\"olrndwdb\"},{\"meterId\":\"xvzaledoy\"}],\"capabilities\":[{\"name\":\"unkfthmcxqqx\",\"value\":\"yzkl\"},{\"name\":\"oanpohrvm\",\"value\":\"rqra\"}]},{\"name\":\"a\",\"tier\":\"vznllaslkskhjqj\",\"size\":\"baihxjtgzg\",\"family\":\"iywbqgro\",\"kind\":\"bsfsgsae\",\"locations\":[\"dfmhljqlxs\",\"mrjctryldsxeb\"],\"locationInfo\":[{\"location\":\"xrznmgsda\"},{\"location\":\"uyckhef\"}],\"requiredQuotaIds\":[\"s\"],\"requiredFeatures\":[\"rbgpxeb\",\"ludca\"],\"capacity\":{\"minimum\":240222931,\"maximum\":1181734234,\"default\":1358397196,\"scaleType\":\"None\"},\"costs\":[{\"meterId\":\"yjmgtnsewo\"},{\"meterId\":\"x\"},{\"meterId\":\"yms\"}],\"capabilities\":[{\"name\":\"ljurkeposehqqylm\",\"value\":\"ctwjwdsdlzm\"},{\"name\":\"xerxxxoteehk\",\"value\":\"owgomvvhxowp\"},{\"name\":\"bap\",\"value\":\"pxraqaw\"},{\"name\":\"mpspfeylq\",\"value\":\"ocvvujexayglxrk\"}]},{\"name\":\"jnmzp\",\"tier\":\"lavxjfiuofpiei\",\"size\":\"lvs\",\"family\":\"ywjopac\",\"kind\":\"hydv\",\"locations\":[\"fngp\",\"illxg\",\"scizwgsoriobijei\",\"dye\"],\"locationInfo\":[{\"location\":\"hbo\"},{\"location\":\"ayrgwy\"},{\"location\":\"ri\"},{\"location\":\"pdweoft\"}],\"requiredQuotaIds\":[\"w\",\"igsioctqkm\",\"ja\",\"xvzfffhtjnwos\"],\"requiredFeatures\":[\"jxtvlxxzqfcwrrio\",\"xeezwyhjmbjiqe\",\"mx\"],\"capacity\":{\"minimum\":1077048471,\"maximum\":507666617,\"default\":1779691372,\"scaleType\":\"None\"},\"costs\":[{\"meterId\":\"dkgd\"}],\"capabilities\":[{\"name\":\"z\",\"value\":\"canzb\"},{\"name\":\"ekwuyckyvn\",\"value\":\"nsm\"}]}],\"provisioningState\":\"Deleting\"},\"id\":\"wjbct\",\"name\":\"bpzujqjtotdxp\",\"type\":\"scsl\"}]}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        ProviderHubManager manager = ProviderHubManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureCloud.AZURE_PUBLIC_CLOUD));

        PagedIterable<SkuResource> response = manager.skus()
            .listByResourceTypeRegistrationsNestedResourceTypeThird("m", "zjgcfjfx", "bwjjirmuydgf", "tmdofgeoag",
                "uoft", com.azure.core.util.Context.NONE);

        Assertions.assertEquals("dwxmda", response.iterator().next().properties().skuSettings().get(0).name());
        Assertions.assertEquals("iygmgs", response.iterator().next().properties().skuSettings().get(0).tier());
        Assertions.assertEquals("mdmze", response.iterator().next().properties().skuSettings().get(0).size());
        Assertions.assertEquals("rstgfczljdnc", response.iterator().next().properties().skuSettings().get(0).family());
        Assertions.assertEquals("tjva", response.iterator().next().properties().skuSettings().get(0).kind());
        Assertions.assertEquals("znmrgcdogcvucg",
            response.iterator().next().properties().skuSettings().get(0).locations().get(0));
        Assertions.assertEquals("xuwhttn",
            response.iterator().next().properties().skuSettings().get(0).locationInfo().get(0).location());
        Assertions.assertEquals("jidbdqzsqunycwzt",
            response.iterator().next().properties().skuSettings().get(0).requiredQuotaIds().get(0));
        Assertions.assertEquals("uxuva",
            response.iterator().next().properties().skuSettings().get(0).requiredFeatures().get(0));
        Assertions.assertEquals(1778622177,
            response.iterator().next().properties().skuSettings().get(0).capacity().minimum());
        Assertions.assertEquals(2050602479,
            response.iterator().next().properties().skuSettings().get(0).capacity().maximum());
        Assertions.assertEquals(2096415973,
            response.iterator().next().properties().skuSettings().get(0).capacity().defaultProperty());
        Assertions.assertEquals(SkuScaleType.MANUAL,
            response.iterator().next().properties().skuSettings().get(0).capacity().scaleType());
        Assertions.assertEquals("xfjwp",
            response.iterator().next().properties().skuSettings().get(0).costs().get(0).meterId());
        Assertions.assertEquals("zx",
            response.iterator().next().properties().skuSettings().get(0).capabilities().get(0).name());
        Assertions.assertEquals("jb",
            response.iterator().next().properties().skuSettings().get(0).capabilities().get(0).value());
    }
}
