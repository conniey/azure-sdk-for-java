// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Describes the properties of a TransformOutput, which are the rules to be applied while generating the desired output.
 */
@Fluent
public final class TransformOutput implements JsonSerializable<TransformOutput> {
    /*
     * A Transform can define more than one outputs. This property defines what the service should do when one output
     * fails - either continue to produce other outputs, or, stop the other outputs. The overall Job state will not
     * reflect failures of outputs that are specified with 'ContinueJob'. The default is 'StopProcessingJob'.
     */
    private OnErrorType onError;

    /*
     * Sets the relative priority of the TransformOutputs within a Transform. This sets the priority that the service
     * uses for processing TransformOutputs. The default priority is Normal.
     */
    private Priority relativePriority;

    /*
     * Preset that describes the operations that will be used to modify, transcode, or extract insights from the source
     * file to generate the output.
     */
    private Preset preset;

    /**
     * Creates an instance of TransformOutput class.
     */
    public TransformOutput() {
    }

    /**
     * Get the onError property: A Transform can define more than one outputs. This property defines what the service
     * should do when one output fails - either continue to produce other outputs, or, stop the other outputs. The
     * overall Job state will not reflect failures of outputs that are specified with 'ContinueJob'. The default is
     * 'StopProcessingJob'.
     * 
     * @return the onError value.
     */
    public OnErrorType onError() {
        return this.onError;
    }

    /**
     * Set the onError property: A Transform can define more than one outputs. This property defines what the service
     * should do when one output fails - either continue to produce other outputs, or, stop the other outputs. The
     * overall Job state will not reflect failures of outputs that are specified with 'ContinueJob'. The default is
     * 'StopProcessingJob'.
     * 
     * @param onError the onError value to set.
     * @return the TransformOutput object itself.
     */
    public TransformOutput withOnError(OnErrorType onError) {
        this.onError = onError;
        return this;
    }

    /**
     * Get the relativePriority property: Sets the relative priority of the TransformOutputs within a Transform. This
     * sets the priority that the service uses for processing TransformOutputs. The default priority is Normal.
     * 
     * @return the relativePriority value.
     */
    public Priority relativePriority() {
        return this.relativePriority;
    }

    /**
     * Set the relativePriority property: Sets the relative priority of the TransformOutputs within a Transform. This
     * sets the priority that the service uses for processing TransformOutputs. The default priority is Normal.
     * 
     * @param relativePriority the relativePriority value to set.
     * @return the TransformOutput object itself.
     */
    public TransformOutput withRelativePriority(Priority relativePriority) {
        this.relativePriority = relativePriority;
        return this;
    }

    /**
     * Get the preset property: Preset that describes the operations that will be used to modify, transcode, or extract
     * insights from the source file to generate the output.
     * 
     * @return the preset value.
     */
    public Preset preset() {
        return this.preset;
    }

    /**
     * Set the preset property: Preset that describes the operations that will be used to modify, transcode, or extract
     * insights from the source file to generate the output.
     * 
     * @param preset the preset value to set.
     * @return the TransformOutput object itself.
     */
    public TransformOutput withPreset(Preset preset) {
        this.preset = preset;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (preset() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException("Missing required property preset in model TransformOutput"));
        } else {
            preset().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(TransformOutput.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeJsonField("preset", this.preset);
        jsonWriter.writeStringField("onError", this.onError == null ? null : this.onError.toString());
        jsonWriter.writeStringField("relativePriority",
            this.relativePriority == null ? null : this.relativePriority.toString());
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of TransformOutput from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of TransformOutput if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the TransformOutput.
     */
    public static TransformOutput fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            TransformOutput deserializedTransformOutput = new TransformOutput();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("preset".equals(fieldName)) {
                    deserializedTransformOutput.preset = Preset.fromJson(reader);
                } else if ("onError".equals(fieldName)) {
                    deserializedTransformOutput.onError = OnErrorType.fromString(reader.getString());
                } else if ("relativePriority".equals(fieldName)) {
                    deserializedTransformOutput.relativePriority = Priority.fromString(reader.getString());
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedTransformOutput;
        });
    }
}
