// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.avs.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.avs.fluent.models.ClusterInner;
import com.azure.resourcemanager.avs.models.Sku;
import com.azure.resourcemanager.avs.models.SkuTier;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class ClusterInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ClusterInner model = BinaryData.fromString(
            "{\"properties\":{\"clusterSize\":1625524147,\"provisioningState\":\"Deleting\",\"clusterId\":55863349,\"hosts\":[\"ltyfsop\",\"usue\",\"nzwdejba\",\"orxzdmohctbqvud\"],\"vsanDatastoreName\":\"dndnvow\"},\"sku\":{\"name\":\"ujjugwdkcglh\",\"tier\":\"Basic\",\"size\":\"jdyggdtji\",\"family\":\"b\",\"capacity\":2140516005},\"id\":\"qweykhmenev\",\"name\":\"yexfwh\",\"type\":\"bcibvyvdcsitynn\"}")
            .toObject(ClusterInner.class);
        Assertions.assertEquals("ujjugwdkcglh", model.sku().name());
        Assertions.assertEquals(SkuTier.BASIC, model.sku().tier());
        Assertions.assertEquals("jdyggdtji", model.sku().size());
        Assertions.assertEquals("b", model.sku().family());
        Assertions.assertEquals(2140516005, model.sku().capacity());
        Assertions.assertEquals(1625524147, model.clusterSize());
        Assertions.assertEquals("ltyfsop", model.hosts().get(0));
        Assertions.assertEquals("dndnvow", model.vsanDatastoreName());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ClusterInner model = new ClusterInner()
            .withSku(new Sku().withName("ujjugwdkcglh")
                .withTier(SkuTier.BASIC)
                .withSize("jdyggdtji")
                .withFamily("b")
                .withCapacity(2140516005))
            .withClusterSize(1625524147)
            .withHosts(Arrays.asList("ltyfsop", "usue", "nzwdejba", "orxzdmohctbqvud"))
            .withVsanDatastoreName("dndnvow");
        model = BinaryData.fromObject(model).toObject(ClusterInner.class);
        Assertions.assertEquals("ujjugwdkcglh", model.sku().name());
        Assertions.assertEquals(SkuTier.BASIC, model.sku().tier());
        Assertions.assertEquals("jdyggdtji", model.sku().size());
        Assertions.assertEquals("b", model.sku().family());
        Assertions.assertEquals(2140516005, model.sku().capacity());
        Assertions.assertEquals(1625524147, model.clusterSize());
        Assertions.assertEquals("ltyfsop", model.hosts().get(0));
        Assertions.assertEquals("dndnvow", model.vsanDatastoreName());
    }
}
