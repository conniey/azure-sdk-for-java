// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Monitor serverless spark compute definition.
 */
@Fluent
public final class MonitorServerlessSparkCompute extends MonitorComputeConfigurationBase {
    /*
     * [Required] Specifies the type of signal to monitor.
     */
    private MonitorComputeType computeType = MonitorComputeType.SERVERLESS_SPARK;

    /*
     * [Required] The identity scheme leveraged to by the spark jobs running on serverless Spark.
     */
    private MonitorComputeIdentityBase computeIdentity;

    /*
     * [Required] The instance type running the Spark job.
     */
    private String instanceType;

    /*
     * [Required] The Spark runtime version.
     */
    private String runtimeVersion;

    /**
     * Creates an instance of MonitorServerlessSparkCompute class.
     */
    public MonitorServerlessSparkCompute() {
    }

    /**
     * Get the computeType property: [Required] Specifies the type of signal to monitor.
     * 
     * @return the computeType value.
     */
    @Override
    public MonitorComputeType computeType() {
        return this.computeType;
    }

    /**
     * Get the computeIdentity property: [Required] The identity scheme leveraged to by the spark jobs running on
     * serverless Spark.
     * 
     * @return the computeIdentity value.
     */
    public MonitorComputeIdentityBase computeIdentity() {
        return this.computeIdentity;
    }

    /**
     * Set the computeIdentity property: [Required] The identity scheme leveraged to by the spark jobs running on
     * serverless Spark.
     * 
     * @param computeIdentity the computeIdentity value to set.
     * @return the MonitorServerlessSparkCompute object itself.
     */
    public MonitorServerlessSparkCompute withComputeIdentity(MonitorComputeIdentityBase computeIdentity) {
        this.computeIdentity = computeIdentity;
        return this;
    }

    /**
     * Get the instanceType property: [Required] The instance type running the Spark job.
     * 
     * @return the instanceType value.
     */
    public String instanceType() {
        return this.instanceType;
    }

    /**
     * Set the instanceType property: [Required] The instance type running the Spark job.
     * 
     * @param instanceType the instanceType value to set.
     * @return the MonitorServerlessSparkCompute object itself.
     */
    public MonitorServerlessSparkCompute withInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }

    /**
     * Get the runtimeVersion property: [Required] The Spark runtime version.
     * 
     * @return the runtimeVersion value.
     */
    public String runtimeVersion() {
        return this.runtimeVersion;
    }

    /**
     * Set the runtimeVersion property: [Required] The Spark runtime version.
     * 
     * @param runtimeVersion the runtimeVersion value to set.
     * @return the MonitorServerlessSparkCompute object itself.
     */
    public MonitorServerlessSparkCompute withRuntimeVersion(String runtimeVersion) {
        this.runtimeVersion = runtimeVersion;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (computeIdentity() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property computeIdentity in model MonitorServerlessSparkCompute"));
        } else {
            computeIdentity().validate();
        }
        if (instanceType() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property instanceType in model MonitorServerlessSparkCompute"));
        }
        if (runtimeVersion() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property runtimeVersion in model MonitorServerlessSparkCompute"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(MonitorServerlessSparkCompute.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeJsonField("computeIdentity", this.computeIdentity);
        jsonWriter.writeStringField("instanceType", this.instanceType);
        jsonWriter.writeStringField("runtimeVersion", this.runtimeVersion);
        jsonWriter.writeStringField("computeType", this.computeType == null ? null : this.computeType.toString());
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of MonitorServerlessSparkCompute from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of MonitorServerlessSparkCompute if the JsonReader was pointing to an instance of it, or null
     * if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the MonitorServerlessSparkCompute.
     */
    public static MonitorServerlessSparkCompute fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            MonitorServerlessSparkCompute deserializedMonitorServerlessSparkCompute
                = new MonitorServerlessSparkCompute();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("computeIdentity".equals(fieldName)) {
                    deserializedMonitorServerlessSparkCompute.computeIdentity
                        = MonitorComputeIdentityBase.fromJson(reader);
                } else if ("instanceType".equals(fieldName)) {
                    deserializedMonitorServerlessSparkCompute.instanceType = reader.getString();
                } else if ("runtimeVersion".equals(fieldName)) {
                    deserializedMonitorServerlessSparkCompute.runtimeVersion = reader.getString();
                } else if ("computeType".equals(fieldName)) {
                    deserializedMonitorServerlessSparkCompute.computeType
                        = MonitorComputeType.fromString(reader.getString());
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedMonitorServerlessSparkCompute;
        });
    }
}
