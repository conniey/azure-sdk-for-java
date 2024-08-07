// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.CoreUtils;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * administrativeUnit
 * 
 * Represents an Azure Active Directory object. The directoryObject type is the base type for many other directory
 * entity types.
 */
@Fluent
public final class MicrosoftGraphAdministrativeUnit extends MicrosoftGraphDirectoryObjectInner {
    /*
     * An optional description for the administrative unit.
     */
    private String description;

    /*
     * Display name for the administrative unit.
     */
    private String displayName;

    /*
     * Controls whether the administrative unit and its members are hidden or public. Can be set to HiddenMembership or
     * Public. If not set, default behavior is Public. When set to HiddenMembership, only members of the administrative
     * unit can list other members of the adminstrative unit.
     */
    private String visibility;

    /*
     * Users and groups that are members of this Adminsitrative Unit. HTTP Methods: GET (list members), POST (add
     * members), DELETE (remove members).
     */
    private List<MicrosoftGraphDirectoryObjectInner> members;

    /*
     * Scoped-role members of this Administrative Unit. HTTP Methods: GET (list scopedRoleMemberships), POST (add
     * scopedRoleMembership), DELETE (remove scopedRoleMembership).
     */
    private List<MicrosoftGraphScopedRoleMembership> scopedRoleMembers;

    /*
     * The extensions property.
     */
    private List<MicrosoftGraphExtension> extensions;

    /*
     * Represents an Azure Active Directory object. The directoryObject type is the base type for many other directory
     * entity types.
     */
    private Map<String, Object> additionalProperties;

    /**
     * Creates an instance of MicrosoftGraphAdministrativeUnit class.
     */
    public MicrosoftGraphAdministrativeUnit() {
    }

    /**
     * Get the description property: An optional description for the administrative unit.
     * 
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the description property: An optional description for the administrative unit.
     * 
     * @param description the description value to set.
     * @return the MicrosoftGraphAdministrativeUnit object itself.
     */
    public MicrosoftGraphAdministrativeUnit withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the displayName property: Display name for the administrative unit.
     * 
     * @return the displayName value.
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Set the displayName property: Display name for the administrative unit.
     * 
     * @param displayName the displayName value to set.
     * @return the MicrosoftGraphAdministrativeUnit object itself.
     */
    public MicrosoftGraphAdministrativeUnit withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Get the visibility property: Controls whether the administrative unit and its members are hidden or public. Can
     * be set to HiddenMembership or Public. If not set, default behavior is Public. When set to HiddenMembership, only
     * members of the administrative unit can list other members of the adminstrative unit.
     * 
     * @return the visibility value.
     */
    public String visibility() {
        return this.visibility;
    }

    /**
     * Set the visibility property: Controls whether the administrative unit and its members are hidden or public. Can
     * be set to HiddenMembership or Public. If not set, default behavior is Public. When set to HiddenMembership, only
     * members of the administrative unit can list other members of the adminstrative unit.
     * 
     * @param visibility the visibility value to set.
     * @return the MicrosoftGraphAdministrativeUnit object itself.
     */
    public MicrosoftGraphAdministrativeUnit withVisibility(String visibility) {
        this.visibility = visibility;
        return this;
    }

    /**
     * Get the members property: Users and groups that are members of this Adminsitrative Unit. HTTP Methods: GET (list
     * members), POST (add members), DELETE (remove members).
     * 
     * @return the members value.
     */
    public List<MicrosoftGraphDirectoryObjectInner> members() {
        return this.members;
    }

    /**
     * Set the members property: Users and groups that are members of this Adminsitrative Unit. HTTP Methods: GET (list
     * members), POST (add members), DELETE (remove members).
     * 
     * @param members the members value to set.
     * @return the MicrosoftGraphAdministrativeUnit object itself.
     */
    public MicrosoftGraphAdministrativeUnit withMembers(List<MicrosoftGraphDirectoryObjectInner> members) {
        this.members = members;
        return this;
    }

    /**
     * Get the scopedRoleMembers property: Scoped-role members of this Administrative Unit. HTTP Methods: GET (list
     * scopedRoleMemberships), POST (add scopedRoleMembership), DELETE (remove scopedRoleMembership).
     * 
     * @return the scopedRoleMembers value.
     */
    public List<MicrosoftGraphScopedRoleMembership> scopedRoleMembers() {
        return this.scopedRoleMembers;
    }

    /**
     * Set the scopedRoleMembers property: Scoped-role members of this Administrative Unit. HTTP Methods: GET (list
     * scopedRoleMemberships), POST (add scopedRoleMembership), DELETE (remove scopedRoleMembership).
     * 
     * @param scopedRoleMembers the scopedRoleMembers value to set.
     * @return the MicrosoftGraphAdministrativeUnit object itself.
     */
    public MicrosoftGraphAdministrativeUnit
        withScopedRoleMembers(List<MicrosoftGraphScopedRoleMembership> scopedRoleMembers) {
        this.scopedRoleMembers = scopedRoleMembers;
        return this;
    }

    /**
     * Get the extensions property: The extensions property.
     * 
     * @return the extensions value.
     */
    public List<MicrosoftGraphExtension> extensions() {
        return this.extensions;
    }

    /**
     * Set the extensions property: The extensions property.
     * 
     * @param extensions the extensions value to set.
     * @return the MicrosoftGraphAdministrativeUnit object itself.
     */
    public MicrosoftGraphAdministrativeUnit withExtensions(List<MicrosoftGraphExtension> extensions) {
        this.extensions = extensions;
        return this;
    }

    /**
     * Get the additionalProperties property: Represents an Azure Active Directory object. The directoryObject type is
     * the base type for many other directory entity types.
     * 
     * @return the additionalProperties value.
     */
    public Map<String, Object> additionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties property: Represents an Azure Active Directory object. The directoryObject type is
     * the base type for many other directory entity types.
     * 
     * @param additionalProperties the additionalProperties value to set.
     * @return the MicrosoftGraphAdministrativeUnit object itself.
     */
    public MicrosoftGraphAdministrativeUnit withAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MicrosoftGraphAdministrativeUnit withDeletedDateTime(OffsetDateTime deletedDateTime) {
        super.withDeletedDateTime(deletedDateTime);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MicrosoftGraphAdministrativeUnit withId(String id) {
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
        if (members() != null) {
            members().forEach(e -> e.validate());
        }
        if (scopedRoleMembers() != null) {
            scopedRoleMembers().forEach(e -> e.validate());
        }
        if (extensions() != null) {
            extensions().forEach(e -> e.validate());
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("id", id());
        jsonWriter.writeStringField("deletedDateTime",
            deletedDateTime() == null ? null : DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(deletedDateTime()));
        jsonWriter.writeStringField("description", this.description);
        jsonWriter.writeStringField("displayName", this.displayName);
        jsonWriter.writeStringField("visibility", this.visibility);
        jsonWriter.writeArrayField("members", this.members, (writer, element) -> writer.writeJson(element));
        jsonWriter.writeArrayField("scopedRoleMembers", this.scopedRoleMembers,
            (writer, element) -> writer.writeJson(element));
        jsonWriter.writeArrayField("extensions", this.extensions, (writer, element) -> writer.writeJson(element));
        if (additionalProperties != null) {
            for (Map.Entry<String, Object> additionalProperty : additionalProperties.entrySet()) {
                jsonWriter.writeUntypedField(additionalProperty.getKey(), additionalProperty.getValue());
            }
        }
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of MicrosoftGraphAdministrativeUnit from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of MicrosoftGraphAdministrativeUnit if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the MicrosoftGraphAdministrativeUnit.
     */
    public static MicrosoftGraphAdministrativeUnit fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            MicrosoftGraphAdministrativeUnit deserializedMicrosoftGraphAdministrativeUnit
                = new MicrosoftGraphAdministrativeUnit();
            Map<String, Object> additionalProperties = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedMicrosoftGraphAdministrativeUnit.withId(reader.getString());
                } else if ("deletedDateTime".equals(fieldName)) {
                    deserializedMicrosoftGraphAdministrativeUnit.withDeletedDateTime(reader
                        .getNullable(nonNullReader -> CoreUtils.parseBestOffsetDateTime(nonNullReader.getString())));
                } else if ("description".equals(fieldName)) {
                    deserializedMicrosoftGraphAdministrativeUnit.description = reader.getString();
                } else if ("displayName".equals(fieldName)) {
                    deserializedMicrosoftGraphAdministrativeUnit.displayName = reader.getString();
                } else if ("visibility".equals(fieldName)) {
                    deserializedMicrosoftGraphAdministrativeUnit.visibility = reader.getString();
                } else if ("members".equals(fieldName)) {
                    List<MicrosoftGraphDirectoryObjectInner> members
                        = reader.readArray(reader1 -> MicrosoftGraphDirectoryObjectInner.fromJson(reader1));
                    deserializedMicrosoftGraphAdministrativeUnit.members = members;
                } else if ("scopedRoleMembers".equals(fieldName)) {
                    List<MicrosoftGraphScopedRoleMembership> scopedRoleMembers
                        = reader.readArray(reader1 -> MicrosoftGraphScopedRoleMembership.fromJson(reader1));
                    deserializedMicrosoftGraphAdministrativeUnit.scopedRoleMembers = scopedRoleMembers;
                } else if ("extensions".equals(fieldName)) {
                    List<MicrosoftGraphExtension> extensions
                        = reader.readArray(reader1 -> MicrosoftGraphExtension.fromJson(reader1));
                    deserializedMicrosoftGraphAdministrativeUnit.extensions = extensions;
                } else {
                    if (additionalProperties == null) {
                        additionalProperties = new LinkedHashMap<>();
                    }

                    additionalProperties.put(fieldName, reader.readUntyped());
                }
            }
            deserializedMicrosoftGraphAdministrativeUnit.additionalProperties = additionalProperties;

            return deserializedMicrosoftGraphAdministrativeUnit;
        });
    }
}
