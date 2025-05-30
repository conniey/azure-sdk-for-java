// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resourcehealth.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.resourcehealth.fluent.models.OperationListResultInner;

/**
 * An instance of this class provides access to all the operations defined in OperationsClient.
 */
public interface OperationsClient {
    /**
     * Lists available operations for the resourcehealth resource provider.
     * 
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return lists the operations response along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<OperationListResultInner> listWithResponse(Context context);

    /**
     * Lists available operations for the resourcehealth resource provider.
     * 
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return lists the operations response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    OperationListResultInner list();
}
