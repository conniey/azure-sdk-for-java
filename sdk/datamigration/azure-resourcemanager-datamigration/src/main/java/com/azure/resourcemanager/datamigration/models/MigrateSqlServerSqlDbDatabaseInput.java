// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datamigration.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** Database specific information for SQL to Azure SQL DB migration task inputs. */
@Fluent
public final class MigrateSqlServerSqlDbDatabaseInput {
    /*
     * Name of the database
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * Name of target database. Note: Target database will be truncated before starting migration.
     */
    @JsonProperty(value = "targetDatabaseName")
    private String targetDatabaseName;

    /*
     * Whether to set database read only before migration
     */
    @JsonProperty(value = "makeSourceDbReadOnly")
    private Boolean makeSourceDbReadOnly;

    /*
     * Mapping of source to target tables
     */
    @JsonProperty(value = "tableMap")
    @JsonInclude(value = JsonInclude.Include.NON_NULL, content = JsonInclude.Include.ALWAYS)
    private Map<String, String> tableMap;

    /** Creates an instance of MigrateSqlServerSqlDbDatabaseInput class. */
    public MigrateSqlServerSqlDbDatabaseInput() {
    }

    /**
     * Get the name property: Name of the database.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: Name of the database.
     *
     * @param name the name value to set.
     * @return the MigrateSqlServerSqlDbDatabaseInput object itself.
     */
    public MigrateSqlServerSqlDbDatabaseInput withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the targetDatabaseName property: Name of target database. Note: Target database will be truncated before
     * starting migration.
     *
     * @return the targetDatabaseName value.
     */
    public String targetDatabaseName() {
        return this.targetDatabaseName;
    }

    /**
     * Set the targetDatabaseName property: Name of target database. Note: Target database will be truncated before
     * starting migration.
     *
     * @param targetDatabaseName the targetDatabaseName value to set.
     * @return the MigrateSqlServerSqlDbDatabaseInput object itself.
     */
    public MigrateSqlServerSqlDbDatabaseInput withTargetDatabaseName(String targetDatabaseName) {
        this.targetDatabaseName = targetDatabaseName;
        return this;
    }

    /**
     * Get the makeSourceDbReadOnly property: Whether to set database read only before migration.
     *
     * @return the makeSourceDbReadOnly value.
     */
    public Boolean makeSourceDbReadOnly() {
        return this.makeSourceDbReadOnly;
    }

    /**
     * Set the makeSourceDbReadOnly property: Whether to set database read only before migration.
     *
     * @param makeSourceDbReadOnly the makeSourceDbReadOnly value to set.
     * @return the MigrateSqlServerSqlDbDatabaseInput object itself.
     */
    public MigrateSqlServerSqlDbDatabaseInput withMakeSourceDbReadOnly(Boolean makeSourceDbReadOnly) {
        this.makeSourceDbReadOnly = makeSourceDbReadOnly;
        return this;
    }

    /**
     * Get the tableMap property: Mapping of source to target tables.
     *
     * @return the tableMap value.
     */
    public Map<String, String> tableMap() {
        return this.tableMap;
    }

    /**
     * Set the tableMap property: Mapping of source to target tables.
     *
     * @param tableMap the tableMap value to set.
     * @return the MigrateSqlServerSqlDbDatabaseInput object itself.
     */
    public MigrateSqlServerSqlDbDatabaseInput withTableMap(Map<String, String> tableMap) {
        this.tableMap = tableMap;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
