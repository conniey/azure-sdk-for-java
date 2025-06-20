// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.networkcloud.models;

import com.azure.core.management.Region;
import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.networkcloud.fluent.models.ConsoleInner;
import java.time.OffsetDateTime;
import java.util.Map;

/**
 * An immutable client-side representation of Console.
 */
public interface Console {
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
     * Gets the etag property: Resource ETag.
     * 
     * @return the etag value.
     */
    String etag();

    /**
     * Gets the extendedLocation property: The extended location of the cluster manager associated with the cluster this
     * virtual machine is created on.
     * 
     * @return the extendedLocation value.
     */
    ExtendedLocation extendedLocation();

    /**
     * Gets the systemData property: Azure Resource Manager metadata containing createdBy and modifiedBy information.
     * 
     * @return the systemData value.
     */
    SystemData systemData();

    /**
     * Gets the detailedStatus property: The more detailed status of the console.
     * 
     * @return the detailedStatus value.
     */
    ConsoleDetailedStatus detailedStatus();

    /**
     * Gets the detailedStatusMessage property: The descriptive message about the current detailed status.
     * 
     * @return the detailedStatusMessage value.
     */
    String detailedStatusMessage();

    /**
     * Gets the enabled property: The indicator of whether the console access is enabled.
     * 
     * @return the enabled value.
     */
    ConsoleEnabled enabled();

    /**
     * Gets the expiration property: The date and time after which the key will be disallowed access.
     * 
     * @return the expiration value.
     */
    OffsetDateTime expiration();

    /**
     * Gets the privateLinkServiceId property: The resource ID of the private link service that is used to provide
     * virtual machine console access.
     * 
     * @return the privateLinkServiceId value.
     */
    String privateLinkServiceId();

    /**
     * Gets the provisioningState property: The provisioning state of the virtual machine console.
     * 
     * @return the provisioningState value.
     */
    ConsoleProvisioningState provisioningState();

    /**
     * Gets the sshPublicKey property: The SSH public key that will be provisioned for user access. The user is expected
     * to have the corresponding SSH private key for logging in.
     * 
     * @return the sshPublicKey value.
     */
    SshPublicKey sshPublicKey();

    /**
     * Gets the virtualMachineAccessId property: The unique identifier for the virtual machine that is used to access
     * the console.
     * 
     * @return the virtualMachineAccessId value.
     */
    String virtualMachineAccessId();

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
     * Gets the inner com.azure.resourcemanager.networkcloud.fluent.models.ConsoleInner object.
     * 
     * @return the inner object.
     */
    ConsoleInner innerModel();

    /**
     * The entirety of the Console definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithLocation,
        DefinitionStages.WithParentResource, DefinitionStages.WithExtendedLocation, DefinitionStages.WithEnabled,
        DefinitionStages.WithSshPublicKey, DefinitionStages.WithCreate {
    }

    /**
     * The Console definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of the Console definition.
         */
        interface Blank extends WithLocation {
        }

        /**
         * The stage of the Console definition allowing to specify location.
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
         * The stage of the Console definition allowing to specify parent resource.
         */
        interface WithParentResource {
            /**
             * Specifies resourceGroupName, virtualMachineName.
             * 
             * @param resourceGroupName The name of the resource group. The name is case insensitive.
             * @param virtualMachineName The name of the virtual machine.
             * @return the next definition stage.
             */
            WithExtendedLocation withExistingVirtualMachine(String resourceGroupName, String virtualMachineName);
        }

        /**
         * The stage of the Console definition allowing to specify extendedLocation.
         */
        interface WithExtendedLocation {
            /**
             * Specifies the extendedLocation property: The extended location of the cluster manager associated with the
             * cluster this virtual machine is created on..
             * 
             * @param extendedLocation The extended location of the cluster manager associated with the cluster this
             * virtual machine is created on.
             * @return the next definition stage.
             */
            WithEnabled withExtendedLocation(ExtendedLocation extendedLocation);
        }

        /**
         * The stage of the Console definition allowing to specify enabled.
         */
        interface WithEnabled {
            /**
             * Specifies the enabled property: The indicator of whether the console access is enabled..
             * 
             * @param enabled The indicator of whether the console access is enabled.
             * @return the next definition stage.
             */
            WithSshPublicKey withEnabled(ConsoleEnabled enabled);
        }

        /**
         * The stage of the Console definition allowing to specify sshPublicKey.
         */
        interface WithSshPublicKey {
            /**
             * Specifies the sshPublicKey property: The SSH public key that will be provisioned for user access. The
             * user is expected to have the corresponding SSH private key for logging in..
             * 
             * @param sshPublicKey The SSH public key that will be provisioned for user access. The user is expected to
             * have the corresponding SSH private key for logging in.
             * @return the next definition stage.
             */
            WithCreate withSshPublicKey(SshPublicKey sshPublicKey);
        }

        /**
         * The stage of the Console definition which contains all the minimum required properties for the resource to be
         * created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate extends DefinitionStages.WithTags, DefinitionStages.WithExpiration,
            DefinitionStages.WithIfMatch, DefinitionStages.WithIfNoneMatch {
            /**
             * Executes the create request.
             * 
             * @return the created resource.
             */
            Console create();

            /**
             * Executes the create request.
             * 
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            Console create(Context context);
        }

        /**
         * The stage of the Console definition allowing to specify tags.
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
         * The stage of the Console definition allowing to specify expiration.
         */
        interface WithExpiration {
            /**
             * Specifies the expiration property: The date and time after which the key will be disallowed access..
             * 
             * @param expiration The date and time after which the key will be disallowed access.
             * @return the next definition stage.
             */
            WithCreate withExpiration(OffsetDateTime expiration);
        }

        /**
         * The stage of the Console definition allowing to specify ifMatch.
         */
        interface WithIfMatch {
            /**
             * Specifies the ifMatch property: The ETag of the transformation. Omit this value to always overwrite the
             * current resource. Specify the last-seen ETag value to prevent accidentally overwriting concurrent
             * changes..
             * 
             * @param ifMatch The ETag of the transformation. Omit this value to always overwrite the current resource.
             * Specify the last-seen ETag value to prevent accidentally overwriting concurrent changes.
             * @return the next definition stage.
             */
            WithCreate withIfMatch(String ifMatch);
        }

        /**
         * The stage of the Console definition allowing to specify ifNoneMatch.
         */
        interface WithIfNoneMatch {
            /**
             * Specifies the ifNoneMatch property: Set to '*' to allow a new record set to be created, but to prevent
             * updating an existing resource. Other values will result in error from server as they are not supported..
             * 
             * @param ifNoneMatch Set to '*' to allow a new record set to be created, but to prevent updating an
             * existing resource. Other values will result in error from server as they are not supported.
             * @return the next definition stage.
             */
            WithCreate withIfNoneMatch(String ifNoneMatch);
        }
    }

    /**
     * Begins update for the Console resource.
     * 
     * @return the stage of resource update.
     */
    Console.Update update();

    /**
     * The template for Console update.
     */
    interface Update extends UpdateStages.WithTags, UpdateStages.WithEnabled, UpdateStages.WithExpiration,
        UpdateStages.WithSshPublicKey, UpdateStages.WithIfMatch, UpdateStages.WithIfNoneMatch {
        /**
         * Executes the update request.
         * 
         * @return the updated resource.
         */
        Console apply();

        /**
         * Executes the update request.
         * 
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        Console apply(Context context);
    }

    /**
     * The Console update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the Console update allowing to specify tags.
         */
        interface WithTags {
            /**
             * Specifies the tags property: The Azure resource tags that will replace the existing ones..
             * 
             * @param tags The Azure resource tags that will replace the existing ones.
             * @return the next definition stage.
             */
            Update withTags(Map<String, String> tags);
        }

        /**
         * The stage of the Console update allowing to specify enabled.
         */
        interface WithEnabled {
            /**
             * Specifies the enabled property: The indicator of whether the console access is enabled..
             * 
             * @param enabled The indicator of whether the console access is enabled.
             * @return the next definition stage.
             */
            Update withEnabled(ConsoleEnabled enabled);
        }

        /**
         * The stage of the Console update allowing to specify expiration.
         */
        interface WithExpiration {
            /**
             * Specifies the expiration property: The date and time after which the key will be disallowed access..
             * 
             * @param expiration The date and time after which the key will be disallowed access.
             * @return the next definition stage.
             */
            Update withExpiration(OffsetDateTime expiration);
        }

        /**
         * The stage of the Console update allowing to specify sshPublicKey.
         */
        interface WithSshPublicKey {
            /**
             * Specifies the sshPublicKey property: The SSH public key that will be provisioned for user access. The
             * user is expected to have the corresponding SSH private key for logging in..
             * 
             * @param sshPublicKey The SSH public key that will be provisioned for user access. The user is expected to
             * have the corresponding SSH private key for logging in.
             * @return the next definition stage.
             */
            Update withSshPublicKey(SshPublicKey sshPublicKey);
        }

        /**
         * The stage of the Console update allowing to specify ifMatch.
         */
        interface WithIfMatch {
            /**
             * Specifies the ifMatch property: The ETag of the transformation. Omit this value to always overwrite the
             * current resource. Specify the last-seen ETag value to prevent accidentally overwriting concurrent
             * changes..
             * 
             * @param ifMatch The ETag of the transformation. Omit this value to always overwrite the current resource.
             * Specify the last-seen ETag value to prevent accidentally overwriting concurrent changes.
             * @return the next definition stage.
             */
            Update withIfMatch(String ifMatch);
        }

        /**
         * The stage of the Console update allowing to specify ifNoneMatch.
         */
        interface WithIfNoneMatch {
            /**
             * Specifies the ifNoneMatch property: Set to '*' to allow a new record set to be created, but to prevent
             * updating an existing resource. Other values will result in error from server as they are not supported..
             * 
             * @param ifNoneMatch Set to '*' to allow a new record set to be created, but to prevent updating an
             * existing resource. Other values will result in error from server as they are not supported.
             * @return the next definition stage.
             */
            Update withIfNoneMatch(String ifNoneMatch);
        }
    }

    /**
     * Refreshes the resource to sync with Azure.
     * 
     * @return the refreshed resource.
     */
    Console refresh();

    /**
     * Refreshes the resource to sync with Azure.
     * 
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    Console refresh(Context context);
}
