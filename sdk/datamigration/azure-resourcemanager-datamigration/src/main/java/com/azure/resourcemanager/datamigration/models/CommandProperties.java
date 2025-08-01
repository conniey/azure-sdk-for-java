// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datamigration.models;

import com.azure.core.management.exception.ManagementError;
import com.azure.resourcemanager.datamigration.fluent.models.CommandPropertiesInner;
import java.util.List;

/**
 * An immutable client-side representation of CommandProperties.
 */
public interface CommandProperties {
    /**
     * Gets the commandType property: Command type.
     * 
     * @return the commandType value.
     */
    CommandType commandType();

    /**
     * Gets the errors property: Array of errors. This is ignored if submitted.
     * 
     * @return the errors value.
     */
    List<ManagementError> errors();

    /**
     * Gets the state property: The state of the command. This is ignored if submitted.
     * 
     * @return the state value.
     */
    CommandState state();

    /**
     * Gets the inner com.azure.resourcemanager.datamigration.fluent.models.CommandPropertiesInner object.
     * 
     * @return the inner object.
     */
    CommandPropertiesInner innerModel();
}
