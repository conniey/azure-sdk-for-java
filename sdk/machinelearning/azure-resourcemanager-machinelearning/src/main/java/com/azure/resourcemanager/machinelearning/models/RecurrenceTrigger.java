// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * The RecurrenceTrigger model.
 */
@Fluent
public final class RecurrenceTrigger extends TriggerBase {
    /*
     * [Required]
     */
    private TriggerType triggerType = TriggerType.RECURRENCE;

    /*
     * [Required] The frequency to trigger schedule.
     */
    private RecurrenceFrequency frequency;

    /*
     * [Required] Specifies schedule interval in conjunction with frequency
     */
    private int interval;

    /*
     * The recurrence schedule.
     */
    private RecurrenceSchedule schedule;

    /**
     * Creates an instance of RecurrenceTrigger class.
     */
    public RecurrenceTrigger() {
    }

    /**
     * Get the triggerType property: [Required].
     * 
     * @return the triggerType value.
     */
    @Override
    public TriggerType triggerType() {
        return this.triggerType;
    }

    /**
     * Get the frequency property: [Required] The frequency to trigger schedule.
     * 
     * @return the frequency value.
     */
    public RecurrenceFrequency frequency() {
        return this.frequency;
    }

    /**
     * Set the frequency property: [Required] The frequency to trigger schedule.
     * 
     * @param frequency the frequency value to set.
     * @return the RecurrenceTrigger object itself.
     */
    public RecurrenceTrigger withFrequency(RecurrenceFrequency frequency) {
        this.frequency = frequency;
        return this;
    }

    /**
     * Get the interval property: [Required] Specifies schedule interval in conjunction with frequency.
     * 
     * @return the interval value.
     */
    public int interval() {
        return this.interval;
    }

    /**
     * Set the interval property: [Required] Specifies schedule interval in conjunction with frequency.
     * 
     * @param interval the interval value to set.
     * @return the RecurrenceTrigger object itself.
     */
    public RecurrenceTrigger withInterval(int interval) {
        this.interval = interval;
        return this;
    }

    /**
     * Get the schedule property: The recurrence schedule.
     * 
     * @return the schedule value.
     */
    public RecurrenceSchedule schedule() {
        return this.schedule;
    }

    /**
     * Set the schedule property: The recurrence schedule.
     * 
     * @param schedule the schedule value to set.
     * @return the RecurrenceTrigger object itself.
     */
    public RecurrenceTrigger withSchedule(RecurrenceSchedule schedule) {
        this.schedule = schedule;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RecurrenceTrigger withEndTime(String endTime) {
        super.withEndTime(endTime);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RecurrenceTrigger withStartTime(String startTime) {
        super.withStartTime(startTime);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RecurrenceTrigger withTimeZone(String timeZone) {
        super.withTimeZone(timeZone);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (frequency() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException("Missing required property frequency in model RecurrenceTrigger"));
        }
        if (schedule() != null) {
            schedule().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(RecurrenceTrigger.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("endTime", endTime());
        jsonWriter.writeStringField("startTime", startTime());
        jsonWriter.writeStringField("timeZone", timeZone());
        jsonWriter.writeStringField("frequency", this.frequency == null ? null : this.frequency.toString());
        jsonWriter.writeIntField("interval", this.interval);
        jsonWriter.writeStringField("triggerType", this.triggerType == null ? null : this.triggerType.toString());
        jsonWriter.writeJsonField("schedule", this.schedule);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of RecurrenceTrigger from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of RecurrenceTrigger if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the RecurrenceTrigger.
     */
    public static RecurrenceTrigger fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            RecurrenceTrigger deserializedRecurrenceTrigger = new RecurrenceTrigger();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("endTime".equals(fieldName)) {
                    deserializedRecurrenceTrigger.withEndTime(reader.getString());
                } else if ("startTime".equals(fieldName)) {
                    deserializedRecurrenceTrigger.withStartTime(reader.getString());
                } else if ("timeZone".equals(fieldName)) {
                    deserializedRecurrenceTrigger.withTimeZone(reader.getString());
                } else if ("frequency".equals(fieldName)) {
                    deserializedRecurrenceTrigger.frequency = RecurrenceFrequency.fromString(reader.getString());
                } else if ("interval".equals(fieldName)) {
                    deserializedRecurrenceTrigger.interval = reader.getInt();
                } else if ("triggerType".equals(fieldName)) {
                    deserializedRecurrenceTrigger.triggerType = TriggerType.fromString(reader.getString());
                } else if ("schedule".equals(fieldName)) {
                    deserializedRecurrenceTrigger.schedule = RecurrenceSchedule.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedRecurrenceTrigger;
        });
    }
}
