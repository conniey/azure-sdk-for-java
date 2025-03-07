// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.billingbenefits.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.CoreUtils;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.billingbenefits.models.AppliedScopeProperties;
import com.azure.resourcemanager.billingbenefits.models.AppliedScopeType;
import com.azure.resourcemanager.billingbenefits.models.BillingPlan;
import com.azure.resourcemanager.billingbenefits.models.Commitment;
import com.azure.resourcemanager.billingbenefits.models.ExtendedStatusInfo;
import com.azure.resourcemanager.billingbenefits.models.ProvisioningState;
import com.azure.resourcemanager.billingbenefits.models.RenewProperties;
import com.azure.resourcemanager.billingbenefits.models.Term;
import com.azure.resourcemanager.billingbenefits.models.Utilization;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Savings plan properties.
 */
@Fluent
public final class SavingsPlanModelProperties implements JsonSerializable<SavingsPlanModelProperties> {
    /*
     * Display name
     */
    private String displayName;

    /*
     * Provisioning state
     */
    private ProvisioningState provisioningState;

    /*
     * The provisioning state of the savings plan for display, e.g. Succeeded
     */
    private String displayProvisioningState;

    /*
     * Subscription that will be charged for purchasing the benefit
     */
    private String billingScopeId;

    /*
     * Fully-qualified identifier of the billing profile where the savings plan is applied. Present only for Field-led
     * or Customer-led customers.
     */
    private String billingProfileId;

    /*
     * Fully-qualified identifier of the customer where the savings plan is applied. Present only for Partner-led
     * customers.
     */
    private String customerId;

    /*
     * Fully-qualified identifier of the billing account where the savings plan is applied. Present only for Enterprise
     * Agreement customers.
     */
    private String billingAccountId;

    /*
     * Represent benefit term in ISO 8601 format.
     */
    private Term term;

    /*
     * Represents the billing plan in ISO 8601 format. Required only for monthly billing plans.
     */
    private BillingPlan billingPlan;

    /*
     * Type of the Applied Scope.
     */
    private AppliedScopeType appliedScopeType;

    /*
     * The applied scope type of the savings plan for display, e.g. Shared
     */
    private String userFriendlyAppliedScopeType;

    /*
     * Properties specific to applied scope type. Not required if not applicable.
     */
    private AppliedScopeProperties appliedScopeProperties;

    /*
     * Commitment towards the benefit.
     */
    private Commitment commitment;

    /*
     * DateTime of the savings plan starts providing benefit from.
     */
    private OffsetDateTime effectiveDateTime;

    /*
     * Expiry date time
     */
    private OffsetDateTime expiryDateTime;

    /*
     * Date time when the savings plan was purchased
     */
    private OffsetDateTime purchaseDateTime;

    /*
     * This is the DateTime when the savings plan benefit started.
     */
    private OffsetDateTime benefitStartTime;

    /*
     * The extendedStatusInfo property.
     */
    private ExtendedStatusInfo extendedStatusInfo;

    /*
     * Setting this to true will automatically purchase a new benefit on the expiration date time.
     */
    private Boolean renew;

    /*
     * Savings plan utilization
     */
    private Utilization utilization;

    /*
     * SavingsPlan Id of the SavingsPlan from which this SavingsPlan is renewed.
     */
    private String renewSource;

    /*
     * SavingsPlan Id of the SavingsPlan which is purchased because of renew.
     */
    private String renewDestination;

    /*
     * The renewProperties property.
     */
    private RenewProperties renewProperties;

    /**
     * Creates an instance of SavingsPlanModelProperties class.
     */
    public SavingsPlanModelProperties() {
    }

    /**
     * Get the displayName property: Display name.
     * 
     * @return the displayName value.
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Set the displayName property: Display name.
     * 
     * @param displayName the displayName value to set.
     * @return the SavingsPlanModelProperties object itself.
     */
    public SavingsPlanModelProperties withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Get the provisioningState property: Provisioning state.
     * 
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the displayProvisioningState property: The provisioning state of the savings plan for display, e.g.
     * Succeeded.
     * 
     * @return the displayProvisioningState value.
     */
    public String displayProvisioningState() {
        return this.displayProvisioningState;
    }

    /**
     * Get the billingScopeId property: Subscription that will be charged for purchasing the benefit.
     * 
     * @return the billingScopeId value.
     */
    public String billingScopeId() {
        return this.billingScopeId;
    }

    /**
     * Set the billingScopeId property: Subscription that will be charged for purchasing the benefit.
     * 
     * @param billingScopeId the billingScopeId value to set.
     * @return the SavingsPlanModelProperties object itself.
     */
    public SavingsPlanModelProperties withBillingScopeId(String billingScopeId) {
        this.billingScopeId = billingScopeId;
        return this;
    }

    /**
     * Get the billingProfileId property: Fully-qualified identifier of the billing profile where the savings plan is
     * applied. Present only for Field-led or Customer-led customers.
     * 
     * @return the billingProfileId value.
     */
    public String billingProfileId() {
        return this.billingProfileId;
    }

    /**
     * Get the customerId property: Fully-qualified identifier of the customer where the savings plan is applied.
     * Present only for Partner-led customers.
     * 
     * @return the customerId value.
     */
    public String customerId() {
        return this.customerId;
    }

    /**
     * Get the billingAccountId property: Fully-qualified identifier of the billing account where the savings plan is
     * applied. Present only for Enterprise Agreement customers.
     * 
     * @return the billingAccountId value.
     */
    public String billingAccountId() {
        return this.billingAccountId;
    }

    /**
     * Get the term property: Represent benefit term in ISO 8601 format.
     * 
     * @return the term value.
     */
    public Term term() {
        return this.term;
    }

    /**
     * Set the term property: Represent benefit term in ISO 8601 format.
     * 
     * @param term the term value to set.
     * @return the SavingsPlanModelProperties object itself.
     */
    public SavingsPlanModelProperties withTerm(Term term) {
        this.term = term;
        return this;
    }

    /**
     * Get the billingPlan property: Represents the billing plan in ISO 8601 format. Required only for monthly billing
     * plans.
     * 
     * @return the billingPlan value.
     */
    public BillingPlan billingPlan() {
        return this.billingPlan;
    }

    /**
     * Set the billingPlan property: Represents the billing plan in ISO 8601 format. Required only for monthly billing
     * plans.
     * 
     * @param billingPlan the billingPlan value to set.
     * @return the SavingsPlanModelProperties object itself.
     */
    public SavingsPlanModelProperties withBillingPlan(BillingPlan billingPlan) {
        this.billingPlan = billingPlan;
        return this;
    }

    /**
     * Get the appliedScopeType property: Type of the Applied Scope.
     * 
     * @return the appliedScopeType value.
     */
    public AppliedScopeType appliedScopeType() {
        return this.appliedScopeType;
    }

    /**
     * Set the appliedScopeType property: Type of the Applied Scope.
     * 
     * @param appliedScopeType the appliedScopeType value to set.
     * @return the SavingsPlanModelProperties object itself.
     */
    public SavingsPlanModelProperties withAppliedScopeType(AppliedScopeType appliedScopeType) {
        this.appliedScopeType = appliedScopeType;
        return this;
    }

    /**
     * Get the userFriendlyAppliedScopeType property: The applied scope type of the savings plan for display, e.g.
     * Shared.
     * 
     * @return the userFriendlyAppliedScopeType value.
     */
    public String userFriendlyAppliedScopeType() {
        return this.userFriendlyAppliedScopeType;
    }

    /**
     * Get the appliedScopeProperties property: Properties specific to applied scope type. Not required if not
     * applicable.
     * 
     * @return the appliedScopeProperties value.
     */
    public AppliedScopeProperties appliedScopeProperties() {
        return this.appliedScopeProperties;
    }

    /**
     * Set the appliedScopeProperties property: Properties specific to applied scope type. Not required if not
     * applicable.
     * 
     * @param appliedScopeProperties the appliedScopeProperties value to set.
     * @return the SavingsPlanModelProperties object itself.
     */
    public SavingsPlanModelProperties withAppliedScopeProperties(AppliedScopeProperties appliedScopeProperties) {
        this.appliedScopeProperties = appliedScopeProperties;
        return this;
    }

    /**
     * Get the commitment property: Commitment towards the benefit.
     * 
     * @return the commitment value.
     */
    public Commitment commitment() {
        return this.commitment;
    }

    /**
     * Set the commitment property: Commitment towards the benefit.
     * 
     * @param commitment the commitment value to set.
     * @return the SavingsPlanModelProperties object itself.
     */
    public SavingsPlanModelProperties withCommitment(Commitment commitment) {
        this.commitment = commitment;
        return this;
    }

    /**
     * Get the effectiveDateTime property: DateTime of the savings plan starts providing benefit from.
     * 
     * @return the effectiveDateTime value.
     */
    public OffsetDateTime effectiveDateTime() {
        return this.effectiveDateTime;
    }

    /**
     * Get the expiryDateTime property: Expiry date time.
     * 
     * @return the expiryDateTime value.
     */
    public OffsetDateTime expiryDateTime() {
        return this.expiryDateTime;
    }

    /**
     * Get the purchaseDateTime property: Date time when the savings plan was purchased.
     * 
     * @return the purchaseDateTime value.
     */
    public OffsetDateTime purchaseDateTime() {
        return this.purchaseDateTime;
    }

    /**
     * Get the benefitStartTime property: This is the DateTime when the savings plan benefit started.
     * 
     * @return the benefitStartTime value.
     */
    public OffsetDateTime benefitStartTime() {
        return this.benefitStartTime;
    }

    /**
     * Set the benefitStartTime property: This is the DateTime when the savings plan benefit started.
     * 
     * @param benefitStartTime the benefitStartTime value to set.
     * @return the SavingsPlanModelProperties object itself.
     */
    public SavingsPlanModelProperties withBenefitStartTime(OffsetDateTime benefitStartTime) {
        this.benefitStartTime = benefitStartTime;
        return this;
    }

    /**
     * Get the extendedStatusInfo property: The extendedStatusInfo property.
     * 
     * @return the extendedStatusInfo value.
     */
    public ExtendedStatusInfo extendedStatusInfo() {
        return this.extendedStatusInfo;
    }

    /**
     * Get the renew property: Setting this to true will automatically purchase a new benefit on the expiration date
     * time.
     * 
     * @return the renew value.
     */
    public Boolean renew() {
        return this.renew;
    }

    /**
     * Set the renew property: Setting this to true will automatically purchase a new benefit on the expiration date
     * time.
     * 
     * @param renew the renew value to set.
     * @return the SavingsPlanModelProperties object itself.
     */
    public SavingsPlanModelProperties withRenew(Boolean renew) {
        this.renew = renew;
        return this;
    }

    /**
     * Get the utilization property: Savings plan utilization.
     * 
     * @return the utilization value.
     */
    public Utilization utilization() {
        return this.utilization;
    }

    /**
     * Get the renewSource property: SavingsPlan Id of the SavingsPlan from which this SavingsPlan is renewed.
     * 
     * @return the renewSource value.
     */
    public String renewSource() {
        return this.renewSource;
    }

    /**
     * Set the renewSource property: SavingsPlan Id of the SavingsPlan from which this SavingsPlan is renewed.
     * 
     * @param renewSource the renewSource value to set.
     * @return the SavingsPlanModelProperties object itself.
     */
    public SavingsPlanModelProperties withRenewSource(String renewSource) {
        this.renewSource = renewSource;
        return this;
    }

    /**
     * Get the renewDestination property: SavingsPlan Id of the SavingsPlan which is purchased because of renew.
     * 
     * @return the renewDestination value.
     */
    public String renewDestination() {
        return this.renewDestination;
    }

    /**
     * Set the renewDestination property: SavingsPlan Id of the SavingsPlan which is purchased because of renew.
     * 
     * @param renewDestination the renewDestination value to set.
     * @return the SavingsPlanModelProperties object itself.
     */
    public SavingsPlanModelProperties withRenewDestination(String renewDestination) {
        this.renewDestination = renewDestination;
        return this;
    }

    /**
     * Get the renewProperties property: The renewProperties property.
     * 
     * @return the renewProperties value.
     */
    public RenewProperties renewProperties() {
        return this.renewProperties;
    }

    /**
     * Set the renewProperties property: The renewProperties property.
     * 
     * @param renewProperties the renewProperties value to set.
     * @return the SavingsPlanModelProperties object itself.
     */
    public SavingsPlanModelProperties withRenewProperties(RenewProperties renewProperties) {
        this.renewProperties = renewProperties;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (appliedScopeProperties() != null) {
            appliedScopeProperties().validate();
        }
        if (commitment() != null) {
            commitment().validate();
        }
        if (extendedStatusInfo() != null) {
            extendedStatusInfo().validate();
        }
        if (utilization() != null) {
            utilization().validate();
        }
        if (renewProperties() != null) {
            renewProperties().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("displayName", this.displayName);
        jsonWriter.writeStringField("billingScopeId", this.billingScopeId);
        jsonWriter.writeStringField("term", this.term == null ? null : this.term.toString());
        jsonWriter.writeStringField("billingPlan", this.billingPlan == null ? null : this.billingPlan.toString());
        jsonWriter.writeStringField("appliedScopeType",
            this.appliedScopeType == null ? null : this.appliedScopeType.toString());
        jsonWriter.writeJsonField("appliedScopeProperties", this.appliedScopeProperties);
        jsonWriter.writeJsonField("commitment", this.commitment);
        jsonWriter.writeStringField("benefitStartTime",
            this.benefitStartTime == null
                ? null
                : DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(this.benefitStartTime));
        jsonWriter.writeBooleanField("renew", this.renew);
        jsonWriter.writeStringField("renewSource", this.renewSource);
        jsonWriter.writeStringField("renewDestination", this.renewDestination);
        jsonWriter.writeJsonField("renewProperties", this.renewProperties);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of SavingsPlanModelProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of SavingsPlanModelProperties if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the SavingsPlanModelProperties.
     */
    public static SavingsPlanModelProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            SavingsPlanModelProperties deserializedSavingsPlanModelProperties = new SavingsPlanModelProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("displayName".equals(fieldName)) {
                    deserializedSavingsPlanModelProperties.displayName = reader.getString();
                } else if ("provisioningState".equals(fieldName)) {
                    deserializedSavingsPlanModelProperties.provisioningState
                        = ProvisioningState.fromString(reader.getString());
                } else if ("displayProvisioningState".equals(fieldName)) {
                    deserializedSavingsPlanModelProperties.displayProvisioningState = reader.getString();
                } else if ("billingScopeId".equals(fieldName)) {
                    deserializedSavingsPlanModelProperties.billingScopeId = reader.getString();
                } else if ("billingProfileId".equals(fieldName)) {
                    deserializedSavingsPlanModelProperties.billingProfileId = reader.getString();
                } else if ("customerId".equals(fieldName)) {
                    deserializedSavingsPlanModelProperties.customerId = reader.getString();
                } else if ("billingAccountId".equals(fieldName)) {
                    deserializedSavingsPlanModelProperties.billingAccountId = reader.getString();
                } else if ("term".equals(fieldName)) {
                    deserializedSavingsPlanModelProperties.term = Term.fromString(reader.getString());
                } else if ("billingPlan".equals(fieldName)) {
                    deserializedSavingsPlanModelProperties.billingPlan = BillingPlan.fromString(reader.getString());
                } else if ("appliedScopeType".equals(fieldName)) {
                    deserializedSavingsPlanModelProperties.appliedScopeType
                        = AppliedScopeType.fromString(reader.getString());
                } else if ("userFriendlyAppliedScopeType".equals(fieldName)) {
                    deserializedSavingsPlanModelProperties.userFriendlyAppliedScopeType = reader.getString();
                } else if ("appliedScopeProperties".equals(fieldName)) {
                    deserializedSavingsPlanModelProperties.appliedScopeProperties
                        = AppliedScopeProperties.fromJson(reader);
                } else if ("commitment".equals(fieldName)) {
                    deserializedSavingsPlanModelProperties.commitment = Commitment.fromJson(reader);
                } else if ("effectiveDateTime".equals(fieldName)) {
                    deserializedSavingsPlanModelProperties.effectiveDateTime = reader
                        .getNullable(nonNullReader -> CoreUtils.parseBestOffsetDateTime(nonNullReader.getString()));
                } else if ("expiryDateTime".equals(fieldName)) {
                    deserializedSavingsPlanModelProperties.expiryDateTime = reader
                        .getNullable(nonNullReader -> CoreUtils.parseBestOffsetDateTime(nonNullReader.getString()));
                } else if ("purchaseDateTime".equals(fieldName)) {
                    deserializedSavingsPlanModelProperties.purchaseDateTime = reader
                        .getNullable(nonNullReader -> CoreUtils.parseBestOffsetDateTime(nonNullReader.getString()));
                } else if ("benefitStartTime".equals(fieldName)) {
                    deserializedSavingsPlanModelProperties.benefitStartTime = reader
                        .getNullable(nonNullReader -> CoreUtils.parseBestOffsetDateTime(nonNullReader.getString()));
                } else if ("extendedStatusInfo".equals(fieldName)) {
                    deserializedSavingsPlanModelProperties.extendedStatusInfo = ExtendedStatusInfo.fromJson(reader);
                } else if ("renew".equals(fieldName)) {
                    deserializedSavingsPlanModelProperties.renew = reader.getNullable(JsonReader::getBoolean);
                } else if ("utilization".equals(fieldName)) {
                    deserializedSavingsPlanModelProperties.utilization = Utilization.fromJson(reader);
                } else if ("renewSource".equals(fieldName)) {
                    deserializedSavingsPlanModelProperties.renewSource = reader.getString();
                } else if ("renewDestination".equals(fieldName)) {
                    deserializedSavingsPlanModelProperties.renewDestination = reader.getString();
                } else if ("renewProperties".equals(fieldName)) {
                    deserializedSavingsPlanModelProperties.renewProperties = RenewProperties.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedSavingsPlanModelProperties;
        });
    }
}
