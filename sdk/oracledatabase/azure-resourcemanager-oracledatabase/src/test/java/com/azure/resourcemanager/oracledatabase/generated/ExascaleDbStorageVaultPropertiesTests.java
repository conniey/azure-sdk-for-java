// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.oracledatabase.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.oracledatabase.models.ExascaleDbStorageInputDetails;
import com.azure.resourcemanager.oracledatabase.models.ExascaleDbStorageVaultProperties;
import org.junit.jupiter.api.Assertions;

public final class ExascaleDbStorageVaultPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ExascaleDbStorageVaultProperties model = BinaryData.fromString(
            "{\"additionalFlashCacheInPercent\":1142386997,\"description\":\"zhhzjhfjmhvvmu\",\"displayName\":\"gpmuneqsxvmhfbuz\",\"highCapacityDatabaseStorageInput\":{\"totalSizeInGbs\":1911590455},\"highCapacityDatabaseStorage\":{\"availableSizeInGbs\":1432279174,\"totalSizeInGbs\":1240497337},\"timeZone\":\"hudypohyuemsl\",\"provisioningState\":\"Succeeded\",\"lifecycleState\":\"Updating\",\"lifecycleDetails\":\"pfoobr\",\"vmClusterCount\":1019229263,\"ocid\":\"msjnygqdnfw\",\"ociUrl\":\"dzgtil\"}")
            .toObject(ExascaleDbStorageVaultProperties.class);
        Assertions.assertEquals(1142386997, model.additionalFlashCacheInPercent());
        Assertions.assertEquals("zhhzjhfjmhvvmu", model.description());
        Assertions.assertEquals("gpmuneqsxvmhfbuz", model.displayName());
        Assertions.assertEquals(1911590455, model.highCapacityDatabaseStorageInput().totalSizeInGbs());
        Assertions.assertEquals("hudypohyuemsl", model.timeZone());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ExascaleDbStorageVaultProperties model
            = new ExascaleDbStorageVaultProperties().withAdditionalFlashCacheInPercent(1142386997)
                .withDescription("zhhzjhfjmhvvmu")
                .withDisplayName("gpmuneqsxvmhfbuz")
                .withHighCapacityDatabaseStorageInput(
                    new ExascaleDbStorageInputDetails().withTotalSizeInGbs(1911590455))
                .withTimeZone("hudypohyuemsl");
        model = BinaryData.fromObject(model).toObject(ExascaleDbStorageVaultProperties.class);
        Assertions.assertEquals(1142386997, model.additionalFlashCacheInPercent());
        Assertions.assertEquals("zhhzjhfjmhvvmu", model.description());
        Assertions.assertEquals("gpmuneqsxvmhfbuz", model.displayName());
        Assertions.assertEquals(1911590455, model.highCapacityDatabaseStorageInput().totalSizeInGbs());
        Assertions.assertEquals("hudypohyuemsl", model.timeZone());
    }
}
