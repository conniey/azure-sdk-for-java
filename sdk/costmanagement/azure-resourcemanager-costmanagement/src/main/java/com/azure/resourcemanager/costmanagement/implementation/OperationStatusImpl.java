// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.costmanagement.implementation;

import com.azure.resourcemanager.costmanagement.fluent.models.OperationStatusInner;
import com.azure.resourcemanager.costmanagement.models.OperationStatus;
import com.azure.resourcemanager.costmanagement.models.OperationStatusType;
import com.azure.resourcemanager.costmanagement.models.ReservationReportSchema;
import java.time.OffsetDateTime;

public final class OperationStatusImpl implements OperationStatus {
    private OperationStatusInner innerObject;

    private final com.azure.resourcemanager.costmanagement.CostManagementManager serviceManager;

    OperationStatusImpl(OperationStatusInner innerObject,
        com.azure.resourcemanager.costmanagement.CostManagementManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public OperationStatusType status() {
        return this.innerModel().status();
    }

    public ReservationReportSchema reportUrl() {
        return this.innerModel().reportUrl();
    }

    public OffsetDateTime validUntil() {
        return this.innerModel().validUntil();
    }

    public OperationStatusInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.costmanagement.CostManagementManager manager() {
        return this.serviceManager;
    }
}
