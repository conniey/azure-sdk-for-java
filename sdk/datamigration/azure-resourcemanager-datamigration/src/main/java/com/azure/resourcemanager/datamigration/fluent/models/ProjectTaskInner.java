// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datamigration.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.datamigration.models.ProjectTaskProperties;
import com.azure.resourcemanager.datamigration.models.SystemDataAutoGenerated;
import java.io.IOException;

/**
 * A task resource.
 */
@Fluent
public final class ProjectTaskInner extends ProxyResource {
    /*
     * HTTP strong entity tag value. This is ignored if submitted.
     */
    private String etag;

    /*
     * Custom task properties
     */
    private ProjectTaskProperties properties;

    /*
     * Metadata pertaining to creation and last modification of the resource.
     */
    private SystemDataAutoGenerated systemData;

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
     * Creates an instance of ProjectTaskInner class.
     */
    public ProjectTaskInner() {
    }

    /**
     * Get the etag property: HTTP strong entity tag value. This is ignored if submitted.
     * 
     * @return the etag value.
     */
    public String etag() {
        return this.etag;
    }

    /**
     * Set the etag property: HTTP strong entity tag value. This is ignored if submitted.
     * 
     * @param etag the etag value to set.
     * @return the ProjectTaskInner object itself.
     */
    public ProjectTaskInner withEtag(String etag) {
        this.etag = etag;
        return this;
    }

    /**
     * Get the properties property: Custom task properties.
     * 
     * @return the properties value.
     */
    public ProjectTaskProperties properties() {
        return this.properties;
    }

    /**
     * Set the properties property: Custom task properties.
     * 
     * @param properties the properties value to set.
     * @return the ProjectTaskInner object itself.
     */
    public ProjectTaskInner withProperties(ProjectTaskProperties properties) {
        this.properties = properties;
        return this;
    }

    /**
     * Get the systemData property: Metadata pertaining to creation and last modification of the resource.
     * 
     * @return the systemData value.
     */
    public SystemDataAutoGenerated systemData() {
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
        if (properties() != null) {
            properties().validate();
        }
        if (systemData() != null) {
            systemData().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("etag", this.etag);
        jsonWriter.writeJsonField("properties", this.properties);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ProjectTaskInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ProjectTaskInner if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the ProjectTaskInner.
     */
    public static ProjectTaskInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ProjectTaskInner deserializedProjectTaskInner = new ProjectTaskInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedProjectTaskInner.id = reader.getString();
                } else if ("name".equals(fieldName)) {
                    deserializedProjectTaskInner.name = reader.getString();
                } else if ("type".equals(fieldName)) {
                    deserializedProjectTaskInner.type = reader.getString();
                } else if ("etag".equals(fieldName)) {
                    deserializedProjectTaskInner.etag = reader.getString();
                } else if ("properties".equals(fieldName)) {
                    deserializedProjectTaskInner.properties = ProjectTaskProperties.fromJson(reader);
                } else if ("systemData".equals(fieldName)) {
                    deserializedProjectTaskInner.systemData = SystemDataAutoGenerated.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedProjectTaskInner;
        });
    }
}
