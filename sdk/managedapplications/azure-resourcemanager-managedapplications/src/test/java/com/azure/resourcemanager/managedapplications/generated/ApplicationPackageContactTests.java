// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managedapplications.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.managedapplications.models.ApplicationPackageContact;
import org.junit.jupiter.api.Assertions;

public final class ApplicationPackageContactTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ApplicationPackageContact model
            = BinaryData.fromString("{\"contactName\":\"p\",\"email\":\"wnzlljfmppeeb\",\"phone\":\"mgxsab\"}")
                .toObject(ApplicationPackageContact.class);
        Assertions.assertEquals("p", model.contactName());
        Assertions.assertEquals("wnzlljfmppeeb", model.email());
        Assertions.assertEquals("mgxsab", model.phone());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ApplicationPackageContact model
            = new ApplicationPackageContact().withContactName("p").withEmail("wnzlljfmppeeb").withPhone("mgxsab");
        model = BinaryData.fromObject(model).toObject(ApplicationPackageContact.class);
        Assertions.assertEquals("p", model.contactName());
        Assertions.assertEquals("wnzlljfmppeeb", model.email());
        Assertions.assertEquals("mgxsab", model.phone());
    }
}
