// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.netapp.generated;

import com.azure.resourcemanager.netapp.models.QosType;
import com.azure.resourcemanager.netapp.models.ServiceLevel;

/**
 * Samples for Pools CreateOrUpdate.
 */
public final class PoolsCreateOrUpdateSamples {
    /*
     * x-ms-original-file:
     * specification/netapp/resource-manager/Microsoft.NetApp/preview/2025-01-01-preview/examples/Pools_CreateOrUpdate.
     * json
     */
    /**
     * Sample code: Pools_CreateOrUpdate.
     * 
     * @param manager Entry point to NetAppFilesManager.
     */
    public static void poolsCreateOrUpdate(com.azure.resourcemanager.netapp.NetAppFilesManager manager) {
        manager.pools()
            .define("pool1")
            .withRegion("eastus")
            .withExistingNetAppAccount("myRG", "account1")
            .withSize(4398046511104L)
            .withServiceLevel(ServiceLevel.PREMIUM)
            .withQosType(QosType.AUTO)
            .create();
    }

    /*
     * x-ms-original-file: specification/netapp/resource-manager/Microsoft.NetApp/preview/2025-01-01-preview/examples/
     * Pools_CreateOrUpdate_CustomThroughput.json
     */
    /**
     * Sample code: Pools_CreateOrUpdate_CustomThroughput.
     * 
     * @param manager Entry point to NetAppFilesManager.
     */
    public static void
        poolsCreateOrUpdateCustomThroughput(com.azure.resourcemanager.netapp.NetAppFilesManager manager) {
        manager.pools()
            .define("customPool1")
            .withRegion("eastus")
            .withExistingNetAppAccount("myRG", "account1")
            .withSize(4398046511104L)
            .withServiceLevel(ServiceLevel.FLEXIBLE)
            .withCustomThroughputMibps(128.0F)
            .withQosType(QosType.MANUAL)
            .create();
    }
}
