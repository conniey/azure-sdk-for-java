// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.SubResource;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.network.models.LoadDistribution;
import com.azure.resourcemanager.network.models.ProvisioningState;
import com.azure.resourcemanager.network.models.TransportProtocol;
import java.io.IOException;
import java.util.List;

/**
 * A load balancing rule for a load balancer.
 */
@Fluent
public final class LoadBalancingRuleInner extends SubResource {
    /*
     * Properties of load balancer load balancing rule.
     */
    private LoadBalancingRulePropertiesFormat innerProperties;

    /*
     * The name of the resource that is unique within the set of load balancing rules used by the load balancer. This
     * name can be used to access the resource.
     */
    private String name;

    /*
     * A unique read-only string that changes whenever the resource is updated.
     */
    private String etag;

    /*
     * Type of the resource.
     */
    private String type;

    /**
     * Creates an instance of LoadBalancingRuleInner class.
     */
    public LoadBalancingRuleInner() {
    }

    /**
     * Get the innerProperties property: Properties of load balancer load balancing rule.
     * 
     * @return the innerProperties value.
     */
    private LoadBalancingRulePropertiesFormat innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the name property: The name of the resource that is unique within the set of load balancing rules used by the
     * load balancer. This name can be used to access the resource.
     * 
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The name of the resource that is unique within the set of load balancing rules used by the
     * load balancer. This name can be used to access the resource.
     * 
     * @param name the name value to set.
     * @return the LoadBalancingRuleInner object itself.
     */
    public LoadBalancingRuleInner withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the etag property: A unique read-only string that changes whenever the resource is updated.
     * 
     * @return the etag value.
     */
    public String etag() {
        return this.etag;
    }

    /**
     * Get the type property: Type of the resource.
     * 
     * @return the type value.
     */
    public String type() {
        return this.type;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LoadBalancingRuleInner withId(String id) {
        super.withId(id);
        return this;
    }

    /**
     * Get the frontendIpConfiguration property: A reference to frontend IP addresses.
     * 
     * @return the frontendIpConfiguration value.
     */
    public SubResource frontendIpConfiguration() {
        return this.innerProperties() == null ? null : this.innerProperties().frontendIpConfiguration();
    }

    /**
     * Set the frontendIpConfiguration property: A reference to frontend IP addresses.
     * 
     * @param frontendIpConfiguration the frontendIpConfiguration value to set.
     * @return the LoadBalancingRuleInner object itself.
     */
    public LoadBalancingRuleInner withFrontendIpConfiguration(SubResource frontendIpConfiguration) {
        if (this.innerProperties() == null) {
            this.innerProperties = new LoadBalancingRulePropertiesFormat();
        }
        this.innerProperties().withFrontendIpConfiguration(frontendIpConfiguration);
        return this;
    }

    /**
     * Get the backendAddressPool property: A reference to a pool of DIPs. Inbound traffic is randomly load balanced
     * across IPs in the backend IPs.
     * 
     * @return the backendAddressPool value.
     */
    public SubResource backendAddressPool() {
        return this.innerProperties() == null ? null : this.innerProperties().backendAddressPool();
    }

    /**
     * Set the backendAddressPool property: A reference to a pool of DIPs. Inbound traffic is randomly load balanced
     * across IPs in the backend IPs.
     * 
     * @param backendAddressPool the backendAddressPool value to set.
     * @return the LoadBalancingRuleInner object itself.
     */
    public LoadBalancingRuleInner withBackendAddressPool(SubResource backendAddressPool) {
        if (this.innerProperties() == null) {
            this.innerProperties = new LoadBalancingRulePropertiesFormat();
        }
        this.innerProperties().withBackendAddressPool(backendAddressPool);
        return this;
    }

    /**
     * Get the backendAddressPools property: An array of references to pool of DIPs.
     * 
     * @return the backendAddressPools value.
     */
    public List<SubResource> backendAddressPools() {
        return this.innerProperties() == null ? null : this.innerProperties().backendAddressPools();
    }

    /**
     * Set the backendAddressPools property: An array of references to pool of DIPs.
     * 
     * @param backendAddressPools the backendAddressPools value to set.
     * @return the LoadBalancingRuleInner object itself.
     */
    public LoadBalancingRuleInner withBackendAddressPools(List<SubResource> backendAddressPools) {
        if (this.innerProperties() == null) {
            this.innerProperties = new LoadBalancingRulePropertiesFormat();
        }
        this.innerProperties().withBackendAddressPools(backendAddressPools);
        return this;
    }

    /**
     * Get the probe property: The reference to the load balancer probe used by the load balancing rule.
     * 
     * @return the probe value.
     */
    public SubResource probe() {
        return this.innerProperties() == null ? null : this.innerProperties().probe();
    }

    /**
     * Set the probe property: The reference to the load balancer probe used by the load balancing rule.
     * 
     * @param probe the probe value to set.
     * @return the LoadBalancingRuleInner object itself.
     */
    public LoadBalancingRuleInner withProbe(SubResource probe) {
        if (this.innerProperties() == null) {
            this.innerProperties = new LoadBalancingRulePropertiesFormat();
        }
        this.innerProperties().withProbe(probe);
        return this;
    }

    /**
     * Get the protocol property: The reference to the transport protocol used by the load balancing rule.
     * 
     * @return the protocol value.
     */
    public TransportProtocol protocol() {
        return this.innerProperties() == null ? null : this.innerProperties().protocol();
    }

    /**
     * Set the protocol property: The reference to the transport protocol used by the load balancing rule.
     * 
     * @param protocol the protocol value to set.
     * @return the LoadBalancingRuleInner object itself.
     */
    public LoadBalancingRuleInner withProtocol(TransportProtocol protocol) {
        if (this.innerProperties() == null) {
            this.innerProperties = new LoadBalancingRulePropertiesFormat();
        }
        this.innerProperties().withProtocol(protocol);
        return this;
    }

    /**
     * Get the loadDistribution property: The load distribution policy for this rule.
     * 
     * @return the loadDistribution value.
     */
    public LoadDistribution loadDistribution() {
        return this.innerProperties() == null ? null : this.innerProperties().loadDistribution();
    }

    /**
     * Set the loadDistribution property: The load distribution policy for this rule.
     * 
     * @param loadDistribution the loadDistribution value to set.
     * @return the LoadBalancingRuleInner object itself.
     */
    public LoadBalancingRuleInner withLoadDistribution(LoadDistribution loadDistribution) {
        if (this.innerProperties() == null) {
            this.innerProperties = new LoadBalancingRulePropertiesFormat();
        }
        this.innerProperties().withLoadDistribution(loadDistribution);
        return this;
    }

    /**
     * Get the frontendPort property: The port for the external endpoint. Port numbers for each rule must be unique
     * within the Load Balancer. Acceptable values are between 0 and 65534. Note that value 0 enables "Any Port".
     * 
     * @return the frontendPort value.
     */
    public Integer frontendPort() {
        return this.innerProperties() == null ? null : this.innerProperties().frontendPort();
    }

    /**
     * Set the frontendPort property: The port for the external endpoint. Port numbers for each rule must be unique
     * within the Load Balancer. Acceptable values are between 0 and 65534. Note that value 0 enables "Any Port".
     * 
     * @param frontendPort the frontendPort value to set.
     * @return the LoadBalancingRuleInner object itself.
     */
    public LoadBalancingRuleInner withFrontendPort(Integer frontendPort) {
        if (this.innerProperties() == null) {
            this.innerProperties = new LoadBalancingRulePropertiesFormat();
        }
        this.innerProperties().withFrontendPort(frontendPort);
        return this;
    }

    /**
     * Get the backendPort property: The port used for internal connections on the endpoint. Acceptable values are
     * between 0 and 65535. Note that value 0 enables "Any Port".
     * 
     * @return the backendPort value.
     */
    public Integer backendPort() {
        return this.innerProperties() == null ? null : this.innerProperties().backendPort();
    }

    /**
     * Set the backendPort property: The port used for internal connections on the endpoint. Acceptable values are
     * between 0 and 65535. Note that value 0 enables "Any Port".
     * 
     * @param backendPort the backendPort value to set.
     * @return the LoadBalancingRuleInner object itself.
     */
    public LoadBalancingRuleInner withBackendPort(Integer backendPort) {
        if (this.innerProperties() == null) {
            this.innerProperties = new LoadBalancingRulePropertiesFormat();
        }
        this.innerProperties().withBackendPort(backendPort);
        return this;
    }

    /**
     * Get the idleTimeoutInMinutes property: The timeout for the TCP idle connection. The value can be set between 4
     * and 30 minutes. The default value is 4 minutes. This element is only used when the protocol is set to TCP.
     * 
     * @return the idleTimeoutInMinutes value.
     */
    public Integer idleTimeoutInMinutes() {
        return this.innerProperties() == null ? null : this.innerProperties().idleTimeoutInMinutes();
    }

    /**
     * Set the idleTimeoutInMinutes property: The timeout for the TCP idle connection. The value can be set between 4
     * and 30 minutes. The default value is 4 minutes. This element is only used when the protocol is set to TCP.
     * 
     * @param idleTimeoutInMinutes the idleTimeoutInMinutes value to set.
     * @return the LoadBalancingRuleInner object itself.
     */
    public LoadBalancingRuleInner withIdleTimeoutInMinutes(Integer idleTimeoutInMinutes) {
        if (this.innerProperties() == null) {
            this.innerProperties = new LoadBalancingRulePropertiesFormat();
        }
        this.innerProperties().withIdleTimeoutInMinutes(idleTimeoutInMinutes);
        return this;
    }

    /**
     * Get the enableFloatingIp property: Configures a virtual machine's endpoint for the floating IP capability
     * required to configure a SQL AlwaysOn Availability Group. This setting is required when using the SQL AlwaysOn
     * Availability Groups in SQL server. This setting can't be changed after you create the endpoint.
     * 
     * @return the enableFloatingIp value.
     */
    public Boolean enableFloatingIp() {
        return this.innerProperties() == null ? null : this.innerProperties().enableFloatingIp();
    }

    /**
     * Set the enableFloatingIp property: Configures a virtual machine's endpoint for the floating IP capability
     * required to configure a SQL AlwaysOn Availability Group. This setting is required when using the SQL AlwaysOn
     * Availability Groups in SQL server. This setting can't be changed after you create the endpoint.
     * 
     * @param enableFloatingIp the enableFloatingIp value to set.
     * @return the LoadBalancingRuleInner object itself.
     */
    public LoadBalancingRuleInner withEnableFloatingIp(Boolean enableFloatingIp) {
        if (this.innerProperties() == null) {
            this.innerProperties = new LoadBalancingRulePropertiesFormat();
        }
        this.innerProperties().withEnableFloatingIp(enableFloatingIp);
        return this;
    }

    /**
     * Get the enableTcpReset property: Receive bidirectional TCP Reset on TCP flow idle timeout or unexpected
     * connection termination. This element is only used when the protocol is set to TCP.
     * 
     * @return the enableTcpReset value.
     */
    public Boolean enableTcpReset() {
        return this.innerProperties() == null ? null : this.innerProperties().enableTcpReset();
    }

    /**
     * Set the enableTcpReset property: Receive bidirectional TCP Reset on TCP flow idle timeout or unexpected
     * connection termination. This element is only used when the protocol is set to TCP.
     * 
     * @param enableTcpReset the enableTcpReset value to set.
     * @return the LoadBalancingRuleInner object itself.
     */
    public LoadBalancingRuleInner withEnableTcpReset(Boolean enableTcpReset) {
        if (this.innerProperties() == null) {
            this.innerProperties = new LoadBalancingRulePropertiesFormat();
        }
        this.innerProperties().withEnableTcpReset(enableTcpReset);
        return this;
    }

    /**
     * Get the disableOutboundSnat property: Configures SNAT for the VMs in the backend pool to use the publicIP address
     * specified in the frontend of the load balancing rule.
     * 
     * @return the disableOutboundSnat value.
     */
    public Boolean disableOutboundSnat() {
        return this.innerProperties() == null ? null : this.innerProperties().disableOutboundSnat();
    }

    /**
     * Set the disableOutboundSnat property: Configures SNAT for the VMs in the backend pool to use the publicIP address
     * specified in the frontend of the load balancing rule.
     * 
     * @param disableOutboundSnat the disableOutboundSnat value to set.
     * @return the LoadBalancingRuleInner object itself.
     */
    public LoadBalancingRuleInner withDisableOutboundSnat(Boolean disableOutboundSnat) {
        if (this.innerProperties() == null) {
            this.innerProperties = new LoadBalancingRulePropertiesFormat();
        }
        this.innerProperties().withDisableOutboundSnat(disableOutboundSnat);
        return this;
    }

    /**
     * Get the enableConnectionTracking property: Defines whether connections between 2 communicating endpoints can be
     * tracked and associated to the same backend VM over its lifetime when using UDP protocol.
     * 
     * @return the enableConnectionTracking value.
     */
    public Boolean enableConnectionTracking() {
        return this.innerProperties() == null ? null : this.innerProperties().enableConnectionTracking();
    }

    /**
     * Set the enableConnectionTracking property: Defines whether connections between 2 communicating endpoints can be
     * tracked and associated to the same backend VM over its lifetime when using UDP protocol.
     * 
     * @param enableConnectionTracking the enableConnectionTracking value to set.
     * @return the LoadBalancingRuleInner object itself.
     */
    public LoadBalancingRuleInner withEnableConnectionTracking(Boolean enableConnectionTracking) {
        if (this.innerProperties() == null) {
            this.innerProperties = new LoadBalancingRulePropertiesFormat();
        }
        this.innerProperties().withEnableConnectionTracking(enableConnectionTracking);
        return this;
    }

    /**
     * Get the provisioningState property: The provisioning state of the load balancing rule resource.
     * 
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("id", id());
        jsonWriter.writeJsonField("properties", this.innerProperties);
        jsonWriter.writeStringField("name", this.name);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of LoadBalancingRuleInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of LoadBalancingRuleInner if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IOException If an error occurs while reading the LoadBalancingRuleInner.
     */
    public static LoadBalancingRuleInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            LoadBalancingRuleInner deserializedLoadBalancingRuleInner = new LoadBalancingRuleInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedLoadBalancingRuleInner.withId(reader.getString());
                } else if ("properties".equals(fieldName)) {
                    deserializedLoadBalancingRuleInner.innerProperties
                        = LoadBalancingRulePropertiesFormat.fromJson(reader);
                } else if ("name".equals(fieldName)) {
                    deserializedLoadBalancingRuleInner.name = reader.getString();
                } else if ("etag".equals(fieldName)) {
                    deserializedLoadBalancingRuleInner.etag = reader.getString();
                } else if ("type".equals(fieldName)) {
                    deserializedLoadBalancingRuleInner.type = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedLoadBalancingRuleInner;
        });
    }
}
