// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservices.generated;

import com.azure.resourcemanager.recoveryservices.models.CheckNameAvailabilityParameters;

/**
 * Samples for RecoveryServices CheckNameAvailability.
 */
public final class RecoveryServicesCheckNameAvailabilitySamples {
    /*
     * x-ms-original-file:
     * specification/recoveryservices/resource-manager/Microsoft.RecoveryServices/stable/2025-02-01/examples/
     * CheckNameAvailability_Available.json
     */
    /**
     * Sample code: Availability status of Resource Name when no resource with same name, type and subscription exists,
     * nor has been deleted within last 24 hours.
     * 
     * @param manager Entry point to RecoveryServicesManager.
     */
    public static void
        availabilityStatusOfResourceNameWhenNoResourceWithSameNameTypeAndSubscriptionExistsNorHasBeenDeletedWithinLast24Hours(
            com.azure.resourcemanager.recoveryservices.RecoveryServicesManager manager) {
        manager.recoveryServices()
            .checkNameAvailabilityWithResponse("resGroupFoo", "westus",
                new CheckNameAvailabilityParameters().withType("Microsoft.RecoveryServices/Vaults")
                    .withName("swaggerExample"),
                com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file:
     * specification/recoveryservices/resource-manager/Microsoft.RecoveryServices/stable/2025-02-01/examples/
     * CheckNameAvailability_NotAvailable.json
     */
    /**
     * Sample code: Availability status of Resource Name when resource with same name, type and subscription exists.
     * 
     * @param manager Entry point to RecoveryServicesManager.
     */
    public static void availabilityStatusOfResourceNameWhenResourceWithSameNameTypeAndSubscriptionExists(
        com.azure.resourcemanager.recoveryservices.RecoveryServicesManager manager) {
        manager.recoveryServices()
            .checkNameAvailabilityWithResponse("resGroupBar", "westus",
                new CheckNameAvailabilityParameters().withType("Microsoft.RecoveryServices/Vaults")
                    .withName("swaggerExample2"),
                com.azure.core.util.Context.NONE);
    }
}
