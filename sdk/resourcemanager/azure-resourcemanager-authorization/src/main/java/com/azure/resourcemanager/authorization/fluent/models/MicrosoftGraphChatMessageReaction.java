// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.CoreUtils;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * chatMessageReaction.
 */
@Fluent
public final class MicrosoftGraphChatMessageReaction implements JsonSerializable<MicrosoftGraphChatMessageReaction> {
    /*
     * The createdDateTime property.
     */
    private OffsetDateTime createdDateTime;

    /*
     * The reactionType property.
     */
    private String reactionType;

    /*
     * identitySet
     */
    private MicrosoftGraphIdentitySet user;

    /*
     * chatMessageReaction
     */
    private Map<String, Object> additionalProperties;

    /**
     * Creates an instance of MicrosoftGraphChatMessageReaction class.
     */
    public MicrosoftGraphChatMessageReaction() {
    }

    /**
     * Get the createdDateTime property: The createdDateTime property.
     * 
     * @return the createdDateTime value.
     */
    public OffsetDateTime createdDateTime() {
        return this.createdDateTime;
    }

    /**
     * Set the createdDateTime property: The createdDateTime property.
     * 
     * @param createdDateTime the createdDateTime value to set.
     * @return the MicrosoftGraphChatMessageReaction object itself.
     */
    public MicrosoftGraphChatMessageReaction withCreatedDateTime(OffsetDateTime createdDateTime) {
        this.createdDateTime = createdDateTime;
        return this;
    }

    /**
     * Get the reactionType property: The reactionType property.
     * 
     * @return the reactionType value.
     */
    public String reactionType() {
        return this.reactionType;
    }

    /**
     * Set the reactionType property: The reactionType property.
     * 
     * @param reactionType the reactionType value to set.
     * @return the MicrosoftGraphChatMessageReaction object itself.
     */
    public MicrosoftGraphChatMessageReaction withReactionType(String reactionType) {
        this.reactionType = reactionType;
        return this;
    }

    /**
     * Get the user property: identitySet.
     * 
     * @return the user value.
     */
    public MicrosoftGraphIdentitySet user() {
        return this.user;
    }

    /**
     * Set the user property: identitySet.
     * 
     * @param user the user value to set.
     * @return the MicrosoftGraphChatMessageReaction object itself.
     */
    public MicrosoftGraphChatMessageReaction withUser(MicrosoftGraphIdentitySet user) {
        this.user = user;
        return this;
    }

    /**
     * Get the additionalProperties property: chatMessageReaction.
     * 
     * @return the additionalProperties value.
     */
    public Map<String, Object> additionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties property: chatMessageReaction.
     * 
     * @param additionalProperties the additionalProperties value to set.
     * @return the MicrosoftGraphChatMessageReaction object itself.
     */
    public MicrosoftGraphChatMessageReaction withAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (user() != null) {
            user().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("createdDateTime",
            this.createdDateTime == null ? null : DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(this.createdDateTime));
        jsonWriter.writeStringField("reactionType", this.reactionType);
        jsonWriter.writeJsonField("user", this.user);
        if (additionalProperties != null) {
            for (Map.Entry<String, Object> additionalProperty : additionalProperties.entrySet()) {
                jsonWriter.writeUntypedField(additionalProperty.getKey(), additionalProperty.getValue());
            }
        }
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of MicrosoftGraphChatMessageReaction from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of MicrosoftGraphChatMessageReaction if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the MicrosoftGraphChatMessageReaction.
     */
    public static MicrosoftGraphChatMessageReaction fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            MicrosoftGraphChatMessageReaction deserializedMicrosoftGraphChatMessageReaction
                = new MicrosoftGraphChatMessageReaction();
            Map<String, Object> additionalProperties = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("createdDateTime".equals(fieldName)) {
                    deserializedMicrosoftGraphChatMessageReaction.createdDateTime = reader
                        .getNullable(nonNullReader -> CoreUtils.parseBestOffsetDateTime(nonNullReader.getString()));
                } else if ("reactionType".equals(fieldName)) {
                    deserializedMicrosoftGraphChatMessageReaction.reactionType = reader.getString();
                } else if ("user".equals(fieldName)) {
                    deserializedMicrosoftGraphChatMessageReaction.user = MicrosoftGraphIdentitySet.fromJson(reader);
                } else {
                    if (additionalProperties == null) {
                        additionalProperties = new LinkedHashMap<>();
                    }

                    additionalProperties.put(fieldName, reader.readUntyped());
                }
            }
            deserializedMicrosoftGraphChatMessageReaction.additionalProperties = additionalProperties;

            return deserializedMicrosoftGraphChatMessageReaction;
        });
    }
}
