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
 * A single Volume I/O performance statistics. Note: the DELETE method clears all statistics for all volumes.
 */
@ApiModel(description = "A single Volume I/O performance statistics. Note: the DELETE method clears all statistics for all volumes.")
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2017-10-04T15:05:52.333-05:00")
public class VolumeIOStats   {
  
    private Date observedTime;

    private Long observedTimeInMS;

    private Date lastResetTime;

    private Long lastResetTimeInMS;

    private String volumeGroupId;

    private String controllerId;

    private String volumeId;

    private String arrayId;

    private String arrayWwn;

    private String volumeGroupWwn;

    private String volumeName;

    private String volumeWwn;

    private String workloadId;

    private Double readOps;

    private Double readHitOps;

    private Double readHitBytes;

    private Double readTimeTotal;

    private Double readHitTimeTotal;

    private Double writeOps;

    private Double writeCacheHitOps;

    private Double writeTimeTotal;

    private Double writeHitTimeTotal;

    private Double errRedundancyChkIndeterminateReads;

    private Double errRedundancyChkRecoveredReads;

    private Double errRedundancyChkUnrecoveredReads;

    private Double idleTime;

    private Double otherOps;

    private Double otherTimeMax;

    private Double otherTimeTotal;

    private Double otherTimeTotalSq;

    private Double readBytes;

    private Double readHitTimeMax;

    private Double readHitTimeTotalSq;

    private Double readTimeMax;

    private Double readTimeTotalSq;

    private Double writeBytes;

    private Double writeHitBytes;

    private Double writeHitOps;

    private Double writeHitTimeMax;

    private Double writeHitTimeTotalSq;

    private Double writeTimeMax;

    private Double writeTimeTotalSq;

    private Double queueDepthTotal;

    private Double queueDepthMax;

    private Double randomIosTotal;

    private Double randomBytesTotal;

    private Double cacheWriteWaitHitIops;

    private Double cacheWriteWaitHitBytes;

    private Double fullStripeWriteBytes;

    private Double totalIosShipped;

    private Double totalBlksEvicted;

    private Double cacheBlksInUse;

    private Double flashCacheReadHitOps;

    private Double flashCacheReadHitBytes;

    private Double flashCacheReadHitTimeTotal;

    private Double flashCacheReadHitTimeMax;

    private Double flashCacheReadHitTimeTotalSq;

  
  /**
   * End time for this collection as measured by the number of seconds since baseTime.
   **/
  public VolumeIOStats observedTime(Date observedTime) {
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
  public VolumeIOStats observedTimeInMS(Long observedTimeInMS) {
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
  public VolumeIOStats lastResetTime(Date lastResetTime) {
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
  public VolumeIOStats lastResetTimeInMS(Long lastResetTimeInMS) {
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
  public VolumeIOStats volumeGroupId(String volumeGroupId) {
    this.volumeGroupId = volumeGroupId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("volumeGroupId")
  public String getVolumeGroupId() {
    return volumeGroupId;
  }
  
  public void setVolumeGroupId(String volumeGroupId) {
    this.volumeGroupId = volumeGroupId;
  }

  
  /**
   **/
  public VolumeIOStats controllerId(String controllerId) {
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
  public VolumeIOStats volumeId(String volumeId) {
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
  public VolumeIOStats arrayId(String arrayId) {
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
  public VolumeIOStats arrayWwn(String arrayWwn) {
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
   **/
  public VolumeIOStats volumeGroupWwn(String volumeGroupWwn) {
    this.volumeGroupWwn = volumeGroupWwn;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("volumeGroupWwn")
  public String getVolumeGroupWwn() {
    return volumeGroupWwn;
  }
  
  public void setVolumeGroupWwn(String volumeGroupWwn) {
    this.volumeGroupWwn = volumeGroupWwn;
  }

  
  /**
   **/
  public VolumeIOStats volumeName(String volumeName) {
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
  public VolumeIOStats volumeWwn(String volumeWwn) {
    this.volumeWwn = volumeWwn;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("volumeWwn")
  public String getVolumeWwn() {
    return volumeWwn;
  }
  
  public void setVolumeWwn(String volumeWwn) {
    this.volumeWwn = volumeWwn;
  }

  
  /**
   * The associated workload id
   **/
  public VolumeIOStats workloadId(String workloadId) {
    this.workloadId = workloadId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The associated workload id")
  @JsonProperty("workloadId")
  public String getWorkloadId() {
    return workloadId;
  }
  
  public void setWorkloadId(String workloadId) {
    this.workloadId = workloadId;
  }

  
  /**
   **/
  public VolumeIOStats readOps(Double readOps) {
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
   * Number of read operations that hit cache
   **/
  public VolumeIOStats readHitOps(Double readHitOps) {
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
  public VolumeIOStats readHitBytes(Double readHitBytes) {
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
  public VolumeIOStats readTimeTotal(Double readTimeTotal) {
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
  public VolumeIOStats readHitTimeTotal(Double readHitTimeTotal) {
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
   **/
  public VolumeIOStats writeOps(Double writeOps) {
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
   * A redundant field to write Hit Ops
   **/
  public VolumeIOStats writeCacheHitOps(Double writeCacheHitOps) {
    this.writeCacheHitOps = writeCacheHitOps;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "A redundant field to write Hit Ops")
  @JsonProperty("writeCacheHitOps")
  public Double getWriteCacheHitOps() {
    return writeCacheHitOps;
  }
  
  public void setWriteCacheHitOps(Double writeCacheHitOps) {
    this.writeCacheHitOps = writeCacheHitOps;
  }

  
  /**
   **/
  public VolumeIOStats writeTimeTotal(Double writeTimeTotal) {
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
  public VolumeIOStats writeHitTimeTotal(Double writeHitTimeTotal) {
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
  public VolumeIOStats errRedundancyChkIndeterminateReads(Double errRedundancyChkIndeterminateReads) {
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
  public VolumeIOStats errRedundancyChkRecoveredReads(Double errRedundancyChkRecoveredReads) {
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
  public VolumeIOStats errRedundancyChkUnrecoveredReads(Double errRedundancyChkUnrecoveredReads) {
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
  public VolumeIOStats idleTime(Double idleTime) {
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
  public VolumeIOStats otherOps(Double otherOps) {
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
  public VolumeIOStats otherTimeMax(Double otherTimeMax) {
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
  public VolumeIOStats otherTimeTotal(Double otherTimeTotal) {
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
  public VolumeIOStats otherTimeTotalSq(Double otherTimeTotalSq) {
    this.otherTimeTotalSq = otherTimeTotalSq;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("otherTimeTotalSq")
  public Double getOtherTimeTotalSq() {
    return otherTimeTotalSq;
  }
  
  public void setOtherTimeTotalSq(Double otherTimeTotalSq) {
    this.otherTimeTotalSq = otherTimeTotalSq;
  }

  
  /**
   **/
  public VolumeIOStats readBytes(Double readBytes) {
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
  public VolumeIOStats readHitTimeMax(Double readHitTimeMax) {
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
  public VolumeIOStats readHitTimeTotalSq(Double readHitTimeTotalSq) {
    this.readHitTimeTotalSq = readHitTimeTotalSq;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("readHitTimeTotalSq")
  public Double getReadHitTimeTotalSq() {
    return readHitTimeTotalSq;
  }
  
  public void setReadHitTimeTotalSq(Double readHitTimeTotalSq) {
    this.readHitTimeTotalSq = readHitTimeTotalSq;
  }

  
  /**
   **/
  public VolumeIOStats readTimeMax(Double readTimeMax) {
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
  public VolumeIOStats readTimeTotalSq(Double readTimeTotalSq) {
    this.readTimeTotalSq = readTimeTotalSq;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("readTimeTotalSq")
  public Double getReadTimeTotalSq() {
    return readTimeTotalSq;
  }
  
  public void setReadTimeTotalSq(Double readTimeTotalSq) {
    this.readTimeTotalSq = readTimeTotalSq;
  }

  
  /**
   **/
  public VolumeIOStats writeBytes(Double writeBytes) {
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
  public VolumeIOStats writeHitBytes(Double writeHitBytes) {
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
  public VolumeIOStats writeHitOps(Double writeHitOps) {
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
  public VolumeIOStats writeHitTimeMax(Double writeHitTimeMax) {
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
  public VolumeIOStats writeHitTimeTotalSq(Double writeHitTimeTotalSq) {
    this.writeHitTimeTotalSq = writeHitTimeTotalSq;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("writeHitTimeTotalSq")
  public Double getWriteHitTimeTotalSq() {
    return writeHitTimeTotalSq;
  }
  
  public void setWriteHitTimeTotalSq(Double writeHitTimeTotalSq) {
    this.writeHitTimeTotalSq = writeHitTimeTotalSq;
  }

  
  /**
   **/
  public VolumeIOStats writeTimeMax(Double writeTimeMax) {
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
   **/
  public VolumeIOStats writeTimeTotalSq(Double writeTimeTotalSq) {
    this.writeTimeTotalSq = writeTimeTotalSq;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("writeTimeTotalSq")
  public Double getWriteTimeTotalSq() {
    return writeTimeTotalSq;
  }
  
  public void setWriteTimeTotalSq(Double writeTimeTotalSq) {
    this.writeTimeTotalSq = writeTimeTotalSq;
  }

  
  /**
   * Total channel queue depth.
   **/
  public VolumeIOStats queueDepthTotal(Double queueDepthTotal) {
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
  public VolumeIOStats queueDepthMax(Double queueDepthMax) {
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
   **/
  public VolumeIOStats randomIosTotal(Double randomIosTotal) {
    this.randomIosTotal = randomIosTotal;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("randomIosTotal")
  public Double getRandomIosTotal() {
    return randomIosTotal;
  }
  
  public void setRandomIosTotal(Double randomIosTotal) {
    this.randomIosTotal = randomIosTotal;
  }

  
  /**
   **/
  public VolumeIOStats randomBytesTotal(Double randomBytesTotal) {
    this.randomBytesTotal = randomBytesTotal;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("randomBytesTotal")
  public Double getRandomBytesTotal() {
    return randomBytesTotal;
  }
  
  public void setRandomBytesTotal(Double randomBytesTotal) {
    this.randomBytesTotal = randomBytesTotal;
  }

  
  /**
   **/
  public VolumeIOStats cacheWriteWaitHitIops(Double cacheWriteWaitHitIops) {
    this.cacheWriteWaitHitIops = cacheWriteWaitHitIops;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("cacheWriteWaitHitIops")
  public Double getCacheWriteWaitHitIops() {
    return cacheWriteWaitHitIops;
  }
  
  public void setCacheWriteWaitHitIops(Double cacheWriteWaitHitIops) {
    this.cacheWriteWaitHitIops = cacheWriteWaitHitIops;
  }

  
  /**
   **/
  public VolumeIOStats cacheWriteWaitHitBytes(Double cacheWriteWaitHitBytes) {
    this.cacheWriteWaitHitBytes = cacheWriteWaitHitBytes;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("cacheWriteWaitHitBytes")
  public Double getCacheWriteWaitHitBytes() {
    return cacheWriteWaitHitBytes;
  }
  
  public void setCacheWriteWaitHitBytes(Double cacheWriteWaitHitBytes) {
    this.cacheWriteWaitHitBytes = cacheWriteWaitHitBytes;
  }

  
  /**
   **/
  public VolumeIOStats fullStripeWriteBytes(Double fullStripeWriteBytes) {
    this.fullStripeWriteBytes = fullStripeWriteBytes;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("fullStripeWriteBytes")
  public Double getFullStripeWriteBytes() {
    return fullStripeWriteBytes;
  }
  
  public void setFullStripeWriteBytes(Double fullStripeWriteBytes) {
    this.fullStripeWriteBytes = fullStripeWriteBytes;
  }

  
  /**
   **/
  public VolumeIOStats totalIosShipped(Double totalIosShipped) {
    this.totalIosShipped = totalIosShipped;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("totalIosShipped")
  public Double getTotalIosShipped() {
    return totalIosShipped;
  }
  
  public void setTotalIosShipped(Double totalIosShipped) {
    this.totalIosShipped = totalIosShipped;
  }

  
  /**
   **/
  public VolumeIOStats totalBlksEvicted(Double totalBlksEvicted) {
    this.totalBlksEvicted = totalBlksEvicted;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("totalBlksEvicted")
  public Double getTotalBlksEvicted() {
    return totalBlksEvicted;
  }
  
  public void setTotalBlksEvicted(Double totalBlksEvicted) {
    this.totalBlksEvicted = totalBlksEvicted;
  }

  
  /**
   **/
  public VolumeIOStats cacheBlksInUse(Double cacheBlksInUse) {
    this.cacheBlksInUse = cacheBlksInUse;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("cacheBlksInUse")
  public Double getCacheBlksInUse() {
    return cacheBlksInUse;
  }
  
  public void setCacheBlksInUse(Double cacheBlksInUse) {
    this.cacheBlksInUse = cacheBlksInUse;
  }

  
  /**
   * The number of flash cache read hit operations.
   **/
  public VolumeIOStats flashCacheReadHitOps(Double flashCacheReadHitOps) {
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
  public VolumeIOStats flashCacheReadHitBytes(Double flashCacheReadHitBytes) {
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
  public VolumeIOStats flashCacheReadHitTimeTotal(Double flashCacheReadHitTimeTotal) {
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
  public VolumeIOStats flashCacheReadHitTimeMax(Double flashCacheReadHitTimeMax) {
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
   * The sum of the squares of the response times for all reads that have cache hits, in microseconds (used for standard deviation).
   **/
  public VolumeIOStats flashCacheReadHitTimeTotalSq(Double flashCacheReadHitTimeTotalSq) {
    this.flashCacheReadHitTimeTotalSq = flashCacheReadHitTimeTotalSq;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The sum of the squares of the response times for all reads that have cache hits, in microseconds (used for standard deviation).")
  @JsonProperty("flashCacheReadHitTimeTotalSq")
  public Double getFlashCacheReadHitTimeTotalSq() {
    return flashCacheReadHitTimeTotalSq;
  }
  
  public void setFlashCacheReadHitTimeTotalSq(Double flashCacheReadHitTimeTotalSq) {
    this.flashCacheReadHitTimeTotalSq = flashCacheReadHitTimeTotalSq;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VolumeIOStats volumeIOStats = (VolumeIOStats) o;
    return Objects.equals(this.observedTime, volumeIOStats.observedTime) &&
        Objects.equals(this.observedTimeInMS, volumeIOStats.observedTimeInMS) &&
        Objects.equals(this.lastResetTime, volumeIOStats.lastResetTime) &&
        Objects.equals(this.lastResetTimeInMS, volumeIOStats.lastResetTimeInMS) &&
        Objects.equals(this.volumeGroupId, volumeIOStats.volumeGroupId) &&
        Objects.equals(this.controllerId, volumeIOStats.controllerId) &&
        Objects.equals(this.volumeId, volumeIOStats.volumeId) &&
        Objects.equals(this.arrayId, volumeIOStats.arrayId) &&
        Objects.equals(this.arrayWwn, volumeIOStats.arrayWwn) &&
        Objects.equals(this.volumeGroupWwn, volumeIOStats.volumeGroupWwn) &&
        Objects.equals(this.volumeName, volumeIOStats.volumeName) &&
        Objects.equals(this.volumeWwn, volumeIOStats.volumeWwn) &&
        Objects.equals(this.workloadId, volumeIOStats.workloadId) &&
        Objects.equals(this.readOps, volumeIOStats.readOps) &&
        Objects.equals(this.readHitOps, volumeIOStats.readHitOps) &&
        Objects.equals(this.readHitBytes, volumeIOStats.readHitBytes) &&
        Objects.equals(this.readTimeTotal, volumeIOStats.readTimeTotal) &&
        Objects.equals(this.readHitTimeTotal, volumeIOStats.readHitTimeTotal) &&
        Objects.equals(this.writeOps, volumeIOStats.writeOps) &&
        Objects.equals(this.writeCacheHitOps, volumeIOStats.writeCacheHitOps) &&
        Objects.equals(this.writeTimeTotal, volumeIOStats.writeTimeTotal) &&
        Objects.equals(this.writeHitTimeTotal, volumeIOStats.writeHitTimeTotal) &&
        Objects.equals(this.errRedundancyChkIndeterminateReads, volumeIOStats.errRedundancyChkIndeterminateReads) &&
        Objects.equals(this.errRedundancyChkRecoveredReads, volumeIOStats.errRedundancyChkRecoveredReads) &&
        Objects.equals(this.errRedundancyChkUnrecoveredReads, volumeIOStats.errRedundancyChkUnrecoveredReads) &&
        Objects.equals(this.idleTime, volumeIOStats.idleTime) &&
        Objects.equals(this.otherOps, volumeIOStats.otherOps) &&
        Objects.equals(this.otherTimeMax, volumeIOStats.otherTimeMax) &&
        Objects.equals(this.otherTimeTotal, volumeIOStats.otherTimeTotal) &&
        Objects.equals(this.otherTimeTotalSq, volumeIOStats.otherTimeTotalSq) &&
        Objects.equals(this.readBytes, volumeIOStats.readBytes) &&
        Objects.equals(this.readHitTimeMax, volumeIOStats.readHitTimeMax) &&
        Objects.equals(this.readHitTimeTotalSq, volumeIOStats.readHitTimeTotalSq) &&
        Objects.equals(this.readTimeMax, volumeIOStats.readTimeMax) &&
        Objects.equals(this.readTimeTotalSq, volumeIOStats.readTimeTotalSq) &&
        Objects.equals(this.writeBytes, volumeIOStats.writeBytes) &&
        Objects.equals(this.writeHitBytes, volumeIOStats.writeHitBytes) &&
        Objects.equals(this.writeHitOps, volumeIOStats.writeHitOps) &&
        Objects.equals(this.writeHitTimeMax, volumeIOStats.writeHitTimeMax) &&
        Objects.equals(this.writeHitTimeTotalSq, volumeIOStats.writeHitTimeTotalSq) &&
        Objects.equals(this.writeTimeMax, volumeIOStats.writeTimeMax) &&
        Objects.equals(this.writeTimeTotalSq, volumeIOStats.writeTimeTotalSq) &&
        Objects.equals(this.queueDepthTotal, volumeIOStats.queueDepthTotal) &&
        Objects.equals(this.queueDepthMax, volumeIOStats.queueDepthMax) &&
        Objects.equals(this.randomIosTotal, volumeIOStats.randomIosTotal) &&
        Objects.equals(this.randomBytesTotal, volumeIOStats.randomBytesTotal) &&
        Objects.equals(this.cacheWriteWaitHitIops, volumeIOStats.cacheWriteWaitHitIops) &&
        Objects.equals(this.cacheWriteWaitHitBytes, volumeIOStats.cacheWriteWaitHitBytes) &&
        Objects.equals(this.fullStripeWriteBytes, volumeIOStats.fullStripeWriteBytes) &&
        Objects.equals(this.totalIosShipped, volumeIOStats.totalIosShipped) &&
        Objects.equals(this.totalBlksEvicted, volumeIOStats.totalBlksEvicted) &&
        Objects.equals(this.cacheBlksInUse, volumeIOStats.cacheBlksInUse) &&
        Objects.equals(this.flashCacheReadHitOps, volumeIOStats.flashCacheReadHitOps) &&
        Objects.equals(this.flashCacheReadHitBytes, volumeIOStats.flashCacheReadHitBytes) &&
        Objects.equals(this.flashCacheReadHitTimeTotal, volumeIOStats.flashCacheReadHitTimeTotal) &&
        Objects.equals(this.flashCacheReadHitTimeMax, volumeIOStats.flashCacheReadHitTimeMax) &&
        Objects.equals(this.flashCacheReadHitTimeTotalSq, volumeIOStats.flashCacheReadHitTimeTotalSq);
  }

  @Override
  public int hashCode() {
    return Objects.hash(observedTime, observedTimeInMS, lastResetTime, lastResetTimeInMS, volumeGroupId, controllerId, volumeId, arrayId, arrayWwn, volumeGroupWwn, volumeName, volumeWwn, workloadId, readOps, readHitOps, readHitBytes, readTimeTotal, readHitTimeTotal, writeOps, writeCacheHitOps, writeTimeTotal, writeHitTimeTotal, errRedundancyChkIndeterminateReads, errRedundancyChkRecoveredReads, errRedundancyChkUnrecoveredReads, idleTime, otherOps, otherTimeMax, otherTimeTotal, otherTimeTotalSq, readBytes, readHitTimeMax, readHitTimeTotalSq, readTimeMax, readTimeTotalSq, writeBytes, writeHitBytes, writeHitOps, writeHitTimeMax, writeHitTimeTotalSq, writeTimeMax, writeTimeTotalSq, queueDepthTotal, queueDepthMax, randomIosTotal, randomBytesTotal, cacheWriteWaitHitIops, cacheWriteWaitHitBytes, fullStripeWriteBytes, totalIosShipped, totalBlksEvicted, cacheBlksInUse, flashCacheReadHitOps, flashCacheReadHitBytes, flashCacheReadHitTimeTotal, flashCacheReadHitTimeMax, flashCacheReadHitTimeTotalSq);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VolumeIOStats {\n");
    
    sb.append("    observedTime: ").append(toIndentedString(observedTime)).append("\n");
    sb.append("    observedTimeInMS: ").append(toIndentedString(observedTimeInMS)).append("\n");
    sb.append("    lastResetTime: ").append(toIndentedString(lastResetTime)).append("\n");
    sb.append("    lastResetTimeInMS: ").append(toIndentedString(lastResetTimeInMS)).append("\n");
    sb.append("    volumeGroupId: ").append(toIndentedString(volumeGroupId)).append("\n");
    sb.append("    controllerId: ").append(toIndentedString(controllerId)).append("\n");
    sb.append("    volumeId: ").append(toIndentedString(volumeId)).append("\n");
    sb.append("    arrayId: ").append(toIndentedString(arrayId)).append("\n");
    sb.append("    arrayWwn: ").append(toIndentedString(arrayWwn)).append("\n");
    sb.append("    volumeGroupWwn: ").append(toIndentedString(volumeGroupWwn)).append("\n");
    sb.append("    volumeName: ").append(toIndentedString(volumeName)).append("\n");
    sb.append("    volumeWwn: ").append(toIndentedString(volumeWwn)).append("\n");
    sb.append("    workloadId: ").append(toIndentedString(workloadId)).append("\n");
    sb.append("    readOps: ").append(toIndentedString(readOps)).append("\n");
    sb.append("    readHitOps: ").append(toIndentedString(readHitOps)).append("\n");
    sb.append("    readHitBytes: ").append(toIndentedString(readHitBytes)).append("\n");
    sb.append("    readTimeTotal: ").append(toIndentedString(readTimeTotal)).append("\n");
    sb.append("    readHitTimeTotal: ").append(toIndentedString(readHitTimeTotal)).append("\n");
    sb.append("    writeOps: ").append(toIndentedString(writeOps)).append("\n");
    sb.append("    writeCacheHitOps: ").append(toIndentedString(writeCacheHitOps)).append("\n");
    sb.append("    writeTimeTotal: ").append(toIndentedString(writeTimeTotal)).append("\n");
    sb.append("    writeHitTimeTotal: ").append(toIndentedString(writeHitTimeTotal)).append("\n");
    sb.append("    errRedundancyChkIndeterminateReads: ").append(toIndentedString(errRedundancyChkIndeterminateReads)).append("\n");
    sb.append("    errRedundancyChkRecoveredReads: ").append(toIndentedString(errRedundancyChkRecoveredReads)).append("\n");
    sb.append("    errRedundancyChkUnrecoveredReads: ").append(toIndentedString(errRedundancyChkUnrecoveredReads)).append("\n");
    sb.append("    idleTime: ").append(toIndentedString(idleTime)).append("\n");
    sb.append("    otherOps: ").append(toIndentedString(otherOps)).append("\n");
    sb.append("    otherTimeMax: ").append(toIndentedString(otherTimeMax)).append("\n");
    sb.append("    otherTimeTotal: ").append(toIndentedString(otherTimeTotal)).append("\n");
    sb.append("    otherTimeTotalSq: ").append(toIndentedString(otherTimeTotalSq)).append("\n");
    sb.append("    readBytes: ").append(toIndentedString(readBytes)).append("\n");
    sb.append("    readHitTimeMax: ").append(toIndentedString(readHitTimeMax)).append("\n");
    sb.append("    readHitTimeTotalSq: ").append(toIndentedString(readHitTimeTotalSq)).append("\n");
    sb.append("    readTimeMax: ").append(toIndentedString(readTimeMax)).append("\n");
    sb.append("    readTimeTotalSq: ").append(toIndentedString(readTimeTotalSq)).append("\n");
    sb.append("    writeBytes: ").append(toIndentedString(writeBytes)).append("\n");
    sb.append("    writeHitBytes: ").append(toIndentedString(writeHitBytes)).append("\n");
    sb.append("    writeHitOps: ").append(toIndentedString(writeHitOps)).append("\n");
    sb.append("    writeHitTimeMax: ").append(toIndentedString(writeHitTimeMax)).append("\n");
    sb.append("    writeHitTimeTotalSq: ").append(toIndentedString(writeHitTimeTotalSq)).append("\n");
    sb.append("    writeTimeMax: ").append(toIndentedString(writeTimeMax)).append("\n");
    sb.append("    writeTimeTotalSq: ").append(toIndentedString(writeTimeTotalSq)).append("\n");
    sb.append("    queueDepthTotal: ").append(toIndentedString(queueDepthTotal)).append("\n");
    sb.append("    queueDepthMax: ").append(toIndentedString(queueDepthMax)).append("\n");
    sb.append("    randomIosTotal: ").append(toIndentedString(randomIosTotal)).append("\n");
    sb.append("    randomBytesTotal: ").append(toIndentedString(randomBytesTotal)).append("\n");
    sb.append("    cacheWriteWaitHitIops: ").append(toIndentedString(cacheWriteWaitHitIops)).append("\n");
    sb.append("    cacheWriteWaitHitBytes: ").append(toIndentedString(cacheWriteWaitHitBytes)).append("\n");
    sb.append("    fullStripeWriteBytes: ").append(toIndentedString(fullStripeWriteBytes)).append("\n");
    sb.append("    totalIosShipped: ").append(toIndentedString(totalIosShipped)).append("\n");
    sb.append("    totalBlksEvicted: ").append(toIndentedString(totalBlksEvicted)).append("\n");
    sb.append("    cacheBlksInUse: ").append(toIndentedString(cacheBlksInUse)).append("\n");
    sb.append("    flashCacheReadHitOps: ").append(toIndentedString(flashCacheReadHitOps)).append("\n");
    sb.append("    flashCacheReadHitBytes: ").append(toIndentedString(flashCacheReadHitBytes)).append("\n");
    sb.append("    flashCacheReadHitTimeTotal: ").append(toIndentedString(flashCacheReadHitTimeTotal)).append("\n");
    sb.append("    flashCacheReadHitTimeMax: ").append(toIndentedString(flashCacheReadHitTimeMax)).append("\n");
    sb.append("    flashCacheReadHitTimeTotalSq: ").append(toIndentedString(flashCacheReadHitTimeTotalSq)).append("\n");
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

