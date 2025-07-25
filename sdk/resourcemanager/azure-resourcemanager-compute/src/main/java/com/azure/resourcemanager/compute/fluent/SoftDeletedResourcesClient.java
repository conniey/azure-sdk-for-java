// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedFlux;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.util.Context;
import com.azure.resourcemanager.compute.fluent.models.GallerySoftDeletedResourceInner;

/**
 * An instance of this class provides access to all the operations defined in SoftDeletedResourcesClient.
 */
public interface SoftDeletedResourcesClient {
    /**
     * List soft-deleted resources of an artifact in the gallery, such as soft-deleted gallery image version of an
     * image.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param galleryName The name of the Shared Image Gallery.
     * @param artifactType The type of the artifact to be listed, such as gallery image version.
     * @param artifactName The artifact name to be listed. If artifact type is Images, then the artifact name should be
     * the gallery image name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.models.ApiErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the List Soft-deleted Resources operation response as paginated response with {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedFlux<GallerySoftDeletedResourceInner> listByArtifactNameAsync(String resourceGroupName, String galleryName,
        String artifactType, String artifactName);

    /**
     * List soft-deleted resources of an artifact in the gallery, such as soft-deleted gallery image version of an
     * image.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param galleryName The name of the Shared Image Gallery.
     * @param artifactType The type of the artifact to be listed, such as gallery image version.
     * @param artifactName The artifact name to be listed. If artifact type is Images, then the artifact name should be
     * the gallery image name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.models.ApiErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the List Soft-deleted Resources operation response as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<GallerySoftDeletedResourceInner> listByArtifactName(String resourceGroupName, String galleryName,
        String artifactType, String artifactName);

    /**
     * List soft-deleted resources of an artifact in the gallery, such as soft-deleted gallery image version of an
     * image.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param galleryName The name of the Shared Image Gallery.
     * @param artifactType The type of the artifact to be listed, such as gallery image version.
     * @param artifactName The artifact name to be listed. If artifact type is Images, then the artifact name should be
     * the gallery image name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.models.ApiErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the List Soft-deleted Resources operation response as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<GallerySoftDeletedResourceInner> listByArtifactName(String resourceGroupName, String galleryName,
        String artifactType, String artifactName, Context context);
}
