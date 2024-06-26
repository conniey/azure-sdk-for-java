// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databox.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Map of data location to service location. */
@Immutable
public final class DataLocationToServiceLocationMap {
    /*
     * Location of the data.
     */
    @JsonProperty(value = "dataLocation", access = JsonProperty.Access.WRITE_ONLY)
    private String dataLocation;

    /*
     * Location of the service.
     */
    @JsonProperty(value = "serviceLocation", access = JsonProperty.Access.WRITE_ONLY)
    private String serviceLocation;

    /** Creates an instance of DataLocationToServiceLocationMap class. */
    public DataLocationToServiceLocationMap() {
    }

    /**
     * Get the dataLocation property: Location of the data.
     *
     * @return the dataLocation value.
     */
    public String dataLocation() {
        return this.dataLocation;
    }

    /**
     * Get the serviceLocation property: Location of the service.
     *
     * @return the serviceLocation value.
     */
    public String serviceLocation() {
        return this.serviceLocation;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
