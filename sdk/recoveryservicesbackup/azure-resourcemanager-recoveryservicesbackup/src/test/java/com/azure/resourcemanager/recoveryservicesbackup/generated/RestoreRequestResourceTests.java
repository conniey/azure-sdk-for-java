// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicesbackup.models.RestoreRequest;
import com.azure.resourcemanager.recoveryservicesbackup.models.RestoreRequestResource;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class RestoreRequestResourceTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        RestoreRequestResource model = BinaryData.fromString(
            "{\"properties\":{\"objectType\":\"RestoreRequest\",\"resourceGuardOperationRequests\":[\"ibnuqqkpik\",\"drgvtqagn\",\"uynhijg\"]},\"eTag\":\"ebf\",\"location\":\"iarbutrcvpna\",\"tags\":{\"unmpxttd\":\"hj\",\"nbtkcxywnytnr\":\"hrbnlankxmyskpbh\",\"qidybyx\":\"yn\",\"aaxdbabphlwrq\":\"zfcl\"},\"id\":\"fkts\",\"name\":\"hsucoc\",\"type\":\"nyyazttbtwwrqpue\"}")
            .toObject(RestoreRequestResource.class);
        Assertions.assertEquals("iarbutrcvpna", model.location());
        Assertions.assertEquals("hj", model.tags().get("unmpxttd"));
        Assertions.assertEquals("ibnuqqkpik", model.properties().resourceGuardOperationRequests().get(0));
        Assertions.assertEquals("ebf", model.etag());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        RestoreRequestResource model = new RestoreRequestResource().withLocation("iarbutrcvpna")
            .withTags(
                mapOf("unmpxttd", "hj", "nbtkcxywnytnr", "hrbnlankxmyskpbh", "qidybyx", "yn", "aaxdbabphlwrq", "zfcl"))
            .withProperties(new RestoreRequest()
                .withResourceGuardOperationRequests(Arrays.asList("ibnuqqkpik", "drgvtqagn", "uynhijg")))
            .withEtag("ebf");
        model = BinaryData.fromObject(model).toObject(RestoreRequestResource.class);
        Assertions.assertEquals("iarbutrcvpna", model.location());
        Assertions.assertEquals("hj", model.tags().get("unmpxttd"));
        Assertions.assertEquals("ibnuqqkpik", model.properties().resourceGuardOperationRequests().get(0));
        Assertions.assertEquals("ebf", model.etag());
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
