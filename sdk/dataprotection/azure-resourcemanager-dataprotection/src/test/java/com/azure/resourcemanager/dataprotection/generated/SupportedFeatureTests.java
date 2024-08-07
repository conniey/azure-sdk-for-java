// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dataprotection.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.dataprotection.models.FeatureSupportStatus;
import com.azure.resourcemanager.dataprotection.models.SupportedFeature;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class SupportedFeatureTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        SupportedFeature model = BinaryData.fromString(
            "{\"featureName\":\"onasxifto\",\"supportStatus\":\"PublicPreview\",\"exposureControlledFeatures\":[\"f\",\"wesgogczh\",\"nnxk\"]}")
            .toObject(SupportedFeature.class);
        Assertions.assertEquals("onasxifto", model.featureName());
        Assertions.assertEquals(FeatureSupportStatus.PUBLIC_PREVIEW, model.supportStatus());
        Assertions.assertEquals("f", model.exposureControlledFeatures().get(0));
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        SupportedFeature model = new SupportedFeature().withFeatureName("onasxifto")
            .withSupportStatus(FeatureSupportStatus.PUBLIC_PREVIEW)
            .withExposureControlledFeatures(Arrays.asList("f", "wesgogczh", "nnxk"));
        model = BinaryData.fromObject(model).toObject(SupportedFeature.class);
        Assertions.assertEquals("onasxifto", model.featureName());
        Assertions.assertEquals(FeatureSupportStatus.PUBLIC_PREVIEW, model.supportStatus());
        Assertions.assertEquals("f", model.exposureControlledFeatures().get(0));
    }
}
