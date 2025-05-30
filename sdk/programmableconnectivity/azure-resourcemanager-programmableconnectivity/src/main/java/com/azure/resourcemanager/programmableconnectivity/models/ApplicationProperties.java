// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.programmableconnectivity.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Details about the Application that would use the Operator's Network APIs.
 */
@Fluent
public final class ApplicationProperties implements JsonSerializable<ApplicationProperties> {
    /*
     * Name of the application. Example: Contoso App.
     */
    private String name;

    /*
     * Description of the application.
     */
    private String applicationDescription;

    /*
     * The category that describes the application.
     */
    private String applicationType;

    /*
     * Legal name of the organization owning the application.
     */
    private String legalName;

    /*
     * A description of the organization owning the application.
     */
    private String organizationDescription;

    /*
     * Unique Tax Number for the user's organization in the country/region the APC Gateway is being purchased.
     */
    private String taxNumber;

    /*
     * Email address of the Privacy contact or Data Protection officer of the organization.
     */
    private String privacyContactEmailAddress;

    /**
     * Creates an instance of ApplicationProperties class.
     */
    public ApplicationProperties() {
    }

    /**
     * Get the name property: Name of the application. Example: Contoso App.
     * 
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: Name of the application. Example: Contoso App.
     * 
     * @param name the name value to set.
     * @return the ApplicationProperties object itself.
     */
    public ApplicationProperties withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the applicationDescription property: Description of the application.
     * 
     * @return the applicationDescription value.
     */
    public String applicationDescription() {
        return this.applicationDescription;
    }

    /**
     * Set the applicationDescription property: Description of the application.
     * 
     * @param applicationDescription the applicationDescription value to set.
     * @return the ApplicationProperties object itself.
     */
    public ApplicationProperties withApplicationDescription(String applicationDescription) {
        this.applicationDescription = applicationDescription;
        return this;
    }

    /**
     * Get the applicationType property: The category that describes the application.
     * 
     * @return the applicationType value.
     */
    public String applicationType() {
        return this.applicationType;
    }

    /**
     * Set the applicationType property: The category that describes the application.
     * 
     * @param applicationType the applicationType value to set.
     * @return the ApplicationProperties object itself.
     */
    public ApplicationProperties withApplicationType(String applicationType) {
        this.applicationType = applicationType;
        return this;
    }

    /**
     * Get the legalName property: Legal name of the organization owning the application.
     * 
     * @return the legalName value.
     */
    public String legalName() {
        return this.legalName;
    }

    /**
     * Set the legalName property: Legal name of the organization owning the application.
     * 
     * @param legalName the legalName value to set.
     * @return the ApplicationProperties object itself.
     */
    public ApplicationProperties withLegalName(String legalName) {
        this.legalName = legalName;
        return this;
    }

    /**
     * Get the organizationDescription property: A description of the organization owning the application.
     * 
     * @return the organizationDescription value.
     */
    public String organizationDescription() {
        return this.organizationDescription;
    }

    /**
     * Set the organizationDescription property: A description of the organization owning the application.
     * 
     * @param organizationDescription the organizationDescription value to set.
     * @return the ApplicationProperties object itself.
     */
    public ApplicationProperties withOrganizationDescription(String organizationDescription) {
        this.organizationDescription = organizationDescription;
        return this;
    }

    /**
     * Get the taxNumber property: Unique Tax Number for the user's organization in the country/region the APC Gateway
     * is being purchased.
     * 
     * @return the taxNumber value.
     */
    public String taxNumber() {
        return this.taxNumber;
    }

    /**
     * Set the taxNumber property: Unique Tax Number for the user's organization in the country/region the APC Gateway
     * is being purchased.
     * 
     * @param taxNumber the taxNumber value to set.
     * @return the ApplicationProperties object itself.
     */
    public ApplicationProperties withTaxNumber(String taxNumber) {
        this.taxNumber = taxNumber;
        return this;
    }

    /**
     * Get the privacyContactEmailAddress property: Email address of the Privacy contact or Data Protection officer of
     * the organization.
     * 
     * @return the privacyContactEmailAddress value.
     */
    public String privacyContactEmailAddress() {
        return this.privacyContactEmailAddress;
    }

    /**
     * Set the privacyContactEmailAddress property: Email address of the Privacy contact or Data Protection officer of
     * the organization.
     * 
     * @param privacyContactEmailAddress the privacyContactEmailAddress value to set.
     * @return the ApplicationProperties object itself.
     */
    public ApplicationProperties withPrivacyContactEmailAddress(String privacyContactEmailAddress) {
        this.privacyContactEmailAddress = privacyContactEmailAddress;
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
        jsonWriter.writeStringField("name", this.name);
        jsonWriter.writeStringField("applicationDescription", this.applicationDescription);
        jsonWriter.writeStringField("applicationType", this.applicationType);
        jsonWriter.writeStringField("legalName", this.legalName);
        jsonWriter.writeStringField("organizationDescription", this.organizationDescription);
        jsonWriter.writeStringField("taxNumber", this.taxNumber);
        jsonWriter.writeStringField("privacyContactEmailAddress", this.privacyContactEmailAddress);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ApplicationProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ApplicationProperties if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IOException If an error occurs while reading the ApplicationProperties.
     */
    public static ApplicationProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ApplicationProperties deserializedApplicationProperties = new ApplicationProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("name".equals(fieldName)) {
                    deserializedApplicationProperties.name = reader.getString();
                } else if ("applicationDescription".equals(fieldName)) {
                    deserializedApplicationProperties.applicationDescription = reader.getString();
                } else if ("applicationType".equals(fieldName)) {
                    deserializedApplicationProperties.applicationType = reader.getString();
                } else if ("legalName".equals(fieldName)) {
                    deserializedApplicationProperties.legalName = reader.getString();
                } else if ("organizationDescription".equals(fieldName)) {
                    deserializedApplicationProperties.organizationDescription = reader.getString();
                } else if ("taxNumber".equals(fieldName)) {
                    deserializedApplicationProperties.taxNumber = reader.getString();
                } else if ("privacyContactEmailAddress".equals(fieldName)) {
                    deserializedApplicationProperties.privacyContactEmailAddress = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedApplicationProperties;
        });
    }
}
