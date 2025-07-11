// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.servicefabricmanagedclusters.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Specifies information about the marketplace image used to create the virtual machine. This element is only used for
 * marketplace images. Before you can use a marketplace image from an API, you must enable the image for programmatic
 * use. In the Azure portal, find the marketplace image that you want to use and then click Want to deploy
 * programmatically, Get Started. Enter any required information and then click Save.
 */
@Fluent
public final class VmImagePlan implements JsonSerializable<VmImagePlan> {
    /*
     * The plan ID.
     */
    private String name;

    /*
     * Specifies the product of the image from the marketplace. This is the same value as Offer under the imageReference
     * element.
     */
    private String product;

    /*
     * The promotion code.
     */
    private String promotionCode;

    /*
     * The publisher ID.
     */
    private String publisher;

    /**
     * Creates an instance of VmImagePlan class.
     */
    public VmImagePlan() {
    }

    /**
     * Get the name property: The plan ID.
     * 
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The plan ID.
     * 
     * @param name the name value to set.
     * @return the VmImagePlan object itself.
     */
    public VmImagePlan withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the product property: Specifies the product of the image from the marketplace. This is the same value as
     * Offer under the imageReference element.
     * 
     * @return the product value.
     */
    public String product() {
        return this.product;
    }

    /**
     * Set the product property: Specifies the product of the image from the marketplace. This is the same value as
     * Offer under the imageReference element.
     * 
     * @param product the product value to set.
     * @return the VmImagePlan object itself.
     */
    public VmImagePlan withProduct(String product) {
        this.product = product;
        return this;
    }

    /**
     * Get the promotionCode property: The promotion code.
     * 
     * @return the promotionCode value.
     */
    public String promotionCode() {
        return this.promotionCode;
    }

    /**
     * Set the promotionCode property: The promotion code.
     * 
     * @param promotionCode the promotionCode value to set.
     * @return the VmImagePlan object itself.
     */
    public VmImagePlan withPromotionCode(String promotionCode) {
        this.promotionCode = promotionCode;
        return this;
    }

    /**
     * Get the publisher property: The publisher ID.
     * 
     * @return the publisher value.
     */
    public String publisher() {
        return this.publisher;
    }

    /**
     * Set the publisher property: The publisher ID.
     * 
     * @param publisher the publisher value to set.
     * @return the VmImagePlan object itself.
     */
    public VmImagePlan withPublisher(String publisher) {
        this.publisher = publisher;
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
        jsonWriter.writeStringField("product", this.product);
        jsonWriter.writeStringField("promotionCode", this.promotionCode);
        jsonWriter.writeStringField("publisher", this.publisher);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of VmImagePlan from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of VmImagePlan if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the VmImagePlan.
     */
    public static VmImagePlan fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            VmImagePlan deserializedVmImagePlan = new VmImagePlan();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("name".equals(fieldName)) {
                    deserializedVmImagePlan.name = reader.getString();
                } else if ("product".equals(fieldName)) {
                    deserializedVmImagePlan.product = reader.getString();
                } else if ("promotionCode".equals(fieldName)) {
                    deserializedVmImagePlan.promotionCode = reader.getString();
                } else if ("publisher".equals(fieldName)) {
                    deserializedVmImagePlan.publisher = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedVmImagePlan;
        });
    }
}
