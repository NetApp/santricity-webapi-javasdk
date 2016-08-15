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
 * InterfaceCounterGroup
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2016-08-12T15:32:46.001-05:00")
public class InterfaceCounterGroup   {
  
    private String controllerRef;

    private Long baseTime;

    private Long startTime;

    private Long observedTime;


  /**
   * Channel Type enumeration Drive side, host side, or management.
   */
  public enum ChannelTypeEnum {
    hostside("hostside"),
    driveside("driveside"),
    management("management"),
    __UNDEFINED("__UNDEFINED");
;
    private String value;

    ChannelTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

    private ChannelTypeEnum channelType;

    private Integer channelNumber;

    private Long readOps;

    private Long readBytes;

    private Long readTimeTotal;

    private Long readTimeMax;

    private Long writeOps;

    private Long writeBytes;

    private Long writeTimeTotal;

    private Long writeTimeMax;

    private Long otherOps;

    private Long otherTimeTotal;

    private Long otherTimeMax;

    private Long readTimeTotalSq;

    private Long writeTimeTotalSq;

    private Long otherTimeTotalSq;

    private Long queueDepthTotal;

    private Long queueDepthMax;

    private Long channelErrorCounts;

  
  /**
   * The controller that generated this group.
   **/
  public InterfaceCounterGroup controllerRef(String controllerRef) {
    this.controllerRef = controllerRef;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The controller that generated this group.")
  @JsonProperty("controllerRef")
  public String getControllerRef() {
    return controllerRef;
  }
  
  public void setControllerRef(String controllerRef) {
    this.controllerRef = controllerRef;
  }

  
  /**
   * Time the counters were last reset. Time is the number of seconds since midnight, January 1, 1970.
   **/
  public InterfaceCounterGroup baseTime(Long baseTime) {
    this.baseTime = baseTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Time the counters were last reset. Time is the number of seconds since midnight, January 1, 1970.")
  @JsonProperty("baseTime")
  public Long getBaseTime() {
    return baseTime;
  }
  
  public void setBaseTime(Long baseTime) {
    this.baseTime = baseTime;
  }

  
  /**
   * Start time for this collection as measured by the number of seconds since baseTime.
   **/
  public InterfaceCounterGroup startTime(Long startTime) {
    this.startTime = startTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Start time for this collection as measured by the number of seconds since baseTime.")
  @JsonProperty("startTime")
  public Long getStartTime() {
    return startTime;
  }
  
  public void setStartTime(Long startTime) {
    this.startTime = startTime;
  }

  
  /**
   * End time for this collection as measured by the number of seconds since baseTime.
   **/
  public InterfaceCounterGroup observedTime(Long observedTime) {
    this.observedTime = observedTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "End time for this collection as measured by the number of seconds since baseTime.")
  @JsonProperty("observedTime")
  public Long getObservedTime() {
    return observedTime;
  }
  
  public void setObservedTime(Long observedTime) {
    this.observedTime = observedTime;
  }

  
  /**
   * Channel Type enumeration Drive side, host side, or management.
   **/
  public InterfaceCounterGroup channelType(ChannelTypeEnum channelType) {
    this.channelType = channelType;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Channel Type enumeration Drive side, host side, or management.")
  @JsonProperty("channelType")
  public ChannelTypeEnum getChannelType() {
    return channelType;
  }
  
  public void setChannelType(ChannelTypeEnum channelType) {
    this.channelType = channelType;
  }

  
  /**
   * Channel numerical ID.
   **/
  public InterfaceCounterGroup channelNumber(Integer channelNumber) {
    this.channelNumber = channelNumber;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Channel numerical ID.")
  @JsonProperty("channelNumber")
  public Integer getChannelNumber() {
    return channelNumber;
  }
  
  public void setChannelNumber(Integer channelNumber) {
    this.channelNumber = channelNumber;
  }

  
  /**
   * Number of read operations.
   **/
  public InterfaceCounterGroup readOps(Long readOps) {
    this.readOps = readOps;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Number of read operations.")
  @JsonProperty("readOps")
  public Long getReadOps() {
    return readOps;
  }
  
  public void setReadOps(Long readOps) {
    this.readOps = readOps;
  }

  
  /**
   * Number of bytes read.
   **/
  public InterfaceCounterGroup readBytes(Long readBytes) {
    this.readBytes = readBytes;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Number of bytes read.")
  @JsonProperty("readBytes")
  public Long getReadBytes() {
    return readBytes;
  }
  
  public void setReadBytes(Long readBytes) {
    this.readBytes = readBytes;
  }

  
  /**
   * Total time in microseconds spent in read operations.
   **/
  public InterfaceCounterGroup readTimeTotal(Long readTimeTotal) {
    this.readTimeTotal = readTimeTotal;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Total time in microseconds spent in read operations.")
  @JsonProperty("readTimeTotal")
  public Long getReadTimeTotal() {
    return readTimeTotal;
  }
  
  public void setReadTimeTotal(Long readTimeTotal) {
    this.readTimeTotal = readTimeTotal;
  }

  
  /**
   * Max time in microseconds spent processing one read operation.
   **/
  public InterfaceCounterGroup readTimeMax(Long readTimeMax) {
    this.readTimeMax = readTimeMax;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Max time in microseconds spent processing one read operation.")
  @JsonProperty("readTimeMax")
  public Long getReadTimeMax() {
    return readTimeMax;
  }
  
  public void setReadTimeMax(Long readTimeMax) {
    this.readTimeMax = readTimeMax;
  }

  
  /**
   * Number of write operations.
   **/
  public InterfaceCounterGroup writeOps(Long writeOps) {
    this.writeOps = writeOps;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Number of write operations.")
  @JsonProperty("writeOps")
  public Long getWriteOps() {
    return writeOps;
  }
  
  public void setWriteOps(Long writeOps) {
    this.writeOps = writeOps;
  }

  
  /**
   * Number of bytes write.
   **/
  public InterfaceCounterGroup writeBytes(Long writeBytes) {
    this.writeBytes = writeBytes;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Number of bytes write.")
  @JsonProperty("writeBytes")
  public Long getWriteBytes() {
    return writeBytes;
  }
  
  public void setWriteBytes(Long writeBytes) {
    this.writeBytes = writeBytes;
  }

  
  /**
   * Total time in microseconds spent in write operations.
   **/
  public InterfaceCounterGroup writeTimeTotal(Long writeTimeTotal) {
    this.writeTimeTotal = writeTimeTotal;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Total time in microseconds spent in write operations.")
  @JsonProperty("writeTimeTotal")
  public Long getWriteTimeTotal() {
    return writeTimeTotal;
  }
  
  public void setWriteTimeTotal(Long writeTimeTotal) {
    this.writeTimeTotal = writeTimeTotal;
  }

  
  /**
   * Max time in microseconds spent processing one write operation.
   **/
  public InterfaceCounterGroup writeTimeMax(Long writeTimeMax) {
    this.writeTimeMax = writeTimeMax;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Max time in microseconds spent processing one write operation.")
  @JsonProperty("writeTimeMax")
  public Long getWriteTimeMax() {
    return writeTimeMax;
  }
  
  public void setWriteTimeMax(Long writeTimeMax) {
    this.writeTimeMax = writeTimeMax;
  }

  
  /**
   * Number of non-read-write operations.
   **/
  public InterfaceCounterGroup otherOps(Long otherOps) {
    this.otherOps = otherOps;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Number of non-read-write operations.")
  @JsonProperty("otherOps")
  public Long getOtherOps() {
    return otherOps;
  }
  
  public void setOtherOps(Long otherOps) {
    this.otherOps = otherOps;
  }

  
  /**
   * Total time in microseconds spent in non-read-write ops.
   **/
  public InterfaceCounterGroup otherTimeTotal(Long otherTimeTotal) {
    this.otherTimeTotal = otherTimeTotal;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Total time in microseconds spent in non-read-write ops.")
  @JsonProperty("otherTimeTotal")
  public Long getOtherTimeTotal() {
    return otherTimeTotal;
  }
  
  public void setOtherTimeTotal(Long otherTimeTotal) {
    this.otherTimeTotal = otherTimeTotal;
  }

  
  /**
   * Max time in microseconds spent processing one non-read-write op.
   **/
  public InterfaceCounterGroup otherTimeMax(Long otherTimeMax) {
    this.otherTimeMax = otherTimeMax;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Max time in microseconds spent processing one non-read-write op.")
  @JsonProperty("otherTimeMax")
  public Long getOtherTimeMax() {
    return otherTimeMax;
  }
  
  public void setOtherTimeMax(Long otherTimeMax) {
    this.otherTimeMax = otherTimeMax;
  }

  
  /**
   * Sum of the squares of microseconds spent in read operations.
   **/
  public InterfaceCounterGroup readTimeTotalSq(Long readTimeTotalSq) {
    this.readTimeTotalSq = readTimeTotalSq;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Sum of the squares of microseconds spent in read operations.")
  @JsonProperty("readTimeTotalSq")
  public Long getReadTimeTotalSq() {
    return readTimeTotalSq;
  }
  
  public void setReadTimeTotalSq(Long readTimeTotalSq) {
    this.readTimeTotalSq = readTimeTotalSq;
  }

  
  /**
   * Sum of the squares of microseconds spent in write operations.
   **/
  public InterfaceCounterGroup writeTimeTotalSq(Long writeTimeTotalSq) {
    this.writeTimeTotalSq = writeTimeTotalSq;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Sum of the squares of microseconds spent in write operations.")
  @JsonProperty("writeTimeTotalSq")
  public Long getWriteTimeTotalSq() {
    return writeTimeTotalSq;
  }
  
  public void setWriteTimeTotalSq(Long writeTimeTotalSq) {
    this.writeTimeTotalSq = writeTimeTotalSq;
  }

  
  /**
   * Sum of the squares of microseconds spent in non-read-write operations.
   **/
  public InterfaceCounterGroup otherTimeTotalSq(Long otherTimeTotalSq) {
    this.otherTimeTotalSq = otherTimeTotalSq;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Sum of the squares of microseconds spent in non-read-write operations.")
  @JsonProperty("otherTimeTotalSq")
  public Long getOtherTimeTotalSq() {
    return otherTimeTotalSq;
  }
  
  public void setOtherTimeTotalSq(Long otherTimeTotalSq) {
    this.otherTimeTotalSq = otherTimeTotalSq;
  }

  
  /**
   * Total channel queue depth.
   **/
  public InterfaceCounterGroup queueDepthTotal(Long queueDepthTotal) {
    this.queueDepthTotal = queueDepthTotal;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Total channel queue depth.")
  @JsonProperty("queueDepthTotal")
  public Long getQueueDepthTotal() {
    return queueDepthTotal;
  }
  
  public void setQueueDepthTotal(Long queueDepthTotal) {
    this.queueDepthTotal = queueDepthTotal;
  }

  
  /**
   * Maximum channel queue depth.
   **/
  public InterfaceCounterGroup queueDepthMax(Long queueDepthMax) {
    this.queueDepthMax = queueDepthMax;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Maximum channel queue depth.")
  @JsonProperty("queueDepthMax")
  public Long getQueueDepthMax() {
    return queueDepthMax;
  }
  
  public void setQueueDepthMax(Long queueDepthMax) {
    this.queueDepthMax = queueDepthMax;
  }

  
  /**
   * The total number of errors detected on this channel.
   **/
  public InterfaceCounterGroup channelErrorCounts(Long channelErrorCounts) {
    this.channelErrorCounts = channelErrorCounts;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The total number of errors detected on this channel.")
  @JsonProperty("channelErrorCounts")
  public Long getChannelErrorCounts() {
    return channelErrorCounts;
  }
  
  public void setChannelErrorCounts(Long channelErrorCounts) {
    this.channelErrorCounts = channelErrorCounts;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InterfaceCounterGroup interfaceCounterGroup = (InterfaceCounterGroup) o;
    return Objects.equals(this.controllerRef, interfaceCounterGroup.controllerRef) &&
        Objects.equals(this.baseTime, interfaceCounterGroup.baseTime) &&
        Objects.equals(this.startTime, interfaceCounterGroup.startTime) &&
        Objects.equals(this.observedTime, interfaceCounterGroup.observedTime) &&
        Objects.equals(this.channelType, interfaceCounterGroup.channelType) &&
        Objects.equals(this.channelNumber, interfaceCounterGroup.channelNumber) &&
        Objects.equals(this.readOps, interfaceCounterGroup.readOps) &&
        Objects.equals(this.readBytes, interfaceCounterGroup.readBytes) &&
        Objects.equals(this.readTimeTotal, interfaceCounterGroup.readTimeTotal) &&
        Objects.equals(this.readTimeMax, interfaceCounterGroup.readTimeMax) &&
        Objects.equals(this.writeOps, interfaceCounterGroup.writeOps) &&
        Objects.equals(this.writeBytes, interfaceCounterGroup.writeBytes) &&
        Objects.equals(this.writeTimeTotal, interfaceCounterGroup.writeTimeTotal) &&
        Objects.equals(this.writeTimeMax, interfaceCounterGroup.writeTimeMax) &&
        Objects.equals(this.otherOps, interfaceCounterGroup.otherOps) &&
        Objects.equals(this.otherTimeTotal, interfaceCounterGroup.otherTimeTotal) &&
        Objects.equals(this.otherTimeMax, interfaceCounterGroup.otherTimeMax) &&
        Objects.equals(this.readTimeTotalSq, interfaceCounterGroup.readTimeTotalSq) &&
        Objects.equals(this.writeTimeTotalSq, interfaceCounterGroup.writeTimeTotalSq) &&
        Objects.equals(this.otherTimeTotalSq, interfaceCounterGroup.otherTimeTotalSq) &&
        Objects.equals(this.queueDepthTotal, interfaceCounterGroup.queueDepthTotal) &&
        Objects.equals(this.queueDepthMax, interfaceCounterGroup.queueDepthMax) &&
        Objects.equals(this.channelErrorCounts, interfaceCounterGroup.channelErrorCounts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(controllerRef, baseTime, startTime, observedTime, channelType, channelNumber, readOps, readBytes, readTimeTotal, readTimeMax, writeOps, writeBytes, writeTimeTotal, writeTimeMax, otherOps, otherTimeTotal, otherTimeMax, readTimeTotalSq, writeTimeTotalSq, otherTimeTotalSq, queueDepthTotal, queueDepthMax, channelErrorCounts);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InterfaceCounterGroup {\n");
    
    sb.append("    controllerRef: ").append(toIndentedString(controllerRef)).append("\n");
    sb.append("    baseTime: ").append(toIndentedString(baseTime)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    observedTime: ").append(toIndentedString(observedTime)).append("\n");
    sb.append("    channelType: ").append(toIndentedString(channelType)).append("\n");
    sb.append("    channelNumber: ").append(toIndentedString(channelNumber)).append("\n");
    sb.append("    readOps: ").append(toIndentedString(readOps)).append("\n");
    sb.append("    readBytes: ").append(toIndentedString(readBytes)).append("\n");
    sb.append("    readTimeTotal: ").append(toIndentedString(readTimeTotal)).append("\n");
    sb.append("    readTimeMax: ").append(toIndentedString(readTimeMax)).append("\n");
    sb.append("    writeOps: ").append(toIndentedString(writeOps)).append("\n");
    sb.append("    writeBytes: ").append(toIndentedString(writeBytes)).append("\n");
    sb.append("    writeTimeTotal: ").append(toIndentedString(writeTimeTotal)).append("\n");
    sb.append("    writeTimeMax: ").append(toIndentedString(writeTimeMax)).append("\n");
    sb.append("    otherOps: ").append(toIndentedString(otherOps)).append("\n");
    sb.append("    otherTimeTotal: ").append(toIndentedString(otherTimeTotal)).append("\n");
    sb.append("    otherTimeMax: ").append(toIndentedString(otherTimeMax)).append("\n");
    sb.append("    readTimeTotalSq: ").append(toIndentedString(readTimeTotalSq)).append("\n");
    sb.append("    writeTimeTotalSq: ").append(toIndentedString(writeTimeTotalSq)).append("\n");
    sb.append("    otherTimeTotalSq: ").append(toIndentedString(otherTimeTotalSq)).append("\n");
    sb.append("    queueDepthTotal: ").append(toIndentedString(queueDepthTotal)).append("\n");
    sb.append("    queueDepthMax: ").append(toIndentedString(queueDepthMax)).append("\n");
    sb.append("    channelErrorCounts: ").append(toIndentedString(channelErrorCounts)).append("\n");
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

