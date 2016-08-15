/**************************************************************************************************************************************************************
 *  The Clear BSD License
 *
 *   Copyright (c) – 2016, NetApp, Inc. All rights reserved.
 *
 *   Redistribution and use in source and binary forms, with or without modification, are permitted (subject to the limitations in the disclaimer below) provided that the following conditions are met:
 *
 *   * Redistributions of source code must retain the above copyright notice, this list of conditions and the following disclaimer.
 *
 *   * Redistributions in binary form must reproduce the above copyright notice, this list of conditions and the following disclaimer in the documentation and/or other materials provided with the distribution.
 *
 *   * Neither the name of NetApp, Inc. nor the names of its contributors may be used to endorse or promote products derived from this software without specific prior written permission.
 *
 *   NO EXPRESS OR IMPLIED LICENSES TO ANY PARTY'S PATENT RIGHTS ARE GRANTED BY THIS LICENSE. THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 *************************************************************************************************************************************************************/


package com.netapp.santricity.models.symbol;

import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.netapp.santricity.models.v2.*;
import com.netapp.santricity.models.symbol.*;
import com.netapp.santricity.models.utils.*;
import com.netapp.santricity.Pair;
import com.netapp.santricity.StringUtil;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.io.File;
import java.util.Date;
import java.util.Objects;


/**
 * DaylightSavingsTime
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2016-08-12T15:32:46.001-05:00")
public class DaylightSavingsTime   {
  
    private Integer time;


  /**
   * Reference for time.
   */
  public enum ClockModeEnum {
    unknown("unknown"),
    wallClockTime("wallClockTime"),
    standardTime("standardTime"),
    utcTime("utcTime"),
    __UNDEFINED("__UNDEFINED");
;
    private String value;

    ClockModeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

    private ClockModeEnum clockMode;

    private Integer month;

    private Integer dayOfMonth;

    private Integer dayOfWeek;

  
  /**
   * Time of day for DST change measured as seconds past midnight.
   **/
  public DaylightSavingsTime time(Integer time) {
    this.time = time;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Time of day for DST change measured as seconds past midnight.")
  @JsonProperty("time")
  public Integer getTime() {
    return time;
  }
  
  public void setTime(Integer time) {
    this.time = time;
  }

  
  /**
   * Reference for time.
   **/
  public DaylightSavingsTime clockMode(ClockModeEnum clockMode) {
    this.clockMode = clockMode;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Reference for time.")
  @JsonProperty("clockMode")
  public ClockModeEnum getClockMode() {
    return clockMode;
  }
  
  public void setClockMode(ClockModeEnum clockMode) {
    this.clockMode = clockMode;
  }

  
  /**
   * Month value: 0 to 12 (and negatives).
   **/
  public DaylightSavingsTime month(Integer month) {
    this.month = month;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Month value: 0 to 12 (and negatives).")
  @JsonProperty("month")
  public Integer getMonth() {
    return month;
  }
  
  public void setMonth(Integer month) {
    this.month = month;
  }

  
  /**
   * Day of month: 0 to 31 (and negatives).
   **/
  public DaylightSavingsTime dayOfMonth(Integer dayOfMonth) {
    this.dayOfMonth = dayOfMonth;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Day of month: 0 to 31 (and negatives).")
  @JsonProperty("dayOfMonth")
  public Integer getDayOfMonth() {
    return dayOfMonth;
  }
  
  public void setDayOfMonth(Integer dayOfMonth) {
    this.dayOfMonth = dayOfMonth;
  }

  
  /**
   * Day of week: 0 to 7 (and negatives).
   **/
  public DaylightSavingsTime dayOfWeek(Integer dayOfWeek) {
    this.dayOfWeek = dayOfWeek;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Day of week: 0 to 7 (and negatives).")
  @JsonProperty("dayOfWeek")
  public Integer getDayOfWeek() {
    return dayOfWeek;
  }
  
  public void setDayOfWeek(Integer dayOfWeek) {
    this.dayOfWeek = dayOfWeek;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DaylightSavingsTime daylightSavingsTime = (DaylightSavingsTime) o;
    return Objects.equals(this.time, daylightSavingsTime.time) &&
        Objects.equals(this.clockMode, daylightSavingsTime.clockMode) &&
        Objects.equals(this.month, daylightSavingsTime.month) &&
        Objects.equals(this.dayOfMonth, daylightSavingsTime.dayOfMonth) &&
        Objects.equals(this.dayOfWeek, daylightSavingsTime.dayOfWeek);
  }

  @Override
  public int hashCode() {
    return Objects.hash(time, clockMode, month, dayOfMonth, dayOfWeek);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DaylightSavingsTime {\n");
    
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
    sb.append("    clockMode: ").append(toIndentedString(clockMode)).append("\n");
    sb.append("    month: ").append(toIndentedString(month)).append("\n");
    sb.append("    dayOfMonth: ").append(toIndentedString(dayOfMonth)).append("\n");
    sb.append("    dayOfWeek: ").append(toIndentedString(dayOfWeek)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

