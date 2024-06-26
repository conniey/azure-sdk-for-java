// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.maps.traffic.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * The icon category associated with this incident. Values are numbers in the range 0-13, with the following meanings --
 * 0: Unknown, 1: Accident, 2: Fog, 3: Dangerous Conditions, 4: Rain, 5: Ice, 6: Jam, 7: Lane Closed, 8: Road Closed, 9:
 * Road Works, 10: Wind, 11: Flooding, 12: Detour, 13: Cluster.
 */
public final class IconCategory extends ExpandableStringEnum<IconCategory> {
    /**
     * Unknown.
     */
    public static final IconCategory UNKNOWN = fromInt(0);

    /**
     * Accident.
     */
    public static final IconCategory ACCIDENT = fromInt(1);

    /**
     * Fog.
     */
    public static final IconCategory FOG = fromInt(2);

    /**
     * Dangerous Conditions.
     */
    public static final IconCategory DANGEROUS_CONDITIONS = fromInt(3);

    /**
     * Rain.
     */
    public static final IconCategory RAIN = fromInt(4);

    /**
     * Ice.
     */
    public static final IconCategory ICE = fromInt(5);

    /**
     * Jam.
     */
    public static final IconCategory JAM = fromInt(6);

    /**
     * Lane Closed.
     */
    public static final IconCategory LANE_CLOSED = fromInt(7);

    /**
     * Road Closed.
     */
    public static final IconCategory ROAD_CLOSED = fromInt(8);

    /**
     * Road Works.
     */
    public static final IconCategory ROAD_WORKS = fromInt(9);

    /**
     * Wind.
     */
    public static final IconCategory WIND = fromInt(10);

    /**
     * Flooding.
     */
    public static final IconCategory FLOODING = fromInt(11);

    /**
     * Detour.
     */
    public static final IconCategory DETOUR = fromInt(12);

    /**
     * Cluster: Returned if a cluster contains incidents with different icon categories.
     */
    public static final IconCategory CLUSTER = fromInt(13);

    /**
     * Broken Down Vehicle.
     */
    public static final IconCategory BROKEN_DOWN_VEHICLE = fromInt(14);

    /**
     * Creates a new instance of IconCategory value.
     * 
     * @deprecated Use the {@link #fromInt(int)} factory method.
     */
    @Deprecated
    public IconCategory() {
    }

    /**
     * Creates or finds a IconCategory from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding IconCategory.
     */
    public static IconCategory fromInt(int name) {
        return fromString(String.valueOf(name), IconCategory.class);
    }

    /**
     * Gets known IconCategory values.
     * 
     * @return known IconCategory values.
     */
    public static Collection<IconCategory> values() {
        return values(IconCategory.class);
    }
}
