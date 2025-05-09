// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storagepool.generated;

/**
 * Samples for IscsiTargets ListByDiskPool.
 */
public final class IscsiTargetsListByDiskPoolSamples {
    /*
     * x-ms-original-file: specification/storagepool/resource-manager/Microsoft.StoragePool/stable/2021-08-01/examples/
     * IscsiTargets_ListByDiskPool.json
     */
    /**
     * Sample code: List Disk Pools by Resource Group.
     * 
     * @param manager Entry point to StoragePoolManager.
     */
    public static void listDiskPoolsByResourceGroup(com.azure.resourcemanager.storagepool.StoragePoolManager manager) {
        manager.iscsiTargets().listByDiskPool("myResourceGroup", "myDiskPool", com.azure.core.util.Context.NONE);
    }
}
