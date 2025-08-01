// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datamigration.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.datamigration.fluent.SqlMigrationServicesClient;
import com.azure.resourcemanager.datamigration.fluent.models.AuthenticationKeysInner;
import com.azure.resourcemanager.datamigration.fluent.models.DatabaseMigrationInner;
import com.azure.resourcemanager.datamigration.fluent.models.DeleteNodeInner;
import com.azure.resourcemanager.datamigration.fluent.models.IntegrationRuntimeMonitoringDataInner;
import com.azure.resourcemanager.datamigration.fluent.models.RegenAuthKeysInner;
import com.azure.resourcemanager.datamigration.fluent.models.SqlMigrationServiceInner;
import com.azure.resourcemanager.datamigration.models.AuthenticationKeys;
import com.azure.resourcemanager.datamigration.models.DatabaseMigration;
import com.azure.resourcemanager.datamigration.models.DeleteNode;
import com.azure.resourcemanager.datamigration.models.IntegrationRuntimeMonitoringData;
import com.azure.resourcemanager.datamigration.models.RegenAuthKeys;
import com.azure.resourcemanager.datamigration.models.SqlMigrationService;
import com.azure.resourcemanager.datamigration.models.SqlMigrationServices;

public final class SqlMigrationServicesImpl implements SqlMigrationServices {
    private static final ClientLogger LOGGER = new ClientLogger(SqlMigrationServicesImpl.class);

    private final SqlMigrationServicesClient innerClient;

    private final com.azure.resourcemanager.datamigration.DataMigrationManager serviceManager;

    public SqlMigrationServicesImpl(SqlMigrationServicesClient innerClient,
        com.azure.resourcemanager.datamigration.DataMigrationManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public Response<SqlMigrationService> getByResourceGroupWithResponse(String resourceGroupName,
        String sqlMigrationServiceName, Context context) {
        Response<SqlMigrationServiceInner> inner
            = this.serviceClient().getByResourceGroupWithResponse(resourceGroupName, sqlMigrationServiceName, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new SqlMigrationServiceImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public SqlMigrationService getByResourceGroup(String resourceGroupName, String sqlMigrationServiceName) {
        SqlMigrationServiceInner inner
            = this.serviceClient().getByResourceGroup(resourceGroupName, sqlMigrationServiceName);
        if (inner != null) {
            return new SqlMigrationServiceImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public void deleteByResourceGroup(String resourceGroupName, String sqlMigrationServiceName) {
        this.serviceClient().delete(resourceGroupName, sqlMigrationServiceName);
    }

    public void delete(String resourceGroupName, String sqlMigrationServiceName, Context context) {
        this.serviceClient().delete(resourceGroupName, sqlMigrationServiceName, context);
    }

    public PagedIterable<SqlMigrationService> listByResourceGroup(String resourceGroupName) {
        PagedIterable<SqlMigrationServiceInner> inner = this.serviceClient().listByResourceGroup(resourceGroupName);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new SqlMigrationServiceImpl(inner1, this.manager()));
    }

    public PagedIterable<SqlMigrationService> listByResourceGroup(String resourceGroupName, Context context) {
        PagedIterable<SqlMigrationServiceInner> inner
            = this.serviceClient().listByResourceGroup(resourceGroupName, context);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new SqlMigrationServiceImpl(inner1, this.manager()));
    }

    public Response<AuthenticationKeys> listAuthKeysWithResponse(String resourceGroupName,
        String sqlMigrationServiceName, Context context) {
        Response<AuthenticationKeysInner> inner
            = this.serviceClient().listAuthKeysWithResponse(resourceGroupName, sqlMigrationServiceName, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new AuthenticationKeysImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public AuthenticationKeys listAuthKeys(String resourceGroupName, String sqlMigrationServiceName) {
        AuthenticationKeysInner inner = this.serviceClient().listAuthKeys(resourceGroupName, sqlMigrationServiceName);
        if (inner != null) {
            return new AuthenticationKeysImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<RegenAuthKeys> regenerateAuthKeysWithResponse(String resourceGroupName,
        String sqlMigrationServiceName, RegenAuthKeysInner parameters, Context context) {
        Response<RegenAuthKeysInner> inner = this.serviceClient()
            .regenerateAuthKeysWithResponse(resourceGroupName, sqlMigrationServiceName, parameters, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new RegenAuthKeysImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public RegenAuthKeys regenerateAuthKeys(String resourceGroupName, String sqlMigrationServiceName,
        RegenAuthKeysInner parameters) {
        RegenAuthKeysInner inner
            = this.serviceClient().regenerateAuthKeys(resourceGroupName, sqlMigrationServiceName, parameters);
        if (inner != null) {
            return new RegenAuthKeysImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<DeleteNode> deleteNodeWithResponse(String resourceGroupName, String sqlMigrationServiceName,
        DeleteNodeInner parameters, Context context) {
        Response<DeleteNodeInner> inner = this.serviceClient()
            .deleteNodeWithResponse(resourceGroupName, sqlMigrationServiceName, parameters, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new DeleteNodeImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public DeleteNode deleteNode(String resourceGroupName, String sqlMigrationServiceName, DeleteNodeInner parameters) {
        DeleteNodeInner inner = this.serviceClient().deleteNode(resourceGroupName, sqlMigrationServiceName, parameters);
        if (inner != null) {
            return new DeleteNodeImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public PagedIterable<DatabaseMigration> listMigrations(String resourceGroupName, String sqlMigrationServiceName) {
        PagedIterable<DatabaseMigrationInner> inner
            = this.serviceClient().listMigrations(resourceGroupName, sqlMigrationServiceName);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new DatabaseMigrationImpl(inner1, this.manager()));
    }

    public PagedIterable<DatabaseMigration> listMigrations(String resourceGroupName, String sqlMigrationServiceName,
        Context context) {
        PagedIterable<DatabaseMigrationInner> inner
            = this.serviceClient().listMigrations(resourceGroupName, sqlMigrationServiceName, context);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new DatabaseMigrationImpl(inner1, this.manager()));
    }

    public Response<IntegrationRuntimeMonitoringData> listMonitoringDataWithResponse(String resourceGroupName,
        String sqlMigrationServiceName, Context context) {
        Response<IntegrationRuntimeMonitoringDataInner> inner
            = this.serviceClient().listMonitoringDataWithResponse(resourceGroupName, sqlMigrationServiceName, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new IntegrationRuntimeMonitoringDataImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public IntegrationRuntimeMonitoringData listMonitoringData(String resourceGroupName,
        String sqlMigrationServiceName) {
        IntegrationRuntimeMonitoringDataInner inner
            = this.serviceClient().listMonitoringData(resourceGroupName, sqlMigrationServiceName);
        if (inner != null) {
            return new IntegrationRuntimeMonitoringDataImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public PagedIterable<SqlMigrationService> list() {
        PagedIterable<SqlMigrationServiceInner> inner = this.serviceClient().list();
        return ResourceManagerUtils.mapPage(inner, inner1 -> new SqlMigrationServiceImpl(inner1, this.manager()));
    }

    public PagedIterable<SqlMigrationService> list(Context context) {
        PagedIterable<SqlMigrationServiceInner> inner = this.serviceClient().list(context);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new SqlMigrationServiceImpl(inner1, this.manager()));
    }

    public SqlMigrationService getById(String id) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String sqlMigrationServiceName = ResourceManagerUtils.getValueFromIdByName(id, "sqlMigrationServices");
        if (sqlMigrationServiceName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'sqlMigrationServices'.", id)));
        }
        return this.getByResourceGroupWithResponse(resourceGroupName, sqlMigrationServiceName, Context.NONE).getValue();
    }

    public Response<SqlMigrationService> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String sqlMigrationServiceName = ResourceManagerUtils.getValueFromIdByName(id, "sqlMigrationServices");
        if (sqlMigrationServiceName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'sqlMigrationServices'.", id)));
        }
        return this.getByResourceGroupWithResponse(resourceGroupName, sqlMigrationServiceName, context);
    }

    public void deleteById(String id) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String sqlMigrationServiceName = ResourceManagerUtils.getValueFromIdByName(id, "sqlMigrationServices");
        if (sqlMigrationServiceName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'sqlMigrationServices'.", id)));
        }
        this.delete(resourceGroupName, sqlMigrationServiceName, Context.NONE);
    }

    public void deleteByIdWithResponse(String id, Context context) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String sqlMigrationServiceName = ResourceManagerUtils.getValueFromIdByName(id, "sqlMigrationServices");
        if (sqlMigrationServiceName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'sqlMigrationServices'.", id)));
        }
        this.delete(resourceGroupName, sqlMigrationServiceName, context);
    }

    private SqlMigrationServicesClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.datamigration.DataMigrationManager manager() {
        return this.serviceManager;
    }

    public SqlMigrationServiceImpl define(String name) {
        return new SqlMigrationServiceImpl(name, this.manager());
    }
}
