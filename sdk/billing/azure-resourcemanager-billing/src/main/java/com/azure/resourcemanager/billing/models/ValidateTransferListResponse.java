// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.billing.models;

import com.azure.resourcemanager.billing.fluent.models.ValidateTransferListResponseInner;
import java.util.List;

/**
 * An immutable client-side representation of ValidateTransferListResponse.
 */
public interface ValidateTransferListResponse {
    /**
     * Gets the value property: The list of transfer validation results.
     * 
     * @return the value value.
     */
    List<ValidateTransferResponse> value();

    /**
     * Gets the inner com.azure.resourcemanager.billing.fluent.models.ValidateTransferListResponseInner object.
     * 
     * @return the inner object.
     */
    ValidateTransferListResponseInner innerModel();
}
