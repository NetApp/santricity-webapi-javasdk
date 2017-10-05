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
 * Schedule
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2017-10-04T15:05:55.769-05:00")
public class Schedule   {
  
    private ScheduleCalendar calendar;

    private Long startDate;

    private Recurrence recurrence;

    private TimeZoneDescription timezone;

  
  /**
   * Daily, weekly, or monthly calendar information.
   **/
  public Schedule calendar(ScheduleCalendar calendar) {
    this.calendar = calendar;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Daily, weekly, or monthly calendar information.")
  @JsonProperty("calendar")
  public ScheduleCalendar getCalendar() {
    return calendar;
  }
  
  public void setCalendar(ScheduleCalendar calendar) {
    this.calendar = calendar;
  }

  
  /**
   * The schedule will not run until this date/time, measured as seconds since midnight, January 1st, 1970 local time.
   **/
  public Schedule startDate(Long startDate) {
    this.startDate = startDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The schedule will not run until this date/time, measured as seconds since midnight, January 1st, 1970 local time.")
  @JsonProperty("startDate")
  public Long getStartDate() {
    return startDate;
  }
  
  public void setStartDate(Long startDate) {
    this.startDate = startDate;
  }

  
  /**
   * The number of days, weeks, or months to run.
   **/
  public Schedule recurrence(Recurrence recurrence) {
    this.recurrence = recurrence;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The number of days, weeks, or months to run.")
  @JsonProperty("recurrence")
  public Recurrence getRecurrence() {
    return recurrence;
  }
  
  public void setRecurrence(Recurrence recurrence) {
    this.recurrence = recurrence;
  }

  
  /**
   * Specification of the time zone.
   **/
  public Schedule timezone(TimeZoneDescription timezone) {
    this.timezone = timezone;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Specification of the time zone.")
  @JsonProperty("timezone")
  public TimeZoneDescription getTimezone() {
    return timezone;
  }
  
  public void setTimezone(TimeZoneDescription timezone) {
    this.timezone = timezone;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Schedule schedule = (Schedule) o;
    return Objects.equals(this.calendar, schedule.calendar) &&
        Objects.equals(this.startDate, schedule.startDate) &&
        Objects.equals(this.recurrence, schedule.recurrence) &&
        Objects.equals(this.timezone, schedule.timezone);
  }

  @Override
  public int hashCode() {
    return Objects.hash(calendar, startDate, recurrence, timezone);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Schedule {\n");
    
    sb.append("    calendar: ").append(toIndentedString(calendar)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    recurrence: ").append(toIndentedString(recurrence)).append("\n");
    sb.append("    timezone: ").append(toIndentedString(timezone)).append("\n");
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

