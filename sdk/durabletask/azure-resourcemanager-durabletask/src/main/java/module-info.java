// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

module com.azure.resourcemanager.durabletask {
    requires transitive com.azure.core.management;

    exports com.azure.resourcemanager.durabletask;
    exports com.azure.resourcemanager.durabletask.fluent;
    exports com.azure.resourcemanager.durabletask.fluent.models;
    exports com.azure.resourcemanager.durabletask.models;

    opens com.azure.resourcemanager.durabletask.fluent.models to com.azure.core;
    opens com.azure.resourcemanager.durabletask.models to com.azure.core;
    opens com.azure.resourcemanager.durabletask.implementation.models to com.azure.core;
}
