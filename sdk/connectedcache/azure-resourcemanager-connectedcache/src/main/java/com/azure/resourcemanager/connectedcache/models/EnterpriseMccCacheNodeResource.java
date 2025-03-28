// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.connectedcache.models;

import com.azure.core.http.rest.Response;
import com.azure.core.management.Region;
import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.connectedcache.fluent.models.EnterpriseMccCacheNodeResourceInner;
import java.util.Map;

/**
 * An immutable client-side representation of EnterpriseMccCacheNodeResource.
 */
public interface EnterpriseMccCacheNodeResource {
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
     * Gets the location property: The geo-location where the resource lives.
     * 
     * @return the location value.
     */
    String location();

    /**
     * Gets the tags property: Resource tags.
     * 
     * @return the tags value.
     */
    Map<String, String> tags();

    /**
     * Gets the properties property: The resource-specific properties for this resource.
     * 
     * @return the properties value.
     */
    CacheNodeProperty properties();

    /**
     * Gets the systemData property: Azure Resource Manager metadata containing createdBy and modifiedBy information.
     * 
     * @return the systemData value.
     */
    SystemData systemData();

    /**
     * Gets the region of the resource.
     * 
     * @return the region of the resource.
     */
    Region region();

    /**
     * Gets the name of the resource region.
     * 
     * @return the name of the resource region.
     */
    String regionName();

    /**
     * Gets the name of the resource group.
     * 
     * @return the name of the resource group.
     */
    String resourceGroupName();

    /**
     * Gets the inner com.azure.resourcemanager.connectedcache.fluent.models.EnterpriseMccCacheNodeResourceInner object.
     * 
     * @return the inner object.
     */
    EnterpriseMccCacheNodeResourceInner innerModel();

    /**
     * The entirety of the EnterpriseMccCacheNodeResource definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithLocation,
        DefinitionStages.WithParentResource, DefinitionStages.WithCreate {
    }

    /**
     * The EnterpriseMccCacheNodeResource definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of the EnterpriseMccCacheNodeResource definition.
         */
        interface Blank extends WithLocation {
        }

        /**
         * The stage of the EnterpriseMccCacheNodeResource definition allowing to specify location.
         */
        interface WithLocation {
            /**
             * Specifies the region for the resource.
             * 
             * @param location The geo-location where the resource lives.
             * @return the next definition stage.
             */
            WithParentResource withRegion(Region location);

            /**
             * Specifies the region for the resource.
             * 
             * @param location The geo-location where the resource lives.
             * @return the next definition stage.
             */
            WithParentResource withRegion(String location);
        }

        /**
         * The stage of the EnterpriseMccCacheNodeResource definition allowing to specify parent resource.
         */
        interface WithParentResource {
            /**
             * Specifies resourceGroupName, customerResourceName.
             * 
             * @param resourceGroupName The name of the resource group. The name is case insensitive.
             * @param customerResourceName Name of the Customer resource.
             * @return the next definition stage.
             */
            WithCreate withExistingEnterpriseMccCustomer(String resourceGroupName, String customerResourceName);
        }

        /**
         * The stage of the EnterpriseMccCacheNodeResource definition which contains all the minimum required properties
         * for the resource to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate extends DefinitionStages.WithTags, DefinitionStages.WithProperties {
            /**
             * Executes the create request.
             * 
             * @return the created resource.
             */
            EnterpriseMccCacheNodeResource create();

            /**
             * Executes the create request.
             * 
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            EnterpriseMccCacheNodeResource create(Context context);
        }

        /**
         * The stage of the EnterpriseMccCacheNodeResource definition allowing to specify tags.
         */
        interface WithTags {
            /**
             * Specifies the tags property: Resource tags..
             * 
             * @param tags Resource tags.
             * @return the next definition stage.
             */
            WithCreate withTags(Map<String, String> tags);
        }

        /**
         * The stage of the EnterpriseMccCacheNodeResource definition allowing to specify properties.
         */
        interface WithProperties {
            /**
             * Specifies the properties property: The resource-specific properties for this resource..
             * 
             * @param properties The resource-specific properties for this resource.
             * @return the next definition stage.
             */
            WithCreate withProperties(CacheNodeProperty properties);
        }
    }

    /**
     * Begins update for the EnterpriseMccCacheNodeResource resource.
     * 
     * @return the stage of resource update.
     */
    EnterpriseMccCacheNodeResource.Update update();

    /**
     * The template for EnterpriseMccCacheNodeResource update.
     */
    interface Update extends UpdateStages.WithTags {
        /**
         * Executes the update request.
         * 
         * @return the updated resource.
         */
        EnterpriseMccCacheNodeResource apply();

        /**
         * Executes the update request.
         * 
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        EnterpriseMccCacheNodeResource apply(Context context);
    }

    /**
     * The EnterpriseMccCacheNodeResource update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the EnterpriseMccCacheNodeResource update allowing to specify tags.
         */
        interface WithTags {
            /**
             * Specifies the tags property: Resource tags..
             * 
             * @param tags Resource tags.
             * @return the next definition stage.
             */
            Update withTags(Map<String, String> tags);
        }
    }

    /**
     * Refreshes the resource to sync with Azure.
     * 
     * @return the refreshed resource.
     */
    EnterpriseMccCacheNodeResource refresh();

    /**
     * Refreshes the resource to sync with Azure.
     * 
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    EnterpriseMccCacheNodeResource refresh(Context context);

    /**
     * This api gets secrets of the ispCacheNode resource install details.
     * 
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return mcc cache node resource all install details along with {@link Response}.
     */
    Response<MccCacheNodeInstallDetails> getCacheNodeInstallDetailsWithResponse(Context context);

    /**
     * This api gets secrets of the ispCacheNode resource install details.
     * 
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return mcc cache node resource all install details.
     */
    MccCacheNodeInstallDetails getCacheNodeInstallDetails();
}
