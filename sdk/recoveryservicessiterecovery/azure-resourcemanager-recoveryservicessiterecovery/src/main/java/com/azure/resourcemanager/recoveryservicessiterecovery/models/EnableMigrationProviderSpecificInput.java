// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.models;

import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Enable migration provider specific input.
 */
@Immutable
public class EnableMigrationProviderSpecificInput implements JsonSerializable<EnableMigrationProviderSpecificInput> {
    /*
     * The class type.
     */
    private String instanceType = "EnableMigrationProviderSpecificInput";

    /**
     * Creates an instance of EnableMigrationProviderSpecificInput class.
     */
    public EnableMigrationProviderSpecificInput() {
    }

    /**
     * Get the instanceType property: The class type.
     * 
     * @return the instanceType value.
     */
    public String instanceType() {
        return this.instanceType;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("instanceType", this.instanceType);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of EnableMigrationProviderSpecificInput from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of EnableMigrationProviderSpecificInput if the JsonReader was pointing to an instance of it,
     * or null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the EnableMigrationProviderSpecificInput.
     */
    public static EnableMigrationProviderSpecificInput fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            String discriminatorValue = null;
            try (JsonReader readerToUse = reader.bufferObject()) {
                readerToUse.nextToken(); // Prepare for reading
                while (readerToUse.nextToken() != JsonToken.END_OBJECT) {
                    String fieldName = readerToUse.getFieldName();
                    readerToUse.nextToken();
                    if ("instanceType".equals(fieldName)) {
                        discriminatorValue = readerToUse.getString();
                        break;
                    } else {
                        readerToUse.skipChildren();
                    }
                }
                // Use the discriminator value to determine which subtype should be deserialized.
                if ("VMwareCbt".equals(discriminatorValue)) {
                    return VMwareCbtEnableMigrationInput.fromJson(readerToUse.reset());
                } else {
                    return fromJsonKnownDiscriminator(readerToUse.reset());
                }
            }
        });
    }

    static EnableMigrationProviderSpecificInput fromJsonKnownDiscriminator(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            EnableMigrationProviderSpecificInput deserializedEnableMigrationProviderSpecificInput
                = new EnableMigrationProviderSpecificInput();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("instanceType".equals(fieldName)) {
                    deserializedEnableMigrationProviderSpecificInput.instanceType = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedEnableMigrationProviderSpecificInput;
        });
    }
}
