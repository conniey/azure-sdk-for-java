// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.developer.loadtesting.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Generated;
import com.azure.developer.loadtesting.implementation.JsonMergePatchHelper;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

/**
 * Pass fail metric.
 */
@Fluent
public final class PassFailMetric implements JsonSerializable<PassFailMetric> {

    /*
     * The client metric on which the criteria should be applied.
     */
    @Generated
    private PfMetrics clientMetric;

    /*
     * The aggregation function to be applied on the client metric. Allowed functions
     * - ‘percentage’ - for error metric , ‘avg’, percentiles like ‘p50’, ‘p90’, & so on, ‘min’,
     * ‘max’ - for response_time_ms and latency metric, ‘avg’ - for requests_per_sec,
     * ‘count’ - for requests
     */
    @Generated
    private PassFailAggregationFunction aggregate;

    /*
     * The comparison operator. Supported types ‘>’, ‘<’
     */
    @Generated
    private String condition;

    /*
     * Request name for which the Pass fail criteria has to be applied
     */
    @Generated
    private String requestName;

    /*
     * The value to compare with the client metric. Allowed values - ‘error : [0.0 ,
     * 100.0] unit- % ’, response_time_ms and latency : any integer value unit- ms.
     */
    @Generated
    private Double value;

    /*
     * Action taken after the threshold is met. Default is ‘continue’.
     */
    @Generated
    private PassFailAction action;

    /*
     * The actual value of the client metric for the test run.
     */
    @Generated
    private Double actualValue;

    /*
     * Outcome of the test run.
     */
    @Generated
    private PassFailResult result;

    /**
     * Stores updated model property, the value is property name, not serialized name.
     */
    @Generated
    private final Set<String> updatedProperties = new HashSet<>();

    @Generated
    private boolean jsonMergePatch;

    @Generated
    private void serializeAsJsonMergePatch(boolean jsonMergePatch) {
        this.jsonMergePatch = jsonMergePatch;
    }

    static {
        JsonMergePatchHelper.setPassFailMetricAccessor(new JsonMergePatchHelper.PassFailMetricAccessor() {

            @Override
            public PassFailMetric prepareModelForJsonMergePatch(PassFailMetric model, boolean jsonMergePatchEnabled) {
                model.serializeAsJsonMergePatch(jsonMergePatchEnabled);
                return model;
            }

            @Override
            public boolean isJsonMergePatch(PassFailMetric model) {
                return model.jsonMergePatch;
            }
        });
    }

    /**
     * Creates an instance of PassFailMetric class.
     */
    @Generated
    public PassFailMetric() {
    }

    /**
     * Get the clientMetric property: The client metric on which the criteria should be applied.
     *
     * @return the clientMetric value.
     */
    @Generated
    public PfMetrics getClientMetric() {
        return this.clientMetric;
    }

    /**
     * Get the aggregate property: The aggregation function to be applied on the client metric. Allowed functions
     * - ‘percentage’ - for error metric , ‘avg’, percentiles like ‘p50’, ‘p90’, &amp; so on, ‘min’,
     * ‘max’ - for response_time_ms and latency metric, ‘avg’ - for requests_per_sec,
     * ‘count’ - for requests.
     *
     * @return the aggregate value.
     */
    @Generated
    public PassFailAggregationFunction getAggregate() {
        return this.aggregate;
    }

    /**
     * Get the condition property: The comparison operator. Supported types ‘&gt;’, ‘&lt;’.
     *
     * @return the condition value.
     */
    @Generated
    public String getCondition() {
        return this.condition;
    }

    /**
     * Set the condition property: The comparison operator. Supported types ‘&gt;’, ‘&lt;’.
     *
     * @param condition the condition value to set.
     * @return the PassFailMetric object itself.
     */
    @Generated
    public PassFailMetric setCondition(String condition) {
        this.condition = condition;
        this.updatedProperties.add("condition");
        return this;
    }

    /**
     * Get the requestName property: Request name for which the Pass fail criteria has to be applied.
     *
     * @return the requestName value.
     */
    @Generated
    public String getRequestName() {
        return this.requestName;
    }

    /**
     * Set the requestName property: Request name for which the Pass fail criteria has to be applied.
     *
     * @param requestName the requestName value to set.
     * @return the PassFailMetric object itself.
     */
    @Generated
    public PassFailMetric setRequestName(String requestName) {
        this.requestName = requestName;
        this.updatedProperties.add("requestName");
        return this;
    }

    /**
     * Get the value property: The value to compare with the client metric. Allowed values - ‘error : [0.0 ,
     * 100.0] unit- % ’, response_time_ms and latency : any integer value unit- ms.
     *
     * @return the value value.
     */
    @Generated
    public Double getValue() {
        return this.value;
    }

    /**
     * Set the value property: The value to compare with the client metric. Allowed values - ‘error : [0.0 ,
     * 100.0] unit- % ’, response_time_ms and latency : any integer value unit- ms.
     *
     * @param value the value value to set.
     * @return the PassFailMetric object itself.
     */
    @Generated
    public PassFailMetric setValue(Double value) {
        this.value = value;
        this.updatedProperties.add("value");
        return this;
    }

    /**
     * Get the action property: Action taken after the threshold is met. Default is ‘continue’.
     *
     * @return the action value.
     */
    @Generated
    public PassFailAction getAction() {
        return this.action;
    }

    /**
     * Get the actualValue property: The actual value of the client metric for the test run.
     *
     * @return the actualValue value.
     */
    @Generated
    public Double getActualValue() {
        return this.actualValue;
    }

    /**
     * Get the result property: Outcome of the test run.
     *
     * @return the result value.
     */
    @Generated
    public PassFailResult getResult() {
        return this.result;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        if (jsonMergePatch) {
            return toJsonMergePatch(jsonWriter);
        } else {
            jsonWriter.writeStartObject();
            jsonWriter.writeStringField("clientMetric",
                this.clientMetric == null ? null : this.clientMetric.toString());
            jsonWriter.writeStringField("aggregate", this.aggregate == null ? null : this.aggregate.toString());
            jsonWriter.writeStringField("condition", this.condition);
            jsonWriter.writeStringField("requestName", this.requestName);
            jsonWriter.writeNumberField("value", this.value);
            jsonWriter.writeStringField("action", this.action == null ? null : this.action.toString());
            return jsonWriter.writeEndObject();
        }
    }

    @Generated
    private JsonWriter toJsonMergePatch(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        if (updatedProperties.contains("clientMetric")) {
            if (this.clientMetric == null) {
                jsonWriter.writeNullField("clientMetric");
            } else {
                jsonWriter.writeStringField("clientMetric", this.clientMetric.toString());
            }
        }
        if (updatedProperties.contains("aggregate")) {
            if (this.aggregate == null) {
                jsonWriter.writeNullField("aggregate");
            } else {
                jsonWriter.writeStringField("aggregate", this.aggregate.toString());
            }
        }
        if (updatedProperties.contains("condition")) {
            if (this.condition == null) {
                jsonWriter.writeNullField("condition");
            } else {
                jsonWriter.writeStringField("condition", this.condition);
            }
        }
        if (updatedProperties.contains("requestName")) {
            if (this.requestName == null) {
                jsonWriter.writeNullField("requestName");
            } else {
                jsonWriter.writeStringField("requestName", this.requestName);
            }
        }
        if (updatedProperties.contains("value")) {
            if (this.value == null) {
                jsonWriter.writeNullField("value");
            } else {
                jsonWriter.writeNumberField("value", this.value);
            }
        }
        if (updatedProperties.contains("action")) {
            if (this.action == null) {
                jsonWriter.writeNullField("action");
            } else {
                jsonWriter.writeStringField("action", this.action.toString());
            }
        }
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of PassFailMetric from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of PassFailMetric if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the PassFailMetric.
     */
    @Generated
    public static PassFailMetric fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            PassFailMetric deserializedPassFailMetric = new PassFailMetric();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();
                if ("clientMetric".equals(fieldName)) {
                    deserializedPassFailMetric.clientMetric = PfMetrics.fromString(reader.getString());
                } else if ("aggregate".equals(fieldName)) {
                    deserializedPassFailMetric.aggregate = PassFailAggregationFunction.fromString(reader.getString());
                } else if ("condition".equals(fieldName)) {
                    deserializedPassFailMetric.condition = reader.getString();
                } else if ("requestName".equals(fieldName)) {
                    deserializedPassFailMetric.requestName = reader.getString();
                } else if ("value".equals(fieldName)) {
                    deserializedPassFailMetric.value = reader.getNullable(JsonReader::getDouble);
                } else if ("action".equals(fieldName)) {
                    deserializedPassFailMetric.action = PassFailAction.fromString(reader.getString());
                } else if ("actualValue".equals(fieldName)) {
                    deserializedPassFailMetric.actualValue = reader.getNullable(JsonReader::getDouble);
                } else if ("result".equals(fieldName)) {
                    deserializedPassFailMetric.result = PassFailResult.fromString(reader.getString());
                } else {
                    reader.skipChildren();
                }
            }
            return deserializedPassFailMetric;
        });
    }

    /**
     * Set the aggregate property: The aggregation function to be applied on the client metric. Allowed functions
     * - ‘percentage’ - for error metric , ‘avg’, percentiles like ‘p50’, ‘p90’, &amp; so on, ‘min’,
     * ‘max’ - for response_time_ms and latency metric, ‘avg’ - for requests_per_sec,
     * ‘count’ - for requests.
     *
     * @param aggregate the aggregate value to set.
     * @return the PassFailMetric object itself.
     */
    @Generated
    public PassFailMetric setAggregate(PassFailAggregationFunction aggregate) {
        this.aggregate = aggregate;
        this.updatedProperties.add("aggregate");
        return this;
    }

    /**
     * Set the action property: Action taken after the threshold is met. Default is ‘continue’.
     *
     * @param action the action value to set.
     * @return the PassFailMetric object itself.
     */
    @Generated
    public PassFailMetric setAction(PassFailAction action) {
        this.action = action;
        this.updatedProperties.add("action");
        return this;
    }

    /**
     * Set the clientMetric property: The client metric on which the criteria should be applied.
     *
     * @param clientMetric the clientMetric value to set.
     * @return the PassFailMetric object itself.
     */
    @Generated
    public PassFailMetric setClientMetric(PfMetrics clientMetric) {
        this.clientMetric = clientMetric;
        this.updatedProperties.add("clientMetric");
        return this;
    }
}
