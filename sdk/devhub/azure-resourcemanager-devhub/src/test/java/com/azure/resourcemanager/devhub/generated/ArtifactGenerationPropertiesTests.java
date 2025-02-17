// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devhub.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.devhub.fluent.models.ArtifactGenerationProperties;
import com.azure.resourcemanager.devhub.models.DockerfileGenerationMode;
import com.azure.resourcemanager.devhub.models.GenerationLanguage;
import com.azure.resourcemanager.devhub.models.GenerationManifestType;
import com.azure.resourcemanager.devhub.models.ManifestGenerationMode;
import org.junit.jupiter.api.Assertions;

public final class ArtifactGenerationPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ArtifactGenerationProperties model = BinaryData.fromString(
            "{\"generationLanguage\":\"javascript\",\"languageVersion\":\"sglumma\",\"builderVersion\":\"j\",\"port\":\"dxob\",\"appName\":\"dxkqpx\",\"dockerfileOutputDirectory\":\"ajionpimexgstxg\",\"manifestOutputDirectory\":\"odgmaajrmvdjwz\",\"dockerfileGenerationMode\":\"disabled\",\"manifestGenerationMode\":\"enabled\",\"manifestType\":\"kube\",\"imageName\":\"hijco\",\"namespace\":\"ctbzaq\",\"imageTag\":\"sycbkbfk\"}")
            .toObject(ArtifactGenerationProperties.class);
        Assertions.assertEquals(GenerationLanguage.JAVASCRIPT, model.generationLanguage());
        Assertions.assertEquals("sglumma", model.languageVersion());
        Assertions.assertEquals("j", model.builderVersion());
        Assertions.assertEquals("dxob", model.port());
        Assertions.assertEquals("dxkqpx", model.appName());
        Assertions.assertEquals("ajionpimexgstxg", model.dockerfileOutputDirectory());
        Assertions.assertEquals("odgmaajrmvdjwz", model.manifestOutputDirectory());
        Assertions.assertEquals(DockerfileGenerationMode.DISABLED, model.dockerfileGenerationMode());
        Assertions.assertEquals(ManifestGenerationMode.ENABLED, model.manifestGenerationMode());
        Assertions.assertEquals(GenerationManifestType.KUBE, model.manifestType());
        Assertions.assertEquals("hijco", model.imageName());
        Assertions.assertEquals("ctbzaq", model.namespace());
        Assertions.assertEquals("sycbkbfk", model.imageTag());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ArtifactGenerationProperties model
            = new ArtifactGenerationProperties().withGenerationLanguage(GenerationLanguage.JAVASCRIPT)
                .withLanguageVersion("sglumma")
                .withBuilderVersion("j")
                .withPort("dxob")
                .withAppName("dxkqpx")
                .withDockerfileOutputDirectory("ajionpimexgstxg")
                .withManifestOutputDirectory("odgmaajrmvdjwz")
                .withDockerfileGenerationMode(DockerfileGenerationMode.DISABLED)
                .withManifestGenerationMode(ManifestGenerationMode.ENABLED)
                .withManifestType(GenerationManifestType.KUBE)
                .withImageName("hijco")
                .withNamespace("ctbzaq")
                .withImageTag("sycbkbfk");
        model = BinaryData.fromObject(model).toObject(ArtifactGenerationProperties.class);
        Assertions.assertEquals(GenerationLanguage.JAVASCRIPT, model.generationLanguage());
        Assertions.assertEquals("sglumma", model.languageVersion());
        Assertions.assertEquals("j", model.builderVersion());
        Assertions.assertEquals("dxob", model.port());
        Assertions.assertEquals("dxkqpx", model.appName());
        Assertions.assertEquals("ajionpimexgstxg", model.dockerfileOutputDirectory());
        Assertions.assertEquals("odgmaajrmvdjwz", model.manifestOutputDirectory());
        Assertions.assertEquals(DockerfileGenerationMode.DISABLED, model.dockerfileGenerationMode());
        Assertions.assertEquals(ManifestGenerationMode.ENABLED, model.manifestGenerationMode());
        Assertions.assertEquals(GenerationManifestType.KUBE, model.manifestType());
        Assertions.assertEquals("hijco", model.imageName());
        Assertions.assertEquals("ctbzaq", model.namespace());
        Assertions.assertEquals("sycbkbfk", model.imageTag());
    }
}
