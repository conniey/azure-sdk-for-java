// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.avs.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.avs.implementation.models.WorkloadNetworkGatewayList;
import org.junit.jupiter.api.Assertions;

public final class WorkloadNetworkGatewayListTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        WorkloadNetworkGatewayList model = BinaryData.fromString(
            "{\"value\":[{\"properties\":{\"provisioningState\":\"Building\",\"displayName\":\"nsez\",\"path\":\"tbzsgfyccs\"},\"id\":\"wmdwzjeiachboo\",\"name\":\"flnrosfqpteehzz\",\"type\":\"ypyqrimzinp\"},{\"properties\":{\"provisioningState\":\"Succeeded\",\"displayName\":\"kirsoodqxhc\",\"path\":\"nohjt\"},\"id\":\"whdsoifiyip\",\"name\":\"xsqwpgrjbznorc\",\"type\":\"xv\"}],\"nextLink\":\"byxqabn\"}")
            .toObject(WorkloadNetworkGatewayList.class);
        Assertions.assertEquals("nsez", model.value().get(0).displayName());
        Assertions.assertEquals("byxqabn", model.nextLink());
    }
}
