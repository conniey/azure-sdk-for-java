// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.eventgrid.models.DeliveryAttributeMapping;
import com.azure.resourcemanager.eventgrid.models.TlsVersion;
import com.azure.resourcemanager.eventgrid.models.WebhookEventSubscriptionDestination;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class WebhookEventSubscriptionDestinationTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        WebhookEventSubscriptionDestination model = BinaryData.fromString(
            "{\"endpointType\":\"WebHook\",\"properties\":{\"endpointUrl\":\"viyoypsuhbrnnhjx\",\"endpointBaseUrl\":\"wjh\",\"maxEventsPerBatch\":1783874944,\"preferredBatchSizeInKilobytes\":843704229,\"azureActiveDirectoryTenantId\":\"t\",\"azureActiveDirectoryApplicationIdOrUri\":\"zycyqiqyhg\",\"deliveryAttributeMappings\":[{\"type\":\"DeliveryAttributeMapping\",\"name\":\"zlex\"},{\"type\":\"DeliveryAttributeMapping\",\"name\":\"fledynojpziu\"},{\"type\":\"DeliveryAttributeMapping\",\"name\":\"bzkkd\"},{\"type\":\"DeliveryAttributeMapping\",\"name\":\"hqsycljselp\"}],\"minimumTlsVersionAllowed\":\"1.0\"}}")
            .toObject(WebhookEventSubscriptionDestination.class);
        Assertions.assertEquals("viyoypsuhbrnnhjx", model.endpointUrl());
        Assertions.assertEquals(1783874944, model.maxEventsPerBatch());
        Assertions.assertEquals(843704229, model.preferredBatchSizeInKilobytes());
        Assertions.assertEquals("t", model.azureActiveDirectoryTenantId());
        Assertions.assertEquals("zycyqiqyhg", model.azureActiveDirectoryApplicationIdOrUri());
        Assertions.assertEquals("zlex", model.deliveryAttributeMappings().get(0).name());
        Assertions.assertEquals(TlsVersion.ONE_ZERO, model.minimumTlsVersionAllowed());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        WebhookEventSubscriptionDestination model
            = new WebhookEventSubscriptionDestination().withEndpointUrl("viyoypsuhbrnnhjx")
                .withMaxEventsPerBatch(1783874944)
                .withPreferredBatchSizeInKilobytes(843704229)
                .withAzureActiveDirectoryTenantId("t")
                .withAzureActiveDirectoryApplicationIdOrUri("zycyqiqyhg")
                .withDeliveryAttributeMappings(Arrays.asList(new DeliveryAttributeMapping().withName("zlex"),
                    new DeliveryAttributeMapping().withName("fledynojpziu"),
                    new DeliveryAttributeMapping().withName("bzkkd"),
                    new DeliveryAttributeMapping().withName("hqsycljselp")))
                .withMinimumTlsVersionAllowed(TlsVersion.ONE_ZERO);
        model = BinaryData.fromObject(model).toObject(WebhookEventSubscriptionDestination.class);
        Assertions.assertEquals("viyoypsuhbrnnhjx", model.endpointUrl());
        Assertions.assertEquals(1783874944, model.maxEventsPerBatch());
        Assertions.assertEquals(843704229, model.preferredBatchSizeInKilobytes());
        Assertions.assertEquals("t", model.azureActiveDirectoryTenantId());
        Assertions.assertEquals("zycyqiqyhg", model.azureActiveDirectoryApplicationIdOrUri());
        Assertions.assertEquals("zlex", model.deliveryAttributeMappings().get(0).name());
        Assertions.assertEquals(TlsVersion.ONE_ZERO, model.minimumTlsVersionAllowed());
    }
}
