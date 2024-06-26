// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.qumulo.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.Resource;
import com.azure.core.management.SystemData;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.qumulo.models.ManagedServiceIdentity;
import com.azure.resourcemanager.qumulo.models.MarketplaceDetails;
import com.azure.resourcemanager.qumulo.models.ProvisioningState;
import com.azure.resourcemanager.qumulo.models.StorageSku;
import com.azure.resourcemanager.qumulo.models.UserDetails;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Map;

/** A FileSystem Resource by Qumulo. */
@Fluent
public final class FileSystemResourceInner extends Resource {
    /*
     * The resource-specific properties for this resource.
     */
    @JsonProperty(value = "properties", required = true)
    private FileSystemResourceProperties innerProperties = new FileSystemResourceProperties();

    /*
     * The managed service identities assigned to this resource.
     */
    @JsonProperty(value = "identity")
    private ManagedServiceIdentity identity;

    /*
     * Azure Resource Manager metadata containing createdBy and modifiedBy information.
     */
    @JsonProperty(value = "systemData", access = JsonProperty.Access.WRITE_ONLY)
    private SystemData systemData;

    /** Creates an instance of FileSystemResourceInner class. */
    public FileSystemResourceInner() {
    }

    /**
     * Get the innerProperties property: The resource-specific properties for this resource.
     *
     * @return the innerProperties value.
     */
    private FileSystemResourceProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the identity property: The managed service identities assigned to this resource.
     *
     * @return the identity value.
     */
    public ManagedServiceIdentity identity() {
        return this.identity;
    }

    /**
     * Set the identity property: The managed service identities assigned to this resource.
     *
     * @param identity the identity value to set.
     * @return the FileSystemResourceInner object itself.
     */
    public FileSystemResourceInner withIdentity(ManagedServiceIdentity identity) {
        this.identity = identity;
        return this;
    }

    /**
     * Get the systemData property: Azure Resource Manager metadata containing createdBy and modifiedBy information.
     *
     * @return the systemData value.
     */
    public SystemData systemData() {
        return this.systemData;
    }

    /** {@inheritDoc} */
    @Override
    public FileSystemResourceInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public FileSystemResourceInner withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Get the marketplaceDetails property: Marketplace details.
     *
     * @return the marketplaceDetails value.
     */
    public MarketplaceDetails marketplaceDetails() {
        return this.innerProperties() == null ? null : this.innerProperties().marketplaceDetails();
    }

    /**
     * Set the marketplaceDetails property: Marketplace details.
     *
     * @param marketplaceDetails the marketplaceDetails value to set.
     * @return the FileSystemResourceInner object itself.
     */
    public FileSystemResourceInner withMarketplaceDetails(MarketplaceDetails marketplaceDetails) {
        if (this.innerProperties() == null) {
            this.innerProperties = new FileSystemResourceProperties();
        }
        this.innerProperties().withMarketplaceDetails(marketplaceDetails);
        return this;
    }

    /**
     * Get the provisioningState property: Provisioning State of the resource.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Get the storageSku property: Storage Sku.
     *
     * @return the storageSku value.
     */
    public StorageSku storageSku() {
        return this.innerProperties() == null ? null : this.innerProperties().storageSku();
    }

    /**
     * Set the storageSku property: Storage Sku.
     *
     * @param storageSku the storageSku value to set.
     * @return the FileSystemResourceInner object itself.
     */
    public FileSystemResourceInner withStorageSku(StorageSku storageSku) {
        if (this.innerProperties() == null) {
            this.innerProperties = new FileSystemResourceProperties();
        }
        this.innerProperties().withStorageSku(storageSku);
        return this;
    }

    /**
     * Get the userDetails property: User Details.
     *
     * @return the userDetails value.
     */
    public UserDetails userDetails() {
        return this.innerProperties() == null ? null : this.innerProperties().userDetails();
    }

    /**
     * Set the userDetails property: User Details.
     *
     * @param userDetails the userDetails value to set.
     * @return the FileSystemResourceInner object itself.
     */
    public FileSystemResourceInner withUserDetails(UserDetails userDetails) {
        if (this.innerProperties() == null) {
            this.innerProperties = new FileSystemResourceProperties();
        }
        this.innerProperties().withUserDetails(userDetails);
        return this;
    }

    /**
     * Get the delegatedSubnetId property: Delegated subnet id for Vnet injection.
     *
     * @return the delegatedSubnetId value.
     */
    public String delegatedSubnetId() {
        return this.innerProperties() == null ? null : this.innerProperties().delegatedSubnetId();
    }

    /**
     * Set the delegatedSubnetId property: Delegated subnet id for Vnet injection.
     *
     * @param delegatedSubnetId the delegatedSubnetId value to set.
     * @return the FileSystemResourceInner object itself.
     */
    public FileSystemResourceInner withDelegatedSubnetId(String delegatedSubnetId) {
        if (this.innerProperties() == null) {
            this.innerProperties = new FileSystemResourceProperties();
        }
        this.innerProperties().withDelegatedSubnetId(delegatedSubnetId);
        return this;
    }

    /**
     * Get the clusterLoginUrl property: File system Id of the resource.
     *
     * @return the clusterLoginUrl value.
     */
    public String clusterLoginUrl() {
        return this.innerProperties() == null ? null : this.innerProperties().clusterLoginUrl();
    }

    /**
     * Set the clusterLoginUrl property: File system Id of the resource.
     *
     * @param clusterLoginUrl the clusterLoginUrl value to set.
     * @return the FileSystemResourceInner object itself.
     */
    public FileSystemResourceInner withClusterLoginUrl(String clusterLoginUrl) {
        if (this.innerProperties() == null) {
            this.innerProperties = new FileSystemResourceProperties();
        }
        this.innerProperties().withClusterLoginUrl(clusterLoginUrl);
        return this;
    }

    /**
     * Get the privateIPs property: Private IPs of the resource.
     *
     * @return the privateIPs value.
     */
    public List<String> privateIPs() {
        return this.innerProperties() == null ? null : this.innerProperties().privateIPs();
    }

    /**
     * Set the privateIPs property: Private IPs of the resource.
     *
     * @param privateIPs the privateIPs value to set.
     * @return the FileSystemResourceInner object itself.
     */
    public FileSystemResourceInner withPrivateIPs(List<String> privateIPs) {
        if (this.innerProperties() == null) {
            this.innerProperties = new FileSystemResourceProperties();
        }
        this.innerProperties().withPrivateIPs(privateIPs);
        return this;
    }

    /**
     * Get the adminPassword property: Initial administrator password of the resource.
     *
     * @return the adminPassword value.
     */
    public String adminPassword() {
        return this.innerProperties() == null ? null : this.innerProperties().adminPassword();
    }

    /**
     * Set the adminPassword property: Initial administrator password of the resource.
     *
     * @param adminPassword the adminPassword value to set.
     * @return the FileSystemResourceInner object itself.
     */
    public FileSystemResourceInner withAdminPassword(String adminPassword) {
        if (this.innerProperties() == null) {
            this.innerProperties = new FileSystemResourceProperties();
        }
        this.innerProperties().withAdminPassword(adminPassword);
        return this;
    }

    /**
     * Get the initialCapacity property: Storage capacity in TB.
     *
     * @return the initialCapacity value.
     */
    public int initialCapacity() {
        return this.innerProperties() == null ? 0 : this.innerProperties().initialCapacity();
    }

    /**
     * Set the initialCapacity property: Storage capacity in TB.
     *
     * @param initialCapacity the initialCapacity value to set.
     * @return the FileSystemResourceInner object itself.
     */
    public FileSystemResourceInner withInitialCapacity(int initialCapacity) {
        if (this.innerProperties() == null) {
            this.innerProperties = new FileSystemResourceProperties();
        }
        this.innerProperties().withInitialCapacity(initialCapacity);
        return this;
    }

    /**
     * Get the availabilityZone property: Availability zone.
     *
     * @return the availabilityZone value.
     */
    public String availabilityZone() {
        return this.innerProperties() == null ? null : this.innerProperties().availabilityZone();
    }

    /**
     * Set the availabilityZone property: Availability zone.
     *
     * @param availabilityZone the availabilityZone value to set.
     * @return the FileSystemResourceInner object itself.
     */
    public FileSystemResourceInner withAvailabilityZone(String availabilityZone) {
        if (this.innerProperties() == null) {
            this.innerProperties = new FileSystemResourceProperties();
        }
        this.innerProperties().withAvailabilityZone(availabilityZone);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property innerProperties in model FileSystemResourceInner"));
        } else {
            innerProperties().validate();
        }
        if (identity() != null) {
            identity().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(FileSystemResourceInner.class);
}
