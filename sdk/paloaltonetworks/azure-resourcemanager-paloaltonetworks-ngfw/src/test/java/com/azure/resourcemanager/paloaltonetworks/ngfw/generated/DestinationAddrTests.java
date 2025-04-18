// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.paloaltonetworks.ngfw.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.paloaltonetworks.ngfw.models.DestinationAddr;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class DestinationAddrTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        DestinationAddr model = BinaryData.fromString(
            "{\"cidrs\":[\"bkrvrnsvshqj\",\"hxcr\",\"bfovasrruvwbhsq\"],\"countries\":[\"bcgjbirxbp\",\"bsrfbj\",\"dtws\"],\"feeds\":[\"ftpvjzbexil\"],\"prefixLists\":[\"fqqnvwpmqtaruo\",\"jmkcjhwqytj\"],\"fqdnLists\":[\"n\"]}")
            .toObject(DestinationAddr.class);
        Assertions.assertEquals("bkrvrnsvshqj", model.cidrs().get(0));
        Assertions.assertEquals("bcgjbirxbp", model.countries().get(0));
        Assertions.assertEquals("ftpvjzbexil", model.feeds().get(0));
        Assertions.assertEquals("fqqnvwpmqtaruo", model.prefixLists().get(0));
        Assertions.assertEquals("n", model.fqdnLists().get(0));
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        DestinationAddr model
            = new DestinationAddr().withCidrs(Arrays.asList("bkrvrnsvshqj", "hxcr", "bfovasrruvwbhsq"))
                .withCountries(Arrays.asList("bcgjbirxbp", "bsrfbj", "dtws"))
                .withFeeds(Arrays.asList("ftpvjzbexil"))
                .withPrefixLists(Arrays.asList("fqqnvwpmqtaruo", "jmkcjhwqytj"))
                .withFqdnLists(Arrays.asList("n"));
        model = BinaryData.fromObject(model).toObject(DestinationAddr.class);
        Assertions.assertEquals("bkrvrnsvshqj", model.cidrs().get(0));
        Assertions.assertEquals("bcgjbirxbp", model.countries().get(0));
        Assertions.assertEquals("ftpvjzbexil", model.feeds().get(0));
        Assertions.assertEquals("fqqnvwpmqtaruo", model.prefixLists().get(0));
        Assertions.assertEquals("n", model.fqdnLists().get(0));
    }
}
