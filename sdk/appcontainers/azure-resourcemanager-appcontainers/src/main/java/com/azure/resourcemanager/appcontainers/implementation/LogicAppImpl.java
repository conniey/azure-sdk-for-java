// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcontainers.implementation;

import com.azure.core.http.rest.Response;
import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.appcontainers.fluent.models.LogicAppInner;
import com.azure.resourcemanager.appcontainers.models.LogicApp;
import com.azure.resourcemanager.appcontainers.models.WorkflowArtifacts;
import com.azure.resourcemanager.appcontainers.models.WorkflowEnvelope;

public final class LogicAppImpl implements LogicApp, LogicApp.Definition, LogicApp.Update {
    private LogicAppInner innerObject;

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

    public Object properties() {
        return this.innerModel().properties();
    }

    public SystemData systemData() {
        return this.innerModel().systemData();
    }

    public String resourceGroupName() {
        return resourceGroupName;
    }

    public LogicAppInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.appcontainers.ContainerAppsApiManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String containerAppName;

    private String logicAppName;

    public LogicAppImpl withExistingContainerApp(String resourceGroupName, String containerAppName) {
        this.resourceGroupName = resourceGroupName;
        this.containerAppName = containerAppName;
        return this;
    }

    public LogicApp create() {
        this.innerObject = serviceManager.serviceClient()
            .getLogicApps()
            .createOrUpdateWithResponse(resourceGroupName, containerAppName, logicAppName, this.innerModel(),
                Context.NONE)
            .getValue();
        return this;
    }

    public LogicApp create(Context context) {
        this.innerObject = serviceManager.serviceClient()
            .getLogicApps()
            .createOrUpdateWithResponse(resourceGroupName, containerAppName, logicAppName, this.innerModel(), context)
            .getValue();
        return this;
    }

    LogicAppImpl(String name, com.azure.resourcemanager.appcontainers.ContainerAppsApiManager serviceManager) {
        this.innerObject = new LogicAppInner();
        this.serviceManager = serviceManager;
        this.logicAppName = name;
    }

    public LogicAppImpl update() {
        return this;
    }

    public LogicApp apply() {
        this.innerObject = serviceManager.serviceClient()
            .getLogicApps()
            .createOrUpdateWithResponse(resourceGroupName, containerAppName, logicAppName, this.innerModel(),
                Context.NONE)
            .getValue();
        return this;
    }

    public LogicApp apply(Context context) {
        this.innerObject = serviceManager.serviceClient()
            .getLogicApps()
            .createOrUpdateWithResponse(resourceGroupName, containerAppName, logicAppName, this.innerModel(), context)
            .getValue();
        return this;
    }

    LogicAppImpl(LogicAppInner innerObject,
        com.azure.resourcemanager.appcontainers.ContainerAppsApiManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = ResourceManagerUtils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.containerAppName = ResourceManagerUtils.getValueFromIdByName(innerObject.id(), "containerApps");
        this.logicAppName = ResourceManagerUtils.getValueFromIdByName(innerObject.id(), "logicApps");
    }

    public LogicApp refresh() {
        this.innerObject = serviceManager.serviceClient()
            .getLogicApps()
            .getWithResponse(resourceGroupName, containerAppName, logicAppName, Context.NONE)
            .getValue();
        return this;
    }

    public LogicApp refresh(Context context) {
        this.innerObject = serviceManager.serviceClient()
            .getLogicApps()
            .getWithResponse(resourceGroupName, containerAppName, logicAppName, context)
            .getValue();
        return this;
    }

    public Response<Void> deployWorkflowArtifactsWithResponse(WorkflowArtifacts workflowArtifacts, Context context) {
        return serviceManager.logicApps()
            .deployWorkflowArtifactsWithResponse(resourceGroupName, containerAppName, logicAppName, workflowArtifacts,
                context);
    }

    public void deployWorkflowArtifacts() {
        serviceManager.logicApps().deployWorkflowArtifacts(resourceGroupName, containerAppName, logicAppName);
    }

    public Response<WorkflowEnvelope> listWorkflowsConnectionsWithResponse(Context context) {
        return serviceManager.logicApps()
            .listWorkflowsConnectionsWithResponse(resourceGroupName, containerAppName, logicAppName, context);
    }

    public WorkflowEnvelope listWorkflowsConnections() {
        return serviceManager.logicApps().listWorkflowsConnections(resourceGroupName, containerAppName, logicAppName);
    }

    public LogicAppImpl withProperties(Object properties) {
        this.innerModel().withProperties(properties);
        return this;
    }
}
