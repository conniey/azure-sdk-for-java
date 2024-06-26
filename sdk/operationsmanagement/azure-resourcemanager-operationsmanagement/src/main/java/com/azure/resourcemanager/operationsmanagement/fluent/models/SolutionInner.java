// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.operationsmanagement.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.Resource;
import com.azure.resourcemanager.operationsmanagement.models.SolutionPlan;
import com.azure.resourcemanager.operationsmanagement.models.SolutionProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** The container for solution. */
@Fluent
public final class SolutionInner extends Resource {
    /*
     * Plan for solution object supported by the OperationsManagement resource provider.
     */
    @JsonProperty(value = "plan")
    private SolutionPlan plan;

    /*
     * Properties for solution object supported by the OperationsManagement resource provider.
     */
    @JsonProperty(value = "properties")
    private SolutionProperties properties;

    /** Creates an instance of SolutionInner class. */
    public SolutionInner() {
    }

    /**
     * Get the plan property: Plan for solution object supported by the OperationsManagement resource provider.
     *
     * @return the plan value.
     */
    public SolutionPlan plan() {
        return this.plan;
    }

    /**
     * Set the plan property: Plan for solution object supported by the OperationsManagement resource provider.
     *
     * @param plan the plan value to set.
     * @return the SolutionInner object itself.
     */
    public SolutionInner withPlan(SolutionPlan plan) {
        this.plan = plan;
        return this;
    }

    /**
     * Get the properties property: Properties for solution object supported by the OperationsManagement resource
     * provider.
     *
     * @return the properties value.
     */
    public SolutionProperties properties() {
        return this.properties;
    }

    /**
     * Set the properties property: Properties for solution object supported by the OperationsManagement resource
     * provider.
     *
     * @param properties the properties value to set.
     * @return the SolutionInner object itself.
     */
    public SolutionInner withProperties(SolutionProperties properties) {
        this.properties = properties;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public SolutionInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public SolutionInner withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (plan() != null) {
            plan().validate();
        }
        if (properties() != null) {
            properties().validate();
        }
    }
}
