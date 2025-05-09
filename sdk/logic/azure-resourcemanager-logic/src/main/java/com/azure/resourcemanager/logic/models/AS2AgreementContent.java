// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.logic.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * The integration account AS2 agreement content.
 */
@Fluent
public final class AS2AgreementContent implements JsonSerializable<AS2AgreementContent> {
    /*
     * The AS2 one-way receive agreement.
     */
    private AS2OneWayAgreement receiveAgreement;

    /*
     * The AS2 one-way send agreement.
     */
    private AS2OneWayAgreement sendAgreement;

    /**
     * Creates an instance of AS2AgreementContent class.
     */
    public AS2AgreementContent() {
    }

    /**
     * Get the receiveAgreement property: The AS2 one-way receive agreement.
     * 
     * @return the receiveAgreement value.
     */
    public AS2OneWayAgreement receiveAgreement() {
        return this.receiveAgreement;
    }

    /**
     * Set the receiveAgreement property: The AS2 one-way receive agreement.
     * 
     * @param receiveAgreement the receiveAgreement value to set.
     * @return the AS2AgreementContent object itself.
     */
    public AS2AgreementContent withReceiveAgreement(AS2OneWayAgreement receiveAgreement) {
        this.receiveAgreement = receiveAgreement;
        return this;
    }

    /**
     * Get the sendAgreement property: The AS2 one-way send agreement.
     * 
     * @return the sendAgreement value.
     */
    public AS2OneWayAgreement sendAgreement() {
        return this.sendAgreement;
    }

    /**
     * Set the sendAgreement property: The AS2 one-way send agreement.
     * 
     * @param sendAgreement the sendAgreement value to set.
     * @return the AS2AgreementContent object itself.
     */
    public AS2AgreementContent withSendAgreement(AS2OneWayAgreement sendAgreement) {
        this.sendAgreement = sendAgreement;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (receiveAgreement() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property receiveAgreement in model AS2AgreementContent"));
        } else {
            receiveAgreement().validate();
        }
        if (sendAgreement() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property sendAgreement in model AS2AgreementContent"));
        } else {
            sendAgreement().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(AS2AgreementContent.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeJsonField("receiveAgreement", this.receiveAgreement);
        jsonWriter.writeJsonField("sendAgreement", this.sendAgreement);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of AS2AgreementContent from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of AS2AgreementContent if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the AS2AgreementContent.
     */
    public static AS2AgreementContent fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            AS2AgreementContent deserializedAS2AgreementContent = new AS2AgreementContent();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("receiveAgreement".equals(fieldName)) {
                    deserializedAS2AgreementContent.receiveAgreement = AS2OneWayAgreement.fromJson(reader);
                } else if ("sendAgreement".equals(fieldName)) {
                    deserializedAS2AgreementContent.sendAgreement = AS2OneWayAgreement.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedAS2AgreementContent;
        });
    }
}
