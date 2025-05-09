// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.neonpostgres.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.models.AzureCloud;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.neonpostgres.NeonPostgresManager;
import com.azure.resourcemanager.neonpostgres.models.Branch;
import com.azure.resourcemanager.neonpostgres.models.EndpointType;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class BranchesListMockTests {
    @Test
    public void testList() throws Exception {
        String responseStr
            = "{\"value\":[{\"properties\":{\"entityId\":\"fqpgaixwrgr\",\"entityName\":\"derfrswqikwepwog\",\"createdAt\":\"icwn\",\"provisioningState\":\"Failed\",\"attributes\":[{\"name\":\"cqbsudzpgchzpg\",\"value\":\"qumjdjxhzghgod\"},{\"name\":\"ynrceqavfdbdf\",\"value\":\"mxjdnaju\"},{\"name\":\"pjyyqmkwlhvc\",\"value\":\"loqd\"},{\"name\":\"jk\",\"value\":\"uxxrwzobuzms\"}],\"projectId\":\"amt\",\"parentId\":\"kwppthuzdprmimr\",\"roleName\":\"dpoqfxyem\",\"databaseName\":\"ftb\",\"roles\":[{\"entityId\":\"tecloamfmxtll\",\"entityName\":\"tymqcnrrfijhggab\",\"createdAt\":\"gamk\",\"provisioningState\":\"Failed\",\"attributes\":[{\"name\":\"wdvffhsdpzouh\",\"value\":\"tqrxqwqnjxrdf\"},{\"name\":\"dtullygtavczcxdf\",\"value\":\"eapyfmlxrlj\"},{\"name\":\"h\",\"value\":\"aspiflei\"},{\"name\":\"ixlmdbgic\",\"value\":\"hfgsmd\"}],\"branchId\":\"uq\",\"permissions\":[\"tokljmtznpaxw\",\"qtyyqiprcltungb\",\"olj\"],\"isSuperUser\":false},{\"entityId\":\"i\",\"entityName\":\"b\",\"createdAt\":\"ckgk\",\"provisioningState\":\"Failed\",\"attributes\":[{\"name\":\"tiiqqcqikclsmaln\",\"value\":\"swoykdn\"}],\"branchId\":\"aaxwmgzr\",\"permissions\":[\"qcwnynl\",\"eiqbcbgvsbts\",\"rtoxadhxuvjhxm\"],\"isSuperUser\":false},{\"entityId\":\"tjc\",\"entityName\":\"twmlg\",\"createdAt\":\"vnpvvd\",\"provisioningState\":\"Failed\",\"attributes\":[{\"name\":\"q\",\"value\":\"qipslz\"},{\"name\":\"vcdsvm\",\"value\":\"bit\"}],\"branchId\":\"dtfobvfi\",\"permissions\":[\"qich\"],\"isSuperUser\":true},{\"entityId\":\"zdqekivycpzcvd\",\"entityName\":\"ulrqtbht\",\"createdAt\":\"zpzlpryf\",\"provisioningState\":\"Failed\",\"attributes\":[{\"name\":\"t\",\"value\":\"fkgilnoudccgnd\"},{\"name\":\"gdpri\",\"value\":\"gqqyeqfcbuulpyuf\"},{\"name\":\"qjfshtujcyo\",\"value\":\"igi\"},{\"name\":\"wdcsk\",\"value\":\"kqnqvkixnmbzme\"}],\"branchId\":\"yrzwim\",\"permissions\":[\"yspzvrie\",\"vfph\",\"dzxplgtp\"],\"isSuperUser\":true}],\"databases\":[{\"entityId\":\"zmgschnzrsbkkzov\",\"entityName\":\"dmnfmfws\",\"createdAt\":\"fo\",\"provisioningState\":\"Succeeded\",\"attributes\":[{\"name\":\"immovzwd\",\"value\":\"hkkmvhzfovan\"}],\"branchId\":\"vaprtgelgw\",\"ownerName\":\"ikfyaqandm\"},{\"entityId\":\"n\",\"entityName\":\"qjumovs\",\"createdAt\":\"pbvzopaxmfmvsmcw\",\"provisioningState\":\"Canceled\",\"attributes\":[{\"name\":\"dtnqifbsa\",\"value\":\"roiauesugmo\"},{\"name\":\"pcjycb\",\"value\":\"elrgttwfldsiuo\"},{\"name\":\"ini\",\"value\":\"cedpksriwmmtmqrx\"}],\"branchId\":\"qvvyczyay\",\"ownerName\":\"tg\"}],\"endpoints\":[{\"entityId\":\"qahragpxmibplnu\",\"entityName\":\"yryefqm\",\"createdAt\":\"vyztxlno\",\"provisioningState\":\"Succeeded\",\"attributes\":[{\"name\":\"ceeg\",\"value\":\"yieztkutnjil\"},{\"name\":\"ukkrehyh\",\"value\":\"mjodu\"},{\"name\":\"fvulxfaryr\",\"value\":\"jlgdez\"}],\"projectId\":\"qwahoy\",\"branchId\":\"axqvjweiwtczkddn\",\"endpointType\":\"read_write\"},{\"entityId\":\"ooq\",\"entityName\":\"dqrxygla\",\"createdAt\":\"scflwtjdtlri\",\"provisioningState\":\"Failed\",\"attributes\":[{\"name\":\"ycuxdtzcqip\",\"value\":\"dudgcozzomeh\"}],\"projectId\":\"antolamlbijuxkq\",\"branchId\":\"czipvwdtgck\",\"endpointType\":\"read_write\"}]},\"id\":\"qdlratrkw\",\"name\":\"oauwxsuyk\",\"type\":\"nhrfgslgl\"}]}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        NeonPostgresManager manager = NeonPostgresManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureCloud.AZURE_PUBLIC_CLOUD));

        PagedIterable<Branch> response
            = manager.branches().list("ookyfoz", "bn", "x", com.azure.core.util.Context.NONE);

        Assertions.assertEquals("derfrswqikwepwog", response.iterator().next().properties().entityName());
        Assertions.assertEquals("cqbsudzpgchzpg", response.iterator().next().properties().attributes().get(0).name());
        Assertions.assertEquals("qumjdjxhzghgod", response.iterator().next().properties().attributes().get(0).value());
        Assertions.assertEquals("amt", response.iterator().next().properties().projectId());
        Assertions.assertEquals("kwppthuzdprmimr", response.iterator().next().properties().parentId());
        Assertions.assertEquals("dpoqfxyem", response.iterator().next().properties().roleName());
        Assertions.assertEquals("ftb", response.iterator().next().properties().databaseName());
        Assertions.assertEquals("tymqcnrrfijhggab",
            response.iterator().next().properties().roles().get(0).entityName());
        Assertions.assertEquals("wdvffhsdpzouh",
            response.iterator().next().properties().roles().get(0).attributes().get(0).name());
        Assertions.assertEquals("tqrxqwqnjxrdf",
            response.iterator().next().properties().roles().get(0).attributes().get(0).value());
        Assertions.assertEquals("uq", response.iterator().next().properties().roles().get(0).branchId());
        Assertions.assertEquals("tokljmtznpaxw",
            response.iterator().next().properties().roles().get(0).permissions().get(0));
        Assertions.assertFalse(response.iterator().next().properties().roles().get(0).isSuperUser());
        Assertions.assertEquals("dmnfmfws", response.iterator().next().properties().databases().get(0).entityName());
        Assertions.assertEquals("immovzwd",
            response.iterator().next().properties().databases().get(0).attributes().get(0).name());
        Assertions.assertEquals("hkkmvhzfovan",
            response.iterator().next().properties().databases().get(0).attributes().get(0).value());
        Assertions.assertEquals("vaprtgelgw", response.iterator().next().properties().databases().get(0).branchId());
        Assertions.assertEquals("ikfyaqandm", response.iterator().next().properties().databases().get(0).ownerName());
        Assertions.assertEquals("yryefqm", response.iterator().next().properties().endpoints().get(0).entityName());
        Assertions.assertEquals("ceeg",
            response.iterator().next().properties().endpoints().get(0).attributes().get(0).name());
        Assertions.assertEquals("yieztkutnjil",
            response.iterator().next().properties().endpoints().get(0).attributes().get(0).value());
        Assertions.assertEquals("qwahoy", response.iterator().next().properties().endpoints().get(0).projectId());
        Assertions.assertEquals("axqvjweiwtczkddn",
            response.iterator().next().properties().endpoints().get(0).branchId());
        Assertions.assertEquals(EndpointType.READ_WRITE,
            response.iterator().next().properties().endpoints().get(0).endpointType());
    }
}
