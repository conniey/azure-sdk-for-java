---
page_type: sample
languages:
  - java
products:
  - azure
  - azure-event-hubs
urlFragment: schemaregistry-avro-samples
---

# Azure Schema Registry serializer library samples for Java

Azure Schema Registry Avro Serializer samples are a set of self-contained Java programs that demonstrate serialization
and deserialization of data for which the schema is stored in Schema Registry service. Each sample focuses on a
specific scenario and can be executed independently.

## Key concepts
Key concepts are explained in detail [here][sdk_readme_key_concepts].

## Getting started
Please refer to the [Getting Started][sdk_readme_getting_started] section.

## Examples

- [Serialize an object into avro schema bytes][sample_avro_serialization]
- [Deserialize avro serialized bytes into a strongly-typed object][sample_avro_deserialization]
- [Serialize and publish an event to Event Hubs][sample_event_hubs]

## Troubleshooting
See [Troubleshooting][sdk_readme_troubleshooting].

## Next steps
See [Next steps][sdk_readme_next_steps].

## Contributing
This project welcomes contributions and suggestions. See [Contributing][sdk_readme_contributing] for guidelines.

<!-- Links -->
[sdk_readme_key_concepts]: https://github.com/Azure/azure-sdk-for-java/blob/main/sdk/schemaregistry/azure-data-schemaregistry-apacheavro/README.md#key-concepts
[sdk_readme_getting_started]: https://github.com/Azure/azure-sdk-for-java/blob/main/sdk/schemaregistry/azure-data-schemaregistry-apacheavro/README.md#getting-started
[sdk_readme_troubleshooting]: https://github.com/Azure/azure-sdk-for-java/blob/main/sdk/schemaregistry/azure-data-schemaregistry-apacheavro/README.md#troubleshooting
[sdk_readme_next_steps]: https://github.com/Azure/azure-sdk-for-java/blob/main/sdk/schemaregistry/azure-data-schemaregistry-apacheavro/README.md#next-steps
[sdk_readme_contributing]: https://github.com/Azure/azure-sdk-for-java/blob/main/sdk/schemaregistry/azure-data-schemaregistry-apacheavro/README.md#contributing
[sample_avro_serialization]: https://github.com/Azure/azure-sdk-for-java/blob/main/sdk/schemaregistry/azure-data-schemaregistry-apacheavro/src/samples/java/com/azure/data/schemaregistry/apacheavro/SchemaRegistryApacheAvroSerializationSample.java
[sample_avro_deserialization]: https://github.com/Azure/azure-sdk-for-java/blob/main/sdk/schemaregistry/azure-data-schemaregistry-apacheavro/src/samples/java/com/azure/data/schemaregistry/apacheavro/SchemaRegistryApacheAvroDeserializationSample.java
[sample_event_hubs]: https://github.com/Azure/azure-sdk-for-java/blob/main/sdk/schemaregistry/azure-data-schemaregistry-apacheavro/src/samples/java/com/azure/data/schemaregistry/apacheavro/SchemaRegistryWithEventHubs.java


