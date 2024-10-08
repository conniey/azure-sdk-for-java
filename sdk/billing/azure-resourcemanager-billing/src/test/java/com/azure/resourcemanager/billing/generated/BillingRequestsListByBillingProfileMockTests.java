// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.billing.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.billing.BillingManager;
import com.azure.resourcemanager.billing.models.BillingRequest;
import com.azure.resourcemanager.billing.models.BillingRequestStatus;
import com.azure.resourcemanager.billing.models.BillingRequestType;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class BillingRequestsListByBillingProfileMockTests {
    @Test
    public void testListByBillingProfile() throws Exception {
        String responseStr
            = "{\"value\":[{\"properties\":{\"provisioningState\":\"ConfirmedBilling\",\"additionalInformation\":{\"kkmvhzfovanyrva\":\"de\",\"ewikfyaqandmym\":\"rtgelg\"},\"reviewedBy\":{\"tenantId\":\"qjumovs\",\"objectId\":\"pbvzopaxmfmvsmcw\",\"upn\":\"faxdtnqifbsa\"},\"reviewalDate\":\"2021-08-29T12:23:35Z\",\"billingAccountId\":\"auesugm\",\"billingAccountName\":\"pcjycb\",\"billingAccountDisplayName\":\"lrgttwfldsiuor\",\"billingAccountPrimaryBillingTenantId\":\"ikcedpk\",\"billingProfileId\":\"iwm\",\"billingProfileName\":\"mqr\",\"billingProfileDisplayName\":\"zqv\",\"createdBy\":{\"tenantId\":\"zyayubtgmbxi\",\"objectId\":\"hragpxmib\",\"upn\":\"nupoyryefqmwovyz\"},\"creationDate\":\"2021-06-17T04:37:23Z\",\"expirationDate\":\"2021-04-11T08:41:17Z\",\"decisionReason\":\"fpbjc\",\"invoiceSectionId\":\"gvyieztkutnjil\",\"invoiceSectionName\":\"kkreh\",\"invoiceSectionDisplayName\":\"tmjoduifvu\",\"customerId\":\"faryrvjlg\",\"customerName\":\"zvj\",\"customerDisplayName\":\"ahoyiyaxqvj\",\"subscriptionId\":\"i\",\"subscriptionName\":\"czkddn\",\"subscriptionDisplayName\":\"vbooqbmdqrxy\",\"justification\":\"ae\",\"recipients\":[{\"tenantId\":\"lw\",\"objectId\":\"dtlri\",\"upn\":\"ooy\"},{\"tenantId\":\"uxdtzcq\",\"objectId\":\"sdudgcoz\",\"upn\":\"meh\"},{\"tenantId\":\"antolamlbijuxkq\",\"objectId\":\"czipvwdtgck\",\"upn\":\"qiqdlratrkwxoau\"}],\"requestScope\":\"suykznhrfgsl\",\"billingScope\":\"hpryjfzihuioa\",\"status\":\"Cancelled\",\"type\":\"ProvisioningAccess\",\"lastUpdatedBy\":{\"tenantId\":\"feyvkbdgdd\",\"objectId\":\"hdccxb\",\"upn\":\"uqutkzwtjww\"},\"lastUpdatedDate\":\"2021-06-11T12:35:16Z\"},\"tags\":{\"deg\":\"ijcxfno\",\"uckcatuqbhpow\":\"dydhqkkkb\",\"tpzdlyseidto\":\"n\",\"d\":\"katprytgrhzbq\"},\"id\":\"aw\",\"name\":\"ptvcs\",\"type\":\"tk\"}]}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        BillingManager manager = BillingManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        PagedIterable<BillingRequest> response = manager.billingRequests()
            .listByBillingProfile("mbzayspzvrietv", "phmdzxplgtp", "dvatlzmgschn", "rsbkkzovlzdmnfmf",
                1995531024011368029L, 4913449037971080333L, true, "fuwori", com.azure.core.util.Context.NONE);

        Assertions.assertEquals("ijcxfno", response.iterator().next().tags().get("deg"));
        Assertions.assertEquals("de",
            response.iterator().next().properties().additionalInformation().get("kkmvhzfovanyrva"));
        Assertions.assertEquals("qjumovs", response.iterator().next().properties().reviewedBy().tenantId());
        Assertions.assertEquals("pbvzopaxmfmvsmcw", response.iterator().next().properties().reviewedBy().objectId());
        Assertions.assertEquals("faxdtnqifbsa", response.iterator().next().properties().reviewedBy().upn());
        Assertions.assertEquals("zyayubtgmbxi", response.iterator().next().properties().createdBy().tenantId());
        Assertions.assertEquals("hragpxmib", response.iterator().next().properties().createdBy().objectId());
        Assertions.assertEquals("nupoyryefqmwovyz", response.iterator().next().properties().createdBy().upn());
        Assertions.assertEquals("fpbjc", response.iterator().next().properties().decisionReason());
        Assertions.assertEquals("ae", response.iterator().next().properties().justification());
        Assertions.assertEquals("lw", response.iterator().next().properties().recipients().get(0).tenantId());
        Assertions.assertEquals("dtlri", response.iterator().next().properties().recipients().get(0).objectId());
        Assertions.assertEquals("ooy", response.iterator().next().properties().recipients().get(0).upn());
        Assertions.assertEquals("suykznhrfgsl", response.iterator().next().properties().requestScope());
        Assertions.assertEquals(BillingRequestStatus.CANCELLED, response.iterator().next().properties().status());
        Assertions.assertEquals(BillingRequestType.PROVISIONING_ACCESS, response.iterator().next().properties().type());
        Assertions.assertEquals("feyvkbdgdd", response.iterator().next().properties().lastUpdatedBy().tenantId());
        Assertions.assertEquals("hdccxb", response.iterator().next().properties().lastUpdatedBy().objectId());
        Assertions.assertEquals("uqutkzwtjww", response.iterator().next().properties().lastUpdatedBy().upn());
    }
}
