// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.SalesforceServiceCloudSink;
import com.azure.resourcemanager.datafactory.models.SalesforceSinkWriteBehavior;
import org.junit.jupiter.api.Assertions;

public final class SalesforceServiceCloudSinkTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        SalesforceServiceCloudSink model = BinaryData.fromString(
            "{\"type\":\"SalesforceServiceCloudSink\",\"writeBehavior\":\"Insert\",\"externalIdFieldName\":\"dataljx\",\"ignoreNullValues\":\"dataaawnzzlfve\",\"writeBatchSize\":\"datakjbasmrdpbmo\",\"writeBatchTimeout\":\"datasvukgfzby\",\"sinkRetryCount\":\"datapmeomc\",\"sinkRetryWait\":\"datam\",\"maxConcurrentConnections\":\"datadtg\",\"disableMetricsCollection\":\"datayubnwymyewbfoxw\",\"\":{\"pbtksr\":\"datatjsnjbahxyfd\"}}")
            .toObject(SalesforceServiceCloudSink.class);
        Assertions.assertEquals(SalesforceSinkWriteBehavior.INSERT, model.writeBehavior());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        SalesforceServiceCloudSink model = new SalesforceServiceCloudSink().withWriteBatchSize("datakjbasmrdpbmo")
            .withWriteBatchTimeout("datasvukgfzby")
            .withSinkRetryCount("datapmeomc")
            .withSinkRetryWait("datam")
            .withMaxConcurrentConnections("datadtg")
            .withDisableMetricsCollection("datayubnwymyewbfoxw")
            .withWriteBehavior(SalesforceSinkWriteBehavior.INSERT)
            .withExternalIdFieldName("dataljx")
            .withIgnoreNullValues("dataaawnzzlfve");
        model = BinaryData.fromObject(model).toObject(SalesforceServiceCloudSink.class);
        Assertions.assertEquals(SalesforceSinkWriteBehavior.INSERT, model.writeBehavior());
    }
}
