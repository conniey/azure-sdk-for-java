// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.maps.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.maps.fluent.models.MapsAccountInner;
import com.azure.resourcemanager.maps.fluent.models.MapsAccountKeysInner;
import com.azure.resourcemanager.maps.fluent.models.MapsAccountSasTokenInner;
import com.azure.resourcemanager.maps.models.AccountSasParameters;
import com.azure.resourcemanager.maps.models.MapsAccountUpdateParameters;
import com.azure.resourcemanager.maps.models.MapsKeySpecification;

/**
 * An instance of this class provides access to all the operations defined in AccountsClient.
 */
public interface AccountsClient {
    /**
     * Create or update a Maps Account. A Maps Account holds the keys which allow access to the Maps REST APIs.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName The name of the Maps Account.
     * @param mapsAccount The new or updated parameters for the Maps Account.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an Azure resource which represents access to a suite of Maps REST APIs along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<MapsAccountInner> createOrUpdateWithResponse(String resourceGroupName, String accountName,
        MapsAccountInner mapsAccount, Context context);

    /**
     * Create or update a Maps Account. A Maps Account holds the keys which allow access to the Maps REST APIs.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName The name of the Maps Account.
     * @param mapsAccount The new or updated parameters for the Maps Account.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an Azure resource which represents access to a suite of Maps REST APIs.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    MapsAccountInner createOrUpdate(String resourceGroupName, String accountName, MapsAccountInner mapsAccount);

    /**
     * Updates a Maps Account. Only a subset of the parameters may be updated after creation, such as Sku, Tags,
     * Properties.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName The name of the Maps Account.
     * @param mapsAccountUpdateParameters The updated parameters for the Maps Account.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an Azure resource which represents access to a suite of Maps REST APIs along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<MapsAccountInner> updateWithResponse(String resourceGroupName, String accountName,
        MapsAccountUpdateParameters mapsAccountUpdateParameters, Context context);

    /**
     * Updates a Maps Account. Only a subset of the parameters may be updated after creation, such as Sku, Tags,
     * Properties.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName The name of the Maps Account.
     * @param mapsAccountUpdateParameters The updated parameters for the Maps Account.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an Azure resource which represents access to a suite of Maps REST APIs.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    MapsAccountInner update(String resourceGroupName, String accountName,
        MapsAccountUpdateParameters mapsAccountUpdateParameters);

    /**
     * Delete a Maps Account.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName The name of the Maps Account.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<Void> deleteWithResponse(String resourceGroupName, String accountName, Context context);

    /**
     * Delete a Maps Account.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName The name of the Maps Account.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String accountName);

    /**
     * Get a Maps Account.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName The name of the Maps Account.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a Maps Account along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<MapsAccountInner> getByResourceGroupWithResponse(String resourceGroupName, String accountName,
        Context context);

    /**
     * Get a Maps Account.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName The name of the Maps Account.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a Maps Account.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    MapsAccountInner getByResourceGroup(String resourceGroupName, String accountName);

    /**
     * Get all Maps Accounts in a Resource Group.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all Maps Accounts in a Resource Group as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<MapsAccountInner> listByResourceGroup(String resourceGroupName);

    /**
     * Get all Maps Accounts in a Resource Group.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all Maps Accounts in a Resource Group as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<MapsAccountInner> listByResourceGroup(String resourceGroupName, Context context);

    /**
     * Get all Maps Accounts in a Subscription.
     * 
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all Maps Accounts in a Subscription as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<MapsAccountInner> list();

    /**
     * Get all Maps Accounts in a Subscription.
     * 
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all Maps Accounts in a Subscription as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<MapsAccountInner> list(Context context);

    /**
     * Create and list an account shared access signature token. Use this SAS token for authentication to Azure Maps
     * REST APIs through various Azure Maps SDKs. As prerequisite to create a SAS Token.
     * 
     * Prerequisites:
     * 1. Create or have an existing User Assigned Managed Identity in the same Azure region as the account.
     * 2. Create or update an Azure Map account with the same Azure region as the User Assigned Managed Identity is
     * placed.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName The name of the Maps Account.
     * @param mapsAccountSasParameters The updated parameters for the Maps Account.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a new Sas token which can be used to access the Maps REST APIs and is controlled by the specified Managed
     * identity permissions on Azure (IAM) Role Based Access Control along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<MapsAccountSasTokenInner> listSasWithResponse(String resourceGroupName, String accountName,
        AccountSasParameters mapsAccountSasParameters, Context context);

    /**
     * Create and list an account shared access signature token. Use this SAS token for authentication to Azure Maps
     * REST APIs through various Azure Maps SDKs. As prerequisite to create a SAS Token.
     * 
     * Prerequisites:
     * 1. Create or have an existing User Assigned Managed Identity in the same Azure region as the account.
     * 2. Create or update an Azure Map account with the same Azure region as the User Assigned Managed Identity is
     * placed.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName The name of the Maps Account.
     * @param mapsAccountSasParameters The updated parameters for the Maps Account.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a new Sas token which can be used to access the Maps REST APIs and is controlled by the specified Managed
     * identity permissions on Azure (IAM) Role Based Access Control.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    MapsAccountSasTokenInner listSas(String resourceGroupName, String accountName,
        AccountSasParameters mapsAccountSasParameters);

    /**
     * Get the keys to use with the Maps APIs. A key is used to authenticate and authorize access to the Maps REST APIs.
     * Only one key is needed at a time; two are given to provide seamless key regeneration.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName The name of the Maps Account.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the keys to use with the Maps APIs along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<MapsAccountKeysInner> listKeysWithResponse(String resourceGroupName, String accountName, Context context);

    /**
     * Get the keys to use with the Maps APIs. A key is used to authenticate and authorize access to the Maps REST APIs.
     * Only one key is needed at a time; two are given to provide seamless key regeneration.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName The name of the Maps Account.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the keys to use with the Maps APIs.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    MapsAccountKeysInner listKeys(String resourceGroupName, String accountName);

    /**
     * Regenerate either the primary or secondary key for use with the Maps APIs. The old key will stop working
     * immediately.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName The name of the Maps Account.
     * @param keySpecification Which key to regenerate: primary or secondary.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the set of keys which can be used to access the Maps REST APIs along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<MapsAccountKeysInner> regenerateKeysWithResponse(String resourceGroupName, String accountName,
        MapsKeySpecification keySpecification, Context context);

    /**
     * Regenerate either the primary or secondary key for use with the Maps APIs. The old key will stop working
     * immediately.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName The name of the Maps Account.
     * @param keySpecification Which key to regenerate: primary or secondary.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the set of keys which can be used to access the Maps REST APIs.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    MapsAccountKeysInner regenerateKeys(String resourceGroupName, String accountName,
        MapsKeySpecification keySpecification);
}
