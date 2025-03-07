// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.generated;

import com.azure.resourcemanager.mediaservices.models.StreamingLocatorContentKey;
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.UUID;

/**
 * Samples for StreamingLocators Create.
 */
public final class StreamingLocatorsCreateSamples {
    /*
     * x-ms-original-file:
     * specification/mediaservices/resource-manager/Microsoft.Media/Metadata/stable/2022-08-01/examples/streaming-
     * locators-create-clear.json
     */
    /**
     * Sample code: Creates a Streaming Locator with clear streaming.
     * 
     * @param manager Entry point to MediaServicesManager.
     */
    public static void createsAStreamingLocatorWithClearStreaming(
        com.azure.resourcemanager.mediaservices.MediaServicesManager manager) {
        manager.streamingLocators()
            .define("UserCreatedClearStreamingLocator")
            .withExistingMediaService("contosorg", "contosomedia")
            .withAssetName("ClimbingMountRainier")
            .withStreamingPolicyName("clearStreamingPolicy")
            .create();
    }

    /*
     * x-ms-original-file:
     * specification/mediaservices/resource-manager/Microsoft.Media/Metadata/stable/2022-08-01/examples/streaming-
     * locators-create-secure.json
     */
    /**
     * Sample code: Creates a Streaming Locator with secure streaming.
     * 
     * @param manager Entry point to MediaServicesManager.
     */
    public static void createsAStreamingLocatorWithSecureStreaming(
        com.azure.resourcemanager.mediaservices.MediaServicesManager manager) {
        manager.streamingLocators()
            .define("UserCreatedSecureStreamingLocator")
            .withExistingMediaService("contosorg", "contosomedia")
            .withAssetName("ClimbingMountRainier")
            .withStartTime(OffsetDateTime.parse("2018-03-01T00:00:00Z"))
            .withEndTime(OffsetDateTime.parse("2028-12-31T23:59:59.9999999Z"))
            .withStreamingPolicyName("UserCreatedSecureStreamingPolicy")
            .create();
    }

    /*
     * x-ms-original-file:
     * specification/mediaservices/resource-manager/Microsoft.Media/Metadata/stable/2022-08-01/examples/streaming-
     * locators-create-secure-userDefinedContentKeys.json
     */
    /**
     * Sample code: Creates a Streaming Locator with user defined content keys.
     * 
     * @param manager Entry point to MediaServicesManager.
     */
    public static void createsAStreamingLocatorWithUserDefinedContentKeys(
        com.azure.resourcemanager.mediaservices.MediaServicesManager manager) {
        manager.streamingLocators()
            .define("UserCreatedSecureStreamingLocatorWithUserDefinedContentKeys")
            .withExistingMediaService("contosorg", "contosomedia")
            .withAssetName("ClimbingMountRainier")
            .withStreamingLocatorId(UUID.fromString("90000000-0000-0000-0000-00000000000A"))
            .withStreamingPolicyName("secureStreamingPolicy")
            .withContentKeys(Arrays.asList(
                new StreamingLocatorContentKey().withId(UUID.fromString("60000000-0000-0000-0000-000000000001"))
                    .withLabelReferenceInStreamingPolicy("aesDefaultKey")
                    .withValue("1UqLohAfWsEGkULYxHjYZg=="),
                new StreamingLocatorContentKey().withId(UUID.fromString("60000000-0000-0000-0000-000000000004"))
                    .withLabelReferenceInStreamingPolicy("cencDefaultKey")
                    .withValue("4UqLohAfWsEGkULYxHjYZg=="),
                new StreamingLocatorContentKey().withId(UUID.fromString("60000000-0000-0000-0000-000000000007"))
                    .withLabelReferenceInStreamingPolicy("cbcsDefaultKey")
                    .withValue("7UqLohAfWsEGkULYxHjYZg==")))
            .create();
    }
}
