// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.CosmosDbMongoDbApiSink;

public final class CosmosDbMongoDbApiSinkTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        CosmosDbMongoDbApiSink model = BinaryData.fromString(
            "{\"type\":\"CosmosDbMongoDbApiSink\",\"writeBehavior\":\"dataeszx\",\"writeBatchSize\":\"datageuoihtik\",\"writeBatchTimeout\":\"datawp\",\"sinkRetryCount\":\"datayavcbdsuwctvbhc\",\"sinkRetryWait\":\"datagxtljyrey\",\"maxConcurrentConnections\":\"databtwzrzi\",\"disableMetricsCollection\":\"datak\",\"\":{\"buyuxg\":\"datajymdol\",\"sdoxhyi\":\"dataphviuexfb\",\"fkmti\":\"dataagaxru\"}}")
            .toObject(CosmosDbMongoDbApiSink.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        CosmosDbMongoDbApiSink model = new CosmosDbMongoDbApiSink().withWriteBatchSize("datageuoihtik")
            .withWriteBatchTimeout("datawp")
            .withSinkRetryCount("datayavcbdsuwctvbhc")
            .withSinkRetryWait("datagxtljyrey")
            .withMaxConcurrentConnections("databtwzrzi")
            .withDisableMetricsCollection("datak")
            .withWriteBehavior("dataeszx");
        model = BinaryData.fromObject(model).toObject(CosmosDbMongoDbApiSink.class);
    }
}
