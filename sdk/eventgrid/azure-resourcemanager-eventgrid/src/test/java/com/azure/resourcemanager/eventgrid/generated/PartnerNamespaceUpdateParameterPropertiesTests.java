// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.eventgrid.fluent.models.PartnerNamespaceUpdateParameterProperties;
import com.azure.resourcemanager.eventgrid.models.InboundIpRule;
import com.azure.resourcemanager.eventgrid.models.IpActionType;
import com.azure.resourcemanager.eventgrid.models.PublicNetworkAccess;
import com.azure.resourcemanager.eventgrid.models.TlsVersion;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class PartnerNamespaceUpdateParameterPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        PartnerNamespaceUpdateParameterProperties model = BinaryData.fromString(
            "{\"publicNetworkAccess\":\"Disabled\",\"inboundIpRules\":[{\"ipMask\":\"qgatjeaahhvjhhn\",\"action\":\"Allow\"},{\"ipMask\":\"bbjjidjksyxk\",\"action\":\"Allow\"},{\"ipMask\":\"evblbje\",\"action\":\"Allow\"},{\"ipMask\":\"lageuaulxun\",\"action\":\"Allow\"}],\"minimumTlsVersionAllowed\":\"1.2\",\"disableLocalAuth\":true}")
            .toObject(PartnerNamespaceUpdateParameterProperties.class);
        Assertions.assertEquals(PublicNetworkAccess.DISABLED, model.publicNetworkAccess());
        Assertions.assertEquals("qgatjeaahhvjhhn", model.inboundIpRules().get(0).ipMask());
        Assertions.assertEquals(IpActionType.ALLOW, model.inboundIpRules().get(0).action());
        Assertions.assertEquals(TlsVersion.ONE_TWO, model.minimumTlsVersionAllowed());
        Assertions.assertTrue(model.disableLocalAuth());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        PartnerNamespaceUpdateParameterProperties model
            = new PartnerNamespaceUpdateParameterProperties().withPublicNetworkAccess(PublicNetworkAccess.DISABLED)
                .withInboundIpRules(
                    Arrays.asList(new InboundIpRule().withIpMask("qgatjeaahhvjhhn").withAction(IpActionType.ALLOW),
                        new InboundIpRule().withIpMask("bbjjidjksyxk").withAction(IpActionType.ALLOW),
                        new InboundIpRule().withIpMask("evblbje").withAction(IpActionType.ALLOW),
                        new InboundIpRule().withIpMask("lageuaulxun").withAction(IpActionType.ALLOW)))
                .withMinimumTlsVersionAllowed(TlsVersion.ONE_TWO)
                .withDisableLocalAuth(true);
        model = BinaryData.fromObject(model).toObject(PartnerNamespaceUpdateParameterProperties.class);
        Assertions.assertEquals(PublicNetworkAccess.DISABLED, model.publicNetworkAccess());
        Assertions.assertEquals("qgatjeaahhvjhhn", model.inboundIpRules().get(0).ipMask());
        Assertions.assertEquals(IpActionType.ALLOW, model.inboundIpRules().get(0).action());
        Assertions.assertEquals(TlsVersion.ONE_TWO, model.minimumTlsVersionAllowed());
        Assertions.assertTrue(model.disableLocalAuth());
    }
}
