// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Update recovery plan input class.
 */
@Fluent
public final class UpdateRecoveryPlanInput implements JsonSerializable<UpdateRecoveryPlanInput> {
    /*
     * Recovery plan update properties.
     */
    private UpdateRecoveryPlanInputProperties properties;

    /**
     * Creates an instance of UpdateRecoveryPlanInput class.
     */
    public UpdateRecoveryPlanInput() {
    }

    /**
     * Get the properties property: Recovery plan update properties.
     * 
     * @return the properties value.
     */
    public UpdateRecoveryPlanInputProperties properties() {
        return this.properties;
    }

    /**
     * Set the properties property: Recovery plan update properties.
     * 
     * @param properties the properties value to set.
     * @return the UpdateRecoveryPlanInput object itself.
     */
    public UpdateRecoveryPlanInput withProperties(UpdateRecoveryPlanInputProperties properties) {
        this.properties = properties;
        return this;
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
    }

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
     * Reads an instance of UpdateRecoveryPlanInput from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of UpdateRecoveryPlanInput if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IOException If an error occurs while reading the UpdateRecoveryPlanInput.
     */
    public static UpdateRecoveryPlanInput fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            UpdateRecoveryPlanInput deserializedUpdateRecoveryPlanInput = new UpdateRecoveryPlanInput();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("properties".equals(fieldName)) {
                    deserializedUpdateRecoveryPlanInput.properties = UpdateRecoveryPlanInputProperties.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedUpdateRecoveryPlanInput;
        });
    }
}
