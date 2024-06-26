// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.ai.vision.face.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Audit entry for a request in the session.
 */
@Immutable
public final class AuditRequestInfo {

    /*
     * The relative URL and query of the liveness request.
     */
    @Generated
    @JsonProperty(value = "url")
    private final String url;

    /*
     * The HTTP method of the request (i.e., GET, POST, DELETE).
     */
    @Generated
    @JsonProperty(value = "method")
    private final String method;

    /*
     * The length of the request body in bytes.
     */
    @Generated
    @JsonProperty(value = "contentLength")
    private Long contentLength;

    /*
     * The content type of the request.
     */
    @Generated
    @JsonProperty(value = "contentType")
    private final String contentType;

    /*
     * The user agent used to submit the request.
     */
    @Generated
    @JsonProperty(value = "userAgent")
    private String userAgent;

    /**
     * Creates an instance of AuditRequestInfo class.
     *
     * @param url the url value to set.
     * @param method the method value to set.
     * @param contentType the contentType value to set.
     */
    @Generated
    @JsonCreator
    private AuditRequestInfo(@JsonProperty(value = "url") String url, @JsonProperty(value = "method") String method,
        @JsonProperty(value = "contentType") String contentType) {
        this.url = url;
        this.method = method;
        this.contentType = contentType;
    }

    /**
     * Get the url property: The relative URL and query of the liveness request.
     *
     * @return the url value.
     */
    @Generated
    public String getUrl() {
        return this.url;
    }

    /**
     * Get the method property: The HTTP method of the request (i.e., GET, POST, DELETE).
     *
     * @return the method value.
     */
    @Generated
    public String getMethod() {
        return this.method;
    }

    /**
     * Get the contentLength property: The length of the request body in bytes.
     *
     * @return the contentLength value.
     */
    @Generated
    public Long getContentLength() {
        return this.contentLength;
    }

    /**
     * Get the contentType property: The content type of the request.
     *
     * @return the contentType value.
     */
    @Generated
    public String getContentType() {
        return this.contentType;
    }

    /**
     * Get the userAgent property: The user agent used to submit the request.
     *
     * @return the userAgent value.
     */
    @Generated
    public String getUserAgent() {
        return this.userAgent;
    }
}
