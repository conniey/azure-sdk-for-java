// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.postgresqlflexibleserver.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.postgresqlflexibleserver.models.BackupSettings;
import org.junit.jupiter.api.Assertions;

public final class BackupSettingsTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        BackupSettings model = BinaryData.fromString("{\"backupName\":\"pkteo\"}").toObject(BackupSettings.class);
        Assertions.assertEquals("pkteo", model.backupName());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        BackupSettings model = new BackupSettings().withBackupName("pkteo");
        model = BinaryData.fromObject(model).toObject(BackupSettings.class);
        Assertions.assertEquals("pkteo", model.backupName());
    }
}
