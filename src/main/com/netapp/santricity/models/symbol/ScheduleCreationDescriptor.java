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
 * ScheduleCreationDescriptor
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2016-08-12T15:32:46.001-05:00")
public class ScheduleCreationDescriptor   {
  

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

    private OptionalTargetObject targetObject;

    private Schedule schedule;

    private Boolean enabled;

  
  /**
   * The type of action to be taken.
   **/
  public ScheduleCreationDescriptor action(ActionEnum action) {
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
  public ScheduleCreationDescriptor targetObject(OptionalTargetObject targetObject) {
    this.targetObject = targetObject;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The object associated with schedule.")
  @JsonProperty("targetObject")
  public OptionalTargetObject getTargetObject() {
    return targetObject;
  }
  
  public void setTargetObject(OptionalTargetObject targetObject) {
    this.targetObject = targetObject;
  }

  
  /**
   * All schedule-related information.
   **/
  public ScheduleCreationDescriptor schedule(Schedule schedule) {
    this.schedule = schedule;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "All schedule-related information.")
  @JsonProperty("schedule")
  public Schedule getSchedule() {
    return schedule;
  }
  
  public void setSchedule(Schedule schedule) {
    this.schedule = schedule;
  }

  
  /**
   * If true, the schedule will be enabled, otherwise it will be disabled.
   **/
  public ScheduleCreationDescriptor enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "If true, the schedule will be enabled, otherwise it will be disabled.")
  @JsonProperty("enabled")
  public Boolean getEnabled() {
    return enabled;
  }
  
  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ScheduleCreationDescriptor scheduleCreationDescriptor = (ScheduleCreationDescriptor) o;
    return Objects.equals(this.action, scheduleCreationDescriptor.action) &&
        Objects.equals(this.targetObject, scheduleCreationDescriptor.targetObject) &&
        Objects.equals(this.schedule, scheduleCreationDescriptor.schedule) &&
        Objects.equals(this.enabled, scheduleCreationDescriptor.enabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(action, targetObject, schedule, enabled);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScheduleCreationDescriptor {\n");
    
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    targetObject: ").append(toIndentedString(targetObject)).append("\n");
    sb.append("    schedule: ").append(toIndentedString(schedule)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
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

