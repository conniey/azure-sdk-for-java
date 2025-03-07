// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datalakestore.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datalakestore.fluent.models.CapabilityInformationInner;

public final class CapabilityInformationInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        CapabilityInformationInner model = BinaryData.fromString(
            "{\"subscriptionId\":\"dea61583-af5d-4c20-b26d-62aab67b082d\",\"state\":\"Unregistered\",\"maxAccountCount\":425108971,\"accountCount\":614962425,\"migrationState\":false}")
            .toObject(CapabilityInformationInner.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        CapabilityInformationInner model = new CapabilityInformationInner();
        model = BinaryData.fromObject(model).toObject(CapabilityInformationInner.class);
    }
}
