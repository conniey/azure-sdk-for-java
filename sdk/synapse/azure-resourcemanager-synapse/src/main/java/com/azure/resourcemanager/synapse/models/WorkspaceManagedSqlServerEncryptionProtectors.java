// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/**
 * Resource collection API of WorkspaceManagedSqlServerEncryptionProtectors.
 */
public interface WorkspaceManagedSqlServerEncryptionProtectors {
    /**
     * Get workspace server's encryption protector.
     * 
     * Get workspace managed sql server's encryption protector.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param encryptionProtectorName The name of the encryption protector.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return workspace managed sql server's encryption protector along with {@link Response}.
     */
    Response<EncryptionProtector> getWithResponse(String resourceGroupName, String workspaceName,
        EncryptionProtectorName encryptionProtectorName, Context context);

    /**
     * Get workspace server's encryption protector.
     * 
     * Get workspace managed sql server's encryption protector.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param encryptionProtectorName The name of the encryption protector.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return workspace managed sql server's encryption protector.
     */
    EncryptionProtector get(String resourceGroupName, String workspaceName,
        EncryptionProtectorName encryptionProtectorName);

    /**
     * Get list of encryption protectors for the server.
     * 
     * Get list of encryption protectors for workspace managed sql server.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of encryption protectors for workspace managed sql server as paginated response with
     * {@link PagedIterable}.
     */
    PagedIterable<EncryptionProtector> list(String resourceGroupName, String workspaceName);

    /**
     * Get list of encryption protectors for the server.
     * 
     * Get list of encryption protectors for workspace managed sql server.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of encryption protectors for workspace managed sql server as paginated response with
     * {@link PagedIterable}.
     */
    PagedIterable<EncryptionProtector> list(String resourceGroupName, String workspaceName, Context context);

    /**
     * Revalidates server's existing encryption protector.
     * 
     * Revalidates workspace managed sql server's existing encryption protector.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param encryptionProtectorName The name of the encryption protector.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void revalidate(String resourceGroupName, String workspaceName, EncryptionProtectorName encryptionProtectorName);

    /**
     * Revalidates server's existing encryption protector.
     * 
     * Revalidates workspace managed sql server's existing encryption protector.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param encryptionProtectorName The name of the encryption protector.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void revalidate(String resourceGroupName, String workspaceName, EncryptionProtectorName encryptionProtectorName,
        Context context);

    /**
     * Get workspace server's encryption protector.
     * 
     * Get workspace managed sql server's encryption protector.
     * 
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return workspace managed sql server's encryption protector along with {@link Response}.
     */
    EncryptionProtector getById(String id);

    /**
     * Get workspace server's encryption protector.
     * 
     * Get workspace managed sql server's encryption protector.
     * 
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return workspace managed sql server's encryption protector along with {@link Response}.
     */
    Response<EncryptionProtector> getByIdWithResponse(String id, Context context);

    /**
     * Begins definition for a new EncryptionProtector resource.
     * 
     * @param name resource name.
     * @return the first stage of the new EncryptionProtector definition.
     */
    EncryptionProtector.DefinitionStages.Blank define(EncryptionProtectorName name);
}
