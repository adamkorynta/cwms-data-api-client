/*
 * Copyright (c) 2021
 * United States Army Corps of Engineers - Hydrologic Engineering Center (USACE/HEC)
 * All Rights Reserved.  USACE PROPRIETARY/CONFIDENTIAL.
 * Source may not be released without written approval from HEC
 */

package mil.army.usace.hec.cwms.radar.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import java.time.Duration;
import java.time.ZonedDateTime;
import java.util.List;
import java.util.Objects;
import javax.validation.Valid;

/**
 * TimeSeries
 */
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-11-02T12:49:54.974-07:00[America/Los_Angeles]")
public class TimeSeries {
    @JsonProperty("begin")
    private ZonedDateTime begin = null;

    @JsonProperty("end")
    private ZonedDateTime end = null;

    @JsonProperty("interval")
    private Duration interval = null;

    @JsonProperty("name")
    private String name = null;

    @JsonProperty("next-page")
    private String nextPage = null;

    @JsonProperty("office-id")
    private String officeId = null;

    @JsonProperty("page")
    private String page = null;

    @JsonProperty("page-size")
    private Integer pageSize = null;

    @JsonProperty("total")
    private Integer total = null;

    @JsonProperty("units")
    private String units = null;

    @JsonProperty("value-columns")
    @Valid
    private List<TimeSeriesColumn> valueColumns = null;

    @JsonProperty("values")
    private List<TimeSeriesValues> values = null;

    /**
     * The requested start time of the data, in ISO-8601 format with offset and timezone ('yyyy-MM-dd'T'HH:mm:ssZ'['VV']'')
     *
     * @return begin
     **/
    @ApiModelProperty(value = "The requested start time of the data, in ISO-8601 format with offset and timezone ('yyyy-MM-dd'T'HH:mm:ssZ'['VV']'')")

    @Valid
    public ZonedDateTime getBegin() {
        return begin;
    }

    /**
     * The requested end time of the data, in ISO-8601 format with offset and timezone ('yyyy-MM-dd'T'HH:mm:ssZ'['VV']'')
     *
     * @return end
     **/
    @ApiModelProperty(value = "The requested end time of the data, in ISO-8601 format with offset and timezone ('yyyy-MM-dd'T'HH:mm:ssZ'['VV']'')")

    @Valid
    public ZonedDateTime getEnd() {
        return end;
    }

    /**
     * Get interval
     *
     * @return interval
     **/
    @ApiModelProperty(value = "")

    @Valid
    public Duration getInterval() {
        return interval;
    }

    /**
     * Time-series name
     *
     * @return name
     **/
    @ApiModelProperty(value = "Time-series name")

    public String getName() {
        return name;
    }

    /**
     * The cursor to the next page of data; null if there is no more data
     *
     * @return nextPage
     **/
    @ApiModelProperty(value = "The cursor to the next page of data; null if there is no more data")

    public String getNextPage() {
        return nextPage;
    }

    /**
     * Office ID that owns the time-series
     *
     * @return officeId
     **/
    @ApiModelProperty(value = "Office ID that owns the time-series")

    public String getOfficeId() {
        return officeId;
    }

    /**
     * The cursor to the current page of data
     *
     * @return page
     **/
    @ApiModelProperty(value = "The cursor to the current page of data")

    public String getPage() {
        return page;
    }

    /**
     * The number of records fetched per-page; this may be larger than the number of records actually retrieved
     *
     * @return pageSize
     **/
    @ApiModelProperty(value = "The number of records fetched per-page; this may be larger than the number of records actually retrieved")

    public Integer getPageSize() {
        return pageSize;
    }

    /**
     * The total number of records retrieved; null or not present if not supported or unknown
     *
     * @return total
     **/
    @ApiModelProperty(value = "The total number of records retrieved; null or not present if not supported or unknown")

    public Integer getTotal() {
        return total;
    }

    /**
     * The units of the time series data
     *
     * @return units
     **/
    @ApiModelProperty(value = "The units of the time series data")

    public String getUnits() {
        return units;
    }

    /**
     * Get valueColumns
     *
     * @return valueColumns
     **/
    @ApiModelProperty(readOnly = true, value = "")
    @Valid
    public List<TimeSeriesColumn> getValueColumns() {
        return valueColumns;
    }

    /**
     * Get values
     *
     * @return values
     **/
    @ApiModelProperty(value = "")

    @Valid
    public List<TimeSeriesValues> getValues() {
        return values;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TimeSeries timeSeries = (TimeSeries) o;
        return Objects.equals(this.begin, timeSeries.begin) &&
            Objects.equals(this.end, timeSeries.end) &&
            Objects.equals(this.interval, timeSeries.interval) &&
            Objects.equals(this.name, timeSeries.name) &&
            Objects.equals(this.nextPage, timeSeries.nextPage) &&
            Objects.equals(this.officeId, timeSeries.officeId) &&
            Objects.equals(this.page, timeSeries.page) &&
            Objects.equals(this.pageSize, timeSeries.pageSize) &&
            Objects.equals(this.total, timeSeries.total) &&
            Objects.equals(this.units, timeSeries.units) &&
            Objects.equals(this.valueColumns, timeSeries.valueColumns) &&
            Objects.equals(this.values, timeSeries.values);
    }

    @Override
    public int hashCode() {
        return Objects.hash(begin, end, interval, name, nextPage, officeId, page, pageSize, total,
            units, valueColumns, values);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TimeSeries {\n");

        sb.append("    begin: ").append(toIndentedString(begin)).append("\n");
        sb.append("    end: ").append(toIndentedString(end)).append("\n");
        sb.append("    interval: ").append(toIndentedString(interval)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    nextPage: ").append(toIndentedString(nextPage)).append("\n");
        sb.append("    officeId: ").append(toIndentedString(officeId)).append("\n");
        sb.append("    page: ").append(toIndentedString(page)).append("\n");
        sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    units: ").append(toIndentedString(units)).append("\n");
        sb.append("    valueColumns: ").append(toIndentedString(valueColumns)).append("\n");
        sb.append("    values: ").append(toIndentedString(values)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }
}