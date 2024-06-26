// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.fluent.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The properties of an IPv6 server firewall rule. */
@Fluent
public final class IPv6ServerFirewallRuleProperties {
    /*
     * The start IP address of the firewall rule. Must be IPv6 format.
     */
    @JsonProperty(value = "startIPv6Address")
    private String startIPv6Address;

    /*
     * The end IP address of the firewall rule. Must be IPv6 format. Must be greater than or equal to startIpAddress.
     */
    @JsonProperty(value = "endIPv6Address")
    private String endIPv6Address;

    /** Creates an instance of IPv6ServerFirewallRuleProperties class. */
    public IPv6ServerFirewallRuleProperties() {
    }

    /**
     * Get the startIPv6Address property: The start IP address of the firewall rule. Must be IPv6 format.
     *
     * @return the startIPv6Address value.
     */
    public String startIPv6Address() {
        return this.startIPv6Address;
    }

    /**
     * Set the startIPv6Address property: The start IP address of the firewall rule. Must be IPv6 format.
     *
     * @param startIPv6Address the startIPv6Address value to set.
     * @return the IPv6ServerFirewallRuleProperties object itself.
     */
    public IPv6ServerFirewallRuleProperties withStartIPv6Address(String startIPv6Address) {
        this.startIPv6Address = startIPv6Address;
        return this;
    }

    /**
     * Get the endIPv6Address property: The end IP address of the firewall rule. Must be IPv6 format. Must be greater
     * than or equal to startIpAddress.
     *
     * @return the endIPv6Address value.
     */
    public String endIPv6Address() {
        return this.endIPv6Address;
    }

    /**
     * Set the endIPv6Address property: The end IP address of the firewall rule. Must be IPv6 format. Must be greater
     * than or equal to startIpAddress.
     *
     * @param endIPv6Address the endIPv6Address value to set.
     * @return the IPv6ServerFirewallRuleProperties object itself.
     */
    public IPv6ServerFirewallRuleProperties withEndIPv6Address(String endIPv6Address) {
        this.endIPv6Address = endIPv6Address;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
