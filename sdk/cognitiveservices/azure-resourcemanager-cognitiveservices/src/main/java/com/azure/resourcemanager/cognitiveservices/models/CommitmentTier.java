// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cognitiveservices.models;

import com.azure.resourcemanager.cognitiveservices.fluent.models.CommitmentTierInner;

/**
 * An immutable client-side representation of CommitmentTier.
 */
public interface CommitmentTier {
    /**
     * Gets the kind property: The Kind of the resource.
     * 
     * @return the kind value.
     */
    String kind();

    /**
     * Gets the skuName property: The name of the SKU. Ex - P3. It is typically a letter+number code.
     * 
     * @return the skuName value.
     */
    String skuName();

    /**
     * Gets the hostingModel property: Account hosting model.
     * 
     * @return the hostingModel value.
     */
    HostingModel hostingModel();

    /**
     * Gets the planType property: Commitment plan type.
     * 
     * @return the planType value.
     */
    String planType();

    /**
     * Gets the tier property: Commitment period commitment tier.
     * 
     * @return the tier value.
     */
    String tier();

    /**
     * Gets the maxCount property: Commitment period commitment max count.
     * 
     * @return the maxCount value.
     */
    Integer maxCount();

    /**
     * Gets the quota property: Cognitive Services account commitment quota.
     * 
     * @return the quota value.
     */
    CommitmentQuota quota();

    /**
     * Gets the cost property: Cognitive Services account commitment cost.
     * 
     * @return the cost value.
     */
    CommitmentCost cost();

    /**
     * Gets the inner com.azure.resourcemanager.cognitiveservices.fluent.models.CommitmentTierInner object.
     * 
     * @return the inner object.
     */
    CommitmentTierInner innerModel();
}
