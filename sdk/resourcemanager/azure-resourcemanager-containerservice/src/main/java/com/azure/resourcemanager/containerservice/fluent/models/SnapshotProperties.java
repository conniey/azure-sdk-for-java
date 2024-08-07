// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerservice.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.containerservice.models.CreationData;
import com.azure.resourcemanager.containerservice.models.OSSku;
import com.azure.resourcemanager.containerservice.models.OSType;
import com.azure.resourcemanager.containerservice.models.SnapshotType;
import java.io.IOException;

/**
 * Properties used to configure a node pool snapshot.
 */
@Fluent
public final class SnapshotProperties implements JsonSerializable<SnapshotProperties> {
    /*
     * CreationData to be used to specify the source agent pool resource ID to create this snapshot.
     */
    private CreationData creationData;

    /*
     * The type of a snapshot. The default is NodePool.
     */
    private SnapshotType snapshotType;

    /*
     * The version of Kubernetes.
     */
    private String kubernetesVersion;

    /*
     * The version of node image.
     */
    private String nodeImageVersion;

    /*
     * OsType to be used to specify os type. Choose from Linux and Windows. Default to Linux.
     */
    private OSType osType;

    /*
     * Specifies the OS SKU used by the agent pool. The default is Ubuntu if OSType is Linux. The default is Windows2019
     * when Kubernetes <= 1.24 or Windows2022 when Kubernetes >= 1.25 if OSType is Windows.
     */
    private OSSku osSku;

    /*
     * The size of the VM.
     */
    private String vmSize;

    /*
     * Whether to use a FIPS-enabled OS.
     */
    private Boolean enableFips;

    /**
     * Creates an instance of SnapshotProperties class.
     */
    public SnapshotProperties() {
    }

    /**
     * Get the creationData property: CreationData to be used to specify the source agent pool resource ID to create
     * this snapshot.
     * 
     * @return the creationData value.
     */
    public CreationData creationData() {
        return this.creationData;
    }

    /**
     * Set the creationData property: CreationData to be used to specify the source agent pool resource ID to create
     * this snapshot.
     * 
     * @param creationData the creationData value to set.
     * @return the SnapshotProperties object itself.
     */
    public SnapshotProperties withCreationData(CreationData creationData) {
        this.creationData = creationData;
        return this;
    }

    /**
     * Get the snapshotType property: The type of a snapshot. The default is NodePool.
     * 
     * @return the snapshotType value.
     */
    public SnapshotType snapshotType() {
        return this.snapshotType;
    }

    /**
     * Set the snapshotType property: The type of a snapshot. The default is NodePool.
     * 
     * @param snapshotType the snapshotType value to set.
     * @return the SnapshotProperties object itself.
     */
    public SnapshotProperties withSnapshotType(SnapshotType snapshotType) {
        this.snapshotType = snapshotType;
        return this;
    }

    /**
     * Get the kubernetesVersion property: The version of Kubernetes.
     * 
     * @return the kubernetesVersion value.
     */
    public String kubernetesVersion() {
        return this.kubernetesVersion;
    }

    /**
     * Get the nodeImageVersion property: The version of node image.
     * 
     * @return the nodeImageVersion value.
     */
    public String nodeImageVersion() {
        return this.nodeImageVersion;
    }

    /**
     * Get the osType property: OsType to be used to specify os type. Choose from Linux and Windows. Default to Linux.
     * 
     * @return the osType value.
     */
    public OSType osType() {
        return this.osType;
    }

    /**
     * Get the osSku property: Specifies the OS SKU used by the agent pool. The default is Ubuntu if OSType is Linux.
     * The default is Windows2019 when Kubernetes &lt;= 1.24 or Windows2022 when Kubernetes &gt;= 1.25 if OSType is
     * Windows.
     * 
     * @return the osSku value.
     */
    public OSSku osSku() {
        return this.osSku;
    }

    /**
     * Get the vmSize property: The size of the VM.
     * 
     * @return the vmSize value.
     */
    public String vmSize() {
        return this.vmSize;
    }

    /**
     * Get the enableFips property: Whether to use a FIPS-enabled OS.
     * 
     * @return the enableFips value.
     */
    public Boolean enableFips() {
        return this.enableFips;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (creationData() != null) {
            creationData().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeJsonField("creationData", this.creationData);
        jsonWriter.writeStringField("snapshotType", this.snapshotType == null ? null : this.snapshotType.toString());
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of SnapshotProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of SnapshotProperties if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the SnapshotProperties.
     */
    public static SnapshotProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            SnapshotProperties deserializedSnapshotProperties = new SnapshotProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("creationData".equals(fieldName)) {
                    deserializedSnapshotProperties.creationData = CreationData.fromJson(reader);
                } else if ("snapshotType".equals(fieldName)) {
                    deserializedSnapshotProperties.snapshotType = SnapshotType.fromString(reader.getString());
                } else if ("kubernetesVersion".equals(fieldName)) {
                    deserializedSnapshotProperties.kubernetesVersion = reader.getString();
                } else if ("nodeImageVersion".equals(fieldName)) {
                    deserializedSnapshotProperties.nodeImageVersion = reader.getString();
                } else if ("osType".equals(fieldName)) {
                    deserializedSnapshotProperties.osType = OSType.fromString(reader.getString());
                } else if ("osSku".equals(fieldName)) {
                    deserializedSnapshotProperties.osSku = OSSku.fromString(reader.getString());
                } else if ("vmSize".equals(fieldName)) {
                    deserializedSnapshotProperties.vmSize = reader.getString();
                } else if ("enableFIPS".equals(fieldName)) {
                    deserializedSnapshotProperties.enableFips = reader.getNullable(JsonReader::getBoolean);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedSnapshotProperties;
        });
    }
}
