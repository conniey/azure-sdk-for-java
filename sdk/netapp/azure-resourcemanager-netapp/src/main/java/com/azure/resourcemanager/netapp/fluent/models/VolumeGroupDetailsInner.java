// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.netapp.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.netapp.models.VolumeGroupMetadata;
import com.azure.resourcemanager.netapp.models.VolumeGroupVolumeProperties;
import java.io.IOException;
import java.util.List;

/**
 * Volume group resource for create.
 */
@Fluent
public final class VolumeGroupDetailsInner implements JsonSerializable<VolumeGroupDetailsInner> {
    /*
     * Resource location
     */
    private String location;

    /*
     * Resource Id
     */
    private String id;

    /*
     * Resource name
     */
    private String name;

    /*
     * Resource type
     */
    private String type;

    /*
     * Volume group properties
     */
    private VolumeGroupProperties innerProperties;

    /**
     * Creates an instance of VolumeGroupDetailsInner class.
     */
    public VolumeGroupDetailsInner() {
    }

    /**
     * Get the location property: Resource location.
     * 
     * @return the location value.
     */
    public String location() {
        return this.location;
    }

    /**
     * Set the location property: Resource location.
     * 
     * @param location the location value to set.
     * @return the VolumeGroupDetailsInner object itself.
     */
    public VolumeGroupDetailsInner withLocation(String location) {
        this.location = location;
        return this;
    }

    /**
     * Get the id property: Resource Id.
     * 
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Get the name property: Resource name.
     * 
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Get the type property: Resource type.
     * 
     * @return the type value.
     */
    public String type() {
        return this.type;
    }

    /**
     * Get the innerProperties property: Volume group properties.
     * 
     * @return the innerProperties value.
     */
    private VolumeGroupProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the provisioningState property: Azure lifecycle management.
     * 
     * @return the provisioningState value.
     */
    public String provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Get the groupMetadata property: Volume group details.
     * 
     * @return the groupMetadata value.
     */
    public VolumeGroupMetadata groupMetadata() {
        return this.innerProperties() == null ? null : this.innerProperties().groupMetadata();
    }

    /**
     * Set the groupMetadata property: Volume group details.
     * 
     * @param groupMetadata the groupMetadata value to set.
     * @return the VolumeGroupDetailsInner object itself.
     */
    public VolumeGroupDetailsInner withGroupMetadata(VolumeGroupMetadata groupMetadata) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VolumeGroupProperties();
        }
        this.innerProperties().withGroupMetadata(groupMetadata);
        return this;
    }

    /**
     * Get the volumes property: List of volumes from group.
     * 
     * @return the volumes value.
     */
    public List<VolumeGroupVolumeProperties> volumes() {
        return this.innerProperties() == null ? null : this.innerProperties().volumes();
    }

    /**
     * Set the volumes property: List of volumes from group.
     * 
     * @param volumes the volumes value to set.
     * @return the VolumeGroupDetailsInner object itself.
     */
    public VolumeGroupDetailsInner withVolumes(List<VolumeGroupVolumeProperties> volumes) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VolumeGroupProperties();
        }
        this.innerProperties().withVolumes(volumes);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
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
        jsonWriter.writeStringField("location", this.location);
        jsonWriter.writeJsonField("properties", this.innerProperties);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of VolumeGroupDetailsInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of VolumeGroupDetailsInner if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IOException If an error occurs while reading the VolumeGroupDetailsInner.
     */
    public static VolumeGroupDetailsInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            VolumeGroupDetailsInner deserializedVolumeGroupDetailsInner = new VolumeGroupDetailsInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("location".equals(fieldName)) {
                    deserializedVolumeGroupDetailsInner.location = reader.getString();
                } else if ("id".equals(fieldName)) {
                    deserializedVolumeGroupDetailsInner.id = reader.getString();
                } else if ("name".equals(fieldName)) {
                    deserializedVolumeGroupDetailsInner.name = reader.getString();
                } else if ("type".equals(fieldName)) {
                    deserializedVolumeGroupDetailsInner.type = reader.getString();
                } else if ("properties".equals(fieldName)) {
                    deserializedVolumeGroupDetailsInner.innerProperties = VolumeGroupProperties.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedVolumeGroupDetailsInner;
        });
    }
}
