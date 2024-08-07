// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * conversationMember.
 */
@Fluent
public final class MicrosoftGraphConversationMember extends MicrosoftGraphEntity {
    /*
     * The display name of the user.
     */
    private String displayName;

    /*
     * The roles for that user.
     */
    private List<String> roles;

    /*
     * conversationMember
     */
    private Map<String, Object> additionalProperties;

    /**
     * Creates an instance of MicrosoftGraphConversationMember class.
     */
    public MicrosoftGraphConversationMember() {
    }

    /**
     * Get the displayName property: The display name of the user.
     * 
     * @return the displayName value.
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Set the displayName property: The display name of the user.
     * 
     * @param displayName the displayName value to set.
     * @return the MicrosoftGraphConversationMember object itself.
     */
    public MicrosoftGraphConversationMember withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Get the roles property: The roles for that user.
     * 
     * @return the roles value.
     */
    public List<String> roles() {
        return this.roles;
    }

    /**
     * Set the roles property: The roles for that user.
     * 
     * @param roles the roles value to set.
     * @return the MicrosoftGraphConversationMember object itself.
     */
    public MicrosoftGraphConversationMember withRoles(List<String> roles) {
        this.roles = roles;
        return this;
    }

    /**
     * Get the additionalProperties property: conversationMember.
     * 
     * @return the additionalProperties value.
     */
    public Map<String, Object> additionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties property: conversationMember.
     * 
     * @param additionalProperties the additionalProperties value to set.
     * @return the MicrosoftGraphConversationMember object itself.
     */
    public MicrosoftGraphConversationMember withAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MicrosoftGraphConversationMember withId(String id) {
        super.withId(id);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("id", id());
        jsonWriter.writeStringField("displayName", this.displayName);
        jsonWriter.writeArrayField("roles", this.roles, (writer, element) -> writer.writeString(element));
        if (additionalProperties != null) {
            for (Map.Entry<String, Object> additionalProperty : additionalProperties.entrySet()) {
                jsonWriter.writeUntypedField(additionalProperty.getKey(), additionalProperty.getValue());
            }
        }
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of MicrosoftGraphConversationMember from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of MicrosoftGraphConversationMember if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the MicrosoftGraphConversationMember.
     */
    public static MicrosoftGraphConversationMember fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            MicrosoftGraphConversationMember deserializedMicrosoftGraphConversationMember
                = new MicrosoftGraphConversationMember();
            Map<String, Object> additionalProperties = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedMicrosoftGraphConversationMember.withId(reader.getString());
                } else if ("displayName".equals(fieldName)) {
                    deserializedMicrosoftGraphConversationMember.displayName = reader.getString();
                } else if ("roles".equals(fieldName)) {
                    List<String> roles = reader.readArray(reader1 -> reader1.getString());
                    deserializedMicrosoftGraphConversationMember.roles = roles;
                } else {
                    if (additionalProperties == null) {
                        additionalProperties = new LinkedHashMap<>();
                    }

                    additionalProperties.put(fieldName, reader.readUntyped());
                }
            }
            deserializedMicrosoftGraphConversationMember.additionalProperties = additionalProperties;

            return deserializedMicrosoftGraphConversationMember;
        });
    }
}
