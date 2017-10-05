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
 * IoCounterGroup
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2017-10-04T15:05:55.769-05:00")
public class IoCounterGroup   {
  
    private String controllerRef;

    private Long baseTime;

    private List<OpcodeCounter> opcodeCounters;

    private Long bytesIn;

    private Long bytesOut;

    private Long idleTime;

  
  /**
   * A reference to the controller that generated this group.
   **/
  public IoCounterGroup controllerRef(String controllerRef) {
    this.controllerRef = controllerRef;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "A reference to the controller that generated this group.")
  @JsonProperty("controllerRef")
  public String getControllerRef() {
    return controllerRef;
  }
  
  public void setControllerRef(String controllerRef) {
    this.controllerRef = controllerRef;
  }

  
  /**
   * The time the counters were last reset. Time is the number of seconds since midnight, January 1, 1970.
   **/
  public IoCounterGroup baseTime(Long baseTime) {
    this.baseTime = baseTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The time the counters were last reset. Time is the number of seconds since midnight, January 1, 1970.")
  @JsonProperty("baseTime")
  public Long getBaseTime() {
    return baseTime;
  }
  
  public void setBaseTime(Long baseTime) {
    this.baseTime = baseTime;
  }

  
  /**
   * An array of opcode counters. Each element in the array has an opcode value and an associated count of the number of times that opcode was observed.
   **/
  public IoCounterGroup opcodeCounters(List<OpcodeCounter> opcodeCounters) {
    this.opcodeCounters = opcodeCounters;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "An array of opcode counters. Each element in the array has an opcode value and an associated count of the number of times that opcode was observed.")
  @JsonProperty("opcodeCounters")
  public List<OpcodeCounter> getOpcodeCounters() {
    return opcodeCounters;
  }
  
  public void setOpcodeCounters(List<OpcodeCounter> opcodeCounters) {
    this.opcodeCounters = opcodeCounters;
  }

  
  /**
   * The number of bytes transferred into controller memory.
   **/
  public IoCounterGroup bytesIn(Long bytesIn) {
    this.bytesIn = bytesIn;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The number of bytes transferred into controller memory.")
  @JsonProperty("bytesIn")
  public Long getBytesIn() {
    return bytesIn;
  }
  
  public void setBytesIn(Long bytesIn) {
    this.bytesIn = bytesIn;
  }

  
  /**
   * The number of bytes transferred out of controller memory.
   **/
  public IoCounterGroup bytesOut(Long bytesOut) {
    this.bytesOut = bytesOut;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The number of bytes transferred out of controller memory.")
  @JsonProperty("bytesOut")
  public Long getBytesOut() {
    return bytesOut;
  }
  
  public void setBytesOut(Long bytesOut) {
    this.bytesOut = bytesOut;
  }

  
  /**
   * The amount of time in microseconds the channel spent idle since baseTime.
   **/
  public IoCounterGroup idleTime(Long idleTime) {
    this.idleTime = idleTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The amount of time in microseconds the channel spent idle since baseTime.")
  @JsonProperty("idleTime")
  public Long getIdleTime() {
    return idleTime;
  }
  
  public void setIdleTime(Long idleTime) {
    this.idleTime = idleTime;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IoCounterGroup ioCounterGroup = (IoCounterGroup) o;
    return Objects.equals(this.controllerRef, ioCounterGroup.controllerRef) &&
        Objects.equals(this.baseTime, ioCounterGroup.baseTime) &&
        Objects.equals(this.opcodeCounters, ioCounterGroup.opcodeCounters) &&
        Objects.equals(this.bytesIn, ioCounterGroup.bytesIn) &&
        Objects.equals(this.bytesOut, ioCounterGroup.bytesOut) &&
        Objects.equals(this.idleTime, ioCounterGroup.idleTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(controllerRef, baseTime, opcodeCounters, bytesIn, bytesOut, idleTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoCounterGroup {\n");
    
    sb.append("    controllerRef: ").append(toIndentedString(controllerRef)).append("\n");
    sb.append("    baseTime: ").append(toIndentedString(baseTime)).append("\n");
    sb.append("    opcodeCounters: ").append(toIndentedString(opcodeCounters)).append("\n");
    sb.append("    bytesIn: ").append(toIndentedString(bytesIn)).append("\n");
    sb.append("    bytesOut: ").append(toIndentedString(bytesOut)).append("\n");
    sb.append("    idleTime: ").append(toIndentedString(idleTime)).append("\n");
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

