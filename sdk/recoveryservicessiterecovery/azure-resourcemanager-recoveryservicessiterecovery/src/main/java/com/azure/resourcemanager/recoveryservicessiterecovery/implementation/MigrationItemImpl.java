// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.implementation;

import com.azure.core.management.Region;
import com.azure.core.util.Context;
import com.azure.resourcemanager.recoveryservicessiterecovery.fluent.models.MigrationItemInner;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.EnableMigrationInput;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.EnableMigrationInputProperties;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.MigrateInput;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.MigrationItem;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.MigrationItemProperties;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.PauseReplicationInput;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.ResumeReplicationInput;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.ResyncInput;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.TestMigrateCleanupInput;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.TestMigrateInput;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.UpdateMigrationItemInput;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.UpdateMigrationItemInputProperties;

public final class MigrationItemImpl implements MigrationItem, MigrationItem.Definition, MigrationItem.Update {
    private MigrationItemInner innerObject;

    private final com.azure.resourcemanager.recoveryservicessiterecovery.SiteRecoveryManager serviceManager;

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public MigrationItemProperties properties() {
        return this.innerModel().properties();
    }

    public String location() {
        return this.innerModel().location();
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

    public MigrationItemInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.recoveryservicessiterecovery.SiteRecoveryManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String resourceName;

    private String fabricName;

    private String protectionContainerName;

    private String migrationItemName;

    private EnableMigrationInput createInput;

    private UpdateMigrationItemInput updateInput;

    public MigrationItemImpl withExistingReplicationProtectionContainer(String resourceGroupName, String resourceName,
        String fabricName, String protectionContainerName) {
        this.resourceGroupName = resourceGroupName;
        this.resourceName = resourceName;
        this.fabricName = fabricName;
        this.protectionContainerName = protectionContainerName;
        return this;
    }

    public MigrationItem create() {
        this.innerObject = serviceManager.serviceClient()
            .getReplicationMigrationItems()
            .create(resourceGroupName, resourceName, fabricName, protectionContainerName, migrationItemName,
                createInput, Context.NONE);
        return this;
    }

    public MigrationItem create(Context context) {
        this.innerObject = serviceManager.serviceClient()
            .getReplicationMigrationItems()
            .create(resourceGroupName, resourceName, fabricName, protectionContainerName, migrationItemName,
                createInput, context);
        return this;
    }

    MigrationItemImpl(String name,
        com.azure.resourcemanager.recoveryservicessiterecovery.SiteRecoveryManager serviceManager) {
        this.innerObject = new MigrationItemInner();
        this.serviceManager = serviceManager;
        this.migrationItemName = name;
        this.createInput = new EnableMigrationInput();
    }

    public MigrationItemImpl update() {
        this.updateInput = new UpdateMigrationItemInput();
        return this;
    }

    public MigrationItem apply() {
        this.innerObject = serviceManager.serviceClient()
            .getReplicationMigrationItems()
            .update(resourceGroupName, resourceName, fabricName, protectionContainerName, migrationItemName,
                updateInput, Context.NONE);
        return this;
    }

    public MigrationItem apply(Context context) {
        this.innerObject = serviceManager.serviceClient()
            .getReplicationMigrationItems()
            .update(resourceGroupName, resourceName, fabricName, protectionContainerName, migrationItemName,
                updateInput, context);
        return this;
    }

    MigrationItemImpl(MigrationItemInner innerObject,
        com.azure.resourcemanager.recoveryservicessiterecovery.SiteRecoveryManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = ResourceManagerUtils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.resourceName = ResourceManagerUtils.getValueFromIdByName(innerObject.id(), "vaults");
        this.fabricName = ResourceManagerUtils.getValueFromIdByName(innerObject.id(), "replicationFabrics");
        this.protectionContainerName
            = ResourceManagerUtils.getValueFromIdByName(innerObject.id(), "replicationProtectionContainers");
        this.migrationItemName
            = ResourceManagerUtils.getValueFromIdByName(innerObject.id(), "replicationMigrationItems");
    }

    public MigrationItem refresh() {
        this.innerObject = serviceManager.serviceClient()
            .getReplicationMigrationItems()
            .getWithResponse(resourceGroupName, resourceName, fabricName, protectionContainerName, migrationItemName,
                Context.NONE)
            .getValue();
        return this;
    }

    public MigrationItem refresh(Context context) {
        this.innerObject = serviceManager.serviceClient()
            .getReplicationMigrationItems()
            .getWithResponse(resourceGroupName, resourceName, fabricName, protectionContainerName, migrationItemName,
                context)
            .getValue();
        return this;
    }

    public MigrationItem migrate(MigrateInput migrateInput) {
        return serviceManager.replicationMigrationItems()
            .migrate(resourceGroupName, resourceName, fabricName, protectionContainerName, migrationItemName,
                migrateInput);
    }

    public MigrationItem migrate(MigrateInput migrateInput, Context context) {
        return serviceManager.replicationMigrationItems()
            .migrate(resourceGroupName, resourceName, fabricName, protectionContainerName, migrationItemName,
                migrateInput, context);
    }

    public MigrationItem pauseReplication(PauseReplicationInput pauseReplicationInput) {
        return serviceManager.replicationMigrationItems()
            .pauseReplication(resourceGroupName, resourceName, fabricName, protectionContainerName, migrationItemName,
                pauseReplicationInput);
    }

    public MigrationItem pauseReplication(PauseReplicationInput pauseReplicationInput, Context context) {
        return serviceManager.replicationMigrationItems()
            .pauseReplication(resourceGroupName, resourceName, fabricName, protectionContainerName, migrationItemName,
                pauseReplicationInput, context);
    }

    public MigrationItem resumeReplication(ResumeReplicationInput resumeReplicationInput) {
        return serviceManager.replicationMigrationItems()
            .resumeReplication(resourceGroupName, resourceName, fabricName, protectionContainerName, migrationItemName,
                resumeReplicationInput);
    }

    public MigrationItem resumeReplication(ResumeReplicationInput resumeReplicationInput, Context context) {
        return serviceManager.replicationMigrationItems()
            .resumeReplication(resourceGroupName, resourceName, fabricName, protectionContainerName, migrationItemName,
                resumeReplicationInput, context);
    }

    public MigrationItem resync(ResyncInput input) {
        return serviceManager.replicationMigrationItems()
            .resync(resourceGroupName, resourceName, fabricName, protectionContainerName, migrationItemName, input);
    }

    public MigrationItem resync(ResyncInput input, Context context) {
        return serviceManager.replicationMigrationItems()
            .resync(resourceGroupName, resourceName, fabricName, protectionContainerName, migrationItemName, input,
                context);
    }

    public MigrationItem testMigrate(TestMigrateInput testMigrateInput) {
        return serviceManager.replicationMigrationItems()
            .testMigrate(resourceGroupName, resourceName, fabricName, protectionContainerName, migrationItemName,
                testMigrateInput);
    }

    public MigrationItem testMigrate(TestMigrateInput testMigrateInput, Context context) {
        return serviceManager.replicationMigrationItems()
            .testMigrate(resourceGroupName, resourceName, fabricName, protectionContainerName, migrationItemName,
                testMigrateInput, context);
    }

    public MigrationItem testMigrateCleanup(TestMigrateCleanupInput testMigrateCleanupInput) {
        return serviceManager.replicationMigrationItems()
            .testMigrateCleanup(resourceGroupName, resourceName, fabricName, protectionContainerName, migrationItemName,
                testMigrateCleanupInput);
    }

    public MigrationItem testMigrateCleanup(TestMigrateCleanupInput testMigrateCleanupInput, Context context) {
        return serviceManager.replicationMigrationItems()
            .testMigrateCleanup(resourceGroupName, resourceName, fabricName, protectionContainerName, migrationItemName,
                testMigrateCleanupInput, context);
    }

    public MigrationItemImpl withProperties(EnableMigrationInputProperties properties) {
        this.createInput.withProperties(properties);
        return this;
    }

    public MigrationItemImpl withProperties(UpdateMigrationItemInputProperties properties) {
        this.updateInput.withProperties(properties);
        return this;
    }
}
