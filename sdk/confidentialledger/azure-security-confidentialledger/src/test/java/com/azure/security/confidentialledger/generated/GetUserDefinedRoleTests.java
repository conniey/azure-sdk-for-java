// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.security.confidentialledger.generated;

import com.azure.core.http.rest.RequestOptions;
import com.azure.core.http.rest.Response;
import com.azure.core.util.BinaryData;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public final class GetUserDefinedRoleTests extends ConfidentialLedgerClientTestBase {
    @Test
    @Disabled
    public void testGetUserDefinedRoleTests() {
        RequestOptions requestOptions = new RequestOptions();
        Response<BinaryData> response
            = confidentialLedgerClient.getUserDefinedRoleWithResponse("administrator", requestOptions);
        Assertions.assertEquals(200, response.getStatusCode());
        Assertions.assertEquals(BinaryData.fromString(
            "[{\"roleActions\":[\"Microsoft.ConfidentialLedger/ledger/users/write\",\"Microsoft.ConfidentialLedger/ledger/users/read\"],\"roleName\":\"administrator\"}]")
            .toObject(Object.class), response.getValue().toObject(Object.class));
    }
}
