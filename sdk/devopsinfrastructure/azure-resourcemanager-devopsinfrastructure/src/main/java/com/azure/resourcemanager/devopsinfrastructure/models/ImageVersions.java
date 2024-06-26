// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.devopsinfrastructure.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.util.Context;

/**
 * Resource collection API of ImageVersions.
 */
public interface ImageVersions {
    /**
     * List ImageVersion resources by Image.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param imageName Name of the image.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response of a ImageVersion list operation as paginated response with {@link PagedIterable}.
     */
    PagedIterable<ImageVersion> listByImage(String resourceGroupName, String imageName);

    /**
     * List ImageVersion resources by Image.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param imageName Name of the image.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response of a ImageVersion list operation as paginated response with {@link PagedIterable}.
     */
    PagedIterable<ImageVersion> listByImage(String resourceGroupName, String imageName, Context context);
}
