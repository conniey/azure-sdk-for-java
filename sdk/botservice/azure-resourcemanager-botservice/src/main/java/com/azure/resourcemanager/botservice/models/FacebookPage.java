// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.botservice.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;

/** A Facebook page for Facebook channel registration. */
@Fluent
public final class FacebookPage {
    /*
     * Page id
     */
    @JsonProperty(value = "id", required = true)
    private String id;

    /*
     * Facebook application access token. Value only returned through POST to
     * the action Channel List API, otherwise empty.
     */
    @JsonProperty(value = "accessToken")
    private String accessToken;

    /**
     * Get the id property: Page id.
     *
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id property: Page id.
     *
     * @param id the id value to set.
     * @return the FacebookPage object itself.
     */
    public FacebookPage withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the accessToken property: Facebook application access token. Value only returned through POST to the action
     * Channel List API, otherwise empty.
     *
     * @return the accessToken value.
     */
    public String accessToken() {
        return this.accessToken;
    }

    /**
     * Set the accessToken property: Facebook application access token. Value only returned through POST to the action
     * Channel List API, otherwise empty.
     *
     * @param accessToken the accessToken value to set.
     * @return the FacebookPage object itself.
     */
    public FacebookPage withAccessToken(String accessToken) {
        this.accessToken = accessToken;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (id() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property id in model FacebookPage"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(FacebookPage.class);
}
