// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
package com.azure.storage.queue;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceClient;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.HttpPipeline;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.PagedResponse;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.ResponseBase;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.storage.common.StorageSharedKeyCredential;
import com.azure.storage.common.implementation.AccountSasImplUtil;
import com.azure.storage.common.implementation.SasImplUtils;
import com.azure.storage.common.sas.AccountSasSignatureValues;
import com.azure.storage.queue.implementation.AzureQueueStorageImpl;
import com.azure.storage.queue.implementation.models.ServicesGetStatisticsHeaders;
import com.azure.storage.queue.models.QueueCorsRule;
import com.azure.storage.queue.models.QueueItem;
import com.azure.storage.queue.models.QueueMessageDecodingError;
import com.azure.storage.queue.models.QueueServiceProperties;
import com.azure.storage.queue.models.QueueServiceStatistics;
import com.azure.storage.queue.models.QueueStorageException;
import com.azure.storage.queue.models.QueuesSegmentOptions;
import reactor.core.publisher.Mono;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

import static com.azure.storage.common.implementation.StorageImplUtils.submitThreadPool;

/**
 * This class provides a client that contains all the operations for interacting with a queue account in Azure Storage.
 * Operations allowed by the client are creating, listing, and deleting queues, retrieving and updating properties of
 * the account, and retrieving statistics of the account.
 *
 * <p><strong>Instantiating an Synchronous Queue Service Client</strong></p>
 *
 * <!-- src_embed com.azure.storage.queue.queueServiceClient.instantiation -->
 * <pre>
 * QueueServiceClient client = new QueueServiceClientBuilder&#40;&#41;
 *     .connectionString&#40;&quot;connectionstring&quot;&#41;
 *     .endpoint&#40;&quot;endpoint&quot;&#41;
 *     .buildClient&#40;&#41;;
 * </pre>
 * <!-- end com.azure.storage.queue.queueServiceClient.instantiation -->
 *
 * <p>View {@link QueueServiceClientBuilder this} for additional ways to construct the client.</p>
 *
 * @see QueueServiceClientBuilder
 * @see QueueServiceAsyncClient
 * @see StorageSharedKeyCredential
 */
@ServiceClient(builder = QueueServiceClientBuilder.class)
public final class QueueServiceClient {
    private static final ClientLogger LOGGER = new ClientLogger(QueueServiceClient.class);
    private final AzureQueueStorageImpl azureQueueStorage;
    private final String accountName;
    private final QueueServiceVersion serviceVersion;
    private final QueueMessageEncoding messageEncoding;
    private final Function<QueueMessageDecodingError, Mono<Void>> processMessageDecodingErrorAsyncHandler;
    private final Consumer<QueueMessageDecodingError> processMessageDecodingErrorHandler;

    /**
     * Creates a QueueServiceClient that wraps a QueueServiceAsyncClient and blocks requests.
     *
     * @param azureQueueStorage Client that interacts with the service interfaces.
     * @param accountName name of the account.
     * @param serviceVersion {@link QueueServiceVersion} of the service to be used when making requests.
     * @param processMessageDecodingErrorAsyncHandler the asynchronous handler that performs the tasks needed when a
     * message is received or peaked from the queue but cannot be decoded.
     * @param processMessageDecodingErrorHandler the synchronous handler that performs the tasks needed when a
     * message is received or peaked from the queue but cannot be decoded.
     */
    QueueServiceClient(AzureQueueStorageImpl azureQueueStorage, String accountName, QueueServiceVersion serviceVersion,
        QueueMessageEncoding messageEncoding,
        Function<QueueMessageDecodingError, Mono<Void>> processMessageDecodingErrorAsyncHandler,
        Consumer<QueueMessageDecodingError> processMessageDecodingErrorHandler) {
        this.azureQueueStorage = azureQueueStorage;
        this.accountName = accountName;
        this.serviceVersion = serviceVersion;
        this.messageEncoding = messageEncoding;
        this.processMessageDecodingErrorAsyncHandler = processMessageDecodingErrorAsyncHandler;
        this.processMessageDecodingErrorHandler = processMessageDecodingErrorHandler;
    }

    /**
     * Get the url of the storage queue.
     *
     * @return the URL of the storage queue
     */
    public String getQueueServiceUrl() {
        return this.azureQueueStorage.getUrl();
    }

    /**
     * Gets the service version the client is using.
     *
     * @return the service version the client is using.
     */
    public QueueServiceVersion getServiceVersion() {
        return serviceVersion;
    }

    /**
     * Gets the message encoding the client is using.
     *
     * @return the message encoding the client is using.
     */
    public QueueMessageEncoding getMessageEncoding() {
        return messageEncoding;
    }

    /**
     * Constructs a QueueClient that interacts with the specified queue.
     *
     * This will not create the queue in the storage account if it doesn't exist.
     *
     * @param queueName Name of the queue
     * @return QueueClient that interacts with the specified queue
     */
    public QueueClient getQueueClient(String queueName) {
        QueueAsyncClient queueAsyncClient
            = new QueueAsyncClient(this.azureQueueStorage, queueName, accountName, serviceVersion, messageEncoding,
                processMessageDecodingErrorAsyncHandler, processMessageDecodingErrorHandler, null);
        return new QueueClient(this.azureQueueStorage, queueName, accountName, serviceVersion, messageEncoding,
            processMessageDecodingErrorAsyncHandler, processMessageDecodingErrorHandler, queueAsyncClient);
    }

    /**
     * Creates a queue in the storage account with the specified name and returns a QueueClient to interact with it.
     *
     * <p><strong>Code Samples</strong></p>
     *
     * <p>Create the queue "test"</p>
     *
     * <!-- src_embed com.azure.storage.queue.queueServiceClient.createQueue#string -->
     * <pre>
     * client.createQueue&#40;&quot;myqueue&quot;&#41;;
     * System.out.println&#40;&quot;Complete creating queue.&quot;&#41;;
     * </pre>
     * <!-- end com.azure.storage.queue.queueServiceClient.createQueue#string -->
     *
     * @param queueName Name of the queue
     * @return A response containing the QueueClient and the status of creating the queue
     * @throws QueueStorageException If a queue with the same name and different metadata already exists
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public QueueClient createQueue(String queueName) {
        return createQueueWithResponse(queueName, null, null, Context.NONE).getValue();
    }

    /**
     * Creates a queue in the storage account with the specified name and metadata and returns a QueueClient to interact
     * with it.
     *
     * <p><strong>Code Samples</strong></p>
     *
     * <p>Create the queue "test" with metadata "queue:metadata"</p>
     *
     * <!-- src_embed com.azure.storage.queue.queueServiceClient.createQueueWithResponse#string-map-duration-context -->
     * <pre>
     * Response&lt;QueueClient&gt; response = client.createQueueWithResponse&#40;&quot;myqueue&quot;,
     *     Collections.singletonMap&#40;&quot;queue&quot;, &quot;metadata&quot;&#41;, Duration.ofSeconds&#40;1&#41;, new Context&#40;key1, value1&#41;&#41;;
     * System.out.println&#40;&quot;Complete creating queue with status code: &quot; + response.getStatusCode&#40;&#41;&#41;;
     * </pre>
     * <!-- end com.azure.storage.queue.queueServiceClient.createQueueWithResponse#string-map-duration-context -->
     *
     * @param queueName Name of the queue
     * @param metadata Metadata to associate with the queue. If there is leading or trailing whitespace in any
     * metadata key or value, it must be removed or encoded.
     * @param timeout An optional timeout applied to the operation. If a response is not returned before the timeout
     * concludes a {@link RuntimeException} will be thrown.
     * @param context Additional context that is passed through the Http pipeline during the service call.
     * @return A response containing the QueueClient and the status of creating the queue
     * @throws QueueStorageException If a queue with the same name and different metadata already exists
     * @throws RuntimeException if the operation doesn't complete before the timeout concludes.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<QueueClient> createQueueWithResponse(String queueName, Map<String, String> metadata,
        Duration timeout, Context context) {
        Objects.requireNonNull(queueName, "'queueName' cannot be null.");
        try {
            QueueClient queueClient = getQueueClient(queueName);
            Response<Void> response = queueClient.createWithResponse(metadata, timeout, context);
            return new SimpleResponse<>(response, queueClient);
        } catch (RuntimeException e) {
            throw LOGGER.logExceptionAsError(e);
        }
    }

    /**
     * Deletes a queue in the storage account
     *
     * <p><strong>Code Samples</strong></p>
     *
     * <p>Delete the queue "test"</p>
     *
     * <!-- src_embed com.azure.storage.queue.queueServiceClient.deleteQueue#string -->
     * <pre>
     * client.deleteQueue&#40;&quot;myqueue&quot;&#41;;
     * System.out.println&#40;&quot;Complete deleting the queue.&quot;&#41;;
     * </pre>
     * <!-- end com.azure.storage.queue.queueServiceClient.deleteQueue#string -->
     *
     * @param queueName Name of the queue
     * @throws QueueStorageException If the queue doesn't exist
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void deleteQueue(String queueName) {
        deleteQueueWithResponse(queueName, null, Context.NONE);
    }

    /**
     * Deletes a queue in the storage account
     *
     * <p><strong>Code Samples</strong></p>
     *
     * <p>Delete the queue "test"</p>
     *
     * <!-- src_embed com.azure.storage.queue.queueServiceClient.deleteQueueWithResponse#string-duration-context -->
     * <pre>
     * Response&lt;Void&gt; response = client.deleteQueueWithResponse&#40;&quot;myqueue&quot;, Duration.ofSeconds&#40;1&#41;,
     *     new Context&#40;key1, value1&#41;&#41;;
     * System.out.println&#40;&quot;Complete deleting the queue with status code: &quot; + response.getStatusCode&#40;&#41;&#41;;
     * </pre>
     * <!-- end com.azure.storage.queue.queueServiceClient.deleteQueueWithResponse#string-duration-context -->
     *
     * @param queueName Name of the queue
     * @param timeout An optional timeout applied to the operation. If a response is not returned before the timeout
     * concludes a {@link RuntimeException} will be thrown.
     * @param context Additional context that is passed through the Http pipeline during the service call.
     * @return A response containing the status of deleting the queue
     * @throws QueueStorageException If the queue doesn't exist
     * @throws RuntimeException if the operation doesn't complete before the timeout concludes.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> deleteQueueWithResponse(String queueName, Duration timeout, Context context) {
        Objects.requireNonNull(queueName, "'queueName' cannot be null.");
        try {
            QueueClient queueClient = getQueueClient(queueName);
            return queueClient.deleteWithResponse(timeout, context);
        } catch (RuntimeException e) {
            throw LOGGER.logExceptionAsError(e);
        }
    }

    /**
     * Lists all queues in the storage account without their metadata.
     *
     * <p><strong>Code Samples</strong></p>
     *
     * <p>List all queues in the account</p>
     *
     * <!-- src_embed com.azure.storage.queue.queueServiceClient.listQueues -->
     * <pre>
     * client.listQueues&#40;&#41;.forEach&#40;
     *     queueItem -&gt; System.out.printf&#40;&quot;Queue %s exists in the account&quot;, queueItem.getName&#40;&#41;&#41;
     * &#41;;
     * </pre>
     * <!-- end com.azure.storage.queue.queueServiceClient.listQueues -->
     *
     * <p>For more information, see the
     * <a href="https://docs.microsoft.com/rest/api/storageservices/list-queues1">Azure Docs</a>.</p>
     *
     * @return {@link QueueItem Queues} in the storage account
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<QueueItem> listQueues() {
        return listQueues(null, null, Context.NONE);
    }

    /**
     * Lists the queues in the storage account that pass the filter.
     *
     * Pass true to {@link QueuesSegmentOptions#setIncludeMetadata(boolean) includeMetadata} to have metadata returned
     * for the queues.
     *
     * <p><strong>Code Samples</strong></p>
     *
     * <p>List all queues that begin with "azure"</p>
     *
     * <!-- src_embed com.azure.storage.queue.queueServiceClient.listQueues#queueSergmentOptions-duration-context -->
     * <pre>
     * client.listQueues&#40;new QueuesSegmentOptions&#40;&#41;.setPrefix&#40;&quot;azure&quot;&#41;, Duration.ofSeconds&#40;1&#41;,
     *     new Context&#40;key1, value1&#41;&#41;.forEach&#40;
     *         queueItem -&gt; System.out.printf&#40;&quot;Queue %s exists in the account and has metadata %s&quot;,
     *         queueItem.getName&#40;&#41;, queueItem.getMetadata&#40;&#41;&#41;
     * &#41;;
     * </pre>
     * <!-- end com.azure.storage.queue.queueServiceClient.listQueues#queueSergmentOptions-duration-context -->
     *
     * <p>For more information, see the
     * <a href="https://docs.microsoft.com/rest/api/storageservices/list-queues1">Azure Docs</a>.</p>
     *
     * @param options Options for listing queues. If iterating by page, the page size passed to byPage methods such as
     *      * {@link PagedIterable#iterableByPage(int)} will be preferred over the value set on these options.
     * @param timeout An optional timeout applied to the operation. If a response is not returned before the timeout
     * concludes a {@link RuntimeException} will be thrown.
     * @param context Additional context that is passed through the Http pipeline during the service call.
     * @return {@link QueueItem Queues} in the storage account that satisfy the filter requirements
     * @throws RuntimeException if the operation doesn't complete before the timeout concludes.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<QueueItem> listQueues(QueuesSegmentOptions options, Duration timeout, Context context) {
        Context finalContext = context == null ? Context.NONE : context;
        final String prefix = (options != null) ? options.getPrefix() : null;
        final Integer maxResultsPerPage = (options != null) ? options.getMaxResultsPerPage() : null;
        final List<String> include = new ArrayList<>();

        if (options != null) {
            if (options.isIncludeMetadata()) {
                include.add("metadata");
            }
        }
        BiFunction<String, Integer, PagedResponse<QueueItem>> retriever = (nextMarker, pageSize) -> {
            Supplier<PagedResponse<QueueItem>> operation = () -> this.azureQueueStorage.getServices()
                .listQueuesSegmentSinglePage(prefix, nextMarker, pageSize == null ? maxResultsPerPage : pageSize,
                    include, null, null, finalContext);

            return submitThreadPool(operation, LOGGER, timeout);

        };

        return new PagedIterable<>(pageSize -> retriever.apply(null, pageSize), retriever);
    }

    /**
     * Retrieves the properties of the storage account's Queue service. The properties range from storage analytics and
     * metric to CORS (Cross-Origin Resource Sharing).
     *
     * <p><strong>Code Samples</strong></p>
     *
     * <p>Retrieve Queue service properties</p>
     *
     * <!-- src_embed com.azure.storage.queue.queueServiceClient.getProperties -->
     * <pre>
     * QueueServiceProperties properties = client.getProperties&#40;&#41;;
     * System.out.printf&#40;&quot;Hour metrics enabled: %b, Minute metrics enabled: %b&quot;,
     *     properties.getHourMetrics&#40;&#41;.isEnabled&#40;&#41;, properties.getMinuteMetrics&#40;&#41;.isEnabled&#40;&#41;&#41;;
     * </pre>
     * <!-- end com.azure.storage.queue.queueServiceClient.getProperties -->
     *
     * <p>For more information, see the
     * <a href="https://docs.microsoft.com/rest/api/storageservices/get-queue-service-properties">Azure
     * Docs</a>.</p>
     *
     * @return Storage account Queue service properties
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public QueueServiceProperties getProperties() {
        return getPropertiesWithResponse(null, Context.NONE).getValue();
    }

    /**
     * Retrieves the properties of the storage account's Queue service. The properties range from storage analytics and
     * metric to CORS (Cross-Origin Resource Sharing).
     *
     * <p><strong>Code Samples</strong></p>
     *
     * <p>Retrieve Queue service properties</p>
     *
     * <!-- src_embed com.azure.storage.queue.queueServiceClient.getPropertiesWithResponse#duration-context -->
     * <pre>
     * QueueServiceProperties properties = client.getPropertiesWithResponse&#40;Duration.ofSeconds&#40;1&#41;,
     *     new Context&#40;key1, value1&#41;&#41;.getValue&#40;&#41;;
     * System.out.printf&#40;&quot;Hour metrics enabled: %b, Minute metrics enabled: %b&quot;,
     *     properties.getHourMetrics&#40;&#41;.isEnabled&#40;&#41;, properties.getMinuteMetrics&#40;&#41;.isEnabled&#40;&#41;&#41;;
     * </pre>
     * <!-- end com.azure.storage.queue.queueServiceClient.getPropertiesWithResponse#duration-context -->
     *
     * <p>For more information, see the
     * <a href="https://docs.microsoft.com/rest/api/storageservices/get-queue-service-properties">Azure
     * Docs</a>.</p>
     *
     * @param timeout An optional timeout applied to the operation. If a response is not returned before the timeout
     * concludes a {@link RuntimeException} will be thrown.
     * @param context Additional context that is passed through the Http pipeline during the service call.
     * @return A response containing the Storage account Queue service properties
     * @throws RuntimeException if the operation doesn't complete before the timeout concludes.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<QueueServiceProperties> getPropertiesWithResponse(Duration timeout, Context context) {
        Context finalContext = context == null ? Context.NONE : context;
        Supplier<Response<QueueServiceProperties>> operation
            = () -> this.azureQueueStorage.getServices().getPropertiesWithResponse(null, null, finalContext);

        return submitThreadPool(operation, LOGGER, timeout);
    }

    /**
     * Sets the properties for the storage account's Queue service. The properties range from storage analytics and
     * metric to CORS (Cross-Origin Resource Sharing).
     *
     * To maintain the CORS in the Queue service pass a {@code null} value for {@link QueueServiceProperties#getCors()
     * CORS}. To disable all CORS in the Queue service pass an empty list for {@link QueueServiceProperties#getCors()
     * CORS}.
     *
     * <p><strong>Code Sample</strong></p>
     *
     * <p>Clear CORS in the Queue service</p>
     *
     * <!-- src_embed com.azure.storage.queue.queueServiceClient.setProperties#QueueServiceProperties -->
     * <pre>
     * QueueServiceProperties properties = client.getProperties&#40;&#41;;
     * properties.setCors&#40;Collections.emptyList&#40;&#41;&#41;;
     *
     * client.setProperties&#40;properties&#41;;
     * System.out.println&#40;&quot;Setting Queue service properties completed.&quot;&#41;;
     * </pre>
     * <!-- end com.azure.storage.queue.queueServiceClient.setProperties#QueueServiceProperties -->
     *
     * <p>Enable Minute and Hour Metrics</p>
     *
     * <!-- src_embed com.azure.storage.queue.queueServiceClient.setPropertiesEnableMetrics#QueueServiceProperties -->
     * <pre>
     * QueueServiceProperties properties = client.getProperties&#40;&#41;;
     * properties.getMinuteMetrics&#40;&#41;.setEnabled&#40;true&#41;;
     * properties.getMinuteMetrics&#40;&#41;.setIncludeApis&#40;true&#41;;
     * properties.getMinuteMetrics&#40;&#41;.setRetentionPolicy&#40;new QueueRetentionPolicy&#40;&#41;.setDays&#40;7&#41;.setEnabled&#40;true&#41;&#41;;
     * properties.getHourMetrics&#40;&#41;.setEnabled&#40;true&#41;;
     * properties.getHourMetrics&#40;&#41;.setIncludeApis&#40;true&#41;;
     * properties.getHourMetrics&#40;&#41;.setRetentionPolicy&#40;new QueueRetentionPolicy&#40;&#41;.setDays&#40;7&#41;.setEnabled&#40;true&#41;&#41;;
     * client.setProperties&#40;properties&#41;;
     * System.out.println&#40;&quot;Setting Queue service properties completed.&quot;&#41;;
     * </pre>
     * <!-- end com.azure.storage.queue.queueServiceClient.setPropertiesEnableMetrics#QueueServiceProperties -->
     *
     * <p>For more information, see the
     * <a href="https://docs.microsoft.com/rest/api/storageservices/set-queue-service-properties">Azure
     * Docs</a>.</p>
     *
     * @param properties Storage account Queue service properties
     * @throws QueueStorageException When one of the following is true
     * <ul>
     * <li>A CORS rule is missing one of its fields</li>
     * <li>More than five CORS rules will exist for the Queue service</li>
     * <li>Size of all CORS rules exceeds 2KB</li>
     * <li>
     * Length of {@link QueueCorsRule#getAllowedHeaders() allowed headers}, {@link QueueCorsRule#getExposedHeaders()
     * exposed headers}, or {@link QueueCorsRule#getAllowedOrigins() allowedOrigins() allowed origins} exceeds 256
     * characters.
     * </li>
     * <li>{@link QueueCorsRule#getAllowedMethods() Allowed methods} isn't DELETE, GET, HEAD, MERGE, POST, OPTIONS, or
     * PUT</li>
     * </ul>
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void setProperties(QueueServiceProperties properties) {
        setPropertiesWithResponse(properties, null, Context.NONE);
    }

    /**
     * Sets the properties for the storage account's Queue service. The properties range from storage analytics and
     * metric to CORS (Cross-Origin Resource Sharing).
     *
     * To maintain the CORS in the Queue service pass a {@code null} value for {@link QueueServiceProperties#getCors()
     * CORS}. To disable all CORS in the Queue service pass an empty list for {@link QueueServiceProperties#getCors()
     * CORS}.
     *
     * <p><strong>Code Sample</strong></p>
     *
     * <p>Clear CORS in the Queue service</p>
     *
     * <!-- src_embed com.azure.storage.queue.queueServiceClient.setPropertiesWithResponse#QueueServiceProperties-duration-context -->
     * <pre>
     * QueueServiceProperties properties = client.getProperties&#40;&#41;;
     * properties.setCors&#40;Collections.emptyList&#40;&#41;&#41;;
     * Response&lt;Void&gt; response = client.setPropertiesWithResponse&#40;properties, Duration.ofSeconds&#40;1&#41;,
     *     new Context&#40;key1, value1&#41;&#41;;
     * System.out.printf&#40;&quot;Setting Queue service properties completed with status code %d&quot;, response.getStatusCode&#40;&#41;&#41;;
     * </pre>
     * <!-- end com.azure.storage.queue.queueServiceClient.setPropertiesWithResponse#QueueServiceProperties-duration-context -->
     *
     * <p>Enable Minute and Hour Metrics</p>
     *
     * <!-- src_embed com.azure.storage.queue.queueServiceClient.setPropertiesWithResponseEnableMetrics#QueueServiceProperties-duration-context -->
     * <pre>
     * QueueServiceProperties properties = client.getProperties&#40;&#41;;
     * properties.getMinuteMetrics&#40;&#41;.setEnabled&#40;true&#41;;
     * properties.getMinuteMetrics&#40;&#41;.setIncludeApis&#40;true&#41;;
     * properties.getMinuteMetrics&#40;&#41;.setRetentionPolicy&#40;new QueueRetentionPolicy&#40;&#41;.setDays&#40;7&#41;.setEnabled&#40;true&#41;&#41;;
     * properties.getHourMetrics&#40;&#41;.setEnabled&#40;true&#41;;
     * properties.getHourMetrics&#40;&#41;.setIncludeApis&#40;true&#41;;
     * properties.getHourMetrics&#40;&#41;.setRetentionPolicy&#40;new QueueRetentionPolicy&#40;&#41;.setDays&#40;7&#41;.setEnabled&#40;true&#41;&#41;;
     * Response&lt;Void&gt; response = client.setPropertiesWithResponse&#40;properties, Duration.ofSeconds&#40;1&#41;,
     *     new Context&#40;key1, value1&#41;&#41;;
     * System.out.printf&#40;&quot;Setting Queue service properties completed with status code %d&quot;, response.getStatusCode&#40;&#41;&#41;;
     * </pre>
     * <!-- end com.azure.storage.queue.queueServiceClient.setPropertiesWithResponseEnableMetrics#QueueServiceProperties-duration-context -->
     *
     * <p>For more information, see the
     * <a href="https://docs.microsoft.com/rest/api/storageservices/set-queue-service-properties">Azure
     * Docs</a>.</p>
     *
     * @param properties Storage account Queue service properties
     * @param timeout An optional timeout applied to the operation. If a response is not returned before the timeout
     * concludes a {@link RuntimeException} will be thrown.
     * @param context Additional context that is passed through the Http pipeline during the service call.
     * @return A response that only contains headers and response status code
     * @throws QueueStorageException When one of the following is true
     * <ul>
     * <li>A CORS rule is missing one of its fields</li>
     * <li>More than five CORS rules will exist for the Queue service</li>
     * <li>Size of all CORS rules exceeds 2KB</li>
     * <li>
     * Length of {@link QueueCorsRule#getAllowedHeaders() allowed headers}, {@link QueueCorsRule#getExposedHeaders()
     * exposed headers}, or {@link QueueCorsRule#getAllowedOrigins() allowed origins} exceeds 256 characters.
     * </li>
     * <li>{@link QueueCorsRule#getAllowedMethods() Allowed methods} isn't DELETE, GET, HEAD, MERGE, POST, OPTIONS, or
     * PUT</li>
     * </ul>
     * @throws RuntimeException if the operation doesn't complete before the timeout concludes.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> setPropertiesWithResponse(QueueServiceProperties properties, Duration timeout,
        Context context) {
        Context finalContext = context == null ? Context.NONE : context;
        Supplier<Response<Void>> operation = () -> this.azureQueueStorage.getServices()
            .setPropertiesNoCustomHeadersWithResponse(properties, null, null, finalContext);

        return submitThreadPool(operation, LOGGER, timeout);
    }

    /**
     * Retrieves the geo replication information about the Queue service.
     *
     * <p><strong>Code Samples</strong></p>
     *
     * <p>Retrieve the geo replication information</p>
     *
     * <!-- src_embed com.azure.storage.queue.queueServiceClient.getStatistics -->
     * <pre>
     * QueueServiceStatistics stats = client.getStatistics&#40;&#41;;
     * System.out.printf&#40;&quot;Geo replication status: %s, Last synced: %s&quot;,
     *     stats.getGeoReplication&#40;&#41;.getStatus&#40;&#41;, stats.getGeoReplication&#40;&#41;.getLastSyncTime&#40;&#41;&#41;;
     * </pre>
     * <!-- end com.azure.storage.queue.queueServiceClient.getStatistics -->
     *
     * <p>For more information, see the
     * <a href="https://docs.microsoft.com/rest/api/storageservices/get-queue-service-stats">Azure Docs</a>.</p>
     *
     * @return The geo replication information about the Queue service
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public QueueServiceStatistics getStatistics() {
        return getStatisticsWithResponse(null, Context.NONE).getValue();
    }

    /**
     * Retrieves the geo replication information about the Queue service.
     *
     * <p><strong>Code Samples</strong></p>
     *
     * <p>Retrieve the geo replication information</p>
     *
     * <!-- src_embed com.azure.storage.queue.queueServiceClient.getStatisticsWithResponse#duration-context -->
     * <pre>
     * QueueServiceStatistics stats = client.getStatisticsWithResponse&#40;Duration.ofSeconds&#40;1&#41;,
     *     new Context&#40;key1, value1&#41;&#41;.getValue&#40;&#41;;
     * System.out.printf&#40;&quot;Geo replication status: %s, Last synced: %s&quot;,
     *     stats.getGeoReplication&#40;&#41;.getStatus&#40;&#41;, stats.getGeoReplication&#40;&#41;.getLastSyncTime&#40;&#41;&#41;;
     * </pre>
     * <!-- end com.azure.storage.queue.queueServiceClient.getStatisticsWithResponse#duration-context -->
     *
     * <p>For more information, see the
     * <a href="https://docs.microsoft.com/rest/api/storageservices/get-queue-service-stats">Azure Docs</a>.</p>
     *
     * @param timeout An optional timeout applied to the operation. If a response is not returned before the timeout
     * concludes a {@link RuntimeException} will be thrown.
     * @param context Additional context that is passed through the Http pipeline during the service call.
     * @return A response containing the geo replication information about the Queue service
     * @throws RuntimeException if the operation doesn't complete before the timeout concludes.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<QueueServiceStatistics> getStatisticsWithResponse(Duration timeout, Context context) {
        Context finalContext = context == null ? Context.NONE : context;
        Supplier<ResponseBase<ServicesGetStatisticsHeaders, QueueServiceStatistics>> operation
            = () -> this.azureQueueStorage.getServices().getStatisticsWithResponse(null, null, finalContext);
        return submitThreadPool(operation, LOGGER, timeout);
    }

    /**
     * Get associated account name.
     *
     * @return account name associated with this storage resource.
     */
    public String getAccountName() {
        return accountName;
    }

    /**
     * Gets the {@link HttpPipeline} powering this client.
     *
     * @return The pipeline.
     */
    public HttpPipeline getHttpPipeline() {
        return this.azureQueueStorage.getHttpPipeline();
    }

    /**
     * Generates an account SAS for the Azure Storage account using the specified {@link AccountSasSignatureValues}.
     * <p>Note : The client must be authenticated via {@link StorageSharedKeyCredential}
     * <p>See {@link AccountSasSignatureValues} for more information on how to construct an account SAS.</p>
     *
     * <p><strong>Generating an account SAS</strong></p>
     * <p>The snippet below generates an AccountSasSignatureValues object that lasts for two days and gives the user
     * read and list access to queue and file shares.</p>
     * <!-- src_embed com.azure.storage.queue.QueueServiceClient.generateAccountSas#AccountSasSignatureValues -->
     * <pre>
     * AccountSasPermission permissions = new AccountSasPermission&#40;&#41;
     *     .setListPermission&#40;true&#41;
     *     .setReadPermission&#40;true&#41;;
     * AccountSasResourceType resourceTypes = new AccountSasResourceType&#40;&#41;.setContainer&#40;true&#41;.setObject&#40;true&#41;;
     * AccountSasService services = new AccountSasService&#40;&#41;.setQueueAccess&#40;true&#41;.setFileAccess&#40;true&#41;;
     * OffsetDateTime expiryTime = OffsetDateTime.now&#40;&#41;.plus&#40;Duration.ofDays&#40;2&#41;&#41;;
     *
     * AccountSasSignatureValues sasValues =
     *     new AccountSasSignatureValues&#40;expiryTime, permissions, services, resourceTypes&#41;;
     *
     * &#47;&#47; Client must be authenticated via StorageSharedKeyCredential
     * String sas = queueServiceClient.generateAccountSas&#40;sasValues&#41;;
     * </pre>
     * <!-- end com.azure.storage.queue.QueueServiceClient.generateAccountSas#AccountSasSignatureValues -->
     *
     * @param accountSasSignatureValues {@link AccountSasSignatureValues}
     *
     * @return A {@code String} representing the SAS query parameters.
     */
    public String generateAccountSas(AccountSasSignatureValues accountSasSignatureValues) {
        return generateAccountSas(accountSasSignatureValues, null);
    }

    /**
     * Generates an account SAS for the Azure Storage account using the specified {@link AccountSasSignatureValues}.
     * <p>Note : The client must be authenticated via {@link StorageSharedKeyCredential}
     * <p>See {@link AccountSasSignatureValues} for more information on how to construct an account SAS.</p>
     *
     * <p><strong>Generating an account SAS</strong></p>
     * <p>The snippet below generates an AccountSasSignatureValues object that lasts for two days and gives the user
     * read and list access to queue and file shares.</p>
     * <!-- src_embed com.azure.storage.queue.QueueServiceClient.generateAccountSas#AccountSasSignatureValues-Context -->
     * <pre>
     * AccountSasPermission permissions = new AccountSasPermission&#40;&#41;
     *     .setListPermission&#40;true&#41;
     *     .setReadPermission&#40;true&#41;;
     * AccountSasResourceType resourceTypes = new AccountSasResourceType&#40;&#41;.setContainer&#40;true&#41;.setObject&#40;true&#41;;
     * AccountSasService services = new AccountSasService&#40;&#41;.setQueueAccess&#40;true&#41;.setFileAccess&#40;true&#41;;
     * OffsetDateTime expiryTime = OffsetDateTime.now&#40;&#41;.plus&#40;Duration.ofDays&#40;2&#41;&#41;;
     *
     * AccountSasSignatureValues sasValues =
     *     new AccountSasSignatureValues&#40;expiryTime, permissions, services, resourceTypes&#41;;
     *
     * &#47;&#47; Client must be authenticated via StorageSharedKeyCredential
     * String sas = queueServiceClient.generateAccountSas&#40;sasValues, new Context&#40;&quot;key&quot;, &quot;value&quot;&#41;&#41;;
     * </pre>
     * <!-- end com.azure.storage.queue.QueueServiceClient.generateAccountSas#AccountSasSignatureValues-Context -->
     *
     * @param accountSasSignatureValues {@link AccountSasSignatureValues}
     * @param context Additional context that is passed through the code when generating a SAS.
     *
     * @return A {@code String} representing the SAS query parameters.
     */
    public String generateAccountSas(AccountSasSignatureValues accountSasSignatureValues, Context context) {
        return generateAccountSas(accountSasSignatureValues, null, context);
    }

    /**
     * Generates an account SAS for the Azure Storage account using the specified {@link AccountSasSignatureValues}.
     * <p>Note : The client must be authenticated via {@link StorageSharedKeyCredential}
     * <p>See {@link AccountSasSignatureValues} for more information on how to construct an account SAS.</p>
     *
     * @param accountSasSignatureValues {@link AccountSasSignatureValues}
     * @param stringToSignHandler For debugging purposes only. Returns the string to sign that was used to generate the
     * signature.
     * @param context Additional context that is passed through the code when generating a SAS.
     *
     * @return A {@code String} representing the SAS query parameters.
     */
    public String generateAccountSas(AccountSasSignatureValues accountSasSignatureValues,
        Consumer<String> stringToSignHandler, Context context) {
        return new AccountSasImplUtil(accountSasSignatureValues, null)
            .generateSas(SasImplUtils.extractSharedKeyCredential(getHttpPipeline()), stringToSignHandler, context);
    }
}
