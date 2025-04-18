// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mysqlflexibleserver.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.mysqlflexibleserver.fluent.models.ServerBackupInner;
import com.azure.resourcemanager.mysqlflexibleserver.models.ServerBackupListResult;
import java.time.OffsetDateTime;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class ServerBackupListResultTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ServerBackupListResult model = BinaryData.fromString(
            "{\"value\":[{\"properties\":{\"backupType\":\"peqfpjkjl\",\"completedTime\":\"2021-11-24T18:52:18Z\",\"source\":\"dvhpfxxypininm\"},\"id\":\"huyb\",\"name\":\"kpode\",\"type\":\"ooginuvamih\"},{\"properties\":{\"backupType\":\"narxzxtheotus\",\"completedTime\":\"2021-05-22T18:50:21Z\",\"source\":\"v\"},\"id\":\"iqihn\",\"name\":\"un\",\"type\":\"bwjzr\"}],\"nextLink\":\"ygxgispemvtz\"}")
            .toObject(ServerBackupListResult.class);
        Assertions.assertEquals("peqfpjkjl", model.value().get(0).backupType());
        Assertions.assertEquals(OffsetDateTime.parse("2021-11-24T18:52:18Z"), model.value().get(0).completedTime());
        Assertions.assertEquals("dvhpfxxypininm", model.value().get(0).source());
        Assertions.assertEquals("ygxgispemvtz", model.nextLink());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ServerBackupListResult model = new ServerBackupListResult().withValue(Arrays.asList(
            new ServerBackupInner().withBackupType("peqfpjkjl")
                .withCompletedTime(OffsetDateTime.parse("2021-11-24T18:52:18Z"))
                .withSource("dvhpfxxypininm"),
            new ServerBackupInner().withBackupType("narxzxtheotus")
                .withCompletedTime(OffsetDateTime.parse("2021-05-22T18:50:21Z"))
                .withSource("v")))
            .withNextLink("ygxgispemvtz");
        model = BinaryData.fromObject(model).toObject(ServerBackupListResult.class);
        Assertions.assertEquals("peqfpjkjl", model.value().get(0).backupType());
        Assertions.assertEquals(OffsetDateTime.parse("2021-11-24T18:52:18Z"), model.value().get(0).completedTime());
        Assertions.assertEquals("dvhpfxxypininm", model.value().get(0).source());
        Assertions.assertEquals("ygxgispemvtz", model.nextLink());
    }
}
