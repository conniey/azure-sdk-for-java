// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.networkcloud.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.networkcloud.fluent.models.VirtualMachinePatchProperties;
import java.io.IOException;
import java.util.Map;

/**
 * VirtualMachinePatchParameters represents the body of the request to patch the virtual machine.
 */
@Fluent
public final class VirtualMachinePatchParameters implements JsonSerializable<VirtualMachinePatchParameters> {
    /*
     * The list of the resource properties.
     */
    private VirtualMachinePatchProperties innerProperties;

    /*
     * The Azure resource tags that will replace the existing ones.
     */
    private Map<String, String> tags;

    /**
     * Creates an instance of VirtualMachinePatchParameters class.
     */
    public VirtualMachinePatchParameters() {
    }

    /**
     * Get the innerProperties property: The list of the resource properties.
     * 
     * @return the innerProperties value.
     */
    private VirtualMachinePatchProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the tags property: The Azure resource tags that will replace the existing ones.
     * 
     * @return the tags value.
     */
    public Map<String, String> tags() {
        return this.tags;
    }

    /**
     * Set the tags property: The Azure resource tags that will replace the existing ones.
     * 
     * @param tags the tags value to set.
     * @return the VirtualMachinePatchParameters object itself.
     */
    public VirtualMachinePatchParameters withTags(Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * Get the vmImageRepositoryCredentials property: The credentials used to login to the image repository that has
     * access to the specified image.
     * 
     * @return the vmImageRepositoryCredentials value.
     */
    public ImageRepositoryCredentials vmImageRepositoryCredentials() {
        return this.innerProperties() == null ? null : this.innerProperties().vmImageRepositoryCredentials();
    }

    /**
     * Set the vmImageRepositoryCredentials property: The credentials used to login to the image repository that has
     * access to the specified image.
     * 
     * @param vmImageRepositoryCredentials the vmImageRepositoryCredentials value to set.
     * @return the VirtualMachinePatchParameters object itself.
     */
    public VirtualMachinePatchParameters
        withVmImageRepositoryCredentials(ImageRepositoryCredentials vmImageRepositoryCredentials) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VirtualMachinePatchProperties();
        }
        this.innerProperties().withVmImageRepositoryCredentials(vmImageRepositoryCredentials);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeJsonField("properties", this.innerProperties);
        jsonWriter.writeMapField("tags", this.tags, (writer, element) -> writer.writeString(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of VirtualMachinePatchParameters from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of VirtualMachinePatchParameters if the JsonReader was pointing to an instance of it, or null
     * if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the VirtualMachinePatchParameters.
     */
    public static VirtualMachinePatchParameters fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            VirtualMachinePatchParameters deserializedVirtualMachinePatchParameters
                = new VirtualMachinePatchParameters();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("properties".equals(fieldName)) {
                    deserializedVirtualMachinePatchParameters.innerProperties
                        = VirtualMachinePatchProperties.fromJson(reader);
                } else if ("tags".equals(fieldName)) {
                    Map<String, String> tags = reader.readMap(reader1 -> reader1.getString());
                    deserializedVirtualMachinePatchParameters.tags = tags;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedVirtualMachinePatchParameters;
        });
    }
}
