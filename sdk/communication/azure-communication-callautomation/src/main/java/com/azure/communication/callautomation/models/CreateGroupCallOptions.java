// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.communication.callautomation.models;

import java.util.List;

import com.azure.communication.common.CommunicationIdentifier;
import com.azure.communication.common.PhoneNumberIdentifier;
import com.azure.communication.common.MicrosoftTeamsAppIdentifier;
import com.azure.core.annotation.Fluent;

/**
 * The options for creating a group call.
 */
@Fluent
public final class CreateGroupCallOptions {
    /**
     * The targets of the call.
     */
    private final List<CommunicationIdentifier> targetParticipants;

    /**
     * The call back URI.
     */
    private final String callbackUrl;

    /**
     * A customer set value used to track the answering of a call.
     */
    private String operationContext;

    /**
     * Media Streaming Configuration.
     */
    private MediaStreamingOptions mediaStreamingOptions;

    /**
     * Transcription Configuration.
     */
    private TranscriptionOptions transcriptionOptions;

    /**
     * Display name for call source
     */
    private String sourceDisplayName;

    /**
     * PhoneNumber for call source when making PSTN call
     */
    private PhoneNumberIdentifier sourceCallIdNumber;

    /*
     * AI options for the call
     */
    private CallIntelligenceOptions callIntelligenceOptions;

    /*
     * The identifier of the source for creating call with Teams resource account ID.
     */
    private MicrosoftTeamsAppIdentifier teamsAppSource;

    /**
     * Constructor
     *
     * @param targetParticipants The targets of the call.
     * @param callbackUrl The call back URI.
     */
    public CreateGroupCallOptions(List<CommunicationIdentifier> targetParticipants, String callbackUrl) {
        this.targetParticipants = targetParticipants;
        this.callbackUrl = callbackUrl;
        this.sourceDisplayName = null;
        this.sourceCallIdNumber = null;
    }

    /**
     * Get the targets.
     *
     * @return the targets list.
     */
    public List<CommunicationIdentifier> getTargetParticipants() {
        return targetParticipants;
    }

    /**
     * Get the call back uri.
     *
     * @return the call back uri.
     */
    public String getCallbackUrl() {
        return callbackUrl;
    }

    /**
     * Get the operationContext: A customer set value used to track the answering of a call.
     *
     * @return the operationContext value.
     */
    public String getOperationContext() {
        return operationContext;
    }

    /**
     * get caller's display name
     * @return display name for caller
     */
    public String getSourceDisplayName() {
        return sourceDisplayName;
    }

    /**
     * get PhoneNumberIdentifier for PSTN caller
     * @return PhoneNumberIdentifier for PSTN caller
     */
    public PhoneNumberIdentifier getSourceCallIdNumber() {
        return sourceCallIdNumber;
    }

    /**
     * Set the operationContext: A customer set value used to track the answering of a call.
     *
     * @param operationContext A customer set value used to track the answering of a call.
     * @return the CreateCallOptions object itself.
     */
    public CreateGroupCallOptions setOperationContext(String operationContext) {
        this.operationContext = operationContext;
        return this;
    }

    /**
     * Set the media streaming configuration.
     *
     * @param mediaStreamingOptions The media streaming options.
     * @return the CreateGroupCallOptions object itself.
     */
    public CreateGroupCallOptions setMediaStreamingOptions(MediaStreamingOptions mediaStreamingOptions) {
        this.mediaStreamingOptions = mediaStreamingOptions;
        return this;
    }

    /**
     * Set the transcription configuration.
     *
     * @param transcriptionOptions The transcription options.
     * @return the CreateGroupCallOptions object itself.
     */
    public CreateGroupCallOptions setTranscriptionOptions(TranscriptionOptions transcriptionOptions) {
        this.transcriptionOptions = transcriptionOptions;
        return this;
    }

    /**
     * set display name for caller
     * @param sourceDisplayName display name for caller
     * @return the CreateGroupCallOptions object itself
     */
    public CreateGroupCallOptions setSourceDisplayName(String sourceDisplayName) {
        this.sourceDisplayName = sourceDisplayName;
        return this;
    }

    /**
     * set PhoneNumberIdentifier for PSTN caller
     * @param sourceCallIdNumber PhoneNumberIdentifier for PSTN caller
     * @return the CreateGroupCallOptions object itself
     */
    public CreateGroupCallOptions setSourceCallIdNumber(PhoneNumberIdentifier sourceCallIdNumber) {
        this.sourceCallIdNumber = sourceCallIdNumber;
        return this;
    }

    /**
     * Get the CallIntelligenceOptions property: AI options for the call such as cognitiveServicesEndpoint
     *
     * @return the callIntelligenceOptions value.
     */
    public CallIntelligenceOptions getCallIntelligenceOptions() {
        return this.callIntelligenceOptions;
    }

    /**
     * Set the CallIntelligenceOptions property: AI options for the call such as cognitiveServicesEndpoint
     *
     * @param callIntelligenceOptions the cognitiveServicesEndpoint value to set.
     * @return the CreateGroupCallOptions object itself.
     */
    public CreateGroupCallOptions setCallIntelligenceOptions(CallIntelligenceOptions callIntelligenceOptions) {
        this.callIntelligenceOptions = callIntelligenceOptions;
        return this;
    }

    /**
     * Get the Media Streaming Options.
     *
     * @return the mediaStreamingOptions.
     */
    public MediaStreamingOptions getMediaStreamingOptions() {
        return mediaStreamingOptions;
    }

    /**
     * Get the Transcription Options.
     *
     * @return the transcriptionOptions.
     */
    public TranscriptionOptions getTranscriptionOptions() {
        return transcriptionOptions;
    }

    /**
     * Get the teamsAppSource property: The identifier of the source for creating call with Teams resource account ID.
     *
     * @return the teamsAppSource value.
     */
    public MicrosoftTeamsAppIdentifier getTeamsAppSource() {
        return this.teamsAppSource;
    }

    /**
     * Set the teamsAppSource property: The identifier of the source for creating call with Teams resource account ID.
     *
     * @param teamsAppSource the teamsAppSource value to set.
     * @return the CreateCallOptions object itself.
     */
    public CreateGroupCallOptions setTeamsAppSource(MicrosoftTeamsAppIdentifier teamsAppSource) {
        this.teamsAppSource = teamsAppSource;
        return this;
    }
}
