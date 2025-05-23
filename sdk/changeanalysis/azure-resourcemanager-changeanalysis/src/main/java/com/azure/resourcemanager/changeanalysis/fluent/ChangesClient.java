// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.changeanalysis.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.util.Context;
import com.azure.resourcemanager.changeanalysis.fluent.models.ChangeInner;
import java.time.OffsetDateTime;

/**
 * An instance of this class provides access to all the operations defined in ChangesClient.
 */
public interface ChangesClient {
    /**
     * List the changes of a resource group within the specified time range. Customer data will always be masked.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param startTime Specifies the start time of the changes request.
     * @param endTime Specifies the end time of the changes request.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of detected changes as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ChangeInner> listByResourceGroup(String resourceGroupName, OffsetDateTime startTime,
        OffsetDateTime endTime);

    /**
     * List the changes of a resource group within the specified time range. Customer data will always be masked.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param startTime Specifies the start time of the changes request.
     * @param endTime Specifies the end time of the changes request.
     * @param skipToken A skip token is used to continue retrieving items after an operation returns a partial result.
     * If a previous response contains a nextLink element, the value of the nextLink element will include a skipToken
     * parameter that specifies a starting point to use for subsequent calls.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of detected changes as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ChangeInner> listByResourceGroup(String resourceGroupName, OffsetDateTime startTime,
        OffsetDateTime endTime, String skipToken, Context context);

    /**
     * List the changes of a subscription within the specified time range. Customer data will always be masked.
     * 
     * @param startTime Specifies the start time of the changes request.
     * @param endTime Specifies the end time of the changes request.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of detected changes as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ChangeInner> list(OffsetDateTime startTime, OffsetDateTime endTime);

    /**
     * List the changes of a subscription within the specified time range. Customer data will always be masked.
     * 
     * @param startTime Specifies the start time of the changes request.
     * @param endTime Specifies the end time of the changes request.
     * @param skipToken A skip token is used to continue retrieving items after an operation returns a partial result.
     * If a previous response contains a nextLink element, the value of the nextLink element will include a skipToken
     * parameter that specifies a starting point to use for subsequent calls.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of detected changes as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ChangeInner> list(OffsetDateTime startTime, OffsetDateTime endTime, String skipToken,
        Context context);
}
