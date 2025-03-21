// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devcenter.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.devcenter.models.ProvisioningState;
import com.azure.resourcemanager.devcenter.models.ScheduleEnableStatus;
import com.azure.resourcemanager.devcenter.models.ScheduledFrequency;
import com.azure.resourcemanager.devcenter.models.ScheduledType;
import java.io.IOException;
import java.util.Map;

/**
 * The Schedule properties defining when and what to execute.
 */
@Fluent
public final class ScheduleProperties extends ScheduleUpdateProperties {
    /*
     * The provisioning state of the resource.
     */
    private ProvisioningState provisioningState;

    /**
     * Creates an instance of ScheduleProperties class.
     */
    public ScheduleProperties() {
    }

    /**
     * Get the provisioningState property: The provisioning state of the resource.
     * 
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ScheduleProperties withType(ScheduledType type) {
        super.withType(type);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ScheduleProperties withFrequency(ScheduledFrequency frequency) {
        super.withFrequency(frequency);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ScheduleProperties withTime(String time) {
        super.withTime(time);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ScheduleProperties withTimeZone(String timeZone) {
        super.withTimeZone(timeZone);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ScheduleProperties withState(ScheduleEnableStatus state) {
        super.withState(state);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ScheduleProperties withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ScheduleProperties withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeMapField("tags", tags(), (writer, element) -> writer.writeString(element));
        jsonWriter.writeStringField("location", location());
        jsonWriter.writeStringField("type", type() == null ? null : type().toString());
        jsonWriter.writeStringField("frequency", frequency() == null ? null : frequency().toString());
        jsonWriter.writeStringField("time", time());
        jsonWriter.writeStringField("timeZone", timeZone());
        jsonWriter.writeStringField("state", state() == null ? null : state().toString());
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ScheduleProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ScheduleProperties if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the ScheduleProperties.
     */
    public static ScheduleProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ScheduleProperties deserializedScheduleProperties = new ScheduleProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("tags".equals(fieldName)) {
                    Map<String, String> tags = reader.readMap(reader1 -> reader1.getString());
                    deserializedScheduleProperties.withTags(tags);
                } else if ("location".equals(fieldName)) {
                    deserializedScheduleProperties.withLocation(reader.getString());
                } else if ("type".equals(fieldName)) {
                    deserializedScheduleProperties.withType(ScheduledType.fromString(reader.getString()));
                } else if ("frequency".equals(fieldName)) {
                    deserializedScheduleProperties.withFrequency(ScheduledFrequency.fromString(reader.getString()));
                } else if ("time".equals(fieldName)) {
                    deserializedScheduleProperties.withTime(reader.getString());
                } else if ("timeZone".equals(fieldName)) {
                    deserializedScheduleProperties.withTimeZone(reader.getString());
                } else if ("state".equals(fieldName)) {
                    deserializedScheduleProperties.withState(ScheduleEnableStatus.fromString(reader.getString()));
                } else if ("provisioningState".equals(fieldName)) {
                    deserializedScheduleProperties.provisioningState = ProvisioningState.fromString(reader.getString());
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedScheduleProperties;
        });
    }
}
