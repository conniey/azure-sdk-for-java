// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.fluent.models.GetMetadataActivityTypeProperties;
import com.azure.resourcemanager.datafactory.models.DatasetReference;
import com.azure.resourcemanager.datafactory.models.FormatReadSettings;
import com.azure.resourcemanager.datafactory.models.StoreReadSettings;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class GetMetadataActivityTypePropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        GetMetadataActivityTypeProperties model = BinaryData.fromString(
            "{\"dataset\":{\"referenceName\":\"hnfqnekpxddde\",\"parameters\":{\"lq\":\"datagdjahnsmktk\"}},\"fieldList\":[\"datadolobtzrgxnlaur\"],\"storeSettings\":{\"type\":\"StoreReadSettings\",\"maxConcurrentConnections\":\"datantcbl\",\"disableMetricsCollection\":\"datazoqtfbjk\",\"\":{\"axttoenfohipijfy\":\"datatelblbungrkjb\",\"ecktcwgnkxjd\":\"datammqzbznrjw\",\"ndz\":\"dataxdi\"}},\"formatSettings\":{\"type\":\"FormatReadSettings\",\"\":{\"mkeaw\":\"datapiaklefwaiabfnt\",\"ljbnfw\":\"datafeudcg\",\"bpgskgpwspxhhnv\":\"dataffnngiu\",\"fstizemakgzcmbg\":\"datapzjtiktgmdlw\"}}}")
            .toObject(GetMetadataActivityTypeProperties.class);
        Assertions.assertEquals("hnfqnekpxddde", model.dataset().referenceName());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        GetMetadataActivityTypeProperties model = new GetMetadataActivityTypeProperties()
            .withDataset(new DatasetReference().withReferenceName("hnfqnekpxddde")
                .withParameters(mapOf("lq", "datagdjahnsmktk")))
            .withFieldList(Arrays.asList("datadolobtzrgxnlaur"))
            .withStoreSettings(new StoreReadSettings().withMaxConcurrentConnections("datantcbl")
                .withDisableMetricsCollection("datazoqtfbjk")
                .withAdditionalProperties(mapOf("type", "StoreReadSettings")))
            .withFormatSettings(new FormatReadSettings().withAdditionalProperties(mapOf("type", "FormatReadSettings")));
        model = BinaryData.fromObject(model).toObject(GetMetadataActivityTypeProperties.class);
        Assertions.assertEquals("hnfqnekpxddde", model.dataset().referenceName());
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
