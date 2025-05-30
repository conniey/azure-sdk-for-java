// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.messaging.eventgrid.systemevents;

import com.azure.core.annotation.Generated;
import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * Call participant role kind.
 */
public final class AcsCallParticipantRoleKind extends ExpandableStringEnum<AcsCallParticipantRoleKind> {
    /**
     * Attendee.
     */
    @Generated
    public static final AcsCallParticipantRoleKind ATTENDEE = fromString("Attendee");

    /**
     * Presenter.
     */
    @Generated
    public static final AcsCallParticipantRoleKind PRESENTER = fromString("Presenter");

    /**
     * Organizer.
     */
    @Generated
    public static final AcsCallParticipantRoleKind ORGANIZER = fromString("Organizer");

    /**
     * Consumer.
     */
    @Generated
    public static final AcsCallParticipantRoleKind CONSUMER = fromString("Consumer");

    /**
     * Collaborator.
     */
    @Generated
    public static final AcsCallParticipantRoleKind COLLABORATOR = fromString("Collaborator");

    /**
     * Creates a new instance of AcsCallParticipantRoleKind value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Generated
    @Deprecated
    public AcsCallParticipantRoleKind() {
    }

    /**
     * Creates or finds a AcsCallParticipantRoleKind from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding AcsCallParticipantRoleKind.
     */
    @Generated
    public static AcsCallParticipantRoleKind fromString(String name) {
        return fromString(name, AcsCallParticipantRoleKind.class);
    }

    /**
     * Gets known AcsCallParticipantRoleKind values.
     * 
     * @return known AcsCallParticipantRoleKind values.
     */
    @Generated
    public static Collection<AcsCallParticipantRoleKind> values() {
        return values(AcsCallParticipantRoleKind.class);
    }
}
