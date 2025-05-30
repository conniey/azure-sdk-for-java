// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.generated;

/**
 * Samples for ReplicationVaultHealth Refresh.
 */
public final class ReplicationVaultHealthRefreshSamples {
    /*
     * x-ms-original-file:
     * specification/recoveryservicessiterecovery/resource-manager/Microsoft.RecoveryServices/stable/2025-01-01/examples
     * /ReplicationVaultHealth_Refresh.json
     */
    /**
     * Sample code: Refreshes health summary of the vault.
     * 
     * @param manager Entry point to SiteRecoveryManager.
     */
    public static void refreshesHealthSummaryOfTheVault(
        com.azure.resourcemanager.recoveryservicessiterecovery.SiteRecoveryManager manager) {
        manager.replicationVaultHealths().refresh("resourceGroupPS1", "vault1", com.azure.core.util.Context.NONE);
    }
}
