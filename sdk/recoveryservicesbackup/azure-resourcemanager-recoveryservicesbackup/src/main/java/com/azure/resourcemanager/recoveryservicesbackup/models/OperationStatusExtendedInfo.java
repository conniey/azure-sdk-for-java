// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.models;

import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Base class for additional information of operation status.
 */
@Immutable
public class OperationStatusExtendedInfo implements JsonSerializable<OperationStatusExtendedInfo> {
    /*
     * This property will be used as the discriminator for deciding the specific types in the polymorphic chain of
     * types.
     */
    private String objectType = "OperationStatusExtendedInfo";

    /**
     * Creates an instance of OperationStatusExtendedInfo class.
     */
    public OperationStatusExtendedInfo() {
    }

    /**
     * Get the objectType property: This property will be used as the discriminator for deciding the specific types in
     * the polymorphic chain of types.
     * 
     * @return the objectType value.
     */
    public String objectType() {
        return this.objectType;
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
        jsonWriter.writeStringField("objectType", this.objectType);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of OperationStatusExtendedInfo from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of OperationStatusExtendedInfo if the JsonReader was pointing to an instance of it, or null
     * if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the OperationStatusExtendedInfo.
     */
    public static OperationStatusExtendedInfo fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            String discriminatorValue = null;
            try (JsonReader readerToUse = reader.bufferObject()) {
                readerToUse.nextToken(); // Prepare for reading
                while (readerToUse.nextToken() != JsonToken.END_OBJECT) {
                    String fieldName = readerToUse.getFieldName();
                    readerToUse.nextToken();
                    if ("objectType".equals(fieldName)) {
                        discriminatorValue = readerToUse.getString();
                        break;
                    } else {
                        readerToUse.skipChildren();
                    }
                }
                // Use the discriminator value to determine which subtype should be deserialized.
                if ("OperationStatusJobExtendedInfo".equals(discriminatorValue)) {
                    return OperationStatusJobExtendedInfo.fromJson(readerToUse.reset());
                } else if ("OperationStatusJobsExtendedInfo".equals(discriminatorValue)) {
                    return OperationStatusJobsExtendedInfo.fromJson(readerToUse.reset());
                } else if ("OperationStatusProvisionILRExtendedInfo".equals(discriminatorValue)) {
                    return OperationStatusProvisionIlrExtendedInfo.fromJson(readerToUse.reset());
                } else if ("OperationStatusValidateOperationExtendedInfo".equals(discriminatorValue)) {
                    return OperationStatusValidateOperationExtendedInfo.fromJson(readerToUse.reset());
                } else {
                    return fromJsonKnownDiscriminator(readerToUse.reset());
                }
            }
        });
    }

    static OperationStatusExtendedInfo fromJsonKnownDiscriminator(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            OperationStatusExtendedInfo deserializedOperationStatusExtendedInfo = new OperationStatusExtendedInfo();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("objectType".equals(fieldName)) {
                    deserializedOperationStatusExtendedInfo.objectType = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedOperationStatusExtendedInfo;
        });
    }
}
