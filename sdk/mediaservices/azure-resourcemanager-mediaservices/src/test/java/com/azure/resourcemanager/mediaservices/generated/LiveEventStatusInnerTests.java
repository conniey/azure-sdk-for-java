// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.mediaservices.fluent.models.LiveEventStatusInner;
import com.azure.resourcemanager.mediaservices.models.LiveEventHealthStatus;
import com.azure.resourcemanager.mediaservices.models.LiveEventIngestInterruption;
import com.azure.resourcemanager.mediaservices.models.LiveEventIngestion;
import com.azure.resourcemanager.mediaservices.models.LiveEventState;
import com.azure.resourcemanager.mediaservices.models.LiveEventTrackStatus;
import java.time.Duration;
import java.time.OffsetDateTime;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class LiveEventStatusInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        LiveEventStatusInner model = BinaryData.fromString(
            "{\"state\":\"Running\",\"healthStatus\":\"Excellent\",\"healthDescriptions\":[\"hmossxkkgth\",\"rghxjb\",\"hqxvcxgfrpdsofbs\"],\"lastUpdatedTime\":\"2021-06-21T04:24:29Z\",\"ingestion\":{\"streamName\":\"buswdvzyy\",\"begin\":\"2021-03-19T01:34:54Z\",\"end\":\"2021-06-30T04:34:05Z\",\"endReason\":\"vj\",\"ingestInterruptions\":[{\"begin\":\"2021-03-18T10:17:36Z\",\"end\":\"2021-11-28T07:38:04Z\",\"duration\":\"PT142H16M49S\",\"reason\":\"qg\"}]},\"trackStatus\":[{\"trackId\":\"irtx\",\"expectedBitrate\":2334635529382930428,\"incomingBitrate\":3697094408740805453,\"ingestDrift\":\"tpsew\",\"requestReceived\":1522642877560405861,\"requestSucceeded\":8904068616929586404},{\"trackId\":\"rydxtqm\",\"expectedBitrate\":1390056940934680717,\"incomingBitrate\":5252415972799158831,\"ingestDrift\":\"ufhyaomtbgh\",\"requestReceived\":9155995236468632439,\"requestSucceeded\":4218041317831921375},{\"trackId\":\"fo\",\"expectedBitrate\":1220387324863982995,\"incomingBitrate\":5645922877678061686,\"ingestDrift\":\"bgj\",\"requestReceived\":4030114991239446975,\"requestSucceeded\":7872237535456237102},{\"trackId\":\"luyovwxnbkfezzx\",\"expectedBitrate\":1741934125627183360,\"incomingBitrate\":7185553969157552022,\"ingestDrift\":\"irujbz\",\"requestReceived\":3085317229609250436,\"requestSucceeded\":3956429030856922319}]}")
            .toObject(LiveEventStatusInner.class);
        Assertions.assertEquals(LiveEventState.RUNNING, model.state());
        Assertions.assertEquals(LiveEventHealthStatus.EXCELLENT, model.healthStatus());
        Assertions.assertEquals("hmossxkkgth", model.healthDescriptions().get(0));
        Assertions.assertEquals(OffsetDateTime.parse("2021-06-21T04:24:29Z"), model.lastUpdatedTime());
        Assertions.assertEquals("buswdvzyy", model.ingestion().streamName());
        Assertions.assertEquals(OffsetDateTime.parse("2021-03-19T01:34:54Z"), model.ingestion().begin());
        Assertions.assertEquals(OffsetDateTime.parse("2021-06-30T04:34:05Z"), model.ingestion().end());
        Assertions.assertEquals("vj", model.ingestion().endReason());
        Assertions.assertEquals(OffsetDateTime.parse("2021-03-18T10:17:36Z"),
            model.ingestion().ingestInterruptions().get(0).begin());
        Assertions.assertEquals(OffsetDateTime.parse("2021-11-28T07:38:04Z"),
            model.ingestion().ingestInterruptions().get(0).end());
        Assertions.assertEquals(Duration.parse("PT142H16M49S"),
            model.ingestion().ingestInterruptions().get(0).duration());
        Assertions.assertEquals("qg", model.ingestion().ingestInterruptions().get(0).reason());
        Assertions.assertEquals("irtx", model.trackStatus().get(0).trackId());
        Assertions.assertEquals(2334635529382930428L, model.trackStatus().get(0).expectedBitrate());
        Assertions.assertEquals(3697094408740805453L, model.trackStatus().get(0).incomingBitrate());
        Assertions.assertEquals("tpsew", model.trackStatus().get(0).ingestDrift());
        Assertions.assertEquals(1522642877560405861L, model.trackStatus().get(0).requestReceived());
        Assertions.assertEquals(8904068616929586404L, model.trackStatus().get(0).requestSucceeded());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        LiveEventStatusInner model = new LiveEventStatusInner().withState(LiveEventState.RUNNING)
            .withHealthStatus(LiveEventHealthStatus.EXCELLENT)
            .withHealthDescriptions(Arrays.asList("hmossxkkgth", "rghxjb", "hqxvcxgfrpdsofbs"))
            .withLastUpdatedTime(OffsetDateTime.parse("2021-06-21T04:24:29Z"))
            .withIngestion(new LiveEventIngestion().withStreamName("buswdvzyy")
                .withBegin(OffsetDateTime.parse("2021-03-19T01:34:54Z"))
                .withEnd(OffsetDateTime.parse("2021-06-30T04:34:05Z"))
                .withEndReason("vj")
                .withIngestInterruptions(Arrays
                    .asList(new LiveEventIngestInterruption().withBegin(OffsetDateTime.parse("2021-03-18T10:17:36Z"))
                        .withEnd(OffsetDateTime.parse("2021-11-28T07:38:04Z"))
                        .withDuration(Duration.parse("PT142H16M49S"))
                        .withReason("qg"))))
            .withTrackStatus(Arrays.asList(
                new LiveEventTrackStatus().withTrackId("irtx")
                    .withExpectedBitrate(2334635529382930428L)
                    .withIncomingBitrate(3697094408740805453L)
                    .withIngestDrift("tpsew")
                    .withRequestReceived(1522642877560405861L)
                    .withRequestSucceeded(8904068616929586404L),
                new LiveEventTrackStatus().withTrackId("rydxtqm")
                    .withExpectedBitrate(1390056940934680717L)
                    .withIncomingBitrate(5252415972799158831L)
                    .withIngestDrift("ufhyaomtbgh")
                    .withRequestReceived(9155995236468632439L)
                    .withRequestSucceeded(4218041317831921375L),
                new LiveEventTrackStatus().withTrackId("fo")
                    .withExpectedBitrate(1220387324863982995L)
                    .withIncomingBitrate(5645922877678061686L)
                    .withIngestDrift("bgj")
                    .withRequestReceived(4030114991239446975L)
                    .withRequestSucceeded(7872237535456237102L),
                new LiveEventTrackStatus().withTrackId("luyovwxnbkfezzx")
                    .withExpectedBitrate(1741934125627183360L)
                    .withIncomingBitrate(7185553969157552022L)
                    .withIngestDrift("irujbz")
                    .withRequestReceived(3085317229609250436L)
                    .withRequestSucceeded(3956429030856922319L)));
        model = BinaryData.fromObject(model).toObject(LiveEventStatusInner.class);
        Assertions.assertEquals(LiveEventState.RUNNING, model.state());
        Assertions.assertEquals(LiveEventHealthStatus.EXCELLENT, model.healthStatus());
        Assertions.assertEquals("hmossxkkgth", model.healthDescriptions().get(0));
        Assertions.assertEquals(OffsetDateTime.parse("2021-06-21T04:24:29Z"), model.lastUpdatedTime());
        Assertions.assertEquals("buswdvzyy", model.ingestion().streamName());
        Assertions.assertEquals(OffsetDateTime.parse("2021-03-19T01:34:54Z"), model.ingestion().begin());
        Assertions.assertEquals(OffsetDateTime.parse("2021-06-30T04:34:05Z"), model.ingestion().end());
        Assertions.assertEquals("vj", model.ingestion().endReason());
        Assertions.assertEquals(OffsetDateTime.parse("2021-03-18T10:17:36Z"),
            model.ingestion().ingestInterruptions().get(0).begin());
        Assertions.assertEquals(OffsetDateTime.parse("2021-11-28T07:38:04Z"),
            model.ingestion().ingestInterruptions().get(0).end());
        Assertions.assertEquals(Duration.parse("PT142H16M49S"),
            model.ingestion().ingestInterruptions().get(0).duration());
        Assertions.assertEquals("qg", model.ingestion().ingestInterruptions().get(0).reason());
        Assertions.assertEquals("irtx", model.trackStatus().get(0).trackId());
        Assertions.assertEquals(2334635529382930428L, model.trackStatus().get(0).expectedBitrate());
        Assertions.assertEquals(3697094408740805453L, model.trackStatus().get(0).incomingBitrate());
        Assertions.assertEquals("tpsew", model.trackStatus().get(0).ingestDrift());
        Assertions.assertEquals(1522642877560405861L, model.trackStatus().get(0).requestReceived());
        Assertions.assertEquals(8904068616929586404L, model.trackStatus().get(0).requestSucceeded());
    }
}
