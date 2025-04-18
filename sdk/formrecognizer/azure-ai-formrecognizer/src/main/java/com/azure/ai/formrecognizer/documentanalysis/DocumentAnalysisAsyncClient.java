// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.ai.formrecognizer.documentanalysis;

import com.azure.ai.formrecognizer.FormRecognizerClient;
import com.azure.ai.formrecognizer.documentanalysis.administration.models.OperationStatus;
import com.azure.ai.formrecognizer.documentanalysis.implementation.DocumentClassifiersImpl;
import com.azure.ai.formrecognizer.documentanalysis.implementation.DocumentModelsImpl;
import com.azure.ai.formrecognizer.documentanalysis.implementation.FormRecognizerClientImpl;
import com.azure.ai.formrecognizer.documentanalysis.implementation.models.AnalyzeDocumentRequest;
import com.azure.ai.formrecognizer.documentanalysis.implementation.models.AnalyzeResultOperation;
import com.azure.ai.formrecognizer.documentanalysis.implementation.models.ClassifyDocumentRequest;
import com.azure.ai.formrecognizer.documentanalysis.implementation.models.StringIndexType;
import com.azure.ai.formrecognizer.documentanalysis.implementation.util.Transforms;
import com.azure.ai.formrecognizer.documentanalysis.models.AnalyzeDocumentOptions;
import com.azure.ai.formrecognizer.documentanalysis.models.AnalyzeResult;
import com.azure.ai.formrecognizer.documentanalysis.models.OperationResult;
import com.azure.ai.formrecognizer.training.FormTrainingClient;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceClient;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.exception.HttpResponseException;
import com.azure.core.http.HttpPipeline;
import com.azure.core.http.rest.Response;
import com.azure.core.util.BinaryData;
import com.azure.core.util.Context;
import com.azure.core.util.CoreUtils;
import com.azure.core.util.logging.ClientLogger;
import com.azure.core.util.polling.LongRunningOperationStatus;
import com.azure.core.util.polling.PollResponse;
import com.azure.core.util.polling.PollerFlux;
import com.azure.core.util.polling.PollingContext;
import reactor.core.publisher.Mono;

import java.io.InputStream;
import java.util.function.Function;

import static com.azure.ai.formrecognizer.documentanalysis.implementation.util.Constants.DEFAULT_POLL_INTERVAL;
import static com.azure.ai.formrecognizer.documentanalysis.implementation.util.Utility.activationOperation;
import static com.azure.ai.formrecognizer.documentanalysis.implementation.util.Utility.getAnalyzeDocumentOptions;
import static com.azure.core.util.FluxUtil.monoError;

/**
 * <p>This class provides an asynchronous client to connect to the Form Recognizer Azure Cognitive Service.</p>
 * <p>This client provides asynchronous methods to perform:</p>
 *
 * <ol>
 *     <li>Custom Document Analysis: Classification, extraction and analysis of data from forms and documents specific
 *     to distinct business data and use cases. Use the custom trained model by passing its modelId into the
 *     {@link #beginAnalyzeDocument(String, BinaryData)} method.</li>
 *     <li>General Document Analysis: Extract text, tables, structure, and key-value pairs. Use general document model
 *     provided by the Form Recognizer service by passing modelId="rebuilt-document" into the
 *     {@link #beginAnalyzeDocument(String, BinaryData)} method.</li>
 *     <li>Prebuilt Model Analysis: Analyze receipts, business cards, invoices, ID's, W2's and other documents with
 *     <a href="https://aka.ms/azsdk/formrecognizer/models">supported prebuilt models. Use the prebuilt receipt model
 *     provided by passing modelId="prebuilt-receipt" into the {@link #beginAnalyzeDocument(String, BinaryData)}
 *     method.</a></li>
 *     <li>Layout Analysis: Extract text, selection marks, and tables structures, along with their bounding box
 *     coordinates, from forms and documents. Use the layout analysis model provided the service by passing
 *     modelId="prebuilt-layout" into the {@link #beginAnalyzeDocument(String, BinaryData)} method.</li>
 *     <li>Polling and Callbacks: It includes mechanisms for polling the service to check the status of an analysis
 *     operation or registering callbacks to receive notifications when the analysis is complete.</li>
 * </ol>
 *
 * <p>This client also provides different methods based on inputs from a URL and inputs from a stream.</p>
 *
 * <p><strong>Note: </strong>This client only supports {@link DocumentAnalysisServiceVersion#V2022_08_31} and newer.
 * To use an older service version, {@link FormRecognizerClient} and {@link FormTrainingClient}.</p>
 *
 * <p>Service clients are the point of interaction for developers to use Azure Form Recognizer.
 * {@link DocumentAnalysisClient} is the synchronous service client and {@link DocumentAnalysisAsyncClient} is the
 * asynchronous service client. The examples shown in this document use a credential object named DefaultAzureCredential
 * for authentication, which is appropriate for most scenarios, including local development and production environments.
 * Additionally, we recommend using
 * <a href="https://learn.microsoft.com/azure/active-directory/managed-identities-azure-resources/">managed identity</a>
 * for authentication in production environments.
 * You can find more information on different ways of authenticating and their corresponding credential types in the
 * <a href="https://learn.microsoft.com/java/api/overview/azure/identity-readme">Azure Identity documentation"</a>.
 * </p>
 *
 * <p><strong>Sample: Construct a DocumentAnalysisAsyncClient with DefaultAzureCredential</strong></p>
 *
 * <p>The following code sample demonstrates the creation of a
 * {@link com.azure.ai.formrecognizer.documentanalysis.DocumentAnalysisAsyncClient}, using
 * the `DefaultAzureCredentialBuilder` to configure it.</p>
 *
 * <!-- src_embed readme-sample-createDocumentAnalysisAsyncClientWithAAD -->
 * <pre>
 * DocumentAnalysisAsyncClient documentAnalysisAsyncClient = new DocumentAnalysisClientBuilder&#40;&#41;
 *     .endpoint&#40;&quot;&#123;endpoint&#125;&quot;&#41;
 *     .credential&#40;new DefaultAzureCredentialBuilder&#40;&#41;.build&#40;&#41;&#41;
 *     .buildAsyncClient&#40;&#41;;
 * </pre>
 * <!-- end readme-sample-createDocumentAnalysisAsyncClientWithAAD  -->
 *
 * <p>Further, see the code sample below to use
 * {@link com.azure.core.credential.AzureKeyCredential AzureKeyCredential} for client creation.</p>
 *
 * <!-- src_embed readme-sample-asyncClient -->
 * <pre>
 * DocumentAnalysisAsyncClient documentAnalysisAsyncClient = new DocumentAnalysisClientBuilder&#40;&#41;
 *     .credential&#40;new AzureKeyCredential&#40;&quot;&#123;key&#125;&quot;&#41;&#41;
 *     .endpoint&#40;&quot;&#123;endpoint&#125;&quot;&#41;
 *     .buildAsyncClient&#40;&#41;;
 * </pre>
 * <!-- end readme-sample-asyncClient  -->
 *
 * @see com.azure.ai.formrecognizer.documentanalysis
 * @see DocumentAnalysisClientBuilder
 * @see DocumentAnalysisClient
 */
@ServiceClient(builder = DocumentAnalysisClientBuilder.class, isAsync = true)
public final class DocumentAnalysisAsyncClient {
    private final ClientLogger logger = new ClientLogger(DocumentAnalysisAsyncClient.class);
    private final DocumentModelsImpl documentModelsImpl;
    private final DocumentClassifiersImpl documentClassifiersImpl;
    private final DocumentAnalysisServiceVersion serviceVersion;

    /**
     * Create a {@link DocumentAnalysisAsyncClient} that sends requests to the Form recognizer service's endpoint. Each
     * service call goes through the {@link DocumentAnalysisClientBuilder#pipeline(HttpPipeline)} http pipeline.
     *
     * @param formRecognizerClientImpl The proxy service used to perform REST calls.
     * @param serviceVersion The versions of Azure Form Recognizer service supported by this client library.
     */
    DocumentAnalysisAsyncClient(FormRecognizerClientImpl formRecognizerClientImpl,
        DocumentAnalysisServiceVersion serviceVersion) {
        this.documentModelsImpl = formRecognizerClientImpl.getDocumentModels();
        this.documentClassifiersImpl = formRecognizerClientImpl.getDocumentClassifiers();
        this.serviceVersion = serviceVersion;
    }

    /**
     * Analyzes data from documents with optical character recognition (OCR) and semantic values from a given document
     * using any of the prebuilt models or a custom-built analysis model.
     * <p>The service does not support cancellation of the long running operation and returns with an
     * error message indicating absence of cancellation support.</p>
     *
     * <p><strong>Code sample</strong></p>
     * <p> Analyze a document using the URL of the document. </p>
     * <!-- src_embed com.azure.ai.formrecognizer.documentanalysis.DocumentAnalysisAsyncClient.beginAnalyzeDocumentFromUrl#string-string -->
     * <pre>
     * String documentUrl = &quot;&#123;document_url&#125;&quot;;
     * String modelId = &quot;&#123;model_id&#125;&quot;;
     * documentAnalysisAsyncClient.beginAnalyzeDocumentFromUrl&#40;modelId, documentUrl&#41;
     *     &#47;&#47; if polling operation completed, retrieve the final result.
     *     .flatMap&#40;AsyncPollResponse::getFinalResult&#41;
     *     .subscribe&#40;analyzeResult -&gt;
     *         analyzeResult.getDocuments&#40;&#41;
     *             .forEach&#40;document -&gt;
     *                 document.getFields&#40;&#41;
     *                     .forEach&#40;&#40;key, documentField&#41; -&gt; &#123;
     *                         System.out.printf&#40;&quot;Field text: %s%n&quot;, key&#41;;
     *                         System.out.printf&#40;&quot;Field value data content: %s%n&quot;, documentField.getContent&#40;&#41;&#41;;
     *                         System.out.printf&#40;&quot;Confidence score: %.2f%n&quot;, documentField.getConfidence&#40;&#41;&#41;;
     *                     &#125;&#41;&#41;&#41;;
     * </pre>
     * <!-- end com.azure.ai.formrecognizer.documentanalysis.DocumentAnalysisAsyncClient.beginAnalyzeDocumentFromUrl#string-string -->
     *
     * @param modelId The unique model ID to be used. Use this to specify the custom model ID or prebuilt model ID.
     * Prebuilt model IDs supported can be found <a href="https://aka.ms/azsdk/formrecognizer/models">here</a>
     * @param documentUrl The URL of the document to analyze.
     *
     * @return A {@link PollerFlux} that polls the progress of the analyze document operation until it has completed, has failed,
     * or has been cancelled. The completed operation returns an {@link AnalyzeResult}.
     * @throws HttpResponseException If analyze operation fails and the {@link AnalyzeResultOperation} returns
     * with an {@link OperationStatus#FAILED}..
     * @throws IllegalArgumentException If {@code documentUrl} or {@code modelId} is null.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    public PollerFlux<OperationResult, AnalyzeResult> beginAnalyzeDocumentFromUrl(String modelId, String documentUrl) {
        return beginAnalyzeDocumentFromUrl(modelId, documentUrl, null);
    }

    /**
     * Analyzes data from documents with optical character recognition (OCR) and semantic values from a given document
     * using any of the prebuilt models or a custom-built analysis model.
     * <p>The service does not support cancellation of the long running operation and returns with an
     * error message indicating absence of cancellation support.</p>
     *
     * <p><strong>Code sample</strong></p>
     * <p> Analyze a document using the URL of the document with configurable options. </p>
     * <!-- src_embed com.azure.ai.formrecognizer.documentanalysis.DocumentAnalysisAsyncClient.beginAnalyzeDocumentFromUrl#string-string-Options -->
     * <pre>
     * String documentUrl = &quot;&#123;document_url&#125;&quot;;
     * &#47;&#47; analyze a receipt using prebuilt model
     * String modelId = &quot;prebuilt-receipt&quot;;
     *
     * documentAnalysisAsyncClient.beginAnalyzeDocumentFromUrl&#40;modelId, documentUrl,
     *         new AnalyzeDocumentOptions&#40;&#41;.setPages&#40;Arrays.asList&#40;&quot;1&quot;, &quot;3&quot;&#41;&#41;&#41;
     *     &#47;&#47; if polling operation completed, retrieve the final result.
     *     .flatMap&#40;AsyncPollResponse::getFinalResult&#41;
     *     .subscribe&#40;analyzeResult -&gt; &#123;
     *         System.out.println&#40;analyzeResult.getModelId&#40;&#41;&#41;;
     *         analyzeResult.getDocuments&#40;&#41;
     *             .forEach&#40;document -&gt;
     *                 document.getFields&#40;&#41;
     *                     .forEach&#40;&#40;key, documentField&#41; -&gt; &#123;
     *                         System.out.printf&#40;&quot;Field text: %s%n&quot;, key&#41;;
     *                         System.out.printf&#40;&quot;Field value data content: %s%n&quot;, documentField.getContent&#40;&#41;&#41;;
     *                         System.out.printf&#40;&quot;Confidence score: %.2f%n&quot;, documentField.getConfidence&#40;&#41;&#41;;
     *                     &#125;&#41;&#41;;
     *     &#125;&#41;;
     *
     * </pre>
     * <!-- end com.azure.ai.formrecognizer.documentanalysis.DocumentAnalysisAsyncClient.beginAnalyzeDocumentFromUrl#string-string-Options -->
     *
     * @param modelId The unique model ID to be used. Use this to specify the custom model ID or prebuilt model ID.
     * Prebuilt model IDs supported can be found <a href="https://aka.ms/azsdk/formrecognizer/models">here</a>
     * @param documentUrl The source URL to the input form.
     * @param analyzeDocumentOptions The additional configurable {@link AnalyzeDocumentOptions options}
     * that may be passed when analyzing documents.
     * @return A {@link PollerFlux} that polls progress of the analyze document operation until it has completed,
     * has failed, or has been cancelled. The completed operation returns an {@link AnalyzeResult}.
     * @throws HttpResponseException If analyze operation fails and the {@link AnalyzeResultOperation} returns
     * with an {@link OperationStatus#FAILED}.
     * @throws IllegalArgumentException If {@code documentUrl} or {@code modelId} is null.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    public PollerFlux<OperationResult, AnalyzeResult> beginAnalyzeDocumentFromUrl(String modelId, String documentUrl,
        AnalyzeDocumentOptions analyzeDocumentOptions) {
        return beginAnalyzeDocumentFromUrl(documentUrl, modelId, analyzeDocumentOptions, Context.NONE);
    }

    private PollerFlux<OperationResult, AnalyzeResult> beginAnalyzeDocumentFromUrl(String documentUrl, String modelId,
        AnalyzeDocumentOptions analyzeDocumentOptions, Context context) {
        try {
            if (CoreUtils.isNullOrEmpty(documentUrl)) {
                return PollerFlux.error(logger.logExceptionAsError(
                    new IllegalArgumentException("'documentUrl' is required and cannot be null or empty")));
            }
            if (CoreUtils.isNullOrEmpty(modelId)) {
                return PollerFlux.error(logger.logExceptionAsError(
                    new IllegalArgumentException("'modelId' is required and cannot be null or empty")));
            }
            final AnalyzeDocumentOptions finalAnalyzeDocumentOptions
                = getAnalyzeDocumentOptions(analyzeDocumentOptions);
            String pages = CoreUtils.isNullOrEmpty(finalAnalyzeDocumentOptions.getPages())
                ? null
                : CoreUtils.stringJoin(",", finalAnalyzeDocumentOptions.getPages());

            return new PollerFlux<>(DEFAULT_POLL_INTERVAL,
                activationOperation(() -> documentModelsImpl
                    .analyzeDocumentWithResponseAsync(modelId, pages, finalAnalyzeDocumentOptions.getLocale(),
                        StringIndexType.UTF16CODE_UNIT, finalAnalyzeDocumentOptions.getDocumentAnalysisFeatures(),
                        new AnalyzeDocumentRequest().setUrlSource(documentUrl), context)
                    .map(analyzeDocumentResponse -> Transforms.toDocumentOperationResult(
                        analyzeDocumentResponse.getDeserializedHeaders().getOperationLocation())),
                    logger),
                pollingOperation(
                    resultId -> documentModelsImpl.getAnalyzeResultWithResponseAsync(modelId, resultId, context)),
                (activationResponse, pollingContext) -> Mono
                    .error(new RuntimeException("Cancellation is not supported")),
                fetchingOperation(
                    resultId -> documentModelsImpl.getAnalyzeResultWithResponseAsync(modelId, resultId, context))
                        .andThen(after -> after
                            .map(modelSimpleResponse -> Transforms
                                .toAnalyzeResultOperation(modelSimpleResponse.getValue().getAnalyzeResult()))
                            .onErrorMap(Transforms::mapToHttpResponseExceptionIfExists)));
        } catch (RuntimeException ex) {
            return PollerFlux.error(ex);
        }
    }

    /**
     * Analyzes data from documents with optical character recognition (OCR) and semantic values from a given document
     * using any of the prebuilt models or a custom-built analysis model.
     * <p>The service does not support cancellation of the long running operation and returns with an
     * error message indicating absence of cancellation support.</p>
     * <p>
     * Note that the {@code data} passed must be replayable if retries are enabled (the default). In other words, the
     * {@code Flux} must produce the same data each time it is subscribed to.
     *
     * <p><strong>Code sample</strong></p>
     * <p> Analyze a document. </p>
     * <!-- src_embed com.azure.ai.formrecognizer.documentanalysis.DocumentAnalysisAsyncClient.beginAnalyzeDocument#string-BinaryData -->
     * <pre>
     * File document = new File&#40;&quot;&#123;local&#47;file_path&#47;fileName.jpg&#125;&quot;&#41;;
     * String modelId = &quot;&#123;model_id&#125;&quot;;
     * &#47;&#47; Utility method to convert input stream to Binary Data
     * BinaryData buffer = BinaryData.fromStream&#40;new ByteArrayInputStream&#40;Files.readAllBytes&#40;document.toPath&#40;&#41;&#41;&#41;&#41;;
     *
     * documentAnalysisAsyncClient.beginAnalyzeDocument&#40;modelId, buffer&#41;
     *     &#47;&#47; if polling operation completed, retrieve the final result.
     *     .flatMap&#40;AsyncPollResponse::getFinalResult&#41;
     *     .subscribe&#40;analyzeResult -&gt;
     *         analyzeResult.getDocuments&#40;&#41;
     *             .forEach&#40;analyzedDocument -&gt;
     *                 analyzedDocument.getFields&#40;&#41;
     *                     .forEach&#40;&#40;key, documentField&#41; -&gt; &#123;
     *                         System.out.printf&#40;&quot;Field text: %s%n&quot;, key&#41;;
     *                         System.out.printf&#40;&quot;Field value data content: %s%n&quot;, documentField.getContent&#40;&#41;&#41;;
     *                         System.out.printf&#40;&quot;Confidence score: %.2f%n&quot;, documentField.getConfidence&#40;&#41;&#41;;
     *                     &#125;&#41;&#41;&#41;;
     * </pre>
     * <!-- end com.azure.ai.formrecognizer.documentanalysis.DocumentAnalysisAsyncClient.beginAnalyzeDocument#string-BinaryData -->
     *
     * @param modelId The unique model ID to be used. Use this to specify the custom model ID or prebuilt model ID.
     * Prebuilt model IDs supported can be found <a href="https://aka.ms/azsdk/formrecognizer/models">here</a>
     * @param document The data of the document to analyze information from.
     * @return A {@link PollerFlux} that polls the progress of the analyze document operation until it has completed,
     * has failed, or has been cancelled. The completed operation returns an {@link AnalyzeResult}.
     * @throws HttpResponseException If analyze operation fails and returns with an {@link OperationStatus#FAILED}.
     * @throws IllegalArgumentException If {@code document} or {@code modelId} is null.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    public PollerFlux<OperationResult, AnalyzeResult> beginAnalyzeDocument(String modelId, BinaryData document) {
        return beginAnalyzeDocument(modelId, document, null);
    }

    /**
     * Analyzes data from documents with optical character recognition (OCR) and semantic values from a given document
     * using any of the prebuilt models or a custom-built analysis model.
     * <p>The service does not support cancellation of the long running operation and returns with an
     * error message indicating absence of cancellation support.</p>
     * <p>
     * Note that the {@code data} passed must be replayable if retries are enabled (the default). In other words, the
     * {@code Flux} must produce the same data each time it is subscribed to.
     *
     * <p><strong>Code sample</strong></p>
     * <p> Analyze a document with configurable options. . </p>
     * <!-- src_embed com.azure.ai.formrecognizer.documentanalysis.DocumentAnalysisAsyncClient.beginAnalyzeDocument#string-BinaryData-Options -->
     * <pre>
     * File document = new File&#40;&quot;&#123;local&#47;file_path&#47;fileName.jpg&#125;&quot;&#41;;
     * String modelId = &quot;&#123;model_id&#125;&quot;;
     * final AnalyzeDocumentOptions analyzeDocumentOptions =
     *     new AnalyzeDocumentOptions&#40;&#41;.setPages&#40;Arrays.asList&#40;&quot;1&quot;, &quot;3&quot;&#41;&#41;.setDocumentAnalysisFeatures&#40;
     *         Collections.singletonList&#40;
     *             DocumentAnalysisFeature.FORMULAS&#41;&#41;;
     *
     * &#47;&#47; Utility method to convert input stream to Binary Data
     * BinaryData buffer = BinaryData.fromStream&#40;new ByteArrayInputStream&#40;Files.readAllBytes&#40;document.toPath&#40;&#41;&#41;&#41;&#41;;
     *
     * documentAnalysisAsyncClient.beginAnalyzeDocument&#40;modelId, buffer, analyzeDocumentOptions&#41;
     *     &#47;&#47; if polling operation completed, retrieve the final result.
     *     .flatMap&#40;AsyncPollResponse::getFinalResult&#41;
     *     .subscribe&#40;analyzeResult -&gt; &#123;
     *         System.out.println&#40;analyzeResult.getModelId&#40;&#41;&#41;;
     *         analyzeResult.getDocuments&#40;&#41;
     *             .forEach&#40;analyzedDocument -&gt;
     *                 analyzedDocument.getFields&#40;&#41;
     *                     .forEach&#40;&#40;key, documentField&#41; -&gt; &#123;
     *                         System.out.printf&#40;&quot;Field text: %s%n&quot;, key&#41;;
     *                         System.out.printf&#40;&quot;Field value data content: %s%n&quot;, documentField.getContent&#40;&#41;&#41;;
     *                         System.out.printf&#40;&quot;Confidence score: %.2f%n&quot;, documentField.getConfidence&#40;&#41;&#41;;
     *                     &#125;&#41;&#41;;
     *     &#125;&#41;;
     * </pre>
     * <!-- end com.azure.ai.formrecognizer.documentanalysis.DocumentAnalysisAsyncClient.beginAnalyzeDocument#string-BinaryData-Options -->
     *
     * @param modelId The unique model ID to be used. Use this to specify the custom model ID or prebuilt model ID.
     * Prebuilt model IDs supported can be found <a href="https://aka.ms/azsdk/formrecognizer/models">here</a>
     * @param document The data of the document to analyze information from.
     * @param analyzeDocumentOptions The additional configurable {@link AnalyzeDocumentOptions options} that may be
     * passed when analyzing documents.
     * @return A {@link PollerFlux} that polls the progress of the analyze document operation until it has completed,
     * has failed, or has been cancelled. The completed operation returns an {@link AnalyzeResult}.
     * @throws HttpResponseException If analyze operation fails and returns with an {@link OperationStatus#FAILED}.
     * @throws IllegalArgumentException If {@code document} or {@code modelId} is null.
     * @throws IllegalArgumentException If {@code document} length is null or unspecified.
     * Use {@link BinaryData#fromStream(InputStream, Long)} to create an instance of the {@code document}
     * from given {@link InputStream} with length.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    public PollerFlux<OperationResult, AnalyzeResult> beginAnalyzeDocument(String modelId, BinaryData document,
        AnalyzeDocumentOptions analyzeDocumentOptions) {
        return beginAnalyzeDocument(modelId, document, analyzeDocumentOptions, Context.NONE);
    }

    private PollerFlux<OperationResult, AnalyzeResult> beginAnalyzeDocument(String modelId, BinaryData document,
        AnalyzeDocumentOptions analyzeDocumentOptions, Context context) {
        try {
            if (document == null) {
                return PollerFlux.error(new NullPointerException("'document' is required and cannot be null."));
            }

            if (CoreUtils.isNullOrEmpty(modelId)) {
                return PollerFlux.error(logger.logExceptionAsError(
                    new IllegalArgumentException("'modelId' is required and cannot be null or empty")));
            }

            if (document.getLength() == null) {
                return PollerFlux.error(logger.logExceptionAsError(
                    new IllegalArgumentException("'document length' is required and cannot be null")));
            }

            final AnalyzeDocumentOptions finalAnalyzeDocumentOptions
                = getAnalyzeDocumentOptions(analyzeDocumentOptions);

            String pages = CoreUtils.isNullOrEmpty(finalAnalyzeDocumentOptions.getPages())
                ? null
                : CoreUtils.stringJoin(",", finalAnalyzeDocumentOptions.getPages());
            return new PollerFlux<>(DEFAULT_POLL_INTERVAL,
                activationOperation(() -> documentModelsImpl
                    .analyzeDocumentWithResponseAsync(modelId, null, pages, finalAnalyzeDocumentOptions.getLocale(),
                        StringIndexType.UTF16CODE_UNIT, finalAnalyzeDocumentOptions.getDocumentAnalysisFeatures(),
                        document, document.getLength(), context)
                    .map(analyzeDocumentResponse -> Transforms.toDocumentOperationResult(
                        analyzeDocumentResponse.getDeserializedHeaders().getOperationLocation())),
                    logger),
                pollingOperation(
                    resultId -> documentModelsImpl.getAnalyzeResultWithResponseAsync(modelId, resultId, context)),
                (activationResponse, pollingContext) -> Mono
                    .error(new RuntimeException("Cancellation is not supported")),
                fetchingOperation(
                    resultId -> documentModelsImpl.getAnalyzeResultWithResponseAsync(modelId, resultId, context))
                        .andThen(after -> after
                            .map(modelSimpleResponse -> Transforms
                                .toAnalyzeResultOperation(modelSimpleResponse.getValue().getAnalyzeResult()))
                            .onErrorMap(Transforms::mapToHttpResponseExceptionIfExists)));
        } catch (RuntimeException ex) {
            return PollerFlux.error(ex);
        }
    }

    /**
     * Classify a given document using a document classifier.
     * For more information on how to build a custom classifier model,
     * see <a href="https://aka.ms/azsdk/formrecognizer/buildclassifiermodel"></a>
     * <p>The service does not support cancellation of the long running operation and returns with an
     * error message indicating absence of cancellation support.</p>
     *
     * <p><strong>Code sample</strong></p>
     * <p> Analyze a document using the URL of the document. </p>
     * <!-- src_embed com.azure.ai.formrecognizer.documentanalysis.DocumentAnalysisAsyncClient.beginClassifyDocumentFromUrl#string-string -->
     * <pre>
     * String documentUrl = &quot;&#123;document_url&#125;&quot;;
     * String classifierId = &quot;custom-trained-classifier-id&quot;;
     *
     * documentAnalysisAsyncClient.beginClassifyDocumentFromUrl&#40;classifierId, documentUrl&#41;
     *     &#47;&#47; if polling operation completed, retrieve the final result.
     *     .flatMap&#40;AsyncPollResponse::getFinalResult&#41;
     *     .subscribe&#40;analyzeResult -&gt; &#123;
     *         System.out.println&#40;analyzeResult.getModelId&#40;&#41;&#41;;
     *         analyzeResult.getDocuments&#40;&#41;
     *             .forEach&#40;analyzedDocument -&gt; System.out.printf&#40;&quot;Doc Type: %s%n&quot;, analyzedDocument.getDocType&#40;&#41;&#41;&#41;;
     *     &#125;&#41;;
     *
     * </pre>
     * <!-- end com.azure.ai.formrecognizer.documentanalysis.DocumentAnalysisAsyncClient.beginClassifyDocumentFromUrl#string-string -->
     *
     * @param classifierId The unique classifier ID to be used. Use this to specify the custom classifier ID.
     * @param documentUrl The URL of the document to analyze.
     *
     * @return A {@link PollerFlux} that polls the progress of the analyze document operation until it has completed,
     * has failed, or has been cancelled. The completed operation returns an {@link AnalyzeResult}.
     * @throws HttpResponseException If analyze operation fails and the {@link AnalyzeResultOperation} returns
     * with an {@link OperationStatus#FAILED}..
     * @throws IllegalArgumentException If {@code documentUrl} or {@code classifierId} is null.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    public PollerFlux<OperationResult, AnalyzeResult> beginClassifyDocumentFromUrl(String classifierId,
        String documentUrl) {
        return beginClassifyDocumentFromUrl(classifierId, documentUrl, Context.NONE);
    }

    private PollerFlux<OperationResult, AnalyzeResult> beginClassifyDocumentFromUrl(String documentUrl,
        String classifierId, Context context) {
        try {
            if (CoreUtils.isNullOrEmpty(documentUrl)) {
                return PollerFlux.error(logger.logExceptionAsError(
                    new IllegalArgumentException("'documentUrl' is required and cannot be null or empty")));
            }
            if (CoreUtils.isNullOrEmpty(classifierId)) {
                return PollerFlux.error(logger.logExceptionAsError(
                    new IllegalArgumentException("'classifierId' is required and cannot be null or empty")));
            }

            return new PollerFlux<>(DEFAULT_POLL_INTERVAL,
                activationOperation(() -> documentClassifiersImpl
                    .classifyDocumentWithResponseAsync(classifierId, StringIndexType.UTF16CODE_UNIT,
                        new ClassifyDocumentRequest().setUrlSource(documentUrl), context)
                    .map(analyzeDocumentResponse -> Transforms.toDocumentOperationResult(
                        analyzeDocumentResponse.getDeserializedHeaders().getOperationLocation())),
                    logger),
                pollingOperation(resultId -> documentClassifiersImpl.getClassifyResultWithResponseAsync(classifierId,
                    resultId, context)),
                (activationResponse, pollingContext) -> Mono
                    .error(new RuntimeException("Cancellation is not supported")),
                fetchingOperation(resultId -> documentClassifiersImpl.getClassifyResultWithResponseAsync(classifierId,
                    resultId, context))
                        .andThen(after -> after
                            .map(modelSimpleResponse -> Transforms
                                .toAnalyzeResultOperation(modelSimpleResponse.getValue().getAnalyzeResult()))
                            .onErrorMap(Transforms::mapToHttpResponseExceptionIfExists)));
        } catch (RuntimeException ex) {
            return PollerFlux.error(ex);
        }
    }

    /**
     * Classify a given document using a document classifier.
     * For more information on how to build a custom classifier model,
     * see <a href="https://aka.ms/azsdk/formrecognizer/buildclassifiermodel"></a>
     * <p>The service does not support cancellation of the long running operation and returns with an
     * error message indicating absence of cancellation support.</p>
     * <p>
     * Note that the {@code data} passed must be replayable if retries are enabled (the default). In other words, the
     * {@code Flux} must produce the same data each time it is subscribed to.
     *
     * <p><strong>Code sample</strong></p>
     * <p> Analyze a document with configurable options.</p>
     * <!-- src_embed com.azure.ai.formrecognizer.documentanalysis.DocumentAnalysisAsyncClient.beginClassifyDocument#string-BinaryData -->
     * <pre>
     * File document = new File&#40;&quot;&#123;local&#47;file_path&#47;fileName.jpg&#125;&quot;&#41;;
     * String classifierId = &quot;&#123;model_id&#125;&quot;;
     *
     * &#47;&#47; Utility method to convert input stream to Binary Data
     * BinaryData buffer = BinaryData.fromStream&#40;new ByteArrayInputStream&#40;Files.readAllBytes&#40;document.toPath&#40;&#41;&#41;&#41;&#41;;
     *
     * documentAnalysisAsyncClient.beginClassifyDocument&#40;classifierId, buffer&#41;
     *     &#47;&#47; if polling operation completed, retrieve the final result.
     *     .flatMap&#40;AsyncPollResponse::getFinalResult&#41;
     *     .subscribe&#40;analyzeResult -&gt; &#123;
     *         System.out.println&#40;analyzeResult.getModelId&#40;&#41;&#41;;
     *         analyzeResult.getDocuments&#40;&#41;
     *             .forEach&#40;analyzedDocument -&gt; System.out.printf&#40;&quot;Doc Type: %s%n&quot;, analyzedDocument.getDocType&#40;&#41;&#41;&#41;;
     *     &#125;&#41;;
     * </pre>
     * <!-- end com.azure.ai.formrecognizer.documentanalysis.DocumentAnalysisAsyncClient.beginClassifyDocument#string-BinaryData -->
     *
     * @param classifierId The unique classifier ID to be used. Use this to specify the custom classifier ID.
     * @param document The data of the document to analyze information from. For service supported file types, see:
     * <a href="https://aka.ms/azsdk/formrecognizer/supportedfiles"></a>
     * @return A {@link PollerFlux} that polls the progress of the analyze document operation until it has completed,
     * has failed, or has been cancelled. The completed operation returns an {@link AnalyzeResult}.
     * @throws HttpResponseException If analyze operation fails and returns with an {@link OperationStatus#FAILED}.
     * @throws IllegalArgumentException If {@code document} or {@code classifierId} is null.
     * @throws IllegalArgumentException If {@code document} length is null or unspecified.
     * Use {@link BinaryData#fromStream(InputStream, Long)} to create an instance of the {@code document}
     * from given {@link InputStream} with length.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    public PollerFlux<OperationResult, AnalyzeResult> beginClassifyDocument(String classifierId, BinaryData document) {
        return beginClassifyDocument(classifierId, document, Context.NONE);
    }

    private PollerFlux<OperationResult, AnalyzeResult> beginClassifyDocument(String classifierId, BinaryData document,
        Context context) {
        try {
            if (document == null) {
                return PollerFlux.error(new RuntimeException("'document' is required and cannot be null."));
            }

            if (CoreUtils.isNullOrEmpty(classifierId)) {
                return PollerFlux.error(logger.logExceptionAsError(
                    new IllegalArgumentException("'classifierId' is required and cannot be null or empty")));
            }

            if (document.getLength() == null) {
                return PollerFlux.error(logger.logExceptionAsError(
                    new IllegalArgumentException("'document length' is required and cannot be null")));
            }

            return new PollerFlux<>(DEFAULT_POLL_INTERVAL,
                activationOperation(() -> documentClassifiersImpl
                    .classifyDocumentWithResponseAsync(classifierId, null, StringIndexType.UTF16CODE_UNIT, document,
                        document.getLength(), context)
                    .map(analyzeDocumentResponse -> Transforms.toDocumentOperationResult(
                        analyzeDocumentResponse.getDeserializedHeaders().getOperationLocation())),
                    logger),
                pollingOperation(resultId -> documentClassifiersImpl.getClassifyResultWithResponseAsync(classifierId,
                    resultId, context)),
                (activationResponse, pollingContext) -> Mono
                    .error(new RuntimeException("Cancellation is not supported")),
                fetchingOperation(resultId -> documentClassifiersImpl.getClassifyResultWithResponseAsync(classifierId,
                    resultId, context))
                        .andThen(after -> after
                            .map(modelSimpleResponse -> Transforms
                                .toAnalyzeResultOperation(modelSimpleResponse.getValue().getAnalyzeResult()))
                            .onErrorMap(Transforms::mapToHttpResponseExceptionIfExists)));
        } catch (RuntimeException ex) {
            return PollerFlux.error(ex);
        }
    }

    /*
     * Poller's POLLING operation.
     */
    private Function<PollingContext<OperationResult>, Mono<PollResponse<OperationResult>>>
        pollingOperation(Function<String, Mono<Response<AnalyzeResultOperation>>> pollingFunction) {
        return pollingContext -> {
            try {
                final PollResponse<OperationResult> operationResultPollResponse = pollingContext.getLatestResponse();
                final String resultId = operationResultPollResponse.getValue().getOperationId();
                return pollingFunction.apply(resultId)
                    .flatMap(modelResponse -> processAnalyzeModelResponse(modelResponse, operationResultPollResponse))
                    .onErrorMap(Transforms::mapToHttpResponseExceptionIfExists);
            } catch (RuntimeException ex) {
                return monoError(logger, ex);
            }
        };
    }

    /*
     * Poller's FETCHING operation.
     */
    private Function<PollingContext<OperationResult>, Mono<Response<AnalyzeResultOperation>>>
        fetchingOperation(Function<String, Mono<Response<AnalyzeResultOperation>>> fetchingFunction) {
        return pollingContext -> {
            try {
                final String resultId = pollingContext.getLatestResponse().getValue().getOperationId();
                return fetchingFunction.apply(resultId);
            } catch (RuntimeException ex) {
                return monoError(logger, ex);
            }
        };
    }

    private Mono<PollResponse<OperationResult>> processAnalyzeModelResponse(
        Response<AnalyzeResultOperation> analyzeResultOperationResponse,
        PollResponse<OperationResult> operationResultPollResponse) {
        LongRunningOperationStatus status;
        switch (analyzeResultOperationResponse.getValue().getStatus()) {
            case NOT_STARTED:
            case RUNNING:
                status = LongRunningOperationStatus.IN_PROGRESS;
                break;

            case SUCCEEDED:
                status = LongRunningOperationStatus.SUCCESSFULLY_COMPLETED;
                break;

            case FAILED:
                return monoError(logger, Transforms
                    .mapResponseErrorToHttpResponseException(analyzeResultOperationResponse.getValue().getError()));

            default:
                status = LongRunningOperationStatus
                    .fromString(analyzeResultOperationResponse.getValue().getStatus().toString(), true);
                break;
        }
        return Mono.just(new PollResponse<>(status, operationResultPollResponse.getValue()));
    }
}
