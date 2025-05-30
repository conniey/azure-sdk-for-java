// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.apimanagement.fluent.models.NamedValueContractInner;
import com.azure.resourcemanager.apimanagement.fluent.models.NamedValueSecretContractInner;
import com.azure.resourcemanager.apimanagement.models.KeyVaultRefreshState;
import com.azure.resourcemanager.apimanagement.models.NamedValueCreateContract;
import com.azure.resourcemanager.apimanagement.models.NamedValueUpdateParameters;
import com.azure.resourcemanager.apimanagement.models.WorkspaceNamedValuesGetEntityTagResponse;
import com.azure.resourcemanager.apimanagement.models.WorkspaceNamedValuesGetResponse;
import com.azure.resourcemanager.apimanagement.models.WorkspaceNamedValuesListValueResponse;

/**
 * An instance of this class provides access to all the operations defined in WorkspaceNamedValuesClient.
 */
public interface WorkspaceNamedValuesClient {
    /**
     * Lists a collection of named values defined within a workspace in a service instance.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serviceName The name of the API Management service.
     * @param workspaceId Workspace identifier. Must be unique in the current API Management service instance.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return paged NamedValue list representation as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<NamedValueContractInner> listByService(String resourceGroupName, String serviceName,
        String workspaceId);

    /**
     * Lists a collection of named values defined within a workspace in a service instance.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serviceName The name of the API Management service.
     * @param workspaceId Workspace identifier. Must be unique in the current API Management service instance.
     * @param filter | Field | Usage | Supported operators | Supported functions
     * |&lt;/br&gt;|-------------|-------------|-------------|-------------|&lt;/br&gt;| tags | filter | ge, le, eq, ne,
     * gt, lt | substringof, contains, startswith, endswith, any, all |&lt;/br&gt;| displayName | filter | ge, le, eq,
     * ne, gt, lt | substringof, contains, startswith, endswith |&lt;/br&gt;.
     * @param top Number of records to return.
     * @param skip Number of records to skip.
     * @param isKeyVaultRefreshFailed Query parameter to fetch named value entities based on refresh status.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return paged NamedValue list representation as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<NamedValueContractInner> listByService(String resourceGroupName, String serviceName,
        String workspaceId, String filter, Integer top, Integer skip, KeyVaultRefreshState isKeyVaultRefreshFailed,
        Context context);

    /**
     * Gets the entity state (Etag) version of the named value specified by its identifier.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serviceName The name of the API Management service.
     * @param workspaceId Workspace identifier. Must be unique in the current API Management service instance.
     * @param namedValueId Identifier of the NamedValue.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the entity state (Etag) version of the named value specified by its identifier.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    WorkspaceNamedValuesGetEntityTagResponse getEntityTagWithResponse(String resourceGroupName, String serviceName,
        String workspaceId, String namedValueId, Context context);

    /**
     * Gets the entity state (Etag) version of the named value specified by its identifier.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serviceName The name of the API Management service.
     * @param workspaceId Workspace identifier. Must be unique in the current API Management service instance.
     * @param namedValueId Identifier of the NamedValue.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void getEntityTag(String resourceGroupName, String serviceName, String workspaceId, String namedValueId);

    /**
     * Gets the details of the named value specified by its identifier.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serviceName The name of the API Management service.
     * @param workspaceId Workspace identifier. Must be unique in the current API Management service instance.
     * @param namedValueId Identifier of the NamedValue.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the details of the named value specified by its identifier.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    WorkspaceNamedValuesGetResponse getWithResponse(String resourceGroupName, String serviceName, String workspaceId,
        String namedValueId, Context context);

    /**
     * Gets the details of the named value specified by its identifier.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serviceName The name of the API Management service.
     * @param workspaceId Workspace identifier. Must be unique in the current API Management service instance.
     * @param namedValueId Identifier of the NamedValue.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the details of the named value specified by its identifier.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    NamedValueContractInner get(String resourceGroupName, String serviceName, String workspaceId, String namedValueId);

    /**
     * Creates or updates named value.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serviceName The name of the API Management service.
     * @param workspaceId Workspace identifier. Must be unique in the current API Management service instance.
     * @param namedValueId Identifier of the NamedValue.
     * @param parameters Create parameters.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of namedValue details.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<NamedValueContractInner>, NamedValueContractInner> beginCreateOrUpdate(
        String resourceGroupName, String serviceName, String workspaceId, String namedValueId,
        NamedValueCreateContract parameters);

    /**
     * Creates or updates named value.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serviceName The name of the API Management service.
     * @param workspaceId Workspace identifier. Must be unique in the current API Management service instance.
     * @param namedValueId Identifier of the NamedValue.
     * @param parameters Create parameters.
     * @param ifMatch ETag of the Entity. Not required when creating an entity, but required when updating an entity.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of namedValue details.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<NamedValueContractInner>, NamedValueContractInner> beginCreateOrUpdate(
        String resourceGroupName, String serviceName, String workspaceId, String namedValueId,
        NamedValueCreateContract parameters, String ifMatch, Context context);

    /**
     * Creates or updates named value.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serviceName The name of the API Management service.
     * @param workspaceId Workspace identifier. Must be unique in the current API Management service instance.
     * @param namedValueId Identifier of the NamedValue.
     * @param parameters Create parameters.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return namedValue details.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    NamedValueContractInner createOrUpdate(String resourceGroupName, String serviceName, String workspaceId,
        String namedValueId, NamedValueCreateContract parameters);

    /**
     * Creates or updates named value.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serviceName The name of the API Management service.
     * @param workspaceId Workspace identifier. Must be unique in the current API Management service instance.
     * @param namedValueId Identifier of the NamedValue.
     * @param parameters Create parameters.
     * @param ifMatch ETag of the Entity. Not required when creating an entity, but required when updating an entity.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return namedValue details.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    NamedValueContractInner createOrUpdate(String resourceGroupName, String serviceName, String workspaceId,
        String namedValueId, NamedValueCreateContract parameters, String ifMatch, Context context);

    /**
     * Updates the specific named value.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serviceName The name of the API Management service.
     * @param workspaceId Workspace identifier. Must be unique in the current API Management service instance.
     * @param namedValueId Identifier of the NamedValue.
     * @param ifMatch ETag of the Entity. ETag should match the current entity state from the header response of the GET
     * request or it should be * for unconditional update.
     * @param parameters Update parameters.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of namedValue details.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<NamedValueContractInner>, NamedValueContractInner> beginUpdate(String resourceGroupName,
        String serviceName, String workspaceId, String namedValueId, String ifMatch,
        NamedValueUpdateParameters parameters);

    /**
     * Updates the specific named value.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serviceName The name of the API Management service.
     * @param workspaceId Workspace identifier. Must be unique in the current API Management service instance.
     * @param namedValueId Identifier of the NamedValue.
     * @param ifMatch ETag of the Entity. ETag should match the current entity state from the header response of the GET
     * request or it should be * for unconditional update.
     * @param parameters Update parameters.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of namedValue details.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<NamedValueContractInner>, NamedValueContractInner> beginUpdate(String resourceGroupName,
        String serviceName, String workspaceId, String namedValueId, String ifMatch,
        NamedValueUpdateParameters parameters, Context context);

    /**
     * Updates the specific named value.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serviceName The name of the API Management service.
     * @param workspaceId Workspace identifier. Must be unique in the current API Management service instance.
     * @param namedValueId Identifier of the NamedValue.
     * @param ifMatch ETag of the Entity. ETag should match the current entity state from the header response of the GET
     * request or it should be * for unconditional update.
     * @param parameters Update parameters.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return namedValue details.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    NamedValueContractInner update(String resourceGroupName, String serviceName, String workspaceId,
        String namedValueId, String ifMatch, NamedValueUpdateParameters parameters);

    /**
     * Updates the specific named value.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serviceName The name of the API Management service.
     * @param workspaceId Workspace identifier. Must be unique in the current API Management service instance.
     * @param namedValueId Identifier of the NamedValue.
     * @param ifMatch ETag of the Entity. ETag should match the current entity state from the header response of the GET
     * request or it should be * for unconditional update.
     * @param parameters Update parameters.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return namedValue details.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    NamedValueContractInner update(String resourceGroupName, String serviceName, String workspaceId,
        String namedValueId, String ifMatch, NamedValueUpdateParameters parameters, Context context);

    /**
     * Deletes specific named value from the workspace in an API Management service instance.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serviceName The name of the API Management service.
     * @param workspaceId Workspace identifier. Must be unique in the current API Management service instance.
     * @param namedValueId Identifier of the NamedValue.
     * @param ifMatch ETag of the Entity. ETag should match the current entity state from the header response of the GET
     * request or it should be * for unconditional update.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<Void> deleteWithResponse(String resourceGroupName, String serviceName, String workspaceId,
        String namedValueId, String ifMatch, Context context);

    /**
     * Deletes specific named value from the workspace in an API Management service instance.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serviceName The name of the API Management service.
     * @param workspaceId Workspace identifier. Must be unique in the current API Management service instance.
     * @param namedValueId Identifier of the NamedValue.
     * @param ifMatch ETag of the Entity. ETag should match the current entity state from the header response of the GET
     * request or it should be * for unconditional update.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String serviceName, String workspaceId, String namedValueId, String ifMatch);

    /**
     * Gets the secret of the named value specified by its identifier.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serviceName The name of the API Management service.
     * @param workspaceId Workspace identifier. Must be unique in the current API Management service instance.
     * @param namedValueId Identifier of the NamedValue.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the secret of the named value specified by its identifier.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    WorkspaceNamedValuesListValueResponse listValueWithResponse(String resourceGroupName, String serviceName,
        String workspaceId, String namedValueId, Context context);

    /**
     * Gets the secret of the named value specified by its identifier.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serviceName The name of the API Management service.
     * @param workspaceId Workspace identifier. Must be unique in the current API Management service instance.
     * @param namedValueId Identifier of the NamedValue.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the secret of the named value specified by its identifier.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    NamedValueSecretContractInner listValue(String resourceGroupName, String serviceName, String workspaceId,
        String namedValueId);

    /**
     * Refresh the secret of the named value specified by its identifier.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serviceName The name of the API Management service.
     * @param workspaceId Workspace identifier. Must be unique in the current API Management service instance.
     * @param namedValueId Identifier of the NamedValue.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of namedValue details.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<NamedValueContractInner>, NamedValueContractInner>
        beginRefreshSecret(String resourceGroupName, String serviceName, String workspaceId, String namedValueId);

    /**
     * Refresh the secret of the named value specified by its identifier.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serviceName The name of the API Management service.
     * @param workspaceId Workspace identifier. Must be unique in the current API Management service instance.
     * @param namedValueId Identifier of the NamedValue.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of namedValue details.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<NamedValueContractInner>, NamedValueContractInner> beginRefreshSecret(
        String resourceGroupName, String serviceName, String workspaceId, String namedValueId, Context context);

    /**
     * Refresh the secret of the named value specified by its identifier.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serviceName The name of the API Management service.
     * @param workspaceId Workspace identifier. Must be unique in the current API Management service instance.
     * @param namedValueId Identifier of the NamedValue.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return namedValue details.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    NamedValueContractInner refreshSecret(String resourceGroupName, String serviceName, String workspaceId,
        String namedValueId);

    /**
     * Refresh the secret of the named value specified by its identifier.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serviceName The name of the API Management service.
     * @param workspaceId Workspace identifier. Must be unique in the current API Management service instance.
     * @param namedValueId Identifier of the NamedValue.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return namedValue details.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    NamedValueContractInner refreshSecret(String resourceGroupName, String serviceName, String workspaceId,
        String namedValueId, Context context);
}
