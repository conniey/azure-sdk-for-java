// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.oracledatabase.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.oracledatabase.implementation.models.FlexComponentListResult;
import org.junit.jupiter.api.Assertions;

public final class FlexComponentListResultTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        FlexComponentListResult model = BinaryData.fromString(
            "{\"value\":[{\"properties\":{\"minimumCoreCount\":1784311457,\"availableCoreCount\":953269937,\"availableDbStorageInGbs\":1886433502,\"runtimeMinimumCoreCount\":1615411821,\"shape\":\"ou\",\"availableMemoryInGbs\":583930793,\"availableLocalStorageInGbs\":1629176755,\"computeModel\":\"qaaysjkixqt\",\"hardwareType\":\"COMPUTE\",\"descriptionSummary\":\"ezl\"},\"id\":\"ffiakp\",\"name\":\"pqqmted\",\"type\":\"tmmjihyeozph\"},{\"properties\":{\"minimumCoreCount\":1760801565,\"availableCoreCount\":404997188,\"availableDbStorageInGbs\":84771050,\"runtimeMinimumCoreCount\":1385853585,\"shape\":\"p\",\"availableMemoryInGbs\":2023825690,\"availableLocalStorageInGbs\":587818822,\"computeModel\":\"scw\",\"hardwareType\":\"COMPUTE\",\"descriptionSummary\":\"evzhfsto\"},\"id\":\"hojujbypelmcuv\",\"name\":\"ixbjx\",\"type\":\"fw\"},{\"properties\":{\"minimumCoreCount\":156258046,\"availableCoreCount\":729990408,\"availableDbStorageInGbs\":1448571025,\"runtimeMinimumCoreCount\":1926666832,\"shape\":\"p\",\"availableMemoryInGbs\":156092628,\"availableLocalStorageInGbs\":1511616464,\"computeModel\":\"nujrywvtyl\",\"hardwareType\":\"COMPUTE\",\"descriptionSummary\":\"curdoiwiitht\"},\"id\":\"ubxcbihw\",\"name\":\"knfd\",\"type\":\"twjchrdg\"}],\"nextLink\":\"hxumwctondzj\"}")
            .toObject(FlexComponentListResult.class);
        Assertions.assertEquals("hxumwctondzj", model.nextLink());
    }
}
