// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcontainers.implementation;

import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.appcontainers.fluent.models.BuildResourceInner;
import com.azure.resourcemanager.appcontainers.models.BuildConfiguration;
import com.azure.resourcemanager.appcontainers.models.BuildProvisioningState;
import com.azure.resourcemanager.appcontainers.models.BuildResource;
import com.azure.resourcemanager.appcontainers.models.BuildStatus;
import com.azure.resourcemanager.appcontainers.models.ContainerRegistryWithCustomImage;

public final class BuildResourceImpl implements BuildResource, BuildResource.Definition, BuildResource.Update {
    private BuildResourceInner innerObject;

    private final com.azure.resourcemanager.appcontainers.ContainerAppsApiManager serviceManager;

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public SystemData systemData() {
        return this.innerModel().systemData();
    }

    public BuildProvisioningState provisioningState() {
        return this.innerModel().provisioningState();
    }

    public BuildStatus buildStatus() {
        return this.innerModel().buildStatus();
    }

    public ContainerRegistryWithCustomImage destinationContainerRegistry() {
        return this.innerModel().destinationContainerRegistry();
    }

    public BuildConfiguration configuration() {
        return this.innerModel().configuration();
    }

    public String uploadEndpoint() {
        return this.innerModel().uploadEndpoint();
    }

    public String logStreamEndpoint() {
        return this.innerModel().logStreamEndpoint();
    }

    public String tokenEndpoint() {
        return this.innerModel().tokenEndpoint();
    }

    public String resourceGroupName() {
        return resourceGroupName;
    }

    public BuildResourceInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.appcontainers.ContainerAppsApiManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String builderName;

    private String buildName;

    public BuildResourceImpl withExistingBuilder(String resourceGroupName, String builderName) {
        this.resourceGroupName = resourceGroupName;
        this.builderName = builderName;
        return this;
    }

    public BuildResource create() {
        this.innerObject = serviceManager.serviceClient()
            .getBuilds()
            .createOrUpdate(resourceGroupName, builderName, buildName, this.innerModel(), Context.NONE);
        return this;
    }

    public BuildResource create(Context context) {
        this.innerObject = serviceManager.serviceClient()
            .getBuilds()
            .createOrUpdate(resourceGroupName, builderName, buildName, this.innerModel(), context);
        return this;
    }

    BuildResourceImpl(String name, com.azure.resourcemanager.appcontainers.ContainerAppsApiManager serviceManager) {
        this.innerObject = new BuildResourceInner();
        this.serviceManager = serviceManager;
        this.buildName = name;
    }

    public BuildResourceImpl update() {
        return this;
    }

    public BuildResource apply() {
        this.innerObject = serviceManager.serviceClient()
            .getBuilds()
            .createOrUpdate(resourceGroupName, builderName, buildName, this.innerModel(), Context.NONE);
        return this;
    }

    public BuildResource apply(Context context) {
        this.innerObject = serviceManager.serviceClient()
            .getBuilds()
            .createOrUpdate(resourceGroupName, builderName, buildName, this.innerModel(), context);
        return this;
    }

    BuildResourceImpl(BuildResourceInner innerObject,
        com.azure.resourcemanager.appcontainers.ContainerAppsApiManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = ResourceManagerUtils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.builderName = ResourceManagerUtils.getValueFromIdByName(innerObject.id(), "builders");
        this.buildName = ResourceManagerUtils.getValueFromIdByName(innerObject.id(), "builds");
    }

    public BuildResource refresh() {
        this.innerObject = serviceManager.serviceClient()
            .getBuilds()
            .getWithResponse(resourceGroupName, builderName, buildName, Context.NONE)
            .getValue();
        return this;
    }

    public BuildResource refresh(Context context) {
        this.innerObject = serviceManager.serviceClient()
            .getBuilds()
            .getWithResponse(resourceGroupName, builderName, buildName, context)
            .getValue();
        return this;
    }

    public BuildResourceImpl
        withDestinationContainerRegistry(ContainerRegistryWithCustomImage destinationContainerRegistry) {
        this.innerModel().withDestinationContainerRegistry(destinationContainerRegistry);
        return this;
    }

    public BuildResourceImpl withConfiguration(BuildConfiguration configuration) {
        this.innerModel().withConfiguration(configuration);
        return this;
    }
}
