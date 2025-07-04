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
 * Parquet write settings.
 */
@Fluent
public final class ParquetWriteSettings extends FormatWriteSettings {
    /*
     * The write setting type.
     */
    @Generated
    private String type = "ParquetWriteSettings";

    /*
     * Limit the written file's row count to be smaller than or equal to the specified count. Type: integer (or
     * Expression with resultType integer).
     */
    @Generated
    private Object maxRowsPerFile;

    /*
     * Specifies the file name pattern <fileNamePrefix>_<fileIndex>.<fileExtension> when copy from non-file based store
     * without partitionOptions. Type: string (or Expression with resultType string).
     */
    @Generated
    private Object fileNamePrefix;

    /**
     * Creates an instance of ParquetWriteSettings class.
     */
    @Generated
    public ParquetWriteSettings() {
    }

    /**
     * Get the type property: The write setting type.
     * 
     * @return the type value.
     */
    @Generated
    @Override
    public String getType() {
        return this.type;
    }

    /**
     * Get the maxRowsPerFile property: Limit the written file's row count to be smaller than or equal to the specified
     * count. Type: integer (or Expression with resultType integer).
     * 
     * @return the maxRowsPerFile value.
     */
    @Generated
    public Object getMaxRowsPerFile() {
        return this.maxRowsPerFile;
    }

    /**
     * Set the maxRowsPerFile property: Limit the written file's row count to be smaller than or equal to the specified
     * count. Type: integer (or Expression with resultType integer).
     * 
     * @param maxRowsPerFile the maxRowsPerFile value to set.
     * @return the ParquetWriteSettings object itself.
     */
    @Generated
    public ParquetWriteSettings setMaxRowsPerFile(Object maxRowsPerFile) {
        this.maxRowsPerFile = maxRowsPerFile;
        return this;
    }

    /**
     * Get the fileNamePrefix property: Specifies the file name pattern
     * &lt;fileNamePrefix&gt;_&lt;fileIndex&gt;.&lt;fileExtension&gt; when copy from non-file based store without
     * partitionOptions. Type: string (or Expression with resultType string).
     * 
     * @return the fileNamePrefix value.
     */
    @Generated
    public Object getFileNamePrefix() {
        return this.fileNamePrefix;
    }

    /**
     * Set the fileNamePrefix property: Specifies the file name pattern
     * &lt;fileNamePrefix&gt;_&lt;fileIndex&gt;.&lt;fileExtension&gt; when copy from non-file based store without
     * partitionOptions. Type: string (or Expression with resultType string).
     * 
     * @param fileNamePrefix the fileNamePrefix value to set.
     * @return the ParquetWriteSettings object itself.
     */
    @Generated
    public ParquetWriteSettings setFileNamePrefix(Object fileNamePrefix) {
        this.fileNamePrefix = fileNamePrefix;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("type", this.type);
        if (this.maxRowsPerFile != null) {
            jsonWriter.writeUntypedField("maxRowsPerFile", this.maxRowsPerFile);
        }
        if (this.fileNamePrefix != null) {
            jsonWriter.writeUntypedField("fileNamePrefix", this.fileNamePrefix);
        }
        if (getAdditionalProperties() != null) {
            for (Map.Entry<String, Object> additionalProperty : getAdditionalProperties().entrySet()) {
                jsonWriter.writeUntypedField(additionalProperty.getKey(), additionalProperty.getValue());
            }
        }
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ParquetWriteSettings from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ParquetWriteSettings if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IOException If an error occurs while reading the ParquetWriteSettings.
     */
    @Generated
    public static ParquetWriteSettings fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ParquetWriteSettings deserializedParquetWriteSettings = new ParquetWriteSettings();
            Map<String, Object> additionalProperties = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("type".equals(fieldName)) {
                    deserializedParquetWriteSettings.type = reader.getString();
                } else if ("maxRowsPerFile".equals(fieldName)) {
                    deserializedParquetWriteSettings.maxRowsPerFile = reader.readUntyped();
                } else if ("fileNamePrefix".equals(fieldName)) {
                    deserializedParquetWriteSettings.fileNamePrefix = reader.readUntyped();
                } else {
                    if (additionalProperties == null) {
                        additionalProperties = new LinkedHashMap<>();
                    }

                    additionalProperties.put(fieldName, reader.readUntyped());
                }
            }
            deserializedParquetWriteSettings.setAdditionalProperties(additionalProperties);

            return deserializedParquetWriteSettings;
        });
    }
}
