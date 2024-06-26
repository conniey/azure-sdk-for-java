// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.implementation;

import com.azure.resourcemanager.datafactory.fluent.models.DataFlowDebugSessionInfoInner;
import com.azure.resourcemanager.datafactory.models.DataFlowDebugSessionInfo;
import java.util.Collections;
import java.util.Map;

public final class DataFlowDebugSessionInfoImpl implements DataFlowDebugSessionInfo {
    private DataFlowDebugSessionInfoInner innerObject;

    private final com.azure.resourcemanager.datafactory.DataFactoryManager serviceManager;

    DataFlowDebugSessionInfoImpl(DataFlowDebugSessionInfoInner innerObject,
        com.azure.resourcemanager.datafactory.DataFactoryManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String dataFlowName() {
        return this.innerModel().dataFlowName();
    }

    public String computeType() {
        return this.innerModel().computeType();
    }

    public Integer coreCount() {
        return this.innerModel().coreCount();
    }

    public Integer nodeCount() {
        return this.innerModel().nodeCount();
    }

    public String integrationRuntimeName() {
        return this.innerModel().integrationRuntimeName();
    }

    public String sessionId() {
        return this.innerModel().sessionId();
    }

    public String startTime() {
        return this.innerModel().startTime();
    }

    public Integer timeToLiveInMinutes() {
        return this.innerModel().timeToLiveInMinutes();
    }

    public String lastActivityTime() {
        return this.innerModel().lastActivityTime();
    }

    public Map<String, Object> additionalProperties() {
        Map<String, Object> inner = this.innerModel().additionalProperties();
        if (inner != null) {
            return Collections.unmodifiableMap(inner);
        } else {
            return Collections.emptyMap();
        }
    }

    public DataFlowDebugSessionInfoInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.datafactory.DataFactoryManager manager() {
        return this.serviceManager;
    }
}
