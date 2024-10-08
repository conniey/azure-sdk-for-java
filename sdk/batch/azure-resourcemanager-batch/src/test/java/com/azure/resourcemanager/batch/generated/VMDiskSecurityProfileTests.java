// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.batch.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.batch.models.SecurityEncryptionTypes;
import com.azure.resourcemanager.batch.models.VMDiskSecurityProfile;
import org.junit.jupiter.api.Assertions;

public final class VMDiskSecurityProfileTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        VMDiskSecurityProfile model = BinaryData.fromString("{\"securityEncryptionType\":\"NonPersistedTPM\"}")
            .toObject(VMDiskSecurityProfile.class);
        Assertions.assertEquals(SecurityEncryptionTypes.NON_PERSISTED_TPM, model.securityEncryptionType());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        VMDiskSecurityProfile model
            = new VMDiskSecurityProfile().withSecurityEncryptionType(SecurityEncryptionTypes.NON_PERSISTED_TPM);
        model = BinaryData.fromObject(model).toObject(VMDiskSecurityProfile.class);
        Assertions.assertEquals(SecurityEncryptionTypes.NON_PERSISTED_TPM, model.securityEncryptionType());
    }
}
