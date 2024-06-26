// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.securitydevops.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The ActionableRemediation model. */
@Fluent
public final class ActionableRemediation {
    /*
     * The state property.
     */
    @JsonProperty(value = "state")
    private ActionableRemediationState state;

    /*
     * The severityLevels property.
     */
    @JsonProperty(value = "severityLevels")
    private List<String> severityLevels;

    /*
     * The categories property.
     */
    @JsonProperty(value = "categories")
    private List<RuleCategory> categories;

    /*
     * Branch onboarding info.
     */
    @JsonProperty(value = "branchConfiguration")
    private TargetBranchConfiguration branchConfiguration;

    /** Creates an instance of ActionableRemediation class. */
    public ActionableRemediation() {
    }

    /**
     * Get the state property: The state property.
     *
     * @return the state value.
     */
    public ActionableRemediationState state() {
        return this.state;
    }

    /**
     * Set the state property: The state property.
     *
     * @param state the state value to set.
     * @return the ActionableRemediation object itself.
     */
    public ActionableRemediation withState(ActionableRemediationState state) {
        this.state = state;
        return this;
    }

    /**
     * Get the severityLevels property: The severityLevels property.
     *
     * @return the severityLevels value.
     */
    public List<String> severityLevels() {
        return this.severityLevels;
    }

    /**
     * Set the severityLevels property: The severityLevels property.
     *
     * @param severityLevels the severityLevels value to set.
     * @return the ActionableRemediation object itself.
     */
    public ActionableRemediation withSeverityLevels(List<String> severityLevels) {
        this.severityLevels = severityLevels;
        return this;
    }

    /**
     * Get the categories property: The categories property.
     *
     * @return the categories value.
     */
    public List<RuleCategory> categories() {
        return this.categories;
    }

    /**
     * Set the categories property: The categories property.
     *
     * @param categories the categories value to set.
     * @return the ActionableRemediation object itself.
     */
    public ActionableRemediation withCategories(List<RuleCategory> categories) {
        this.categories = categories;
        return this;
    }

    /**
     * Get the branchConfiguration property: Branch onboarding info.
     *
     * @return the branchConfiguration value.
     */
    public TargetBranchConfiguration branchConfiguration() {
        return this.branchConfiguration;
    }

    /**
     * Set the branchConfiguration property: Branch onboarding info.
     *
     * @param branchConfiguration the branchConfiguration value to set.
     * @return the ActionableRemediation object itself.
     */
    public ActionableRemediation withBranchConfiguration(TargetBranchConfiguration branchConfiguration) {
        this.branchConfiguration = branchConfiguration;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (branchConfiguration() != null) {
            branchConfiguration().validate();
        }
    }
}
