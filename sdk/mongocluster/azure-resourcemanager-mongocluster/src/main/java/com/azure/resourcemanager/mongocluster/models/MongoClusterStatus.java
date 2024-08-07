// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.mongocluster.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * The status of the Mongo cluster resource.
 */
public final class MongoClusterStatus extends ExpandableStringEnum<MongoClusterStatus> {
    /**
     * Static value Ready for MongoClusterStatus.
     */
    public static final MongoClusterStatus READY = fromString("Ready");

    /**
     * Static value Provisioning for MongoClusterStatus.
     */
    public static final MongoClusterStatus PROVISIONING = fromString("Provisioning");

    /**
     * Static value Updating for MongoClusterStatus.
     */
    public static final MongoClusterStatus UPDATING = fromString("Updating");

    /**
     * Static value Starting for MongoClusterStatus.
     */
    public static final MongoClusterStatus STARTING = fromString("Starting");

    /**
     * Static value Stopping for MongoClusterStatus.
     */
    public static final MongoClusterStatus STOPPING = fromString("Stopping");

    /**
     * Static value Stopped for MongoClusterStatus.
     */
    public static final MongoClusterStatus STOPPED = fromString("Stopped");

    /**
     * Static value Dropping for MongoClusterStatus.
     */
    public static final MongoClusterStatus DROPPING = fromString("Dropping");

    /**
     * Creates a new instance of MongoClusterStatus value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public MongoClusterStatus() {
    }

    /**
     * Creates or finds a MongoClusterStatus from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding MongoClusterStatus.
     */
    public static MongoClusterStatus fromString(String name) {
        return fromString(name, MongoClusterStatus.class);
    }

    /**
     * Gets known MongoClusterStatus values.
     * 
     * @return known MongoClusterStatus values.
     */
    public static Collection<MongoClusterStatus> values() {
        return values(MongoClusterStatus.class);
    }
}
