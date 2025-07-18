// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.networkcloud.implementation;

import com.azure.core.management.Region;
import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.networkcloud.fluent.models.L2NetworkInner;
import com.azure.resourcemanager.networkcloud.models.ExtendedLocation;
import com.azure.resourcemanager.networkcloud.models.HybridAksPluginType;
import com.azure.resourcemanager.networkcloud.models.L2Network;
import com.azure.resourcemanager.networkcloud.models.L2NetworkDetailedStatus;
import com.azure.resourcemanager.networkcloud.models.L2NetworkPatchParameters;
import com.azure.resourcemanager.networkcloud.models.L2NetworkProvisioningState;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public final class L2NetworkImpl implements L2Network, L2Network.Definition, L2Network.Update {
    private L2NetworkInner innerObject;

    private final com.azure.resourcemanager.networkcloud.NetworkCloudManager serviceManager;

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public String location() {
        return this.innerModel().location();
    }

    public Map<String, String> tags() {
        Map<String, String> inner = this.innerModel().tags();
        if (inner != null) {
            return Collections.unmodifiableMap(inner);
        } else {
            return Collections.emptyMap();
        }
    }

    public String etag() {
        return this.innerModel().etag();
    }

    public ExtendedLocation extendedLocation() {
        return this.innerModel().extendedLocation();
    }

    public SystemData systemData() {
        return this.innerModel().systemData();
    }

    public List<String> associatedResourceIds() {
        List<String> inner = this.innerModel().associatedResourceIds();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public String clusterId() {
        return this.innerModel().clusterId();
    }

    public L2NetworkDetailedStatus detailedStatus() {
        return this.innerModel().detailedStatus();
    }

    public String detailedStatusMessage() {
        return this.innerModel().detailedStatusMessage();
    }

    public List<String> hybridAksClustersAssociatedIds() {
        List<String> inner = this.innerModel().hybridAksClustersAssociatedIds();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public HybridAksPluginType hybridAksPluginType() {
        return this.innerModel().hybridAksPluginType();
    }

    public String interfaceName() {
        return this.innerModel().interfaceName();
    }

    public String l2IsolationDomainId() {
        return this.innerModel().l2IsolationDomainId();
    }

    public L2NetworkProvisioningState provisioningState() {
        return this.innerModel().provisioningState();
    }

    public List<String> virtualMachinesAssociatedIds() {
        List<String> inner = this.innerModel().virtualMachinesAssociatedIds();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public Region region() {
        return Region.fromName(this.regionName());
    }

    public String regionName() {
        return this.location();
    }

    public String resourceGroupName() {
        return resourceGroupName;
    }

    public L2NetworkInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.networkcloud.NetworkCloudManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String l2NetworkName;

    private String createIfMatch;

    private String createIfNoneMatch;

    private String updateIfMatch;

    private String updateIfNoneMatch;

    private L2NetworkPatchParameters updateL2NetworkUpdateParameters;

    public L2NetworkImpl withExistingResourceGroup(String resourceGroupName) {
        this.resourceGroupName = resourceGroupName;
        return this;
    }

    public L2Network create() {
        this.innerObject = serviceManager.serviceClient()
            .getL2Networks()
            .createOrUpdate(resourceGroupName, l2NetworkName, this.innerModel(), createIfMatch, createIfNoneMatch,
                Context.NONE);
        return this;
    }

    public L2Network create(Context context) {
        this.innerObject = serviceManager.serviceClient()
            .getL2Networks()
            .createOrUpdate(resourceGroupName, l2NetworkName, this.innerModel(), createIfMatch, createIfNoneMatch,
                context);
        return this;
    }

    L2NetworkImpl(String name, com.azure.resourcemanager.networkcloud.NetworkCloudManager serviceManager) {
        this.innerObject = new L2NetworkInner();
        this.serviceManager = serviceManager;
        this.l2NetworkName = name;
        this.createIfMatch = null;
        this.createIfNoneMatch = null;
    }

    public L2NetworkImpl update() {
        this.updateIfMatch = null;
        this.updateIfNoneMatch = null;
        this.updateL2NetworkUpdateParameters = new L2NetworkPatchParameters();
        return this;
    }

    public L2Network apply() {
        this.innerObject = serviceManager.serviceClient()
            .getL2Networks()
            .updateWithResponse(resourceGroupName, l2NetworkName, updateIfMatch, updateIfNoneMatch,
                updateL2NetworkUpdateParameters, Context.NONE)
            .getValue();
        return this;
    }

    public L2Network apply(Context context) {
        this.innerObject = serviceManager.serviceClient()
            .getL2Networks()
            .updateWithResponse(resourceGroupName, l2NetworkName, updateIfMatch, updateIfNoneMatch,
                updateL2NetworkUpdateParameters, context)
            .getValue();
        return this;
    }

    L2NetworkImpl(L2NetworkInner innerObject,
        com.azure.resourcemanager.networkcloud.NetworkCloudManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = ResourceManagerUtils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.l2NetworkName = ResourceManagerUtils.getValueFromIdByName(innerObject.id(), "l2Networks");
    }

    public L2Network refresh() {
        this.innerObject = serviceManager.serviceClient()
            .getL2Networks()
            .getByResourceGroupWithResponse(resourceGroupName, l2NetworkName, Context.NONE)
            .getValue();
        return this;
    }

    public L2Network refresh(Context context) {
        this.innerObject = serviceManager.serviceClient()
            .getL2Networks()
            .getByResourceGroupWithResponse(resourceGroupName, l2NetworkName, context)
            .getValue();
        return this;
    }

    public L2NetworkImpl withRegion(Region location) {
        this.innerModel().withLocation(location.toString());
        return this;
    }

    public L2NetworkImpl withRegion(String location) {
        this.innerModel().withLocation(location);
        return this;
    }

    public L2NetworkImpl withExtendedLocation(ExtendedLocation extendedLocation) {
        this.innerModel().withExtendedLocation(extendedLocation);
        return this;
    }

    public L2NetworkImpl withL2IsolationDomainId(String l2IsolationDomainId) {
        this.innerModel().withL2IsolationDomainId(l2IsolationDomainId);
        return this;
    }

    public L2NetworkImpl withTags(Map<String, String> tags) {
        if (isInCreateMode()) {
            this.innerModel().withTags(tags);
            return this;
        } else {
            this.updateL2NetworkUpdateParameters.withTags(tags);
            return this;
        }
    }

    public L2NetworkImpl withHybridAksPluginType(HybridAksPluginType hybridAksPluginType) {
        this.innerModel().withHybridAksPluginType(hybridAksPluginType);
        return this;
    }

    public L2NetworkImpl withInterfaceName(String interfaceName) {
        this.innerModel().withInterfaceName(interfaceName);
        return this;
    }

    public L2NetworkImpl withIfMatch(String ifMatch) {
        if (isInCreateMode()) {
            this.createIfMatch = ifMatch;
            return this;
        } else {
            this.updateIfMatch = ifMatch;
            return this;
        }
    }

    public L2NetworkImpl withIfNoneMatch(String ifNoneMatch) {
        if (isInCreateMode()) {
            this.createIfNoneMatch = ifNoneMatch;
            return this;
        } else {
            this.updateIfNoneMatch = ifNoneMatch;
            return this;
        }
    }

    private boolean isInCreateMode() {
        return this.innerModel() == null || this.innerModel().id() == null;
    }
}
