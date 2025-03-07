// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.implementation;

import com.azure.core.util.Context;
import com.azure.resourcemanager.apimanagement.fluent.models.DiagnosticContractInner;
import com.azure.resourcemanager.apimanagement.models.AlwaysLog;
import com.azure.resourcemanager.apimanagement.models.DiagnosticContract;
import com.azure.resourcemanager.apimanagement.models.HttpCorrelationProtocol;
import com.azure.resourcemanager.apimanagement.models.OperationNameFormat;
import com.azure.resourcemanager.apimanagement.models.PipelineDiagnosticSettings;
import com.azure.resourcemanager.apimanagement.models.SamplingSettings;
import com.azure.resourcemanager.apimanagement.models.Verbosity;

public final class DiagnosticContractImpl
    implements DiagnosticContract, DiagnosticContract.Definition, DiagnosticContract.Update {
    private DiagnosticContractInner innerObject;

    private final com.azure.resourcemanager.apimanagement.ApiManagementManager serviceManager;

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public AlwaysLog alwaysLog() {
        return this.innerModel().alwaysLog();
    }

    public String loggerId() {
        return this.innerModel().loggerId();
    }

    public SamplingSettings sampling() {
        return this.innerModel().sampling();
    }

    public PipelineDiagnosticSettings frontend() {
        return this.innerModel().frontend();
    }

    public PipelineDiagnosticSettings backend() {
        return this.innerModel().backend();
    }

    public Boolean logClientIp() {
        return this.innerModel().logClientIp();
    }

    public HttpCorrelationProtocol httpCorrelationProtocol() {
        return this.innerModel().httpCorrelationProtocol();
    }

    public Verbosity verbosity() {
        return this.innerModel().verbosity();
    }

    public OperationNameFormat operationNameFormat() {
        return this.innerModel().operationNameFormat();
    }

    public Boolean metrics() {
        return this.innerModel().metrics();
    }

    public String resourceGroupName() {
        return resourceGroupName;
    }

    public DiagnosticContractInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.apimanagement.ApiManagementManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String serviceName;

    private String apiId;

    private String diagnosticId;

    private String createIfMatch;

    private String updateIfMatch;

    public DiagnosticContractImpl withExistingApi(String resourceGroupName, String serviceName, String apiId) {
        this.resourceGroupName = resourceGroupName;
        this.serviceName = serviceName;
        this.apiId = apiId;
        return this;
    }

    public DiagnosticContract create() {
        this.innerObject = serviceManager.serviceClient()
            .getApiDiagnostics()
            .createOrUpdateWithResponse(resourceGroupName, serviceName, apiId, diagnosticId, this.innerModel(),
                createIfMatch, Context.NONE)
            .getValue();
        return this;
    }

    public DiagnosticContract create(Context context) {
        this.innerObject = serviceManager.serviceClient()
            .getApiDiagnostics()
            .createOrUpdateWithResponse(resourceGroupName, serviceName, apiId, diagnosticId, this.innerModel(),
                createIfMatch, context)
            .getValue();
        return this;
    }

    DiagnosticContractImpl(String name, com.azure.resourcemanager.apimanagement.ApiManagementManager serviceManager) {
        this.innerObject = new DiagnosticContractInner();
        this.serviceManager = serviceManager;
        this.diagnosticId = name;
        this.createIfMatch = null;
    }

    public DiagnosticContractImpl update() {
        this.updateIfMatch = null;
        return this;
    }

    public DiagnosticContract apply() {
        this.innerObject = serviceManager.serviceClient()
            .getApiDiagnostics()
            .updateWithResponse(resourceGroupName, serviceName, apiId, diagnosticId, updateIfMatch, this.innerModel(),
                Context.NONE)
            .getValue();
        return this;
    }

    public DiagnosticContract apply(Context context) {
        this.innerObject = serviceManager.serviceClient()
            .getApiDiagnostics()
            .updateWithResponse(resourceGroupName, serviceName, apiId, diagnosticId, updateIfMatch, this.innerModel(),
                context)
            .getValue();
        return this;
    }

    DiagnosticContractImpl(DiagnosticContractInner innerObject,
        com.azure.resourcemanager.apimanagement.ApiManagementManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = ResourceManagerUtils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.serviceName = ResourceManagerUtils.getValueFromIdByName(innerObject.id(), "service");
        this.apiId = ResourceManagerUtils.getValueFromIdByName(innerObject.id(), "apis");
        this.diagnosticId = ResourceManagerUtils.getValueFromIdByName(innerObject.id(), "diagnostics");
    }

    public DiagnosticContract refresh() {
        this.innerObject = serviceManager.serviceClient()
            .getApiDiagnostics()
            .getWithResponse(resourceGroupName, serviceName, apiId, diagnosticId, Context.NONE)
            .getValue();
        return this;
    }

    public DiagnosticContract refresh(Context context) {
        this.innerObject = serviceManager.serviceClient()
            .getApiDiagnostics()
            .getWithResponse(resourceGroupName, serviceName, apiId, diagnosticId, context)
            .getValue();
        return this;
    }

    public DiagnosticContractImpl withAlwaysLog(AlwaysLog alwaysLog) {
        this.innerModel().withAlwaysLog(alwaysLog);
        return this;
    }

    public DiagnosticContractImpl withLoggerId(String loggerId) {
        this.innerModel().withLoggerId(loggerId);
        return this;
    }

    public DiagnosticContractImpl withSampling(SamplingSettings sampling) {
        this.innerModel().withSampling(sampling);
        return this;
    }

    public DiagnosticContractImpl withFrontend(PipelineDiagnosticSettings frontend) {
        this.innerModel().withFrontend(frontend);
        return this;
    }

    public DiagnosticContractImpl withBackend(PipelineDiagnosticSettings backend) {
        this.innerModel().withBackend(backend);
        return this;
    }

    public DiagnosticContractImpl withLogClientIp(Boolean logClientIp) {
        this.innerModel().withLogClientIp(logClientIp);
        return this;
    }

    public DiagnosticContractImpl withHttpCorrelationProtocol(HttpCorrelationProtocol httpCorrelationProtocol) {
        this.innerModel().withHttpCorrelationProtocol(httpCorrelationProtocol);
        return this;
    }

    public DiagnosticContractImpl withVerbosity(Verbosity verbosity) {
        this.innerModel().withVerbosity(verbosity);
        return this;
    }

    public DiagnosticContractImpl withOperationNameFormat(OperationNameFormat operationNameFormat) {
        this.innerModel().withOperationNameFormat(operationNameFormat);
        return this;
    }

    public DiagnosticContractImpl withMetrics(Boolean metrics) {
        this.innerModel().withMetrics(metrics);
        return this;
    }

    public DiagnosticContractImpl withIfMatch(String ifMatch) {
        if (isInCreateMode()) {
            this.createIfMatch = ifMatch;
            return this;
        } else {
            this.updateIfMatch = ifMatch;
            return this;
        }
    }

    private boolean isInCreateMode() {
        return this.innerModel().id() == null;
    }
}
