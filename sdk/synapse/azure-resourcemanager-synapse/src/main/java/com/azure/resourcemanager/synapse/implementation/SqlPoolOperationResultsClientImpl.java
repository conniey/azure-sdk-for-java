// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.implementation;

import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.Get;
import com.azure.core.annotation.HeaderParam;
import com.azure.core.annotation.Headers;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.PathParam;
import com.azure.core.annotation.QueryParam;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceInterface;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.annotation.UnexpectedResponseExceptionType;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.management.exception.ManagementException;
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import com.azure.resourcemanager.synapse.fluent.SqlPoolOperationResultsClient;
import reactor.core.publisher.Mono;

/**
 * An instance of this class provides access to all the operations defined in SqlPoolOperationResultsClient.
 */
public final class SqlPoolOperationResultsClientImpl implements SqlPoolOperationResultsClient {
    /**
     * The proxy service used to perform REST calls.
     */
    private final SqlPoolOperationResultsService service;

    /**
     * The service client containing this operation class.
     */
    private final SynapseManagementClientImpl client;

    /**
     * Initializes an instance of SqlPoolOperationResultsClientImpl.
     * 
     * @param client the instance of the service client containing this operation class.
     */
    SqlPoolOperationResultsClientImpl(SynapseManagementClientImpl client) {
        this.service = RestProxy.create(SqlPoolOperationResultsService.class, client.getHttpPipeline(),
            client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for SynapseManagementClientSqlPoolOperationResults to be used by the
     * proxy service to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "SynapseManagementCli")
    public interface SqlPoolOperationResultsService {
        @Headers({ "Content-Type: application/json" })
        @Get("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Synapse/workspaces/{workspaceName}/sqlPools/{sqlPoolName}/operationResults/{operationId}")
        @ExpectedResponses({ 200, 202 })
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<Object>> getLocationHeaderResult(@HostParam("$host") String endpoint,
            @QueryParam("api-version") String apiVersion, @PathParam("subscriptionId") String subscriptionId,
            @PathParam("resourceGroupName") String resourceGroupName, @PathParam("workspaceName") String workspaceName,
            @PathParam("sqlPoolName") String sqlPoolName, @PathParam("operationId") String operationId,
            @HeaderParam("Accept") String accept, Context context);
    }

    /**
     * Get SQL pool operation status
     * 
     * Get the status of a SQL pool operation.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param sqlPoolName SQL pool name.
     * @param operationId Operation ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the status of a SQL pool operation along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<Object>> getLocationHeaderResultWithResponseAsync(String resourceGroupName,
        String workspaceName, String sqlPoolName, String operationId) {
        if (this.client.getEndpoint() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono.error(new IllegalArgumentException(
                "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (workspaceName == null) {
            return Mono.error(new IllegalArgumentException("Parameter workspaceName is required and cannot be null."));
        }
        if (sqlPoolName == null) {
            return Mono.error(new IllegalArgumentException("Parameter sqlPoolName is required and cannot be null."));
        }
        if (operationId == null) {
            return Mono.error(new IllegalArgumentException("Parameter operationId is required and cannot be null."));
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(context -> service.getLocationHeaderResult(this.client.getEndpoint(),
                this.client.getApiVersion(), this.client.getSubscriptionId(), resourceGroupName, workspaceName,
                sqlPoolName, operationId, accept, context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Get SQL pool operation status
     * 
     * Get the status of a SQL pool operation.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param sqlPoolName SQL pool name.
     * @param operationId Operation ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the status of a SQL pool operation along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<Object>> getLocationHeaderResultWithResponseAsync(String resourceGroupName,
        String workspaceName, String sqlPoolName, String operationId, Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono.error(new IllegalArgumentException(
                "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (workspaceName == null) {
            return Mono.error(new IllegalArgumentException("Parameter workspaceName is required and cannot be null."));
        }
        if (sqlPoolName == null) {
            return Mono.error(new IllegalArgumentException("Parameter sqlPoolName is required and cannot be null."));
        }
        if (operationId == null) {
            return Mono.error(new IllegalArgumentException("Parameter operationId is required and cannot be null."));
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service.getLocationHeaderResult(this.client.getEndpoint(), this.client.getApiVersion(),
            this.client.getSubscriptionId(), resourceGroupName, workspaceName, sqlPoolName, operationId, accept,
            context);
    }

    /**
     * Get SQL pool operation status
     * 
     * Get the status of a SQL pool operation.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param sqlPoolName SQL pool name.
     * @param operationId Operation ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the status of a SQL pool operation on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Object> getLocationHeaderResultAsync(String resourceGroupName, String workspaceName,
        String sqlPoolName, String operationId) {
        return getLocationHeaderResultWithResponseAsync(resourceGroupName, workspaceName, sqlPoolName, operationId)
            .flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Get SQL pool operation status
     * 
     * Get the status of a SQL pool operation.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param sqlPoolName SQL pool name.
     * @param operationId Operation ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the status of a SQL pool operation along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Object> getLocationHeaderResultWithResponse(String resourceGroupName, String workspaceName,
        String sqlPoolName, String operationId, Context context) {
        return getLocationHeaderResultWithResponseAsync(resourceGroupName, workspaceName, sqlPoolName, operationId,
            context).block();
    }

    /**
     * Get SQL pool operation status
     * 
     * Get the status of a SQL pool operation.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param sqlPoolName SQL pool name.
     * @param operationId Operation ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the status of a SQL pool operation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Object getLocationHeaderResult(String resourceGroupName, String workspaceName, String sqlPoolName,
        String operationId) {
        return getLocationHeaderResultWithResponse(resourceGroupName, workspaceName, sqlPoolName, operationId,
            Context.NONE).getValue();
    }
}
