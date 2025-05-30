// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.InMageRcmFailbackDiscoveredProtectedVmDetails;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.InMageRcmFailbackMobilityAgentDetails;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.InMageRcmFailbackNicDetails;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.InMageRcmFailbackProtectedDiskDetails;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.InMageRcmFailbackReplicationDetails;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.InMageRcmFailbackSyncDetails;
import java.util.Arrays;

public final class InMageRcmFailbackReplicationDetailsTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        InMageRcmFailbackReplicationDetails model = BinaryData.fromString(
            "{\"instanceType\":\"InMageRcmFailback\",\"internalIdentifier\":\"nim\",\"azureVirtualMachineId\":\"nsugisn\",\"multiVmGroupName\":\"wnwngh\",\"reprotectAgentId\":\"ovke\",\"reprotectAgentName\":\"micjixxfsf\",\"osType\":\"rtnuguefxxijteb\",\"logStorageAccountId\":\"eywetkrhlolmcn\",\"targetvCenterId\":\"pfgsvbbvaqdljnp\",\"targetDataStoreName\":\"l\",\"targetVmName\":\"rdetawevxehuekdx\",\"initialReplicationProgressPercentage\":1241922415,\"initialReplicationProcessedBytes\":920623104067746342,\"initialReplicationTransferredBytes\":527341778884008906,\"initialReplicationProgressHealth\":\"InProgress\",\"resyncProgressPercentage\":1496419348,\"resyncProcessedBytes\":6925893404253866526,\"resyncTransferredBytes\":3074006163103830005,\"resyncProgressHealth\":\"None\",\"resyncRequired\":\"dcb\",\"resyncState\":\"StartedResynchronization\",\"protectedDisks\":[{\"diskId\":\"cxwbp\",\"diskName\":\"ykdigqzlrznda\",\"isOSDisk\":\"nidmjqmvytg\",\"capacityInBytes\":7386183782443517552,\"diskUuid\":\"rhqtwvcazekdzd\",\"dataPendingInLogDataStoreInMB\":5.988427606317592,\"dataPendingAtSourceAgentInMB\":31.400061525303812,\"isInitialReplicationComplete\":\"smpc\",\"irDetails\":{\"progressHealth\":\"Queued\",\"transferredBytes\":5989408229506815425,\"last15MinutesTransferredBytes\":3825814827583944794,\"lastDataTransferTimeUtc\":\"tig\",\"processedBytes\":8381512905713447350,\"startTime\":\"kdknczgorywnvo\",\"lastRefreshTime\":\"vmd\",\"progressPercentage\":2060383382},\"resyncDetails\":{\"progressHealth\":\"Queued\",\"transferredBytes\":2373187937917132990,\"last15MinutesTransferredBytes\":665395269134466182,\"lastDataTransferTimeUtc\":\"yhssrlvkpkpkocm\",\"processedBytes\":4934929756310852888,\"startTime\":\"xxopyi\",\"lastRefreshTime\":\"vspeslhwyykgvr\",\"progressPercentage\":1159607284},\"lastSyncTime\":\"2021-01-13T04:38:06Z\"},{\"diskId\":\"dhg\",\"diskName\":\"k\",\"isOSDisk\":\"yddt\",\"capacityInBytes\":915206227200554657,\"diskUuid\":\"vafnbfbqvenq\",\"dataPendingInLogDataStoreInMB\":18.921508282207235,\"dataPendingAtSourceAgentInMB\":57.80038413751979,\"isInitialReplicationComplete\":\"wzejpecwzvcm\",\"irDetails\":{\"progressHealth\":\"InProgress\",\"transferredBytes\":6111041281235678577,\"last15MinutesTransferredBytes\":2396807227472120520,\"lastDataTransferTimeUtc\":\"ldidwmtffb\",\"processedBytes\":5754064334541061806,\"startTime\":\"zch\",\"lastRefreshTime\":\"agwn\",\"progressPercentage\":1190773271},\"resyncDetails\":{\"progressHealth\":\"NoProgress\",\"transferredBytes\":8113447440192346779,\"last15MinutesTransferredBytes\":7745123040395972407,\"lastDataTransferTimeUtc\":\"zak\",\"processedBytes\":6437922430313093475,\"startTime\":\"raqp\",\"lastRefreshTime\":\"psucmximcwqxyn\",\"progressPercentage\":284324942},\"lastSyncTime\":\"2021-04-05T22:02:42Z\"}],\"mobilityAgentDetails\":{\"version\":\"yv\",\"latestVersion\":\"bgngcrusxhirc\",\"driverVersion\":\"cvsvk\",\"latestUpgradableVersionWithoutReboot\":\"bjolpyoklkv\",\"agentVersionExpiryDate\":\"2021-10-06T12:20:05Z\",\"driverVersionExpiryDate\":\"2021-05-22T08:45:26Z\",\"lastHeartbeatUtc\":\"2021-07-24T00:39:17Z\",\"reasonsBlockingUpgrade\":[\"UnsupportedProtectionScenario\"],\"isUpgradeable\":\"oi\"},\"vmNics\":[{\"macAddress\":\"xbhtpsyioqemqw\",\"networkName\":\"szzgyk\",\"adapterType\":\"kawanvm\",\"sourceIpAddress\":\"vg\"},{\"macAddress\":\"crbkompnbnfgywe\",\"networkName\":\"bepgcmahiwfry\",\"adapterType\":\"kchkapit\",\"sourceIpAddress\":\"shfyf\"}],\"lastPlannedFailoverStartTime\":\"2021-07-14T12:56:17Z\",\"lastPlannedFailoverStatus\":\"Succeeded\",\"discoveredVmDetails\":{\"vCenterId\":\"zw\",\"vCenterFqdn\":\"unfdgbggcjx\",\"datastores\":[\"livwehsud\",\"mymbhdosmbng\"],\"ipAddresses\":[\"gxzduvxdmxe\"],\"vmwareToolsStatus\":\"tmdm\",\"powerStatus\":\"senxoirxyd\",\"vmFqdn\":\"iploisjkzsoxznnt\",\"osName\":\"kvyohpsap\",\"createdTimestamp\":\"2021-06-25T13:49:54Z\",\"updatedTimestamp\":\"2021-11-23T03:42:03Z\",\"isDeleted\":false,\"lastDiscoveryTimeInUtc\":\"2021-03-01T22:51:13Z\"},\"lastUsedPolicyId\":\"jzghximkg\",\"lastUsedPolicyFriendlyName\":\"xpqkjnpy\",\"isAgentRegistrationSuccessfulAfterFailover\":true}")
            .toObject(InMageRcmFailbackReplicationDetails.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        InMageRcmFailbackReplicationDetails model = new InMageRcmFailbackReplicationDetails()
            .withProtectedDisks(Arrays.asList(
                new InMageRcmFailbackProtectedDiskDetails().withIrDetails(new InMageRcmFailbackSyncDetails())
                    .withResyncDetails(new InMageRcmFailbackSyncDetails()),
                new InMageRcmFailbackProtectedDiskDetails().withIrDetails(new InMageRcmFailbackSyncDetails())
                    .withResyncDetails(new InMageRcmFailbackSyncDetails())))
            .withMobilityAgentDetails(new InMageRcmFailbackMobilityAgentDetails())
            .withVmNics(Arrays.asList(new InMageRcmFailbackNicDetails(), new InMageRcmFailbackNicDetails()))
            .withDiscoveredVmDetails(new InMageRcmFailbackDiscoveredProtectedVmDetails());
        model = BinaryData.fromObject(model).toObject(InMageRcmFailbackReplicationDetails.class);
    }
}
