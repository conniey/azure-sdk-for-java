// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.migration.assessment.implementation;

import com.azure.core.management.SystemData;
import com.azure.resourcemanager.migration.assessment.fluent.models.SqlAssessmentV2SummaryInner;
import com.azure.resourcemanager.migration.assessment.models.SqlAssessmentV2Summary;
import com.azure.resourcemanager.migration.assessment.models.SqlAssessmentV2SummaryProperties;

public final class SqlAssessmentV2SummaryImpl implements SqlAssessmentV2Summary {
    private SqlAssessmentV2SummaryInner innerObject;

    private final com.azure.resourcemanager.migration.assessment.MigrationAssessmentManager serviceManager;

    SqlAssessmentV2SummaryImpl(SqlAssessmentV2SummaryInner innerObject,
        com.azure.resourcemanager.migration.assessment.MigrationAssessmentManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public SqlAssessmentV2SummaryProperties properties() {
        return this.innerModel().properties();
    }

    public SystemData systemData() {
        return this.innerModel().systemData();
    }

    public SqlAssessmentV2SummaryInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.migration.assessment.MigrationAssessmentManager manager() {
        return this.serviceManager;
    }
}
