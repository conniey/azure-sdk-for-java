// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.models;

import com.azure.core.management.exception.ManagementError;
import com.azure.resourcemanager.synapse.fluent.models.OperationResourceInner;
import java.time.OffsetDateTime;

/**
 * An immutable client-side representation of OperationResource.
 */
public interface OperationResource {
    /**
     * Gets the id property: Operation ID.
     * 
     * @return the id value.
     */
    String id();

    /**
     * Gets the name property: Operation name.
     * 
     * @return the name value.
     */
    String name();

    /**
     * Gets the status property: Operation status.
     * 
     * @return the status value.
     */
    OperationStatus status();

    /**
     * Gets the properties property: Operation properties.
     * 
     * @return the properties value.
     */
    Object properties();

    /**
     * Gets the error property: Errors from the operation.
     * 
     * @return the error value.
     */
    ManagementError error();

    /**
     * Gets the startTime property: Operation start time.
     * 
     * @return the startTime value.
     */
    OffsetDateTime startTime();

    /**
     * Gets the endTime property: Operation start time.
     * 
     * @return the endTime value.
     */
    OffsetDateTime endTime();

    /**
     * Gets the percentComplete property: Completion percentage of the operation.
     * 
     * @return the percentComplete value.
     */
    Float percentComplete();

    /**
     * Gets the inner com.azure.resourcemanager.synapse.fluent.models.OperationResourceInner object.
     * 
     * @return the inner object.
     */
    OperationResourceInner innerModel();
}
