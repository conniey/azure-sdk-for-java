// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.webpubsub.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.core.management.SystemData;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.webpubsub.models.WebPubSubHubProperties;
import java.io.IOException;

/**
 * A hub setting.
 */
@Fluent
public final class WebPubSubHubInner extends ProxyResource {
    /*
     * Properties of a hub.
     */
    private WebPubSubHubProperties properties;

    /*
     * Azure Resource Manager metadata containing createdBy and modifiedBy information.
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
     * Creates an instance of WebPubSubHubInner class.
     */
    public WebPubSubHubInner() {
    }

    /**
     * Get the properties property: Properties of a hub.
     * 
     * @return the properties value.
     */
    public WebPubSubHubProperties properties() {
        return this.properties;
    }

    /**
     * Set the properties property: Properties of a hub.
     * 
     * @param properties the properties value to set.
     * @return the WebPubSubHubInner object itself.
     */
    public WebPubSubHubInner withProperties(WebPubSubHubProperties properties) {
        this.properties = properties;
        return this;
    }

    /**
     * Get the systemData property: Azure Resource Manager metadata containing createdBy and modifiedBy information.
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
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (properties() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException("Missing required property properties in model WebPubSubHubInner"));
        } else {
            properties().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(WebPubSubHubInner.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeJsonField("properties", this.properties);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of WebPubSubHubInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of WebPubSubHubInner if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the WebPubSubHubInner.
     */
    public static WebPubSubHubInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            WebPubSubHubInner deserializedWebPubSubHubInner = new WebPubSubHubInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedWebPubSubHubInner.id = reader.getString();
                } else if ("name".equals(fieldName)) {
                    deserializedWebPubSubHubInner.name = reader.getString();
                } else if ("type".equals(fieldName)) {
                    deserializedWebPubSubHubInner.type = reader.getString();
                } else if ("properties".equals(fieldName)) {
                    deserializedWebPubSubHubInner.properties = WebPubSubHubProperties.fromJson(reader);
                } else if ("systemData".equals(fieldName)) {
                    deserializedWebPubSubHubInner.systemData = SystemData.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedWebPubSubHubInner;
        });
    }
}
