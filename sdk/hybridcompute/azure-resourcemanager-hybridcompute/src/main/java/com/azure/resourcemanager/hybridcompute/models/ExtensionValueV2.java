// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridcompute.models;

import com.azure.core.management.SystemData;
import com.azure.resourcemanager.hybridcompute.fluent.models.ExtensionValueV2Inner;
import java.util.List;

/**
 * An immutable client-side representation of ExtensionValueV2.
 */
public interface ExtensionValueV2 {
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
     * Gets the extensionUris property: A list of locations where the extension packages can be found.
     * 
     * @return the extensionUris value.
     */
    List<String> extensionUris();

    /**
     * Gets the extensionSignatureUri property: Location of the signature files for the extension.
     * 
     * @return the extensionSignatureUri value.
     */
    String extensionSignatureUri();

    /**
     * Gets the operatingSystem property: The operating system (Windows, Linux, etc.) this extension supports.
     * 
     * @return the operatingSystem value.
     */
    String operatingSystem();

    /**
     * Gets the architecture property: Architectures (x64, arms64, etc.) that this extension supports.
     * 
     * @return the architecture value.
     */
    List<String> architecture();

    /**
     * Gets the version property: The version of the Extension being received.
     * 
     * @return the version value.
     */
    String version();

    /**
     * Gets the extensionType property: The type of the Extension being received.
     * 
     * @return the extensionType value.
     */
    String extensionType();

    /**
     * Gets the publisher property: The publisher of the Extension being received.
     * 
     * @return the publisher value.
     */
    String publisher();

    /**
     * Gets the inner com.azure.resourcemanager.hybridcompute.fluent.models.ExtensionValueV2Inner object.
     * 
     * @return the inner object.
     */
    ExtensionValueV2Inner innerModel();
}
