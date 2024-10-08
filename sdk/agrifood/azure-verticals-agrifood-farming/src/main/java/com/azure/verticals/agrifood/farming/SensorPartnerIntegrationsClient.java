// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.verticals.agrifood.farming;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceClient;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.exception.ClientAuthenticationException;
import com.azure.core.exception.HttpResponseException;
import com.azure.core.exception.ResourceModifiedException;
import com.azure.core.exception.ResourceNotFoundException;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.RequestOptions;
import com.azure.core.http.rest.Response;
import com.azure.core.util.BinaryData;

/** Initializes a new instance of the synchronous FarmBeatsClient type. */
@ServiceClient(builder = SensorPartnerIntegrationsClientBuilder.class)
public final class SensorPartnerIntegrationsClient {
    @Generated
    private final SensorPartnerIntegrationsAsyncClient client;

    /**
     * Initializes an instance of SensorPartnerIntegrationsClient class.
     *
     * @param client the async client.
     */
    @Generated
    SensorPartnerIntegrationsClient(SensorPartnerIntegrationsAsyncClient client) {
        this.client = client;
    }

    /**
     * Gets partner integration models.
     *
     * <p><strong>Query Parameters</strong>
     *
     * <table border="1">
     *     <caption>Query Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>integrationIds</td><td>List&lt;String&gt;</td><td>No</td><td>Ids of the partner integration models. Call {@link RequestOptions#addQueryParam} to add string to array.</td></tr>
     *     <tr><td>partyIds</td><td>List&lt;String&gt;</td><td>No</td><td>Ids of the parties. Call {@link RequestOptions#addQueryParam} to add string to array.</td></tr>
     *     <tr><td>ids</td><td>List&lt;String&gt;</td><td>No</td><td>Ids of the resource. Call {@link RequestOptions#addQueryParam} to add string to array.</td></tr>
     *     <tr><td>names</td><td>List&lt;String&gt;</td><td>No</td><td>Names of the resource. Call {@link RequestOptions#addQueryParam} to add string to array.</td></tr>
     *     <tr><td>propertyFilters</td><td>List&lt;String&gt;</td><td>No</td><td>Filters on key-value pairs within the Properties object.
     * eg. "{testKey} eq {testValue}". Call {@link RequestOptions#addQueryParam} to add string to array.</td></tr>
     *     <tr><td>statuses</td><td>List&lt;String&gt;</td><td>No</td><td>Statuses of the resource. Call {@link RequestOptions#addQueryParam} to add string to array.</td></tr>
     *     <tr><td>minCreatedDateTime</td><td>OffsetDateTime</td><td>No</td><td>Minimum creation date of resource (inclusive).</td></tr>
     *     <tr><td>maxCreatedDateTime</td><td>OffsetDateTime</td><td>No</td><td>Maximum creation date of resource (inclusive).</td></tr>
     *     <tr><td>minLastModifiedDateTime</td><td>OffsetDateTime</td><td>No</td><td>Minimum last modified date of resource (inclusive).</td></tr>
     *     <tr><td>maxLastModifiedDateTime</td><td>OffsetDateTime</td><td>No</td><td>Maximum last modified date of resource (inclusive).</td></tr>
     *     <tr><td>maxPageSize</td><td>Integer</td><td>No</td><td>Maximum number of items needed (inclusive).
     * Minimum = 10, Maximum = 1000, Default value = 50.</td></tr>
     *     <tr><td>skipToken</td><td>String</td><td>No</td><td>Skip token for getting next set of results.</td></tr>
     * </table>
     *
     * You can add these to a request with {@link RequestOptions#addQueryParam}
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     integrationId: String (Optional)
     *     partyId: String (Optional)
     *     sensorPartnerId: String (Optional)
     *     id: String (Optional)
     *     status: String (Optional)
     *     createdDateTime: OffsetDateTime (Optional)
     *     modifiedDateTime: OffsetDateTime (Optional)
     *     eTag: String (Optional)
     *     name: String (Optional)
     *     description: String (Optional)
     *     createdBy: String (Optional)
     *     modifiedBy: String (Optional)
     *     properties (Optional): {
     *         String: Object (Optional)
     *     }
     * }
     * }</pre>
     *
     * @param sensorPartnerId Id of the associated sensor partner.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return partner integration models as paginated response with {@link PagedIterable}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<BinaryData> list(String sensorPartnerId, RequestOptions requestOptions) {
        return new PagedIterable<>(this.client.list(sensorPartnerId, requestOptions));
    }

    /**
     * Create or update an integration with a sensor partner.
     *
     * <p><strong>Request Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     integrationId: String (Optional)
     *     partyId: String (Optional)
     *     sensorPartnerId: String (Optional)
     *     id: String (Optional)
     *     status: String (Optional)
     *     createdDateTime: OffsetDateTime (Optional)
     *     modifiedDateTime: OffsetDateTime (Optional)
     *     eTag: String (Optional)
     *     name: String (Optional)
     *     description: String (Optional)
     *     createdBy: String (Optional)
     *     modifiedBy: String (Optional)
     *     properties (Optional): {
     *         String: Object (Optional)
     *     }
     * }
     * }</pre>
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     integrationId: String (Optional)
     *     partyId: String (Optional)
     *     sensorPartnerId: String (Optional)
     *     id: String (Optional)
     *     status: String (Optional)
     *     createdDateTime: OffsetDateTime (Optional)
     *     modifiedDateTime: OffsetDateTime (Optional)
     *     eTag: String (Optional)
     *     name: String (Optional)
     *     description: String (Optional)
     *     createdBy: String (Optional)
     *     modifiedBy: String (Optional)
     *     properties (Optional): {
     *         String: Object (Optional)
     *     }
     * }
     * }</pre>
     *
     * @param sensorPartnerId Id of the sensor partner.
     * @param integrationId Id of the integration to be created.
     * @param sensorPartnerIntegrationModel Partner integration model.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return sensor partner integration model along with {@link Response}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<BinaryData> createOrUpdateWithResponse(String sensorPartnerId, String integrationId,
        BinaryData sensorPartnerIntegrationModel, RequestOptions requestOptions) {
        return this.client
            .createOrUpdateWithResponse(sensorPartnerId, integrationId, sensorPartnerIntegrationModel, requestOptions)
            .block();
    }

    /**
     * Gets a partner integration model entity.
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     integrationId: String (Optional)
     *     partyId: String (Optional)
     *     sensorPartnerId: String (Optional)
     *     id: String (Optional)
     *     status: String (Optional)
     *     createdDateTime: OffsetDateTime (Optional)
     *     modifiedDateTime: OffsetDateTime (Optional)
     *     eTag: String (Optional)
     *     name: String (Optional)
     *     description: String (Optional)
     *     createdBy: String (Optional)
     *     modifiedBy: String (Optional)
     *     properties (Optional): {
     *         String: Object (Optional)
     *     }
     * }
     * }</pre>
     *
     * @param sensorPartnerId Id of the sensor partner.
     * @param integrationId Id of the integration object.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return a partner integration model entity along with {@link Response}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<BinaryData> getWithResponse(String sensorPartnerId, String integrationId,
        RequestOptions requestOptions) {
        return this.client.getWithResponse(sensorPartnerId, integrationId, requestOptions).block();
    }

    /**
     * Deletes a partner integration model entity.
     *
     * @param sensorPartnerId Id of the sensor partner.
     * @param integrationId Id of the integration to be deleted.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the {@link Response}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> deleteWithResponse(String sensorPartnerId, String integrationId,
        RequestOptions requestOptions) {
        return this.client.deleteWithResponse(sensorPartnerId, integrationId, requestOptions).block();
    }

    /**
     * Checks consent for partner integration.
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     consented: Boolean (Optional)
     *     sensorPartnerId: String (Optional)
     *     integrationId: String (Optional)
     * }
     * }</pre>
     *
     * @param sensorPartnerId Id of the sensor partner.
     * @param integrationId Id of the integration object.
     * @param key Partner integration key.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return sensor partner integration check consent response along with {@link Response}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<BinaryData> checkConsentWithResponse(String sensorPartnerId, String integrationId, String key,
        RequestOptions requestOptions) {
        return this.client.checkConsentWithResponse(sensorPartnerId, integrationId, key, requestOptions).block();
    }

    /**
     * Generates partner integration consent link.
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     consentLink: String (Optional)
     *     consentExpiryDateTime: OffsetDateTime (Optional)
     * }
     * }</pre>
     *
     * @param sensorPartnerId Id of the sensor partner.
     * @param integrationId Id of the integration object.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return sensor partner integration generate consent link response along with {@link Response}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<BinaryData> generateConsentLinkWithResponse(String sensorPartnerId, String integrationId,
        RequestOptions requestOptions) {
        return this.client.generateConsentLinkWithResponse(sensorPartnerId, integrationId, requestOptions).block();
    }
}
