// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.models;

import com.azure.resourcemanager.apimanagement.fluent.models.ApiManagementServiceNameAvailabilityResultInner;

/**
 * An immutable client-side representation of ApiManagementServiceNameAvailabilityResult.
 */
public interface ApiManagementServiceNameAvailabilityResult {
    /**
     * Gets the nameAvailable property: True if the name is available and can be used to create a new API Management
     * service; otherwise false.
     * 
     * @return the nameAvailable value.
     */
    Boolean nameAvailable();

    /**
     * Gets the message property: If reason == invalid, provide the user with the reason why the given name is invalid,
     * and provide the resource naming requirements so that the user can select a valid name. If reason ==
     * AlreadyExists, explain that &lt;resourceName&gt; is already in use, and direct them to select a different name.
     * 
     * @return the message value.
     */
    String message();

    /**
     * Gets the reason property: Invalid indicates the name provided does not match the resource provider’s naming
     * requirements (incorrect length, unsupported characters, etc.) AlreadyExists indicates that the name is already in
     * use and is therefore unavailable.
     * 
     * @return the reason value.
     */
    NameAvailabilityReason reason();

    /**
     * Gets the inner
     * com.azure.resourcemanager.apimanagement.fluent.models.ApiManagementServiceNameAvailabilityResultInner object.
     * 
     * @return the inner object.
     */
    ApiManagementServiceNameAvailabilityResultInner innerModel();
}
