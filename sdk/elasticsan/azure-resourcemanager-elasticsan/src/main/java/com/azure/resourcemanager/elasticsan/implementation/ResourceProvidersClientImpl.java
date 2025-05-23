// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.elasticsan.implementation;

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
import com.azure.resourcemanager.elasticsan.fluent.ResourceProvidersClient;
import com.azure.resourcemanager.elasticsan.fluent.models.VolumeInner;
import java.nio.ByteBuffer;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * An instance of this class provides access to all the operations defined in ResourceProvidersClient.
 */
public final class ResourceProvidersClientImpl implements ResourceProvidersClient {
    /**
     * The proxy service used to perform REST calls.
     */
    private final ResourceProvidersService service;

    /**
     * The service client containing this operation class.
     */
    private final ElasticSanManagementImpl client;

    /**
     * Initializes an instance of ResourceProvidersClientImpl.
     * 
     * @param client the instance of the service client containing this operation class.
     */
    ResourceProvidersClientImpl(ElasticSanManagementImpl client) {
        this.service
            = RestProxy.create(ResourceProvidersService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for ElasticSanManagementResourceProviders to be used by the proxy service
     * to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "ElasticSanManagement")
    public interface ResourceProvidersService {
        @Headers({ "Content-Type: application/json" })
        @Post("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.ElasticSan/elasticSans/{elasticSanName}/volumegroups/{volumeGroupName}/volumes/{volumeName}/restore")
        @ExpectedResponses({ 200, 202 })
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<Flux<ByteBuffer>>> restoreVolume(@HostParam("$host") String endpoint,
            @PathParam("subscriptionId") String subscriptionId,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("elasticSanName") String elasticSanName, @PathParam("volumeGroupName") String volumeGroupName,
            @PathParam("volumeName") String volumeName, @QueryParam("api-version") String apiVersion,
            @HeaderParam("Accept") String accept, Context context);
    }

    /**
     * Restore Soft Deleted Volumes. The volume name is obtained by using the API to list soft deleted volumes by volume
     * group.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param elasticSanName The name of the ElasticSan.
     * @param volumeGroupName The name of the VolumeGroup.
     * @param volumeName The name of the Volume.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response for Volume request along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<Flux<ByteBuffer>>> restoreVolumeWithResponseAsync(String resourceGroupName,
        String elasticSanName, String volumeGroupName, String volumeName) {
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
        if (elasticSanName == null) {
            return Mono.error(new IllegalArgumentException("Parameter elasticSanName is required and cannot be null."));
        }
        if (volumeGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter volumeGroupName is required and cannot be null."));
        }
        if (volumeName == null) {
            return Mono.error(new IllegalArgumentException("Parameter volumeName is required and cannot be null."));
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(context -> service.restoreVolume(this.client.getEndpoint(), this.client.getSubscriptionId(),
                resourceGroupName, elasticSanName, volumeGroupName, volumeName, this.client.getApiVersion(), accept,
                context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Restore Soft Deleted Volumes. The volume name is obtained by using the API to list soft deleted volumes by volume
     * group.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param elasticSanName The name of the ElasticSan.
     * @param volumeGroupName The name of the VolumeGroup.
     * @param volumeName The name of the Volume.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response for Volume request along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<Flux<ByteBuffer>>> restoreVolumeWithResponseAsync(String resourceGroupName,
        String elasticSanName, String volumeGroupName, String volumeName, Context context) {
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
        if (elasticSanName == null) {
            return Mono.error(new IllegalArgumentException("Parameter elasticSanName is required and cannot be null."));
        }
        if (volumeGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter volumeGroupName is required and cannot be null."));
        }
        if (volumeName == null) {
            return Mono.error(new IllegalArgumentException("Parameter volumeName is required and cannot be null."));
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service.restoreVolume(this.client.getEndpoint(), this.client.getSubscriptionId(), resourceGroupName,
            elasticSanName, volumeGroupName, volumeName, this.client.getApiVersion(), accept, context);
    }

    /**
     * Restore Soft Deleted Volumes. The volume name is obtained by using the API to list soft deleted volumes by volume
     * group.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param elasticSanName The name of the ElasticSan.
     * @param volumeGroupName The name of the VolumeGroup.
     * @param volumeName The name of the Volume.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link PollerFlux} for polling of response for Volume request.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    private PollerFlux<PollResult<VolumeInner>, VolumeInner> beginRestoreVolumeAsync(String resourceGroupName,
        String elasticSanName, String volumeGroupName, String volumeName) {
        Mono<Response<Flux<ByteBuffer>>> mono
            = restoreVolumeWithResponseAsync(resourceGroupName, elasticSanName, volumeGroupName, volumeName);
        return this.client.<VolumeInner, VolumeInner>getLroResult(mono, this.client.getHttpPipeline(),
            VolumeInner.class, VolumeInner.class, this.client.getContext());
    }

    /**
     * Restore Soft Deleted Volumes. The volume name is obtained by using the API to list soft deleted volumes by volume
     * group.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param elasticSanName The name of the ElasticSan.
     * @param volumeGroupName The name of the VolumeGroup.
     * @param volumeName The name of the Volume.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link PollerFlux} for polling of response for Volume request.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    private PollerFlux<PollResult<VolumeInner>, VolumeInner> beginRestoreVolumeAsync(String resourceGroupName,
        String elasticSanName, String volumeGroupName, String volumeName, Context context) {
        context = this.client.mergeContext(context);
        Mono<Response<Flux<ByteBuffer>>> mono
            = restoreVolumeWithResponseAsync(resourceGroupName, elasticSanName, volumeGroupName, volumeName, context);
        return this.client.<VolumeInner, VolumeInner>getLroResult(mono, this.client.getHttpPipeline(),
            VolumeInner.class, VolumeInner.class, context);
    }

    /**
     * Restore Soft Deleted Volumes. The volume name is obtained by using the API to list soft deleted volumes by volume
     * group.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param elasticSanName The name of the ElasticSan.
     * @param volumeGroupName The name of the VolumeGroup.
     * @param volumeName The name of the Volume.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of response for Volume request.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    public SyncPoller<PollResult<VolumeInner>, VolumeInner> beginRestoreVolume(String resourceGroupName,
        String elasticSanName, String volumeGroupName, String volumeName) {
        return this.beginRestoreVolumeAsync(resourceGroupName, elasticSanName, volumeGroupName, volumeName)
            .getSyncPoller();
    }

    /**
     * Restore Soft Deleted Volumes. The volume name is obtained by using the API to list soft deleted volumes by volume
     * group.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param elasticSanName The name of the ElasticSan.
     * @param volumeGroupName The name of the VolumeGroup.
     * @param volumeName The name of the Volume.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of response for Volume request.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    public SyncPoller<PollResult<VolumeInner>, VolumeInner> beginRestoreVolume(String resourceGroupName,
        String elasticSanName, String volumeGroupName, String volumeName, Context context) {
        return this.beginRestoreVolumeAsync(resourceGroupName, elasticSanName, volumeGroupName, volumeName, context)
            .getSyncPoller();
    }

    /**
     * Restore Soft Deleted Volumes. The volume name is obtained by using the API to list soft deleted volumes by volume
     * group.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param elasticSanName The name of the ElasticSan.
     * @param volumeGroupName The name of the VolumeGroup.
     * @param volumeName The name of the Volume.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response for Volume request on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<VolumeInner> restoreVolumeAsync(String resourceGroupName, String elasticSanName,
        String volumeGroupName, String volumeName) {
        return beginRestoreVolumeAsync(resourceGroupName, elasticSanName, volumeGroupName, volumeName).last()
            .flatMap(this.client::getLroFinalResultOrError);
    }

    /**
     * Restore Soft Deleted Volumes. The volume name is obtained by using the API to list soft deleted volumes by volume
     * group.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param elasticSanName The name of the ElasticSan.
     * @param volumeGroupName The name of the VolumeGroup.
     * @param volumeName The name of the Volume.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response for Volume request on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<VolumeInner> restoreVolumeAsync(String resourceGroupName, String elasticSanName,
        String volumeGroupName, String volumeName, Context context) {
        return beginRestoreVolumeAsync(resourceGroupName, elasticSanName, volumeGroupName, volumeName, context).last()
            .flatMap(this.client::getLroFinalResultOrError);
    }

    /**
     * Restore Soft Deleted Volumes. The volume name is obtained by using the API to list soft deleted volumes by volume
     * group.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param elasticSanName The name of the ElasticSan.
     * @param volumeGroupName The name of the VolumeGroup.
     * @param volumeName The name of the Volume.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response for Volume request.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public VolumeInner restoreVolume(String resourceGroupName, String elasticSanName, String volumeGroupName,
        String volumeName) {
        return restoreVolumeAsync(resourceGroupName, elasticSanName, volumeGroupName, volumeName).block();
    }

    /**
     * Restore Soft Deleted Volumes. The volume name is obtained by using the API to list soft deleted volumes by volume
     * group.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param elasticSanName The name of the ElasticSan.
     * @param volumeGroupName The name of the VolumeGroup.
     * @param volumeName The name of the Volume.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response for Volume request.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public VolumeInner restoreVolume(String resourceGroupName, String elasticSanName, String volumeGroupName,
        String volumeName, Context context) {
        return restoreVolumeAsync(resourceGroupName, elasticSanName, volumeGroupName, volumeName, context).block();
    }
}
