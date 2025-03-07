// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.security.models.AzureResourceLink;

public final class AzureResourceLinkTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AzureResourceLink model
            = BinaryData.fromString("{\"id\":\"btgkbugrjqctoj\"}").toObject(AzureResourceLink.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AzureResourceLink model = new AzureResourceLink();
        model = BinaryData.fromObject(model).toObject(AzureResourceLink.class);
    }
}
