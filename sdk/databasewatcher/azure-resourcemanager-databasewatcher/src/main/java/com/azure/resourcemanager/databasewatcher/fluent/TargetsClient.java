// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.databasewatcher.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.databasewatcher.fluent.models.TargetInner;

/**
 * An instance of this class provides access to all the operations defined in TargetsClient.
 */
public interface TargetsClient {
    /**
     * Get a Target.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param watcherName The database watcher name.
     * @param targetName The target resource name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a Target along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<TargetInner> getWithResponse(String resourceGroupName, String watcherName, String targetName,
        Context context);

    /**
     * Get a Target.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param watcherName The database watcher name.
     * @param targetName The target resource name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a Target.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    TargetInner get(String resourceGroupName, String watcherName, String targetName);

    /**
     * Create a Target.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param watcherName The database watcher name.
     * @param targetName The target resource name.
     * @param resource Resource create parameters.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return concrete proxy resource types can be created by aliasing this type using a specific property type along
     * with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<TargetInner> createOrUpdateWithResponse(String resourceGroupName, String watcherName, String targetName,
        TargetInner resource, Context context);

    /**
     * Create a Target.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param watcherName The database watcher name.
     * @param targetName The target resource name.
     * @param resource Resource create parameters.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return concrete proxy resource types can be created by aliasing this type using a specific property type.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    TargetInner createOrUpdate(String resourceGroupName, String watcherName, String targetName, TargetInner resource);

    /**
     * Delete a Target.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param watcherName The database watcher name.
     * @param targetName The target resource name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<Void> deleteWithResponse(String resourceGroupName, String watcherName, String targetName, Context context);

    /**
     * Delete a Target.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param watcherName The database watcher name.
     * @param targetName The target resource name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String watcherName, String targetName);

    /**
     * List Target resources by Watcher.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param watcherName The database watcher name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response of a Target list operation as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<TargetInner> listByWatcher(String resourceGroupName, String watcherName);

    /**
     * List Target resources by Watcher.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param watcherName The database watcher name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response of a Target list operation as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<TargetInner> listByWatcher(String resourceGroupName, String watcherName, Context context);
}
