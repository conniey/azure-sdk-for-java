// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.communication.email;

import com.azure.communication.common.implementation.CommunicationConnectionString;
import com.azure.communication.common.implementation.HmacAuthenticationPolicy;
import com.azure.communication.email.implementation.AzureCommunicationEmailServiceImpl;
import com.azure.communication.email.implementation.AzureCommunicationEmailServiceImplBuilder;
import com.azure.core.annotation.ServiceClientBuilder;
import com.azure.core.client.traits.AzureKeyCredentialTrait;
import com.azure.core.client.traits.ConfigurationTrait;
import com.azure.core.client.traits.EndpointTrait;
import com.azure.core.client.traits.HttpTrait;
import com.azure.core.client.traits.ConnectionStringTrait;
import com.azure.core.client.traits.TokenCredentialTrait;
import com.azure.core.credential.AzureKeyCredential;
import com.azure.core.credential.TokenCredential;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpPipeline;
import com.azure.core.http.HttpPipelineBuilder;
import com.azure.core.http.HttpPipelinePosition;
import com.azure.core.http.policy.AddDatePolicy;
import com.azure.core.http.policy.AddHeadersFromContextPolicy;
import com.azure.core.http.policy.AddHeadersPolicy;
import com.azure.core.http.policy.BearerTokenAuthenticationPolicy;
import com.azure.core.http.policy.CookiePolicy;
import com.azure.core.http.policy.HttpLogOptions;
import com.azure.core.http.policy.HttpLoggingPolicy;
import com.azure.core.http.policy.HttpPipelinePolicy;
import com.azure.core.http.policy.HttpPolicyProviders;
import com.azure.core.http.policy.RequestIdPolicy;
import com.azure.core.http.policy.RetryOptions;
import com.azure.core.http.policy.RetryPolicy;
import com.azure.core.http.policy.UserAgentPolicy;
import com.azure.core.util.ClientOptions;
import com.azure.core.util.Configuration;
import com.azure.core.util.CoreUtils;
import com.azure.core.util.builder.ClientBuilderUtil;
import com.azure.core.util.logging.ClientLogger;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Builder for creating clients of Azure Communication Service Email
 */
@ServiceClientBuilder(serviceClients = { EmailClient.class, EmailAsyncClient.class })
public final class EmailClientBuilder implements HttpTrait<EmailClientBuilder>, ConfigurationTrait<EmailClientBuilder>,
    AzureKeyCredentialTrait<EmailClientBuilder>, EndpointTrait<EmailClientBuilder>,
    ConnectionStringTrait<EmailClientBuilder>, TokenCredentialTrait<EmailClientBuilder> {
    private static final String SDK_NAME = "name";

    private static final String SDK_VERSION = "version";

    private final ClientLogger logger = new ClientLogger(EmailClientBuilder.class);

    private final Map<String, String> properties = CoreUtils.getProperties("azure-communication-email.properties");

    private final List<HttpPipelinePolicy> pipelinePolicies;

    /** Create an instance of the EmailClientBuilder. */
    public EmailClientBuilder() {
        this.pipelinePolicies = new ArrayList<>();
    }

    /*
     * The HTTP pipeline to send requests through.
     */
    private HttpPipeline pipeline;

    /** {@inheritDoc}. */
    @Override
    public EmailClientBuilder pipeline(HttpPipeline pipeline) {
        this.pipeline = pipeline;
        return this;
    }

    /*
     * The HTTP client used to send the request.
     */
    private HttpClient httpClient;

    /** {@inheritDoc}. */
    @Override
    public EmailClientBuilder httpClient(HttpClient httpClient) {
        this.httpClient = httpClient;
        return this;
    }

    /*
     * The logging configuration for HTTP requests and responses.
     */
    private HttpLogOptions httpLogOptions;

    /** {@inheritDoc}. */
    @Override
    public EmailClientBuilder httpLogOptions(HttpLogOptions httpLogOptions) {
        this.httpLogOptions = httpLogOptions;
        return this;
    }

    /*
     * The client options such as application ID and custom headers to set on a
     * request.
     */
    private ClientOptions clientOptions;

    /** {@inheritDoc}. */
    @Override
    public EmailClientBuilder clientOptions(ClientOptions clientOptions) {
        this.clientOptions = clientOptions;
        return this;
    }

    /*
     * The retry options to configure retry policy for failed requests.
     */
    private RetryOptions retryOptions;

    /** {@inheritDoc}. */
    @Override
    public EmailClientBuilder retryOptions(RetryOptions retryOptions) {
        this.retryOptions = retryOptions;
        return this;
    }

    /** {@inheritDoc}. */
    @Override
    public EmailClientBuilder addPolicy(HttpPipelinePolicy customPolicy) {
        this.pipelinePolicies.add(customPolicy);
        return this;
    }

    /*
     * The configuration store that is used during construction of the service
     * client.
     */
    private Configuration configuration;

    /** {@inheritDoc}. */
    @Override
    public EmailClientBuilder configuration(Configuration configuration) {
        this.configuration = configuration;
        return this;
    }

    /*
     * The AzureKeyCredential used for authentication.
     */
    private AzureKeyCredential azureKeyCredential;

    /** {@inheritDoc}. */
    @Override
    public EmailClientBuilder credential(AzureKeyCredential azureKeyCredential) {
        this.azureKeyCredential = azureKeyCredential;
        return this;
    }

    /*
     * The TokenCredential used for authentication.
     */
    private TokenCredential tokenCredential;

    /**
     * Sets the {@link TokenCredential} used to authorize requests sent to the service. Refer to the Azure SDK for Java
     * <a href="https://aka.ms/azsdk/java/docs/identity">identity and authentication</a>
     * documentation for more details on proper usage of the {@link TokenCredential} type.
     *
     * @param tokenCredential {@link TokenCredential} used to authorize requests sent to the service.
     * @return The updated {@link EmailClientBuilder} object.
     */
    @Override
    public EmailClientBuilder credential(TokenCredential tokenCredential) {
        this.tokenCredential = tokenCredential;
        return this;
    }

    /*
     * The service endpoint
     */
    private String endpoint;

    /** {@inheritDoc}. */
    @Override
    public EmailClientBuilder endpoint(String endpoint) {
        this.endpoint = endpoint;
        return this;
    }

    /*
     * Service version
     */
    private EmailServiceVersion serviceVersion;

    /**
     * Sets Service version.
     *
     * @param serviceVersion the serviceVersion value.
     * @return the EmailClientBuilder.
     */
    public EmailClientBuilder serviceVersion(EmailServiceVersion serviceVersion) {
        this.serviceVersion = serviceVersion;
        return this;
    }

    /*
     * The retry policy that will attempt to retry failed requests, if
     * applicable.
     */
    private RetryPolicy retryPolicy;

    /**
     * Sets The retry policy that will attempt to retry failed requests, if applicable.
     *
     * @param retryPolicy the retryPolicy value.
     * @return the EmailClientBuilder.
     */
    public EmailClientBuilder retryPolicy(RetryPolicy retryPolicy) {
        this.retryPolicy = retryPolicy;
        return this;
    }

    /**
     * Set endpoint and credential to use
     *
     * @param connectionString connection string for setting endpoint and initalizing AzureKeyCredential
     * @return EmailClientBuilder
     */
    @Override
    public EmailClientBuilder connectionString(String connectionString) {
        CommunicationConnectionString connectionStringObject = new CommunicationConnectionString(connectionString);
        String endpoint = connectionStringObject.getEndpoint();
        String accessKey = connectionStringObject.getAccessKey();
        this.endpoint(endpoint).credential(new AzureKeyCredential(accessKey));
        return this;
    }

    /**
     * Builds an instance of AzureCommunicationServicesImpl with the provided parameters.
     *
     * @return an instance of AzureCommunicationServicesImpl.
     */
    private AzureCommunicationEmailServiceImpl buildInnerClient() {
        if (pipeline == null) {
            pipeline = createHttpPipeline();
        }
        if (serviceVersion == null) {
            serviceVersion = EmailServiceVersion.getLatest();
        }

        AzureCommunicationEmailServiceImpl innerClient
            = new AzureCommunicationEmailServiceImplBuilder().endpoint(endpoint)
                .pipeline(pipeline)
                .apiVersion(serviceVersion.getVersion())
                .buildClient();

        return innerClient;
    }

    private HttpPipelinePolicy createHttpPipelineAuthPolicy() {
        if (this.tokenCredential != null) {
            return new BearerTokenAuthenticationPolicy(this.tokenCredential,
                "https://communication.azure.com//.default");
        } else if (this.azureKeyCredential != null) {
            return new HmacAuthenticationPolicy(this.azureKeyCredential);
        } else {
            throw logger.logExceptionAsError(new IllegalStateException(
                "Missing credential information while building a client. Use one of the credential methods to set the credential."));
        }
    }

    private HttpPipeline createHttpPipeline() {
        Configuration buildConfiguration
            = (configuration == null) ? Configuration.getGlobalConfiguration() : configuration;
        if (httpLogOptions == null) {
            httpLogOptions = new HttpLogOptions();
        }
        if (clientOptions == null) {
            clientOptions = new ClientOptions();
        }
        List<HttpPipelinePolicy> policies = new ArrayList<>();
        String clientName = properties.getOrDefault(SDK_NAME, "UnknownName");
        String clientVersion = properties.getOrDefault(SDK_VERSION, "UnknownVersion");
        String applicationId = CoreUtils.getApplicationId(clientOptions, httpLogOptions);
        policies.add(new UserAgentPolicy(applicationId, clientName, clientVersion, buildConfiguration));
        policies.add(new RequestIdPolicy());
        policies.add(new AddHeadersFromContextPolicy());
        HttpHeaders headers = new HttpHeaders();
        clientOptions.getHeaders().forEach(header -> headers.set(header.getName(), header.getValue()));
        if (headers.getSize() > 0) {
            policies.add(new AddHeadersPolicy(headers));
        }
        policies.addAll(this.pipelinePolicies.stream()
            .filter(p -> p.getPipelinePosition() == HttpPipelinePosition.PER_CALL)
            .collect(Collectors.toList()));
        HttpPolicyProviders.addBeforeRetryPolicies(policies);
        policies.add(ClientBuilderUtil.validateAndGetRetryPolicy(retryPolicy, retryOptions, new RetryPolicy()));
        policies.add(createHttpPipelineAuthPolicy());
        policies.add(new AddDatePolicy());
        policies.add(new CookiePolicy());
        policies.addAll(this.pipelinePolicies.stream()
            .filter(p -> p.getPipelinePosition() == HttpPipelinePosition.PER_RETRY)
            .collect(Collectors.toList()));
        HttpPolicyProviders.addAfterRetryPolicies(policies);
        policies.add(new HttpLoggingPolicy(httpLogOptions));
        HttpPipeline httpPipeline = new HttpPipelineBuilder().policies(policies.toArray(new HttpPipelinePolicy[0]))
            .httpClient(httpClient)
            .clientOptions(clientOptions)
            .build();
        return httpPipeline;
    }

    /**
     * Builds an instance of EmailAsyncClient class.
     *
     * @return an instance of EmailAsyncClient.
     */
    public EmailAsyncClient buildAsyncClient() {
        return new EmailAsyncClient(buildInnerClient());
    }

    /**
     * Builds an instance of EmailClient class.
     *
     * @return an instance of EmailClient.
     */
    public EmailClient buildClient() {
        return new EmailClient(new EmailAsyncClient(buildInnerClient()));
    }
}
