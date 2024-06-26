// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * The GitHubAccessTokenResponse model.
 */
@Fluent
public final class GitHubAccessTokenResponse implements JsonSerializable<GitHubAccessTokenResponse> {
    /*
     * The gitHubAccessToken property.
     */
    private String gitHubAccessToken;

    /**
     * Creates an instance of GitHubAccessTokenResponse class.
     */
    public GitHubAccessTokenResponse() {
    }

    /**
     * Get the gitHubAccessToken property: The gitHubAccessToken property.
     * 
     * @return the gitHubAccessToken value.
     */
    public String getGitHubAccessToken() {
        return this.gitHubAccessToken;
    }

    /**
     * Set the gitHubAccessToken property: The gitHubAccessToken property.
     * 
     * @param gitHubAccessToken the gitHubAccessToken value to set.
     * @return the GitHubAccessTokenResponse object itself.
     */
    public GitHubAccessTokenResponse setGitHubAccessToken(String gitHubAccessToken) {
        this.gitHubAccessToken = gitHubAccessToken;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("gitHubAccessToken", this.gitHubAccessToken);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of GitHubAccessTokenResponse from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of GitHubAccessTokenResponse if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the GitHubAccessTokenResponse.
     */
    public static GitHubAccessTokenResponse fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            GitHubAccessTokenResponse deserializedGitHubAccessTokenResponse = new GitHubAccessTokenResponse();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("gitHubAccessToken".equals(fieldName)) {
                    deserializedGitHubAccessTokenResponse.gitHubAccessToken = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedGitHubAccessTokenResponse;
        });
    }
}
