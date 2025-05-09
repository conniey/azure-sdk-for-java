// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.networkcloud.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.networkcloud.fluent.models.TrunkedNetworkProperties;
import com.azure.resourcemanager.networkcloud.models.HybridAksPluginType;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class TrunkedNetworkPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        TrunkedNetworkProperties model = BinaryData.fromString(
            "{\"associatedResourceIds\":[\"goeiybbabpfhvfsl\"],\"clusterId\":\"ntjlr\",\"detailedStatus\":\"Available\",\"detailedStatusMessage\":\"s\",\"hybridAksClustersAssociatedIds\":[\"ioovzidsxwaab\",\"mifrygznmma\"],\"hybridAksPluginType\":\"OSDevice\",\"interfaceName\":\"kzobgopxlhsln\",\"isolationDomainIds\":[\"xieixynllxec\",\"crojp\",\"slhcawjutifd\",\"fmvigorqjbttzh\"],\"provisioningState\":\"Accepted\",\"virtualMachinesAssociatedIds\":[\"afhonqj\",\"jeick\"],\"vlans\":[8401701836836871470,846774673417890479]}")
            .toObject(TrunkedNetworkProperties.class);
        Assertions.assertEquals(HybridAksPluginType.OSDEVICE, model.hybridAksPluginType());
        Assertions.assertEquals("kzobgopxlhsln", model.interfaceName());
        Assertions.assertEquals("xieixynllxec", model.isolationDomainIds().get(0));
        Assertions.assertEquals(8401701836836871470L, model.vlans().get(0));
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        TrunkedNetworkProperties model
            = new TrunkedNetworkProperties().withHybridAksPluginType(HybridAksPluginType.OSDEVICE)
                .withInterfaceName("kzobgopxlhsln")
                .withIsolationDomainIds(Arrays.asList("xieixynllxec", "crojp", "slhcawjutifd", "fmvigorqjbttzh"))
                .withVlans(Arrays.asList(8401701836836871470L, 846774673417890479L));
        model = BinaryData.fromObject(model).toObject(TrunkedNetworkProperties.class);
        Assertions.assertEquals(HybridAksPluginType.OSDEVICE, model.hybridAksPluginType());
        Assertions.assertEquals("kzobgopxlhsln", model.interfaceName());
        Assertions.assertEquals("xieixynllxec", model.isolationDomainIds().get(0));
        Assertions.assertEquals(8401701836836871470L, model.vlans().get(0));
    }
}
