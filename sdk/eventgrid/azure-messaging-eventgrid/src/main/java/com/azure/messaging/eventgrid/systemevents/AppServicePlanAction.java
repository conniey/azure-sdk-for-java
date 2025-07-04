// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.
package com.azure.messaging.eventgrid.systemevents;

import com.azure.core.annotation.Generated;
import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * Type of action on the app service plan.
 * 
 * @deprecated This class is deprecated and may be removed in future releases. System events are now available in the
 * azure-messaging-eventgrid-systemevents package.
 */
@Deprecated
public final class AppServicePlanAction extends ExpandableStringEnum<AppServicePlanAction> {

    /**
     * App Service plan is being updated.
     */
    @Generated
    public static final AppServicePlanAction UPDATED = fromString("Updated");

    /**
     * Creates a new instance of AppServicePlanAction value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Generated
    @Deprecated
    public AppServicePlanAction() {
    }

    /**
     * Creates or finds a AppServicePlanAction from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding AppServicePlanAction.
     */
    @Generated
    public static AppServicePlanAction fromString(String name) {
        return fromString(name, AppServicePlanAction.class);
    }

    /**
     * Gets known AppServicePlanAction values.
     *
     * @return known AppServicePlanAction values.
     */
    @Generated
    public static Collection<AppServicePlanAction> values() {
        return values(AppServicePlanAction.class);
    }
}
