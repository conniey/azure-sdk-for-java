// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.confidentialledger.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * Object representing LanguageRuntime for Manged CCF.
 */
public final class LanguageRuntime extends ExpandableStringEnum<LanguageRuntime> {
    /**
     * Static value CPP for LanguageRuntime.
     */
    public static final LanguageRuntime CPP = fromString("CPP");

    /**
     * Static value JS for LanguageRuntime.
     */
    public static final LanguageRuntime JS = fromString("JS");

    /**
     * Creates a new instance of LanguageRuntime value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public LanguageRuntime() {
    }

    /**
     * Creates or finds a LanguageRuntime from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding LanguageRuntime.
     */
    public static LanguageRuntime fromString(String name) {
        return fromString(name, LanguageRuntime.class);
    }

    /**
     * Gets known LanguageRuntime values.
     * 
     * @return known LanguageRuntime values.
     */
    public static Collection<LanguageRuntime> values() {
        return values(LanguageRuntime.class);
    }
}
