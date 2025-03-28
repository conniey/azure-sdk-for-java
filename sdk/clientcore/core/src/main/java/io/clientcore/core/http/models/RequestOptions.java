// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package io.clientcore.core.http.models;

import io.clientcore.core.annotations.Metadata;
import io.clientcore.core.annotations.MetadataProperties;
import io.clientcore.core.http.annotations.QueryParam;
import io.clientcore.core.http.client.HttpClient;
import io.clientcore.core.implementation.utils.UriEscapers;
import io.clientcore.core.instrumentation.InstrumentationContext;
import io.clientcore.core.instrumentation.logging.ClientLogger;
import io.clientcore.core.models.binarydata.BinaryData;
import io.clientcore.core.utils.Context;
import io.clientcore.core.utils.ProgressReporter;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * This class contains the options to customize an {@link HttpRequest}. {@link RequestOptions} can be used to configure
 * the request headers, query params, the request body, or add a callback to modify all aspects of the
 * {@link HttpRequest}.
 *
 * <p>An instance of fully configured {@link RequestOptions} can be passed to a service method that preconfigures known
 * components of the request like URI, path params etc, further modifying both un-configured, or preconfigured
 * components.</p>
 *
 * <p>To demonstrate how this class can be used to construct a request, let's use a Pet Store service as an example.
 * The
 * list of APIs available on this service are <a href="https://petstore.swagger.io/#/pet">documented in the swagger
 * definition.</a></p>
 *
 * <p><strong>Creating an instance of RequestOptions</strong></p>
 * <!-- src_embed io.clientcore.core.http.rest.requestoptions.instantiation -->
 * <pre>
 * RequestOptions options = new RequestOptions&#40;&#41;
 *     .setBody&#40;BinaryData.fromString&#40;&quot;&#123;&#92;&quot;name&#92;&quot;:&#92;&quot;Fluffy&#92;&quot;&#125;&quot;&#41;&#41;
 *     .addHeader&#40;new HttpHeader&#40;HttpHeaderName.fromString&#40;&quot;x-ms-pet-version&quot;&#41;, &quot;2021-06-01&quot;&#41;&#41;;
 * </pre>
 * <!-- end io.clientcore.core.http.rest.requestoptions.instantiation -->
 *
 * <p><strong>Configuring the request with JSON body and making a HTTP POST request</strong></p>
 *
 * To <a href="https://petstore.swagger.io/#/pet/addPet">add a new pet to the pet store</a>, an HTTP POST call should be
 * made to the service with the details of the pet that is to be added. The details of the pet are included as the
 * request body in JSON format.
 *
 * The JSON structure for the request is defined as follows:
 *
 * <pre>{@code
 * {
 *   "id": 0,
 *   "category": {
 *     "id": 0,
 *     "name": "string"
 *   },
 *   "name": "doggie",
 *   "photoUris": [
 *     "string"
 *   ],
 *   "tags": [
 *     {
 *       "id": 0,
 *       "name": "string"
 *     }
 *   ],
 *   "status": "available"
 * }
 * }</pre>
 *
 * To create a concrete request, Json builder provided in javax package is used here for demonstration. However, any
 * other JSON building library can be used to achieve similar results.
 *
 * <!-- src_embed io.clientcore.core.http.rest.requestoptions.createjsonrequest -->
 * <pre>
 * JsonArray photoUris = new JsonArray&#40;&#41;
 *     .addElement&#40;&quot;https:&#47;&#47;imgur.com&#47;pet1&quot;&#41;
 *     .addElement&#40;&quot;https:&#47;&#47;imgur.com&#47;pet2&quot;&#41;;
 *
 * JsonArray tags = new JsonArray&#40;&#41;
 *     .addElement&#40;new JsonObject&#40;&#41;
 *         .setProperty&#40;&quot;id&quot;, 0&#41;
 *         .setProperty&#40;&quot;name&quot;, &quot;Labrador&quot;&#41;&#41;
 *     .addElement&#40;new JsonObject&#40;&#41;
 *         .setProperty&#40;&quot;id&quot;, 1&#41;
 *         .setProperty&#40;&quot;name&quot;, &quot;2021&quot;&#41;&#41;;
 *
 * JsonObject requestBody = new JsonObject&#40;&#41;
 *     .setProperty&#40;&quot;id&quot;, 0&#41;
 *     .setProperty&#40;&quot;name&quot;, &quot;foo&quot;&#41;
 *     .setProperty&#40;&quot;status&quot;, &quot;available&quot;&#41;
 *     .setProperty&#40;&quot;category&quot;, new JsonObject&#40;&#41;.setProperty&#40;&quot;id&quot;, 0&#41;.setProperty&#40;&quot;name&quot;, &quot;dog&quot;&#41;&#41;
 *     .setProperty&#40;&quot;photoUris&quot;, photoUris&#41;
 *     .setProperty&#40;&quot;tags&quot;, tags&#41;;
 *
 * BinaryData requestBodyData = BinaryData.fromObject&#40;requestBody&#41;;
 * </pre>
 * <!-- end io.clientcore.core.http.rest.requestoptions.createjsonrequest -->
 *
 * Now, this string representation of the JSON request can be set as body of {@link RequestOptions}.
 *
 * <!-- src_embed io.clientcore.core.http.rest.requestoptions.postrequest -->
 * <pre>
 * RequestOptions options = new RequestOptions&#40;&#41;
 *     .addRequestCallback&#40;request -&gt; request
 *         &#47;&#47; may already be set if request is created from a client
 *         .setUri&#40;&quot;https:&#47;&#47;petstore.example.com&#47;pet&quot;&#41;
 *         .setMethod&#40;HttpMethod.POST&#41;
 *         .setBody&#40;requestBodyData&#41;
 *         .getHeaders&#40;&#41;.set&#40;HttpHeaderName.CONTENT_TYPE, &quot;application&#47;json&quot;&#41;&#41;;
 * </pre>
 * <!-- end io.clientcore.core.http.rest.requestoptions.postrequest -->
 */
@Metadata(properties = MetadataProperties.FLUENT)
public final class RequestOptions {
    // RequestOptions is a highly used, short-lived class, use a static logger.
    private static final ClientLogger LOGGER = new ClientLogger(RequestOptions.class);
    private static final RequestOptions NONE = new RequestOptions().lock();

    private Consumer<HttpRequest> requestCallback = request -> {
    };
    private Context context;
    private boolean locked;
    private ClientLogger logger;
    private InstrumentationContext instrumentationContext;
    private ProgressReporter progressReporter;

    /**
     * Creates a new instance of {@link RequestOptions}.
     */
    public RequestOptions() {
        this.context = Context.none();
    }

    /**
     * Gets the request callback, applying all the configurations set on this instance of {@link RequestOptions}.
     *
     * @return The request callback.
     */
    public Consumer<HttpRequest> getRequestCallback() {
        return this.requestCallback;
    }

    /**
     * Gets the additional context on the request that is passed during the service call.
     *
     * @return The additional context that is passed during the service call.
     */
    public Context getContext() {
        return context;
    }

    /**
     * Gets the {@link ClientLogger} used to log the request and response.
     *
     * @return The {@link ClientLogger} used to log the request and response.
     */
    public ClientLogger getLogger() {
        return logger;
    }

    /**
     * Adds a header to the {@link HttpRequest}.
     *
     * <p>If a header with the given name exists, the {@code value} is added to the existing header (comma-separated),
     * otherwise a new header will be created.</p>
     *
     * @param header The header key.
     * @return The updated {@link RequestOptions} object.
     * @throws NullPointerException If {@code header} is null.
     * @throws IllegalStateException if this instance is obtained by calling {@link RequestOptions#none()}.
     */
    public RequestOptions addHeader(HttpHeader header) {
        checkLocked("Cannot add header.");
        Objects.requireNonNull(header, "'header' cannot be null.");
        this.requestCallback = this.requestCallback.andThen(request -> request.getHeaders().add(header));

        return this;
    }

    /**
     * Sets a header on the {@link HttpRequest}.
     *
     * <p>If a header with the given name exists it is overridden by the new {@code value}.</p>
     *
     * @param header The header key.
     * @param value The header value.
     * @return The updated {@link RequestOptions} object.
     * @throws IllegalStateException if this instance is obtained by calling {@link RequestOptions#none()}.
     */
    public RequestOptions setHeader(HttpHeaderName header, String value) {
        checkLocked("Cannot set header.");
        this.requestCallback = this.requestCallback.andThen(request -> request.getHeaders().set(header, value));

        return this;
    }

    /**
     * Adds a query parameter to the request URI. The parameter name and value will be URI encoded. To use an already
     * encoded parameter name and value, call {@code addQueryParam("name", "value", true)}.
     *
     * @param parameterName The name of the query parameter.
     * @param value The value of the query parameter.
     * @return The updated {@link RequestOptions} object.
     * @throws IllegalStateException if this instance is obtained by calling {@link RequestOptions#none()}.
     */
    public RequestOptions addQueryParam(String parameterName, String value) {
        return addQueryParam(parameterName, value, false);
    }

    /**
     * Adds a query parameter to the request URI, specifying whether the parameter is already encoded. A value
     * {@code true} for this argument indicates that value of {@link QueryParam#value()} is already encoded hence the
     * engine should not encode it. By default, the value will be encoded.
     *
     * @param parameterName The name of the query parameter.
     * @param value The value of the query parameter.
     * @param encoded Whether this query parameter is already encoded.
     * @return The updated {@link RequestOptions} object.
     * @throws IllegalStateException if this instance is obtained by calling {@link RequestOptions#none()}.
     */
    public RequestOptions addQueryParam(String parameterName, String value, boolean encoded) {
        checkLocked("Cannot add query param.");
        this.requestCallback = this.requestCallback.andThen(request -> {
            String uri = request.getUri().toString();
            String encodedParameterName = encoded ? parameterName : UriEscapers.QUERY_ESCAPER.escape(parameterName);
            String encodedParameterValue = encoded ? value : UriEscapers.QUERY_ESCAPER.escape(value);

            request.setUri(uri + (uri.contains("?") ? "&" : "?") + encodedParameterName + "=" + encodedParameterValue);
        });

        return this;
    }

    /**
     * Adds a custom request callback to modify the {@link HttpRequest} before it's sent by the {@link HttpClient}. The
     * modifications made on a {@link RequestOptions} object are applied in order on the request.
     *
     * @param requestCallback The request callback.
     * @return The updated {@link RequestOptions} object.
     * @throws NullPointerException If {@code requestCallback} is null.
     * @throws IllegalStateException if this instance is obtained by calling {@link RequestOptions#none()}.
     */
    public RequestOptions addRequestCallback(Consumer<HttpRequest> requestCallback) {
        checkLocked("Cannot add request callback.");
        Objects.requireNonNull(requestCallback, "'requestCallback' cannot be null.");
        this.requestCallback = this.requestCallback.andThen(requestCallback);

        return this;
    }

    /**
     * Sets the body to send as part of the {@link HttpRequest}.
     *
     * @param requestBody the request body data
     * @return The updated {@link RequestOptions} object.
     * @throws NullPointerException If {@code requestBody} is {@code null}.
     * @throws IllegalStateException if this instance is obtained by calling {@link RequestOptions#none()}.
     */
    public RequestOptions setBody(BinaryData requestBody) {
        checkLocked("Cannot set body.");
        Objects.requireNonNull(requestBody, "'requestBody' cannot be null.");
        this.requestCallback = this.requestCallback.andThen(request -> request.setBody(requestBody));

        return this;
    }

    /**
     * Sets the additional context on the request that is passed during the service call.
     *
     * @param context Additional context that is passed during the service call.
     * @return The updated {@link RequestOptions} object.
     * @throws IllegalStateException if this instance is obtained by calling {@link RequestOptions#none()}.
     */
    public RequestOptions setContext(Context context) {
        checkLocked("Cannot set context.");
        this.context = context;

        return this;
    }

    /**
     * Sets the {@link ClientLogger} used to log the request and response.
     *
     * @param logger The {@link ClientLogger} used to log the request and response.
     * @return The updated {@link RequestOptions} object.
     * @throws IllegalStateException if this instance is obtained by calling {@link RequestOptions#none()}.
     */
    public RequestOptions setLogger(ClientLogger logger) {
        checkLocked("Cannot set logger.");
        this.logger = logger;

        return this;
    }

    /**
     * Locks this {@link RequestOptions} to prevent further modifications.
     *
     * @return This {@link RequestOptions} instance.
     */
    private RequestOptions lock() {
        locked = true;

        return this;
    }

    /**
     * An empty {@link RequestOptions} that is immutable, used in situations where there is no request-specific
     * configuration to pass into the request. Modifications to the {@link RequestOptions} will result in an
     * {@link IllegalStateException}.
     *
     * @return The singleton instance of an empty {@link RequestOptions}.
     */
    public static RequestOptions none() {
        return NONE;
    }

    /**
     * Gets the {@link InstrumentationContext} used to instrument the request.
     *
     * @return The {@link InstrumentationContext} used to instrument the request.
     */
    public InstrumentationContext getInstrumentationContext() {
        return instrumentationContext;
    }

    /**
     * Sets the {@link InstrumentationContext} used to instrument the request.
     *
     * @param instrumentationContext The {@link InstrumentationContext} used to instrument the request.
     * @return The updated {@link RequestOptions} object.
     * @throws IllegalStateException if this instance is obtained by calling {@link RequestOptions#none()}.
     */
    public RequestOptions setInstrumentationContext(InstrumentationContext instrumentationContext) {
        checkLocked("Cannot set instrumentation context.");
        this.instrumentationContext = instrumentationContext;

        return this;
    }

    /**
     * Gets the {@link ProgressReporter} used to track progress of I/O operations of the request.
     *
     * @return The {@link ProgressReporter} used to track progress of I/O operations of the request.
     */
    public ProgressReporter getProgressReporter() {
        return progressReporter;
    }

    /**
     * Sets the {@link ProgressReporter} used to track progress of I/O operations of the request.
     *
     * @param progressReporter The {@link ProgressReporter} used to track progress of I/O operations of the request.
     * @return The updated {@link RequestOptions} object.
     * @throws IllegalStateException if this instance is obtained by calling {@link RequestOptions#none()}.
     */
    public RequestOptions setProgressReporter(ProgressReporter progressReporter) {
        checkLocked("Cannot set progress reporter.");
        this.progressReporter = progressReporter;

        return this;
    }

    private void checkLocked(String setterMessage) {
        if (locked) {
            throw LOGGER.logThrowableAsError(
                new IllegalStateException("This instance of RequestOptions is immutable. " + setterMessage));
        }
    }
}
