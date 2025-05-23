// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.maps.models;

import com.azure.core.management.Region;
import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.maps.fluent.models.CreatorInner;
import com.azure.resourcemanager.maps.fluent.models.CreatorProperties;
import java.util.Map;

/**
 * An immutable client-side representation of Creator.
 */
public interface Creator {
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
     * Gets the properties property: The Creator resource properties.
     * 
     * @return the properties value.
     */
    CreatorProperties properties();

    /**
     * Gets the systemData property: The system meta data relating to this resource.
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
     * Gets the inner com.azure.resourcemanager.maps.fluent.models.CreatorInner object.
     * 
     * @return the inner object.
     */
    CreatorInner innerModel();

    /**
     * The entirety of the Creator definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithLocation,
        DefinitionStages.WithParentResource, DefinitionStages.WithProperties, DefinitionStages.WithCreate {
    }

    /**
     * The Creator definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of the Creator definition.
         */
        interface Blank extends WithLocation {
        }

        /**
         * The stage of the Creator definition allowing to specify location.
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
         * The stage of the Creator definition allowing to specify parent resource.
         */
        interface WithParentResource {
            /**
             * Specifies resourceGroupName, accountName.
             * 
             * @param resourceGroupName The name of the resource group. The name is case insensitive.
             * @param accountName The name of the Maps Account.
             * @return the next definition stage.
             */
            WithProperties withExistingAccount(String resourceGroupName, String accountName);
        }

        /**
         * The stage of the Creator definition allowing to specify properties.
         */
        interface WithProperties {
            /**
             * Specifies the properties property: The Creator resource properties..
             * 
             * @param properties The Creator resource properties.
             * @return the next definition stage.
             */
            WithCreate withProperties(CreatorProperties properties);
        }

        /**
         * The stage of the Creator definition which contains all the minimum required properties for the resource to be
         * created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate extends DefinitionStages.WithTags {
            /**
             * Executes the create request.
             * 
             * @return the created resource.
             */
            Creator create();

            /**
             * Executes the create request.
             * 
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            Creator create(Context context);
        }

        /**
         * The stage of the Creator definition allowing to specify tags.
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
    }

    /**
     * Begins update for the Creator resource.
     * 
     * @return the stage of resource update.
     */
    Creator.Update update();

    /**
     * The template for Creator update.
     */
    interface Update extends UpdateStages.WithTags, UpdateStages.WithStorageUnits {
        /**
         * Executes the update request.
         * 
         * @return the updated resource.
         */
        Creator apply();

        /**
         * Executes the update request.
         * 
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        Creator apply(Context context);
    }

    /**
     * The Creator update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the Creator update allowing to specify tags.
         */
        interface WithTags {
            /**
             * Specifies the tags property: Gets or sets a list of key value pairs that describe the resource. These
             * tags can be used in viewing and grouping this resource (across resource groups). A maximum of 15 tags can
             * be provided for a resource. Each tag must have a key no greater than 128 characters and value no greater
             * than 256 characters..
             * 
             * @param tags Gets or sets a list of key value pairs that describe the resource. These tags can be used in
             * viewing and grouping this resource (across resource groups). A maximum of 15 tags can be provided for a
             * resource. Each tag must have a key no greater than 128 characters and value no greater than 256
             * characters.
             * @return the next definition stage.
             */
            Update withTags(Map<String, String> tags);
        }

        /**
         * The stage of the Creator update allowing to specify storageUnits.
         */
        interface WithStorageUnits {
            /**
             * Specifies the storageUnits property: The storage units to be allocated. Integer values from 1 to 100,
             * inclusive..
             * 
             * @param storageUnits The storage units to be allocated. Integer values from 1 to 100, inclusive.
             * @return the next definition stage.
             */
            Update withStorageUnits(int storageUnits);
        }
    }

    /**
     * Refreshes the resource to sync with Azure.
     * 
     * @return the refreshed resource.
     */
    Creator refresh();

    /**
     * Refreshes the resource to sync with Azure.
     * 
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    Creator refresh(Context context);
}
