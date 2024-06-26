// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.scvmm.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Virtual disk model.
 */
@Fluent
public final class VirtualDisk implements JsonSerializable<VirtualDisk> {
    /*
     * Gets or sets the name of the disk.
     */
    private String name;

    /*
     * Gets the display name of the virtual disk as shown in the vmmServer. This is the fallback label for a disk when
     * the name is not set.
     */
    private String displayName;

    /*
     * Gets or sets the disk id.
     */
    private String diskId;

    /*
     * Gets or sets the disk total size.
     */
    private Integer diskSizeGB;

    /*
     * Gets the max disk size.
     */
    private Integer maxDiskSizeGB;

    /*
     * Gets or sets the disk bus.
     */
    private Integer bus;

    /*
     * Gets or sets the disk lun.
     */
    private Integer lun;

    /*
     * Gets or sets the disk bus type.
     */
    private String busType;

    /*
     * Gets or sets the disk vhd type.
     */
    private String vhdType;

    /*
     * Gets the disk volume type.
     */
    private String volumeType;

    /*
     * Gets the disk vhd format type.
     */
    private String vhdFormatType;

    /*
     * Gets or sets the disk id in the template.
     */
    private String templateDiskId;

    /*
     * The QoS policy for the disk.
     */
    private StorageQosPolicyDetails storageQosPolicy;

    /*
     * Gets or sets a value indicating diff disk.
     */
    private CreateDiffDisk createDiffDisk;

    /**
     * Creates an instance of VirtualDisk class.
     */
    public VirtualDisk() {
    }

    /**
     * Get the name property: Gets or sets the name of the disk.
     * 
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: Gets or sets the name of the disk.
     * 
     * @param name the name value to set.
     * @return the VirtualDisk object itself.
     */
    public VirtualDisk withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the displayName property: Gets the display name of the virtual disk as shown in the vmmServer. This is the
     * fallback label for a disk when the name is not set.
     * 
     * @return the displayName value.
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Get the diskId property: Gets or sets the disk id.
     * 
     * @return the diskId value.
     */
    public String diskId() {
        return this.diskId;
    }

    /**
     * Set the diskId property: Gets or sets the disk id.
     * 
     * @param diskId the diskId value to set.
     * @return the VirtualDisk object itself.
     */
    public VirtualDisk withDiskId(String diskId) {
        this.diskId = diskId;
        return this;
    }

    /**
     * Get the diskSizeGB property: Gets or sets the disk total size.
     * 
     * @return the diskSizeGB value.
     */
    public Integer diskSizeGB() {
        return this.diskSizeGB;
    }

    /**
     * Set the diskSizeGB property: Gets or sets the disk total size.
     * 
     * @param diskSizeGB the diskSizeGB value to set.
     * @return the VirtualDisk object itself.
     */
    public VirtualDisk withDiskSizeGB(Integer diskSizeGB) {
        this.diskSizeGB = diskSizeGB;
        return this;
    }

    /**
     * Get the maxDiskSizeGB property: Gets the max disk size.
     * 
     * @return the maxDiskSizeGB value.
     */
    public Integer maxDiskSizeGB() {
        return this.maxDiskSizeGB;
    }

    /**
     * Get the bus property: Gets or sets the disk bus.
     * 
     * @return the bus value.
     */
    public Integer bus() {
        return this.bus;
    }

    /**
     * Set the bus property: Gets or sets the disk bus.
     * 
     * @param bus the bus value to set.
     * @return the VirtualDisk object itself.
     */
    public VirtualDisk withBus(Integer bus) {
        this.bus = bus;
        return this;
    }

    /**
     * Get the lun property: Gets or sets the disk lun.
     * 
     * @return the lun value.
     */
    public Integer lun() {
        return this.lun;
    }

    /**
     * Set the lun property: Gets or sets the disk lun.
     * 
     * @param lun the lun value to set.
     * @return the VirtualDisk object itself.
     */
    public VirtualDisk withLun(Integer lun) {
        this.lun = lun;
        return this;
    }

    /**
     * Get the busType property: Gets or sets the disk bus type.
     * 
     * @return the busType value.
     */
    public String busType() {
        return this.busType;
    }

    /**
     * Set the busType property: Gets or sets the disk bus type.
     * 
     * @param busType the busType value to set.
     * @return the VirtualDisk object itself.
     */
    public VirtualDisk withBusType(String busType) {
        this.busType = busType;
        return this;
    }

    /**
     * Get the vhdType property: Gets or sets the disk vhd type.
     * 
     * @return the vhdType value.
     */
    public String vhdType() {
        return this.vhdType;
    }

    /**
     * Set the vhdType property: Gets or sets the disk vhd type.
     * 
     * @param vhdType the vhdType value to set.
     * @return the VirtualDisk object itself.
     */
    public VirtualDisk withVhdType(String vhdType) {
        this.vhdType = vhdType;
        return this;
    }

    /**
     * Get the volumeType property: Gets the disk volume type.
     * 
     * @return the volumeType value.
     */
    public String volumeType() {
        return this.volumeType;
    }

    /**
     * Get the vhdFormatType property: Gets the disk vhd format type.
     * 
     * @return the vhdFormatType value.
     */
    public String vhdFormatType() {
        return this.vhdFormatType;
    }

    /**
     * Get the templateDiskId property: Gets or sets the disk id in the template.
     * 
     * @return the templateDiskId value.
     */
    public String templateDiskId() {
        return this.templateDiskId;
    }

    /**
     * Set the templateDiskId property: Gets or sets the disk id in the template.
     * 
     * @param templateDiskId the templateDiskId value to set.
     * @return the VirtualDisk object itself.
     */
    public VirtualDisk withTemplateDiskId(String templateDiskId) {
        this.templateDiskId = templateDiskId;
        return this;
    }

    /**
     * Get the storageQosPolicy property: The QoS policy for the disk.
     * 
     * @return the storageQosPolicy value.
     */
    public StorageQosPolicyDetails storageQosPolicy() {
        return this.storageQosPolicy;
    }

    /**
     * Set the storageQosPolicy property: The QoS policy for the disk.
     * 
     * @param storageQosPolicy the storageQosPolicy value to set.
     * @return the VirtualDisk object itself.
     */
    public VirtualDisk withStorageQosPolicy(StorageQosPolicyDetails storageQosPolicy) {
        this.storageQosPolicy = storageQosPolicy;
        return this;
    }

    /**
     * Get the createDiffDisk property: Gets or sets a value indicating diff disk.
     * 
     * @return the createDiffDisk value.
     */
    public CreateDiffDisk createDiffDisk() {
        return this.createDiffDisk;
    }

    /**
     * Set the createDiffDisk property: Gets or sets a value indicating diff disk.
     * 
     * @param createDiffDisk the createDiffDisk value to set.
     * @return the VirtualDisk object itself.
     */
    public VirtualDisk withCreateDiffDisk(CreateDiffDisk createDiffDisk) {
        this.createDiffDisk = createDiffDisk;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (storageQosPolicy() != null) {
            storageQosPolicy().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("name", this.name);
        jsonWriter.writeStringField("diskId", this.diskId);
        jsonWriter.writeNumberField("diskSizeGB", this.diskSizeGB);
        jsonWriter.writeNumberField("bus", this.bus);
        jsonWriter.writeNumberField("lun", this.lun);
        jsonWriter.writeStringField("busType", this.busType);
        jsonWriter.writeStringField("vhdType", this.vhdType);
        jsonWriter.writeStringField("templateDiskId", this.templateDiskId);
        jsonWriter.writeJsonField("storageQoSPolicy", this.storageQosPolicy);
        jsonWriter.writeStringField("createDiffDisk",
            this.createDiffDisk == null ? null : this.createDiffDisk.toString());
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of VirtualDisk from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of VirtualDisk if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the VirtualDisk.
     */
    public static VirtualDisk fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            VirtualDisk deserializedVirtualDisk = new VirtualDisk();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("name".equals(fieldName)) {
                    deserializedVirtualDisk.name = reader.getString();
                } else if ("displayName".equals(fieldName)) {
                    deserializedVirtualDisk.displayName = reader.getString();
                } else if ("diskId".equals(fieldName)) {
                    deserializedVirtualDisk.diskId = reader.getString();
                } else if ("diskSizeGB".equals(fieldName)) {
                    deserializedVirtualDisk.diskSizeGB = reader.getNullable(JsonReader::getInt);
                } else if ("maxDiskSizeGB".equals(fieldName)) {
                    deserializedVirtualDisk.maxDiskSizeGB = reader.getNullable(JsonReader::getInt);
                } else if ("bus".equals(fieldName)) {
                    deserializedVirtualDisk.bus = reader.getNullable(JsonReader::getInt);
                } else if ("lun".equals(fieldName)) {
                    deserializedVirtualDisk.lun = reader.getNullable(JsonReader::getInt);
                } else if ("busType".equals(fieldName)) {
                    deserializedVirtualDisk.busType = reader.getString();
                } else if ("vhdType".equals(fieldName)) {
                    deserializedVirtualDisk.vhdType = reader.getString();
                } else if ("volumeType".equals(fieldName)) {
                    deserializedVirtualDisk.volumeType = reader.getString();
                } else if ("vhdFormatType".equals(fieldName)) {
                    deserializedVirtualDisk.vhdFormatType = reader.getString();
                } else if ("templateDiskId".equals(fieldName)) {
                    deserializedVirtualDisk.templateDiskId = reader.getString();
                } else if ("storageQoSPolicy".equals(fieldName)) {
                    deserializedVirtualDisk.storageQosPolicy = StorageQosPolicyDetails.fromJson(reader);
                } else if ("createDiffDisk".equals(fieldName)) {
                    deserializedVirtualDisk.createDiffDisk = CreateDiffDisk.fromString(reader.getString());
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedVirtualDisk;
        });
    }
}
