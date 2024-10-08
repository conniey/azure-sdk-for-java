// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.batch.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.batch.fluent.models.BatchAccountUpdateProperties;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/**
 * Parameters for updating an Azure Batch account.
 */
@Fluent
public final class BatchAccountUpdateParameters implements JsonSerializable<BatchAccountUpdateParameters> {
    /*
     * The user-specified tags associated with the account.
     */
    private Map<String, String> tags;

    /*
     * The properties of the account.
     */
    private BatchAccountUpdateProperties innerProperties;

    /*
     * The identity of the Batch account.
     */
    private BatchAccountIdentity identity;

    /**
     * Creates an instance of BatchAccountUpdateParameters class.
     */
    public BatchAccountUpdateParameters() {
    }

    /**
     * Get the tags property: The user-specified tags associated with the account.
     * 
     * @return the tags value.
     */
    public Map<String, String> tags() {
        return this.tags;
    }

    /**
     * Set the tags property: The user-specified tags associated with the account.
     * 
     * @param tags the tags value to set.
     * @return the BatchAccountUpdateParameters object itself.
     */
    public BatchAccountUpdateParameters withTags(Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * Get the innerProperties property: The properties of the account.
     * 
     * @return the innerProperties value.
     */
    private BatchAccountUpdateProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the identity property: The identity of the Batch account.
     * 
     * @return the identity value.
     */
    public BatchAccountIdentity identity() {
        return this.identity;
    }

    /**
     * Set the identity property: The identity of the Batch account.
     * 
     * @param identity the identity value to set.
     * @return the BatchAccountUpdateParameters object itself.
     */
    public BatchAccountUpdateParameters withIdentity(BatchAccountIdentity identity) {
        this.identity = identity;
        return this;
    }

    /**
     * Get the autoStorage property: The properties related to the auto-storage account.
     * 
     * @return the autoStorage value.
     */
    public AutoStorageBaseProperties autoStorage() {
        return this.innerProperties() == null ? null : this.innerProperties().autoStorage();
    }

    /**
     * Set the autoStorage property: The properties related to the auto-storage account.
     * 
     * @param autoStorage the autoStorage value to set.
     * @return the BatchAccountUpdateParameters object itself.
     */
    public BatchAccountUpdateParameters withAutoStorage(AutoStorageBaseProperties autoStorage) {
        if (this.innerProperties() == null) {
            this.innerProperties = new BatchAccountUpdateProperties();
        }
        this.innerProperties().withAutoStorage(autoStorage);
        return this;
    }

    /**
     * Get the encryption property: Configures how customer data is encrypted inside the Batch account. By default,
     * accounts are encrypted using a Microsoft managed key. For additional control, a customer-managed key can be used
     * instead.
     * 
     * @return the encryption value.
     */
    public EncryptionProperties encryption() {
        return this.innerProperties() == null ? null : this.innerProperties().encryption();
    }

    /**
     * Set the encryption property: Configures how customer data is encrypted inside the Batch account. By default,
     * accounts are encrypted using a Microsoft managed key. For additional control, a customer-managed key can be used
     * instead.
     * 
     * @param encryption the encryption value to set.
     * @return the BatchAccountUpdateParameters object itself.
     */
    public BatchAccountUpdateParameters withEncryption(EncryptionProperties encryption) {
        if (this.innerProperties() == null) {
            this.innerProperties = new BatchAccountUpdateProperties();
        }
        this.innerProperties().withEncryption(encryption);
        return this;
    }

    /**
     * Get the allowedAuthenticationModes property: List of allowed authentication modes for the Batch account that can
     * be used to authenticate with the data plane. This does not affect authentication with the control plane.
     * 
     * @return the allowedAuthenticationModes value.
     */
    public List<AuthenticationMode> allowedAuthenticationModes() {
        return this.innerProperties() == null ? null : this.innerProperties().allowedAuthenticationModes();
    }

    /**
     * Set the allowedAuthenticationModes property: List of allowed authentication modes for the Batch account that can
     * be used to authenticate with the data plane. This does not affect authentication with the control plane.
     * 
     * @param allowedAuthenticationModes the allowedAuthenticationModes value to set.
     * @return the BatchAccountUpdateParameters object itself.
     */
    public BatchAccountUpdateParameters
        withAllowedAuthenticationModes(List<AuthenticationMode> allowedAuthenticationModes) {
        if (this.innerProperties() == null) {
            this.innerProperties = new BatchAccountUpdateProperties();
        }
        this.innerProperties().withAllowedAuthenticationModes(allowedAuthenticationModes);
        return this;
    }

    /**
     * Get the publicNetworkAccess property: If not specified, the default value is 'enabled'.
     * 
     * @return the publicNetworkAccess value.
     */
    public PublicNetworkAccessType publicNetworkAccess() {
        return this.innerProperties() == null ? null : this.innerProperties().publicNetworkAccess();
    }

    /**
     * Set the publicNetworkAccess property: If not specified, the default value is 'enabled'.
     * 
     * @param publicNetworkAccess the publicNetworkAccess value to set.
     * @return the BatchAccountUpdateParameters object itself.
     */
    public BatchAccountUpdateParameters withPublicNetworkAccess(PublicNetworkAccessType publicNetworkAccess) {
        if (this.innerProperties() == null) {
            this.innerProperties = new BatchAccountUpdateProperties();
        }
        this.innerProperties().withPublicNetworkAccess(publicNetworkAccess);
        return this;
    }

    /**
     * Get the networkProfile property: The network profile only takes effect when publicNetworkAccess is enabled.
     * 
     * @return the networkProfile value.
     */
    public NetworkProfile networkProfile() {
        return this.innerProperties() == null ? null : this.innerProperties().networkProfile();
    }

    /**
     * Set the networkProfile property: The network profile only takes effect when publicNetworkAccess is enabled.
     * 
     * @param networkProfile the networkProfile value to set.
     * @return the BatchAccountUpdateParameters object itself.
     */
    public BatchAccountUpdateParameters withNetworkProfile(NetworkProfile networkProfile) {
        if (this.innerProperties() == null) {
            this.innerProperties = new BatchAccountUpdateProperties();
        }
        this.innerProperties().withNetworkProfile(networkProfile);
        return this;
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
        if (identity() != null) {
            identity().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeMapField("tags", this.tags, (writer, element) -> writer.writeString(element));
        jsonWriter.writeJsonField("properties", this.innerProperties);
        jsonWriter.writeJsonField("identity", this.identity);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of BatchAccountUpdateParameters from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of BatchAccountUpdateParameters if the JsonReader was pointing to an instance of it, or null
     * if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the BatchAccountUpdateParameters.
     */
    public static BatchAccountUpdateParameters fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            BatchAccountUpdateParameters deserializedBatchAccountUpdateParameters = new BatchAccountUpdateParameters();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("tags".equals(fieldName)) {
                    Map<String, String> tags = reader.readMap(reader1 -> reader1.getString());
                    deserializedBatchAccountUpdateParameters.tags = tags;
                } else if ("properties".equals(fieldName)) {
                    deserializedBatchAccountUpdateParameters.innerProperties
                        = BatchAccountUpdateProperties.fromJson(reader);
                } else if ("identity".equals(fieldName)) {
                    deserializedBatchAccountUpdateParameters.identity = BatchAccountIdentity.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedBatchAccountUpdateParameters;
        });
    }
}
