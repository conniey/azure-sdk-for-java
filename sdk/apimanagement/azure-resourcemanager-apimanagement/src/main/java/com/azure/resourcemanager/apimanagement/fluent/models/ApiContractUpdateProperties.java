// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.apimanagement.models.ApiContactInformation;
import com.azure.resourcemanager.apimanagement.models.ApiEntityBaseContract;
import com.azure.resourcemanager.apimanagement.models.ApiLicenseInformation;
import com.azure.resourcemanager.apimanagement.models.ApiType;
import com.azure.resourcemanager.apimanagement.models.AuthenticationSettingsContract;
import com.azure.resourcemanager.apimanagement.models.Protocol;
import com.azure.resourcemanager.apimanagement.models.SubscriptionKeyParameterNamesContract;
import java.io.IOException;
import java.util.List;

/**
 * API update contract properties.
 */
@Fluent
public final class ApiContractUpdateProperties extends ApiEntityBaseContract {
    /*
     * API name.
     */
    private String displayName;

    /*
     * Absolute URL of the backend service implementing this API.
     */
    private String serviceUrl;

    /*
     * Relative URL uniquely identifying this API and all of its resource paths within the API Management service
     * instance. It is appended to the API endpoint base URL specified during the service instance creation to form a
     * public URL for this API.
     */
    private String path;

    /*
     * Describes on which protocols the operations in this API can be invoked.
     */
    private List<Protocol> protocols;

    /*
     * Indicates if API revision is accessible via the gateway.
     */
    private Boolean isOnline;

    /**
     * Creates an instance of ApiContractUpdateProperties class.
     */
    public ApiContractUpdateProperties() {
    }

    /**
     * Get the displayName property: API name.
     * 
     * @return the displayName value.
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Set the displayName property: API name.
     * 
     * @param displayName the displayName value to set.
     * @return the ApiContractUpdateProperties object itself.
     */
    public ApiContractUpdateProperties withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Get the serviceUrl property: Absolute URL of the backend service implementing this API.
     * 
     * @return the serviceUrl value.
     */
    public String serviceUrl() {
        return this.serviceUrl;
    }

    /**
     * Set the serviceUrl property: Absolute URL of the backend service implementing this API.
     * 
     * @param serviceUrl the serviceUrl value to set.
     * @return the ApiContractUpdateProperties object itself.
     */
    public ApiContractUpdateProperties withServiceUrl(String serviceUrl) {
        this.serviceUrl = serviceUrl;
        return this;
    }

    /**
     * Get the path property: Relative URL uniquely identifying this API and all of its resource paths within the API
     * Management service instance. It is appended to the API endpoint base URL specified during the service instance
     * creation to form a public URL for this API.
     * 
     * @return the path value.
     */
    public String path() {
        return this.path;
    }

    /**
     * Set the path property: Relative URL uniquely identifying this API and all of its resource paths within the API
     * Management service instance. It is appended to the API endpoint base URL specified during the service instance
     * creation to form a public URL for this API.
     * 
     * @param path the path value to set.
     * @return the ApiContractUpdateProperties object itself.
     */
    public ApiContractUpdateProperties withPath(String path) {
        this.path = path;
        return this;
    }

    /**
     * Get the protocols property: Describes on which protocols the operations in this API can be invoked.
     * 
     * @return the protocols value.
     */
    public List<Protocol> protocols() {
        return this.protocols;
    }

    /**
     * Set the protocols property: Describes on which protocols the operations in this API can be invoked.
     * 
     * @param protocols the protocols value to set.
     * @return the ApiContractUpdateProperties object itself.
     */
    public ApiContractUpdateProperties withProtocols(List<Protocol> protocols) {
        this.protocols = protocols;
        return this;
    }

    /**
     * Get the isOnline property: Indicates if API revision is accessible via the gateway.
     * 
     * @return the isOnline value.
     */
    @Override
    public Boolean isOnline() {
        return this.isOnline;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ApiContractUpdateProperties withDescription(String description) {
        super.withDescription(description);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ApiContractUpdateProperties
        withAuthenticationSettings(AuthenticationSettingsContract authenticationSettings) {
        super.withAuthenticationSettings(authenticationSettings);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ApiContractUpdateProperties
        withSubscriptionKeyParameterNames(SubscriptionKeyParameterNamesContract subscriptionKeyParameterNames) {
        super.withSubscriptionKeyParameterNames(subscriptionKeyParameterNames);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ApiContractUpdateProperties withApiType(ApiType apiType) {
        super.withApiType(apiType);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ApiContractUpdateProperties withApiRevision(String apiRevision) {
        super.withApiRevision(apiRevision);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ApiContractUpdateProperties withApiVersion(String apiVersion) {
        super.withApiVersion(apiVersion);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ApiContractUpdateProperties withIsCurrent(Boolean isCurrent) {
        super.withIsCurrent(isCurrent);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ApiContractUpdateProperties withApiRevisionDescription(String apiRevisionDescription) {
        super.withApiRevisionDescription(apiRevisionDescription);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ApiContractUpdateProperties withApiVersionDescription(String apiVersionDescription) {
        super.withApiVersionDescription(apiVersionDescription);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ApiContractUpdateProperties withApiVersionSetId(String apiVersionSetId) {
        super.withApiVersionSetId(apiVersionSetId);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ApiContractUpdateProperties withSubscriptionRequired(Boolean subscriptionRequired) {
        super.withSubscriptionRequired(subscriptionRequired);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ApiContractUpdateProperties withTermsOfServiceUrl(String termsOfServiceUrl) {
        super.withTermsOfServiceUrl(termsOfServiceUrl);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ApiContractUpdateProperties withContact(ApiContactInformation contact) {
        super.withContact(contact);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ApiContractUpdateProperties withLicense(ApiLicenseInformation license) {
        super.withLicense(license);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        if (authenticationSettings() != null) {
            authenticationSettings().validate();
        }
        if (subscriptionKeyParameterNames() != null) {
            subscriptionKeyParameterNames().validate();
        }
        if (contact() != null) {
            contact().validate();
        }
        if (license() != null) {
            license().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("description", description());
        jsonWriter.writeJsonField("authenticationSettings", authenticationSettings());
        jsonWriter.writeJsonField("subscriptionKeyParameterNames", subscriptionKeyParameterNames());
        jsonWriter.writeStringField("type", apiType() == null ? null : apiType().toString());
        jsonWriter.writeStringField("apiRevision", apiRevision());
        jsonWriter.writeStringField("apiVersion", apiVersion());
        jsonWriter.writeBooleanField("isCurrent", isCurrent());
        jsonWriter.writeStringField("apiRevisionDescription", apiRevisionDescription());
        jsonWriter.writeStringField("apiVersionDescription", apiVersionDescription());
        jsonWriter.writeStringField("apiVersionSetId", apiVersionSetId());
        jsonWriter.writeBooleanField("subscriptionRequired", subscriptionRequired());
        jsonWriter.writeStringField("termsOfServiceUrl", termsOfServiceUrl());
        jsonWriter.writeJsonField("contact", contact());
        jsonWriter.writeJsonField("license", license());
        jsonWriter.writeStringField("displayName", this.displayName);
        jsonWriter.writeStringField("serviceUrl", this.serviceUrl);
        jsonWriter.writeStringField("path", this.path);
        jsonWriter.writeArrayField("protocols", this.protocols,
            (writer, element) -> writer.writeString(element == null ? null : element.toString()));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ApiContractUpdateProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ApiContractUpdateProperties if the JsonReader was pointing to an instance of it, or null
     * if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the ApiContractUpdateProperties.
     */
    public static ApiContractUpdateProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ApiContractUpdateProperties deserializedApiContractUpdateProperties = new ApiContractUpdateProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("description".equals(fieldName)) {
                    deserializedApiContractUpdateProperties.withDescription(reader.getString());
                } else if ("authenticationSettings".equals(fieldName)) {
                    deserializedApiContractUpdateProperties
                        .withAuthenticationSettings(AuthenticationSettingsContract.fromJson(reader));
                } else if ("subscriptionKeyParameterNames".equals(fieldName)) {
                    deserializedApiContractUpdateProperties
                        .withSubscriptionKeyParameterNames(SubscriptionKeyParameterNamesContract.fromJson(reader));
                } else if ("type".equals(fieldName)) {
                    deserializedApiContractUpdateProperties.withApiType(ApiType.fromString(reader.getString()));
                } else if ("apiRevision".equals(fieldName)) {
                    deserializedApiContractUpdateProperties.withApiRevision(reader.getString());
                } else if ("apiVersion".equals(fieldName)) {
                    deserializedApiContractUpdateProperties.withApiVersion(reader.getString());
                } else if ("isCurrent".equals(fieldName)) {
                    deserializedApiContractUpdateProperties.withIsCurrent(reader.getNullable(JsonReader::getBoolean));
                } else if ("isOnline".equals(fieldName)) {
                    deserializedApiContractUpdateProperties.isOnline = reader.getNullable(JsonReader::getBoolean);
                } else if ("apiRevisionDescription".equals(fieldName)) {
                    deserializedApiContractUpdateProperties.withApiRevisionDescription(reader.getString());
                } else if ("apiVersionDescription".equals(fieldName)) {
                    deserializedApiContractUpdateProperties.withApiVersionDescription(reader.getString());
                } else if ("apiVersionSetId".equals(fieldName)) {
                    deserializedApiContractUpdateProperties.withApiVersionSetId(reader.getString());
                } else if ("subscriptionRequired".equals(fieldName)) {
                    deserializedApiContractUpdateProperties
                        .withSubscriptionRequired(reader.getNullable(JsonReader::getBoolean));
                } else if ("termsOfServiceUrl".equals(fieldName)) {
                    deserializedApiContractUpdateProperties.withTermsOfServiceUrl(reader.getString());
                } else if ("contact".equals(fieldName)) {
                    deserializedApiContractUpdateProperties.withContact(ApiContactInformation.fromJson(reader));
                } else if ("license".equals(fieldName)) {
                    deserializedApiContractUpdateProperties.withLicense(ApiLicenseInformation.fromJson(reader));
                } else if ("displayName".equals(fieldName)) {
                    deserializedApiContractUpdateProperties.displayName = reader.getString();
                } else if ("serviceUrl".equals(fieldName)) {
                    deserializedApiContractUpdateProperties.serviceUrl = reader.getString();
                } else if ("path".equals(fieldName)) {
                    deserializedApiContractUpdateProperties.path = reader.getString();
                } else if ("protocols".equals(fieldName)) {
                    List<Protocol> protocols = reader.readArray(reader1 -> Protocol.fromString(reader1.getString()));
                    deserializedApiContractUpdateProperties.protocols = protocols;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedApiContractUpdateProperties;
        });
    }
}
