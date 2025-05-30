// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.security.fluent.models.AllowedConnectionsResourceInner;

public final class AllowedConnectionsResourceInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AllowedConnectionsResourceInner model = BinaryData.fromString(
            "{\"properties\":{\"calculatedDateTime\":\"2021-11-27T18:47:01Z\",\"connectableResources\":[{\"id\":\"zrtuzq\",\"inboundConnectedResources\":[{\"connectedResourceId\":\"xnevfdnwn\",\"tcpPorts\":\"ewzsyyceuzsoib\",\"udpPorts\":\"dpfrxtrthzvaytdw\"},{\"connectedResourceId\":\"brqubp\",\"tcpPorts\":\"h\",\"udpPorts\":\"iilivpdtiirqtd\"},{\"connectedResourceId\":\"axoruzfgsquy\",\"tcpPorts\":\"rxxle\",\"udpPorts\":\"ramxjezwlwnw\"}],\"outboundConnectedResources\":[{\"connectedResourceId\":\"cvydypatdoo\",\"tcpPorts\":\"jkniodko\",\"udpPorts\":\"bw\"},{\"connectedResourceId\":\"jhemms\",\"tcpPorts\":\"dkcrodt\",\"udpPorts\":\"nfwjlfltkacjvefk\"}]}]},\"location\":\"foakgg\",\"id\":\"fpagaowpulp\",\"name\":\"blylsyxkqjnsj\",\"type\":\"r\"}")
            .toObject(AllowedConnectionsResourceInner.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AllowedConnectionsResourceInner model = new AllowedConnectionsResourceInner();
        model = BinaryData.fromObject(model).toObject(AllowedConnectionsResourceInner.class);
    }
}
