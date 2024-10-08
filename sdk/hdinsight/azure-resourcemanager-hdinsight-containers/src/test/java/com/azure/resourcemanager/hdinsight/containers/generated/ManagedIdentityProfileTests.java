// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hdinsight.containers.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.hdinsight.containers.models.ManagedIdentityProfile;
import com.azure.resourcemanager.hdinsight.containers.models.ManagedIdentitySpec;
import com.azure.resourcemanager.hdinsight.containers.models.ManagedIdentityType;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class ManagedIdentityProfileTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ManagedIdentityProfile model = BinaryData.fromString(
            "{\"identityList\":[{\"type\":\"user\",\"resourceId\":\"ik\",\"clientId\":\"drgvtqagn\",\"objectId\":\"uynhijg\"},{\"type\":\"user\",\"resourceId\":\"ebf\",\"clientId\":\"iarbutrcvpna\",\"objectId\":\"zmhjrunmp\"},{\"type\":\"user\",\"resourceId\":\"tdbhrbnla\",\"clientId\":\"kx\",\"objectId\":\"yskpbhen\"}]}")
            .toObject(ManagedIdentityProfile.class);
        Assertions.assertEquals(ManagedIdentityType.USER, model.identityList().get(0).type());
        Assertions.assertEquals("ik", model.identityList().get(0).resourceId());
        Assertions.assertEquals("drgvtqagn", model.identityList().get(0).clientId());
        Assertions.assertEquals("uynhijg", model.identityList().get(0).objectId());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ManagedIdentityProfile model = new ManagedIdentityProfile().withIdentityList(Arrays.asList(
            new ManagedIdentitySpec().withType(ManagedIdentityType.USER)
                .withResourceId("ik")
                .withClientId("drgvtqagn")
                .withObjectId("uynhijg"),
            new ManagedIdentitySpec().withType(ManagedIdentityType.USER)
                .withResourceId("ebf")
                .withClientId("iarbutrcvpna")
                .withObjectId("zmhjrunmp"),
            new ManagedIdentitySpec().withType(ManagedIdentityType.USER)
                .withResourceId("tdbhrbnla")
                .withClientId("kx")
                .withObjectId("yskpbhen")));
        model = BinaryData.fromObject(model).toObject(ManagedIdentityProfile.class);
        Assertions.assertEquals(ManagedIdentityType.USER, model.identityList().get(0).type());
        Assertions.assertEquals("ik", model.identityList().get(0).resourceId());
        Assertions.assertEquals("drgvtqagn", model.identityList().get(0).clientId());
        Assertions.assertEquals("uynhijg", model.identityList().get(0).objectId());
    }
}
