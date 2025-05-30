// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managednetworkfabric.models;

import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.managednetworkfabric.fluent.models.NetworkInterfaceInner;

/**
 * An immutable client-side representation of NetworkInterface.
 */
public interface NetworkInterface {
    /**
     * Gets the id property: Fully qualified resource Id for the resource.
     * 
     * @return the id value.
     */
    String id();

    /**
     * Gets the name property: The name of the resource.
     * 
     * @return the name value.
     */
    String name();

    /**
     * Gets the type property: The type of the resource.
     * 
     * @return the type value.
     */
    String type();

    /**
     * Gets the systemData property: Azure Resource Manager metadata containing createdBy and modifiedBy information.
     * 
     * @return the systemData value.
     */
    SystemData systemData();

    /**
     * Gets the physicalIdentifier property: Physical Identifier of the network interface.
     * 
     * @return the physicalIdentifier value.
     */
    String physicalIdentifier();

    /**
     * Gets the connectedTo property: The ARM resource id of the interface or compute server its connected to.
     * 
     * @return the connectedTo value.
     */
    String connectedTo();

    /**
     * Gets the interfaceType property: The Interface Type. Example: Management/Data.
     * 
     * @return the interfaceType value.
     */
    InterfaceType interfaceType();

    /**
     * Gets the ipv4Address property: IPv4Address of the interface.
     * 
     * @return the ipv4Address value.
     */
    String ipv4Address();

    /**
     * Gets the ipv6Address property: IPv6Address of the interface.
     * 
     * @return the ipv6Address value.
     */
    String ipv6Address();

    /**
     * Gets the provisioningState property: Provisioning state of the resource.
     * 
     * @return the provisioningState value.
     */
    ProvisioningState provisioningState();

    /**
     * Gets the administrativeState property: Administrative state of the resource.
     * 
     * @return the administrativeState value.
     */
    AdministrativeState administrativeState();

    /**
     * Gets the annotation property: Switch configuration description.
     * 
     * @return the annotation value.
     */
    String annotation();

    /**
     * Gets the name of the resource group.
     * 
     * @return the name of the resource group.
     */
    String resourceGroupName();

    /**
     * Gets the inner com.azure.resourcemanager.managednetworkfabric.fluent.models.NetworkInterfaceInner object.
     * 
     * @return the inner object.
     */
    NetworkInterfaceInner innerModel();

    /**
     * The entirety of the NetworkInterface definition.
     */
    interface Definition
        extends DefinitionStages.Blank, DefinitionStages.WithParentResource, DefinitionStages.WithCreate {
    }

    /**
     * The NetworkInterface definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of the NetworkInterface definition.
         */
        interface Blank extends WithParentResource {
        }

        /**
         * The stage of the NetworkInterface definition allowing to specify parent resource.
         */
        interface WithParentResource {
            /**
             * Specifies resourceGroupName, networkDeviceName.
             * 
             * @param resourceGroupName The name of the resource group. The name is case insensitive.
             * @param networkDeviceName Name of the Network Device.
             * @return the next definition stage.
             */
            WithCreate withExistingNetworkDevice(String resourceGroupName, String networkDeviceName);
        }

        /**
         * The stage of the NetworkInterface definition which contains all the minimum required properties for the
         * resource to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate extends DefinitionStages.WithAnnotation {
            /**
             * Executes the create request.
             * 
             * @return the created resource.
             */
            NetworkInterface create();

            /**
             * Executes the create request.
             * 
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            NetworkInterface create(Context context);
        }

        /**
         * The stage of the NetworkInterface definition allowing to specify annotation.
         */
        interface WithAnnotation {
            /**
             * Specifies the annotation property: Switch configuration description..
             * 
             * @param annotation Switch configuration description.
             * @return the next definition stage.
             */
            WithCreate withAnnotation(String annotation);
        }
    }

    /**
     * Begins update for the NetworkInterface resource.
     * 
     * @return the stage of resource update.
     */
    NetworkInterface.Update update();

    /**
     * The template for NetworkInterface update.
     */
    interface Update extends UpdateStages.WithAnnotation {
        /**
         * Executes the update request.
         * 
         * @return the updated resource.
         */
        NetworkInterface apply();

        /**
         * Executes the update request.
         * 
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        NetworkInterface apply(Context context);
    }

    /**
     * The NetworkInterface update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the NetworkInterface update allowing to specify annotation.
         */
        interface WithAnnotation {
            /**
             * Specifies the annotation property: Switch configuration description..
             * 
             * @param annotation Switch configuration description.
             * @return the next definition stage.
             */
            Update withAnnotation(String annotation);
        }
    }

    /**
     * Refreshes the resource to sync with Azure.
     * 
     * @return the refreshed resource.
     */
    NetworkInterface refresh();

    /**
     * Refreshes the resource to sync with Azure.
     * 
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    NetworkInterface refresh(Context context);

    /**
     * Updates the admin state of the network interface.
     * 
     * Update the admin state of the Network Interface.
     * 
     * @param body Request payload.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return common response for the state updates.
     */
    CommonPostActionResponseForStateUpdate updateAdministrativeState(UpdateAdministrativeState body);

    /**
     * Updates the admin state of the network interface.
     * 
     * Update the admin state of the Network Interface.
     * 
     * @param body Request payload.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return common response for the state updates.
     */
    CommonPostActionResponseForStateUpdate updateAdministrativeState(UpdateAdministrativeState body, Context context);
}
