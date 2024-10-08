// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.desktopvirtualization.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * The ResourceModelWithAllowedPropertySetIdentity model.
 */
@Fluent
public final class ResourceModelWithAllowedPropertySetIdentity extends Identity {
    /*
     * The tenant ID of resource. The value must be an UUID.
     */
    private String tenantId;

    /*
     * The principal ID of resource identity. The value must be an UUID.
     */
    private String principalId;

    /**
     * Creates an instance of ResourceModelWithAllowedPropertySetIdentity class.
     */
    public ResourceModelWithAllowedPropertySetIdentity() {
    }

    /**
     * Get the tenantId property: The tenant ID of resource. The value must be an UUID.
     * 
     * @return the tenantId value.
     */
    @Override
    public String tenantId() {
        return this.tenantId;
    }

    /**
     * Get the principalId property: The principal ID of resource identity. The value must be an UUID.
     * 
     * @return the principalId value.
     */
    @Override
    public String principalId() {
        return this.principalId;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ResourceModelWithAllowedPropertySetIdentity withType(ResourceIdentityType type) {
        super.withType(type);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("type", type() == null ? null : type().toString());
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ResourceModelWithAllowedPropertySetIdentity from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ResourceModelWithAllowedPropertySetIdentity if the JsonReader was pointing to an instance
     * of it, or null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the ResourceModelWithAllowedPropertySetIdentity.
     */
    public static ResourceModelWithAllowedPropertySetIdentity fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ResourceModelWithAllowedPropertySetIdentity deserializedResourceModelWithAllowedPropertySetIdentity
                = new ResourceModelWithAllowedPropertySetIdentity();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("principalId".equals(fieldName)) {
                    deserializedResourceModelWithAllowedPropertySetIdentity.principalId = reader.getString();
                } else if ("tenantId".equals(fieldName)) {
                    deserializedResourceModelWithAllowedPropertySetIdentity.tenantId = reader.getString();
                } else if ("type".equals(fieldName)) {
                    deserializedResourceModelWithAllowedPropertySetIdentity
                        .withType(ResourceIdentityType.fromString(reader.getString()));
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedResourceModelWithAllowedPropertySetIdentity;
        });
    }
}
