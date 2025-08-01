// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.eventgrid.models.InboundIpRule;
import com.azure.resourcemanager.eventgrid.models.IpActionType;
import com.azure.resourcemanager.eventgrid.models.PartnerNamespaceUpdateParameters;
import com.azure.resourcemanager.eventgrid.models.PublicNetworkAccess;
import com.azure.resourcemanager.eventgrid.models.TlsVersion;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class PartnerNamespaceUpdateParametersTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        PartnerNamespaceUpdateParameters model = BinaryData.fromString(
            "{\"tags\":{\"qhlwigdivbkbxgo\":\"ymo\",\"vdaeyyguxakjsq\":\"fajuwas\"},\"properties\":{\"publicNetworkAccess\":\"SecuredByPerimeter\",\"inboundIpRules\":[{\"ipMask\":\"gims\",\"action\":\"Allow\"},{\"ipMask\":\"sicddyvv\",\"action\":\"Allow\"}],\"minimumTlsVersionAllowed\":\"1.0\",\"disableLocalAuth\":false}}")
            .toObject(PartnerNamespaceUpdateParameters.class);
        Assertions.assertEquals("ymo", model.tags().get("qhlwigdivbkbxgo"));
        Assertions.assertEquals(PublicNetworkAccess.SECURED_BY_PERIMETER, model.publicNetworkAccess());
        Assertions.assertEquals("gims", model.inboundIpRules().get(0).ipMask());
        Assertions.assertEquals(IpActionType.ALLOW, model.inboundIpRules().get(0).action());
        Assertions.assertEquals(TlsVersion.ONE_ZERO, model.minimumTlsVersionAllowed());
        Assertions.assertFalse(model.disableLocalAuth());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        PartnerNamespaceUpdateParameters model = new PartnerNamespaceUpdateParameters()
            .withTags(mapOf("qhlwigdivbkbxgo", "ymo", "vdaeyyguxakjsq", "fajuwas"))
            .withPublicNetworkAccess(PublicNetworkAccess.SECURED_BY_PERIMETER)
            .withInboundIpRules(Arrays.asList(new InboundIpRule().withIpMask("gims").withAction(IpActionType.ALLOW),
                new InboundIpRule().withIpMask("sicddyvv").withAction(IpActionType.ALLOW)))
            .withMinimumTlsVersionAllowed(TlsVersion.ONE_ZERO)
            .withDisableLocalAuth(false);
        model = BinaryData.fromObject(model).toObject(PartnerNamespaceUpdateParameters.class);
        Assertions.assertEquals("ymo", model.tags().get("qhlwigdivbkbxgo"));
        Assertions.assertEquals(PublicNetworkAccess.SECURED_BY_PERIMETER, model.publicNetworkAccess());
        Assertions.assertEquals("gims", model.inboundIpRules().get(0).ipMask());
        Assertions.assertEquals(IpActionType.ALLOW, model.inboundIpRules().get(0).action());
        Assertions.assertEquals(TlsVersion.ONE_ZERO, model.minimumTlsVersionAllowed());
        Assertions.assertFalse(model.disableLocalAuth());
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
