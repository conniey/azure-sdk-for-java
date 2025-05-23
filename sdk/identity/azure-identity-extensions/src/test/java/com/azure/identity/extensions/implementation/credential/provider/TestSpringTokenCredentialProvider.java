// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.identity.extensions.implementation.credential.provider;

import com.azure.core.credential.TokenCredential;
import com.azure.identity.extensions.implementation.credential.TokenCredentialProviderOptions;

class TestSpringTokenCredentialProvider implements TokenCredentialProvider {

    TestSpringTokenCredentialProvider(TokenCredentialProviderOptions options) {
    }

    @Override
    public TokenCredential get() {
        return null;
    }
}
