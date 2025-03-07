// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.agrifood.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.agrifood.fluent.models.ExtensionInner;
import com.azure.resourcemanager.agrifood.models.ExtensionListResponse;
import java.util.Arrays;

public final class ExtensionListResponseTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ExtensionListResponse model = BinaryData.fromString(
            "{\"value\":[{\"properties\":{\"extensionId\":\"deupewnwrei\",\"extensionCategory\":\"zyf\",\"installedExtensionVersion\":\"sarhmofc\",\"extensionAuthLink\":\"smy\",\"extensionApiDocsLink\":\"kdtmlxhekuk\",\"additionalApiProperties\":{\"kc\":{\"apiFreshnessTimeInMinutes\":1983903346},\"arcryuanzwuxzdxt\":{\"apiFreshnessTimeInMinutes\":1422058480}}},\"eTag\":\"rlhm\",\"id\":\"fp\",\"name\":\"rqobmtuk\",\"type\":\"nryrtihf\"}],\"nextLink\":\"ijbpzvgnwzsymgl\"}")
            .toObject(ExtensionListResponse.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ExtensionListResponse model = new ExtensionListResponse().withValue(Arrays.asList(new ExtensionInner()));
        model = BinaryData.fromObject(model).toObject(ExtensionListResponse.class);
    }
}
