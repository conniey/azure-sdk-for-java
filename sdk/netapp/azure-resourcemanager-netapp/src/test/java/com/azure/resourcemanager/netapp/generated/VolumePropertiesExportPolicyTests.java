// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.netapp.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.netapp.models.ChownMode;
import com.azure.resourcemanager.netapp.models.ExportPolicyRule;
import com.azure.resourcemanager.netapp.models.VolumePropertiesExportPolicy;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class VolumePropertiesExportPolicyTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        VolumePropertiesExportPolicy model = BinaryData.fromString(
            "{\"rules\":[{\"ruleIndex\":327718055,\"unixReadOnly\":true,\"unixReadWrite\":false,\"kerberos5ReadOnly\":false,\"kerberos5ReadWrite\":true,\"kerberos5iReadOnly\":false,\"kerberos5iReadWrite\":true,\"kerberos5pReadOnly\":false,\"kerberos5pReadWrite\":false,\"cifs\":true,\"nfsv3\":false,\"nfsv41\":true,\"allowedClients\":\"rmgucnap\",\"hasRootAccess\":true,\"chownMode\":\"Unrestricted\"},{\"ruleIndex\":1761160515,\"unixReadOnly\":false,\"unixReadWrite\":true,\"kerberos5ReadOnly\":false,\"kerberos5ReadWrite\":true,\"kerberos5iReadOnly\":true,\"kerberos5iReadWrite\":true,\"kerberos5pReadOnly\":true,\"kerberos5pReadWrite\":false,\"cifs\":false,\"nfsv3\":false,\"nfsv41\":false,\"allowedClients\":\"uaopppcqeq\",\"hasRootAccess\":true,\"chownMode\":\"Unrestricted\"},{\"ruleIndex\":1114534772,\"unixReadOnly\":false,\"unixReadWrite\":false,\"kerberos5ReadOnly\":true,\"kerberos5ReadWrite\":false,\"kerberos5iReadOnly\":true,\"kerberos5iReadWrite\":true,\"kerberos5pReadOnly\":true,\"kerberos5pReadWrite\":false,\"cifs\":true,\"nfsv3\":false,\"nfsv41\":false,\"allowedClients\":\"bunrmfqjhhk\",\"hasRootAccess\":true,\"chownMode\":\"Restricted\"},{\"ruleIndex\":685095993,\"unixReadOnly\":false,\"unixReadWrite\":true,\"kerberos5ReadOnly\":false,\"kerberos5ReadWrite\":true,\"kerberos5iReadOnly\":false,\"kerberos5iReadWrite\":false,\"kerberos5pReadOnly\":false,\"kerberos5pReadWrite\":false,\"cifs\":false,\"nfsv3\":false,\"nfsv41\":true,\"allowedClients\":\"zjf\",\"hasRootAccess\":false,\"chownMode\":\"Unrestricted\"}]}")
            .toObject(VolumePropertiesExportPolicy.class);
        Assertions.assertEquals(327718055, model.rules().get(0).ruleIndex());
        Assertions.assertTrue(model.rules().get(0).unixReadOnly());
        Assertions.assertFalse(model.rules().get(0).unixReadWrite());
        Assertions.assertFalse(model.rules().get(0).kerberos5ReadOnly());
        Assertions.assertTrue(model.rules().get(0).kerberos5ReadWrite());
        Assertions.assertFalse(model.rules().get(0).kerberos5IReadOnly());
        Assertions.assertTrue(model.rules().get(0).kerberos5IReadWrite());
        Assertions.assertFalse(model.rules().get(0).kerberos5PReadOnly());
        Assertions.assertFalse(model.rules().get(0).kerberos5PReadWrite());
        Assertions.assertTrue(model.rules().get(0).cifs());
        Assertions.assertFalse(model.rules().get(0).nfsv3());
        Assertions.assertTrue(model.rules().get(0).nfsv41());
        Assertions.assertEquals("rmgucnap", model.rules().get(0).allowedClients());
        Assertions.assertTrue(model.rules().get(0).hasRootAccess());
        Assertions.assertEquals(ChownMode.UNRESTRICTED, model.rules().get(0).chownMode());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        VolumePropertiesExportPolicy model = new VolumePropertiesExportPolicy().withRules(Arrays.asList(
            new ExportPolicyRule().withRuleIndex(327718055)
                .withUnixReadOnly(true)
                .withUnixReadWrite(false)
                .withKerberos5ReadOnly(false)
                .withKerberos5ReadWrite(true)
                .withKerberos5IReadOnly(false)
                .withKerberos5IReadWrite(true)
                .withKerberos5PReadOnly(false)
                .withKerberos5PReadWrite(false)
                .withCifs(true)
                .withNfsv3(false)
                .withNfsv41(true)
                .withAllowedClients("rmgucnap")
                .withHasRootAccess(true)
                .withChownMode(ChownMode.UNRESTRICTED),
            new ExportPolicyRule().withRuleIndex(1761160515)
                .withUnixReadOnly(false)
                .withUnixReadWrite(true)
                .withKerberos5ReadOnly(false)
                .withKerberos5ReadWrite(true)
                .withKerberos5IReadOnly(true)
                .withKerberos5IReadWrite(true)
                .withKerberos5PReadOnly(true)
                .withKerberos5PReadWrite(false)
                .withCifs(false)
                .withNfsv3(false)
                .withNfsv41(false)
                .withAllowedClients("uaopppcqeq")
                .withHasRootAccess(true)
                .withChownMode(ChownMode.UNRESTRICTED),
            new ExportPolicyRule().withRuleIndex(1114534772)
                .withUnixReadOnly(false)
                .withUnixReadWrite(false)
                .withKerberos5ReadOnly(true)
                .withKerberos5ReadWrite(false)
                .withKerberos5IReadOnly(true)
                .withKerberos5IReadWrite(true)
                .withKerberos5PReadOnly(true)
                .withKerberos5PReadWrite(false)
                .withCifs(true)
                .withNfsv3(false)
                .withNfsv41(false)
                .withAllowedClients("bunrmfqjhhk")
                .withHasRootAccess(true)
                .withChownMode(ChownMode.RESTRICTED),
            new ExportPolicyRule().withRuleIndex(685095993)
                .withUnixReadOnly(false)
                .withUnixReadWrite(true)
                .withKerberos5ReadOnly(false)
                .withKerberos5ReadWrite(true)
                .withKerberos5IReadOnly(false)
                .withKerberos5IReadWrite(false)
                .withKerberos5PReadOnly(false)
                .withKerberos5PReadWrite(false)
                .withCifs(false)
                .withNfsv3(false)
                .withNfsv41(true)
                .withAllowedClients("zjf")
                .withHasRootAccess(false)
                .withChownMode(ChownMode.UNRESTRICTED)));
        model = BinaryData.fromObject(model).toObject(VolumePropertiesExportPolicy.class);
        Assertions.assertEquals(327718055, model.rules().get(0).ruleIndex());
        Assertions.assertTrue(model.rules().get(0).unixReadOnly());
        Assertions.assertFalse(model.rules().get(0).unixReadWrite());
        Assertions.assertFalse(model.rules().get(0).kerberos5ReadOnly());
        Assertions.assertTrue(model.rules().get(0).kerberos5ReadWrite());
        Assertions.assertFalse(model.rules().get(0).kerberos5IReadOnly());
        Assertions.assertTrue(model.rules().get(0).kerberos5IReadWrite());
        Assertions.assertFalse(model.rules().get(0).kerberos5PReadOnly());
        Assertions.assertFalse(model.rules().get(0).kerberos5PReadWrite());
        Assertions.assertTrue(model.rules().get(0).cifs());
        Assertions.assertFalse(model.rules().get(0).nfsv3());
        Assertions.assertTrue(model.rules().get(0).nfsv41());
        Assertions.assertEquals("rmgucnap", model.rules().get(0).allowedClients());
        Assertions.assertTrue(model.rules().get(0).hasRootAccess());
        Assertions.assertEquals(ChownMode.UNRESTRICTED, model.rules().get(0).chownMode());
    }
}
