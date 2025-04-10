// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurearcdata.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.azurearcdata.models.SqlManagedInstanceSku;
import com.azure.resourcemanager.azurearcdata.models.SqlManagedInstanceSkuTier;
import org.junit.jupiter.api.Assertions;

public final class SqlManagedInstanceSkuTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        SqlManagedInstanceSku model = BinaryData.fromString(
            "{\"tier\":\"GeneralPurpose\",\"dev\":true,\"size\":\"cohoq\",\"family\":\"wvl\",\"capacity\":137418501}")
            .toObject(SqlManagedInstanceSku.class);
        Assertions.assertEquals(SqlManagedInstanceSkuTier.GENERAL_PURPOSE, model.tier());
        Assertions.assertEquals(true, model.dev());
        Assertions.assertEquals("cohoq", model.size());
        Assertions.assertEquals("wvl", model.family());
        Assertions.assertEquals(137418501, model.capacity());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        SqlManagedInstanceSku model = new SqlManagedInstanceSku().withTier(SqlManagedInstanceSkuTier.GENERAL_PURPOSE)
            .withDev(true)
            .withSize("cohoq")
            .withFamily("wvl")
            .withCapacity(137418501);
        model = BinaryData.fromObject(model).toObject(SqlManagedInstanceSku.class);
        Assertions.assertEquals(SqlManagedInstanceSkuTier.GENERAL_PURPOSE, model.tier());
        Assertions.assertEquals(true, model.dev());
        Assertions.assertEquals("cohoq", model.size());
        Assertions.assertEquals("wvl", model.family());
        Assertions.assertEquals(137418501, model.capacity());
    }
}
