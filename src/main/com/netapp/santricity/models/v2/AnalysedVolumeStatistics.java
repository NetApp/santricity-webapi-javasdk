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
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2017-10-04T15:05:52.333-05:00")
public class AnalysedVolumeStatistics   {
  
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

    private String volumeId;

    private String volumeName;

    private String poolId;

    private String controllerId;

    private String workLoadId;

    private Boolean mapped;

    private Double readHitOps;

    private Double readHitBytes;

    private Double writeHitBytes;

    private Double writeHitOps;

    private Double readCacheUtilization;

    private Double writeCacheUtilization;

    private Double flashCacheReadHitOps;

    private Double flashCacheReadHitBytes;

    private Double flashCacheReadThroughput;

    private Double flashCacheReadResponseTime;

    private Double flashCacheHitPct;

    private Double readPhysicalIOps;

    private Double writePhysicalIOps;

    private Double queueDepthTotal;

    private Double queueDepthMax;

  
  /**
   * A timestamp representing when the data was collected
   **/
  public AnalysedVolumeStatistics observedTime(Date observedTime) {
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
  public AnalysedVolumeStatistics observedTimeInMS(Long observedTimeInMS) {
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
  public AnalysedVolumeStatistics readIOps(Double readIOps) {
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
  public AnalysedVolumeStatistics writeIOps(Double writeIOps) {
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
  public AnalysedVolumeStatistics otherIOps(Double otherIOps) {
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
  public AnalysedVolumeStatistics combinedIOps(Double combinedIOps) {
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
  public AnalysedVolumeStatistics readThroughput(Double readThroughput) {
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
  public AnalysedVolumeStatistics writeThroughput(Double writeThroughput) {
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
  public AnalysedVolumeStatistics combinedThroughput(Double combinedThroughput) {
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
  public AnalysedVolumeStatistics readResponseTime(Double readResponseTime) {
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
  public AnalysedVolumeStatistics writeResponseTime(Double writeResponseTime) {
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
  public AnalysedVolumeStatistics combinedResponseTime(Double combinedResponseTime) {
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
  public AnalysedVolumeStatistics averageReadOpSize(Double averageReadOpSize) {
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
  public AnalysedVolumeStatistics averageWriteOpSize(Double averageWriteOpSize) {
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
  public AnalysedVolumeStatistics readOps(Double readOps) {
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
  public AnalysedVolumeStatistics writeOps(Double writeOps) {
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
   **/
  public AnalysedVolumeStatistics volumeId(String volumeId) {
    this.volumeId = volumeId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("volumeId")
  public String getVolumeId() {
    return volumeId;
  }
  
  public void setVolumeId(String volumeId) {
    this.volumeId = volumeId;
  }

  
  /**
   **/
  public AnalysedVolumeStatistics volumeName(String volumeName) {
    this.volumeName = volumeName;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("volumeName")
  public String getVolumeName() {
    return volumeName;
  }
  
  public void setVolumeName(String volumeName) {
    this.volumeName = volumeName;
  }

  
  /**
   **/
  public AnalysedVolumeStatistics poolId(String poolId) {
    this.poolId = poolId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("poolId")
  public String getPoolId() {
    return poolId;
  }
  
  public void setPoolId(String poolId) {
    this.poolId = poolId;
  }

  
  /**
   **/
  public AnalysedVolumeStatistics controllerId(String controllerId) {
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

  
  /**
   **/
  public AnalysedVolumeStatistics workLoadId(String workLoadId) {
    this.workLoadId = workLoadId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("workLoadId")
  public String getWorkLoadId() {
    return workLoadId;
  }
  
  public void setWorkLoadId(String workLoadId) {
    this.workLoadId = workLoadId;
  }

  
  /**
   * True if the volume was mapped to a host at the point of data collection
   **/
  public AnalysedVolumeStatistics mapped(Boolean mapped) {
    this.mapped = mapped;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "True if the volume was mapped to a host at the point of data collection")
  @JsonProperty("mapped")
  public Boolean getMapped() {
    return mapped;
  }
  
  public void setMapped(Boolean mapped) {
    this.mapped = mapped;
  }

  
  /**
   * Number of read operations that hit cache
   **/
  public AnalysedVolumeStatistics readHitOps(Double readHitOps) {
    this.readHitOps = readHitOps;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Number of read operations that hit cache")
  @JsonProperty("readHitOps")
  public Double getReadHitOps() {
    return readHitOps;
  }
  
  public void setReadHitOps(Double readHitOps) {
    this.readHitOps = readHitOps;
  }

  
  /**
   * Number of bytes read from cache
   **/
  public AnalysedVolumeStatistics readHitBytes(Double readHitBytes) {
    this.readHitBytes = readHitBytes;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Number of bytes read from cache")
  @JsonProperty("readHitBytes")
  public Double getReadHitBytes() {
    return readHitBytes;
  }
  
  public void setReadHitBytes(Double readHitBytes) {
    this.readHitBytes = readHitBytes;
  }

  
  /**
   * Number of bytes written to cache
   **/
  public AnalysedVolumeStatistics writeHitBytes(Double writeHitBytes) {
    this.writeHitBytes = writeHitBytes;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Number of bytes written to cache")
  @JsonProperty("writeHitBytes")
  public Double getWriteHitBytes() {
    return writeHitBytes;
  }
  
  public void setWriteHitBytes(Double writeHitBytes) {
    this.writeHitBytes = writeHitBytes;
  }

  
  /**
   * Number of write operations that hit cache
   **/
  public AnalysedVolumeStatistics writeHitOps(Double writeHitOps) {
    this.writeHitOps = writeHitOps;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Number of write operations that hit cache")
  @JsonProperty("writeHitOps")
  public Double getWriteHitOps() {
    return writeHitOps;
  }
  
  public void setWriteHitOps(Double writeHitOps) {
    this.writeHitOps = writeHitOps;
  }

  
  /**
   * Percentage of bytes read from cache
   **/
  public AnalysedVolumeStatistics readCacheUtilization(Double readCacheUtilization) {
    this.readCacheUtilization = readCacheUtilization;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Percentage of bytes read from cache")
  @JsonProperty("readCacheUtilization")
  public Double getReadCacheUtilization() {
    return readCacheUtilization;
  }
  
  public void setReadCacheUtilization(Double readCacheUtilization) {
    this.readCacheUtilization = readCacheUtilization;
  }

  
  /**
   * Percentage of bytes written to cache
   **/
  public AnalysedVolumeStatistics writeCacheUtilization(Double writeCacheUtilization) {
    this.writeCacheUtilization = writeCacheUtilization;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Percentage of bytes written to cache")
  @JsonProperty("writeCacheUtilization")
  public Double getWriteCacheUtilization() {
    return writeCacheUtilization;
  }
  
  public void setWriteCacheUtilization(Double writeCacheUtilization) {
    this.writeCacheUtilization = writeCacheUtilization;
  }

  
  /**
   * Number of read operations that hit cache
   **/
  public AnalysedVolumeStatistics flashCacheReadHitOps(Double flashCacheReadHitOps) {
    this.flashCacheReadHitOps = flashCacheReadHitOps;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Number of read operations that hit cache")
  @JsonProperty("flashCacheReadHitOps")
  public Double getFlashCacheReadHitOps() {
    return flashCacheReadHitOps;
  }
  
  public void setFlashCacheReadHitOps(Double flashCacheReadHitOps) {
    this.flashCacheReadHitOps = flashCacheReadHitOps;
  }

  
  /**
   * Number of bytes read from cache
   **/
  public AnalysedVolumeStatistics flashCacheReadHitBytes(Double flashCacheReadHitBytes) {
    this.flashCacheReadHitBytes = flashCacheReadHitBytes;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Number of bytes read from cache")
  @JsonProperty("flashCacheReadHitBytes")
  public Double getFlashCacheReadHitBytes() {
    return flashCacheReadHitBytes;
  }
  
  public void setFlashCacheReadHitBytes(Double flashCacheReadHitBytes) {
    this.flashCacheReadHitBytes = flashCacheReadHitBytes;
  }

  
  /**
   **/
  public AnalysedVolumeStatistics flashCacheReadThroughput(Double flashCacheReadThroughput) {
    this.flashCacheReadThroughput = flashCacheReadThroughput;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("flashCacheReadThroughput")
  public Double getFlashCacheReadThroughput() {
    return flashCacheReadThroughput;
  }
  
  public void setFlashCacheReadThroughput(Double flashCacheReadThroughput) {
    this.flashCacheReadThroughput = flashCacheReadThroughput;
  }

  
  /**
   **/
  public AnalysedVolumeStatistics flashCacheReadResponseTime(Double flashCacheReadResponseTime) {
    this.flashCacheReadResponseTime = flashCacheReadResponseTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("flashCacheReadResponseTime")
  public Double getFlashCacheReadResponseTime() {
    return flashCacheReadResponseTime;
  }
  
  public void setFlashCacheReadResponseTime(Double flashCacheReadResponseTime) {
    this.flashCacheReadResponseTime = flashCacheReadResponseTime;
  }

  
  /**
   **/
  public AnalysedVolumeStatistics flashCacheHitPct(Double flashCacheHitPct) {
    this.flashCacheHitPct = flashCacheHitPct;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("flashCacheHitPct")
  public Double getFlashCacheHitPct() {
    return flashCacheHitPct;
  }
  
  public void setFlashCacheHitPct(Double flashCacheHitPct) {
    this.flashCacheHitPct = flashCacheHitPct;
  }

  
  /**
   * read_physical_iops double NOT NULL
   **/
  public AnalysedVolumeStatistics readPhysicalIOps(Double readPhysicalIOps) {
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
  public AnalysedVolumeStatistics writePhysicalIOps(Double writePhysicalIOps) {
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
   * Total channel queue depth.
   **/
  public AnalysedVolumeStatistics queueDepthTotal(Double queueDepthTotal) {
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
  public AnalysedVolumeStatistics queueDepthMax(Double queueDepthMax) {
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

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AnalysedVolumeStatistics analysedVolumeStatistics = (AnalysedVolumeStatistics) o;
    return Objects.equals(this.observedTime, analysedVolumeStatistics.observedTime) &&
        Objects.equals(this.observedTimeInMS, analysedVolumeStatistics.observedTimeInMS) &&
        Objects.equals(this.readIOps, analysedVolumeStatistics.readIOps) &&
        Objects.equals(this.writeIOps, analysedVolumeStatistics.writeIOps) &&
        Objects.equals(this.otherIOps, analysedVolumeStatistics.otherIOps) &&
        Objects.equals(this.combinedIOps, analysedVolumeStatistics.combinedIOps) &&
        Objects.equals(this.readThroughput, analysedVolumeStatistics.readThroughput) &&
        Objects.equals(this.writeThroughput, analysedVolumeStatistics.writeThroughput) &&
        Objects.equals(this.combinedThroughput, analysedVolumeStatistics.combinedThroughput) &&
        Objects.equals(this.readResponseTime, analysedVolumeStatistics.readResponseTime) &&
        Objects.equals(this.writeResponseTime, analysedVolumeStatistics.writeResponseTime) &&
        Objects.equals(this.combinedResponseTime, analysedVolumeStatistics.combinedResponseTime) &&
        Objects.equals(this.averageReadOpSize, analysedVolumeStatistics.averageReadOpSize) &&
        Objects.equals(this.averageWriteOpSize, analysedVolumeStatistics.averageWriteOpSize) &&
        Objects.equals(this.readOps, analysedVolumeStatistics.readOps) &&
        Objects.equals(this.writeOps, analysedVolumeStatistics.writeOps) &&
        Objects.equals(this.volumeId, analysedVolumeStatistics.volumeId) &&
        Objects.equals(this.volumeName, analysedVolumeStatistics.volumeName) &&
        Objects.equals(this.poolId, analysedVolumeStatistics.poolId) &&
        Objects.equals(this.controllerId, analysedVolumeStatistics.controllerId) &&
        Objects.equals(this.workLoadId, analysedVolumeStatistics.workLoadId) &&
        Objects.equals(this.mapped, analysedVolumeStatistics.mapped) &&
        Objects.equals(this.readHitOps, analysedVolumeStatistics.readHitOps) &&
        Objects.equals(this.readHitBytes, analysedVolumeStatistics.readHitBytes) &&
        Objects.equals(this.writeHitBytes, analysedVolumeStatistics.writeHitBytes) &&
        Objects.equals(this.writeHitOps, analysedVolumeStatistics.writeHitOps) &&
        Objects.equals(this.readCacheUtilization, analysedVolumeStatistics.readCacheUtilization) &&
        Objects.equals(this.writeCacheUtilization, analysedVolumeStatistics.writeCacheUtilization) &&
        Objects.equals(this.flashCacheReadHitOps, analysedVolumeStatistics.flashCacheReadHitOps) &&
        Objects.equals(this.flashCacheReadHitBytes, analysedVolumeStatistics.flashCacheReadHitBytes) &&
        Objects.equals(this.flashCacheReadThroughput, analysedVolumeStatistics.flashCacheReadThroughput) &&
        Objects.equals(this.flashCacheReadResponseTime, analysedVolumeStatistics.flashCacheReadResponseTime) &&
        Objects.equals(this.flashCacheHitPct, analysedVolumeStatistics.flashCacheHitPct) &&
        Objects.equals(this.readPhysicalIOps, analysedVolumeStatistics.readPhysicalIOps) &&
        Objects.equals(this.writePhysicalIOps, analysedVolumeStatistics.writePhysicalIOps) &&
        Objects.equals(this.queueDepthTotal, analysedVolumeStatistics.queueDepthTotal) &&
        Objects.equals(this.queueDepthMax, analysedVolumeStatistics.queueDepthMax);
  }

  @Override
  public int hashCode() {
    return Objects.hash(observedTime, observedTimeInMS, readIOps, writeIOps, otherIOps, combinedIOps, readThroughput, writeThroughput, combinedThroughput, readResponseTime, writeResponseTime, combinedResponseTime, averageReadOpSize, averageWriteOpSize, readOps, writeOps, volumeId, volumeName, poolId, controllerId, workLoadId, mapped, readHitOps, readHitBytes, writeHitBytes, writeHitOps, readCacheUtilization, writeCacheUtilization, flashCacheReadHitOps, flashCacheReadHitBytes, flashCacheReadThroughput, flashCacheReadResponseTime, flashCacheHitPct, readPhysicalIOps, writePhysicalIOps, queueDepthTotal, queueDepthMax);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AnalysedVolumeStatistics {\n");
    
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
    sb.append("    volumeId: ").append(toIndentedString(volumeId)).append("\n");
    sb.append("    volumeName: ").append(toIndentedString(volumeName)).append("\n");
    sb.append("    poolId: ").append(toIndentedString(poolId)).append("\n");
    sb.append("    controllerId: ").append(toIndentedString(controllerId)).append("\n");
    sb.append("    workLoadId: ").append(toIndentedString(workLoadId)).append("\n");
    sb.append("    mapped: ").append(toIndentedString(mapped)).append("\n");
    sb.append("    readHitOps: ").append(toIndentedString(readHitOps)).append("\n");
    sb.append("    readHitBytes: ").append(toIndentedString(readHitBytes)).append("\n");
    sb.append("    writeHitBytes: ").append(toIndentedString(writeHitBytes)).append("\n");
    sb.append("    writeHitOps: ").append(toIndentedString(writeHitOps)).append("\n");
    sb.append("    readCacheUtilization: ").append(toIndentedString(readCacheUtilization)).append("\n");
    sb.append("    writeCacheUtilization: ").append(toIndentedString(writeCacheUtilization)).append("\n");
    sb.append("    flashCacheReadHitOps: ").append(toIndentedString(flashCacheReadHitOps)).append("\n");
    sb.append("    flashCacheReadHitBytes: ").append(toIndentedString(flashCacheReadHitBytes)).append("\n");
    sb.append("    flashCacheReadThroughput: ").append(toIndentedString(flashCacheReadThroughput)).append("\n");
    sb.append("    flashCacheReadResponseTime: ").append(toIndentedString(flashCacheReadResponseTime)).append("\n");
    sb.append("    flashCacheHitPct: ").append(toIndentedString(flashCacheHitPct)).append("\n");
    sb.append("    readPhysicalIOps: ").append(toIndentedString(readPhysicalIOps)).append("\n");
    sb.append("    writePhysicalIOps: ").append(toIndentedString(writePhysicalIOps)).append("\n");
    sb.append("    queueDepthTotal: ").append(toIndentedString(queueDepthTotal)).append("\n");
    sb.append("    queueDepthMax: ").append(toIndentedString(queueDepthMax)).append("\n");
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

