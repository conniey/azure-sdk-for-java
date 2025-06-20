// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Generated;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Details of the customer managed key associated with the workspace.
 */
@Fluent
public final class WorkspaceKeyDetails implements JsonSerializable<WorkspaceKeyDetails> {
    /*
     * Workspace Key sub-resource name
     */
    @Generated
    private String name;

    /*
     * Workspace Key sub-resource key vault url
     */
    @Generated
    private String keyVaultUrl;

    /**
     * Creates an instance of WorkspaceKeyDetails class.
     */
    @Generated
    public WorkspaceKeyDetails() {
    }

    /**
     * Get the name property: Workspace Key sub-resource name.
     * 
     * @return the name value.
     */
    @Generated
    public String getName() {
        return this.name;
    }

    /**
     * Set the name property: Workspace Key sub-resource name.
     * 
     * @param name the name value to set.
     * @return the WorkspaceKeyDetails object itself.
     */
    @Generated
    public WorkspaceKeyDetails setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the keyVaultUrl property: Workspace Key sub-resource key vault url.
     * 
     * @return the keyVaultUrl value.
     */
    @Generated
    public String getKeyVaultUrl() {
        return this.keyVaultUrl;
    }

    /**
     * Set the keyVaultUrl property: Workspace Key sub-resource key vault url.
     * 
     * @param keyVaultUrl the keyVaultUrl value to set.
     * @return the WorkspaceKeyDetails object itself.
     */
    @Generated
    public WorkspaceKeyDetails setKeyVaultUrl(String keyVaultUrl) {
        this.keyVaultUrl = keyVaultUrl;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("name", this.name);
        jsonWriter.writeStringField("keyVaultUrl", this.keyVaultUrl);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of WorkspaceKeyDetails from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of WorkspaceKeyDetails if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the WorkspaceKeyDetails.
     */
    @Generated
    public static WorkspaceKeyDetails fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            WorkspaceKeyDetails deserializedWorkspaceKeyDetails = new WorkspaceKeyDetails();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("name".equals(fieldName)) {
                    deserializedWorkspaceKeyDetails.name = reader.getString();
                } else if ("keyVaultUrl".equals(fieldName)) {
                    deserializedWorkspaceKeyDetails.keyVaultUrl = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedWorkspaceKeyDetails;
        });
    }
}
