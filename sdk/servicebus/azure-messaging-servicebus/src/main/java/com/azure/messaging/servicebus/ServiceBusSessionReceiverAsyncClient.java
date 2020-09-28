// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.messaging.servicebus;

import reactor.core.publisher.Mono;

public class ServiceBusSessionReceiverAsyncClient implements AutoCloseable {
    ServiceBusSessionReceiverAsyncClient() {
    }

    /**
     * Accepts the first available session.
     *
     * @return The first available session.
     */
    public Mono<ServiceBusReceiverAsyncClient> acceptNextSession() {
        return Mono.empty();
    }

    /**
     * Accepts the session with the session id.
     *
     * @param sessionId Session Id
     *
     * @return The first available session.
     */
    public Mono<ServiceBusReceiverAsyncClient> acceptSession(String sessionId) {
        return Mono.empty();
    }

    /**
     * Accept all sessions and process them.
     *
     * @return Null.
     */
    public ServiceBusReceiverAsyncClient getReceiverClient(int maxConcurrentSessions) {
        return null;
    }

    @Override
    public void close() {
    }
}
