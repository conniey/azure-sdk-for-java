// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.models;

import com.azure.resourcemanager.mediaservices.fluent.models.EdgePoliciesInner;

/**
 * An immutable client-side representation of EdgePolicies.
 */
public interface EdgePolicies {
    /**
     * Gets the usageDataCollectionPolicy property: The usageDataCollectionPolicy property.
     * 
     * @return the usageDataCollectionPolicy value.
     */
    EdgeUsageDataCollectionPolicy usageDataCollectionPolicy();

    /**
     * Gets the inner com.azure.resourcemanager.mediaservices.fluent.models.EdgePoliciesInner object.
     * 
     * @return the inner object.
     */
    EdgePoliciesInner innerModel();
}
