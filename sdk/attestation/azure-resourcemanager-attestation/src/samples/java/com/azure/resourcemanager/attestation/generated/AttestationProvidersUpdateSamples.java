// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.attestation.generated;

import com.azure.resourcemanager.attestation.models.AttestationProvider;
import java.util.HashMap;
import java.util.Map;

/**
 * Samples for AttestationProviders Update.
 */
public final class AttestationProvidersUpdateSamples {
    /*
     * x-ms-original-file: specification/attestation/resource-manager/Microsoft.Attestation/stable/2020-10-01/examples/
     * Update_AttestationProvider.json
     */
    /**
     * Sample code: AttestationProviders_Update.
     * 
     * @param manager Entry point to AttestationManager.
     */
    public static void attestationProvidersUpdate(com.azure.resourcemanager.attestation.AttestationManager manager) {
        AttestationProvider resource = manager.attestationProviders()
            .getByResourceGroupWithResponse("MyResourceGroup", "myattestationprovider",
                com.azure.core.util.Context.NONE)
            .getValue();
        resource.update().withTags(mapOf("Property1", "Value1", "Property2", "Value2", "Property3", "Value3")).apply();
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
