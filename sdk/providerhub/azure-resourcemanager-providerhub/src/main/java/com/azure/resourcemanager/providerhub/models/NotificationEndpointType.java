// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.providerhub.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * The endpoint type.
 */
public final class NotificationEndpointType extends ExpandableStringEnum<NotificationEndpointType> {
    /**
     * Static value Webhook for NotificationEndpointType.
     */
    public static final NotificationEndpointType WEBHOOK = fromString("Webhook");

    /**
     * Static value Eventhub for NotificationEndpointType.
     */
    public static final NotificationEndpointType EVENTHUB = fromString("Eventhub");

    /**
     * Creates a new instance of NotificationEndpointType value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public NotificationEndpointType() {
    }

    /**
     * Creates or finds a NotificationEndpointType from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding NotificationEndpointType.
     */
    public static NotificationEndpointType fromString(String name) {
        return fromString(name, NotificationEndpointType.class);
    }

    /**
     * Gets known NotificationEndpointType values.
     * 
     * @return known NotificationEndpointType values.
     */
    public static Collection<NotificationEndpointType> values() {
        return values(NotificationEndpointType.class);
    }
}
