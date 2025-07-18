# Release History

## 1.2.0-beta.1 (Unreleased)

### Features Added

### Breaking Changes

### Bugs Fixed

### Other Changes

## 1.1.0 (2025-07-08)

- Azure Resource Manager Hardware Security Modules client library for Java. This package contains Microsoft Azure SDK for Hardware Security Modules Management SDK. The Azure management API provides a RESTful set of web services that interact with Hardware Security Modules. Package api-version 2025-03-31. For documentation on how to use this package, please see [Azure Management Libraries for Java](https://aka.ms/azsdk/java/mgmt).

### Breaking Changes

#### `models.DedicatedHsmListResult` was removed

#### `models.DedicatedHsmOperationListResult` was removed

#### `models.OutboundEnvironmentEndpointCollection` was removed

#### `models.DedicatedHsmOperation` was removed

#### `models.DedicatedHsmOperationDisplay` was removed

#### `models.DedicatedHsmResource` was removed

#### `models.DedicatedHsm$DefinitionStages` was modified

* Required stage 4 was added
* `withProperties(models.DedicatedHsmProperties)` was removed in stage 3

#### `models.EndpointDetail` was modified

* `withDescription(java.lang.String)` was removed
* `withPort(java.lang.Integer)` was removed
* `withProtocol(java.lang.String)` was removed
* `withIpAddress(java.lang.String)` was removed

#### `HardwareSecurityModulesManager` was modified

* `fluent.AzureHsmResourceProvider serviceClient()` -> `fluent.HardwareSecurityModulesManagementClient serviceClient()`

#### `models.NetworkInterface` was modified

* `id()` was removed

#### `models.ApiEntityReference` was modified

* `withId(java.lang.String)` was removed
* `id()` was removed

#### `models.EndpointDependency` was modified

* `withDomainName(java.lang.String)` was removed
* `withEndpointDetails(java.util.List)` was removed

### Features Added

* `models.BackupResult` was added

* `models.CloudHsmClusterPatchParameters` was added

* `models.CloudHsmClusterBackupStatusGetResponse` was added

* `models.ActivationState` was added

* `models.BackupRequestProperties` was added

* `models.CloudHsmClusterPrivateEndpointConnections` was added

* `models.CloudHsmCluster$Definition` was added

* `models.BackupResultProperties` was added

* `models.PrivateEndpoint` was added

* `models.CloudHsmClusterPrivateLinkResources` was added

* `models.PrivateEndpointServiceConnectionStatus` was added

* `models.AutoGeneratedDomainNameLabelScope` was added

* `models.ActionType` was added

* `models.CloudHsmClusterSkuName` was added

* `models.OperationDisplay` was added

* `models.CloudHsmClusterBackupStatus` was added

* `models.ManagedServiceIdentity` was added

* `models.PrivateEndpointConnection$DefinitionStages` was added

* `models.CloudHsmClusterSkuFamily` was added

* `models.CloudHsmClusterProperties` was added

* `models.BackupRestoreOperationStatus` was added

* `models.BackupRestoreRequestBaseProperties` was added

* `models.ProvisioningState` was added

* `models.PrivateLinkResourceProperties` was added

* `models.CloudHsmClusterBackupStatusGetHeaders` was added

* `models.CloudHsmClusterRestoreStatusGetHeaders` was added

* `models.Origin` was added

* `models.PrivateEndpointConnectionProvisioningState` was added

* `models.ManagedServiceIdentityType` was added

* `models.Operation` was added

* `models.PrivateEndpointConnection$Definition` was added

* `models.CloudHsmCluster` was added

* `models.CloudHsmCluster$Update` was added

* `models.PrivateEndpointConnections` was added

* `models.PublicNetworkAccess` was added

* `models.BackupRestoreBaseResultProperties` was added

* `models.PrivateLinkResource` was added

* `models.CloudHsmCluster$DefinitionStages` was added

* `models.CloudHsmClusterRestoreStatus` was added

* `models.UserAssignedIdentity` was added

* `models.CloudHsmCluster$UpdateStages` was added

* `models.PrivateLinkServiceConnectionState` was added

* `models.CloudHsmClusterSku` was added

* `models.RestoreResult` was added

* `models.PrivateEndpointConnectionProperties` was added

* `models.CloudHsmClusters` was added

* `models.CloudHsmClusterRestoreStatusGetResponse` was added

* `models.RestoreRequestProperties` was added

* `models.CloudHsmProperties` was added

* `models.PrivateEndpointConnection` was added

#### `HardwareSecurityModulesManager` was modified

* `cloudHsmClusterPrivateEndpointConnections()` was added
* `privateEndpointConnections()` was added
* `cloudHsmClusterRestoreStatus()` was added
* `cloudHsmClusterBackupStatus()` was added
* `cloudHsmClusterPrivateLinkResources()` was added
* `cloudHsmClusters()` was added

#### `models.NetworkInterface` was modified

* `resourceId()` was added

#### `models.ApiEntityReference` was modified

* `resourceId()` was added
* `withResourceId(java.lang.String)` was added

## 1.0.0 (2024-12-26)

- Azure Resource Manager Hardware Security Modules client library for Java. This package contains Microsoft Azure SDK for Hardware Security Modules Management SDK. The Azure management API provides a RESTful set of web services that interact with Azure HSM RP. Package tag package-2021-11. For documentation on how to use this package, please see [Azure Management Libraries for Java](https://aka.ms/azsdk/java/mgmt).

### Other Changes

- Release for Azure Resource Manager Hardware Security Modules client library for Java.

## 1.0.0-beta.3 (2024-11-27)

- Azure Resource Manager Hardware Security Modules client library for Java. This package contains Microsoft Azure SDK for Hardware Security Modules Management SDK. The Azure management API provides a RESTful set of web services that interact with Azure HSM RP. Package tag package-preview-2024-06. For documentation on how to use this package, please see [Azure Management Libraries for Java](https://aka.ms/azsdk/java/mgmt).

### Breaking Changes

#### Serialization/Deserialization change

- `Jackson` is removed from dependency and no longer supported.

##### Migration Guide

If you are using `Jackson`/`ObjectMapper` for manual serialization/deserialization, configure your `ObjectMapper` for backward compatibility:
```java
objectMapper.registerModule(com.azure.core.serializer.json.jackson.JacksonJsonProvider.getJsonSerializableDatabindModule());
```

#### `models.DedicatedHsmOperationListResult` was removed

#### `models.SystemDataAutoGenerated` was removed

#### `models.RestoreProperties` was removed

#### `models.IdentityType` was removed

#### `models.CloudHsmClusterPatchParametersProperties` was removed

#### `models.BackupProperties` was removed

#### `models.CloudHsmClusterSecurityDomainProperties` was removed

#### `models.DedicatedHsmOperation` was removed

#### `models.DedicatedHsmOperationDisplay` was removed

#### `models.DedicatedHsmResource` was removed

#### `models.DedicatedHsm$DefinitionStages` was modified

* Required stage 4 was added
* `withProperties(models.DedicatedHsmProperties)` was removed in stage 3

#### `models.CloudHsmClusterPrivateLinkResources` was modified

* `listByCloudHsmClusterWithResponse(java.lang.String,java.lang.String,com.azure.core.util.Context)` was removed
* `models.PrivateLinkResourceListResult listByCloudHsmCluster(java.lang.String,java.lang.String)` -> `com.azure.core.http.rest.PagedIterable listByCloudHsmCluster(java.lang.String,java.lang.String)`

#### `models.PrivateLinkResourceListResult` was modified

* `innerModel()` was removed
* `java.util.List value()` -> `java.util.List value()`

#### `models.CloudHsmClusterProperties` was modified

* `withProvisioningState(models.ProvisioningState)` was removed
* `backupProperties()` was removed
* `securityDomain()` was removed
* `withRestoreProperties(models.RestoreProperties)` was removed
* `java.lang.String autoGeneratedDomainNameLabelScope()` -> `models.AutoGeneratedDomainNameLabelScope autoGeneratedDomainNameLabelScope()`
* `withAutoGeneratedDomainNameLabelScope(java.lang.String)` was removed
* `restoreProperties()` was removed
* `withPrivateEndpointConnections(java.util.List)` was removed
* `withBackupProperties(models.BackupProperties)` was removed
* `withPublicNetworkAccess(java.lang.String)` was removed
* `withSecurityDomain(models.CloudHsmClusterSecurityDomainProperties)` was removed
* `java.lang.String publicNetworkAccess()` -> `models.PublicNetworkAccess publicNetworkAccess()`
* `withHsms(java.util.List)` was removed

#### `models.NetworkInterface` was modified

* `id()` was removed

#### `models.ApiEntityReference` was modified

* `id()` was removed
* `withId(java.lang.String)` was removed

#### `models.DedicatedHsm` was modified

* `models.SystemDataAutoGenerated systemData()` -> `com.azure.core.management.SystemData systemData()`

#### `models.CloudHsmCluster$Update` was modified

* `withProperties(models.CloudHsmClusterPatchParametersProperties)` was removed
* `withSku(models.CloudHsmClusterSku)` was removed

#### `models.PrivateLinkResource` was modified

* `validate()` was removed
* `com.azure.core.management.SystemData systemData()` -> `com.azure.core.management.SystemData systemData()`
* `withProperties(models.PrivateLinkResourceProperties)` was removed
* `models.PrivateLinkResourceProperties properties()` -> `models.PrivateLinkResourceProperties properties()`

### Features Added

* `models.BackupResult` was added

* `models.CloudHsmClusterBackupStatusGetResponse` was added

* `models.ActivationState` was added

* `models.BackupRequestProperties` was added

* `models.BackupResultProperties` was added

* `models.AutoGeneratedDomainNameLabelScope` was added

* `models.ActionType` was added

* `models.OperationDisplay` was added

* `models.CloudHsmClusterBackupStatus` was added

* `models.BackupRestoreOperationStatus` was added

* `models.BackupRestoreRequestBaseProperties` was added

* `models.CloudHsmClusterBackupStatusGetHeaders` was added

* `models.CloudHsmClusterRestoreStatusGetHeaders` was added

* `models.Origin` was added

* `models.Operation` was added

* `models.PublicNetworkAccess` was added

* `models.BackupRestoreBaseResultProperties` was added

* `models.CloudHsmClusterRestoreStatus` was added

* `models.RestoreResult` was added

* `models.CloudHsmClusterRestoreStatusGetResponse` was added

* `models.RestoreRequestProperties` was added

* `models.OperationListResult` was added

#### `models.Error` was modified

* `getAdditionalInfo()` was added
* `getDetails()` was added
* `getCode()` was added
* `getMessage()` was added
* `getTarget()` was added

#### `models.CloudHsmClusterPrivateLinkResources` was modified

* `listByCloudHsmCluster(java.lang.String,java.lang.String,com.azure.core.util.Context)` was added

#### `models.PrivateLinkResourceListResult` was modified

* `validate()` was added
* `nextLink()` was added
* `withValue(java.util.List)` was added

#### `HardwareSecurityModulesManager` was modified

* `cloudHsmClusterBackupStatus()` was added
* `cloudHsmClusterRestoreStatus()` was added

#### `models.CloudHsmClusterProperties` was modified

* `activationState()` was added
* `withPublicNetworkAccess(models.PublicNetworkAccess)` was added
* `withAutoGeneratedDomainNameLabelScope(models.AutoGeneratedDomainNameLabelScope)` was added

#### `models.CloudHsmClusterResource` was modified

* `name()` was added
* `type()` was added
* `id()` was added

#### `models.NetworkInterface` was modified

* `resourceId()` was added

#### `models.ApiEntityReference` was modified

* `withResourceId(java.lang.String)` was added
* `resourceId()` was added

#### `models.CloudHsmCluster` was modified

* `validateRestoreProperties()` was added
* `backup(models.BackupRequestProperties,com.azure.core.util.Context)` was added
* `backup()` was added
* `validateBackupProperties(models.BackupRequestProperties,com.azure.core.util.Context)` was added
* `restore(models.RestoreRequestProperties)` was added
* `validateBackupProperties()` was added
* `validateRestoreProperties(models.RestoreRequestProperties,com.azure.core.util.Context)` was added
* `restore(models.RestoreRequestProperties,com.azure.core.util.Context)` was added

#### `models.PrivateLinkResource` was modified

* `type()` was added
* `id()` was added
* `innerModel()` was added
* `name()` was added

#### `models.CloudHsmClusters` was modified

* `validateRestoreProperties(java.lang.String,java.lang.String,models.RestoreRequestProperties,com.azure.core.util.Context)` was added
* `validateRestoreProperties(java.lang.String,java.lang.String)` was added
* `backup(java.lang.String,java.lang.String)` was added
* `backup(java.lang.String,java.lang.String,models.BackupRequestProperties,com.azure.core.util.Context)` was added
* `validateBackupProperties(java.lang.String,java.lang.String)` was added
* `validateBackupProperties(java.lang.String,java.lang.String,models.BackupRequestProperties,com.azure.core.util.Context)` was added
* `restore(java.lang.String,java.lang.String,models.RestoreRequestProperties)` was added
* `restore(java.lang.String,java.lang.String,models.RestoreRequestProperties,com.azure.core.util.Context)` was added

## 1.0.0-beta.2 (2024-01-24)

- Azure Resource Manager Hardware Security Modules client library for Java. This package contains Microsoft Azure SDK for Hardware Security Modules Management SDK. The Azure management API provides a RESTful set of web services that interact with Azure HSM RP. Package tag package-2023-12-preview. For documentation on how to use this package, please see [Azure Management Libraries for Java](https://aka.ms/azsdk/java/mgmt).

### Breaking Changes

#### `models.DedicatedHsm$DefinitionStages` was modified

* Stage 3 was added

#### `models.DedicatedHsm` was modified

* `managementNetworkProfile()` was removed
* `statusMessage()` was removed
* `networkProfile()` was removed
* `provisioningState()` was removed
* `stampId()` was removed
* `com.azure.core.management.SystemData systemData()` -> `models.SystemDataAutoGenerated systemData()`

#### `models.DedicatedHsmOperation` was modified

* `java.lang.String isDataAction()` -> `java.lang.Boolean isDataAction()`

#### `HardwareSecurityModulesManager` was modified

* `fluent.AzureDedicatedHsmResourceProvider serviceClient()` -> `fluent.AzureHsmResourceProvider serviceClient()`

#### `models.DedicatedHsm$Definition` was modified

* `withNetworkProfile(models.NetworkProfile)` was removed
* `withStampId(java.lang.String)` was removed
* `withManagementNetworkProfile(models.NetworkProfile)` was removed

### Features Added

* `models.PrivateLinkResourceProperties` was added

* `models.CloudHsmClusterPatchParametersProperties` was added

* `models.CloudHsmClusterResource` was added

* `models.PrivateEndpointConnectionListResult` was added

* `models.CloudHsmClusterPatchParameters` was added

* `models.BackupProperties` was added

* `models.PrivateEndpointConnectionProvisioningState` was added

* `models.ManagedServiceIdentityType` was added

* `models.CloudHsmClusterPrivateEndpointConnections` was added

* `models.CloudHsmCluster$Definition` was added

* `models.SystemDataAutoGenerated` was added

* `models.PrivateEndpointConnection$Definition` was added

* `models.PrivateEndpoint` was added

* `models.RestoreProperties` was added

* `models.CloudHsmCluster` was added

* `models.CloudHsmClusterSecurityDomainProperties` was added

* `models.CloudHsmClusterPrivateLinkResources` was added

* `models.CloudHsmCluster$Update` was added

* `models.PrivateEndpointServiceConnectionStatus` was added

* `models.PrivateEndpointConnections` was added

* `models.PrivateLinkResource` was added

* `models.CloudHsmCluster$DefinitionStages` was added

* `models.CloudHsmClusterSkuName` was added

* `models.DedicatedHsmProperties` was added

* `models.PrivateLinkResourceListResult` was added

* `models.UserAssignedIdentity` was added

* `models.CloudHsmCluster$UpdateStages` was added

* `models.PrivateLinkServiceConnectionState` was added

* `models.ManagedServiceIdentity` was added

* `models.CloudHsmClusterSku` was added

* `models.DedicatedHsmResource` was added

* `models.IdentityType` was added

* `models.PrivateEndpointConnectionProperties` was added

* `models.CloudHsmClusters` was added

* `models.PrivateEndpointConnection$DefinitionStages` was added

* `models.CloudHsmClusterSkuFamily` was added

* `models.CloudHsmClusterProperties` was added

* `models.CloudHsmProperties` was added

* `models.CloudHsmClusterListResult` was added

* `models.ProvisioningState` was added

* `models.PrivateEndpointConnection` was added

#### `models.DedicatedHsm` was modified

* `resourceGroupName()` was added
* `properties()` was added

#### `models.DedicatedHsmOperation` was modified

* `origin()` was added

#### `HardwareSecurityModulesManager` was modified

* `privateEndpointConnections()` was added
* `cloudHsmClusters()` was added
* `cloudHsmClusterPrivateEndpointConnections()` was added
* `cloudHsmClusterPrivateLinkResources()` was added

#### `models.DedicatedHsm$Definition` was modified

* `withProperties(models.DedicatedHsmProperties)` was added

## 1.0.0-beta.1 (2022-05-09)

- Azure Resource Manager Hardware Security Modules client library for Java. This package contains Microsoft Azure SDK for Hardware Security Modules Management SDK. The Azure management API provides a RESTful set of web services that interact with Azure Dedicated HSM RP. Package tag package-2021-11. For documentation on how to use this package, please see [Azure Management Libraries for Java](https://aka.ms/azsdk/java/mgmt).
