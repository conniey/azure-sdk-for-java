// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.purview.sharing.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;

import java.io.IOException;
import java.util.List;

/**
 * List of sent shares.
 */
@Fluent
public final class SentShareList implements JsonSerializable<SentShareList> {
    /*
     * The Url of next result page.
     */
    private String nextLink;

    /*
     * Collection of items of type SentShare
     */
    private List<SentShare> value;

    /**
     * Creates an instance of SentShareList class.
     */
    public SentShareList() {
    }

    /**
     * Get the nextLink property: The Url of next result page.
     *
     * @return the nextLink value.
     */
    public String getNextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: The Url of next result page.
     *
     * @param nextLink the nextLink value to set.
     * @return the SentShareList object itself.
     */
    public SentShareList setNextLink(String nextLink) {
        this.nextLink = nextLink;
        return this;
    }

    /**
     * Get the value property: Collection of items of type SentShare.
     *
     * @return the value value.
     */
    public List<SentShare> getValue() {
        return this.value;
    }

    /**
     * Set the value property: Collection of items of type SentShare.
     *
     * @param value the value value to set.
     * @return the SentShareList object itself.
     */
    public SentShareList setValue(List<SentShare> value) {
        this.value = value;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeArrayField("value", this.value, (writer, element) -> writer.writeJson(element));
        jsonWriter.writeStringField("nextLink", this.nextLink);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of SentShareList from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of SentShareList if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the SentShareList.
     */
    public static SentShareList fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            SentShareList deserializedSentShareList = new SentShareList();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("value".equals(fieldName)) {
                    List<SentShare> value = reader.readArray(reader1 -> SentShare.fromJson(reader1));
                    deserializedSentShareList.value = value;
                } else if ("nextLink".equals(fieldName)) {
                    deserializedSentShareList.nextLink = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedSentShareList;
        });
    }
}
