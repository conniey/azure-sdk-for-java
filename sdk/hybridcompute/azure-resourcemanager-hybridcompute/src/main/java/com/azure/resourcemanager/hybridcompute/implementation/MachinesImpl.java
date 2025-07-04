// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridcompute.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.hybridcompute.fluent.MachinesClient;
import com.azure.resourcemanager.hybridcompute.fluent.models.MachineAssessPatchesResultInner;
import com.azure.resourcemanager.hybridcompute.fluent.models.MachineInner;
import com.azure.resourcemanager.hybridcompute.fluent.models.MachineInstallPatchesResultInner;
import com.azure.resourcemanager.hybridcompute.models.InstanceViewTypes;
import com.azure.resourcemanager.hybridcompute.models.Machine;
import com.azure.resourcemanager.hybridcompute.models.MachineAssessPatchesResult;
import com.azure.resourcemanager.hybridcompute.models.MachineInstallPatchesParameters;
import com.azure.resourcemanager.hybridcompute.models.MachineInstallPatchesResult;
import com.azure.resourcemanager.hybridcompute.models.Machines;

public final class MachinesImpl implements Machines {
    private static final ClientLogger LOGGER = new ClientLogger(MachinesImpl.class);

    private final MachinesClient innerClient;

    private final com.azure.resourcemanager.hybridcompute.HybridComputeManager serviceManager;

    public MachinesImpl(MachinesClient innerClient,
        com.azure.resourcemanager.hybridcompute.HybridComputeManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public void deleteByResourceGroup(String resourceGroupName, String machineName) {
        this.serviceClient().delete(resourceGroupName, machineName);
    }

    public void delete(String resourceGroupName, String machineName, Context context) {
        this.serviceClient().delete(resourceGroupName, machineName, context);
    }

    public Response<Machine> getByResourceGroupWithResponse(String resourceGroupName, String machineName,
        InstanceViewTypes expand, Context context) {
        Response<MachineInner> inner
            = this.serviceClient().getByResourceGroupWithResponse(resourceGroupName, machineName, expand, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new MachineImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public Machine getByResourceGroup(String resourceGroupName, String machineName) {
        MachineInner inner = this.serviceClient().getByResourceGroup(resourceGroupName, machineName);
        if (inner != null) {
            return new MachineImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public MachineAssessPatchesResult assessPatches(String resourceGroupName, String name) {
        MachineAssessPatchesResultInner inner = this.serviceClient().assessPatches(resourceGroupName, name);
        if (inner != null) {
            return new MachineAssessPatchesResultImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public MachineAssessPatchesResult assessPatches(String resourceGroupName, String name, Context context) {
        MachineAssessPatchesResultInner inner = this.serviceClient().assessPatches(resourceGroupName, name, context);
        if (inner != null) {
            return new MachineAssessPatchesResultImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public MachineInstallPatchesResult installPatches(String resourceGroupName, String name,
        MachineInstallPatchesParameters installPatchesInput) {
        MachineInstallPatchesResultInner inner
            = this.serviceClient().installPatches(resourceGroupName, name, installPatchesInput);
        if (inner != null) {
            return new MachineInstallPatchesResultImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public MachineInstallPatchesResult installPatches(String resourceGroupName, String name,
        MachineInstallPatchesParameters installPatchesInput, Context context) {
        MachineInstallPatchesResultInner inner
            = this.serviceClient().installPatches(resourceGroupName, name, installPatchesInput, context);
        if (inner != null) {
            return new MachineInstallPatchesResultImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public PagedIterable<Machine> listByResourceGroup(String resourceGroupName) {
        PagedIterable<MachineInner> inner = this.serviceClient().listByResourceGroup(resourceGroupName);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new MachineImpl(inner1, this.manager()));
    }

    public PagedIterable<Machine> listByResourceGroup(String resourceGroupName, String expand, Context context) {
        PagedIterable<MachineInner> inner
            = this.serviceClient().listByResourceGroup(resourceGroupName, expand, context);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new MachineImpl(inner1, this.manager()));
    }

    public PagedIterable<Machine> list() {
        PagedIterable<MachineInner> inner = this.serviceClient().list();
        return ResourceManagerUtils.mapPage(inner, inner1 -> new MachineImpl(inner1, this.manager()));
    }

    public PagedIterable<Machine> list(Context context) {
        PagedIterable<MachineInner> inner = this.serviceClient().list(context);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new MachineImpl(inner1, this.manager()));
    }

    private MachinesClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.hybridcompute.HybridComputeManager manager() {
        return this.serviceManager;
    }
}
