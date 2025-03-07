// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.postgresql.implementation;

import com.azure.core.annotation.BodyParam;
import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.HeaderParam;
import com.azure.core.annotation.Headers;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.PathParam;
import com.azure.core.annotation.Post;
import com.azure.core.annotation.QueryParam;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceInterface;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.annotation.UnexpectedResponseExceptionType;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.management.exception.ManagementException;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import com.azure.core.util.polling.PollerFlux;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.postgresql.fluent.ServerParametersClient;
import com.azure.resourcemanager.postgresql.fluent.models.ConfigurationListResultInner;
import java.nio.ByteBuffer;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * An instance of this class provides access to all the operations defined in ServerParametersClient.
 */
public final class ServerParametersClientImpl implements ServerParametersClient {
    /**
     * The proxy service used to perform REST calls.
     */
    private final ServerParametersService service;

    /**
     * The service client containing this operation class.
     */
    private final PostgreSqlManagementClientImpl client;

    /**
     * Initializes an instance of ServerParametersClientImpl.
     * 
     * @param client the instance of the service client containing this operation class.
     */
    ServerParametersClientImpl(PostgreSqlManagementClientImpl client) {
        this.service
            = RestProxy.create(ServerParametersService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for PostgreSqlManagementClientServerParameters to be used by the proxy
     * service to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "PostgreSqlManagement")
    public interface ServerParametersService {
        @Headers({ "Content-Type: application/json" })
        @Post("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.DBforPostgreSQL/servers/{serverName}/updateConfigurations")
        @ExpectedResponses({ 200, 202 })
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<Flux<ByteBuffer>>> listUpdateConfigurations(@HostParam("$host") String endpoint,
            @QueryParam("api-version") String apiVersion, @PathParam("subscriptionId") String subscriptionId,
            @PathParam("resourceGroupName") String resourceGroupName, @PathParam("serverName") String serverName,
            @BodyParam("application/json") ConfigurationListResultInner value, @HeaderParam("Accept") String accept,
            Context context);
    }

    /**
     * Update a list of configurations in a given server.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverName The name of the server.
     * @param value The parameters for updating a list of server configuration.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of server configurations along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Flux<ByteBuffer>>> listUpdateConfigurationsWithResponseAsync(String resourceGroupName,
        String serverName, ConfigurationListResultInner value) {
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
        if (serverName == null) {
            return Mono.error(new IllegalArgumentException("Parameter serverName is required and cannot be null."));
        }
        if (value == null) {
            return Mono.error(new IllegalArgumentException("Parameter value is required and cannot be null."));
        } else {
            value.validate();
        }
        final String apiVersion = "2017-12-01";
        final String accept = "application/json";
        return FluxUtil
            .withContext(context -> service.listUpdateConfigurations(this.client.getEndpoint(), apiVersion,
                this.client.getSubscriptionId(), resourceGroupName, serverName, value, accept, context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Update a list of configurations in a given server.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverName The name of the server.
     * @param value The parameters for updating a list of server configuration.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of server configurations along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<Flux<ByteBuffer>>> listUpdateConfigurationsWithResponseAsync(String resourceGroupName,
        String serverName, ConfigurationListResultInner value, Context context) {
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
        if (serverName == null) {
            return Mono.error(new IllegalArgumentException("Parameter serverName is required and cannot be null."));
        }
        if (value == null) {
            return Mono.error(new IllegalArgumentException("Parameter value is required and cannot be null."));
        } else {
            value.validate();
        }
        final String apiVersion = "2017-12-01";
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service.listUpdateConfigurations(this.client.getEndpoint(), apiVersion, this.client.getSubscriptionId(),
            resourceGroupName, serverName, value, accept, context);
    }

    /**
     * Update a list of configurations in a given server.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverName The name of the server.
     * @param value The parameters for updating a list of server configuration.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link PollerFlux} for polling of a list of server configurations.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    public PollerFlux<PollResult<ConfigurationListResultInner>, ConfigurationListResultInner>
        beginListUpdateConfigurationsAsync(String resourceGroupName, String serverName,
            ConfigurationListResultInner value) {
        Mono<Response<Flux<ByteBuffer>>> mono
            = listUpdateConfigurationsWithResponseAsync(resourceGroupName, serverName, value);
        return this.client.<ConfigurationListResultInner, ConfigurationListResultInner>getLroResult(mono,
            this.client.getHttpPipeline(), ConfigurationListResultInner.class, ConfigurationListResultInner.class,
            this.client.getContext());
    }

    /**
     * Update a list of configurations in a given server.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverName The name of the server.
     * @param value The parameters for updating a list of server configuration.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link PollerFlux} for polling of a list of server configurations.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    private PollerFlux<PollResult<ConfigurationListResultInner>, ConfigurationListResultInner>
        beginListUpdateConfigurationsAsync(String resourceGroupName, String serverName,
            ConfigurationListResultInner value, Context context) {
        context = this.client.mergeContext(context);
        Mono<Response<Flux<ByteBuffer>>> mono
            = listUpdateConfigurationsWithResponseAsync(resourceGroupName, serverName, value, context);
        return this.client.<ConfigurationListResultInner, ConfigurationListResultInner>getLroResult(mono,
            this.client.getHttpPipeline(), ConfigurationListResultInner.class, ConfigurationListResultInner.class,
            context);
    }

    /**
     * Update a list of configurations in a given server.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverName The name of the server.
     * @param value The parameters for updating a list of server configuration.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of a list of server configurations.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    public SyncPoller<PollResult<ConfigurationListResultInner>, ConfigurationListResultInner>
        beginListUpdateConfigurations(String resourceGroupName, String serverName, ConfigurationListResultInner value) {
        return this.beginListUpdateConfigurationsAsync(resourceGroupName, serverName, value).getSyncPoller();
    }

    /**
     * Update a list of configurations in a given server.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverName The name of the server.
     * @param value The parameters for updating a list of server configuration.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of a list of server configurations.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    public SyncPoller<PollResult<ConfigurationListResultInner>, ConfigurationListResultInner>
        beginListUpdateConfigurations(String resourceGroupName, String serverName, ConfigurationListResultInner value,
            Context context) {
        return this.beginListUpdateConfigurationsAsync(resourceGroupName, serverName, value, context).getSyncPoller();
    }

    /**
     * Update a list of configurations in a given server.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverName The name of the server.
     * @param value The parameters for updating a list of server configuration.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of server configurations on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<ConfigurationListResultInner> listUpdateConfigurationsAsync(String resourceGroupName, String serverName,
        ConfigurationListResultInner value) {
        return beginListUpdateConfigurationsAsync(resourceGroupName, serverName, value).last()
            .flatMap(this.client::getLroFinalResultOrError);
    }

    /**
     * Update a list of configurations in a given server.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverName The name of the server.
     * @param value The parameters for updating a list of server configuration.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of server configurations on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<ConfigurationListResultInner> listUpdateConfigurationsAsync(String resourceGroupName,
        String serverName, ConfigurationListResultInner value, Context context) {
        return beginListUpdateConfigurationsAsync(resourceGroupName, serverName, value, context).last()
            .flatMap(this.client::getLroFinalResultOrError);
    }

    /**
     * Update a list of configurations in a given server.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverName The name of the server.
     * @param value The parameters for updating a list of server configuration.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of server configurations.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ConfigurationListResultInner listUpdateConfigurations(String resourceGroupName, String serverName,
        ConfigurationListResultInner value) {
        return listUpdateConfigurationsAsync(resourceGroupName, serverName, value).block();
    }

    /**
     * Update a list of configurations in a given server.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverName The name of the server.
     * @param value The parameters for updating a list of server configuration.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of server configurations.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ConfigurationListResultInner listUpdateConfigurations(String resourceGroupName, String serverName,
        ConfigurationListResultInner value, Context context) {
        return listUpdateConfigurationsAsync(resourceGroupName, serverName, value, context).block();
    }
}
