// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
package com.azure.resourcemanager.network.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.resources.fluentcore.arm.models.HasName;
import com.azure.resourcemanager.resources.fluentcore.arm.models.HasParent;
import com.azure.resourcemanager.resources.fluentcore.model.HasInnerModel;
import java.util.Map;

/** A client-side representation of the health information of an application gateway backend. */
@Fluent
public interface ApplicationGatewayBackendHealth
    extends HasInnerModel<ApplicationGatewayBackendHealthPool>, HasName, HasParent<ApplicationGateway> {

    /**
     * Gets the application gateway backend address pool that is health information pertains to.
     *
     * @return the application gateway backend address pool that is health information pertains to
     */
    ApplicationGatewayBackend backend();

    /**
     * Gets the health information about each associated backend HTTP settings configuration.
     *
     * @return the health information about each associated backend HTTP settings configuration, indexed by its name
     */
    Map<String, ApplicationGatewayBackendHttpConfigurationHealth> httpConfigurationHealths();
}
