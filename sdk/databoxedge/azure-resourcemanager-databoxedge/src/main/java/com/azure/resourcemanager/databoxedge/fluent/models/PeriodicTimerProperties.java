// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databoxedge.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.databoxedge.models.PeriodicTimerSourceInfo;
import com.azure.resourcemanager.databoxedge.models.RoleSinkInfo;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Periodic timer trigger properties. */
@Fluent
public final class PeriodicTimerProperties {
    /*
     * Periodic timer details.
     */
    @JsonProperty(value = "sourceInfo", required = true)
    private PeriodicTimerSourceInfo sourceInfo;

    /*
     * Role Sink information.
     */
    @JsonProperty(value = "sinkInfo", required = true)
    private RoleSinkInfo sinkInfo;

    /*
     * A custom context tag typically used to correlate the trigger against its usage. For example, if a periodic timer
     * trigger is intended for certain specific IoT modules in the device, the tag can be the name or the image URL of
     * the module.
     */
    @JsonProperty(value = "customContextTag")
    private String customContextTag;

    /** Creates an instance of PeriodicTimerProperties class. */
    public PeriodicTimerProperties() {
    }

    /**
     * Get the sourceInfo property: Periodic timer details.
     *
     * @return the sourceInfo value.
     */
    public PeriodicTimerSourceInfo sourceInfo() {
        return this.sourceInfo;
    }

    /**
     * Set the sourceInfo property: Periodic timer details.
     *
     * @param sourceInfo the sourceInfo value to set.
     * @return the PeriodicTimerProperties object itself.
     */
    public PeriodicTimerProperties withSourceInfo(PeriodicTimerSourceInfo sourceInfo) {
        this.sourceInfo = sourceInfo;
        return this;
    }

    /**
     * Get the sinkInfo property: Role Sink information.
     *
     * @return the sinkInfo value.
     */
    public RoleSinkInfo sinkInfo() {
        return this.sinkInfo;
    }

    /**
     * Set the sinkInfo property: Role Sink information.
     *
     * @param sinkInfo the sinkInfo value to set.
     * @return the PeriodicTimerProperties object itself.
     */
    public PeriodicTimerProperties withSinkInfo(RoleSinkInfo sinkInfo) {
        this.sinkInfo = sinkInfo;
        return this;
    }

    /**
     * Get the customContextTag property: A custom context tag typically used to correlate the trigger against its
     * usage. For example, if a periodic timer trigger is intended for certain specific IoT modules in the device, the
     * tag can be the name or the image URL of the module.
     *
     * @return the customContextTag value.
     */
    public String customContextTag() {
        return this.customContextTag;
    }

    /**
     * Set the customContextTag property: A custom context tag typically used to correlate the trigger against its
     * usage. For example, if a periodic timer trigger is intended for certain specific IoT modules in the device, the
     * tag can be the name or the image URL of the module.
     *
     * @param customContextTag the customContextTag value to set.
     * @return the PeriodicTimerProperties object itself.
     */
    public PeriodicTimerProperties withCustomContextTag(String customContextTag) {
        this.customContextTag = customContextTag;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (sourceInfo() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property sourceInfo in model PeriodicTimerProperties"));
        } else {
            sourceInfo().validate();
        }
        if (sinkInfo() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property sinkInfo in model PeriodicTimerProperties"));
        } else {
            sinkInfo().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(PeriodicTimerProperties.class);
}
