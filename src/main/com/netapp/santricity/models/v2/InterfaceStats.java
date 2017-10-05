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
 * Interface I/O performance statistics.
 */
@ApiModel(description = "Interface I/O performance statistics.")
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2017-10-04T15:05:52.333-05:00")
public class InterfaceStats   {
  
    private Date observedTime;

    private Long observedTimeInMS;

    private Date lastResetTime;

    private Long lastResetTimeInMS;

    private String interfaceId;

    private String arrayId;

    private String arrayWwn;


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

    private Double readOps;

    private Double readBytes;

    private Double readTimeTotal;

    private Double readTimeMax;

    private Double writeOps;

    private Double writeBytes;

    private Double writeTimeTotal;

    private Double writeTimeMax;

    private Double otherOps;

    private Double otherTimeTotal;

    private Double otherTimeMax;

    private Double readTimeTotalSq;

    private Double writeTimeTotalSq;

    private Double otherTimeTotalSq;

    private Double queueDepthTotal;

    private Double queueDepthMax;

    private Double channelErrorCounts;

  
  /**
   * End time for this collection as measured by the number of seconds since baseTime.
   **/
  public InterfaceStats observedTime(Date observedTime) {
    this.observedTime = observedTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "End time for this collection as measured by the number of seconds since baseTime.")
  @JsonProperty("observedTime")
  public Date getObservedTime() {
    return observedTime;
  }
  
  public void setObservedTime(Date observedTime) {
    this.observedTime = observedTime;
  }

  
  /**
   **/
  public InterfaceStats observedTimeInMS(Long observedTimeInMS) {
    this.observedTimeInMS = observedTimeInMS;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("observedTimeInMS")
  public Long getObservedTimeInMS() {
    return observedTimeInMS;
  }
  
  public void setObservedTimeInMS(Long observedTimeInMS) {
    this.observedTimeInMS = observedTimeInMS;
  }

  
  /**
   **/
  public InterfaceStats lastResetTime(Date lastResetTime) {
    this.lastResetTime = lastResetTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("lastResetTime")
  public Date getLastResetTime() {
    return lastResetTime;
  }
  
  public void setLastResetTime(Date lastResetTime) {
    this.lastResetTime = lastResetTime;
  }

  
  /**
   **/
  public InterfaceStats lastResetTimeInMS(Long lastResetTimeInMS) {
    this.lastResetTimeInMS = lastResetTimeInMS;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("lastResetTimeInMS")
  public Long getLastResetTimeInMS() {
    return lastResetTimeInMS;
  }
  
  public void setLastResetTimeInMS(Long lastResetTimeInMS) {
    this.lastResetTimeInMS = lastResetTimeInMS;
  }

  
  /**
   * Interface that generated this group.
   **/
  public InterfaceStats interfaceId(String interfaceId) {
    this.interfaceId = interfaceId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Interface that generated this group.")
  @JsonProperty("interfaceId")
  public String getInterfaceId() {
    return interfaceId;
  }
  
  public void setInterfaceId(String interfaceId) {
    this.interfaceId = interfaceId;
  }

  
  /**
   **/
  public InterfaceStats arrayId(String arrayId) {
    this.arrayId = arrayId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("arrayId")
  public String getArrayId() {
    return arrayId;
  }
  
  public void setArrayId(String arrayId) {
    this.arrayId = arrayId;
  }

  
  /**
   **/
  public InterfaceStats arrayWwn(String arrayWwn) {
    this.arrayWwn = arrayWwn;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("arrayWwn")
  public String getArrayWwn() {
    return arrayWwn;
  }
  
  public void setArrayWwn(String arrayWwn) {
    this.arrayWwn = arrayWwn;
  }

  
  /**
   * Channel Type enumeration Drive side, host side, or management.
   **/
  public InterfaceStats channelType(ChannelTypeEnum channelType) {
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
  public InterfaceStats channelNumber(Integer channelNumber) {
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
  public InterfaceStats readOps(Double readOps) {
    this.readOps = readOps;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Number of read operations.")
  @JsonProperty("readOps")
  public Double getReadOps() {
    return readOps;
  }
  
  public void setReadOps(Double readOps) {
    this.readOps = readOps;
  }

  
  /**
   * Number of bytes read.
   **/
  public InterfaceStats readBytes(Double readBytes) {
    this.readBytes = readBytes;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Number of bytes read.")
  @JsonProperty("readBytes")
  public Double getReadBytes() {
    return readBytes;
  }
  
  public void setReadBytes(Double readBytes) {
    this.readBytes = readBytes;
  }

  
  /**
   * Total time in microseconds spent in read operations.
   **/
  public InterfaceStats readTimeTotal(Double readTimeTotal) {
    this.readTimeTotal = readTimeTotal;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Total time in microseconds spent in read operations.")
  @JsonProperty("readTimeTotal")
  public Double getReadTimeTotal() {
    return readTimeTotal;
  }
  
  public void setReadTimeTotal(Double readTimeTotal) {
    this.readTimeTotal = readTimeTotal;
  }

  
  /**
   * Max time in microseconds spent processing one read operation.
   **/
  public InterfaceStats readTimeMax(Double readTimeMax) {
    this.readTimeMax = readTimeMax;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Max time in microseconds spent processing one read operation.")
  @JsonProperty("readTimeMax")
  public Double getReadTimeMax() {
    return readTimeMax;
  }
  
  public void setReadTimeMax(Double readTimeMax) {
    this.readTimeMax = readTimeMax;
  }

  
  /**
   * Number of write operations.
   **/
  public InterfaceStats writeOps(Double writeOps) {
    this.writeOps = writeOps;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Number of write operations.")
  @JsonProperty("writeOps")
  public Double getWriteOps() {
    return writeOps;
  }
  
  public void setWriteOps(Double writeOps) {
    this.writeOps = writeOps;
  }

  
  /**
   * Number of bytes write.
   **/
  public InterfaceStats writeBytes(Double writeBytes) {
    this.writeBytes = writeBytes;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Number of bytes write.")
  @JsonProperty("writeBytes")
  public Double getWriteBytes() {
    return writeBytes;
  }
  
  public void setWriteBytes(Double writeBytes) {
    this.writeBytes = writeBytes;
  }

  
  /**
   * Total time in microseconds spent in write operations.
   **/
  public InterfaceStats writeTimeTotal(Double writeTimeTotal) {
    this.writeTimeTotal = writeTimeTotal;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Total time in microseconds spent in write operations.")
  @JsonProperty("writeTimeTotal")
  public Double getWriteTimeTotal() {
    return writeTimeTotal;
  }
  
  public void setWriteTimeTotal(Double writeTimeTotal) {
    this.writeTimeTotal = writeTimeTotal;
  }

  
  /**
   * Max time in microseconds spent processing one write operation.
   **/
  public InterfaceStats writeTimeMax(Double writeTimeMax) {
    this.writeTimeMax = writeTimeMax;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Max time in microseconds spent processing one write operation.")
  @JsonProperty("writeTimeMax")
  public Double getWriteTimeMax() {
    return writeTimeMax;
  }
  
  public void setWriteTimeMax(Double writeTimeMax) {
    this.writeTimeMax = writeTimeMax;
  }

  
  /**
   * Number of non-read-write operations.
   **/
  public InterfaceStats otherOps(Double otherOps) {
    this.otherOps = otherOps;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Number of non-read-write operations.")
  @JsonProperty("otherOps")
  public Double getOtherOps() {
    return otherOps;
  }
  
  public void setOtherOps(Double otherOps) {
    this.otherOps = otherOps;
  }

  
  /**
   * Total time in microseconds spent in non-read-write ops.
   **/
  public InterfaceStats otherTimeTotal(Double otherTimeTotal) {
    this.otherTimeTotal = otherTimeTotal;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Total time in microseconds spent in non-read-write ops.")
  @JsonProperty("otherTimeTotal")
  public Double getOtherTimeTotal() {
    return otherTimeTotal;
  }
  
  public void setOtherTimeTotal(Double otherTimeTotal) {
    this.otherTimeTotal = otherTimeTotal;
  }

  
  /**
   * Max time in microseconds spent processing one non-read-write op.
   **/
  public InterfaceStats otherTimeMax(Double otherTimeMax) {
    this.otherTimeMax = otherTimeMax;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Max time in microseconds spent processing one non-read-write op.")
  @JsonProperty("otherTimeMax")
  public Double getOtherTimeMax() {
    return otherTimeMax;
  }
  
  public void setOtherTimeMax(Double otherTimeMax) {
    this.otherTimeMax = otherTimeMax;
  }

  
  /**
   * Sum of the squares of microseconds spent in read operations.
   **/
  public InterfaceStats readTimeTotalSq(Double readTimeTotalSq) {
    this.readTimeTotalSq = readTimeTotalSq;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Sum of the squares of microseconds spent in read operations.")
  @JsonProperty("readTimeTotalSq")
  public Double getReadTimeTotalSq() {
    return readTimeTotalSq;
  }
  
  public void setReadTimeTotalSq(Double readTimeTotalSq) {
    this.readTimeTotalSq = readTimeTotalSq;
  }

  
  /**
   * Sum of the squares of microseconds spent in write operations.
   **/
  public InterfaceStats writeTimeTotalSq(Double writeTimeTotalSq) {
    this.writeTimeTotalSq = writeTimeTotalSq;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Sum of the squares of microseconds spent in write operations.")
  @JsonProperty("writeTimeTotalSq")
  public Double getWriteTimeTotalSq() {
    return writeTimeTotalSq;
  }
  
  public void setWriteTimeTotalSq(Double writeTimeTotalSq) {
    this.writeTimeTotalSq = writeTimeTotalSq;
  }

  
  /**
   * Sum of the squares of microseconds spent in non-read-write operations.
   **/
  public InterfaceStats otherTimeTotalSq(Double otherTimeTotalSq) {
    this.otherTimeTotalSq = otherTimeTotalSq;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Sum of the squares of microseconds spent in non-read-write operations.")
  @JsonProperty("otherTimeTotalSq")
  public Double getOtherTimeTotalSq() {
    return otherTimeTotalSq;
  }
  
  public void setOtherTimeTotalSq(Double otherTimeTotalSq) {
    this.otherTimeTotalSq = otherTimeTotalSq;
  }

  
  /**
   * Total channel queue depth.
   **/
  public InterfaceStats queueDepthTotal(Double queueDepthTotal) {
    this.queueDepthTotal = queueDepthTotal;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Total channel queue depth.")
  @JsonProperty("queueDepthTotal")
  public Double getQueueDepthTotal() {
    return queueDepthTotal;
  }
  
  public void setQueueDepthTotal(Double queueDepthTotal) {
    this.queueDepthTotal = queueDepthTotal;
  }

  
  /**
   * Maximum channel queue depth.
   **/
  public InterfaceStats queueDepthMax(Double queueDepthMax) {
    this.queueDepthMax = queueDepthMax;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Maximum channel queue depth.")
  @JsonProperty("queueDepthMax")
  public Double getQueueDepthMax() {
    return queueDepthMax;
  }
  
  public void setQueueDepthMax(Double queueDepthMax) {
    this.queueDepthMax = queueDepthMax;
  }

  
  /**
   * The total number of errors detected on this channel.
   **/
  public InterfaceStats channelErrorCounts(Double channelErrorCounts) {
    this.channelErrorCounts = channelErrorCounts;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The total number of errors detected on this channel.")
  @JsonProperty("channelErrorCounts")
  public Double getChannelErrorCounts() {
    return channelErrorCounts;
  }
  
  public void setChannelErrorCounts(Double channelErrorCounts) {
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
    InterfaceStats interfaceStats = (InterfaceStats) o;
    return Objects.equals(this.observedTime, interfaceStats.observedTime) &&
        Objects.equals(this.observedTimeInMS, interfaceStats.observedTimeInMS) &&
        Objects.equals(this.lastResetTime, interfaceStats.lastResetTime) &&
        Objects.equals(this.lastResetTimeInMS, interfaceStats.lastResetTimeInMS) &&
        Objects.equals(this.interfaceId, interfaceStats.interfaceId) &&
        Objects.equals(this.arrayId, interfaceStats.arrayId) &&
        Objects.equals(this.arrayWwn, interfaceStats.arrayWwn) &&
        Objects.equals(this.channelType, interfaceStats.channelType) &&
        Objects.equals(this.channelNumber, interfaceStats.channelNumber) &&
        Objects.equals(this.readOps, interfaceStats.readOps) &&
        Objects.equals(this.readBytes, interfaceStats.readBytes) &&
        Objects.equals(this.readTimeTotal, interfaceStats.readTimeTotal) &&
        Objects.equals(this.readTimeMax, interfaceStats.readTimeMax) &&
        Objects.equals(this.writeOps, interfaceStats.writeOps) &&
        Objects.equals(this.writeBytes, interfaceStats.writeBytes) &&
        Objects.equals(this.writeTimeTotal, interfaceStats.writeTimeTotal) &&
        Objects.equals(this.writeTimeMax, interfaceStats.writeTimeMax) &&
        Objects.equals(this.otherOps, interfaceStats.otherOps) &&
        Objects.equals(this.otherTimeTotal, interfaceStats.otherTimeTotal) &&
        Objects.equals(this.otherTimeMax, interfaceStats.otherTimeMax) &&
        Objects.equals(this.readTimeTotalSq, interfaceStats.readTimeTotalSq) &&
        Objects.equals(this.writeTimeTotalSq, interfaceStats.writeTimeTotalSq) &&
        Objects.equals(this.otherTimeTotalSq, interfaceStats.otherTimeTotalSq) &&
        Objects.equals(this.queueDepthTotal, interfaceStats.queueDepthTotal) &&
        Objects.equals(this.queueDepthMax, interfaceStats.queueDepthMax) &&
        Objects.equals(this.channelErrorCounts, interfaceStats.channelErrorCounts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(observedTime, observedTimeInMS, lastResetTime, lastResetTimeInMS, interfaceId, arrayId, arrayWwn, channelType, channelNumber, readOps, readBytes, readTimeTotal, readTimeMax, writeOps, writeBytes, writeTimeTotal, writeTimeMax, otherOps, otherTimeTotal, otherTimeMax, readTimeTotalSq, writeTimeTotalSq, otherTimeTotalSq, queueDepthTotal, queueDepthMax, channelErrorCounts);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InterfaceStats {\n");
    
    sb.append("    observedTime: ").append(toIndentedString(observedTime)).append("\n");
    sb.append("    observedTimeInMS: ").append(toIndentedString(observedTimeInMS)).append("\n");
    sb.append("    lastResetTime: ").append(toIndentedString(lastResetTime)).append("\n");
    sb.append("    lastResetTimeInMS: ").append(toIndentedString(lastResetTimeInMS)).append("\n");
    sb.append("    interfaceId: ").append(toIndentedString(interfaceId)).append("\n");
    sb.append("    arrayId: ").append(toIndentedString(arrayId)).append("\n");
    sb.append("    arrayWwn: ").append(toIndentedString(arrayWwn)).append("\n");
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

