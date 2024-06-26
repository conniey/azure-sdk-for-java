// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicesbackup.models.AzureWorkloadSapHanaRestoreRequest;
import com.azure.resourcemanager.recoveryservicesbackup.models.OverwriteOptions;
import com.azure.resourcemanager.recoveryservicesbackup.models.RecoveryMode;
import com.azure.resourcemanager.recoveryservicesbackup.models.RecoveryType;
import com.azure.resourcemanager.recoveryservicesbackup.models.SnapshotRestoreParameters;
import com.azure.resourcemanager.recoveryservicesbackup.models.TargetRestoreInfo;
import com.azure.resourcemanager.recoveryservicesbackup.models.UserAssignedIdentityProperties;
import com.azure.resourcemanager.recoveryservicesbackup.models.UserAssignedManagedIdentityDetails;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class AzureWorkloadSapHanaRestoreRequestTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AzureWorkloadSapHanaRestoreRequest model = BinaryData.fromString(
            "{\"objectType\":\"AzureWorkloadSAPHanaRestoreRequest\",\"recoveryType\":\"Offline\",\"sourceResourceId\":\"zaefedxihc\",\"propertyBag\":{\"crjdqnsdfzpbgtg\":\"hk\",\"utlwxezwzhok\":\"ylkdghrje\",\"ehgpp\":\"bwnhhtql\",\"csheafidltugsr\":\"pifhpfeoajvgcxtx\"},\"targetInfo\":{\"overwriteOption\":\"FailOnConflict\",\"containerId\":\"sjhoiftxfkfwegpr\",\"databaseName\":\"tillucbiqtg\",\"targetDirectoryForFileRestore\":\"ohmcwsld\"},\"recoveryMode\":\"WorkloadRecovery\",\"targetResourceGroupName\":\"tpwb\",\"userAssignedManagedIdentityDetails\":{\"identityArmId\":\"llibphbqzmizak\",\"identityName\":\"ankjpdnjzh\",\"userAssignedIdentityProperties\":{\"clientId\":\"ylhjlm\",\"principalId\":\"y\"}},\"snapshotRestoreParameters\":{\"skipAttachAndMount\":true,\"logPointInTimeForDBRecovery\":\"rsopteecjm\"},\"targetVirtualMachineId\":\"slstvasy\",\"resourceGuardOperationRequests\":[\"dzaumweooh\"]}")
            .toObject(AzureWorkloadSapHanaRestoreRequest.class);
        Assertions.assertEquals("dzaumweooh", model.resourceGuardOperationRequests().get(0));
        Assertions.assertEquals(RecoveryType.OFFLINE, model.recoveryType());
        Assertions.assertEquals("zaefedxihc", model.sourceResourceId());
        Assertions.assertEquals("hk", model.propertyBag().get("crjdqnsdfzpbgtg"));
        Assertions.assertEquals(OverwriteOptions.FAIL_ON_CONFLICT, model.targetInfo().overwriteOption());
        Assertions.assertEquals("sjhoiftxfkfwegpr", model.targetInfo().containerId());
        Assertions.assertEquals("tillucbiqtg", model.targetInfo().databaseName());
        Assertions.assertEquals("ohmcwsld", model.targetInfo().targetDirectoryForFileRestore());
        Assertions.assertEquals(RecoveryMode.WORKLOAD_RECOVERY, model.recoveryMode());
        Assertions.assertEquals("tpwb", model.targetResourceGroupName());
        Assertions.assertEquals("llibphbqzmizak", model.userAssignedManagedIdentityDetails().identityArmId());
        Assertions.assertEquals("ankjpdnjzh", model.userAssignedManagedIdentityDetails().identityName());
        Assertions.assertEquals("ylhjlm",
            model.userAssignedManagedIdentityDetails().userAssignedIdentityProperties().clientId());
        Assertions.assertEquals("y",
            model.userAssignedManagedIdentityDetails().userAssignedIdentityProperties().principalId());
        Assertions.assertEquals(true, model.snapshotRestoreParameters().skipAttachAndMount());
        Assertions.assertEquals("rsopteecjm", model.snapshotRestoreParameters().logPointInTimeForDBRecovery());
        Assertions.assertEquals("slstvasy", model.targetVirtualMachineId());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AzureWorkloadSapHanaRestoreRequest model
            = new AzureWorkloadSapHanaRestoreRequest().withResourceGuardOperationRequests(Arrays.asList("dzaumweooh"))
                .withRecoveryType(RecoveryType.OFFLINE)
                .withSourceResourceId("zaefedxihc")
                .withPropertyBag(mapOf("crjdqnsdfzpbgtg", "hk", "utlwxezwzhok", "ylkdghrje", "ehgpp", "bwnhhtql",
                    "csheafidltugsr", "pifhpfeoajvgcxtx"))
                .withTargetInfo(new TargetRestoreInfo().withOverwriteOption(OverwriteOptions.FAIL_ON_CONFLICT)
                    .withContainerId("sjhoiftxfkfwegpr")
                    .withDatabaseName("tillucbiqtg")
                    .withTargetDirectoryForFileRestore("ohmcwsld"))
                .withRecoveryMode(RecoveryMode.WORKLOAD_RECOVERY)
                .withTargetResourceGroupName("tpwb")
                .withUserAssignedManagedIdentityDetails(
                    new UserAssignedManagedIdentityDetails().withIdentityArmId("llibphbqzmizak")
                        .withIdentityName("ankjpdnjzh")
                        .withUserAssignedIdentityProperties(
                            new UserAssignedIdentityProperties().withClientId("ylhjlm").withPrincipalId("y")))
                .withSnapshotRestoreParameters(new SnapshotRestoreParameters().withSkipAttachAndMount(true)
                    .withLogPointInTimeForDBRecovery("rsopteecjm"))
                .withTargetVirtualMachineId("slstvasy");
        model = BinaryData.fromObject(model).toObject(AzureWorkloadSapHanaRestoreRequest.class);
        Assertions.assertEquals("dzaumweooh", model.resourceGuardOperationRequests().get(0));
        Assertions.assertEquals(RecoveryType.OFFLINE, model.recoveryType());
        Assertions.assertEquals("zaefedxihc", model.sourceResourceId());
        Assertions.assertEquals("hk", model.propertyBag().get("crjdqnsdfzpbgtg"));
        Assertions.assertEquals(OverwriteOptions.FAIL_ON_CONFLICT, model.targetInfo().overwriteOption());
        Assertions.assertEquals("sjhoiftxfkfwegpr", model.targetInfo().containerId());
        Assertions.assertEquals("tillucbiqtg", model.targetInfo().databaseName());
        Assertions.assertEquals("ohmcwsld", model.targetInfo().targetDirectoryForFileRestore());
        Assertions.assertEquals(RecoveryMode.WORKLOAD_RECOVERY, model.recoveryMode());
        Assertions.assertEquals("tpwb", model.targetResourceGroupName());
        Assertions.assertEquals("llibphbqzmizak", model.userAssignedManagedIdentityDetails().identityArmId());
        Assertions.assertEquals("ankjpdnjzh", model.userAssignedManagedIdentityDetails().identityName());
        Assertions.assertEquals("ylhjlm",
            model.userAssignedManagedIdentityDetails().userAssignedIdentityProperties().clientId());
        Assertions.assertEquals("y",
            model.userAssignedManagedIdentityDetails().userAssignedIdentityProperties().principalId());
        Assertions.assertEquals(true, model.snapshotRestoreParameters().skipAttachAndMount());
        Assertions.assertEquals("rsopteecjm", model.snapshotRestoreParameters().logPointInTimeForDBRecovery());
        Assertions.assertEquals("slstvasy", model.targetVirtualMachineId());
    }

    // Use "Map.of" if available
    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
