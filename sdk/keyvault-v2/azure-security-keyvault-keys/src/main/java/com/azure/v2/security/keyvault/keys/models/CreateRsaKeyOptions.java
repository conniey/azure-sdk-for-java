// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.v2.security.keyvault.keys.models;

import io.clientcore.core.annotations.Metadata;
import io.clientcore.core.annotations.MetadataProperties;

import java.time.OffsetDateTime;
import java.util.Map;

/**
 * Represents the configurable options to create an RSA key.
 */
@Metadata(properties = { MetadataProperties.FLUENT })
public class CreateRsaKeyOptions extends CreateKeyOptions {
    /**
     * The RSA key size.
     */
    private Integer keySize;

    /**
     * The hardware protected indicator for the key.
     */
    private boolean hardwareProtected;

    /**
     * The public exponent for the key.
     */
    private int publicExponent;

    /**
     * Creates a {@link CreateRsaKeyOptions} with {@code name} as name of the RSA key.
     *
     * @param name The name of the key.
     */
    public CreateRsaKeyOptions(String name) {
        super(name, KeyType.RSA);
    }

    /**
     * Get the key size in bits.
     *
     * @return The key size in bits.
     */
    public Integer getKeySize() {
        return this.keySize;
    }

    /**
     * Set the key size in bits.
     *
     * @param keySize The key size in bits to set.
     *
     * @return The updated {@link CreateRsaKeyOptions} object.
     */
    public CreateRsaKeyOptions setKeySize(Integer keySize) {
        this.keySize = keySize;

        return this;
    }

    /**
     * Get the HSM value of the key being created.
     *
     * @return The HSM value.
     */
    public Boolean isHardwareProtected() {
        return this.hardwareProtected;
    }

    /**
     * Set whether the key being created is of HSM type or not.
     *
     * @param hardwareProtected The HSM value to set.
     *
     * @return The updated {@link CreateRsaKeyOptions} object.
     */
    public CreateRsaKeyOptions setHardwareProtected(Boolean hardwareProtected) {
        this.hardwareProtected = hardwareProtected;
        KeyType keyType = hardwareProtected ? KeyType.RSA_HSM : KeyType.RSA;

        setKeyType(keyType);

        return this;
    }

    /**
     * Get the public exponent for the key.
     *
     * @return The public exponent.
     */
    public Integer getPublicExponent() {
        return publicExponent;
    }

    /**
     * Set the public exponent for the key.
     *
     * @param publicExponent The public exponent to set.
     *
     * @return The updated {@link CreateRsaKeyOptions} object.
     */
    public CreateRsaKeyOptions setPublicExponent(Integer publicExponent) {
        this.publicExponent = publicExponent;

        return this;
    }

    /**
     * Set the key operations.
     *
     * @param keyOperations The key operations to set.
     *
     * @return The updated {@link CreateRsaKeyOptions} object.
     */
    @Override
    public CreateRsaKeyOptions setKeyOperations(KeyOperation... keyOperations) {
        super.setKeyOperations(keyOperations);

        return this;
    }

    /**
     * Set the {@link OffsetDateTime notBefore} UTC time.
     *
     * @param notBefore The notBefore UTC time to set.
     *
     * @return The updated {@link CreateRsaKeyOptions} object.
     */
    @Override
    public CreateRsaKeyOptions setNotBefore(OffsetDateTime notBefore) {
        super.setNotBefore(notBefore);

        return this;
    }

    /**
     * Set the {@link OffsetDateTime expires} UTC time.
     *
     * @param expiresOn The expiry time to set for the key.
     *
     * @return The updated {@link CreateRsaKeyOptions} object.
     */
    @Override
    public CreateRsaKeyOptions setExpiresOn(OffsetDateTime expiresOn) {
        super.setExpiresOn(expiresOn);

        return this;
    }

    /**
     * Set the tags to be associated with the key.
     *
     * @param tags The tags to set.
     *
     * @return The updated {@link CreateRsaKeyOptions} object.
     */
    @Override
    public CreateRsaKeyOptions setTags(Map<String, String> tags) {
        super.setTags(tags);

        return this;
    }

    /**
     * Set a value that indicates if the key is enabled.
     *
     * @param enabled The enabled value to set.
     *
     * @return The updated {@link CreateRsaKeyOptions} object.
     */
    @Override
    public CreateRsaKeyOptions setEnabled(Boolean enabled) {
        super.setEnabled(enabled);

        return this;
    }

    /**
     * Set a flag that indicates if the private key can be exported.
     *
     * @param exportable A flag that indicates if the private key can be exported.
     *
     * @return The updated {@link CreateRsaKeyOptions} object.
     */
    @Override
    public CreateRsaKeyOptions setExportable(Boolean exportable) {
        super.setExportable(exportable);

        return this;
    }

    /**
     * Set the policy rules under which the key can be exported.
     *
     * @param releasePolicy The policy rules to set.
     *
     * @return The updated {@link CreateRsaKeyOptions} object.
     */
    @Override
    public CreateRsaKeyOptions setReleasePolicy(KeyReleasePolicy releasePolicy) {
        super.setReleasePolicy(releasePolicy);

        return this;
    }
}
