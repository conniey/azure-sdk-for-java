// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.ai.translation.document.models;

import com.azure.core.annotation.Generated;
import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * Format types.
 */
public final class FileFormatType extends ExpandableStringEnum<FileFormatType> {

    /**
     * Document type file format.
     */
    @Generated
    public static final FileFormatType DOCUMENT = fromString("document");

    /**
     * Glossary type file format.
     */
    @Generated
    public static final FileFormatType GLOSSARY = fromString("glossary");

    /**
     * Creates a new instance of FileFormatType value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Generated
    @Deprecated
    public FileFormatType() {
    }

    /**
     * Creates or finds a FileFormatType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding FileFormatType.
     */
    @Generated
    public static FileFormatType fromString(String name) {
        return fromString(name, FileFormatType.class);
    }

    /**
     * Gets known FileFormatType values.
     *
     * @return known FileFormatType values.
     */
    @Generated
    public static Collection<FileFormatType> values() {
        return values(FileFormatType.class);
    }
}
