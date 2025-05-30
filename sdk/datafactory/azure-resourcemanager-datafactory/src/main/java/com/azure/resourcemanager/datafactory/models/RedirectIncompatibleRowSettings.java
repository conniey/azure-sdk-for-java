// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Redirect incompatible row settings.
 */
@Fluent
public final class RedirectIncompatibleRowSettings implements JsonSerializable<RedirectIncompatibleRowSettings> {
    /*
     * Name of the Azure Storage, Storage SAS, or Azure Data Lake Store linked service used for redirecting incompatible
     * row. Must be specified if redirectIncompatibleRowSettings is specified. Type: string (or Expression with
     * resultType string).
     */
    private Object linkedServiceName;

    /*
     * The path for storing the redirect incompatible row data. Type: string (or Expression with resultType string).
     */
    private Object path;

    /*
     * Redirect incompatible row settings
     */
    private Map<String, Object> additionalProperties;

    /**
     * Creates an instance of RedirectIncompatibleRowSettings class.
     */
    public RedirectIncompatibleRowSettings() {
    }

    /**
     * Get the linkedServiceName property: Name of the Azure Storage, Storage SAS, or Azure Data Lake Store linked
     * service used for redirecting incompatible row. Must be specified if redirectIncompatibleRowSettings is specified.
     * Type: string (or Expression with resultType string).
     * 
     * @return the linkedServiceName value.
     */
    public Object linkedServiceName() {
        return this.linkedServiceName;
    }

    /**
     * Set the linkedServiceName property: Name of the Azure Storage, Storage SAS, or Azure Data Lake Store linked
     * service used for redirecting incompatible row. Must be specified if redirectIncompatibleRowSettings is specified.
     * Type: string (or Expression with resultType string).
     * 
     * @param linkedServiceName the linkedServiceName value to set.
     * @return the RedirectIncompatibleRowSettings object itself.
     */
    public RedirectIncompatibleRowSettings withLinkedServiceName(Object linkedServiceName) {
        this.linkedServiceName = linkedServiceName;
        return this;
    }

    /**
     * Get the path property: The path for storing the redirect incompatible row data. Type: string (or Expression with
     * resultType string).
     * 
     * @return the path value.
     */
    public Object path() {
        return this.path;
    }

    /**
     * Set the path property: The path for storing the redirect incompatible row data. Type: string (or Expression with
     * resultType string).
     * 
     * @param path the path value to set.
     * @return the RedirectIncompatibleRowSettings object itself.
     */
    public RedirectIncompatibleRowSettings withPath(Object path) {
        this.path = path;
        return this;
    }

    /**
     * Get the additionalProperties property: Redirect incompatible row settings.
     * 
     * @return the additionalProperties value.
     */
    public Map<String, Object> additionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties property: Redirect incompatible row settings.
     * 
     * @param additionalProperties the additionalProperties value to set.
     * @return the RedirectIncompatibleRowSettings object itself.
     */
    public RedirectIncompatibleRowSettings withAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (linkedServiceName() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property linkedServiceName in model RedirectIncompatibleRowSettings"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(RedirectIncompatibleRowSettings.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeUntypedField("linkedServiceName", this.linkedServiceName);
        if (this.path != null) {
            jsonWriter.writeUntypedField("path", this.path);
        }
        if (additionalProperties != null) {
            for (Map.Entry<String, Object> additionalProperty : additionalProperties.entrySet()) {
                jsonWriter.writeUntypedField(additionalProperty.getKey(), additionalProperty.getValue());
            }
        }
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of RedirectIncompatibleRowSettings from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of RedirectIncompatibleRowSettings if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the RedirectIncompatibleRowSettings.
     */
    public static RedirectIncompatibleRowSettings fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            RedirectIncompatibleRowSettings deserializedRedirectIncompatibleRowSettings
                = new RedirectIncompatibleRowSettings();
            Map<String, Object> additionalProperties = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("linkedServiceName".equals(fieldName)) {
                    deserializedRedirectIncompatibleRowSettings.linkedServiceName = reader.readUntyped();
                } else if ("path".equals(fieldName)) {
                    deserializedRedirectIncompatibleRowSettings.path = reader.readUntyped();
                } else {
                    if (additionalProperties == null) {
                        additionalProperties = new LinkedHashMap<>();
                    }

                    additionalProperties.put(fieldName, reader.readUntyped());
                }
            }
            deserializedRedirectIncompatibleRowSettings.additionalProperties = additionalProperties;

            return deserializedRedirectIncompatibleRowSettings;
        });
    }
}
