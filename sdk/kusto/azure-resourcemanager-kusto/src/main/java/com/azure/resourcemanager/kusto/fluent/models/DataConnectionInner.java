// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.kusto.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.kusto.models.CosmosDbDataConnection;
import com.azure.resourcemanager.kusto.models.DataConnectionKind;
import com.azure.resourcemanager.kusto.models.EventGridDataConnection;
import com.azure.resourcemanager.kusto.models.EventHubDataConnection;
import com.azure.resourcemanager.kusto.models.IotHubDataConnection;
import java.io.IOException;

/**
 * Class representing an data connection.
 */
@Fluent
public class DataConnectionInner extends ProxyResource {
    /*
     * Kind of the endpoint for the data connection
     */
    private DataConnectionKind kind = DataConnectionKind.fromString("DataConnection");

    /*
     * Resource location.
     */
    private String location;

    /*
     * The type of the resource.
     */
    private String type;

    /*
     * The name of the resource.
     */
    private String name;

    /*
     * Fully qualified resource Id for the resource.
     */
    private String id;

    /**
     * Creates an instance of DataConnectionInner class.
     */
    public DataConnectionInner() {
    }

    /**
     * Get the kind property: Kind of the endpoint for the data connection.
     * 
     * @return the kind value.
     */
    public DataConnectionKind kind() {
        return this.kind;
    }

    /**
     * Get the location property: Resource location.
     * 
     * @return the location value.
     */
    public String location() {
        return this.location;
    }

    /**
     * Set the location property: Resource location.
     * 
     * @param location the location value to set.
     * @return the DataConnectionInner object itself.
     */
    public DataConnectionInner withLocation(String location) {
        this.location = location;
        return this;
    }

    /**
     * Get the type property: The type of the resource.
     * 
     * @return the type value.
     */
    @Override
    public String type() {
        return this.type;
    }

    /**
     * Get the name property: The name of the resource.
     * 
     * @return the name value.
     */
    @Override
    public String name() {
        return this.name;
    }

    /**
     * Get the id property: Fully qualified resource Id for the resource.
     * 
     * @return the id value.
     */
    @Override
    public String id() {
        return this.id;
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
        jsonWriter.writeStringField("kind", this.kind == null ? null : this.kind.toString());
        jsonWriter.writeStringField("location", this.location);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of DataConnectionInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of DataConnectionInner if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the DataConnectionInner.
     */
    public static DataConnectionInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            String discriminatorValue = null;
            try (JsonReader readerToUse = reader.bufferObject()) {
                readerToUse.nextToken(); // Prepare for reading
                while (readerToUse.nextToken() != JsonToken.END_OBJECT) {
                    String fieldName = readerToUse.getFieldName();
                    readerToUse.nextToken();
                    if ("kind".equals(fieldName)) {
                        discriminatorValue = readerToUse.getString();
                        break;
                    } else {
                        readerToUse.skipChildren();
                    }
                }
                // Use the discriminator value to determine which subtype should be deserialized.
                if ("EventHub".equals(discriminatorValue)) {
                    return EventHubDataConnection.fromJson(readerToUse.reset());
                } else if ("IotHub".equals(discriminatorValue)) {
                    return IotHubDataConnection.fromJson(readerToUse.reset());
                } else if ("EventGrid".equals(discriminatorValue)) {
                    return EventGridDataConnection.fromJson(readerToUse.reset());
                } else if ("CosmosDb".equals(discriminatorValue)) {
                    return CosmosDbDataConnection.fromJson(readerToUse.reset());
                } else {
                    return fromJsonKnownDiscriminator(readerToUse.reset());
                }
            }
        });
    }

    static DataConnectionInner fromJsonKnownDiscriminator(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            DataConnectionInner deserializedDataConnectionInner = new DataConnectionInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedDataConnectionInner.id = reader.getString();
                } else if ("name".equals(fieldName)) {
                    deserializedDataConnectionInner.name = reader.getString();
                } else if ("type".equals(fieldName)) {
                    deserializedDataConnectionInner.type = reader.getString();
                } else if ("kind".equals(fieldName)) {
                    deserializedDataConnectionInner.kind = DataConnectionKind.fromString(reader.getString());
                } else if ("location".equals(fieldName)) {
                    deserializedDataConnectionInner.location = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedDataConnectionInner;
        });
    }
}
