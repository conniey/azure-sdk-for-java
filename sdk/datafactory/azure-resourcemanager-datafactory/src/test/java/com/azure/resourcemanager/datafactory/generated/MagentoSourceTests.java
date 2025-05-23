// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.MagentoSource;

public final class MagentoSourceTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        MagentoSource model = BinaryData.fromString(
            "{\"type\":\"MagentoSource\",\"query\":\"datavheqzl\",\"queryTimeout\":\"datavaskrgoodfhpyue\",\"additionalColumns\":\"dataynyddpjlizl\",\"sourceRetryCount\":\"datahtcuglgmfz\",\"sourceRetryWait\":\"dataolaflsjwaw\",\"maxConcurrentConnections\":\"dataqmznkcwiok\",\"disableMetricsCollection\":\"datakrv\",\"\":{\"npxumgnjmskuv\":\"databnehbbchtcoelxr\",\"ow\":\"datauogj\",\"m\":\"datandefmebpalzpyptg\"}}")
            .toObject(MagentoSource.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        MagentoSource model = new MagentoSource().withSourceRetryCount("datahtcuglgmfz")
            .withSourceRetryWait("dataolaflsjwaw")
            .withMaxConcurrentConnections("dataqmznkcwiok")
            .withDisableMetricsCollection("datakrv")
            .withQueryTimeout("datavaskrgoodfhpyue")
            .withAdditionalColumns("dataynyddpjlizl")
            .withQuery("datavheqzl");
        model = BinaryData.fromObject(model).toObject(MagentoSource.class);
    }
}
