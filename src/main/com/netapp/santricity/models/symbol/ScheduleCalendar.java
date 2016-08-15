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
 * ScheduleCalendar
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2016-08-12T15:32:46.001-05:00")
public class ScheduleCalendar   {
  

  /**
   * This enumeration specifies the different types of scheduling methods.
   */
  public enum ScheduleMethodEnum {
    unknown("unknown"),
    daily("daily"),
    weekly("weekly"),
    monthlyDate("monthlyDate"),
    monthlyDay("monthlyDay"),
    __UNDEFINED("__UNDEFINED");
;
    private String value;

    ScheduleMethodEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

    private ScheduleMethodEnum scheduleMethod;

    private ScheduleDaily daily;

    private ScheduleWeekly weekly;

    private ScheduleMonthlyByDate monthlyByDate;

    private ScheduleMonthlyByDay monthlyByDay;

  
  /**
   * This enumeration specifies the different types of scheduling methods.
   **/
  public ScheduleCalendar scheduleMethod(ScheduleMethodEnum scheduleMethod) {
    this.scheduleMethod = scheduleMethod;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "This enumeration specifies the different types of scheduling methods.")
  @JsonProperty("scheduleMethod")
  public ScheduleMethodEnum getScheduleMethod() {
    return scheduleMethod;
  }
  
  public void setScheduleMethod(ScheduleMethodEnum scheduleMethod) {
    this.scheduleMethod = scheduleMethod;
  }

  
  /**
   * This field is present only if scheduleMethod is equal to SCHEDULE_METHOD_DAILY.
   **/
  public ScheduleCalendar daily(ScheduleDaily daily) {
    this.daily = daily;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is present only if scheduleMethod is equal to SCHEDULE_METHOD_DAILY.")
  @JsonProperty("daily")
  public ScheduleDaily getDaily() {
    return daily;
  }
  
  public void setDaily(ScheduleDaily daily) {
    this.daily = daily;
  }

  
  /**
   * This field is present only if scheduleMethod is equal to SCHEDULE_METHOD_WEEKLY.
   **/
  public ScheduleCalendar weekly(ScheduleWeekly weekly) {
    this.weekly = weekly;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is present only if scheduleMethod is equal to SCHEDULE_METHOD_WEEKLY.")
  @JsonProperty("weekly")
  public ScheduleWeekly getWeekly() {
    return weekly;
  }
  
  public void setWeekly(ScheduleWeekly weekly) {
    this.weekly = weekly;
  }

  
  /**
   * This field is present only if scheduleMethod is equal to SCHEDULE_METHOD_MONTHLY_DATE.
   **/
  public ScheduleCalendar monthlyByDate(ScheduleMonthlyByDate monthlyByDate) {
    this.monthlyByDate = monthlyByDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is present only if scheduleMethod is equal to SCHEDULE_METHOD_MONTHLY_DATE.")
  @JsonProperty("monthlyByDate")
  public ScheduleMonthlyByDate getMonthlyByDate() {
    return monthlyByDate;
  }
  
  public void setMonthlyByDate(ScheduleMonthlyByDate monthlyByDate) {
    this.monthlyByDate = monthlyByDate;
  }

  
  /**
   * This field is present only if scheduleMethod is equal to SCHEDULE_METHOD_MONTHLY_DAY.
   **/
  public ScheduleCalendar monthlyByDay(ScheduleMonthlyByDay monthlyByDay) {
    this.monthlyByDay = monthlyByDay;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is present only if scheduleMethod is equal to SCHEDULE_METHOD_MONTHLY_DAY.")
  @JsonProperty("monthlyByDay")
  public ScheduleMonthlyByDay getMonthlyByDay() {
    return monthlyByDay;
  }
  
  public void setMonthlyByDay(ScheduleMonthlyByDay monthlyByDay) {
    this.monthlyByDay = monthlyByDay;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ScheduleCalendar scheduleCalendar = (ScheduleCalendar) o;
    return Objects.equals(this.scheduleMethod, scheduleCalendar.scheduleMethod) &&
        Objects.equals(this.daily, scheduleCalendar.daily) &&
        Objects.equals(this.weekly, scheduleCalendar.weekly) &&
        Objects.equals(this.monthlyByDate, scheduleCalendar.monthlyByDate) &&
        Objects.equals(this.monthlyByDay, scheduleCalendar.monthlyByDay);
  }

  @Override
  public int hashCode() {
    return Objects.hash(scheduleMethod, daily, weekly, monthlyByDate, monthlyByDay);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScheduleCalendar {\n");
    
    sb.append("    scheduleMethod: ").append(toIndentedString(scheduleMethod)).append("\n");
    sb.append("    daily: ").append(toIndentedString(daily)).append("\n");
    sb.append("    weekly: ").append(toIndentedString(weekly)).append("\n");
    sb.append("    monthlyByDate: ").append(toIndentedString(monthlyByDate)).append("\n");
    sb.append("    monthlyByDay: ").append(toIndentedString(monthlyByDay)).append("\n");
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

