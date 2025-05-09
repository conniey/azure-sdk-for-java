// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.deviceupdate.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.Map;

/**
 * Request payload used to update and existing Accounts.
 */
@Fluent
public final class AccountUpdate extends TagUpdate {
    /*
     * The type of identity used for the resource.
     */
    private ManagedServiceIdentity identity;

    /*
     * The geo-location where the resource lives
     */
    private String location;

    /**
     * Creates an instance of AccountUpdate class.
     */
    public AccountUpdate() {
    }

    /**
     * Get the identity property: The type of identity used for the resource.
     * 
     * @return the identity value.
     */
    public ManagedServiceIdentity identity() {
        return this.identity;
    }

    /**
     * Set the identity property: The type of identity used for the resource.
     * 
     * @param identity the identity value to set.
     * @return the AccountUpdate object itself.
     */
    public AccountUpdate withIdentity(ManagedServiceIdentity identity) {
        this.identity = identity;
        return this;
    }

    /**
     * Get the location property: The geo-location where the resource lives.
     * 
     * @return the location value.
     */
    public String location() {
        return this.location;
    }

    /**
     * Set the location property: The geo-location where the resource lives.
     * 
     * @param location the location value to set.
     * @return the AccountUpdate object itself.
     */
    public AccountUpdate withLocation(String location) {
        this.location = location;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AccountUpdate withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
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
        jsonWriter.writeMapField("tags", tags(), (writer, element) -> writer.writeString(element));
        jsonWriter.writeJsonField("identity", this.identity);
        jsonWriter.writeStringField("location", this.location);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of AccountUpdate from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of AccountUpdate if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the AccountUpdate.
     */
    public static AccountUpdate fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            AccountUpdate deserializedAccountUpdate = new AccountUpdate();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("tags".equals(fieldName)) {
                    Map<String, String> tags = reader.readMap(reader1 -> reader1.getString());
                    deserializedAccountUpdate.withTags(tags);
                } else if ("identity".equals(fieldName)) {
                    deserializedAccountUpdate.identity = ManagedServiceIdentity.fromJson(reader);
                } else if ("location".equals(fieldName)) {
                    deserializedAccountUpdate.location = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedAccountUpdate;
        });
    }
}
