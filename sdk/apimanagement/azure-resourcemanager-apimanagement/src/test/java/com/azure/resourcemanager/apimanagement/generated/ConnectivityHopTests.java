// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.apimanagement.models.ConnectivityHop;

public final class ConnectivityHopTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ConnectivityHop model = BinaryData.fromString(
            "{\"type\":\"yoi\",\"id\":\"kmi\",\"address\":\"nnraclibbfqpspkl\",\"resourceId\":\"ydgnha\",\"nextHopIds\":[\"ukexzgpm\"],\"issues\":[{\"origin\":\"Local\",\"severity\":\"Warning\",\"type\":\"AgentStopped\",\"context\":[{\"pfqfpc\":\"d\",\"qrvwerfwxbsm\":\"stcl\",\"ifkwdvbtbrekqhs\":\"bljjehh\"}]},{\"origin\":\"Outbound\",\"severity\":\"Error\",\"type\":\"Platform\",\"context\":[{\"z\":\"ejuwyqwdqigmghgi\",\"nkfm\":\"xlujkhnjcm\",\"qtwmlmhjnqtqeahj\":\"h\",\"vgua\":\"dvragpokddxejhh\"},{\"yn\":\"ptbkewk\"},{\"vdxaexqokmyrljia\":\"gbvoffbkk\"},{\"brqlpbcjtrpz\":\"bn\",\"qelwgdhuruzytza\":\"yudivbxnhsqeaeo\"}]},{\"origin\":\"Inbound\",\"severity\":\"Error\",\"type\":\"UserDefinedRoute\",\"context\":[{\"ztrknsj\":\"ywmpinmzvfkneer\",\"hkeizcp\":\"lugdybnhrxlelf\",\"wjekptycaydbj\":\"htdm\",\"ymlcfnzhmhsurlg\":\"c\"},{\"stauolawi\":\"kpmmz\",\"gvvjhvvlr\":\"bmom\",\"ajnkdflqionswae\":\"ohewjj\"},{\"xjoshohtotryegpk\":\"zfz\",\"bfokxkhu\":\"xrmexznlw\",\"ufgjblcdr\":\"ze\"}]}]}")
            .toObject(ConnectivityHop.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ConnectivityHop model = new ConnectivityHop();
        model = BinaryData.fromObject(model).toObject(ConnectivityHop.class);
    }
}
