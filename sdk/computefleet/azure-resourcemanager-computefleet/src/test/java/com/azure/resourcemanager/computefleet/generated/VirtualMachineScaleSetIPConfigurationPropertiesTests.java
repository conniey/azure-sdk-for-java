// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.computefleet.generated;

import com.azure.core.management.SubResource;
import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.computefleet.models.ApiEntityReference;
import com.azure.resourcemanager.computefleet.models.DeleteOptions;
import com.azure.resourcemanager.computefleet.models.DomainNameLabelScopeTypes;
import com.azure.resourcemanager.computefleet.models.IPVersion;
import com.azure.resourcemanager.computefleet.models.PublicIPAddressSku;
import com.azure.resourcemanager.computefleet.models.PublicIPAddressSkuName;
import com.azure.resourcemanager.computefleet.models.PublicIPAddressSkuTier;
import com.azure.resourcemanager.computefleet.models.VirtualMachineScaleSetIPConfigurationProperties;
import com.azure.resourcemanager.computefleet.models.VirtualMachineScaleSetIpTag;
import com.azure.resourcemanager.computefleet.models.VirtualMachineScaleSetPublicIPAddressConfiguration;
import com.azure.resourcemanager.computefleet.models.VirtualMachineScaleSetPublicIPAddressConfigurationDnsSettings;
import com.azure.resourcemanager.computefleet.models.VirtualMachineScaleSetPublicIPAddressConfigurationProperties;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class VirtualMachineScaleSetIPConfigurationPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        VirtualMachineScaleSetIPConfigurationProperties model = BinaryData.fromString(
            "{\"subnet\":{\"id\":\"vuujq\"},\"primary\":false,\"publicIPAddressConfiguration\":{\"name\":\"kgj\",\"properties\":{\"idleTimeoutInMinutes\":1769769453,\"dnsSettings\":{\"domainNameLabel\":\"gvcl\",\"domainNameLabelScope\":\"ResourceGroupReuse\"},\"ipTags\":[{\"ipTagType\":\"ghkjeszzhbi\",\"tag\":\"txfvgx\"},{\"ipTagType\":\"smx\",\"tag\":\"hmpvecx\"}],\"publicIPPrefix\":{\"id\":\"ebfqkkrbm\"},\"publicIPAddressVersion\":\"IPv6\",\"deleteOption\":\"Detach\"},\"sku\":{\"name\":\"Basic\",\"tier\":\"Global\"}},\"privateIPAddressVersion\":\"IPv6\",\"applicationGatewayBackendAddressPools\":[{\"id\":\"puz\"},{\"id\":\"ispnqzahmgkbrp\"},{\"id\":\"dhibnuq\"}],\"applicationSecurityGroups\":[{\"id\":\"kadrgvt\"},{\"id\":\"gnbuy\"}],\"loadBalancerBackendAddressPools\":[{\"id\":\"gg\"},{\"id\":\"bfs\"},{\"id\":\"rbu\"}],\"loadBalancerInboundNatPools\":[{\"id\":\"pnazzm\"},{\"id\":\"runmp\"},{\"id\":\"tdbhrbnla\"},{\"id\":\"xmyskp\"}]}")
            .toObject(VirtualMachineScaleSetIPConfigurationProperties.class);
        Assertions.assertEquals("vuujq", model.subnet().id());
        Assertions.assertEquals(false, model.primary());
        Assertions.assertEquals("kgj", model.publicIPAddressConfiguration().name());
        Assertions.assertEquals(1769769453, model.publicIPAddressConfiguration().properties().idleTimeoutInMinutes());
        Assertions.assertEquals("gvcl",
            model.publicIPAddressConfiguration().properties().dnsSettings().domainNameLabel());
        Assertions.assertEquals(DomainNameLabelScopeTypes.RESOURCE_GROUP_REUSE,
            model.publicIPAddressConfiguration().properties().dnsSettings().domainNameLabelScope());
        Assertions.assertEquals("ghkjeszzhbi",
            model.publicIPAddressConfiguration().properties().ipTags().get(0).ipTagType());
        Assertions.assertEquals("txfvgx", model.publicIPAddressConfiguration().properties().ipTags().get(0).tag());
        Assertions.assertEquals("ebfqkkrbm", model.publicIPAddressConfiguration().properties().publicIPPrefix().id());
        Assertions.assertEquals(IPVersion.IPV6,
            model.publicIPAddressConfiguration().properties().publicIPAddressVersion());
        Assertions.assertEquals(DeleteOptions.DETACH, model.publicIPAddressConfiguration().properties().deleteOption());
        Assertions.assertEquals(PublicIPAddressSkuName.BASIC, model.publicIPAddressConfiguration().sku().name());
        Assertions.assertEquals(PublicIPAddressSkuTier.GLOBAL, model.publicIPAddressConfiguration().sku().tier());
        Assertions.assertEquals(IPVersion.IPV6, model.privateIPAddressVersion());
        Assertions.assertEquals("puz", model.applicationGatewayBackendAddressPools().get(0).id());
        Assertions.assertEquals("kadrgvt", model.applicationSecurityGroups().get(0).id());
        Assertions.assertEquals("gg", model.loadBalancerBackendAddressPools().get(0).id());
        Assertions.assertEquals("pnazzm", model.loadBalancerInboundNatPools().get(0).id());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        VirtualMachineScaleSetIPConfigurationProperties model = new VirtualMachineScaleSetIPConfigurationProperties()
            .withSubnet(new ApiEntityReference().withId("vuujq"))
            .withPrimary(false)
            .withPublicIPAddressConfiguration(new VirtualMachineScaleSetPublicIPAddressConfiguration().withName("kgj")
                .withProperties(new VirtualMachineScaleSetPublicIPAddressConfigurationProperties()
                    .withIdleTimeoutInMinutes(1769769453)
                    .withDnsSettings(
                        new VirtualMachineScaleSetPublicIPAddressConfigurationDnsSettings().withDomainNameLabel("gvcl")
                            .withDomainNameLabelScope(DomainNameLabelScopeTypes.RESOURCE_GROUP_REUSE))
                    .withIpTags(
                        Arrays.asList(new VirtualMachineScaleSetIpTag().withIpTagType("ghkjeszzhbi").withTag("txfvgx"),
                            new VirtualMachineScaleSetIpTag().withIpTagType("smx").withTag("hmpvecx")))
                    .withPublicIPPrefix(new SubResource().withId("ebfqkkrbm"))
                    .withPublicIPAddressVersion(IPVersion.IPV6)
                    .withDeleteOption(DeleteOptions.DETACH))
                .withSku(new PublicIPAddressSku().withName(PublicIPAddressSkuName.BASIC)
                    .withTier(PublicIPAddressSkuTier.GLOBAL)))
            .withPrivateIPAddressVersion(IPVersion.IPV6)
            .withApplicationGatewayBackendAddressPools(Arrays.asList(new SubResource().withId("puz"),
                new SubResource().withId("ispnqzahmgkbrp"), new SubResource().withId("dhibnuq")))
            .withApplicationSecurityGroups(
                Arrays.asList(new SubResource().withId("kadrgvt"), new SubResource().withId("gnbuy")))
            .withLoadBalancerBackendAddressPools(Arrays.asList(new SubResource().withId("gg"),
                new SubResource().withId("bfs"), new SubResource().withId("rbu")))
            .withLoadBalancerInboundNatPools(
                Arrays.asList(new SubResource().withId("pnazzm"), new SubResource().withId("runmp"),
                    new SubResource().withId("tdbhrbnla"), new SubResource().withId("xmyskp")));
        model = BinaryData.fromObject(model).toObject(VirtualMachineScaleSetIPConfigurationProperties.class);
        Assertions.assertEquals("vuujq", model.subnet().id());
        Assertions.assertEquals(false, model.primary());
        Assertions.assertEquals("kgj", model.publicIPAddressConfiguration().name());
        Assertions.assertEquals(1769769453, model.publicIPAddressConfiguration().properties().idleTimeoutInMinutes());
        Assertions.assertEquals("gvcl",
            model.publicIPAddressConfiguration().properties().dnsSettings().domainNameLabel());
        Assertions.assertEquals(DomainNameLabelScopeTypes.RESOURCE_GROUP_REUSE,
            model.publicIPAddressConfiguration().properties().dnsSettings().domainNameLabelScope());
        Assertions.assertEquals("ghkjeszzhbi",
            model.publicIPAddressConfiguration().properties().ipTags().get(0).ipTagType());
        Assertions.assertEquals("txfvgx", model.publicIPAddressConfiguration().properties().ipTags().get(0).tag());
        Assertions.assertEquals("ebfqkkrbm", model.publicIPAddressConfiguration().properties().publicIPPrefix().id());
        Assertions.assertEquals(IPVersion.IPV6,
            model.publicIPAddressConfiguration().properties().publicIPAddressVersion());
        Assertions.assertEquals(DeleteOptions.DETACH, model.publicIPAddressConfiguration().properties().deleteOption());
        Assertions.assertEquals(PublicIPAddressSkuName.BASIC, model.publicIPAddressConfiguration().sku().name());
        Assertions.assertEquals(PublicIPAddressSkuTier.GLOBAL, model.publicIPAddressConfiguration().sku().tier());
        Assertions.assertEquals(IPVersion.IPV6, model.privateIPAddressVersion());
        Assertions.assertEquals("puz", model.applicationGatewayBackendAddressPools().get(0).id());
        Assertions.assertEquals("kadrgvt", model.applicationSecurityGroups().get(0).id());
        Assertions.assertEquals("gg", model.loadBalancerBackendAddressPools().get(0).id());
        Assertions.assertEquals("pnazzm", model.loadBalancerInboundNatPools().get(0).id());
    }
}
