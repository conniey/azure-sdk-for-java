// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dataprotection.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * Prefix criteria to be used to during restore.
 */
@Fluent
public final class ItemPathBasedRestoreCriteria extends ItemLevelRestoreCriteria {
    /*
     * Type of the specific object - used for deserializing
     */
    private String objectType = "ItemPathBasedRestoreCriteria";

    /*
     * The path of the item to be restored. It could be the full path of the item or the path relative to the backup
     * item
     */
    private String itemPath;

    /*
     * Flag to specify if the path is relative to backup item or full path
     */
    private boolean isPathRelativeToBackupItem;

    /*
     * The list of prefix strings to be used as filter criteria during restore. These are relative to the item path
     * specified.
     */
    private List<String> subItemPathPrefix;

    /**
     * Creates an instance of ItemPathBasedRestoreCriteria class.
     */
    public ItemPathBasedRestoreCriteria() {
    }

    /**
     * Get the objectType property: Type of the specific object - used for deserializing.
     * 
     * @return the objectType value.
     */
    @Override
    public String objectType() {
        return this.objectType;
    }

    /**
     * Get the itemPath property: The path of the item to be restored. It could be the full path of the item or the path
     * relative to the backup item.
     * 
     * @return the itemPath value.
     */
    public String itemPath() {
        return this.itemPath;
    }

    /**
     * Set the itemPath property: The path of the item to be restored. It could be the full path of the item or the path
     * relative to the backup item.
     * 
     * @param itemPath the itemPath value to set.
     * @return the ItemPathBasedRestoreCriteria object itself.
     */
    public ItemPathBasedRestoreCriteria withItemPath(String itemPath) {
        this.itemPath = itemPath;
        return this;
    }

    /**
     * Get the isPathRelativeToBackupItem property: Flag to specify if the path is relative to backup item or full path.
     * 
     * @return the isPathRelativeToBackupItem value.
     */
    public boolean isPathRelativeToBackupItem() {
        return this.isPathRelativeToBackupItem;
    }

    /**
     * Set the isPathRelativeToBackupItem property: Flag to specify if the path is relative to backup item or full path.
     * 
     * @param isPathRelativeToBackupItem the isPathRelativeToBackupItem value to set.
     * @return the ItemPathBasedRestoreCriteria object itself.
     */
    public ItemPathBasedRestoreCriteria withIsPathRelativeToBackupItem(boolean isPathRelativeToBackupItem) {
        this.isPathRelativeToBackupItem = isPathRelativeToBackupItem;
        return this;
    }

    /**
     * Get the subItemPathPrefix property: The list of prefix strings to be used as filter criteria during restore.
     * These are relative to the item path specified.
     * 
     * @return the subItemPathPrefix value.
     */
    public List<String> subItemPathPrefix() {
        return this.subItemPathPrefix;
    }

    /**
     * Set the subItemPathPrefix property: The list of prefix strings to be used as filter criteria during restore.
     * These are relative to the item path specified.
     * 
     * @param subItemPathPrefix the subItemPathPrefix value to set.
     * @return the ItemPathBasedRestoreCriteria object itself.
     */
    public ItemPathBasedRestoreCriteria withSubItemPathPrefix(List<String> subItemPathPrefix) {
        this.subItemPathPrefix = subItemPathPrefix;
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
        if (itemPath() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property itemPath in model ItemPathBasedRestoreCriteria"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(ItemPathBasedRestoreCriteria.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("itemPath", this.itemPath);
        jsonWriter.writeBooleanField("isPathRelativeToBackupItem", this.isPathRelativeToBackupItem);
        jsonWriter.writeStringField("objectType", this.objectType);
        jsonWriter.writeArrayField("subItemPathPrefix", this.subItemPathPrefix,
            (writer, element) -> writer.writeString(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ItemPathBasedRestoreCriteria from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ItemPathBasedRestoreCriteria if the JsonReader was pointing to an instance of it, or null
     * if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the ItemPathBasedRestoreCriteria.
     */
    public static ItemPathBasedRestoreCriteria fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ItemPathBasedRestoreCriteria deserializedItemPathBasedRestoreCriteria = new ItemPathBasedRestoreCriteria();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("itemPath".equals(fieldName)) {
                    deserializedItemPathBasedRestoreCriteria.itemPath = reader.getString();
                } else if ("isPathRelativeToBackupItem".equals(fieldName)) {
                    deserializedItemPathBasedRestoreCriteria.isPathRelativeToBackupItem = reader.getBoolean();
                } else if ("objectType".equals(fieldName)) {
                    deserializedItemPathBasedRestoreCriteria.objectType = reader.getString();
                } else if ("subItemPathPrefix".equals(fieldName)) {
                    List<String> subItemPathPrefix = reader.readArray(reader1 -> reader1.getString());
                    deserializedItemPathBasedRestoreCriteria.subItemPathPrefix = subItemPathPrefix;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedItemPathBasedRestoreCriteria;
        });
    }
}
