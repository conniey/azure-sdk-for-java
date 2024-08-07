// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcontainers.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.appcontainers.models.JavaComponentConfigurationProperty;
import com.azure.resourcemanager.appcontainers.models.JavaComponentIngress;
import com.azure.resourcemanager.appcontainers.models.JavaComponentServiceBind;
import com.azure.resourcemanager.appcontainers.models.NacosComponent;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class NacosComponentTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        NacosComponent model = BinaryData.fromString(
            "{\"componentType\":\"Nacos\",\"ingress\":{\"fqdn\":\"uhvajmailfemjjza\"},\"provisioningState\":\"InProgress\",\"configurations\":[{\"propertyName\":\"ullqxbdmvrscm\",\"value\":\"rndb\"},{\"propertyName\":\"yeofltfnnxrkad\",\"value\":\"ynnfmuiii\"},{\"propertyName\":\"pfoh\",\"value\":\"fkx\"}],\"serviceBinds\":[{\"name\":\"r\",\"serviceId\":\"iutgnjizbeewoiy\"},{\"name\":\"vzbjuyrsrzi\",\"serviceId\":\"tixgbd\"},{\"name\":\"ifrevk\",\"serviceId\":\"pezkis\"},{\"name\":\"jm\",\"serviceId\":\"hsyparybjuf\"}]}")
            .toObject(NacosComponent.class);
        Assertions.assertEquals("ullqxbdmvrscm", model.configurations().get(0).propertyName());
        Assertions.assertEquals("rndb", model.configurations().get(0).value());
        Assertions.assertEquals("r", model.serviceBinds().get(0).name());
        Assertions.assertEquals("iutgnjizbeewoiy", model.serviceBinds().get(0).serviceId());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        NacosComponent model = new NacosComponent()
            .withConfigurations(Arrays.asList(
                new JavaComponentConfigurationProperty().withPropertyName("ullqxbdmvrscm").withValue("rndb"),
                new JavaComponentConfigurationProperty().withPropertyName("yeofltfnnxrkad").withValue("ynnfmuiii"),
                new JavaComponentConfigurationProperty().withPropertyName("pfoh").withValue("fkx")))
            .withServiceBinds(
                Arrays.asList(new JavaComponentServiceBind().withName("r").withServiceId("iutgnjizbeewoiy"),
                    new JavaComponentServiceBind().withName("vzbjuyrsrzi").withServiceId("tixgbd"),
                    new JavaComponentServiceBind().withName("ifrevk").withServiceId("pezkis"),
                    new JavaComponentServiceBind().withName("jm").withServiceId("hsyparybjuf")))
            .withIngress(new JavaComponentIngress());
        model = BinaryData.fromObject(model).toObject(NacosComponent.class);
        Assertions.assertEquals("ullqxbdmvrscm", model.configurations().get(0).propertyName());
        Assertions.assertEquals("rndb", model.configurations().get(0).value());
        Assertions.assertEquals("r", model.serviceBinds().get(0).name());
        Assertions.assertEquals("iutgnjizbeewoiy", model.serviceBinds().get(0).serviceId());
    }
}
