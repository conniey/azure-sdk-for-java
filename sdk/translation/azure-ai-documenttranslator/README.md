# Azure Document Translator client library for Java

## Deprecation Notice

> Please note, this package has been deprecated and will no longer be maintained. We encourage you to 
> upgrade to the replacement package, `azure-ai-translation-document`, to continue receiving updates. 
> Refer to our deprecation policy (https://aka.ms/azsdk/support-policies) for more details.

Microsoft Azure Cognitive Services Document Translator API enables you to translate documents in batch.

[Source code][source_code] | [Package (Maven)][package] | [Product Documentation][product_documentation] | [Samples][samples_readme]

## Getting started

### Prerequisites

- A [Java Development Kit (JDK)][jdk_link], version 8 or later.
- [Azure Subscription][azure_subscription]
- An existing Cognitive Services.

For more information about creating the resource or how to get the location and sku information see [here][cognitive_resource_cli].

### Include the Package

[//]: # ({x-version-update-start;com.azure:azure-ai-documenttranslator;current})
```xml
<dependency>
  <groupId>com.azure</groupId>
  <artifactId>azure-ai-documenttranslator</artifactId>
  <version>1.0.0-beta.2</version>
</dependency>
```
[//]: # ({x-version-update-end})


### Authenticate the client
In order to interact with the Document Translator service, you'll need to create an instance of the [`BatchDocumentTranslationClient`][batch_document_translation_client_class] class.  You will need an **endpoint** and an **API key** to instantiate a client object.  

#### Get API Key

You can obtain the endpoint and API key from the resource information in the [Azure Portal][azure_portal] from your Document Translator resource. The endpoint is of format `https://<NAME-OF-YOUR-RESOURCE>.cognitiveservices.azure.com`. 

##### Example
```java readme-sample-createBatchDocumentTranslationRestClient
String endpoint = String.format("https://%s.cognitiveservices.azure.com/translator/text/batch/v1.0-preview.1",
    "<document-translator-resource-name>");
String apiKey = "<document-translator-api-key>";

BatchDocumentTranslationClient client = new BatchDocumentTranslationClientBuilder()
    .credential(new AzureKeyCredential(apiKey))
    .endpoint(endpoint)
    .httpClient(new NettyAsyncHttpClientBuilder().build())
    .buildClient();
```

## Key concepts

## Examples
More examples can be found in [samples][samples_code].

## Troubleshooting

### Enabling Logging

Azure SDKs for Java offer a consistent logging story to help aid in troubleshooting application errors and expedite
their resolution. The logs produced will capture the flow of an application before reaching the terminal state to help
locate the root issue. View the [logging][logging] wiki for guidance about enabling logging.

## Next steps

## Contributing

This project welcomes contributions and suggestions. Most contributions require you to agree to a [Contributor License Agreement (CLA)][cla] declaring that you have the right to, and actually do, grant us the rights to use your contribution.

When you submit a pull request, a CLA-bot will automatically determine whether you need to provide a CLA and decorate the PR appropriately (e.g., label, comment). Simply follow the instructions provided by the bot. You will only need to do this once across all repos using our CLA.

This project has adopted the [Microsoft Open Source Code of Conduct][coc]. For more information see the [Code of Conduct FAQ][coc_faq] or contact [opencode@microsoft.com][coc_contact] with any additional questions or comments.

<!-- LINKS -->
[samples]: src/samples/java/com/azure/ai/documenttranslator
[source_code]: https://github.com/Azure/azure-sdk-for-java/blob/main/sdk/translation/azure-ai-documenttranslator/src
[samples_code]: https://github.com/Azure/azure-sdk-for-java/blob/main/sdk/translation/azure-ai-documenttranslator/src/samples/
[azure_subscription]: https://azure.microsoft.com/free/
[product_documentation]: https://learn.microsoft.com/azure/ai-services/translator/document-translation/overview#get-started
[cognitive_resource_cli]: https://learn.microsoft.com/azure/cognitive-services/cognitive-services-apis-create-account-cli
[batch_document_translation_client_class]: https://github.com/Azure/azure-sdk-for-java/tree/7cebc63a02f2f6ccd2a8adc9b7975e2e71bd3f74/sdk/translation/azure-ai-documenttranslator/src/main/java/com/azure/ai/documenttranslator/BatchDocumentTranslationClient.java
[azure_portal]: https://portal.azure.com
[jdk_link]: https://learn.microsoft.com/java/azure/jdk/?view=azure-java-stable
[package]: https://central.sonatype.com/artifact/com.azure/azure-ai-documenttranslator
[samples_readme]: https://github.com/Azure/azure-sdk-for-java/tree/main/sdk/translation/azure-ai-documenttranslator/src/samples/README.md


