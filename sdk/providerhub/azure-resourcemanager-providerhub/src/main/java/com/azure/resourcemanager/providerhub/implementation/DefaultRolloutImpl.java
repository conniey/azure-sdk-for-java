// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.providerhub.implementation;

import com.azure.core.http.rest.Response;
import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.providerhub.fluent.models.DefaultRolloutInner;
import com.azure.resourcemanager.providerhub.models.DefaultRollout;
import com.azure.resourcemanager.providerhub.models.DefaultRolloutProperties;

public final class DefaultRolloutImpl implements DefaultRollout, DefaultRollout.Definition, DefaultRollout.Update {
    private DefaultRolloutInner innerObject;

    private final com.azure.resourcemanager.providerhub.ProviderHubManager serviceManager;

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public DefaultRolloutProperties properties() {
        return this.innerModel().properties();
    }

    public SystemData systemData() {
        return this.innerModel().systemData();
    }

    public DefaultRolloutInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.providerhub.ProviderHubManager manager() {
        return this.serviceManager;
    }

    private String providerNamespace;

    private String rolloutName;

    public DefaultRolloutImpl withExistingProviderRegistration(String providerNamespace) {
        this.providerNamespace = providerNamespace;
        return this;
    }

    public DefaultRollout create() {
        this.innerObject = serviceManager.serviceClient()
            .getDefaultRollouts()
            .createOrUpdate(providerNamespace, rolloutName, this.innerModel(), Context.NONE);
        return this;
    }

    public DefaultRollout create(Context context) {
        this.innerObject = serviceManager.serviceClient()
            .getDefaultRollouts()
            .createOrUpdate(providerNamespace, rolloutName, this.innerModel(), context);
        return this;
    }

    DefaultRolloutImpl(String name, com.azure.resourcemanager.providerhub.ProviderHubManager serviceManager) {
        this.innerObject = new DefaultRolloutInner();
        this.serviceManager = serviceManager;
        this.rolloutName = name;
    }

    public DefaultRolloutImpl update() {
        return this;
    }

    public DefaultRollout apply() {
        this.innerObject = serviceManager.serviceClient()
            .getDefaultRollouts()
            .createOrUpdate(providerNamespace, rolloutName, this.innerModel(), Context.NONE);
        return this;
    }

    public DefaultRollout apply(Context context) {
        this.innerObject = serviceManager.serviceClient()
            .getDefaultRollouts()
            .createOrUpdate(providerNamespace, rolloutName, this.innerModel(), context);
        return this;
    }

    DefaultRolloutImpl(DefaultRolloutInner innerObject,
        com.azure.resourcemanager.providerhub.ProviderHubManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.providerNamespace = ResourceManagerUtils.getValueFromIdByName(innerObject.id(), "providerRegistrations");
        this.rolloutName = ResourceManagerUtils.getValueFromIdByName(innerObject.id(), "defaultRollouts");
    }

    public DefaultRollout refresh() {
        this.innerObject = serviceManager.serviceClient()
            .getDefaultRollouts()
            .getWithResponse(providerNamespace, rolloutName, Context.NONE)
            .getValue();
        return this;
    }

    public DefaultRollout refresh(Context context) {
        this.innerObject = serviceManager.serviceClient()
            .getDefaultRollouts()
            .getWithResponse(providerNamespace, rolloutName, context)
            .getValue();
        return this;
    }

    public Response<Void> stopWithResponse(Context context) {
        return serviceManager.defaultRollouts().stopWithResponse(providerNamespace, rolloutName, context);
    }

    public void stop() {
        serviceManager.defaultRollouts().stop(providerNamespace, rolloutName);
    }

    public DefaultRolloutImpl withProperties(DefaultRolloutProperties properties) {
        this.innerModel().withProperties(properties);
        return this;
    }
}
