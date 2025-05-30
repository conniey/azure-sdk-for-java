// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Ftp read settings.
 */
@Fluent
public final class FtpReadSettings extends StoreReadSettings {
    /*
     * The read setting type.
     */
    private String type = "FtpReadSettings";

    /*
     * If true, files under the folder path will be read recursively. Default is true. Type: boolean (or Expression with
     * resultType boolean).
     */
    private Object recursive;

    /*
     * Ftp wildcardFolderPath. Type: string (or Expression with resultType string).
     */
    private Object wildcardFolderPath;

    /*
     * Ftp wildcardFileName. Type: string (or Expression with resultType string).
     */
    private Object wildcardFileName;

    /*
     * Indicates whether to enable partition discovery. Type: boolean (or Expression with resultType boolean).
     */
    private Object enablePartitionDiscovery;

    /*
     * Specify the root path where partition discovery starts from. Type: string (or Expression with resultType string).
     */
    private Object partitionRootPath;

    /*
     * Indicates whether the source files need to be deleted after copy completion. Default is false. Type: boolean (or
     * Expression with resultType boolean).
     */
    private Object deleteFilesAfterCompletion;

    /*
     * Point to a text file that lists each file (relative path to the path configured in the dataset) that you want to
     * copy. Type: string (or Expression with resultType string).
     */
    private Object fileListPath;

    /*
     * Specify whether to use binary transfer mode for FTP stores. Type: boolean (or Expression with resultType
     * boolean).
     */
    private Object useBinaryTransfer;

    /*
     * If true, disable parallel reading within each file. Default is false. Type: boolean (or Expression with
     * resultType boolean).
     */
    private Object disableChunking;

    /**
     * Creates an instance of FtpReadSettings class.
     */
    public FtpReadSettings() {
    }

    /**
     * Get the type property: The read setting type.
     * 
     * @return the type value.
     */
    @Override
    public String type() {
        return this.type;
    }

    /**
     * Get the recursive property: If true, files under the folder path will be read recursively. Default is true. Type:
     * boolean (or Expression with resultType boolean).
     * 
     * @return the recursive value.
     */
    public Object recursive() {
        return this.recursive;
    }

    /**
     * Set the recursive property: If true, files under the folder path will be read recursively. Default is true. Type:
     * boolean (or Expression with resultType boolean).
     * 
     * @param recursive the recursive value to set.
     * @return the FtpReadSettings object itself.
     */
    public FtpReadSettings withRecursive(Object recursive) {
        this.recursive = recursive;
        return this;
    }

    /**
     * Get the wildcardFolderPath property: Ftp wildcardFolderPath. Type: string (or Expression with resultType string).
     * 
     * @return the wildcardFolderPath value.
     */
    public Object wildcardFolderPath() {
        return this.wildcardFolderPath;
    }

    /**
     * Set the wildcardFolderPath property: Ftp wildcardFolderPath. Type: string (or Expression with resultType string).
     * 
     * @param wildcardFolderPath the wildcardFolderPath value to set.
     * @return the FtpReadSettings object itself.
     */
    public FtpReadSettings withWildcardFolderPath(Object wildcardFolderPath) {
        this.wildcardFolderPath = wildcardFolderPath;
        return this;
    }

    /**
     * Get the wildcardFileName property: Ftp wildcardFileName. Type: string (or Expression with resultType string).
     * 
     * @return the wildcardFileName value.
     */
    public Object wildcardFileName() {
        return this.wildcardFileName;
    }

    /**
     * Set the wildcardFileName property: Ftp wildcardFileName. Type: string (or Expression with resultType string).
     * 
     * @param wildcardFileName the wildcardFileName value to set.
     * @return the FtpReadSettings object itself.
     */
    public FtpReadSettings withWildcardFileName(Object wildcardFileName) {
        this.wildcardFileName = wildcardFileName;
        return this;
    }

    /**
     * Get the enablePartitionDiscovery property: Indicates whether to enable partition discovery. Type: boolean (or
     * Expression with resultType boolean).
     * 
     * @return the enablePartitionDiscovery value.
     */
    public Object enablePartitionDiscovery() {
        return this.enablePartitionDiscovery;
    }

    /**
     * Set the enablePartitionDiscovery property: Indicates whether to enable partition discovery. Type: boolean (or
     * Expression with resultType boolean).
     * 
     * @param enablePartitionDiscovery the enablePartitionDiscovery value to set.
     * @return the FtpReadSettings object itself.
     */
    public FtpReadSettings withEnablePartitionDiscovery(Object enablePartitionDiscovery) {
        this.enablePartitionDiscovery = enablePartitionDiscovery;
        return this;
    }

    /**
     * Get the partitionRootPath property: Specify the root path where partition discovery starts from. Type: string (or
     * Expression with resultType string).
     * 
     * @return the partitionRootPath value.
     */
    public Object partitionRootPath() {
        return this.partitionRootPath;
    }

    /**
     * Set the partitionRootPath property: Specify the root path where partition discovery starts from. Type: string (or
     * Expression with resultType string).
     * 
     * @param partitionRootPath the partitionRootPath value to set.
     * @return the FtpReadSettings object itself.
     */
    public FtpReadSettings withPartitionRootPath(Object partitionRootPath) {
        this.partitionRootPath = partitionRootPath;
        return this;
    }

    /**
     * Get the deleteFilesAfterCompletion property: Indicates whether the source files need to be deleted after copy
     * completion. Default is false. Type: boolean (or Expression with resultType boolean).
     * 
     * @return the deleteFilesAfterCompletion value.
     */
    public Object deleteFilesAfterCompletion() {
        return this.deleteFilesAfterCompletion;
    }

    /**
     * Set the deleteFilesAfterCompletion property: Indicates whether the source files need to be deleted after copy
     * completion. Default is false. Type: boolean (or Expression with resultType boolean).
     * 
     * @param deleteFilesAfterCompletion the deleteFilesAfterCompletion value to set.
     * @return the FtpReadSettings object itself.
     */
    public FtpReadSettings withDeleteFilesAfterCompletion(Object deleteFilesAfterCompletion) {
        this.deleteFilesAfterCompletion = deleteFilesAfterCompletion;
        return this;
    }

    /**
     * Get the fileListPath property: Point to a text file that lists each file (relative path to the path configured in
     * the dataset) that you want to copy. Type: string (or Expression with resultType string).
     * 
     * @return the fileListPath value.
     */
    public Object fileListPath() {
        return this.fileListPath;
    }

    /**
     * Set the fileListPath property: Point to a text file that lists each file (relative path to the path configured in
     * the dataset) that you want to copy. Type: string (or Expression with resultType string).
     * 
     * @param fileListPath the fileListPath value to set.
     * @return the FtpReadSettings object itself.
     */
    public FtpReadSettings withFileListPath(Object fileListPath) {
        this.fileListPath = fileListPath;
        return this;
    }

    /**
     * Get the useBinaryTransfer property: Specify whether to use binary transfer mode for FTP stores. Type: boolean (or
     * Expression with resultType boolean).
     * 
     * @return the useBinaryTransfer value.
     */
    public Object useBinaryTransfer() {
        return this.useBinaryTransfer;
    }

    /**
     * Set the useBinaryTransfer property: Specify whether to use binary transfer mode for FTP stores. Type: boolean (or
     * Expression with resultType boolean).
     * 
     * @param useBinaryTransfer the useBinaryTransfer value to set.
     * @return the FtpReadSettings object itself.
     */
    public FtpReadSettings withUseBinaryTransfer(Object useBinaryTransfer) {
        this.useBinaryTransfer = useBinaryTransfer;
        return this;
    }

    /**
     * Get the disableChunking property: If true, disable parallel reading within each file. Default is false. Type:
     * boolean (or Expression with resultType boolean).
     * 
     * @return the disableChunking value.
     */
    public Object disableChunking() {
        return this.disableChunking;
    }

    /**
     * Set the disableChunking property: If true, disable parallel reading within each file. Default is false. Type:
     * boolean (or Expression with resultType boolean).
     * 
     * @param disableChunking the disableChunking value to set.
     * @return the FtpReadSettings object itself.
     */
    public FtpReadSettings withDisableChunking(Object disableChunking) {
        this.disableChunking = disableChunking;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FtpReadSettings withMaxConcurrentConnections(Object maxConcurrentConnections) {
        super.withMaxConcurrentConnections(maxConcurrentConnections);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FtpReadSettings withDisableMetricsCollection(Object disableMetricsCollection) {
        super.withDisableMetricsCollection(disableMetricsCollection);
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
        if (maxConcurrentConnections() != null) {
            jsonWriter.writeUntypedField("maxConcurrentConnections", maxConcurrentConnections());
        }
        if (disableMetricsCollection() != null) {
            jsonWriter.writeUntypedField("disableMetricsCollection", disableMetricsCollection());
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
        if (this.enablePartitionDiscovery != null) {
            jsonWriter.writeUntypedField("enablePartitionDiscovery", this.enablePartitionDiscovery);
        }
        if (this.partitionRootPath != null) {
            jsonWriter.writeUntypedField("partitionRootPath", this.partitionRootPath);
        }
        if (this.deleteFilesAfterCompletion != null) {
            jsonWriter.writeUntypedField("deleteFilesAfterCompletion", this.deleteFilesAfterCompletion);
        }
        if (this.fileListPath != null) {
            jsonWriter.writeUntypedField("fileListPath", this.fileListPath);
        }
        if (this.useBinaryTransfer != null) {
            jsonWriter.writeUntypedField("useBinaryTransfer", this.useBinaryTransfer);
        }
        if (this.disableChunking != null) {
            jsonWriter.writeUntypedField("disableChunking", this.disableChunking);
        }
        if (additionalProperties() != null) {
            for (Map.Entry<String, Object> additionalProperty : additionalProperties().entrySet()) {
                jsonWriter.writeUntypedField(additionalProperty.getKey(), additionalProperty.getValue());
            }
        }
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of FtpReadSettings from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of FtpReadSettings if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the FtpReadSettings.
     */
    public static FtpReadSettings fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            FtpReadSettings deserializedFtpReadSettings = new FtpReadSettings();
            Map<String, Object> additionalProperties = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("maxConcurrentConnections".equals(fieldName)) {
                    deserializedFtpReadSettings.withMaxConcurrentConnections(reader.readUntyped());
                } else if ("disableMetricsCollection".equals(fieldName)) {
                    deserializedFtpReadSettings.withDisableMetricsCollection(reader.readUntyped());
                } else if ("type".equals(fieldName)) {
                    deserializedFtpReadSettings.type = reader.getString();
                } else if ("recursive".equals(fieldName)) {
                    deserializedFtpReadSettings.recursive = reader.readUntyped();
                } else if ("wildcardFolderPath".equals(fieldName)) {
                    deserializedFtpReadSettings.wildcardFolderPath = reader.readUntyped();
                } else if ("wildcardFileName".equals(fieldName)) {
                    deserializedFtpReadSettings.wildcardFileName = reader.readUntyped();
                } else if ("enablePartitionDiscovery".equals(fieldName)) {
                    deserializedFtpReadSettings.enablePartitionDiscovery = reader.readUntyped();
                } else if ("partitionRootPath".equals(fieldName)) {
                    deserializedFtpReadSettings.partitionRootPath = reader.readUntyped();
                } else if ("deleteFilesAfterCompletion".equals(fieldName)) {
                    deserializedFtpReadSettings.deleteFilesAfterCompletion = reader.readUntyped();
                } else if ("fileListPath".equals(fieldName)) {
                    deserializedFtpReadSettings.fileListPath = reader.readUntyped();
                } else if ("useBinaryTransfer".equals(fieldName)) {
                    deserializedFtpReadSettings.useBinaryTransfer = reader.readUntyped();
                } else if ("disableChunking".equals(fieldName)) {
                    deserializedFtpReadSettings.disableChunking = reader.readUntyped();
                } else {
                    if (additionalProperties == null) {
                        additionalProperties = new LinkedHashMap<>();
                    }

                    additionalProperties.put(fieldName, reader.readUntyped());
                }
            }
            deserializedFtpReadSettings.withAdditionalProperties(additionalProperties);

            return deserializedFtpReadSettings;
        });
    }
}
