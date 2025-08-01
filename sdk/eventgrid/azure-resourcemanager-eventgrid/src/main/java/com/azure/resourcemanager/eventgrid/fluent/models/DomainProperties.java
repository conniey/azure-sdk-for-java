// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.eventgrid.models.DataResidencyBoundary;
import com.azure.resourcemanager.eventgrid.models.DomainProvisioningState;
import com.azure.resourcemanager.eventgrid.models.EventTypeInfo;
import com.azure.resourcemanager.eventgrid.models.InboundIpRule;
import com.azure.resourcemanager.eventgrid.models.InputSchema;
import com.azure.resourcemanager.eventgrid.models.InputSchemaMapping;
import com.azure.resourcemanager.eventgrid.models.PublicNetworkAccess;
import com.azure.resourcemanager.eventgrid.models.TlsVersion;
import java.io.IOException;
import java.util.List;

/**
 * Properties of the Event Grid Domain Resource.
 */
@Fluent
public final class DomainProperties implements JsonSerializable<DomainProperties> {
    /*
     * List of private endpoint connections.
     */
    private List<PrivateEndpointConnectionInner> privateEndpointConnections;

    /*
     * Provisioning state of the Event Grid Domain Resource.
     */
    private DomainProvisioningState provisioningState;

    /*
     * Minimum TLS version of the publisher allowed to publish to this domain
     */
    private TlsVersion minimumTlsVersionAllowed;

    /*
     * Endpoint for the Event Grid Domain Resource which is used for publishing the events.
     */
    private String endpoint;

    /*
     * This determines the format that Event Grid should expect for incoming events published to the Event Grid Domain
     * Resource.
     */
    private InputSchema inputSchema;

    /*
     * Event Type Information for the domain. This information is provided by the publisher and can be used by the
     * subscriber to view different types of events that are published.
     */
    private EventTypeInfo eventTypeInfo;

    /*
     * Information about the InputSchemaMapping which specified the info about mapping event payload.
     */
    private InputSchemaMapping inputSchemaMapping;

    /*
     * Metric resource id for the Event Grid Domain Resource.
     */
    private String metricResourceId;

    /*
     * This determines if traffic is allowed over public network. By default it is enabled.
     * You can further restrict to specific IPs by configuring <seealso
     * cref="P:Microsoft.Azure.Events.ResourceProvider.Common.Contracts.DomainProperties.InboundIpRules" />
     */
    private PublicNetworkAccess publicNetworkAccess;

    /*
     * This can be used to restrict traffic from specific IPs instead of all IPs. Note: These are considered only if
     * PublicNetworkAccess is enabled.
     */
    private List<InboundIpRule> inboundIpRules;

    /*
     * This boolean is used to enable or disable local auth. Default value is false. When the property is set to true,
     * only Microsoft Entra ID token will be used to authenticate if user is allowed to publish to the domain.
     */
    private Boolean disableLocalAuth;

    /*
     * This Boolean is used to specify the creation mechanism for 'all' the Event Grid Domain Topics associated with
     * this Event Grid Domain resource.
     * In this context, creation of domain topic can be auto-managed (when true) or self-managed (when false). The
     * default value for this property is true.
     * When this property is null or set to true, Event Grid is responsible of automatically creating the domain topic
     * when the first event subscription is
     * created at the scope of the domain topic. If this property is set to false, then creating the first event
     * subscription will require creating a domain topic
     * by the user. The self-management mode can be used if the user wants full control of when the domain topic is
     * created, while auto-managed mode provides the
     * flexibility to perform less operations and manage fewer resources by the user. Also, note that in auto-managed
     * creation mode, user is allowed to create the
     * domain topic on demand if needed.
     */
    private Boolean autoCreateTopicWithFirstSubscription;

    /*
     * This Boolean is used to specify the deletion mechanism for 'all' the Event Grid Domain Topics associated with
     * this Event Grid Domain resource.
     * In this context, deletion of domain topic can be auto-managed (when true) or self-managed (when false). The
     * default value for this property is true.
     * When this property is set to true, Event Grid is responsible of automatically deleting the domain topic when the
     * last event subscription at the scope
     * of the domain topic is deleted. If this property is set to false, then the user needs to manually delete the
     * domain topic when it is no longer needed
     * (e.g., when last event subscription is deleted and the resource needs to be cleaned up). The self-management mode
     * can be used if the user wants full
     * control of when the domain topic needs to be deleted, while auto-managed mode provides the flexibility to perform
     * less operations and manage fewer
     * resources by the user.
     */
    private Boolean autoDeleteTopicWithLastSubscription;

    /*
     * Data Residency Boundary of the resource.
     */
    private DataResidencyBoundary dataResidencyBoundary;

    /**
     * Creates an instance of DomainProperties class.
     */
    public DomainProperties() {
    }

    /**
     * Get the privateEndpointConnections property: List of private endpoint connections.
     * 
     * @return the privateEndpointConnections value.
     */
    public List<PrivateEndpointConnectionInner> privateEndpointConnections() {
        return this.privateEndpointConnections;
    }

    /**
     * Get the provisioningState property: Provisioning state of the Event Grid Domain Resource.
     * 
     * @return the provisioningState value.
     */
    public DomainProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the minimumTlsVersionAllowed property: Minimum TLS version of the publisher allowed to publish to this
     * domain.
     * 
     * @return the minimumTlsVersionAllowed value.
     */
    public TlsVersion minimumTlsVersionAllowed() {
        return this.minimumTlsVersionAllowed;
    }

    /**
     * Set the minimumTlsVersionAllowed property: Minimum TLS version of the publisher allowed to publish to this
     * domain.
     * 
     * @param minimumTlsVersionAllowed the minimumTlsVersionAllowed value to set.
     * @return the DomainProperties object itself.
     */
    public DomainProperties withMinimumTlsVersionAllowed(TlsVersion minimumTlsVersionAllowed) {
        this.minimumTlsVersionAllowed = minimumTlsVersionAllowed;
        return this;
    }

    /**
     * Get the endpoint property: Endpoint for the Event Grid Domain Resource which is used for publishing the events.
     * 
     * @return the endpoint value.
     */
    public String endpoint() {
        return this.endpoint;
    }

    /**
     * Get the inputSchema property: This determines the format that Event Grid should expect for incoming events
     * published to the Event Grid Domain Resource.
     * 
     * @return the inputSchema value.
     */
    public InputSchema inputSchema() {
        return this.inputSchema;
    }

    /**
     * Set the inputSchema property: This determines the format that Event Grid should expect for incoming events
     * published to the Event Grid Domain Resource.
     * 
     * @param inputSchema the inputSchema value to set.
     * @return the DomainProperties object itself.
     */
    public DomainProperties withInputSchema(InputSchema inputSchema) {
        this.inputSchema = inputSchema;
        return this;
    }

    /**
     * Get the eventTypeInfo property: Event Type Information for the domain. This information is provided by the
     * publisher and can be used by the
     * subscriber to view different types of events that are published.
     * 
     * @return the eventTypeInfo value.
     */
    public EventTypeInfo eventTypeInfo() {
        return this.eventTypeInfo;
    }

    /**
     * Set the eventTypeInfo property: Event Type Information for the domain. This information is provided by the
     * publisher and can be used by the
     * subscriber to view different types of events that are published.
     * 
     * @param eventTypeInfo the eventTypeInfo value to set.
     * @return the DomainProperties object itself.
     */
    public DomainProperties withEventTypeInfo(EventTypeInfo eventTypeInfo) {
        this.eventTypeInfo = eventTypeInfo;
        return this;
    }

    /**
     * Get the inputSchemaMapping property: Information about the InputSchemaMapping which specified the info about
     * mapping event payload.
     * 
     * @return the inputSchemaMapping value.
     */
    public InputSchemaMapping inputSchemaMapping() {
        return this.inputSchemaMapping;
    }

    /**
     * Set the inputSchemaMapping property: Information about the InputSchemaMapping which specified the info about
     * mapping event payload.
     * 
     * @param inputSchemaMapping the inputSchemaMapping value to set.
     * @return the DomainProperties object itself.
     */
    public DomainProperties withInputSchemaMapping(InputSchemaMapping inputSchemaMapping) {
        this.inputSchemaMapping = inputSchemaMapping;
        return this;
    }

    /**
     * Get the metricResourceId property: Metric resource id for the Event Grid Domain Resource.
     * 
     * @return the metricResourceId value.
     */
    public String metricResourceId() {
        return this.metricResourceId;
    }

    /**
     * Get the publicNetworkAccess property: This determines if traffic is allowed over public network. By default it is
     * enabled.
     * You can further restrict to specific IPs by configuring &lt;seealso
     * cref="P:Microsoft.Azure.Events.ResourceProvider.Common.Contracts.DomainProperties.InboundIpRules" /&gt;.
     * 
     * @return the publicNetworkAccess value.
     */
    public PublicNetworkAccess publicNetworkAccess() {
        return this.publicNetworkAccess;
    }

    /**
     * Set the publicNetworkAccess property: This determines if traffic is allowed over public network. By default it is
     * enabled.
     * You can further restrict to specific IPs by configuring &lt;seealso
     * cref="P:Microsoft.Azure.Events.ResourceProvider.Common.Contracts.DomainProperties.InboundIpRules" /&gt;.
     * 
     * @param publicNetworkAccess the publicNetworkAccess value to set.
     * @return the DomainProperties object itself.
     */
    public DomainProperties withPublicNetworkAccess(PublicNetworkAccess publicNetworkAccess) {
        this.publicNetworkAccess = publicNetworkAccess;
        return this;
    }

    /**
     * Get the inboundIpRules property: This can be used to restrict traffic from specific IPs instead of all IPs. Note:
     * These are considered only if PublicNetworkAccess is enabled.
     * 
     * @return the inboundIpRules value.
     */
    public List<InboundIpRule> inboundIpRules() {
        return this.inboundIpRules;
    }

    /**
     * Set the inboundIpRules property: This can be used to restrict traffic from specific IPs instead of all IPs. Note:
     * These are considered only if PublicNetworkAccess is enabled.
     * 
     * @param inboundIpRules the inboundIpRules value to set.
     * @return the DomainProperties object itself.
     */
    public DomainProperties withInboundIpRules(List<InboundIpRule> inboundIpRules) {
        this.inboundIpRules = inboundIpRules;
        return this;
    }

    /**
     * Get the disableLocalAuth property: This boolean is used to enable or disable local auth. Default value is false.
     * When the property is set to true, only Microsoft Entra ID token will be used to authenticate if user is allowed
     * to publish to the domain.
     * 
     * @return the disableLocalAuth value.
     */
    public Boolean disableLocalAuth() {
        return this.disableLocalAuth;
    }

    /**
     * Set the disableLocalAuth property: This boolean is used to enable or disable local auth. Default value is false.
     * When the property is set to true, only Microsoft Entra ID token will be used to authenticate if user is allowed
     * to publish to the domain.
     * 
     * @param disableLocalAuth the disableLocalAuth value to set.
     * @return the DomainProperties object itself.
     */
    public DomainProperties withDisableLocalAuth(Boolean disableLocalAuth) {
        this.disableLocalAuth = disableLocalAuth;
        return this;
    }

    /**
     * Get the autoCreateTopicWithFirstSubscription property: This Boolean is used to specify the creation mechanism for
     * 'all' the Event Grid Domain Topics associated with this Event Grid Domain resource.
     * In this context, creation of domain topic can be auto-managed (when true) or self-managed (when false). The
     * default value for this property is true.
     * When this property is null or set to true, Event Grid is responsible of automatically creating the domain topic
     * when the first event subscription is
     * created at the scope of the domain topic. If this property is set to false, then creating the first event
     * subscription will require creating a domain topic
     * by the user. The self-management mode can be used if the user wants full control of when the domain topic is
     * created, while auto-managed mode provides the
     * flexibility to perform less operations and manage fewer resources by the user. Also, note that in auto-managed
     * creation mode, user is allowed to create the
     * domain topic on demand if needed.
     * 
     * @return the autoCreateTopicWithFirstSubscription value.
     */
    public Boolean autoCreateTopicWithFirstSubscription() {
        return this.autoCreateTopicWithFirstSubscription;
    }

    /**
     * Set the autoCreateTopicWithFirstSubscription property: This Boolean is used to specify the creation mechanism for
     * 'all' the Event Grid Domain Topics associated with this Event Grid Domain resource.
     * In this context, creation of domain topic can be auto-managed (when true) or self-managed (when false). The
     * default value for this property is true.
     * When this property is null or set to true, Event Grid is responsible of automatically creating the domain topic
     * when the first event subscription is
     * created at the scope of the domain topic. If this property is set to false, then creating the first event
     * subscription will require creating a domain topic
     * by the user. The self-management mode can be used if the user wants full control of when the domain topic is
     * created, while auto-managed mode provides the
     * flexibility to perform less operations and manage fewer resources by the user. Also, note that in auto-managed
     * creation mode, user is allowed to create the
     * domain topic on demand if needed.
     * 
     * @param autoCreateTopicWithFirstSubscription the autoCreateTopicWithFirstSubscription value to set.
     * @return the DomainProperties object itself.
     */
    public DomainProperties withAutoCreateTopicWithFirstSubscription(Boolean autoCreateTopicWithFirstSubscription) {
        this.autoCreateTopicWithFirstSubscription = autoCreateTopicWithFirstSubscription;
        return this;
    }

    /**
     * Get the autoDeleteTopicWithLastSubscription property: This Boolean is used to specify the deletion mechanism for
     * 'all' the Event Grid Domain Topics associated with this Event Grid Domain resource.
     * In this context, deletion of domain topic can be auto-managed (when true) or self-managed (when false). The
     * default value for this property is true.
     * When this property is set to true, Event Grid is responsible of automatically deleting the domain topic when the
     * last event subscription at the scope
     * of the domain topic is deleted. If this property is set to false, then the user needs to manually delete the
     * domain topic when it is no longer needed
     * (e.g., when last event subscription is deleted and the resource needs to be cleaned up). The self-management mode
     * can be used if the user wants full
     * control of when the domain topic needs to be deleted, while auto-managed mode provides the flexibility to perform
     * less operations and manage fewer
     * resources by the user.
     * 
     * @return the autoDeleteTopicWithLastSubscription value.
     */
    public Boolean autoDeleteTopicWithLastSubscription() {
        return this.autoDeleteTopicWithLastSubscription;
    }

    /**
     * Set the autoDeleteTopicWithLastSubscription property: This Boolean is used to specify the deletion mechanism for
     * 'all' the Event Grid Domain Topics associated with this Event Grid Domain resource.
     * In this context, deletion of domain topic can be auto-managed (when true) or self-managed (when false). The
     * default value for this property is true.
     * When this property is set to true, Event Grid is responsible of automatically deleting the domain topic when the
     * last event subscription at the scope
     * of the domain topic is deleted. If this property is set to false, then the user needs to manually delete the
     * domain topic when it is no longer needed
     * (e.g., when last event subscription is deleted and the resource needs to be cleaned up). The self-management mode
     * can be used if the user wants full
     * control of when the domain topic needs to be deleted, while auto-managed mode provides the flexibility to perform
     * less operations and manage fewer
     * resources by the user.
     * 
     * @param autoDeleteTopicWithLastSubscription the autoDeleteTopicWithLastSubscription value to set.
     * @return the DomainProperties object itself.
     */
    public DomainProperties withAutoDeleteTopicWithLastSubscription(Boolean autoDeleteTopicWithLastSubscription) {
        this.autoDeleteTopicWithLastSubscription = autoDeleteTopicWithLastSubscription;
        return this;
    }

    /**
     * Get the dataResidencyBoundary property: Data Residency Boundary of the resource.
     * 
     * @return the dataResidencyBoundary value.
     */
    public DataResidencyBoundary dataResidencyBoundary() {
        return this.dataResidencyBoundary;
    }

    /**
     * Set the dataResidencyBoundary property: Data Residency Boundary of the resource.
     * 
     * @param dataResidencyBoundary the dataResidencyBoundary value to set.
     * @return the DomainProperties object itself.
     */
    public DomainProperties withDataResidencyBoundary(DataResidencyBoundary dataResidencyBoundary) {
        this.dataResidencyBoundary = dataResidencyBoundary;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (privateEndpointConnections() != null) {
            privateEndpointConnections().forEach(e -> e.validate());
        }
        if (eventTypeInfo() != null) {
            eventTypeInfo().validate();
        }
        if (inputSchemaMapping() != null) {
            inputSchemaMapping().validate();
        }
        if (inboundIpRules() != null) {
            inboundIpRules().forEach(e -> e.validate());
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("minimumTlsVersionAllowed",
            this.minimumTlsVersionAllowed == null ? null : this.minimumTlsVersionAllowed.toString());
        jsonWriter.writeStringField("inputSchema", this.inputSchema == null ? null : this.inputSchema.toString());
        jsonWriter.writeJsonField("eventTypeInfo", this.eventTypeInfo);
        jsonWriter.writeJsonField("inputSchemaMapping", this.inputSchemaMapping);
        jsonWriter.writeStringField("publicNetworkAccess",
            this.publicNetworkAccess == null ? null : this.publicNetworkAccess.toString());
        jsonWriter.writeArrayField("inboundIpRules", this.inboundIpRules,
            (writer, element) -> writer.writeJson(element));
        jsonWriter.writeBooleanField("disableLocalAuth", this.disableLocalAuth);
        jsonWriter.writeBooleanField("autoCreateTopicWithFirstSubscription", this.autoCreateTopicWithFirstSubscription);
        jsonWriter.writeBooleanField("autoDeleteTopicWithLastSubscription", this.autoDeleteTopicWithLastSubscription);
        jsonWriter.writeStringField("dataResidencyBoundary",
            this.dataResidencyBoundary == null ? null : this.dataResidencyBoundary.toString());
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of DomainProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of DomainProperties if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the DomainProperties.
     */
    public static DomainProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            DomainProperties deserializedDomainProperties = new DomainProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("privateEndpointConnections".equals(fieldName)) {
                    List<PrivateEndpointConnectionInner> privateEndpointConnections
                        = reader.readArray(reader1 -> PrivateEndpointConnectionInner.fromJson(reader1));
                    deserializedDomainProperties.privateEndpointConnections = privateEndpointConnections;
                } else if ("provisioningState".equals(fieldName)) {
                    deserializedDomainProperties.provisioningState
                        = DomainProvisioningState.fromString(reader.getString());
                } else if ("minimumTlsVersionAllowed".equals(fieldName)) {
                    deserializedDomainProperties.minimumTlsVersionAllowed = TlsVersion.fromString(reader.getString());
                } else if ("endpoint".equals(fieldName)) {
                    deserializedDomainProperties.endpoint = reader.getString();
                } else if ("inputSchema".equals(fieldName)) {
                    deserializedDomainProperties.inputSchema = InputSchema.fromString(reader.getString());
                } else if ("eventTypeInfo".equals(fieldName)) {
                    deserializedDomainProperties.eventTypeInfo = EventTypeInfo.fromJson(reader);
                } else if ("inputSchemaMapping".equals(fieldName)) {
                    deserializedDomainProperties.inputSchemaMapping = InputSchemaMapping.fromJson(reader);
                } else if ("metricResourceId".equals(fieldName)) {
                    deserializedDomainProperties.metricResourceId = reader.getString();
                } else if ("publicNetworkAccess".equals(fieldName)) {
                    deserializedDomainProperties.publicNetworkAccess
                        = PublicNetworkAccess.fromString(reader.getString());
                } else if ("inboundIpRules".equals(fieldName)) {
                    List<InboundIpRule> inboundIpRules = reader.readArray(reader1 -> InboundIpRule.fromJson(reader1));
                    deserializedDomainProperties.inboundIpRules = inboundIpRules;
                } else if ("disableLocalAuth".equals(fieldName)) {
                    deserializedDomainProperties.disableLocalAuth = reader.getNullable(JsonReader::getBoolean);
                } else if ("autoCreateTopicWithFirstSubscription".equals(fieldName)) {
                    deserializedDomainProperties.autoCreateTopicWithFirstSubscription
                        = reader.getNullable(JsonReader::getBoolean);
                } else if ("autoDeleteTopicWithLastSubscription".equals(fieldName)) {
                    deserializedDomainProperties.autoDeleteTopicWithLastSubscription
                        = reader.getNullable(JsonReader::getBoolean);
                } else if ("dataResidencyBoundary".equals(fieldName)) {
                    deserializedDomainProperties.dataResidencyBoundary
                        = DataResidencyBoundary.fromString(reader.getString());
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedDomainProperties;
        });
    }
}
