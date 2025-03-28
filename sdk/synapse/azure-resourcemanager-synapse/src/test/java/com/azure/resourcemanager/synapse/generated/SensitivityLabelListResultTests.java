// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.synapse.models.SensitivityLabelListResult;

public final class SensitivityLabelListResultTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        SensitivityLabelListResult model = BinaryData.fromString(
            "{\"value\":[{\"properties\":{\"schemaName\":\"rgaehvvibrxjj\",\"tableName\":\"oqbeitpkxzt\",\"columnName\":\"ob\",\"labelName\":\"ft\",\"labelId\":\"gfcwqmpimaqxzhem\",\"informationType\":\"h\",\"informationTypeId\":\"uj\",\"isDisabled\":false,\"rank\":\"Low\"},\"managedBy\":\"zzwc\",\"id\":\"lkb\",\"name\":\"wpfaj\",\"type\":\"jwltlwtjjgu\"}],\"nextLink\":\"alhsnvkc\"}")
            .toObject(SensitivityLabelListResult.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        SensitivityLabelListResult model = new SensitivityLabelListResult();
        model = BinaryData.fromObject(model).toObject(SensitivityLabelListResult.class);
    }
}
