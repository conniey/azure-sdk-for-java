// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.billing.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * The principal of the request reviewer. Will only be set if request is approved.
 */
@Fluent
public final class BillingRequestPropertiesReviewedBy extends Principal {
    /**
     * Creates an instance of BillingRequestPropertiesReviewedBy class.
     */
    public BillingRequestPropertiesReviewedBy() {
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BillingRequestPropertiesReviewedBy withTenantId(String tenantId) {
        super.withTenantId(tenantId);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BillingRequestPropertiesReviewedBy withObjectId(String objectId) {
        super.withObjectId(objectId);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BillingRequestPropertiesReviewedBy withUpn(String upn) {
        super.withUpn(upn);
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
        jsonWriter.writeStringField("tenantId", tenantId());
        jsonWriter.writeStringField("objectId", objectId());
        jsonWriter.writeStringField("upn", upn());
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of BillingRequestPropertiesReviewedBy from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of BillingRequestPropertiesReviewedBy if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the BillingRequestPropertiesReviewedBy.
     */
    public static BillingRequestPropertiesReviewedBy fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            BillingRequestPropertiesReviewedBy deserializedBillingRequestPropertiesReviewedBy
                = new BillingRequestPropertiesReviewedBy();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("tenantId".equals(fieldName)) {
                    deserializedBillingRequestPropertiesReviewedBy.withTenantId(reader.getString());
                } else if ("objectId".equals(fieldName)) {
                    deserializedBillingRequestPropertiesReviewedBy.withObjectId(reader.getString());
                } else if ("upn".equals(fieldName)) {
                    deserializedBillingRequestPropertiesReviewedBy.withUpn(reader.getString());
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedBillingRequestPropertiesReviewedBy;
        });
    }
}
