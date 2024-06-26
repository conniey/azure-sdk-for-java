// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.streamanalytics.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.streamanalytics.models.Encoding;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The properties that are associated with the CSV serialization type.
 */
@Fluent
public final class CsvSerializationProperties {
    /*
     * Specifies the delimiter that will be used to separate comma-separated value (CSV) records. See
     * https://docs.microsoft.com/en-us/rest/api/streamanalytics/stream-analytics-input or
     * https://docs.microsoft.com/en-us/rest/api/streamanalytics/stream-analytics-output for a list of supported
     * values. Required on PUT (CreateOrReplace) requests.
     */
    @JsonProperty(value = "fieldDelimiter")
    private String fieldDelimiter;

    /*
     * Specifies the encoding of the incoming data in the case of input and the encoding of outgoing data in the case
     * of output. Required on PUT (CreateOrReplace) requests.
     */
    @JsonProperty(value = "encoding")
    private Encoding encoding;

    /**
     * Creates an instance of CsvSerializationProperties class.
     */
    public CsvSerializationProperties() {
    }

    /**
     * Get the fieldDelimiter property: Specifies the delimiter that will be used to separate comma-separated value
     * (CSV) records. See https://docs.microsoft.com/en-us/rest/api/streamanalytics/stream-analytics-input or
     * https://docs.microsoft.com/en-us/rest/api/streamanalytics/stream-analytics-output for a list of supported
     * values. Required on PUT (CreateOrReplace) requests.
     * 
     * @return the fieldDelimiter value.
     */
    public String fieldDelimiter() {
        return this.fieldDelimiter;
    }

    /**
     * Set the fieldDelimiter property: Specifies the delimiter that will be used to separate comma-separated value
     * (CSV) records. See https://docs.microsoft.com/en-us/rest/api/streamanalytics/stream-analytics-input or
     * https://docs.microsoft.com/en-us/rest/api/streamanalytics/stream-analytics-output for a list of supported
     * values. Required on PUT (CreateOrReplace) requests.
     * 
     * @param fieldDelimiter the fieldDelimiter value to set.
     * @return the CsvSerializationProperties object itself.
     */
    public CsvSerializationProperties withFieldDelimiter(String fieldDelimiter) {
        this.fieldDelimiter = fieldDelimiter;
        return this;
    }

    /**
     * Get the encoding property: Specifies the encoding of the incoming data in the case of input and the encoding of
     * outgoing data in the case of output. Required on PUT (CreateOrReplace) requests.
     * 
     * @return the encoding value.
     */
    public Encoding encoding() {
        return this.encoding;
    }

    /**
     * Set the encoding property: Specifies the encoding of the incoming data in the case of input and the encoding of
     * outgoing data in the case of output. Required on PUT (CreateOrReplace) requests.
     * 
     * @param encoding the encoding value to set.
     * @return the CsvSerializationProperties object itself.
     */
    public CsvSerializationProperties withEncoding(Encoding encoding) {
        this.encoding = encoding;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
