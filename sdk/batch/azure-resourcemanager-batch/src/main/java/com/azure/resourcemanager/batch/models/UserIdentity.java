// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.batch.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * The definition of the user identity under which the task is run.
 * 
 * Specify either the userName or autoUser property, but not both.
 */
@Fluent
public final class UserIdentity implements JsonSerializable<UserIdentity> {
    /*
     * The userName and autoUser properties are mutually exclusive; you must specify one but not both.
     */
    private String username;

    /*
     * The userName and autoUser properties are mutually exclusive; you must specify one but not both.
     */
    private AutoUserSpecification autoUser;

    /**
     * Creates an instance of UserIdentity class.
     */
    public UserIdentity() {
    }

    /**
     * Get the username property: The userName and autoUser properties are mutually exclusive; you must specify one but
     * not both.
     * 
     * @return the username value.
     */
    public String username() {
        return this.username;
    }

    /**
     * Set the username property: The userName and autoUser properties are mutually exclusive; you must specify one but
     * not both.
     * 
     * @param username the username value to set.
     * @return the UserIdentity object itself.
     */
    public UserIdentity withUsername(String username) {
        this.username = username;
        return this;
    }

    /**
     * Get the autoUser property: The userName and autoUser properties are mutually exclusive; you must specify one but
     * not both.
     * 
     * @return the autoUser value.
     */
    public AutoUserSpecification autoUser() {
        return this.autoUser;
    }

    /**
     * Set the autoUser property: The userName and autoUser properties are mutually exclusive; you must specify one but
     * not both.
     * 
     * @param autoUser the autoUser value to set.
     * @return the UserIdentity object itself.
     */
    public UserIdentity withAutoUser(AutoUserSpecification autoUser) {
        this.autoUser = autoUser;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (autoUser() != null) {
            autoUser().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("userName", this.username);
        jsonWriter.writeJsonField("autoUser", this.autoUser);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of UserIdentity from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of UserIdentity if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the UserIdentity.
     */
    public static UserIdentity fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            UserIdentity deserializedUserIdentity = new UserIdentity();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("userName".equals(fieldName)) {
                    deserializedUserIdentity.username = reader.getString();
                } else if ("autoUser".equals(fieldName)) {
                    deserializedUserIdentity.autoUser = AutoUserSpecification.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedUserIdentity;
        });
    }
}
