// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.security.fluent.models.TopologyResourceProperties;

public final class TopologyResourcePropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        TopologyResourceProperties model = BinaryData.fromString(
            "{\"calculatedDateTime\":\"2021-09-19T18:37:58Z\",\"topologyResources\":[{\"resourceId\":\"dhsoymhpv\",\"severity\":\"qfttehdpboujs\",\"recommendationsExist\":true,\"networkZones\":\"vdshxcdedsuen\",\"topologyScore\":805678628,\"location\":\"cgjtfrnquktrfn\",\"parents\":[{\"resourceId\":\"rxsmyltrw\"},{\"resourceId\":\"fmtbgwjdxwn\"},{\"resourceId\":\"kurrdreyzjwh\"},{\"resourceId\":\"twwjwzzq\"}],\"children\":[{\"resourceId\":\"uukykcyqh\"}]},{\"resourceId\":\"qzzdcykeyste\",\"severity\":\"opazdazgbs\",\"recommendationsExist\":false,\"networkZones\":\"wqcfutmdpvozg\",\"topologyScore\":892446808,\"location\":\"kn\",\"parents\":[{\"resourceId\":\"ctzeyowmndc\"},{\"resourceId\":\"dwzqauxzanhmkvfr\"}],\"children\":[{\"resourceId\":\"drbcp\"},{\"resourceId\":\"xudqyemebunaucmc\"},{\"resourceId\":\"tneemmjauwcgxef\"}]},{\"resourceId\":\"haitranize\",\"severity\":\"gudasmxubvfb\",\"recommendationsExist\":true,\"networkZones\":\"ocefhpriylfmpzt\",\"topologyScore\":402992513,\"location\":\"svhl\",\"parents\":[{\"resourceId\":\"lregpq\"},{\"resourceId\":\"ojhvrz\"},{\"resourceId\":\"vgysh\"}],\"children\":[{\"resourceId\":\"rtwmewjzlpykcfaz\"},{\"resourceId\":\"jcayerzrransyby\"}]},{\"resourceId\":\"ol\",\"severity\":\"rghsrleinkfsc\",\"recommendationsExist\":false,\"networkZones\":\"jwvuag\",\"topologyScore\":1685076909,\"location\":\"ltngvmreupt\",\"parents\":[{\"resourceId\":\"m\"},{\"resourceId\":\"ajwolxfs\"},{\"resourceId\":\"ghmp\"},{\"resourceId\":\"wl\"}],\"children\":[{\"resourceId\":\"igt\"},{\"resourceId\":\"cvbxqlapsnss\"},{\"resourceId\":\"yxpavidnie\"}]}]}")
            .toObject(TopologyResourceProperties.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        TopologyResourceProperties model = new TopologyResourceProperties();
        model = BinaryData.fromObject(model).toObject(TopologyResourceProperties.class);
    }
}
