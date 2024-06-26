// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.analytics.purview.datamap;

import com.azure.analytics.purview.datamap.models.AtlasEntityDef;
import com.azure.core.util.Configuration;
import com.azure.identity.ClientSecretCredential;
import com.azure.identity.ClientSecretCredentialBuilder;

public final class ReadmeSamples {
    public void readmeSamples() {
        // BEGIN: com.azure.analytics.purview.datamap.readme

        ClientSecretCredential cred = new ClientSecretCredentialBuilder()
            .tenantId(Configuration.getGlobalConfiguration().get("TENANT_ID"))
            .authorityHost(Configuration.getGlobalConfiguration().get("AUTHORITY_HOST"))
            .clientId(Configuration.getGlobalConfiguration().get("CLIENT_ID"))
            .clientSecret(Configuration.getGlobalConfiguration().get("CLIENT_SECRET"))
            .build();
        DataMapClientBuilder clientBuilder = new DataMapClientBuilder()
            .endpoint(Configuration.getGlobalConfiguration().get("ENDPOINT"))
            .credential(cred);

        TypeDefinitionClient typeDefinitionClient = clientBuilder.buildTypeDefinitionClient();
        AtlasEntityDef type = typeDefinitionClient.getEntityByName("AtlasGlossary");
        // END: com.azure.analytics.purview.datamap.readme

    }
}
