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
 * ScheduleInstance
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2017-10-04T15:05:55.769-05:00")
public class ScheduleInstance   {
  
    private String schedRef;


  /**
   * The current status of the schedule.
   */
  public enum ScheduleStatusEnum {
    unknown("unknown"),
    active("active"),
    disabled("disabled"),
    completed("completed"),
    __UNDEFINED("__UNDEFINED");
;
    private String value;

    ScheduleStatusEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

    private ScheduleStatusEnum scheduleStatus;


  /**
   * The type of action to be taken.
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

    private Schedule schedule;

    private Long creationTime;

    private Long lastRunTime;

    private Long nextRunTime;

    private Long stopTime;

    private String id;

  
  /**
   * A reference to the schedule object.
   **/
  public ScheduleInstance schedRef(String schedRef) {
    this.schedRef = schedRef;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "A reference to the schedule object.")
  @JsonProperty("schedRef")
  public String getSchedRef() {
    return schedRef;
  }
  
  public void setSchedRef(String schedRef) {
    this.schedRef = schedRef;
  }

  
  /**
   * The current status of the schedule.
   **/
  public ScheduleInstance scheduleStatus(ScheduleStatusEnum scheduleStatus) {
    this.scheduleStatus = scheduleStatus;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The current status of the schedule.")
  @JsonProperty("scheduleStatus")
  public ScheduleStatusEnum getScheduleStatus() {
    return scheduleStatus;
  }
  
  public void setScheduleStatus(ScheduleStatusEnum scheduleStatus) {
    this.scheduleStatus = scheduleStatus;
  }

  
  /**
   * The type of action to be taken.
   **/
  public ScheduleInstance action(ActionEnum action) {
    this.action = action;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The type of action to be taken.")
  @JsonProperty("action")
  public ActionEnum getAction() {
    return action;
  }
  
  public void setAction(ActionEnum action) {
    this.action = action;
  }

  
  /**
   * The object associated with schedule.
   **/
  public ScheduleInstance targetObject(String targetObject) {
    this.targetObject = targetObject;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The object associated with schedule.")
  @JsonProperty("targetObject")
  public String getTargetObject() {
    return targetObject;
  }
  
  public void setTargetObject(String targetObject) {
    this.targetObject = targetObject;
  }

  
  /**
   * The schedule information.
   **/
  public ScheduleInstance schedule(Schedule schedule) {
    this.schedule = schedule;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The schedule information.")
  @JsonProperty("schedule")
  public Schedule getSchedule() {
    return schedule;
  }
  
  public void setSchedule(Schedule schedule) {
    this.schedule = schedule;
  }

  
  /**
   * The schedule creation time (local time) measured as seconds since January 1, 1970.
   **/
  public ScheduleInstance creationTime(Long creationTime) {
    this.creationTime = creationTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The schedule creation time (local time) measured as seconds since January 1, 1970.")
  @JsonProperty("creationTime")
  public Long getCreationTime() {
    return creationTime;
  }
  
  public void setCreationTime(Long creationTime) {
    this.creationTime = creationTime;
  }

  
  /**
   * The last run time (local time) measured as seconds since January 1, 1970.
   **/
  public ScheduleInstance lastRunTime(Long lastRunTime) {
    this.lastRunTime = lastRunTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The last run time (local time) measured as seconds since January 1, 1970.")
  @JsonProperty("lastRunTime")
  public Long getLastRunTime() {
    return lastRunTime;
  }
  
  public void setLastRunTime(Long lastRunTime) {
    this.lastRunTime = lastRunTime;
  }

  
  /**
   * The next run time (local time) measured as seconds since January 1, 1970.
   **/
  public ScheduleInstance nextRunTime(Long nextRunTime) {
    this.nextRunTime = nextRunTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The next run time (local time) measured as seconds since January 1, 1970.")
  @JsonProperty("nextRunTime")
  public Long getNextRunTime() {
    return nextRunTime;
  }
  
  public void setNextRunTime(Long nextRunTime) {
    this.nextRunTime = nextRunTime;
  }

  
  /**
   * The local time after which schedule is no longer active, measured as seconds since January 1, 1970.
   **/
  public ScheduleInstance stopTime(Long stopTime) {
    this.stopTime = stopTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The local time after which schedule is no longer active, measured as seconds since January 1, 1970.")
  @JsonProperty("stopTime")
  public Long getStopTime() {
    return stopTime;
  }
  
  public void setStopTime(Long stopTime) {
    this.stopTime = stopTime;
  }

  
  /**
   **/
  public ScheduleInstance id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  
  public void setId(String id) {
    this.id = id;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ScheduleInstance scheduleInstance = (ScheduleInstance) o;
    return Objects.equals(this.schedRef, scheduleInstance.schedRef) &&
        Objects.equals(this.scheduleStatus, scheduleInstance.scheduleStatus) &&
        Objects.equals(this.action, scheduleInstance.action) &&
        Objects.equals(this.targetObject, scheduleInstance.targetObject) &&
        Objects.equals(this.schedule, scheduleInstance.schedule) &&
        Objects.equals(this.creationTime, scheduleInstance.creationTime) &&
        Objects.equals(this.lastRunTime, scheduleInstance.lastRunTime) &&
        Objects.equals(this.nextRunTime, scheduleInstance.nextRunTime) &&
        Objects.equals(this.stopTime, scheduleInstance.stopTime) &&
        Objects.equals(this.id, scheduleInstance.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(schedRef, scheduleStatus, action, targetObject, schedule, creationTime, lastRunTime, nextRunTime, stopTime, id);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScheduleInstance {\n");
    
    sb.append("    schedRef: ").append(toIndentedString(schedRef)).append("\n");
    sb.append("    scheduleStatus: ").append(toIndentedString(scheduleStatus)).append("\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    targetObject: ").append(toIndentedString(targetObject)).append("\n");
    sb.append("    schedule: ").append(toIndentedString(schedule)).append("\n");
    sb.append("    creationTime: ").append(toIndentedString(creationTime)).append("\n");
    sb.append("    lastRunTime: ").append(toIndentedString(lastRunTime)).append("\n");
    sb.append("    nextRunTime: ").append(toIndentedString(nextRunTime)).append("\n");
    sb.append("    stopTime: ").append(toIndentedString(stopTime)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

