// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.confluent.implementation;

import com.azure.resourcemanager.confluent.fluent.models.ValidationResponseInner;
import com.azure.resourcemanager.confluent.models.ValidationResponse;
import java.util.Collections;
import java.util.Map;

public final class ValidationResponseImpl implements ValidationResponse {
    private ValidationResponseInner innerObject;

    private final com.azure.resourcemanager.confluent.ConfluentManager serviceManager;

    ValidationResponseImpl(ValidationResponseInner innerObject,
        com.azure.resourcemanager.confluent.ConfluentManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public Map<String, String> info() {
        Map<String, String> inner = this.innerModel().info();
        if (inner != null) {
            return Collections.unmodifiableMap(inner);
        } else {
            return Collections.emptyMap();
        }
    }

    public ValidationResponseInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.confluent.ConfluentManager manager() {
        return this.serviceManager;
    }
}
