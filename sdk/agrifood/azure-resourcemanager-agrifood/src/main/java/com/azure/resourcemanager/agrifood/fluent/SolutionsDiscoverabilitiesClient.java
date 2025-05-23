// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.agrifood.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.agrifood.fluent.models.FarmBeatsSolutionInner;
import java.util.List;

/**
 * An instance of this class provides access to all the operations defined in SolutionsDiscoverabilitiesClient.
 */
public interface SolutionsDiscoverabilitiesClient {
    /**
     * Get list of farmBeats solutions.
     * 
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of farmBeats solutions as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<FarmBeatsSolutionInner> list();

    /**
     * Get list of farmBeats solutions.
     * 
     * @param farmBeatsSolutionIds Ids of FarmBeats Solutions which the customer requests to fetch.
     * @param farmBeatsSolutionNames Names of FarmBeats Solutions which the customer requests to fetch.
     * @param maxPageSize Maximum number of items needed (inclusive).
     * Minimum = 10, Maximum = 1000, Default value = 50.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of farmBeats solutions as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<FarmBeatsSolutionInner> list(List<String> farmBeatsSolutionIds, List<String> farmBeatsSolutionNames,
        Integer maxPageSize, Context context);

    /**
     * Get farmBeats solution by id.
     * 
     * @param farmBeatsSolutionId farmBeatsSolutionId to be queried.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return farmBeats solution by id along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<FarmBeatsSolutionInner> getWithResponse(String farmBeatsSolutionId, Context context);

    /**
     * Get farmBeats solution by id.
     * 
     * @param farmBeatsSolutionId farmBeatsSolutionId to be queried.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return farmBeats solution by id.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    FarmBeatsSolutionInner get(String farmBeatsSolutionId);
}
