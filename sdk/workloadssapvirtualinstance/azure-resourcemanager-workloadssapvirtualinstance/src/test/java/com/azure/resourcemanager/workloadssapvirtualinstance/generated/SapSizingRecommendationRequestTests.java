// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.workloadssapvirtualinstance.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.workloadssapvirtualinstance.models.SapDatabaseScaleMethod;
import com.azure.resourcemanager.workloadssapvirtualinstance.models.SapDatabaseType;
import com.azure.resourcemanager.workloadssapvirtualinstance.models.SapDeploymentType;
import com.azure.resourcemanager.workloadssapvirtualinstance.models.SapEnvironmentType;
import com.azure.resourcemanager.workloadssapvirtualinstance.models.SapHighAvailabilityType;
import com.azure.resourcemanager.workloadssapvirtualinstance.models.SapProductType;
import com.azure.resourcemanager.workloadssapvirtualinstance.models.SapSizingRecommendationRequest;
import org.junit.jupiter.api.Assertions;

public final class SapSizingRecommendationRequestTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        SapSizingRecommendationRequest model = BinaryData.fromString(
            "{\"appLocation\":\"hhkxbp\",\"environment\":\"NonProd\",\"sapProduct\":\"S4HANA\",\"deploymentType\":\"SingleServer\",\"saps\":7630037301947416018,\"dbMemory\":7625908079442390330,\"databaseType\":\"HANA\",\"dbScaleMethod\":\"ScaleUp\",\"highAvailabilityType\":\"AvailabilitySet\"}")
            .toObject(SapSizingRecommendationRequest.class);
        Assertions.assertEquals("hhkxbp", model.appLocation());
        Assertions.assertEquals(SapEnvironmentType.NON_PROD, model.environment());
        Assertions.assertEquals(SapProductType.S4HANA, model.sapProduct());
        Assertions.assertEquals(SapDeploymentType.SINGLE_SERVER, model.deploymentType());
        Assertions.assertEquals(7630037301947416018L, model.saps());
        Assertions.assertEquals(7625908079442390330L, model.dbMemory());
        Assertions.assertEquals(SapDatabaseType.HANA, model.databaseType());
        Assertions.assertEquals(SapDatabaseScaleMethod.SCALE_UP, model.dbScaleMethod());
        Assertions.assertEquals(SapHighAvailabilityType.AVAILABILITY_SET, model.highAvailabilityType());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        SapSizingRecommendationRequest model = new SapSizingRecommendationRequest().withAppLocation("hhkxbp")
            .withEnvironment(SapEnvironmentType.NON_PROD)
            .withSapProduct(SapProductType.S4HANA)
            .withDeploymentType(SapDeploymentType.SINGLE_SERVER)
            .withSaps(7630037301947416018L)
            .withDbMemory(7625908079442390330L)
            .withDatabaseType(SapDatabaseType.HANA)
            .withDbScaleMethod(SapDatabaseScaleMethod.SCALE_UP)
            .withHighAvailabilityType(SapHighAvailabilityType.AVAILABILITY_SET);
        model = BinaryData.fromObject(model).toObject(SapSizingRecommendationRequest.class);
        Assertions.assertEquals("hhkxbp", model.appLocation());
        Assertions.assertEquals(SapEnvironmentType.NON_PROD, model.environment());
        Assertions.assertEquals(SapProductType.S4HANA, model.sapProduct());
        Assertions.assertEquals(SapDeploymentType.SINGLE_SERVER, model.deploymentType());
        Assertions.assertEquals(7630037301947416018L, model.saps());
        Assertions.assertEquals(7625908079442390330L, model.dbMemory());
        Assertions.assertEquals(SapDatabaseType.HANA, model.databaseType());
        Assertions.assertEquals(SapDatabaseScaleMethod.SCALE_UP, model.dbScaleMethod());
        Assertions.assertEquals(SapHighAvailabilityType.AVAILABILITY_SET, model.highAvailabilityType());
    }
}
