// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cognitiveservices.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.cognitiveservices.models.AccountSku;
import java.io.IOException;
import java.util.List;

/**
 * The list of cognitive services accounts operation response.
 */
@Fluent
public final class AccountSkuListResultInner implements JsonSerializable<AccountSkuListResultInner> {
    /*
     * Gets the list of Cognitive Services accounts and their properties.
     */
    private List<AccountSku> value;

    /**
     * Creates an instance of AccountSkuListResultInner class.
     */
    public AccountSkuListResultInner() {
    }

    /**
     * Get the value property: Gets the list of Cognitive Services accounts and their properties.
     * 
     * @return the value value.
     */
    public List<AccountSku> value() {
        return this.value;
    }

    /**
     * Set the value property: Gets the list of Cognitive Services accounts and their properties.
     * 
     * @param value the value value to set.
     * @return the AccountSkuListResultInner object itself.
     */
    public AccountSkuListResultInner withValue(List<AccountSku> value) {
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
        jsonWriter.writeArrayField("value", this.value, (writer, element) -> writer.writeJson(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of AccountSkuListResultInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of AccountSkuListResultInner if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the AccountSkuListResultInner.
     */
    public static AccountSkuListResultInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            AccountSkuListResultInner deserializedAccountSkuListResultInner = new AccountSkuListResultInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("value".equals(fieldName)) {
                    List<AccountSku> value = reader.readArray(reader1 -> AccountSku.fromJson(reader1));
                    deserializedAccountSkuListResultInner.value = value;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedAccountSkuListResultInner;
        });
    }
}
