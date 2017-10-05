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
 * AlarmUpdateDescriptor
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2017-10-04T15:05:55.769-05:00")
public class AlarmUpdateDescriptor   {
  
    private String alarmRef;


  /**
   * Indicates the alarm control to activate on the specified alarm.
   */
  public enum AlarmControlEnum {
    enable("enable"),
    disable("disable"),
    mute("mute"),
    refresh("refresh"),
    __UNDEFINED("__UNDEFINED");
;
    private String value;

    AlarmControlEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

    private AlarmControlEnum alarmControl;

  
  /**
   * The reference that identifies the physical alarm to modify.
   **/
  public AlarmUpdateDescriptor alarmRef(String alarmRef) {
    this.alarmRef = alarmRef;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The reference that identifies the physical alarm to modify.")
  @JsonProperty("alarmRef")
  public String getAlarmRef() {
    return alarmRef;
  }
  
  public void setAlarmRef(String alarmRef) {
    this.alarmRef = alarmRef;
  }

  
  /**
   * Indicates the alarm control to activate on the specified alarm.
   **/
  public AlarmUpdateDescriptor alarmControl(AlarmControlEnum alarmControl) {
    this.alarmControl = alarmControl;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Indicates the alarm control to activate on the specified alarm.")
  @JsonProperty("alarmControl")
  public AlarmControlEnum getAlarmControl() {
    return alarmControl;
  }
  
  public void setAlarmControl(AlarmControlEnum alarmControl) {
    this.alarmControl = alarmControl;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlarmUpdateDescriptor alarmUpdateDescriptor = (AlarmUpdateDescriptor) o;
    return Objects.equals(this.alarmRef, alarmUpdateDescriptor.alarmRef) &&
        Objects.equals(this.alarmControl, alarmUpdateDescriptor.alarmControl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(alarmRef, alarmControl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlarmUpdateDescriptor {\n");
    
    sb.append("    alarmRef: ").append(toIndentedString(alarmRef)).append("\n");
    sb.append("    alarmControl: ").append(toIndentedString(alarmControl)).append("\n");
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

