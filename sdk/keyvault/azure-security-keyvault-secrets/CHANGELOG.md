# Release History

## 4.11.0-beta.1 (Unreleased)

### Features Added

### Breaking Changes

### Bugs Fixed

### Other Changes

## 4.10.0 (2025-06-13)

### Features Added

> Compared to the last stable release - `4.9.4`
- Added support for service version `7.6`.

### Breaking Changes

> Compared to the latest release - `4.10.0-beta.1`
- Removed support for service version `7.6-preview.2`.

### Other Changes
#### Dependency Updates

> Compared to the latest release - `4.10.0-beta.1`
- Upgraded `azure-core` from `1.55.3` to version `1.55.4`.
- Upgraded `azure-core-http-netty` from `1.15.11` to version `1.15.12`.

## 4.10.0-beta.1 (2025-04-10)

### Other Changes

#### Dependency Updates

- Upgraded `azure-core` from `1.55.2` to version `1.55.3`.
- Upgraded `azure-json` from `1.4.0` to version `1.5.0`.
- Upgraded `azure-core-http-netty` from `1.15.10` to version `1.15.11`.

## 4.9.4 (2025-03-24)

### Other Changes

#### Dependency Updates

- Upgraded `azure-json` from `1.4.0` to version `1.5.0`.
- Upgraded `azure-core-http-netty` from `1.15.10` to version `1.15.11`.
- Upgraded `azure-core` from `1.55.2` to version `1.55.3`.

## 4.9.3 (2025-03-04)

### Other Changes

#### Dependency Updates

- Upgraded `azure-core` from `1.54.1` to version `1.55.2`.
- Upgraded `azure-json` from `1.3.0` to version `1.4.0`.
- Upgraded `azure-core-http-netty` from `1.15.7` to version `1.15.10`.

## 4.9.2 (2025-01-14)

### Bugs Fixed
- Fixed issue where certain `toString()` calls could cause a `NullPointerException`. ([#43776](https://github.com/Azure/azure-sdk-for-java/pull/43776))

## 4.9.1 (2024-12-04)

### Other Changes

#### Dependency Updates

- Upgraded `azure-core` from `1.53.0` to version `1.54.1`.
- Upgraded `azure-core-http-netty` from `1.15.5` to version `1.15.7`.

## 4.9.0 (2024-10-15)

### Other Changes

#### Dependency Updates

- Upgraded `azure-core` from `1.52.0` to version `1.53.0`.
- Upgraded `azure-core-http-netty` from `1.15.4` to version `1.15.5`.

## 4.8.7 (2024-09-27)

### Other Changes

#### Dependency Updates

- Upgraded `azure-json` from `1.2.0` to version `1.3.0`.
- Upgraded `azure-core-http-netty` from `1.15.3` to version `1.15.4`.
- Upgraded `azure-core` from `1.51.0` to version `1.52.0`.

## 4.8.6 (2024-08-24)

### Other Changes

#### Dependency Updates

- Upgraded `azure-core` from `1.50.0` to version `1.51.0`.
- Upgraded `azure-core-http-netty` from `1.15.2` to version `1.15.3`.

## 4.8.5 (2024-07-29)

### Other Changes

#### Dependency Updates

- Upgraded `azure-core-http-netty` from `1.15.1` to version `1.15.2`.
- Upgraded `azure-json` from `1.1.0` to version `1.2.0`.
- Upgraded `azure-core` from `1.49.1` to version `1.50.0`.

## 4.8.4 (2024-06-27)

### Other Changes

#### Dependency Updates

- Upgraded `azure-core` from `1.49.0` to version `1.49.1`.
- Upgraded `azure-core-http-netty` from `1.15.0` to version `1.15.1`.

## 4.8.3 (2024-05-13)

### Other Changes

#### Dependency Updates

- Upgraded `azure-core` from `1.48.0` to version `1.49.0`.
- Upgraded `azure-core-http-netty` from `1.14.2` to version `1.15.0`.

## 4.8.2 (2024-04-23)

### Other Changes

#### Dependency Updates

- Upgraded `azure-core` from `1.47.0` to version `1.48.0`.
- Upgraded `azure-core-http-netty` from `1.14.1` to version `1.14.2`.

## 4.8.1 (2024-03-20)

### Other Changes

#### Dependency Updates

- Upgraded `azure-core` from `1.46.0` to version `1.47.0`.
- Upgraded `azure-core-http-netty` from `1.14.0` to version `1.14.1`.

## 4.8.0 (2024-02-22)
Changes when compared to the last stable release (`4.7.3`) include:

### Features Added
- Added support for service version `7.5`.

### Other Changes

#### Dependency Updates

- Upgraded `azure-core` from `1.45.1` to version `1.46.0`.
- Upgraded `azure-core-http-netty` from `1.13.11` to version `1.14.0`.

## 4.7.3 (2023-12-04)

### Other Changes

#### Dependency Updates

- Upgraded `azure-core-http-netty` from `1.13.10` to version `1.13.11`.
- Upgraded `azure-core` from `1.45.0` to version `1.45.1`.

## 4.7.2 (2023-11-20)

### Other Changes

#### Dependency Updates

- Upgraded `azure-core` from `1.44.1` to version `1.45.0`.
- Upgraded `azure-core-http-netty` from `1.13.9` to version `1.13.10`.

## 4.8.0-beta.1 (2023-11-09)

### Features Added
- Added support for service version `7.5-preview.1`.

#### Dependency Updates
- Upgraded `azure-core` from `1.44.1` to version `1.45.0`.
- Upgraded `azure-core-http-netty` from `1.13.9` to version `1.13.10`.

## 4.7.1 (2023-10-20)

### Bugs Fixed
- Fixed an issue preventing the client from setting the `contentType` of the secret when the set secret operation is performed. ([#37019](https://github.com/Azure/azure-sdk-for-java/issues/37019))

### Other Changes

#### Dependency Updates
- Upgraded `azure-core` from `1.43.0` to version `1.44.1`.
- Upgraded `azure-core-http-netty` from `1.13.7` to version `1.13.9`.

## 4.7.0 (2023-09-25)

### Features Added
- Added new methods `fromJson` and `toJson` to models:
  - `DeletedSecret`
  - `KeyVaultSecret`
  - `SecretProperties`

### Other Changes
- Migrate test recordings to assets repo.

#### Dependency Updates

- Upgraded `azure-core` from `1.42.0` to version `1.43.0`.
- Upgraded `azure-core-http-netty` from `1.13.6` to version `1.13.7`.

## 4.6.5 (2023-08-21)

### Other Changes

#### Dependency Updates

- Upgraded `azure-core` from `1.41.0` to version `1.42.0`.
- Upgraded `azure-core-http-netty` from `1.13.5` to version `1.13.6`.

## 4.6.4 (2023-07-25)

### Other Changes

#### Dependency Updates

- Upgraded `azure-core` from `1.40.0` to version `1.41.0`.
- Upgraded `azure-core-http-netty` from `1.13.4` to version `1.13.5`.

## 4.6.3 (2023-06-20)

### Other Changes

#### Dependency Updates

- Upgraded `azure-core` from `1.39.0` to version `1.40.0`.
- Upgraded `azure-core-http-netty` from `1.13.3` to version `1.13.4`.

## 4.6.2 (2023-05-23)

### Other Changes

#### Dependency Updates

- Upgraded `azure-core-http-netty` from `1.13.2` to version `1.13.3`.
- Upgraded `azure-core` from `1.38.0` to version `1.39.0`.

## 4.6.1 (2023-04-20)

### Other Changes

- Test proxy server migration.
- Made all logger instances static.

#### Dependency Updates

- Upgraded `azure-core-http-netty` from `1.13.1` to version `1.13.2`.
- Upgraded `azure-core` from `1.37.0` to version `1.38.0`.

## 4.6.0 (2023-03-18)

### Features Added
- Added support for service version `7.4`.

### Other Changes
- Upgraded `azure-core-http-netty` from `1.13.0` to version `1.13.1`.
- Upgraded `azure-core` from `1.36.0` to version `1.37.0`.

## 4.5.4 (2023-02-16)

### Other Changes

#### Dependency Updates

- Upgraded `azure-core-http-netty` from `1.12.8` to version `1.13.0`.
- Upgraded `azure-core` from `1.35.0` to version `1.36.0`.

## 4.5.3 (2023-01-09)

### Other Changes

#### Dependency Updates
- Upgraded `azure-core` from `1.34.0` to version `1.35.0`.
- Upgraded `azure-core-http-netty` from `1.12.7` to version `1.12.8`.

## 4.5.2 (2022-11-10)

### Other Changes

#### Dependency Updates
- Upgraded `azure-core` from `1.33.0` to version `1.34.0`.
- Upgraded `azure-core-http-netty` from `1.12.6` to version `1.12.7`.

## 4.5.1 (2022-10-17)

### Other Changes

#### Dependency Updates
- Upgraded `azure-core` from `1.32.0` to version `1.33.0`.
- Upgraded `azure-core-http-netty` from `1.12.5` to version `1.12.6`.

## 4.5.0 (2022-09-20)

### Breaking Changes
- Made it so that we verify that the challenge resource matches the vault domain by default. This should affect few customers who can use the `disableChallengeResourceVerification()` method in client builders to disable this functionality. See https://aka.ms/azsdk/blog/vault-uri for more information.

### Other Changes

#### Dependency Updates

- Upgraded `azure-core` from `1.31.0` to version `1.32.0`.
- Upgraded `azure-core-http-netty` from `1.12.4` to version `1.12.5`.

## 4.4.6 (2022-08-17)

### Bugs Fixed
- Fixed an issue where requests sent by sync clients that should include a body could have an empty body instead. ([#30512](https://github.com/Azure/azure-sdk-for-java/pull/30512))

## 4.4.5 (2022-08-15)

### Other Changes

#### Dependency Updates
- Upgraded `azure-core` dependency to `1.31.0`.
- Upgraded `azure-core-http-netty` dependency to `1.12.4`.

## 4.4.4 (2022-07-06)

### Other Changes

#### Dependency Updates
- Upgraded `azure-core` dependency to `1.30.0`.
- Upgraded `azure-core-http-netty` dependency to `1.12.3`.

## 4.4.3 (2022-06-10)

### Other Changes

#### Dependency Updates
- Upgraded `azure-core` dependency to `1.29.1`.
- Upgraded `azure-core-http-netty` dependency to `1.12.2`.

## 4.4.2 (2022-05-10)

### Other Changes

#### Dependency Updates
- Upgraded `azure-core` dependency to `1.28.0`.
- Upgraded `azure-core-http-netty` dependency to `1.12.0`.

## 4.4.1 (2022-04-08)

### Other Changes

#### Dependency Updates
- Upgraded `azure-core` dependency to `1.27.0`.
- Upgraded `azure-core-http-netty` dependency to `1.11.9`.

## 4.4.0 (2022-03-31)

### Features Added
- Added support for service version `7.3`.
- Implemented new traits (micro-interfaces) in `SecretClientBuilder`. This makes the experience of using client builders more consistent across libraries in the Azure SDK for Java.

## 4.3.8 (2022-03-17)

### Other Changes

#### Dependency Updates
- Upgraded `azure-core` dependency to `1.26.0`
- Upgraded `azure-core-http-netty` dependency to `1.11.8`

## 4.4.0-beta.5 (2022-02-11)

### Features added
- Implemented new traits (micro-interfaces) in `SecretClientBuilder`. This makes the experience of using client builders more consistent across libraries in the Azure SDK for Java.

### Other Changes

#### Dependency Updates
- Upgraded `azure-core` dependency to `1.25.0`
- Upgraded `azure-core-http-netty` dependency to `1.11.7`

## 4.3.7 (2022-02-11)

### Other Changes

#### Dependency Updates
- Upgraded `azure-core` dependency to `1.25.0`
- Upgraded `azure-core-http-netty` dependency to `1.11.7`

## 4.4.0-beta.4 (2022-01-13)

### Other Changes

#### Dependency Updates
- Upgraded `azure-core` dependency to `1.24.1`
- Upgraded `azure-core-http-netty` dependency to `1.11.6`

## 4.3.6 (2022-01-12)

### Other Changes

#### Dependency Updates
- Upgraded `azure-core` dependency to `1.24.1`
- Upgraded `azure-core-http-netty` dependency to `1.11.6`

## 4.4.0-beta.3 (2021-11-12)

### Features Added

- Added support for multi-tenant authentication in clients.

### Other Changes

#### Dependency Updates
- Upgraded `azure-core` dependency to `1.22.0`
- Upgraded `azure-core-http-netty` dependency to `1.11.2`

## 4.3.5 (2021-11-12)

### Features Added

- Added support for multi-tenant authentication in clients.

### Other Changes

#### Dependency Updates
- Upgraded `azure-core` dependency to `1.22.0`
- Upgraded `azure-core-http-netty` dependency to `1.11.2`

## 4.4.0-beta.2 (2021-10-07)

### Bugs Fixed
- Fixed an issue that made clients send unnecessary unauthorized requests to obtain a bearer challenge from the service even when already possessing a valid bearer token.

### Other Changes

#### Dependency Updates
- Upgraded `azure-core` dependency to `1.21.0`
- Upgraded `azure-core-http-netty` dependency to `1.11.1`

## 4.3.4 (2021-10-06)

### Bugs Fixed
- Fixed an issue that made clients send unnecessary unauthorized requests to obtain a bearer challenge from the service even when already possessing a valid bearer token.

### Other Changes

#### Dependency Updates
- Upgraded `azure-core` dependency to `1.21.0`
- Upgraded `azure-core-http-netty` dependency to `1.11.1`

## 4.4.0-beta.1 (2021-09-10)

### Features Added
- Added support for service version `7.3-preview`.

#### Dependency Updates
- Upgraded `azure-core` dependency to `1.20.0`
- Upgraded `azure-core-http-netty` dependency to `1.11.0`

## 4.3.3 (2021-09-10)

### Other Changes

#### Dependency Updates
- Upgraded `azure-core` dependency to `1.20.0`
- Upgraded `azure-core-http-netty` dependency to `1.11.0`

## 4.3.2 (2021-08-12)

### Other Changes

#### Dependency Updates
- Upgraded `azure-core` dependency to `1.19.0`
- Upgraded `azure-core-http-netty` dependency to `1.10.2`

## 4.3.1 (2021-07-08)

### Other Changes

#### Dependency Updates
- Upgraded `azure-core` dependency to `1.18.0`
- Upgraded `azure-core-http-netty` dependency to `1.10.1`

## 4.3.0 (2021-06-17)

### Features Added
- Changed default service version to `7.2`.
- Added `KeyVaultSecretIdentifier` to parse secret URLs.

### Changes since 4.3.0-beta.6

#### Bug Fixes
- Ensured that `RetryPolicy` and `HttpLogOptions` use a default implementation when creating Key Vault clients if not set or set to `null`.

#### Breaking Changes
- Removed service method overloads that take a `pollingInterval`, since `PollerFlux` and `SyncPoller` objects allow for setting this value directly on them.

#### Non-Breaking Changes
- Renamed `secretId` to `sourceId` in `KeyVaultSecretIdentifier`.
- `KeyVaultSecretIdentifier` can now be used to parse any Key Vault identifier.
- Added the `@ServiceMethod` annotation to all public methods that call the Key Vault service in `SecretClient` and `SecretAsyncClient`.

## 4.3.0-beta.6 (2021-05-15)

### Dependency Updates
- Upgraded `azure-core` dependency to `1.16.0`
- Upgraded `azure-core-http-netty` dependency to `1.9.2`
- Upgraded `azure-core-http-okhttp` dependency to `1.6.2`
- Upgraded `azure-identity` dependency to `1.3.0`

## 4.3.0-beta.5 (2021-04-09)

### New features
- Added support for service version `7.2`.
- Added support to specify whether or not a pipeline policy should be added per call or per retry.

### Breaking Changes
- Changed `KeyVaultSecretIdentifier` so it is instantiated via its constructor as opposed to via a `parse()` factory method.

## 4.3.0-beta.4 (2021-03-12)

### Changed
- Changed logging level in `onRequest` and `onSuccess` calls for service operations from `INFO` to `VERBOSE`.

### Dependency Updates
- Upgraded `azure-core` dependency to `1.14.0`
- Upgraded `azure-core-http-netty` dependency to `1.9.0`
- Upgraded `azure-core-http-okhttp` dependency to `1.6.0`
- Upgraded `azure-identity` dependency to `1.2.4`

## 4.3.0-beta.3 (2021-02-11)

### Dependency Updates
- Upgraded `azure-core` dependency to `1.13.0`
- Upgraded `azure-core-http-netty` dependency to `1.8.0`
- Upgraded `azure-core-http-okhttp` dependency to `1.5.0`
- Upgraded `azure-identity` dependency to `1.2.3`

## 4.2.5 (2021-02-11)

### Dependency Updates
- Upgraded `azure-core` dependency to `1.13.0`
- Upgraded `azure-core-http-netty` dependency to `1.8.0`
- Upgraded `azure-core-http-okhttp` dependency to `1.5.0`
- Upgraded `azure-identity` dependency to `1.2.3`

## 4.2.4 (2021-01-15)

### Dependency Updates
- Upgraded `azure-core` dependency to `1.12.0`
- Upgraded `azure-core-http-netty` dependency to `1.7.1`
- Upgraded `azure-core-http-okhttp` dependency to `1.4.1`
- Upgraded `azure-identity` dependency to `1.2.2`

## 4.2.3 (2020-11-12)

### Dependency Updates
- Upgraded `azure-core` dependency to `1.10.0`
- Upgraded `azure-core-http-netty` dependency to `1.6.3`
- Upgraded `azure-core-http-okhttp` dependency to `1.3.3`
- Upgraded `azure-core-test` dependency to `1.5.1`
- Upgraded `azure-identity` dependency to `1.2.0`

## 4.3.0-beta.2 (2020-10-09)

### New Features
- Added `KeyVaultSecretIdentifier`. Use its [`parse`](https://github.com/Azure/azure-sdk-for-java/blob/ff52067a3772a430e5913b898f2806078aec8ef2/sdk/keyvault/azure-security-keyvault-secrets/src/main/java/com/azure/security/keyvault/secrets/models/KeyVaultSecretIdentifier.java#L79) method to parse the different elements of a given secret identifier.
- Added API overloads that allow for passing specific polling intervals for long-running operations:
    - `SecretAsyncClient`
        - `beginDeleteSecret(String, Duration)`
        - `beginRecoverDeletedSecret(String, Duration)`
    - `SecretClient`
        - `beginDeleteSecret(String, Duration)`
        - `beginRecoverDeletedSecret(String, Duration)`
- Added support for `com.azure.core.util.ClientOptions` in client builders.

### Dependency Updates
- Upgraded `azure-core` dependency to `1.9.0`
- Upgraded `azure-core-http-netty` dependency to `1.6.2`
- Upgraded `azure-core-http-okhttp` dependency to `1.3.2`
- Upgraded `azure-core-test` dependency to `1.5.0`
- Upgraded `azure-identity` dependency to `1.1.3`

## 4.2.2 (2020-10-08)

### Dependency Updates
- Upgraded `azure-core` dependency to `1.9.0`
- Upgraded `azure-core-http-netty` dependency to `1.6.2`
- Upgraded `azure-core-http-okhttp` dependency to `1.3.2`
- Upgraded `azure-core-test` dependency to `1.5.0`
- Upgraded `azure-identity` dependency to `1.1.3`

## 4.3.0-beta.1 (2020-09-11)
- Updated versions for azure-core and azure-identity.

## 4.2.1 (2020-09-10)
- Updated versions for azure-core and azure-identity.

## 4.2.0 (2020-08-12)
- Added support for service version `7.1`.
- Added `retryPolicy` setter in `SecretClientBuilder`.
- Added `recoverableDays` property to `SecretProperties`.

## 4.2.0-beta.4 (2020-07-08)
- Updated versions for azure-core, azure-identity.

## 4.1.5 (2020-07-08)
- Updated versions for azure-core and azure-identity.

## 4.2.0-beta.3 (2020-06-10)
- Updated version for azure-core, azure-identity and external dependencies.
- Fixed `ByteBuf` resource leak in `KeyVaultCredentialPolicy`.

## 4.1.4 (2020-06-10)
- Updated version for azure-core, azure-identity and external dependencies.

## 4.1.3 (2020-05-06)
- Update azure-core dependency to version 1.5.0.
- Fixed `ByteBuff` resource leak in `KeyVaultCredentialPolicy`.

## 4.2.0-beta.2 (2020-04-09)
- Update azure-core dependency to version 1.4.0.
- Added `retryPolicy` setter in `SecretClientBuilder`

## 4.1.2 (2020-04-07)
- Update azure-core dependency to version 1.4.0.

## 4.1.1 (2020-03-25)
- Update azure-core dependency to version 1.3.0.

## 4.2.0-beta.1 (2020-03-10)
### Added
- Added `recoverableDays` property to `SecretProperties`.
- Added support for `7.1-Preview` service version

## 4.1.0 (2020-01-07)
- Update azure-core dependency to version 1.2.0
- Drop commons-codec dependency

## 4.0.1 (2019-12-04)

## 4.0.0 (2019-10-31)
### Breaking changes

- Secret has been renamed to KeyVaultSecret to avoid ambiguity with other libraries and to yield better search results.
- endpoint method on SecretClientBuilder has been renamed to vaultUrl.
- On SecretProperties, expires, created, and updated have been renamed to expiresOn, createdOn, and updatedOn respectively.
- On DeletedSecret, deletedDate has been renamed to deletedOn.
- listSecrets and listSecretVersions methods have been renamed to listPropertiesOfSecrets and listPropertiesOfSecretVersions in `SecretClient` and `SecretAsyncClient` respectively.
- restoreSecret method has been renamed to restoreSecretBackup in `SecretClient` and `SecretAsyncClient` to better associate it with SecretClient.backupSecret.
- deleteSecret method has been renamed to beginDeleteSecret and now returns a SyncPoller in `SecretClient` and PollerFlux in `SecretAsyncClient` to track this long-running operation.
- recoverDeletedSecret method has been renamed to beginRecoverDeletedSecret and now returns a SyncPoller in `SecretClient` and PollerFlux in `SecretAsyncClient` to track this long-running operation.

### Major changes
- SecretClient.vaultUrl has been added with the original value pass to SecretClient.

## 4.0.0-preview.3 (2019-09-10)
For details on the Azure SDK for Java (August 2019 Preview) release refer to the [release announcement](https://aka.ms/azure-sdk-preview3-java).

## 4.0.0-preview.4 (2019-09-08)
For details on the Azure SDK for Java (September 2019 Preview) release refer to the [release announcement](https://aka.ms/azure-sdk-preview4-java).

- Updated to be fully compliant with the Java 9 Platform Module System.

### Breaking changes
- `SecretBase` has been renamed to `SecretProperties`.
- `Secret` and `DeletedSecret` no longer extend `SecretProperties`, but instead contain a `SecretProperties` property named `Properties`.
- `updateSecret` method has been renamed to `updateSecretProperties` in `SecretClient` and `SecretAsyncClient`.
- Getters and setters were updated to use Java Bean notation.
- Changed VoidResponse to Response<Void> on sync API, and Mono<VoidResponse> to Mono<Response<Void>> on async API.

## 4.0.0-preview.2 (2019-08-06)
For details on the Azure SDK for Java (August 2019 Preview) release refer to the [release announcement](https://azure.github.io/azure-sdk/releases/2019-08-06/java.html).

- Added support for HTTP challenge based authentication, allowing clients to interact with vaults in sovereign clouds.
- Combined SecretClientBuilder, SecretAsyncClientBuilder into SecretClientBuilder. Methods to create both sync and async clients type were added.
- Removed static builder method from clients. Builders are now instantiable.

## 4.0.0-preview.1 (2019-06-28)
Version 4.0.0-preview.1 is a preview of our efforts in creating a client library that is developer-friendly, idiomatic to the Java ecosystem, and as consistent across different languages and platforms as possible. The principles that guide our efforts can be found in the [Azure SDK Design Guidelines for Java](https://aka.ms/azsdk/guide/java).

For details on the Azure SDK for Java (July 2019 Preview) release, you can refer to the [release announcement](https://aka.ms/azure-sdk-preview1-java).

This library is not a direct replacement for secrets management operations from microsoft-azure-keyvault. Applications using that library would require code changes to use `azure-keyvault-secrets`.
This package's
[documentation](https://github.com/Azure/azure-sdk-for-java/blob/azure-keyvault-secrets_4.0.0-preview.1/keyvault/client/secrets/README.md)
and
[samples](https://github.com/Azure/azure-sdk-for-java/blob/azure-keyvault-secrets_4.0.0-preview.1/keyvault/client/secrets/src/samples/java)
demonstrate the new API.

### Major changes from `azure-keyvault`
- Packages scoped by functionality
    - `azure-keyvault-secrets` contains a `SecretClient` and `SecretAsyncClient` for secret operations,
    `azure-keyvault-keys` contains a `KeyClient` and `KeyAsyncClient` for key operations
- Client instances are scoped to vaults (an instance interacts with one vault
only)
- Reactive streams support using [Project Reactor](https://projectreactor.io/).
- Authentication using `azure-identity` credentials
  - see this package's
  [documentation](https://github.com/Azure/azure-sdk-for-java/blob/azure-keyvault-secrets_4.0.0-preview.1/keyvault/client/secrets/README.md)
  , and the
  [Azure Identity documentation](https://github.com/Azure/azure-sdk-for-java/tree/main/sdk/identity/azure-identity/README.md)
  for more information
  
### `azure-keyvault` features not implemented in this library
- Certificate management APIs
- National cloud support. This release supports public global cloud vaults,
    e.g. https://{vault-name}.vault.azure.net
