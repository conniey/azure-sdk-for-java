// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.recoveryservicessiterecovery.fluent.models.RecoveryPointInner;

/**
 * An instance of this class provides access to all the operations defined in RecoveryPointsClient.
 */
public interface RecoveryPointsClient {
    /**
     * Gets the list of recovery points for a replication protected item.
     * 
     * Lists the available recovery points for a replication protected item.
     * 
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param resourceName The name of the recovery services vault.
     * @param fabricName The fabric name.
     * @param protectionContainerName The protection container name.
     * @param replicatedProtectedItemName The replication protected item name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return collection of recovery point details as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<RecoveryPointInner> listByReplicationProtectedItems(String resourceGroupName, String resourceName,
        String fabricName, String protectionContainerName, String replicatedProtectedItemName);

    /**
     * Gets the list of recovery points for a replication protected item.
     * 
     * Lists the available recovery points for a replication protected item.
     * 
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param resourceName The name of the recovery services vault.
     * @param fabricName The fabric name.
     * @param protectionContainerName The protection container name.
     * @param replicatedProtectedItemName The replication protected item name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return collection of recovery point details as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<RecoveryPointInner> listByReplicationProtectedItems(String resourceGroupName, String resourceName,
        String fabricName, String protectionContainerName, String replicatedProtectedItemName, Context context);

    /**
     * Gets a recovery point.
     * 
     * Get the details of specified recovery point.
     * 
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param resourceName The name of the recovery services vault.
     * @param fabricName The fabric name.
     * @param protectionContainerName The protection container name.
     * @param replicatedProtectedItemName The replication protected item name.
     * @param recoveryPointName The recovery point name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the details of specified recovery point along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<RecoveryPointInner> getWithResponse(String resourceGroupName, String resourceName, String fabricName,
        String protectionContainerName, String replicatedProtectedItemName, String recoveryPointName, Context context);

    /**
     * Gets a recovery point.
     * 
     * Get the details of specified recovery point.
     * 
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param resourceName The name of the recovery services vault.
     * @param fabricName The fabric name.
     * @param protectionContainerName The protection container name.
     * @param replicatedProtectedItemName The replication protected item name.
     * @param recoveryPointName The recovery point name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the details of specified recovery point.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    RecoveryPointInner get(String resourceGroupName, String resourceName, String fabricName,
        String protectionContainerName, String replicatedProtectedItemName, String recoveryPointName);
}
