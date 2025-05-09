// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.HyperVReplicaPolicyInput;
import org.junit.jupiter.api.Assertions;

public final class HyperVReplicaPolicyInputTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        HyperVReplicaPolicyInput model = BinaryData.fromString(
            "{\"instanceType\":\"HyperVReplica2012\",\"recoveryPoints\":1889022680,\"applicationConsistentSnapshotFrequencyInHours\":897768578,\"compression\":\"tnkqbala\",\"initialReplicationMethod\":\"vuuwxhmeh\",\"onlineReplicationStartTime\":\"hjiotiffbbcngkeg\",\"offlineReplicationImportPath\":\"y\",\"offlineReplicationExportPath\":\"bb\",\"replicationPort\":400268893,\"allowedAuthenticationType\":1918454816,\"replicaDeletion\":\"y\"}")
            .toObject(HyperVReplicaPolicyInput.class);
        Assertions.assertEquals(1889022680, model.recoveryPoints());
        Assertions.assertEquals(897768578, model.applicationConsistentSnapshotFrequencyInHours());
        Assertions.assertEquals("tnkqbala", model.compression());
        Assertions.assertEquals("vuuwxhmeh", model.initialReplicationMethod());
        Assertions.assertEquals("hjiotiffbbcngkeg", model.onlineReplicationStartTime());
        Assertions.assertEquals("y", model.offlineReplicationImportPath());
        Assertions.assertEquals("bb", model.offlineReplicationExportPath());
        Assertions.assertEquals(400268893, model.replicationPort());
        Assertions.assertEquals(1918454816, model.allowedAuthenticationType());
        Assertions.assertEquals("y", model.replicaDeletion());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        HyperVReplicaPolicyInput model = new HyperVReplicaPolicyInput().withRecoveryPoints(1889022680)
            .withApplicationConsistentSnapshotFrequencyInHours(897768578)
            .withCompression("tnkqbala")
            .withInitialReplicationMethod("vuuwxhmeh")
            .withOnlineReplicationStartTime("hjiotiffbbcngkeg")
            .withOfflineReplicationImportPath("y")
            .withOfflineReplicationExportPath("bb")
            .withReplicationPort(400268893)
            .withAllowedAuthenticationType(1918454816)
            .withReplicaDeletion("y");
        model = BinaryData.fromObject(model).toObject(HyperVReplicaPolicyInput.class);
        Assertions.assertEquals(1889022680, model.recoveryPoints());
        Assertions.assertEquals(897768578, model.applicationConsistentSnapshotFrequencyInHours());
        Assertions.assertEquals("tnkqbala", model.compression());
        Assertions.assertEquals("vuuwxhmeh", model.initialReplicationMethod());
        Assertions.assertEquals("hjiotiffbbcngkeg", model.onlineReplicationStartTime());
        Assertions.assertEquals("y", model.offlineReplicationImportPath());
        Assertions.assertEquals("bb", model.offlineReplicationExportPath());
        Assertions.assertEquals(400268893, model.replicationPort());
        Assertions.assertEquals(1918454816, model.allowedAuthenticationType());
        Assertions.assertEquals("y", model.replicaDeletion());
    }
}
