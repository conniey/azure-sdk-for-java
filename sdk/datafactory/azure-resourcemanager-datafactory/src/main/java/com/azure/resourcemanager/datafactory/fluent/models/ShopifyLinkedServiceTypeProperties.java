// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.datafactory.models.SecretBase;
import java.io.IOException;

/**
 * Shopify Service linked service properties.
 */
@Fluent
public final class ShopifyLinkedServiceTypeProperties implements JsonSerializable<ShopifyLinkedServiceTypeProperties> {
    /*
     * The endpoint of the Shopify server. (i.e. mystore.myshopify.com)
     */
    private Object host;

    /*
     * The API access token that can be used to access Shopify’s data. The token won't expire if it is offline mode.
     */
    private SecretBase accessToken;

    /*
     * Specifies whether the data source endpoints are encrypted using HTTPS. The default value is true.
     */
    private Object useEncryptedEndpoints;

    /*
     * Specifies whether to require the host name in the server's certificate to match the host name of the server when
     * connecting over SSL. The default value is true.
     */
    private Object useHostVerification;

    /*
     * Specifies whether to verify the identity of the server when connecting over SSL. The default value is true.
     */
    private Object usePeerVerification;

    /*
     * The encrypted credential used for authentication. Credentials are encrypted using the integration runtime
     * credential manager. Type: string.
     */
    private String encryptedCredential;

    /**
     * Creates an instance of ShopifyLinkedServiceTypeProperties class.
     */
    public ShopifyLinkedServiceTypeProperties() {
    }

    /**
     * Get the host property: The endpoint of the Shopify server. (i.e. mystore.myshopify.com).
     * 
     * @return the host value.
     */
    public Object host() {
        return this.host;
    }

    /**
     * Set the host property: The endpoint of the Shopify server. (i.e. mystore.myshopify.com).
     * 
     * @param host the host value to set.
     * @return the ShopifyLinkedServiceTypeProperties object itself.
     */
    public ShopifyLinkedServiceTypeProperties withHost(Object host) {
        this.host = host;
        return this;
    }

    /**
     * Get the accessToken property: The API access token that can be used to access Shopify’s data. The token won't
     * expire if it is offline mode.
     * 
     * @return the accessToken value.
     */
    public SecretBase accessToken() {
        return this.accessToken;
    }

    /**
     * Set the accessToken property: The API access token that can be used to access Shopify’s data. The token won't
     * expire if it is offline mode.
     * 
     * @param accessToken the accessToken value to set.
     * @return the ShopifyLinkedServiceTypeProperties object itself.
     */
    public ShopifyLinkedServiceTypeProperties withAccessToken(SecretBase accessToken) {
        this.accessToken = accessToken;
        return this;
    }

    /**
     * Get the useEncryptedEndpoints property: Specifies whether the data source endpoints are encrypted using HTTPS.
     * The default value is true.
     * 
     * @return the useEncryptedEndpoints value.
     */
    public Object useEncryptedEndpoints() {
        return this.useEncryptedEndpoints;
    }

    /**
     * Set the useEncryptedEndpoints property: Specifies whether the data source endpoints are encrypted using HTTPS.
     * The default value is true.
     * 
     * @param useEncryptedEndpoints the useEncryptedEndpoints value to set.
     * @return the ShopifyLinkedServiceTypeProperties object itself.
     */
    public ShopifyLinkedServiceTypeProperties withUseEncryptedEndpoints(Object useEncryptedEndpoints) {
        this.useEncryptedEndpoints = useEncryptedEndpoints;
        return this;
    }

    /**
     * Get the useHostVerification property: Specifies whether to require the host name in the server's certificate to
     * match the host name of the server when connecting over SSL. The default value is true.
     * 
     * @return the useHostVerification value.
     */
    public Object useHostVerification() {
        return this.useHostVerification;
    }

    /**
     * Set the useHostVerification property: Specifies whether to require the host name in the server's certificate to
     * match the host name of the server when connecting over SSL. The default value is true.
     * 
     * @param useHostVerification the useHostVerification value to set.
     * @return the ShopifyLinkedServiceTypeProperties object itself.
     */
    public ShopifyLinkedServiceTypeProperties withUseHostVerification(Object useHostVerification) {
        this.useHostVerification = useHostVerification;
        return this;
    }

    /**
     * Get the usePeerVerification property: Specifies whether to verify the identity of the server when connecting over
     * SSL. The default value is true.
     * 
     * @return the usePeerVerification value.
     */
    public Object usePeerVerification() {
        return this.usePeerVerification;
    }

    /**
     * Set the usePeerVerification property: Specifies whether to verify the identity of the server when connecting over
     * SSL. The default value is true.
     * 
     * @param usePeerVerification the usePeerVerification value to set.
     * @return the ShopifyLinkedServiceTypeProperties object itself.
     */
    public ShopifyLinkedServiceTypeProperties withUsePeerVerification(Object usePeerVerification) {
        this.usePeerVerification = usePeerVerification;
        return this;
    }

    /**
     * Get the encryptedCredential property: The encrypted credential used for authentication. Credentials are encrypted
     * using the integration runtime credential manager. Type: string.
     * 
     * @return the encryptedCredential value.
     */
    public String encryptedCredential() {
        return this.encryptedCredential;
    }

    /**
     * Set the encryptedCredential property: The encrypted credential used for authentication. Credentials are encrypted
     * using the integration runtime credential manager. Type: string.
     * 
     * @param encryptedCredential the encryptedCredential value to set.
     * @return the ShopifyLinkedServiceTypeProperties object itself.
     */
    public ShopifyLinkedServiceTypeProperties withEncryptedCredential(String encryptedCredential) {
        this.encryptedCredential = encryptedCredential;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (host() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property host in model ShopifyLinkedServiceTypeProperties"));
        }
        if (accessToken() != null) {
            accessToken().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(ShopifyLinkedServiceTypeProperties.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeUntypedField("host", this.host);
        jsonWriter.writeJsonField("accessToken", this.accessToken);
        if (this.useEncryptedEndpoints != null) {
            jsonWriter.writeUntypedField("useEncryptedEndpoints", this.useEncryptedEndpoints);
        }
        if (this.useHostVerification != null) {
            jsonWriter.writeUntypedField("useHostVerification", this.useHostVerification);
        }
        if (this.usePeerVerification != null) {
            jsonWriter.writeUntypedField("usePeerVerification", this.usePeerVerification);
        }
        jsonWriter.writeStringField("encryptedCredential", this.encryptedCredential);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ShopifyLinkedServiceTypeProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ShopifyLinkedServiceTypeProperties if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the ShopifyLinkedServiceTypeProperties.
     */
    public static ShopifyLinkedServiceTypeProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ShopifyLinkedServiceTypeProperties deserializedShopifyLinkedServiceTypeProperties
                = new ShopifyLinkedServiceTypeProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("host".equals(fieldName)) {
                    deserializedShopifyLinkedServiceTypeProperties.host = reader.readUntyped();
                } else if ("accessToken".equals(fieldName)) {
                    deserializedShopifyLinkedServiceTypeProperties.accessToken = SecretBase.fromJson(reader);
                } else if ("useEncryptedEndpoints".equals(fieldName)) {
                    deserializedShopifyLinkedServiceTypeProperties.useEncryptedEndpoints = reader.readUntyped();
                } else if ("useHostVerification".equals(fieldName)) {
                    deserializedShopifyLinkedServiceTypeProperties.useHostVerification = reader.readUntyped();
                } else if ("usePeerVerification".equals(fieldName)) {
                    deserializedShopifyLinkedServiceTypeProperties.usePeerVerification = reader.readUntyped();
                } else if ("encryptedCredential".equals(fieldName)) {
                    deserializedShopifyLinkedServiceTypeProperties.encryptedCredential = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedShopifyLinkedServiceTypeProperties;
        });
    }
}
