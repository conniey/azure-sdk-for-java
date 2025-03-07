// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mysql.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.mysql.fluent.TopQueryStatisticsClient;
import com.azure.resourcemanager.mysql.fluent.models.QueryStatisticInner;
import com.azure.resourcemanager.mysql.models.QueryStatistic;
import com.azure.resourcemanager.mysql.models.TopQueryStatistics;
import com.azure.resourcemanager.mysql.models.TopQueryStatisticsInput;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class TopQueryStatisticsImpl implements TopQueryStatistics {
    @JsonIgnore
    private final ClientLogger logger = new ClientLogger(TopQueryStatisticsImpl.class);

    private final TopQueryStatisticsClient innerClient;

    private final com.azure.resourcemanager.mysql.MySqlManager serviceManager;

    public TopQueryStatisticsImpl(TopQueryStatisticsClient innerClient,
        com.azure.resourcemanager.mysql.MySqlManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public QueryStatistic get(String resourceGroupName, String serverName, String queryStatisticId) {
        QueryStatisticInner inner = this.serviceClient().get(resourceGroupName, serverName, queryStatisticId);
        if (inner != null) {
            return new QueryStatisticImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<QueryStatistic> getWithResponse(String resourceGroupName, String serverName,
        String queryStatisticId, Context context) {
        Response<QueryStatisticInner> inner
            = this.serviceClient().getWithResponse(resourceGroupName, serverName, queryStatisticId, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new QueryStatisticImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public PagedIterable<QueryStatistic> listByServer(String resourceGroupName, String serverName,
        TopQueryStatisticsInput parameters) {
        PagedIterable<QueryStatisticInner> inner
            = this.serviceClient().listByServer(resourceGroupName, serverName, parameters);
        return Utils.mapPage(inner, inner1 -> new QueryStatisticImpl(inner1, this.manager()));
    }

    public PagedIterable<QueryStatistic> listByServer(String resourceGroupName, String serverName,
        TopQueryStatisticsInput parameters, Context context) {
        PagedIterable<QueryStatisticInner> inner
            = this.serviceClient().listByServer(resourceGroupName, serverName, parameters, context);
        return Utils.mapPage(inner, inner1 -> new QueryStatisticImpl(inner1, this.manager()));
    }

    private TopQueryStatisticsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.mysql.MySqlManager manager() {
        return this.serviceManager;
    }
}
