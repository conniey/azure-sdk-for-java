// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.CoreUtils;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * managedAppPolicy
 * 
 * The ManagedAppPolicy resource represents a base type for platform specific policies.
 */
@Fluent
public final class MicrosoftGraphManagedAppPolicy extends MicrosoftGraphEntity {
    /*
     * The date and time the policy was created.
     */
    private OffsetDateTime createdDateTime;

    /*
     * The policy's description.
     */
    private String description;

    /*
     * Policy display name.
     */
    private String displayName;

    /*
     * Last time the policy was modified.
     */
    private OffsetDateTime lastModifiedDateTime;

    /*
     * Version of the entity.
     */
    private String version;

    /*
     * The ManagedAppPolicy resource represents a base type for platform specific policies.
     */
    private Map<String, Object> additionalProperties;

    /**
     * Creates an instance of MicrosoftGraphManagedAppPolicy class.
     */
    public MicrosoftGraphManagedAppPolicy() {
    }

    /**
     * Get the createdDateTime property: The date and time the policy was created.
     * 
     * @return the createdDateTime value.
     */
    public OffsetDateTime createdDateTime() {
        return this.createdDateTime;
    }

    /**
     * Set the createdDateTime property: The date and time the policy was created.
     * 
     * @param createdDateTime the createdDateTime value to set.
     * @return the MicrosoftGraphManagedAppPolicy object itself.
     */
    public MicrosoftGraphManagedAppPolicy withCreatedDateTime(OffsetDateTime createdDateTime) {
        this.createdDateTime = createdDateTime;
        return this;
    }

    /**
     * Get the description property: The policy's description.
     * 
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the description property: The policy's description.
     * 
     * @param description the description value to set.
     * @return the MicrosoftGraphManagedAppPolicy object itself.
     */
    public MicrosoftGraphManagedAppPolicy withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the displayName property: Policy display name.
     * 
     * @return the displayName value.
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Set the displayName property: Policy display name.
     * 
     * @param displayName the displayName value to set.
     * @return the MicrosoftGraphManagedAppPolicy object itself.
     */
    public MicrosoftGraphManagedAppPolicy withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Get the lastModifiedDateTime property: Last time the policy was modified.
     * 
     * @return the lastModifiedDateTime value.
     */
    public OffsetDateTime lastModifiedDateTime() {
        return this.lastModifiedDateTime;
    }

    /**
     * Set the lastModifiedDateTime property: Last time the policy was modified.
     * 
     * @param lastModifiedDateTime the lastModifiedDateTime value to set.
     * @return the MicrosoftGraphManagedAppPolicy object itself.
     */
    public MicrosoftGraphManagedAppPolicy withLastModifiedDateTime(OffsetDateTime lastModifiedDateTime) {
        this.lastModifiedDateTime = lastModifiedDateTime;
        return this;
    }

    /**
     * Get the version property: Version of the entity.
     * 
     * @return the version value.
     */
    public String version() {
        return this.version;
    }

    /**
     * Set the version property: Version of the entity.
     * 
     * @param version the version value to set.
     * @return the MicrosoftGraphManagedAppPolicy object itself.
     */
    public MicrosoftGraphManagedAppPolicy withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * Get the additionalProperties property: The ManagedAppPolicy resource represents a base type for platform specific
     * policies.
     * 
     * @return the additionalProperties value.
     */
    public Map<String, Object> additionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties property: The ManagedAppPolicy resource represents a base type for platform specific
     * policies.
     * 
     * @param additionalProperties the additionalProperties value to set.
     * @return the MicrosoftGraphManagedAppPolicy object itself.
     */
    public MicrosoftGraphManagedAppPolicy withAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MicrosoftGraphManagedAppPolicy withId(String id) {
        super.withId(id);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("id", id());
        jsonWriter.writeStringField("createdDateTime",
            this.createdDateTime == null ? null : DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(this.createdDateTime));
        jsonWriter.writeStringField("description", this.description);
        jsonWriter.writeStringField("displayName", this.displayName);
        jsonWriter.writeStringField("lastModifiedDateTime",
            this.lastModifiedDateTime == null
                ? null
                : DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(this.lastModifiedDateTime));
        jsonWriter.writeStringField("version", this.version);
        if (additionalProperties != null) {
            for (Map.Entry<String, Object> additionalProperty : additionalProperties.entrySet()) {
                jsonWriter.writeUntypedField(additionalProperty.getKey(), additionalProperty.getValue());
            }
        }
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of MicrosoftGraphManagedAppPolicy from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of MicrosoftGraphManagedAppPolicy if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the MicrosoftGraphManagedAppPolicy.
     */
    public static MicrosoftGraphManagedAppPolicy fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            MicrosoftGraphManagedAppPolicy deserializedMicrosoftGraphManagedAppPolicy
                = new MicrosoftGraphManagedAppPolicy();
            Map<String, Object> additionalProperties = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedMicrosoftGraphManagedAppPolicy.withId(reader.getString());
                } else if ("createdDateTime".equals(fieldName)) {
                    deserializedMicrosoftGraphManagedAppPolicy.createdDateTime = reader
                        .getNullable(nonNullReader -> CoreUtils.parseBestOffsetDateTime(nonNullReader.getString()));
                } else if ("description".equals(fieldName)) {
                    deserializedMicrosoftGraphManagedAppPolicy.description = reader.getString();
                } else if ("displayName".equals(fieldName)) {
                    deserializedMicrosoftGraphManagedAppPolicy.displayName = reader.getString();
                } else if ("lastModifiedDateTime".equals(fieldName)) {
                    deserializedMicrosoftGraphManagedAppPolicy.lastModifiedDateTime = reader
                        .getNullable(nonNullReader -> CoreUtils.parseBestOffsetDateTime(nonNullReader.getString()));
                } else if ("version".equals(fieldName)) {
                    deserializedMicrosoftGraphManagedAppPolicy.version = reader.getString();
                } else {
                    if (additionalProperties == null) {
                        additionalProperties = new LinkedHashMap<>();
                    }

                    additionalProperties.put(fieldName, reader.readUntyped());
                }
            }
            deserializedMicrosoftGraphManagedAppPolicy.additionalProperties = additionalProperties;

            return deserializedMicrosoftGraphManagedAppPolicy;
        });
    }
}
