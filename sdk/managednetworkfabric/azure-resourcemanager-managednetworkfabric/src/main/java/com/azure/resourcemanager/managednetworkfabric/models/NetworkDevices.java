// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managednetworkfabric.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/**
 * Resource collection API of NetworkDevices.
 */
public interface NetworkDevices {
    /**
     * Gets a Network Device.
     * 
     * Gets the Network Device resource details.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param networkDeviceName Name of the Network Device.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Network Device resource details along with {@link Response}.
     */
    Response<NetworkDevice> getByResourceGroupWithResponse(String resourceGroupName, String networkDeviceName,
        Context context);

    /**
     * Gets a Network Device.
     * 
     * Gets the Network Device resource details.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param networkDeviceName Name of the Network Device.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Network Device resource details.
     */
    NetworkDevice getByResourceGroup(String resourceGroupName, String networkDeviceName);

    /**
     * Deletes a Network Device.
     * 
     * Delete the Network Device resource.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param networkDeviceName Name of the Network Device.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteByResourceGroup(String resourceGroupName, String networkDeviceName);

    /**
     * Deletes a Network Device.
     * 
     * Delete the Network Device resource.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param networkDeviceName Name of the Network Device.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String networkDeviceName, Context context);

    /**
     * List NetworkDevices by resource group.
     * 
     * List all the Network Device resources in a given resource group.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of NetworkDevices as paginated response with {@link PagedIterable}.
     */
    PagedIterable<NetworkDevice> listByResourceGroup(String resourceGroupName);

    /**
     * List NetworkDevices by resource group.
     * 
     * List all the Network Device resources in a given resource group.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of NetworkDevices as paginated response with {@link PagedIterable}.
     */
    PagedIterable<NetworkDevice> listByResourceGroup(String resourceGroupName, Context context);

    /**
     * List NetworkDevices by subscription.
     * 
     * List all the Network Device resources in a given subscription.
     * 
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of NetworkDevices as paginated response with {@link PagedIterable}.
     */
    PagedIterable<NetworkDevice> list();

    /**
     * List NetworkDevices by subscription.
     * 
     * List all the Network Device resources in a given subscription.
     * 
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of NetworkDevices as paginated response with {@link PagedIterable}.
     */
    PagedIterable<NetworkDevice> list(Context context);

    /**
     * Implements the operation to the underlying resources.
     * 
     * Reboot the Network Device.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param networkDeviceName Name of the Network Device.
     * @param body Request payload.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return common response for the state updates.
     */
    CommonPostActionResponseForStateUpdate reboot(String resourceGroupName, String networkDeviceName,
        RebootProperties body);

    /**
     * Implements the operation to the underlying resources.
     * 
     * Reboot the Network Device.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param networkDeviceName Name of the Network Device.
     * @param body Request payload.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return common response for the state updates.
     */
    CommonPostActionResponseForStateUpdate reboot(String resourceGroupName, String networkDeviceName,
        RebootProperties body, Context context);

    /**
     * Implements the operation to the underlying resources.
     * 
     * Refreshes the configuration the Network Device.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param networkDeviceName Name of the Network Device.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return common response for the state updates.
     */
    CommonPostActionResponseForStateUpdate refreshConfiguration(String resourceGroupName, String networkDeviceName);

    /**
     * Implements the operation to the underlying resources.
     * 
     * Refreshes the configuration the Network Device.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param networkDeviceName Name of the Network Device.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return common response for the state updates.
     */
    CommonPostActionResponseForStateUpdate refreshConfiguration(String resourceGroupName, String networkDeviceName,
        Context context);

    /**
     * Implements the operation to the underlying resources.
     * 
     * Updates the Administrative state of the Network Device.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param networkDeviceName Name of the Network Device.
     * @param body Request payload.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return common response for the state updates.
     */
    CommonPostActionResponseForStateUpdate updateAdministrativeState(String resourceGroupName, String networkDeviceName,
        UpdateDeviceAdministrativeState body);

    /**
     * Implements the operation to the underlying resources.
     * 
     * Updates the Administrative state of the Network Device.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param networkDeviceName Name of the Network Device.
     * @param body Request payload.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return common response for the state updates.
     */
    CommonPostActionResponseForStateUpdate updateAdministrativeState(String resourceGroupName, String networkDeviceName,
        UpdateDeviceAdministrativeState body, Context context);

    /**
     * Implements the operation to the underlying resources.
     * 
     * Upgrades the version of the Network Device.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param networkDeviceName Name of the Network Device.
     * @param body Request payload.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return common response for the state updates.
     */
    CommonPostActionResponseForStateUpdate upgrade(String resourceGroupName, String networkDeviceName,
        UpdateVersion body);

    /**
     * Implements the operation to the underlying resources.
     * 
     * Upgrades the version of the Network Device.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param networkDeviceName Name of the Network Device.
     * @param body Request payload.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return common response for the state updates.
     */
    CommonPostActionResponseForStateUpdate upgrade(String resourceGroupName, String networkDeviceName,
        UpdateVersion body, Context context);

    /**
     * Gets a Network Device.
     * 
     * Gets the Network Device resource details.
     * 
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Network Device resource details along with {@link Response}.
     */
    NetworkDevice getById(String id);

    /**
     * Gets a Network Device.
     * 
     * Gets the Network Device resource details.
     * 
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Network Device resource details along with {@link Response}.
     */
    Response<NetworkDevice> getByIdWithResponse(String id, Context context);

    /**
     * Deletes a Network Device.
     * 
     * Delete the Network Device resource.
     * 
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteById(String id);

    /**
     * Deletes a Network Device.
     * 
     * Delete the Network Device resource.
     * 
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteByIdWithResponse(String id, Context context);

    /**
     * Begins definition for a new NetworkDevice resource.
     * 
     * @param name resource name.
     * @return the first stage of the new NetworkDevice definition.
     */
    NetworkDevice.DefinitionStages.Blank define(String name);
}
