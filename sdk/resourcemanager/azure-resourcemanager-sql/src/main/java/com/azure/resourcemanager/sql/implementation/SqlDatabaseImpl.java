// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.resourcemanager.sql.implementation;

import com.azure.core.http.rest.PagedFlux;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.Region;
import com.azure.resourcemanager.resources.fluentcore.arm.ResourceId;
import com.azure.resourcemanager.resources.fluentcore.arm.ResourceUtils;
import com.azure.resourcemanager.resources.fluentcore.arm.models.implementation.ExternalChildResourceImpl;
import com.azure.resourcemanager.resources.fluentcore.dag.TaskGroup;
import com.azure.resourcemanager.resources.fluentcore.model.Creatable;
import com.azure.resourcemanager.resources.fluentcore.utils.PagedConverter;
import com.azure.resourcemanager.sql.SqlServerManager;
import com.azure.resourcemanager.sql.fluent.models.DatabaseAutomaticTuningInner;
import com.azure.resourcemanager.sql.fluent.models.DatabaseInner;
import com.azure.resourcemanager.sql.fluent.models.DatabaseSecurityAlertPolicyInner;
import com.azure.resourcemanager.sql.fluent.models.DatabaseUsageInner;
import com.azure.resourcemanager.sql.fluent.models.LogicalDatabaseTransparentDataEncryptionInner;
import com.azure.resourcemanager.sql.fluent.models.ReplicationLinkInner;
import com.azure.resourcemanager.sql.fluent.models.RestorePointInner;
import com.azure.resourcemanager.sql.models.AuthenticationType;
import com.azure.resourcemanager.sql.models.CreateMode;
import com.azure.resourcemanager.sql.models.DatabaseEdition;
import com.azure.resourcemanager.sql.models.DatabaseSku;
import com.azure.resourcemanager.sql.models.DatabaseStatus;
import com.azure.resourcemanager.sql.models.DatabaseUpdate;
import com.azure.resourcemanager.sql.models.ImportNewDatabaseDefinition;
import com.azure.resourcemanager.sql.models.ReplicationLink;
import com.azure.resourcemanager.sql.models.ResourceMoveDefinition;
import com.azure.resourcemanager.sql.models.RestorePoint;
import com.azure.resourcemanager.sql.models.SampleName;
import com.azure.resourcemanager.sql.models.SecurityAlertPolicyName;
import com.azure.resourcemanager.sql.models.ServiceObjectiveName;
import com.azure.resourcemanager.sql.models.Sku;
import com.azure.resourcemanager.sql.models.SqlDatabase;
import com.azure.resourcemanager.sql.models.SqlDatabaseAutomaticTuning;
import com.azure.resourcemanager.sql.models.SqlDatabaseBasicStorage;
import com.azure.resourcemanager.sql.models.SqlDatabaseOperations;
import com.azure.resourcemanager.sql.models.SqlDatabasePremiumServiceObjective;
import com.azure.resourcemanager.sql.models.SqlDatabasePremiumStorage;
import com.azure.resourcemanager.sql.models.SqlDatabaseStandardServiceObjective;
import com.azure.resourcemanager.sql.models.SqlDatabaseStandardStorage;
import com.azure.resourcemanager.sql.models.SqlDatabaseThreatDetectionPolicy;
import com.azure.resourcemanager.sql.models.SqlDatabaseUsageMetric;
import com.azure.resourcemanager.sql.models.SqlElasticPool;
import com.azure.resourcemanager.sql.models.SqlRestorableDroppedDatabase;
import com.azure.resourcemanager.sql.models.SqlServer;
import com.azure.resourcemanager.sql.models.SqlSyncGroupOperations;
import com.azure.resourcemanager.sql.models.SqlWarehouse;
import com.azure.resourcemanager.sql.models.StorageKeyType;
import com.azure.resourcemanager.sql.models.TransparentDataEncryption;
import com.azure.resourcemanager.sql.models.TransparentDataEncryptionName;
import com.azure.resourcemanager.storage.models.StorageAccount;
import reactor.core.publisher.Mono;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/** Implementation for SqlDatabase and its parent interfaces. */
class SqlDatabaseImpl extends ExternalChildResourceImpl<SqlDatabase, DatabaseInner, SqlServerImpl, SqlServer>
    implements SqlDatabase, SqlDatabase.SqlDatabaseDefinition<SqlServerImpl>,
    SqlDatabase.DefinitionStages.WithExistingDatabaseAfterElasticPool<SqlServerImpl>,
    SqlDatabase.DefinitionStages.WithStorageKeyAfterElasticPool<SqlServerImpl>,
    SqlDatabase.DefinitionStages.WithAuthenticationAfterElasticPool<SqlServerImpl>,
    SqlDatabase.DefinitionStages.WithRestorePointDatabaseAfterElasticPool<SqlServerImpl>, SqlDatabase.Update,
    SqlDatabaseOperations.DefinitionStages.WithExistingDatabaseAfterElasticPool,
    SqlDatabaseOperations.DefinitionStages.WithStorageKeyAfterElasticPool,
    SqlDatabaseOperations.DefinitionStages.WithAuthenticationAfterElasticPool,
    SqlDatabaseOperations.DefinitionStages.WithRestorePointDatabaseAfterElasticPool,
    SqlDatabaseOperations.DefinitionStages.WithCreateAfterElasticPoolOptions,
    SqlDatabaseOperations.SqlDatabaseOperationsDefinition {

    private SqlElasticPoolsAsExternalChildResourcesImpl sqlElasticPools;

    protected SqlServerManager sqlServerManager;
    protected String resourceGroupName;
    protected String sqlServerName;
    protected String sqlServerLocation;
    private boolean isPatchUpdate;
    private ImportNewDatabaseDefinition importRequestInner;

    private SqlSyncGroupOperationsImpl syncGroups;

    /**
     * Creates an instance of external child resource in-memory.
     *
     * @param name the name of this external child resource
     * @param parent reference to the parent of this external child resource
     * @param innerObject reference to the inner object representing this external child resource
     * @param sqlServerManager reference to the SQL server manager that accesses firewall rule operations
     */
    SqlDatabaseImpl(String name, SqlServerImpl parent, DatabaseInner innerObject, SqlServerManager sqlServerManager) {
        super(name, parent, innerObject);

        Objects.requireNonNull(parent);
        Objects.requireNonNull(sqlServerManager);
        this.sqlServerManager = sqlServerManager;
        this.resourceGroupName = parent.resourceGroupName();
        this.sqlServerName = parent.name();
        this.sqlServerLocation = parent.regionName();

        this.sqlElasticPools = null;
        this.isPatchUpdate = false;
        this.importRequestInner = null;
    }

    /**
     * Creates an instance of external child resource in-memory.
     *
     * @param resourceGroupName the resource group name
     * @param sqlServerName the parent SQL server name
     * @param sqlServerLocation the parent SQL server location
     * @param name the name of this external child resource
     * @param innerObject reference to the inner object representing this external child resource
     * @param sqlServerManager reference to the SQL server manager that accesses firewall rule operations
     */
    SqlDatabaseImpl(String resourceGroupName, String sqlServerName, String sqlServerLocation, String name,
        DatabaseInner innerObject, SqlServerManager sqlServerManager) {
        super(name, null, innerObject);
        Objects.requireNonNull(sqlServerManager);
        this.sqlServerManager = sqlServerManager;
        this.resourceGroupName = resourceGroupName;
        this.sqlServerName = sqlServerName;
        this.sqlServerLocation = sqlServerLocation;

        this.sqlElasticPools = new SqlElasticPoolsAsExternalChildResourcesImpl(this.sqlServerManager, "SqlElasticPool");
        this.isPatchUpdate = false;
        this.importRequestInner = null;
    }

    /**
     * Creates an instance of external child resource in-memory.
     *
     * @param parentSqlElasticPool the parent SqlElasticPool this database belongs to
     * @param name the name of this external child resource
     * @param innerObject reference to the inner object representing this external child resource
     * @param sqlServerManager reference to the SQL server manager that accesses firewall rule operations
     */
    SqlDatabaseImpl(TaskGroup.HasTaskGroup parentSqlElasticPool, String name, DatabaseInner innerObject,
        SqlServerManager sqlServerManager) {
        super(name, null, innerObject);
        Objects.requireNonNull(parentSqlElasticPool);
        Objects.requireNonNull(sqlServerManager);
        this.sqlServerManager = sqlServerManager;

        this.sqlElasticPools = new SqlElasticPoolsAsExternalChildResourcesImpl(this.sqlServerManager, "SqlElasticPool");
        this.isPatchUpdate = false;
        this.importRequestInner = null;
    }

    @Override
    public String id() {
        return this.innerModel().id();
    }

    @Override
    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    @Override
    public String sqlServerName() {
        return this.sqlServerName;
    }

    @Override
    public String collation() {
        return this.innerModel().collation();
    }

    @Override
    public OffsetDateTime creationDate() {
        return this.innerModel().creationDate();
    }

    @Override
    public String currentServiceObjectiveName() {
        return this.innerModel().currentServiceObjectiveName();
    }

    @Override
    public String databaseId() {
        return this.innerModel().databaseId().toString();
    }

    @Override
    public OffsetDateTime earliestRestoreDate() {
        return this.innerModel().earliestRestoreDate();
    }

    @Override
    public DatabaseEdition edition() {
        return DatabaseEdition.fromString(this.innerModel().sku().tier());
    }

    @Override
    public long maxSizeBytes() {
        return this.innerModel().maxSizeBytes();
    }

    @Override
    public String requestedServiceObjectiveName() {
        return this.innerModel().requestedServiceObjectiveName();
    }

    @Override
    public DatabaseStatus status() {
        return this.innerModel().status();
    }

    @Override
    public String elasticPoolId() {
        return this.innerModel().elasticPoolId();
    }

    @Override
    public String elasticPoolName() {
        return ResourceUtils.nameFromResourceId(this.innerModel().elasticPoolId());
    }

    @Override
    public String defaultSecondaryLocation() {
        return this.innerModel().defaultSecondaryLocation();
    }

    @Override
    public boolean isDataWarehouse() {
        return this.edition().toString().equalsIgnoreCase(DatabaseEdition.DATA_WAREHOUSE.toString());
    }

    @Override
    public SqlWarehouse asWarehouse() {
        if (this.isDataWarehouse()) {
            if (this.parent() != null) {
                return new SqlWarehouseImpl(this.name(), this.parent(), this.innerModel(), this.sqlServerManager);
            } else {
                return new SqlWarehouseImpl(this.resourceGroupName, this.sqlServerName, this.sqlServerLocation,
                    this.name(), this.innerModel(), this.sqlServerManager);
            }
        }

        return null;
    }

    @Override
    public List<RestorePoint> listRestorePoints() {
        List<RestorePoint> restorePoints = new ArrayList<>();
        PagedIterable<RestorePointInner> restorePointInners = this.sqlServerManager.serviceClient()
            .getRestorePoints()
            .listByDatabase(this.resourceGroupName, this.sqlServerName, this.name());
        for (RestorePointInner inner : restorePointInners) {
            restorePoints.add(new RestorePointImpl(this.resourceGroupName, this.sqlServerName, inner));
        }
        return Collections.unmodifiableList(restorePoints);
    }

    @Override
    public PagedFlux<RestorePoint> listRestorePointsAsync() {
        final SqlDatabaseImpl self = this;
        return PagedConverter.mapPage(
            this.sqlServerManager.serviceClient()
                .getRestorePoints()
                .listByDatabaseAsync(this.resourceGroupName, this.sqlServerName, this.name()),
            restorePointInner -> new RestorePointImpl(self.resourceGroupName, self.sqlServerName, restorePointInner));
    }

    @Override
    public Map<String, ReplicationLink> listReplicationLinks() {
        Map<String, ReplicationLink> replicationLinkMap = new HashMap<>();
        PagedIterable<ReplicationLinkInner> replicationLinkInners = this.sqlServerManager.serviceClient()
            .getReplicationLinks()
            .listByDatabase(this.resourceGroupName, this.sqlServerName, this.name());
        for (ReplicationLinkInner inner : replicationLinkInners) {
            replicationLinkMap.put(inner.name(),
                new ReplicationLinkImpl(this.resourceGroupName, this.sqlServerName, inner, this.sqlServerManager));
        }
        return Collections.unmodifiableMap(replicationLinkMap);
    }

    @Override
    public PagedFlux<ReplicationLink> listReplicationLinksAsync() {
        final SqlDatabaseImpl self = this;
        return PagedConverter.mapPage(
            this.sqlServerManager.serviceClient()
                .getReplicationLinks()
                .listByDatabaseAsync(this.resourceGroupName, this.sqlServerName, this.name()),
            replicationLinkInner -> new ReplicationLinkImpl(self.resourceGroupName, self.sqlServerName,
                replicationLinkInner, self.sqlServerManager));
    }

    @Override
    public SqlDatabaseExportRequestImpl exportTo(String storageUri) {
        return new SqlDatabaseExportRequestImpl(this, this.sqlServerManager).exportTo(storageUri);
    }

    @Override
    public SqlDatabaseExportRequestImpl exportTo(StorageAccount storageAccount, String containerName, String fileName) {
        Objects.requireNonNull(storageAccount);
        return new SqlDatabaseExportRequestImpl(this, this.sqlServerManager).exportTo(storageAccount, containerName,
            fileName);
    }

    @Override
    public SqlDatabaseExportRequestImpl exportTo(Creatable<StorageAccount> storageAccountCreatable,
        String containerName, String fileName) {
        Objects.requireNonNull(storageAccountCreatable);
        return new SqlDatabaseExportRequestImpl(this, this.sqlServerManager).exportTo(storageAccountCreatable,
            containerName, fileName);
    }

    @Override
    public SqlDatabaseImportRequestImpl importBacpac(String storageUri) {
        return new SqlDatabaseImportRequestImpl(this, this.sqlServerManager).importFrom(storageUri);
    }

    @Override
    public SqlDatabaseImportRequestImpl importBacpac(StorageAccount storageAccount, String containerName,
        String fileName) {
        Objects.requireNonNull(storageAccount);
        return new SqlDatabaseImportRequestImpl(this, this.sqlServerManager).importFrom(storageAccount, containerName,
            fileName);
    }

    @Override
    public SqlDatabaseThreatDetectionPolicy.DefinitionStages.Blank defineThreatDetectionPolicy(String policyName) {
        SqlDatabaseThreatDetectionPolicyImpl result = new SqlDatabaseThreatDetectionPolicyImpl(policyName, this,
            new DatabaseSecurityAlertPolicyInner(), this.sqlServerManager);
        result.setPendingOperation(ExternalChildResourceImpl.PendingOperation.ToBeCreated);
        return result;
    }

    @Override
    public SqlDatabaseThreatDetectionPolicy.DefinitionStages.Blank
        defineThreatDetectionPolicy(SecurityAlertPolicyName policyName) {
        SqlDatabaseThreatDetectionPolicyImpl result = new SqlDatabaseThreatDetectionPolicyImpl(
            policyName == null ? SecurityAlertPolicyName.DEFAULT.toString() : policyName.toString(), this,
            new DatabaseSecurityAlertPolicyInner(), this.sqlServerManager);
        result.setPendingOperation(ExternalChildResourceImpl.PendingOperation.ToBeCreated);
        return result;
    }

    @Override
    public SqlDatabaseThreatDetectionPolicy getThreatDetectionPolicy() {
        DatabaseSecurityAlertPolicyInner policyInner = this.sqlServerManager.serviceClient()
            .getDatabaseSecurityAlertPolicies()
            .get(this.resourceGroupName, this.sqlServerName, this.name(), SecurityAlertPolicyName.DEFAULT);
        return policyInner != null
            ? new SqlDatabaseThreatDetectionPolicyImpl(policyInner.name(), this, policyInner, this.sqlServerManager)
            : null;
    }

    @Override
    public SqlDatabaseAutomaticTuning getDatabaseAutomaticTuning() {
        DatabaseAutomaticTuningInner databaseAutomaticTuningInner = this.sqlServerManager.serviceClient()
            .getDatabaseAutomaticTunings()
            .get(this.resourceGroupName, this.sqlServerName, this.name());
        return databaseAutomaticTuningInner != null
            ? new SqlDatabaseAutomaticTuningImpl(this, databaseAutomaticTuningInner)
            : null;
    }

    @Override
    public List<SqlDatabaseUsageMetric> listUsageMetrics() {
        List<SqlDatabaseUsageMetric> databaseUsageMetrics = new ArrayList<>();
        PagedIterable<DatabaseUsageInner> databaseUsageInners = this.sqlServerManager.serviceClient()
            .getDatabaseUsages()
            .listByDatabase(this.resourceGroupName, this.sqlServerName, this.name());
        for (DatabaseUsageInner inner : databaseUsageInners) {
            databaseUsageMetrics.add(new SqlDatabaseUsageMetricImpl(inner));
        }
        return Collections.unmodifiableList(databaseUsageMetrics);
    }

    @Override
    public PagedFlux<SqlDatabaseUsageMetric> listUsageMetricsAsync() {
        return PagedConverter.mapPage(
            this.sqlServerManager.serviceClient()
                .getDatabaseUsages()
                .listByDatabaseAsync(this.resourceGroupName, this.sqlServerName, this.name()),
            SqlDatabaseUsageMetricImpl::new);
    }

    @Override
    public SqlDatabase rename(String newDatabaseName) {
        ResourceId resourceId = ResourceId.fromString(this.id());
        String newId = resourceId.parent().id() + "/databases/" + newDatabaseName;
        this.sqlServerManager.serviceClient()
            .getDatabases()
            .rename(this.resourceGroupName, this.sqlServerName, this.name(),
                new ResourceMoveDefinition().withId(newId));
        return this.sqlServerManager.sqlServers()
            .databases()
            .getBySqlServer(this.resourceGroupName, this.sqlServerName, newDatabaseName);
    }

    @Override
    public Mono<SqlDatabase> renameAsync(final String newDatabaseName) {
        final SqlDatabaseImpl self = this;
        ResourceId resourceId = ResourceId.fromString(this.id());
        String newId = resourceId.parent().id() + "/databases/" + newDatabaseName;
        return this.sqlServerManager.serviceClient()
            .getDatabases()
            .renameAsync(this.resourceGroupName, this.sqlServerName, self.name(),
                new ResourceMoveDefinition().withId(newId))
            .flatMap(aVoid -> self.sqlServerManager.sqlServers()
                .databases()
                .getBySqlServerAsync(self.resourceGroupName, self.sqlServerName, newDatabaseName));
    }

    @Override
    public TransparentDataEncryption getTransparentDataEncryption() {
        LogicalDatabaseTransparentDataEncryptionInner transparentDataEncryptionInner
            = this.sqlServerManager.serviceClient()
                .getTransparentDataEncryptions()
                .get(this.resourceGroupName, this.sqlServerName, this.name(), TransparentDataEncryptionName.CURRENT);
        return (transparentDataEncryptionInner == null)
            ? null
            : new TransparentDataEncryptionImpl(this.resourceGroupName, this.sqlServerName,
                transparentDataEncryptionInner, this.sqlServerManager);
    }

    @Override
    public Mono<TransparentDataEncryption> getTransparentDataEncryptionAsync() {
        final SqlDatabaseImpl self = this;
        return this.sqlServerManager.serviceClient()
            .getTransparentDataEncryptions()
            .getAsync(this.resourceGroupName, this.sqlServerName, this.name(), TransparentDataEncryptionName.CURRENT)
            .map(transparentDataEncryptionInner -> new TransparentDataEncryptionImpl(self.resourceGroupName,
                self.sqlServerName, transparentDataEncryptionInner, self.sqlServerManager));
    }

    @Override
    public String parentId() {
        return ResourceUtils.parentResourceIdFromResourceId(this.id());
    }

    @Override
    public String regionName() {
        return this.innerModel().location();
    }

    @Override
    public Region region() {
        return Region.fromName(this.regionName());
    }

    @Override
    public SqlSyncGroupOperations.SqlSyncGroupActionsDefinition syncGroups() {
        if (this.syncGroups == null) {
            this.syncGroups = new SqlSyncGroupOperationsImpl(this, this.sqlServerManager);
        }

        return this.syncGroups;
    }

    SqlDatabaseImpl withPatchUpdate() {
        this.isPatchUpdate = true;
        return this;
    }

    @Override
    protected Mono<DatabaseInner> getInnerAsync() {
        return this.sqlServerManager.serviceClient()
            .getDatabases()
            .getAsync(this.resourceGroupName, this.sqlServerName, this.name());
    }

    void addParentDependency(TaskGroup.HasTaskGroup parentDependency) {
        this.addDependency(parentDependency);
    }

    @Override
    public void beforeGroupCreateOrUpdate() {
        if (this.importRequestInner != null && this.elasticPoolId() != null) {
            final SqlDatabaseImpl self = this;
            final String epId = this.elasticPoolId();
            this.addPostRunDependent(context -> {
                self.importRequestInner = null;
                self.withExistingElasticPoolId(epId);
                return self.createResourceAsync().flatMap(sqlDatabase -> context.voidMono());
            });
        }
    }

    @Override
    public Mono<SqlDatabase> createResourceAsync() {
        final SqlDatabaseImpl self = this;
        this.innerModel().withLocation(this.sqlServerLocation);
        if (this.importRequestInner != null) {
            this.importRequestInner.withDatabaseName(this.name());
            if (this.importRequestInner.edition() == null) {
                this.importRequestInner.withEdition(this.edition().toString());
            }
            if (this.importRequestInner.serviceObjectiveName() == null) {
                this.importRequestInner.withServiceObjectiveName(this.innerModel().sku().name());
            }

            if (this.importRequestInner.maxSizeBytes() == null) {
                this.importRequestInner.withMaxSizeBytes(String.valueOf(this.innerModel().maxSizeBytes()));
            }

            return this.sqlServerManager.serviceClient()
                .getServers()
                .importDatabaseAsync(this.resourceGroupName, this.sqlServerName, this.importRequestInner)
                .then(Mono.defer(() -> {
                    if (self.elasticPoolId() != null) {
                        self.importRequestInner = null;
                        return self.withExistingElasticPool(ResourceUtils.nameFromResourceId(self.elasticPoolId()))
                            .withPatchUpdate()
                            .updateResourceAsync();
                    } else {
                        return self.refreshAsync();
                    }
                }));
        } else {
            return this.sqlServerManager.serviceClient()
                .getDatabases()
                .createOrUpdateAsync(this.resourceGroupName, this.sqlServerName, this.name(), this.innerModel())
                .map(inner -> {
                    self.setInner(inner);
                    return self;
                });
        }
    }

    @Override
    public Mono<SqlDatabase> updateResourceAsync() {
        if (this.isPatchUpdate) {
            final SqlDatabaseImpl self = this;
            DatabaseUpdate databaseUpdateInner = new DatabaseUpdate().withTags(self.innerModel().tags())
                .withCollation(self.innerModel().collation())
                .withSourceDatabaseId(self.innerModel().sourceDatabaseId())
                .withCreateMode(self.innerModel().createMode())
                .withSku(self.innerModel().sku())
                .withMaxSizeBytes(this.innerModel().maxSizeBytes())
                .withElasticPoolId(this.innerModel().elasticPoolId());
            return this.sqlServerManager.serviceClient()
                .getDatabases()
                .updateAsync(this.resourceGroupName, this.sqlServerName, this.name(), databaseUpdateInner)
                .map(inner -> {
                    self.setInner(inner);
                    self.isPatchUpdate = false;
                    return self;
                });

        } else {
            return this.createResourceAsync();
        }
    }

    @Override
    public SqlDatabaseImpl update() {
        super.prepareUpdate();
        return this;
    }

    @Override
    public Mono<Void> afterPostRunAsync(boolean isGroupFaulted) {
        if (this.sqlElasticPools != null) {
            this.sqlElasticPools.clear();
        }
        this.importRequestInner = null;

        return Mono.empty();
    }

    @Override
    public Mono<Void> deleteResourceAsync() {
        return this.sqlServerManager.serviceClient()
            .getDatabases()
            .deleteAsync(this.resourceGroupName, this.sqlServerName, this.name());
    }

    @Override
    public void delete() {
        this.sqlServerManager.serviceClient()
            .getDatabases()
            .delete(this.resourceGroupName, this.sqlServerName, this.name());
    }

    @Override
    public Mono<Void> deleteAsync() {
        return this.deleteResourceAsync();
    }

    @Override
    public SqlDatabaseImpl withExistingSqlServer(String resourceGroupName, String sqlServerName,
        String sqlServerLocation) {
        this.resourceGroupName = resourceGroupName;
        this.sqlServerName = sqlServerName;
        this.sqlServerLocation = sqlServerLocation;

        return this;
    }

    @Override
    public SqlDatabaseImpl withExistingSqlServer(SqlServer sqlServer) {
        Objects.requireNonNull(sqlServer);
        this.resourceGroupName = sqlServer.resourceGroupName();
        this.sqlServerName = sqlServer.name();
        this.sqlServerLocation = sqlServer.regionName();

        return this;
    }

    @Override
    public SqlServerImpl attach() {
        return this.parent();
    }

    @Override
    public SqlDatabaseImpl withoutElasticPool() {
        this.innerModel().withElasticPoolId(null);

        return this;
    }

    private String generateElasticPoolIdFromName(String elasticPoolName) {
        if (this.parentId() == null) {
            return ResourceUtils.constructResourceId(this.sqlServerManager.subscriptionId(), this.resourceGroupName,
                "Microsoft.Sql", "elasticPools", elasticPoolName, String.format("servers/%s", this.sqlServerName));
        }
        return String.format("%s/elasticPools/%s", this.parentId(), elasticPoolName);
    }

    @Override
    public SqlDatabaseImpl withExistingElasticPool(String elasticPoolName) {
        this.innerModel().withSku(null);
        this.innerModel().withElasticPoolId(generateElasticPoolIdFromName(elasticPoolName));

        return this;
    }

    @Override
    public SqlDatabaseImpl withExistingElasticPoolId(String elasticPoolId) {
        this.innerModel().withSku(null);
        this.innerModel().withElasticPoolId(elasticPoolId);

        return this;
    }

    @Override
    public SqlDatabaseImpl withExistingElasticPool(SqlElasticPool sqlElasticPool) {
        Objects.requireNonNull(sqlElasticPool);
        this.innerModel().withSku(null);
        this.innerModel().withElasticPoolId(sqlElasticPool.id());

        return this;
    }

    @Override
    public SqlDatabaseImpl withNewElasticPool(final Creatable<SqlElasticPool> sqlElasticPool) {
        Objects.requireNonNull(sqlElasticPool);
        this.innerModel().withSku(null);
        this.innerModel().withElasticPoolId(generateElasticPoolIdFromName(sqlElasticPool.name()));
        this.addDependency(sqlElasticPool);

        return this;
    }

    @Override
    public SqlElasticPoolForDatabaseImpl defineElasticPool(String elasticPoolName) {
        if (this.sqlElasticPools == null) {
            this.sqlElasticPools = new SqlElasticPoolsAsExternalChildResourcesImpl(this.taskGroup(),
                this.sqlServerManager, "SqlElasticPool");
        }
        this.innerModel().withSku(null);
        this.innerModel().withElasticPoolId(generateElasticPoolIdFromName(elasticPoolName));

        return new SqlElasticPoolForDatabaseImpl(this,
            this.sqlElasticPools.defineIndependentElasticPool(elasticPoolName)
                .withExistingSqlServer(this.resourceGroupName, this.sqlServerName, this.sqlServerLocation));
    }

    @Override
    public SqlDatabaseImpl fromRestorableDroppedDatabase(SqlRestorableDroppedDatabase restorableDroppedDatabase) {
        Objects.requireNonNull(restorableDroppedDatabase);
        this.innerModel()
            .withRestorableDroppedDatabaseId(restorableDroppedDatabase.id())
            .withCreateMode(CreateMode.RESTORE);
        return this;
    }

    private void initializeImportRequestInner() {
        this.importRequestInner = new ImportNewDatabaseDefinition();
        if (this.elasticPoolId() != null) {
            this.importRequestInner.withEdition(DatabaseEdition.BASIC.toString());
            this.importRequestInner.withServiceObjectiveName(ServiceObjectiveName.BASIC.toString());
            this.importRequestInner.withMaxSizeBytes(Long.toString(SqlDatabaseBasicStorage.MAX_2_GB.capacity()));
        } else {
            this.withStandardEdition(SqlDatabaseStandardServiceObjective.S0);
        }
    }

    @Override
    public SqlDatabaseImpl importFrom(String storageUri) {
        this.initializeImportRequestInner();
        this.importRequestInner.withStorageUri(storageUri);
        return this;
    }

    @Override
    public SqlDatabaseImpl importFrom(final StorageAccount storageAccount, final String containerName,
        final String fileName) {
        final SqlDatabaseImpl self = this;
        Objects.requireNonNull(storageAccount);
        this.initializeImportRequestInner();
        this.addDependency(context -> storageAccount.getKeysAsync()
            .flatMap(storageAccountKeys -> Mono.justOrEmpty(storageAccountKeys.stream().findFirst()))
            .flatMap(storageAccountKey -> {
                self.importRequestInner.withStorageUri(
                    String.format("%s%s/%s", storageAccount.endPoints().primary().blob(), containerName, fileName));
                self.importRequestInner.withStorageKeyType(StorageKeyType.STORAGE_ACCESS_KEY);
                self.importRequestInner.withStorageKey(storageAccountKey.value());
                return context.voidMono();
            }));
        return this;
    }

    @Override
    public SqlDatabaseImpl withStorageAccessKey(String storageAccessKey) {
        this.importRequestInner.withStorageKeyType(StorageKeyType.STORAGE_ACCESS_KEY);
        this.importRequestInner.withStorageKey(storageAccessKey);
        return this;
    }

    @Override
    public SqlDatabaseImpl withSharedAccessKey(String sharedAccessKey) {
        this.importRequestInner.withStorageKeyType(StorageKeyType.SHARED_ACCESS_KEY);
        this.importRequestInner.withStorageKey(sharedAccessKey);
        return this;
    }

    @Override
    public SqlDatabaseImpl withSqlAdministratorLoginAndPassword(String administratorLogin,
        String administratorPassword) {
        this.importRequestInner.withAuthenticationType(AuthenticationType.SQL.toString());
        this.importRequestInner.withAdministratorLogin(administratorLogin);
        this.importRequestInner.withAdministratorLoginPassword(administratorPassword);
        return this;
    }

    @Override
    public SqlDatabaseImpl withActiveDirectoryLoginAndPassword(String administratorLogin,
        String administratorPassword) {
        this.importRequestInner.withAuthenticationType(AuthenticationType.ADPASSWORD.toString());
        this.importRequestInner.withAdministratorLogin(administratorLogin);
        this.importRequestInner.withAdministratorLoginPassword(administratorPassword);
        return this;
    }

    @Override
    public SqlDatabaseImpl fromRestorePoint(RestorePoint restorePoint) {
        return fromRestorePoint(restorePoint, restorePoint.earliestRestoreDate());
    }

    @Override
    public SqlDatabaseImpl fromRestorePoint(RestorePoint restorePoint, OffsetDateTime restorePointDateTime) {
        Objects.requireNonNull(restorePoint);
        this.innerModel().withRestorePointInTime(restorePointDateTime);
        return this.withSourceDatabase(restorePoint.databaseId()).withMode(CreateMode.POINT_IN_TIME_RESTORE);
    }

    @Override
    public SqlDatabaseImpl withSourceDatabase(String sourceDatabaseId) {
        this.innerModel().withSourceDatabaseId(sourceDatabaseId);

        return this;
    }

    @Override
    public SqlDatabaseImpl withSourceDatabase(SqlDatabase sourceDatabase) {
        return this.withSourceDatabase(sourceDatabase.id());
    }

    @Override
    public SqlDatabaseImpl withMode(CreateMode createMode) {
        this.innerModel().withCreateMode(createMode);

        return this;
    }

    @Override
    public SqlDatabaseImpl withCollation(String collation) {
        this.innerModel().withCollation(collation);

        return this;
    }

    @Override
    public SqlDatabaseImpl withMaxSizeBytes(long maxSizeBytes) {
        this.innerModel().withMaxSizeBytes(maxSizeBytes);

        return this;
    }

    @Override
    public SqlDatabaseImpl withBasicEdition() {
        return this.withBasicEdition(SqlDatabaseBasicStorage.MAX_2_GB);
    }

    @Override
    public SqlDatabaseImpl withBasicEdition(SqlDatabaseBasicStorage maxStorageCapacity) {
        Sku sku = new Sku().withName(ServiceObjectiveName.BASIC.toString()).withTier(DatabaseEdition.BASIC.toString());

        this.innerModel().withSku(sku);
        this.innerModel().withMaxSizeBytes(maxStorageCapacity.capacity());
        this.innerModel().withElasticPoolId(null);
        return this;
    }

    @Override
    public SqlDatabaseImpl withStandardEdition(SqlDatabaseStandardServiceObjective serviceObjective) {
        return this.withStandardEdition(serviceObjective, SqlDatabaseStandardStorage.MAX_250_GB);
    }

    @Override
    public SqlDatabaseImpl withStandardEdition(SqlDatabaseStandardServiceObjective serviceObjective,
        SqlDatabaseStandardStorage maxStorageCapacity) {
        Sku sku = new Sku().withName(serviceObjective.toString()).withTier(DatabaseEdition.STANDARD.toString());

        this.innerModel().withSku(sku);
        this.innerModel().withMaxSizeBytes(maxStorageCapacity.capacity());
        this.innerModel().withElasticPoolId(null);
        return this;
    }

    @Override
    public SqlDatabaseImpl withPremiumEdition(SqlDatabasePremiumServiceObjective serviceObjective) {
        return this.withPremiumEdition(serviceObjective, SqlDatabasePremiumStorage.MAX_500_GB);
    }

    @Override
    public SqlDatabaseImpl withPremiumEdition(SqlDatabasePremiumServiceObjective serviceObjective,
        SqlDatabasePremiumStorage maxStorageCapacity) {
        Sku sku = new Sku().withName(serviceObjective.toString()).withTier(DatabaseEdition.PREMIUM.toString());

        this.innerModel().withSku(sku);
        this.innerModel().withMaxSizeBytes(maxStorageCapacity.capacity());
        this.innerModel().withElasticPoolId(null);
        return this;
    }

    @Override
    public SqlDatabaseImpl withSku(DatabaseSku sku) {
        return withSku(sku.toSku());
    }

    @Override
    public SqlDatabaseImpl withSku(Sku sku) {
        this.innerModel().withSku(sku);
        this.innerModel().withElasticPoolId(null);
        return this;
    }

    @Override
    public SqlDatabaseImpl withTags(Map<String, String> tags) {
        this.innerModel().withTags(new HashMap<>(tags));
        return this;
    }

    @Override
    public SqlDatabaseImpl withTag(String key, String value) {
        if (this.innerModel().tags() == null) {
            this.innerModel().withTags(new HashMap<String, String>());
        }
        this.innerModel().tags().put(key, value);
        return this;
    }

    @Override
    public SqlDatabaseImpl withoutTag(String key) {
        if (this.innerModel().tags() != null) {
            this.innerModel().tags().remove(key);
        }
        return this;
    }

    @Override
    public SqlDatabaseImpl fromSample(SampleName sampleName) {
        this.innerModel().withSampleName(sampleName);
        return this;
    }
}
