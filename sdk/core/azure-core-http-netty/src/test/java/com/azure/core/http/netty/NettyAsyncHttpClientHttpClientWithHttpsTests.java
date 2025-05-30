// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.core.http.netty;

import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpMethod;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.util.BinaryData;
import com.azure.core.util.Context;
import com.azure.core.validation.http.HttpClientTests;
import com.azure.core.validation.http.HttpClientTestsServer;
import com.azure.core.validation.http.LocalTestServer;
import io.netty.handler.ssl.SslContext;
import io.netty.handler.ssl.SslContextBuilder;
import io.netty.handler.ssl.util.InsecureTrustManagerFactory;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;

import javax.net.ssl.SSLException;
import java.io.IOException;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

/**
 * Reactor Netty {@link HttpClientTests} with https.
 * Some request logic branches out if it's https like file uploads.
 */
@Execution(ExecutionMode.SAME_THREAD)
public class NettyAsyncHttpClientHttpClientWithHttpsTests extends HttpClientTests {
    private static LocalTestServer server;

    private static final HttpClient HTTP_CLIENT_INSTANCE;

    static {
        try {
            SslContext sslContext
                = SslContextBuilder.forClient().trustManager(InsecureTrustManagerFactory.INSTANCE).build();

            reactor.netty.http.client.HttpClient nettyHttpClient = reactor.netty.http.client.HttpClient.create()
                .secure(sslContextSpec -> sslContextSpec.sslContext(sslContext));

            HTTP_CLIENT_INSTANCE = new NettyAsyncHttpClientBuilder(nettyHttpClient).build();
        } catch (SSLException e) {
            throw new RuntimeException(e);
        }
    }

    @BeforeAll
    public static void startTestServer() {
        server = HttpClientTestsServer.getHttpClientTestsServer();
        server.start();
    }

    @AfterAll
    public static void stopTestServer() {
        if (server != null) {
            server.stop();
        }
    }

    @Override
    @Deprecated
    protected int getPort() {
        return server.getHttpsPort();
    }

    @Override
    protected String getServerUri(boolean secure) {
        return secure ? server.getHttpsUri() : server.getHttpUri();
    }

    @Override
    protected boolean isSecure() {
        return true;
    }

    @Override
    protected HttpClient createHttpClient() {
        return HTTP_CLIENT_INSTANCE;
    }

    @Timeout(value = 1, unit = TimeUnit.MINUTES)
    @Test
    public void canSendTinyBinaryDataDebugging() throws IOException {
        byte[] expectedResponseBody = new byte[512];
        ThreadLocalRandom.current().nextBytes(expectedResponseBody);

        HttpRequest request = new HttpRequest(HttpMethod.PUT, getRequestUrl(ECHO_RESPONSE))
            .setBody(BinaryData.fromBytes(expectedResponseBody));

        try (HttpResponse response = createHttpClient().sendSync(request, Context.NONE)) {
            assertArrayEquals(expectedResponseBody, response.getBodyAsBinaryData().toBytes());
        }
    }
}
