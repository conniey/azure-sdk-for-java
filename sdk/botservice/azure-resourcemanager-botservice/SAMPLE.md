# Code snippets and samples


## BotConnection

- [Create](#botconnection_create)
- [Delete](#botconnection_delete)
- [Get](#botconnection_get)
- [ListByBotService](#botconnection_listbybotservice)
- [ListServiceProviders](#botconnection_listserviceproviders)
- [ListWithSecrets](#botconnection_listwithsecrets)
- [Update](#botconnection_update)

## Bots

- [Create](#bots_create)
- [Delete](#bots_delete)
- [GetByResourceGroup](#bots_getbyresourcegroup)
- [GetCheckNameAvailability](#bots_getchecknameavailability)
- [List](#bots_list)
- [ListByResourceGroup](#bots_listbyresourcegroup)
- [Update](#bots_update)

## Channels

- [Create](#channels_create)
- [Delete](#channels_delete)
- [Get](#channels_get)
- [ListByResourceGroup](#channels_listbyresourcegroup)
- [ListWithKeys](#channels_listwithkeys)
- [Update](#channels_update)

## DirectLine

- [RegenerateKeys](#directline_regeneratekeys)

## HostSettings

- [Get](#hostsettings_get)

## Operations

- [List](#operations_list)
### BotConnection_Create

```java
import com.azure.resourcemanager.botservice.models.ConnectionSettingParameter;
import com.azure.resourcemanager.botservice.models.ConnectionSettingProperties;
import java.util.Arrays;

/**
 * Samples for BotConnection Create.
 */
public final class BotConnectionCreateSamples {
    /*
     * x-ms-original-file:
     * specification/botservice/resource-manager/Microsoft.BotService/stable/2021-03-01/examples/PutConnection.json
     */
    /**
     * Sample code: Create Connection Setting.
     * 
     * @param manager Entry point to BotServiceManager.
     */
    public static void createConnectionSetting(com.azure.resourcemanager.botservice.BotServiceManager manager) {
        manager.botConnections()
            .define("sampleConnection")
            .withRegion("West US")
            .withExistingBotService("OneResourceGroupName", "samplebotname")
            .withProperties(
                new ConnectionSettingProperties().withClientId("sampleclientid")
                    .withClientSecret("fakeTokenPlaceholder")
                    .withScopes("samplescope")
                    .withServiceProviderId("serviceproviderid")
                    .withParameters(Arrays.asList(
                        new ConnectionSettingParameter().withKey("fakeTokenPlaceholder").withValue("value1"),
                        new ConnectionSettingParameter().withKey("fakeTokenPlaceholder").withValue("value2"))))
            .withEtag("etag1")
            .create();
    }
}
```

### BotConnection_Delete

```java
/**
 * Samples for BotConnection Delete.
 */
public final class BotConnectionDeleteSamples {
    /*
     * x-ms-original-file:
     * specification/botservice/resource-manager/Microsoft.BotService/stable/2021-03-01/examples/DeleteConnection.json
     */
    /**
     * Sample code: Delete Connection Setting.
     * 
     * @param manager Entry point to BotServiceManager.
     */
    public static void deleteConnectionSetting(com.azure.resourcemanager.botservice.BotServiceManager manager) {
        manager.botConnections()
            .deleteWithResponse("OneResourceGroupName", "samplebotname", "sampleConnection",
                com.azure.core.util.Context.NONE);
    }
}
```

### BotConnection_Get

```java
/**
 * Samples for BotConnection Get.
 */
public final class BotConnectionGetSamples {
    /*
     * x-ms-original-file:
     * specification/botservice/resource-manager/Microsoft.BotService/stable/2021-03-01/examples/GetConnection.json
     */
    /**
     * Sample code: Get Connection Setting.
     * 
     * @param manager Entry point to BotServiceManager.
     */
    public static void getConnectionSetting(com.azure.resourcemanager.botservice.BotServiceManager manager) {
        manager.botConnections()
            .getWithResponse("OneResourceGroupName", "samplebotname", "sampleConnection",
                com.azure.core.util.Context.NONE);
    }
}
```

### BotConnection_ListByBotService

```java
/**
 * Samples for BotConnection ListByBotService.
 */
public final class BotConnectionListByBotServiceSamples {
    /*
     * x-ms-original-file: specification/botservice/resource-manager/Microsoft.BotService/stable/2021-03-01/examples/
     * ListConnectionsByBotService.json
     */
    /**
     * Sample code: List Connection Settings.
     * 
     * @param manager Entry point to BotServiceManager.
     */
    public static void listConnectionSettings(com.azure.resourcemanager.botservice.BotServiceManager manager) {
        manager.botConnections()
            .listByBotService("OneResourceGroupName", "samplebotname", com.azure.core.util.Context.NONE);
    }
}
```

### BotConnection_ListServiceProviders

```java
/**
 * Samples for BotConnection ListServiceProviders.
 */
public final class BotConnectionListServiceProvidersSamples {
    /*
     * x-ms-original-file:
     * specification/botservice/resource-manager/Microsoft.BotService/stable/2021-03-01/examples/ListServiceProviders.
     * json
     */
    /**
     * Sample code: List Auth Service Providers.
     * 
     * @param manager Entry point to BotServiceManager.
     */
    public static void listAuthServiceProviders(com.azure.resourcemanager.botservice.BotServiceManager manager) {
        manager.botConnections().listServiceProvidersWithResponse(com.azure.core.util.Context.NONE);
    }
}
```

### BotConnection_ListWithSecrets

```java
/**
 * Samples for BotConnection ListWithSecrets.
 */
public final class BotConnectionListWithSecretsSamples {
    /*
     * x-ms-original-file:
     * specification/botservice/resource-manager/Microsoft.BotService/stable/2021-03-01/examples/GetConnection.json
     */
    /**
     * Sample code: List Connection Setting With Secrets.
     * 
     * @param manager Entry point to BotServiceManager.
     */
    public static void
        listConnectionSettingWithSecrets(com.azure.resourcemanager.botservice.BotServiceManager manager) {
        manager.botConnections()
            .listWithSecretsWithResponse("OneResourceGroupName", "samplebotname", "sampleConnection",
                com.azure.core.util.Context.NONE);
    }
}
```

### BotConnection_Update

```java
import com.azure.resourcemanager.botservice.models.ConnectionSetting;
import com.azure.resourcemanager.botservice.models.ConnectionSettingParameter;
import com.azure.resourcemanager.botservice.models.ConnectionSettingProperties;
import java.util.Arrays;

/**
 * Samples for BotConnection Update.
 */
public final class BotConnectionUpdateSamples {
    /*
     * x-ms-original-file:
     * specification/botservice/resource-manager/Microsoft.BotService/stable/2021-03-01/examples/UpdateConnection.json
     */
    /**
     * Sample code: Update Connection Setting.
     * 
     * @param manager Entry point to BotServiceManager.
     */
    public static void updateConnectionSetting(com.azure.resourcemanager.botservice.BotServiceManager manager) {
        ConnectionSetting resource = manager.botConnections()
            .getWithResponse("OneResourceGroupName", "samplebotname", "sampleConnection",
                com.azure.core.util.Context.NONE)
            .getValue();
        resource.update()
            .withProperties(
                new ConnectionSettingProperties().withClientId("sampleclientid")
                    .withClientSecret("fakeTokenPlaceholder")
                    .withScopes("samplescope")
                    .withServiceProviderId("serviceproviderid")
                    .withServiceProviderDisplayName("serviceProviderDisplayName")
                    .withParameters(Arrays.asList(
                        new ConnectionSettingParameter().withKey("fakeTokenPlaceholder").withValue("value1"),
                        new ConnectionSettingParameter().withKey("fakeTokenPlaceholder").withValue("value2"))))
            .withEtag("etag1")
            .apply();
    }
}
```

### Bots_Create

```java
import com.azure.resourcemanager.botservice.models.BotProperties;
import com.azure.resourcemanager.botservice.models.Kind;
import com.azure.resourcemanager.botservice.models.PublicNetworkAccess;
import com.azure.resourcemanager.botservice.models.Sku;
import com.azure.resourcemanager.botservice.models.SkuName;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Samples for Bots Create.
 */
public final class BotsCreateSamples {
    /*
     * x-ms-original-file:
     * specification/botservice/resource-manager/Microsoft.BotService/stable/2021-03-01/examples/CreateBot.json
     */
    /**
     * Sample code: Create Bot.
     * 
     * @param manager Entry point to BotServiceManager.
     */
    public static void createBot(com.azure.resourcemanager.botservice.BotServiceManager manager) {
        manager.bots()
            .define("samplebotname")
            .withRegion("West US")
            .withExistingResourceGroup("OneResourceGroupName")
            .withTags(mapOf("tag1", "value1", "tag2", "value2"))
            .withProperties(new BotProperties().withDisplayName("The Name of the bot")
                .withDescription("The description of the bot")
                .withIconUrl("http://myicon")
                .withEndpoint("http://mybot.coffee")
                .withMsaAppId("exampleappid")
                .withDeveloperAppInsightKey("fakeTokenPlaceholder")
                .withDeveloperAppInsightsApiKey("fakeTokenPlaceholder")
                .withDeveloperAppInsightsApplicationId("appinsightsappid")
                .withLuisAppIds(Arrays.asList("luisappid1", "luisappid2"))
                .withLuisKey("fakeTokenPlaceholder")
                .withIsCmekEnabled(true)
                .withCmekKeyVaultUrl("fakeTokenPlaceholder")
                .withPublicNetworkAccess(PublicNetworkAccess.ENABLED)
                .withSchemaTransformationVersion("1.0"))
            .withSku(new Sku().withName(SkuName.S1))
            .withKind(Kind.SDK)
            .withEtag("etag1")
            .create();
    }

    // Use "Map.of" if available
    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
```

### Bots_Delete

```java
/**
 * Samples for Bots Delete.
 */
public final class BotsDeleteSamples {
    /*
     * x-ms-original-file:
     * specification/botservice/resource-manager/Microsoft.BotService/stable/2021-03-01/examples/DeleteBot.json
     */
    /**
     * Sample code: Delete Bot.
     * 
     * @param manager Entry point to BotServiceManager.
     */
    public static void deleteBot(com.azure.resourcemanager.botservice.BotServiceManager manager) {
        manager.bots()
            .deleteByResourceGroupWithResponse("OneResourceGroupName", "samplebotname",
                com.azure.core.util.Context.NONE);
    }
}
```

### Bots_GetByResourceGroup

```java
/**
 * Samples for Bots GetByResourceGroup.
 */
public final class BotsGetByResourceGroupSamples {
    /*
     * x-ms-original-file:
     * specification/botservice/resource-manager/Microsoft.BotService/stable/2021-03-01/examples/GetBot.json
     */
    /**
     * Sample code: Get Bot.
     * 
     * @param manager Entry point to BotServiceManager.
     */
    public static void getBot(com.azure.resourcemanager.botservice.BotServiceManager manager) {
        manager.bots()
            .getByResourceGroupWithResponse("OneResourceGroupName", "samplebotname", com.azure.core.util.Context.NONE);
    }
}
```

### Bots_GetCheckNameAvailability

```java
import com.azure.resourcemanager.botservice.models.CheckNameAvailabilityRequestBody;

/**
 * Samples for Bots GetCheckNameAvailability.
 */
public final class BotsGetCheckNameAvailabilitySamples {
    /*
     * x-ms-original-file:
     * specification/botservice/resource-manager/Microsoft.BotService/stable/2021-03-01/examples/CheckNameAvailability.
     * json
     */
    /**
     * Sample code: check Name Availability.
     * 
     * @param manager Entry point to BotServiceManager.
     */
    public static void checkNameAvailability(com.azure.resourcemanager.botservice.BotServiceManager manager) {
        manager.bots()
            .getCheckNameAvailabilityWithResponse(
                new CheckNameAvailabilityRequestBody().withName("testbotname").withType("string"),
                com.azure.core.util.Context.NONE);
    }
}
```

### Bots_List

```java
/**
 * Samples for Bots List.
 */
public final class BotsListSamples {
    /*
     * x-ms-original-file:
     * specification/botservice/resource-manager/Microsoft.BotService/stable/2021-03-01/examples/ListBotsBySubscription.
     * json
     */
    /**
     * Sample code: List Bots by Subscription.
     * 
     * @param manager Entry point to BotServiceManager.
     */
    public static void listBotsBySubscription(com.azure.resourcemanager.botservice.BotServiceManager manager) {
        manager.bots().list(com.azure.core.util.Context.NONE);
    }
}
```

### Bots_ListByResourceGroup

```java
/**
 * Samples for Bots ListByResourceGroup.
 */
public final class BotsListByResourceGroupSamples {
    /*
     * x-ms-original-file:
     * specification/botservice/resource-manager/Microsoft.BotService/stable/2021-03-01/examples/ListBotsByResourceGroup
     * .json
     */
    /**
     * Sample code: List Bots by Resource Group.
     * 
     * @param manager Entry point to BotServiceManager.
     */
    public static void listBotsByResourceGroup(com.azure.resourcemanager.botservice.BotServiceManager manager) {
        manager.bots().listByResourceGroup("OneResourceGroupName", com.azure.core.util.Context.NONE);
    }
}
```

### Bots_Update

```java
import com.azure.resourcemanager.botservice.models.Bot;
import com.azure.resourcemanager.botservice.models.BotProperties;
import com.azure.resourcemanager.botservice.models.Kind;
import com.azure.resourcemanager.botservice.models.PublicNetworkAccess;
import com.azure.resourcemanager.botservice.models.Sku;
import com.azure.resourcemanager.botservice.models.SkuName;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Samples for Bots Update.
 */
public final class BotsUpdateSamples {
    /*
     * x-ms-original-file:
     * specification/botservice/resource-manager/Microsoft.BotService/stable/2021-03-01/examples/UpdateBot.json
     */
    /**
     * Sample code: Update Bot.
     * 
     * @param manager Entry point to BotServiceManager.
     */
    public static void updateBot(com.azure.resourcemanager.botservice.BotServiceManager manager) {
        Bot resource = manager.bots()
            .getByResourceGroupWithResponse("OneResourceGroupName", "samplebotname", com.azure.core.util.Context.NONE)
            .getValue();
        resource.update()
            .withTags(mapOf("tag1", "value1", "tag2", "value2"))
            .withProperties(new BotProperties().withDisplayName("The Name of the bot")
                .withDescription("The description of the bot")
                .withIconUrl("http://myicon")
                .withEndpoint("http://mybot.coffee")
                .withMsaAppId("msaappid")
                .withDeveloperAppInsightKey("fakeTokenPlaceholder")
                .withDeveloperAppInsightsApiKey("fakeTokenPlaceholder")
                .withDeveloperAppInsightsApplicationId("appinsightsappid")
                .withLuisAppIds(Arrays.asList("luisappid1", "luisappid2"))
                .withLuisKey("fakeTokenPlaceholder")
                .withIsCmekEnabled(true)
                .withCmekKeyVaultUrl("fakeTokenPlaceholder")
                .withPublicNetworkAccess(PublicNetworkAccess.ENABLED)
                .withSchemaTransformationVersion("1.0"))
            .withSku(new Sku().withName(SkuName.S1))
            .withKind(Kind.SDK)
            .withEtag("etag1")
            .apply();
    }

    // Use "Map.of" if available
    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
```

### Channels_Create

```java
import com.azure.resourcemanager.botservice.fluent.models.BotChannelInner;
import com.azure.resourcemanager.botservice.models.AlexaChannel;
import com.azure.resourcemanager.botservice.models.AlexaChannelProperties;
import com.azure.resourcemanager.botservice.models.ChannelName;
import com.azure.resourcemanager.botservice.models.DirectLineSpeechChannel;
import com.azure.resourcemanager.botservice.models.DirectLineSpeechChannelProperties;
import com.azure.resourcemanager.botservice.models.EmailChannel;
import com.azure.resourcemanager.botservice.models.EmailChannelAuthMethod;
import com.azure.resourcemanager.botservice.models.EmailChannelProperties;
import com.azure.resourcemanager.botservice.models.LineChannel;
import com.azure.resourcemanager.botservice.models.LineChannelProperties;
import com.azure.resourcemanager.botservice.models.LineRegistration;
import java.util.Arrays;

/**
 * Samples for Channels Create.
 */
public final class ChannelsCreateSamples {
    /*
     * x-ms-original-file: specification/botservice/resource-manager/Microsoft.BotService/stable/2021-03-01/examples/
     * PutDirectLineSpeechChannel.json
     */
    /**
     * Sample code: Create DirectLine Speech Channel.
     * 
     * @param manager Entry point to BotServiceManager.
     */
    public static void createDirectLineSpeechChannel(com.azure.resourcemanager.botservice.BotServiceManager manager) {
        manager.channels()
            .createWithResponse("OneResourceGroupName", "samplebotname", ChannelName.DIRECT_LINE_SPEECH_CHANNEL,
                new BotChannelInner().withLocation("global")
                    .withProperties(new DirectLineSpeechChannel().withProperties(
                        new DirectLineSpeechChannelProperties().withCognitiveServiceRegion("XcognitiveServiceRegionX")
                            .withCognitiveServiceSubscriptionKey("fakeTokenPlaceholder")
                            .withIsEnabled(true))),
                com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file:
     * specification/botservice/resource-manager/Microsoft.BotService/stable/2021-03-01/examples/PutEmailChannel.json
     */
    /**
     * Sample code: Create Email Channel.
     * 
     * @param manager Entry point to BotServiceManager.
     */
    public static void createEmailChannel(com.azure.resourcemanager.botservice.BotServiceManager manager) {
        manager.channels()
            .createWithResponse("OneResourceGroupName", "samplebotname", ChannelName.EMAIL_CHANNEL,
                new BotChannelInner().withLocation("global")
                    .withProperties(
                        new EmailChannel().withProperties(new EmailChannelProperties().withEmailAddress("a@b.com")
                            .withAuthMethod(EmailChannelAuthMethod.ONE)
                            .withMagicCode("fakeTokenPlaceholder")
                            .withIsEnabled(true))),
                com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file:
     * specification/botservice/resource-manager/Microsoft.BotService/stable/2021-03-01/examples/PutAlexaChannel.json
     */
    /**
     * Sample code: Create Alexa Channel.
     * 
     * @param manager Entry point to BotServiceManager.
     */
    public static void createAlexaChannel(com.azure.resourcemanager.botservice.BotServiceManager manager) {
        manager.channels()
            .createWithResponse("OneResourceGroupName", "samplebotname", ChannelName.ALEXA_CHANNEL,
                new BotChannelInner().withLocation("global")
                    .withProperties(new AlexaChannel().withProperties(
                        new AlexaChannelProperties().withAlexaSkillId("XAlexaSkillIdX").withIsEnabled(true))),
                com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file:
     * specification/botservice/resource-manager/Microsoft.BotService/stable/2021-03-01/examples/PutChannel.json
     */
    /**
     * Sample code: Create Channel.
     * 
     * @param manager Entry point to BotServiceManager.
     */
    public static void createChannel(com.azure.resourcemanager.botservice.BotServiceManager manager) {
        manager.channels()
            .createWithResponse("OneResourceGroupName", "samplebotname", ChannelName.EMAIL_CHANNEL,
                new BotChannelInner().withLocation("global")
                    .withProperties(
                        new EmailChannel().withProperties(new EmailChannelProperties().withEmailAddress("a@b.com")
                            .withPassword("fakeTokenPlaceholder")
                            .withIsEnabled(true))),
                com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file:
     * specification/botservice/resource-manager/Microsoft.BotService/stable/2021-03-01/examples/PutLineChannel.json
     */
    /**
     * Sample code: Create Line Channel.
     * 
     * @param manager Entry point to BotServiceManager.
     */
    public static void createLineChannel(com.azure.resourcemanager.botservice.BotServiceManager manager) {
        manager.channels()
            .createWithResponse("OneResourceGroupName", "samplebotname", ChannelName.LINE_CHANNEL,
                new BotChannelInner().withLocation("global")
                    .withProperties(new LineChannel().withProperties(new LineChannelProperties().withLineRegistrations(
                        Arrays.asList(new LineRegistration().withChannelSecret("fakeTokenPlaceholder")
                            .withChannelAccessToken("fakeTokenPlaceholder"))))),
                com.azure.core.util.Context.NONE);
    }
}
```

### Channels_Delete

```java
/**
 * Samples for Channels Delete.
 */
public final class ChannelsDeleteSamples {
    /*
     * x-ms-original-file:
     * specification/botservice/resource-manager/Microsoft.BotService/stable/2021-03-01/examples/DeleteChannel.json
     */
    /**
     * Sample code: Delete Channel.
     * 
     * @param manager Entry point to BotServiceManager.
     */
    public static void deleteChannel(com.azure.resourcemanager.botservice.BotServiceManager manager) {
        manager.channels()
            .deleteWithResponse("OneResourceGroupName", "samplebotname", "EmailChannel",
                com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/botservice/resource-manager/Microsoft.BotService/stable/2021-03-01/examples/
     * DeleteDirectLineSpeechChannel.json
     */
    /**
     * Sample code: Delete DirectLine Speech Channel.
     * 
     * @param manager Entry point to BotServiceManager.
     */
    public static void deleteDirectLineSpeechChannel(com.azure.resourcemanager.botservice.BotServiceManager manager) {
        manager.channels()
            .deleteWithResponse("OneResourceGroupName", "samplebotname", "DirectLineSpeechChannel",
                com.azure.core.util.Context.NONE);
    }
}
```

### Channels_Get

```java
/**
 * Samples for Channels Get.
 */
public final class ChannelsGetSamples {
    /*
     * x-ms-original-file: specification/botservice/resource-manager/Microsoft.BotService/stable/2021-03-01/examples/
     * GetDirectLineSpeechChannel.json
     */
    /**
     * Sample code: Get DirectLine Speech Channel.
     * 
     * @param manager Entry point to BotServiceManager.
     */
    public static void getDirectLineSpeechChannel(com.azure.resourcemanager.botservice.BotServiceManager manager) {
        manager.channels()
            .getWithResponse("OneResourceGroupName", "samplebotname", "DirectLineSpeechChannel",
                com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file:
     * specification/botservice/resource-manager/Microsoft.BotService/stable/2021-03-01/examples/GetAlexaChannel.json
     */
    /**
     * Sample code: Get Alexa Channel.
     * 
     * @param manager Entry point to BotServiceManager.
     */
    public static void getAlexaChannel(com.azure.resourcemanager.botservice.BotServiceManager manager) {
        manager.channels()
            .getWithResponse("OneResourceGroupName", "samplebotname", "AlexaChannel", com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file:
     * specification/botservice/resource-manager/Microsoft.BotService/stable/2021-03-01/examples/GetLineChannel.json
     */
    /**
     * Sample code: Get Line Channel.
     * 
     * @param manager Entry point to BotServiceManager.
     */
    public static void getLineChannel(com.azure.resourcemanager.botservice.BotServiceManager manager) {
        manager.channels()
            .getWithResponse("OneResourceGroupName", "samplebotname", "LineChannel", com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file:
     * specification/botservice/resource-manager/Microsoft.BotService/stable/2021-03-01/examples/GetChannel.json
     */
    /**
     * Sample code: Get Channel.
     * 
     * @param manager Entry point to BotServiceManager.
     */
    public static void getChannel(com.azure.resourcemanager.botservice.BotServiceManager manager) {
        manager.channels()
            .getWithResponse("OneResourceGroupName", "samplebotname", "EmailChannel", com.azure.core.util.Context.NONE);
    }
}
```

### Channels_ListByResourceGroup

```java
/**
 * Samples for Channels ListByResourceGroup.
 */
public final class ChannelsListByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/botservice/resource-manager/Microsoft.BotService/stable/2021-03-01/examples/
     * ListChannelsByBotService.json
     */
    /**
     * Sample code: List Channels by Resource Group.
     * 
     * @param manager Entry point to BotServiceManager.
     */
    public static void listChannelsByResourceGroup(com.azure.resourcemanager.botservice.BotServiceManager manager) {
        manager.channels()
            .listByResourceGroup("OneResourceGroupName", "samplebotname", com.azure.core.util.Context.NONE);
    }
}
```

### Channels_ListWithKeys

```java
import com.azure.resourcemanager.botservice.models.ChannelName;

/**
 * Samples for Channels ListWithKeys.
 */
public final class ChannelsListWithKeysSamples {
    /*
     * x-ms-original-file:
     * specification/botservice/resource-manager/Microsoft.BotService/stable/2021-03-01/examples/ListChannel.json
     */
    /**
     * Sample code: List Channel.
     * 
     * @param manager Entry point to BotServiceManager.
     */
    public static void listChannel(com.azure.resourcemanager.botservice.BotServiceManager manager) {
        manager.channels()
            .listWithKeysWithResponse("OneResourceGroupName", "samplebotname", ChannelName.EMAIL_CHANNEL,
                com.azure.core.util.Context.NONE);
    }
}
```

### Channels_Update

```java
import com.azure.resourcemanager.botservice.fluent.models.BotChannelInner;
import com.azure.resourcemanager.botservice.models.AlexaChannel;
import com.azure.resourcemanager.botservice.models.AlexaChannelProperties;
import com.azure.resourcemanager.botservice.models.ChannelName;
import com.azure.resourcemanager.botservice.models.DirectLineSpeechChannel;
import com.azure.resourcemanager.botservice.models.DirectLineSpeechChannelProperties;
import com.azure.resourcemanager.botservice.models.EmailChannel;
import com.azure.resourcemanager.botservice.models.EmailChannelProperties;
import com.azure.resourcemanager.botservice.models.LineChannel;
import com.azure.resourcemanager.botservice.models.LineChannelProperties;
import com.azure.resourcemanager.botservice.models.LineRegistration;
import java.util.Arrays;

/**
 * Samples for Channels Update.
 */
public final class ChannelsUpdateSamples {
    /*
     * x-ms-original-file:
     * specification/botservice/resource-manager/Microsoft.BotService/stable/2021-03-01/examples/UpdateAlexaChannel.json
     */
    /**
     * Sample code: Update Alexa Channel.
     * 
     * @param manager Entry point to BotServiceManager.
     */
    public static void updateAlexaChannel(com.azure.resourcemanager.botservice.BotServiceManager manager) {
        manager.channels()
            .updateWithResponse("OneResourceGroupName", "samplebotname", ChannelName.ALEXA_CHANNEL,
                new BotChannelInner().withLocation("global")
                    .withProperties(new AlexaChannel().withProperties(
                        new AlexaChannelProperties().withAlexaSkillId("XAlexaSkillIdX").withIsEnabled(true))),
                com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/botservice/resource-manager/Microsoft.BotService/stable/2021-03-01/examples/
     * UpdateDirectLineSpeechChannel.json
     */
    /**
     * Sample code: Update DirectLine Speech Channel.
     * 
     * @param manager Entry point to BotServiceManager.
     */
    public static void updateDirectLineSpeechChannel(com.azure.resourcemanager.botservice.BotServiceManager manager) {
        manager.channels()
            .updateWithResponse("OneResourceGroupName", "samplebotname", ChannelName.DIRECT_LINE_SPEECH_CHANNEL,
                new BotChannelInner().withLocation("global")
                    .withProperties(new DirectLineSpeechChannel().withProperties(
                        new DirectLineSpeechChannelProperties().withCognitiveServiceRegion("XcognitiveServiceRegionX")
                            .withCognitiveServiceSubscriptionKey("fakeTokenPlaceholder")
                            .withIsEnabled(true))),
                com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file:
     * specification/botservice/resource-manager/Microsoft.BotService/stable/2021-03-01/examples/UpdateLineChannel.json
     */
    /**
     * Sample code: Update Line Channel.
     * 
     * @param manager Entry point to BotServiceManager.
     */
    public static void updateLineChannel(com.azure.resourcemanager.botservice.BotServiceManager manager) {
        manager.channels()
            .updateWithResponse("OneResourceGroupName", "samplebotname", ChannelName.LINE_CHANNEL,
                new BotChannelInner().withLocation("global")
                    .withProperties(new LineChannel().withProperties(new LineChannelProperties().withLineRegistrations(
                        Arrays.asList(new LineRegistration().withChannelSecret("fakeTokenPlaceholder")
                            .withChannelAccessToken("fakeTokenPlaceholder"))))),
                com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file:
     * specification/botservice/resource-manager/Microsoft.BotService/stable/2021-03-01/examples/UpdateChannel.json
     */
    /**
     * Sample code: Update Channel.
     * 
     * @param manager Entry point to BotServiceManager.
     */
    public static void updateChannel(com.azure.resourcemanager.botservice.BotServiceManager manager) {
        manager.channels()
            .updateWithResponse("OneResourceGroupName", "samplebotname", ChannelName.EMAIL_CHANNEL,
                new BotChannelInner().withLocation("global")
                    .withProperties(
                        new EmailChannel().withProperties(new EmailChannelProperties().withEmailAddress("a@b.com")
                            .withPassword("fakeTokenPlaceholder")
                            .withIsEnabled(true))),
                com.azure.core.util.Context.NONE);
    }
}
```

### DirectLine_RegenerateKeys

```java
import com.azure.resourcemanager.botservice.models.Key;
import com.azure.resourcemanager.botservice.models.RegenerateKeysChannelName;
import com.azure.resourcemanager.botservice.models.SiteInfo;

/**
 * Samples for DirectLine RegenerateKeys.
 */
public final class DirectLineRegenerateKeysSamples {
    /*
     * x-ms-original-file: specification/botservice/resource-manager/Microsoft.BotService/stable/2021-03-01/examples/
     * DirectlineRegenerateKeys.json
     */
    /**
     * Sample code: Regenerate Keys for DirectLine Channel Site.
     * 
     * @param manager Entry point to BotServiceManager.
     */
    public static void
        regenerateKeysForDirectLineChannelSite(com.azure.resourcemanager.botservice.BotServiceManager manager) {
        manager.directLines()
            .regenerateKeysWithResponse("OneResourceGroupName", "samplebotname",
                RegenerateKeysChannelName.DIRECT_LINE_CHANNEL,
                new SiteInfo().withSiteName("testSiteName").withKey(Key.KEY1), com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file:
     * specification/botservice/resource-manager/Microsoft.BotService/stable/2021-03-01/examples/WebChatRegenerateKeys.
     * json
     */
    /**
     * Sample code: Regenerate Keys for WebChat Channel Site.
     * 
     * @param manager Entry point to BotServiceManager.
     */
    public static void
        regenerateKeysForWebChatChannelSite(com.azure.resourcemanager.botservice.BotServiceManager manager) {
        manager.directLines()
            .regenerateKeysWithResponse("OneResourceGroupName", "samplebotname",
                RegenerateKeysChannelName.WEB_CHAT_CHANNEL,
                new SiteInfo().withSiteName("testSiteName").withKey(Key.KEY1), com.azure.core.util.Context.NONE);
    }
}
```

### HostSettings_Get

```java
/**
 * Samples for HostSettings Get.
 */
public final class HostSettingsGetSamples {
    /*
     * x-ms-original-file:
     * specification/botservice/resource-manager/Microsoft.BotService/stable/2021-03-01/examples/GetHostSettings.json
     */
    /**
     * Sample code: Get Bot Host Settings.
     * 
     * @param manager Entry point to BotServiceManager.
     */
    public static void getBotHostSettings(com.azure.resourcemanager.botservice.BotServiceManager manager) {
        manager.hostSettings().getWithResponse(com.azure.core.util.Context.NONE);
    }
}
```

### Operations_List

```java
/**
 * Samples for Operations List.
 */
public final class OperationsListSamples {
    /*
     * x-ms-original-file:
     * specification/botservice/resource-manager/Microsoft.BotService/stable/2021-03-01/examples/GetOperations.json
     */
    /**
     * Sample code: Get Operations.
     * 
     * @param manager Entry point to BotServiceManager.
     */
    public static void getOperations(com.azure.resourcemanager.botservice.BotServiceManager manager) {
        manager.operations().list(com.azure.core.util.Context.NONE);
    }
}
```

