// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.data.appconfiguration;

import com.azure.core.util.Configuration;
import com.azure.data.appconfiguration.models.ConfigurationSetting;
import com.azure.identity.DefaultAzureCredential;
import com.azure.identity.DefaultAzureCredentialBuilder;

/**
 * Sample demonstrates how to use Entra token to build a configuration client.
 */
public class EntraIdAuthentication {
    /**
     * Sample for how to use Entra token Authentication.
     *
     * @param args Unused. Arguments to the program.
     */
    public static void main(String[] args) {
        // The endpoint can be obtained by going to your App Configuration instance in the Azure portal
        // and navigating to "Overview" page. Looking for the "Endpoint" keyword.
        String endpoint = Configuration.getGlobalConfiguration().get("AZ_CONFIG_ENDPOINT");

        // Default token credential could be obtained from Identity service.
        // It tries to create a valid credential in the following order:
        //      EnvironmentCredential
        //      ManagedIdentityCredential
        //      SharedTokenCacheCredential
        //      Fails if none of the credentials above could be created.
        DefaultAzureCredential tokenCredential = new DefaultAzureCredentialBuilder().build();

        final ConfigurationClient client = new ConfigurationClientBuilder()
            .credential(tokenCredential) // Entra authentication
            .endpoint(endpoint)
            .buildClient();

        // Name of the key to add to the configuration service.
        final String key = "hello";
        final String value = "world";

        System.out.println("Beginning of synchronous sample...");

        ConfigurationSetting setting = client.setConfigurationSetting(key, null, value);
        System.out.printf("[SetConfigurationSetting] Key: %s, Value: %s", setting.getKey(), setting.getValue());

        setting = client.getConfigurationSetting(key, null, null);
        System.out.printf("[GetConfigurationSetting] Key: %s, Value: %s", setting.getKey(), setting.getValue());

        setting = client.deleteConfigurationSetting(key, null);
        System.out.printf("[DeleteConfigurationSetting] Key: %s, Value: %s", setting.getKey(), setting.getValue());

        System.out.println("End of synchronous sample.");
    }
}
