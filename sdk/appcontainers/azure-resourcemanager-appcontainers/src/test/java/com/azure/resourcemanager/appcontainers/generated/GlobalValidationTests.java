// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcontainers.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.appcontainers.models.GlobalValidation;
import com.azure.resourcemanager.appcontainers.models.UnauthenticatedClientActionV2;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class GlobalValidationTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        GlobalValidation model = BinaryData.fromString(
            "{\"unauthenticatedClientAction\":\"RedirectToLoginPage\",\"redirectToProvider\":\"rkujy\",\"excludedPaths\":[\"eju\"]}")
            .toObject(GlobalValidation.class);
        Assertions.assertEquals(UnauthenticatedClientActionV2.REDIRECT_TO_LOGIN_PAGE,
            model.unauthenticatedClientAction());
        Assertions.assertEquals("rkujy", model.redirectToProvider());
        Assertions.assertEquals("eju", model.excludedPaths().get(0));
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        GlobalValidation model = new GlobalValidation()
            .withUnauthenticatedClientAction(UnauthenticatedClientActionV2.REDIRECT_TO_LOGIN_PAGE)
            .withRedirectToProvider("rkujy")
            .withExcludedPaths(Arrays.asList("eju"));
        model = BinaryData.fromObject(model).toObject(GlobalValidation.class);
        Assertions.assertEquals(UnauthenticatedClientActionV2.REDIRECT_TO_LOGIN_PAGE,
            model.unauthenticatedClientAction());
        Assertions.assertEquals("rkujy", model.redirectToProvider());
        Assertions.assertEquals("eju", model.excludedPaths().get(0));
    }
}
