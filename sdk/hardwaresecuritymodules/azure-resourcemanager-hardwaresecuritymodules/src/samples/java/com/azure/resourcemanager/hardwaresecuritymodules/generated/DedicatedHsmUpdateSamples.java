// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.hardwaresecuritymodules.generated;

import com.azure.resourcemanager.hardwaresecuritymodules.models.DedicatedHsm;
import java.util.HashMap;
import java.util.Map;

/**
 * Samples for DedicatedHsm Update.
 */
public final class DedicatedHsmUpdateSamples {
    /*
     * x-ms-original-file: 2025-03-31/DedicatedHsm_Update.json
     */
    /**
     * Sample code: Update an existing dedicated HSM.
     * 
     * @param manager Entry point to HardwareSecurityModulesManager.
     */
    public static void updateAnExistingDedicatedHSM(
        com.azure.resourcemanager.hardwaresecuritymodules.HardwareSecurityModulesManager manager) {
        DedicatedHsm resource = manager.dedicatedHsms()
            .getByResourceGroupWithResponse("hsm-group", "hsm1", com.azure.core.util.Context.NONE)
            .getValue();
        resource.update().withTags(mapOf("Dept", "hsm", "Environment", "dogfood", "Slice", "A")).apply();
    }

    /*
     * x-ms-original-file: 2025-03-31/PaymentHsm_Update.json
     */
    /**
     * Sample code: Update an existing payment HSM.
     * 
     * @param manager Entry point to HardwareSecurityModulesManager.
     */
    public static void updateAnExistingPaymentHSM(
        com.azure.resourcemanager.hardwaresecuritymodules.HardwareSecurityModulesManager manager) {
        DedicatedHsm resource = manager.dedicatedHsms()
            .getByResourceGroupWithResponse("hsm-group", "hsm1", com.azure.core.util.Context.NONE)
            .getValue();
        resource.update().withTags(mapOf("Dept", "hsm", "Environment", "dogfood", "Slice", "A")).apply();
    }

    // Use "Map.of" if available
    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
