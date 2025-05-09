// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.carbonoptimization.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * Query Parameters for ItemDetailsReport.
 */
@Fluent
public final class ItemDetailsQueryFilter extends QueryFilter {
    /*
     * The ReportType requested for carbon emissions data. Required. Specifies how data is aggregated and displayed in
     * the output, as explained in the ReportTypeEnum.
     */
    private ReportTypeEnum reportType = ReportTypeEnum.ITEM_DETAILS_REPORT;

    /*
     * Specifies the category type for detailed emissions data, such as Resource, ResourceGroup, ResourceType, Location,
     * or Subscription. See supported types in CategoryTypeEnum.
     */
    private CategoryTypeEnum categoryType;

    /*
     * The column name to order the results by. See supported values in OrderByColumnEnum.
     */
    private OrderByColumnEnum orderBy;

    /*
     * Direction for sorting results. See supported values in SortDirectionEnum.
     */
    private SortDirectionEnum sortDirection;

    /*
     * Number of items to return in one request, max value is 5000.
     */
    private int pageSize;

    /*
     * Pagination token for fetching the next page of data. This token is nullable and will be returned in the previous
     * response if additional data pages are available.
     */
    private String skipToken;

    /**
     * Creates an instance of ItemDetailsQueryFilter class.
     */
    public ItemDetailsQueryFilter() {
    }

    /**
     * Get the reportType property: The ReportType requested for carbon emissions data. Required. Specifies how data is
     * aggregated and displayed in the output, as explained in the ReportTypeEnum.
     * 
     * @return the reportType value.
     */
    @Override
    public ReportTypeEnum reportType() {
        return this.reportType;
    }

    /**
     * Get the categoryType property: Specifies the category type for detailed emissions data, such as Resource,
     * ResourceGroup, ResourceType, Location, or Subscription. See supported types in CategoryTypeEnum.
     * 
     * @return the categoryType value.
     */
    public CategoryTypeEnum categoryType() {
        return this.categoryType;
    }

    /**
     * Set the categoryType property: Specifies the category type for detailed emissions data, such as Resource,
     * ResourceGroup, ResourceType, Location, or Subscription. See supported types in CategoryTypeEnum.
     * 
     * @param categoryType the categoryType value to set.
     * @return the ItemDetailsQueryFilter object itself.
     */
    public ItemDetailsQueryFilter withCategoryType(CategoryTypeEnum categoryType) {
        this.categoryType = categoryType;
        return this;
    }

    /**
     * Get the orderBy property: The column name to order the results by. See supported values in OrderByColumnEnum.
     * 
     * @return the orderBy value.
     */
    public OrderByColumnEnum orderBy() {
        return this.orderBy;
    }

    /**
     * Set the orderBy property: The column name to order the results by. See supported values in OrderByColumnEnum.
     * 
     * @param orderBy the orderBy value to set.
     * @return the ItemDetailsQueryFilter object itself.
     */
    public ItemDetailsQueryFilter withOrderBy(OrderByColumnEnum orderBy) {
        this.orderBy = orderBy;
        return this;
    }

    /**
     * Get the sortDirection property: Direction for sorting results. See supported values in SortDirectionEnum.
     * 
     * @return the sortDirection value.
     */
    public SortDirectionEnum sortDirection() {
        return this.sortDirection;
    }

    /**
     * Set the sortDirection property: Direction for sorting results. See supported values in SortDirectionEnum.
     * 
     * @param sortDirection the sortDirection value to set.
     * @return the ItemDetailsQueryFilter object itself.
     */
    public ItemDetailsQueryFilter withSortDirection(SortDirectionEnum sortDirection) {
        this.sortDirection = sortDirection;
        return this;
    }

    /**
     * Get the pageSize property: Number of items to return in one request, max value is 5000.
     * 
     * @return the pageSize value.
     */
    public int pageSize() {
        return this.pageSize;
    }

    /**
     * Set the pageSize property: Number of items to return in one request, max value is 5000.
     * 
     * @param pageSize the pageSize value to set.
     * @return the ItemDetailsQueryFilter object itself.
     */
    public ItemDetailsQueryFilter withPageSize(int pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    /**
     * Get the skipToken property: Pagination token for fetching the next page of data. This token is nullable and will
     * be returned in the previous response if additional data pages are available.
     * 
     * @return the skipToken value.
     */
    public String skipToken() {
        return this.skipToken;
    }

    /**
     * Set the skipToken property: Pagination token for fetching the next page of data. This token is nullable and will
     * be returned in the previous response if additional data pages are available.
     * 
     * @param skipToken the skipToken value to set.
     * @return the ItemDetailsQueryFilter object itself.
     */
    public ItemDetailsQueryFilter withSkipToken(String skipToken) {
        this.skipToken = skipToken;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ItemDetailsQueryFilter withDateRange(DateRange dateRange) {
        super.withDateRange(dateRange);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ItemDetailsQueryFilter withSubscriptionList(List<String> subscriptionList) {
        super.withSubscriptionList(subscriptionList);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ItemDetailsQueryFilter withResourceGroupUrlList(List<String> resourceGroupUrlList) {
        super.withResourceGroupUrlList(resourceGroupUrlList);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ItemDetailsQueryFilter withResourceTypeList(List<String> resourceTypeList) {
        super.withResourceTypeList(resourceTypeList);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ItemDetailsQueryFilter withLocationList(List<String> locationList) {
        super.withLocationList(locationList);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ItemDetailsQueryFilter withCarbonScopeList(List<EmissionScopeEnum> carbonScopeList) {
        super.withCarbonScopeList(carbonScopeList);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        if (categoryType() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property categoryType in model ItemDetailsQueryFilter"));
        }
        if (orderBy() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException("Missing required property orderBy in model ItemDetailsQueryFilter"));
        }
        if (sortDirection() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property sortDirection in model ItemDetailsQueryFilter"));
        }
        if (dateRange() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property dateRange in model ItemDetailsQueryFilter"));
        } else {
            dateRange().validate();
        }
        if (subscriptionList() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property subscriptionList in model ItemDetailsQueryFilter"));
        }
        if (carbonScopeList() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property carbonScopeList in model ItemDetailsQueryFilter"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(ItemDetailsQueryFilter.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeJsonField("dateRange", dateRange());
        jsonWriter.writeArrayField("subscriptionList", subscriptionList(),
            (writer, element) -> writer.writeString(element));
        jsonWriter.writeArrayField("carbonScopeList", carbonScopeList(),
            (writer, element) -> writer.writeString(element == null ? null : element.toString()));
        jsonWriter.writeArrayField("resourceGroupUrlList", resourceGroupUrlList(),
            (writer, element) -> writer.writeString(element));
        jsonWriter.writeArrayField("resourceTypeList", resourceTypeList(),
            (writer, element) -> writer.writeString(element));
        jsonWriter.writeArrayField("locationList", locationList(), (writer, element) -> writer.writeString(element));
        jsonWriter.writeStringField("categoryType", this.categoryType == null ? null : this.categoryType.toString());
        jsonWriter.writeStringField("orderBy", this.orderBy == null ? null : this.orderBy.toString());
        jsonWriter.writeStringField("sortDirection", this.sortDirection == null ? null : this.sortDirection.toString());
        jsonWriter.writeIntField("pageSize", this.pageSize);
        jsonWriter.writeStringField("reportType", this.reportType == null ? null : this.reportType.toString());
        jsonWriter.writeStringField("skipToken", this.skipToken);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ItemDetailsQueryFilter from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ItemDetailsQueryFilter if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the ItemDetailsQueryFilter.
     */
    public static ItemDetailsQueryFilter fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ItemDetailsQueryFilter deserializedItemDetailsQueryFilter = new ItemDetailsQueryFilter();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("dateRange".equals(fieldName)) {
                    deserializedItemDetailsQueryFilter.withDateRange(DateRange.fromJson(reader));
                } else if ("subscriptionList".equals(fieldName)) {
                    List<String> subscriptionList = reader.readArray(reader1 -> reader1.getString());
                    deserializedItemDetailsQueryFilter.withSubscriptionList(subscriptionList);
                } else if ("carbonScopeList".equals(fieldName)) {
                    List<EmissionScopeEnum> carbonScopeList
                        = reader.readArray(reader1 -> EmissionScopeEnum.fromString(reader1.getString()));
                    deserializedItemDetailsQueryFilter.withCarbonScopeList(carbonScopeList);
                } else if ("resourceGroupUrlList".equals(fieldName)) {
                    List<String> resourceGroupUrlList = reader.readArray(reader1 -> reader1.getString());
                    deserializedItemDetailsQueryFilter.withResourceGroupUrlList(resourceGroupUrlList);
                } else if ("resourceTypeList".equals(fieldName)) {
                    List<String> resourceTypeList = reader.readArray(reader1 -> reader1.getString());
                    deserializedItemDetailsQueryFilter.withResourceTypeList(resourceTypeList);
                } else if ("locationList".equals(fieldName)) {
                    List<String> locationList = reader.readArray(reader1 -> reader1.getString());
                    deserializedItemDetailsQueryFilter.withLocationList(locationList);
                } else if ("categoryType".equals(fieldName)) {
                    deserializedItemDetailsQueryFilter.categoryType = CategoryTypeEnum.fromString(reader.getString());
                } else if ("orderBy".equals(fieldName)) {
                    deserializedItemDetailsQueryFilter.orderBy = OrderByColumnEnum.fromString(reader.getString());
                } else if ("sortDirection".equals(fieldName)) {
                    deserializedItemDetailsQueryFilter.sortDirection = SortDirectionEnum.fromString(reader.getString());
                } else if ("pageSize".equals(fieldName)) {
                    deserializedItemDetailsQueryFilter.pageSize = reader.getInt();
                } else if ("reportType".equals(fieldName)) {
                    deserializedItemDetailsQueryFilter.reportType = ReportTypeEnum.fromString(reader.getString());
                } else if ("skipToken".equals(fieldName)) {
                    deserializedItemDetailsQueryFilter.skipToken = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedItemDetailsQueryFilter;
        });
    }
}
