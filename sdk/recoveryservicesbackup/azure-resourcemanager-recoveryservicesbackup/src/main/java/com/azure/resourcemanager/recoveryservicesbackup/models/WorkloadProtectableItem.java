// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Base class for backup item. Workload-specific backup items are derived from this class.
 */
@Fluent
public class WorkloadProtectableItem implements JsonSerializable<WorkloadProtectableItem> {
    /*
     * Type of the backup item.
     */
    private String protectableItemType = "WorkloadProtectableItem";

    /*
     * Type of backup management to backup an item.
     */
    private String backupManagementType;

    /*
     * Type of workload for the backup management
     */
    private String workloadType;

    /*
     * Friendly name of the backup item.
     */
    private String friendlyName;

    /*
     * State of the back up item.
     */
    private ProtectionStatus protectionState;

    /**
     * Creates an instance of WorkloadProtectableItem class.
     */
    public WorkloadProtectableItem() {
    }

    /**
     * Get the protectableItemType property: Type of the backup item.
     * 
     * @return the protectableItemType value.
     */
    public String protectableItemType() {
        return this.protectableItemType;
    }

    /**
     * Get the backupManagementType property: Type of backup management to backup an item.
     * 
     * @return the backupManagementType value.
     */
    public String backupManagementType() {
        return this.backupManagementType;
    }

    /**
     * Set the backupManagementType property: Type of backup management to backup an item.
     * 
     * @param backupManagementType the backupManagementType value to set.
     * @return the WorkloadProtectableItem object itself.
     */
    public WorkloadProtectableItem withBackupManagementType(String backupManagementType) {
        this.backupManagementType = backupManagementType;
        return this;
    }

    /**
     * Get the workloadType property: Type of workload for the backup management.
     * 
     * @return the workloadType value.
     */
    public String workloadType() {
        return this.workloadType;
    }

    /**
     * Set the workloadType property: Type of workload for the backup management.
     * 
     * @param workloadType the workloadType value to set.
     * @return the WorkloadProtectableItem object itself.
     */
    public WorkloadProtectableItem withWorkloadType(String workloadType) {
        this.workloadType = workloadType;
        return this;
    }

    /**
     * Get the friendlyName property: Friendly name of the backup item.
     * 
     * @return the friendlyName value.
     */
    public String friendlyName() {
        return this.friendlyName;
    }

    /**
     * Set the friendlyName property: Friendly name of the backup item.
     * 
     * @param friendlyName the friendlyName value to set.
     * @return the WorkloadProtectableItem object itself.
     */
    public WorkloadProtectableItem withFriendlyName(String friendlyName) {
        this.friendlyName = friendlyName;
        return this;
    }

    /**
     * Get the protectionState property: State of the back up item.
     * 
     * @return the protectionState value.
     */
    public ProtectionStatus protectionState() {
        return this.protectionState;
    }

    /**
     * Set the protectionState property: State of the back up item.
     * 
     * @param protectionState the protectionState value to set.
     * @return the WorkloadProtectableItem object itself.
     */
    public WorkloadProtectableItem withProtectionState(ProtectionStatus protectionState) {
        this.protectionState = protectionState;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("protectableItemType", this.protectableItemType);
        jsonWriter.writeStringField("backupManagementType", this.backupManagementType);
        jsonWriter.writeStringField("workloadType", this.workloadType);
        jsonWriter.writeStringField("friendlyName", this.friendlyName);
        jsonWriter.writeStringField("protectionState",
            this.protectionState == null ? null : this.protectionState.toString());
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of WorkloadProtectableItem from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of WorkloadProtectableItem if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IOException If an error occurs while reading the WorkloadProtectableItem.
     */
    public static WorkloadProtectableItem fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            String discriminatorValue = null;
            try (JsonReader readerToUse = reader.bufferObject()) {
                readerToUse.nextToken(); // Prepare for reading
                while (readerToUse.nextToken() != JsonToken.END_OBJECT) {
                    String fieldName = readerToUse.getFieldName();
                    readerToUse.nextToken();
                    if ("protectableItemType".equals(fieldName)) {
                        discriminatorValue = readerToUse.getString();
                        break;
                    } else {
                        readerToUse.skipChildren();
                    }
                }
                // Use the discriminator value to determine which subtype should be deserialized.
                if ("AzureFileShare".equals(discriminatorValue)) {
                    return AzureFileShareProtectableItem.fromJson(readerToUse.reset());
                } else if ("IaaSVMProtectableItem".equals(discriminatorValue)) {
                    return IaaSvmProtectableItem.fromJsonKnownDiscriminator(readerToUse.reset());
                } else if ("Microsoft.ClassicCompute/virtualMachines".equals(discriminatorValue)) {
                    return AzureIaaSClassicComputeVMProtectableItem.fromJson(readerToUse.reset());
                } else if ("Microsoft.Compute/virtualMachines".equals(discriminatorValue)) {
                    return AzureIaaSComputeVMProtectableItem.fromJson(readerToUse.reset());
                } else if ("AzureVmWorkloadProtectableItem".equals(discriminatorValue)) {
                    return AzureVmWorkloadProtectableItem.fromJsonKnownDiscriminator(readerToUse.reset());
                } else if ("SAPAseDatabase".equals(discriminatorValue)) {
                    return AzureVmWorkloadSapAseDatabaseProtectableItem.fromJson(readerToUse.reset());
                } else if ("SAPAseSystem".equals(discriminatorValue)) {
                    return AzureVmWorkloadSapAseSystemProtectableItem.fromJson(readerToUse.reset());
                } else if ("SAPHanaDatabase".equals(discriminatorValue)) {
                    return AzureVmWorkloadSapHanaDatabaseProtectableItem.fromJson(readerToUse.reset());
                } else if ("SAPHanaSystem".equals(discriminatorValue)) {
                    return AzureVmWorkloadSapHanaSystemProtectableItem.fromJson(readerToUse.reset());
                } else if ("SAPHanaDBInstance".equals(discriminatorValue)) {
                    return AzureVmWorkloadSapHanaDBInstance.fromJson(readerToUse.reset());
                } else if ("HanaHSRContainer".equals(discriminatorValue)) {
                    return AzureVmWorkloadSapHanaHsr.fromJson(readerToUse.reset());
                } else if ("SQLAvailabilityGroupContainer".equals(discriminatorValue)) {
                    return AzureVmWorkloadSqlAvailabilityGroupProtectableItem.fromJson(readerToUse.reset());
                } else if ("SQLDataBase".equals(discriminatorValue)) {
                    return AzureVmWorkloadSqlDatabaseProtectableItem.fromJson(readerToUse.reset());
                } else if ("SQLInstance".equals(discriminatorValue)) {
                    return AzureVmWorkloadSqlInstanceProtectableItem.fromJson(readerToUse.reset());
                } else {
                    return fromJsonKnownDiscriminator(readerToUse.reset());
                }
            }
        });
    }

    static WorkloadProtectableItem fromJsonKnownDiscriminator(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            WorkloadProtectableItem deserializedWorkloadProtectableItem = new WorkloadProtectableItem();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("protectableItemType".equals(fieldName)) {
                    deserializedWorkloadProtectableItem.protectableItemType = reader.getString();
                } else if ("backupManagementType".equals(fieldName)) {
                    deserializedWorkloadProtectableItem.backupManagementType = reader.getString();
                } else if ("workloadType".equals(fieldName)) {
                    deserializedWorkloadProtectableItem.workloadType = reader.getString();
                } else if ("friendlyName".equals(fieldName)) {
                    deserializedWorkloadProtectableItem.friendlyName = reader.getString();
                } else if ("protectionState".equals(fieldName)) {
                    deserializedWorkloadProtectableItem.protectionState
                        = ProtectionStatus.fromString(reader.getString());
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedWorkloadProtectableItem;
        });
    }
}
