// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.vmwarecloudsimple.models;

import com.azure.resourcemanager.vmwarecloudsimple.fluent.models.VirtualNetworkInner;

/**
 * An immutable client-side representation of VirtualNetwork.
 */
public interface VirtualNetwork {
    /**
     * Gets the assignable property: can be used in vm creation/deletion.
     * 
     * @return the assignable value.
     */
    Boolean assignable();

    /**
     * Gets the id property: virtual network id (privateCloudId:vsphereId).
     * 
     * @return the id value.
     */
    String id();

    /**
     * Gets the location property: Azure region.
     * 
     * @return the location value.
     */
    String location();

    /**
     * Gets the name property: {VirtualNetworkName}.
     * 
     * @return the name value.
     */
    String name();

    /**
     * Gets the type property: {resourceProviderNamespace}/{resourceType}.
     * 
     * @return the type value.
     */
    String type();

    /**
     * Gets the privateCloudId property: The Private Cloud id.
     * 
     * @return the privateCloudId value.
     */
    String privateCloudId();

    /**
     * Gets the inner com.azure.resourcemanager.vmwarecloudsimple.fluent.models.VirtualNetworkInner object.
     * 
     * @return the inner object.
     */
    VirtualNetworkInner innerModel();
}
