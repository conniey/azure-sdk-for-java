// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.communication.callautomation.models;

import com.azure.core.annotation.Immutable;
import com.azure.communication.callautomation.implementation.models.TranscriptionSubscriptionInternal;
import com.azure.communication.callautomation.implementation.accesshelpers.TranscriptionSubscriptionConstructorProxy;
import java.util.List;
import java.util.stream.Collectors;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.json.JsonSerializable;

import java.io.IOException;

/**
 * Transcription Subscription Object.
 */
@Immutable
public final class TranscriptionSubscription implements JsonSerializable<TranscriptionSubscription> {
    /*
     * Gets or Sets subscription Id.
     */
    private String id;

    /*
     * Gets or Sets transcription subscription state.
     */
    private TranscriptionSubscriptionState state;

    /*
     * Gets or Sets Locale.
     */
    private String locale;

    /*
     * Gets or Sets the subscribed transcription result types.
     */
    private List<TranscriptionResultState> subscribedResultStates;

    static {
        TranscriptionSubscriptionConstructorProxy
            .setAccessor(new TranscriptionSubscriptionConstructorProxy.TranscriptionSubscriptionConstructorAccessor() {
                @Override
                public TranscriptionSubscription create(TranscriptionSubscriptionInternal internalHeaders) {
                    return new TranscriptionSubscription(internalHeaders);
                }
            });
    }

    /**
     * Creates an instance of TranscriptionSubscriptionInternal class.
     */
    TranscriptionSubscription() {
        id = null;
        state = null;
        subscribedResultStates = null;
        this.locale = null;
    }

    /**
    * Package-private constructor of the class, used internally.
    *
    * @param transcriptionSubscriptionInternal The internal response of TranscriptionSubscription
    */
    TranscriptionSubscription(TranscriptionSubscriptionInternal transcriptionSubscriptionInternal) {
        this.id = transcriptionSubscriptionInternal.getId() != null ? transcriptionSubscriptionInternal.getId() : null;
        this.state = transcriptionSubscriptionInternal.getState() != null
            ? TranscriptionSubscriptionState.fromString(transcriptionSubscriptionInternal.getState().toString())
            : null;
        this.subscribedResultStates = transcriptionSubscriptionInternal.getSubscribedResultTypes() != null
            ? transcriptionSubscriptionInternal.getSubscribedResultTypes()
                .stream()
                .map(resultType -> TranscriptionResultState.fromString(resultType.toString()))
                .collect(Collectors.toList())
            : null;
        this.locale = transcriptionSubscriptionInternal.getLocale() != null
            ? transcriptionSubscriptionInternal.getLocale().toString()
            : null;
    }

    /**
     * Get the id property: Gets or Sets subscription Id.
     * 
     * @return the id value.
     */
    public String getId() {
        return this.id;
    }

    /**
     * Get the state property: Gets or Sets transcription subscription state.
     * 
     * @return the state value.
     */
    public TranscriptionSubscriptionState getState() {
        return this.state;
    }

    /**
     * Get the state property: Gets or Sets transcription subscription state.
     * 
     * @return the state value.
     */
    public String getLocale() {
        return this.locale;
    }

    /**
     * Get the subscribedResultStates property: Gets or Sets the subscribed transcription result types.
     * 
     * @return the subscribedResultStates value.
     */
    public List<TranscriptionResultState> getSubscribedResultStates() {
        return this.subscribedResultStates;
    }

    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("id", this.id);
        jsonWriter.writeStringField("state", this.state == null ? null : this.state.toString());
        jsonWriter.writeArrayField("subscribedResultStates", this.subscribedResultStates,
            (writer, element) -> writer.writeString(element == null ? null : element.toString()));
        jsonWriter.writeStringField("locale", this.locale);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of TranscriptionSubscriptionInternal from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of TranscriptionSubscriptionInternal if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the TranscriptionSubscriptionInternal.
     */
    public static TranscriptionSubscription fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            TranscriptionSubscription deserializedTranscriptionSubscription = new TranscriptionSubscription();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedTranscriptionSubscription.id = reader.getString();
                } else if ("state".equals(fieldName)) {
                    deserializedTranscriptionSubscription.state
                        = TranscriptionSubscriptionState.fromString(reader.getString());
                } else if ("subscribedResultStates".equals(fieldName)) {
                    List<TranscriptionResultState> subscribedResultTypes
                        = reader.readArray(reader1 -> TranscriptionResultState.fromString(reader1.getString()));
                    deserializedTranscriptionSubscription.subscribedResultStates = subscribedResultTypes;
                } else if ("locale".equals(fieldName)) {
                    deserializedTranscriptionSubscription.locale = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedTranscriptionSubscription;
        });
    }
}
