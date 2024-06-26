// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.securityinsights.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Describes an error encountered in the file during validation. */
@Fluent
public final class ValidationError {
    /*
     * The number of the record that has the error.
     */
    @JsonProperty(value = "recordIndex")
    private Integer recordIndex;

    /*
     * A list of descriptions of the error.
     */
    @JsonProperty(value = "errorMessages", access = JsonProperty.Access.WRITE_ONLY)
    private List<String> errorMessages;

    /**
     * Get the recordIndex property: The number of the record that has the error.
     *
     * @return the recordIndex value.
     */
    public Integer recordIndex() {
        return this.recordIndex;
    }

    /**
     * Set the recordIndex property: The number of the record that has the error.
     *
     * @param recordIndex the recordIndex value to set.
     * @return the ValidationError object itself.
     */
    public ValidationError withRecordIndex(Integer recordIndex) {
        this.recordIndex = recordIndex;
        return this;
    }

    /**
     * Get the errorMessages property: A list of descriptions of the error.
     *
     * @return the errorMessages value.
     */
    public List<String> errorMessages() {
        return this.errorMessages;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
