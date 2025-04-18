// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.SalesforceServiceCloudV2Source;

public final class SalesforceServiceCloudV2SourceTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        SalesforceServiceCloudV2Source model = BinaryData.fromString(
            "{\"type\":\"SalesforceServiceCloudV2Source\",\"SOQLQuery\":\"databsqpttulh\",\"query\":\"datajuipixpzt\",\"includeDeletedObjects\":\"dataujuoiienzskokaqb\",\"additionalColumns\":\"datacnbnlpp\",\"sourceRetryCount\":\"databipfazsayrk\",\"sourceRetryWait\":\"datapnobcqnym\",\"maxConcurrentConnections\":\"datawr\",\"disableMetricsCollection\":\"dataf\",\"\":{\"ov\":\"datauzvkxc\"}}")
            .toObject(SalesforceServiceCloudV2Source.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        SalesforceServiceCloudV2Source model
            = new SalesforceServiceCloudV2Source().withSourceRetryCount("databipfazsayrk")
                .withSourceRetryWait("datapnobcqnym")
                .withMaxConcurrentConnections("datawr")
                .withDisableMetricsCollection("dataf")
                .withSoqlQuery("databsqpttulh")
                .withQuery("datajuipixpzt")
                .withIncludeDeletedObjects("dataujuoiienzskokaqb")
                .withAdditionalColumns("datacnbnlpp");
        model = BinaryData.fromObject(model).toObject(SalesforceServiceCloudV2Source.class);
    }
}
