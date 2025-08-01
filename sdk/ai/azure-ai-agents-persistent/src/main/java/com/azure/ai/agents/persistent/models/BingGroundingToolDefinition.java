// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.ai.agents.persistent.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * The input definition information for a bing grounding search tool as used to configure an agent.
 */
@Immutable
public final class BingGroundingToolDefinition extends ToolDefinition {

    /*
     * The object type.
     */
    @Generated
    private String type = "bing_grounding";

    /*
     * The bing grounding search tool parameters.
     */
    @Generated
    private final BingGroundingSearchToolParameters bingGrounding;

    /**
     * Creates an instance of BingGroundingToolDefinition class.
     *
     * @param bingGrounding the bingGrounding value to set.
     */
    @Generated
    public BingGroundingToolDefinition(BingGroundingSearchToolParameters bingGrounding) {
        this.bingGrounding = bingGrounding;
    }

    /**
     * Get the type property: The object type.
     *
     * @return the type value.
     */
    @Generated
    @Override
    public String getType() {
        return this.type;
    }

    /**
     * Get the bingGrounding property: The bing grounding search tool parameters.
     *
     * @return the bingGrounding value.
     */
    @Generated
    public BingGroundingSearchToolParameters getBingGrounding() {
        return this.bingGrounding;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeJsonField("bing_grounding", this.bingGrounding);
        jsonWriter.writeStringField("type", this.type);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of BingGroundingToolDefinition from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of BingGroundingToolDefinition if the JsonReader was pointing to an instance of it, or null
     * if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the BingGroundingToolDefinition.
     */
    @Generated
    public static BingGroundingToolDefinition fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            BingGroundingSearchToolParameters bingGrounding = null;
            String type = "bing_grounding";
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();
                if ("bing_grounding".equals(fieldName)) {
                    bingGrounding = BingGroundingSearchToolParameters.fromJson(reader);
                } else if ("type".equals(fieldName)) {
                    type = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }
            BingGroundingToolDefinition deserializedBingGroundingToolDefinition
                = new BingGroundingToolDefinition(bingGrounding);
            deserializedBingGroundingToolDefinition.type = type;
            return deserializedBingGroundingToolDefinition;
        });
    }
}
