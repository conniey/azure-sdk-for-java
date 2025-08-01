// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.implementation;

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
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import com.azure.resourcemanager.compute.fluent.SharedGalleryImageVersionsClient;
import com.azure.resourcemanager.compute.fluent.models.SharedGalleryImageVersionInner;
import com.azure.resourcemanager.compute.models.ApiErrorException;
import com.azure.resourcemanager.compute.models.SharedGalleryImageVersionList;
import com.azure.resourcemanager.compute.models.SharedToValues;
import reactor.core.publisher.Mono;

/**
 * An instance of this class provides access to all the operations defined in SharedGalleryImageVersionsClient.
 */
public final class SharedGalleryImageVersionsClientImpl implements SharedGalleryImageVersionsClient {
    /**
     * The proxy service used to perform REST calls.
     */
    private final SharedGalleryImageVersionsService service;

    /**
     * The service client containing this operation class.
     */
    private final ComputeManagementClientImpl client;

    /**
     * Initializes an instance of SharedGalleryImageVersionsClientImpl.
     * 
     * @param client the instance of the service client containing this operation class.
     */
    SharedGalleryImageVersionsClientImpl(ComputeManagementClientImpl client) {
        this.service = RestProxy.create(SharedGalleryImageVersionsService.class, client.getHttpPipeline(),
            client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for ComputeManagementClientSharedGalleryImageVersions to be used by the
     * proxy service to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "ComputeManagementClientSharedGalleryImageVersions")
    public interface SharedGalleryImageVersionsService {
        @Headers({ "Content-Type: application/json" })
        @Get("/subscriptions/{subscriptionId}/providers/Microsoft.Compute/locations/{location}/sharedGalleries/{galleryUniqueName}/images/{galleryImageName}/versions")
        @ExpectedResponses({ 200 })
        @UnexpectedResponseExceptionType(ApiErrorException.class)
        Mono<Response<SharedGalleryImageVersionList>> list(@HostParam("$host") String endpoint,
            @QueryParam("api-version") String apiVersion, @PathParam("subscriptionId") String subscriptionId,
            @PathParam("location") String location, @PathParam("galleryUniqueName") String galleryUniqueName,
            @PathParam("galleryImageName") String galleryImageName, @QueryParam("sharedTo") SharedToValues sharedTo,
            @HeaderParam("Accept") String accept, Context context);

        @Headers({ "Content-Type: application/json" })
        @Get("/subscriptions/{subscriptionId}/providers/Microsoft.Compute/locations/{location}/sharedGalleries/{galleryUniqueName}/images/{galleryImageName}/versions/{galleryImageVersionName}")
        @ExpectedResponses({ 200 })
        @UnexpectedResponseExceptionType(ApiErrorException.class)
        Mono<Response<SharedGalleryImageVersionInner>> get(@HostParam("$host") String endpoint,
            @QueryParam("api-version") String apiVersion, @PathParam("subscriptionId") String subscriptionId,
            @PathParam("location") String location, @PathParam("galleryUniqueName") String galleryUniqueName,
            @PathParam("galleryImageName") String galleryImageName,
            @PathParam("galleryImageVersionName") String galleryImageVersionName, @HeaderParam("Accept") String accept,
            Context context);

        @Headers({ "Content-Type: application/json" })
        @Get("{nextLink}")
        @ExpectedResponses({ 200 })
        @UnexpectedResponseExceptionType(ApiErrorException.class)
        Mono<Response<SharedGalleryImageVersionList>> listNext(
            @PathParam(value = "nextLink", encoded = true) String nextLink, @HostParam("$host") String endpoint,
            @HeaderParam("Accept") String accept, Context context);
    }

    /**
     * List shared gallery image versions by subscription id or tenant id.
     * 
     * @param location The name of Azure region.
     * @param galleryUniqueName The unique name of the Shared Gallery.
     * @param galleryImageName The name of the Shared Gallery Image Definition from which the Image Versions are to be
     * listed.
     * @param sharedTo The query parameter to decide what shared galleries to fetch when doing listing operations.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ApiErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the List Shared Gallery Image versions operation response along with {@link PagedResponse} on successful
     * completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<SharedGalleryImageVersionInner>> listSinglePageAsync(String location,
        String galleryUniqueName, String galleryImageName, SharedToValues sharedTo) {
        if (this.client.getEndpoint() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono.error(new IllegalArgumentException(
                "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (location == null) {
            return Mono.error(new IllegalArgumentException("Parameter location is required and cannot be null."));
        }
        if (galleryUniqueName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter galleryUniqueName is required and cannot be null."));
        }
        if (galleryImageName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter galleryImageName is required and cannot be null."));
        }
        final String apiVersion = "2024-03-03";
        final String accept = "application/json";
        return FluxUtil
            .withContext(context -> service.list(this.client.getEndpoint(), apiVersion, this.client.getSubscriptionId(),
                location, galleryUniqueName, galleryImageName, sharedTo, accept, context))
            .<PagedResponse<SharedGalleryImageVersionInner>>map(res -> new PagedResponseBase<>(res.getRequest(),
                res.getStatusCode(), res.getHeaders(), res.getValue().value(), res.getValue().nextLink(), null))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * List shared gallery image versions by subscription id or tenant id.
     * 
     * @param location The name of Azure region.
     * @param galleryUniqueName The unique name of the Shared Gallery.
     * @param galleryImageName The name of the Shared Gallery Image Definition from which the Image Versions are to be
     * listed.
     * @param sharedTo The query parameter to decide what shared galleries to fetch when doing listing operations.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ApiErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the List Shared Gallery Image versions operation response along with {@link PagedResponse} on successful
     * completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<SharedGalleryImageVersionInner>> listSinglePageAsync(String location,
        String galleryUniqueName, String galleryImageName, SharedToValues sharedTo, Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono.error(new IllegalArgumentException(
                "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (location == null) {
            return Mono.error(new IllegalArgumentException("Parameter location is required and cannot be null."));
        }
        if (galleryUniqueName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter galleryUniqueName is required and cannot be null."));
        }
        if (galleryImageName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter galleryImageName is required and cannot be null."));
        }
        final String apiVersion = "2024-03-03";
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .list(this.client.getEndpoint(), apiVersion, this.client.getSubscriptionId(), location, galleryUniqueName,
                galleryImageName, sharedTo, accept, context)
            .map(res -> new PagedResponseBase<>(res.getRequest(), res.getStatusCode(), res.getHeaders(),
                res.getValue().value(), res.getValue().nextLink(), null));
    }

    /**
     * List shared gallery image versions by subscription id or tenant id.
     * 
     * @param location The name of Azure region.
     * @param galleryUniqueName The unique name of the Shared Gallery.
     * @param galleryImageName The name of the Shared Gallery Image Definition from which the Image Versions are to be
     * listed.
     * @param sharedTo The query parameter to decide what shared galleries to fetch when doing listing operations.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ApiErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the List Shared Gallery Image versions operation response as paginated response with {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<SharedGalleryImageVersionInner> listAsync(String location, String galleryUniqueName,
        String galleryImageName, SharedToValues sharedTo) {
        return new PagedFlux<>(() -> listSinglePageAsync(location, galleryUniqueName, galleryImageName, sharedTo),
            nextLink -> listNextSinglePageAsync(nextLink));
    }

    /**
     * List shared gallery image versions by subscription id or tenant id.
     * 
     * @param location The name of Azure region.
     * @param galleryUniqueName The unique name of the Shared Gallery.
     * @param galleryImageName The name of the Shared Gallery Image Definition from which the Image Versions are to be
     * listed.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ApiErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the List Shared Gallery Image versions operation response as paginated response with {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<SharedGalleryImageVersionInner> listAsync(String location, String galleryUniqueName,
        String galleryImageName) {
        final SharedToValues sharedTo = null;
        return new PagedFlux<>(() -> listSinglePageAsync(location, galleryUniqueName, galleryImageName, sharedTo),
            nextLink -> listNextSinglePageAsync(nextLink));
    }

    /**
     * List shared gallery image versions by subscription id or tenant id.
     * 
     * @param location The name of Azure region.
     * @param galleryUniqueName The unique name of the Shared Gallery.
     * @param galleryImageName The name of the Shared Gallery Image Definition from which the Image Versions are to be
     * listed.
     * @param sharedTo The query parameter to decide what shared galleries to fetch when doing listing operations.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ApiErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the List Shared Gallery Image versions operation response as paginated response with {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    private PagedFlux<SharedGalleryImageVersionInner> listAsync(String location, String galleryUniqueName,
        String galleryImageName, SharedToValues sharedTo, Context context) {
        return new PagedFlux<>(
            () -> listSinglePageAsync(location, galleryUniqueName, galleryImageName, sharedTo, context),
            nextLink -> listNextSinglePageAsync(nextLink, context));
    }

    /**
     * List shared gallery image versions by subscription id or tenant id.
     * 
     * @param location The name of Azure region.
     * @param galleryUniqueName The unique name of the Shared Gallery.
     * @param galleryImageName The name of the Shared Gallery Image Definition from which the Image Versions are to be
     * listed.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ApiErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the List Shared Gallery Image versions operation response as paginated response with
     * {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<SharedGalleryImageVersionInner> list(String location, String galleryUniqueName,
        String galleryImageName) {
        final SharedToValues sharedTo = null;
        return new PagedIterable<>(listAsync(location, galleryUniqueName, galleryImageName, sharedTo));
    }

    /**
     * List shared gallery image versions by subscription id or tenant id.
     * 
     * @param location The name of Azure region.
     * @param galleryUniqueName The unique name of the Shared Gallery.
     * @param galleryImageName The name of the Shared Gallery Image Definition from which the Image Versions are to be
     * listed.
     * @param sharedTo The query parameter to decide what shared galleries to fetch when doing listing operations.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ApiErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the List Shared Gallery Image versions operation response as paginated response with
     * {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<SharedGalleryImageVersionInner> list(String location, String galleryUniqueName,
        String galleryImageName, SharedToValues sharedTo, Context context) {
        return new PagedIterable<>(listAsync(location, galleryUniqueName, galleryImageName, sharedTo, context));
    }

    /**
     * Get a shared gallery image version by subscription id or tenant id.
     * 
     * @param location The name of Azure region.
     * @param galleryUniqueName The unique name of the Shared Gallery.
     * @param galleryImageName The name of the Shared Gallery Image Definition from which the Image Versions are to be
     * listed.
     * @param galleryImageVersionName The name of the gallery image version to be created. Needs to follow semantic
     * version name pattern: The allowed characters are digit and period. Digits must be within the range of a 32-bit
     * integer. Format: &lt;MajorVersion&gt;.&lt;MinorVersion&gt;.&lt;Patch&gt;.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ApiErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a shared gallery image version by subscription id or tenant id along with {@link Response} on successful
     * completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<SharedGalleryImageVersionInner>> getWithResponseAsync(String location,
        String galleryUniqueName, String galleryImageName, String galleryImageVersionName) {
        if (this.client.getEndpoint() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono.error(new IllegalArgumentException(
                "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (location == null) {
            return Mono.error(new IllegalArgumentException("Parameter location is required and cannot be null."));
        }
        if (galleryUniqueName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter galleryUniqueName is required and cannot be null."));
        }
        if (galleryImageName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter galleryImageName is required and cannot be null."));
        }
        if (galleryImageVersionName == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter galleryImageVersionName is required and cannot be null."));
        }
        final String apiVersion = "2024-03-03";
        final String accept = "application/json";
        return FluxUtil
            .withContext(context -> service.get(this.client.getEndpoint(), apiVersion, this.client.getSubscriptionId(),
                location, galleryUniqueName, galleryImageName, galleryImageVersionName, accept, context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Get a shared gallery image version by subscription id or tenant id.
     * 
     * @param location The name of Azure region.
     * @param galleryUniqueName The unique name of the Shared Gallery.
     * @param galleryImageName The name of the Shared Gallery Image Definition from which the Image Versions are to be
     * listed.
     * @param galleryImageVersionName The name of the gallery image version to be created. Needs to follow semantic
     * version name pattern: The allowed characters are digit and period. Digits must be within the range of a 32-bit
     * integer. Format: &lt;MajorVersion&gt;.&lt;MinorVersion&gt;.&lt;Patch&gt;.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ApiErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a shared gallery image version by subscription id or tenant id along with {@link Response} on successful
     * completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<SharedGalleryImageVersionInner>> getWithResponseAsync(String location,
        String galleryUniqueName, String galleryImageName, String galleryImageVersionName, Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono.error(new IllegalArgumentException(
                "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (location == null) {
            return Mono.error(new IllegalArgumentException("Parameter location is required and cannot be null."));
        }
        if (galleryUniqueName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter galleryUniqueName is required and cannot be null."));
        }
        if (galleryImageName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter galleryImageName is required and cannot be null."));
        }
        if (galleryImageVersionName == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter galleryImageVersionName is required and cannot be null."));
        }
        final String apiVersion = "2024-03-03";
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service.get(this.client.getEndpoint(), apiVersion, this.client.getSubscriptionId(), location,
            galleryUniqueName, galleryImageName, galleryImageVersionName, accept, context);
    }

    /**
     * Get a shared gallery image version by subscription id or tenant id.
     * 
     * @param location The name of Azure region.
     * @param galleryUniqueName The unique name of the Shared Gallery.
     * @param galleryImageName The name of the Shared Gallery Image Definition from which the Image Versions are to be
     * listed.
     * @param galleryImageVersionName The name of the gallery image version to be created. Needs to follow semantic
     * version name pattern: The allowed characters are digit and period. Digits must be within the range of a 32-bit
     * integer. Format: &lt;MajorVersion&gt;.&lt;MinorVersion&gt;.&lt;Patch&gt;.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ApiErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a shared gallery image version by subscription id or tenant id on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SharedGalleryImageVersionInner> getAsync(String location, String galleryUniqueName,
        String galleryImageName, String galleryImageVersionName) {
        return getWithResponseAsync(location, galleryUniqueName, galleryImageName, galleryImageVersionName)
            .flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Get a shared gallery image version by subscription id or tenant id.
     * 
     * @param location The name of Azure region.
     * @param galleryUniqueName The unique name of the Shared Gallery.
     * @param galleryImageName The name of the Shared Gallery Image Definition from which the Image Versions are to be
     * listed.
     * @param galleryImageVersionName The name of the gallery image version to be created. Needs to follow semantic
     * version name pattern: The allowed characters are digit and period. Digits must be within the range of a 32-bit
     * integer. Format: &lt;MajorVersion&gt;.&lt;MinorVersion&gt;.&lt;Patch&gt;.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ApiErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a shared gallery image version by subscription id or tenant id along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<SharedGalleryImageVersionInner> getWithResponse(String location, String galleryUniqueName,
        String galleryImageName, String galleryImageVersionName, Context context) {
        return getWithResponseAsync(location, galleryUniqueName, galleryImageName, galleryImageVersionName, context)
            .block();
    }

    /**
     * Get a shared gallery image version by subscription id or tenant id.
     * 
     * @param location The name of Azure region.
     * @param galleryUniqueName The unique name of the Shared Gallery.
     * @param galleryImageName The name of the Shared Gallery Image Definition from which the Image Versions are to be
     * listed.
     * @param galleryImageVersionName The name of the gallery image version to be created. Needs to follow semantic
     * version name pattern: The allowed characters are digit and period. Digits must be within the range of a 32-bit
     * integer. Format: &lt;MajorVersion&gt;.&lt;MinorVersion&gt;.&lt;Patch&gt;.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ApiErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a shared gallery image version by subscription id or tenant id.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public SharedGalleryImageVersionInner get(String location, String galleryUniqueName, String galleryImageName,
        String galleryImageVersionName) {
        return getWithResponse(location, galleryUniqueName, galleryImageName, galleryImageVersionName, Context.NONE)
            .getValue();
    }

    /**
     * Get the next page of items.
     * 
     * @param nextLink The URL to get the next list of items.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ApiErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the List Shared Gallery Image versions operation response along with {@link PagedResponse} on successful
     * completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<SharedGalleryImageVersionInner>> listNextSinglePageAsync(String nextLink) {
        if (nextLink == null) {
            return Mono.error(new IllegalArgumentException("Parameter nextLink is required and cannot be null."));
        }
        if (this.client.getEndpoint() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        final String accept = "application/json";
        return FluxUtil.withContext(context -> service.listNext(nextLink, this.client.getEndpoint(), accept, context))
            .<PagedResponse<SharedGalleryImageVersionInner>>map(res -> new PagedResponseBase<>(res.getRequest(),
                res.getStatusCode(), res.getHeaders(), res.getValue().value(), res.getValue().nextLink(), null))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Get the next page of items.
     * 
     * @param nextLink The URL to get the next list of items.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ApiErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the List Shared Gallery Image versions operation response along with {@link PagedResponse} on successful
     * completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<SharedGalleryImageVersionInner>> listNextSinglePageAsync(String nextLink,
        Context context) {
        if (nextLink == null) {
            return Mono.error(new IllegalArgumentException("Parameter nextLink is required and cannot be null."));
        }
        if (this.client.getEndpoint() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service.listNext(nextLink, this.client.getEndpoint(), accept, context)
            .map(res -> new PagedResponseBase<>(res.getRequest(), res.getStatusCode(), res.getHeaders(),
                res.getValue().value(), res.getValue().nextLink(), null));
    }
}
