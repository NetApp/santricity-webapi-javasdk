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


package com.netapp.santricity.models.v2;

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
 * Creates a Schedule for a Snapshot (PiT) or Legacy Snapshot.
 */
@ApiModel(description = "Creates a Schedule for a Snapshot (PiT) or Legacy Snapshot.")
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2017-10-04T15:05:52.333-05:00")
public class ScheduleCreateRequest   {
  

  /**
   * The schedule action type.
   */
  public enum ActionEnum {
    unknown("unknown"),
    resnap("resnap"),
    newpit("newpit"),
    newcgpit("newcgpit"),
    __UNDEFINED("__UNDEFINED");
;
    private String value;

    ActionEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

    private ActionEnum action;

    private String targetObject;


  /**
   * The schedule calendar type.
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

    private DailySchedule dailySchedule;


  /**
   * Gets or Sets daysOfWeek
   */
  public enum DaysOfWeekEnum {
    notSpecified("notSpecified"),
    sunday("sunday"),
    monday("monday"),
    tuesday("tuesday"),
    wednesday("wednesday"),
    thursday("thursday"),
    friday("friday"),
    saturday("saturday"),
    __UNDEFINED("__UNDEFINED");
;
    private String value;

    DaysOfWeekEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

    private List<DaysOfWeekEnum> daysOfWeek;


  /**
   * Gets or Sets monthsOfYear
   */
  public enum MonthsOfYearEnum {
    notSpecified("notSpecified"),
    january("january"),
    february("february"),
    march("march"),
    april("april"),
    may("may"),
    june("june"),
    july("july"),
    august("august"),
    september("september"),
    october("october"),
    november("november"),
    december("december"),
    __UNDEFINED("__UNDEFINED");
;
    private String value;

    MonthsOfYearEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

    private List<MonthsOfYearEnum> monthsOfYear;


  /**
   * Gets or Sets daysOfMonth
   */
  public enum DaysOfMonthEnum {
    dayOfMonthLast("dayOfMonthLast"),
    dayOfMonthNotSpecified("dayOfMonthNotSpecified"),
    dayOfMonth01("dayOfMonth01"),
    dayOfMonth02("dayOfMonth02"),
    dayOfMonth03("dayOfMonth03"),
    dayOfMonth04("dayOfMonth04"),
    dayOfMonth05("dayOfMonth05"),
    dayOfMonth06("dayOfMonth06"),
    dayOfMonth07("dayOfMonth07"),
    dayOfMonth08("dayOfMonth08"),
    dayOfMonth09("dayOfMonth09"),
    dayOfMonth10("dayOfMonth10"),
    dayOfMonth11("dayOfMonth11"),
    dayOfMonth12("dayOfMonth12"),
    dayOfMonth13("dayOfMonth13"),
    dayOfMonth14("dayOfMonth14"),
    dayOfMonth15("dayOfMonth15"),
    dayOfMonth16("dayOfMonth16"),
    dayOfMonth17("dayOfMonth17"),
    dayOfMonth18("dayOfMonth18"),
    dayOfMonth19("dayOfMonth19"),
    dayOfMonth20("dayOfMonth20"),
    dayOfMonth21("dayOfMonth21"),
    dayOfMonth22("dayOfMonth22"),
    dayOfMonth23("dayOfMonth23"),
    dayOfMonth24("dayOfMonth24"),
    dayOfMonth25("dayOfMonth25"),
    dayOfMonth26("dayOfMonth26"),
    dayOfMonth27("dayOfMonth27"),
    dayOfMonth28("dayOfMonth28"),
    dayOfMonth29("dayOfMonth29"),
    __UNDEFINED("__UNDEFINED"),
    dayOfMonth30("dayOfMonth30"),
    dayOfMonth31("dayOfMonth31");
;
    private String value;

    DaysOfMonthEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

    private List<DaysOfMonthEnum> daysOfMonth;

    private Long startDate;

    private Long endDate;

    private TimeZoneDescription timezone;

  
  /**
   * The schedule action type.
   **/
  public ScheduleCreateRequest action(ActionEnum action) {
    this.action = action;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The schedule action type.")
  @JsonProperty("action")
  public ActionEnum getAction() {
    return action;
  }
  
  public void setAction(ActionEnum action) {
    this.action = action;
  }

  
  /**
   * The SYMbol reference of the target object.
   **/
  public ScheduleCreateRequest targetObject(String targetObject) {
    this.targetObject = targetObject;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The SYMbol reference of the target object.")
  @JsonProperty("targetObject")
  public String getTargetObject() {
    return targetObject;
  }
  
  public void setTargetObject(String targetObject) {
    this.targetObject = targetObject;
  }

  
  /**
   * The schedule calendar type.
   **/
  public ScheduleCreateRequest scheduleMethod(ScheduleMethodEnum scheduleMethod) {
    this.scheduleMethod = scheduleMethod;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The schedule calendar type.")
  @JsonProperty("scheduleMethod")
  public ScheduleMethodEnum getScheduleMethod() {
    return scheduleMethod;
  }
  
  public void setScheduleMethod(ScheduleMethodEnum scheduleMethod) {
    this.scheduleMethod = scheduleMethod;
  }

  
  /**
   * The daily schedule times for all schedule methods.
   **/
  public ScheduleCreateRequest dailySchedule(DailySchedule dailySchedule) {
    this.dailySchedule = dailySchedule;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The daily schedule times for all schedule methods.")
  @JsonProperty("dailySchedule")
  public DailySchedule getDailySchedule() {
    return dailySchedule;
  }
  
  public void setDailySchedule(DailySchedule dailySchedule) {
    this.dailySchedule = dailySchedule;
  }

  
  /**
   * The days of the week for the weekly schedule method.
   **/
  public ScheduleCreateRequest daysOfWeek(List<DaysOfWeekEnum> daysOfWeek) {
    this.daysOfWeek = daysOfWeek;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The days of the week for the weekly schedule method.")
  @JsonProperty("daysOfWeek")
  public List<DaysOfWeekEnum> getDaysOfWeek() {
    return daysOfWeek;
  }
  
  public void setDaysOfWeek(List<DaysOfWeekEnum> daysOfWeek) {
    this.daysOfWeek = daysOfWeek;
  }

  
  /**
   * The months of the year for the monthly by date schedule method.
   **/
  public ScheduleCreateRequest monthsOfYear(List<MonthsOfYearEnum> monthsOfYear) {
    this.monthsOfYear = monthsOfYear;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The months of the year for the monthly by date schedule method.")
  @JsonProperty("monthsOfYear")
  public List<MonthsOfYearEnum> getMonthsOfYear() {
    return monthsOfYear;
  }
  
  public void setMonthsOfYear(List<MonthsOfYearEnum> monthsOfYear) {
    this.monthsOfYear = monthsOfYear;
  }

  
  /**
   * The days of the month for the monthly by date schedule method.
   **/
  public ScheduleCreateRequest daysOfMonth(List<DaysOfMonthEnum> daysOfMonth) {
    this.daysOfMonth = daysOfMonth;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The days of the month for the monthly by date schedule method.")
  @JsonProperty("daysOfMonth")
  public List<DaysOfMonthEnum> getDaysOfMonth() {
    return daysOfMonth;
  }
  
  public void setDaysOfMonth(List<DaysOfMonthEnum> daysOfMonth) {
    this.daysOfMonth = daysOfMonth;
  }

  
  /**
   * The start date for the schedule.
   **/
  public ScheduleCreateRequest startDate(Long startDate) {
    this.startDate = startDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The start date for the schedule.")
  @JsonProperty("startDate")
  public Long getStartDate() {
    return startDate;
  }
  
  public void setStartDate(Long startDate) {
    this.startDate = startDate;
  }

  
  /**
   * The end date for the schedule, 0 for no end date.
   **/
  public ScheduleCreateRequest endDate(Long endDate) {
    this.endDate = endDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The end date for the schedule, 0 for no end date.")
  @JsonProperty("endDate")
  public Long getEndDate() {
    return endDate;
  }
  
  public void setEndDate(Long endDate) {
    this.endDate = endDate;
  }

  
  /**
   * The schedule time zone information.
   **/
  public ScheduleCreateRequest timezone(TimeZoneDescription timezone) {
    this.timezone = timezone;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The schedule time zone information.")
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
    ScheduleCreateRequest scheduleCreateRequest = (ScheduleCreateRequest) o;
    return Objects.equals(this.action, scheduleCreateRequest.action) &&
        Objects.equals(this.targetObject, scheduleCreateRequest.targetObject) &&
        Objects.equals(this.scheduleMethod, scheduleCreateRequest.scheduleMethod) &&
        Objects.equals(this.dailySchedule, scheduleCreateRequest.dailySchedule) &&
        Objects.equals(this.daysOfWeek, scheduleCreateRequest.daysOfWeek) &&
        Objects.equals(this.monthsOfYear, scheduleCreateRequest.monthsOfYear) &&
        Objects.equals(this.daysOfMonth, scheduleCreateRequest.daysOfMonth) &&
        Objects.equals(this.startDate, scheduleCreateRequest.startDate) &&
        Objects.equals(this.endDate, scheduleCreateRequest.endDate) &&
        Objects.equals(this.timezone, scheduleCreateRequest.timezone);
  }

  @Override
  public int hashCode() {
    return Objects.hash(action, targetObject, scheduleMethod, dailySchedule, daysOfWeek, monthsOfYear, daysOfMonth, startDate, endDate, timezone);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScheduleCreateRequest {\n");
    
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    targetObject: ").append(toIndentedString(targetObject)).append("\n");
    sb.append("    scheduleMethod: ").append(toIndentedString(scheduleMethod)).append("\n");
    sb.append("    dailySchedule: ").append(toIndentedString(dailySchedule)).append("\n");
    sb.append("    daysOfWeek: ").append(toIndentedString(daysOfWeek)).append("\n");
    sb.append("    monthsOfYear: ").append(toIndentedString(monthsOfYear)).append("\n");
    sb.append("    daysOfMonth: ").append(toIndentedString(daysOfMonth)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
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

