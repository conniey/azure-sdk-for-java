// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.apimanagement.fluent.models.UserContractInner;
import com.azure.resourcemanager.apimanagement.fluent.models.UserIdentityContractInner;
import com.azure.resourcemanager.apimanagement.models.UserState;
import java.time.OffsetDateTime;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class UserContractInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        UserContractInner model = BinaryData.fromString(
            "{\"properties\":{\"firstName\":\"fculzjrmhpfyw\",\"lastName\":\"ldqpzf\",\"email\":\"soxinu\",\"registrationDate\":\"2021-04-15T23:14:57Z\",\"groups\":[{\"displayName\":\"drocqsxytq\",\"description\":\"cmiwdw\",\"builtIn\":false,\"type\":\"external\",\"externalId\":\"ylajam\"}],\"state\":\"active\",\"note\":\"hftpzcrrykll\",\"identities\":[{\"provider\":\"anhkigglclwalh\",\"id\":\"bhgzphetxdq\"},{\"provider\":\"yctajqz\",\"id\":\"alec\"},{\"provider\":\"ibiwksdegyxsb\",\"id\":\"zvoikvntwczf\"},{\"provider\":\"ushlcxpblalh\",\"id\":\"zpfkis\"}]},\"id\":\"aidqzsaaoqdsgpto\",\"name\":\"xjqfiafcnlrtbfi\",\"type\":\"zzcaoijolbuauk\"}")
            .toObject(UserContractInner.class);
        Assertions.assertEquals("fculzjrmhpfyw", model.firstName());
        Assertions.assertEquals("ldqpzf", model.lastName());
        Assertions.assertEquals("soxinu", model.email());
        Assertions.assertEquals(OffsetDateTime.parse("2021-04-15T23:14:57Z"), model.registrationDate());
        Assertions.assertEquals(UserState.ACTIVE, model.state());
        Assertions.assertEquals("hftpzcrrykll", model.note());
        Assertions.assertEquals("anhkigglclwalh", model.identities().get(0).provider());
        Assertions.assertEquals("bhgzphetxdq", model.identities().get(0).id());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        UserContractInner model = new UserContractInner().withFirstName("fculzjrmhpfyw")
            .withLastName("ldqpzf")
            .withEmail("soxinu")
            .withRegistrationDate(OffsetDateTime.parse("2021-04-15T23:14:57Z"))
            .withState(UserState.ACTIVE)
            .withNote("hftpzcrrykll")
            .withIdentities(
                Arrays.asList(new UserIdentityContractInner().withProvider("anhkigglclwalh").withId("bhgzphetxdq"),
                    new UserIdentityContractInner().withProvider("yctajqz").withId("alec"),
                    new UserIdentityContractInner().withProvider("ibiwksdegyxsb").withId("zvoikvntwczf"),
                    new UserIdentityContractInner().withProvider("ushlcxpblalh").withId("zpfkis")));
        model = BinaryData.fromObject(model).toObject(UserContractInner.class);
        Assertions.assertEquals("fculzjrmhpfyw", model.firstName());
        Assertions.assertEquals("ldqpzf", model.lastName());
        Assertions.assertEquals("soxinu", model.email());
        Assertions.assertEquals(OffsetDateTime.parse("2021-04-15T23:14:57Z"), model.registrationDate());
        Assertions.assertEquals(UserState.ACTIVE, model.state());
        Assertions.assertEquals("hftpzcrrykll", model.note());
        Assertions.assertEquals("anhkigglclwalh", model.identities().get(0).provider());
        Assertions.assertEquals("bhgzphetxdq", model.identities().get(0).id());
    }
}
