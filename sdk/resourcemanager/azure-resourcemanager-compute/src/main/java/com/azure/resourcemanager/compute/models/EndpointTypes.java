// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.models;

/**
 * This property allows you to specify the Endpoint type for which this profile is defining the access control for.
 * Possible values are: 'WireServer' or 'IMDS'.
 */
public enum EndpointTypes {
    /**
     * Enum value WireServer.
     */
    WIRE_SERVER("WireServer"),

    /**
     * Enum value IMDS.
     */
    IMDS("IMDS");

    /**
     * The actual serialized value for a EndpointTypes instance.
     */
    private final String value;

    EndpointTypes(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a EndpointTypes instance.
     * 
     * @param value the serialized value to parse.
     * @return the parsed EndpointTypes object, or null if unable to parse.
     */
    public static EndpointTypes fromString(String value) {
        if (value == null) {
            return null;
        }
        EndpointTypes[] items = EndpointTypes.values();
        for (EndpointTypes item : items) {
            if (item.toString().equalsIgnoreCase(value)) {
                return item;
            }
        }
        return null;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String toString() {
        return this.value;
    }
}
