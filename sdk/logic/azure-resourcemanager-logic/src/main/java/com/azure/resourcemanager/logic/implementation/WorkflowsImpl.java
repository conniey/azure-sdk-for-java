// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.logic.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.logic.fluent.WorkflowsClient;
import com.azure.resourcemanager.logic.fluent.models.WorkflowInner;
import com.azure.resourcemanager.logic.fluent.models.WorkflowTriggerCallbackUrlInner;
import com.azure.resourcemanager.logic.models.GenerateUpgradedDefinitionParameters;
import com.azure.resourcemanager.logic.models.GetCallbackUrlParameters;
import com.azure.resourcemanager.logic.models.RegenerateActionParameter;
import com.azure.resourcemanager.logic.models.Workflow;
import com.azure.resourcemanager.logic.models.WorkflowReference;
import com.azure.resourcemanager.logic.models.WorkflowTriggerCallbackUrl;
import com.azure.resourcemanager.logic.models.Workflows;

public final class WorkflowsImpl implements Workflows {
    private static final ClientLogger LOGGER = new ClientLogger(WorkflowsImpl.class);

    private final WorkflowsClient innerClient;

    private final com.azure.resourcemanager.logic.LogicManager serviceManager;

    public WorkflowsImpl(WorkflowsClient innerClient, com.azure.resourcemanager.logic.LogicManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<Workflow> list() {
        PagedIterable<WorkflowInner> inner = this.serviceClient().list();
        return ResourceManagerUtils.mapPage(inner, inner1 -> new WorkflowImpl(inner1, this.manager()));
    }

    public PagedIterable<Workflow> list(Integer top, String filter, Context context) {
        PagedIterable<WorkflowInner> inner = this.serviceClient().list(top, filter, context);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new WorkflowImpl(inner1, this.manager()));
    }

    public PagedIterable<Workflow> listByResourceGroup(String resourceGroupName) {
        PagedIterable<WorkflowInner> inner = this.serviceClient().listByResourceGroup(resourceGroupName);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new WorkflowImpl(inner1, this.manager()));
    }

    public PagedIterable<Workflow> listByResourceGroup(String resourceGroupName, Integer top, String filter,
        Context context) {
        PagedIterable<WorkflowInner> inner
            = this.serviceClient().listByResourceGroup(resourceGroupName, top, filter, context);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new WorkflowImpl(inner1, this.manager()));
    }

    public Response<Workflow> getByResourceGroupWithResponse(String resourceGroupName, String workflowName,
        Context context) {
        Response<WorkflowInner> inner
            = this.serviceClient().getByResourceGroupWithResponse(resourceGroupName, workflowName, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new WorkflowImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public Workflow getByResourceGroup(String resourceGroupName, String workflowName) {
        WorkflowInner inner = this.serviceClient().getByResourceGroup(resourceGroupName, workflowName);
        if (inner != null) {
            return new WorkflowImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<Workflow> updateWithResponse(String resourceGroupName, String workflowName, Context context) {
        Response<WorkflowInner> inner
            = this.serviceClient().updateWithResponse(resourceGroupName, workflowName, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new WorkflowImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public Workflow update(String resourceGroupName, String workflowName) {
        WorkflowInner inner = this.serviceClient().update(resourceGroupName, workflowName);
        if (inner != null) {
            return new WorkflowImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<Void> deleteByResourceGroupWithResponse(String resourceGroupName, String workflowName,
        Context context) {
        return this.serviceClient().deleteWithResponse(resourceGroupName, workflowName, context);
    }

    public void deleteByResourceGroup(String resourceGroupName, String workflowName) {
        this.serviceClient().delete(resourceGroupName, workflowName);
    }

    public Response<Void> disableWithResponse(String resourceGroupName, String workflowName, Context context) {
        return this.serviceClient().disableWithResponse(resourceGroupName, workflowName, context);
    }

    public void disable(String resourceGroupName, String workflowName) {
        this.serviceClient().disable(resourceGroupName, workflowName);
    }

    public Response<Void> enableWithResponse(String resourceGroupName, String workflowName, Context context) {
        return this.serviceClient().enableWithResponse(resourceGroupName, workflowName, context);
    }

    public void enable(String resourceGroupName, String workflowName) {
        this.serviceClient().enable(resourceGroupName, workflowName);
    }

    public Response<Object> generateUpgradedDefinitionWithResponse(String resourceGroupName, String workflowName,
        GenerateUpgradedDefinitionParameters parameters, Context context) {
        return this.serviceClient()
            .generateUpgradedDefinitionWithResponse(resourceGroupName, workflowName, parameters, context);
    }

    public Object generateUpgradedDefinition(String resourceGroupName, String workflowName,
        GenerateUpgradedDefinitionParameters parameters) {
        return this.serviceClient().generateUpgradedDefinition(resourceGroupName, workflowName, parameters);
    }

    public Response<WorkflowTriggerCallbackUrl> listCallbackUrlWithResponse(String resourceGroupName,
        String workflowName, GetCallbackUrlParameters listCallbackUrl, Context context) {
        Response<WorkflowTriggerCallbackUrlInner> inner = this.serviceClient()
            .listCallbackUrlWithResponse(resourceGroupName, workflowName, listCallbackUrl, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new WorkflowTriggerCallbackUrlImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public WorkflowTriggerCallbackUrl listCallbackUrl(String resourceGroupName, String workflowName,
        GetCallbackUrlParameters listCallbackUrl) {
        WorkflowTriggerCallbackUrlInner inner
            = this.serviceClient().listCallbackUrl(resourceGroupName, workflowName, listCallbackUrl);
        if (inner != null) {
            return new WorkflowTriggerCallbackUrlImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<Object> listSwaggerWithResponse(String resourceGroupName, String workflowName, Context context) {
        return this.serviceClient().listSwaggerWithResponse(resourceGroupName, workflowName, context);
    }

    public Object listSwagger(String resourceGroupName, String workflowName) {
        return this.serviceClient().listSwagger(resourceGroupName, workflowName);
    }

    public void move(String resourceGroupName, String workflowName, WorkflowReference move) {
        this.serviceClient().move(resourceGroupName, workflowName, move);
    }

    public void move(String resourceGroupName, String workflowName, WorkflowReference move, Context context) {
        this.serviceClient().move(resourceGroupName, workflowName, move, context);
    }

    public Response<Void> regenerateAccessKeyWithResponse(String resourceGroupName, String workflowName,
        RegenerateActionParameter keyType, Context context) {
        return this.serviceClient().regenerateAccessKeyWithResponse(resourceGroupName, workflowName, keyType, context);
    }

    public void regenerateAccessKey(String resourceGroupName, String workflowName, RegenerateActionParameter keyType) {
        this.serviceClient().regenerateAccessKey(resourceGroupName, workflowName, keyType);
    }

    public Response<Void> validateByResourceGroupWithResponse(String resourceGroupName, String workflowName,
        WorkflowInner validate, Context context) {
        return this.serviceClient()
            .validateByResourceGroupWithResponse(resourceGroupName, workflowName, validate, context);
    }

    public void validateByResourceGroup(String resourceGroupName, String workflowName, WorkflowInner validate) {
        this.serviceClient().validateByResourceGroup(resourceGroupName, workflowName, validate);
    }

    public Response<Void> validateByLocationWithResponse(String resourceGroupName, String location, String workflowName,
        WorkflowInner validate, Context context) {
        return this.serviceClient()
            .validateByLocationWithResponse(resourceGroupName, location, workflowName, validate, context);
    }

    public void validateByLocation(String resourceGroupName, String location, String workflowName,
        WorkflowInner validate) {
        this.serviceClient().validateByLocation(resourceGroupName, location, workflowName, validate);
    }

    public Workflow getById(String id) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String workflowName = ResourceManagerUtils.getValueFromIdByName(id, "workflows");
        if (workflowName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'workflows'.", id)));
        }
        return this.getByResourceGroupWithResponse(resourceGroupName, workflowName, Context.NONE).getValue();
    }

    public Response<Workflow> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String workflowName = ResourceManagerUtils.getValueFromIdByName(id, "workflows");
        if (workflowName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'workflows'.", id)));
        }
        return this.getByResourceGroupWithResponse(resourceGroupName, workflowName, context);
    }

    public void deleteById(String id) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String workflowName = ResourceManagerUtils.getValueFromIdByName(id, "workflows");
        if (workflowName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'workflows'.", id)));
        }
        this.deleteByResourceGroupWithResponse(resourceGroupName, workflowName, Context.NONE);
    }

    public Response<Void> deleteByIdWithResponse(String id, Context context) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String workflowName = ResourceManagerUtils.getValueFromIdByName(id, "workflows");
        if (workflowName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'workflows'.", id)));
        }
        return this.deleteByResourceGroupWithResponse(resourceGroupName, workflowName, context);
    }

    private WorkflowsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.logic.LogicManager manager() {
        return this.serviceManager;
    }

    public WorkflowImpl define(String name) {
        return new WorkflowImpl(name, this.manager());
    }
}
