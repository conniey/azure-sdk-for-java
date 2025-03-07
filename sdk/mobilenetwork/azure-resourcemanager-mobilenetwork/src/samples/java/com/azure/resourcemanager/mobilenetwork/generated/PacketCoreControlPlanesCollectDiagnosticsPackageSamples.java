// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mobilenetwork.generated;

import com.azure.resourcemanager.mobilenetwork.models.PacketCoreControlPlaneCollectDiagnosticsPackage;

/**
 * Samples for PacketCoreControlPlanes CollectDiagnosticsPackage.
 */
public final class PacketCoreControlPlanesCollectDiagnosticsPackageSamples {
    /*
     * x-ms-original-file:
     * specification/mobilenetwork/resource-manager/Microsoft.MobileNetwork/stable/2024-04-01/examples/
     * PacketCoreControlPlaneCollectDiagnosticsPackage.json
     */
    /**
     * Sample code: Collect diagnostics package from packet core control plane.
     * 
     * @param manager Entry point to MobileNetworkManager.
     */
    public static void collectDiagnosticsPackageFromPacketCoreControlPlane(
        com.azure.resourcemanager.mobilenetwork.MobileNetworkManager manager) {
        manager.packetCoreControlPlanes()
            .collectDiagnosticsPackage("rg1", "TestPacketCoreCP",
                new PacketCoreControlPlaneCollectDiagnosticsPackage().withStorageAccountBlobUrl(
                    "https://contosoaccount.blob.core.windows.net/container/diagnosticsPackage.zip"),
                com.azure.core.util.Context.NONE);
    }
}
