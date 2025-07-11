// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Generated;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Azure File Storage read settings.
 */
@Fluent
public final class AzureFileStorageReadSettings extends StoreReadSettings {
    /*
     * The read setting type.
     */
    @Generated
    private String type = "AzureFileStorageReadSettings";

    /*
     * If true, files under the folder path will be read recursively. Default is true. Type: boolean (or Expression with
     * resultType boolean).
     */
    @Generated
    private Object recursive;

    /*
     * Azure File Storage wildcardFolderPath. Type: string (or Expression with resultType string).
     */
    @Generated
    private Object wildcardFolderPath;

    /*
     * Azure File Storage wildcardFileName. Type: string (or Expression with resultType string).
     */
    @Generated
    private Object wildcardFileName;

    /*
     * The prefix filter for the Azure File name starting from root path. Type: string (or Expression with resultType
     * string).
     */
    @Generated
    private Object prefix;

    /*
     * Point to a text file that lists each file (relative path to the path configured in the dataset) that you want to
     * copy. Type: string (or Expression with resultType string).
     */
    @Generated
    private Object fileListPath;

    /*
     * Indicates whether to enable partition discovery. Type: boolean (or Expression with resultType boolean).
     */
    @Generated
    private Object enablePartitionDiscovery;

    /*
     * Specify the root path where partition discovery starts from. Type: string (or Expression with resultType string).
     */
    @Generated
    private Object partitionRootPath;

    /*
     * Indicates whether the source files need to be deleted after copy completion. Default is false. Type: boolean (or
     * Expression with resultType boolean).
     */
    @Generated
    private Object deleteFilesAfterCompletion;

    /*
     * The start of file's modified datetime. Type: string (or Expression with resultType string).
     */
    @Generated
    private Object modifiedDatetimeStart;

    /*
     * The end of file's modified datetime. Type: string (or Expression with resultType string).
     */
    @Generated
    private Object modifiedDatetimeEnd;

    /**
     * Creates an instance of AzureFileStorageReadSettings class.
     */
    @Generated
    public AzureFileStorageReadSettings() {
    }

    /**
     * Get the type property: The read setting type.
     * 
     * @return the type value.
     */
    @Generated
    @Override
    public String getType() {
        return this.type;
    }

    /**
     * Get the recursive property: If true, files under the folder path will be read recursively. Default is true. Type:
     * boolean (or Expression with resultType boolean).
     * 
     * @return the recursive value.
     */
    @Generated
    public Object getRecursive() {
        return this.recursive;
    }

    /**
     * Set the recursive property: If true, files under the folder path will be read recursively. Default is true. Type:
     * boolean (or Expression with resultType boolean).
     * 
     * @param recursive the recursive value to set.
     * @return the AzureFileStorageReadSettings object itself.
     */
    @Generated
    public AzureFileStorageReadSettings setRecursive(Object recursive) {
        this.recursive = recursive;
        return this;
    }

    /**
     * Get the wildcardFolderPath property: Azure File Storage wildcardFolderPath. Type: string (or Expression with
     * resultType string).
     * 
     * @return the wildcardFolderPath value.
     */
    @Generated
    public Object getWildcardFolderPath() {
        return this.wildcardFolderPath;
    }

    /**
     * Set the wildcardFolderPath property: Azure File Storage wildcardFolderPath. Type: string (or Expression with
     * resultType string).
     * 
     * @param wildcardFolderPath the wildcardFolderPath value to set.
     * @return the AzureFileStorageReadSettings object itself.
     */
    @Generated
    public AzureFileStorageReadSettings setWildcardFolderPath(Object wildcardFolderPath) {
        this.wildcardFolderPath = wildcardFolderPath;
        return this;
    }

    /**
     * Get the wildcardFileName property: Azure File Storage wildcardFileName. Type: string (or Expression with
     * resultType string).
     * 
     * @return the wildcardFileName value.
     */
    @Generated
    public Object getWildcardFileName() {
        return this.wildcardFileName;
    }

    /**
     * Set the wildcardFileName property: Azure File Storage wildcardFileName. Type: string (or Expression with
     * resultType string).
     * 
     * @param wildcardFileName the wildcardFileName value to set.
     * @return the AzureFileStorageReadSettings object itself.
     */
    @Generated
    public AzureFileStorageReadSettings setWildcardFileName(Object wildcardFileName) {
        this.wildcardFileName = wildcardFileName;
        return this;
    }

    /**
     * Get the prefix property: The prefix filter for the Azure File name starting from root path. Type: string (or
     * Expression with resultType string).
     * 
     * @return the prefix value.
     */
    @Generated
    public Object getPrefix() {
        return this.prefix;
    }

    /**
     * Set the prefix property: The prefix filter for the Azure File name starting from root path. Type: string (or
     * Expression with resultType string).
     * 
     * @param prefix the prefix value to set.
     * @return the AzureFileStorageReadSettings object itself.
     */
    @Generated
    public AzureFileStorageReadSettings setPrefix(Object prefix) {
        this.prefix = prefix;
        return this;
    }

    /**
     * Get the fileListPath property: Point to a text file that lists each file (relative path to the path configured in
     * the dataset) that you want to copy. Type: string (or Expression with resultType string).
     * 
     * @return the fileListPath value.
     */
    @Generated
    public Object getFileListPath() {
        return this.fileListPath;
    }

    /**
     * Set the fileListPath property: Point to a text file that lists each file (relative path to the path configured in
     * the dataset) that you want to copy. Type: string (or Expression with resultType string).
     * 
     * @param fileListPath the fileListPath value to set.
     * @return the AzureFileStorageReadSettings object itself.
     */
    @Generated
    public AzureFileStorageReadSettings setFileListPath(Object fileListPath) {
        this.fileListPath = fileListPath;
        return this;
    }

    /**
     * Get the enablePartitionDiscovery property: Indicates whether to enable partition discovery. Type: boolean (or
     * Expression with resultType boolean).
     * 
     * @return the enablePartitionDiscovery value.
     */
    @Generated
    public Object getEnablePartitionDiscovery() {
        return this.enablePartitionDiscovery;
    }

    /**
     * Set the enablePartitionDiscovery property: Indicates whether to enable partition discovery. Type: boolean (or
     * Expression with resultType boolean).
     * 
     * @param enablePartitionDiscovery the enablePartitionDiscovery value to set.
     * @return the AzureFileStorageReadSettings object itself.
     */
    @Generated
    public AzureFileStorageReadSettings setEnablePartitionDiscovery(Object enablePartitionDiscovery) {
        this.enablePartitionDiscovery = enablePartitionDiscovery;
        return this;
    }

    /**
     * Get the partitionRootPath property: Specify the root path where partition discovery starts from. Type: string (or
     * Expression with resultType string).
     * 
     * @return the partitionRootPath value.
     */
    @Generated
    public Object getPartitionRootPath() {
        return this.partitionRootPath;
    }

    /**
     * Set the partitionRootPath property: Specify the root path where partition discovery starts from. Type: string (or
     * Expression with resultType string).
     * 
     * @param partitionRootPath the partitionRootPath value to set.
     * @return the AzureFileStorageReadSettings object itself.
     */
    @Generated
    public AzureFileStorageReadSettings setPartitionRootPath(Object partitionRootPath) {
        this.partitionRootPath = partitionRootPath;
        return this;
    }

    /**
     * Get the deleteFilesAfterCompletion property: Indicates whether the source files need to be deleted after copy
     * completion. Default is false. Type: boolean (or Expression with resultType boolean).
     * 
     * @return the deleteFilesAfterCompletion value.
     */
    @Generated
    public Object getDeleteFilesAfterCompletion() {
        return this.deleteFilesAfterCompletion;
    }

    /**
     * Set the deleteFilesAfterCompletion property: Indicates whether the source files need to be deleted after copy
     * completion. Default is false. Type: boolean (or Expression with resultType boolean).
     * 
     * @param deleteFilesAfterCompletion the deleteFilesAfterCompletion value to set.
     * @return the AzureFileStorageReadSettings object itself.
     */
    @Generated
    public AzureFileStorageReadSettings setDeleteFilesAfterCompletion(Object deleteFilesAfterCompletion) {
        this.deleteFilesAfterCompletion = deleteFilesAfterCompletion;
        return this;
    }

    /**
     * Get the modifiedDatetimeStart property: The start of file's modified datetime. Type: string (or Expression with
     * resultType string).
     * 
     * @return the modifiedDatetimeStart value.
     */
    @Generated
    public Object getModifiedDatetimeStart() {
        return this.modifiedDatetimeStart;
    }

    /**
     * Set the modifiedDatetimeStart property: The start of file's modified datetime. Type: string (or Expression with
     * resultType string).
     * 
     * @param modifiedDatetimeStart the modifiedDatetimeStart value to set.
     * @return the AzureFileStorageReadSettings object itself.
     */
    @Generated
    public AzureFileStorageReadSettings setModifiedDatetimeStart(Object modifiedDatetimeStart) {
        this.modifiedDatetimeStart = modifiedDatetimeStart;
        return this;
    }

    /**
     * Get the modifiedDatetimeEnd property: The end of file's modified datetime. Type: string (or Expression with
     * resultType string).
     * 
     * @return the modifiedDatetimeEnd value.
     */
    @Generated
    public Object getModifiedDatetimeEnd() {
        return this.modifiedDatetimeEnd;
    }

    /**
     * Set the modifiedDatetimeEnd property: The end of file's modified datetime. Type: string (or Expression with
     * resultType string).
     * 
     * @param modifiedDatetimeEnd the modifiedDatetimeEnd value to set.
     * @return the AzureFileStorageReadSettings object itself.
     */
    @Generated
    public AzureFileStorageReadSettings setModifiedDatetimeEnd(Object modifiedDatetimeEnd) {
        this.modifiedDatetimeEnd = modifiedDatetimeEnd;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public AzureFileStorageReadSettings setMaxConcurrentConnections(Object maxConcurrentConnections) {
        super.setMaxConcurrentConnections(maxConcurrentConnections);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        if (getMaxConcurrentConnections() != null) {
            jsonWriter.writeUntypedField("maxConcurrentConnections", getMaxConcurrentConnections());
        }
        jsonWriter.writeStringField("type", this.type);
        if (this.recursive != null) {
            jsonWriter.writeUntypedField("recursive", this.recursive);
        }
        if (this.wildcardFolderPath != null) {
            jsonWriter.writeUntypedField("wildcardFolderPath", this.wildcardFolderPath);
        }
        if (this.wildcardFileName != null) {
            jsonWriter.writeUntypedField("wildcardFileName", this.wildcardFileName);
        }
        if (this.prefix != null) {
            jsonWriter.writeUntypedField("prefix", this.prefix);
        }
        if (this.fileListPath != null) {
            jsonWriter.writeUntypedField("fileListPath", this.fileListPath);
        }
        if (this.enablePartitionDiscovery != null) {
            jsonWriter.writeUntypedField("enablePartitionDiscovery", this.enablePartitionDiscovery);
        }
        if (this.partitionRootPath != null) {
            jsonWriter.writeUntypedField("partitionRootPath", this.partitionRootPath);
        }
        if (this.deleteFilesAfterCompletion != null) {
            jsonWriter.writeUntypedField("deleteFilesAfterCompletion", this.deleteFilesAfterCompletion);
        }
        if (this.modifiedDatetimeStart != null) {
            jsonWriter.writeUntypedField("modifiedDatetimeStart", this.modifiedDatetimeStart);
        }
        if (this.modifiedDatetimeEnd != null) {
            jsonWriter.writeUntypedField("modifiedDatetimeEnd", this.modifiedDatetimeEnd);
        }
        if (getAdditionalProperties() != null) {
            for (Map.Entry<String, Object> additionalProperty : getAdditionalProperties().entrySet()) {
                jsonWriter.writeUntypedField(additionalProperty.getKey(), additionalProperty.getValue());
            }
        }
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of AzureFileStorageReadSettings from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of AzureFileStorageReadSettings if the JsonReader was pointing to an instance of it, or null
     * if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the AzureFileStorageReadSettings.
     */
    @Generated
    public static AzureFileStorageReadSettings fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            AzureFileStorageReadSettings deserializedAzureFileStorageReadSettings = new AzureFileStorageReadSettings();
            Map<String, Object> additionalProperties = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("maxConcurrentConnections".equals(fieldName)) {
                    deserializedAzureFileStorageReadSettings.setMaxConcurrentConnections(reader.readUntyped());
                } else if ("type".equals(fieldName)) {
                    deserializedAzureFileStorageReadSettings.type = reader.getString();
                } else if ("recursive".equals(fieldName)) {
                    deserializedAzureFileStorageReadSettings.recursive = reader.readUntyped();
                } else if ("wildcardFolderPath".equals(fieldName)) {
                    deserializedAzureFileStorageReadSettings.wildcardFolderPath = reader.readUntyped();
                } else if ("wildcardFileName".equals(fieldName)) {
                    deserializedAzureFileStorageReadSettings.wildcardFileName = reader.readUntyped();
                } else if ("prefix".equals(fieldName)) {
                    deserializedAzureFileStorageReadSettings.prefix = reader.readUntyped();
                } else if ("fileListPath".equals(fieldName)) {
                    deserializedAzureFileStorageReadSettings.fileListPath = reader.readUntyped();
                } else if ("enablePartitionDiscovery".equals(fieldName)) {
                    deserializedAzureFileStorageReadSettings.enablePartitionDiscovery = reader.readUntyped();
                } else if ("partitionRootPath".equals(fieldName)) {
                    deserializedAzureFileStorageReadSettings.partitionRootPath = reader.readUntyped();
                } else if ("deleteFilesAfterCompletion".equals(fieldName)) {
                    deserializedAzureFileStorageReadSettings.deleteFilesAfterCompletion = reader.readUntyped();
                } else if ("modifiedDatetimeStart".equals(fieldName)) {
                    deserializedAzureFileStorageReadSettings.modifiedDatetimeStart = reader.readUntyped();
                } else if ("modifiedDatetimeEnd".equals(fieldName)) {
                    deserializedAzureFileStorageReadSettings.modifiedDatetimeEnd = reader.readUntyped();
                } else {
                    if (additionalProperties == null) {
                        additionalProperties = new LinkedHashMap<>();
                    }

                    additionalProperties.put(fieldName, reader.readUntyped());
                }
            }
            deserializedAzureFileStorageReadSettings.setAdditionalProperties(additionalProperties);

            return deserializedAzureFileStorageReadSettings;
        });
    }
}
