// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.labservices.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/**
 * Resource collection API of VirtualMachines.
 */
public interface VirtualMachines {
    /**
     * Get all virtual machines for a lab.
     * 
     * Returns a list of all virtual machines for a lab.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param labName The name of the lab that uniquely identifies it within containing lab plan. Used in resource URIs.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return paged list of lab services virtual machines as paginated response with {@link PagedIterable}.
     */
    PagedIterable<VirtualMachine> listByLab(String resourceGroupName, String labName);

    /**
     * Get all virtual machines for a lab.
     * 
     * Returns a list of all virtual machines for a lab.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param labName The name of the lab that uniquely identifies it within containing lab plan. Used in resource URIs.
     * @param filter The filter to apply to the operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return paged list of lab services virtual machines as paginated response with {@link PagedIterable}.
     */
    PagedIterable<VirtualMachine> listByLab(String resourceGroupName, String labName, String filter, Context context);

    /**
     * Get a lab virtual machine.
     * 
     * Returns the properties for a lab virtual machine.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param labName The name of the lab that uniquely identifies it within containing lab plan. Used in resource URIs.
     * @param virtualMachineName The ID of the virtual machine that uniquely identifies it within the containing lab.
     * Used in resource URIs.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a lab virtual machine resource along with {@link Response}.
     */
    Response<VirtualMachine> getWithResponse(String resourceGroupName, String labName, String virtualMachineName,
        Context context);

    /**
     * Get a lab virtual machine.
     * 
     * Returns the properties for a lab virtual machine.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param labName The name of the lab that uniquely identifies it within containing lab plan. Used in resource URIs.
     * @param virtualMachineName The ID of the virtual machine that uniquely identifies it within the containing lab.
     * Used in resource URIs.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a lab virtual machine resource.
     */
    VirtualMachine get(String resourceGroupName, String labName, String virtualMachineName);

    /**
     * Start a lab virtual machine.
     * 
     * Action to start a lab virtual machine.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param labName The name of the lab that uniquely identifies it within containing lab plan. Used in resource URIs.
     * @param virtualMachineName The ID of the virtual machine that uniquely identifies it within the containing lab.
     * Used in resource URIs.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void start(String resourceGroupName, String labName, String virtualMachineName);

    /**
     * Start a lab virtual machine.
     * 
     * Action to start a lab virtual machine.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param labName The name of the lab that uniquely identifies it within containing lab plan. Used in resource URIs.
     * @param virtualMachineName The ID of the virtual machine that uniquely identifies it within the containing lab.
     * Used in resource URIs.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void start(String resourceGroupName, String labName, String virtualMachineName, Context context);

    /**
     * Stop a lab virtual machine.
     * 
     * Action to stop a lab virtual machine.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param labName The name of the lab that uniquely identifies it within containing lab plan. Used in resource URIs.
     * @param virtualMachineName The ID of the virtual machine that uniquely identifies it within the containing lab.
     * Used in resource URIs.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void stop(String resourceGroupName, String labName, String virtualMachineName);

    /**
     * Stop a lab virtual machine.
     * 
     * Action to stop a lab virtual machine.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param labName The name of the lab that uniquely identifies it within containing lab plan. Used in resource URIs.
     * @param virtualMachineName The ID of the virtual machine that uniquely identifies it within the containing lab.
     * Used in resource URIs.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void stop(String resourceGroupName, String labName, String virtualMachineName, Context context);

    /**
     * Re-image a lab virtual machine.
     * 
     * Re-image a lab virtual machine. The virtual machine will be deleted and recreated using the latest published
     * snapshot of the reference environment of the lab.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param labName The name of the lab that uniquely identifies it within containing lab plan. Used in resource URIs.
     * @param virtualMachineName The ID of the virtual machine that uniquely identifies it within the containing lab.
     * Used in resource URIs.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void reimage(String resourceGroupName, String labName, String virtualMachineName);

    /**
     * Re-image a lab virtual machine.
     * 
     * Re-image a lab virtual machine. The virtual machine will be deleted and recreated using the latest published
     * snapshot of the reference environment of the lab.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param labName The name of the lab that uniquely identifies it within containing lab plan. Used in resource URIs.
     * @param virtualMachineName The ID of the virtual machine that uniquely identifies it within the containing lab.
     * Used in resource URIs.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void reimage(String resourceGroupName, String labName, String virtualMachineName, Context context);

    /**
     * Redeploy a lab virtual machine to a different compute node. For troubleshooting connectivity.
     * 
     * Action to redeploy a lab virtual machine to a different compute node. For troubleshooting connectivity.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param labName The name of the lab that uniquely identifies it within containing lab plan. Used in resource URIs.
     * @param virtualMachineName The ID of the virtual machine that uniquely identifies it within the containing lab.
     * Used in resource URIs.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void redeploy(String resourceGroupName, String labName, String virtualMachineName);

    /**
     * Redeploy a lab virtual machine to a different compute node. For troubleshooting connectivity.
     * 
     * Action to redeploy a lab virtual machine to a different compute node. For troubleshooting connectivity.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param labName The name of the lab that uniquely identifies it within containing lab plan. Used in resource URIs.
     * @param virtualMachineName The ID of the virtual machine that uniquely identifies it within the containing lab.
     * Used in resource URIs.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void redeploy(String resourceGroupName, String labName, String virtualMachineName, Context context);

    /**
     * Reset a lab virtual machine password.
     * 
     * Resets a lab virtual machine password.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param labName The name of the lab that uniquely identifies it within containing lab plan. Used in resource URIs.
     * @param virtualMachineName The ID of the virtual machine that uniquely identifies it within the containing lab.
     * Used in resource URIs.
     * @param body The request body.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void resetPassword(String resourceGroupName, String labName, String virtualMachineName, ResetPasswordBody body);

    /**
     * Reset a lab virtual machine password.
     * 
     * Resets a lab virtual machine password.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param labName The name of the lab that uniquely identifies it within containing lab plan. Used in resource URIs.
     * @param virtualMachineName The ID of the virtual machine that uniquely identifies it within the containing lab.
     * Used in resource URIs.
     * @param body The request body.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void resetPassword(String resourceGroupName, String labName, String virtualMachineName, ResetPasswordBody body,
        Context context);
}
