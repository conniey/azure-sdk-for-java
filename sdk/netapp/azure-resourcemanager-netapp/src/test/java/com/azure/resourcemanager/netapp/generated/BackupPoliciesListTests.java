// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.netapp.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.netapp.fluent.models.BackupPolicyInner;
import com.azure.resourcemanager.netapp.models.BackupPoliciesList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class BackupPoliciesListTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        BackupPoliciesList model = BinaryData.fromString(
            "{\"value\":[{\"etag\":\"vdmovsmzlxwabm\",\"properties\":{\"backupPolicyId\":\"efkifr\",\"provisioningState\":\"puqujmqlgkfbtn\",\"dailyBackupsToKeep\":1601819937,\"weeklyBackupsToKeep\":146248988,\"monthlyBackupsToKeep\":396727385,\"volumesAssigned\":296030091,\"enabled\":true,\"volumeBackups\":[{\"volumeName\":\"tcje\",\"volumeResourceId\":\"twwaezkojvdcpzf\",\"backupsCount\":1481847492,\"policyEnabled\":false},{\"volumeName\":\"ybxarzgszu\",\"volumeResourceId\":\"x\",\"backupsCount\":95404001,\"policyEnabled\":false},{\"volumeName\":\"doamciodhkha\",\"volumeResourceId\":\"khnzbonlw\",\"backupsCount\":332286671,\"policyEnabled\":true},{\"volumeName\":\"kdwbwhkszz\",\"volumeResourceId\":\"rvexztvb\",\"backupsCount\":991988200,\"policyEnabled\":false}]},\"location\":\"aoyzkoow\",\"tags\":{\"uximerqfobw\":\"nguxawqaldsy\",\"r\":\"znkbykutwpfhpagm\",\"kkze\":\"kdsnfdsdoakgtdl\",\"sdsttwvog\":\"dlhewp\"},\"id\":\"bbejdcngqqm\",\"name\":\"akufgmjz\",\"type\":\"wr\"},{\"etag\":\"rtwaenuuzko\",\"properties\":{\"backupPolicyId\":\"minrfdw\",\"provisioningState\":\"uhhziuiefozbhdm\",\"dailyBackupsToKeep\":9753041,\"weeklyBackupsToKeep\":1101350352,\"monthlyBackupsToKeep\":1130868680,\"volumesAssigned\":280296096,\"enabled\":false,\"volumeBackups\":[{\"volumeName\":\"qu\",\"volumeResourceId\":\"hxicslfaoqz\",\"backupsCount\":1413149705,\"policyEnabled\":false}]},\"location\":\"alnswhccsphk\",\"tags\":{\"zbwemh\":\"witqscywuggwoluh\",\"sbrgz\":\"i\",\"ggicccnxqhue\":\"wmsweypqwd\"},\"id\":\"mkttlstvlzywem\",\"name\":\"zrncsdt\",\"type\":\"lusiy\"}]}")
            .toObject(BackupPoliciesList.class);
        Assertions.assertEquals("aoyzkoow", model.value().get(0).location());
        Assertions.assertEquals("nguxawqaldsy", model.value().get(0).tags().get("uximerqfobw"));
        Assertions.assertEquals(1601819937, model.value().get(0).dailyBackupsToKeep());
        Assertions.assertEquals(146248988, model.value().get(0).weeklyBackupsToKeep());
        Assertions.assertEquals(396727385, model.value().get(0).monthlyBackupsToKeep());
        Assertions.assertEquals(true, model.value().get(0).enabled());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        BackupPoliciesList model = new BackupPoliciesList().withValue(Arrays.asList(
            new BackupPolicyInner().withLocation("aoyzkoow")
                .withTags(mapOf("uximerqfobw", "nguxawqaldsy", "r", "znkbykutwpfhpagm", "kkze", "kdsnfdsdoakgtdl",
                    "sdsttwvog", "dlhewp"))
                .withDailyBackupsToKeep(1601819937)
                .withWeeklyBackupsToKeep(146248988)
                .withMonthlyBackupsToKeep(396727385)
                .withEnabled(true),
            new BackupPolicyInner().withLocation("alnswhccsphk")
                .withTags(mapOf("zbwemh", "witqscywuggwoluh", "sbrgz", "i", "ggicccnxqhue", "wmsweypqwd"))
                .withDailyBackupsToKeep(9753041)
                .withWeeklyBackupsToKeep(1101350352)
                .withMonthlyBackupsToKeep(1130868680)
                .withEnabled(false)));
        model = BinaryData.fromObject(model).toObject(BackupPoliciesList.class);
        Assertions.assertEquals("aoyzkoow", model.value().get(0).location());
        Assertions.assertEquals("nguxawqaldsy", model.value().get(0).tags().get("uximerqfobw"));
        Assertions.assertEquals(1601819937, model.value().get(0).dailyBackupsToKeep());
        Assertions.assertEquals(146248988, model.value().get(0).weeklyBackupsToKeep());
        Assertions.assertEquals(396727385, model.value().get(0).monthlyBackupsToKeep());
        Assertions.assertEquals(true, model.value().get(0).enabled());
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
