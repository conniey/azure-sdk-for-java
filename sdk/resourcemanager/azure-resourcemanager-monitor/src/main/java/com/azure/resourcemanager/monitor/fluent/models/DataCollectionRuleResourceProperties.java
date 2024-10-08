// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.monitor.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.monitor.models.DataCollectionRule;
import com.azure.resourcemanager.monitor.models.DataCollectionRuleDataSources;
import com.azure.resourcemanager.monitor.models.DataCollectionRuleDestinations;
import com.azure.resourcemanager.monitor.models.DataCollectionRuleMetadata;
import com.azure.resourcemanager.monitor.models.DataFlow;
import com.azure.resourcemanager.monitor.models.KnownDataCollectionRuleProvisioningState;
import com.azure.resourcemanager.monitor.models.StreamDeclaration;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/**
 * Resource properties.
 */
@Fluent
public final class DataCollectionRuleResourceProperties extends DataCollectionRule {
    /*
     * The immutable ID of this data collection rule. This property is READ-ONLY.
     */
    private String immutableId;

    /*
     * Metadata about the resource
     */
    private DataCollectionRuleMetadata metadata;

    /*
     * The resource provisioning state.
     */
    private KnownDataCollectionRuleProvisioningState provisioningState;

    /**
     * Creates an instance of DataCollectionRuleResourceProperties class.
     */
    public DataCollectionRuleResourceProperties() {
    }

    /**
     * Get the immutableId property: The immutable ID of this data collection rule. This property is READ-ONLY.
     * 
     * @return the immutableId value.
     */
    @Override
    public String immutableId() {
        return this.immutableId;
    }

    /**
     * Get the metadata property: Metadata about the resource.
     * 
     * @return the metadata value.
     */
    @Override
    public DataCollectionRuleMetadata metadata() {
        return this.metadata;
    }

    /**
     * Get the provisioningState property: The resource provisioning state.
     * 
     * @return the provisioningState value.
     */
    @Override
    public KnownDataCollectionRuleProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DataCollectionRuleResourceProperties withDescription(String description) {
        super.withDescription(description);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DataCollectionRuleResourceProperties withDataCollectionEndpointId(String dataCollectionEndpointId) {
        super.withDataCollectionEndpointId(dataCollectionEndpointId);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DataCollectionRuleResourceProperties
        withStreamDeclarations(Map<String, StreamDeclaration> streamDeclarations) {
        super.withStreamDeclarations(streamDeclarations);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DataCollectionRuleResourceProperties withDataSources(DataCollectionRuleDataSources dataSources) {
        super.withDataSources(dataSources);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DataCollectionRuleResourceProperties withDestinations(DataCollectionRuleDestinations destinations) {
        super.withDestinations(destinations);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DataCollectionRuleResourceProperties withDataFlows(List<DataFlow> dataFlows) {
        super.withDataFlows(dataFlows);
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
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("description", description());
        jsonWriter.writeStringField("dataCollectionEndpointId", dataCollectionEndpointId());
        jsonWriter.writeMapField("streamDeclarations", streamDeclarations(),
            (writer, element) -> writer.writeJson(element));
        jsonWriter.writeJsonField("dataSources", dataSources());
        jsonWriter.writeJsonField("destinations", destinations());
        jsonWriter.writeArrayField("dataFlows", dataFlows(), (writer, element) -> writer.writeJson(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of DataCollectionRuleResourceProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of DataCollectionRuleResourceProperties if the JsonReader was pointing to an instance of it,
     * or null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the DataCollectionRuleResourceProperties.
     */
    public static DataCollectionRuleResourceProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            DataCollectionRuleResourceProperties deserializedDataCollectionRuleResourceProperties
                = new DataCollectionRuleResourceProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("description".equals(fieldName)) {
                    deserializedDataCollectionRuleResourceProperties.withDescription(reader.getString());
                } else if ("immutableId".equals(fieldName)) {
                    deserializedDataCollectionRuleResourceProperties.immutableId = reader.getString();
                } else if ("dataCollectionEndpointId".equals(fieldName)) {
                    deserializedDataCollectionRuleResourceProperties.withDataCollectionEndpointId(reader.getString());
                } else if ("metadata".equals(fieldName)) {
                    deserializedDataCollectionRuleResourceProperties.metadata
                        = DataCollectionRuleMetadata.fromJson(reader);
                } else if ("streamDeclarations".equals(fieldName)) {
                    Map<String, StreamDeclaration> streamDeclarations
                        = reader.readMap(reader1 -> StreamDeclaration.fromJson(reader1));
                    deserializedDataCollectionRuleResourceProperties.withStreamDeclarations(streamDeclarations);
                } else if ("dataSources".equals(fieldName)) {
                    deserializedDataCollectionRuleResourceProperties
                        .withDataSources(DataCollectionRuleDataSources.fromJson(reader));
                } else if ("destinations".equals(fieldName)) {
                    deserializedDataCollectionRuleResourceProperties
                        .withDestinations(DataCollectionRuleDestinations.fromJson(reader));
                } else if ("dataFlows".equals(fieldName)) {
                    List<DataFlow> dataFlows = reader.readArray(reader1 -> DataFlow.fromJson(reader1));
                    deserializedDataCollectionRuleResourceProperties.withDataFlows(dataFlows);
                } else if ("provisioningState".equals(fieldName)) {
                    deserializedDataCollectionRuleResourceProperties.provisioningState
                        = KnownDataCollectionRuleProvisioningState.fromString(reader.getString());
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedDataCollectionRuleResourceProperties;
        });
    }
}
