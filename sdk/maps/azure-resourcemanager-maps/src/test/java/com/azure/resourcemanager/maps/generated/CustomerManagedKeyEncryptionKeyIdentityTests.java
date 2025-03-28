// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.maps.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.maps.models.CustomerManagedKeyEncryptionKeyIdentity;
import com.azure.resourcemanager.maps.models.IdentityType;
import java.util.UUID;
import org.junit.jupiter.api.Assertions;

public final class CustomerManagedKeyEncryptionKeyIdentityTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        CustomerManagedKeyEncryptionKeyIdentity model = BinaryData.fromString(
            "{\"identityType\":\"delegatedResourceIdentity\",\"userAssignedIdentityResourceId\":\"odmailzyd\",\"delegatedIdentityClientId\":\"a0e174af-345d-42e6-bacd-29ecdc7473cc\"}")
            .toObject(CustomerManagedKeyEncryptionKeyIdentity.class);
        Assertions.assertEquals(IdentityType.DELEGATED_RESOURCE_IDENTITY, model.identityType());
        Assertions.assertEquals("odmailzyd", model.userAssignedIdentityResourceId());
        Assertions.assertEquals(UUID.fromString("a0e174af-345d-42e6-bacd-29ecdc7473cc"),
            model.delegatedIdentityClientId());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        CustomerManagedKeyEncryptionKeyIdentity model
            = new CustomerManagedKeyEncryptionKeyIdentity().withIdentityType(IdentityType.DELEGATED_RESOURCE_IDENTITY)
                .withUserAssignedIdentityResourceId("odmailzyd")
                .withDelegatedIdentityClientId(UUID.fromString("a0e174af-345d-42e6-bacd-29ecdc7473cc"));
        model = BinaryData.fromObject(model).toObject(CustomerManagedKeyEncryptionKeyIdentity.class);
        Assertions.assertEquals(IdentityType.DELEGATED_RESOURCE_IDENTITY, model.identityType());
        Assertions.assertEquals("odmailzyd", model.userAssignedIdentityResourceId());
        Assertions.assertEquals(UUID.fromString("a0e174af-345d-42e6-bacd-29ecdc7473cc"),
            model.delegatedIdentityClientId());
    }
}
