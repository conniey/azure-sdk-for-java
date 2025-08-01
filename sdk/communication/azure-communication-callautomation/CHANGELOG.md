# Release History

## 1.5.0-beta.1 (Unreleased)

### Features Added

- Added support for Teams multipersona users in create call, add participant, transfer, and redirect scenarios in OPS calls
- Added TeamsAppSource for use when creating outbound OPS calls
- Recording with the call connection ID is now supported. OPS calls can be recorded using the call connection ID.
- Added StartRecordingFailed event to indicate when the start recording API is unable to initiate the recording.
- Adds support for SIP headers prefixed with 'X-' and 'X-MS-Custom-' within the CustomCallingContext.

## 1.4.1 (2025-06-19)

### Other Changes

#### Dependency Updates

- Upgraded `azure-communication-common` from `1.3.11` to version `1.4.0`.
- Upgraded `azure-core-http-netty` from `1.15.11` to version `1.15.12`.
- Upgraded `azure-core` from `1.55.3` to version `1.55.4`.

## 1.4.0 (2025-06-05)

### Features Added

- Real-time transcription support
- Audio and DTMF streaming capabilities
- Integration of ConnectAPI for seamless streaming and transcription
- Improved media streaming with bidirectional functionality, allowing audio formats in both directions, currently supporting sample rates of 24kHz and 16kHz
- Support for custom speech models has been integrated into transcription
- A confidence level for recognized speech has been introduced, ranging from 0.0 to 1.0 when available

## 1.3.3 (2025-03-24)

### Other Changes

#### Dependency Updates

- Upgraded `azure-communication-common` from `1.3.9` to version `1.3.10`.
- Upgraded `azure-core` from `1.55.2` to version `1.55.3`.
- Upgraded `azure-core-http-netty` from `1.15.10` to version `1.15.11`.


## 1.3.2 (2025-03-03)

### Other Changes

#### Dependency Updates

- Upgraded `azure-communication-common` from `1.3.8` to version `1.3.9`.
- Upgraded `azure-core-http-netty` from `1.15.7` to version `1.15.10`.
- Upgraded `azure-core` from `1.54.1` to version `1.55.2`.

## 1.3.1 (2024-12-04)

### Other Changes

#### Dependency Updates

- Upgraded `azure-core` from `1.53.0` to version `1.54.1`.
- Upgraded `azure-core-http-netty` from `1.15.5` to version `1.15.7`.
- Upgraded `azure-communication-common` from `1.3.7` to version `1.3.8`.

## 1.4.0-beta.1 (2024-11-22)

### Features Added

- Added support for ConnectAPI to enable streaming and real-time transcription
- Enhanced media streaming with bidirectional capabilities, enabling support for audio formats in both directions. Currently, it supports sample rates of 24kHz and 16kHz

### Other Changes

- Introduced audio streaming and transcription data parsing capabilities.

## 1.3.1 (2024-12-04)

### Other Changes

#### Dependency Updates

- Upgraded `azure-core` from `1.53.0` to version `1.54.1`.
- Upgraded `azure-core-http-netty` from `1.15.5` to version `1.15.7`.
- Upgraded `azure-communication-common` from `1.3.7` to version `1.3.8`.

## 1.3.0 (2024-11-22)

### Features Added

- Support multiple play sources for Play and Recognize
- Support for PlayStarted event in Play/Recognize
- Hold and Unhold the participant
- CallDisconnected now includes more information on why the call has ended
- Support to manage the rooms/servercall/group call using connect API
- Expose original PSTN number target from incoming call event in call connection properties
- Support for VoIP to PSTN transfer scenario

### Other Changes

- Added CreateCallFailed event to signify when create call API fails to establish a call
- Added AnswerFailed event to signify when answer call API fails to answer a call

## 1.3.0-beta.2 (2024-10-28)

### Features Added

- Added CreateCallFailed event to signify when create call API fails to establish a call

## 1.3.0-beta.1 (2024-08-02)

### Features Added

- Support multiple play sources for Play and Recognize
- Support for PlayStarted event in Play/Recognize
- Support for the real time transcription
- Monetization for real-time transcription and audio streaming
- Hold and Unhold the participant
- Support to manage the rooms/servercall/group call using connect API
- Support for the audio streaming
- Expose original PSTN number target from incoming call event in call connection properties
- Support for VoIP to PSTN transfer scenario

## 1.2.6 (2024-10-25)

### Other Changes

#### Dependency Updates

- Upgraded `azure-core` from `1.52.0` to version `1.53.0`.

## 1.2.5 (2024-09-27)

### Other Changes

#### Dependency Updates

- Upgraded `azure-core` from `1.51.0` to version `1.52.0`.
- Upgraded `azure-communication-common` from `1.3.5` to version `1.3.7`.

## 1.2.4 (2024-08-24)

### Other Changes

#### Dependency Updates

- Upgraded `azure-communication-common` from `1.3.4` to version `1.3.5`.
- Upgraded `azure-core` from `1.50.0` to version `1.51.0`.


## 1.3.0-beta.1 (2024-08-06)

### Features Added

- Support multiple play sources for Play and Recognize
- Support for PlayStarted event in Play/Recognize
- Hold and Unhold the participant
- Support to manage the rooms/servercall/group call using connect API
- Expose original PSTN number target from incoming call event in call connection properties
- Support for VoIP to PSTN transfer scenario

## 1.2.3 (2024-07-26)

### Other Changes

#### Dependency Updates

- Upgraded `azure-communication-common` from `1.3.3` to version `1.3.4`.
- Upgraded `azure-core` from `1.49.1` to version `1.50.0`.

## 1.2.2 (2024-06-27)

### Other Changes

#### Dependency Updates

- Upgraded `azure-communication-common` from `1.3.3` to version `1.3.4`.
- Upgraded `azure-core` from `1.49.0` to version `1.49.1`.

## 1.2.1 (2024-05-28)

### Other Changes

#### Dependency Updates

- Upgraded `azure-communication-common` from `1.3.2` to version `1.3.3`.
- Upgraded `azure-core` from `1.48.0` to version `1.49.0`.

## 1.2.0 (2024-05-01)

### Features Added

- Support for Bring Your Own Storage recording option
- Support for PauseOnStart recording option
- Support for Recording state change with new recording kind's

### Other Changes

- Support for MicrosoftTeamsAppIdentifier CommunicationIdentifier

## 1.1.4 (2024-04-23)

### Other Changes

#### Dependency Updates

- Upgraded `azure-core` from `1.47.0` to version `1.48.0`.
- Upgraded `azure-communication-common` from `1.3.1` to version `1.3.2`.

## 1.1.3 (2024-03-20)

### Other Changes

#### Dependency Updates

- Upgraded `azure-core-http-netty` from `1.14.0` to version `1.14.1`.
- Upgraded `azure-core` from `1.46.0` to version `1.47.0`.
- Upgraded `azure-communication-common` from `1.3.0` to version `1.3.1`.

## 1.1.2 (2024-02-20)

### Other Changes

#### Dependency Updates

- Upgraded `azure-core` from `1.45.1` to version `1.46.0`.
- Upgraded `azure-communication-common` from `1.2.15` to version `1.3.0`.

## 1.1.1 (2023-12-06)

### Other Changes

#### Dependency Updates

- Upgraded `azure-communication-common` from `1.2.14` to version `1.2.15`.
- Upgraded `azure-core` from `1.44.0` to version `1.45.1`.

## 1.1.0 (2023-11-23)

### Features Added

- Mid-Call actions support overriding callback uri
- Cancel adding Participant invitation
- Support transfer a participant in a group call to another participant
- Add Custom Context payload to Transfer and AddParticipant API

### Other Changes

- Dependency versions updated.

## 1.0.6 (2023-11-20)

### Other Changes

#### Dependency Updates

- Upgraded `azure-core` from `1.44.1` to version `1.45.0`.
- Upgraded `azure-communication-common` from `1.2.13` to version `1.2.14`.

## 1.0.5 (2023-10-20)

### Other Changes

#### Dependency Updates

- Upgraded `azure-core` from `1.43.0` to version `1.44.1`.
- Upgraded `azure-communication-common` from `1.2.12` to version `1.2.13`.

## 1.0.4 (2023-09-22)

### Other Changes

#### Dependency Updates

- Upgraded `azure-core` from `1.42.0` to version `1.43.0`.
- Upgraded `azure-communication-common` from `1.2.11` to version `1.2.12`.

## 1.0.3 (2023-08-18)

### Other Changes

#### Dependency Updates

- Upgraded `azure-core` from `1.41.0` to version `1.42.0`.

## 1.1.0-beta.1 (2023-08-17)

### Features Added

- Play and recognize supports TTS and SSML source prompts.
- Recognize supports choices and freeform speech.
- Start/Stop continuous DTMF recognition by subscribing/unsubscribing to tones.
- Send DTMF tones to a participant in the call.
- Mute participants in the call.

## 1.0.2 (2023-07-25)

### Other Changes

#### Dependency Updates

- Upgraded `azure-core` from `1.40.0` to version `1.41.0`.
- Upgraded `azure-communication-common` from `1.2.9` to version `1.2.10`.

## 1.0.1 (2023-06-21)

### Other Changes

#### Dependency Updates

- Upgraded `azure-core` from `1.39.0` to version `1.40.0`.
- Upgraded `azure-communication-common` from `1.2.8` to version `1.2.9`.

## 1.0.0 (2023-06-14)

### Features Added
- Outbound calls can now be created without providing a User Identifier. This value can be specified in the CallAutomationClientOption if desired.
- AnswerCall now accepts OperationContext.
- Calls can be answered by a specific communication identifier user.
- RemoveParticipant now sends success and failure events with the request.
- ParticipantsUpdated event now includes a sequence number to distinguish the ordering of events.
- CallConnectionProperties now includes CorrelationId.
- StartRecording now accepts ChannelAffinity.
- Added EventProcessor, an easy and powerful way to handle Call Automation events. See README for details.

### Breaking Changes
- AddParticipant and RemoveParticipant now only accept one participant at a time.
- CallSource has been flattened out.
- CallInvite model replaces previous models for handling outbound calls.

## 1.0.0-beta.1 (2022-11-07)
This is the first version of the restart of Azure Communication Service Call Automation. For more information, please see the [README][read_me].

- Name changed to Azure Communication Service Call Automation.
- Feature re-designed.
- Added interfaces from `com.azure.core.client.traits` to `CallAutomationClientBuilder`
- Added `retryOptions` to `CallAutomationClientBuilder`

### Features Added
- Create outbound call to an Azure Communication Service user or a phone number.
- Answer/Redirect/Reject incoming call from an Azure Communication Service user or a phone number.
- Hangup and terminate the existing call.
- Play audio in the call.
- Call recording.
- Get, add and remove participants from the call.
- Recording download apis.
- Optimized the logic for deserializing types derived from the `CommunicationIdentifier`.

### Breaking Changes
- Incompatible with previous version of service

<!-- LINKS -->
[read_me]: https://github.com/Azure/azure-sdk-for-java/tree/main/sdk/communication/azure-communication-callautomation/README.md
[DTMF]: https://en.wikipedia.org/wiki/Dual-tone_multi-frequency_signaling
