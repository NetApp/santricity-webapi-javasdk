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
 * Disk statistics for storage system.
 */
@ApiModel(description = "Disk statistics for storage system.")
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2017-10-04T15:05:52.333-05:00")
public class AnalysedDiskStatistics   {
  
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

    private String diskId;

    private Double readPhysicalIOps;

    private Double writePhysicalIOps;

  
  /**
   * A timestamp representing when the data was collected
   **/
  public AnalysedDiskStatistics observedTime(Date observedTime) {
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
  public AnalysedDiskStatistics observedTimeInMS(Long observedTimeInMS) {
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
  public AnalysedDiskStatistics readIOps(Double readIOps) {
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
  public AnalysedDiskStatistics writeIOps(Double writeIOps) {
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
  public AnalysedDiskStatistics otherIOps(Double otherIOps) {
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
  public AnalysedDiskStatistics combinedIOps(Double combinedIOps) {
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
  public AnalysedDiskStatistics readThroughput(Double readThroughput) {
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
  public AnalysedDiskStatistics writeThroughput(Double writeThroughput) {
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
  public AnalysedDiskStatistics combinedThroughput(Double combinedThroughput) {
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
  public AnalysedDiskStatistics readResponseTime(Double readResponseTime) {
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
  public AnalysedDiskStatistics writeResponseTime(Double writeResponseTime) {
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
  public AnalysedDiskStatistics combinedResponseTime(Double combinedResponseTime) {
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
  public AnalysedDiskStatistics averageReadOpSize(Double averageReadOpSize) {
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
  public AnalysedDiskStatistics averageWriteOpSize(Double averageWriteOpSize) {
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
  public AnalysedDiskStatistics readOps(Double readOps) {
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
  public AnalysedDiskStatistics writeOps(Double writeOps) {
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
   * Id for the disk
   **/
  public AnalysedDiskStatistics diskId(String diskId) {
    this.diskId = diskId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Id for the disk")
  @JsonProperty("diskId")
  public String getDiskId() {
    return diskId;
  }
  
  public void setDiskId(String diskId) {
    this.diskId = diskId;
  }

  
  /**
   * Physical read operations per second.
   **/
  public AnalysedDiskStatistics readPhysicalIOps(Double readPhysicalIOps) {
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
  public AnalysedDiskStatistics writePhysicalIOps(Double writePhysicalIOps) {
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

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AnalysedDiskStatistics analysedDiskStatistics = (AnalysedDiskStatistics) o;
    return Objects.equals(this.observedTime, analysedDiskStatistics.observedTime) &&
        Objects.equals(this.observedTimeInMS, analysedDiskStatistics.observedTimeInMS) &&
        Objects.equals(this.readIOps, analysedDiskStatistics.readIOps) &&
        Objects.equals(this.writeIOps, analysedDiskStatistics.writeIOps) &&
        Objects.equals(this.otherIOps, analysedDiskStatistics.otherIOps) &&
        Objects.equals(this.combinedIOps, analysedDiskStatistics.combinedIOps) &&
        Objects.equals(this.readThroughput, analysedDiskStatistics.readThroughput) &&
        Objects.equals(this.writeThroughput, analysedDiskStatistics.writeThroughput) &&
        Objects.equals(this.combinedThroughput, analysedDiskStatistics.combinedThroughput) &&
        Objects.equals(this.readResponseTime, analysedDiskStatistics.readResponseTime) &&
        Objects.equals(this.writeResponseTime, analysedDiskStatistics.writeResponseTime) &&
        Objects.equals(this.combinedResponseTime, analysedDiskStatistics.combinedResponseTime) &&
        Objects.equals(this.averageReadOpSize, analysedDiskStatistics.averageReadOpSize) &&
        Objects.equals(this.averageWriteOpSize, analysedDiskStatistics.averageWriteOpSize) &&
        Objects.equals(this.readOps, analysedDiskStatistics.readOps) &&
        Objects.equals(this.writeOps, analysedDiskStatistics.writeOps) &&
        Objects.equals(this.diskId, analysedDiskStatistics.diskId) &&
        Objects.equals(this.readPhysicalIOps, analysedDiskStatistics.readPhysicalIOps) &&
        Objects.equals(this.writePhysicalIOps, analysedDiskStatistics.writePhysicalIOps);
  }

  @Override
  public int hashCode() {
    return Objects.hash(observedTime, observedTimeInMS, readIOps, writeIOps, otherIOps, combinedIOps, readThroughput, writeThroughput, combinedThroughput, readResponseTime, writeResponseTime, combinedResponseTime, averageReadOpSize, averageWriteOpSize, readOps, writeOps, diskId, readPhysicalIOps, writePhysicalIOps);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AnalysedDiskStatistics {\n");
    
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
    sb.append("    diskId: ").append(toIndentedString(diskId)).append("\n");
    sb.append("    readPhysicalIOps: ").append(toIndentedString(readPhysicalIOps)).append("\n");
    sb.append("    writePhysicalIOps: ").append(toIndentedString(writePhysicalIOps)).append("\n");
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

