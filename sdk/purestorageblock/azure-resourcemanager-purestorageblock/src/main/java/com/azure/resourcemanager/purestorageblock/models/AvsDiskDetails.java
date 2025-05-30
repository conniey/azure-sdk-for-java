// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.purestorageblock.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * AVS disk/volume information.
 */
@Immutable
public final class AvsDiskDetails implements JsonSerializable<AvsDiskDetails> {
    /*
     * VMware ID of the disk/volume
     */
    private String diskId;

    /*
     * VMware name of the disk/volume
     */
    private String diskName;

    /*
     * Name of the top-level folder in the datastore that contains the disk/volume
     */
    private String folder;

    /*
     * VMware ID assigned to the disk/volume
     */
    private String avsVmInternalId;

    /*
     * Azure resource ID of the AVS VM connected to this disk/volume
     */
    private String avsVmResourceId;

    /*
     * Name of the AVS VM connected to this disk/volume
     */
    private String avsVmName;

    /*
     * Azure resource ID of the AVS storage container containing this disk/volume
     */
    private String avsStorageContainerResourceId;

    /**
     * Creates an instance of AvsDiskDetails class.
     */
    private AvsDiskDetails() {
    }

    /**
     * Get the diskId property: VMware ID of the disk/volume.
     * 
     * @return the diskId value.
     */
    public String diskId() {
        return this.diskId;
    }

    /**
     * Get the diskName property: VMware name of the disk/volume.
     * 
     * @return the diskName value.
     */
    public String diskName() {
        return this.diskName;
    }

    /**
     * Get the folder property: Name of the top-level folder in the datastore that contains the disk/volume.
     * 
     * @return the folder value.
     */
    public String folder() {
        return this.folder;
    }

    /**
     * Get the avsVmInternalId property: VMware ID assigned to the disk/volume.
     * 
     * @return the avsVmInternalId value.
     */
    public String avsVmInternalId() {
        return this.avsVmInternalId;
    }

    /**
     * Get the avsVmResourceId property: Azure resource ID of the AVS VM connected to this disk/volume.
     * 
     * @return the avsVmResourceId value.
     */
    public String avsVmResourceId() {
        return this.avsVmResourceId;
    }

    /**
     * Get the avsVmName property: Name of the AVS VM connected to this disk/volume.
     * 
     * @return the avsVmName value.
     */
    public String avsVmName() {
        return this.avsVmName;
    }

    /**
     * Get the avsStorageContainerResourceId property: Azure resource ID of the AVS storage container containing this
     * disk/volume.
     * 
     * @return the avsStorageContainerResourceId value.
     */
    public String avsStorageContainerResourceId() {
        return this.avsStorageContainerResourceId;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (diskId() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException("Missing required property diskId in model AvsDiskDetails"));
        }
        if (diskName() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException("Missing required property diskName in model AvsDiskDetails"));
        }
        if (folder() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException("Missing required property folder in model AvsDiskDetails"));
        }
        if (avsVmInternalId() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException("Missing required property avsVmInternalId in model AvsDiskDetails"));
        }
        if (avsVmResourceId() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException("Missing required property avsVmResourceId in model AvsDiskDetails"));
        }
        if (avsVmName() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException("Missing required property avsVmName in model AvsDiskDetails"));
        }
        if (avsStorageContainerResourceId() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property avsStorageContainerResourceId in model AvsDiskDetails"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(AvsDiskDetails.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("diskId", this.diskId);
        jsonWriter.writeStringField("diskName", this.diskName);
        jsonWriter.writeStringField("folder", this.folder);
        jsonWriter.writeStringField("avsVmInternalId", this.avsVmInternalId);
        jsonWriter.writeStringField("avsVmResourceId", this.avsVmResourceId);
        jsonWriter.writeStringField("avsVmName", this.avsVmName);
        jsonWriter.writeStringField("avsStorageContainerResourceId", this.avsStorageContainerResourceId);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of AvsDiskDetails from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of AvsDiskDetails if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the AvsDiskDetails.
     */
    public static AvsDiskDetails fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            AvsDiskDetails deserializedAvsDiskDetails = new AvsDiskDetails();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("diskId".equals(fieldName)) {
                    deserializedAvsDiskDetails.diskId = reader.getString();
                } else if ("diskName".equals(fieldName)) {
                    deserializedAvsDiskDetails.diskName = reader.getString();
                } else if ("folder".equals(fieldName)) {
                    deserializedAvsDiskDetails.folder = reader.getString();
                } else if ("avsVmInternalId".equals(fieldName)) {
                    deserializedAvsDiskDetails.avsVmInternalId = reader.getString();
                } else if ("avsVmResourceId".equals(fieldName)) {
                    deserializedAvsDiskDetails.avsVmResourceId = reader.getString();
                } else if ("avsVmName".equals(fieldName)) {
                    deserializedAvsDiskDetails.avsVmName = reader.getString();
                } else if ("avsStorageContainerResourceId".equals(fieldName)) {
                    deserializedAvsDiskDetails.avsStorageContainerResourceId = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedAvsDiskDetails;
        });
    }
}
