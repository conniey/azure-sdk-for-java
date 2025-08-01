// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.policyinsights.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.policyinsights.models.FieldRestriction;
import com.azure.resourcemanager.policyinsights.models.FieldRestrictions;
import java.util.Arrays;

public final class FieldRestrictionsTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        FieldRestrictions model = BinaryData.fromString(
            "{\"field\":\"bsoqeqala\",\"restrictions\":[{\"result\":\"Audit\",\"defaultValue\":\"nbtgfebwl\",\"values\":[\"hyreeu\",\"zqavbpdqmjx\",\"yyzglgouwtlmjjy\"],\"policy\":{\"policyDefinitionId\":\"qtobaxkjeyt\",\"policySetDefinitionId\":\"lbfjkwr\",\"policyDefinitionReferenceId\":\"nkqbhsyrq\",\"policyAssignmentId\":\"jqhden\"},\"policyEffect\":\"ulkpakd\",\"reason\":\"fmjnnawtqa\"},{\"result\":\"Audit\",\"defaultValue\":\"ckpggqoweyird\",\"values\":[\"sn\",\"wfl\",\"qmp\",\"zruwn\"],\"policy\":{\"policyDefinitionId\":\"pxiwf\",\"policySetDefinitionId\":\"gjsaasiixtm\",\"policyDefinitionReferenceId\":\"jvkviirhgfgrws\",\"policyAssignmentId\":\"gratzvzbglbyvict\"},\"policyEffect\":\"brxkjzwr\",\"reason\":\"ffm\"}]}")
            .toObject(FieldRestrictions.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        FieldRestrictions model
            = new FieldRestrictions().withRestrictions(Arrays.asList(new FieldRestriction(), new FieldRestriction()));
        model = BinaryData.fromObject(model).toObject(FieldRestrictions.class);
    }
}
