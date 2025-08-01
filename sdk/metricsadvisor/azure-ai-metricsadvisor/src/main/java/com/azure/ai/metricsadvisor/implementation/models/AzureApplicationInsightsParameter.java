// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.metricsadvisor.implementation.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Generated;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * The AzureApplicationInsightsParameter model.
 */
@Fluent
public final class AzureApplicationInsightsParameter implements JsonSerializable<AzureApplicationInsightsParameter> {
    /*
     * The Azure cloud that this Azure Application Insights in
     */
    @Generated
    private String azureCloud;

    /*
     * The application id of this Azure Application Insights
     */
    @Generated
    private String applicationId;

    /*
     * The API Key that can access this Azure Application Insights
     */
    @Generated
    private String apiKey;

    /*
     * The statement to query this Azure Application Insights
     */
    @Generated
    private String query;

    /**
     * Creates an instance of AzureApplicationInsightsParameter class.
     */
    @Generated
    public AzureApplicationInsightsParameter() {
    }

    /**
     * Get the azureCloud property: The Azure cloud that this Azure Application Insights in.
     * 
     * @return the azureCloud value.
     */
    @Generated
    public String getAzureCloud() {
        return this.azureCloud;
    }

    /**
     * Set the azureCloud property: The Azure cloud that this Azure Application Insights in.
     * 
     * @param azureCloud the azureCloud value to set.
     * @return the AzureApplicationInsightsParameter object itself.
     */
    @Generated
    public AzureApplicationInsightsParameter setAzureCloud(String azureCloud) {
        this.azureCloud = azureCloud;
        return this;
    }

    /**
     * Get the applicationId property: The application id of this Azure Application Insights.
     * 
     * @return the applicationId value.
     */
    @Generated
    public String getApplicationId() {
        return this.applicationId;
    }

    /**
     * Set the applicationId property: The application id of this Azure Application Insights.
     * 
     * @param applicationId the applicationId value to set.
     * @return the AzureApplicationInsightsParameter object itself.
     */
    @Generated
    public AzureApplicationInsightsParameter setApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }

    /**
     * Get the apiKey property: The API Key that can access this Azure Application Insights.
     * 
     * @return the apiKey value.
     */
    @Generated
    public String getApiKey() {
        return this.apiKey;
    }

    /**
     * Set the apiKey property: The API Key that can access this Azure Application Insights.
     * 
     * @param apiKey the apiKey value to set.
     * @return the AzureApplicationInsightsParameter object itself.
     */
    @Generated
    public AzureApplicationInsightsParameter setApiKey(String apiKey) {
        this.apiKey = apiKey;
        return this;
    }

    /**
     * Get the query property: The statement to query this Azure Application Insights.
     * 
     * @return the query value.
     */
    @Generated
    public String getQuery() {
        return this.query;
    }

    /**
     * Set the query property: The statement to query this Azure Application Insights.
     * 
     * @param query the query value to set.
     * @return the AzureApplicationInsightsParameter object itself.
     */
    @Generated
    public AzureApplicationInsightsParameter setQuery(String query) {
        this.query = query;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("query", this.query);
        jsonWriter.writeStringField("azureCloud", this.azureCloud);
        jsonWriter.writeStringField("applicationId", this.applicationId);
        jsonWriter.writeStringField("apiKey", this.apiKey);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of AzureApplicationInsightsParameter from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of AzureApplicationInsightsParameter if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the AzureApplicationInsightsParameter.
     */
    @Generated
    public static AzureApplicationInsightsParameter fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            AzureApplicationInsightsParameter deserializedAzureApplicationInsightsParameter
                = new AzureApplicationInsightsParameter();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("query".equals(fieldName)) {
                    deserializedAzureApplicationInsightsParameter.query = reader.getString();
                } else if ("azureCloud".equals(fieldName)) {
                    deserializedAzureApplicationInsightsParameter.azureCloud = reader.getString();
                } else if ("applicationId".equals(fieldName)) {
                    deserializedAzureApplicationInsightsParameter.applicationId = reader.getString();
                } else if ("apiKey".equals(fieldName)) {
                    deserializedAzureApplicationInsightsParameter.apiKey = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedAzureApplicationInsightsParameter;
        });
    }
}
