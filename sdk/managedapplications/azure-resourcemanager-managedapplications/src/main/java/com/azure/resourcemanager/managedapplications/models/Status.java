// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managedapplications.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * The JIT status.
 */
public final class Status extends ExpandableStringEnum<Status> {
    /**
     * Static value NotSpecified for Status.
     */
    public static final Status NOT_SPECIFIED = fromString("NotSpecified");

    /**
     * Static value Elevate for Status.
     */
    public static final Status ELEVATE = fromString("Elevate");

    /**
     * Static value Remove for Status.
     */
    public static final Status REMOVE = fromString("Remove");

    /**
     * Creates a new instance of Status value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public Status() {
    }

    /**
     * Creates or finds a Status from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding Status.
     */
    public static Status fromString(String name) {
        return fromString(name, Status.class);
    }

    /**
     * Gets known Status values.
     * 
     * @return known Status values.
     */
    public static Collection<Status> values() {
        return values(Status.class);
    }
}
