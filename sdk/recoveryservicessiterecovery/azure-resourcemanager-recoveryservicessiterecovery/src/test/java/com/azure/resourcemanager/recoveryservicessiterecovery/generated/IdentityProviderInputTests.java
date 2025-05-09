// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.IdentityProviderInput;
import org.junit.jupiter.api.Assertions;

public final class IdentityProviderInputTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        IdentityProviderInput model = BinaryData.fromString(
            "{\"tenantId\":\"csheafidltugsr\",\"applicationId\":\"smkss\",\"objectId\":\"h\",\"audience\":\"iftxfkf\",\"aadAuthority\":\"egprhptil\"}")
            .toObject(IdentityProviderInput.class);
        Assertions.assertEquals("csheafidltugsr", model.tenantId());
        Assertions.assertEquals("smkss", model.applicationId());
        Assertions.assertEquals("h", model.objectId());
        Assertions.assertEquals("iftxfkf", model.audience());
        Assertions.assertEquals("egprhptil", model.aadAuthority());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        IdentityProviderInput model = new IdentityProviderInput().withTenantId("csheafidltugsr")
            .withApplicationId("smkss")
            .withObjectId("h")
            .withAudience("iftxfkf")
            .withAadAuthority("egprhptil");
        model = BinaryData.fromObject(model).toObject(IdentityProviderInput.class);
        Assertions.assertEquals("csheafidltugsr", model.tenantId());
        Assertions.assertEquals("smkss", model.applicationId());
        Assertions.assertEquals("h", model.objectId());
        Assertions.assertEquals("iftxfkf", model.audience());
        Assertions.assertEquals("egprhptil", model.aadAuthority());
    }
}
