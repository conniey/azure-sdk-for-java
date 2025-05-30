// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
package com.azure.search.documents.indexes;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceClient;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.HttpPipeline;
import com.azure.core.http.rest.PagedFlux;
import com.azure.core.http.rest.PagedResponse;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import com.azure.core.util.logging.ClientLogger;
import com.azure.core.util.serializer.JsonSerializer;
import com.azure.search.documents.SearchAsyncClient;
import com.azure.search.documents.SearchClientBuilder;
import com.azure.search.documents.SearchServiceVersion;
import com.azure.search.documents.implementation.converters.AnalyzeRequestConverter;
import com.azure.search.documents.implementation.util.FieldBuilder;
import com.azure.search.documents.implementation.util.MappingUtils;
import com.azure.search.documents.indexes.implementation.SearchServiceClientImpl;
import com.azure.search.documents.indexes.implementation.models.ErrorResponseException;
import com.azure.search.documents.indexes.implementation.models.ListSynonymMapsResult;
import com.azure.search.documents.indexes.models.AnalyzeTextOptions;
import com.azure.search.documents.indexes.models.AnalyzedTokenInfo;
import com.azure.search.documents.indexes.models.FieldBuilderOptions;
import com.azure.search.documents.indexes.models.IndexStatisticsSummary;
import com.azure.search.documents.indexes.models.KnowledgeAgent;
import com.azure.search.documents.indexes.models.SearchField;
import com.azure.search.documents.indexes.models.SearchIndex;
import com.azure.search.documents.indexes.models.SearchIndexStatistics;
import com.azure.search.documents.indexes.models.SearchServiceStatistics;
import com.azure.search.documents.indexes.models.SynonymMap;
import reactor.core.publisher.Mono;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;

import static com.azure.core.util.FluxUtil.monoError;
import static com.azure.core.util.FluxUtil.pagedFluxError;
import static com.azure.core.util.FluxUtil.withContext;

/**
 * This class provides a client that contains the operations for creating, getting, listing, updating, or deleting
 * indexes or synonym map and analyzing text in an Azure AI Search service.
 *
 * <h2>
 *     Overview
 * </h2>
 *
 * <p>
 *     An index is stored on your search service and populated with JSON documents that are indexed and tokenized for
 *     information retrieval. The fields collection of an index defines the structure of the search document. Fields
 *     have a name, data types, and attributes that determine how it's used. For example, searchable fields are used in
 *     full text search, and thus tokenized during indexing. An index also defines other constructs, such as scoring
 *     profiles for relevance tuning, suggesters, semantic configurations, and custom analyzers.
 * </p>
 *
 * <p>
 *     A synonym map is service-level object that contains user-defined synonyms. This object is maintained
 *     independently from search indexes. Once uploaded, you can point any searchable field to the synonym map (one per field).
 * </p>
 *
 * <p>
 *     This client provides an asynchronous API for accessing indexes. This client allows you to create, delete, update,
 *     and configure search indexes. The client also allows you to declare custom synonym maps to expand or rewrite
 *     queries.
 * </p>
 *
 * <h2>
 *     Getting Started
 * </h2>
 *
 * <p>
 *     Authenticating and building instances of this client are handled by {@link SearchIndexClientBuilder}. This
 *     sample shows you how to create an instance of the client:
 * </p>
 *
 * <!-- src_embed com.azure.search.documents.indexes.SearchIndexAsyncClient-classLevelJavaDoc.instantiation -->
 * <pre>
 * SearchIndexAsyncClient searchIndexAsyncClient = new SearchIndexClientBuilder&#40;&#41;
 *     .credential&#40;new AzureKeyCredential&#40;&quot;&#123;key&#125;&quot;&#41;&#41;
 *     .endpoint&#40;&quot;&#123;endpoint&#125;&quot;&#41;
 *     .buildAsyncClient&#40;&#41;;
 * </pre>
 * <!-- end com.azure.search.documents.indexes.SearchIndexAsyncClient-classLevelJavaDoc.instantiation -->
 *
 * <p>
 *     For more information on authentication and building, see the documentation for {@link SearchIndexClientBuilder}.
 * </p>
 *
 * <hr/>
 *
 * <h2>
 *     Examples
 * </h2>
 *
 * <p>
 *     The following examples all use <a href="https://github.com/Azure-Samples/azure-search-sample-data">a simple Hotel
 *     data set</a> that you can <a href="https://learn.microsoft.com/azure/search/search-get-started-portal#step-1---start-the-import-data-wizard-and-create-a-data-source">
 *         import into your own index from the Azure portal.</a>
 *     These are just a few of the basics - please check out <a href="https://github.com/Azure/azure-sdk-for-java/blob/main/sdk/search/azure-search-documents/src/samples/README.md">our Samples </a>for much more.
 * </p>
 *
 * <h3>
 *     Create an Index
 * </h3>
 *
 * <p>
 *     The following sample creates an index.
 * </p>
 *
 * <!-- src_embed com.azure.search.documents.indexes.SearchIndexAsyncClient-classLevelJavaDoc.createIndex#SearchIndex -->
 * <pre>
 * SearchIndex searchIndex = new SearchIndex&#40;&quot;indexName&quot;, Arrays.asList&#40;
 *     new SearchField&#40;&quot;hotelId&quot;, SearchFieldDataType.STRING&#41;
 *         .setKey&#40;true&#41;
 *         .setFilterable&#40;true&#41;
 *         .setSortable&#40;true&#41;,
 *     new SearchField&#40;&quot;hotelName&quot;, SearchFieldDataType.STRING&#41;
 *         .setSearchable&#40;true&#41;
 *         .setFilterable&#40;true&#41;
 *         .setSortable&#40;true&#41;,
 *     new SearchField&#40;&quot;description&quot;, SearchFieldDataType.STRING&#41;
 *         .setSearchable&#40;true&#41;
 *         .setAnalyzerName&#40;LexicalAnalyzerName.EN_LUCENE&#41;,
 *     new SearchField&#40;&quot;descriptionFr&quot;, SearchFieldDataType.STRING&#41;
 *         .setSearchable&#40;true&#41;
 *         .setAnalyzerName&#40;LexicalAnalyzerName.FR_LUCENE&#41;,
 *     new SearchField&#40;&quot;tags&quot;, SearchFieldDataType.collection&#40;SearchFieldDataType.STRING&#41;&#41;
 *         .setSearchable&#40;true&#41;
 *         .setFilterable&#40;true&#41;
 *         .setFacetable&#40;true&#41;,
 *     new SearchField&#40;&quot;address&quot;, SearchFieldDataType.COMPLEX&#41;
 *         .setFields&#40;
 *             new SearchField&#40;&quot;streetAddress&quot;, SearchFieldDataType.STRING&#41;
 *                 .setSearchable&#40;true&#41;,
 *             new SearchField&#40;&quot;city&quot;, SearchFieldDataType.STRING&#41;
 *                 .setFilterable&#40;true&#41;
 *                 .setSortable&#40;true&#41;
 *                 .setFacetable&#40;true&#41;,
 *             new SearchField&#40;&quot;stateProvince&quot;, SearchFieldDataType.STRING&#41;
 *                 .setSearchable&#40;true&#41;
 *                 .setFilterable&#40;true&#41;
 *                 .setSortable&#40;true&#41;
 *                 .setFacetable&#40;true&#41;,
 *             new SearchField&#40;&quot;country&quot;, SearchFieldDataType.STRING&#41;
 *                 .setSearchable&#40;true&#41;
 *                 .setSynonymMapNames&#40;&quot;synonymMapName&quot;&#41;
 *                 .setFilterable&#40;true&#41;
 *                 .setSortable&#40;true&#41;
 *                 .setFacetable&#40;true&#41;,
 *             new SearchField&#40;&quot;postalCode&quot;, SearchFieldDataType.STRING&#41;
 *                 .setSearchable&#40;true&#41;
 *                 .setFilterable&#40;true&#41;
 *                 .setSortable&#40;true&#41;
 *                 .setFacetable&#40;true&#41;&#41;
 * &#41;&#41;;
 *
 * searchIndexAsyncClient.createIndex&#40;searchIndex&#41;.block&#40;&#41;;
 * </pre>
 * <!-- end com.azure.search.documents.indexes.SearchIndexAsyncClient-classLevelJavaDoc.createIndex#SearchIndex -->
 *
 * <em>
 *     For a synchronous sample see {@link SearchIndexClient#createIndex(SearchIndex)}.
 * </em>
 *
 * <h3>
 *     List indexes
 * </h3>
 *
 * <p>
 *     The following sample lists all indexes.
 * </p>
 *
 * <!-- src_embed com.azure.search.documents.indexes.SearchIndexAsyncClient-classLevelJavaDoc.listIndexes -->
 * <pre>
 * searchIndexAsyncClient.listIndexes&#40;&#41;.subscribe&#40;index -&gt; System.out.println&#40;&quot;The index name is &quot; + index.getName&#40;&#41;&#41;&#41;;
 * </pre>
 * <!-- end com.azure.search.documents.indexes.SearchIndexAsyncClient-classLevelJavaDoc.listIndexes -->
 *
 * <em>
 *     For a synchronous sample see {@link SearchIndexClient#listIndexes()}.
 * </em>
 *
 * <h3>
 *     Retrieve an Index
 * </h3>
 *
 * <p>
 *     The following sample retrieves an index.
 * </p>
 *
 * <!-- src_embed com.azure.search.documents.indexes.SearchIndexAsyncClient-classLevelJavaDoc.getIndex#String -->
 * <pre>
 * SearchIndex searchIndex = searchIndexAsyncClient.getIndex&#40;&quot;indexName&quot;&#41;.block&#40;&#41;;
 * if &#40;searchIndex != null&#41; &#123;
 *     System.out.println&#40;&quot;The index name is &quot; + searchIndex.getName&#40;&#41;&#41;;
 * &#125;
 * </pre>
 * <!-- end com.azure.search.documents.indexes.SearchIndexAsyncClient-classLevelJavaDoc.getIndex#String -->
 *
 * <em>
 *     For a synchronous sample see {@link SearchIndexClient#getIndex(String)}.
 * </em>
 *
 * <h3>
 *     Update an Index
 * </h3>
 *
 * <p>
 *     The following sample updates an index.
 * </p>
 *
 * <!-- src_embed com.azure.search.documents.indexes.SearchIndexAsyncClient-classLevelJavaDoc.updateIndex#SearchIndex -->
 * <pre>
 * SearchIndex searchIndex = searchIndexAsyncClient.getIndex&#40;&quot;indexName&quot;&#41;.block&#40;&#41;;
 * if &#40;searchIndex != null&#41; &#123;
 *     searchIndex.setFields&#40;new SearchField&#40;&quot;newField&quot;, SearchFieldDataType.STRING&#41;&#41;;
 *     searchIndexAsyncClient.createOrUpdateIndex&#40;searchIndex&#41;;
 * &#125;
 * </pre>
 * <!-- end com.azure.search.documents.indexes.SearchIndexAsyncClient-classLevelJavaDoc.updateIndex#SearchIndex -->
 *
 * <em>
 *     For a synchronous sample see {@link SearchIndexClient#createOrUpdateIndex(SearchIndex)}.
 * </em>
 *
 * <h3>
 *     Delete an Index
 * </h3>
 *
 * <p>
 *     The following sample deletes an index.
 * </p>
 *
 * <!-- src_embed com.azure.search.documents.indexes.SearchIndexAsyncClient-classLevelJavaDoc.deleteIndex#String -->
 * <pre>
 * String indexName = &quot;indexName&quot;;
 * searchIndexAsyncClient.deleteIndex&#40;indexName&#41;.block&#40;&#41;;
 * </pre>
 * <!-- end com.azure.search.documents.indexes.SearchIndexAsyncClient-classLevelJavaDoc.deleteIndex#String -->
 *
 * <em>
 *     For a synchronous sample see {@link SearchIndexClient#deleteIndex(String)}.
 * </em>
 *
 *  <h3>
 *     Create a Synonym Map
 * </h3>
 *
 * <p>
 *     The following sample creates a synonym map.
 * </p>
 *
 * <!-- src_embed com.azure.search.documents.indexes.SearchIndexAsyncClient-classLevelJavaDoc.createSynonymMap#SynonymMap -->
 * <pre>
 * SynonymMap synonymMap = new SynonymMap&#40;&quot;synonymMapName&quot;, &quot;hotel, motel, &#92;&quot;motor inn&#92;&quot;&quot;&#41;;
 * searchIndexAsyncClient.createSynonymMap&#40;synonymMap&#41;.block&#40;&#41;;
 * </pre>
 * <!-- end com.azure.search.documents.indexes.SearchIndexAsyncClient-classLevelJavaDoc.createSynonymMap#SynonymMap -->
 *
 * <em>
 *     For a synchronous sample see {@link SearchIndexClient#createSynonymMap(SynonymMap)}.
 * </em>
 *
 * <h3>
 *     List Synonym Maps
 * </h3>
 *
 * <p>
 *     The following sample lists all synonym maps.
 * </p>
 *
 *
 * <!-- src_embed com.azure.search.documents.indexes.SearchIndexAsyncClient-classLevelJavaDoc.listSynonymMaps -->
 * <pre>
 * searchIndexAsyncClient.listSynonymMaps&#40;&#41;.subscribe&#40;synonymMap -&gt;
 *     System.out.println&#40;&quot;The synonymMap name is &quot; + synonymMap.getName&#40;&#41;&#41;
 * &#41;;
 * </pre>
 * <!-- end com.azure.search.documents.indexes.SearchIndexAsyncClient-classLevelJavaDoc.listSynonymMaps -->
 *
 * <em>
 *     For a synchronous sample see {@link SearchIndexClient#listSynonymMaps()}.
 * </em>
 *
 * <h3>
 *     Retrieve a Synonym Map
 * </h3>
 *
 * <p>
 *     The following sample retrieves a synonym map.
 * </p>
 *
 * <!-- src_embed com.azure.search.documents.indexes.SearchIndexAsyncClient-classLevelJavaDoc.getSynonymMap#String -->
 * <pre>
 * SynonymMap synonymMap = searchIndexAsyncClient.getSynonymMap&#40;&quot;synonymMapName&quot;&#41;.block&#40;&#41;;
 * if &#40;synonymMap != null&#41; &#123;
 *     System.out.println&#40;&quot;The synonymMap name is &quot; + synonymMap.getName&#40;&#41;&#41;;
 * &#125;
 * </pre>
 * <!-- end com.azure.search.documents.indexes.SearchIndexAsyncClient-classLevelJavaDoc.getSynonymMap#String -->
 *
 * <em>
 *     For a synchronous sample see {@link SearchIndexClient#getSynonymMap(String)}.
 * </em>
 *
 * <h3>
 *     Update a Synonym Map
 * </h3>
 *
 * <p>
 *     The following sample updates a synonym map.
 * </p>
 *
 *
 * <!-- src_embed com.azure.search.documents.indexes.SearchIndexAsyncClient-classLevelJavaDoc.updateSynonymMap#SynonymMap -->
 * <pre>
 * SynonymMap synonymMap = searchIndexAsyncClient.getSynonymMap&#40;&quot;synonymMapName&quot;&#41;.block&#40;&#41;;
 * if &#40;synonymMap != null&#41; &#123;
 *     synonymMap.setSynonyms&#40;&quot;hotel, motel, inn&quot;&#41;;
 *     searchIndexAsyncClient.createOrUpdateSynonymMap&#40;synonymMap&#41;.block&#40;&#41;;
 * &#125;
 * </pre>
 * <!-- end com.azure.search.documents.indexes.SearchIndexAsyncClient-classLevelJavaDoc.updateSynonymMap#SynonymMap -->
 *
 * <em>
 *     For a synchronous sample see {@link SearchIndexClient#createOrUpdateSynonymMap(SynonymMap)}.
 * </em>
 *
 * <h3>
 *     Delete a Synonym Map
 * </h3>
 *
 * <p>
 *     The following sample deletes a synonym map.
 * </p>
 *
 *
 * <!-- src_embed com.azure.search.documents.indexes.SearchIndexAsyncClient-classLevelJavaDoc.deleteSynonymMap#String -->
 * <pre>
 * String synonymMapName = &quot;synonymMapName&quot;;
 * searchIndexAsyncClient.deleteSynonymMap&#40;synonymMapName&#41;.block&#40;&#41;;
 * </pre>
 * <!-- end com.azure.search.documents.indexes.SearchIndexAsyncClient-classLevelJavaDoc.deleteSynonymMap#String -->
 *
 * <em>
 *     For a synchronous sample see {@link SearchIndexClient#deleteSynonymMap(String)}.
 * </em>
 *
 * @see SearchIndexAsyncClient
 * @see SearchIndexClientBuilder
 * @see com.azure.search.documents.indexes
 */
@ServiceClient(builder = SearchIndexClientBuilder.class, isAsync = true)
public final class SearchIndexAsyncClient {
    private static final ClientLogger LOGGER = new ClientLogger(SearchIndexAsyncClient.class);

    /**
     * Search REST API Version
     */
    private final SearchServiceVersion serviceVersion;

    /**
     * The endpoint for the Azure AI Search service.
     */
    private final String endpoint;

    /**
     * The underlying AutoRest client used to interact with the Search service
     */
    private final SearchServiceClientImpl restClient;

    private final JsonSerializer serializer;

    /**
     * The pipeline that powers this client.
     */
    private final HttpPipeline httpPipeline;

    SearchIndexAsyncClient(String endpoint, SearchServiceVersion serviceVersion, HttpPipeline httpPipeline,
        JsonSerializer serializer) {
        this.endpoint = endpoint;
        this.serviceVersion = serviceVersion;
        this.httpPipeline = httpPipeline;
        this.serializer = serializer;
        this.restClient = new SearchServiceClientImpl(httpPipeline, endpoint, serviceVersion.getVersion());
    }

    /**
     * Gets the {@link HttpPipeline} powering this client.
     *
     * @return the pipeline.
     */
    HttpPipeline getHttpPipeline() {
        return this.httpPipeline;
    }

    /**
     * Gets the endpoint for the Azure AI Search service.
     *
     * @return the endpoint value.
     */
    public String getEndpoint() {
        return this.endpoint;
    }

    /**
     * Initializes a new {@link SearchAsyncClient} using the given Index name and the same configuration as the
     * SearchServiceAsyncClient.
     *
     * @param indexName the name of the Index for the client
     * @return a {@link SearchAsyncClient} created from the service client configuration
     */
    public SearchAsyncClient getSearchAsyncClient(String indexName) {
        return getSearchClientBuilder(indexName, endpoint, serviceVersion, httpPipeline, serializer).buildAsyncClient();
    }

    static SearchClientBuilder getSearchClientBuilder(String indexName, String endpoint,
        SearchServiceVersion serviceVersion, HttpPipeline httpPipeline, JsonSerializer serializer) {
        return new SearchClientBuilder().endpoint(endpoint)
            .indexName(indexName)
            .serviceVersion(serviceVersion)
            .pipeline(httpPipeline)
            .serializer(serializer);
    }

    /**
     * Creates a new Azure AI Search index.
     *
     * <p><strong>Code Sample</strong></p>
     *
     * <p> Create search index named "searchIndex". </p>
     *
     * <!-- src_embed com.azure.search.documents.indexes.SearchIndexAsyncClient.createIndex#SearchIndex -->
     * <pre>
     * List&lt;SearchField&gt; searchFields = Arrays.asList&#40;
     *     new SearchField&#40;&quot;hotelId&quot;, SearchFieldDataType.STRING&#41;.setKey&#40;true&#41;,
     *     new SearchField&#40;&quot;hotelName&quot;, SearchFieldDataType.STRING&#41;.setSearchable&#40;true&#41;
     * &#41;;
     * SearchIndex searchIndex = new SearchIndex&#40;&quot;searchIndex&quot;, searchFields&#41;;
     * SEARCH_INDEX_ASYNC_CLIENT.createIndex&#40;searchIndex&#41;
     *     .subscribe&#40;indexFromService -&gt;
     *         System.out.printf&#40;&quot;The index name is %s. The ETag of index is %s.%n&quot;, indexFromService.getName&#40;&#41;,
     *         indexFromService.getETag&#40;&#41;&#41;&#41;;
     * </pre>
     * <!-- end com.azure.search.documents.indexes.SearchIndexAsyncClient.createIndex#SearchIndex -->
     *
     * @param index definition of the index to create.
     * @return the created Index.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SearchIndex> createIndex(SearchIndex index) {
        return createIndexWithResponse(index).map(Response::getValue);
    }

    /**
     * Creates a new Azure AI Search index.
     *
     * <p><strong>Code Sample</strong></p>
     *
     * <p> Create search index named "searchIndex". </p>
     *
     * <!-- src_embed com.azure.search.documents.indexes.SearchIndexAsyncClient.createIndexWithResponse#SearchIndex -->
     * <pre>
     * List&lt;SearchField&gt; searchFields = Arrays.asList&#40;
     *     new SearchField&#40;&quot;hotelId&quot;, SearchFieldDataType.STRING&#41;.setKey&#40;true&#41;,
     *     new SearchField&#40;&quot;hotelName&quot;, SearchFieldDataType.STRING&#41;.setSearchable&#40;true&#41;
     * &#41;;
     * SearchIndex searchIndex = new SearchIndex&#40;&quot;searchIndex&quot;, searchFields&#41;;
     *
     * SEARCH_INDEX_ASYNC_CLIENT.createIndexWithResponse&#40;searchIndex&#41;
     *     .subscribe&#40;indexFromServiceResponse -&gt;
     *         System.out.printf&#40;&quot;The status code of the response is %s. The index name is %s.%n&quot;,
     *         indexFromServiceResponse.getStatusCode&#40;&#41;, indexFromServiceResponse.getValue&#40;&#41;.getName&#40;&#41;&#41;&#41;;
     * </pre>
     * <!-- end com.azure.search.documents.indexes.SearchIndexAsyncClient.createIndexWithResponse#SearchIndex -->
     *
     * @param index definition of the index to create
     * @return a response containing the created Index.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<SearchIndex>> createIndexWithResponse(SearchIndex index) {
        return withContext(context -> createIndexWithResponse(index, context));
    }

    Mono<Response<SearchIndex>> createIndexWithResponse(SearchIndex index, Context context) {
        try {
            Objects.requireNonNull(index, "'Index' cannot be null");
            return restClient.getIndexes()
                .createWithResponseAsync(index, null, context)
                .onErrorMap(MappingUtils::exceptionMapper);
        } catch (RuntimeException ex) {
            return monoError(LOGGER, ex);
        }
    }

    /**
     * Retrieves an index definition from the Azure AI Search.
     *
     * <p><strong>Code Sample</strong></p>
     *
     * <p> Get search index with name "searchIndex". </p>
     *
     * <!-- src_embed com.azure.search.documents.indexes.SearchIndexAsyncClient.getIndex#String -->
     * <pre>
     * SEARCH_INDEX_ASYNC_CLIENT.getIndex&#40;&quot;searchIndex&quot;&#41;
     *     .subscribe&#40;indexFromService -&gt;
     *         System.out.printf&#40;&quot;The index name is %s. The ETag of index is %s.%n&quot;, indexFromService.getName&#40;&#41;,
     *             indexFromService.getETag&#40;&#41;&#41;&#41;;
     * </pre>
     * <!-- end com.azure.search.documents.indexes.SearchIndexAsyncClient.getIndex#String -->
     *
     * @param indexName The name of the index to retrieve
     * @return the Index.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SearchIndex> getIndex(String indexName) {
        return getIndexWithResponse(indexName).map(Response::getValue);
    }

    /**
     * Retrieves an index definition from the Azure AI Search.
     *
     * <p><strong>Code Sample</strong></p>
     *
     * <p> Get search index with "searchIndex. </p>
     *
     * <!-- src_embed com.azure.search.documents.indexes.SearchIndexAsyncClient.getIndexWithResponse#String -->
     * <pre>
     * SEARCH_INDEX_ASYNC_CLIENT.getIndexWithResponse&#40;&quot;searchIndex&quot;&#41;
     *     .subscribe&#40;indexFromServiceResponse -&gt;
     *         System.out.printf&#40;&quot;The status code of the response is %s. The index name is %s.%n&quot;,
     *             indexFromServiceResponse.getStatusCode&#40;&#41;, indexFromServiceResponse.getValue&#40;&#41;.getName&#40;&#41;&#41;&#41;;
     * </pre>
     * <!-- end com.azure.search.documents.indexes.SearchIndexAsyncClient.getIndexWithResponse#String -->
     *
     * @param indexName the name of the index to retrieve
     * @return a response containing the Index.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<SearchIndex>> getIndexWithResponse(String indexName) {
        return withContext(context -> getIndexWithResponse(indexName, context));
    }

    Mono<Response<SearchIndex>> getIndexWithResponse(String indexName, Context context) {
        try {
            return restClient.getIndexes()
                .getWithResponseAsync(indexName, null, context)
                .onErrorMap(MappingUtils::exceptionMapper);
        } catch (RuntimeException ex) {
            return monoError(LOGGER, ex);
        }
    }

    /**
     * Returns statistics for the given index, including a document count and storage usage.
     *
     * <p><strong>Code Sample</strong></p>
     *
     * <p> Get search index "searchIndex" statistics. </p>
     *
     * <!-- src_embed com.azure.search.documents.indexes.SearchIndexAsyncClient.getIndexStatistics#String -->
     * <pre>
     * SEARCH_INDEX_ASYNC_CLIENT.getIndexStatistics&#40;&quot;searchIndex&quot;&#41;
     *     .subscribe&#40;statistics -&gt;
     *         System.out.printf&#40;&quot;There are %d documents and storage size of %d available in 'searchIndex'.%n&quot;,
     *         statistics.getDocumentCount&#40;&#41;, statistics.getStorageSize&#40;&#41;&#41;&#41;;
     * </pre>
     * <!-- end com.azure.search.documents.indexes.SearchIndexAsyncClient.getIndexStatistics#String -->
     *
     * @param indexName the name of the index for which to retrieve statistics
     * @return the index statistics result.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SearchIndexStatistics> getIndexStatistics(String indexName) {
        return getIndexStatisticsWithResponse(indexName).map(Response::getValue);
    }

    /**
     * Returns statistics for the given index, including a document count and storage usage.
     *
     * <p><strong>Code Sample</strong></p>
     *
     * <p> Get search index "searchIndex" statistics. </p>
     *
     * <!-- src_embed com.azure.search.documents.indexes.SearchIndexAsyncClient.getIndexStatisticsWithResponse#String -->
     * <pre>
     * SEARCH_INDEX_ASYNC_CLIENT.getIndexStatisticsWithResponse&#40;&quot;searchIndex&quot;&#41;
     *     .subscribe&#40;statistics -&gt; System.out.printf&#40;&quot;The status code of the response is %s.%n&quot;
     *             + &quot;There are %d documents and storage size of %d available in 'searchIndex'.%n&quot;,
     *         statistics.getStatusCode&#40;&#41;, statistics.getValue&#40;&#41;.getDocumentCount&#40;&#41;,
     *         statistics.getValue&#40;&#41;.getStorageSize&#40;&#41;&#41;&#41;;
     * </pre>
     * <!-- end com.azure.search.documents.indexes.SearchIndexAsyncClient.getIndexStatisticsWithResponse#String -->
     *
     * @param indexName the name of the index for which to retrieve statistics
     * @return a response containing the index statistics result.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<SearchIndexStatistics>> getIndexStatisticsWithResponse(String indexName) {
        return withContext(context -> getIndexStatisticsWithResponse(indexName, context));
    }

    Mono<Response<SearchIndexStatistics>> getIndexStatisticsWithResponse(String indexName, Context context) {
        try {
            return restClient.getIndexes()
                .getStatisticsWithResponseAsync(indexName, null, context)
                .onErrorMap(MappingUtils::exceptionMapper);
        } catch (RuntimeException ex) {
            return monoError(LOGGER, ex);
        }
    }

    /**
     * Lists all indexes available for an Azure AI Search service.
     *
     * <p><strong>Code Sample</strong></p>
     *
     * <p> List all search indexes. </p>
     *
     * <!-- src_embed com.azure.search.documents.indexes.SearchIndexAsyncClient.listIndexes -->
     * <pre>
     * SEARCH_INDEX_ASYNC_CLIENT.listIndexes&#40;&#41;
     *     .subscribe&#40;index -&gt;
     *         System.out.printf&#40;&quot;The index name is %s. The ETag of index is %s.%n&quot;, index.getName&#40;&#41;,
     *             index.getETag&#40;&#41;&#41;&#41;;
     * </pre>
     * <!-- end com.azure.search.documents.indexes.SearchIndexAsyncClient.listIndexes -->
     *
     * @return a reactive response emitting the list of indexes.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<SearchIndex> listIndexes() {
        try {
            return new PagedFlux<>(() -> withContext(context -> this.listIndexesWithResponse(null, context)));
        } catch (RuntimeException ex) {
            return pagedFluxError(LOGGER, ex);
        }
    }

    /**
     * Lists all indexes names for an Azure AI Search service.
     *
     * <p><strong>Code Sample</strong></p>
     *
     * <p> List all search indexes names. </p>
     *
     * <!-- src_embed com.azure.search.documents.indexes.SearchIndexAsyncClient.listIndexNames -->
     * <pre>
     * SEARCH_INDEX_ASYNC_CLIENT.listIndexNames&#40;&#41;
     *     .subscribe&#40;indexName -&gt; System.out.printf&#40;&quot;The index name is %s.%n&quot;, indexName&#41;&#41;;
     * </pre>
     * <!-- end com.azure.search.documents.indexes.SearchIndexAsyncClient.listIndexNames -->
     *
     * @return a reactive response emitting the list of index names.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<String> listIndexNames() {
        try {
            return new PagedFlux<>(() -> withContext(context -> this.listIndexesWithResponse("name", context))
                .map(MappingUtils::mappingPagingSearchIndexNames));
        } catch (RuntimeException ex) {
            return pagedFluxError(LOGGER, ex);
        }
    }

    private Mono<PagedResponse<SearchIndex>> listIndexesWithResponse(String select, Context context) {
        return restClient.getIndexes()
            .listSinglePageAsync(select, null, context)
            .onErrorMap(MappingUtils::exceptionMapper);
    }

    /**
     * Creates a new Azure AI Search index or updates an index if it already exists.
     *
     * <p><strong>Code Sample</strong></p>
     *
     * <p> Create or update search index named "searchIndex". </p>
     *
     * <!-- src_embed com.azure.search.documents.indexes.SearchIndexAsyncClient.createOrUpdateIndex#SearchIndex -->
     * <pre>
     * SEARCH_INDEX_ASYNC_CLIENT.getIndex&#40;&quot;searchIndex&quot;&#41;
     *     .doOnNext&#40;indexFromService -&gt; indexFromService.setSuggesters&#40;Collections.singletonList&#40;
     *         new SearchSuggester&#40;&quot;sg&quot;, Collections.singletonList&#40;&quot;hotelName&quot;&#41;&#41;&#41;&#41;&#41;
     *     .flatMap&#40;SEARCH_INDEX_ASYNC_CLIENT::createOrUpdateIndex&#41;
     *     .subscribe&#40;updatedIndex -&gt;
     *         System.out.printf&#40;&quot;The index name is %s. The suggester name of index is %s.%n&quot;,
     *             updatedIndex.getName&#40;&#41;, updatedIndex.getSuggesters&#40;&#41;.get&#40;0&#41;.getName&#40;&#41;&#41;&#41;;
     * </pre>
     * <!-- end com.azure.search.documents.indexes.SearchIndexAsyncClient.createOrUpdateIndex#SearchIndex -->
     *
     * @param index the definition of the {@link SearchIndex} to create or update.
     * @return the index that was created or updated.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SearchIndex> createOrUpdateIndex(SearchIndex index) {
        return createOrUpdateIndexWithResponse(index, false, false).map(Response::getValue);
    }

    /**
     * Creates a new Azure AI Search index or updates an index if it already exists.
     *
     * <p><strong>Code Sample</strong></p>
     *
     * <p> Create or update search index named "searchIndex". </p>
     *
     * <!-- src_embed com.azure.search.documents.indexes.SearchIndexClient.createOrUpdateIndexWithResponse#SearchIndex-boolean-boolean-Context -->
     * <pre>
     * SearchIndex indexFromService = SEARCH_INDEX_CLIENT.getIndex&#40;&quot;searchIndex&quot;&#41;;
     * indexFromService.setSuggesters&#40;Collections.singletonList&#40;new SearchSuggester&#40;&quot;sg&quot;,
     *     Collections.singletonList&#40;&quot;hotelName&quot;&#41;&#41;&#41;&#41;;
     * Response&lt;SearchIndex&gt; updatedIndexResponse = SEARCH_INDEX_CLIENT.createOrUpdateIndexWithResponse&#40;indexFromService, true,
     *     false, new Context&#40;KEY_1, VALUE_1&#41;&#41;;
     * System.out.printf&#40;&quot;The status code of the normal response is %s.%n&quot;
     *         + &quot;The index name is %s. The ETag of index is %s.%n&quot;, updatedIndexResponse.getStatusCode&#40;&#41;,
     *     updatedIndexResponse.getValue&#40;&#41;.getName&#40;&#41;, updatedIndexResponse.getValue&#40;&#41;.getETag&#40;&#41;&#41;;
     * </pre>
     * <!-- end com.azure.search.documents.indexes.SearchIndexClient.createOrUpdateIndexWithResponse#SearchIndex-boolean-boolean-Context -->
     *
     * @param index the definition of the index to create or update
     * @param allowIndexDowntime allows new analyzers, tokenizers, token filters, or char filters to be added to an
     * index by taking the index offline for at least a few seconds. This temporarily causes indexing and query requests
     * to fail. Performance and write availability of the index can be impaired for several minutes after the index is
     * updated, or longer for very large indexes
     * @param onlyIfUnchanged {@code true} to update if the {@code index} is the same as the current service value.
     * {@code false} to always update existing value.
     * @return a response containing the index that was created or updated
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<SearchIndex>> createOrUpdateIndexWithResponse(SearchIndex index, boolean allowIndexDowntime,
        boolean onlyIfUnchanged) {
        return withContext(
            context -> createOrUpdateIndexWithResponse(index, allowIndexDowntime, onlyIfUnchanged, context));
    }

    Mono<Response<SearchIndex>> createOrUpdateIndexWithResponse(SearchIndex index, boolean allowIndexDowntime,
        boolean onlyIfUnchanged, Context context) {
        try {
            Objects.requireNonNull(index, "'Index' cannot null.");
            String ifMatch = onlyIfUnchanged ? index.getETag() : null;
            return restClient.getIndexes()
                .createOrUpdateWithResponseAsync(index.getName(), index, allowIndexDowntime, ifMatch, null, null,
                    context)
                .onErrorMap(MappingUtils::exceptionMapper);
        } catch (RuntimeException ex) {
            return monoError(LOGGER, ex);
        }
    }

    /**
     * Deletes an Azure AI Search index and all the documents it contains.
     *
     * <p><strong>Code Sample</strong></p>
     *
     * <p> Delete search index with name "searchIndex". </p>
     *
     * <!-- src_embed com.azure.search.documents.indexes.SearchIndexAsyncClient.deleteIndex#String -->
     * <pre>
     * SEARCH_INDEX_ASYNC_CLIENT.deleteIndex&#40;&quot;searchIndex&quot;&#41;
     *     .subscribe&#40;&#41;;
     * </pre>
     * <!-- end com.azure.search.documents.indexes.SearchIndexAsyncClient.deleteIndex#String -->
     *
     * @param indexName the name of the index to delete
     * @return a response signalling completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> deleteIndex(String indexName) {
        return deleteIndexWithResponse(indexName, null, null).flatMap(FluxUtil::toMono);
    }

    /**
     * Deletes an Azure AI Search index and all the documents it contains.
     *
     * <p><strong>Code Sample</strong></p>
     *
     * <p> Delete search index with name "searchIndex". </p>
     *
     * <!-- src_embed com.azure.search.documents.indexes.SearchIndexAsyncClient.deleteIndexWithResponse#SearchIndex-boolean -->
     * <pre>
     * SEARCH_INDEX_ASYNC_CLIENT.getIndex&#40;&quot;searchIndex&quot;&#41;
     *     .flatMap&#40;indexFromService -&gt; SEARCH_INDEX_ASYNC_CLIENT.deleteIndexWithResponse&#40;indexFromService, true&#41;&#41;
     *     .subscribe&#40;deleteResponse -&gt;
     *         System.out.printf&#40;&quot;The status code of the response is %d.%n&quot;, deleteResponse.getStatusCode&#40;&#41;&#41;&#41;;
     * </pre>
     * <!-- end com.azure.search.documents.indexes.SearchIndexAsyncClient.deleteIndexWithResponse#SearchIndex-boolean -->
     *
     * @param index the {@link SearchIndex} to delete.
     * @param onlyIfUnchanged {@code true} to delete if the {@code index} is the same as the current service value.
     * {@code false} to always delete existing value.
     * @return a response signalling completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> deleteIndexWithResponse(SearchIndex index, boolean onlyIfUnchanged) {
        if (index == null) {
            return monoError(LOGGER, new NullPointerException("'index' cannot be null."));
        }

        return withContext(
            context -> deleteIndexWithResponse(index.getName(), onlyIfUnchanged ? index.getETag() : null, context));
    }

    Mono<Response<Void>> deleteIndexWithResponse(String indexName, String eTag, Context context) {
        try {
            return restClient.getIndexes()
                .deleteWithResponseAsync(indexName, eTag, null, null, context)
                .onErrorMap(MappingUtils::exceptionMapper)
                .map(Function.identity());
        } catch (RuntimeException ex) {
            return monoError(LOGGER, ex);
        }
    }

    /**
     * Shows how an analyzer breaks text into tokens.
     *
     * <p><strong>Code Sample</strong></p>
     *
     * <p> Analyzer text with LexicalTokenizerName "Classic" in search index "searchIndex". </p>
     *
     * <!-- src_embed com.azure.search.documents.indexes.SearchIndexAsyncClient.analyzeText#String-AnalyzeTextOptions -->
     * <pre>
     * SEARCH_INDEX_ASYNC_CLIENT.analyzeText&#40;&quot;searchIndex&quot;,
     *     new AnalyzeTextOptions&#40;&quot;The quick brown fox&quot;, LexicalTokenizerName.CLASSIC&#41;&#41;
     *     .subscribe&#40;tokenInfo -&gt;
     *         System.out.printf&#40;&quot;The token emitted by the analyzer is %s.%n&quot;, tokenInfo.getToken&#40;&#41;&#41;&#41;;
     * </pre>
     * <!-- end com.azure.search.documents.indexes.SearchIndexAsyncClient.analyzeText#String-AnalyzeTextOptions -->
     *
     * @param indexName the name of the index for which to test an analyzer
     * @param analyzeTextOptions the text and analyzer or analysis components to test
     * @return a response containing analyze result.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<AnalyzedTokenInfo> analyzeText(String indexName, AnalyzeTextOptions analyzeTextOptions) {
        try {
            return new PagedFlux<>(
                () -> withContext(context -> analyzeTextWithResponse(indexName, analyzeTextOptions, context)));
        } catch (RuntimeException ex) {
            return pagedFluxError(LOGGER, ex);
        }
    }

    private Mono<PagedResponse<AnalyzedTokenInfo>> analyzeTextWithResponse(String indexName,
        AnalyzeTextOptions analyzeTextOptions, Context context) {
        return restClient.getIndexes()
            .analyzeWithResponseAsync(indexName, AnalyzeRequestConverter.map(analyzeTextOptions), null, context)
            .onErrorMap(MappingUtils::exceptionMapper)
            .map(MappingUtils::mappingTokenInfo);
    }

    /**
     * Creates a new Azure AI Search synonym map.
     *
     * <p><strong>Code Sample</strong></p>
     *
     * <p> Create synonym map named "synonymMap". </p>
     *
     * <!-- src_embed com.azure.search.documents.indexes.SearchIndexAsyncClient.createSynonymMap#SynonymMap -->
     * <pre>
     * SynonymMap synonymMap = new SynonymMap&#40;&quot;synonymMap&quot;,
     *     &quot;United States, United States of America, USA&#92;nWashington, Wash. =&gt; WA&quot;&#41;;
     * SEARCH_INDEX_ASYNC_CLIENT.createSynonymMap&#40;synonymMap&#41;
     *     .subscribe&#40;synonymMapFromService -&gt;
     *         System.out.printf&#40;&quot;The synonym map name is %s. The ETag of synonym map is %s.%n&quot;,
     *         synonymMapFromService.getName&#40;&#41;, synonymMapFromService.getETag&#40;&#41;&#41;&#41;;
     * </pre>
     * <!-- end com.azure.search.documents.indexes.SearchIndexAsyncClient.createSynonymMap#SynonymMap -->
     *
     * @param synonymMap the definition of the synonym map to create
     * @return the created {@link SynonymMap}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SynonymMap> createSynonymMap(SynonymMap synonymMap) {
        return createSynonymMapWithResponse(synonymMap).map(Response::getValue);
    }

    /**
     * Creates a new Azure AI Search synonym map.
     *
     * <p><strong>Code Sample</strong></p>
     *
     * <p> Create synonym map named "synonymMap". </p>
     *
     * <!-- src_embed com.azure.search.documents.indexes.SearchIndexAsyncClient.createSynonymMapWithResponse#SynonymMap -->
     * <pre>
     * SynonymMap synonymMap = new SynonymMap&#40;&quot;synonymMap&quot;,
     *     &quot;United States, United States of America, USA&#92;nWashington, Wash. =&gt; WA&quot;&#41;;
     * SEARCH_INDEX_ASYNC_CLIENT.createSynonymMapWithResponse&#40;synonymMap&#41;
     *     .subscribe&#40;synonymMapFromService -&gt;
     *         System.out.printf&#40;&quot;The status code of the response is %d.%n&quot;
     *             + &quot;The synonym map name is %s. The ETag of synonym map is %s.%n&quot;,
     *             synonymMapFromService.getStatusCode&#40;&#41;,
     *         synonymMapFromService.getValue&#40;&#41;.getName&#40;&#41;, synonymMapFromService.getValue&#40;&#41;.getETag&#40;&#41;&#41;&#41;;
     * </pre>
     * <!-- end com.azure.search.documents.indexes.SearchIndexAsyncClient.createSynonymMapWithResponse#SynonymMap -->
     *
     * @param synonymMap the definition of the {@link SynonymMap} to create
     * @return a response containing the created SynonymMap.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<SynonymMap>> createSynonymMapWithResponse(SynonymMap synonymMap) {
        return withContext(context -> createSynonymMapWithResponse(synonymMap, context));
    }

    Mono<Response<SynonymMap>> createSynonymMapWithResponse(SynonymMap synonymMap, Context context) {
        try {
            Objects.requireNonNull(synonymMap, "'synonymMap' cannot be null.");
            return restClient.getSynonymMaps()
                .createWithResponseAsync(synonymMap, null, context)
                .onErrorMap(MappingUtils::exceptionMapper);
        } catch (RuntimeException ex) {
            return monoError(LOGGER, ex);
        }
    }

    /**
     * Retrieves a synonym map definition.
     *
     * <p><strong>Code Sample</strong></p>
     *
     * <p> Get synonym map with name "synonymMap". </p>
     *
     * <!-- src_embed com.azure.search.documents.indexes.SearchIndexAsyncClient.getSynonymMap#String -->
     * <pre>
     * SEARCH_INDEX_ASYNC_CLIENT.getSynonymMap&#40;&quot;synonymMap&quot;&#41;
     *     .subscribe&#40;synonymMapFromService -&gt;
     *         System.out.printf&#40;&quot;The synonym map is %s. The ETag of synonym map is %s.%n&quot;,
     *             synonymMapFromService.getName&#40;&#41;, synonymMapFromService.getETag&#40;&#41;&#41;&#41;;
     * </pre>
     * <!-- end com.azure.search.documents.indexes.SearchIndexAsyncClient.getSynonymMap#String -->
     *
     * @param synonymMapName name of the synonym map to retrieve
     * @return the {@link SynonymMap} definition
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SynonymMap> getSynonymMap(String synonymMapName) {
        return getSynonymMapWithResponse(synonymMapName).map(Response::getValue);
    }

    /**
     * Retrieves a synonym map definition.
     *
     * <p><strong>Code Sample</strong></p>
     *
     * <p> Get synonym map with name "synonymMap". </p>
     *
     * <!-- src_embed com.azure.search.documents.indexes.SearchIndexAsyncClient.getSynonymMap#String -->
     * <pre>
     * SEARCH_INDEX_ASYNC_CLIENT.getSynonymMap&#40;&quot;synonymMap&quot;&#41;
     *     .subscribe&#40;synonymMapFromService -&gt;
     *         System.out.printf&#40;&quot;The synonym map is %s. The ETag of synonym map is %s.%n&quot;,
     *             synonymMapFromService.getName&#40;&#41;, synonymMapFromService.getETag&#40;&#41;&#41;&#41;;
     * </pre>
     * <!-- end com.azure.search.documents.indexes.SearchIndexAsyncClient.getSynonymMap#String -->
     *
     * @param synonymMapName name of the synonym map to retrieve
     * @return a response containing the SynonymMap.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<SynonymMap>> getSynonymMapWithResponse(String synonymMapName) {
        return withContext(context -> getSynonymMapWithResponse(synonymMapName, context));
    }

    Mono<Response<SynonymMap>> getSynonymMapWithResponse(String synonymMapName, Context context) {
        try {
            return restClient.getSynonymMaps()
                .getWithResponseAsync(synonymMapName, null, context)
                .onErrorMap(MappingUtils::exceptionMapper);
        } catch (RuntimeException ex) {
            return monoError(LOGGER, ex);
        }
    }

    /**
     * Lists all synonym maps available for an Azure AI Search service.
     *
     * <p><strong>Code Sample</strong></p>
     *
     * <p> List all synonym maps. </p>
     *
     * <!-- src_embed com.azure.search.documents.indexes.SearchIndexAsyncClient.listSynonymMaps -->
     * <pre>
     * SEARCH_INDEX_ASYNC_CLIENT.listSynonymMaps&#40;&#41;
     *     .subscribe&#40;synonymMap -&gt; System.out.printf&#40;&quot;The synonymMap name is %s. The ETag of synonymMap is %s.%n&quot;,
     *         synonymMap.getName&#40;&#41;, synonymMap.getETag&#40;&#41;&#41;&#41;;
     * </pre>
     * <!-- end com.azure.search.documents.indexes.SearchIndexAsyncClient.listSynonymMaps -->
     *
     * @return a reactive response emitting the list of synonym maps.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<SynonymMap> listSynonymMaps() {
        try {
            return new PagedFlux<>(() -> withContext(context -> listSynonymMapsWithResponse(null, context))
                .map(MappingUtils::mappingPagingSynonymMap));
        } catch (RuntimeException ex) {
            return pagedFluxError(LOGGER, ex);
        }
    }

    /**
     * Lists all synonym map names for an Azure AI Search service.
     *
     * <p><strong>Code Sample</strong></p>
     *
     * <p> List all synonym map names. </p>
     *
     * <!-- src_embed com.azure.search.documents.indexes.SearchIndexAsyncClient.listSynonymMapNames -->
     * <pre>
     * SEARCH_INDEX_ASYNC_CLIENT.listSynonymMapNames&#40;&#41;
     *     .subscribe&#40;synonymMap -&gt; System.out.printf&#40;&quot;The synonymMap name is %s.%n&quot;, synonymMap&#41;&#41;;
     * </pre>
     * <!-- end com.azure.search.documents.indexes.SearchIndexAsyncClient.listSynonymMapNames -->
     *
     * @return a reactive response emitting the list of synonym map names.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<String> listSynonymMapNames() {
        try {
            return new PagedFlux<>(() -> withContext(context -> listSynonymMapsWithResponse("name", context))
                .map(MappingUtils::mappingPagingSynonymMapNames));
        } catch (RuntimeException ex) {
            return pagedFluxError(LOGGER, ex);
        }
    }

    private Mono<Response<ListSynonymMapsResult>> listSynonymMapsWithResponse(String select, Context context) {
        return restClient.getSynonymMaps()
            .listWithResponseAsync(select, null, context)
            .onErrorMap(MappingUtils::exceptionMapper);
    }

    /**
     * Creates a new Azure AI Search synonym map or updates a synonym map if it already exists.
     *
     * <p><strong>Code Sample</strong></p>
     *
     * <p> Create or update synonym map named "synonymMap". </p>
     *
     * <!-- src_embed com.azure.search.documents.indexes.SearchIndexAsyncClient.createOrUpdateSynonymMap#SynonymMap -->
     * <pre>
     * SEARCH_INDEX_ASYNC_CLIENT.getSynonymMap&#40;&quot;searchIndex&quot;&#41;
     *     .doOnNext&#40;synonymMap -&gt; synonymMap
     *         .setSynonyms&#40;&quot;United States, United States of America, USA, America&#92;nWashington, Wash. =&gt; WA&quot;&#41;&#41;
     *     .flatMap&#40;SEARCH_INDEX_ASYNC_CLIENT::createOrUpdateSynonymMap&#41;
     *     .subscribe&#40;updatedSynonymMap -&gt;
     *         System.out.printf&#40;&quot;The synonym map name is %s. The synonyms are %s.%n&quot;, updatedSynonymMap.getName&#40;&#41;,
     *         updatedSynonymMap.getSynonyms&#40;&#41;&#41;&#41;;
     * </pre>
     * <!-- end com.azure.search.documents.indexes.SearchIndexAsyncClient.createOrUpdateSynonymMap#SynonymMap -->
     *
     * @param synonymMap the definition of the {@link SynonymMap} to create or update
     * @return the synonym map that was created or updated.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SynonymMap> createOrUpdateSynonymMap(SynonymMap synonymMap) {
        return createOrUpdateSynonymMapWithResponse(synonymMap, false).map(Response::getValue);
    }

    /**
     * Creates a new Azure AI Search synonym map or updates a synonym map if it already exists.
     *
     * <p><strong>Code Sample</strong></p>
     *
     * <p> Create or update synonym map named "synonymMap". </p>
     *
     * <!-- src_embed com.azure.search.documents.indexes.SearchIndexAsyncClient.createOrUpdateSynonymMapWithResponse#SynonymMap-boolean-Context -->
     * <pre>
     * SEARCH_INDEX_ASYNC_CLIENT.getSynonymMap&#40;&quot;searchIndex&quot;&#41;
     *     .flatMap&#40;synonymMap -&gt; &#123;
     *         synonymMap.setSynonyms&#40;
     *             &quot;United States, United States of America, USA, America&#92;nWashington, Wash. =&gt; WA&quot;&#41;;
     *         return SEARCH_INDEX_ASYNC_CLIENT.createOrUpdateSynonymMapWithResponse&#40;synonymMap, true&#41;;
     *     &#125;&#41;
     *     .subscribe&#40;updatedSynonymMap -&gt;
     *         System.out.printf&#40;&quot;The status code of the normal response is %s.%n&quot;
     *             + &quot;The synonym map name is %s. The synonyms are %s.%n&quot;, updatedSynonymMap.getStatusCode&#40;&#41;,
     *         updatedSynonymMap.getValue&#40;&#41;.getName&#40;&#41;, updatedSynonymMap.getValue&#40;&#41;.getSynonyms&#40;&#41;&#41;&#41;;
     * </pre>
     * <!-- end com.azure.search.documents.indexes.SearchIndexAsyncClient.createOrUpdateSynonymMapWithResponse#SynonymMap-boolean-Context -->
     *
     * @param synonymMap the definition of the {@link SynonymMap} to create or update
     * @param onlyIfUnchanged {@code true} to update if the {@code synonymMap} is the same as the current service value.
     * {@code false} to always update existing value.
     * @return a response containing the synonym map that was created or updated.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<SynonymMap>> createOrUpdateSynonymMapWithResponse(SynonymMap synonymMap,
        boolean onlyIfUnchanged) {
        return withContext(context -> createOrUpdateSynonymMapWithResponse(synonymMap, onlyIfUnchanged, context));
    }

    Mono<Response<SynonymMap>> createOrUpdateSynonymMapWithResponse(SynonymMap synonymMap, boolean onlyIfUnchanged,
        Context context) {
        try {
            Objects.requireNonNull(synonymMap, "'synonymMap' cannot be null.");
            String ifMatch = onlyIfUnchanged ? synonymMap.getETag() : null;
            return restClient.getSynonymMaps()
                .createOrUpdateWithResponseAsync(synonymMap.getName(), synonymMap, ifMatch, null, null, context)
                .onErrorMap(MappingUtils::exceptionMapper);
        } catch (RuntimeException ex) {
            return monoError(LOGGER, ex);
        }
    }

    /**
     * Deletes an Azure AI Search synonym map.
     *
     * <p><strong>Code Sample</strong></p>
     *
     * <p> Delete synonym map with name "synonymMap". </p>
     *
     * <!-- src_embed com.azure.search.documents.indexes.SearchIndexAsyncClient.deleteSynonymMap#String -->
     * <pre>
     * SEARCH_INDEX_ASYNC_CLIENT.deleteSynonymMap&#40;&quot;synonymMap&quot;&#41;
     *     .subscribe&#40;&#41;;
     * </pre>
     * <!-- end com.azure.search.documents.indexes.SearchIndexAsyncClient.deleteSynonymMap#String -->
     *
     * @param synonymMapName the name of the {@link SynonymMap} to delete
     * @return a response signalling completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> deleteSynonymMap(String synonymMapName) {
        return withContext(
            context -> deleteSynonymMapWithResponse(synonymMapName, null, context).flatMap(FluxUtil::toMono));
    }

    /**
     * Deletes an Azure AI Search synonym map.
     *
     * <p><strong>Code Sample</strong></p>
     *
     * <p> Delete synonym map with name "synonymMap". </p>
     *
     * <!-- src_embed com.azure.search.documents.indexes.SearchIndexAsyncClient.deleteSynonymMapWithResponse#SynonymMap-boolean -->
     * <pre>
     * SEARCH_INDEX_ASYNC_CLIENT.getSynonymMap&#40;&quot;synonymMap&quot;&#41;
     *     .flatMap&#40;synonymMap -&gt; SEARCH_INDEX_ASYNC_CLIENT.deleteSynonymMapWithResponse&#40;synonymMap, true&#41;&#41;
     *     .subscribe&#40;response -&gt; System.out.println&#40;&quot;The status code of the response is&quot; + response.getStatusCode&#40;&#41;&#41;&#41;;
     * </pre>
     * <!-- end com.azure.search.documents.indexes.SearchIndexAsyncClient.deleteSynonymMapWithResponse#SynonymMap-boolean -->
     *
     * @param synonymMap the {@link SynonymMap} to delete.
     * @param onlyIfUnchanged {@code true} to delete if the {@code synonymMap} is the same as the current service value.
     * {@code false} to always delete existing value.
     * @return a response signalling completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> deleteSynonymMapWithResponse(SynonymMap synonymMap, boolean onlyIfUnchanged) {
        if (synonymMap == null) {
            return monoError(LOGGER, new NullPointerException("'synonymMap' cannot be null."));
        }

        return withContext(context -> deleteSynonymMapWithResponse(synonymMap.getName(),
            onlyIfUnchanged ? synonymMap.getETag() : null, context));
    }

    /**
     * Convenience method to convert a {@link Class Class's} {@link Field Fields} and {@link Method Methods} into {@link
     * SearchField SearchFields} to help aid the creation of a {@link SearchField} which represents the {@link Class}.
     *
     * @param model The model {@link Class} that will have {@link SearchField SearchFields} generated from its
     * structure.
     * @param options Configuration used to determine generation of the {@link SearchField SearchFields}.
     * @return A list {@link SearchField SearchFields} which represent the model {@link Class}.
     */
    public static List<SearchField> buildSearchFields(Class<?> model, FieldBuilderOptions options) {
        return FieldBuilder.build(model, options);
    }

    Mono<Response<Void>> deleteSynonymMapWithResponse(String synonymMapName, String etag, Context context) {
        try {
            return restClient.getSynonymMaps()
                .deleteWithResponseAsync(synonymMapName, etag, null, null, context)
                .onErrorMap(MappingUtils::exceptionMapper)
                .map(Function.identity());
        } catch (RuntimeException ex) {
            return monoError(LOGGER, ex);
        }
    }

    /**
     * Returns service level statistics for a search service, including service counters and limits.
     * <p>
     * Contains the tracking ID sent with the request to help with debugging
     *
     * <p><strong>Code Sample</strong></p>
     *
     * <p> Get service statistics. </p>
     *
     * <!-- src_embed com.azure.search.documents.indexes.SearchIndexAsyncClient.getServiceStatistics -->
     * <pre>
     * SEARCH_INDEX_ASYNC_CLIENT.getServiceStatistics&#40;&#41;
     *     .subscribe&#40;serviceStatistics -&gt; System.out.printf&#40;&quot;There are %s search indexes in your service.%n&quot;,
     *         serviceStatistics.getCounters&#40;&#41;.getIndexCounter&#40;&#41;&#41;&#41;;
     * </pre>
     * <!-- end com.azure.search.documents.indexes.SearchIndexAsyncClient.getServiceStatistics -->
     *
     * @return the search service statistics result.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SearchServiceStatistics> getServiceStatistics() {
        return getServiceStatisticsWithResponse().map(Response::getValue);
    }

    /**
     * Returns service level statistics for a search service, including service counters and limits.
     *
     * <p><strong>Code Sample</strong></p>
     *
     * <p> Get service statistics. </p>
     *
     * <!-- src_embed com.azure.search.documents.indexes.SearchIndexAsyncClient.getServiceStatisticsWithResponse -->
     * <pre>
     * SEARCH_INDEX_ASYNC_CLIENT.getServiceStatisticsWithResponse&#40;&#41;
     *     .subscribe&#40;serviceStatistics -&gt;
     *         System.out.printf&#40;&quot;The status code of the response is %s.%n&quot;
     *                 + &quot;There are %s search indexes in your service.%n&quot;,
     *         serviceStatistics.getStatusCode&#40;&#41;,
     *         serviceStatistics.getValue&#40;&#41;.getCounters&#40;&#41;.getIndexCounter&#40;&#41;&#41;&#41;;
     * </pre>
     * <!-- end com.azure.search.documents.indexes.SearchIndexAsyncClient.getServiceStatisticsWithResponse -->
     *
     * @return the search service statistics result.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<SearchServiceStatistics>> getServiceStatisticsWithResponse() {
        return withContext(this::getServiceStatisticsWithResponse);
    }

    Mono<Response<SearchServiceStatistics>> getServiceStatisticsWithResponse(Context context) {
        try {
            return restClient.getServiceStatisticsWithResponseAsync(null, context)
                .onErrorMap(MappingUtils::exceptionMapper);
        } catch (RuntimeException ex) {
            return monoError(LOGGER, ex);
        }
    }

    /**
     * Retrieves a summary of statistics for all indexes in the search service.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response from a request to retrieve stats summary of all indexes as paginated response with
     * {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<IndexStatisticsSummary> getIndexStatsSummary() {
        return getIndexStatsSummary(Context.NONE);
    }

    PagedFlux<IndexStatisticsSummary> getIndexStatsSummary(Context context) {
        try {
            return restClient.getIndexStatsSummaryAsync(null, context);
        } catch (RuntimeException ex) {
            RuntimeException mappedException = (RuntimeException) MappingUtils.exceptionMapper(ex);
            return pagedFluxError(LOGGER, mappedException);
        }
    }

    /**
     * Creates a new agent.
     * 
     * @param knowledgeAgent The definition of the agent to create.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<KnowledgeAgent> createKnowledgeAgent(KnowledgeAgent knowledgeAgent) {
        return createKnowledgeAgentWithResponse(knowledgeAgent, Context.NONE).map(Response::getValue);
    }

    /**
     * Creates a new agent.
     * 
     * @param knowledgeAgent The definition of the agent to create.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<KnowledgeAgent>> createKnowledgeAgentWithResponse(KnowledgeAgent knowledgeAgent) {
        return withContext(context -> createKnowledgeAgentWithResponse(knowledgeAgent, context));
    }

    Mono<Response<KnowledgeAgent>> createKnowledgeAgentWithResponse(KnowledgeAgent knowledgeAgent, Context context) {
        try {
            return restClient.getKnowledgeAgents()
                .createWithResponseAsync(knowledgeAgent, null, context)
                .onErrorMap(MappingUtils::exceptionMapper);
        } catch (RuntimeException ex) {
            return monoError(LOGGER, ex);
        }
    }

    /**
     * Creates a new agent or updates an agent if it already exists.
     * 
     * @param agentName The name of the agent to create or update.
     * @param knowledgeAgent The definition of the agent to create or update.
     * @param ifMatch Defines the If-Match condition. The operation will be performed only if the ETag on the server
     * matches this value.
     * @param ifNoneMatch Defines the If-None-Match condition. The operation will be performed only if the ETag on the
     * server does not match this value.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<KnowledgeAgent> createOrUpdateKnowledgeAgent(String agentName, KnowledgeAgent knowledgeAgent,
        String ifMatch, String ifNoneMatch) {
        return createOrUpdateKnowledgeAgentWithResponse(agentName, knowledgeAgent, ifMatch, ifNoneMatch, Context.NONE)
            .map(Response::getValue);
    }

    /**
     * Creates a new agent or updates an agent if it already exists.
     * 
     * @param agentName The name of the agent to create or update.
     * @param knowledgeAgent The definition of the agent to create or update.
     * @param ifMatch Defines the If-Match condition. The operation will be performed only if the ETag on the server
     * matches this value.
     * @param ifNoneMatch Defines the If-None-Match condition. The operation will be performed only if the ETag on the
     * server does not match this value.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<KnowledgeAgent>> createOrUpdateKnowledgeAgentWithResponse(String agentName,
        KnowledgeAgent knowledgeAgent, String ifMatch, String ifNoneMatch) {
        return withContext(context -> createOrUpdateKnowledgeAgentWithResponse(agentName, knowledgeAgent, ifMatch,
            ifNoneMatch, context));
    }

    Mono<Response<KnowledgeAgent>> createOrUpdateKnowledgeAgentWithResponse(String agentName,
        KnowledgeAgent knowledgeAgent, String ifMatch, String ifNoneMatch, Context context) {
        try {
            return restClient.getKnowledgeAgents()
                .createOrUpdateWithResponseAsync(agentName, knowledgeAgent, ifMatch, null, null, context)
                .onErrorMap(MappingUtils::exceptionMapper);
        } catch (RuntimeException ex) {
            return monoError(LOGGER, ex);
        }
    }

    /**
     * Retrieves an agent definition.
     * 
     * @param agentName The name of the agent to retrieve.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<KnowledgeAgent> getKnowledgeAgent(String agentName) {
        return getKnowledgeAgentWithResponse(agentName, Context.NONE).map(Response::getValue);

    }

    /**
     * Retrieves an agent definition.
     * 
     * @param agentName The name of the agent to retrieve.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<KnowledgeAgent>> getKnowledgeAgentWithResponse(String agentName) {
        return withContext(context -> getKnowledgeAgentWithResponse(agentName, context));
    }

    Mono<Response<KnowledgeAgent>> getKnowledgeAgentWithResponse(String agentName, Context context) {
        try {
            return restClient.getKnowledgeAgents()
                .getWithResponseAsync(agentName, null, context)
                .onErrorMap(MappingUtils::exceptionMapper);
        } catch (RuntimeException ex) {
            return monoError(LOGGER, ex);
        }
    }

    /**
     * Lists all agents available for a search service.
     * 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the paginated response with {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<KnowledgeAgent> listKnowledgeAgents() {
        try {
            return restClient.getKnowledgeAgents().listAsync(null, Context.NONE);
        } catch (RuntimeException ex) {
            RuntimeException mappedException = (RuntimeException) MappingUtils.exceptionMapper(ex);
            return pagedFluxError(LOGGER, mappedException);
        }
    }

    /**
     * Deletes an existing agent.
     * 
     * @param agentName The name of the agent to delete.
     * @param ifMatch Defines the If-Match condition. The operation will be performed only if the ETag on the server
     * matches this value.
     * @param ifNoneMatch Defines the If-None-Match condition. The operation will be performed only if the ETag on the
     * server does not match this value.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return A {@link Mono} that completes when a successful response is received.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> deleteKnowledgeAgent(String agentName, String ifMatch, String ifNoneMatch) {
        return deleteKnowledgeAgentWithResponse(agentName, ifMatch, ifNoneMatch, Context.NONE)
            .flatMap(FluxUtil::toMono);
    }

    /**
     * Deletes an existing agent.
     * 
     * @param agentName The name of the agent to delete.
     * @param ifMatch Defines the If-Match condition. The operation will be performed only if the ETag on the server
     * matches this value.
     * @param ifNoneMatch Defines the If-None-Match condition. The operation will be performed only if the ETag on the
     * server does not match this value.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> deleteKnowledgeAgentWithResponse(String agentName, String ifMatch, String ifNoneMatch) {
        return withContext(context -> deleteKnowledgeAgentWithResponse(agentName, ifMatch, ifNoneMatch, context));
    }

    Mono<Response<Void>> deleteKnowledgeAgentWithResponse(String agentName, String ifMatch, String ifNoneMatch,
        Context context) {
        try {
            return restClient.getKnowledgeAgents()
                .deleteWithResponseAsync(agentName, ifMatch, ifNoneMatch, null, context)
                .onErrorMap(MappingUtils::exceptionMapper);
        } catch (RuntimeException ex) {
            return monoError(LOGGER, ex);
        }

    }
}
