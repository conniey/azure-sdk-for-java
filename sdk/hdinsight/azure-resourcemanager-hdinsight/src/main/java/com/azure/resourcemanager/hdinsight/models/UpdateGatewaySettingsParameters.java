// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hdinsight.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * The update gateway settings request parameters.
 */
@Fluent
public final class UpdateGatewaySettingsParameters implements JsonSerializable<UpdateGatewaySettingsParameters> {
    /*
     * Indicates whether or not the gateway settings based authorization is enabled.
     */
    private Boolean isCredentialEnabled;

    /*
     * The gateway settings user name.
     */
    private String username;

    /*
     * The gateway settings user password.
     */
    private String password;

    /**
     * Creates an instance of UpdateGatewaySettingsParameters class.
     */
    public UpdateGatewaySettingsParameters() {
    }

    /**
     * Get the isCredentialEnabled property: Indicates whether or not the gateway settings based authorization is
     * enabled.
     * 
     * @return the isCredentialEnabled value.
     */
    public Boolean isCredentialEnabled() {
        return this.isCredentialEnabled;
    }

    /**
     * Set the isCredentialEnabled property: Indicates whether or not the gateway settings based authorization is
     * enabled.
     * 
     * @param isCredentialEnabled the isCredentialEnabled value to set.
     * @return the UpdateGatewaySettingsParameters object itself.
     */
    public UpdateGatewaySettingsParameters withIsCredentialEnabled(Boolean isCredentialEnabled) {
        this.isCredentialEnabled = isCredentialEnabled;
        return this;
    }

    /**
     * Get the username property: The gateway settings user name.
     * 
     * @return the username value.
     */
    public String username() {
        return this.username;
    }

    /**
     * Set the username property: The gateway settings user name.
     * 
     * @param username the username value to set.
     * @return the UpdateGatewaySettingsParameters object itself.
     */
    public UpdateGatewaySettingsParameters withUsername(String username) {
        this.username = username;
        return this;
    }

    /**
     * Get the password property: The gateway settings user password.
     * 
     * @return the password value.
     */
    public String password() {
        return this.password;
    }

    /**
     * Set the password property: The gateway settings user password.
     * 
     * @param password the password value to set.
     * @return the UpdateGatewaySettingsParameters object itself.
     */
    public UpdateGatewaySettingsParameters withPassword(String password) {
        this.password = password;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeBooleanField("restAuthCredential.isEnabled", this.isCredentialEnabled);
        jsonWriter.writeStringField("restAuthCredential.username", this.username);
        jsonWriter.writeStringField("restAuthCredential.password", this.password);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of UpdateGatewaySettingsParameters from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of UpdateGatewaySettingsParameters if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the UpdateGatewaySettingsParameters.
     */
    public static UpdateGatewaySettingsParameters fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            UpdateGatewaySettingsParameters deserializedUpdateGatewaySettingsParameters
                = new UpdateGatewaySettingsParameters();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("restAuthCredential.isEnabled".equals(fieldName)) {
                    deserializedUpdateGatewaySettingsParameters.isCredentialEnabled
                        = reader.getNullable(JsonReader::getBoolean);
                } else if ("restAuthCredential.username".equals(fieldName)) {
                    deserializedUpdateGatewaySettingsParameters.username = reader.getString();
                } else if ("restAuthCredential.password".equals(fieldName)) {
                    deserializedUpdateGatewaySettingsParameters.password = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedUpdateGatewaySettingsParameters;
        });
    }
}
