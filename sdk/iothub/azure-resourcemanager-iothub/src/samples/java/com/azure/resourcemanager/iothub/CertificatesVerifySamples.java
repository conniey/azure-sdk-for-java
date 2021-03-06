// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.iothub;

import com.azure.core.util.Context;
import com.azure.resourcemanager.iothub.models.CertificateVerificationDescription;

/** Samples for Certificates Verify. */
public final class CertificatesVerifySamples {
    /**
     * Sample code: Certificates_Verify.
     *
     * @param iotHubManager Entry point to IotHubManager. Use this API to manage the IoT hubs in your Azure
     *     subscription.
     */
    public static void certificatesVerify(com.azure.resourcemanager.iothub.IotHubManager iotHubManager) {
        iotHubManager
            .certificates()
            .verifyWithResponse(
                "myResourceGroup",
                "myFirstProvisioningService",
                "cert",
                "AAAAAAAADGk=",
                new CertificateVerificationDescription().withCertificate("#####################################"),
                Context.NONE);
    }
}
