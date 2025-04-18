// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storagemover.fluent.models;

import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Response that identifies a Job Run.
 */
@Immutable
public final class JobRunResourceIdInner implements JsonSerializable<JobRunResourceIdInner> {
    /*
     * Fully qualified resource id of the Job Run.
     */
    private String jobRunResourceId;

    /**
     * Creates an instance of JobRunResourceIdInner class.
     */
    public JobRunResourceIdInner() {
    }

    /**
     * Get the jobRunResourceId property: Fully qualified resource id of the Job Run.
     * 
     * @return the jobRunResourceId value.
     */
    public String jobRunResourceId() {
        return this.jobRunResourceId;
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
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of JobRunResourceIdInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of JobRunResourceIdInner if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IOException If an error occurs while reading the JobRunResourceIdInner.
     */
    public static JobRunResourceIdInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            JobRunResourceIdInner deserializedJobRunResourceIdInner = new JobRunResourceIdInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("jobRunResourceId".equals(fieldName)) {
                    deserializedJobRunResourceIdInner.jobRunResourceId = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedJobRunResourceIdInner;
        });
    }
}
