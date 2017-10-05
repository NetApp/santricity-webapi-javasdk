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
 * DailySchedule
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2017-10-04T15:05:55.769-05:00")
public class DailySchedule   {
  
    private Integer timeOfDay;

    private Integer everyNMinutes;

    private Integer timesPerDay;

  
  /**
   * The number of seconds after midnight local time for the first occurrence during the day.
   **/
  public DailySchedule timeOfDay(Integer timeOfDay) {
    this.timeOfDay = timeOfDay;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The number of seconds after midnight local time for the first occurrence during the day.")
  @JsonProperty("timeOfDay")
  public Integer getTimeOfDay() {
    return timeOfDay;
  }
  
  public void setTimeOfDay(Integer timeOfDay) {
    this.timeOfDay = timeOfDay;
  }

  
  /**
   * Interval between schedules if timesPerDay is greater than 1.
   **/
  public DailySchedule everyNMinutes(Integer everyNMinutes) {
    this.everyNMinutes = everyNMinutes;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Interval between schedules if timesPerDay is greater than 1.")
  @JsonProperty("everyNMinutes")
  public Integer getEveryNMinutes() {
    return everyNMinutes;
  }
  
  public void setEveryNMinutes(Integer everyNMinutes) {
    this.everyNMinutes = everyNMinutes;
  }

  
  /**
   * The number of occurrences during the day based on everyNMinutes, including the first occurrence.
   **/
  public DailySchedule timesPerDay(Integer timesPerDay) {
    this.timesPerDay = timesPerDay;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The number of occurrences during the day based on everyNMinutes, including the first occurrence.")
  @JsonProperty("timesPerDay")
  public Integer getTimesPerDay() {
    return timesPerDay;
  }
  
  public void setTimesPerDay(Integer timesPerDay) {
    this.timesPerDay = timesPerDay;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DailySchedule dailySchedule = (DailySchedule) o;
    return Objects.equals(this.timeOfDay, dailySchedule.timeOfDay) &&
        Objects.equals(this.everyNMinutes, dailySchedule.everyNMinutes) &&
        Objects.equals(this.timesPerDay, dailySchedule.timesPerDay);
  }

  @Override
  public int hashCode() {
    return Objects.hash(timeOfDay, everyNMinutes, timesPerDay);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DailySchedule {\n");
    
    sb.append("    timeOfDay: ").append(toIndentedString(timeOfDay)).append("\n");
    sb.append("    everyNMinutes: ").append(toIndentedString(everyNMinutes)).append("\n");
    sb.append("    timesPerDay: ").append(toIndentedString(timesPerDay)).append("\n");
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

