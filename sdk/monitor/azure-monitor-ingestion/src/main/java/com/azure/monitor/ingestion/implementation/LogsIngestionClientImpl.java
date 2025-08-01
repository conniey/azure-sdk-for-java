// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.monitor.ingestion.implementation;

import com.azure.core.annotation.BodyParam;
import com.azure.core.annotation.ExpectedResponses;
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
import com.azure.core.http.HttpPipeline;
import com.azure.core.http.HttpPipelineBuilder;
import com.azure.core.http.policy.RetryPolicy;
import com.azure.core.http.policy.UserAgentPolicy;
import com.azure.core.http.rest.RequestOptions;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.util.BinaryData;
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import com.azure.core.util.serializer.JacksonAdapter;
import com.azure.core.util.serializer.SerializerAdapter;
import com.azure.monitor.ingestion.LogsIngestionServiceVersion;
import reactor.core.publisher.Mono;

/**
 * Initializes a new instance of the LogsIngestionClient type.
 */
public final class LogsIngestionClientImpl {
    /**
     * The proxy service used to perform REST calls.
     */
    private final LogsIngestionClientService service;

    /**
     * The Data Collection Endpoint for the Data Collection Rule. For example,
     * https://dce-name.eastus-2.ingest.monitor.azure.com.
     */
    private final String endpoint;

    /**
     * Gets The Data Collection Endpoint for the Data Collection Rule. For example,
     * https://dce-name.eastus-2.ingest.monitor.azure.com.
     * 
     * @return the endpoint value.
     */
    public String getEndpoint() {
        return this.endpoint;
    }

    /**
     * Service version.
     */
    private final LogsIngestionServiceVersion serviceVersion;

    /**
     * Gets Service version.
     * 
     * @return the serviceVersion value.
     */
    public LogsIngestionServiceVersion getServiceVersion() {
        return this.serviceVersion;
    }

    /**
     * The HTTP pipeline to send requests through.
     */
    private final HttpPipeline httpPipeline;

    /**
     * Gets The HTTP pipeline to send requests through.
     * 
     * @return the httpPipeline value.
     */
    public HttpPipeline getHttpPipeline() {
        return this.httpPipeline;
    }

    /**
     * The serializer to serialize an object into a string.
     */
    private final SerializerAdapter serializerAdapter;

    /**
     * Gets The serializer to serialize an object into a string.
     * 
     * @return the serializerAdapter value.
     */
    public SerializerAdapter getSerializerAdapter() {
        return this.serializerAdapter;
    }

    /**
     * Initializes an instance of LogsIngestionClient client.
     * 
     * @param endpoint The Data Collection Endpoint for the Data Collection Rule. For example,
     * https://dce-name.eastus-2.ingest.monitor.azure.com.
     * @param serviceVersion Service version.
     */
    LogsIngestionClientImpl(String endpoint, LogsIngestionServiceVersion serviceVersion) {
        this(new HttpPipelineBuilder().policies(new UserAgentPolicy(), new RetryPolicy()).build(),
            JacksonAdapter.createDefaultSerializerAdapter(), endpoint, serviceVersion);
    }

    /**
     * Initializes an instance of LogsIngestionClient client.
     * 
     * @param httpPipeline The HTTP pipeline to send requests through.
     * @param endpoint The Data Collection Endpoint for the Data Collection Rule. For example,
     * https://dce-name.eastus-2.ingest.monitor.azure.com.
     * @param serviceVersion Service version.
     */
    LogsIngestionClientImpl(HttpPipeline httpPipeline, String endpoint, LogsIngestionServiceVersion serviceVersion) {
        this(httpPipeline, JacksonAdapter.createDefaultSerializerAdapter(), endpoint, serviceVersion);
    }

    /**
     * Initializes an instance of LogsIngestionClient client.
     * 
     * @param httpPipeline The HTTP pipeline to send requests through.
     * @param serializerAdapter The serializer to serialize an object into a string.
     * @param endpoint The Data Collection Endpoint for the Data Collection Rule. For example,
     * https://dce-name.eastus-2.ingest.monitor.azure.com.
     * @param serviceVersion Service version.
     */
    LogsIngestionClientImpl(HttpPipeline httpPipeline, SerializerAdapter serializerAdapter, String endpoint,
        LogsIngestionServiceVersion serviceVersion) {
        this.httpPipeline = httpPipeline;
        this.serializerAdapter = serializerAdapter;
        this.endpoint = endpoint;
        this.serviceVersion = serviceVersion;
        this.service
            = RestProxy.create(LogsIngestionClientService.class, this.httpPipeline, this.getSerializerAdapter());
    }

    /**
     * The interface defining all the services for LogsIngestionClient to be used by the proxy service to perform REST
     * calls.
     */
    @Host("{endpoint}")
    @ServiceInterface(name = "LogsIngestionClient")
    public interface LogsIngestionClientService {
        @Post("/dataCollectionRules/{ruleId}/streams/{stream}")
        @ExpectedResponses({ 204 })
        @UnexpectedResponseExceptionType(value = ClientAuthenticationException.class, code = { 401 })
        @UnexpectedResponseExceptionType(value = ResourceNotFoundException.class, code = { 404 })
        @UnexpectedResponseExceptionType(value = ResourceModifiedException.class, code = { 409 })
        @UnexpectedResponseExceptionType(HttpResponseException.class)
        Mono<Response<Void>> upload(@HostParam("endpoint") String endpoint,
            @QueryParam("api-version") String apiVersion, @PathParam("ruleId") String ruleId,
            @PathParam("stream") String streamName, @HeaderParam("Content-Type") String contentType,
            @HeaderParam("Accept") String accept, @BodyParam("application/json") BinaryData body,
            RequestOptions requestOptions, Context context);

        @Post("/dataCollectionRules/{ruleId}/streams/{stream}")
        @ExpectedResponses({ 204 })
        @UnexpectedResponseExceptionType(value = ClientAuthenticationException.class, code = { 401 })
        @UnexpectedResponseExceptionType(value = ResourceNotFoundException.class, code = { 404 })
        @UnexpectedResponseExceptionType(value = ResourceModifiedException.class, code = { 409 })
        @UnexpectedResponseExceptionType(HttpResponseException.class)
        Response<Void> uploadSync(@HostParam("endpoint") String endpoint, @QueryParam("api-version") String apiVersion,
            @PathParam("ruleId") String ruleId, @PathParam("stream") String streamName,
            @HeaderParam("Content-Type") String contentType, @HeaderParam("Accept") String accept,
            @BodyParam("application/json") BinaryData body, RequestOptions requestOptions, Context context);
    }

    /**
     * Ingestion API used to directly ingest data using Data Collection Rules.
     * <p><strong>Header Parameters</strong></p>
     * <table border="1">
     * <caption>Header Parameters</caption>
     * <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     * <tr><td>Content-Encoding</td><td>String</td><td>No</td><td>The content encoding of the request body which is
     * always 'gzip'.</td></tr>
     * </table>
     * You can add these to a request with {@link RequestOptions#addHeader}
     * <p><strong>Request Body Schema</strong></p>
     * 
     * <pre>
     * {@code
     * [
     *      (Required){
     *         String: BinaryData (Required)
     *     }
     * ]
     * }
     * </pre>
     * 
     * @param ruleId The immutable ID of the Data Collection Rule resource.
     * @param streamName The streamDeclaration name as defined in the Data Collection Rule.
     * @param body The array of objects matching the schema defined by the provided stream.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> uploadWithResponseAsync(String ruleId, String streamName, BinaryData body,
        RequestOptions requestOptions) {
        final String contentType = "application/json";
        final String accept = "application/json";
        return FluxUtil.withContext(context -> service.upload(this.getEndpoint(), this.getServiceVersion().getVersion(),
            ruleId, streamName, contentType, accept, body, requestOptions, context));
    }

    /**
     * Ingestion API used to directly ingest data using Data Collection Rules.
     * <p><strong>Header Parameters</strong></p>
     * <table border="1">
     * <caption>Header Parameters</caption>
     * <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     * <tr><td>Content-Encoding</td><td>String</td><td>No</td><td>The content encoding of the request body which is
     * always 'gzip'.</td></tr>
     * </table>
     * You can add these to a request with {@link RequestOptions#addHeader}
     * <p><strong>Request Body Schema</strong></p>
     * 
     * <pre>
     * {@code
     * [
     *      (Required){
     *         String: BinaryData (Required)
     *     }
     * ]
     * }
     * </pre>
     * 
     * @param ruleId The immutable ID of the Data Collection Rule resource.
     * @param streamName The streamDeclaration name as defined in the Data Collection Rule.
     * @param body The array of objects matching the schema defined by the provided stream.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> uploadWithResponse(String ruleId, String streamName, BinaryData body,
        RequestOptions requestOptions) {
        final String contentType = "application/json";
        final String accept = "application/json";
        return service.uploadSync(this.getEndpoint(), this.getServiceVersion().getVersion(), ruleId, streamName,
            contentType, accept, body, requestOptions, Context.NONE);
    }
}
