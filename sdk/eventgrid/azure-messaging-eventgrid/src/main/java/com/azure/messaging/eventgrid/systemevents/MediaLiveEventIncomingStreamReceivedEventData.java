// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.messaging.eventgrid.systemevents;

import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Encoder connect event data. Schema of the data property of an EventGridEvent for a
 * Microsoft.Media.LiveEventIncomingStreamReceived event.
 */
@Immutable
public final class MediaLiveEventIncomingStreamReceivedEventData
    implements JsonSerializable<MediaLiveEventIncomingStreamReceivedEventData> {
    /*
     * Gets the ingest URL provided by the live event.
     */
    private String ingestUrl;

    /*
     * Gets the type of the track (Audio / Video).
     */
    private String trackType;

    /*
     * Gets the track name.
     */
    private String trackName;

    /*
     * Gets the bitrate of the track.
     */
    private Long bitrate;

    /*
     * Gets the remote IP.
     */
    private String encoderIp;

    /*
     * Gets the remote port.
     */
    private String encoderPort;

    /*
     * Gets the first timestamp of the data chunk received.
     */
    private String timestamp;

    /*
     * Gets the duration of the first data chunk.
     */
    private String duration;

    /*
     * Gets the timescale in which timestamp is represented.
     */
    private String timescale;

    /**
     * Creates an instance of MediaLiveEventIncomingStreamReceivedEventData class.
     */
    public MediaLiveEventIncomingStreamReceivedEventData() {
    }

    /**
     * Get the ingestUrl property: Gets the ingest URL provided by the live event.
     * 
     * @return the ingestUrl value.
     */
    public String getIngestUrl() {
        return this.ingestUrl;
    }

    /**
     * Get the trackType property: Gets the type of the track (Audio / Video).
     * 
     * @return the trackType value.
     */
    public String getTrackType() {
        return this.trackType;
    }

    /**
     * Get the trackName property: Gets the track name.
     * 
     * @return the trackName value.
     */
    public String getTrackName() {
        return this.trackName;
    }

    /**
     * Get the bitrate property: Gets the bitrate of the track.
     * 
     * @return the bitrate value.
     */
    public Long getBitrate() {
        return this.bitrate;
    }

    /**
     * Get the encoderIp property: Gets the remote IP.
     * 
     * @return the encoderIp value.
     */
    public String getEncoderIp() {
        return this.encoderIp;
    }

    /**
     * Get the encoderPort property: Gets the remote port.
     * 
     * @return the encoderPort value.
     */
    public String getEncoderPort() {
        return this.encoderPort;
    }

    /**
     * Get the timestamp property: Gets the first timestamp of the data chunk received.
     * 
     * @return the timestamp value.
     */
    public String getTimestamp() {
        return this.timestamp;
    }

    /**
     * Get the duration property: Gets the duration of the first data chunk.
     * 
     * @return the duration value.
     */
    public String getDuration() {
        return this.duration;
    }

    /**
     * Get the timescale property: Gets the timescale in which timestamp is represented.
     * 
     * @return the timescale value.
     */
    public String getTimescale() {
        return this.timescale;
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
     * Reads an instance of MediaLiveEventIncomingStreamReceivedEventData from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of MediaLiveEventIncomingStreamReceivedEventData if the JsonReader was pointing to an
     * instance of it, or null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the MediaLiveEventIncomingStreamReceivedEventData.
     */
    public static MediaLiveEventIncomingStreamReceivedEventData fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            MediaLiveEventIncomingStreamReceivedEventData deserializedMediaLiveEventIncomingStreamReceivedEventData
                = new MediaLiveEventIncomingStreamReceivedEventData();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("ingestUrl".equals(fieldName)) {
                    deserializedMediaLiveEventIncomingStreamReceivedEventData.ingestUrl = reader.getString();
                } else if ("trackType".equals(fieldName)) {
                    deserializedMediaLiveEventIncomingStreamReceivedEventData.trackType = reader.getString();
                } else if ("trackName".equals(fieldName)) {
                    deserializedMediaLiveEventIncomingStreamReceivedEventData.trackName = reader.getString();
                } else if ("bitrate".equals(fieldName)) {
                    deserializedMediaLiveEventIncomingStreamReceivedEventData.bitrate
                        = reader.getNullable(JsonReader::getLong);
                } else if ("encoderIp".equals(fieldName)) {
                    deserializedMediaLiveEventIncomingStreamReceivedEventData.encoderIp = reader.getString();
                } else if ("encoderPort".equals(fieldName)) {
                    deserializedMediaLiveEventIncomingStreamReceivedEventData.encoderPort = reader.getString();
                } else if ("timestamp".equals(fieldName)) {
                    deserializedMediaLiveEventIncomingStreamReceivedEventData.timestamp = reader.getString();
                } else if ("duration".equals(fieldName)) {
                    deserializedMediaLiveEventIncomingStreamReceivedEventData.duration = reader.getString();
                } else if ("timescale".equals(fieldName)) {
                    deserializedMediaLiveEventIncomingStreamReceivedEventData.timescale = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedMediaLiveEventIncomingStreamReceivedEventData;
        });
    }
}
