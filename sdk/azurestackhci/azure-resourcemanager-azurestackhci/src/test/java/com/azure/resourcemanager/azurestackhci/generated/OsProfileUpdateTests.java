// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurestackhci.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.azurestackhci.models.OsProfileUpdate;
import com.azure.resourcemanager.azurestackhci.models.OsProfileUpdateLinuxConfiguration;
import com.azure.resourcemanager.azurestackhci.models.OsProfileUpdateWindowsConfiguration;
import org.junit.jupiter.api.Assertions;

public final class OsProfileUpdateTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        OsProfileUpdate model =
            BinaryData
                .fromString(
                    "{\"computerName\":\"xyawj\",\"linuxConfiguration\":{\"provisionVMAgent\":true,\"provisionVMConfigAgent\":true},\"windowsConfiguration\":{\"provisionVMAgent\":true,\"provisionVMConfigAgent\":false}}")
                .toObject(OsProfileUpdate.class);
        Assertions.assertEquals("xyawj", model.computerName());
        Assertions.assertEquals(true, model.linuxConfiguration().provisionVMAgent());
        Assertions.assertEquals(true, model.linuxConfiguration().provisionVMConfigAgent());
        Assertions.assertEquals(true, model.windowsConfiguration().provisionVMAgent());
        Assertions.assertEquals(false, model.windowsConfiguration().provisionVMConfigAgent());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        OsProfileUpdate model =
            new OsProfileUpdate()
                .withComputerName("xyawj")
                .withLinuxConfiguration(
                    new OsProfileUpdateLinuxConfiguration().withProvisionVMAgent(true).withProvisionVMConfigAgent(true))
                .withWindowsConfiguration(
                    new OsProfileUpdateWindowsConfiguration()
                        .withProvisionVMAgent(true)
                        .withProvisionVMConfigAgent(false));
        model = BinaryData.fromObject(model).toObject(OsProfileUpdate.class);
        Assertions.assertEquals("xyawj", model.computerName());
        Assertions.assertEquals(true, model.linuxConfiguration().provisionVMAgent());
        Assertions.assertEquals(true, model.linuxConfiguration().provisionVMConfigAgent());
        Assertions.assertEquals(true, model.windowsConfiguration().provisionVMAgent());
        Assertions.assertEquals(false, model.windowsConfiguration().provisionVMConfigAgent());
    }
}
