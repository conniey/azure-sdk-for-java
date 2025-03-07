// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datamigration.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datamigration.models.MigrateSqlServerSqlDbDatabaseInput;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class MigrateSqlServerSqlDbDatabaseInputTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        MigrateSqlServerSqlDbDatabaseInput model = BinaryData.fromString(
            "{\"name\":\"cv\",\"targetDatabaseName\":\"uwrbehwagoh\",\"makeSourceDbReadOnly\":false,\"tableMap\":{\"drjf\":\"mrqemvvhmx\"}}")
            .toObject(MigrateSqlServerSqlDbDatabaseInput.class);
        Assertions.assertEquals("cv", model.name());
        Assertions.assertEquals("uwrbehwagoh", model.targetDatabaseName());
        Assertions.assertEquals(false, model.makeSourceDbReadOnly());
        Assertions.assertEquals("mrqemvvhmx", model.tableMap().get("drjf"));
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        MigrateSqlServerSqlDbDatabaseInput model = new MigrateSqlServerSqlDbDatabaseInput().withName("cv")
            .withTargetDatabaseName("uwrbehwagoh")
            .withMakeSourceDbReadOnly(false)
            .withTableMap(mapOf("drjf", "mrqemvvhmx"));
        model = BinaryData.fromObject(model).toObject(MigrateSqlServerSqlDbDatabaseInput.class);
        Assertions.assertEquals("cv", model.name());
        Assertions.assertEquals("uwrbehwagoh", model.targetDatabaseName());
        Assertions.assertEquals(false, model.makeSourceDbReadOnly());
        Assertions.assertEquals("mrqemvvhmx", model.tableMap().get("drjf"));
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
