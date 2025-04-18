// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.logic.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.logic.fluent.IntegrationAccountAgreementsClient;
import com.azure.resourcemanager.logic.fluent.models.IntegrationAccountAgreementInner;
import com.azure.resourcemanager.logic.fluent.models.WorkflowTriggerCallbackUrlInner;
import com.azure.resourcemanager.logic.models.GetCallbackUrlParameters;
import com.azure.resourcemanager.logic.models.IntegrationAccountAgreement;
import com.azure.resourcemanager.logic.models.IntegrationAccountAgreements;
import com.azure.resourcemanager.logic.models.WorkflowTriggerCallbackUrl;

public final class IntegrationAccountAgreementsImpl implements IntegrationAccountAgreements {
    private static final ClientLogger LOGGER = new ClientLogger(IntegrationAccountAgreementsImpl.class);

    private final IntegrationAccountAgreementsClient innerClient;

    private final com.azure.resourcemanager.logic.LogicManager serviceManager;

    public IntegrationAccountAgreementsImpl(IntegrationAccountAgreementsClient innerClient,
        com.azure.resourcemanager.logic.LogicManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<IntegrationAccountAgreement> list(String resourceGroupName, String integrationAccountName) {
        PagedIterable<IntegrationAccountAgreementInner> inner
            = this.serviceClient().list(resourceGroupName, integrationAccountName);
        return ResourceManagerUtils.mapPage(inner,
            inner1 -> new IntegrationAccountAgreementImpl(inner1, this.manager()));
    }

    public PagedIterable<IntegrationAccountAgreement> list(String resourceGroupName, String integrationAccountName,
        Integer top, String filter, Context context) {
        PagedIterable<IntegrationAccountAgreementInner> inner
            = this.serviceClient().list(resourceGroupName, integrationAccountName, top, filter, context);
        return ResourceManagerUtils.mapPage(inner,
            inner1 -> new IntegrationAccountAgreementImpl(inner1, this.manager()));
    }

    public Response<IntegrationAccountAgreement> getWithResponse(String resourceGroupName,
        String integrationAccountName, String agreementName, Context context) {
        Response<IntegrationAccountAgreementInner> inner
            = this.serviceClient().getWithResponse(resourceGroupName, integrationAccountName, agreementName, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new IntegrationAccountAgreementImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public IntegrationAccountAgreement get(String resourceGroupName, String integrationAccountName,
        String agreementName) {
        IntegrationAccountAgreementInner inner
            = this.serviceClient().get(resourceGroupName, integrationAccountName, agreementName);
        if (inner != null) {
            return new IntegrationAccountAgreementImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<Void> deleteWithResponse(String resourceGroupName, String integrationAccountName,
        String agreementName, Context context) {
        return this.serviceClient()
            .deleteWithResponse(resourceGroupName, integrationAccountName, agreementName, context);
    }

    public void delete(String resourceGroupName, String integrationAccountName, String agreementName) {
        this.serviceClient().delete(resourceGroupName, integrationAccountName, agreementName);
    }

    public Response<WorkflowTriggerCallbackUrl> listContentCallbackUrlWithResponse(String resourceGroupName,
        String integrationAccountName, String agreementName, GetCallbackUrlParameters listContentCallbackUrl,
        Context context) {
        Response<WorkflowTriggerCallbackUrlInner> inner = this.serviceClient()
            .listContentCallbackUrlWithResponse(resourceGroupName, integrationAccountName, agreementName,
                listContentCallbackUrl, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new WorkflowTriggerCallbackUrlImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public WorkflowTriggerCallbackUrl listContentCallbackUrl(String resourceGroupName, String integrationAccountName,
        String agreementName, GetCallbackUrlParameters listContentCallbackUrl) {
        WorkflowTriggerCallbackUrlInner inner = this.serviceClient()
            .listContentCallbackUrl(resourceGroupName, integrationAccountName, agreementName, listContentCallbackUrl);
        if (inner != null) {
            return new WorkflowTriggerCallbackUrlImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public IntegrationAccountAgreement getById(String id) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String integrationAccountName = ResourceManagerUtils.getValueFromIdByName(id, "integrationAccounts");
        if (integrationAccountName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'integrationAccounts'.", id)));
        }
        String agreementName = ResourceManagerUtils.getValueFromIdByName(id, "agreements");
        if (agreementName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'agreements'.", id)));
        }
        return this.getWithResponse(resourceGroupName, integrationAccountName, agreementName, Context.NONE).getValue();
    }

    public Response<IntegrationAccountAgreement> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String integrationAccountName = ResourceManagerUtils.getValueFromIdByName(id, "integrationAccounts");
        if (integrationAccountName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'integrationAccounts'.", id)));
        }
        String agreementName = ResourceManagerUtils.getValueFromIdByName(id, "agreements");
        if (agreementName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'agreements'.", id)));
        }
        return this.getWithResponse(resourceGroupName, integrationAccountName, agreementName, context);
    }

    public void deleteById(String id) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String integrationAccountName = ResourceManagerUtils.getValueFromIdByName(id, "integrationAccounts");
        if (integrationAccountName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'integrationAccounts'.", id)));
        }
        String agreementName = ResourceManagerUtils.getValueFromIdByName(id, "agreements");
        if (agreementName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'agreements'.", id)));
        }
        this.deleteWithResponse(resourceGroupName, integrationAccountName, agreementName, Context.NONE);
    }

    public Response<Void> deleteByIdWithResponse(String id, Context context) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String integrationAccountName = ResourceManagerUtils.getValueFromIdByName(id, "integrationAccounts");
        if (integrationAccountName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'integrationAccounts'.", id)));
        }
        String agreementName = ResourceManagerUtils.getValueFromIdByName(id, "agreements");
        if (agreementName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'agreements'.", id)));
        }
        return this.deleteWithResponse(resourceGroupName, integrationAccountName, agreementName, context);
    }

    private IntegrationAccountAgreementsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.logic.LogicManager manager() {
        return this.serviceManager;
    }

    public IntegrationAccountAgreementImpl define(String name) {
        return new IntegrationAccountAgreementImpl(name, this.manager());
    }
}
