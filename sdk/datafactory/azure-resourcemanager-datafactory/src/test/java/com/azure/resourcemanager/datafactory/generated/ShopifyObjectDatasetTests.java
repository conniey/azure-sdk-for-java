// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.DatasetFolder;
import com.azure.resourcemanager.datafactory.models.LinkedServiceReference;
import com.azure.resourcemanager.datafactory.models.ParameterSpecification;
import com.azure.resourcemanager.datafactory.models.ParameterType;
import com.azure.resourcemanager.datafactory.models.ShopifyObjectDataset;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class ShopifyObjectDatasetTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ShopifyObjectDataset model = BinaryData.fromString(
            "{\"type\":\"ShopifyObject\",\"typeProperties\":{\"tableName\":\"dataj\"},\"description\":\"wrduxntpfxxgja\",\"structure\":\"dataxfwf\",\"schema\":\"dataqv\",\"linkedServiceName\":{\"referenceName\":\"yfbkqynlzx\",\"parameters\":{\"kiehdmv\":\"datalupj\",\"rx\":\"datao\",\"cuans\":\"dataxffg\"}},\"parameters\":{\"fusekijhminenkb\":{\"type\":\"Array\",\"defaultValue\":\"datagcgcsapvbcq\"},\"bfvvcwvu\":{\"type\":\"SecureString\",\"defaultValue\":\"datayrkvorlfqmljewy\"}},\"annotations\":[\"dataju\",\"dataavvlnpbsotm\",\"datanklnmrz\"],\"folder\":{\"name\":\"vrkkfcwxizkstxne\"},\"\":{\"tc\":\"dataipx\",\"yyaeiivj\":\"datavriuvnfazxtvs\",\"wojoqf\":\"datakqtjwrv\"}}")
            .toObject(ShopifyObjectDataset.class);
        Assertions.assertEquals("wrduxntpfxxgja", model.description());
        Assertions.assertEquals("yfbkqynlzx", model.linkedServiceName().referenceName());
        Assertions.assertEquals(ParameterType.ARRAY, model.parameters().get("fusekijhminenkb").type());
        Assertions.assertEquals("vrkkfcwxizkstxne", model.folder().name());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ShopifyObjectDataset model = new ShopifyObjectDataset().withDescription("wrduxntpfxxgja")
            .withStructure("dataxfwf")
            .withSchema("dataqv")
            .withLinkedServiceName(new LinkedServiceReference().withReferenceName("yfbkqynlzx")
                .withParameters(mapOf("kiehdmv", "datalupj", "rx", "datao", "cuans", "dataxffg")))
            .withParameters(mapOf("fusekijhminenkb",
                new ParameterSpecification().withType(ParameterType.ARRAY).withDefaultValue("datagcgcsapvbcq"),
                "bfvvcwvu",
                new ParameterSpecification().withType(ParameterType.SECURE_STRING)
                    .withDefaultValue("datayrkvorlfqmljewy")))
            .withAnnotations(Arrays.asList("dataju", "dataavvlnpbsotm", "datanklnmrz"))
            .withFolder(new DatasetFolder().withName("vrkkfcwxizkstxne"))
            .withTableName("dataj");
        model = BinaryData.fromObject(model).toObject(ShopifyObjectDataset.class);
        Assertions.assertEquals("wrduxntpfxxgja", model.description());
        Assertions.assertEquals("yfbkqynlzx", model.linkedServiceName().referenceName());
        Assertions.assertEquals(ParameterType.ARRAY, model.parameters().get("fusekijhminenkb").type());
        Assertions.assertEquals("vrkkfcwxizkstxne", model.folder().name());
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
