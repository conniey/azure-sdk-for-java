// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databoxedge.generated;

import com.azure.resourcemanager.databoxedge.models.AzureContainerDataFormat;
import com.azure.resourcemanager.databoxedge.models.AzureContainerInfo;
import com.azure.resourcemanager.databoxedge.models.DataPolicy;
import com.azure.resourcemanager.databoxedge.models.MonitoringStatus;
import com.azure.resourcemanager.databoxedge.models.ShareAccessProtocol;
import com.azure.resourcemanager.databoxedge.models.ShareAccessType;
import com.azure.resourcemanager.databoxedge.models.ShareStatus;
import com.azure.resourcemanager.databoxedge.models.UserAccessRight;
import java.util.Arrays;

/**
 * Samples for Shares CreateOrUpdate.
 */
public final class SharesCreateOrUpdateSamples {
    /*
     * x-ms-original-file:
     * specification/databoxedge/resource-manager/Microsoft.DataBoxEdge/stable/2019-08-01/examples/SharePut.json
     */
    /**
     * Sample code: SharePut.
     * 
     * @param manager Entry point to DataBoxEdgeManager.
     */
    public static void sharePut(com.azure.resourcemanager.databoxedge.DataBoxEdgeManager manager) {
        manager.shares()
            .define("smbshare")
            .withExistingDataBoxEdgeDevice("testedgedevice", "GroupForEdgeAutomation")
            .withShareStatus(ShareStatus.fromString("Online"))
            .withMonitoringStatus(MonitoringStatus.ENABLED)
            .withAccessProtocol(ShareAccessProtocol.SMB)
            .withDescription("")
            .withAzureContainerInfo(new AzureContainerInfo().withStorageAccountCredentialId("fakeTokenPlaceholder")
                .withContainerName("testContainerSMB")
                .withDataFormat(AzureContainerDataFormat.BLOCK_BLOB))
            .withUserAccessRights(Arrays.asList(new UserAccessRight().withUserId(
                "/subscriptions/4385cf00-2d3a-425a-832f-f4285b1c9dce/resourceGroups/GroupForEdgeAutomation/providers/Microsoft.DataBoxEdge/dataBoxEdgeDevices/testedgedevice/users/user2")
                .withAccessType(ShareAccessType.CHANGE)))
            .withDataPolicy(DataPolicy.CLOUD)
            .create();
    }
}
