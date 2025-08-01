// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.eventgrid.fluent.models.TopicTypeInfoInner;
import com.azure.resourcemanager.eventgrid.models.ResourceRegionType;
import com.azure.resourcemanager.eventgrid.models.TopicTypeAdditionalEnforcedPermission;
import com.azure.resourcemanager.eventgrid.models.TopicTypeProvisioningState;
import com.azure.resourcemanager.eventgrid.models.TopicTypeSourceScope;
import com.azure.resourcemanager.eventgrid.models.TopicTypesListResult;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class TopicTypesListResultTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        TopicTypesListResult model = BinaryData.fromString(
            "{\"value\":[{\"properties\":{\"provider\":\"ui\",\"displayName\":\"ri\",\"description\":\"ohykfkxbbcbrw\",\"resourceRegionType\":\"RegionalResource\",\"provisioningState\":\"Failed\",\"supportedLocations\":[\"izbeew\",\"iy\"],\"sourceResourceFormat\":\"vzbjuyrsrzi\",\"supportedScopesForSource\":[\"ManagementGroup\",\"ManagementGroup\"],\"areRegionalAndGlobalSourcesSupported\":false,\"additionalEnforcedPermissions\":[{\"permissionName\":\"ifrevk\",\"isDataAction\":false}]},\"id\":\"ezkiswqjmdghsypa\",\"name\":\"ybjufptb\",\"type\":\"czjnc\"},{\"properties\":{\"provider\":\"yqv\",\"displayName\":\"aswvppis\",\"description\":\"zlgcndhzxrrf\",\"resourceRegionType\":\"GlobalResource\",\"provisioningState\":\"Succeeded\",\"supportedLocations\":[\"gsnxuw\",\"kpphefsbzx\",\"bzxomeik\"],\"sourceResourceFormat\":\"lwzacn\",\"supportedScopesForSource\":[\"ManagementGroup\",\"AzureSubscription\",\"ManagementGroup\"],\"areRegionalAndGlobalSourcesSupported\":false,\"additionalEnforcedPermissions\":[{\"permissionName\":\"yqbxyxoyf\",\"isDataAction\":false},{\"permissionName\":\"iqezxlhdj\",\"isDataAction\":true},{\"permissionName\":\"a\",\"isDataAction\":true}]},\"id\":\"psozjiihj\",\"name\":\"iybmrzoep\",\"type\":\"xwdvwnj\"},{\"properties\":{\"provider\":\"fnmxa\",\"displayName\":\"sqftibtyibuyvp\",\"description\":\"fqjpnqno\",\"resourceRegionType\":\"RegionalResource\",\"provisioningState\":\"Failed\",\"supportedLocations\":[\"nrexkxbhxv\"],\"sourceResourceFormat\":\"nul\",\"supportedScopesForSource\":[\"ResourceGroup\"],\"areRegionalAndGlobalSourcesSupported\":false,\"additionalEnforcedPermissions\":[{\"permissionName\":\"znfaj\",\"isDataAction\":true},{\"permissionName\":\"kmq\",\"isDataAction\":true},{\"permissionName\":\"ivyhjrliizjixlqf\",\"isDataAction\":false}]},\"id\":\"kwabsolronqq\",\"name\":\"mgnlqxsjxtel\",\"type\":\"xhvuqbozool\"}]}")
            .toObject(TopicTypesListResult.class);
        Assertions.assertEquals("ui", model.value().get(0).provider());
        Assertions.assertEquals("ri", model.value().get(0).displayName());
        Assertions.assertEquals("ohykfkxbbcbrw", model.value().get(0).description());
        Assertions.assertEquals(ResourceRegionType.REGIONAL_RESOURCE, model.value().get(0).resourceRegionType());
        Assertions.assertEquals(TopicTypeProvisioningState.FAILED, model.value().get(0).provisioningState());
        Assertions.assertEquals("izbeew", model.value().get(0).supportedLocations().get(0));
        Assertions.assertEquals("vzbjuyrsrzi", model.value().get(0).sourceResourceFormat());
        Assertions.assertEquals(TopicTypeSourceScope.MANAGEMENT_GROUP,
            model.value().get(0).supportedScopesForSource().get(0));
        Assertions.assertFalse(model.value().get(0).areRegionalAndGlobalSourcesSupported());
        Assertions.assertEquals("ifrevk", model.value().get(0).additionalEnforcedPermissions().get(0).permissionName());
        Assertions.assertFalse(model.value().get(0).additionalEnforcedPermissions().get(0).isDataAction());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        TopicTypesListResult model
            = new TopicTypesListResult()
                .withValue(
                    Arrays.asList(
                        new TopicTypeInfoInner().withProvider("ui")
                            .withDisplayName("ri")
                            .withDescription("ohykfkxbbcbrw")
                            .withResourceRegionType(ResourceRegionType.REGIONAL_RESOURCE)
                            .withProvisioningState(TopicTypeProvisioningState.FAILED)
                            .withSupportedLocations(Arrays.asList("izbeew", "iy"))
                            .withSourceResourceFormat("vzbjuyrsrzi")
                            .withSupportedScopesForSource(Arrays
                                .asList(TopicTypeSourceScope.MANAGEMENT_GROUP, TopicTypeSourceScope.MANAGEMENT_GROUP))
                            .withAreRegionalAndGlobalSourcesSupported(false)
                            .withAdditionalEnforcedPermissions(
                                Arrays.asList(new TopicTypeAdditionalEnforcedPermission()
                                    .withPermissionName("ifrevk")
                                    .withIsDataAction(false))),
                        new TopicTypeInfoInner().withProvider("yqv")
                            .withDisplayName("aswvppis")
                            .withDescription("zlgcndhzxrrf")
                            .withResourceRegionType(ResourceRegionType.GLOBAL_RESOURCE)
                            .withProvisioningState(TopicTypeProvisioningState.SUCCEEDED)
                            .withSupportedLocations(Arrays.asList("gsnxuw", "kpphefsbzx", "bzxomeik"))
                            .withSourceResourceFormat("lwzacn")
                            .withSupportedScopesForSource(Arrays.asList(TopicTypeSourceScope.MANAGEMENT_GROUP,
                                TopicTypeSourceScope.AZURE_SUBSCRIPTION, TopicTypeSourceScope.MANAGEMENT_GROUP))
                            .withAreRegionalAndGlobalSourcesSupported(false)
                            .withAdditionalEnforcedPermissions(Arrays.asList(
                                new TopicTypeAdditionalEnforcedPermission().withPermissionName("yqbxyxoyf")
                                    .withIsDataAction(false),
                                new TopicTypeAdditionalEnforcedPermission().withPermissionName("iqezxlhdj")
                                    .withIsDataAction(true),
                                new TopicTypeAdditionalEnforcedPermission()
                                    .withPermissionName("a")
                                    .withIsDataAction(true))),
                        new TopicTypeInfoInner().withProvider("fnmxa")
                            .withDisplayName("sqftibtyibuyvp")
                            .withDescription("fqjpnqno")
                            .withResourceRegionType(ResourceRegionType.REGIONAL_RESOURCE)
                            .withProvisioningState(TopicTypeProvisioningState.FAILED)
                            .withSupportedLocations(Arrays.asList("nrexkxbhxv"))
                            .withSourceResourceFormat("nul")
                            .withSupportedScopesForSource(Arrays.asList(TopicTypeSourceScope.RESOURCE_GROUP))
                            .withAreRegionalAndGlobalSourcesSupported(false)
                            .withAdditionalEnforcedPermissions(Arrays.asList(
                                new TopicTypeAdditionalEnforcedPermission().withPermissionName("znfaj")
                                    .withIsDataAction(true),
                                new TopicTypeAdditionalEnforcedPermission().withPermissionName("kmq")
                                    .withIsDataAction(true),
                                new TopicTypeAdditionalEnforcedPermission().withPermissionName("ivyhjrliizjixlqf")
                                    .withIsDataAction(false)))));
        model = BinaryData.fromObject(model).toObject(TopicTypesListResult.class);
        Assertions.assertEquals("ui", model.value().get(0).provider());
        Assertions.assertEquals("ri", model.value().get(0).displayName());
        Assertions.assertEquals("ohykfkxbbcbrw", model.value().get(0).description());
        Assertions.assertEquals(ResourceRegionType.REGIONAL_RESOURCE, model.value().get(0).resourceRegionType());
        Assertions.assertEquals(TopicTypeProvisioningState.FAILED, model.value().get(0).provisioningState());
        Assertions.assertEquals("izbeew", model.value().get(0).supportedLocations().get(0));
        Assertions.assertEquals("vzbjuyrsrzi", model.value().get(0).sourceResourceFormat());
        Assertions.assertEquals(TopicTypeSourceScope.MANAGEMENT_GROUP,
            model.value().get(0).supportedScopesForSource().get(0));
        Assertions.assertFalse(model.value().get(0).areRegionalAndGlobalSourcesSupported());
        Assertions.assertEquals("ifrevk", model.value().get(0).additionalEnforcedPermissions().get(0).permissionName());
        Assertions.assertFalse(model.value().get(0).additionalEnforcedPermissions().get(0).isDataAction());
    }
}
