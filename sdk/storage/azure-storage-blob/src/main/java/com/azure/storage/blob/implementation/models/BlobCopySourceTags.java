// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.storage.blob.implementation.models;

/** Defines values for BlobCopySourceTags. */
public enum BlobCopySourceTags {
    /** Enum value REPLACE. */
    REPLACE("REPLACE"),

    /** Enum value COPY. */
    COPY("COPY");

    /** The actual serialized value for a BlobCopySourceTags instance. */
    private final String value;

    BlobCopySourceTags(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a BlobCopySourceTags instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed BlobCopySourceTags object, or null if unable to parse.
     */
    public static BlobCopySourceTags fromString(String value) {
        BlobCopySourceTags[] items = BlobCopySourceTags.values();
        for (BlobCopySourceTags item : items) {
            if (item.toString().equalsIgnoreCase(value)) {
                return item;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return this.value;
    }
}
