// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.policyinsights.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The check policy restrictions parameters describing the resource that is being evaluated. */
@Fluent
public final class CheckRestrictionsRequest {
    /*
     * The information about the resource that will be evaluated.
     */
    @JsonProperty(value = "resourceDetails", required = true)
    private CheckRestrictionsResourceDetails resourceDetails;

    /*
     * The list of fields and values that should be evaluated for potential restrictions.
     */
    @JsonProperty(value = "pendingFields")
    private List<PendingField> pendingFields;

    /** Creates an instance of CheckRestrictionsRequest class. */
    public CheckRestrictionsRequest() {
    }

    /**
     * Get the resourceDetails property: The information about the resource that will be evaluated.
     *
     * @return the resourceDetails value.
     */
    public CheckRestrictionsResourceDetails resourceDetails() {
        return this.resourceDetails;
    }

    /**
     * Set the resourceDetails property: The information about the resource that will be evaluated.
     *
     * @param resourceDetails the resourceDetails value to set.
     * @return the CheckRestrictionsRequest object itself.
     */
    public CheckRestrictionsRequest withResourceDetails(CheckRestrictionsResourceDetails resourceDetails) {
        this.resourceDetails = resourceDetails;
        return this;
    }

    /**
     * Get the pendingFields property: The list of fields and values that should be evaluated for potential
     * restrictions.
     *
     * @return the pendingFields value.
     */
    public List<PendingField> pendingFields() {
        return this.pendingFields;
    }

    /**
     * Set the pendingFields property: The list of fields and values that should be evaluated for potential
     * restrictions.
     *
     * @param pendingFields the pendingFields value to set.
     * @return the CheckRestrictionsRequest object itself.
     */
    public CheckRestrictionsRequest withPendingFields(List<PendingField> pendingFields) {
        this.pendingFields = pendingFields;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (resourceDetails() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property resourceDetails in model CheckRestrictionsRequest"));
        } else {
            resourceDetails().validate();
        }
        if (pendingFields() != null) {
            pendingFields().forEach(e -> e.validate());
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(CheckRestrictionsRequest.class);
}
