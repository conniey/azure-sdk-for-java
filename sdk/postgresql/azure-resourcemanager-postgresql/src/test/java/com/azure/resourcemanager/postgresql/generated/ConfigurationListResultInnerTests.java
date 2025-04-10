// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.postgresql.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.postgresql.fluent.models.ConfigurationInner;
import com.azure.resourcemanager.postgresql.fluent.models.ConfigurationListResultInner;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class ConfigurationListResultInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ConfigurationListResultInner model = BinaryData.fromString(
            "{\"value\":[{\"properties\":{\"value\":\"ugw\",\"description\":\"cglhslazjdyggdt\",\"defaultValue\":\"xhbkuofq\",\"dataType\":\"yk\",\"allowedValues\":\"enevfyexfwhybci\",\"source\":\"yvdcsitynnaa\"},\"id\":\"dectehfiqsc\",\"name\":\"eypvhezrkg\",\"type\":\"hcjrefovgmk\"},{\"properties\":{\"value\":\"eyyvxyqjpkcat\",\"description\":\"ngj\",\"defaultValue\":\"cczsq\",\"dataType\":\"hvmdajvnysounq\",\"allowedValues\":\"a\",\"source\":\"ae\"},\"id\":\"pfhyhl\",\"name\":\"rpmopjmc\",\"type\":\"atuokthfuiu\"},{\"properties\":{\"value\":\"sfcpkvxodpuozm\",\"description\":\"ydagfuaxbe\",\"defaultValue\":\"iu\",\"dataType\":\"ktwh\",\"allowedValues\":\"xw\",\"source\":\"wqsmbsur\"},\"id\":\"xim\",\"name\":\"ryocfsfksymdd\",\"type\":\"stkiiuxhqyud\"}]}")
            .toObject(ConfigurationListResultInner.class);
        Assertions.assertEquals("ugw", model.value().get(0).value());
        Assertions.assertEquals("yvdcsitynnaa", model.value().get(0).source());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ConfigurationListResultInner model = new ConfigurationListResultInner()
            .withValue(Arrays.asList(new ConfigurationInner().withValue("ugw").withSource("yvdcsitynnaa"),
                new ConfigurationInner().withValue("eyyvxyqjpkcat").withSource("ae"),
                new ConfigurationInner().withValue("sfcpkvxodpuozm").withSource("wqsmbsur")));
        model = BinaryData.fromObject(model).toObject(ConfigurationListResultInner.class);
        Assertions.assertEquals("ugw", model.value().get(0).value());
        Assertions.assertEquals("yvdcsitynnaa", model.value().get(0).source());
    }
}
