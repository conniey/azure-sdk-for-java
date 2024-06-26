// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.DatasetCompression;
import com.azure.resourcemanager.datafactory.models.DatasetFolder;
import com.azure.resourcemanager.datafactory.models.DatasetStorageFormat;
import com.azure.resourcemanager.datafactory.models.FileShareDataset;
import com.azure.resourcemanager.datafactory.models.LinkedServiceReference;
import com.azure.resourcemanager.datafactory.models.ParameterSpecification;
import com.azure.resourcemanager.datafactory.models.ParameterType;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class FileShareDatasetTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        FileShareDataset model = BinaryData.fromString(
            "{\"type\":\"FileShare\",\"typeProperties\":{\"folderPath\":\"datahhlwtpk\",\"fileName\":\"datageattbzkg\",\"modifiedDatetimeStart\":\"dataqnwqstt\",\"modifiedDatetimeEnd\":\"datauvcysjeufjxf\",\"format\":{\"type\":\"DatasetStorageFormat\",\"serializer\":\"dataitfnonp\",\"deserializer\":\"datauxlvrhprrvbwonl\",\"\":{\"huy\":\"datalvtlrvbst\",\"u\":\"datauninttlnrjdszd\",\"vgp\":\"dataiciqppo\",\"uhwfwj\":\"datae\"}},\"fileFilter\":\"dataxuoxtfnres\",\"compression\":{\"type\":\"dataepgckn\",\"level\":\"datamgvsnvbtqdxfmj\",\"\":{\"jluqllbsupu\":\"datan\"}}},\"description\":\"x\",\"structure\":\"datadlhzwhcu\",\"schema\":\"databosjjfd\",\"linkedServiceName\":{\"referenceName\":\"zhrjqfyaytvsly\",\"parameters\":{\"cjiwgsxfaio\":\"datagniuar\",\"ujjgnfgrzxbarc\":\"datawd\",\"jwenjcytesmf\":\"datapaefzqsy\"}},\"parameters\":{\"fzhhezvhjudxdyyr\":{\"type\":\"Bool\",\"defaultValue\":\"dataodqhuauzmzivrt\"}},\"annotations\":[\"dataahswtvdkxb\",\"datassgfenffdxbvwfqj\",\"datahivdrija\",\"dataxndmuvar\"],\"folder\":{\"name\":\"zj\"},\"\":{\"muhcuhtuzl\":\"datar\"}}")
            .toObject(FileShareDataset.class);
        Assertions.assertEquals("x", model.description());
        Assertions.assertEquals("zhrjqfyaytvsly", model.linkedServiceName().referenceName());
        Assertions.assertEquals(ParameterType.BOOL, model.parameters().get("fzhhezvhjudxdyyr").type());
        Assertions.assertEquals("zj", model.folder().name());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        FileShareDataset model = new FileShareDataset().withDescription("x")
            .withStructure("datadlhzwhcu")
            .withSchema("databosjjfd")
            .withLinkedServiceName(new LinkedServiceReference().withReferenceName("zhrjqfyaytvsly")
                .withParameters(
                    mapOf("cjiwgsxfaio", "datagniuar", "ujjgnfgrzxbarc", "datawd", "jwenjcytesmf", "datapaefzqsy")))
            .withParameters(mapOf("fzhhezvhjudxdyyr",
                new ParameterSpecification().withType(ParameterType.BOOL).withDefaultValue("dataodqhuauzmzivrt")))
            .withAnnotations(Arrays.asList("dataahswtvdkxb", "datassgfenffdxbvwfqj", "datahivdrija", "dataxndmuvar"))
            .withFolder(new DatasetFolder().withName("zj"))
            .withFolderPath("datahhlwtpk")
            .withFileName("datageattbzkg")
            .withModifiedDatetimeStart("dataqnwqstt")
            .withModifiedDatetimeEnd("datauvcysjeufjxf")
            .withFormat(new DatasetStorageFormat().withSerializer("dataitfnonp")
                .withDeserializer("datauxlvrhprrvbwonl")
                .withAdditionalProperties(mapOf("type", "DatasetStorageFormat")))
            .withFileFilter("dataxuoxtfnres")
            .withCompression(new DatasetCompression().withType("dataepgckn")
                .withLevel("datamgvsnvbtqdxfmj")
                .withAdditionalProperties(mapOf()));
        model = BinaryData.fromObject(model).toObject(FileShareDataset.class);
        Assertions.assertEquals("x", model.description());
        Assertions.assertEquals("zhrjqfyaytvsly", model.linkedServiceName().referenceName());
        Assertions.assertEquals(ParameterType.BOOL, model.parameters().get("fzhhezvhjudxdyyr").type());
        Assertions.assertEquals("zj", model.folder().name());
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
