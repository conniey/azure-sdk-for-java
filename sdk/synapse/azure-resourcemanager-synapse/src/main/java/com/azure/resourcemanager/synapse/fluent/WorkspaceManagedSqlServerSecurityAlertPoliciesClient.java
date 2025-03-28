// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.synapse.fluent.models.ServerSecurityAlertPolicyInner;
import com.azure.resourcemanager.synapse.models.SecurityAlertPolicyNameAutoGenerated;

/**
 * An instance of this class provides access to all the operations defined in
 * WorkspaceManagedSqlServerSecurityAlertPoliciesClient.
 */
public interface WorkspaceManagedSqlServerSecurityAlertPoliciesClient {
    /**
     * Get server's security alert policy.
     * 
     * Get a workspace managed sql server's security alert policy.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param securityAlertPolicyName The name of the security alert policy.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a workspace managed sql server's security alert policy along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<ServerSecurityAlertPolicyInner> getWithResponse(String resourceGroupName, String workspaceName,
        SecurityAlertPolicyNameAutoGenerated securityAlertPolicyName, Context context);

    /**
     * Get server's security alert policy.
     * 
     * Get a workspace managed sql server's security alert policy.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param securityAlertPolicyName The name of the security alert policy.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a workspace managed sql server's security alert policy.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ServerSecurityAlertPolicyInner get(String resourceGroupName, String workspaceName,
        SecurityAlertPolicyNameAutoGenerated securityAlertPolicyName);

    /**
     * Create or Update server's threat detection policy.
     * 
     * Create or Update a workspace managed sql server's threat detection policy.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param securityAlertPolicyName The name of the security alert policy.
     * @param parameters The workspace managed sql server security alert policy.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of workspace managed Sql server security alert policy.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<ServerSecurityAlertPolicyInner>, ServerSecurityAlertPolicyInner> beginCreateOrUpdate(
        String resourceGroupName, String workspaceName, SecurityAlertPolicyNameAutoGenerated securityAlertPolicyName,
        ServerSecurityAlertPolicyInner parameters);

    /**
     * Create or Update server's threat detection policy.
     * 
     * Create or Update a workspace managed sql server's threat detection policy.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param securityAlertPolicyName The name of the security alert policy.
     * @param parameters The workspace managed sql server security alert policy.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of workspace managed Sql server security alert policy.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<ServerSecurityAlertPolicyInner>, ServerSecurityAlertPolicyInner> beginCreateOrUpdate(
        String resourceGroupName, String workspaceName, SecurityAlertPolicyNameAutoGenerated securityAlertPolicyName,
        ServerSecurityAlertPolicyInner parameters, Context context);

    /**
     * Create or Update server's threat detection policy.
     * 
     * Create or Update a workspace managed sql server's threat detection policy.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param securityAlertPolicyName The name of the security alert policy.
     * @param parameters The workspace managed sql server security alert policy.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return workspace managed Sql server security alert policy.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ServerSecurityAlertPolicyInner createOrUpdate(String resourceGroupName, String workspaceName,
        SecurityAlertPolicyNameAutoGenerated securityAlertPolicyName, ServerSecurityAlertPolicyInner parameters);

    /**
     * Create or Update server's threat detection policy.
     * 
     * Create or Update a workspace managed sql server's threat detection policy.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param securityAlertPolicyName The name of the security alert policy.
     * @param parameters The workspace managed sql server security alert policy.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return workspace managed Sql server security alert policy.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ServerSecurityAlertPolicyInner createOrUpdate(String resourceGroupName, String workspaceName,
        SecurityAlertPolicyNameAutoGenerated securityAlertPolicyName, ServerSecurityAlertPolicyInner parameters,
        Context context);

    /**
     * Get server's threat detection policies.
     * 
     * Get workspace managed sql server's threat detection policies.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return workspace managed sql server's threat detection policies as paginated response with
     * {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ServerSecurityAlertPolicyInner> list(String resourceGroupName, String workspaceName);

    /**
     * Get server's threat detection policies.
     * 
     * Get workspace managed sql server's threat detection policies.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return workspace managed sql server's threat detection policies as paginated response with
     * {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ServerSecurityAlertPolicyInner> list(String resourceGroupName, String workspaceName, Context context);
}
