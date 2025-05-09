// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.networkcloud.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.networkcloud.fluent.models.RackSkuInner;

public final class RackSkuInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        RackSkuInner model = BinaryData.fromString(
            "{\"properties\":{\"computeMachines\":[{\"properties\":{\"bootstrapProtocol\":\"PXE\",\"cpuCores\":888642372039635640,\"cpuSockets\":8160781692945966905,\"disks\":[{},{},{},{}],\"generation\":\"miccwrwfscjfnyn\",\"hardwareVersion\":\"qujizdvo\",\"memoryCapacityGB\":3944055634041307779,\"model\":\"yo\",\"networkInterfaces\":[{},{},{}],\"totalThreads\":5557233869903086465,\"vendor\":\"vutpthjoxo\"},\"rackSlot\":6108199465615319832},{\"properties\":{\"bootstrapProtocol\":\"PXE\",\"cpuCores\":3400282192203398629,\"cpuSockets\":3592277160586581576,\"disks\":[{},{},{}],\"generation\":\"kcgxxlxsffgcvi\",\"hardwareVersion\":\"zdwlvwlyoupfgfb\",\"memoryCapacityGB\":7653162173647164897,\"model\":\"yhgk\",\"networkInterfaces\":[{}],\"totalThreads\":4124544827733339549,\"vendor\":\"wzf\"},\"rackSlot\":3380683286200803477},{\"properties\":{\"bootstrapProtocol\":\"PXE\",\"cpuCores\":5520677531853697776,\"cpuSockets\":8337858708318804101,\"disks\":[{}],\"generation\":\"tgzukxitmmqt\",\"hardwareVersion\":\"qqxhrnxrxcpj\",\"memoryCapacityGB\":250519210827189161,\"model\":\"okqdzfvaz\",\"networkInterfaces\":[{},{}],\"totalThreads\":6005863235340775058,\"vendor\":\"ttbaj\"},\"rackSlot\":1448856954480483873}],\"controllerMachines\":[{\"properties\":{\"bootstrapProtocol\":\"PXE\",\"cpuCores\":8960034655868417955,\"cpuSockets\":5236890965900963665,\"disks\":[{}],\"generation\":\"uvscxkdmligov\",\"hardwareVersion\":\"rxkpmloazuruoc\",\"memoryCapacityGB\":4371702987372642461,\"model\":\"bteoybf\",\"networkInterfaces\":[{},{},{}],\"totalThreads\":8160893474673190380,\"vendor\":\"jgslordilmyww\"},\"rackSlot\":2257431826333496773},{\"properties\":{\"bootstrapProtocol\":\"PXE\",\"cpuCores\":3602711689175641143,\"cpuSockets\":3535980306493011205,\"disks\":[{},{},{}],\"generation\":\"tjuewbcihx\",\"hardwareVersion\":\"whcjyxcc\",\"memoryCapacityGB\":4169856614299930706,\"model\":\"yakk\",\"networkInterfaces\":[{}],\"totalThreads\":7619120226745312866,\"vendor\":\"jplmagstcy\"},\"rackSlot\":7553431900772779958},{\"properties\":{\"bootstrapProtocol\":\"PXE\",\"cpuCores\":5919393435123205007,\"cpuSockets\":5815324328947235732,\"disks\":[{}],\"generation\":\"jkmnwq\",\"hardwareVersion\":\"obaiyhddviaceg\",\"memoryCapacityGB\":1142920457313863464,\"model\":\"fpmvmemfnczd\",\"networkInterfaces\":[{},{},{}],\"totalThreads\":394367996793890688,\"vendor\":\"lllchpodb\"},\"rackSlot\":5385185048993104627}],\"description\":\"dnhfuk\",\"maxClusterSlots\":8309513907312976293,\"provisioningState\":\"Failed\",\"rackType\":\"Aggregator\",\"storageAppliances\":[{\"properties\":{\"capacityGB\":9140852842074037544,\"model\":\"qypfcv\"},\"rackSlot\":8425843530988908642},{\"properties\":{\"capacityGB\":5159733612536906476,\"model\":\"f\"},\"rackSlot\":2348039047945974059},{\"properties\":{\"capacityGB\":8640705401011653724,\"model\":\"cxsspuunnoxyh\"},\"rackSlot\":61183054400038625}],\"supportedRackSkuIds\":[\"rihpfhoq\",\"aaewdaomdjv\",\"pjxxkzb\",\"msgeivsiykzk\"]},\"id\":\"cjdx\",\"name\":\"nbzoggcu\",\"type\":\"apzwyrpgog\"}")
            .toObject(RackSkuInner.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        RackSkuInner model = new RackSkuInner();
        model = BinaryData.fromObject(model).toObject(RackSkuInner.class);
    }
}
