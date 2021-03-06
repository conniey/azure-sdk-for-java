// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.billing.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for DocumentSource. */
public final class DocumentSource extends ExpandableStringEnum<DocumentSource> {
    /** Static value DRS for DocumentSource. */
    public static final DocumentSource DRS = fromString("DRS");

    /** Static value ENF for DocumentSource. */
    public static final DocumentSource ENF = fromString("ENF");

    /**
     * Creates or finds a DocumentSource from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding DocumentSource.
     */
    @JsonCreator
    public static DocumentSource fromString(String name) {
        return fromString(name, DocumentSource.class);
    }

    /** @return known DocumentSource values. */
    public static Collection<DocumentSource> values() {
        return values(DocumentSource.class);
    }
}
