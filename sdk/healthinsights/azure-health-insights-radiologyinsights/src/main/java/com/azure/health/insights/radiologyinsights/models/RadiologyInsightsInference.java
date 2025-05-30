// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.health.insights.radiologyinsights.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * An inference made by the Radiology Insights model regarding a patient.
 * - AgeMismatch
 * - SexMismatch
 * - LateralityDiscrepancy
 * - CompleteOrderDiscrepancy
 * - LimitedOrderDiscrepancy
 * - Finding
 * - CriticalResult
 * - FollowupRecommendation
 * - RadiologyProcedure
 * - FollowupCommunication.
 */
@Immutable
public class RadiologyInsightsInference implements JsonSerializable<RadiologyInsightsInference> {

    /*
     * Discriminator property for RadiologyInsightsInference.
     */
    @Generated
    private RadiologyInsightsInferenceType kind
        = RadiologyInsightsInferenceType.fromString("RadiologyInsightsInference");

    /*
     * Additional Content defined by implementations
     */
    @Generated
    private List<FhirR4Extension> extension;

    /**
     * Creates an instance of RadiologyInsightsInference class.
     */
    @Generated
    protected RadiologyInsightsInference() {
    }

    /**
     * Get the kind property: Discriminator property for RadiologyInsightsInference.
     *
     * @return the kind value.
     */
    @Generated
    public RadiologyInsightsInferenceType getKind() {
        return this.kind;
    }

    /**
     * Get the extension property: Additional Content defined by implementations.
     *
     * @return the extension value.
     */
    @Generated
    public List<FhirR4Extension> getExtension() {
        return this.extension;
    }

    /**
     * Set the extension property: Additional Content defined by implementations.
     *
     * @param extension the extension value to set.
     * @return the RadiologyInsightsInference object itself.
     */
    @Generated
    RadiologyInsightsInference setExtension(List<FhirR4Extension> extension) {
        this.extension = extension;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("kind", this.kind == null ? null : this.kind.toString());
        jsonWriter.writeArrayField("extension", this.extension, (writer, element) -> writer.writeJson(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of RadiologyInsightsInference from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of RadiologyInsightsInference if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the RadiologyInsightsInference.
     */
    @Generated
    public static RadiologyInsightsInference fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            String discriminatorValue = null;
            try (JsonReader readerToUse = reader.bufferObject()) {
                // Prepare for reading
                readerToUse.nextToken();
                while (readerToUse.nextToken() != JsonToken.END_OBJECT) {
                    String fieldName = readerToUse.getFieldName();
                    readerToUse.nextToken();
                    if ("kind".equals(fieldName)) {
                        discriminatorValue = readerToUse.getString();
                        break;
                    } else {
                        readerToUse.skipChildren();
                    }
                }
                // Use the discriminator value to determine which subtype should be deserialized.
                if ("ageMismatch".equals(discriminatorValue)) {
                    return AgeMismatchInference.fromJson(readerToUse.reset());
                } else if ("sexMismatch".equals(discriminatorValue)) {
                    return SexMismatchInference.fromJson(readerToUse.reset());
                } else if ("lateralityDiscrepancy".equals(discriminatorValue)) {
                    return LateralityDiscrepancyInference.fromJson(readerToUse.reset());
                } else if ("completeOrderDiscrepancy".equals(discriminatorValue)) {
                    return CompleteOrderDiscrepancyInference.fromJson(readerToUse.reset());
                } else if ("limitedOrderDiscrepancy".equals(discriminatorValue)) {
                    return LimitedOrderDiscrepancyInference.fromJson(readerToUse.reset());
                } else if ("finding".equals(discriminatorValue)) {
                    return FindingInference.fromJson(readerToUse.reset());
                } else if ("criticalResult".equals(discriminatorValue)) {
                    return CriticalResultInference.fromJson(readerToUse.reset());
                } else if ("radiologyProcedure".equals(discriminatorValue)) {
                    return RadiologyProcedureInference.fromJson(readerToUse.reset());
                } else if ("followupRecommendation".equals(discriminatorValue)) {
                    return FollowupRecommendationInference.fromJson(readerToUse.reset());
                } else if ("followupCommunication".equals(discriminatorValue)) {
                    return FollowupCommunicationInference.fromJson(readerToUse.reset());
                } else if ("scoringAndAssessment".equals(discriminatorValue)) {
                    return ScoringAndAssessmentInference.fromJson(readerToUse.reset());
                } else if ("guidance".equals(discriminatorValue)) {
                    return GuidanceInference.fromJson(readerToUse.reset());
                } else if ("qualityMeasure".equals(discriminatorValue)) {
                    return QualityMeasureInference.fromJson(readerToUse.reset());
                } else {
                    return fromJsonKnownDiscriminator(readerToUse.reset());
                }
            }
        });
    }

    @Generated
    static RadiologyInsightsInference fromJsonKnownDiscriminator(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            RadiologyInsightsInference deserializedRadiologyInsightsInference = new RadiologyInsightsInference();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();
                if ("kind".equals(fieldName)) {
                    deserializedRadiologyInsightsInference.kind
                        = RadiologyInsightsInferenceType.fromString(reader.getString());
                } else if ("extension".equals(fieldName)) {
                    List<FhirR4Extension> extension = reader.readArray(reader1 -> FhirR4Extension.fromJson(reader1));
                    deserializedRadiologyInsightsInference.extension = extension;
                } else {
                    reader.skipChildren();
                }
            }
            return deserializedRadiologyInsightsInference;
        });
    }
}
