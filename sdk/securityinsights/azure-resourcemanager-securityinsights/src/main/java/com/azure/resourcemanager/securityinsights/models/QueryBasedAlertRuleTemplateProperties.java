// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.securityinsights.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/**
 * Query based alert rule template base property bag.
 */
@Fluent
public class QueryBasedAlertRuleTemplateProperties implements JsonSerializable<QueryBasedAlertRuleTemplateProperties> {
    /*
     * The query that creates alerts for this rule.
     */
    private String query;

    /*
     * The severity for alerts created by this alert rule.
     */
    private AlertSeverity severity;

    /*
     * The version of this template - in format <a.b.c>, where all are numbers. For example <1.0.2>.
     */
    private String version;

    /*
     * Dictionary of string key-value pairs of columns to be attached to the alert
     */
    private Map<String, String> customDetails;

    /*
     * Array of the entity mappings of the alert rule
     */
    private List<EntityMapping> entityMappings;

    /*
     * The alert details override settings
     */
    private AlertDetailsOverride alertDetailsOverride;

    /*
     * The event grouping settings.
     */
    private EventGroupingSettings eventGroupingSettings;

    /**
     * Creates an instance of QueryBasedAlertRuleTemplateProperties class.
     */
    public QueryBasedAlertRuleTemplateProperties() {
    }

    /**
     * Get the query property: The query that creates alerts for this rule.
     * 
     * @return the query value.
     */
    public String query() {
        return this.query;
    }

    /**
     * Set the query property: The query that creates alerts for this rule.
     * 
     * @param query the query value to set.
     * @return the QueryBasedAlertRuleTemplateProperties object itself.
     */
    public QueryBasedAlertRuleTemplateProperties withQuery(String query) {
        this.query = query;
        return this;
    }

    /**
     * Get the severity property: The severity for alerts created by this alert rule.
     * 
     * @return the severity value.
     */
    public AlertSeverity severity() {
        return this.severity;
    }

    /**
     * Set the severity property: The severity for alerts created by this alert rule.
     * 
     * @param severity the severity value to set.
     * @return the QueryBasedAlertRuleTemplateProperties object itself.
     */
    public QueryBasedAlertRuleTemplateProperties withSeverity(AlertSeverity severity) {
        this.severity = severity;
        return this;
    }

    /**
     * Get the version property: The version of this template - in format &lt;a.b.c&gt;, where all are numbers. For
     * example &lt;1.0.2&gt;.
     * 
     * @return the version value.
     */
    public String version() {
        return this.version;
    }

    /**
     * Set the version property: The version of this template - in format &lt;a.b.c&gt;, where all are numbers. For
     * example &lt;1.0.2&gt;.
     * 
     * @param version the version value to set.
     * @return the QueryBasedAlertRuleTemplateProperties object itself.
     */
    public QueryBasedAlertRuleTemplateProperties withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * Get the customDetails property: Dictionary of string key-value pairs of columns to be attached to the alert.
     * 
     * @return the customDetails value.
     */
    public Map<String, String> customDetails() {
        return this.customDetails;
    }

    /**
     * Set the customDetails property: Dictionary of string key-value pairs of columns to be attached to the alert.
     * 
     * @param customDetails the customDetails value to set.
     * @return the QueryBasedAlertRuleTemplateProperties object itself.
     */
    public QueryBasedAlertRuleTemplateProperties withCustomDetails(Map<String, String> customDetails) {
        this.customDetails = customDetails;
        return this;
    }

    /**
     * Get the entityMappings property: Array of the entity mappings of the alert rule.
     * 
     * @return the entityMappings value.
     */
    public List<EntityMapping> entityMappings() {
        return this.entityMappings;
    }

    /**
     * Set the entityMappings property: Array of the entity mappings of the alert rule.
     * 
     * @param entityMappings the entityMappings value to set.
     * @return the QueryBasedAlertRuleTemplateProperties object itself.
     */
    public QueryBasedAlertRuleTemplateProperties withEntityMappings(List<EntityMapping> entityMappings) {
        this.entityMappings = entityMappings;
        return this;
    }

    /**
     * Get the alertDetailsOverride property: The alert details override settings.
     * 
     * @return the alertDetailsOverride value.
     */
    public AlertDetailsOverride alertDetailsOverride() {
        return this.alertDetailsOverride;
    }

    /**
     * Set the alertDetailsOverride property: The alert details override settings.
     * 
     * @param alertDetailsOverride the alertDetailsOverride value to set.
     * @return the QueryBasedAlertRuleTemplateProperties object itself.
     */
    public QueryBasedAlertRuleTemplateProperties withAlertDetailsOverride(AlertDetailsOverride alertDetailsOverride) {
        this.alertDetailsOverride = alertDetailsOverride;
        return this;
    }

    /**
     * Get the eventGroupingSettings property: The event grouping settings.
     * 
     * @return the eventGroupingSettings value.
     */
    public EventGroupingSettings eventGroupingSettings() {
        return this.eventGroupingSettings;
    }

    /**
     * Set the eventGroupingSettings property: The event grouping settings.
     * 
     * @param eventGroupingSettings the eventGroupingSettings value to set.
     * @return the QueryBasedAlertRuleTemplateProperties object itself.
     */
    public QueryBasedAlertRuleTemplateProperties
        withEventGroupingSettings(EventGroupingSettings eventGroupingSettings) {
        this.eventGroupingSettings = eventGroupingSettings;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (entityMappings() != null) {
            entityMappings().forEach(e -> e.validate());
        }
        if (alertDetailsOverride() != null) {
            alertDetailsOverride().validate();
        }
        if (eventGroupingSettings() != null) {
            eventGroupingSettings().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("query", this.query);
        jsonWriter.writeStringField("severity", this.severity == null ? null : this.severity.toString());
        jsonWriter.writeStringField("version", this.version);
        jsonWriter.writeMapField("customDetails", this.customDetails, (writer, element) -> writer.writeString(element));
        jsonWriter.writeArrayField("entityMappings", this.entityMappings,
            (writer, element) -> writer.writeJson(element));
        jsonWriter.writeJsonField("alertDetailsOverride", this.alertDetailsOverride);
        jsonWriter.writeJsonField("eventGroupingSettings", this.eventGroupingSettings);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of QueryBasedAlertRuleTemplateProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of QueryBasedAlertRuleTemplateProperties if the JsonReader was pointing to an instance of it,
     * or null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the QueryBasedAlertRuleTemplateProperties.
     */
    public static QueryBasedAlertRuleTemplateProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            QueryBasedAlertRuleTemplateProperties deserializedQueryBasedAlertRuleTemplateProperties
                = new QueryBasedAlertRuleTemplateProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("query".equals(fieldName)) {
                    deserializedQueryBasedAlertRuleTemplateProperties.query = reader.getString();
                } else if ("severity".equals(fieldName)) {
                    deserializedQueryBasedAlertRuleTemplateProperties.severity
                        = AlertSeverity.fromString(reader.getString());
                } else if ("version".equals(fieldName)) {
                    deserializedQueryBasedAlertRuleTemplateProperties.version = reader.getString();
                } else if ("customDetails".equals(fieldName)) {
                    Map<String, String> customDetails = reader.readMap(reader1 -> reader1.getString());
                    deserializedQueryBasedAlertRuleTemplateProperties.customDetails = customDetails;
                } else if ("entityMappings".equals(fieldName)) {
                    List<EntityMapping> entityMappings = reader.readArray(reader1 -> EntityMapping.fromJson(reader1));
                    deserializedQueryBasedAlertRuleTemplateProperties.entityMappings = entityMappings;
                } else if ("alertDetailsOverride".equals(fieldName)) {
                    deserializedQueryBasedAlertRuleTemplateProperties.alertDetailsOverride
                        = AlertDetailsOverride.fromJson(reader);
                } else if ("eventGroupingSettings".equals(fieldName)) {
                    deserializedQueryBasedAlertRuleTemplateProperties.eventGroupingSettings
                        = EventGroupingSettings.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedQueryBasedAlertRuleTemplateProperties;
        });
    }
}
