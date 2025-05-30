// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.implementation;

import com.azure.core.util.Context;
import com.azure.resourcemanager.apimanagement.fluent.models.TagProductLinkContractInner;
import com.azure.resourcemanager.apimanagement.models.TagProductLinkContract;

public final class TagProductLinkContractImpl
    implements TagProductLinkContract, TagProductLinkContract.Definition, TagProductLinkContract.Update {
    private TagProductLinkContractInner innerObject;

    private final com.azure.resourcemanager.apimanagement.ApiManagementManager serviceManager;

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public String productId() {
        return this.innerModel().productId();
    }

    public String resourceGroupName() {
        return resourceGroupName;
    }

    public TagProductLinkContractInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.apimanagement.ApiManagementManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String serviceName;

    private String tagId;

    private String productLinkId;

    public TagProductLinkContractImpl withExistingTag(String resourceGroupName, String serviceName, String tagId) {
        this.resourceGroupName = resourceGroupName;
        this.serviceName = serviceName;
        this.tagId = tagId;
        return this;
    }

    public TagProductLinkContract create() {
        this.innerObject = serviceManager.serviceClient()
            .getTagProductLinks()
            .createOrUpdateWithResponse(resourceGroupName, serviceName, tagId, productLinkId, this.innerModel(),
                Context.NONE)
            .getValue();
        return this;
    }

    public TagProductLinkContract create(Context context) {
        this.innerObject = serviceManager.serviceClient()
            .getTagProductLinks()
            .createOrUpdateWithResponse(resourceGroupName, serviceName, tagId, productLinkId, this.innerModel(),
                context)
            .getValue();
        return this;
    }

    TagProductLinkContractImpl(String name,
        com.azure.resourcemanager.apimanagement.ApiManagementManager serviceManager) {
        this.innerObject = new TagProductLinkContractInner();
        this.serviceManager = serviceManager;
        this.productLinkId = name;
    }

    public TagProductLinkContractImpl update() {
        return this;
    }

    public TagProductLinkContract apply() {
        this.innerObject = serviceManager.serviceClient()
            .getTagProductLinks()
            .createOrUpdateWithResponse(resourceGroupName, serviceName, tagId, productLinkId, this.innerModel(),
                Context.NONE)
            .getValue();
        return this;
    }

    public TagProductLinkContract apply(Context context) {
        this.innerObject = serviceManager.serviceClient()
            .getTagProductLinks()
            .createOrUpdateWithResponse(resourceGroupName, serviceName, tagId, productLinkId, this.innerModel(),
                context)
            .getValue();
        return this;
    }

    TagProductLinkContractImpl(TagProductLinkContractInner innerObject,
        com.azure.resourcemanager.apimanagement.ApiManagementManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = ResourceManagerUtils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.serviceName = ResourceManagerUtils.getValueFromIdByName(innerObject.id(), "service");
        this.tagId = ResourceManagerUtils.getValueFromIdByName(innerObject.id(), "tags");
        this.productLinkId = ResourceManagerUtils.getValueFromIdByName(innerObject.id(), "productLinks");
    }

    public TagProductLinkContract refresh() {
        this.innerObject = serviceManager.serviceClient()
            .getTagProductLinks()
            .getWithResponse(resourceGroupName, serviceName, tagId, productLinkId, Context.NONE)
            .getValue();
        return this;
    }

    public TagProductLinkContract refresh(Context context) {
        this.innerObject = serviceManager.serviceClient()
            .getTagProductLinks()
            .getWithResponse(resourceGroupName, serviceName, tagId, productLinkId, context)
            .getValue();
        return this;
    }

    public TagProductLinkContractImpl withProductId(String productId) {
        this.innerModel().withProductId(productId);
        return this;
    }
}
