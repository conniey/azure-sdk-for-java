// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.ClusterFailoverJobDetails;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.FailoverReplicationProtectedItemDetails;
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class ClusterFailoverJobDetailsTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ClusterFailoverJobDetails model = BinaryData.fromString(
            "{\"instanceType\":\"ClusterFailoverJobDetails\",\"protectedItemDetails\":[{\"name\":\"quevham\",\"friendlyName\":\"wg\",\"testVmName\":\"tmk\",\"testVmFriendlyName\":\"xpk\",\"networkConnectionStatus\":\"aqxofqov\",\"networkFriendlyName\":\"iqbplvfidusz\",\"subnet\":\"kxbyjg\",\"recoveryPointId\":\"fepxyihpqadag\",\"recoveryPointTime\":\"2021-11-13T12:07:33Z\"},{\"name\":\"icxdwyjfo\",\"friendlyName\":\"wyov\",\"testVmName\":\"j\",\"testVmFriendlyName\":\"bi\",\"networkConnectionStatus\":\"ukdveksbuhoduc\",\"networkFriendlyName\":\"lscrdpibfdyjduss\",\"subnet\":\"szekbh\",\"recoveryPointId\":\"kaaggkreh\",\"recoveryPointTime\":\"2021-04-09T02:08:13Z\"},{\"name\":\"uybffljfiim\",\"friendlyName\":\"oags\",\"testVmName\":\"aadusrexxfa\",\"testVmFriendlyName\":\"qwudoh\",\"networkConnectionStatus\":\"lfmn\",\"networkFriendlyName\":\"kpsimsfeypofqp\",\"subnet\":\"hyqgsdrmmttjx\",\"recoveryPointId\":\"hgerhsmvg\",\"recoveryPointTime\":\"2021-10-06T10:20:01Z\"}],\"affectedObjectDetails\":{\"wwmhkruwae\":\"mqilrixysfnimsqy\",\"in\":\"rympmlq\",\"njdiqfliejhpcl\":\"zduewihapfjii\",\"bv\":\"iedfsbwcei\"}}")
            .toObject(ClusterFailoverJobDetails.class);
        Assertions.assertEquals("mqilrixysfnimsqy", model.affectedObjectDetails().get("wwmhkruwae"));
        Assertions.assertEquals("quevham", model.protectedItemDetails().get(0).name());
        Assertions.assertEquals("wg", model.protectedItemDetails().get(0).friendlyName());
        Assertions.assertEquals("tmk", model.protectedItemDetails().get(0).testVmName());
        Assertions.assertEquals("xpk", model.protectedItemDetails().get(0).testVmFriendlyName());
        Assertions.assertEquals("aqxofqov", model.protectedItemDetails().get(0).networkConnectionStatus());
        Assertions.assertEquals("iqbplvfidusz", model.protectedItemDetails().get(0).networkFriendlyName());
        Assertions.assertEquals("kxbyjg", model.protectedItemDetails().get(0).subnet());
        Assertions.assertEquals("fepxyihpqadag", model.protectedItemDetails().get(0).recoveryPointId());
        Assertions.assertEquals(OffsetDateTime.parse("2021-11-13T12:07:33Z"),
            model.protectedItemDetails().get(0).recoveryPointTime());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ClusterFailoverJobDetails model = new ClusterFailoverJobDetails()
            .withAffectedObjectDetails(mapOf("wwmhkruwae", "mqilrixysfnimsqy", "in", "rympmlq", "njdiqfliejhpcl",
                "zduewihapfjii", "bv", "iedfsbwcei"))
            .withProtectedItemDetails(Arrays.asList(
                new FailoverReplicationProtectedItemDetails().withName("quevham")
                    .withFriendlyName("wg")
                    .withTestVmName("tmk")
                    .withTestVmFriendlyName("xpk")
                    .withNetworkConnectionStatus("aqxofqov")
                    .withNetworkFriendlyName("iqbplvfidusz")
                    .withSubnet("kxbyjg")
                    .withRecoveryPointId("fepxyihpqadag")
                    .withRecoveryPointTime(OffsetDateTime.parse("2021-11-13T12:07:33Z")),
                new FailoverReplicationProtectedItemDetails().withName("icxdwyjfo")
                    .withFriendlyName("wyov")
                    .withTestVmName("j")
                    .withTestVmFriendlyName("bi")
                    .withNetworkConnectionStatus("ukdveksbuhoduc")
                    .withNetworkFriendlyName("lscrdpibfdyjduss")
                    .withSubnet("szekbh")
                    .withRecoveryPointId("kaaggkreh")
                    .withRecoveryPointTime(OffsetDateTime.parse("2021-04-09T02:08:13Z")),
                new FailoverReplicationProtectedItemDetails().withName("uybffljfiim")
                    .withFriendlyName("oags")
                    .withTestVmName("aadusrexxfa")
                    .withTestVmFriendlyName("qwudoh")
                    .withNetworkConnectionStatus("lfmn")
                    .withNetworkFriendlyName("kpsimsfeypofqp")
                    .withSubnet("hyqgsdrmmttjx")
                    .withRecoveryPointId("hgerhsmvg")
                    .withRecoveryPointTime(OffsetDateTime.parse("2021-10-06T10:20:01Z"))));
        model = BinaryData.fromObject(model).toObject(ClusterFailoverJobDetails.class);
        Assertions.assertEquals("mqilrixysfnimsqy", model.affectedObjectDetails().get("wwmhkruwae"));
        Assertions.assertEquals("quevham", model.protectedItemDetails().get(0).name());
        Assertions.assertEquals("wg", model.protectedItemDetails().get(0).friendlyName());
        Assertions.assertEquals("tmk", model.protectedItemDetails().get(0).testVmName());
        Assertions.assertEquals("xpk", model.protectedItemDetails().get(0).testVmFriendlyName());
        Assertions.assertEquals("aqxofqov", model.protectedItemDetails().get(0).networkConnectionStatus());
        Assertions.assertEquals("iqbplvfidusz", model.protectedItemDetails().get(0).networkFriendlyName());
        Assertions.assertEquals("kxbyjg", model.protectedItemDetails().get(0).subnet());
        Assertions.assertEquals("fepxyihpqadag", model.protectedItemDetails().get(0).recoveryPointId());
        Assertions.assertEquals(OffsetDateTime.parse("2021-11-13T12:07:33Z"),
            model.protectedItemDetails().get(0).recoveryPointTime());
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
