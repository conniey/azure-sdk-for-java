// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.hardwaresecuritymodules.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/**
 * Resource collection API of DedicatedHsms.
 */
public interface DedicatedHsms {
    /**
     * Gets the specified Azure dedicated HSM.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param name Name of the dedicated Hsm.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.hardwaresecuritymodules.models.ErrorException thrown if the request is rejected
     * by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified Azure dedicated HSM along with {@link Response}.
     */
    Response<DedicatedHsm> getByResourceGroupWithResponse(String resourceGroupName, String name, Context context);

    /**
     * Gets the specified Azure dedicated HSM.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param name Name of the dedicated Hsm.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.hardwaresecuritymodules.models.ErrorException thrown if the request is rejected
     * by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified Azure dedicated HSM.
     */
    DedicatedHsm getByResourceGroup(String resourceGroupName, String name);

    /**
     * Deletes the specified Azure Dedicated HSM.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param name Name of the dedicated Hsm.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.hardwaresecuritymodules.models.ErrorException thrown if the request is rejected
     * by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteByResourceGroup(String resourceGroupName, String name);

    /**
     * Deletes the specified Azure Dedicated HSM.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param name Name of the dedicated Hsm.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.hardwaresecuritymodules.models.ErrorException thrown if the request is rejected
     * by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String name, Context context);

    /**
     * The List operation gets information about the dedicated HSMs associated with the subscription and within the
     * specified resource group.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.hardwaresecuritymodules.models.ErrorException thrown if the request is rejected
     * by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response of a DedicatedHsm list operation as paginated response with {@link PagedIterable}.
     */
    PagedIterable<DedicatedHsm> listByResourceGroup(String resourceGroupName);

    /**
     * The List operation gets information about the dedicated HSMs associated with the subscription and within the
     * specified resource group.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param top Maximum number of results to return.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.hardwaresecuritymodules.models.ErrorException thrown if the request is rejected
     * by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response of a DedicatedHsm list operation as paginated response with {@link PagedIterable}.
     */
    PagedIterable<DedicatedHsm> listByResourceGroup(String resourceGroupName, Integer top, Context context);

    /**
     * The List operation gets information about the dedicated HSMs associated with the subscription.
     * 
     * @throws com.azure.resourcemanager.hardwaresecuritymodules.models.ErrorException thrown if the request is rejected
     * by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response of a DedicatedHsm list operation as paginated response with {@link PagedIterable}.
     */
    PagedIterable<DedicatedHsm> list();

    /**
     * The List operation gets information about the dedicated HSMs associated with the subscription.
     * 
     * @param top Maximum number of results to return.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.hardwaresecuritymodules.models.ErrorException thrown if the request is rejected
     * by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response of a DedicatedHsm list operation as paginated response with {@link PagedIterable}.
     */
    PagedIterable<DedicatedHsm> list(Integer top, Context context);

    /**
     * Gets a list of egress endpoints (network endpoints of all outbound dependencies) in the specified dedicated hsm
     * resource. The operation returns properties of each egress endpoint.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param name Name of the dedicated Hsm.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.hardwaresecuritymodules.models.ErrorException thrown if the request is rejected
     * by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of egress endpoints (network endpoints of all outbound dependencies) in the specified dedicated
     * hsm resource as paginated response with {@link PagedIterable}.
     */
    PagedIterable<OutboundEnvironmentEndpoint> listOutboundNetworkDependenciesEndpoints(String resourceGroupName,
        String name);

    /**
     * Gets a list of egress endpoints (network endpoints of all outbound dependencies) in the specified dedicated hsm
     * resource. The operation returns properties of each egress endpoint.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param name Name of the dedicated Hsm.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.hardwaresecuritymodules.models.ErrorException thrown if the request is rejected
     * by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of egress endpoints (network endpoints of all outbound dependencies) in the specified dedicated
     * hsm resource as paginated response with {@link PagedIterable}.
     */
    PagedIterable<OutboundEnvironmentEndpoint> listOutboundNetworkDependenciesEndpoints(String resourceGroupName,
        String name, Context context);

    /**
     * Gets the specified Azure dedicated HSM.
     * 
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.hardwaresecuritymodules.models.ErrorException thrown if the request is rejected
     * by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified Azure dedicated HSM along with {@link Response}.
     */
    DedicatedHsm getById(String id);

    /**
     * Gets the specified Azure dedicated HSM.
     * 
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.hardwaresecuritymodules.models.ErrorException thrown if the request is rejected
     * by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified Azure dedicated HSM along with {@link Response}.
     */
    Response<DedicatedHsm> getByIdWithResponse(String id, Context context);

    /**
     * Deletes the specified Azure Dedicated HSM.
     * 
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.hardwaresecuritymodules.models.ErrorException thrown if the request is rejected
     * by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteById(String id);

    /**
     * Deletes the specified Azure Dedicated HSM.
     * 
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.hardwaresecuritymodules.models.ErrorException thrown if the request is rejected
     * by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteByIdWithResponse(String id, Context context);

    /**
     * Begins definition for a new DedicatedHsm resource.
     * 
     * @param name resource name.
     * @return the first stage of the new DedicatedHsm definition.
     */
    DedicatedHsm.DefinitionStages.Blank define(String name);
}
