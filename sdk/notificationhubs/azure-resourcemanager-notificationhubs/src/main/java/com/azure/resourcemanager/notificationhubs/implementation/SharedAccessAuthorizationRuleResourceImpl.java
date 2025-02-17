// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.notificationhubs.implementation;

import com.azure.core.http.rest.Response;
import com.azure.core.management.Region;
import com.azure.core.util.Context;
import com.azure.resourcemanager.notificationhubs.fluent.models.SharedAccessAuthorizationRuleProperties;
import com.azure.resourcemanager.notificationhubs.fluent.models.SharedAccessAuthorizationRuleResourceInner;
import com.azure.resourcemanager.notificationhubs.models.AccessRights;
import com.azure.resourcemanager.notificationhubs.models.PolicykeyResource;
import com.azure.resourcemanager.notificationhubs.models.ResourceListKeys;
import com.azure.resourcemanager.notificationhubs.models.SharedAccessAuthorizationRuleCreateOrUpdateParameters;
import com.azure.resourcemanager.notificationhubs.models.SharedAccessAuthorizationRuleResource;
import com.azure.resourcemanager.notificationhubs.models.Sku;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public final class SharedAccessAuthorizationRuleResourceImpl implements SharedAccessAuthorizationRuleResource,
    SharedAccessAuthorizationRuleResource.Definition, SharedAccessAuthorizationRuleResource.Update {
    private SharedAccessAuthorizationRuleResourceInner innerObject;

    private final com.azure.resourcemanager.notificationhubs.NotificationHubsManager serviceManager;

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

    public Sku sku() {
        return this.innerModel().sku();
    }

    public List<AccessRights> rights() {
        List<AccessRights> inner = this.innerModel().rights();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public String primaryKey() {
        return this.innerModel().primaryKey();
    }

    public String secondaryKey() {
        return this.innerModel().secondaryKey();
    }

    public String keyName() {
        return this.innerModel().keyName();
    }

    public String claimType() {
        return this.innerModel().claimType();
    }

    public String claimValue() {
        return this.innerModel().claimValue();
    }

    public String modifiedTime() {
        return this.innerModel().modifiedTime();
    }

    public String createdTime() {
        return this.innerModel().createdTime();
    }

    public Integer revision() {
        return this.innerModel().revision();
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

    public SharedAccessAuthorizationRuleResourceInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.notificationhubs.NotificationHubsManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String namespaceName;

    private String authorizationRuleName;

    private SharedAccessAuthorizationRuleCreateOrUpdateParameters createParameters;

    private SharedAccessAuthorizationRuleCreateOrUpdateParameters updateParameters;

    public SharedAccessAuthorizationRuleResourceImpl withExistingNamespace(String resourceGroupName,
        String namespaceName) {
        this.resourceGroupName = resourceGroupName;
        this.namespaceName = namespaceName;
        return this;
    }

    public SharedAccessAuthorizationRuleResource create() {
        this.innerObject = serviceManager.serviceClient()
            .getNamespaces()
            .createOrUpdateAuthorizationRuleWithResponse(resourceGroupName, namespaceName, authorizationRuleName,
                createParameters, Context.NONE)
            .getValue();
        return this;
    }

    public SharedAccessAuthorizationRuleResource create(Context context) {
        this.innerObject = serviceManager.serviceClient()
            .getNamespaces()
            .createOrUpdateAuthorizationRuleWithResponse(resourceGroupName, namespaceName, authorizationRuleName,
                createParameters, context)
            .getValue();
        return this;
    }

    SharedAccessAuthorizationRuleResourceImpl(String name,
        com.azure.resourcemanager.notificationhubs.NotificationHubsManager serviceManager) {
        this.innerObject = new SharedAccessAuthorizationRuleResourceInner();
        this.serviceManager = serviceManager;
        this.authorizationRuleName = name;
        this.createParameters = new SharedAccessAuthorizationRuleCreateOrUpdateParameters();
    }

    public SharedAccessAuthorizationRuleResourceImpl update() {
        this.updateParameters = new SharedAccessAuthorizationRuleCreateOrUpdateParameters();
        return this;
    }

    public SharedAccessAuthorizationRuleResource apply() {
        this.innerObject = serviceManager.serviceClient()
            .getNamespaces()
            .createOrUpdateAuthorizationRuleWithResponse(resourceGroupName, namespaceName, authorizationRuleName,
                updateParameters, Context.NONE)
            .getValue();
        return this;
    }

    public SharedAccessAuthorizationRuleResource apply(Context context) {
        this.innerObject = serviceManager.serviceClient()
            .getNamespaces()
            .createOrUpdateAuthorizationRuleWithResponse(resourceGroupName, namespaceName, authorizationRuleName,
                updateParameters, context)
            .getValue();
        return this;
    }

    SharedAccessAuthorizationRuleResourceImpl(SharedAccessAuthorizationRuleResourceInner innerObject,
        com.azure.resourcemanager.notificationhubs.NotificationHubsManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = ResourceManagerUtils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.namespaceName = ResourceManagerUtils.getValueFromIdByName(innerObject.id(), "namespaces");
        this.authorizationRuleName = ResourceManagerUtils.getValueFromIdByName(innerObject.id(), "AuthorizationRules");
    }

    public SharedAccessAuthorizationRuleResource refresh() {
        this.innerObject = serviceManager.serviceClient()
            .getNamespaces()
            .getAuthorizationRuleWithResponse(resourceGroupName, namespaceName, authorizationRuleName, Context.NONE)
            .getValue();
        return this;
    }

    public SharedAccessAuthorizationRuleResource refresh(Context context) {
        this.innerObject = serviceManager.serviceClient()
            .getNamespaces()
            .getAuthorizationRuleWithResponse(resourceGroupName, namespaceName, authorizationRuleName, context)
            .getValue();
        return this;
    }

    public Response<ResourceListKeys> listKeysWithResponse(Context context) {
        return serviceManager.namespaces()
            .listKeysWithResponse(resourceGroupName, namespaceName, authorizationRuleName, context);
    }

    public ResourceListKeys listKeys() {
        return serviceManager.namespaces().listKeys(resourceGroupName, namespaceName, authorizationRuleName);
    }

    public Response<ResourceListKeys> regenerateKeysWithResponse(PolicykeyResource parameters, Context context) {
        return serviceManager.namespaces()
            .regenerateKeysWithResponse(resourceGroupName, namespaceName, authorizationRuleName, parameters, context);
    }

    public ResourceListKeys regenerateKeys(PolicykeyResource parameters) {
        return serviceManager.namespaces()
            .regenerateKeys(resourceGroupName, namespaceName, authorizationRuleName, parameters);
    }

    public SharedAccessAuthorizationRuleResourceImpl
        withProperties(SharedAccessAuthorizationRuleProperties properties) {
        if (isInCreateMode()) {
            this.createParameters.withProperties(properties);
            return this;
        } else {
            this.updateParameters.withProperties(properties);
            return this;
        }
    }

    private boolean isInCreateMode() {
        return this.innerModel().id() == null;
    }
}
