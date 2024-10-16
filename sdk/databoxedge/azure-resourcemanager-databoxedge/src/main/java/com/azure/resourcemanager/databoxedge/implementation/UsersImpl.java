// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databoxedge.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.databoxedge.fluent.UsersClient;
import com.azure.resourcemanager.databoxedge.fluent.models.UserInner;
import com.azure.resourcemanager.databoxedge.models.User;
import com.azure.resourcemanager.databoxedge.models.Users;

public final class UsersImpl implements Users {
    private static final ClientLogger LOGGER = new ClientLogger(UsersImpl.class);

    private final UsersClient innerClient;

    private final com.azure.resourcemanager.databoxedge.DataBoxEdgeManager serviceManager;

    public UsersImpl(UsersClient innerClient, com.azure.resourcemanager.databoxedge.DataBoxEdgeManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<User> listByDataBoxEdgeDevice(String deviceName, String resourceGroupName) {
        PagedIterable<UserInner> inner = this.serviceClient().listByDataBoxEdgeDevice(deviceName, resourceGroupName);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new UserImpl(inner1, this.manager()));
    }

    public PagedIterable<User> listByDataBoxEdgeDevice(String deviceName, String resourceGroupName, String filter,
        Context context) {
        PagedIterable<UserInner> inner
            = this.serviceClient().listByDataBoxEdgeDevice(deviceName, resourceGroupName, filter, context);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new UserImpl(inner1, this.manager()));
    }

    public Response<User> getWithResponse(String deviceName, String name, String resourceGroupName, Context context) {
        Response<UserInner> inner = this.serviceClient().getWithResponse(deviceName, name, resourceGroupName, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new UserImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public User get(String deviceName, String name, String resourceGroupName) {
        UserInner inner = this.serviceClient().get(deviceName, name, resourceGroupName);
        if (inner != null) {
            return new UserImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public void delete(String deviceName, String name, String resourceGroupName) {
        this.serviceClient().delete(deviceName, name, resourceGroupName);
    }

    public void delete(String deviceName, String name, String resourceGroupName, Context context) {
        this.serviceClient().delete(deviceName, name, resourceGroupName, context);
    }

    public User getById(String id) {
        String deviceName = ResourceManagerUtils.getValueFromIdByName(id, "dataBoxEdgeDevices");
        if (deviceName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'dataBoxEdgeDevices'.", id)));
        }
        String name = ResourceManagerUtils.getValueFromIdByName(id, "users");
        if (name == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'users'.", id)));
        }
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        return this.getWithResponse(deviceName, name, resourceGroupName, Context.NONE).getValue();
    }

    public Response<User> getByIdWithResponse(String id, Context context) {
        String deviceName = ResourceManagerUtils.getValueFromIdByName(id, "dataBoxEdgeDevices");
        if (deviceName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'dataBoxEdgeDevices'.", id)));
        }
        String name = ResourceManagerUtils.getValueFromIdByName(id, "users");
        if (name == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'users'.", id)));
        }
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        return this.getWithResponse(deviceName, name, resourceGroupName, context);
    }

    public void deleteById(String id) {
        String deviceName = ResourceManagerUtils.getValueFromIdByName(id, "dataBoxEdgeDevices");
        if (deviceName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'dataBoxEdgeDevices'.", id)));
        }
        String name = ResourceManagerUtils.getValueFromIdByName(id, "users");
        if (name == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'users'.", id)));
        }
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        this.delete(deviceName, name, resourceGroupName, Context.NONE);
    }

    public void deleteByIdWithResponse(String id, Context context) {
        String deviceName = ResourceManagerUtils.getValueFromIdByName(id, "dataBoxEdgeDevices");
        if (deviceName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'dataBoxEdgeDevices'.", id)));
        }
        String name = ResourceManagerUtils.getValueFromIdByName(id, "users");
        if (name == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'users'.", id)));
        }
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        this.delete(deviceName, name, resourceGroupName, context);
    }

    private UsersClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.databoxedge.DataBoxEdgeManager manager() {
        return this.serviceManager;
    }

    public UserImpl define(String name) {
        return new UserImpl(name, this.manager());
    }
}
