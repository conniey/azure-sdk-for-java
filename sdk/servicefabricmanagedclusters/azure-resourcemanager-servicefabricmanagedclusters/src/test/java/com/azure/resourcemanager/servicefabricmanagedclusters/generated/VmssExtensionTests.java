// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.servicefabricmanagedclusters.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.servicefabricmanagedclusters.models.VmssExtension;
import com.azure.resourcemanager.servicefabricmanagedclusters.models.VmssExtensionSetupOrder;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class VmssExtensionTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        VmssExtension model = BinaryData.fromString(
            "{\"name\":\"wws\",\"properties\":{\"publisher\":\"ughftqsx\",\"type\":\"qxujxukndxd\",\"typeHandlerVersion\":\"grjguufzd\",\"autoUpgradeMinorVersion\":false,\"settings\":\"datatfih\",\"protectedSettings\":\"databotzingamvppho\",\"forceUpdateTag\":\"qzudphq\",\"provisionAfterExtensions\":[\"dkfw\",\"nwcvtbvkayhmtnv\",\"qiatkzwpcnp\",\"zcjaesgvvsccy\"],\"provisioningState\":\"g\",\"enableAutomaticUpgrade\":true,\"setupOrder\":[\"BeforeSFRuntime\",\"BeforeSFRuntime\",\"BeforeSFRuntime\",\"BeforeSFRuntime\"]}}")
            .toObject(VmssExtension.class);
        Assertions.assertEquals("wws", model.name());
        Assertions.assertEquals("ughftqsx", model.publisher());
        Assertions.assertEquals("qxujxukndxd", model.type());
        Assertions.assertEquals("grjguufzd", model.typeHandlerVersion());
        Assertions.assertFalse(model.autoUpgradeMinorVersion());
        Assertions.assertEquals("qzudphq", model.forceUpdateTag());
        Assertions.assertEquals("dkfw", model.provisionAfterExtensions().get(0));
        Assertions.assertTrue(model.enableAutomaticUpgrade());
        Assertions.assertEquals(VmssExtensionSetupOrder.BEFORE_SFRUNTIME, model.setupOrder().get(0));
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        VmssExtension model = new VmssExtension().withName("wws")
            .withPublisher("ughftqsx")
            .withType("qxujxukndxd")
            .withTypeHandlerVersion("grjguufzd")
            .withAutoUpgradeMinorVersion(false)
            .withSettings("datatfih")
            .withProtectedSettings("databotzingamvppho")
            .withForceUpdateTag("qzudphq")
            .withProvisionAfterExtensions(Arrays.asList("dkfw", "nwcvtbvkayhmtnv", "qiatkzwpcnp", "zcjaesgvvsccy"))
            .withEnableAutomaticUpgrade(true)
            .withSetupOrder(
                Arrays.asList(VmssExtensionSetupOrder.BEFORE_SFRUNTIME, VmssExtensionSetupOrder.BEFORE_SFRUNTIME,
                    VmssExtensionSetupOrder.BEFORE_SFRUNTIME, VmssExtensionSetupOrder.BEFORE_SFRUNTIME));
        model = BinaryData.fromObject(model).toObject(VmssExtension.class);
        Assertions.assertEquals("wws", model.name());
        Assertions.assertEquals("ughftqsx", model.publisher());
        Assertions.assertEquals("qxujxukndxd", model.type());
        Assertions.assertEquals("grjguufzd", model.typeHandlerVersion());
        Assertions.assertFalse(model.autoUpgradeMinorVersion());
        Assertions.assertEquals("qzudphq", model.forceUpdateTag());
        Assertions.assertEquals("dkfw", model.provisionAfterExtensions().get(0));
        Assertions.assertTrue(model.enableAutomaticUpgrade());
        Assertions.assertEquals(VmssExtensionSetupOrder.BEFORE_SFRUNTIME, model.setupOrder().get(0));
    }
}
