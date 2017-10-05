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
 * DeviceAsupSchedule
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2017-10-04T15:05:52.333-05:00")
public class DeviceAsupSchedule   {
  
    private Integer dailyMinTime;

    private Integer dailyMaxTime;

    private Integer weeklyMinTime;

    private Integer weeklyMaxTime;


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
   * ASUP daily minimum time
   **/
  public DeviceAsupSchedule dailyMinTime(Integer dailyMinTime) {
    this.dailyMinTime = dailyMinTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "ASUP daily minimum time")
  @JsonProperty("dailyMinTime")
  public Integer getDailyMinTime() {
    return dailyMinTime;
  }
  
  public void setDailyMinTime(Integer dailyMinTime) {
    this.dailyMinTime = dailyMinTime;
  }

  
  /**
   * ASUP daily maximum time
   **/
  public DeviceAsupSchedule dailyMaxTime(Integer dailyMaxTime) {
    this.dailyMaxTime = dailyMaxTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "ASUP daily maximum time")
  @JsonProperty("dailyMaxTime")
  public Integer getDailyMaxTime() {
    return dailyMaxTime;
  }
  
  public void setDailyMaxTime(Integer dailyMaxTime) {
    this.dailyMaxTime = dailyMaxTime;
  }

  
  /**
   * ASUP weekly minimum time
   **/
  public DeviceAsupSchedule weeklyMinTime(Integer weeklyMinTime) {
    this.weeklyMinTime = weeklyMinTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "ASUP weekly minimum time")
  @JsonProperty("weeklyMinTime")
  public Integer getWeeklyMinTime() {
    return weeklyMinTime;
  }
  
  public void setWeeklyMinTime(Integer weeklyMinTime) {
    this.weeklyMinTime = weeklyMinTime;
  }

  
  /**
   * ASUP weekly maximum time
   **/
  public DeviceAsupSchedule weeklyMaxTime(Integer weeklyMaxTime) {
    this.weeklyMaxTime = weeklyMaxTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "ASUP weekly maximum time")
  @JsonProperty("weeklyMaxTime")
  public Integer getWeeklyMaxTime() {
    return weeklyMaxTime;
  }
  
  public void setWeeklyMaxTime(Integer weeklyMaxTime) {
    this.weeklyMaxTime = weeklyMaxTime;
  }

  
  /**
   * ASUP days of week
   **/
  public DeviceAsupSchedule daysOfWeek(List<DaysOfWeekEnum> daysOfWeek) {
    this.daysOfWeek = daysOfWeek;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "ASUP days of week")
  @JsonProperty("daysOfWeek")
  public List<DaysOfWeekEnum> getDaysOfWeek() {
    return daysOfWeek;
  }
  
  public void setDaysOfWeek(List<DaysOfWeekEnum> daysOfWeek) {
    this.daysOfWeek = daysOfWeek;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeviceAsupSchedule deviceAsupSchedule = (DeviceAsupSchedule) o;
    return Objects.equals(this.dailyMinTime, deviceAsupSchedule.dailyMinTime) &&
        Objects.equals(this.dailyMaxTime, deviceAsupSchedule.dailyMaxTime) &&
        Objects.equals(this.weeklyMinTime, deviceAsupSchedule.weeklyMinTime) &&
        Objects.equals(this.weeklyMaxTime, deviceAsupSchedule.weeklyMaxTime) &&
        Objects.equals(this.daysOfWeek, deviceAsupSchedule.daysOfWeek);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dailyMinTime, dailyMaxTime, weeklyMinTime, weeklyMaxTime, daysOfWeek);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeviceAsupSchedule {\n");
    
    sb.append("    dailyMinTime: ").append(toIndentedString(dailyMinTime)).append("\n");
    sb.append("    dailyMaxTime: ").append(toIndentedString(dailyMaxTime)).append("\n");
    sb.append("    weeklyMinTime: ").append(toIndentedString(weeklyMinTime)).append("\n");
    sb.append("    weeklyMaxTime: ").append(toIndentedString(weeklyMaxTime)).append("\n");
    sb.append("    daysOfWeek: ").append(toIndentedString(daysOfWeek)).append("\n");
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

