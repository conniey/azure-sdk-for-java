// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.spring.cloud.service.implementation;

import com.azure.core.credential.TokenCredential;
import com.azure.identity.ClientCertificateCredential;
import com.azure.identity.ClientSecretCredential;
import com.azure.identity.ManagedIdentityCredential;
import com.azure.identity.UsernamePasswordCredential;
import com.azure.spring.cloud.core.implementation.factory.AzureServiceClientBuilderFactory;
import com.azure.spring.cloud.core.implementation.properties.AzureSdkProperties;
import org.junit.jupiter.api.Test;
import org.mockito.verification.VerificationMode;

import static org.mockito.Mockito.times;

@SuppressWarnings("deprecation")
public abstract class AzureServiceClientBuilderFactoryBaseTests<B, P extends AzureSdkProperties,
                                                                  F extends AzureServiceClientBuilderFactory<B>>
    extends AzureGenericServiceClientBuilderFactoryBaseTests<P, F> {

    protected abstract void buildClient(B builder);
    protected abstract P createMinimalServiceProperties();
    protected abstract F createClientBuilderFactoryWithMockBuilder(P properties);
    protected abstract void verifyServicePropertiesConfigured();
    protected abstract void verifyCredentialCalled(B builder, Class<? extends TokenCredential> tokenCredentialClass, VerificationMode mode);

    @Test
    void minimalSettingsCanWork() {
        final F factory = factoryWithMinimalSettings();
        B builder = factory.build();
        buildClient(builder);
    }

    @Test
    void clientSecretTokenCredentialConfigured() {
        final F factory = factoryWithClientSecretTokenCredentialConfigured(createMinimalServiceProperties());
        B builder = factory.build();
        buildClient(builder);

        verifyCredentialCalled(builder, ClientSecretCredential.class, times(1));
    }

    @Test
    void clientCertificateTokenCredentialConfigured() {
        final F factory = factoryWithClientCertificateTokenCredentialConfigured(createMinimalServiceProperties());
        B builder = factory.build();
        buildClient(builder);

        verifyCredentialCalled(builder, ClientCertificateCredential.class, times(1));
    }

    @Test
    void usernamePasswordTokenCredentialConfigured() {
        final F factory = factoryWithUsernamePasswordTokenCredentialConfigured(createMinimalServiceProperties());
        B builder = factory.build();
        buildClient(builder);

        verifyCredentialCalled(builder, UsernamePasswordCredential.class, times(1));
    }

    @Test
    void managedIdentityTokenCredentialConfigured() {
        final F factory = factoryWithManagedIdentityTokenCredentialConfigured(createMinimalServiceProperties());
        B builder = factory.build();
        buildClient(builder);

        verifyCredentialCalled(builder, ManagedIdentityCredential.class, times(1));
    }

    @Test
    void servicePropertiesConfigured() {
        verifyServicePropertiesConfigured();
    }

}
