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
 * Volume statistics for storage system.
 */
@ApiModel(description = "Volume statistics for storage system.")
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2016-08-12T15:32:41.671-05:00")
public class AnalysedControllerStatistics   {
  
    private Date observedTime;

    private Long observedTimeInMS;

    private Double readIOps;

    private Double writeIOps;

    private Double otherIOps;

    private Double combinedIOps;

    private Double readThroughput;

    private Double writeThroughput;

    private Double combinedThroughput;

    private Double readResponseTime;

    private Double writeResponseTime;

    private Double combinedResponseTime;

    private Double averageReadOpSize;

    private Double averageWriteOpSize;

    private Double readOps;

    private Double writeOps;

    private Double readPhysicalIOps;

    private Double writePhysicalIOps;

    private String controllerId;

  
  /**
   **/
  public AnalysedControllerStatistics observedTime(Date observedTime) {
    this.observedTime = observedTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("observedTime")
  public Date getObservedTime() {
    return observedTime;
  }
  
  public void setObservedTime(Date observedTime) {
    this.observedTime = observedTime;
  }

  
  /**
   **/
  public AnalysedControllerStatistics observedTimeInMS(Long observedTimeInMS) {
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
   * read_iops double NOT NULL
   **/
  public AnalysedControllerStatistics readIOps(Double readIOps) {
    this.readIOps = readIOps;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "read_iops double NOT NULL")
  @JsonProperty("readIOps")
  public Double getReadIOps() {
    return readIOps;
  }
  
  public void setReadIOps(Double readIOps) {
    this.readIOps = readIOps;
  }

  
  /**
   * write_iops double NOT NULL
   **/
  public AnalysedControllerStatistics writeIOps(Double writeIOps) {
    this.writeIOps = writeIOps;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "write_iops double NOT NULL")
  @JsonProperty("writeIOps")
  public Double getWriteIOps() {
    return writeIOps;
  }
  
  public void setWriteIOps(Double writeIOps) {
    this.writeIOps = writeIOps;
  }

  
  /**
   * other_iops double NOT NULL
   **/
  public AnalysedControllerStatistics otherIOps(Double otherIOps) {
    this.otherIOps = otherIOps;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "other_iops double NOT NULL")
  @JsonProperty("otherIOps")
  public Double getOtherIOps() {
    return otherIOps;
  }
  
  public void setOtherIOps(Double otherIOps) {
    this.otherIOps = otherIOps;
  }

  
  /**
   * combined_iops double NOT NULL
   **/
  public AnalysedControllerStatistics combinedIOps(Double combinedIOps) {
    this.combinedIOps = combinedIOps;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "combined_iops double NOT NULL")
  @JsonProperty("combinedIOps")
  public Double getCombinedIOps() {
    return combinedIOps;
  }
  
  public void setCombinedIOps(Double combinedIOps) {
    this.combinedIOps = combinedIOps;
  }

  
  /**
   * read_throughput double NOT NULL
   **/
  public AnalysedControllerStatistics readThroughput(Double readThroughput) {
    this.readThroughput = readThroughput;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "read_throughput double NOT NULL")
  @JsonProperty("readThroughput")
  public Double getReadThroughput() {
    return readThroughput;
  }
  
  public void setReadThroughput(Double readThroughput) {
    this.readThroughput = readThroughput;
  }

  
  /**
   * write_throughput double NOT NULL
   **/
  public AnalysedControllerStatistics writeThroughput(Double writeThroughput) {
    this.writeThroughput = writeThroughput;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "write_throughput double NOT NULL")
  @JsonProperty("writeThroughput")
  public Double getWriteThroughput() {
    return writeThroughput;
  }
  
  public void setWriteThroughput(Double writeThroughput) {
    this.writeThroughput = writeThroughput;
  }

  
  /**
   * combined_throughput double NOT NULL
   **/
  public AnalysedControllerStatistics combinedThroughput(Double combinedThroughput) {
    this.combinedThroughput = combinedThroughput;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "combined_throughput double NOT NULL")
  @JsonProperty("combinedThroughput")
  public Double getCombinedThroughput() {
    return combinedThroughput;
  }
  
  public void setCombinedThroughput(Double combinedThroughput) {
    this.combinedThroughput = combinedThroughput;
  }

  
  /**
   * read_response_time double NOT NULL
   **/
  public AnalysedControllerStatistics readResponseTime(Double readResponseTime) {
    this.readResponseTime = readResponseTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "read_response_time double NOT NULL")
  @JsonProperty("readResponseTime")
  public Double getReadResponseTime() {
    return readResponseTime;
  }
  
  public void setReadResponseTime(Double readResponseTime) {
    this.readResponseTime = readResponseTime;
  }

  
  /**
   * write_response_time double NOT NULL
   **/
  public AnalysedControllerStatistics writeResponseTime(Double writeResponseTime) {
    this.writeResponseTime = writeResponseTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "write_response_time double NOT NULL")
  @JsonProperty("writeResponseTime")
  public Double getWriteResponseTime() {
    return writeResponseTime;
  }
  
  public void setWriteResponseTime(Double writeResponseTime) {
    this.writeResponseTime = writeResponseTime;
  }

  
  /**
   * combined_response_time double NOT NULL
   **/
  public AnalysedControllerStatistics combinedResponseTime(Double combinedResponseTime) {
    this.combinedResponseTime = combinedResponseTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "combined_response_time double NOT NULL")
  @JsonProperty("combinedResponseTime")
  public Double getCombinedResponseTime() {
    return combinedResponseTime;
  }
  
  public void setCombinedResponseTime(Double combinedResponseTime) {
    this.combinedResponseTime = combinedResponseTime;
  }

  
  /**
   **/
  public AnalysedControllerStatistics averageReadOpSize(Double averageReadOpSize) {
    this.averageReadOpSize = averageReadOpSize;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("averageReadOpSize")
  public Double getAverageReadOpSize() {
    return averageReadOpSize;
  }
  
  public void setAverageReadOpSize(Double averageReadOpSize) {
    this.averageReadOpSize = averageReadOpSize;
  }

  
  /**
   **/
  public AnalysedControllerStatistics averageWriteOpSize(Double averageWriteOpSize) {
    this.averageWriteOpSize = averageWriteOpSize;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("averageWriteOpSize")
  public Double getAverageWriteOpSize() {
    return averageWriteOpSize;
  }
  
  public void setAverageWriteOpSize(Double averageWriteOpSize) {
    this.averageWriteOpSize = averageWriteOpSize;
  }

  
  /**
   **/
  public AnalysedControllerStatistics readOps(Double readOps) {
    this.readOps = readOps;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("readOps")
  public Double getReadOps() {
    return readOps;
  }
  
  public void setReadOps(Double readOps) {
    this.readOps = readOps;
  }

  
  /**
   **/
  public AnalysedControllerStatistics writeOps(Double writeOps) {
    this.writeOps = writeOps;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("writeOps")
  public Double getWriteOps() {
    return writeOps;
  }
  
  public void setWriteOps(Double writeOps) {
    this.writeOps = writeOps;
  }

  
  /**
   * read_physical_iops double NOT NULL
   **/
  public AnalysedControllerStatistics readPhysicalIOps(Double readPhysicalIOps) {
    this.readPhysicalIOps = readPhysicalIOps;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "read_physical_iops double NOT NULL")
  @JsonProperty("readPhysicalIOps")
  public Double getReadPhysicalIOps() {
    return readPhysicalIOps;
  }
  
  public void setReadPhysicalIOps(Double readPhysicalIOps) {
    this.readPhysicalIOps = readPhysicalIOps;
  }

  
  /**
   * write_physical_iops double NOT NULL
   **/
  public AnalysedControllerStatistics writePhysicalIOps(Double writePhysicalIOps) {
    this.writePhysicalIOps = writePhysicalIOps;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "write_physical_iops double NOT NULL")
  @JsonProperty("writePhysicalIOps")
  public Double getWritePhysicalIOps() {
    return writePhysicalIOps;
  }
  
  public void setWritePhysicalIOps(Double writePhysicalIOps) {
    this.writePhysicalIOps = writePhysicalIOps;
  }

  
  /**
   **/
  public AnalysedControllerStatistics controllerId(String controllerId) {
    this.controllerId = controllerId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("controllerId")
  public String getControllerId() {
    return controllerId;
  }
  
  public void setControllerId(String controllerId) {
    this.controllerId = controllerId;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AnalysedControllerStatistics analysedControllerStatistics = (AnalysedControllerStatistics) o;
    return Objects.equals(this.observedTime, analysedControllerStatistics.observedTime) &&
        Objects.equals(this.observedTimeInMS, analysedControllerStatistics.observedTimeInMS) &&
        Objects.equals(this.readIOps, analysedControllerStatistics.readIOps) &&
        Objects.equals(this.writeIOps, analysedControllerStatistics.writeIOps) &&
        Objects.equals(this.otherIOps, analysedControllerStatistics.otherIOps) &&
        Objects.equals(this.combinedIOps, analysedControllerStatistics.combinedIOps) &&
        Objects.equals(this.readThroughput, analysedControllerStatistics.readThroughput) &&
        Objects.equals(this.writeThroughput, analysedControllerStatistics.writeThroughput) &&
        Objects.equals(this.combinedThroughput, analysedControllerStatistics.combinedThroughput) &&
        Objects.equals(this.readResponseTime, analysedControllerStatistics.readResponseTime) &&
        Objects.equals(this.writeResponseTime, analysedControllerStatistics.writeResponseTime) &&
        Objects.equals(this.combinedResponseTime, analysedControllerStatistics.combinedResponseTime) &&
        Objects.equals(this.averageReadOpSize, analysedControllerStatistics.averageReadOpSize) &&
        Objects.equals(this.averageWriteOpSize, analysedControllerStatistics.averageWriteOpSize) &&
        Objects.equals(this.readOps, analysedControllerStatistics.readOps) &&
        Objects.equals(this.writeOps, analysedControllerStatistics.writeOps) &&
        Objects.equals(this.readPhysicalIOps, analysedControllerStatistics.readPhysicalIOps) &&
        Objects.equals(this.writePhysicalIOps, analysedControllerStatistics.writePhysicalIOps) &&
        Objects.equals(this.controllerId, analysedControllerStatistics.controllerId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(observedTime, observedTimeInMS, readIOps, writeIOps, otherIOps, combinedIOps, readThroughput, writeThroughput, combinedThroughput, readResponseTime, writeResponseTime, combinedResponseTime, averageReadOpSize, averageWriteOpSize, readOps, writeOps, readPhysicalIOps, writePhysicalIOps, controllerId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AnalysedControllerStatistics {\n");
    
    sb.append("    observedTime: ").append(toIndentedString(observedTime)).append("\n");
    sb.append("    observedTimeInMS: ").append(toIndentedString(observedTimeInMS)).append("\n");
    sb.append("    readIOps: ").append(toIndentedString(readIOps)).append("\n");
    sb.append("    writeIOps: ").append(toIndentedString(writeIOps)).append("\n");
    sb.append("    otherIOps: ").append(toIndentedString(otherIOps)).append("\n");
    sb.append("    combinedIOps: ").append(toIndentedString(combinedIOps)).append("\n");
    sb.append("    readThroughput: ").append(toIndentedString(readThroughput)).append("\n");
    sb.append("    writeThroughput: ").append(toIndentedString(writeThroughput)).append("\n");
    sb.append("    combinedThroughput: ").append(toIndentedString(combinedThroughput)).append("\n");
    sb.append("    readResponseTime: ").append(toIndentedString(readResponseTime)).append("\n");
    sb.append("    writeResponseTime: ").append(toIndentedString(writeResponseTime)).append("\n");
    sb.append("    combinedResponseTime: ").append(toIndentedString(combinedResponseTime)).append("\n");
    sb.append("    averageReadOpSize: ").append(toIndentedString(averageReadOpSize)).append("\n");
    sb.append("    averageWriteOpSize: ").append(toIndentedString(averageWriteOpSize)).append("\n");
    sb.append("    readOps: ").append(toIndentedString(readOps)).append("\n");
    sb.append("    writeOps: ").append(toIndentedString(writeOps)).append("\n");
    sb.append("    readPhysicalIOps: ").append(toIndentedString(readPhysicalIOps)).append("\n");
    sb.append("    writePhysicalIOps: ").append(toIndentedString(writePhysicalIOps)).append("\n");
    sb.append("    controllerId: ").append(toIndentedString(controllerId)).append("\n");
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

