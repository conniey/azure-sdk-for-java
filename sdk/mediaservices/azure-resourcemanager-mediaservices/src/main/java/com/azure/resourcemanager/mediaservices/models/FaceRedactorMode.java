// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * This mode provides the ability to choose between the following settings: 1) Analyze - For detection only.This mode
 * generates a metadata JSON file marking appearances of faces throughout the video.Where possible, appearances of the
 * same person are assigned the same ID. 2) Combined - Additionally redacts(blurs) detected faces. 3) Redact - This
 * enables a 2-pass process, allowing for selective redaction of a subset of detected faces.It takes in the metadata
 * file from a prior analyze pass, along with the source video, and a user-selected subset of IDs that require
 * redaction.
 */
public final class FaceRedactorMode extends ExpandableStringEnum<FaceRedactorMode> {
    /**
     * Static value Analyze for FaceRedactorMode.
     */
    public static final FaceRedactorMode ANALYZE = fromString("Analyze");

    /**
     * Static value Redact for FaceRedactorMode.
     */
    public static final FaceRedactorMode REDACT = fromString("Redact");

    /**
     * Static value Combined for FaceRedactorMode.
     */
    public static final FaceRedactorMode COMBINED = fromString("Combined");

    /**
     * Creates a new instance of FaceRedactorMode value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public FaceRedactorMode() {
    }

    /**
     * Creates or finds a FaceRedactorMode from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding FaceRedactorMode.
     */
    public static FaceRedactorMode fromString(String name) {
        return fromString(name, FaceRedactorMode.class);
    }

    /**
     * Gets known FaceRedactorMode values.
     * 
     * @return known FaceRedactorMode values.
     */
    public static Collection<FaceRedactorMode> values() {
        return values(FaceRedactorMode.class);
    }
}
