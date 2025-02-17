// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dnsresolver.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.Resource;
import com.azure.core.management.SystemData;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.dnsresolver.models.IpConfiguration;
import com.azure.resourcemanager.dnsresolver.models.ProvisioningState;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/**
 * Describes an inbound endpoint for a DNS resolver.
 */
@Fluent
public final class InboundEndpointInner extends Resource {
    /*
     * ETag of the inbound endpoint.
     */
    private String etag;

    /*
     * Properties of the inbound endpoint.
     */
    private InboundEndpointProperties innerProperties = new InboundEndpointProperties();

    /*
     * Metadata pertaining to creation and last modification of the resource.
     */
    private SystemData systemData;

    /*
     * The type of the resource.
     */
    private String type;

    /*
     * The name of the resource.
     */
    private String name;

    /*
     * Fully qualified resource Id for the resource.
     */
    private String id;

    /**
     * Creates an instance of InboundEndpointInner class.
     */
    public InboundEndpointInner() {
    }

    /**
     * Get the etag property: ETag of the inbound endpoint.
     * 
     * @return the etag value.
     */
    public String etag() {
        return this.etag;
    }

    /**
     * Get the innerProperties property: Properties of the inbound endpoint.
     * 
     * @return the innerProperties value.
     */
    private InboundEndpointProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the systemData property: Metadata pertaining to creation and last modification of the resource.
     * 
     * @return the systemData value.
     */
    public SystemData systemData() {
        return this.systemData;
    }

    /**
     * Get the type property: The type of the resource.
     * 
     * @return the type value.
     */
    @Override
    public String type() {
        return this.type;
    }

    /**
     * Get the name property: The name of the resource.
     * 
     * @return the name value.
     */
    @Override
    public String name() {
        return this.name;
    }

    /**
     * Get the id property: Fully qualified resource Id for the resource.
     * 
     * @return the id value.
     */
    @Override
    public String id() {
        return this.id;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InboundEndpointInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InboundEndpointInner withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Get the ipConfigurations property: IP configurations for the inbound endpoint.
     * 
     * @return the ipConfigurations value.
     */
    public List<IpConfiguration> ipConfigurations() {
        return this.innerProperties() == null ? null : this.innerProperties().ipConfigurations();
    }

    /**
     * Set the ipConfigurations property: IP configurations for the inbound endpoint.
     * 
     * @param ipConfigurations the ipConfigurations value to set.
     * @return the InboundEndpointInner object itself.
     */
    public InboundEndpointInner withIpConfigurations(List<IpConfiguration> ipConfigurations) {
        if (this.innerProperties() == null) {
            this.innerProperties = new InboundEndpointProperties();
        }
        this.innerProperties().withIpConfigurations(ipConfigurations);
        return this;
    }

    /**
     * Get the provisioningState property: The current provisioning state of the inbound endpoint. This is a read-only
     * property and any attempt to set this value will be ignored.
     * 
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Get the resourceGuid property: The resourceGuid property of the inbound endpoint resource.
     * 
     * @return the resourceGuid value.
     */
    public String resourceGuid() {
        return this.innerProperties() == null ? null : this.innerProperties().resourceGuid();
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property innerProperties in model InboundEndpointInner"));
        } else {
            innerProperties().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(InboundEndpointInner.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("location", location());
        jsonWriter.writeMapField("tags", tags(), (writer, element) -> writer.writeString(element));
        jsonWriter.writeJsonField("properties", this.innerProperties);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of InboundEndpointInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of InboundEndpointInner if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the InboundEndpointInner.
     */
    public static InboundEndpointInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            InboundEndpointInner deserializedInboundEndpointInner = new InboundEndpointInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedInboundEndpointInner.id = reader.getString();
                } else if ("name".equals(fieldName)) {
                    deserializedInboundEndpointInner.name = reader.getString();
                } else if ("type".equals(fieldName)) {
                    deserializedInboundEndpointInner.type = reader.getString();
                } else if ("location".equals(fieldName)) {
                    deserializedInboundEndpointInner.withLocation(reader.getString());
                } else if ("tags".equals(fieldName)) {
                    Map<String, String> tags = reader.readMap(reader1 -> reader1.getString());
                    deserializedInboundEndpointInner.withTags(tags);
                } else if ("properties".equals(fieldName)) {
                    deserializedInboundEndpointInner.innerProperties = InboundEndpointProperties.fromJson(reader);
                } else if ("etag".equals(fieldName)) {
                    deserializedInboundEndpointInner.etag = reader.getString();
                } else if ("systemData".equals(fieldName)) {
                    deserializedInboundEndpointInner.systemData = SystemData.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedInboundEndpointInner;
        });
    }
}
