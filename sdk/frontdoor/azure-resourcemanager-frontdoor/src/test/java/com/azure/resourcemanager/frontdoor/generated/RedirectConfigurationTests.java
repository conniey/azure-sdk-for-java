// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.frontdoor.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.frontdoor.models.FrontDoorRedirectProtocol;
import com.azure.resourcemanager.frontdoor.models.FrontDoorRedirectType;
import com.azure.resourcemanager.frontdoor.models.RedirectConfiguration;
import org.junit.jupiter.api.Assertions;

public final class RedirectConfigurationTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        RedirectConfiguration model = BinaryData.fromString(
            "{\"@odata.type\":\"cqpbtuo\",\"redirectType\":\"PermanentRedirect\",\"redirectProtocol\":\"HttpsOnly\",\"customHost\":\"zzhmkd\",\"customPath\":\"vflyhbxcu\",\"customFragment\":\"hxgsrboldfor\",\"customQueryString\":\"wjlvizbfhfov\"}")
            .toObject(RedirectConfiguration.class);
        Assertions.assertEquals(FrontDoorRedirectType.PERMANENT_REDIRECT, model.redirectType());
        Assertions.assertEquals(FrontDoorRedirectProtocol.HTTPS_ONLY, model.redirectProtocol());
        Assertions.assertEquals("zzhmkd", model.customHost());
        Assertions.assertEquals("vflyhbxcu", model.customPath());
        Assertions.assertEquals("hxgsrboldfor", model.customFragment());
        Assertions.assertEquals("wjlvizbfhfov", model.customQueryString());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        RedirectConfiguration model
            = new RedirectConfiguration().withRedirectType(FrontDoorRedirectType.PERMANENT_REDIRECT)
                .withRedirectProtocol(FrontDoorRedirectProtocol.HTTPS_ONLY)
                .withCustomHost("zzhmkd")
                .withCustomPath("vflyhbxcu")
                .withCustomFragment("hxgsrboldfor")
                .withCustomQueryString("wjlvizbfhfov");
        model = BinaryData.fromObject(model).toObject(RedirectConfiguration.class);
        Assertions.assertEquals(FrontDoorRedirectType.PERMANENT_REDIRECT, model.redirectType());
        Assertions.assertEquals(FrontDoorRedirectProtocol.HTTPS_ONLY, model.redirectProtocol());
        Assertions.assertEquals("zzhmkd", model.customHost());
        Assertions.assertEquals("vflyhbxcu", model.customPath());
        Assertions.assertEquals("hxgsrboldfor", model.customFragment());
        Assertions.assertEquals("wjlvizbfhfov", model.customQueryString());
    }
}
