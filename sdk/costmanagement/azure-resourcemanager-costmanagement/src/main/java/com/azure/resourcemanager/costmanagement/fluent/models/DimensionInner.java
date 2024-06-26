// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.costmanagement.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.costmanagement.models.CostManagementResource;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;

/** List of Dimension. */
@Fluent
public final class DimensionInner extends CostManagementResource {
    /*
     * Dimension properties.
     */
    @JsonProperty(value = "properties")
    private DimensionProperties innerProperties;

    /** Creates an instance of DimensionInner class. */
    public DimensionInner() {
    }

    /**
     * Get the innerProperties property: Dimension properties.
     *
     * @return the innerProperties value.
     */
    private DimensionProperties innerProperties() {
        return this.innerProperties;
    }

    /** {@inheritDoc} */
    @Override
    public DimensionInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public DimensionInner withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Get the description property: Dimension description.
     *
     * @return the description value.
     */
    public String description() {
        return this.innerProperties() == null ? null : this.innerProperties().description();
    }

    /**
     * Get the filterEnabled property: Filter enabled.
     *
     * @return the filterEnabled value.
     */
    public Boolean filterEnabled() {
        return this.innerProperties() == null ? null : this.innerProperties().filterEnabled();
    }

    /**
     * Get the groupingEnabled property: Grouping enabled.
     *
     * @return the groupingEnabled value.
     */
    public Boolean groupingEnabled() {
        return this.innerProperties() == null ? null : this.innerProperties().groupingEnabled();
    }

    /**
     * Get the data property: Dimension data.
     *
     * @return the data value.
     */
    public List<String> data() {
        return this.innerProperties() == null ? null : this.innerProperties().data();
    }

    /**
     * Set the data property: Dimension data.
     *
     * @param data the data value to set.
     * @return the DimensionInner object itself.
     */
    public DimensionInner withData(List<String> data) {
        if (this.innerProperties() == null) {
            this.innerProperties = new DimensionProperties();
        }
        this.innerProperties().withData(data);
        return this;
    }

    /**
     * Get the total property: Total number of data for the dimension.
     *
     * @return the total value.
     */
    public Integer total() {
        return this.innerProperties() == null ? null : this.innerProperties().total();
    }

    /**
     * Get the category property: Dimension category.
     *
     * @return the category value.
     */
    public String category() {
        return this.innerProperties() == null ? null : this.innerProperties().category();
    }

    /**
     * Get the usageStart property: Usage start.
     *
     * @return the usageStart value.
     */
    public OffsetDateTime usageStart() {
        return this.innerProperties() == null ? null : this.innerProperties().usageStart();
    }

    /**
     * Get the usageEnd property: Usage end.
     *
     * @return the usageEnd value.
     */
    public OffsetDateTime usageEnd() {
        return this.innerProperties() == null ? null : this.innerProperties().usageEnd();
    }

    /**
     * Get the nextLink property: The link (url) to the next page of results.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.innerProperties() == null ? null : this.innerProperties().nextLink();
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
