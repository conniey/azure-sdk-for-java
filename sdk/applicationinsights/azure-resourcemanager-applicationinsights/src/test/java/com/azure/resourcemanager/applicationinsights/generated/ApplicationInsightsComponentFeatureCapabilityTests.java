// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.applicationinsights.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.applicationinsights.models.ApplicationInsightsComponentFeatureCapability;

public final class ApplicationInsightsComponentFeatureCapabilityTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ApplicationInsightsComponentFeatureCapability model = BinaryData.fromString(
            "{\"Name\":\"jionpimexgstxgc\",\"Description\":\"dg\",\"Value\":\"ajrmvdjwzrlovmc\",\"Unit\":\"hijco\",\"MeterId\":\"ctbzaq\",\"MeterRateFrequency\":\"sycbkbfk\"}")
            .toObject(ApplicationInsightsComponentFeatureCapability.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ApplicationInsightsComponentFeatureCapability model = new ApplicationInsightsComponentFeatureCapability();
        model = BinaryData.fromObject(model).toObject(ApplicationInsightsComponentFeatureCapability.class);
    }
}
