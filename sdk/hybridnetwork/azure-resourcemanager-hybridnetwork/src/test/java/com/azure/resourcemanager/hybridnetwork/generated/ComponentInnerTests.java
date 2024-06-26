// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridnetwork.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.hybridnetwork.fluent.models.ComponentInner;
import com.azure.resourcemanager.hybridnetwork.models.ComponentProperties;

public final class ComponentInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ComponentInner model = BinaryData.fromString(
            "{\"properties\":{\"provisioningState\":\"Succeeded\",\"deploymentProfile\":\"lsicohoqqnwv\",\"deploymentStatus\":{\"status\":\"Uninstalled\",\"resources\":{\"deployments\":[{\"name\":\"eun\",\"namespace\":\"qhgyxzkonocukok\",\"desired\":2007375757,\"ready\":1079433286,\"upToDate\":891942589,\"available\":1520112594,\"creationTime\":\"2021-11-03T09:03:22Z\"},{\"name\":\"fkbey\",\"namespace\":\"wrmjmwvvjektc\",\"desired\":1803945661,\"ready\":1492267323,\"upToDate\":920557084,\"available\":223779123,\"creationTime\":\"2021-01-30T03:05:29Z\"},{\"name\":\"zpwv\",\"namespace\":\"dqgbiqylihkaetc\",\"desired\":1163515198,\"ready\":1161915494,\"upToDate\":493965696,\"available\":103399335,\"creationTime\":\"2021-04-10T23:16:29Z\"}],\"pods\":[{\"name\":\"ctq\",\"namespace\":\"fbebrjcxer\",\"desired\":1002767653,\"ready\":112236140,\"status\":\"NotReady\",\"creationTime\":\"2021-04-15T13:49:51Z\",\"events\":[{},{},{},{}]}],\"replicaSets\":[{\"name\":\"rp\",\"namespace\":\"epcyvahfnlj\",\"desired\":561070013,\"ready\":197436298,\"current\":1640197955,\"creationTime\":\"2021-02-12T02:13:18Z\"},{\"name\":\"gidokgjljyoxgvcl\",\"namespace\":\"gsncghkjeszz\",\"desired\":1537141479,\"ready\":2005470526,\"current\":1005526147,\"creationTime\":\"2021-10-14T03:43:01Z\"},{\"name\":\"xbf\",\"namespace\":\"xnehmpvec\",\"desired\":1266686553,\"ready\":68854326,\"current\":1209438571,\"creationTime\":\"2021-06-06T17:36:12Z\"}],\"statefulSets\":[{\"name\":\"mpukgriw\",\"namespace\":\"zlfbxzpuzycispnq\",\"desired\":64383308,\"ready\":1974329109,\"creationTime\":\"2021-09-24T15:39:46Z\"},{\"name\":\"pyydhi\",\"namespace\":\"uqqkpik\",\"desired\":1684029730,\"ready\":627657952,\"creationTime\":\"2021-04-03T12:19:17Z\"},{\"name\":\"gnbuy\",\"namespace\":\"ijggmebfsiar\",\"desired\":784923897,\"ready\":2136509867,\"creationTime\":\"2020-12-24T14:25:03Z\"}],\"daemonSets\":[{\"name\":\"zmhjrunmp\",\"namespace\":\"tdbhrbnla\",\"desired\":1373205517,\"current\":2082057353,\"ready\":266718281,\"upToDate\":1350964894,\"available\":743667383,\"creationTime\":\"2021-05-09T15:58:09Z\"},{\"name\":\"kcxywnyt\",\"namespace\":\"synlqidybyxczfc\",\"desired\":1133665771,\"current\":384139525,\"ready\":904573366,\"upToDate\":113016072,\"available\":393084907,\"creationTime\":\"2021-10-01T07:26:45Z\"},{\"name\":\"qlfktsths\",\"namespace\":\"ocmnyyazttbtwwrq\",\"desired\":1833989004,\"current\":1640743814,\"ready\":1618897040,\"upToDate\":261140124,\"available\":212949858,\"creationTime\":\"2021-03-19T13:33:58Z\"},{\"name\":\"fey\",\"namespace\":\"axibxujw\",\"desired\":1589097578,\"current\":2089644825,\"ready\":582953019,\"upToDate\":1122495677,\"available\":1436163401,\"creationTime\":\"2021-08-22T09:03:41Z\"}]},\"nextExpectedUpdateAt\":\"2021-03-27T18:14:10Z\"}},\"id\":\"kzjancuxrhdwbav\",\"name\":\"bniwdj\",\"type\":\"wz\"}")
            .toObject(ComponentInner.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ComponentInner model = new ComponentInner().withProperties(new ComponentProperties());
        model = BinaryData.fromObject(model).toObject(ComponentInner.class);
    }
}
