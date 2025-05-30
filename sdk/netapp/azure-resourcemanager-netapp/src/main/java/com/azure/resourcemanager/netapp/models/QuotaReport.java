// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.netapp.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Quota report record properties.
 */
@Fluent
public final class QuotaReport implements JsonSerializable<QuotaReport> {
    /*
     * Type of quota
     */
    private Type quotaType;

    /*
     * UserID/GroupID/SID based on the quota target type. UserID and groupID can be found by running ‘id’ or ‘getent’
     * command for the user or group and SID can be found by running <wmic useraccount where name='user-name' get sid>
     */
    private String quotaTarget;

    /*
     * Specifies the current usage in kibibytes for the user/group quota.
     */
    private Long quotaLimitUsedInKiBs;

    /*
     * Specifies the total size limit in kibibytes for the user/group quota.
     */
    private Long quotaLimitTotalInKiBs;

    /*
     * Percentage of used size compared to total size.
     */
    private Float percentageUsed;

    /*
     * Flag to indicate whether the quota is derived from default quota.
     */
    private Boolean isDerivedQuota;

    /**
     * Creates an instance of QuotaReport class.
     */
    public QuotaReport() {
    }

    /**
     * Get the quotaType property: Type of quota.
     * 
     * @return the quotaType value.
     */
    public Type quotaType() {
        return this.quotaType;
    }

    /**
     * Set the quotaType property: Type of quota.
     * 
     * @param quotaType the quotaType value to set.
     * @return the QuotaReport object itself.
     */
    public QuotaReport withQuotaType(Type quotaType) {
        this.quotaType = quotaType;
        return this;
    }

    /**
     * Get the quotaTarget property: UserID/GroupID/SID based on the quota target type. UserID and groupID can be found
     * by running ‘id’ or ‘getent’ command for the user or group and SID can be found by running &lt;wmic useraccount
     * where name='user-name' get sid&gt;.
     * 
     * @return the quotaTarget value.
     */
    public String quotaTarget() {
        return this.quotaTarget;
    }

    /**
     * Set the quotaTarget property: UserID/GroupID/SID based on the quota target type. UserID and groupID can be found
     * by running ‘id’ or ‘getent’ command for the user or group and SID can be found by running &lt;wmic useraccount
     * where name='user-name' get sid&gt;.
     * 
     * @param quotaTarget the quotaTarget value to set.
     * @return the QuotaReport object itself.
     */
    public QuotaReport withQuotaTarget(String quotaTarget) {
        this.quotaTarget = quotaTarget;
        return this;
    }

    /**
     * Get the quotaLimitUsedInKiBs property: Specifies the current usage in kibibytes for the user/group quota.
     * 
     * @return the quotaLimitUsedInKiBs value.
     */
    public Long quotaLimitUsedInKiBs() {
        return this.quotaLimitUsedInKiBs;
    }

    /**
     * Set the quotaLimitUsedInKiBs property: Specifies the current usage in kibibytes for the user/group quota.
     * 
     * @param quotaLimitUsedInKiBs the quotaLimitUsedInKiBs value to set.
     * @return the QuotaReport object itself.
     */
    public QuotaReport withQuotaLimitUsedInKiBs(Long quotaLimitUsedInKiBs) {
        this.quotaLimitUsedInKiBs = quotaLimitUsedInKiBs;
        return this;
    }

    /**
     * Get the quotaLimitTotalInKiBs property: Specifies the total size limit in kibibytes for the user/group quota.
     * 
     * @return the quotaLimitTotalInKiBs value.
     */
    public Long quotaLimitTotalInKiBs() {
        return this.quotaLimitTotalInKiBs;
    }

    /**
     * Set the quotaLimitTotalInKiBs property: Specifies the total size limit in kibibytes for the user/group quota.
     * 
     * @param quotaLimitTotalInKiBs the quotaLimitTotalInKiBs value to set.
     * @return the QuotaReport object itself.
     */
    public QuotaReport withQuotaLimitTotalInKiBs(Long quotaLimitTotalInKiBs) {
        this.quotaLimitTotalInKiBs = quotaLimitTotalInKiBs;
        return this;
    }

    /**
     * Get the percentageUsed property: Percentage of used size compared to total size.
     * 
     * @return the percentageUsed value.
     */
    public Float percentageUsed() {
        return this.percentageUsed;
    }

    /**
     * Set the percentageUsed property: Percentage of used size compared to total size.
     * 
     * @param percentageUsed the percentageUsed value to set.
     * @return the QuotaReport object itself.
     */
    public QuotaReport withPercentageUsed(Float percentageUsed) {
        this.percentageUsed = percentageUsed;
        return this;
    }

    /**
     * Get the isDerivedQuota property: Flag to indicate whether the quota is derived from default quota.
     * 
     * @return the isDerivedQuota value.
     */
    public Boolean isDerivedQuota() {
        return this.isDerivedQuota;
    }

    /**
     * Set the isDerivedQuota property: Flag to indicate whether the quota is derived from default quota.
     * 
     * @param isDerivedQuota the isDerivedQuota value to set.
     * @return the QuotaReport object itself.
     */
    public QuotaReport withIsDerivedQuota(Boolean isDerivedQuota) {
        this.isDerivedQuota = isDerivedQuota;
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
        jsonWriter.writeStringField("quotaType", this.quotaType == null ? null : this.quotaType.toString());
        jsonWriter.writeStringField("quotaTarget", this.quotaTarget);
        jsonWriter.writeNumberField("quotaLimitUsedInKiBs", this.quotaLimitUsedInKiBs);
        jsonWriter.writeNumberField("quotaLimitTotalInKiBs", this.quotaLimitTotalInKiBs);
        jsonWriter.writeNumberField("percentageUsed", this.percentageUsed);
        jsonWriter.writeBooleanField("isDerivedQuota", this.isDerivedQuota);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of QuotaReport from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of QuotaReport if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the QuotaReport.
     */
    public static QuotaReport fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            QuotaReport deserializedQuotaReport = new QuotaReport();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("quotaType".equals(fieldName)) {
                    deserializedQuotaReport.quotaType = Type.fromString(reader.getString());
                } else if ("quotaTarget".equals(fieldName)) {
                    deserializedQuotaReport.quotaTarget = reader.getString();
                } else if ("quotaLimitUsedInKiBs".equals(fieldName)) {
                    deserializedQuotaReport.quotaLimitUsedInKiBs = reader.getNullable(JsonReader::getLong);
                } else if ("quotaLimitTotalInKiBs".equals(fieldName)) {
                    deserializedQuotaReport.quotaLimitTotalInKiBs = reader.getNullable(JsonReader::getLong);
                } else if ("percentageUsed".equals(fieldName)) {
                    deserializedQuotaReport.percentageUsed = reader.getNullable(JsonReader::getFloat);
                } else if ("isDerivedQuota".equals(fieldName)) {
                    deserializedQuotaReport.isDerivedQuota = reader.getNullable(JsonReader::getBoolean);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedQuotaReport;
        });
    }
}
