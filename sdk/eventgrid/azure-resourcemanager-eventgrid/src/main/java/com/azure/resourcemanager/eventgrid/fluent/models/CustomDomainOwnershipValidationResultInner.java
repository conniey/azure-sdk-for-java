// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.eventgrid.models.CustomDomainConfiguration;
import java.io.IOException;
import java.util.List;

/**
 * Namespace custom domain ownership validation result.
 */
@Fluent
public final class CustomDomainOwnershipValidationResultInner
    implements JsonSerializable<CustomDomainOwnershipValidationResultInner> {
    /*
     * List of custom domain configurations for the namespace under topics configuration.
     */
    private List<CustomDomainConfiguration> customDomainsForTopicsConfiguration;

    /*
     * List of custom domain configurations for the namespace under topic spaces configuration.
     */
    private List<CustomDomainConfiguration> customDomainsForTopicSpacesConfiguration;

    /**
     * Creates an instance of CustomDomainOwnershipValidationResultInner class.
     */
    public CustomDomainOwnershipValidationResultInner() {
    }

    /**
     * Get the customDomainsForTopicsConfiguration property: List of custom domain configurations for the namespace
     * under topics configuration.
     * 
     * @return the customDomainsForTopicsConfiguration value.
     */
    public List<CustomDomainConfiguration> customDomainsForTopicsConfiguration() {
        return this.customDomainsForTopicsConfiguration;
    }

    /**
     * Set the customDomainsForTopicsConfiguration property: List of custom domain configurations for the namespace
     * under topics configuration.
     * 
     * @param customDomainsForTopicsConfiguration the customDomainsForTopicsConfiguration value to set.
     * @return the CustomDomainOwnershipValidationResultInner object itself.
     */
    public CustomDomainOwnershipValidationResultInner
        withCustomDomainsForTopicsConfiguration(List<CustomDomainConfiguration> customDomainsForTopicsConfiguration) {
        this.customDomainsForTopicsConfiguration = customDomainsForTopicsConfiguration;
        return this;
    }

    /**
     * Get the customDomainsForTopicSpacesConfiguration property: List of custom domain configurations for the namespace
     * under topic spaces configuration.
     * 
     * @return the customDomainsForTopicSpacesConfiguration value.
     */
    public List<CustomDomainConfiguration> customDomainsForTopicSpacesConfiguration() {
        return this.customDomainsForTopicSpacesConfiguration;
    }

    /**
     * Set the customDomainsForTopicSpacesConfiguration property: List of custom domain configurations for the namespace
     * under topic spaces configuration.
     * 
     * @param customDomainsForTopicSpacesConfiguration the customDomainsForTopicSpacesConfiguration value to set.
     * @return the CustomDomainOwnershipValidationResultInner object itself.
     */
    public CustomDomainOwnershipValidationResultInner withCustomDomainsForTopicSpacesConfiguration(
        List<CustomDomainConfiguration> customDomainsForTopicSpacesConfiguration) {
        this.customDomainsForTopicSpacesConfiguration = customDomainsForTopicSpacesConfiguration;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (customDomainsForTopicsConfiguration() != null) {
            customDomainsForTopicsConfiguration().forEach(e -> e.validate());
        }
        if (customDomainsForTopicSpacesConfiguration() != null) {
            customDomainsForTopicSpacesConfiguration().forEach(e -> e.validate());
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeArrayField("customDomainsForTopicsConfiguration", this.customDomainsForTopicsConfiguration,
            (writer, element) -> writer.writeJson(element));
        jsonWriter.writeArrayField("customDomainsForTopicSpacesConfiguration",
            this.customDomainsForTopicSpacesConfiguration, (writer, element) -> writer.writeJson(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of CustomDomainOwnershipValidationResultInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of CustomDomainOwnershipValidationResultInner if the JsonReader was pointing to an instance
     * of it, or null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the CustomDomainOwnershipValidationResultInner.
     */
    public static CustomDomainOwnershipValidationResultInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            CustomDomainOwnershipValidationResultInner deserializedCustomDomainOwnershipValidationResultInner
                = new CustomDomainOwnershipValidationResultInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("customDomainsForTopicsConfiguration".equals(fieldName)) {
                    List<CustomDomainConfiguration> customDomainsForTopicsConfiguration
                        = reader.readArray(reader1 -> CustomDomainConfiguration.fromJson(reader1));
                    deserializedCustomDomainOwnershipValidationResultInner.customDomainsForTopicsConfiguration
                        = customDomainsForTopicsConfiguration;
                } else if ("customDomainsForTopicSpacesConfiguration".equals(fieldName)) {
                    List<CustomDomainConfiguration> customDomainsForTopicSpacesConfiguration
                        = reader.readArray(reader1 -> CustomDomainConfiguration.fromJson(reader1));
                    deserializedCustomDomainOwnershipValidationResultInner.customDomainsForTopicSpacesConfiguration
                        = customDomainsForTopicSpacesConfiguration;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedCustomDomainOwnershipValidationResultInner;
        });
    }
}
