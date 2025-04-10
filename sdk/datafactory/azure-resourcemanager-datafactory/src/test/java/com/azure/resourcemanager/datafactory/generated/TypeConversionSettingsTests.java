// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.TypeConversionSettings;

public final class TypeConversionSettingsTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        TypeConversionSettings model = BinaryData.fromString(
            "{\"allowDataTruncation\":\"datacdugnzymljgayka\",\"treatBooleanAsNumber\":\"datankxoqecjznuqg\",\"dateTimeFormat\":\"datavmuewshhq\",\"dateTimeOffsetFormat\":\"datavchliezfbtczzjf\",\"timeSpanFormat\":\"dataovwizjraks\",\"timeFormat\":\"datawqpukltfk\",\"dateFormat\":\"dataoxmisnbzczpfvqt\",\"culture\":\"datakcfe\"}")
            .toObject(TypeConversionSettings.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        TypeConversionSettings model = new TypeConversionSettings().withAllowDataTruncation("datacdugnzymljgayka")
            .withTreatBooleanAsNumber("datankxoqecjznuqg")
            .withDateTimeFormat("datavmuewshhq")
            .withDateTimeOffsetFormat("datavchliezfbtczzjf")
            .withTimeSpanFormat("dataovwizjraks")
            .withTimeFormat("datawqpukltfk")
            .withDateFormat("dataoxmisnbzczpfvqt")
            .withCulture("datakcfe");
        model = BinaryData.fromObject(model).toObject(TypeConversionSettings.class);
    }
}
