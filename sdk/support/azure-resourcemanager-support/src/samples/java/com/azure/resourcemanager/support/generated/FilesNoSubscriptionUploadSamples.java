// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.support.generated;

import com.azure.resourcemanager.support.models.UploadFile;

/**
 * Samples for FilesNoSubscription Upload.
 */
public final class FilesNoSubscriptionUploadSamples {
    /*
     * x-ms-original-file:
     * specification/support/resource-manager/Microsoft.Support/stable/2024-04-01/examples/UploadFile.json
     */
    /**
     * Sample code: UploadFile.
     * 
     * @param manager Entry point to SupportManager.
     */
    public static void uploadFile(com.azure.resourcemanager.support.SupportManager manager) {
        manager.filesNoSubscriptions()
            .uploadWithResponse("testworkspaceName", "test.txt", new UploadFile().withContent(
                "iVBORw0KGgoAAAANSUhEUgAAABAAAAAQCAMAAAAoLQ9TAAAABGdBTUEAALGPC/xhBQAAAAFzUkdCAK7OHOkAAAAgY0hSTQAAeiYAAICEAAD6AAAAgOgAAHUwAADqYAAAOpgAABd")
                .withChunkIndex(0), com.azure.core.util.Context.NONE);
    }
}
