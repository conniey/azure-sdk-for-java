// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.recoveryservicesdatareplication.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicesdatareplication.models.VMwareToAzStackHCIProtectedDiskProperties;

public final class VMwareToAzStackHCIProtectedDiskPropertieTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        VMwareToAzStackHCIProtectedDiskProperties model = BinaryData.fromString(
            "{\"storageContainerId\":\"e\",\"storageContainerLocalPath\":\"pmzznrtffya\",\"sourceDiskId\":\"tmhheioqa\",\"sourceDiskName\":\"v\",\"seedDiskName\":\"ufuqyrx\",\"testMigrateDiskName\":\"lcgqlsismj\",\"migrateDiskName\":\"rddga\",\"isOsDisk\":true,\"capacityInBytes\":5856307609196818700,\"isDynamic\":true,\"diskType\":\"ju\",\"diskBlockSize\":5435042220194054778,\"diskLogicalSectorSize\":1225355214709968097,\"diskPhysicalSectorSize\":5455022982968186244}")
            .toObject(VMwareToAzStackHCIProtectedDiskProperties.class);
    }
}
