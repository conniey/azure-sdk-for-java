// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.ai.textanalytics.models;

import com.azure.ai.textanalytics.implementation.CategorizedEntityPropertiesHelper;

/**
 * The {@code CategorizedEntity} model.
 */
public final class CategorizedEntity {
    private final String text;
    private final EntityCategory category;
    private final String subcategory;
    private final double confidenceScore;
    private int offset;
    private int length;

    /**
     * Creates a {@code CategorizedEntity} model that describes entity.
     *
     * @param text The entity text as appears in the request.
     * @param category The entity category, such as Person/Location/Org/SSN etc.
     * @param subcategory The entity subcategory, such as Age/Year/TimeRange etc.
     * @param confidenceScore If a well-known item is recognized, a decimal number denoting the confidence level
     * between 0 and 1 will be returned.
     */
    public CategorizedEntity(String text, EntityCategory category, String subcategory, double confidenceScore) {
        this.text = text;
        this.category = category;
        this.subcategory = subcategory;
        this.confidenceScore = confidenceScore;
    }

    static {
        CategorizedEntityPropertiesHelper
            .setAccessor(new CategorizedEntityPropertiesHelper.CategorizedEntityAccessor() {
                @Override
                public void setLength(CategorizedEntity entity, int length) {
                    entity.setLength(length);
                }

                @Override
                public void setOffset(CategorizedEntity entity, int offset) {
                    entity.setOffset(offset);
                }
            });
    }

    /**
     * Gets the text property: Categorized entity text as appears in the request.
     *
     * @return The text value.
     */
    public String getText() {
        return this.text;
    }

    /**
     * Gets the category property: Categorized entity category, such as Person/Location/Org/SSN etc.
     *
     * @return The category value.
     */
    public EntityCategory getCategory() {
        return this.category;
    }

    /**
     * Gets the subcategory property: Categorized entity sub category, such as Age/Year/TimeRange etc.
     *
     * @return The subcategory value.
     */
    public String getSubcategory() {
        return this.subcategory;
    }

    /**
     * Gets the score property: If a well-known item is recognized, a decimal
     * number denoting the confidence level between 0 and 1 will be returned.
     *
     * @return The score value.
     */
    public double getConfidenceScore() {
        return this.confidenceScore;
    }

    /**
     * Gets the offset of entity text. The start position for the entity text in a document.
     *
     * @return The offset of entity text.
     */
    public int getOffset() {
        return offset;
    }

    private void setOffset(int offset) {
        this.offset = offset;
    }

    /**
     * Gets the length of entity text.
     *
     * @return The length of entity text.
     */
    public int getLength() {
        return length;
    }

    private void setLength(int length) {
        this.length = length;
    }
}
