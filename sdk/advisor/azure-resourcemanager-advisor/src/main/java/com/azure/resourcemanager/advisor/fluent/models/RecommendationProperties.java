// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.advisor.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.advisor.models.Category;
import com.azure.resourcemanager.advisor.models.Impact;
import com.azure.resourcemanager.advisor.models.ResourceMetadata;
import com.azure.resourcemanager.advisor.models.ShortDescription;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/** The properties of the recommendation. */
@Fluent
public final class RecommendationProperties {
    /*
     * The category of the recommendation.
     */
    @JsonProperty(value = "category")
    private Category category;

    /*
     * The business impact of the recommendation.
     */
    @JsonProperty(value = "impact")
    private Impact impact;

    /*
     * The resource type identified by Advisor.
     */
    @JsonProperty(value = "impactedField")
    private String impactedField;

    /*
     * The resource identified by Advisor.
     */
    @JsonProperty(value = "impactedValue")
    private String impactedValue;

    /*
     * The most recent time that Advisor checked the validity of the recommendation.
     */
    @JsonProperty(value = "lastUpdated")
    private OffsetDateTime lastUpdated;

    /*
     * The recommendation metadata.
     */
    @JsonProperty(value = "metadata")
    @JsonInclude(value = JsonInclude.Include.NON_NULL, content = JsonInclude.Include.ALWAYS)
    private Map<String, Object> metadata;

    /*
     * The recommendation-type GUID.
     */
    @JsonProperty(value = "recommendationTypeId")
    private String recommendationTypeId;

    /*
     * A summary of the recommendation.
     */
    @JsonProperty(value = "shortDescription")
    private ShortDescription shortDescription;

    /*
     * The list of snoozed and dismissed rules for the recommendation.
     */
    @JsonProperty(value = "suppressionIds")
    private List<UUID> suppressionIds;

    /*
     * Extended properties
     */
    @JsonProperty(value = "extendedProperties")
    @JsonInclude(value = JsonInclude.Include.NON_NULL, content = JsonInclude.Include.ALWAYS)
    private Map<String, String> extendedProperties;

    /*
     * Metadata of resource that was assessed
     */
    @JsonProperty(value = "resourceMetadata")
    private ResourceMetadata resourceMetadata;

    /*
     * The detailed description of recommendation.
     */
    @JsonProperty(value = "description")
    private String description;

    /*
     * The label of recommendation.
     */
    @JsonProperty(value = "label")
    private String label;

    /*
     * The link to learn more about recommendation and generation logic.
     */
    @JsonProperty(value = "learnMoreLink")
    private String learnMoreLink;

    /*
     * The potential benefit of implementing recommendation.
     */
    @JsonProperty(value = "potentialBenefits")
    private String potentialBenefits;

    /*
     * The list of recommended actions to implement recommendation.
     */
    @JsonProperty(value = "actions")
    private List<Map<String, Object>> actions;

    /*
     * The automated way to apply recommendation.
     */
    @JsonProperty(value = "remediation")
    @JsonInclude(value = JsonInclude.Include.NON_NULL, content = JsonInclude.Include.ALWAYS)
    private Map<String, Object> remediation;

    /*
     * The recommendation metadata properties exposed to customer to provide additional information.
     */
    @JsonProperty(value = "exposedMetadataProperties")
    @JsonInclude(value = JsonInclude.Include.NON_NULL, content = JsonInclude.Include.ALWAYS)
    private Map<String, Object> exposedMetadataProperties;

    /** Creates an instance of RecommendationProperties class. */
    public RecommendationProperties() {
    }

    /**
     * Get the category property: The category of the recommendation.
     *
     * @return the category value.
     */
    public Category category() {
        return this.category;
    }

    /**
     * Set the category property: The category of the recommendation.
     *
     * @param category the category value to set.
     * @return the RecommendationProperties object itself.
     */
    public RecommendationProperties withCategory(Category category) {
        this.category = category;
        return this;
    }

    /**
     * Get the impact property: The business impact of the recommendation.
     *
     * @return the impact value.
     */
    public Impact impact() {
        return this.impact;
    }

    /**
     * Set the impact property: The business impact of the recommendation.
     *
     * @param impact the impact value to set.
     * @return the RecommendationProperties object itself.
     */
    public RecommendationProperties withImpact(Impact impact) {
        this.impact = impact;
        return this;
    }

    /**
     * Get the impactedField property: The resource type identified by Advisor.
     *
     * @return the impactedField value.
     */
    public String impactedField() {
        return this.impactedField;
    }

    /**
     * Set the impactedField property: The resource type identified by Advisor.
     *
     * @param impactedField the impactedField value to set.
     * @return the RecommendationProperties object itself.
     */
    public RecommendationProperties withImpactedField(String impactedField) {
        this.impactedField = impactedField;
        return this;
    }

    /**
     * Get the impactedValue property: The resource identified by Advisor.
     *
     * @return the impactedValue value.
     */
    public String impactedValue() {
        return this.impactedValue;
    }

    /**
     * Set the impactedValue property: The resource identified by Advisor.
     *
     * @param impactedValue the impactedValue value to set.
     * @return the RecommendationProperties object itself.
     */
    public RecommendationProperties withImpactedValue(String impactedValue) {
        this.impactedValue = impactedValue;
        return this;
    }

    /**
     * Get the lastUpdated property: The most recent time that Advisor checked the validity of the recommendation.
     *
     * @return the lastUpdated value.
     */
    public OffsetDateTime lastUpdated() {
        return this.lastUpdated;
    }

    /**
     * Set the lastUpdated property: The most recent time that Advisor checked the validity of the recommendation.
     *
     * @param lastUpdated the lastUpdated value to set.
     * @return the RecommendationProperties object itself.
     */
    public RecommendationProperties withLastUpdated(OffsetDateTime lastUpdated) {
        this.lastUpdated = lastUpdated;
        return this;
    }

    /**
     * Get the metadata property: The recommendation metadata.
     *
     * @return the metadata value.
     */
    public Map<String, Object> metadata() {
        return this.metadata;
    }

    /**
     * Set the metadata property: The recommendation metadata.
     *
     * @param metadata the metadata value to set.
     * @return the RecommendationProperties object itself.
     */
    public RecommendationProperties withMetadata(Map<String, Object> metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * Get the recommendationTypeId property: The recommendation-type GUID.
     *
     * @return the recommendationTypeId value.
     */
    public String recommendationTypeId() {
        return this.recommendationTypeId;
    }

    /**
     * Set the recommendationTypeId property: The recommendation-type GUID.
     *
     * @param recommendationTypeId the recommendationTypeId value to set.
     * @return the RecommendationProperties object itself.
     */
    public RecommendationProperties withRecommendationTypeId(String recommendationTypeId) {
        this.recommendationTypeId = recommendationTypeId;
        return this;
    }

    /**
     * Get the shortDescription property: A summary of the recommendation.
     *
     * @return the shortDescription value.
     */
    public ShortDescription shortDescription() {
        return this.shortDescription;
    }

    /**
     * Set the shortDescription property: A summary of the recommendation.
     *
     * @param shortDescription the shortDescription value to set.
     * @return the RecommendationProperties object itself.
     */
    public RecommendationProperties withShortDescription(ShortDescription shortDescription) {
        this.shortDescription = shortDescription;
        return this;
    }

    /**
     * Get the suppressionIds property: The list of snoozed and dismissed rules for the recommendation.
     *
     * @return the suppressionIds value.
     */
    public List<UUID> suppressionIds() {
        return this.suppressionIds;
    }

    /**
     * Set the suppressionIds property: The list of snoozed and dismissed rules for the recommendation.
     *
     * @param suppressionIds the suppressionIds value to set.
     * @return the RecommendationProperties object itself.
     */
    public RecommendationProperties withSuppressionIds(List<UUID> suppressionIds) {
        this.suppressionIds = suppressionIds;
        return this;
    }

    /**
     * Get the extendedProperties property: Extended properties.
     *
     * @return the extendedProperties value.
     */
    public Map<String, String> extendedProperties() {
        return this.extendedProperties;
    }

    /**
     * Set the extendedProperties property: Extended properties.
     *
     * @param extendedProperties the extendedProperties value to set.
     * @return the RecommendationProperties object itself.
     */
    public RecommendationProperties withExtendedProperties(Map<String, String> extendedProperties) {
        this.extendedProperties = extendedProperties;
        return this;
    }

    /**
     * Get the resourceMetadata property: Metadata of resource that was assessed.
     *
     * @return the resourceMetadata value.
     */
    public ResourceMetadata resourceMetadata() {
        return this.resourceMetadata;
    }

    /**
     * Set the resourceMetadata property: Metadata of resource that was assessed.
     *
     * @param resourceMetadata the resourceMetadata value to set.
     * @return the RecommendationProperties object itself.
     */
    public RecommendationProperties withResourceMetadata(ResourceMetadata resourceMetadata) {
        this.resourceMetadata = resourceMetadata;
        return this;
    }

    /**
     * Get the description property: The detailed description of recommendation.
     *
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the description property: The detailed description of recommendation.
     *
     * @param description the description value to set.
     * @return the RecommendationProperties object itself.
     */
    public RecommendationProperties withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the label property: The label of recommendation.
     *
     * @return the label value.
     */
    public String label() {
        return this.label;
    }

    /**
     * Set the label property: The label of recommendation.
     *
     * @param label the label value to set.
     * @return the RecommendationProperties object itself.
     */
    public RecommendationProperties withLabel(String label) {
        this.label = label;
        return this;
    }

    /**
     * Get the learnMoreLink property: The link to learn more about recommendation and generation logic.
     *
     * @return the learnMoreLink value.
     */
    public String learnMoreLink() {
        return this.learnMoreLink;
    }

    /**
     * Set the learnMoreLink property: The link to learn more about recommendation and generation logic.
     *
     * @param learnMoreLink the learnMoreLink value to set.
     * @return the RecommendationProperties object itself.
     */
    public RecommendationProperties withLearnMoreLink(String learnMoreLink) {
        this.learnMoreLink = learnMoreLink;
        return this;
    }

    /**
     * Get the potentialBenefits property: The potential benefit of implementing recommendation.
     *
     * @return the potentialBenefits value.
     */
    public String potentialBenefits() {
        return this.potentialBenefits;
    }

    /**
     * Set the potentialBenefits property: The potential benefit of implementing recommendation.
     *
     * @param potentialBenefits the potentialBenefits value to set.
     * @return the RecommendationProperties object itself.
     */
    public RecommendationProperties withPotentialBenefits(String potentialBenefits) {
        this.potentialBenefits = potentialBenefits;
        return this;
    }

    /**
     * Get the actions property: The list of recommended actions to implement recommendation.
     *
     * @return the actions value.
     */
    public List<Map<String, Object>> actions() {
        return this.actions;
    }

    /**
     * Set the actions property: The list of recommended actions to implement recommendation.
     *
     * @param actions the actions value to set.
     * @return the RecommendationProperties object itself.
     */
    public RecommendationProperties withActions(List<Map<String, Object>> actions) {
        this.actions = actions;
        return this;
    }

    /**
     * Get the remediation property: The automated way to apply recommendation.
     *
     * @return the remediation value.
     */
    public Map<String, Object> remediation() {
        return this.remediation;
    }

    /**
     * Set the remediation property: The automated way to apply recommendation.
     *
     * @param remediation the remediation value to set.
     * @return the RecommendationProperties object itself.
     */
    public RecommendationProperties withRemediation(Map<String, Object> remediation) {
        this.remediation = remediation;
        return this;
    }

    /**
     * Get the exposedMetadataProperties property: The recommendation metadata properties exposed to customer to provide
     * additional information.
     *
     * @return the exposedMetadataProperties value.
     */
    public Map<String, Object> exposedMetadataProperties() {
        return this.exposedMetadataProperties;
    }

    /**
     * Set the exposedMetadataProperties property: The recommendation metadata properties exposed to customer to provide
     * additional information.
     *
     * @param exposedMetadataProperties the exposedMetadataProperties value to set.
     * @return the RecommendationProperties object itself.
     */
    public RecommendationProperties withExposedMetadataProperties(Map<String, Object> exposedMetadataProperties) {
        this.exposedMetadataProperties = exposedMetadataProperties;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (shortDescription() != null) {
            shortDescription().validate();
        }
        if (resourceMetadata() != null) {
            resourceMetadata().validate();
        }
    }
}
