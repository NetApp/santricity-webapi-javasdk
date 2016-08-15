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
 * ScheduleMonthlyByDate
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2016-08-12T15:32:46.001-05:00")
public class ScheduleMonthlyByDate   {
  

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

    private DailySchedule dailySchedule;

  
  /**
   * This is a bit mask. Values from the DayOfMonth enumeration should be added (or OR'ed) together to set this value.
   **/
  public ScheduleMonthlyByDate daysOfMonth(List<DaysOfMonthEnum> daysOfMonth) {
    this.daysOfMonth = daysOfMonth;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "This is a bit mask. Values from the DayOfMonth enumeration should be added (or OR'ed) together to set this value.")
  @JsonProperty("daysOfMonth")
  public List<DaysOfMonthEnum> getDaysOfMonth() {
    return daysOfMonth;
  }
  
  public void setDaysOfMonth(List<DaysOfMonthEnum> daysOfMonth) {
    this.daysOfMonth = daysOfMonth;
  }

  
  /**
   * This is a bit mask. Values from the MonthOfYear enumeration should be added (or OR'ed) together to set this value.
   **/
  public ScheduleMonthlyByDate monthsOfYear(List<MonthsOfYearEnum> monthsOfYear) {
    this.monthsOfYear = monthsOfYear;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "This is a bit mask. Values from the MonthOfYear enumeration should be added (or OR'ed) together to set this value.")
  @JsonProperty("monthsOfYear")
  public List<MonthsOfYearEnum> getMonthsOfYear() {
    return monthsOfYear;
  }
  
  public void setMonthsOfYear(List<MonthsOfYearEnum> monthsOfYear) {
    this.monthsOfYear = monthsOfYear;
  }

  
  /**
   * Conveys time information, including time of day, recurrence and occurrence frequency.
   **/
  public ScheduleMonthlyByDate dailySchedule(DailySchedule dailySchedule) {
    this.dailySchedule = dailySchedule;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Conveys time information, including time of day, recurrence and occurrence frequency.")
  @JsonProperty("dailySchedule")
  public DailySchedule getDailySchedule() {
    return dailySchedule;
  }
  
  public void setDailySchedule(DailySchedule dailySchedule) {
    this.dailySchedule = dailySchedule;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ScheduleMonthlyByDate scheduleMonthlyByDate = (ScheduleMonthlyByDate) o;
    return Objects.equals(this.daysOfMonth, scheduleMonthlyByDate.daysOfMonth) &&
        Objects.equals(this.monthsOfYear, scheduleMonthlyByDate.monthsOfYear) &&
        Objects.equals(this.dailySchedule, scheduleMonthlyByDate.dailySchedule);
  }

  @Override
  public int hashCode() {
    return Objects.hash(daysOfMonth, monthsOfYear, dailySchedule);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScheduleMonthlyByDate {\n");
    
    sb.append("    daysOfMonth: ").append(toIndentedString(daysOfMonth)).append("\n");
    sb.append("    monthsOfYear: ").append(toIndentedString(monthsOfYear)).append("\n");
    sb.append("    dailySchedule: ").append(toIndentedString(dailySchedule)).append("\n");
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

