// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.RemoveProtectionContainerMappingInput;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.RemoveProtectionContainerMappingInputProperties;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.ReplicationProviderContainerUnmappingInput;
import org.junit.jupiter.api.Assertions;

public final class RemoveProtectionContainerMappingInputTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        RemoveProtectionContainerMappingInput model = BinaryData
            .fromString("{\"properties\":{\"providerSpecificInput\":{\"instanceType\":\"hfbousnfepgfew\"}}}")
            .toObject(RemoveProtectionContainerMappingInput.class);
        Assertions.assertEquals("hfbousnfepgfew", model.properties().providerSpecificInput().instanceType());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        RemoveProtectionContainerMappingInput model = new RemoveProtectionContainerMappingInput()
            .withProperties(new RemoveProtectionContainerMappingInputProperties().withProviderSpecificInput(
                new ReplicationProviderContainerUnmappingInput().withInstanceType("hfbousnfepgfew")));
        model = BinaryData.fromObject(model).toObject(RemoveProtectionContainerMappingInput.class);
        Assertions.assertEquals("hfbousnfepgfew", model.properties().providerSpecificInput().instanceType());
    }
}
