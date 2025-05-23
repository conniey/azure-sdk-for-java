// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.orbital.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.orbital.models.AvailableContactsSpacecraft;
import java.io.IOException;
import java.time.OffsetDateTime;

/**
 * Customer retrieves list of Available Contacts for a spacecraft resource. Later, one of the available contact can be
 * selected to create a contact.
 */
@Fluent
public final class AvailableContactsInner implements JsonSerializable<AvailableContactsInner> {
    /*
     * The reference to the spacecraft resource.
     */
    private AvailableContactsSpacecraft spacecraft;

    /*
     * Name of Azure Ground Station.
     */
    private String groundStationName;

    /*
     * Properties of Contact resource.
     */
    private AvailableContactsProperties innerProperties;

    /**
     * Creates an instance of AvailableContactsInner class.
     */
    public AvailableContactsInner() {
    }

    /**
     * Get the spacecraft property: The reference to the spacecraft resource.
     * 
     * @return the spacecraft value.
     */
    public AvailableContactsSpacecraft spacecraft() {
        return this.spacecraft;
    }

    /**
     * Set the spacecraft property: The reference to the spacecraft resource.
     * 
     * @param spacecraft the spacecraft value to set.
     * @return the AvailableContactsInner object itself.
     */
    public AvailableContactsInner withSpacecraft(AvailableContactsSpacecraft spacecraft) {
        this.spacecraft = spacecraft;
        return this;
    }

    /**
     * Get the groundStationName property: Name of Azure Ground Station.
     * 
     * @return the groundStationName value.
     */
    public String groundStationName() {
        return this.groundStationName;
    }

    /**
     * Get the innerProperties property: Properties of Contact resource.
     * 
     * @return the innerProperties value.
     */
    private AvailableContactsProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the maximumElevationDegrees property: Maximum elevation of the antenna during the contact in decimal degrees.
     * 
     * @return the maximumElevationDegrees value.
     */
    public Float maximumElevationDegrees() {
        return this.innerProperties() == null ? null : this.innerProperties().maximumElevationDegrees();
    }

    /**
     * Get the txStartTime property: Time at which antenna transmit will be enabled (ISO 8601 UTC standard).
     * 
     * @return the txStartTime value.
     */
    public OffsetDateTime txStartTime() {
        return this.innerProperties() == null ? null : this.innerProperties().txStartTime();
    }

    /**
     * Get the txEndTime property: Time at which antenna transmit will be disabled (ISO 8601 UTC standard).
     * 
     * @return the txEndTime value.
     */
    public OffsetDateTime txEndTime() {
        return this.innerProperties() == null ? null : this.innerProperties().txEndTime();
    }

    /**
     * Get the rxStartTime property: Earliest time to receive a signal (ISO 8601 UTC standard).
     * 
     * @return the rxStartTime value.
     */
    public OffsetDateTime rxStartTime() {
        return this.innerProperties() == null ? null : this.innerProperties().rxStartTime();
    }

    /**
     * Get the rxEndTime property: Time to lost receiving a signal (ISO 8601 UTC standard).
     * 
     * @return the rxEndTime value.
     */
    public OffsetDateTime rxEndTime() {
        return this.innerProperties() == null ? null : this.innerProperties().rxEndTime();
    }

    /**
     * Get the startAzimuthDegrees property: Azimuth of the antenna at the start of the contact in decimal degrees.
     * 
     * @return the startAzimuthDegrees value.
     */
    public Float startAzimuthDegrees() {
        return this.innerProperties() == null ? null : this.innerProperties().startAzimuthDegrees();
    }

    /**
     * Get the endAzimuthDegrees property: Azimuth of the antenna at the end of the contact in decimal degrees.
     * 
     * @return the endAzimuthDegrees value.
     */
    public Float endAzimuthDegrees() {
        return this.innerProperties() == null ? null : this.innerProperties().endAzimuthDegrees();
    }

    /**
     * Get the startElevationDegrees property: Spacecraft elevation above the horizon at contact start.
     * 
     * @return the startElevationDegrees value.
     */
    public Float startElevationDegrees() {
        return this.innerProperties() == null ? null : this.innerProperties().startElevationDegrees();
    }

    /**
     * Get the endElevationDegrees property: Spacecraft elevation above the horizon at contact end.
     * 
     * @return the endElevationDegrees value.
     */
    public Float endElevationDegrees() {
        return this.innerProperties() == null ? null : this.innerProperties().endElevationDegrees();
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (spacecraft() != null) {
            spacecraft().validate();
        }
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeJsonField("spacecraft", this.spacecraft);
        jsonWriter.writeJsonField("properties", this.innerProperties);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of AvailableContactsInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of AvailableContactsInner if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IOException If an error occurs while reading the AvailableContactsInner.
     */
    public static AvailableContactsInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            AvailableContactsInner deserializedAvailableContactsInner = new AvailableContactsInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("spacecraft".equals(fieldName)) {
                    deserializedAvailableContactsInner.spacecraft = AvailableContactsSpacecraft.fromJson(reader);
                } else if ("groundStationName".equals(fieldName)) {
                    deserializedAvailableContactsInner.groundStationName = reader.getString();
                } else if ("properties".equals(fieldName)) {
                    deserializedAvailableContactsInner.innerProperties = AvailableContactsProperties.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedAvailableContactsInner;
        });
    }
}
