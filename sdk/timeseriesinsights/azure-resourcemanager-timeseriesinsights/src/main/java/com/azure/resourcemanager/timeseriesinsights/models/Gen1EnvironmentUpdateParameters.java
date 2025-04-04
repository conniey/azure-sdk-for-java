// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.timeseriesinsights.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.timeseriesinsights.fluent.models.Gen1EnvironmentMutableProperties;
import java.io.IOException;
import java.time.Duration;
import java.util.Map;

/**
 * Parameters supplied to the Update Environment operation to update a Gen1 environment.
 */
@Fluent
public final class Gen1EnvironmentUpdateParameters extends EnvironmentUpdateParameters {
    /*
     * The kind of the environment.
     */
    private EnvironmentKind kind = EnvironmentKind.GEN1;

    /*
     * The sku of the environment.
     */
    private Sku sku;

    /*
     * Properties of the Gen1 environment.
     */
    private Gen1EnvironmentMutableProperties innerProperties;

    /**
     * Creates an instance of Gen1EnvironmentUpdateParameters class.
     */
    public Gen1EnvironmentUpdateParameters() {
    }

    /**
     * Get the kind property: The kind of the environment.
     * 
     * @return the kind value.
     */
    @Override
    public EnvironmentKind kind() {
        return this.kind;
    }

    /**
     * Get the sku property: The sku of the environment.
     * 
     * @return the sku value.
     */
    public Sku sku() {
        return this.sku;
    }

    /**
     * Set the sku property: The sku of the environment.
     * 
     * @param sku the sku value to set.
     * @return the Gen1EnvironmentUpdateParameters object itself.
     */
    public Gen1EnvironmentUpdateParameters withSku(Sku sku) {
        this.sku = sku;
        return this;
    }

    /**
     * Get the innerProperties property: Properties of the Gen1 environment.
     * 
     * @return the innerProperties value.
     */
    private Gen1EnvironmentMutableProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Gen1EnvironmentUpdateParameters withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Get the dataRetentionTime property: ISO8601 timespan specifying the minimum number of days the environment's
     * events will be available for query.
     * 
     * @return the dataRetentionTime value.
     */
    public Duration dataRetentionTime() {
        return this.innerProperties() == null ? null : this.innerProperties().dataRetentionTime();
    }

    /**
     * Set the dataRetentionTime property: ISO8601 timespan specifying the minimum number of days the environment's
     * events will be available for query.
     * 
     * @param dataRetentionTime the dataRetentionTime value to set.
     * @return the Gen1EnvironmentUpdateParameters object itself.
     */
    public Gen1EnvironmentUpdateParameters withDataRetentionTime(Duration dataRetentionTime) {
        if (this.innerProperties() == null) {
            this.innerProperties = new Gen1EnvironmentMutableProperties();
        }
        this.innerProperties().withDataRetentionTime(dataRetentionTime);
        return this;
    }

    /**
     * Get the storageLimitExceededBehavior property: The behavior the Time Series Insights service should take when the
     * environment's capacity has been exceeded. If "PauseIngress" is specified, new events will not be read from the
     * event source. If "PurgeOldData" is specified, new events will continue to be read and old events will be deleted
     * from the environment. The default behavior is PurgeOldData.
     * 
     * @return the storageLimitExceededBehavior value.
     */
    public StorageLimitExceededBehavior storageLimitExceededBehavior() {
        return this.innerProperties() == null ? null : this.innerProperties().storageLimitExceededBehavior();
    }

    /**
     * Set the storageLimitExceededBehavior property: The behavior the Time Series Insights service should take when the
     * environment's capacity has been exceeded. If "PauseIngress" is specified, new events will not be read from the
     * event source. If "PurgeOldData" is specified, new events will continue to be read and old events will be deleted
     * from the environment. The default behavior is PurgeOldData.
     * 
     * @param storageLimitExceededBehavior the storageLimitExceededBehavior value to set.
     * @return the Gen1EnvironmentUpdateParameters object itself.
     */
    public Gen1EnvironmentUpdateParameters
        withStorageLimitExceededBehavior(StorageLimitExceededBehavior storageLimitExceededBehavior) {
        if (this.innerProperties() == null) {
            this.innerProperties = new Gen1EnvironmentMutableProperties();
        }
        this.innerProperties().withStorageLimitExceededBehavior(storageLimitExceededBehavior);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        if (sku() != null) {
            sku().validate();
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
        jsonWriter.writeMapField("tags", tags(), (writer, element) -> writer.writeString(element));
        jsonWriter.writeStringField("kind", this.kind == null ? null : this.kind.toString());
        jsonWriter.writeJsonField("sku", this.sku);
        jsonWriter.writeJsonField("properties", this.innerProperties);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of Gen1EnvironmentUpdateParameters from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of Gen1EnvironmentUpdateParameters if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the Gen1EnvironmentUpdateParameters.
     */
    public static Gen1EnvironmentUpdateParameters fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            Gen1EnvironmentUpdateParameters deserializedGen1EnvironmentUpdateParameters
                = new Gen1EnvironmentUpdateParameters();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("tags".equals(fieldName)) {
                    Map<String, String> tags = reader.readMap(reader1 -> reader1.getString());
                    deserializedGen1EnvironmentUpdateParameters.withTags(tags);
                } else if ("kind".equals(fieldName)) {
                    deserializedGen1EnvironmentUpdateParameters.kind = EnvironmentKind.fromString(reader.getString());
                } else if ("sku".equals(fieldName)) {
                    deserializedGen1EnvironmentUpdateParameters.sku = Sku.fromJson(reader);
                } else if ("properties".equals(fieldName)) {
                    deserializedGen1EnvironmentUpdateParameters.innerProperties
                        = Gen1EnvironmentMutableProperties.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedGen1EnvironmentUpdateParameters;
        });
    }
}
