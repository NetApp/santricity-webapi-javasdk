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
 * Aggregation of volume statistics for a workload.
 */
@ApiModel(description = "Aggregation of volume statistics for a workload.")
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2017-10-04T15:05:52.333-05:00")
public class WorkloadStatistics   {
  
    private Date observedTime;

    private Long observedTimeInMS;

    private Date lastResetTime;

    private Long lastResetTimeInMS;

    private String arrayId;

    private String arrayWwn;

    private String memberIdsHash;

    private Double readOps;

    private Double readHitOps;

    private Double readHitBytes;

    private Double readTimeTotal;

    private Double readHitTimeTotal;

    private Double writeOps;

    private Double writeTimeTotal;

    private Double writeHitTimeTotal;

    private Double errRedundancyChkIndeterminateReads;

    private Double errRedundancyChkRecoveredReads;

    private Double errRedundancyChkUnrecoveredReads;

    private Double idleTime;

    private Double otherOps;

    private Double otherTimeMax;

    private Double otherTimeTotal;

    private Double readBytes;

    private Double readHitTimeMax;

    private Double readTimeMax;

    private Double writeBytes;

    private Double writeHitBytes;

    private Double writeHitOps;

    private Double writeHitTimeMax;

    private Double writeTimeMax;

    private Double queueDepthTotal;

    private Double queueDepthMax;

    private Double flashCacheReadHitOps;

    private Double flashCacheReadHitBytes;

    private Double flashCacheReadHitTimeTotal;

    private Double flashCacheReadHitTimeMax;

    private String workloadId;

  
  /**
   * End time for this collection as measured by the number of seconds since baseTime.
   **/
  public WorkloadStatistics observedTime(Date observedTime) {
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
  public WorkloadStatistics observedTimeInMS(Long observedTimeInMS) {
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
  public WorkloadStatistics lastResetTime(Date lastResetTime) {
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
  public WorkloadStatistics lastResetTimeInMS(Long lastResetTimeInMS) {
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
   **/
  public WorkloadStatistics arrayId(String arrayId) {
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
  public WorkloadStatistics arrayWwn(String arrayWwn) {
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
   * Hash of member volume ids.
   **/
  public WorkloadStatistics memberIdsHash(String memberIdsHash) {
    this.memberIdsHash = memberIdsHash;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Hash of member volume ids.")
  @JsonProperty("memberIdsHash")
  public String getMemberIdsHash() {
    return memberIdsHash;
  }
  
  public void setMemberIdsHash(String memberIdsHash) {
    this.memberIdsHash = memberIdsHash;
  }

  
  /**
   * Number of read operations
   **/
  public WorkloadStatistics readOps(Double readOps) {
    this.readOps = readOps;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Number of read operations")
  @JsonProperty("readOps")
  public Double getReadOps() {
    return readOps;
  }
  
  public void setReadOps(Double readOps) {
    this.readOps = readOps;
  }

  
  /**
   * Number of read operations that hit cache
   **/
  public WorkloadStatistics readHitOps(Double readHitOps) {
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
  public WorkloadStatistics readHitBytes(Double readHitBytes) {
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
   **/
  public WorkloadStatistics readTimeTotal(Double readTimeTotal) {
    this.readTimeTotal = readTimeTotal;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("readTimeTotal")
  public Double getReadTimeTotal() {
    return readTimeTotal;
  }
  
  public void setReadTimeTotal(Double readTimeTotal) {
    this.readTimeTotal = readTimeTotal;
  }

  
  /**
   **/
  public WorkloadStatistics readHitTimeTotal(Double readHitTimeTotal) {
    this.readHitTimeTotal = readHitTimeTotal;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("readHitTimeTotal")
  public Double getReadHitTimeTotal() {
    return readHitTimeTotal;
  }
  
  public void setReadHitTimeTotal(Double readHitTimeTotal) {
    this.readHitTimeTotal = readHitTimeTotal;
  }

  
  /**
   * Number of write operations
   **/
  public WorkloadStatistics writeOps(Double writeOps) {
    this.writeOps = writeOps;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Number of write operations")
  @JsonProperty("writeOps")
  public Double getWriteOps() {
    return writeOps;
  }
  
  public void setWriteOps(Double writeOps) {
    this.writeOps = writeOps;
  }

  
  /**
   **/
  public WorkloadStatistics writeTimeTotal(Double writeTimeTotal) {
    this.writeTimeTotal = writeTimeTotal;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("writeTimeTotal")
  public Double getWriteTimeTotal() {
    return writeTimeTotal;
  }
  
  public void setWriteTimeTotal(Double writeTimeTotal) {
    this.writeTimeTotal = writeTimeTotal;
  }

  
  /**
   **/
  public WorkloadStatistics writeHitTimeTotal(Double writeHitTimeTotal) {
    this.writeHitTimeTotal = writeHitTimeTotal;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("writeHitTimeTotal")
  public Double getWriteHitTimeTotal() {
    return writeHitTimeTotal;
  }
  
  public void setWriteHitTimeTotal(Double writeHitTimeTotal) {
    this.writeHitTimeTotal = writeHitTimeTotal;
  }

  
  /**
   **/
  public WorkloadStatistics errRedundancyChkIndeterminateReads(Double errRedundancyChkIndeterminateReads) {
    this.errRedundancyChkIndeterminateReads = errRedundancyChkIndeterminateReads;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("errRedundancyChkIndeterminateReads")
  public Double getErrRedundancyChkIndeterminateReads() {
    return errRedundancyChkIndeterminateReads;
  }
  
  public void setErrRedundancyChkIndeterminateReads(Double errRedundancyChkIndeterminateReads) {
    this.errRedundancyChkIndeterminateReads = errRedundancyChkIndeterminateReads;
  }

  
  /**
   **/
  public WorkloadStatistics errRedundancyChkRecoveredReads(Double errRedundancyChkRecoveredReads) {
    this.errRedundancyChkRecoveredReads = errRedundancyChkRecoveredReads;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("errRedundancyChkRecoveredReads")
  public Double getErrRedundancyChkRecoveredReads() {
    return errRedundancyChkRecoveredReads;
  }
  
  public void setErrRedundancyChkRecoveredReads(Double errRedundancyChkRecoveredReads) {
    this.errRedundancyChkRecoveredReads = errRedundancyChkRecoveredReads;
  }

  
  /**
   **/
  public WorkloadStatistics errRedundancyChkUnrecoveredReads(Double errRedundancyChkUnrecoveredReads) {
    this.errRedundancyChkUnrecoveredReads = errRedundancyChkUnrecoveredReads;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("errRedundancyChkUnrecoveredReads")
  public Double getErrRedundancyChkUnrecoveredReads() {
    return errRedundancyChkUnrecoveredReads;
  }
  
  public void setErrRedundancyChkUnrecoveredReads(Double errRedundancyChkUnrecoveredReads) {
    this.errRedundancyChkUnrecoveredReads = errRedundancyChkUnrecoveredReads;
  }

  
  /**
   **/
  public WorkloadStatistics idleTime(Double idleTime) {
    this.idleTime = idleTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("idleTime")
  public Double getIdleTime() {
    return idleTime;
  }
  
  public void setIdleTime(Double idleTime) {
    this.idleTime = idleTime;
  }

  
  /**
   **/
  public WorkloadStatistics otherOps(Double otherOps) {
    this.otherOps = otherOps;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("otherOps")
  public Double getOtherOps() {
    return otherOps;
  }
  
  public void setOtherOps(Double otherOps) {
    this.otherOps = otherOps;
  }

  
  /**
   **/
  public WorkloadStatistics otherTimeMax(Double otherTimeMax) {
    this.otherTimeMax = otherTimeMax;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("otherTimeMax")
  public Double getOtherTimeMax() {
    return otherTimeMax;
  }
  
  public void setOtherTimeMax(Double otherTimeMax) {
    this.otherTimeMax = otherTimeMax;
  }

  
  /**
   **/
  public WorkloadStatistics otherTimeTotal(Double otherTimeTotal) {
    this.otherTimeTotal = otherTimeTotal;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("otherTimeTotal")
  public Double getOtherTimeTotal() {
    return otherTimeTotal;
  }
  
  public void setOtherTimeTotal(Double otherTimeTotal) {
    this.otherTimeTotal = otherTimeTotal;
  }

  
  /**
   **/
  public WorkloadStatistics readBytes(Double readBytes) {
    this.readBytes = readBytes;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("readBytes")
  public Double getReadBytes() {
    return readBytes;
  }
  
  public void setReadBytes(Double readBytes) {
    this.readBytes = readBytes;
  }

  
  /**
   **/
  public WorkloadStatistics readHitTimeMax(Double readHitTimeMax) {
    this.readHitTimeMax = readHitTimeMax;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("readHitTimeMax")
  public Double getReadHitTimeMax() {
    return readHitTimeMax;
  }
  
  public void setReadHitTimeMax(Double readHitTimeMax) {
    this.readHitTimeMax = readHitTimeMax;
  }

  
  /**
   **/
  public WorkloadStatistics readTimeMax(Double readTimeMax) {
    this.readTimeMax = readTimeMax;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("readTimeMax")
  public Double getReadTimeMax() {
    return readTimeMax;
  }
  
  public void setReadTimeMax(Double readTimeMax) {
    this.readTimeMax = readTimeMax;
  }

  
  /**
   **/
  public WorkloadStatistics writeBytes(Double writeBytes) {
    this.writeBytes = writeBytes;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("writeBytes")
  public Double getWriteBytes() {
    return writeBytes;
  }
  
  public void setWriteBytes(Double writeBytes) {
    this.writeBytes = writeBytes;
  }

  
  /**
   * Number of bytes written to cache
   **/
  public WorkloadStatistics writeHitBytes(Double writeHitBytes) {
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
  public WorkloadStatistics writeHitOps(Double writeHitOps) {
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
   **/
  public WorkloadStatistics writeHitTimeMax(Double writeHitTimeMax) {
    this.writeHitTimeMax = writeHitTimeMax;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("writeHitTimeMax")
  public Double getWriteHitTimeMax() {
    return writeHitTimeMax;
  }
  
  public void setWriteHitTimeMax(Double writeHitTimeMax) {
    this.writeHitTimeMax = writeHitTimeMax;
  }

  
  /**
   **/
  public WorkloadStatistics writeTimeMax(Double writeTimeMax) {
    this.writeTimeMax = writeTimeMax;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("writeTimeMax")
  public Double getWriteTimeMax() {
    return writeTimeMax;
  }
  
  public void setWriteTimeMax(Double writeTimeMax) {
    this.writeTimeMax = writeTimeMax;
  }

  
  /**
   * Total channel queue depth.
   **/
  public WorkloadStatistics queueDepthTotal(Double queueDepthTotal) {
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
  public WorkloadStatistics queueDepthMax(Double queueDepthMax) {
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
   * The number of flash cache read hit operations.
   **/
  public WorkloadStatistics flashCacheReadHitOps(Double flashCacheReadHitOps) {
    this.flashCacheReadHitOps = flashCacheReadHitOps;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The number of flash cache read hit operations.")
  @JsonProperty("flashCacheReadHitOps")
  public Double getFlashCacheReadHitOps() {
    return flashCacheReadHitOps;
  }
  
  public void setFlashCacheReadHitOps(Double flashCacheReadHitOps) {
    this.flashCacheReadHitOps = flashCacheReadHitOps;
  }

  
  /**
   * The number of flash cache read hit bytes.
   **/
  public WorkloadStatistics flashCacheReadHitBytes(Double flashCacheReadHitBytes) {
    this.flashCacheReadHitBytes = flashCacheReadHitBytes;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The number of flash cache read hit bytes.")
  @JsonProperty("flashCacheReadHitBytes")
  public Double getFlashCacheReadHitBytes() {
    return flashCacheReadHitBytes;
  }
  
  public void setFlashCacheReadHitBytes(Double flashCacheReadHitBytes) {
    this.flashCacheReadHitBytes = flashCacheReadHitBytes;
  }

  
  /**
   * The sum of all response times for all reads that have cache hits, in microseconds
   **/
  public WorkloadStatistics flashCacheReadHitTimeTotal(Double flashCacheReadHitTimeTotal) {
    this.flashCacheReadHitTimeTotal = flashCacheReadHitTimeTotal;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The sum of all response times for all reads that have cache hits, in microseconds")
  @JsonProperty("flashCacheReadHitTimeTotal")
  public Double getFlashCacheReadHitTimeTotal() {
    return flashCacheReadHitTimeTotal;
  }
  
  public void setFlashCacheReadHitTimeTotal(Double flashCacheReadHitTimeTotal) {
    this.flashCacheReadHitTimeTotal = flashCacheReadHitTimeTotal;
  }

  
  /**
   * Maximum I/O time in microseconds for any one read I/O that has a cache hit
   **/
  public WorkloadStatistics flashCacheReadHitTimeMax(Double flashCacheReadHitTimeMax) {
    this.flashCacheReadHitTimeMax = flashCacheReadHitTimeMax;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Maximum I/O time in microseconds for any one read I/O that has a cache hit")
  @JsonProperty("flashCacheReadHitTimeMax")
  public Double getFlashCacheReadHitTimeMax() {
    return flashCacheReadHitTimeMax;
  }
  
  public void setFlashCacheReadHitTimeMax(Double flashCacheReadHitTimeMax) {
    this.flashCacheReadHitTimeMax = flashCacheReadHitTimeMax;
  }

  
  /**
   * he workload id of the collection
   **/
  public WorkloadStatistics workloadId(String workloadId) {
    this.workloadId = workloadId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "he workload id of the collection")
  @JsonProperty("workloadId")
  public String getWorkloadId() {
    return workloadId;
  }
  
  public void setWorkloadId(String workloadId) {
    this.workloadId = workloadId;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorkloadStatistics workloadStatistics = (WorkloadStatistics) o;
    return Objects.equals(this.observedTime, workloadStatistics.observedTime) &&
        Objects.equals(this.observedTimeInMS, workloadStatistics.observedTimeInMS) &&
        Objects.equals(this.lastResetTime, workloadStatistics.lastResetTime) &&
        Objects.equals(this.lastResetTimeInMS, workloadStatistics.lastResetTimeInMS) &&
        Objects.equals(this.arrayId, workloadStatistics.arrayId) &&
        Objects.equals(this.arrayWwn, workloadStatistics.arrayWwn) &&
        Objects.equals(this.memberIdsHash, workloadStatistics.memberIdsHash) &&
        Objects.equals(this.readOps, workloadStatistics.readOps) &&
        Objects.equals(this.readHitOps, workloadStatistics.readHitOps) &&
        Objects.equals(this.readHitBytes, workloadStatistics.readHitBytes) &&
        Objects.equals(this.readTimeTotal, workloadStatistics.readTimeTotal) &&
        Objects.equals(this.readHitTimeTotal, workloadStatistics.readHitTimeTotal) &&
        Objects.equals(this.writeOps, workloadStatistics.writeOps) &&
        Objects.equals(this.writeTimeTotal, workloadStatistics.writeTimeTotal) &&
        Objects.equals(this.writeHitTimeTotal, workloadStatistics.writeHitTimeTotal) &&
        Objects.equals(this.errRedundancyChkIndeterminateReads, workloadStatistics.errRedundancyChkIndeterminateReads) &&
        Objects.equals(this.errRedundancyChkRecoveredReads, workloadStatistics.errRedundancyChkRecoveredReads) &&
        Objects.equals(this.errRedundancyChkUnrecoveredReads, workloadStatistics.errRedundancyChkUnrecoveredReads) &&
        Objects.equals(this.idleTime, workloadStatistics.idleTime) &&
        Objects.equals(this.otherOps, workloadStatistics.otherOps) &&
        Objects.equals(this.otherTimeMax, workloadStatistics.otherTimeMax) &&
        Objects.equals(this.otherTimeTotal, workloadStatistics.otherTimeTotal) &&
        Objects.equals(this.readBytes, workloadStatistics.readBytes) &&
        Objects.equals(this.readHitTimeMax, workloadStatistics.readHitTimeMax) &&
        Objects.equals(this.readTimeMax, workloadStatistics.readTimeMax) &&
        Objects.equals(this.writeBytes, workloadStatistics.writeBytes) &&
        Objects.equals(this.writeHitBytes, workloadStatistics.writeHitBytes) &&
        Objects.equals(this.writeHitOps, workloadStatistics.writeHitOps) &&
        Objects.equals(this.writeHitTimeMax, workloadStatistics.writeHitTimeMax) &&
        Objects.equals(this.writeTimeMax, workloadStatistics.writeTimeMax) &&
        Objects.equals(this.queueDepthTotal, workloadStatistics.queueDepthTotal) &&
        Objects.equals(this.queueDepthMax, workloadStatistics.queueDepthMax) &&
        Objects.equals(this.flashCacheReadHitOps, workloadStatistics.flashCacheReadHitOps) &&
        Objects.equals(this.flashCacheReadHitBytes, workloadStatistics.flashCacheReadHitBytes) &&
        Objects.equals(this.flashCacheReadHitTimeTotal, workloadStatistics.flashCacheReadHitTimeTotal) &&
        Objects.equals(this.flashCacheReadHitTimeMax, workloadStatistics.flashCacheReadHitTimeMax) &&
        Objects.equals(this.workloadId, workloadStatistics.workloadId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(observedTime, observedTimeInMS, lastResetTime, lastResetTimeInMS, arrayId, arrayWwn, memberIdsHash, readOps, readHitOps, readHitBytes, readTimeTotal, readHitTimeTotal, writeOps, writeTimeTotal, writeHitTimeTotal, errRedundancyChkIndeterminateReads, errRedundancyChkRecoveredReads, errRedundancyChkUnrecoveredReads, idleTime, otherOps, otherTimeMax, otherTimeTotal, readBytes, readHitTimeMax, readTimeMax, writeBytes, writeHitBytes, writeHitOps, writeHitTimeMax, writeTimeMax, queueDepthTotal, queueDepthMax, flashCacheReadHitOps, flashCacheReadHitBytes, flashCacheReadHitTimeTotal, flashCacheReadHitTimeMax, workloadId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkloadStatistics {\n");
    
    sb.append("    observedTime: ").append(toIndentedString(observedTime)).append("\n");
    sb.append("    observedTimeInMS: ").append(toIndentedString(observedTimeInMS)).append("\n");
    sb.append("    lastResetTime: ").append(toIndentedString(lastResetTime)).append("\n");
    sb.append("    lastResetTimeInMS: ").append(toIndentedString(lastResetTimeInMS)).append("\n");
    sb.append("    arrayId: ").append(toIndentedString(arrayId)).append("\n");
    sb.append("    arrayWwn: ").append(toIndentedString(arrayWwn)).append("\n");
    sb.append("    memberIdsHash: ").append(toIndentedString(memberIdsHash)).append("\n");
    sb.append("    readOps: ").append(toIndentedString(readOps)).append("\n");
    sb.append("    readHitOps: ").append(toIndentedString(readHitOps)).append("\n");
    sb.append("    readHitBytes: ").append(toIndentedString(readHitBytes)).append("\n");
    sb.append("    readTimeTotal: ").append(toIndentedString(readTimeTotal)).append("\n");
    sb.append("    readHitTimeTotal: ").append(toIndentedString(readHitTimeTotal)).append("\n");
    sb.append("    writeOps: ").append(toIndentedString(writeOps)).append("\n");
    sb.append("    writeTimeTotal: ").append(toIndentedString(writeTimeTotal)).append("\n");
    sb.append("    writeHitTimeTotal: ").append(toIndentedString(writeHitTimeTotal)).append("\n");
    sb.append("    errRedundancyChkIndeterminateReads: ").append(toIndentedString(errRedundancyChkIndeterminateReads)).append("\n");
    sb.append("    errRedundancyChkRecoveredReads: ").append(toIndentedString(errRedundancyChkRecoveredReads)).append("\n");
    sb.append("    errRedundancyChkUnrecoveredReads: ").append(toIndentedString(errRedundancyChkUnrecoveredReads)).append("\n");
    sb.append("    idleTime: ").append(toIndentedString(idleTime)).append("\n");
    sb.append("    otherOps: ").append(toIndentedString(otherOps)).append("\n");
    sb.append("    otherTimeMax: ").append(toIndentedString(otherTimeMax)).append("\n");
    sb.append("    otherTimeTotal: ").append(toIndentedString(otherTimeTotal)).append("\n");
    sb.append("    readBytes: ").append(toIndentedString(readBytes)).append("\n");
    sb.append("    readHitTimeMax: ").append(toIndentedString(readHitTimeMax)).append("\n");
    sb.append("    readTimeMax: ").append(toIndentedString(readTimeMax)).append("\n");
    sb.append("    writeBytes: ").append(toIndentedString(writeBytes)).append("\n");
    sb.append("    writeHitBytes: ").append(toIndentedString(writeHitBytes)).append("\n");
    sb.append("    writeHitOps: ").append(toIndentedString(writeHitOps)).append("\n");
    sb.append("    writeHitTimeMax: ").append(toIndentedString(writeHitTimeMax)).append("\n");
    sb.append("    writeTimeMax: ").append(toIndentedString(writeTimeMax)).append("\n");
    sb.append("    queueDepthTotal: ").append(toIndentedString(queueDepthTotal)).append("\n");
    sb.append("    queueDepthMax: ").append(toIndentedString(queueDepthMax)).append("\n");
    sb.append("    flashCacheReadHitOps: ").append(toIndentedString(flashCacheReadHitOps)).append("\n");
    sb.append("    flashCacheReadHitBytes: ").append(toIndentedString(flashCacheReadHitBytes)).append("\n");
    sb.append("    flashCacheReadHitTimeTotal: ").append(toIndentedString(flashCacheReadHitTimeTotal)).append("\n");
    sb.append("    flashCacheReadHitTimeMax: ").append(toIndentedString(flashCacheReadHitTimeMax)).append("\n");
    sb.append("    workloadId: ").append(toIndentedString(workloadId)).append("\n");
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

