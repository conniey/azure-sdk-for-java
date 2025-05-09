// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.devopsinfrastructure.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.devopsinfrastructure.models.Organization;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class OrganizationTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        Organization model = BinaryData.fromString(
            "{\"url\":\"cciqihnhungbwjz\",\"projects\":[\"ygxgispemvtz\",\"kufubljo\",\"xqeofjaeqjhqjba\",\"v\"],\"parallelism\":171596164,\"openAccess\":true}")
            .toObject(Organization.class);
        Assertions.assertEquals("cciqihnhungbwjz", model.url());
        Assertions.assertEquals("ygxgispemvtz", model.projects().get(0));
        Assertions.assertEquals(171596164, model.parallelism());
        Assertions.assertEquals(true, model.openAccess());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        Organization model = new Organization().withUrl("cciqihnhungbwjz")
            .withProjects(Arrays.asList("ygxgispemvtz", "kufubljo", "xqeofjaeqjhqjba", "v"))
            .withParallelism(171596164)
            .withOpenAccess(true);
        model = BinaryData.fromObject(model).toObject(Organization.class);
        Assertions.assertEquals("cciqihnhungbwjz", model.url());
        Assertions.assertEquals("ygxgispemvtz", model.projects().get(0));
        Assertions.assertEquals(171596164, model.parallelism());
        Assertions.assertEquals(true, model.openAccess());
    }
}
