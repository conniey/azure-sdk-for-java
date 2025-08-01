// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.providerhub.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * Type of server failure response message.
 */
public final class ServerFailureResponseMessageType extends ExpandableStringEnum<ServerFailureResponseMessageType> {
    /**
     * Static value NotSpecified for ServerFailureResponseMessageType.
     */
    public static final ServerFailureResponseMessageType NOT_SPECIFIED = fromString("NotSpecified");

    /**
     * Static value OutageReporting for ServerFailureResponseMessageType.
     */
    public static final ServerFailureResponseMessageType OUTAGE_REPORTING = fromString("OutageReporting");

    /**
     * Creates a new instance of ServerFailureResponseMessageType value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public ServerFailureResponseMessageType() {
    }

    /**
     * Creates or finds a ServerFailureResponseMessageType from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding ServerFailureResponseMessageType.
     */
    public static ServerFailureResponseMessageType fromString(String name) {
        return fromString(name, ServerFailureResponseMessageType.class);
    }

    /**
     * Gets known ServerFailureResponseMessageType values.
     * 
     * @return known ServerFailureResponseMessageType values.
     */
    public static Collection<ServerFailureResponseMessageType> values() {
        return values(ServerFailureResponseMessageType.class);
    }
}
