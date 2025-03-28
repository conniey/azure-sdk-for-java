// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.servicelinker.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.servicelinker.models.ServicePrincipalCertificateAuthInfo;
import org.junit.jupiter.api.Assertions;

public final class ServicePrincipalCertificateAuthInfoTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ServicePrincipalCertificateAuthInfo model = BinaryData.fromString(
            "{\"authType\":\"servicePrincipalCertificate\",\"clientId\":\"jofxqe\",\"principalId\":\"fjaeq\",\"certificate\":\"hqjbasvmsmj\"}")
            .toObject(ServicePrincipalCertificateAuthInfo.class);
        Assertions.assertEquals("jofxqe", model.clientId());
        Assertions.assertEquals("fjaeq", model.principalId());
        Assertions.assertEquals("hqjbasvmsmj", model.certificate());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ServicePrincipalCertificateAuthInfo model = new ServicePrincipalCertificateAuthInfo().withClientId("jofxqe")
            .withPrincipalId("fjaeq")
            .withCertificate("hqjbasvmsmj");
        model = BinaryData.fromObject(model).toObject(ServicePrincipalCertificateAuthInfo.class);
        Assertions.assertEquals("jofxqe", model.clientId());
        Assertions.assertEquals("fjaeq", model.principalId());
        Assertions.assertEquals("hqjbasvmsmj", model.certificate());
    }
}
