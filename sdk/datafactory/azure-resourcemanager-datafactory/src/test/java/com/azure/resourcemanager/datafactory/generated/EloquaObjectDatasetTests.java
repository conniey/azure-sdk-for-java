// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.DatasetFolder;
import com.azure.resourcemanager.datafactory.models.EloquaObjectDataset;
import com.azure.resourcemanager.datafactory.models.LinkedServiceReference;
import com.azure.resourcemanager.datafactory.models.ParameterSpecification;
import com.azure.resourcemanager.datafactory.models.ParameterType;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class EloquaObjectDatasetTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        EloquaObjectDataset model = BinaryData.fromString(
            "{\"type\":\"EloquaObject\",\"typeProperties\":{\"tableName\":\"dataqejex\"},\"description\":\"lhuhdkubgyw\",\"structure\":\"datarklpdyehjrwcflv\",\"schema\":\"dataocaywmfvuhz\",\"linkedServiceName\":{\"referenceName\":\"olhve\",\"parameters\":{\"ymlhklmnjqzm\":\"datagsfmhwdxqu\",\"bthb\":\"dataynhitrnwqgq\"}},\"parameters\":{\"ywzrqeiadd\":{\"type\":\"Bool\",\"defaultValue\":\"datarjocogwfv\"},\"z\":{\"type\":\"Int\",\"defaultValue\":\"datauvnlmdcnutiexm\"},\"tfqhhvvwzprjaaai\":{\"type\":\"String\",\"defaultValue\":\"databqvioyn\"},\"cn\":{\"type\":\"String\",\"defaultValue\":\"datatvavlyaqtl\"}},\"annotations\":[\"datafzvz\",\"datazqcrlkorvbzg\",\"datahenfsfyq\"],\"folder\":{\"name\":\"wmh\"},\"\":{\"agwaakktbjort\":\"datafbywjiaaosla\",\"lislxyljzbkd\":\"datatkajqhsnsej\"}}")
            .toObject(EloquaObjectDataset.class);
        Assertions.assertEquals("lhuhdkubgyw", model.description());
        Assertions.assertEquals("olhve", model.linkedServiceName().referenceName());
        Assertions.assertEquals(ParameterType.BOOL, model.parameters().get("ywzrqeiadd").type());
        Assertions.assertEquals("wmh", model.folder().name());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        EloquaObjectDataset model = new EloquaObjectDataset().withDescription("lhuhdkubgyw")
            .withStructure("datarklpdyehjrwcflv")
            .withSchema("dataocaywmfvuhz")
            .withLinkedServiceName(new LinkedServiceReference().withReferenceName("olhve")
                .withParameters(mapOf("ymlhklmnjqzm", "datagsfmhwdxqu", "bthb", "dataynhitrnwqgq")))
            .withParameters(mapOf("ywzrqeiadd",
                new ParameterSpecification().withType(ParameterType.BOOL).withDefaultValue("datarjocogwfv"), "z",
                new ParameterSpecification().withType(ParameterType.INT).withDefaultValue("datauvnlmdcnutiexm"),
                "tfqhhvvwzprjaaai",
                new ParameterSpecification().withType(ParameterType.STRING).withDefaultValue("databqvioyn"), "cn",
                new ParameterSpecification().withType(ParameterType.STRING).withDefaultValue("datatvavlyaqtl")))
            .withAnnotations(Arrays.asList("datafzvz", "datazqcrlkorvbzg", "datahenfsfyq"))
            .withFolder(new DatasetFolder().withName("wmh"))
            .withTableName("dataqejex");
        model = BinaryData.fromObject(model).toObject(EloquaObjectDataset.class);
        Assertions.assertEquals("lhuhdkubgyw", model.description());
        Assertions.assertEquals("olhve", model.linkedServiceName().referenceName());
        Assertions.assertEquals(ParameterType.BOOL, model.parameters().get("ywzrqeiadd").type());
        Assertions.assertEquals("wmh", model.folder().name());
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
