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
 * Statistics for storage system.
 */
@ApiModel(description = "Statistics for storage system.")
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2017-10-04T15:05:52.333-05:00")
public class AnalysedStorageSystemStatistics   {
  
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

    private String storageSystemId;

    private String storageSystemWWN;

    private String storageSystemName;

  
  /**
   * A timestamp representing when the data was collected
   **/
  public AnalysedStorageSystemStatistics observedTime(Date observedTime) {
    this.observedTime = observedTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "A timestamp representing when the data was collected")
  @JsonProperty("observedTime")
  public Date getObservedTime() {
    return observedTime;
  }
  
  public void setObservedTime(Date observedTime) {
    this.observedTime = observedTime;
  }

  
  /**
   * The time in which this data was polled and generated in milliseconds
   **/
  public AnalysedStorageSystemStatistics observedTimeInMS(Long observedTimeInMS) {
    this.observedTimeInMS = observedTimeInMS;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The time in which this data was polled and generated in milliseconds")
  @JsonProperty("observedTimeInMS")
  public Long getObservedTimeInMS() {
    return observedTimeInMS;
  }
  
  public void setObservedTimeInMS(Long observedTimeInMS) {
    this.observedTimeInMS = observedTimeInMS;
  }

  
  /**
   * Read operations per second.
   **/
  public AnalysedStorageSystemStatistics readIOps(Double readIOps) {
    this.readIOps = readIOps;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Read operations per second.")
  @JsonProperty("readIOps")
  public Double getReadIOps() {
    return readIOps;
  }
  
  public void setReadIOps(Double readIOps) {
    this.readIOps = readIOps;
  }

  
  /**
   * Write operations per second.
   **/
  public AnalysedStorageSystemStatistics writeIOps(Double writeIOps) {
    this.writeIOps = writeIOps;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Write operations per second.")
  @JsonProperty("writeIOps")
  public Double getWriteIOps() {
    return writeIOps;
  }
  
  public void setWriteIOps(Double writeIOps) {
    this.writeIOps = writeIOps;
  }

  
  /**
   * SCSI Operations to the disk that are not read/write operations. Example: Test Unit Ready.
   **/
  public AnalysedStorageSystemStatistics otherIOps(Double otherIOps) {
    this.otherIOps = otherIOps;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "SCSI Operations to the disk that are not read/write operations. Example: Test Unit Ready.")
  @JsonProperty("otherIOps")
  public Double getOtherIOps() {
    return otherIOps;
  }
  
  public void setOtherIOps(Double otherIOps) {
    this.otherIOps = otherIOps;
  }

  
  /**
   * All operations per second.
   **/
  public AnalysedStorageSystemStatistics combinedIOps(Double combinedIOps) {
    this.combinedIOps = combinedIOps;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "All operations per second.")
  @JsonProperty("combinedIOps")
  public Double getCombinedIOps() {
    return combinedIOps;
  }
  
  public void setCombinedIOps(Double combinedIOps) {
    this.combinedIOps = combinedIOps;
  }

  
  /**
   * Read throughput in MB/s.
   **/
  public AnalysedStorageSystemStatistics readThroughput(Double readThroughput) {
    this.readThroughput = readThroughput;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Read throughput in MB/s.")
  @JsonProperty("readThroughput")
  public Double getReadThroughput() {
    return readThroughput;
  }
  
  public void setReadThroughput(Double readThroughput) {
    this.readThroughput = readThroughput;
  }

  
  /**
   * Write throughput in MB/s.
   **/
  public AnalysedStorageSystemStatistics writeThroughput(Double writeThroughput) {
    this.writeThroughput = writeThroughput;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Write throughput in MB/s.")
  @JsonProperty("writeThroughput")
  public Double getWriteThroughput() {
    return writeThroughput;
  }
  
  public void setWriteThroughput(Double writeThroughput) {
    this.writeThroughput = writeThroughput;
  }

  
  /**
   * Combined read/write throughput in MB/s.
   **/
  public AnalysedStorageSystemStatistics combinedThroughput(Double combinedThroughput) {
    this.combinedThroughput = combinedThroughput;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Combined read/write throughput in MB/s.")
  @JsonProperty("combinedThroughput")
  public Double getCombinedThroughput() {
    return combinedThroughput;
  }
  
  public void setCombinedThroughput(Double combinedThroughput) {
    this.combinedThroughput = combinedThroughput;
  }

  
  /**
   * Read response time average in milliseconds.
   **/
  public AnalysedStorageSystemStatistics readResponseTime(Double readResponseTime) {
    this.readResponseTime = readResponseTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Read response time average in milliseconds.")
  @JsonProperty("readResponseTime")
  public Double getReadResponseTime() {
    return readResponseTime;
  }
  
  public void setReadResponseTime(Double readResponseTime) {
    this.readResponseTime = readResponseTime;
  }

  
  /**
   * Write response time average in milliseconds.
   **/
  public AnalysedStorageSystemStatistics writeResponseTime(Double writeResponseTime) {
    this.writeResponseTime = writeResponseTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Write response time average in milliseconds.")
  @JsonProperty("writeResponseTime")
  public Double getWriteResponseTime() {
    return writeResponseTime;
  }
  
  public void setWriteResponseTime(Double writeResponseTime) {
    this.writeResponseTime = writeResponseTime;
  }

  
  /**
   * Combined average response time in milliseconds.
   **/
  public AnalysedStorageSystemStatistics combinedResponseTime(Double combinedResponseTime) {
    this.combinedResponseTime = combinedResponseTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Combined average response time in milliseconds.")
  @JsonProperty("combinedResponseTime")
  public Double getCombinedResponseTime() {
    return combinedResponseTime;
  }
  
  public void setCombinedResponseTime(Double combinedResponseTime) {
    this.combinedResponseTime = combinedResponseTime;
  }

  
  /**
   * Average read operation size in bytes.
   **/
  public AnalysedStorageSystemStatistics averageReadOpSize(Double averageReadOpSize) {
    this.averageReadOpSize = averageReadOpSize;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Average read operation size in bytes.")
  @JsonProperty("averageReadOpSize")
  public Double getAverageReadOpSize() {
    return averageReadOpSize;
  }
  
  public void setAverageReadOpSize(Double averageReadOpSize) {
    this.averageReadOpSize = averageReadOpSize;
  }

  
  /**
   * Average write operation size in bytes.
   **/
  public AnalysedStorageSystemStatistics averageWriteOpSize(Double averageWriteOpSize) {
    this.averageWriteOpSize = averageWriteOpSize;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Average write operation size in bytes.")
  @JsonProperty("averageWriteOpSize")
  public Double getAverageWriteOpSize() {
    return averageWriteOpSize;
  }
  
  public void setAverageWriteOpSize(Double averageWriteOpSize) {
    this.averageWriteOpSize = averageWriteOpSize;
  }

  
  /**
   * The amount of read operations in this analysed interval.
   **/
  public AnalysedStorageSystemStatistics readOps(Double readOps) {
    this.readOps = readOps;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The amount of read operations in this analysed interval.")
  @JsonProperty("readOps")
  public Double getReadOps() {
    return readOps;
  }
  
  public void setReadOps(Double readOps) {
    this.readOps = readOps;
  }

  
  /**
   * The amount of write operations in this analysed interval.
   **/
  public AnalysedStorageSystemStatistics writeOps(Double writeOps) {
    this.writeOps = writeOps;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The amount of write operations in this analysed interval.")
  @JsonProperty("writeOps")
  public Double getWriteOps() {
    return writeOps;
  }
  
  public void setWriteOps(Double writeOps) {
    this.writeOps = writeOps;
  }

  
  /**
   * Physical read operations per second.
   **/
  public AnalysedStorageSystemStatistics readPhysicalIOps(Double readPhysicalIOps) {
    this.readPhysicalIOps = readPhysicalIOps;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Physical read operations per second.")
  @JsonProperty("readPhysicalIOps")
  public Double getReadPhysicalIOps() {
    return readPhysicalIOps;
  }
  
  public void setReadPhysicalIOps(Double readPhysicalIOps) {
    this.readPhysicalIOps = readPhysicalIOps;
  }

  
  /**
   * Physical write operations per second.
   **/
  public AnalysedStorageSystemStatistics writePhysicalIOps(Double writePhysicalIOps) {
    this.writePhysicalIOps = writePhysicalIOps;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Physical write operations per second.")
  @JsonProperty("writePhysicalIOps")
  public Double getWritePhysicalIOps() {
    return writePhysicalIOps;
  }
  
  public void setWritePhysicalIOps(Double writePhysicalIOps) {
    this.writePhysicalIOps = writePhysicalIOps;
  }

  
  /**
   **/
  public AnalysedStorageSystemStatistics storageSystemId(String storageSystemId) {
    this.storageSystemId = storageSystemId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("storageSystemId")
  public String getStorageSystemId() {
    return storageSystemId;
  }
  
  public void setStorageSystemId(String storageSystemId) {
    this.storageSystemId = storageSystemId;
  }

  
  /**
   **/
  public AnalysedStorageSystemStatistics storageSystemWWN(String storageSystemWWN) {
    this.storageSystemWWN = storageSystemWWN;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("storageSystemWWN")
  public String getStorageSystemWWN() {
    return storageSystemWWN;
  }
  
  public void setStorageSystemWWN(String storageSystemWWN) {
    this.storageSystemWWN = storageSystemWWN;
  }

  
  /**
   **/
  public AnalysedStorageSystemStatistics storageSystemName(String storageSystemName) {
    this.storageSystemName = storageSystemName;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("storageSystemName")
  public String getStorageSystemName() {
    return storageSystemName;
  }
  
  public void setStorageSystemName(String storageSystemName) {
    this.storageSystemName = storageSystemName;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AnalysedStorageSystemStatistics analysedStorageSystemStatistics = (AnalysedStorageSystemStatistics) o;
    return Objects.equals(this.observedTime, analysedStorageSystemStatistics.observedTime) &&
        Objects.equals(this.observedTimeInMS, analysedStorageSystemStatistics.observedTimeInMS) &&
        Objects.equals(this.readIOps, analysedStorageSystemStatistics.readIOps) &&
        Objects.equals(this.writeIOps, analysedStorageSystemStatistics.writeIOps) &&
        Objects.equals(this.otherIOps, analysedStorageSystemStatistics.otherIOps) &&
        Objects.equals(this.combinedIOps, analysedStorageSystemStatistics.combinedIOps) &&
        Objects.equals(this.readThroughput, analysedStorageSystemStatistics.readThroughput) &&
        Objects.equals(this.writeThroughput, analysedStorageSystemStatistics.writeThroughput) &&
        Objects.equals(this.combinedThroughput, analysedStorageSystemStatistics.combinedThroughput) &&
        Objects.equals(this.readResponseTime, analysedStorageSystemStatistics.readResponseTime) &&
        Objects.equals(this.writeResponseTime, analysedStorageSystemStatistics.writeResponseTime) &&
        Objects.equals(this.combinedResponseTime, analysedStorageSystemStatistics.combinedResponseTime) &&
        Objects.equals(this.averageReadOpSize, analysedStorageSystemStatistics.averageReadOpSize) &&
        Objects.equals(this.averageWriteOpSize, analysedStorageSystemStatistics.averageWriteOpSize) &&
        Objects.equals(this.readOps, analysedStorageSystemStatistics.readOps) &&
        Objects.equals(this.writeOps, analysedStorageSystemStatistics.writeOps) &&
        Objects.equals(this.readPhysicalIOps, analysedStorageSystemStatistics.readPhysicalIOps) &&
        Objects.equals(this.writePhysicalIOps, analysedStorageSystemStatistics.writePhysicalIOps) &&
        Objects.equals(this.storageSystemId, analysedStorageSystemStatistics.storageSystemId) &&
        Objects.equals(this.storageSystemWWN, analysedStorageSystemStatistics.storageSystemWWN) &&
        Objects.equals(this.storageSystemName, analysedStorageSystemStatistics.storageSystemName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(observedTime, observedTimeInMS, readIOps, writeIOps, otherIOps, combinedIOps, readThroughput, writeThroughput, combinedThroughput, readResponseTime, writeResponseTime, combinedResponseTime, averageReadOpSize, averageWriteOpSize, readOps, writeOps, readPhysicalIOps, writePhysicalIOps, storageSystemId, storageSystemWWN, storageSystemName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AnalysedStorageSystemStatistics {\n");
    
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
    sb.append("    storageSystemId: ").append(toIndentedString(storageSystemId)).append("\n");
    sb.append("    storageSystemWWN: ").append(toIndentedString(storageSystemWWN)).append("\n");
    sb.append("    storageSystemName: ").append(toIndentedString(storageSystemName)).append("\n");
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

