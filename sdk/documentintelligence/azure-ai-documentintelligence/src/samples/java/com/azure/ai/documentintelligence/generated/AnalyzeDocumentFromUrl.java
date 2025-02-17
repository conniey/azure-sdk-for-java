// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.ai.documentintelligence.generated;

import com.azure.ai.documentintelligence.DocumentIntelligenceClient;
import com.azure.ai.documentintelligence.DocumentIntelligenceClientBuilder;
import com.azure.ai.documentintelligence.models.AnalyzeDocumentOptions;
import com.azure.ai.documentintelligence.models.AnalyzeOperationDetails;
import com.azure.ai.documentintelligence.models.AnalyzeResult;
import com.azure.ai.documentintelligence.models.StringIndexType;
import com.azure.core.util.polling.SyncPoller;
import com.azure.identity.DefaultAzureCredentialBuilder;

import java.util.Collections;

public class AnalyzeDocumentFromUrl {
    public static void main(String[] args) {
        DocumentIntelligenceClient documentIntelligenceClient
            = new DocumentIntelligenceClientBuilder().credential(new DefaultAzureCredentialBuilder().build())
                .endpoint("https://myendpoint.cognitiveservices.azure.com")
                .buildClient();
        // BEGIN:com.azure.ai.documentintelligence.generated.analyzedocument.analyzedocumentfromurl
        SyncPoller<AnalyzeOperationDetails, AnalyzeResult> response = documentIntelligenceClient.beginAnalyzeDocument(
            "customModel",
            new AnalyzeDocumentOptions("http://host.com/doc.pdf").setPages(Collections.singletonList("1-2,4"))
                .setLocale("en-US")
                .setStringIndexType(StringIndexType.TEXT_ELEMENTS));
        // END:com.azure.ai.documentintelligence.generated.analyzedocument.analyzedocumentfromurl
    }
}
