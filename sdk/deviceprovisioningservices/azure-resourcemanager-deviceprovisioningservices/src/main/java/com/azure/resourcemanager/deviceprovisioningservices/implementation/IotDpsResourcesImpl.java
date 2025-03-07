// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.deviceprovisioningservices.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.deviceprovisioningservices.fluent.IotDpsResourcesClient;
import com.azure.resourcemanager.deviceprovisioningservices.fluent.models.AsyncOperationResultInner;
import com.azure.resourcemanager.deviceprovisioningservices.fluent.models.GroupIdInformationInner;
import com.azure.resourcemanager.deviceprovisioningservices.fluent.models.IotDpsSkuDefinitionInner;
import com.azure.resourcemanager.deviceprovisioningservices.fluent.models.NameAvailabilityInfoInner;
import com.azure.resourcemanager.deviceprovisioningservices.fluent.models.PrivateEndpointConnectionInner;
import com.azure.resourcemanager.deviceprovisioningservices.fluent.models.PrivateLinkResourcesInner;
import com.azure.resourcemanager.deviceprovisioningservices.fluent.models.ProvisioningServiceDescriptionInner;
import com.azure.resourcemanager.deviceprovisioningservices.fluent.models.SharedAccessSignatureAuthorizationRuleInner;
import com.azure.resourcemanager.deviceprovisioningservices.models.AsyncOperationResult;
import com.azure.resourcemanager.deviceprovisioningservices.models.GroupIdInformation;
import com.azure.resourcemanager.deviceprovisioningservices.models.IotDpsResources;
import com.azure.resourcemanager.deviceprovisioningservices.models.IotDpsSkuDefinition;
import com.azure.resourcemanager.deviceprovisioningservices.models.NameAvailabilityInfo;
import com.azure.resourcemanager.deviceprovisioningservices.models.OperationInputs;
import com.azure.resourcemanager.deviceprovisioningservices.models.PrivateEndpointConnection;
import com.azure.resourcemanager.deviceprovisioningservices.models.PrivateLinkResources;
import com.azure.resourcemanager.deviceprovisioningservices.models.ProvisioningServiceDescription;
import com.azure.resourcemanager.deviceprovisioningservices.models.SharedAccessSignatureAuthorizationRule;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public final class IotDpsResourcesImpl implements IotDpsResources {
    private static final ClientLogger LOGGER = new ClientLogger(IotDpsResourcesImpl.class);

    private final IotDpsResourcesClient innerClient;

    private final com.azure.resourcemanager.deviceprovisioningservices.IotDpsManager serviceManager;

    public IotDpsResourcesImpl(IotDpsResourcesClient innerClient,
        com.azure.resourcemanager.deviceprovisioningservices.IotDpsManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public Response<ProvisioningServiceDescription> getByResourceGroupWithResponse(String resourceGroupName,
        String provisioningServiceName, Context context) {
        Response<ProvisioningServiceDescriptionInner> inner
            = this.serviceClient().getByResourceGroupWithResponse(resourceGroupName, provisioningServiceName, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new ProvisioningServiceDescriptionImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public ProvisioningServiceDescription getByResourceGroup(String resourceGroupName, String provisioningServiceName) {
        ProvisioningServiceDescriptionInner inner
            = this.serviceClient().getByResourceGroup(resourceGroupName, provisioningServiceName);
        if (inner != null) {
            return new ProvisioningServiceDescriptionImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public void deleteByResourceGroup(String resourceGroupName, String provisioningServiceName) {
        this.serviceClient().delete(resourceGroupName, provisioningServiceName);
    }

    public void delete(String resourceGroupName, String provisioningServiceName, Context context) {
        this.serviceClient().delete(resourceGroupName, provisioningServiceName, context);
    }

    public PagedIterable<ProvisioningServiceDescription> list() {
        PagedIterable<ProvisioningServiceDescriptionInner> inner = this.serviceClient().list();
        return ResourceManagerUtils.mapPage(inner,
            inner1 -> new ProvisioningServiceDescriptionImpl(inner1, this.manager()));
    }

    public PagedIterable<ProvisioningServiceDescription> list(Context context) {
        PagedIterable<ProvisioningServiceDescriptionInner> inner = this.serviceClient().list(context);
        return ResourceManagerUtils.mapPage(inner,
            inner1 -> new ProvisioningServiceDescriptionImpl(inner1, this.manager()));
    }

    public PagedIterable<ProvisioningServiceDescription> listByResourceGroup(String resourceGroupName) {
        PagedIterable<ProvisioningServiceDescriptionInner> inner
            = this.serviceClient().listByResourceGroup(resourceGroupName);
        return ResourceManagerUtils.mapPage(inner,
            inner1 -> new ProvisioningServiceDescriptionImpl(inner1, this.manager()));
    }

    public PagedIterable<ProvisioningServiceDescription> listByResourceGroup(String resourceGroupName,
        Context context) {
        PagedIterable<ProvisioningServiceDescriptionInner> inner
            = this.serviceClient().listByResourceGroup(resourceGroupName, context);
        return ResourceManagerUtils.mapPage(inner,
            inner1 -> new ProvisioningServiceDescriptionImpl(inner1, this.manager()));
    }

    public Response<AsyncOperationResult> getOperationResultWithResponse(String operationId, String resourceGroupName,
        String provisioningServiceName, String asyncinfo, Context context) {
        Response<AsyncOperationResultInner> inner = this.serviceClient()
            .getOperationResultWithResponse(operationId, resourceGroupName, provisioningServiceName, asyncinfo,
                context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new AsyncOperationResultImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public AsyncOperationResult getOperationResult(String operationId, String resourceGroupName,
        String provisioningServiceName, String asyncinfo) {
        AsyncOperationResultInner inner = this.serviceClient()
            .getOperationResult(operationId, resourceGroupName, provisioningServiceName, asyncinfo);
        if (inner != null) {
            return new AsyncOperationResultImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public PagedIterable<IotDpsSkuDefinition> listValidSkus(String provisioningServiceName, String resourceGroupName) {
        PagedIterable<IotDpsSkuDefinitionInner> inner
            = this.serviceClient().listValidSkus(provisioningServiceName, resourceGroupName);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new IotDpsSkuDefinitionImpl(inner1, this.manager()));
    }

    public PagedIterable<IotDpsSkuDefinition> listValidSkus(String provisioningServiceName, String resourceGroupName,
        Context context) {
        PagedIterable<IotDpsSkuDefinitionInner> inner
            = this.serviceClient().listValidSkus(provisioningServiceName, resourceGroupName, context);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new IotDpsSkuDefinitionImpl(inner1, this.manager()));
    }

    public Response<NameAvailabilityInfo>
        checkProvisioningServiceNameAvailabilityWithResponse(OperationInputs arguments, Context context) {
        Response<NameAvailabilityInfoInner> inner
            = this.serviceClient().checkProvisioningServiceNameAvailabilityWithResponse(arguments, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new NameAvailabilityInfoImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public NameAvailabilityInfo checkProvisioningServiceNameAvailability(OperationInputs arguments) {
        NameAvailabilityInfoInner inner = this.serviceClient().checkProvisioningServiceNameAvailability(arguments);
        if (inner != null) {
            return new NameAvailabilityInfoImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public PagedIterable<SharedAccessSignatureAuthorizationRule> listKeys(String provisioningServiceName,
        String resourceGroupName) {
        PagedIterable<SharedAccessSignatureAuthorizationRuleInner> inner
            = this.serviceClient().listKeys(provisioningServiceName, resourceGroupName);
        return ResourceManagerUtils.mapPage(inner,
            inner1 -> new SharedAccessSignatureAuthorizationRuleImpl(inner1, this.manager()));
    }

    public PagedIterable<SharedAccessSignatureAuthorizationRule> listKeys(String provisioningServiceName,
        String resourceGroupName, Context context) {
        PagedIterable<SharedAccessSignatureAuthorizationRuleInner> inner
            = this.serviceClient().listKeys(provisioningServiceName, resourceGroupName, context);
        return ResourceManagerUtils.mapPage(inner,
            inner1 -> new SharedAccessSignatureAuthorizationRuleImpl(inner1, this.manager()));
    }

    public Response<SharedAccessSignatureAuthorizationRule> listKeysForKeyNameWithResponse(
        String provisioningServiceName, String keyName, String resourceGroupName, Context context) {
        Response<SharedAccessSignatureAuthorizationRuleInner> inner = this.serviceClient()
            .listKeysForKeyNameWithResponse(provisioningServiceName, keyName, resourceGroupName, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new SharedAccessSignatureAuthorizationRuleImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public SharedAccessSignatureAuthorizationRule listKeysForKeyName(String provisioningServiceName, String keyName,
        String resourceGroupName) {
        SharedAccessSignatureAuthorizationRuleInner inner
            = this.serviceClient().listKeysForKeyName(provisioningServiceName, keyName, resourceGroupName);
        if (inner != null) {
            return new SharedAccessSignatureAuthorizationRuleImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<PrivateLinkResources> listPrivateLinkResourcesWithResponse(String resourceGroupName,
        String resourceName, Context context) {
        Response<PrivateLinkResourcesInner> inner
            = this.serviceClient().listPrivateLinkResourcesWithResponse(resourceGroupName, resourceName, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new PrivateLinkResourcesImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public PrivateLinkResources listPrivateLinkResources(String resourceGroupName, String resourceName) {
        PrivateLinkResourcesInner inner
            = this.serviceClient().listPrivateLinkResources(resourceGroupName, resourceName);
        if (inner != null) {
            return new PrivateLinkResourcesImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<GroupIdInformation> getPrivateLinkResourcesWithResponse(String resourceGroupName,
        String resourceName, String groupId, Context context) {
        Response<GroupIdInformationInner> inner = this.serviceClient()
            .getPrivateLinkResourcesWithResponse(resourceGroupName, resourceName, groupId, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new GroupIdInformationImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public GroupIdInformation getPrivateLinkResources(String resourceGroupName, String resourceName, String groupId) {
        GroupIdInformationInner inner
            = this.serviceClient().getPrivateLinkResources(resourceGroupName, resourceName, groupId);
        if (inner != null) {
            return new GroupIdInformationImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<List<PrivateEndpointConnection>>
        listPrivateEndpointConnectionsWithResponse(String resourceGroupName, String resourceName, Context context) {
        Response<List<PrivateEndpointConnectionInner>> inner
            = this.serviceClient().listPrivateEndpointConnectionsWithResponse(resourceGroupName, resourceName, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                inner.getValue()
                    .stream()
                    .map(inner1 -> new PrivateEndpointConnectionImpl(inner1, this.manager()))
                    .collect(Collectors.toList()));
        } else {
            return null;
        }
    }

    public List<PrivateEndpointConnection> listPrivateEndpointConnections(String resourceGroupName,
        String resourceName) {
        List<PrivateEndpointConnectionInner> inner
            = this.serviceClient().listPrivateEndpointConnections(resourceGroupName, resourceName);
        if (inner != null) {
            return Collections.unmodifiableList(inner.stream()
                .map(inner1 -> new PrivateEndpointConnectionImpl(inner1, this.manager()))
                .collect(Collectors.toList()));
        } else {
            return Collections.emptyList();
        }
    }

    public Response<PrivateEndpointConnection> getPrivateEndpointConnectionWithResponse(String resourceGroupName,
        String resourceName, String privateEndpointConnectionName, Context context) {
        Response<PrivateEndpointConnectionInner> inner = this.serviceClient()
            .getPrivateEndpointConnectionWithResponse(resourceGroupName, resourceName, privateEndpointConnectionName,
                context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new PrivateEndpointConnectionImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public PrivateEndpointConnection getPrivateEndpointConnection(String resourceGroupName, String resourceName,
        String privateEndpointConnectionName) {
        PrivateEndpointConnectionInner inner = this.serviceClient()
            .getPrivateEndpointConnection(resourceGroupName, resourceName, privateEndpointConnectionName);
        if (inner != null) {
            return new PrivateEndpointConnectionImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public PrivateEndpointConnection deletePrivateEndpointConnection(String resourceGroupName, String resourceName,
        String privateEndpointConnectionName) {
        PrivateEndpointConnectionInner inner = this.serviceClient()
            .deletePrivateEndpointConnection(resourceGroupName, resourceName, privateEndpointConnectionName);
        if (inner != null) {
            return new PrivateEndpointConnectionImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public PrivateEndpointConnection deletePrivateEndpointConnection(String resourceGroupName, String resourceName,
        String privateEndpointConnectionName, Context context) {
        PrivateEndpointConnectionInner inner = this.serviceClient()
            .deletePrivateEndpointConnection(resourceGroupName, resourceName, privateEndpointConnectionName, context);
        if (inner != null) {
            return new PrivateEndpointConnectionImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public ProvisioningServiceDescription getById(String id) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String provisioningServiceName = ResourceManagerUtils.getValueFromIdByName(id, "provisioningServices");
        if (provisioningServiceName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'provisioningServices'.", id)));
        }
        return this.getByResourceGroupWithResponse(resourceGroupName, provisioningServiceName, Context.NONE).getValue();
    }

    public Response<ProvisioningServiceDescription> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String provisioningServiceName = ResourceManagerUtils.getValueFromIdByName(id, "provisioningServices");
        if (provisioningServiceName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'provisioningServices'.", id)));
        }
        return this.getByResourceGroupWithResponse(resourceGroupName, provisioningServiceName, context);
    }

    public PrivateEndpointConnection getPrivateEndpointConnectionById(String id) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String resourceName = ResourceManagerUtils.getValueFromIdByName(id, "provisioningServices");
        if (resourceName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'provisioningServices'.", id)));
        }
        String privateEndpointConnectionName
            = ResourceManagerUtils.getValueFromIdByName(id, "privateEndpointConnections");
        if (privateEndpointConnectionName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(String
                .format("The resource ID '%s' is not valid. Missing path segment 'privateEndpointConnections'.", id)));
        }
        return this
            .getPrivateEndpointConnectionWithResponse(resourceGroupName, resourceName, privateEndpointConnectionName,
                Context.NONE)
            .getValue();
    }

    public Response<PrivateEndpointConnection> getPrivateEndpointConnectionByIdWithResponse(String id,
        Context context) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String resourceName = ResourceManagerUtils.getValueFromIdByName(id, "provisioningServices");
        if (resourceName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'provisioningServices'.", id)));
        }
        String privateEndpointConnectionName
            = ResourceManagerUtils.getValueFromIdByName(id, "privateEndpointConnections");
        if (privateEndpointConnectionName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(String
                .format("The resource ID '%s' is not valid. Missing path segment 'privateEndpointConnections'.", id)));
        }
        return this.getPrivateEndpointConnectionWithResponse(resourceGroupName, resourceName,
            privateEndpointConnectionName, context);
    }

    public void deleteById(String id) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String provisioningServiceName = ResourceManagerUtils.getValueFromIdByName(id, "provisioningServices");
        if (provisioningServiceName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'provisioningServices'.", id)));
        }
        this.delete(resourceGroupName, provisioningServiceName, Context.NONE);
    }

    public void deleteByIdWithResponse(String id, Context context) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String provisioningServiceName = ResourceManagerUtils.getValueFromIdByName(id, "provisioningServices");
        if (provisioningServiceName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'provisioningServices'.", id)));
        }
        this.delete(resourceGroupName, provisioningServiceName, context);
    }

    public PrivateEndpointConnection deletePrivateEndpointConnectionById(String id) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String resourceName = ResourceManagerUtils.getValueFromIdByName(id, "provisioningServices");
        if (resourceName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'provisioningServices'.", id)));
        }
        String privateEndpointConnectionName
            = ResourceManagerUtils.getValueFromIdByName(id, "privateEndpointConnections");
        if (privateEndpointConnectionName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(String
                .format("The resource ID '%s' is not valid. Missing path segment 'privateEndpointConnections'.", id)));
        }
        return this.deletePrivateEndpointConnection(resourceGroupName, resourceName, privateEndpointConnectionName,
            Context.NONE);
    }

    public PrivateEndpointConnection deletePrivateEndpointConnectionByIdWithResponse(String id, Context context) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String resourceName = ResourceManagerUtils.getValueFromIdByName(id, "provisioningServices");
        if (resourceName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'provisioningServices'.", id)));
        }
        String privateEndpointConnectionName
            = ResourceManagerUtils.getValueFromIdByName(id, "privateEndpointConnections");
        if (privateEndpointConnectionName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(String
                .format("The resource ID '%s' is not valid. Missing path segment 'privateEndpointConnections'.", id)));
        }
        return this.deletePrivateEndpointConnection(resourceGroupName, resourceName, privateEndpointConnectionName,
            context);
    }

    private IotDpsResourcesClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.deviceprovisioningservices.IotDpsManager manager() {
        return this.serviceManager;
    }

    public ProvisioningServiceDescriptionImpl define(String name) {
        return new ProvisioningServiceDescriptionImpl(name, this.manager());
    }

    public PrivateEndpointConnectionImpl definePrivateEndpointConnection(String name) {
        return new PrivateEndpointConnectionImpl(name, this.manager());
    }
}
