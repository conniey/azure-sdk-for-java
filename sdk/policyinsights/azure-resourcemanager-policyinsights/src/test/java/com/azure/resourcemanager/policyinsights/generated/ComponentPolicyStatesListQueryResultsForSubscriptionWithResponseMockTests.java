// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.policyinsights.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.models.AzureCloud;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.policyinsights.PolicyInsightsManager;
import com.azure.resourcemanager.policyinsights.models.ComponentPolicyStatesQueryResults;
import com.azure.resourcemanager.policyinsights.models.ComponentPolicyStatesResource;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class ComponentPolicyStatesListQueryResultsForSubscriptionWithResponseMockTests {
    @Test
    public void testListQueryResultsForSubscriptionWithResponse() throws Exception {
        String responseStr
            = "{\"@odata.context\":\"kgtzqnwqsttewu\",\"@odata.count\":2081014680,\"value\":[{\"@odata.id\":\"ufjxflpditfno\",\"@odata.context\":\"iyuxlvrh\",\"timestamp\":\"2021-07-30T02:05:13Z\",\"componentId\":\"bwonl\",\"componentType\":\"flvtlrvbstphuyk\",\"componentName\":\"i\",\"resourceId\":\"tlnrj\",\"policyAssignmentId\":\"zdbuzici\",\"policyDefinitionId\":\"poqvgpnewuhwfwj\",\"subscriptionId\":\"xuoxtfnres\",\"resourceType\":\"epgckn\",\"resourceLocation\":\"mgvsnvbtqdxfmj\",\"resourceGroup\":\"jnhj\",\"policyAssignmentName\":\"qllbsupubdxc\",\"policyAssignmentOwner\":\"lhzwh\",\"policyAssignmentParameters\":\"kvbos\",\"policyAssignmentScope\":\"fdizhrjq\",\"policyDefinitionName\":\"aytvsl\",\"policyDefinitionAction\":\"kcgn\",\"policyDefinitionCategory\":\"arlcjiwgsxfaiocw\",\"policySetDefinitionId\":\"ujjgnfgrzxbarc\",\"policySetDefinitionName\":\"aefzqsy\",\"policySetDefinitionOwner\":\"w\",\"policySetDefinitionCategory\":\"jcytesmfucrtfo\",\"policySetDefinitionParameters\":\"hua\",\"policyDefinitionReferenceId\":\"mzivr\",\"complianceState\":\"fzhhezvhjudxdyyr\",\"policyEvaluationDetails\":{\"evaluatedExpressions\":[{},{},{}],\"reason\":\"swtvd\"},\"policyDefinitionGroupNames\":[\"qssgfenffdx\",\"vwfqjch\"],\"policyDefinitionVersion\":\"d\",\"policySetDefinitionVersion\":\"j\",\"policyAssignmentVersion\":\"xndmuvar\",\"tp\":\"datazj\",\"wyopgarpfctwrapc\":\"datarmuhcuhtuzlx\",\"vzesipiys\":\"datadojq\"},{\"@odata.id\":\"qy\",\"@odata.context\":\"aadcndazabundt\",\"timestamp\":\"2021-03-26T10:06:34Z\",\"componentId\":\"aupwhlzyckrem\",\"componentType\":\"lmsvdo\",\"componentName\":\"irxxhyrkqako\",\"resourceId\":\"jfrepr\",\"policyAssignmentId\":\"mkinwteyrq\",\"policyDefinitionId\":\"ixbcejopylblfspr\",\"subscriptionId\":\"cspimtcvvfxrdy\",\"resourceType\":\"fs\",\"resourceLocation\":\"izhqikmgobl\",\"resourceGroup\":\"e\",\"policyAssignmentName\":\"diiisklbonxxup\",\"policyAssignmentOwner\":\"vtrkfkg\",\"policyAssignmentParameters\":\"jqnnpjwkosnyxi\",\"policyAssignmentScope\":\"oujjcx\",\"policyDefinitionName\":\"qmrlhnzkwopswny\",\"policyDefinitionAction\":\"xuprrxyxwjezb\",\"policyDefinitionCategory\":\"ployuekdcpvu\",\"policySetDefinitionId\":\"rsvjmnsvujnjktv\",\"policySetDefinitionName\":\"efcjisepkdbxot\",\"policySetDefinitionOwner\":\"jampqoclannm\",\"policySetDefinitionCategory\":\"nlsuqbwzstr\",\"policySetDefinitionParameters\":\"gvp\",\"policyDefinitionReferenceId\":\"rgjjktfinfhoksmm\",\"complianceState\":\"lwkqic\",\"policyEvaluationDetails\":{\"evaluatedExpressions\":[{}],\"reason\":\"rjflsga\"},\"policyDefinitionGroupNames\":[\"tqpqsdoctpzpujzf\",\"mcdsgxcelujisw\",\"lu\",\"nxhfwlfxzfwu\"],\"policyDefinitionVersion\":\"upcknecexkgrvfp\",\"policySetDefinitionVersion\":\"d\",\"policyAssignmentVersion\":\"gsytqpdzfyxcn\",\"ejqfbi\":\"dataoxcgz\",\"wdrpa\":\"dataopfjx\",\"krfmbwotfcuuu\":\"dataq\"}]}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        PolicyInsightsManager manager = PolicyInsightsManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureCloud.AZURE_PUBLIC_CLOUD));

        ComponentPolicyStatesQueryResults response = manager.componentPolicyStates()
            .listQueryResultsForSubscriptionWithResponse("rnqujywzcqy", ComponentPolicyStatesResource.LATEST,
                1475361380, "nwsvhbngqiwye", "tobdrrpnre", OffsetDateTime.parse("2021-06-25T14:56:35Z"),
                OffsetDateTime.parse("2021-08-17T15:46:44Z"), "nsbfjhhlwtpkvege", "tt",
                com.azure.core.util.Context.NONE)
            .getValue();

        Assertions.assertEquals("swtvd", response.value().get(0).policyEvaluationDetails().reason());
    }
}
