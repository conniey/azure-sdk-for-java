// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * Recovery plan test failover input properties.
 */
@Fluent
public final class RecoveryPlanTestFailoverInputProperties
    implements JsonSerializable<RecoveryPlanTestFailoverInputProperties> {
    /*
     * The failover direction.
     */
    private PossibleOperationsDirections failoverDirection;

    /*
     * The network type to be used for test failover.
     */
    private String networkType;

    /*
     * The Id of the network to be used for test failover.
     */
    private String networkId;

    /*
     * The provider specific properties.
     */
    private List<RecoveryPlanProviderSpecificFailoverInput> providerSpecificDetails;

    /**
     * Creates an instance of RecoveryPlanTestFailoverInputProperties class.
     */
    public RecoveryPlanTestFailoverInputProperties() {
    }

    /**
     * Get the failoverDirection property: The failover direction.
     * 
     * @return the failoverDirection value.
     */
    public PossibleOperationsDirections failoverDirection() {
        return this.failoverDirection;
    }

    /**
     * Set the failoverDirection property: The failover direction.
     * 
     * @param failoverDirection the failoverDirection value to set.
     * @return the RecoveryPlanTestFailoverInputProperties object itself.
     */
    public RecoveryPlanTestFailoverInputProperties
        withFailoverDirection(PossibleOperationsDirections failoverDirection) {
        this.failoverDirection = failoverDirection;
        return this;
    }

    /**
     * Get the networkType property: The network type to be used for test failover.
     * 
     * @return the networkType value.
     */
    public String networkType() {
        return this.networkType;
    }

    /**
     * Set the networkType property: The network type to be used for test failover.
     * 
     * @param networkType the networkType value to set.
     * @return the RecoveryPlanTestFailoverInputProperties object itself.
     */
    public RecoveryPlanTestFailoverInputProperties withNetworkType(String networkType) {
        this.networkType = networkType;
        return this;
    }

    /**
     * Get the networkId property: The Id of the network to be used for test failover.
     * 
     * @return the networkId value.
     */
    public String networkId() {
        return this.networkId;
    }

    /**
     * Set the networkId property: The Id of the network to be used for test failover.
     * 
     * @param networkId the networkId value to set.
     * @return the RecoveryPlanTestFailoverInputProperties object itself.
     */
    public RecoveryPlanTestFailoverInputProperties withNetworkId(String networkId) {
        this.networkId = networkId;
        return this;
    }

    /**
     * Get the providerSpecificDetails property: The provider specific properties.
     * 
     * @return the providerSpecificDetails value.
     */
    public List<RecoveryPlanProviderSpecificFailoverInput> providerSpecificDetails() {
        return this.providerSpecificDetails;
    }

    /**
     * Set the providerSpecificDetails property: The provider specific properties.
     * 
     * @param providerSpecificDetails the providerSpecificDetails value to set.
     * @return the RecoveryPlanTestFailoverInputProperties object itself.
     */
    public RecoveryPlanTestFailoverInputProperties
        withProviderSpecificDetails(List<RecoveryPlanProviderSpecificFailoverInput> providerSpecificDetails) {
        this.providerSpecificDetails = providerSpecificDetails;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (failoverDirection() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property failoverDirection in model RecoveryPlanTestFailoverInputProperties"));
        }
        if (networkType() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property networkType in model RecoveryPlanTestFailoverInputProperties"));
        }
        if (providerSpecificDetails() != null) {
            providerSpecificDetails().forEach(e -> e.validate());
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(RecoveryPlanTestFailoverInputProperties.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("failoverDirection",
            this.failoverDirection == null ? null : this.failoverDirection.toString());
        jsonWriter.writeStringField("networkType", this.networkType);
        jsonWriter.writeStringField("networkId", this.networkId);
        jsonWriter.writeArrayField("providerSpecificDetails", this.providerSpecificDetails,
            (writer, element) -> writer.writeJson(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of RecoveryPlanTestFailoverInputProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of RecoveryPlanTestFailoverInputProperties if the JsonReader was pointing to an instance of
     * it, or null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the RecoveryPlanTestFailoverInputProperties.
     */
    public static RecoveryPlanTestFailoverInputProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            RecoveryPlanTestFailoverInputProperties deserializedRecoveryPlanTestFailoverInputProperties
                = new RecoveryPlanTestFailoverInputProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("failoverDirection".equals(fieldName)) {
                    deserializedRecoveryPlanTestFailoverInputProperties.failoverDirection
                        = PossibleOperationsDirections.fromString(reader.getString());
                } else if ("networkType".equals(fieldName)) {
                    deserializedRecoveryPlanTestFailoverInputProperties.networkType = reader.getString();
                } else if ("networkId".equals(fieldName)) {
                    deserializedRecoveryPlanTestFailoverInputProperties.networkId = reader.getString();
                } else if ("providerSpecificDetails".equals(fieldName)) {
                    List<RecoveryPlanProviderSpecificFailoverInput> providerSpecificDetails
                        = reader.readArray(reader1 -> RecoveryPlanProviderSpecificFailoverInput.fromJson(reader1));
                    deserializedRecoveryPlanTestFailoverInputProperties.providerSpecificDetails
                        = providerSpecificDetails;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedRecoveryPlanTestFailoverInputProperties;
        });
    }
}
