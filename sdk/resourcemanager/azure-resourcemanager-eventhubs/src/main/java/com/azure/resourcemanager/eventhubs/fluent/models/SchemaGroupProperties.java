// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventhubs.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.CoreUtils;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.eventhubs.models.SchemaCompatibility;
import com.azure.resourcemanager.eventhubs.models.SchemaType;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.Map;
import java.util.UUID;

/**
 * The SchemaGroupProperties model.
 */
@Fluent
public final class SchemaGroupProperties implements JsonSerializable<SchemaGroupProperties> {
    /*
     * Exact time the Schema Group was updated
     */
    private OffsetDateTime updatedAtUtc;

    /*
     * Exact time the Schema Group was created.
     */
    private OffsetDateTime createdAtUtc;

    /*
     * The ETag value.
     */
    private UUID etag;

    /*
     * dictionary object for SchemaGroup group properties
     */
    private Map<String, String> groupProperties;

    /*
     * The schemaCompatibility property.
     */
    private SchemaCompatibility schemaCompatibility;

    /*
     * The schemaType property.
     */
    private SchemaType schemaType;

    /**
     * Creates an instance of SchemaGroupProperties class.
     */
    public SchemaGroupProperties() {
    }

    /**
     * Get the updatedAtUtc property: Exact time the Schema Group was updated.
     * 
     * @return the updatedAtUtc value.
     */
    public OffsetDateTime updatedAtUtc() {
        return this.updatedAtUtc;
    }

    /**
     * Get the createdAtUtc property: Exact time the Schema Group was created.
     * 
     * @return the createdAtUtc value.
     */
    public OffsetDateTime createdAtUtc() {
        return this.createdAtUtc;
    }

    /**
     * Get the etag property: The ETag value.
     * 
     * @return the etag value.
     */
    public UUID etag() {
        return this.etag;
    }

    /**
     * Get the groupProperties property: dictionary object for SchemaGroup group properties.
     * 
     * @return the groupProperties value.
     */
    public Map<String, String> groupProperties() {
        return this.groupProperties;
    }

    /**
     * Set the groupProperties property: dictionary object for SchemaGroup group properties.
     * 
     * @param groupProperties the groupProperties value to set.
     * @return the SchemaGroupProperties object itself.
     */
    public SchemaGroupProperties withGroupProperties(Map<String, String> groupProperties) {
        this.groupProperties = groupProperties;
        return this;
    }

    /**
     * Get the schemaCompatibility property: The schemaCompatibility property.
     * 
     * @return the schemaCompatibility value.
     */
    public SchemaCompatibility schemaCompatibility() {
        return this.schemaCompatibility;
    }

    /**
     * Set the schemaCompatibility property: The schemaCompatibility property.
     * 
     * @param schemaCompatibility the schemaCompatibility value to set.
     * @return the SchemaGroupProperties object itself.
     */
    public SchemaGroupProperties withSchemaCompatibility(SchemaCompatibility schemaCompatibility) {
        this.schemaCompatibility = schemaCompatibility;
        return this;
    }

    /**
     * Get the schemaType property: The schemaType property.
     * 
     * @return the schemaType value.
     */
    public SchemaType schemaType() {
        return this.schemaType;
    }

    /**
     * Set the schemaType property: The schemaType property.
     * 
     * @param schemaType the schemaType value to set.
     * @return the SchemaGroupProperties object itself.
     */
    public SchemaGroupProperties withSchemaType(SchemaType schemaType) {
        this.schemaType = schemaType;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeMapField("groupProperties", this.groupProperties,
            (writer, element) -> writer.writeString(element));
        jsonWriter.writeStringField("schemaCompatibility",
            this.schemaCompatibility == null ? null : this.schemaCompatibility.toString());
        jsonWriter.writeStringField("schemaType", this.schemaType == null ? null : this.schemaType.toString());
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of SchemaGroupProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of SchemaGroupProperties if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IOException If an error occurs while reading the SchemaGroupProperties.
     */
    public static SchemaGroupProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            SchemaGroupProperties deserializedSchemaGroupProperties = new SchemaGroupProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("updatedAtUtc".equals(fieldName)) {
                    deserializedSchemaGroupProperties.updatedAtUtc = reader
                        .getNullable(nonNullReader -> CoreUtils.parseBestOffsetDateTime(nonNullReader.getString()));
                } else if ("createdAtUtc".equals(fieldName)) {
                    deserializedSchemaGroupProperties.createdAtUtc = reader
                        .getNullable(nonNullReader -> CoreUtils.parseBestOffsetDateTime(nonNullReader.getString()));
                } else if ("eTag".equals(fieldName)) {
                    deserializedSchemaGroupProperties.etag
                        = reader.getNullable(nonNullReader -> UUID.fromString(nonNullReader.getString()));
                } else if ("groupProperties".equals(fieldName)) {
                    Map<String, String> groupProperties = reader.readMap(reader1 -> reader1.getString());
                    deserializedSchemaGroupProperties.groupProperties = groupProperties;
                } else if ("schemaCompatibility".equals(fieldName)) {
                    deserializedSchemaGroupProperties.schemaCompatibility
                        = SchemaCompatibility.fromString(reader.getString());
                } else if ("schemaType".equals(fieldName)) {
                    deserializedSchemaGroupProperties.schemaType = SchemaType.fromString(reader.getString());
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedSchemaGroupProperties;
        });
    }
}
