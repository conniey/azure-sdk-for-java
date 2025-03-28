// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.graphservices.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.graphservices.fluent.models.AccountResourceInner;
import java.io.IOException;
import java.util.List;

/**
 * The list of accounts.
 */
@Fluent
public final class AccountResourceList implements JsonSerializable<AccountResourceList> {
    /*
     * The link to the next page of items
     */
    private String nextLink;

    /*
     * The list of recommendations.
     */
    private List<AccountResourceInner> value;

    /**
     * Creates an instance of AccountResourceList class.
     */
    public AccountResourceList() {
    }

    /**
     * Get the nextLink property: The link to the next page of items.
     * 
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: The link to the next page of items.
     * 
     * @param nextLink the nextLink value to set.
     * @return the AccountResourceList object itself.
     */
    public AccountResourceList withNextLink(String nextLink) {
        this.nextLink = nextLink;
        return this;
    }

    /**
     * Get the value property: The list of recommendations.
     * 
     * @return the value value.
     */
    public List<AccountResourceInner> value() {
        return this.value;
    }

    /**
     * Set the value property: The list of recommendations.
     * 
     * @param value the value value to set.
     * @return the AccountResourceList object itself.
     */
    public AccountResourceList withValue(List<AccountResourceInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() != null) {
            value().forEach(e -> e.validate());
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("nextLink", this.nextLink);
        jsonWriter.writeArrayField("value", this.value, (writer, element) -> writer.writeJson(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of AccountResourceList from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of AccountResourceList if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the AccountResourceList.
     */
    public static AccountResourceList fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            AccountResourceList deserializedAccountResourceList = new AccountResourceList();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("nextLink".equals(fieldName)) {
                    deserializedAccountResourceList.nextLink = reader.getString();
                } else if ("value".equals(fieldName)) {
                    List<AccountResourceInner> value
                        = reader.readArray(reader1 -> AccountResourceInner.fromJson(reader1));
                    deserializedAccountResourceList.value = value;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedAccountResourceList;
        });
    }
}
