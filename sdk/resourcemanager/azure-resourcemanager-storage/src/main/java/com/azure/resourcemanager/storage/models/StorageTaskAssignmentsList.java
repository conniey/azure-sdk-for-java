// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storage.models;

import com.azure.core.annotation.Immutable;
import com.azure.resourcemanager.storage.fluent.models.StorageTaskAssignmentInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * List of storage task assignments for the storage account.
 */
@Immutable
public final class StorageTaskAssignmentsList {
    /*
     * Gets the list of storage task assignments and their properties.
     */
    @JsonProperty(value = "value", access = JsonProperty.Access.WRITE_ONLY)
    private List<StorageTaskAssignmentInner> value;

    /*
     * Request URL that can be used to query next page of storage task assignments. Returned when total number of
     * requested storage task assignments exceed maximum page size.
     */
    @JsonProperty(value = "nextLink", access = JsonProperty.Access.WRITE_ONLY)
    private String nextLink;

    /**
     * Creates an instance of StorageTaskAssignmentsList class.
     */
    public StorageTaskAssignmentsList() {
    }

    /**
     * Get the value property: Gets the list of storage task assignments and their properties.
     * 
     * @return the value value.
     */
    public List<StorageTaskAssignmentInner> value() {
        return this.value;
    }

    /**
     * Get the nextLink property: Request URL that can be used to query next page of storage task assignments. Returned
     * when total number of requested storage task assignments exceed maximum page size.
     * 
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() != null) {
            value().forEach(e -> e.validate());
        }
    }
}
