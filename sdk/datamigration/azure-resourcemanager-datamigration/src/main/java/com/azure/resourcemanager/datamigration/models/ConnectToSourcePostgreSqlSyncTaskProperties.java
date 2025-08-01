// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datamigration.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.exception.ManagementError;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.datamigration.fluent.models.CommandPropertiesInner;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/**
 * Properties for the task that validates connection to PostgreSQL server and source server requirements for online
 * migration.
 */
@Fluent
public final class ConnectToSourcePostgreSqlSyncTaskProperties extends ProjectTaskProperties {
    /*
     * Task type.
     */
    private TaskType taskType = TaskType.CONNECT_TO_SOURCE_POSTGRE_SQL_SYNC;

    /*
     * Task input
     */
    private ConnectToSourcePostgreSqlSyncTaskInput input;

    /*
     * Task output. This is ignored if submitted.
     */
    private List<ConnectToSourcePostgreSqlSyncTaskOutput> output;

    /**
     * Creates an instance of ConnectToSourcePostgreSqlSyncTaskProperties class.
     */
    public ConnectToSourcePostgreSqlSyncTaskProperties() {
    }

    /**
     * Get the taskType property: Task type.
     * 
     * @return the taskType value.
     */
    @Override
    public TaskType taskType() {
        return this.taskType;
    }

    /**
     * Get the input property: Task input.
     * 
     * @return the input value.
     */
    public ConnectToSourcePostgreSqlSyncTaskInput input() {
        return this.input;
    }

    /**
     * Set the input property: Task input.
     * 
     * @param input the input value to set.
     * @return the ConnectToSourcePostgreSqlSyncTaskProperties object itself.
     */
    public ConnectToSourcePostgreSqlSyncTaskProperties withInput(ConnectToSourcePostgreSqlSyncTaskInput input) {
        this.input = input;
        return this;
    }

    /**
     * Get the output property: Task output. This is ignored if submitted.
     * 
     * @return the output value.
     */
    public List<ConnectToSourcePostgreSqlSyncTaskOutput> output() {
        return this.output;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ConnectToSourcePostgreSqlSyncTaskProperties withClientData(Map<String, String> clientData) {
        super.withClientData(clientData);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        if (input() != null) {
            input().validate();
        }
        if (output() != null) {
            output().forEach(e -> e.validate());
        }
        if (commands() != null) {
            commands().forEach(e -> e.validate());
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeMapField("clientData", clientData(), (writer, element) -> writer.writeString(element));
        jsonWriter.writeStringField("taskType", this.taskType == null ? null : this.taskType.toString());
        jsonWriter.writeJsonField("input", this.input);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ConnectToSourcePostgreSqlSyncTaskProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ConnectToSourcePostgreSqlSyncTaskProperties if the JsonReader was pointing to an instance
     * of it, or null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the ConnectToSourcePostgreSqlSyncTaskProperties.
     */
    public static ConnectToSourcePostgreSqlSyncTaskProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ConnectToSourcePostgreSqlSyncTaskProperties deserializedConnectToSourcePostgreSqlSyncTaskProperties
                = new ConnectToSourcePostgreSqlSyncTaskProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("errors".equals(fieldName)) {
                    List<ManagementError> errors = reader.readArray(reader1 -> ManagementError.fromJson(reader1));
                    deserializedConnectToSourcePostgreSqlSyncTaskProperties.withErrors(errors);
                } else if ("state".equals(fieldName)) {
                    deserializedConnectToSourcePostgreSqlSyncTaskProperties
                        .withState(TaskState.fromString(reader.getString()));
                } else if ("commands".equals(fieldName)) {
                    List<CommandPropertiesInner> commands
                        = reader.readArray(reader1 -> CommandPropertiesInner.fromJson(reader1));
                    deserializedConnectToSourcePostgreSqlSyncTaskProperties.withCommands(commands);
                } else if ("clientData".equals(fieldName)) {
                    Map<String, String> clientData = reader.readMap(reader1 -> reader1.getString());
                    deserializedConnectToSourcePostgreSqlSyncTaskProperties.withClientData(clientData);
                } else if ("taskType".equals(fieldName)) {
                    deserializedConnectToSourcePostgreSqlSyncTaskProperties.taskType
                        = TaskType.fromString(reader.getString());
                } else if ("input".equals(fieldName)) {
                    deserializedConnectToSourcePostgreSqlSyncTaskProperties.input
                        = ConnectToSourcePostgreSqlSyncTaskInput.fromJson(reader);
                } else if ("output".equals(fieldName)) {
                    List<ConnectToSourcePostgreSqlSyncTaskOutput> output
                        = reader.readArray(reader1 -> ConnectToSourcePostgreSqlSyncTaskOutput.fromJson(reader1));
                    deserializedConnectToSourcePostgreSqlSyncTaskProperties.output = output;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedConnectToSourcePostgreSqlSyncTaskProperties;
        });
    }
}
