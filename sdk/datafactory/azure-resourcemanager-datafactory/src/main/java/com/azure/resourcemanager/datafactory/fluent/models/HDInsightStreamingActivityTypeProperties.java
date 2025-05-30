// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.datafactory.models.HDInsightActivityDebugInfoOption;
import com.azure.resourcemanager.datafactory.models.LinkedServiceReference;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/**
 * HDInsight streaming activity properties.
 */
@Fluent
public final class HDInsightStreamingActivityTypeProperties
    implements JsonSerializable<HDInsightStreamingActivityTypeProperties> {
    /*
     * Storage linked service references.
     */
    private List<LinkedServiceReference> storageLinkedServices;

    /*
     * User specified arguments to HDInsightActivity.
     */
    private List<Object> arguments;

    /*
     * Debug info option.
     */
    private HDInsightActivityDebugInfoOption getDebugInfo;

    /*
     * Mapper executable name. Type: string (or Expression with resultType string).
     */
    private Object mapper;

    /*
     * Reducer executable name. Type: string (or Expression with resultType string).
     */
    private Object reducer;

    /*
     * Input blob path. Type: string (or Expression with resultType string).
     */
    private Object input;

    /*
     * Output blob path. Type: string (or Expression with resultType string).
     */
    private Object output;

    /*
     * Paths to streaming job files. Can be directories.
     */
    private List<Object> filePaths;

    /*
     * Linked service reference where the files are located.
     */
    private LinkedServiceReference fileLinkedService;

    /*
     * Combiner executable name. Type: string (or Expression with resultType string).
     */
    private Object combiner;

    /*
     * Command line environment values.
     */
    private List<Object> commandEnvironment;

    /*
     * Allows user to specify defines for streaming job request.
     */
    private Map<String, Object> defines;

    /**
     * Creates an instance of HDInsightStreamingActivityTypeProperties class.
     */
    public HDInsightStreamingActivityTypeProperties() {
    }

    /**
     * Get the storageLinkedServices property: Storage linked service references.
     * 
     * @return the storageLinkedServices value.
     */
    public List<LinkedServiceReference> storageLinkedServices() {
        return this.storageLinkedServices;
    }

    /**
     * Set the storageLinkedServices property: Storage linked service references.
     * 
     * @param storageLinkedServices the storageLinkedServices value to set.
     * @return the HDInsightStreamingActivityTypeProperties object itself.
     */
    public HDInsightStreamingActivityTypeProperties
        withStorageLinkedServices(List<LinkedServiceReference> storageLinkedServices) {
        this.storageLinkedServices = storageLinkedServices;
        return this;
    }

    /**
     * Get the arguments property: User specified arguments to HDInsightActivity.
     * 
     * @return the arguments value.
     */
    public List<Object> arguments() {
        return this.arguments;
    }

    /**
     * Set the arguments property: User specified arguments to HDInsightActivity.
     * 
     * @param arguments the arguments value to set.
     * @return the HDInsightStreamingActivityTypeProperties object itself.
     */
    public HDInsightStreamingActivityTypeProperties withArguments(List<Object> arguments) {
        this.arguments = arguments;
        return this;
    }

    /**
     * Get the getDebugInfo property: Debug info option.
     * 
     * @return the getDebugInfo value.
     */
    public HDInsightActivityDebugInfoOption getDebugInfo() {
        return this.getDebugInfo;
    }

    /**
     * Set the getDebugInfo property: Debug info option.
     * 
     * @param getDebugInfo the getDebugInfo value to set.
     * @return the HDInsightStreamingActivityTypeProperties object itself.
     */
    public HDInsightStreamingActivityTypeProperties withGetDebugInfo(HDInsightActivityDebugInfoOption getDebugInfo) {
        this.getDebugInfo = getDebugInfo;
        return this;
    }

    /**
     * Get the mapper property: Mapper executable name. Type: string (or Expression with resultType string).
     * 
     * @return the mapper value.
     */
    public Object mapper() {
        return this.mapper;
    }

    /**
     * Set the mapper property: Mapper executable name. Type: string (or Expression with resultType string).
     * 
     * @param mapper the mapper value to set.
     * @return the HDInsightStreamingActivityTypeProperties object itself.
     */
    public HDInsightStreamingActivityTypeProperties withMapper(Object mapper) {
        this.mapper = mapper;
        return this;
    }

    /**
     * Get the reducer property: Reducer executable name. Type: string (or Expression with resultType string).
     * 
     * @return the reducer value.
     */
    public Object reducer() {
        return this.reducer;
    }

    /**
     * Set the reducer property: Reducer executable name. Type: string (or Expression with resultType string).
     * 
     * @param reducer the reducer value to set.
     * @return the HDInsightStreamingActivityTypeProperties object itself.
     */
    public HDInsightStreamingActivityTypeProperties withReducer(Object reducer) {
        this.reducer = reducer;
        return this;
    }

    /**
     * Get the input property: Input blob path. Type: string (or Expression with resultType string).
     * 
     * @return the input value.
     */
    public Object input() {
        return this.input;
    }

    /**
     * Set the input property: Input blob path. Type: string (or Expression with resultType string).
     * 
     * @param input the input value to set.
     * @return the HDInsightStreamingActivityTypeProperties object itself.
     */
    public HDInsightStreamingActivityTypeProperties withInput(Object input) {
        this.input = input;
        return this;
    }

    /**
     * Get the output property: Output blob path. Type: string (or Expression with resultType string).
     * 
     * @return the output value.
     */
    public Object output() {
        return this.output;
    }

    /**
     * Set the output property: Output blob path. Type: string (or Expression with resultType string).
     * 
     * @param output the output value to set.
     * @return the HDInsightStreamingActivityTypeProperties object itself.
     */
    public HDInsightStreamingActivityTypeProperties withOutput(Object output) {
        this.output = output;
        return this;
    }

    /**
     * Get the filePaths property: Paths to streaming job files. Can be directories.
     * 
     * @return the filePaths value.
     */
    public List<Object> filePaths() {
        return this.filePaths;
    }

    /**
     * Set the filePaths property: Paths to streaming job files. Can be directories.
     * 
     * @param filePaths the filePaths value to set.
     * @return the HDInsightStreamingActivityTypeProperties object itself.
     */
    public HDInsightStreamingActivityTypeProperties withFilePaths(List<Object> filePaths) {
        this.filePaths = filePaths;
        return this;
    }

    /**
     * Get the fileLinkedService property: Linked service reference where the files are located.
     * 
     * @return the fileLinkedService value.
     */
    public LinkedServiceReference fileLinkedService() {
        return this.fileLinkedService;
    }

    /**
     * Set the fileLinkedService property: Linked service reference where the files are located.
     * 
     * @param fileLinkedService the fileLinkedService value to set.
     * @return the HDInsightStreamingActivityTypeProperties object itself.
     */
    public HDInsightStreamingActivityTypeProperties withFileLinkedService(LinkedServiceReference fileLinkedService) {
        this.fileLinkedService = fileLinkedService;
        return this;
    }

    /**
     * Get the combiner property: Combiner executable name. Type: string (or Expression with resultType string).
     * 
     * @return the combiner value.
     */
    public Object combiner() {
        return this.combiner;
    }

    /**
     * Set the combiner property: Combiner executable name. Type: string (or Expression with resultType string).
     * 
     * @param combiner the combiner value to set.
     * @return the HDInsightStreamingActivityTypeProperties object itself.
     */
    public HDInsightStreamingActivityTypeProperties withCombiner(Object combiner) {
        this.combiner = combiner;
        return this;
    }

    /**
     * Get the commandEnvironment property: Command line environment values.
     * 
     * @return the commandEnvironment value.
     */
    public List<Object> commandEnvironment() {
        return this.commandEnvironment;
    }

    /**
     * Set the commandEnvironment property: Command line environment values.
     * 
     * @param commandEnvironment the commandEnvironment value to set.
     * @return the HDInsightStreamingActivityTypeProperties object itself.
     */
    public HDInsightStreamingActivityTypeProperties withCommandEnvironment(List<Object> commandEnvironment) {
        this.commandEnvironment = commandEnvironment;
        return this;
    }

    /**
     * Get the defines property: Allows user to specify defines for streaming job request.
     * 
     * @return the defines value.
     */
    public Map<String, Object> defines() {
        return this.defines;
    }

    /**
     * Set the defines property: Allows user to specify defines for streaming job request.
     * 
     * @param defines the defines value to set.
     * @return the HDInsightStreamingActivityTypeProperties object itself.
     */
    public HDInsightStreamingActivityTypeProperties withDefines(Map<String, Object> defines) {
        this.defines = defines;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (storageLinkedServices() != null) {
            storageLinkedServices().forEach(e -> e.validate());
        }
        if (mapper() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property mapper in model HDInsightStreamingActivityTypeProperties"));
        }
        if (reducer() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property reducer in model HDInsightStreamingActivityTypeProperties"));
        }
        if (input() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property input in model HDInsightStreamingActivityTypeProperties"));
        }
        if (output() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property output in model HDInsightStreamingActivityTypeProperties"));
        }
        if (filePaths() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property filePaths in model HDInsightStreamingActivityTypeProperties"));
        }
        if (fileLinkedService() != null) {
            fileLinkedService().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(HDInsightStreamingActivityTypeProperties.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeUntypedField("mapper", this.mapper);
        jsonWriter.writeUntypedField("reducer", this.reducer);
        jsonWriter.writeUntypedField("input", this.input);
        jsonWriter.writeUntypedField("output", this.output);
        jsonWriter.writeArrayField("filePaths", this.filePaths, (writer, element) -> writer.writeUntyped(element));
        jsonWriter.writeArrayField("storageLinkedServices", this.storageLinkedServices,
            (writer, element) -> writer.writeJson(element));
        jsonWriter.writeArrayField("arguments", this.arguments, (writer, element) -> writer.writeUntyped(element));
        jsonWriter.writeStringField("getDebugInfo", this.getDebugInfo == null ? null : this.getDebugInfo.toString());
        jsonWriter.writeJsonField("fileLinkedService", this.fileLinkedService);
        if (this.combiner != null) {
            jsonWriter.writeUntypedField("combiner", this.combiner);
        }
        jsonWriter.writeArrayField("commandEnvironment", this.commandEnvironment,
            (writer, element) -> writer.writeUntyped(element));
        jsonWriter.writeMapField("defines", this.defines, (writer, element) -> writer.writeUntyped(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of HDInsightStreamingActivityTypeProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of HDInsightStreamingActivityTypeProperties if the JsonReader was pointing to an instance of
     * it, or null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the HDInsightStreamingActivityTypeProperties.
     */
    public static HDInsightStreamingActivityTypeProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            HDInsightStreamingActivityTypeProperties deserializedHDInsightStreamingActivityTypeProperties
                = new HDInsightStreamingActivityTypeProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("mapper".equals(fieldName)) {
                    deserializedHDInsightStreamingActivityTypeProperties.mapper = reader.readUntyped();
                } else if ("reducer".equals(fieldName)) {
                    deserializedHDInsightStreamingActivityTypeProperties.reducer = reader.readUntyped();
                } else if ("input".equals(fieldName)) {
                    deserializedHDInsightStreamingActivityTypeProperties.input = reader.readUntyped();
                } else if ("output".equals(fieldName)) {
                    deserializedHDInsightStreamingActivityTypeProperties.output = reader.readUntyped();
                } else if ("filePaths".equals(fieldName)) {
                    List<Object> filePaths = reader.readArray(reader1 -> reader1.readUntyped());
                    deserializedHDInsightStreamingActivityTypeProperties.filePaths = filePaths;
                } else if ("storageLinkedServices".equals(fieldName)) {
                    List<LinkedServiceReference> storageLinkedServices
                        = reader.readArray(reader1 -> LinkedServiceReference.fromJson(reader1));
                    deserializedHDInsightStreamingActivityTypeProperties.storageLinkedServices = storageLinkedServices;
                } else if ("arguments".equals(fieldName)) {
                    List<Object> arguments = reader.readArray(reader1 -> reader1.readUntyped());
                    deserializedHDInsightStreamingActivityTypeProperties.arguments = arguments;
                } else if ("getDebugInfo".equals(fieldName)) {
                    deserializedHDInsightStreamingActivityTypeProperties.getDebugInfo
                        = HDInsightActivityDebugInfoOption.fromString(reader.getString());
                } else if ("fileLinkedService".equals(fieldName)) {
                    deserializedHDInsightStreamingActivityTypeProperties.fileLinkedService
                        = LinkedServiceReference.fromJson(reader);
                } else if ("combiner".equals(fieldName)) {
                    deserializedHDInsightStreamingActivityTypeProperties.combiner = reader.readUntyped();
                } else if ("commandEnvironment".equals(fieldName)) {
                    List<Object> commandEnvironment = reader.readArray(reader1 -> reader1.readUntyped());
                    deserializedHDInsightStreamingActivityTypeProperties.commandEnvironment = commandEnvironment;
                } else if ("defines".equals(fieldName)) {
                    Map<String, Object> defines = reader.readMap(reader1 -> reader1.readUntyped());
                    deserializedHDInsightStreamingActivityTypeProperties.defines = defines;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedHDInsightStreamingActivityTypeProperties;
        });
    }
}
