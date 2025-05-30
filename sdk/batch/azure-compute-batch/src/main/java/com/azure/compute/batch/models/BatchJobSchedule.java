// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.compute.batch.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Generated;
import com.azure.core.util.CoreUtils;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.List;

/**
 * A Job Schedule that allows recurring Jobs by specifying when to run Jobs and a
 * specification used to create each Job.
 */
@Fluent
public final class BatchJobSchedule implements JsonSerializable<BatchJobSchedule> {

    /*
     * A string that uniquely identifies the schedule within the Account.
     */
    @Generated
    private String id;

    /*
     * The display name for the schedule.
     */
    @Generated
    private String displayName;

    /*
     * The URL of the Job Schedule.
     */
    @Generated
    private String url;

    /*
     * The ETag of the Job Schedule. This is an opaque string. You can use it to detect whether the Job Schedule has
     * changed between requests. In particular, you can be pass the ETag with an Update Job Schedule request to specify
     * that your changes should take effect only if nobody else has modified the schedule in the meantime.
     */
    @Generated
    private String eTag;

    /*
     * The last modified time of the Job Schedule. This is the last time at which the schedule level data, such as the
     * Job specification or recurrence information, changed. It does not factor in job-level changes such as new Jobs
     * being created or Jobs changing state.
     */
    @Generated
    private OffsetDateTime lastModified;

    /*
     * The creation time of the Job Schedule.
     */
    @Generated
    private OffsetDateTime creationTime;

    /*
     * The current state of the Job Schedule.
     */
    @Generated
    private BatchJobScheduleState state;

    /*
     * The time at which the Job Schedule entered the current state.
     */
    @Generated
    private OffsetDateTime stateTransitionTime;

    /*
     * The previous state of the Job Schedule. This property is not present if the Job Schedule is in its initial active
     * state.
     */
    @Generated
    private BatchJobScheduleState previousState;

    /*
     * The time at which the Job Schedule entered its previous state. This property is not present if the Job Schedule
     * is in its initial active state.
     */
    @Generated
    private OffsetDateTime previousStateTransitionTime;

    /*
     * The schedule according to which Jobs will be created. All times are fixed respective to UTC and are not impacted
     * by daylight saving time.
     */
    @Generated
    private BatchJobScheduleConfiguration schedule;

    /*
     * The details of the Jobs to be created on this schedule.
     */
    @Generated
    private final BatchJobSpecification jobSpecification;

    /*
     * Information about Jobs that have been and will be run under this schedule.
     */
    @Generated
    private BatchJobScheduleExecutionInfo executionInfo;

    /*
     * A list of name-value pairs associated with the schedule as metadata. The Batch service does not assign any
     * meaning to metadata; it is solely for the use of user code.
     */
    @Generated
    private List<MetadataItem> metadata;

    /*
     * The lifetime resource usage statistics for the Job Schedule. The statistics may not be immediately available. The
     * Batch service performs periodic roll-up of statistics. The typical delay is about 30 minutes.
     */
    @Generated
    private BatchJobScheduleStatistics stats;

    /**
     * Creates an instance of BatchJobSchedule class.
     *
     * @param jobSpecification the jobSpecification value to set.
     */
    @Generated
    public BatchJobSchedule(BatchJobSpecification jobSpecification) {
        this.jobSpecification = jobSpecification;
    }

    /**
     * Get the id property: A string that uniquely identifies the schedule within the Account.
     *
     * @return the id value.
     */
    @Generated
    public String getId() {
        return this.id;
    }

    /**
     * Get the displayName property: The display name for the schedule.
     *
     * @return the displayName value.
     */
    @Generated
    public String getDisplayName() {
        return this.displayName;
    }

    /**
     * Get the url property: The URL of the Job Schedule.
     *
     * @return the url value.
     */
    @Generated
    public String getUrl() {
        return this.url;
    }

    /**
     * Get the eTag property: The ETag of the Job Schedule. This is an opaque string. You can use it to detect whether
     * the Job Schedule has changed between requests. In particular, you can be pass the ETag with an Update Job
     * Schedule request to specify that your changes should take effect only if nobody else has modified the schedule in
     * the meantime.
     *
     * @return the eTag value.
     */
    @Generated
    public String getETag() {
        return this.eTag;
    }

    /**
     * Get the lastModified property: The last modified time of the Job Schedule. This is the last time at which the
     * schedule level data, such as the Job specification or recurrence information, changed. It does not factor in
     * job-level changes such as new Jobs being created or Jobs changing state.
     *
     * @return the lastModified value.
     */
    @Generated
    public OffsetDateTime getLastModified() {
        return this.lastModified;
    }

    /**
     * Get the creationTime property: The creation time of the Job Schedule.
     *
     * @return the creationTime value.
     */
    @Generated
    public OffsetDateTime getCreationTime() {
        return this.creationTime;
    }

    /**
     * Get the state property: The current state of the Job Schedule.
     *
     * @return the state value.
     */
    @Generated
    public BatchJobScheduleState getState() {
        return this.state;
    }

    /**
     * Get the stateTransitionTime property: The time at which the Job Schedule entered the current state.
     *
     * @return the stateTransitionTime value.
     */
    @Generated
    public OffsetDateTime getStateTransitionTime() {
        return this.stateTransitionTime;
    }

    /**
     * Get the previousState property: The previous state of the Job Schedule. This property is not present if the Job
     * Schedule is in its initial active state.
     *
     * @return the previousState value.
     */
    @Generated
    public BatchJobScheduleState getPreviousState() {
        return this.previousState;
    }

    /**
     * Get the previousStateTransitionTime property: The time at which the Job Schedule entered its previous state. This
     * property is not present if the Job Schedule is in its initial active state.
     *
     * @return the previousStateTransitionTime value.
     */
    @Generated
    public OffsetDateTime getPreviousStateTransitionTime() {
        return this.previousStateTransitionTime;
    }

    /**
     * Get the schedule property: The schedule according to which Jobs will be created. All times are fixed respective
     * to UTC and are not impacted by daylight saving time.
     *
     * @return the schedule value.
     */
    @Generated
    public BatchJobScheduleConfiguration getSchedule() {
        return this.schedule;
    }

    /**
     * Set the schedule property: The schedule according to which Jobs will be created. All times are fixed respective
     * to UTC and are not impacted by daylight saving time.
     *
     * @param schedule the schedule value to set.
     * @return the BatchJobSchedule object itself.
     */
    @Generated
    public BatchJobSchedule setSchedule(BatchJobScheduleConfiguration schedule) {
        this.schedule = schedule;
        return this;
    }

    /**
     * Get the jobSpecification property: The details of the Jobs to be created on this schedule.
     *
     * @return the jobSpecification value.
     */
    @Generated
    public BatchJobSpecification getJobSpecification() {
        return this.jobSpecification;
    }

    /**
     * Get the executionInfo property: Information about Jobs that have been and will be run under this schedule.
     *
     * @return the executionInfo value.
     */
    @Generated
    public BatchJobScheduleExecutionInfo getExecutionInfo() {
        return this.executionInfo;
    }

    /**
     * Get the metadata property: A list of name-value pairs associated with the schedule as metadata. The Batch service
     * does not assign any meaning to metadata; it is solely for the use of user code.
     *
     * @return the metadata value.
     */
    @Generated
    public List<MetadataItem> getMetadata() {
        return this.metadata;
    }

    /**
     * Set the metadata property: A list of name-value pairs associated with the schedule as metadata. The Batch service
     * does not assign any meaning to metadata; it is solely for the use of user code.
     *
     * @param metadata the metadata value to set.
     * @return the BatchJobSchedule object itself.
     */
    @Generated
    public BatchJobSchedule setMetadata(List<MetadataItem> metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * Get the stats property: The lifetime resource usage statistics for the Job Schedule. The statistics may not be
     * immediately available. The Batch service performs periodic roll-up of statistics. The typical delay is about 30
     * minutes.
     *
     * @return the stats value.
     */
    @Generated
    public BatchJobScheduleStatistics getStats() {
        return this.stats;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeJsonField("jobSpecification", this.jobSpecification);
        jsonWriter.writeJsonField("schedule", this.schedule);
        jsonWriter.writeArrayField("metadata", this.metadata, (writer, element) -> writer.writeJson(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of BatchJobSchedule from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of BatchJobSchedule if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the BatchJobSchedule.
     */
    @Generated
    public static BatchJobSchedule fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            BatchJobSpecification jobSpecification = null;
            String id = null;
            String displayName = null;
            String url = null;
            String eTag = null;
            OffsetDateTime lastModified = null;
            OffsetDateTime creationTime = null;
            BatchJobScheduleState state = null;
            OffsetDateTime stateTransitionTime = null;
            BatchJobScheduleState previousState = null;
            OffsetDateTime previousStateTransitionTime = null;
            BatchJobScheduleConfiguration schedule = null;
            BatchJobScheduleExecutionInfo executionInfo = null;
            List<MetadataItem> metadata = null;
            BatchJobScheduleStatistics stats = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();
                if ("jobSpecification".equals(fieldName)) {
                    jobSpecification = BatchJobSpecification.fromJson(reader);
                } else if ("id".equals(fieldName)) {
                    id = reader.getString();
                } else if ("displayName".equals(fieldName)) {
                    displayName = reader.getString();
                } else if ("url".equals(fieldName)) {
                    url = reader.getString();
                } else if ("eTag".equals(fieldName)) {
                    eTag = reader.getString();
                } else if ("lastModified".equals(fieldName)) {
                    lastModified = reader
                        .getNullable(nonNullReader -> CoreUtils.parseBestOffsetDateTime(nonNullReader.getString()));
                } else if ("creationTime".equals(fieldName)) {
                    creationTime = reader
                        .getNullable(nonNullReader -> CoreUtils.parseBestOffsetDateTime(nonNullReader.getString()));
                } else if ("state".equals(fieldName)) {
                    state = BatchJobScheduleState.fromString(reader.getString());
                } else if ("stateTransitionTime".equals(fieldName)) {
                    stateTransitionTime = reader
                        .getNullable(nonNullReader -> CoreUtils.parseBestOffsetDateTime(nonNullReader.getString()));
                } else if ("previousState".equals(fieldName)) {
                    previousState = BatchJobScheduleState.fromString(reader.getString());
                } else if ("previousStateTransitionTime".equals(fieldName)) {
                    previousStateTransitionTime = reader
                        .getNullable(nonNullReader -> CoreUtils.parseBestOffsetDateTime(nonNullReader.getString()));
                } else if ("schedule".equals(fieldName)) {
                    schedule = BatchJobScheduleConfiguration.fromJson(reader);
                } else if ("executionInfo".equals(fieldName)) {
                    executionInfo = BatchJobScheduleExecutionInfo.fromJson(reader);
                } else if ("metadata".equals(fieldName)) {
                    metadata = reader.readArray(reader1 -> MetadataItem.fromJson(reader1));
                } else if ("stats".equals(fieldName)) {
                    stats = BatchJobScheduleStatistics.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }
            BatchJobSchedule deserializedBatchJobSchedule = new BatchJobSchedule(jobSpecification);
            deserializedBatchJobSchedule.id = id;
            deserializedBatchJobSchedule.displayName = displayName;
            deserializedBatchJobSchedule.url = url;
            deserializedBatchJobSchedule.eTag = eTag;
            deserializedBatchJobSchedule.lastModified = lastModified;
            deserializedBatchJobSchedule.creationTime = creationTime;
            deserializedBatchJobSchedule.state = state;
            deserializedBatchJobSchedule.stateTransitionTime = stateTransitionTime;
            deserializedBatchJobSchedule.previousState = previousState;
            deserializedBatchJobSchedule.previousStateTransitionTime = previousStateTransitionTime;
            deserializedBatchJobSchedule.schedule = schedule;
            deserializedBatchJobSchedule.executionInfo = executionInfo;
            deserializedBatchJobSchedule.metadata = metadata;
            deserializedBatchJobSchedule.stats = stats;
            return deserializedBatchJobSchedule;
        });
    }
}
