// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.purview.workflow.implementation;

import com.azure.analytics.purview.workflow.PurviewWorkflowServiceVersion;
import com.azure.core.annotation.BodyParam;
import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.Get;
import com.azure.core.annotation.HeaderParam;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.PathParam;
import com.azure.core.annotation.Post;
import com.azure.core.annotation.QueryParam;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceInterface;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.annotation.UnexpectedResponseExceptionType;
import com.azure.core.exception.ClientAuthenticationException;
import com.azure.core.exception.HttpResponseException;
import com.azure.core.exception.ResourceModifiedException;
import com.azure.core.exception.ResourceNotFoundException;
import com.azure.core.http.rest.RequestOptions;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.util.BinaryData;
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import reactor.core.publisher.Mono;

/**
 * An instance of this class provides access to all the operations defined in WorkflowRunsOperations.
 */
public final class WorkflowRunsOperationsImpl {
    /**
     * The proxy service used to perform REST calls.
     */
    private final WorkflowRunsService service;

    /**
     * The service client containing this operation class.
     */
    private final PurviewWorkflowClientImpl client;

    /**
     * Initializes an instance of WorkflowRunsOperationsImpl.
     * 
     * @param client the instance of the service client containing this operation class.
     */
    WorkflowRunsOperationsImpl(PurviewWorkflowClientImpl client) {
        this.service
            = RestProxy.create(WorkflowRunsService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * Gets Service version.
     * 
     * @return the serviceVersion value.
     */
    public PurviewWorkflowServiceVersion getServiceVersion() {
        return client.getServiceVersion();
    }

    /**
     * The interface defining all the services for PurviewWorkflowWorkflowRunsOperations to be used by the proxy service
     * to perform REST calls.
     */
    @Host("{endpoint}/workflow")
    @ServiceInterface(name = "PurviewWorkflowWorkflowRunsOperations")
    public interface WorkflowRunsService {
        @Get("/workflowruns/{workflowRunId}")
        @ExpectedResponses({ 200 })
        @UnexpectedResponseExceptionType(value = ClientAuthenticationException.class, code = { 401 })
        @UnexpectedResponseExceptionType(value = ResourceNotFoundException.class, code = { 404 })
        @UnexpectedResponseExceptionType(value = ResourceModifiedException.class, code = { 409 })
        @UnexpectedResponseExceptionType(HttpResponseException.class)
        Mono<Response<BinaryData>> get(@HostParam("endpoint") String endpoint,
            @QueryParam("api-version") String apiVersion, @PathParam("workflowRunId") String workflowRunId,
            @HeaderParam("Accept") String accept, RequestOptions requestOptions, Context context);

        @Get("/workflowruns/{workflowRunId}")
        @ExpectedResponses({ 200 })
        @UnexpectedResponseExceptionType(value = ClientAuthenticationException.class, code = { 401 })
        @UnexpectedResponseExceptionType(value = ResourceNotFoundException.class, code = { 404 })
        @UnexpectedResponseExceptionType(value = ResourceModifiedException.class, code = { 409 })
        @UnexpectedResponseExceptionType(HttpResponseException.class)
        Response<BinaryData> getSync(@HostParam("endpoint") String endpoint,
            @QueryParam("api-version") String apiVersion, @PathParam("workflowRunId") String workflowRunId,
            @HeaderParam("Accept") String accept, RequestOptions requestOptions, Context context);

        @Post("/workflowruns/{workflowRunId}/cancel")
        @ExpectedResponses({ 200 })
        @UnexpectedResponseExceptionType(value = ClientAuthenticationException.class, code = { 401 })
        @UnexpectedResponseExceptionType(value = ResourceNotFoundException.class, code = { 404 })
        @UnexpectedResponseExceptionType(value = ResourceModifiedException.class, code = { 409 })
        @UnexpectedResponseExceptionType(HttpResponseException.class)
        Mono<Response<Void>> cancel(@HostParam("endpoint") String endpoint,
            @QueryParam("api-version") String apiVersion, @PathParam("workflowRunId") String workflowRunId,
            @BodyParam("application/json") BinaryData runCancelReply, @HeaderParam("Accept") String accept,
            RequestOptions requestOptions, Context context);

        @Post("/workflowruns/{workflowRunId}/cancel")
        @ExpectedResponses({ 200 })
        @UnexpectedResponseExceptionType(value = ClientAuthenticationException.class, code = { 401 })
        @UnexpectedResponseExceptionType(value = ResourceNotFoundException.class, code = { 404 })
        @UnexpectedResponseExceptionType(value = ResourceModifiedException.class, code = { 409 })
        @UnexpectedResponseExceptionType(HttpResponseException.class)
        Response<Void> cancelSync(@HostParam("endpoint") String endpoint, @QueryParam("api-version") String apiVersion,
            @PathParam("workflowRunId") String workflowRunId, @BodyParam("application/json") BinaryData runCancelReply,
            @HeaderParam("Accept") String accept, RequestOptions requestOptions, Context context);
    }

    /**
     * Get a workflow run.
     * <p><strong>Response Body Schema</strong></p>
     * 
     * <pre>
     * {@code
     * {
     *     id: String (Optional)
     *     workflowId: String (Optional)
     *     startTime: OffsetDateTime (Optional)
     *     requestor: String (Optional)
     *     userRequestId: String (Optional)
     *     runPayload (Optional): {
     *         type: String(CreateTerm/UpdateTerm/DeleteTerm/ImportTerms/UpdateAsset/GrantDataAccess) (Required)
     *         targetValue: String (Required)
     *         payload: Object (Required)
     *     }
     *     status: String(NotStarted/InProgress/Failed/Completed/Canceling/CancellationFailed/Canceled) (Optional)
     *     endTime: OffsetDateTime (Optional)
     *     cancelTime: OffsetDateTime (Optional)
     *     cancelComment: String (Optional)
     *     actionDag: Object (Required)
     *     detail (Required): {
     *         runInput: Object (Required)
     *         actions: Object (Required)
     *     }
     * }
     * }
     * </pre>
     * 
     * @param workflowRunId The workflow run id.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return a workflow run along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BinaryData>> getWithResponseAsync(String workflowRunId, RequestOptions requestOptions) {
        final String accept = "application/json";
        return FluxUtil.withContext(context -> service.get(this.client.getEndpoint(),
            this.client.getServiceVersion().getVersion(), workflowRunId, accept, requestOptions, context));
    }

    /**
     * Get a workflow run.
     * <p><strong>Response Body Schema</strong></p>
     * 
     * <pre>
     * {@code
     * {
     *     id: String (Optional)
     *     workflowId: String (Optional)
     *     startTime: OffsetDateTime (Optional)
     *     requestor: String (Optional)
     *     userRequestId: String (Optional)
     *     runPayload (Optional): {
     *         type: String(CreateTerm/UpdateTerm/DeleteTerm/ImportTerms/UpdateAsset/GrantDataAccess) (Required)
     *         targetValue: String (Required)
     *         payload: Object (Required)
     *     }
     *     status: String(NotStarted/InProgress/Failed/Completed/Canceling/CancellationFailed/Canceled) (Optional)
     *     endTime: OffsetDateTime (Optional)
     *     cancelTime: OffsetDateTime (Optional)
     *     cancelComment: String (Optional)
     *     actionDag: Object (Required)
     *     detail (Required): {
     *         runInput: Object (Required)
     *         actions: Object (Required)
     *     }
     * }
     * }
     * </pre>
     * 
     * @param workflowRunId The workflow run id.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return a workflow run along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<BinaryData> getWithResponse(String workflowRunId, RequestOptions requestOptions) {
        final String accept = "application/json";
        return service.getSync(this.client.getEndpoint(), this.client.getServiceVersion().getVersion(), workflowRunId,
            accept, requestOptions, Context.NONE);
    }

    /**
     * Cancel a workflow run.
     * <p><strong>Request Body Schema</strong></p>
     * 
     * <pre>
     * {@code
     * {
     *     comment: String (Optional)
     * }
     * }
     * </pre>
     * 
     * @param workflowRunId The workflow run id.
     * @param runCancelReply Reply of canceling a workflow run.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> cancelWithResponseAsync(String workflowRunId, BinaryData runCancelReply,
        RequestOptions requestOptions) {
        final String accept = "application/json";
        return FluxUtil.withContext(
            context -> service.cancel(this.client.getEndpoint(), this.client.getServiceVersion().getVersion(),
                workflowRunId, runCancelReply, accept, requestOptions, context));
    }

    /**
     * Cancel a workflow run.
     * <p><strong>Request Body Schema</strong></p>
     * 
     * <pre>
     * {@code
     * {
     *     comment: String (Optional)
     * }
     * }
     * </pre>
     * 
     * @param workflowRunId The workflow run id.
     * @param runCancelReply Reply of canceling a workflow run.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> cancelWithResponse(String workflowRunId, BinaryData runCancelReply,
        RequestOptions requestOptions) {
        final String accept = "application/json";
        return service.cancelSync(this.client.getEndpoint(), this.client.getServiceVersion().getVersion(),
            workflowRunId, runCancelReply, accept, requestOptions, Context.NONE);
    }
}
