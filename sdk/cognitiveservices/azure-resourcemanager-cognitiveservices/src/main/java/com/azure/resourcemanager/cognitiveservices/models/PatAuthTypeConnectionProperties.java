// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cognitiveservices.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.CoreUtils;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Map;

/**
 * The PatAuthTypeConnectionProperties model.
 */
@Fluent
public final class PatAuthTypeConnectionProperties extends ConnectionPropertiesV2 {
    /*
     * Authentication type of the connection target
     */
    private ConnectionAuthType authType = ConnectionAuthType.PAT;

    /*
     * The credentials property.
     */
    private ConnectionPersonalAccessToken credentials;

    /**
     * Creates an instance of PatAuthTypeConnectionProperties class.
     */
    public PatAuthTypeConnectionProperties() {
    }

    /**
     * Get the authType property: Authentication type of the connection target.
     * 
     * @return the authType value.
     */
    @Override
    public ConnectionAuthType authType() {
        return this.authType;
    }

    /**
     * Get the credentials property: The credentials property.
     * 
     * @return the credentials value.
     */
    public ConnectionPersonalAccessToken credentials() {
        return this.credentials;
    }

    /**
     * Set the credentials property: The credentials property.
     * 
     * @param credentials the credentials value to set.
     * @return the PatAuthTypeConnectionProperties object itself.
     */
    public PatAuthTypeConnectionProperties withCredentials(ConnectionPersonalAccessToken credentials) {
        this.credentials = credentials;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PatAuthTypeConnectionProperties withCategory(ConnectionCategory category) {
        super.withCategory(category);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PatAuthTypeConnectionProperties withError(String error) {
        super.withError(error);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PatAuthTypeConnectionProperties withExpiryTime(OffsetDateTime expiryTime) {
        super.withExpiryTime(expiryTime);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PatAuthTypeConnectionProperties withIsSharedToAll(Boolean isSharedToAll) {
        super.withIsSharedToAll(isSharedToAll);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PatAuthTypeConnectionProperties withMetadata(Map<String, String> metadata) {
        super.withMetadata(metadata);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PatAuthTypeConnectionProperties withPeRequirement(ManagedPERequirement peRequirement) {
        super.withPeRequirement(peRequirement);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PatAuthTypeConnectionProperties withPeStatus(ManagedPEStatus peStatus) {
        super.withPeStatus(peStatus);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PatAuthTypeConnectionProperties withSharedUserList(List<String> sharedUserList) {
        super.withSharedUserList(sharedUserList);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PatAuthTypeConnectionProperties withTarget(String target) {
        super.withTarget(target);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PatAuthTypeConnectionProperties withUseWorkspaceManagedIdentity(Boolean useWorkspaceManagedIdentity) {
        super.withUseWorkspaceManagedIdentity(useWorkspaceManagedIdentity);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        if (credentials() != null) {
            credentials().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("category", category() == null ? null : category().toString());
        jsonWriter.writeStringField("error", error());
        jsonWriter.writeStringField("expiryTime",
            expiryTime() == null ? null : DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(expiryTime()));
        jsonWriter.writeBooleanField("isSharedToAll", isSharedToAll());
        jsonWriter.writeMapField("metadata", metadata(), (writer, element) -> writer.writeString(element));
        jsonWriter.writeStringField("peRequirement", peRequirement() == null ? null : peRequirement().toString());
        jsonWriter.writeStringField("peStatus", peStatus() == null ? null : peStatus().toString());
        jsonWriter.writeArrayField("sharedUserList", sharedUserList(),
            (writer, element) -> writer.writeString(element));
        jsonWriter.writeStringField("target", target());
        jsonWriter.writeBooleanField("useWorkspaceManagedIdentity", useWorkspaceManagedIdentity());
        jsonWriter.writeStringField("authType", this.authType == null ? null : this.authType.toString());
        jsonWriter.writeJsonField("credentials", this.credentials);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of PatAuthTypeConnectionProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of PatAuthTypeConnectionProperties if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the PatAuthTypeConnectionProperties.
     */
    public static PatAuthTypeConnectionProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            PatAuthTypeConnectionProperties deserializedPatAuthTypeConnectionProperties
                = new PatAuthTypeConnectionProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("category".equals(fieldName)) {
                    deserializedPatAuthTypeConnectionProperties
                        .withCategory(ConnectionCategory.fromString(reader.getString()));
                } else if ("createdByWorkspaceArmId".equals(fieldName)) {
                    deserializedPatAuthTypeConnectionProperties.withCreatedByWorkspaceArmId(reader.getString());
                } else if ("error".equals(fieldName)) {
                    deserializedPatAuthTypeConnectionProperties.withError(reader.getString());
                } else if ("expiryTime".equals(fieldName)) {
                    deserializedPatAuthTypeConnectionProperties.withExpiryTime(reader
                        .getNullable(nonNullReader -> CoreUtils.parseBestOffsetDateTime(nonNullReader.getString())));
                } else if ("group".equals(fieldName)) {
                    deserializedPatAuthTypeConnectionProperties
                        .withGroup(ConnectionGroup.fromString(reader.getString()));
                } else if ("isSharedToAll".equals(fieldName)) {
                    deserializedPatAuthTypeConnectionProperties
                        .withIsSharedToAll(reader.getNullable(JsonReader::getBoolean));
                } else if ("metadata".equals(fieldName)) {
                    Map<String, String> metadata = reader.readMap(reader1 -> reader1.getString());
                    deserializedPatAuthTypeConnectionProperties.withMetadata(metadata);
                } else if ("peRequirement".equals(fieldName)) {
                    deserializedPatAuthTypeConnectionProperties
                        .withPeRequirement(ManagedPERequirement.fromString(reader.getString()));
                } else if ("peStatus".equals(fieldName)) {
                    deserializedPatAuthTypeConnectionProperties
                        .withPeStatus(ManagedPEStatus.fromString(reader.getString()));
                } else if ("sharedUserList".equals(fieldName)) {
                    List<String> sharedUserList = reader.readArray(reader1 -> reader1.getString());
                    deserializedPatAuthTypeConnectionProperties.withSharedUserList(sharedUserList);
                } else if ("target".equals(fieldName)) {
                    deserializedPatAuthTypeConnectionProperties.withTarget(reader.getString());
                } else if ("useWorkspaceManagedIdentity".equals(fieldName)) {
                    deserializedPatAuthTypeConnectionProperties
                        .withUseWorkspaceManagedIdentity(reader.getNullable(JsonReader::getBoolean));
                } else if ("authType".equals(fieldName)) {
                    deserializedPatAuthTypeConnectionProperties.authType
                        = ConnectionAuthType.fromString(reader.getString());
                } else if ("credentials".equals(fieldName)) {
                    deserializedPatAuthTypeConnectionProperties.credentials
                        = ConnectionPersonalAccessToken.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedPatAuthTypeConnectionProperties;
        });
    }
}
