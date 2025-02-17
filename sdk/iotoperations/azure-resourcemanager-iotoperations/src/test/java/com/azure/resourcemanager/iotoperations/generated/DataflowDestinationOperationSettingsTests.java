// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.iotoperations.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.iotoperations.models.DataflowDestinationOperationSettings;
import org.junit.jupiter.api.Assertions;

public final class DataflowDestinationOperationSettingsTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        DataflowDestinationOperationSettings model
            = BinaryData.fromString("{\"endpointRef\":\"ipqiiobyuqerpq\",\"dataDestination\":\"pqwcciuqgbdbutau\"}")
                .toObject(DataflowDestinationOperationSettings.class);
        Assertions.assertEquals("ipqiiobyuqerpq", model.endpointRef());
        Assertions.assertEquals("pqwcciuqgbdbutau", model.dataDestination());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        DataflowDestinationOperationSettings model
            = new DataflowDestinationOperationSettings().withEndpointRef("ipqiiobyuqerpq")
                .withDataDestination("pqwcciuqgbdbutau");
        model = BinaryData.fromObject(model).toObject(DataflowDestinationOperationSettings.class);
        Assertions.assertEquals("ipqiiobyuqerpq", model.endpointRef());
        Assertions.assertEquals("pqwcciuqgbdbutau", model.dataDestination());
    }
}
