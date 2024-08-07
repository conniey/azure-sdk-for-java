// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

module com.azure.resourcemanager.storage {
    requires transitive com.azure.resourcemanager.resources;
    requires com.azure.resourcemanager.msi;

    // export public APIs of storage
    exports com.azure.resourcemanager.storage;
    exports com.azure.resourcemanager.storage.fluent;
    exports com.azure.resourcemanager.storage.fluent.models;
    exports com.azure.resourcemanager.storage.models;

    // open packages specifically for azure core
    opens com.azure.resourcemanager.storage.fluent.models to com.azure.core;
    opens com.azure.resourcemanager.storage.models to com.azure.core;
}
