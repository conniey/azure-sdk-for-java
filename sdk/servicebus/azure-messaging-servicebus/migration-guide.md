# Guide for migrating to azure-messaging-servicebus

This guide assists in the migration to version 7 of the Service Bus client library
[`com.azure:azure-messaging-servicebus`](https://search.maven.org/artifact/com.azure/azure-messaging-servicebus) from
version 3 of
[`com.microsoft.azure:azure-servicebus`](https://search.maven.org/artifact/com.microsoft.azure/azure-servicebus/). It
will focus on side-by-side comparisons for similar operations between the two packages.

Familiarity with the `com.microsoft.azure:azure-servicebus` library is assumed. For those new to the Service Bus client
library for Java, please refer to the
[README](https://github.com/Azure/azure-sdk-for-java/blob/master/sdk/servicebus/azure-messaging-servicebus/README.md)
and [Service Bus
samples](https://github.com/Azure/azure-sdk-for-java/tree/master/sdk/servicebus/azure-messaging-servicebus/src/samples/java/com/azure/messaging/servicebus)
for the `azure-messaging-servicebus` library rather than this guide.

## Table of contents

- [Guide for migrating to azure-messaging-servicebus](#guide-for-migrating-to-azure-messaging-servicebus)
  - [Table of contents](#table-of-contents)
  - [Migration benefits](#migration-benefits)
  - [General changes](#general-changes)
    - [Group id, artifact id, and package names](#group-id-artifact-id-and-package-names)
    - [Client hierarchy](#client-hierarchy)
    - [Async programming model](#async-programming-model)
    - [Client constructors](#client-constructors)
    - [Sending messages](#sending-messages)
    - [Receiving messages](#receiving-messages)
    - [Working with sessions](#working-with-sessions)
  - [Additional samples](#additional-samples)

## Migration benefits

A natural question to ask when considering whether or not to adopt a new version or library is what the benefits of
doing so would be. As Azure has matured and been embraced by a more diverse group of developers, we have been focused on
learning the patterns and practices to best support developer productivity and to understand the gaps that the Java
client libraries have.

There were several areas of consistent feedback expressed across the Azure client library ecosystem. One of the most
important is that the client libraries for different Azure services have not had a consistent approach to organization,
naming, and API structure. Additionally, many developers have felt that the learning curve was difficult, and the APIs
did not offer a good, approachable, and consistent onboarding story for those learning Azure or exploring a specific
Azure service.

To improve the development experience across Azure services, including Service Bus, a set of uniform [design
guidelines](https://azure.github.io/azure-sdk/general_introduction.html) was created for all languages to drive a
consistent experience with established API patterns for all services. A set of [.NET-specific
guidelines](https://azure.github.io/azure-sdk/java_introduction.html) was also introduced to ensure that Java clients
have a natural and idiomatic feel that mirrors that of the Java base class libraries. Further details are available in
the guidelines for those interested.

The new Service Bus library `azure-messaging-servicebus` provides the ability to share in some of the cross-service
improvements made to the Azure development experience, such as using the new `azure-identity` library to share a single
authentication between clients and a unified diagnostics pipeline offering a common view of the activities across each
of the client libraries.

While we believe that there is significant benefit to adopting the new Service Bus library `azure-messaging-servicebus`,
it is important to be aware that the previous version `azure-servicebus` have not been officially deprecated. They will
continue to be supported with security and bug fixes as well as receiving some minor refinements. However, in the near
future they will not be under active development and new features are unlikely to be added to them.

## General changes

### Group id, artifact id, and package names

Artifact and package names for the modern Azure client libraries for Java have changed. Legacy clients have the
`com.microsoft.azure` group id where-as, the new clients use `com.azure`. In addition, each will follow the artifact id
pattern `azure-[area].[service]` where the legacy clients followed the pattern `azure-[service]`. This provides a quick
and accessible means to help understand, at a glance, whether you are using the modern or legacy clients.

In the case of Service Bus, the modern client libraries have packages and namespaces that begin with
`com.azure.messaging.servicebus` and were released beginning with version 7. The legacy client libraries have packages
and namespaces that begin with `com.microsoft.azure.servicebus` and a version of 3.x.x or below.

### Client hierarchy

In the interest of simplifying the API surface we've made a single entry point called `ServiceBusClientBuilder`, rather
than one for each of queue, topic, subscription, and session. This acts as the single entry point in contrast with
multiple entry points from before. You can create senders and receivers from this client to the
queue/topic/subscription/session of your choice and start sending/receiving messages.

#### Approachability

By having a single entry point, the `ServiceBusClientBuilder` helps with the discoverability of the API as you can
explore all available clients via sub-builders available on `ServiceBusClientBuilder`. This is better than searching
through documentation or exploring namespace for the types that you can instantiate. Whether sending or receiving, using
sessions or not, you will start your applications by constructing the same client builder.

#### Consistency

We now have methods with similar names, signature and location to create senders and receivers. This provides
consistency and predictability on the various features of the library. We have session/non-session usage be as seamless
as possible. This allows you to make less changes to your code when you want to move from sessions to non-sessions or
the other way around.

#### Connection Pooling

By using a single top-level client builder, we can implicitly share a single AMQP connection for all operations that an
application performs. In the previous library `azure-servicebus`, connection sharing was explicit. You had to pass in a
`MessagingFactory` object  to share a connection.

By making this connection sharing be implicit to a `ServiceBusClientBuilder` instance, we can help ensure that
applications will not use multiple connections unless they explicitly opt in by creating multiple subclient instances.
The mental model of 1 client - 1 connection is more intuitive than 1 client/sender/receiver - 1 connection.

### Async programming model

Usage of `CompletableFuture` for async operations is replaced with a different programming model. The modernized library uses [Project Reactor](https://projectreactor.io). This is a shift to thinking about data as a Stream of information.

Project Reactor has many bridge APIs to quickly migrate code using `CompletabeFuture`. A few are:
* [Mono.fromFuture(CompletableFuture<T>)](https://projectreactor.io/docs/core/release/api/reactor/core/publisher/Mono.html#fromFuture-java.util.concurrent.CompletableFuture-)
* [Mono.fromCompletionStage(CompletionStage<T> completionStage)](https://projectreactor.io/docs/core/release/api/reactor/core/publisher/Mono.html#fromCompletionStage-java.util.concurrent.CompletionStage-)
* For more: [Mono](https://projectreactor.io/docs/core/release/api/reactor/core/publisher/Mono.html)

### Client constructors

While we continue to support connection strings when constructing a client, the main difference is when using Azure
Active Directory. We now use the new [azure-identity](https://search.maven.org/artifact/com.azure/azure-identity)
library to share a single authentication solution between clients of different Azure services.

```java
// Create a sender client that will authenticate through Active Directory
TokenCredential credential = new DefaultAzureCredentialBuilder()
    .build();
String fullyQualifiedNamespace = "yournamespace.servicebus.windows.net";
ServiceBusSenderClient client = new ServiceBusClientBuilder()
    .credential(fullyQualifiedNamespace, credential)
    .sender()
    .queueName("my-queue")
    .buildClient();

// Create a receiver client that will authenticate using a connection string
String connectionString = "Endpoint=sb://yournamespace.servicebus.windows.net/;SharedAccessKeyName=your-key-name;SharedAccessKey=your-key";
ServiceBusReceiverClient client = new ServiceBusClientBuilder()
    .connectionString(connectionString)
    .receiver()
    .queueName("my-queue")
    .buildClient();
```

### Sending messages

Previously, in `azure-servicebus`, you could send messages either by using a `IQueueClient` (or `ITopicClient` if you
are targeting a topic) or the `IMessageSender`.

While the `IQueueClient` supported the simple send operation, the `IMessageSender` supported that and advanced scenarios
like scheduling to send messages at a later time and cancelling such scheduled messages.

```java
String queueName = "my-queue";
String connectionString = "Endpoint=sb://yournamespace.servicebus.windows.net/;"
    + "SharedAccessKeyName=your-key-name;SharedAccessKey=your-key";

// create a message to send
Message message = new Message("content");

// send using the QueueClient
QueueClient client = new QueueClient(new ConnectionStringBuilder(connectionString, queueName),
    ReceiveMode.PEEKLOCK);
client.send(message);

// send using the IMessageSender
IMessageSender sender = ClientFactory.createMessageSenderFromConnectionStringBuilder(
    new ConnectionStringBuilder(connectionString, queueName));
sender.send(message);
```

Now in `azure-messaging-servicebus`, we combine all send related features under a common class `ServiceBusSenderClient`
and `ServiceBusSenderAsyncClient` that you can create from the top-level client builder using the `sender()` method to
get a sub-builder. This method takes the queue or topic you want to target. This way, we give you a one stop shop for
all your send related needs.

We continue to support sending bytes in the message. Though, if you are working with strings, you can now create a
message directly without having to convert it to bytes first.

```java
// create the sender via the builder and its sub-builder
ServiceBusSenderClient client = new ServiceBusClientBuilder()
    .connectionString(connectionString)
    .sender()
    .queueName("my-queue")
    .buildClient();

// create a message to send
ServiceBusMessage message = new ServiceBusMessage("Hello world!");

// send the message
sender.SendMessage(message);
```

The feature to send a list of messages in a single call was implemented by batching all the messages into a single AMQP
message and sending that to the service.

While we continue to support this feature, it always had the potential to fail unexpectedly when the resulting batched
AMQP message exceeded the size limit of the sender. To help with this, we now provide a safe way to batch multiple
messages to be sent at once using the new `ServiceBusMessageBatch` class.

In the below code snippet, `inputMessageArray` is an array of messages which we will loop over to safely batch and then
send.

```java
ServiceBusMessage[] inputMessageArray = new ServiceBusMessage[10];
ServiceBusMessageBatch messageBatch = sender.createBatch();

for (int i = 0; i < inputMessageArray.length; i++) {
    if (!messageBatch.tryAdd(inputMessageArray[i])) {
        if (messageBatch.getCount() == 0) {
            System.err.println("Failed to fit message number in a batch. i:" + i);
            break;
        }

        // Decrement counter so that message number i can get another chance in a new batch
        i--;

        // send the message batch and create a new batch
        sender.sendMessages(messageBatch);
        messageBatch = sender.createBatch();
    }
}

// send the final batch
if (messageBatch.getCount() > 0) {
    sender.sendMessages(messageBatch);
}
```

### Receiving messages

Previously, in `azure-servicebus`, you could receive messages either by using a `IQueueClient` (or `ISubscriptionClient`
if you are targeting a subscription) or the `IMessageReceiver`.

While the `IQueueClient` and supported the simple push model where you could register message and error
handlers/callbacks, the `IMessageReceiver` provided you with ways to receive messages (both normal and deferred) in
batches, settle messages and renew locks.

```java
QueueClient client = new QueueClient(new ConnectionStringBuilder(connectionString, queueName),
    ReceiveMode.PEEKLOCK);

int maxConcurrentCalls = 3;
boolean isAutoComplete = false;
Duration maxAutoRenewDuration = Duration.ofMinutes(5);
Duration maxMessageWaitDuration = Duration.ofSeconds(10);
MessageHandlerOptions options = new MessageHandlerOptions(maxConcurrentCalls, isAutoComplete,
    maxAutoRenewDuration, maxMessageWaitDuration);
ExecutorService executor = Executors.newWorkStealingPool(maxConcurrentCalls);

try {
    client.registerMessageHandler(new IMessageHandler() {
        @Override
        public CompletableFuture<Void> onMessageAsync(IMessage message) {
            MessageBody messageBody = message.getMessageBody();
            switch (messageBody.getBodyType()) {
                case BINARY:
                    List<byte[]> binary = messageBody.getBinaryData();
                    byte[] bytes = binary.get(0);
                    System.out.printf("Received message with Binary body: %s%n",
                        new String(bytes));
                    break;
                case VALUE:
                    System.out.printf("Received message with Value body: %s%n",
                        messageBody.getValueData());
                    break;
                case SEQUENCE:
                    List<List<Object>> sequence = messageBody.getSequenceData();
                    System.out.printf("Received message with Sequence body: size[%s]%n",
                        sequence.size());
                    break;
            }

            return client.completeAsync(message.getLockToken());
        }

        @Override
        public void notifyException(Throwable exception, ExceptionPhase phase) {
            System.err.printf("Message handler encountered an exception. %s Phase: %s%n",
                exception, phase);
        }
    }, options, executor);
} finally {
    executor.shutdown();
}
```

The modernized Java SDK uses reactive programming for asynchronous operations rather than CompletableFutures. This
allows us to think of receiving as a potentially infinite stream of messages instead of invoking periodic message
handlers like the example above. Things of note:

* Auto-complete has been removed.
* Auto-renew is done using the ServiceBusReceiverAsyncClient's `renewMessageLock(ServiceBusReceivedMessage, Duration)`
  overload or ServiceBusReceiverClient's `renewMessageLock(ServiceBusReceivedMessage, Duration, Consumer<Throwable>)`.
* [Project Reactor](https://projectreactor.io) has a plethora of operators that can transform, limit, apply
  backpressure, etc. to reactive Streams.

```java
ServiceBusReceiverAsyncClient asyncReceiver = new ServiceBusClientBuilder()
    .connectionString(connectionString)
    .receiver()
    .queueName("queue")
    .buildAsyncClient();

// This is a non-blocking call. You would maintain a reference to this subscription and
// dispose of it when you are done receiving messages.
Disposable subscription = asyncReceiver.receiveMessages()
    .flatMap(context -> {
        ServiceBusReceivedMessage message = context.getMessage();
        System.out.printf("Processing message with Binary body: %s%n",
            new String(message.getBody()));

        // Completes the message and then we'll return the message's sequence number.
        return asyncReceiver.complete(message).thenReturn(message.getSequenceNumber());
    })
    .subscribe(sequenceNumber -> {
        System.out.println("Completed message: " + sequenceNumber);
    }, error -> {
        System.err.printf("Message handler encountered an exception. %s%n", error);
    }, () -> {
        System.out.println("Completed receiving messages.");
    });
```

### Working with sessions

Previously, you had the below options to receive messages from a session enabled queue/subscription
- Register message and error handlers using the `QueueClient.registerSessionHandler()` method to receive messages from
  an available set of sessions
- Use the `ClientFactory.acceptMessageSessionAsync()` method to get an instance of the `IMessageSession` class that will be tied to a given sessionId or to the next available session if no sessionId is provided.

While the first option is similar to what you would do in a non-session scenario, the second that allows you
finer-grained control is very different from any other pattern used in the library.

Now, we simplify this by giving session variants of the same methods and classes that are available when working with
queues/subscriptions that do not have sessions enabled. The difference is an intermediate client
`ServiceBusSessionReceiverAsyncClient` which returns the familiar `ServiceBusReceiverAsyncClient`.

The below code snippet shows you the session variation of receiving messages in lieu of
`QueueClient.registerSessionHandler()`.

```java
ServiceBusSessionReceiverAsyncClient sessionClient = new ServiceBusClientBuilder()
    .connectionString(connectionString)
    .sessionReceiver()
    .queueName("queue")
    .buildAsyncClient();

int maxConcurrentSessions = 3;
ServiceBusReceiverAsyncClient asyncReceiver = sessionClient.getReceiverClient(maxConcurrentSessions);

// This is a non-blocking call. You would maintain a reference to this subscription and
// dispose of it when you are done receiving messages.
Disposable subscription = asyncReceiver.receiveMessages()
    .flatMap(context -> {

        if (context.hasError()) {
            System.out.printf("There was an error processing session %s. Error: %s%n",
                context.getSessionId(), context.getThrowable());
            return Mono.empty();
        }

        ServiceBusReceivedMessage message = context.getMessage();
        System.out.printf("Processing session '%s' message with Binary body: %s%n",
            context.getSessionId(), new String(message.getBody()));

        // Completes the message and then we'll return the message's sequence number.
        return asyncReceiver.complete(message).thenReturn(message.getSequenceNumber());
    })
    .subscribe(sequenceNumber -> {
        System.out.println("Completed message: " + sequenceNumber);
    }, error -> {
        System.err.printf("Message handler encountered an exception. %s%n", error);
    }, () -> {
        System.out.println("Completed receiving messages.");
    });
```

The below code snippet shows you the session variation of the receiver. Please note that creating a session receiver is
an async operation because the library will need to get a lock on the session by connecting to the service first.

```java
ServiceBusSessionReceiverAsyncClient sessionClient = new ServiceBusClientBuilder()
    .connectionString(connectionString)
    .sessionReceiver()
    .queueName("queue")
    .buildAsyncClient();

Mono<ServiceBusReceiverAsyncClient> receiverClientMono = sessionClient.acceptSession("my-session-id");

// This is a non-blocking call. You would maintain a reference to this subscription and
// dispose of it when you are done receiving messages.
Disposable subscription = receiverClientMono.flatMapMany(asyncReceiver -> {
    return asyncReceiver.receiveMessages()
        .flatMap(context -> {

            if (context.hasError()) {
                System.out.printf("There was an error processing session %s. Error: %s%n",
                    context.getSessionId(), context.getThrowable());
                return Mono.empty();
            }

            ServiceBusReceivedMessage message = context.getMessage();
            System.out.printf("Processing session '%s' message with Binary body: %s%n",
                context.getSessionId(), new String(message.getBody()));

            // Completes the message and then we'll return the message's sequence number.
            return asyncReceiver.complete(message).thenReturn(message.getSequenceNumber());
        });
}).subscribe(sequenceNumber -> {
    System.out.println("Completed message: " + sequenceNumber);
}, error -> {
    System.err.printf("Message handler encountered an exception. %s%n", error);
}, () -> {
    System.out.println("Completed receiving messages.");
});
```

## Additional samples

More examples can be found at:
- [Service Bus samples](https://github.com/Azure/azure-sdk-for-java/tree/master/sdk/servicebus/azure-messaging-servicebus/src/samples/java/com/azure/messaging/servicebus)
