// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.messaging.servicebus;

import com.azure.core.util.BinaryData;
import org.junit.jupiter.api.Test;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.stream.IntStream;

/**
 * Sample demonstrates how to send a {@link ServiceBusMessage} to an Azure Service Bus queue.
 */
public class SendMessageAsyncSample {
    String connectionString = System.getenv("AZURE_SERVICEBUS_NAMESPACE_CONNECTION_STRING");
    String queueName = System.getenv("AZURE_SERVICEBUS_SAMPLE_QUEUE_NAME");

    /**
     * Main method to invoke this demo on how to send a {@link ServiceBusMessageBatch} to an Azure Service Bus.
     *
     * @param args Unused arguments to the program.
     * @throws InterruptedException If the program is unable to sleep while waiting for the operations to complete.
     */
    public static void main(String[] args) throws InterruptedException {
        SendMessageAsyncSample sample = new SendMessageAsyncSample();
        sample.run();
    }

    /**
     * This method to invoke this demo on how to send a {@link ServiceBusMessageBatch} to an Azure Service Bus.
     *
     * @throws InterruptedException If the program is unable to sleep while waiting for the operations to complete.
     */
    @Test
    public void run() throws InterruptedException {
        AtomicBoolean sampleSuccessful = new AtomicBoolean(false);
        CountDownLatch countdownLatch = new CountDownLatch(1);

        // The connection string value can be obtained by:
        // 1. Going to your Service Bus namespace in Azure Portal.
        // 2. Go to "Shared access policies"
        // 3. Copy the connection string for the "RootManageSharedAccessKey" policy.
        // The 'connectionString' format is shown below.
        // 1. "Endpoint={fully-qualified-namespace};SharedAccessKeyName={policy-name};SharedAccessKey={key}"
        // 2. "<<fully-qualified-namespace>>" will look similar to "{your-namespace}.servicebus.windows.net"
        // 3. "queueName" will be the name of the Service Bus queue instance you created
        //    inside the Service Bus namespace.

        // Instantiate a client that will be used to call the service.
        ServiceBusSenderClient sender = new ServiceBusClientBuilder()
            .connectionString(connectionString)
            .sender()
            .queueName(queueName)
            .buildClient();

        // Create a message to send.
        final ServiceBusMessageBatch messageBatch = sender.createMessageBatch();
        IntStream.range(0, 10)
            .mapToObj(index -> new ServiceBusMessage(BinaryData.fromString("Hello world! " + index)))
            .forEach(message -> messageBatch.tryAddMessage(message));

        // Send that message. It completes successfully when the event has been delivered to the Service queue or topic.
        // It completes with an error if an exception occurred while sending the message.
        sender.sendMessages(messageBatch);

        // Close the sender.
        sender.close();
    }
}
