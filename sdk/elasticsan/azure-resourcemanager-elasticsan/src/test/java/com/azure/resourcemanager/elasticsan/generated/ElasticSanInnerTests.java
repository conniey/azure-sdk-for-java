// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.elasticsan.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.elasticsan.fluent.models.ElasticSanInner;
import com.azure.resourcemanager.elasticsan.models.AutoScalePolicyEnforcement;
import com.azure.resourcemanager.elasticsan.models.AutoScaleProperties;
import com.azure.resourcemanager.elasticsan.models.PublicNetworkAccess;
import com.azure.resourcemanager.elasticsan.models.ScaleUpProperties;
import com.azure.resourcemanager.elasticsan.models.Sku;
import com.azure.resourcemanager.elasticsan.models.SkuName;
import com.azure.resourcemanager.elasticsan.models.SkuTier;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class ElasticSanInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ElasticSanInner model = BinaryData.fromString(
            "{\"properties\":{\"sku\":{\"name\":\"Premium_ZRS\",\"tier\":\"Premium\"},\"availabilityZones\":[\"izgazxu\",\"izuckyfihrfidfvz\"],\"provisioningState\":\"Pending\",\"baseSizeTiB\":2309073457131020260,\"extendedCapacitySizeTiB\":3785168823699765982,\"totalVolumeSizeGiB\":7093196131799680709,\"volumeGroupCount\":1702945430371192394,\"totalIops\":9204546244351616694,\"totalMBps\":1735908186849769210,\"totalSizeTiB\":263357956670416647,\"privateEndpointConnections\":[{\"properties\":{\"provisioningState\":\"Restoring\",\"privateEndpoint\":{\"id\":\"km\"},\"privateLinkServiceConnectionState\":{\"status\":\"Pending\",\"description\":\"mxdcufufsrp\",\"actionsRequired\":\"zidnsezcxtbzsgfy\"},\"groupIds\":[\"newmdwzjeiachbo\"]},\"id\":\"flnrosfqpteehzz\",\"name\":\"ypyqrimzinp\",\"type\":\"swjdkirso\"},{\"properties\":{\"provisioningState\":\"Pending\",\"privateEndpoint\":{\"id\":\"crmnohjtckwhds\"},\"privateLinkServiceConnectionState\":{\"status\":\"Rejected\",\"description\":\"yip\",\"actionsRequired\":\"sqwpgrjb\"},\"groupIds\":[\"rcjxvsnbyxqabn\",\"ocpcy\",\"hurzafblj\"]},\"id\":\"pbtoqcjmkl\",\"name\":\"a\",\"type\":\"bqidtqaj\"},{\"properties\":{\"provisioningState\":\"Canceled\",\"privateEndpoint\":{\"id\":\"kudjkrlkhb\"},\"privateLinkServiceConnectionState\":{\"status\":\"Approved\",\"description\":\"pgzgq\",\"actionsRequired\":\"zloc\"},\"groupIds\":[\"paierh\"]},\"id\":\"csglum\",\"name\":\"a\",\"type\":\"tjaodxobnb\"},{\"properties\":{\"provisioningState\":\"SoftDeleting\",\"privateEndpoint\":{\"id\":\"xo\"},\"privateLinkServiceConnectionState\":{\"status\":\"Rejected\",\"description\":\"onpimexgstxg\",\"actionsRequired\":\"odgmaajrmvdjwz\"},\"groupIds\":[\"vmclw\",\"ijcoejctb\",\"aqsqsycbkbfk\",\"ukdkexxppofmxa\"]},\"id\":\"fjpgddtocjjxhvp\",\"name\":\"o\",\"type\":\"exhd\"}],\"publicNetworkAccess\":\"Enabled\",\"autoScaleProperties\":{\"scaleUpProperties\":{\"unusedSizeTiB\":1834498715663622205,\"increaseCapacityUnitByTiB\":4100986999398487835,\"capacityUnitScaleUpLimitTiB\":8633559293771225558,\"autoScalePolicyEnforcement\":\"Enabled\"}}},\"location\":\"t\",\"tags\":{\"twnpzaoqvuhrhcf\":\"eic\",\"pyeicxm\":\"cyddglmjthjqk\",\"ixuigdtopbobj\":\"ciwqvhk\"},\"id\":\"ghmewuam\",\"name\":\"uhrzayvvt\",\"type\":\"gvdfgiotkftutq\"}")
            .toObject(ElasticSanInner.class);
        Assertions.assertEquals("t", model.location());
        Assertions.assertEquals("eic", model.tags().get("twnpzaoqvuhrhcf"));
        Assertions.assertEquals(SkuName.PREMIUM_ZRS, model.sku().name());
        Assertions.assertEquals(SkuTier.PREMIUM, model.sku().tier());
        Assertions.assertEquals("izgazxu", model.availabilityZones().get(0));
        Assertions.assertEquals(2309073457131020260L, model.baseSizeTiB());
        Assertions.assertEquals(3785168823699765982L, model.extendedCapacitySizeTiB());
        Assertions.assertEquals(PublicNetworkAccess.ENABLED, model.publicNetworkAccess());
        Assertions.assertEquals(1834498715663622205L, model.autoScaleProperties().scaleUpProperties().unusedSizeTiB());
        Assertions.assertEquals(4100986999398487835L,
            model.autoScaleProperties().scaleUpProperties().increaseCapacityUnitByTiB());
        Assertions.assertEquals(8633559293771225558L,
            model.autoScaleProperties().scaleUpProperties().capacityUnitScaleUpLimitTiB());
        Assertions.assertEquals(AutoScalePolicyEnforcement.ENABLED,
            model.autoScaleProperties().scaleUpProperties().autoScalePolicyEnforcement());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ElasticSanInner model = new ElasticSanInner().withLocation("t")
            .withTags(mapOf("twnpzaoqvuhrhcf", "eic", "pyeicxm", "cyddglmjthjqk", "ixuigdtopbobj", "ciwqvhk"))
            .withSku(new Sku().withName(SkuName.PREMIUM_ZRS).withTier(SkuTier.PREMIUM))
            .withAvailabilityZones(Arrays.asList("izgazxu", "izuckyfihrfidfvz"))
            .withBaseSizeTiB(2309073457131020260L)
            .withExtendedCapacitySizeTiB(3785168823699765982L)
            .withPublicNetworkAccess(PublicNetworkAccess.ENABLED)
            .withAutoScaleProperties(new AutoScaleProperties()
                .withScaleUpProperties(new ScaleUpProperties().withUnusedSizeTiB(1834498715663622205L)
                    .withIncreaseCapacityUnitByTiB(4100986999398487835L)
                    .withCapacityUnitScaleUpLimitTiB(8633559293771225558L)
                    .withAutoScalePolicyEnforcement(AutoScalePolicyEnforcement.ENABLED)));
        model = BinaryData.fromObject(model).toObject(ElasticSanInner.class);
        Assertions.assertEquals("t", model.location());
        Assertions.assertEquals("eic", model.tags().get("twnpzaoqvuhrhcf"));
        Assertions.assertEquals(SkuName.PREMIUM_ZRS, model.sku().name());
        Assertions.assertEquals(SkuTier.PREMIUM, model.sku().tier());
        Assertions.assertEquals("izgazxu", model.availabilityZones().get(0));
        Assertions.assertEquals(2309073457131020260L, model.baseSizeTiB());
        Assertions.assertEquals(3785168823699765982L, model.extendedCapacitySizeTiB());
        Assertions.assertEquals(PublicNetworkAccess.ENABLED, model.publicNetworkAccess());
        Assertions.assertEquals(1834498715663622205L, model.autoScaleProperties().scaleUpProperties().unusedSizeTiB());
        Assertions.assertEquals(4100986999398487835L,
            model.autoScaleProperties().scaleUpProperties().increaseCapacityUnitByTiB());
        Assertions.assertEquals(8633559293771225558L,
            model.autoScaleProperties().scaleUpProperties().capacityUnitScaleUpLimitTiB());
        Assertions.assertEquals(AutoScalePolicyEnforcement.ENABLED,
            model.autoScaleProperties().scaleUpProperties().autoScalePolicyEnforcement());
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
