// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.policyinsights.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.policyinsights.fluent.models.PolicyStateInner;
import java.io.IOException;
import java.util.List;

/**
 * Query results.
 */
@Fluent
public final class PolicyStatesQueryResults implements JsonSerializable<PolicyStatesQueryResults> {
    /*
     * OData context string; used by OData clients to resolve type information based on metadata.
     */
    private String odataContext;

    /*
     * OData entity count; represents the number of policy state records returned.
     */
    private Integer odataCount;

    /*
     * Odata next link; URL to get the next set of results.
     */
    private String odataNextLink;

    /*
     * Query results.
     */
    private List<PolicyStateInner> value;

    /**
     * Creates an instance of PolicyStatesQueryResults class.
     */
    public PolicyStatesQueryResults() {
    }

    /**
     * Get the odataContext property: OData context string; used by OData clients to resolve type information based on
     * metadata.
     * 
     * @return the odataContext value.
     */
    public String odataContext() {
        return this.odataContext;
    }

    /**
     * Set the odataContext property: OData context string; used by OData clients to resolve type information based on
     * metadata.
     * 
     * @param odataContext the odataContext value to set.
     * @return the PolicyStatesQueryResults object itself.
     */
    public PolicyStatesQueryResults withOdataContext(String odataContext) {
        this.odataContext = odataContext;
        return this;
    }

    /**
     * Get the odataCount property: OData entity count; represents the number of policy state records returned.
     * 
     * @return the odataCount value.
     */
    public Integer odataCount() {
        return this.odataCount;
    }

    /**
     * Set the odataCount property: OData entity count; represents the number of policy state records returned.
     * 
     * @param odataCount the odataCount value to set.
     * @return the PolicyStatesQueryResults object itself.
     */
    public PolicyStatesQueryResults withOdataCount(Integer odataCount) {
        this.odataCount = odataCount;
        return this;
    }

    /**
     * Get the odataNextLink property: Odata next link; URL to get the next set of results.
     * 
     * @return the odataNextLink value.
     */
    public String odataNextLink() {
        return this.odataNextLink;
    }

    /**
     * Set the odataNextLink property: Odata next link; URL to get the next set of results.
     * 
     * @param odataNextLink the odataNextLink value to set.
     * @return the PolicyStatesQueryResults object itself.
     */
    public PolicyStatesQueryResults withOdataNextLink(String odataNextLink) {
        this.odataNextLink = odataNextLink;
        return this;
    }

    /**
     * Get the value property: Query results.
     * 
     * @return the value value.
     */
    public List<PolicyStateInner> value() {
        return this.value;
    }

    /**
     * Set the value property: Query results.
     * 
     * @param value the value value to set.
     * @return the PolicyStatesQueryResults object itself.
     */
    public PolicyStatesQueryResults withValue(List<PolicyStateInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() != null) {
            value().forEach(e -> e.validate());
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("@odata.context", this.odataContext);
        jsonWriter.writeNumberField("@odata.count", this.odataCount);
        jsonWriter.writeStringField("@odata.nextLink", this.odataNextLink);
        jsonWriter.writeArrayField("value", this.value, (writer, element) -> writer.writeJson(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of PolicyStatesQueryResults from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of PolicyStatesQueryResults if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the PolicyStatesQueryResults.
     */
    public static PolicyStatesQueryResults fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            PolicyStatesQueryResults deserializedPolicyStatesQueryResults = new PolicyStatesQueryResults();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("@odata.context".equals(fieldName)) {
                    deserializedPolicyStatesQueryResults.odataContext = reader.getString();
                } else if ("@odata.count".equals(fieldName)) {
                    deserializedPolicyStatesQueryResults.odataCount = reader.getNullable(JsonReader::getInt);
                } else if ("@odata.nextLink".equals(fieldName)) {
                    deserializedPolicyStatesQueryResults.odataNextLink = reader.getString();
                } else if ("value".equals(fieldName)) {
                    List<PolicyStateInner> value = reader.readArray(reader1 -> PolicyStateInner.fromJson(reader1));
                    deserializedPolicyStatesQueryResults.value = value;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedPolicyStatesQueryResults;
        });
    }
}
