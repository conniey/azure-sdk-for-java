// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.workloadssapvirtualinstance.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.workloadssapvirtualinstance.models.DiskConfiguration;
import com.azure.resourcemanager.workloadssapvirtualinstance.models.DiskSku;
import com.azure.resourcemanager.workloadssapvirtualinstance.models.DiskSkuName;
import com.azure.resourcemanager.workloadssapvirtualinstance.models.DiskVolumeConfiguration;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class DiskConfigurationTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        DiskConfiguration model = BinaryData.fromString(
            "{\"diskVolumeConfigurations\":{\"vyevcciqi\":{\"count\":788884575308090038,\"sizeGB\":955954291018869840,\"sku\":{\"name\":\"PremiumV2_LRS\"}},\"rnfygxgispem\":{\"count\":3096517635239842690,\"sizeGB\":8475415208772100172,\"sku\":{\"name\":\"Premium_LRS\"}},\"jofxqe\":{\"count\":4004614567992112922,\"sizeGB\":5486133222251780236,\"sku\":{\"name\":\"StandardSSD_LRS\"}},\"b\":{\"count\":4013102962507329010,\"sizeGB\":8107487838702555165,\"sku\":{\"name\":\"StandardSSD_ZRS\"}}}}")
            .toObject(DiskConfiguration.class);
        Assertions.assertEquals(788884575308090038L, model.diskVolumeConfigurations().get("vyevcciqi").count());
        Assertions.assertEquals(955954291018869840L, model.diskVolumeConfigurations().get("vyevcciqi").sizeGB());
        Assertions.assertEquals(DiskSkuName.PREMIUM_V2_LRS,
            model.diskVolumeConfigurations().get("vyevcciqi").sku().name());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        DiskConfiguration model = new DiskConfiguration().withDiskVolumeConfigurations(mapOf("vyevcciqi",
            new DiskVolumeConfiguration().withCount(788884575308090038L)
                .withSizeGB(955954291018869840L)
                .withSku(new DiskSku().withName(DiskSkuName.PREMIUM_V2_LRS)),
            "rnfygxgispem",
            new DiskVolumeConfiguration().withCount(3096517635239842690L)
                .withSizeGB(8475415208772100172L)
                .withSku(new DiskSku().withName(DiskSkuName.PREMIUM_LRS)),
            "jofxqe",
            new DiskVolumeConfiguration().withCount(4004614567992112922L)
                .withSizeGB(5486133222251780236L)
                .withSku(new DiskSku().withName(DiskSkuName.STANDARD_SSD_LRS)),
            "b",
            new DiskVolumeConfiguration().withCount(4013102962507329010L)
                .withSizeGB(8107487838702555165L)
                .withSku(new DiskSku().withName(DiskSkuName.STANDARD_SSD_ZRS))));
        model = BinaryData.fromObject(model).toObject(DiskConfiguration.class);
        Assertions.assertEquals(788884575308090038L, model.diskVolumeConfigurations().get("vyevcciqi").count());
        Assertions.assertEquals(955954291018869840L, model.diskVolumeConfigurations().get("vyevcciqi").sizeGB());
        Assertions.assertEquals(DiskSkuName.PREMIUM_V2_LRS,
            model.diskVolumeConfigurations().get("vyevcciqi").sku().name());
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
