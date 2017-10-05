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
 * API response object that includes ASUP information for a storage device.
 */
@ApiModel(description = "API response object that includes ASUP information for a storage device.")
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2017-10-04T15:05:52.333-05:00")
public class DeviceAsupDevice   {
  
    private String wwn;

    private String name;

    private Boolean asupCapable;

    private Boolean asupEnabled;

    private Boolean onDemandCapable;

    private Boolean scheduled;

    private Integer dailyScheduleTime;

    private Integer weeklyScheduleTime;


  /**
   * ASUP weekly scheduled day of week
   */
  public enum WeeklyDayOfWeekEnum {
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

    WeeklyDayOfWeekEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

    private WeeklyDayOfWeekEnum weeklyDayOfWeek;

  
  /**
   * Device's world-wide-name
   **/
  public DeviceAsupDevice wwn(String wwn) {
    this.wwn = wwn;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Device's world-wide-name")
  @JsonProperty("wwn")
  public String getWwn() {
    return wwn;
  }
  
  public void setWwn(String wwn) {
    this.wwn = wwn;
  }

  
  /**
   * Device's name
   **/
  public DeviceAsupDevice name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Device's name")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   * ASUP capable
   **/
  public DeviceAsupDevice asupCapable(Boolean asupCapable) {
    this.asupCapable = asupCapable;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "ASUP capable")
  @JsonProperty("asupCapable")
  public Boolean getAsupCapable() {
    return asupCapable;
  }
  
  public void setAsupCapable(Boolean asupCapable) {
    this.asupCapable = asupCapable;
  }

  
  /**
   * ASUP enabled
   **/
  public DeviceAsupDevice asupEnabled(Boolean asupEnabled) {
    this.asupEnabled = asupEnabled;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "ASUP enabled")
  @JsonProperty("asupEnabled")
  public Boolean getAsupEnabled() {
    return asupEnabled;
  }
  
  public void setAsupEnabled(Boolean asupEnabled) {
    this.asupEnabled = asupEnabled;
  }

  
  /**
   * ASUP OnDemand capable
   **/
  public DeviceAsupDevice onDemandCapable(Boolean onDemandCapable) {
    this.onDemandCapable = onDemandCapable;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "ASUP OnDemand capable")
  @JsonProperty("onDemandCapable")
  public Boolean getOnDemandCapable() {
    return onDemandCapable;
  }
  
  public void setOnDemandCapable(Boolean onDemandCapable) {
    this.onDemandCapable = onDemandCapable;
  }

  
  /**
   * Device has ASUP daily/weekly schedule
   **/
  public DeviceAsupDevice scheduled(Boolean scheduled) {
    this.scheduled = scheduled;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Device has ASUP daily/weekly schedule")
  @JsonProperty("scheduled")
  public Boolean getScheduled() {
    return scheduled;
  }
  
  public void setScheduled(Boolean scheduled) {
    this.scheduled = scheduled;
  }

  
  /**
   * ASUP daily scheduled time
   **/
  public DeviceAsupDevice dailyScheduleTime(Integer dailyScheduleTime) {
    this.dailyScheduleTime = dailyScheduleTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "ASUP daily scheduled time")
  @JsonProperty("dailyScheduleTime")
  public Integer getDailyScheduleTime() {
    return dailyScheduleTime;
  }
  
  public void setDailyScheduleTime(Integer dailyScheduleTime) {
    this.dailyScheduleTime = dailyScheduleTime;
  }

  
  /**
   * ASUP weekly scheduled time
   **/
  public DeviceAsupDevice weeklyScheduleTime(Integer weeklyScheduleTime) {
    this.weeklyScheduleTime = weeklyScheduleTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "ASUP weekly scheduled time")
  @JsonProperty("weeklyScheduleTime")
  public Integer getWeeklyScheduleTime() {
    return weeklyScheduleTime;
  }
  
  public void setWeeklyScheduleTime(Integer weeklyScheduleTime) {
    this.weeklyScheduleTime = weeklyScheduleTime;
  }

  
  /**
   * ASUP weekly scheduled day of week
   **/
  public DeviceAsupDevice weeklyDayOfWeek(WeeklyDayOfWeekEnum weeklyDayOfWeek) {
    this.weeklyDayOfWeek = weeklyDayOfWeek;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "ASUP weekly scheduled day of week")
  @JsonProperty("weeklyDayOfWeek")
  public WeeklyDayOfWeekEnum getWeeklyDayOfWeek() {
    return weeklyDayOfWeek;
  }
  
  public void setWeeklyDayOfWeek(WeeklyDayOfWeekEnum weeklyDayOfWeek) {
    this.weeklyDayOfWeek = weeklyDayOfWeek;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeviceAsupDevice deviceAsupDevice = (DeviceAsupDevice) o;
    return Objects.equals(this.wwn, deviceAsupDevice.wwn) &&
        Objects.equals(this.name, deviceAsupDevice.name) &&
        Objects.equals(this.asupCapable, deviceAsupDevice.asupCapable) &&
        Objects.equals(this.asupEnabled, deviceAsupDevice.asupEnabled) &&
        Objects.equals(this.onDemandCapable, deviceAsupDevice.onDemandCapable) &&
        Objects.equals(this.scheduled, deviceAsupDevice.scheduled) &&
        Objects.equals(this.dailyScheduleTime, deviceAsupDevice.dailyScheduleTime) &&
        Objects.equals(this.weeklyScheduleTime, deviceAsupDevice.weeklyScheduleTime) &&
        Objects.equals(this.weeklyDayOfWeek, deviceAsupDevice.weeklyDayOfWeek);
  }

  @Override
  public int hashCode() {
    return Objects.hash(wwn, name, asupCapable, asupEnabled, onDemandCapable, scheduled, dailyScheduleTime, weeklyScheduleTime, weeklyDayOfWeek);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeviceAsupDevice {\n");
    
    sb.append("    wwn: ").append(toIndentedString(wwn)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    asupCapable: ").append(toIndentedString(asupCapable)).append("\n");
    sb.append("    asupEnabled: ").append(toIndentedString(asupEnabled)).append("\n");
    sb.append("    onDemandCapable: ").append(toIndentedString(onDemandCapable)).append("\n");
    sb.append("    scheduled: ").append(toIndentedString(scheduled)).append("\n");
    sb.append("    dailyScheduleTime: ").append(toIndentedString(dailyScheduleTime)).append("\n");
    sb.append("    weeklyScheduleTime: ").append(toIndentedString(weeklyScheduleTime)).append("\n");
    sb.append("    weeklyDayOfWeek: ").append(toIndentedString(weeklyDayOfWeek)).append("\n");
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

