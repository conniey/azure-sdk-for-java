// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.developer.loadtesting.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Generated;
import com.azure.core.util.CoreUtils;
import com.azure.developer.loadtesting.implementation.JsonMergePatchHelper;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Test run server metrics configuration.
 */
@Fluent
public final class TestRunServerMetricsConfiguration implements JsonSerializable<TestRunServerMetricsConfiguration> {

    /*
     * Test run identifier
     */
    @Generated
    private String testRunId;

    /*
     * Azure resource metrics collection {metric id : metrics object} (Refer :
     * https://learn.microsoft.com/en-us/rest/api/monitor/metric-definitions/list#metricdefinition
     * for metric id).
     */
    @Generated
    private Map<String, ResourceMetric> metrics;

    /*
     * The creation datetime(RFC 3339 literal format).
     */
    @Generated
    private OffsetDateTime createdDateTime;

    /*
     * The user that created.
     */
    @Generated
    private String createdBy;

    /*
     * The last Modified datetime(RFC 3339 literal format).
     */
    @Generated
    private OffsetDateTime lastModifiedDateTime;

    /*
     * The user that last modified.
     */
    @Generated
    private String lastModifiedBy;

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
        JsonMergePatchHelper.setTestRunServerMetricsConfigurationAccessor(
            new JsonMergePatchHelper.TestRunServerMetricsConfigurationAccessor() {

                @Override
                public TestRunServerMetricsConfiguration prepareModelForJsonMergePatch(
                    TestRunServerMetricsConfiguration model, boolean jsonMergePatchEnabled) {
                    model.serializeAsJsonMergePatch(jsonMergePatchEnabled);
                    return model;
                }

                @Override
                public boolean isJsonMergePatch(TestRunServerMetricsConfiguration model) {
                    return model.jsonMergePatch;
                }
            });
    }

    /**
     * Creates an instance of TestRunServerMetricsConfiguration class.
     */
    @Generated
    public TestRunServerMetricsConfiguration() {
    }

    /**
     * Get the testRunId property: Test run identifier.
     *
     * @return the testRunId value.
     */
    @Generated
    public String getTestRunId() {
        return this.testRunId;
    }

    /**
     * Get the metrics property: Azure resource metrics collection {metric id : metrics object} (Refer :
     * https://learn.microsoft.com/en-us/rest/api/monitor/metric-definitions/list#metricdefinition
     * for metric id).
     *
     * @return the metrics value.
     */
    @Generated
    public Map<String, ResourceMetric> getMetrics() {
        return this.metrics;
    }

    /**
     * Set the metrics property: Azure resource metrics collection {metric id : metrics object} (Refer :
     * https://learn.microsoft.com/en-us/rest/api/monitor/metric-definitions/list#metricdefinition
     * for metric id).
     *
     * @param metrics the metrics value to set.
     * @return the TestRunServerMetricsConfiguration object itself.
     */
    @Generated
    public TestRunServerMetricsConfiguration setMetrics(Map<String, ResourceMetric> metrics) {
        this.metrics = metrics;
        this.updatedProperties.add("metrics");
        return this;
    }

    /**
     * Get the createdDateTime property: The creation datetime(RFC 3339 literal format).
     *
     * @return the createdDateTime value.
     */
    @Generated
    public OffsetDateTime getCreatedDateTime() {
        return this.createdDateTime;
    }

    /**
     * Get the createdBy property: The user that created.
     *
     * @return the createdBy value.
     */
    @Generated
    public String getCreatedBy() {
        return this.createdBy;
    }

    /**
     * Get the lastModifiedDateTime property: The last Modified datetime(RFC 3339 literal format).
     *
     * @return the lastModifiedDateTime value.
     */
    @Generated
    public OffsetDateTime getLastModifiedDateTime() {
        return this.lastModifiedDateTime;
    }

    /**
     * Get the lastModifiedBy property: The user that last modified.
     *
     * @return the lastModifiedBy value.
     */
    @Generated
    public String getLastModifiedBy() {
        return this.lastModifiedBy;
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
            jsonWriter.writeMapField("metrics", this.metrics, (writer, element) -> writer.writeJson(element));
            return jsonWriter.writeEndObject();
        }
    }

    @Generated
    private JsonWriter toJsonMergePatch(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        if (updatedProperties.contains("metrics")) {
            if (this.metrics == null) {
                jsonWriter.writeNullField("metrics");
            } else {
                jsonWriter.writeMapField("metrics", this.metrics, (writer, element) -> {
                    if (element != null) {
                        JsonMergePatchHelper.getResourceMetricAccessor().prepareModelForJsonMergePatch(element, true);
                        writer.writeJson(element);
                        JsonMergePatchHelper.getResourceMetricAccessor().prepareModelForJsonMergePatch(element, false);
                    } else {
                        writer.writeNull();
                    }
                });
            }
        }
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of TestRunServerMetricsConfiguration from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of TestRunServerMetricsConfiguration if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the TestRunServerMetricsConfiguration.
     */
    @Generated
    public static TestRunServerMetricsConfiguration fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            TestRunServerMetricsConfiguration deserializedTestRunServerMetricsConfiguration
                = new TestRunServerMetricsConfiguration();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();
                if ("testRunId".equals(fieldName)) {
                    deserializedTestRunServerMetricsConfiguration.testRunId = reader.getString();
                } else if ("metrics".equals(fieldName)) {
                    Map<String, ResourceMetric> metrics = reader.readMap(reader1 -> ResourceMetric.fromJson(reader1));
                    deserializedTestRunServerMetricsConfiguration.metrics = metrics;
                } else if ("createdDateTime".equals(fieldName)) {
                    deserializedTestRunServerMetricsConfiguration.createdDateTime = reader
                        .getNullable(nonNullReader -> CoreUtils.parseBestOffsetDateTime(nonNullReader.getString()));
                } else if ("createdBy".equals(fieldName)) {
                    deserializedTestRunServerMetricsConfiguration.createdBy = reader.getString();
                } else if ("lastModifiedDateTime".equals(fieldName)) {
                    deserializedTestRunServerMetricsConfiguration.lastModifiedDateTime = reader
                        .getNullable(nonNullReader -> CoreUtils.parseBestOffsetDateTime(nonNullReader.getString()));
                } else if ("lastModifiedBy".equals(fieldName)) {
                    deserializedTestRunServerMetricsConfiguration.lastModifiedBy = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }
            return deserializedTestRunServerMetricsConfiguration;
        });
    }
}
