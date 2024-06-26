// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.ShopifySource;

public final class ShopifySourceTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ShopifySource model = BinaryData.fromString(
            "{\"type\":\"ShopifySource\",\"query\":\"datajckgwtbfxxsfjnba\",\"queryTimeout\":\"datajighmkds\",\"additionalColumns\":\"datayyhtiyxehmn\",\"sourceRetryCount\":\"dataoy\",\"sourceRetryWait\":\"dataehkytl\",\"maxConcurrentConnections\":\"datamyznwrcfqwkqul\",\"disableMetricsCollection\":\"dataovqohwiw\",\"\":{\"sjjjcd\":\"dataxjxlssosndnypx\",\"xb\":\"datasvgdbfni\",\"jgczpdio\":\"datasjhpm\",\"cwmabehr\":\"datadtjylimzvjwjhmtc\"}}")
            .toObject(ShopifySource.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ShopifySource model = new ShopifySource().withSourceRetryCount("dataoy")
            .withSourceRetryWait("dataehkytl")
            .withMaxConcurrentConnections("datamyznwrcfqwkqul")
            .withDisableMetricsCollection("dataovqohwiw")
            .withQueryTimeout("datajighmkds")
            .withAdditionalColumns("datayyhtiyxehmn")
            .withQuery("datajckgwtbfxxsfjnba");
        model = BinaryData.fromObject(model).toObject(ShopifySource.class);
    }
}
