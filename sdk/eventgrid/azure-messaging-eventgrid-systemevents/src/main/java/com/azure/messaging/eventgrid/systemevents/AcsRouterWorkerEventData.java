// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.messaging.eventgrid.systemevents;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Schema of common properties of all Router Worker events.
 */
@Immutable
public class AcsRouterWorkerEventData extends AcsRouterEventData {
    /*
     * Router Worker events Worker Id
     */
    @Generated
    private String workerId;

    /*
     * Router Event Channel ID
     */
    @Generated
    private String channelId;

    /*
     * Router Event Channel Reference
     */
    @Generated
    private String channelReference;

    /*
     * Router Event Job ID
     */
    @Generated
    private String jobId;

    /**
     * Creates an instance of AcsRouterWorkerEventData class.
     */
    @Generated
    protected AcsRouterWorkerEventData() {
    }

    /**
     * Get the workerId property: Router Worker events Worker Id.
     * 
     * @return the workerId value.
     */
    @Generated
    public String getWorkerId() {
        return this.workerId;
    }

    /**
     * Set the workerId property: Router Worker events Worker Id.
     * 
     * @param workerId the workerId value to set.
     * @return the AcsRouterWorkerEventData object itself.
     */
    @Generated
    AcsRouterWorkerEventData setWorkerId(String workerId) {
        this.workerId = workerId;
        return this;
    }

    /**
     * Get the channelId property: Router Event Channel ID.
     * 
     * @return the channelId value.
     */
    @Generated
    @Override
    public String getChannelId() {
        return this.channelId;
    }

    /**
     * Get the channelReference property: Router Event Channel Reference.
     * 
     * @return the channelReference value.
     */
    @Generated
    @Override
    public String getChannelReference() {
        return this.channelReference;
    }

    /**
     * Get the jobId property: Router Event Job ID.
     * 
     * @return the jobId value.
     */
    @Generated
    @Override
    public String getJobId() {
        return this.jobId;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("jobId", getJobId());
        jsonWriter.writeStringField("channelReference", getChannelReference());
        jsonWriter.writeStringField("channelId", getChannelId());
        jsonWriter.writeStringField("workerId", this.workerId);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of AcsRouterWorkerEventData from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of AcsRouterWorkerEventData if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the AcsRouterWorkerEventData.
     */
    @Generated
    public static AcsRouterWorkerEventData fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            AcsRouterWorkerEventData deserializedAcsRouterWorkerEventData = new AcsRouterWorkerEventData();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("jobId".equals(fieldName)) {
                    deserializedAcsRouterWorkerEventData.jobId = reader.getString();
                } else if ("channelReference".equals(fieldName)) {
                    deserializedAcsRouterWorkerEventData.channelReference = reader.getString();
                } else if ("channelId".equals(fieldName)) {
                    deserializedAcsRouterWorkerEventData.channelId = reader.getString();
                } else if ("workerId".equals(fieldName)) {
                    deserializedAcsRouterWorkerEventData.workerId = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedAcsRouterWorkerEventData;
        });
    }
}
