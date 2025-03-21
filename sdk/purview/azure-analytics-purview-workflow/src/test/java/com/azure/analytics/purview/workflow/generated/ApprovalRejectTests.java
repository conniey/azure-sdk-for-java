// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.purview.workflow.generated;

import com.azure.core.http.rest.RequestOptions;
import com.azure.core.http.rest.Response;
import com.azure.core.util.BinaryData;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public final class ApprovalRejectTests extends PurviewWorkflowClientTestBase {
    @Test
    @Disabled
    public void testApprovalRejectTests() {
        BinaryData approvalResponseComment = BinaryData.fromString("{\"comment\":\"Thanks for raising this!\"}");
        RequestOptions requestOptions = new RequestOptions();
        Response<Void> response = approvalClient.rejectWithResponse("98d98e2c-23fa-4157-a3f8-ff8ce5cc095c",
            approvalResponseComment, requestOptions);
        Assertions.assertEquals(200, response.getStatusCode());
    }
}
