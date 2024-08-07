// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.selfhelp.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Part of the solution and are dividers in the solution rendering.
 */
@Fluent
public final class Section implements JsonSerializable<Section> {
    /*
     * Solution sections title.
     */
    private String title;

    /*
     * Solution sections content.
     */
    private String content;

    /*
     * Solution replacement maps.
     */
    private ReplacementMaps replacementMaps;

    /**
     * Creates an instance of Section class.
     */
    public Section() {
    }

    /**
     * Get the title property: Solution sections title.
     * 
     * @return the title value.
     */
    public String title() {
        return this.title;
    }

    /**
     * Set the title property: Solution sections title.
     * 
     * @param title the title value to set.
     * @return the Section object itself.
     */
    public Section withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * Get the content property: Solution sections content.
     * 
     * @return the content value.
     */
    public String content() {
        return this.content;
    }

    /**
     * Set the content property: Solution sections content.
     * 
     * @param content the content value to set.
     * @return the Section object itself.
     */
    public Section withContent(String content) {
        this.content = content;
        return this;
    }

    /**
     * Get the replacementMaps property: Solution replacement maps.
     * 
     * @return the replacementMaps value.
     */
    public ReplacementMaps replacementMaps() {
        return this.replacementMaps;
    }

    /**
     * Set the replacementMaps property: Solution replacement maps.
     * 
     * @param replacementMaps the replacementMaps value to set.
     * @return the Section object itself.
     */
    public Section withReplacementMaps(ReplacementMaps replacementMaps) {
        this.replacementMaps = replacementMaps;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (replacementMaps() != null) {
            replacementMaps().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("title", this.title);
        jsonWriter.writeStringField("content", this.content);
        jsonWriter.writeJsonField("replacementMaps", this.replacementMaps);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of Section from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of Section if the JsonReader was pointing to an instance of it, or null if it was pointing to
     * JSON null.
     * @throws IOException If an error occurs while reading the Section.
     */
    public static Section fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            Section deserializedSection = new Section();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("title".equals(fieldName)) {
                    deserializedSection.title = reader.getString();
                } else if ("content".equals(fieldName)) {
                    deserializedSection.content = reader.getString();
                } else if ("replacementMaps".equals(fieldName)) {
                    deserializedSection.replacementMaps = ReplacementMaps.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedSection;
        });
    }
}
