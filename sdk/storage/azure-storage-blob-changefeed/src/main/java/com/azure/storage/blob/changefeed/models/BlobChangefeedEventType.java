// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.storage.blob.changefeed.models;

import com.azure.core.util.ExpandableStringEnum;

import java.util.Collection;

/**
 * This class represents the different BlobChangefeedEventTypes.
 */
public final class BlobChangefeedEventType extends ExpandableStringEnum<BlobChangefeedEventType> {

    /**
     * Static value BlobCreated for BlobChangefeedEventType.
     */
    public static final BlobChangefeedEventType BLOB_CREATED = fromString("BlobCreated");

    /**
     * Static value BlobDeleted for BlobChangefeedEventType.
     */
    public static final BlobChangefeedEventType BLOB_DELETED = fromString("BlobDeleted");

    /**
     * Creates a new instance of {@link BlobChangefeedEventType} with no string value.
     *
     * @deprecated Please use {@link #fromString(String)} to create an instance of BlobChangefeedEventType.
     */
    @Deprecated
    public BlobChangefeedEventType() {
    }

    /**
     * Creates or finds a BlobChangefeedEventType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding BlobChangefeedEventType.
     */
    public static BlobChangefeedEventType fromString(String name) {
        return fromString(name, BlobChangefeedEventType.class);
    }

    /**
     * Gets known BlobChangefeedEventType values.
     *
     * @return known BlobChangefeedEventType values.
     */
    public static Collection<BlobChangefeedEventType> values() {
        return values(BlobChangefeedEventType.class);
    }
}
