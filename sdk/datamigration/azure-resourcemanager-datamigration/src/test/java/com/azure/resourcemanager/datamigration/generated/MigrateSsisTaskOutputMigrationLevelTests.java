// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datamigration.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datamigration.models.MigrateSsisTaskOutputMigrationLevel;

public final class MigrateSsisTaskOutputMigrationLevelTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        MigrateSsisTaskOutputMigrationLevel model = BinaryData.fromString(
            "{\"resultType\":\"MigrationLevelOutput\",\"startedOn\":\"2021-03-03T08:56:10Z\",\"endedOn\":\"2020-12-21T04:49:54Z\",\"status\":\"Stopped\",\"message\":\"bpbhfckdvezcrcss\",\"sourceServerVersion\":\"hddubbnqfbl\",\"sourceServerBrandVersion\":\"alehpav\",\"targetServerVersion\":\"ugiqjtiogqg\",\"targetServerBrandVersion\":\"inic\",\"exceptionsAndWarnings\":[{\"message\":\"johiyg\",\"actionableMessage\":\"n\",\"filePath\":\"n\",\"lineNumber\":\"czykmktpvw\",\"hResult\":698471341,\"stackTrace\":\"ehchk\"},{\"message\":\"fmpqumqyjg\",\"actionableMessage\":\"zulo\",\"filePath\":\"aeuzanh\",\"lineNumber\":\"nhsenwphpzfng\",\"hResult\":1048556983,\"stackTrace\":\"idftujwjjufwbe\"}],\"stage\":\"None\",\"id\":\"orhtss\"}")
            .toObject(MigrateSsisTaskOutputMigrationLevel.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        MigrateSsisTaskOutputMigrationLevel model = new MigrateSsisTaskOutputMigrationLevel();
        model = BinaryData.fromObject(model).toObject(MigrateSsisTaskOutputMigrationLevel.class);
    }
}
