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
import com.azure.core.http.rest.PagedFlux;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.PagedResponse;
import com.azure.core.http.rest.PagedResponseBase;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.management.exception.ManagementException;
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import com.azure.resourcemanager.synapse.fluent.SqlPoolTablesClient;
import com.azure.resourcemanager.synapse.fluent.models.SqlPoolTableInner;
import com.azure.resourcemanager.synapse.models.SqlPoolTableListResult;
import reactor.core.publisher.Mono;

/**
 * An instance of this class provides access to all the operations defined in SqlPoolTablesClient.
 */
public final class SqlPoolTablesClientImpl implements SqlPoolTablesClient {
    /**
     * The proxy service used to perform REST calls.
     */
    private final SqlPoolTablesService service;

    /**
     * The service client containing this operation class.
     */
    private final SynapseManagementClientImpl client;

    /**
     * Initializes an instance of SqlPoolTablesClientImpl.
     * 
     * @param client the instance of the service client containing this operation class.
     */
    SqlPoolTablesClientImpl(SynapseManagementClientImpl client) {
        this.service
            = RestProxy.create(SqlPoolTablesService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for SynapseManagementClientSqlPoolTables to be used by the proxy service
     * to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "SynapseManagementCli")
    public interface SqlPoolTablesService {
        @Headers({ "Content-Type: application/json" })
        @Get("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Synapse/workspaces/{workspaceName}/sqlPools/{sqlPoolName}/schemas/{schemaName}/tables")
        @ExpectedResponses({ 200 })
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<SqlPoolTableListResult>> listBySchema(@HostParam("$host") String endpoint,
            @QueryParam("api-version") String apiVersion, @PathParam("subscriptionId") String subscriptionId,
            @PathParam("resourceGroupName") String resourceGroupName, @PathParam("workspaceName") String workspaceName,
            @PathParam("sqlPoolName") String sqlPoolName, @PathParam("schemaName") String schemaName,
            @QueryParam("$filter") String filter, @HeaderParam("Accept") String accept, Context context);

        @Headers({ "Content-Type: application/json" })
        @Get("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Synapse/workspaces/{workspaceName}/sqlPools/{sqlPoolName}/schemas/{schemaName}/tables/{tableName}")
        @ExpectedResponses({ 200 })
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<SqlPoolTableInner>> get(@HostParam("$host") String endpoint,
            @QueryParam("api-version") String apiVersion, @PathParam("subscriptionId") String subscriptionId,
            @PathParam("resourceGroupName") String resourceGroupName, @PathParam("workspaceName") String workspaceName,
            @PathParam("sqlPoolName") String sqlPoolName, @PathParam("schemaName") String schemaName,
            @PathParam("tableName") String tableName, @HeaderParam("Accept") String accept, Context context);

        @Headers({ "Content-Type: application/json" })
        @Get("{nextLink}")
        @ExpectedResponses({ 200 })
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<SqlPoolTableListResult>> listBySchemaNext(
            @PathParam(value = "nextLink", encoded = true) String nextLink, @HostParam("$host") String endpoint,
            @HeaderParam("Accept") String accept, Context context);
    }

    /**
     * Gets tables of a given schema in a SQL pool
     * 
     * Gets tables of a given schema in a SQL pool.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param sqlPoolName SQL pool name.
     * @param schemaName The name of the schema.
     * @param filter An OData filter expression that filters elements in the collection.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return tables of a given schema in a SQL pool along with {@link PagedResponse} on successful completion of
     * {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<SqlPoolTableInner>> listBySchemaSinglePageAsync(String resourceGroupName,
        String workspaceName, String sqlPoolName, String schemaName, String filter) {
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
        if (schemaName == null) {
            return Mono.error(new IllegalArgumentException("Parameter schemaName is required and cannot be null."));
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(context -> service.listBySchema(this.client.getEndpoint(), this.client.getApiVersion(),
                this.client.getSubscriptionId(), resourceGroupName, workspaceName, sqlPoolName, schemaName, filter,
                accept, context))
            .<PagedResponse<SqlPoolTableInner>>map(res -> new PagedResponseBase<>(res.getRequest(), res.getStatusCode(),
                res.getHeaders(), res.getValue().value(), res.getValue().nextLink(), null))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Gets tables of a given schema in a SQL pool
     * 
     * Gets tables of a given schema in a SQL pool.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param sqlPoolName SQL pool name.
     * @param schemaName The name of the schema.
     * @param filter An OData filter expression that filters elements in the collection.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return tables of a given schema in a SQL pool along with {@link PagedResponse} on successful completion of
     * {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<SqlPoolTableInner>> listBySchemaSinglePageAsync(String resourceGroupName,
        String workspaceName, String sqlPoolName, String schemaName, String filter, Context context) {
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
        if (schemaName == null) {
            return Mono.error(new IllegalArgumentException("Parameter schemaName is required and cannot be null."));
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .listBySchema(this.client.getEndpoint(), this.client.getApiVersion(), this.client.getSubscriptionId(),
                resourceGroupName, workspaceName, sqlPoolName, schemaName, filter, accept, context)
            .map(res -> new PagedResponseBase<>(res.getRequest(), res.getStatusCode(), res.getHeaders(),
                res.getValue().value(), res.getValue().nextLink(), null));
    }

    /**
     * Gets tables of a given schema in a SQL pool
     * 
     * Gets tables of a given schema in a SQL pool.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param sqlPoolName SQL pool name.
     * @param schemaName The name of the schema.
     * @param filter An OData filter expression that filters elements in the collection.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return tables of a given schema in a SQL pool as paginated response with {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    private PagedFlux<SqlPoolTableInner> listBySchemaAsync(String resourceGroupName, String workspaceName,
        String sqlPoolName, String schemaName, String filter) {
        return new PagedFlux<>(
            () -> listBySchemaSinglePageAsync(resourceGroupName, workspaceName, sqlPoolName, schemaName, filter),
            nextLink -> listBySchemaNextSinglePageAsync(nextLink));
    }

    /**
     * Gets tables of a given schema in a SQL pool
     * 
     * Gets tables of a given schema in a SQL pool.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param sqlPoolName SQL pool name.
     * @param schemaName The name of the schema.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return tables of a given schema in a SQL pool as paginated response with {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    private PagedFlux<SqlPoolTableInner> listBySchemaAsync(String resourceGroupName, String workspaceName,
        String sqlPoolName, String schemaName) {
        final String filter = null;
        return new PagedFlux<>(
            () -> listBySchemaSinglePageAsync(resourceGroupName, workspaceName, sqlPoolName, schemaName, filter),
            nextLink -> listBySchemaNextSinglePageAsync(nextLink));
    }

    /**
     * Gets tables of a given schema in a SQL pool
     * 
     * Gets tables of a given schema in a SQL pool.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param sqlPoolName SQL pool name.
     * @param schemaName The name of the schema.
     * @param filter An OData filter expression that filters elements in the collection.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return tables of a given schema in a SQL pool as paginated response with {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    private PagedFlux<SqlPoolTableInner> listBySchemaAsync(String resourceGroupName, String workspaceName,
        String sqlPoolName, String schemaName, String filter, Context context) {
        return new PagedFlux<>(() -> listBySchemaSinglePageAsync(resourceGroupName, workspaceName, sqlPoolName,
            schemaName, filter, context), nextLink -> listBySchemaNextSinglePageAsync(nextLink, context));
    }

    /**
     * Gets tables of a given schema in a SQL pool
     * 
     * Gets tables of a given schema in a SQL pool.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param sqlPoolName SQL pool name.
     * @param schemaName The name of the schema.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return tables of a given schema in a SQL pool as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<SqlPoolTableInner> listBySchema(String resourceGroupName, String workspaceName,
        String sqlPoolName, String schemaName) {
        final String filter = null;
        return new PagedIterable<>(
            listBySchemaAsync(resourceGroupName, workspaceName, sqlPoolName, schemaName, filter));
    }

    /**
     * Gets tables of a given schema in a SQL pool
     * 
     * Gets tables of a given schema in a SQL pool.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param sqlPoolName SQL pool name.
     * @param schemaName The name of the schema.
     * @param filter An OData filter expression that filters elements in the collection.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return tables of a given schema in a SQL pool as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<SqlPoolTableInner> listBySchema(String resourceGroupName, String workspaceName,
        String sqlPoolName, String schemaName, String filter, Context context) {
        return new PagedIterable<>(
            listBySchemaAsync(resourceGroupName, workspaceName, sqlPoolName, schemaName, filter, context));
    }

    /**
     * Get Sql pool table.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param sqlPoolName SQL pool name.
     * @param schemaName The name of the schema.
     * @param tableName The name of the table.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return sql pool table along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<SqlPoolTableInner>> getWithResponseAsync(String resourceGroupName, String workspaceName,
        String sqlPoolName, String schemaName, String tableName) {
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
        if (schemaName == null) {
            return Mono.error(new IllegalArgumentException("Parameter schemaName is required and cannot be null."));
        }
        if (tableName == null) {
            return Mono.error(new IllegalArgumentException("Parameter tableName is required and cannot be null."));
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(context -> service.get(this.client.getEndpoint(), this.client.getApiVersion(),
                this.client.getSubscriptionId(), resourceGroupName, workspaceName, sqlPoolName, schemaName, tableName,
                accept, context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Get Sql pool table.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param sqlPoolName SQL pool name.
     * @param schemaName The name of the schema.
     * @param tableName The name of the table.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return sql pool table along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<SqlPoolTableInner>> getWithResponseAsync(String resourceGroupName, String workspaceName,
        String sqlPoolName, String schemaName, String tableName, Context context) {
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
        if (schemaName == null) {
            return Mono.error(new IllegalArgumentException("Parameter schemaName is required and cannot be null."));
        }
        if (tableName == null) {
            return Mono.error(new IllegalArgumentException("Parameter tableName is required and cannot be null."));
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service.get(this.client.getEndpoint(), this.client.getApiVersion(), this.client.getSubscriptionId(),
            resourceGroupName, workspaceName, sqlPoolName, schemaName, tableName, accept, context);
    }

    /**
     * Get Sql pool table.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param sqlPoolName SQL pool name.
     * @param schemaName The name of the schema.
     * @param tableName The name of the table.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return sql pool table on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<SqlPoolTableInner> getAsync(String resourceGroupName, String workspaceName, String sqlPoolName,
        String schemaName, String tableName) {
        return getWithResponseAsync(resourceGroupName, workspaceName, sqlPoolName, schemaName, tableName)
            .flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Get Sql pool table.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param sqlPoolName SQL pool name.
     * @param schemaName The name of the schema.
     * @param tableName The name of the table.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return sql pool table along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<SqlPoolTableInner> getWithResponse(String resourceGroupName, String workspaceName,
        String sqlPoolName, String schemaName, String tableName, Context context) {
        return getWithResponseAsync(resourceGroupName, workspaceName, sqlPoolName, schemaName, tableName, context)
            .block();
    }

    /**
     * Get Sql pool table.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param sqlPoolName SQL pool name.
     * @param schemaName The name of the schema.
     * @param tableName The name of the table.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return sql pool table.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public SqlPoolTableInner get(String resourceGroupName, String workspaceName, String sqlPoolName, String schemaName,
        String tableName) {
        return getWithResponse(resourceGroupName, workspaceName, sqlPoolName, schemaName, tableName, Context.NONE)
            .getValue();
    }

    /**
     * Get the next page of items.
     * 
     * @param nextLink The URL to get the next list of items.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of Sql pool tables along with {@link PagedResponse} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<SqlPoolTableInner>> listBySchemaNextSinglePageAsync(String nextLink) {
        if (nextLink == null) {
            return Mono.error(new IllegalArgumentException("Parameter nextLink is required and cannot be null."));
        }
        if (this.client.getEndpoint() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(context -> service.listBySchemaNext(nextLink, this.client.getEndpoint(), accept, context))
            .<PagedResponse<SqlPoolTableInner>>map(res -> new PagedResponseBase<>(res.getRequest(), res.getStatusCode(),
                res.getHeaders(), res.getValue().value(), res.getValue().nextLink(), null))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Get the next page of items.
     * 
     * @param nextLink The URL to get the next list of items.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of Sql pool tables along with {@link PagedResponse} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<SqlPoolTableInner>> listBySchemaNextSinglePageAsync(String nextLink, Context context) {
        if (nextLink == null) {
            return Mono.error(new IllegalArgumentException("Parameter nextLink is required and cannot be null."));
        }
        if (this.client.getEndpoint() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service.listBySchemaNext(nextLink, this.client.getEndpoint(), accept, context)
            .map(res -> new PagedResponseBase<>(res.getRequest(), res.getStatusCode(), res.getHeaders(),
                res.getValue().value(), res.getValue().nextLink(), null));
    }
}
