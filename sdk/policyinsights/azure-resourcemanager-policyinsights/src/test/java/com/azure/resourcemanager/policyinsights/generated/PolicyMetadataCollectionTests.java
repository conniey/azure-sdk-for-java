// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.policyinsights.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.policyinsights.models.PolicyMetadataCollection;

public final class PolicyMetadataCollectionTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        PolicyMetadataCollection model = BinaryData.fromString(
            "{\"value\":[{\"properties\":{\"metadataId\":\"ldforobwj\",\"category\":\"izbfhfovvacq\",\"title\":\"tuodxeszabbelaw\",\"owner\":\"ua\",\"additionalContentUrl\":\"zkwrrwoyc\",\"metadata\":\"datacwyhahno\"},\"id\":\"rkywuhpsvfuu\",\"type\":\"tlwexxwlalniexz\",\"name\":\"zpgepqty\"}],\"nextLink\":\"wwpgdakchzyvlixq\"}")
            .toObject(PolicyMetadataCollection.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        PolicyMetadataCollection model = new PolicyMetadataCollection();
        model = BinaryData.fromObject(model).toObject(PolicyMetadataCollection.class);
    }
}
