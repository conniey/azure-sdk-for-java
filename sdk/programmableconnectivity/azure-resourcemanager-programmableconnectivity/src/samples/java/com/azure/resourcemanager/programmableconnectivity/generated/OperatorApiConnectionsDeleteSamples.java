// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.programmableconnectivity.generated;

/**
 * Samples for OperatorApiConnections Delete.
 */
public final class OperatorApiConnectionsDeleteSamples {
    /*
     * x-ms-original-file: 2024-01-15-preview/OperatorApiConnections_Delete_MinimumSet_Gen.json
     */
    /**
     * Sample code: OperatorApiConnections_Delete.
     * 
     * @param manager Entry point to ProgrammableConnectivityManager.
     */
    public static void operatorApiConnectionsDelete(
        com.azure.resourcemanager.programmableconnectivity.ProgrammableConnectivityManager manager) {
        manager.operatorApiConnections().delete("rgopenapi", "dawr", com.azure.core.util.Context.NONE);
    }
}
