// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Generated;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Compute properties for data flow activity.
 */
@Fluent
public final class ExecuteDataFlowActivityTypePropertiesCompute
    implements JsonSerializable<ExecuteDataFlowActivityTypePropertiesCompute> {
    /*
     * Compute type of the cluster which will execute data flow job. Possible values include: 'General',
     * 'MemoryOptimized', 'ComputeOptimized'. Type: string (or Expression with resultType string)
     */
    @Generated
    private Object computeType;

    /*
     * Core count of the cluster which will execute data flow job. Supported values are: 8, 16, 32, 48, 80, 144 and 272.
     * Type: integer (or Expression with resultType integer)
     */
    @Generated
    private Object coreCount;

    /**
     * Creates an instance of ExecuteDataFlowActivityTypePropertiesCompute class.
     */
    @Generated
    public ExecuteDataFlowActivityTypePropertiesCompute() {
    }

    /**
     * Get the computeType property: Compute type of the cluster which will execute data flow job. Possible values
     * include: 'General', 'MemoryOptimized', 'ComputeOptimized'. Type: string (or Expression with resultType string).
     * 
     * @return the computeType value.
     */
    @Generated
    public Object getComputeType() {
        return this.computeType;
    }

    /**
     * Set the computeType property: Compute type of the cluster which will execute data flow job. Possible values
     * include: 'General', 'MemoryOptimized', 'ComputeOptimized'. Type: string (or Expression with resultType string).
     * 
     * @param computeType the computeType value to set.
     * @return the ExecuteDataFlowActivityTypePropertiesCompute object itself.
     */
    @Generated
    public ExecuteDataFlowActivityTypePropertiesCompute setComputeType(Object computeType) {
        this.computeType = computeType;
        return this;
    }

    /**
     * Get the coreCount property: Core count of the cluster which will execute data flow job. Supported values are: 8,
     * 16, 32, 48, 80, 144 and 272. Type: integer (or Expression with resultType integer).
     * 
     * @return the coreCount value.
     */
    @Generated
    public Object getCoreCount() {
        return this.coreCount;
    }

    /**
     * Set the coreCount property: Core count of the cluster which will execute data flow job. Supported values are: 8,
     * 16, 32, 48, 80, 144 and 272. Type: integer (or Expression with resultType integer).
     * 
     * @param coreCount the coreCount value to set.
     * @return the ExecuteDataFlowActivityTypePropertiesCompute object itself.
     */
    @Generated
    public ExecuteDataFlowActivityTypePropertiesCompute setCoreCount(Object coreCount) {
        this.coreCount = coreCount;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        if (this.computeType != null) {
            jsonWriter.writeUntypedField("computeType", this.computeType);
        }
        if (this.coreCount != null) {
            jsonWriter.writeUntypedField("coreCount", this.coreCount);
        }
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ExecuteDataFlowActivityTypePropertiesCompute from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ExecuteDataFlowActivityTypePropertiesCompute if the JsonReader was pointing to an instance
     * of it, or null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the ExecuteDataFlowActivityTypePropertiesCompute.
     */
    @Generated
    public static ExecuteDataFlowActivityTypePropertiesCompute fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ExecuteDataFlowActivityTypePropertiesCompute deserializedExecuteDataFlowActivityTypePropertiesCompute
                = new ExecuteDataFlowActivityTypePropertiesCompute();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("computeType".equals(fieldName)) {
                    deserializedExecuteDataFlowActivityTypePropertiesCompute.computeType = reader.readUntyped();
                } else if ("coreCount".equals(fieldName)) {
                    deserializedExecuteDataFlowActivityTypePropertiesCompute.coreCount = reader.readUntyped();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedExecuteDataFlowActivityTypePropertiesCompute;
        });
    }
}
