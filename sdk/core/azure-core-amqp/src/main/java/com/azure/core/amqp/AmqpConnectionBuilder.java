// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.core.amqp;

import com.azure.core.amqp.implementation.AmqpAnnotatedMessageSerializer;
import com.azure.core.amqp.implementation.AzureTokenManagerProvider;
import com.azure.core.amqp.implementation.ClientConstants;
import com.azure.core.amqp.implementation.ConnectionOptions;
import com.azure.core.amqp.implementation.ConnectionStringProperties;
import com.azure.core.amqp.implementation.MessageSerializer;
import com.azure.core.amqp.implementation.ReactorConnection;
import com.azure.core.amqp.implementation.ReactorHandlerProvider;
import com.azure.core.amqp.implementation.ReactorProvider;
import com.azure.core.amqp.implementation.StringUtil;
import com.azure.core.amqp.implementation.TokenManagerProvider;
import com.azure.core.amqp.models.CbsAuthorizationType;
import com.azure.core.amqp.models.SslVerifyMode;
import com.azure.core.credential.TokenCredential;
import com.azure.core.http.policy.UserAgentPolicy;
import com.azure.core.util.ClientOptions;
import com.azure.core.util.Configuration;
import com.azure.core.util.CoreUtils;
import com.azure.core.util.logging.ClientLogger;
import org.apache.qpid.proton.amqp.transport.ReceiverSettleMode;
import org.apache.qpid.proton.amqp.transport.SenderSettleMode;
import org.apache.qpid.proton.engine.SslDomain;
import reactor.core.scheduler.Scheduler;
import reactor.core.scheduler.Schedulers;

import java.net.InetSocketAddress;
import java.net.MalformedURLException;
import java.net.Proxy;
import java.net.URL;
import java.util.regex.Pattern;

/**
 * Builder to instantiate an {@link AmqpConnection}.
 */
public final class AmqpConnectionBuilder {
    private static final AmqpRetryOptions DEFAULT_RETRY = new AmqpRetryOptions()
        .setTryTimeout(ClientConstants.OPERATION_TIMEOUT);
    private static final Pattern HOST_PORT_PATTERN = Pattern.compile("^[^:]+:\\d+");
    private static final String UNKNOWN = "UNKNOWN";

    private final ClientLogger logger = new ClientLogger(AmqpConnectionBuilder.class);
    private final MessageSerializer serializer = new AmqpAnnotatedMessageSerializer();

    private CbsAuthorizationType authorizationType;
    private ClientOptions clientOptions;
    private Configuration configuration;
    private URL customEndpointAddress;
    private String fullyQualifiedNamespace;
    private ProxyOptions proxyOptions;
    private AmqpRetryOptions retryOptions;
    private TokenCredential tokenCredential;
    private AmqpTransportType transportType = AmqpTransportType.AMQP;
    private SslVerifyMode verifyMode;

    /**
     * Sets the authorization type on the CBS node.
     *
     * @param authorizationType Authorization type.
     *
     * @return The updated {@link AmqpConnectionBuilder} object.
     */
    public AmqpConnectionBuilder authorizationType(CbsAuthorizationType authorizationType) {
        this.authorizationType = authorizationType;
        return this;
    }

    /**
     * Sets the {@link ClientOptions} which enables various options to be set on the client. For example setting {@code
     * applicationId} using {@link ClientOptions#setApplicationId(String)} to configure {@link UserAgentPolicy} for
     * telemetry/monitoring purpose.
     * <p>
     *
     * @param clientOptions to be set on the client.
     *
     * @return The updated {@link AmqpConnectionBuilder} object.
     *
     * @see <a href="https://azure.github.io/azure-sdk/general_azurecore.html#telemetry-policy">Azure Core: Telemetry
     *     policy</a>
     */
    public AmqpConnectionBuilder clientOptions(ClientOptions clientOptions) {
        this.clientOptions = clientOptions;
        return this;
    }

    /**
     * Sets the configuration store that is used during construction of the service client.
     *
     * If not specified, the default configuration store is used to configure the {@link AmqpConnection}. Use {@link
     * Configuration#NONE} to bypass using configuration settings during construction.
     *
     * @param configuration The configuration store used to configure the {@link AmqpConnection}.
     *
     * @return The updated {@link AmqpConnectionBuilder} object.
     */
    public AmqpConnectionBuilder configuration(Configuration configuration) {
        this.configuration = configuration;
        return this;
    }

    /**
     * Connection string for the AMQP message broker.
     *
     * @param connectionString Connection string for the AMQP message broker.
     *
     * @return The updated {@link AmqpConnectionBuilder} object.
     */
    public AmqpConnectionBuilder connectionString(String connectionString) {
        final ConnectionStringProperties properties = new ConnectionStringProperties(connectionString);

        if (properties.getSharedAccessSignature() != null) {
            tokenCredential = new CbsTokenCredential(properties.getSharedAccessSignature());
        } else if (properties.getSharedAccessKeyName() != null && properties.getSharedAccessKey() != null) {
            tokenCredential = new CbsTokenCredential(properties.getSharedAccessKeyName(),
                properties.getSharedAccessKey(), ClientConstants.TOKEN_VALIDITY);
        } else {
            logger.warning("Connection string did not have any authorization properties set.");
        }

        fullyQualifiedNamespace = properties.getEndpoint().getHost();

        return this;
    }

    /**
     * Sets a custom endpoint address when connecting to the AMQP message broker. This can be useful when your network
     * does not allow connecting to the standard endpoint address, but does allow connecting through an intermediary.
     * For example: {@literal https://my.custom.endpoint.com:55300}.
     * <p>
     * If no port is specified, the default port for the {@link #transportType(AmqpTransportType) transport type} is
     * used.
     *
     * @param customEndpointAddress The custom endpoint address.
     *
     * @return The updated {@link AmqpConnectionBuilder} object.
     *
     * @throws IllegalArgumentException if {@code customEndpointAddress} cannot be parsed into a valid {@link URL}.
     */
    public AmqpConnectionBuilder customEndpointAddress(String customEndpointAddress) {
        if (customEndpointAddress == null) {
            this.customEndpointAddress = null;
            return this;
        }

        try {
            this.customEndpointAddress = new URL(customEndpointAddress);
        } catch (MalformedURLException e) {
            throw logger.logExceptionAsError(
                new IllegalArgumentException(customEndpointAddress + " : is not a valid URL.", e));
        }

        return this;
    }

    /**
     * Sets the fully qualified namespace for the connection.
     *
     * @param fullyQualifiedNamespace domain name for the connection.
     *
     * @return The updated {@link AmqpConnectionBuilder} object.
     */
    public AmqpConnectionBuilder fullyQualifiedNamespace(String fullyQualifiedNamespace) {
        this.fullyQualifiedNamespace = fullyQualifiedNamespace;
        return this;
    }

    /**
     * Sets the proxy configuration to use for {@link AmqpConnection}. When a proxy is configured, {@link
     * AmqpTransportType#AMQP_WEB_SOCKETS} must be used for the transport type.
     *
     * @param proxyOptions The proxy configuration to use.
     *
     * @return The updated {@link AmqpConnectionBuilder} object.
     */
    public AmqpConnectionBuilder proxyOptions(ProxyOptions proxyOptions) {
        this.proxyOptions = proxyOptions;
        return this;
    }

    /**
     * Sets the retry options. If not specified, the default retry options are used.
     *
     * @param retryOptions The retry options to use.
     *
     * @return The updated {@link AmqpConnectionBuilder} object.
     */
    public AmqpConnectionBuilder retryOptions(AmqpRetryOptions retryOptions) {
        this.retryOptions = retryOptions;
        return this;
    }

    /**
     * Sets the credential used to authenticate requests to the AMQP message broker.
     *
     * @param tokenCredential {@link TokenCredential} to be used for authentication.
     *
     * @return The updated {@link AmqpConnectionBuilder} object.
     */
    public AmqpConnectionBuilder tokenCredential(TokenCredential tokenCredential) {
        this.tokenCredential = tokenCredential;
        return this;
    }

    /**
     * Sets the transport type by which all the communication the message broker. Default value is {@link
     * AmqpTransportType#AMQP}.
     *
     * @param transportType The transport type to use.
     *
     * @return The updated {@link AmqpConnectionBuilder} object.
     */
    public AmqpConnectionBuilder transportType(AmqpTransportType transportType) {
        this.transportType = transportType;
        return this;
    }

    /**
     * Sets the verify mode for this connection.
     *
     * @param verifyMode The verification mode.
     *
     * @return The updated {@link AmqpConnectionBuilder} object.
     */
    public AmqpConnectionBuilder verifyMode(SslVerifyMode verifyMode) {
        this.verifyMode = verifyMode;
        return this;
    }

    /**
     * Creates a new AMQP connection.
     *
     * @return A new AMQP connection.
     */
    public AmqpConnection buildConnection() {
        final ConnectionOptions connectionOptions = getConnectionOptions();
        final String connectionId = StringUtil.getRandomString("MF");
        logger.info("connectionId[{}]: Emitting a single connection.", connectionId);

        final TokenManagerProvider tokenManagerProvider = new AzureTokenManagerProvider(
            connectionOptions.getAuthorizationType(), connectionOptions.getFullyQualifiedNamespace(),
            connectionOptions.getAuthorizationScope());
        final ReactorProvider provider = new ReactorProvider();
        final ReactorHandlerProvider handlerProvider = new ReactorHandlerProvider(provider);

        return new ReactorConnection(connectionId, connectionOptions, provider,
            handlerProvider, tokenManagerProvider, serializer, SenderSettleMode.SETTLED,
            ReceiverSettleMode.SECOND);
    }

    private ConnectionOptions getConnectionOptions() {
        final AmqpRetryOptions amqpRetryOptions = retryOptions != null ? retryOptions : DEFAULT_RETRY;
        final Configuration configurationToUse = configuration == null
            ? Configuration.getGlobalConfiguration().clone()
            : configuration;

        if (tokenCredential == null) {
            throw logger.logExceptionAsError(new IllegalArgumentException("Credentials have not been set. "
                + "They can be set using: connectionString(String)"
                + "credentials(TokenCredential) and fullyQualifiedNamespace(String)."));
        }

        if (proxyOptions == null) {
            proxyOptions = getDefaultProxyConfiguration(configurationToUse);
        }

        // If the proxy has been configured by the user but they have overridden the TransportType with something that
        // is not AMQP_WEB_SOCKETS.
        if (proxyOptions != null && proxyOptions.isProxyAddressConfigured()
            && transportType != AmqpTransportType.AMQP_WEB_SOCKETS) {
            throw logger.logExceptionAsError(new IllegalArgumentException(
                "Cannot use a proxy when TransportType is not AMQP Web Sockets."));
        }

        if (authorizationType == CbsAuthorizationType.JSON_WEB_TOKEN) {
            throw new UnsupportedOperationException("Currently JSON_WEB_TOKEN + AAD is not supported.");
        }

        final ClientOptions options = clientOptions != null ? clientOptions : new ClientOptions();
        final SslDomain.VerifyMode verificationMode;
        if (verifyMode == null) {
            verificationMode = SslDomain.VerifyMode.VERIFY_PEER_NAME;
        } else {
            switch (verifyMode) {
                case NONE:
                    verificationMode = SslDomain.VerifyMode.ANONYMOUS_PEER;
                    break;
                case VERIFY_PEER:
                    verificationMode = SslDomain.VerifyMode.VERIFY_PEER;
                    break;
                case VERIFY_PEER_NAME:
                    verificationMode = SslDomain.VerifyMode.VERIFY_PEER_NAME;
                    break;
                default:
                    throw logger.logExceptionAsError(new UnsupportedOperationException(
                        "SslVerifyMode is not supported. Actual: " + verifyMode));
            }
        }

        final Scheduler scheduler = Schedulers.boundedElastic();
        if (customEndpointAddress == null) {
            return new ConnectionOptions(fullyQualifiedNamespace, tokenCredential, authorizationType,
                null, transportType, amqpRetryOptions, proxyOptions, scheduler,
                options, verificationMode, UNKNOWN, UNKNOWN);
        } else {
            return new ConnectionOptions(fullyQualifiedNamespace, tokenCredential, authorizationType,
                null, transportType, amqpRetryOptions, proxyOptions, scheduler,
                options, verificationMode, UNKNOWN, UNKNOWN, customEndpointAddress.getHost(),
                customEndpointAddress.getPort());
        }
    }

    private ProxyOptions getDefaultProxyConfiguration(Configuration configuration) {
        ProxyAuthenticationType authentication = ProxyAuthenticationType.NONE;
        if (proxyOptions != null) {
            authentication = proxyOptions.getAuthentication();
        }

        String proxyAddress = configuration.get(Configuration.PROPERTY_HTTP_PROXY);

        if (CoreUtils.isNullOrEmpty(proxyAddress)) {
            return ProxyOptions.SYSTEM_DEFAULTS;
        }

        return getProxyOptions(authentication, proxyAddress);
    }

    private ProxyOptions getProxyOptions(ProxyAuthenticationType authentication, String proxyAddress) {
        String host;
        int port;
        if (HOST_PORT_PATTERN.matcher(proxyAddress.trim()).find()) {
            final String[] hostPort = proxyAddress.split(":");
            host = hostPort[0];
            port = Integer.parseInt(hostPort[1]);
            final Proxy proxy = new Proxy(Proxy.Type.HTTP, new InetSocketAddress(host, port));
            final String username = configuration.get(ProxyOptions.PROXY_USERNAME);
            final String password = configuration.get(ProxyOptions.PROXY_PASSWORD);
            return new ProxyOptions(authentication, proxy, username, password);
        } else {
            com.azure.core.http.ProxyOptions coreProxyOptions = com.azure.core.http.ProxyOptions
                .fromConfiguration(configuration);
            return new ProxyOptions(authentication, new Proxy(coreProxyOptions.getType().toProxyType(),
                coreProxyOptions.getAddress()), coreProxyOptions.getUsername(), coreProxyOptions.getPassword());
        }
    }
}
