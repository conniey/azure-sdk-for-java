// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.implementation;

import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.apimanagement.fluent.ProductWikisClient;
import com.azure.resourcemanager.apimanagement.fluent.models.WikiContractInner;
import com.azure.resourcemanager.apimanagement.models.ProductWikis;
import com.azure.resourcemanager.apimanagement.models.ProductWikisCreateOrUpdateResponse;
import com.azure.resourcemanager.apimanagement.models.ProductWikisGetEntityTagResponse;
import com.azure.resourcemanager.apimanagement.models.ProductWikisGetResponse;
import com.azure.resourcemanager.apimanagement.models.ProductWikisUpdateResponse;
import com.azure.resourcemanager.apimanagement.models.WikiContract;
import com.azure.resourcemanager.apimanagement.models.WikiUpdateContract;

public final class ProductWikisImpl implements ProductWikis {
    private static final ClientLogger LOGGER = new ClientLogger(ProductWikisImpl.class);

    private final ProductWikisClient innerClient;

    private final com.azure.resourcemanager.apimanagement.ApiManagementManager serviceManager;

    public ProductWikisImpl(ProductWikisClient innerClient,
        com.azure.resourcemanager.apimanagement.ApiManagementManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public ProductWikisGetEntityTagResponse getEntityTagWithResponse(String resourceGroupName, String serviceName,
        String productId, Context context) {
        return this.serviceClient().getEntityTagWithResponse(resourceGroupName, serviceName, productId, context);
    }

    public void getEntityTag(String resourceGroupName, String serviceName, String productId) {
        this.serviceClient().getEntityTag(resourceGroupName, serviceName, productId);
    }

    public Response<WikiContract> getWithResponse(String resourceGroupName, String serviceName, String productId,
        Context context) {
        ProductWikisGetResponse inner
            = this.serviceClient().getWithResponse(resourceGroupName, serviceName, productId, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new WikiContractImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public WikiContract get(String resourceGroupName, String serviceName, String productId) {
        WikiContractInner inner = this.serviceClient().get(resourceGroupName, serviceName, productId);
        if (inner != null) {
            return new WikiContractImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<WikiContract> createOrUpdateWithResponse(String resourceGroupName, String serviceName,
        String productId, WikiContractInner parameters, String ifMatch, Context context) {
        ProductWikisCreateOrUpdateResponse inner = this.serviceClient()
            .createOrUpdateWithResponse(resourceGroupName, serviceName, productId, parameters, ifMatch, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new WikiContractImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public WikiContract createOrUpdate(String resourceGroupName, String serviceName, String productId,
        WikiContractInner parameters) {
        WikiContractInner inner
            = this.serviceClient().createOrUpdate(resourceGroupName, serviceName, productId, parameters);
        if (inner != null) {
            return new WikiContractImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<WikiContract> updateWithResponse(String resourceGroupName, String serviceName, String productId,
        String ifMatch, WikiUpdateContract parameters, Context context) {
        ProductWikisUpdateResponse inner = this.serviceClient()
            .updateWithResponse(resourceGroupName, serviceName, productId, ifMatch, parameters, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new WikiContractImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public WikiContract update(String resourceGroupName, String serviceName, String productId, String ifMatch,
        WikiUpdateContract parameters) {
        WikiContractInner inner
            = this.serviceClient().update(resourceGroupName, serviceName, productId, ifMatch, parameters);
        if (inner != null) {
            return new WikiContractImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<Void> deleteWithResponse(String resourceGroupName, String serviceName, String productId,
        String ifMatch, Context context) {
        return this.serviceClient().deleteWithResponse(resourceGroupName, serviceName, productId, ifMatch, context);
    }

    public void delete(String resourceGroupName, String serviceName, String productId, String ifMatch) {
        this.serviceClient().delete(resourceGroupName, serviceName, productId, ifMatch);
    }

    private ProductWikisClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.apimanagement.ApiManagementManager manager() {
        return this.serviceManager;
    }
}
