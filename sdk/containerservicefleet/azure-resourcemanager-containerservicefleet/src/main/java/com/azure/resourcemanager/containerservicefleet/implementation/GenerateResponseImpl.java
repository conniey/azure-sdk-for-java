// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.containerservicefleet.implementation;

import com.azure.resourcemanager.containerservicefleet.fluent.models.GenerateResponseInner;
import com.azure.resourcemanager.containerservicefleet.models.GenerateResponse;

public final class GenerateResponseImpl implements GenerateResponse {
    private GenerateResponseInner innerObject;

    private final com.azure.resourcemanager.containerservicefleet.ContainerServiceFleetManager serviceManager;

    GenerateResponseImpl(GenerateResponseInner innerObject,
        com.azure.resourcemanager.containerservicefleet.ContainerServiceFleetManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String id() {
        return this.innerModel().id();
    }

    public GenerateResponseInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.containerservicefleet.ContainerServiceFleetManager manager() {
        return this.serviceManager;
    }
}
