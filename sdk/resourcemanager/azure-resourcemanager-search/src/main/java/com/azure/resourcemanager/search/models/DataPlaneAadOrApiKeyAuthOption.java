// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.search.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Indicates that either the API key or an access token from a Microsoft Entra ID tenant can be used for authentication.
 */
@Fluent
public final class DataPlaneAadOrApiKeyAuthOption implements JsonSerializable<DataPlaneAadOrApiKeyAuthOption> {
    /*
     * Describes what response the data plane API of a search service would send for requests that failed
     * authentication.
     */
    private AadAuthFailureMode aadAuthFailureMode;

    /**
     * Creates an instance of DataPlaneAadOrApiKeyAuthOption class.
     */
    public DataPlaneAadOrApiKeyAuthOption() {
    }

    /**
     * Get the aadAuthFailureMode property: Describes what response the data plane API of a search service would send
     * for requests that failed authentication.
     * 
     * @return the aadAuthFailureMode value.
     */
    public AadAuthFailureMode aadAuthFailureMode() {
        return this.aadAuthFailureMode;
    }

    /**
     * Set the aadAuthFailureMode property: Describes what response the data plane API of a search service would send
     * for requests that failed authentication.
     * 
     * @param aadAuthFailureMode the aadAuthFailureMode value to set.
     * @return the DataPlaneAadOrApiKeyAuthOption object itself.
     */
    public DataPlaneAadOrApiKeyAuthOption withAadAuthFailureMode(AadAuthFailureMode aadAuthFailureMode) {
        this.aadAuthFailureMode = aadAuthFailureMode;
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
        jsonWriter.writeStringField("aadAuthFailureMode",
            this.aadAuthFailureMode == null ? null : this.aadAuthFailureMode.toString());
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of DataPlaneAadOrApiKeyAuthOption from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of DataPlaneAadOrApiKeyAuthOption if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the DataPlaneAadOrApiKeyAuthOption.
     */
    public static DataPlaneAadOrApiKeyAuthOption fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            DataPlaneAadOrApiKeyAuthOption deserializedDataPlaneAadOrApiKeyAuthOption
                = new DataPlaneAadOrApiKeyAuthOption();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("aadAuthFailureMode".equals(fieldName)) {
                    deserializedDataPlaneAadOrApiKeyAuthOption.aadAuthFailureMode
                        = AadAuthFailureMode.fromString(reader.getString());
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedDataPlaneAadOrApiKeyAuthOption;
        });
    }
}
