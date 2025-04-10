// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.ai.openai.realtime.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Returned in server turn detection mode when speech stops.
 */
@Immutable
public final class InputAudioBufferSpeechStoppedEvent extends RealtimeServerEvent {

    /*
     * The type property.
     */
    @Generated
    private RealtimeServerEventType type = RealtimeServerEventType.INPUT_AUDIO_BUFFER_SPEECH_STOPPED;

    /*
     * Milliseconds since the session started when speech stopped.
     */
    @Generated
    private final int audioEndMs;

    /*
     * The ID of the user message item that will be created.
     */
    @Generated
    private final String itemId;

    /**
     * Creates an instance of InputAudioBufferSpeechStoppedEvent class.
     *
     * @param eventId the eventId value to set.
     * @param audioEndMs the audioEndMs value to set.
     * @param itemId the itemId value to set.
     */
    @Generated
    private InputAudioBufferSpeechStoppedEvent(String eventId, int audioEndMs, String itemId) {
        super(eventId);
        this.audioEndMs = audioEndMs;
        this.itemId = itemId;
    }

    /**
     * Get the type property: The type property.
     *
     * @return the type value.
     */
    @Generated
    @Override
    public RealtimeServerEventType getType() {
        return this.type;
    }

    /**
     * Get the audioEndMs property: Milliseconds since the session started when speech stopped.
     *
     * @return the audioEndMs value.
     */
    @Generated
    public int getAudioEndMs() {
        return this.audioEndMs;
    }

    /**
     * Get the itemId property: The ID of the user message item that will be created.
     *
     * @return the itemId value.
     */
    @Generated
    public String getItemId() {
        return this.itemId;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("event_id", getEventId());
        jsonWriter.writeIntField("audio_end_ms", this.audioEndMs);
        jsonWriter.writeStringField("item_id", this.itemId);
        jsonWriter.writeStringField("type", this.type == null ? null : this.type.toString());
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of InputAudioBufferSpeechStoppedEvent from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of InputAudioBufferSpeechStoppedEvent if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the InputAudioBufferSpeechStoppedEvent.
     */
    @Generated
    public static InputAudioBufferSpeechStoppedEvent fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            String eventId = null;
            int audioEndMs = 0;
            String itemId = null;
            RealtimeServerEventType type = RealtimeServerEventType.INPUT_AUDIO_BUFFER_SPEECH_STOPPED;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();
                if ("event_id".equals(fieldName)) {
                    eventId = reader.getString();
                } else if ("audio_end_ms".equals(fieldName)) {
                    audioEndMs = reader.getInt();
                } else if ("item_id".equals(fieldName)) {
                    itemId = reader.getString();
                } else if ("type".equals(fieldName)) {
                    type = RealtimeServerEventType.fromString(reader.getString());
                } else {
                    reader.skipChildren();
                }
            }
            InputAudioBufferSpeechStoppedEvent deserializedInputAudioBufferSpeechStoppedEvent
                = new InputAudioBufferSpeechStoppedEvent(eventId, audioEndMs, itemId);
            deserializedInputAudioBufferSpeechStoppedEvent.type = type;
            return deserializedInputAudioBufferSpeechStoppedEvent;
        });
    }
}
