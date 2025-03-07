// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.logz.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.logz.models.UserInfo;
import org.junit.jupiter.api.Assertions;

public final class UserInfoTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        UserInfo model = BinaryData.fromString(
            "{\"firstName\":\"uexhdzx\",\"lastName\":\"qeojnxqbzvddntw\",\"emailAddress\":\"eic\",\"phoneNumber\":\"w\"}")
            .toObject(UserInfo.class);
        Assertions.assertEquals("uexhdzx", model.firstName());
        Assertions.assertEquals("qeojnxqbzvddntw", model.lastName());
        Assertions.assertEquals("eic", model.emailAddress());
        Assertions.assertEquals("w", model.phoneNumber());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        UserInfo model = new UserInfo().withFirstName("uexhdzx")
            .withLastName("qeojnxqbzvddntw")
            .withEmailAddress("eic")
            .withPhoneNumber("w");
        model = BinaryData.fromObject(model).toObject(UserInfo.class);
        Assertions.assertEquals("uexhdzx", model.firstName());
        Assertions.assertEquals("qeojnxqbzvddntw", model.lastName());
        Assertions.assertEquals("eic", model.emailAddress());
        Assertions.assertEquals("w", model.phoneNumber());
    }
}
