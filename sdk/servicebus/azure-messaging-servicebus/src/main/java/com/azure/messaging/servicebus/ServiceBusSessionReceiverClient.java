package com.azure.messaging.servicebus;

public class ServiceBusSessionReceiverClient {

    ServiceBusSessionReceiverClient() {
    }

    /**
     * Accepts the first available session.
     *
     * @return The first available session.
     */
    public ServiceBusReceiverClient acceptSession() {
        return new ServiceBusReceiverClient(null, null);
    }


    /**
     * Accepts the session with the session id.
     *
     * @param sessionId Session Id
     * @return The first available session.
     */
    public ServiceBusReceiverClient acceptSession(String sessionId) {
        return new ServiceBusReceiverClient(null, null);
    }
}
