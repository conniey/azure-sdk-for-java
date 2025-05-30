// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Managed RunCommand script input.
 */
@Fluent
public final class ManagedRunCommandScriptInput implements JsonSerializable<ManagedRunCommandScriptInput> {
    /*
     * The step name.
     */
    private String stepName;

    /*
     * The script url.
     */
    private String scriptUrl;

    /*
     * The script parameters.
     */
    private String scriptParameters;

    /**
     * Creates an instance of ManagedRunCommandScriptInput class.
     */
    public ManagedRunCommandScriptInput() {
    }

    /**
     * Get the stepName property: The step name.
     * 
     * @return the stepName value.
     */
    public String stepName() {
        return this.stepName;
    }

    /**
     * Set the stepName property: The step name.
     * 
     * @param stepName the stepName value to set.
     * @return the ManagedRunCommandScriptInput object itself.
     */
    public ManagedRunCommandScriptInput withStepName(String stepName) {
        this.stepName = stepName;
        return this;
    }

    /**
     * Get the scriptUrl property: The script url.
     * 
     * @return the scriptUrl value.
     */
    public String scriptUrl() {
        return this.scriptUrl;
    }

    /**
     * Set the scriptUrl property: The script url.
     * 
     * @param scriptUrl the scriptUrl value to set.
     * @return the ManagedRunCommandScriptInput object itself.
     */
    public ManagedRunCommandScriptInput withScriptUrl(String scriptUrl) {
        this.scriptUrl = scriptUrl;
        return this;
    }

    /**
     * Get the scriptParameters property: The script parameters.
     * 
     * @return the scriptParameters value.
     */
    public String scriptParameters() {
        return this.scriptParameters;
    }

    /**
     * Set the scriptParameters property: The script parameters.
     * 
     * @param scriptParameters the scriptParameters value to set.
     * @return the ManagedRunCommandScriptInput object itself.
     */
    public ManagedRunCommandScriptInput withScriptParameters(String scriptParameters) {
        this.scriptParameters = scriptParameters;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (stepName() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property stepName in model ManagedRunCommandScriptInput"));
        }
        if (scriptUrl() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property scriptUrl in model ManagedRunCommandScriptInput"));
        }
        if (scriptParameters() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property scriptParameters in model ManagedRunCommandScriptInput"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(ManagedRunCommandScriptInput.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("stepName", this.stepName);
        jsonWriter.writeStringField("scriptUrl", this.scriptUrl);
        jsonWriter.writeStringField("scriptParameters", this.scriptParameters);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ManagedRunCommandScriptInput from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ManagedRunCommandScriptInput if the JsonReader was pointing to an instance of it, or null
     * if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the ManagedRunCommandScriptInput.
     */
    public static ManagedRunCommandScriptInput fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ManagedRunCommandScriptInput deserializedManagedRunCommandScriptInput = new ManagedRunCommandScriptInput();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("stepName".equals(fieldName)) {
                    deserializedManagedRunCommandScriptInput.stepName = reader.getString();
                } else if ("scriptUrl".equals(fieldName)) {
                    deserializedManagedRunCommandScriptInput.scriptUrl = reader.getString();
                } else if ("scriptParameters".equals(fieldName)) {
                    deserializedManagedRunCommandScriptInput.scriptParameters = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedManagedRunCommandScriptInput;
        });
    }
}
