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
 * VolumeCounterGroup
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2016-08-12T15:32:46.001-05:00")
public class VolumeCounterGroup   {
  
    private String controllerRef;

    private Long baseTime;

    private Long readHitOps;

    private Long readHitBytes;

    private Long readHitTimeTotal;

    private Long readHitTimeMax;

    private Long readOps;

    private Long readBytes;

    private Long readTimeTotal;

    private Long readTimeMax;

    private Long writeHitOps;

    private Long writeHitBytes;

    private Long writeHitTimeTotal;

    private Long writeHitTimeMax;

    private Long writeOps;

    private Long writeBytes;

    private Long writeTimeTotal;

    private Long writeTimeMax;

    private Long otherOps;

    private Long otherTimeTotal;

    private Long otherTimeMax;

    private Long idleTime;

    private Long errRedundancyChkUnrecoveredReads;

    private Long errRedundancyChkRecoveredReads;

    private Long errRedundancyChkIndeterminateReads;

    private Long readHitTimeTotalSq;

    private Long readTimeTotalSq;

    private Long writeHitTimeTotalSq;

    private Long writeTimeTotalSq;

    private Long otherTimeTotalSq;

    private Long flashCacheReadHitOps;

    private Long flashCacheReadHitBytes;

    private Long flashCacheReadHitTimeTotal;

    private Long flashCacheReadHitTimeMax;

    private Long flashCacheReadHitTimeTotalSq;

    private Long prefetchHitBytes;

    private Long prefetchMissBytes;

    private Long startTime;

    private Long observedTime;

    private Long queueDepthTotal;

    private Long queueDepthMax;

    private Long randomIosTotal;

    private Long randomBytesTotal;

    private Long cacheWriteWaitHitOps;

    private Long fullStripeWritesBytes;

    private Long totalIosShipped;

    private Long totalBlksEvicted;

    private Long cacheBlksInUse;

    private Long cacheWriteWaitHitBytes;

  
  /**
   * A reference to the controller that accumulated the counters for this group.
   **/
  public VolumeCounterGroup controllerRef(String controllerRef) {
    this.controllerRef = controllerRef;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "A reference to the controller that accumulated the counters for this group.")
  @JsonProperty("controllerRef")
  public String getControllerRef() {
    return controllerRef;
  }
  
  public void setControllerRef(String controllerRef) {
    this.controllerRef = controllerRef;
  }

  
  /**
   * The time that the counters were last reset. Time is the number of seconds since midnight, January 1, 1970.
   **/
  public VolumeCounterGroup baseTime(Long baseTime) {
    this.baseTime = baseTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The time that the counters were last reset. Time is the number of seconds since midnight, January 1, 1970.")
  @JsonProperty("baseTime")
  public Long getBaseTime() {
    return baseTime;
  }
  
  public void setBaseTime(Long baseTime) {
    this.baseTime = baseTime;
  }

  
  /**
   * The number of read operations that hit cache.
   **/
  public VolumeCounterGroup readHitOps(Long readHitOps) {
    this.readHitOps = readHitOps;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The number of read operations that hit cache.")
  @JsonProperty("readHitOps")
  public Long getReadHitOps() {
    return readHitOps;
  }
  
  public void setReadHitOps(Long readHitOps) {
    this.readHitOps = readHitOps;
  }

  
  /**
   * The number of bytes read that hit cache.
   **/
  public VolumeCounterGroup readHitBytes(Long readHitBytes) {
    this.readHitBytes = readHitBytes;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The number of bytes read that hit cache.")
  @JsonProperty("readHitBytes")
  public Long getReadHitBytes() {
    return readHitBytes;
  }
  
  public void setReadHitBytes(Long readHitBytes) {
    this.readHitBytes = readHitBytes;
  }

  
  /**
   * The total time in microseconds spent in read operations that hit cache.
   **/
  public VolumeCounterGroup readHitTimeTotal(Long readHitTimeTotal) {
    this.readHitTimeTotal = readHitTimeTotal;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The total time in microseconds spent in read operations that hit cache.")
  @JsonProperty("readHitTimeTotal")
  public Long getReadHitTimeTotal() {
    return readHitTimeTotal;
  }
  
  public void setReadHitTimeTotal(Long readHitTimeTotal) {
    this.readHitTimeTotal = readHitTimeTotal;
  }

  
  /**
   * The maximum time in microseconds spent in any one read operation that hit cache.
   **/
  public VolumeCounterGroup readHitTimeMax(Long readHitTimeMax) {
    this.readHitTimeMax = readHitTimeMax;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The maximum time in microseconds spent in any one read operation that hit cache.")
  @JsonProperty("readHitTimeMax")
  public Long getReadHitTimeMax() {
    return readHitTimeMax;
  }
  
  public void setReadHitTimeMax(Long readHitTimeMax) {
    this.readHitTimeMax = readHitTimeMax;
  }

  
  /**
   * The number of read operations.
   **/
  public VolumeCounterGroup readOps(Long readOps) {
    this.readOps = readOps;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The number of read operations.")
  @JsonProperty("readOps")
  public Long getReadOps() {
    return readOps;
  }
  
  public void setReadOps(Long readOps) {
    this.readOps = readOps;
  }

  
  /**
   * The number of bytes read.
   **/
  public VolumeCounterGroup readBytes(Long readBytes) {
    this.readBytes = readBytes;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The number of bytes read.")
  @JsonProperty("readBytes")
  public Long getReadBytes() {
    return readBytes;
  }
  
  public void setReadBytes(Long readBytes) {
    this.readBytes = readBytes;
  }

  
  /**
   * The total time in microseconds spent in read operations.
   **/
  public VolumeCounterGroup readTimeTotal(Long readTimeTotal) {
    this.readTimeTotal = readTimeTotal;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The total time in microseconds spent in read operations.")
  @JsonProperty("readTimeTotal")
  public Long getReadTimeTotal() {
    return readTimeTotal;
  }
  
  public void setReadTimeTotal(Long readTimeTotal) {
    this.readTimeTotal = readTimeTotal;
  }

  
  /**
   * The maximum time in microseconds spent in any one read operation.
   **/
  public VolumeCounterGroup readTimeMax(Long readTimeMax) {
    this.readTimeMax = readTimeMax;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The maximum time in microseconds spent in any one read operation.")
  @JsonProperty("readTimeMax")
  public Long getReadTimeMax() {
    return readTimeMax;
  }
  
  public void setReadTimeMax(Long readTimeMax) {
    this.readTimeMax = readTimeMax;
  }

  
  /**
   * The number of write operations that hit cache.
   **/
  public VolumeCounterGroup writeHitOps(Long writeHitOps) {
    this.writeHitOps = writeHitOps;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The number of write operations that hit cache.")
  @JsonProperty("writeHitOps")
  public Long getWriteHitOps() {
    return writeHitOps;
  }
  
  public void setWriteHitOps(Long writeHitOps) {
    this.writeHitOps = writeHitOps;
  }

  
  /**
   * The number of bytes written that hit cache.
   **/
  public VolumeCounterGroup writeHitBytes(Long writeHitBytes) {
    this.writeHitBytes = writeHitBytes;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The number of bytes written that hit cache.")
  @JsonProperty("writeHitBytes")
  public Long getWriteHitBytes() {
    return writeHitBytes;
  }
  
  public void setWriteHitBytes(Long writeHitBytes) {
    this.writeHitBytes = writeHitBytes;
  }

  
  /**
   * The total time in microseconds spent in write operations that hit cache.
   **/
  public VolumeCounterGroup writeHitTimeTotal(Long writeHitTimeTotal) {
    this.writeHitTimeTotal = writeHitTimeTotal;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The total time in microseconds spent in write operations that hit cache.")
  @JsonProperty("writeHitTimeTotal")
  public Long getWriteHitTimeTotal() {
    return writeHitTimeTotal;
  }
  
  public void setWriteHitTimeTotal(Long writeHitTimeTotal) {
    this.writeHitTimeTotal = writeHitTimeTotal;
  }

  
  /**
   * The maximum time in microseconds spent in any one write operation that hit cache.
   **/
  public VolumeCounterGroup writeHitTimeMax(Long writeHitTimeMax) {
    this.writeHitTimeMax = writeHitTimeMax;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The maximum time in microseconds spent in any one write operation that hit cache.")
  @JsonProperty("writeHitTimeMax")
  public Long getWriteHitTimeMax() {
    return writeHitTimeMax;
  }
  
  public void setWriteHitTimeMax(Long writeHitTimeMax) {
    this.writeHitTimeMax = writeHitTimeMax;
  }

  
  /**
   * The number of write operations.
   **/
  public VolumeCounterGroup writeOps(Long writeOps) {
    this.writeOps = writeOps;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The number of write operations.")
  @JsonProperty("writeOps")
  public Long getWriteOps() {
    return writeOps;
  }
  
  public void setWriteOps(Long writeOps) {
    this.writeOps = writeOps;
  }

  
  /**
   * The number of bytes written.
   **/
  public VolumeCounterGroup writeBytes(Long writeBytes) {
    this.writeBytes = writeBytes;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The number of bytes written.")
  @JsonProperty("writeBytes")
  public Long getWriteBytes() {
    return writeBytes;
  }
  
  public void setWriteBytes(Long writeBytes) {
    this.writeBytes = writeBytes;
  }

  
  /**
   * The total time in microseconds spent in write operations.
   **/
  public VolumeCounterGroup writeTimeTotal(Long writeTimeTotal) {
    this.writeTimeTotal = writeTimeTotal;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The total time in microseconds spent in write operations.")
  @JsonProperty("writeTimeTotal")
  public Long getWriteTimeTotal() {
    return writeTimeTotal;
  }
  
  public void setWriteTimeTotal(Long writeTimeTotal) {
    this.writeTimeTotal = writeTimeTotal;
  }

  
  /**
   * The maximum time in microseconds spent in any one write operation.
   **/
  public VolumeCounterGroup writeTimeMax(Long writeTimeMax) {
    this.writeTimeMax = writeTimeMax;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The maximum time in microseconds spent in any one write operation.")
  @JsonProperty("writeTimeMax")
  public Long getWriteTimeMax() {
    return writeTimeMax;
  }
  
  public void setWriteTimeMax(Long writeTimeMax) {
    this.writeTimeMax = writeTimeMax;
  }

  
  /**
   * The number of non-read-write operations.
   **/
  public VolumeCounterGroup otherOps(Long otherOps) {
    this.otherOps = otherOps;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The number of non-read-write operations.")
  @JsonProperty("otherOps")
  public Long getOtherOps() {
    return otherOps;
  }
  
  public void setOtherOps(Long otherOps) {
    this.otherOps = otherOps;
  }

  
  /**
   * The total time in microseconds spent in non-read-write operations.
   **/
  public VolumeCounterGroup otherTimeTotal(Long otherTimeTotal) {
    this.otherTimeTotal = otherTimeTotal;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The total time in microseconds spent in non-read-write operations.")
  @JsonProperty("otherTimeTotal")
  public Long getOtherTimeTotal() {
    return otherTimeTotal;
  }
  
  public void setOtherTimeTotal(Long otherTimeTotal) {
    this.otherTimeTotal = otherTimeTotal;
  }

  
  /**
   * The maximum time in microseconds spent in any one non-read-write operation.
   **/
  public VolumeCounterGroup otherTimeMax(Long otherTimeMax) {
    this.otherTimeMax = otherTimeMax;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The maximum time in microseconds spent in any one non-read-write operation.")
  @JsonProperty("otherTimeMax")
  public Long getOtherTimeMax() {
    return otherTimeMax;
  }
  
  public void setOtherTimeMax(Long otherTimeMax) {
    this.otherTimeMax = otherTimeMax;
  }

  
  /**
   * The total time in microseconds spent idle since baseTime.
   **/
  public VolumeCounterGroup idleTime(Long idleTime) {
    this.idleTime = idleTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The total time in microseconds spent idle since baseTime.")
  @JsonProperty("idleTime")
  public Long getIdleTime() {
    return idleTime;
  }
  
  public void setIdleTime(Long idleTime) {
    this.idleTime = idleTime;
  }

  
  /**
   * The number of read requests that have failed due to redundancy group inconsistencies.
   **/
  public VolumeCounterGroup errRedundancyChkUnrecoveredReads(Long errRedundancyChkUnrecoveredReads) {
    this.errRedundancyChkUnrecoveredReads = errRedundancyChkUnrecoveredReads;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The number of read requests that have failed due to redundancy group inconsistencies.")
  @JsonProperty("errRedundancyChkUnrecoveredReads")
  public Long getErrRedundancyChkUnrecoveredReads() {
    return errRedundancyChkUnrecoveredReads;
  }
  
  public void setErrRedundancyChkUnrecoveredReads(Long errRedundancyChkUnrecoveredReads) {
    this.errRedundancyChkUnrecoveredReads = errRedundancyChkUnrecoveredReads;
  }

  
  /**
   * The number of read requests that have experienced a redundancy group inconsistency that was subsequently recovered by retrying the consistency check.
   **/
  public VolumeCounterGroup errRedundancyChkRecoveredReads(Long errRedundancyChkRecoveredReads) {
    this.errRedundancyChkRecoveredReads = errRedundancyChkRecoveredReads;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The number of read requests that have experienced a redundancy group inconsistency that was subsequently recovered by retrying the consistency check.")
  @JsonProperty("errRedundancyChkRecoveredReads")
  public Long getErrRedundancyChkRecoveredReads() {
    return errRedundancyChkRecoveredReads;
  }
  
  public void setErrRedundancyChkRecoveredReads(Long errRedundancyChkRecoveredReads) {
    this.errRedundancyChkRecoveredReads = errRedundancyChkRecoveredReads;
  }

  
  /**
   * The number of read requests for which the consistency of the redundancy data could not be determined, but for which the read was carried out to completion.
   **/
  public VolumeCounterGroup errRedundancyChkIndeterminateReads(Long errRedundancyChkIndeterminateReads) {
    this.errRedundancyChkIndeterminateReads = errRedundancyChkIndeterminateReads;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The number of read requests for which the consistency of the redundancy data could not be determined, but for which the read was carried out to completion.")
  @JsonProperty("errRedundancyChkIndeterminateReads")
  public Long getErrRedundancyChkIndeterminateReads() {
    return errRedundancyChkIndeterminateReads;
  }
  
  public void setErrRedundancyChkIndeterminateReads(Long errRedundancyChkIndeterminateReads) {
    this.errRedundancyChkIndeterminateReads = errRedundancyChkIndeterminateReads;
  }

  
  /**
   * The sum of the squares of microseconds spent in read operations that hit cache.
   **/
  public VolumeCounterGroup readHitTimeTotalSq(Long readHitTimeTotalSq) {
    this.readHitTimeTotalSq = readHitTimeTotalSq;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The sum of the squares of microseconds spent in read operations that hit cache.")
  @JsonProperty("readHitTimeTotalSq")
  public Long getReadHitTimeTotalSq() {
    return readHitTimeTotalSq;
  }
  
  public void setReadHitTimeTotalSq(Long readHitTimeTotalSq) {
    this.readHitTimeTotalSq = readHitTimeTotalSq;
  }

  
  /**
   * The sum of the squares of microseconds spent in read operations.
   **/
  public VolumeCounterGroup readTimeTotalSq(Long readTimeTotalSq) {
    this.readTimeTotalSq = readTimeTotalSq;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The sum of the squares of microseconds spent in read operations.")
  @JsonProperty("readTimeTotalSq")
  public Long getReadTimeTotalSq() {
    return readTimeTotalSq;
  }
  
  public void setReadTimeTotalSq(Long readTimeTotalSq) {
    this.readTimeTotalSq = readTimeTotalSq;
  }

  
  /**
   * The sum of the squares of microseconds spent in write operations that hit cache.
   **/
  public VolumeCounterGroup writeHitTimeTotalSq(Long writeHitTimeTotalSq) {
    this.writeHitTimeTotalSq = writeHitTimeTotalSq;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The sum of the squares of microseconds spent in write operations that hit cache.")
  @JsonProperty("writeHitTimeTotalSq")
  public Long getWriteHitTimeTotalSq() {
    return writeHitTimeTotalSq;
  }
  
  public void setWriteHitTimeTotalSq(Long writeHitTimeTotalSq) {
    this.writeHitTimeTotalSq = writeHitTimeTotalSq;
  }

  
  /**
   * The sum of the squares of microseconds spent in write operations.
   **/
  public VolumeCounterGroup writeTimeTotalSq(Long writeTimeTotalSq) {
    this.writeTimeTotalSq = writeTimeTotalSq;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The sum of the squares of microseconds spent in write operations.")
  @JsonProperty("writeTimeTotalSq")
  public Long getWriteTimeTotalSq() {
    return writeTimeTotalSq;
  }
  
  public void setWriteTimeTotalSq(Long writeTimeTotalSq) {
    this.writeTimeTotalSq = writeTimeTotalSq;
  }

  
  /**
   * The sum of the squares of microseconds spent in non read-write operations.
   **/
  public VolumeCounterGroup otherTimeTotalSq(Long otherTimeTotalSq) {
    this.otherTimeTotalSq = otherTimeTotalSq;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The sum of the squares of microseconds spent in non read-write operations.")
  @JsonProperty("otherTimeTotalSq")
  public Long getOtherTimeTotalSq() {
    return otherTimeTotalSq;
  }
  
  public void setOtherTimeTotalSq(Long otherTimeTotalSq) {
    this.otherTimeTotalSq = otherTimeTotalSq;
  }

  
  /**
   * The number of flash cache read hit operations.
   **/
  public VolumeCounterGroup flashCacheReadHitOps(Long flashCacheReadHitOps) {
    this.flashCacheReadHitOps = flashCacheReadHitOps;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The number of flash cache read hit operations.")
  @JsonProperty("flashCacheReadHitOps")
  public Long getFlashCacheReadHitOps() {
    return flashCacheReadHitOps;
  }
  
  public void setFlashCacheReadHitOps(Long flashCacheReadHitOps) {
    this.flashCacheReadHitOps = flashCacheReadHitOps;
  }

  
  /**
   * The number of flash cache read hit bytes.
   **/
  public VolumeCounterGroup flashCacheReadHitBytes(Long flashCacheReadHitBytes) {
    this.flashCacheReadHitBytes = flashCacheReadHitBytes;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The number of flash cache read hit bytes.")
  @JsonProperty("flashCacheReadHitBytes")
  public Long getFlashCacheReadHitBytes() {
    return flashCacheReadHitBytes;
  }
  
  public void setFlashCacheReadHitBytes(Long flashCacheReadHitBytes) {
    this.flashCacheReadHitBytes = flashCacheReadHitBytes;
  }

  
  /**
   * The sum of all response times for all reads that have cache hits, in microseconds
   **/
  public VolumeCounterGroup flashCacheReadHitTimeTotal(Long flashCacheReadHitTimeTotal) {
    this.flashCacheReadHitTimeTotal = flashCacheReadHitTimeTotal;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The sum of all response times for all reads that have cache hits, in microseconds")
  @JsonProperty("flashCacheReadHitTimeTotal")
  public Long getFlashCacheReadHitTimeTotal() {
    return flashCacheReadHitTimeTotal;
  }
  
  public void setFlashCacheReadHitTimeTotal(Long flashCacheReadHitTimeTotal) {
    this.flashCacheReadHitTimeTotal = flashCacheReadHitTimeTotal;
  }

  
  /**
   * Maximum I/O time in microseconds for any one read I/O that has a cache hit
   **/
  public VolumeCounterGroup flashCacheReadHitTimeMax(Long flashCacheReadHitTimeMax) {
    this.flashCacheReadHitTimeMax = flashCacheReadHitTimeMax;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Maximum I/O time in microseconds for any one read I/O that has a cache hit")
  @JsonProperty("flashCacheReadHitTimeMax")
  public Long getFlashCacheReadHitTimeMax() {
    return flashCacheReadHitTimeMax;
  }
  
  public void setFlashCacheReadHitTimeMax(Long flashCacheReadHitTimeMax) {
    this.flashCacheReadHitTimeMax = flashCacheReadHitTimeMax;
  }

  
  /**
   * The sum of the squares of the response times for all reads that have cache hits, in microseconds (used for standard deviation).
   **/
  public VolumeCounterGroup flashCacheReadHitTimeTotalSq(Long flashCacheReadHitTimeTotalSq) {
    this.flashCacheReadHitTimeTotalSq = flashCacheReadHitTimeTotalSq;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The sum of the squares of the response times for all reads that have cache hits, in microseconds (used for standard deviation).")
  @JsonProperty("flashCacheReadHitTimeTotalSq")
  public Long getFlashCacheReadHitTimeTotalSq() {
    return flashCacheReadHitTimeTotalSq;
  }
  
  public void setFlashCacheReadHitTimeTotalSq(Long flashCacheReadHitTimeTotalSq) {
    this.flashCacheReadHitTimeTotalSq = flashCacheReadHitTimeTotalSq;
  }

  
  /**
   * The number of pre-fetched bytes that are ultimately read by the host.
   **/
  public VolumeCounterGroup prefetchHitBytes(Long prefetchHitBytes) {
    this.prefetchHitBytes = prefetchHitBytes;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The number of pre-fetched bytes that are ultimately read by the host.")
  @JsonProperty("prefetchHitBytes")
  public Long getPrefetchHitBytes() {
    return prefetchHitBytes;
  }
  
  public void setPrefetchHitBytes(Long prefetchHitBytes) {
    this.prefetchHitBytes = prefetchHitBytes;
  }

  
  /**
   * The number of pre-fetched bytes that are evicted from cache without being read by the host.
   **/
  public VolumeCounterGroup prefetchMissBytes(Long prefetchMissBytes) {
    this.prefetchMissBytes = prefetchMissBytes;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The number of pre-fetched bytes that are evicted from cache without being read by the host.")
  @JsonProperty("prefetchMissBytes")
  public Long getPrefetchMissBytes() {
    return prefetchMissBytes;
  }
  
  public void setPrefetchMissBytes(Long prefetchMissBytes) {
    this.prefetchMissBytes = prefetchMissBytes;
  }

  
  /**
   * Start time for this collection as measured by the number of seconds since baseTime.
   **/
  public VolumeCounterGroup startTime(Long startTime) {
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
  public VolumeCounterGroup observedTime(Long observedTime) {
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
   * Total drive queue depth.
   **/
  public VolumeCounterGroup queueDepthTotal(Long queueDepthTotal) {
    this.queueDepthTotal = queueDepthTotal;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Total drive queue depth.")
  @JsonProperty("queueDepthTotal")
  public Long getQueueDepthTotal() {
    return queueDepthTotal;
  }
  
  public void setQueueDepthTotal(Long queueDepthTotal) {
    this.queueDepthTotal = queueDepthTotal;
  }

  
  /**
   * Maximum queue depth.
   **/
  public VolumeCounterGroup queueDepthMax(Long queueDepthMax) {
    this.queueDepthMax = queueDepthMax;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Maximum queue depth.")
  @JsonProperty("queueDepthMax")
  public Long getQueueDepthMax() {
    return queueDepthMax;
  }
  
  public void setQueueDepthMax(Long queueDepthMax) {
    this.queueDepthMax = queueDepthMax;
  }

  
  /**
   * Total number of IOs that are categorized as random.
   **/
  public VolumeCounterGroup randomIosTotal(Long randomIosTotal) {
    this.randomIosTotal = randomIosTotal;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Total number of IOs that are categorized as random.")
  @JsonProperty("randomIosTotal")
  public Long getRandomIosTotal() {
    return randomIosTotal;
  }
  
  public void setRandomIosTotal(Long randomIosTotal) {
    this.randomIosTotal = randomIosTotal;
  }

  
  /**
   * Total number of Bytes that are categorized as random.
   **/
  public VolumeCounterGroup randomBytesTotal(Long randomBytesTotal) {
    this.randomBytesTotal = randomBytesTotal;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Total number of Bytes that are categorized as random.")
  @JsonProperty("randomBytesTotal")
  public Long getRandomBytesTotal() {
    return randomBytesTotal;
  }
  
  public void setRandomBytesTotal(Long randomBytesTotal) {
    this.randomBytesTotal = randomBytesTotal;
  }

  
  /**
   * The number of write operations that are delayed, waiting for cache flush.
   **/
  public VolumeCounterGroup cacheWriteWaitHitOps(Long cacheWriteWaitHitOps) {
    this.cacheWriteWaitHitOps = cacheWriteWaitHitOps;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The number of write operations that are delayed, waiting for cache flush.")
  @JsonProperty("cacheWriteWaitHitOps")
  public Long getCacheWriteWaitHitOps() {
    return cacheWriteWaitHitOps;
  }
  
  public void setCacheWriteWaitHitOps(Long cacheWriteWaitHitOps) {
    this.cacheWriteWaitHitOps = cacheWriteWaitHitOps;
  }

  
  /**
   * Bytes written that are categorized as Full stripe writes.
   **/
  public VolumeCounterGroup fullStripeWritesBytes(Long fullStripeWritesBytes) {
    this.fullStripeWritesBytes = fullStripeWritesBytes;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Bytes written that are categorized as Full stripe writes.")
  @JsonProperty("fullStripeWritesBytes")
  public Long getFullStripeWritesBytes() {
    return fullStripeWritesBytes;
  }
  
  public void setFullStripeWritesBytes(Long fullStripeWritesBytes) {
    this.fullStripeWritesBytes = fullStripeWritesBytes;
  }

  
  /**
   * Total number of IOs shipped to this volume.
   **/
  public VolumeCounterGroup totalIosShipped(Long totalIosShipped) {
    this.totalIosShipped = totalIosShipped;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Total number of IOs shipped to this volume.")
  @JsonProperty("totalIosShipped")
  public Long getTotalIosShipped() {
    return totalIosShipped;
  }
  
  public void setTotalIosShipped(Long totalIosShipped) {
    this.totalIosShipped = totalIosShipped;
  }

  
  /**
   * Total number of cache blocks evicted by this volume.
   **/
  public VolumeCounterGroup totalBlksEvicted(Long totalBlksEvicted) {
    this.totalBlksEvicted = totalBlksEvicted;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Total number of cache blocks evicted by this volume.")
  @JsonProperty("totalBlksEvicted")
  public Long getTotalBlksEvicted() {
    return totalBlksEvicted;
  }
  
  public void setTotalBlksEvicted(Long totalBlksEvicted) {
    this.totalBlksEvicted = totalBlksEvicted;
  }

  
  /**
   * Number of cache blocks in use by this volume.
   **/
  public VolumeCounterGroup cacheBlksInUse(Long cacheBlksInUse) {
    this.cacheBlksInUse = cacheBlksInUse;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Number of cache blocks in use by this volume.")
  @JsonProperty("cacheBlksInUse")
  public Long getCacheBlksInUse() {
    return cacheBlksInUse;
  }
  
  public void setCacheBlksInUse(Long cacheBlksInUse) {
    this.cacheBlksInUse = cacheBlksInUse;
  }

  
  /**
   * The number of bytes in write operations that were delayed waiting for cache flush.
   **/
  public VolumeCounterGroup cacheWriteWaitHitBytes(Long cacheWriteWaitHitBytes) {
    this.cacheWriteWaitHitBytes = cacheWriteWaitHitBytes;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The number of bytes in write operations that were delayed waiting for cache flush.")
  @JsonProperty("cacheWriteWaitHitBytes")
  public Long getCacheWriteWaitHitBytes() {
    return cacheWriteWaitHitBytes;
  }
  
  public void setCacheWriteWaitHitBytes(Long cacheWriteWaitHitBytes) {
    this.cacheWriteWaitHitBytes = cacheWriteWaitHitBytes;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VolumeCounterGroup volumeCounterGroup = (VolumeCounterGroup) o;
    return Objects.equals(this.controllerRef, volumeCounterGroup.controllerRef) &&
        Objects.equals(this.baseTime, volumeCounterGroup.baseTime) &&
        Objects.equals(this.readHitOps, volumeCounterGroup.readHitOps) &&
        Objects.equals(this.readHitBytes, volumeCounterGroup.readHitBytes) &&
        Objects.equals(this.readHitTimeTotal, volumeCounterGroup.readHitTimeTotal) &&
        Objects.equals(this.readHitTimeMax, volumeCounterGroup.readHitTimeMax) &&
        Objects.equals(this.readOps, volumeCounterGroup.readOps) &&
        Objects.equals(this.readBytes, volumeCounterGroup.readBytes) &&
        Objects.equals(this.readTimeTotal, volumeCounterGroup.readTimeTotal) &&
        Objects.equals(this.readTimeMax, volumeCounterGroup.readTimeMax) &&
        Objects.equals(this.writeHitOps, volumeCounterGroup.writeHitOps) &&
        Objects.equals(this.writeHitBytes, volumeCounterGroup.writeHitBytes) &&
        Objects.equals(this.writeHitTimeTotal, volumeCounterGroup.writeHitTimeTotal) &&
        Objects.equals(this.writeHitTimeMax, volumeCounterGroup.writeHitTimeMax) &&
        Objects.equals(this.writeOps, volumeCounterGroup.writeOps) &&
        Objects.equals(this.writeBytes, volumeCounterGroup.writeBytes) &&
        Objects.equals(this.writeTimeTotal, volumeCounterGroup.writeTimeTotal) &&
        Objects.equals(this.writeTimeMax, volumeCounterGroup.writeTimeMax) &&
        Objects.equals(this.otherOps, volumeCounterGroup.otherOps) &&
        Objects.equals(this.otherTimeTotal, volumeCounterGroup.otherTimeTotal) &&
        Objects.equals(this.otherTimeMax, volumeCounterGroup.otherTimeMax) &&
        Objects.equals(this.idleTime, volumeCounterGroup.idleTime) &&
        Objects.equals(this.errRedundancyChkUnrecoveredReads, volumeCounterGroup.errRedundancyChkUnrecoveredReads) &&
        Objects.equals(this.errRedundancyChkRecoveredReads, volumeCounterGroup.errRedundancyChkRecoveredReads) &&
        Objects.equals(this.errRedundancyChkIndeterminateReads, volumeCounterGroup.errRedundancyChkIndeterminateReads) &&
        Objects.equals(this.readHitTimeTotalSq, volumeCounterGroup.readHitTimeTotalSq) &&
        Objects.equals(this.readTimeTotalSq, volumeCounterGroup.readTimeTotalSq) &&
        Objects.equals(this.writeHitTimeTotalSq, volumeCounterGroup.writeHitTimeTotalSq) &&
        Objects.equals(this.writeTimeTotalSq, volumeCounterGroup.writeTimeTotalSq) &&
        Objects.equals(this.otherTimeTotalSq, volumeCounterGroup.otherTimeTotalSq) &&
        Objects.equals(this.flashCacheReadHitOps, volumeCounterGroup.flashCacheReadHitOps) &&
        Objects.equals(this.flashCacheReadHitBytes, volumeCounterGroup.flashCacheReadHitBytes) &&
        Objects.equals(this.flashCacheReadHitTimeTotal, volumeCounterGroup.flashCacheReadHitTimeTotal) &&
        Objects.equals(this.flashCacheReadHitTimeMax, volumeCounterGroup.flashCacheReadHitTimeMax) &&
        Objects.equals(this.flashCacheReadHitTimeTotalSq, volumeCounterGroup.flashCacheReadHitTimeTotalSq) &&
        Objects.equals(this.prefetchHitBytes, volumeCounterGroup.prefetchHitBytes) &&
        Objects.equals(this.prefetchMissBytes, volumeCounterGroup.prefetchMissBytes) &&
        Objects.equals(this.startTime, volumeCounterGroup.startTime) &&
        Objects.equals(this.observedTime, volumeCounterGroup.observedTime) &&
        Objects.equals(this.queueDepthTotal, volumeCounterGroup.queueDepthTotal) &&
        Objects.equals(this.queueDepthMax, volumeCounterGroup.queueDepthMax) &&
        Objects.equals(this.randomIosTotal, volumeCounterGroup.randomIosTotal) &&
        Objects.equals(this.randomBytesTotal, volumeCounterGroup.randomBytesTotal) &&
        Objects.equals(this.cacheWriteWaitHitOps, volumeCounterGroup.cacheWriteWaitHitOps) &&
        Objects.equals(this.fullStripeWritesBytes, volumeCounterGroup.fullStripeWritesBytes) &&
        Objects.equals(this.totalIosShipped, volumeCounterGroup.totalIosShipped) &&
        Objects.equals(this.totalBlksEvicted, volumeCounterGroup.totalBlksEvicted) &&
        Objects.equals(this.cacheBlksInUse, volumeCounterGroup.cacheBlksInUse) &&
        Objects.equals(this.cacheWriteWaitHitBytes, volumeCounterGroup.cacheWriteWaitHitBytes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(controllerRef, baseTime, readHitOps, readHitBytes, readHitTimeTotal, readHitTimeMax, readOps, readBytes, readTimeTotal, readTimeMax, writeHitOps, writeHitBytes, writeHitTimeTotal, writeHitTimeMax, writeOps, writeBytes, writeTimeTotal, writeTimeMax, otherOps, otherTimeTotal, otherTimeMax, idleTime, errRedundancyChkUnrecoveredReads, errRedundancyChkRecoveredReads, errRedundancyChkIndeterminateReads, readHitTimeTotalSq, readTimeTotalSq, writeHitTimeTotalSq, writeTimeTotalSq, otherTimeTotalSq, flashCacheReadHitOps, flashCacheReadHitBytes, flashCacheReadHitTimeTotal, flashCacheReadHitTimeMax, flashCacheReadHitTimeTotalSq, prefetchHitBytes, prefetchMissBytes, startTime, observedTime, queueDepthTotal, queueDepthMax, randomIosTotal, randomBytesTotal, cacheWriteWaitHitOps, fullStripeWritesBytes, totalIosShipped, totalBlksEvicted, cacheBlksInUse, cacheWriteWaitHitBytes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VolumeCounterGroup {\n");
    
    sb.append("    controllerRef: ").append(toIndentedString(controllerRef)).append("\n");
    sb.append("    baseTime: ").append(toIndentedString(baseTime)).append("\n");
    sb.append("    readHitOps: ").append(toIndentedString(readHitOps)).append("\n");
    sb.append("    readHitBytes: ").append(toIndentedString(readHitBytes)).append("\n");
    sb.append("    readHitTimeTotal: ").append(toIndentedString(readHitTimeTotal)).append("\n");
    sb.append("    readHitTimeMax: ").append(toIndentedString(readHitTimeMax)).append("\n");
    sb.append("    readOps: ").append(toIndentedString(readOps)).append("\n");
    sb.append("    readBytes: ").append(toIndentedString(readBytes)).append("\n");
    sb.append("    readTimeTotal: ").append(toIndentedString(readTimeTotal)).append("\n");
    sb.append("    readTimeMax: ").append(toIndentedString(readTimeMax)).append("\n");
    sb.append("    writeHitOps: ").append(toIndentedString(writeHitOps)).append("\n");
    sb.append("    writeHitBytes: ").append(toIndentedString(writeHitBytes)).append("\n");
    sb.append("    writeHitTimeTotal: ").append(toIndentedString(writeHitTimeTotal)).append("\n");
    sb.append("    writeHitTimeMax: ").append(toIndentedString(writeHitTimeMax)).append("\n");
    sb.append("    writeOps: ").append(toIndentedString(writeOps)).append("\n");
    sb.append("    writeBytes: ").append(toIndentedString(writeBytes)).append("\n");
    sb.append("    writeTimeTotal: ").append(toIndentedString(writeTimeTotal)).append("\n");
    sb.append("    writeTimeMax: ").append(toIndentedString(writeTimeMax)).append("\n");
    sb.append("    otherOps: ").append(toIndentedString(otherOps)).append("\n");
    sb.append("    otherTimeTotal: ").append(toIndentedString(otherTimeTotal)).append("\n");
    sb.append("    otherTimeMax: ").append(toIndentedString(otherTimeMax)).append("\n");
    sb.append("    idleTime: ").append(toIndentedString(idleTime)).append("\n");
    sb.append("    errRedundancyChkUnrecoveredReads: ").append(toIndentedString(errRedundancyChkUnrecoveredReads)).append("\n");
    sb.append("    errRedundancyChkRecoveredReads: ").append(toIndentedString(errRedundancyChkRecoveredReads)).append("\n");
    sb.append("    errRedundancyChkIndeterminateReads: ").append(toIndentedString(errRedundancyChkIndeterminateReads)).append("\n");
    sb.append("    readHitTimeTotalSq: ").append(toIndentedString(readHitTimeTotalSq)).append("\n");
    sb.append("    readTimeTotalSq: ").append(toIndentedString(readTimeTotalSq)).append("\n");
    sb.append("    writeHitTimeTotalSq: ").append(toIndentedString(writeHitTimeTotalSq)).append("\n");
    sb.append("    writeTimeTotalSq: ").append(toIndentedString(writeTimeTotalSq)).append("\n");
    sb.append("    otherTimeTotalSq: ").append(toIndentedString(otherTimeTotalSq)).append("\n");
    sb.append("    flashCacheReadHitOps: ").append(toIndentedString(flashCacheReadHitOps)).append("\n");
    sb.append("    flashCacheReadHitBytes: ").append(toIndentedString(flashCacheReadHitBytes)).append("\n");
    sb.append("    flashCacheReadHitTimeTotal: ").append(toIndentedString(flashCacheReadHitTimeTotal)).append("\n");
    sb.append("    flashCacheReadHitTimeMax: ").append(toIndentedString(flashCacheReadHitTimeMax)).append("\n");
    sb.append("    flashCacheReadHitTimeTotalSq: ").append(toIndentedString(flashCacheReadHitTimeTotalSq)).append("\n");
    sb.append("    prefetchHitBytes: ").append(toIndentedString(prefetchHitBytes)).append("\n");
    sb.append("    prefetchMissBytes: ").append(toIndentedString(prefetchMissBytes)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    observedTime: ").append(toIndentedString(observedTime)).append("\n");
    sb.append("    queueDepthTotal: ").append(toIndentedString(queueDepthTotal)).append("\n");
    sb.append("    queueDepthMax: ").append(toIndentedString(queueDepthMax)).append("\n");
    sb.append("    randomIosTotal: ").append(toIndentedString(randomIosTotal)).append("\n");
    sb.append("    randomBytesTotal: ").append(toIndentedString(randomBytesTotal)).append("\n");
    sb.append("    cacheWriteWaitHitOps: ").append(toIndentedString(cacheWriteWaitHitOps)).append("\n");
    sb.append("    fullStripeWritesBytes: ").append(toIndentedString(fullStripeWritesBytes)).append("\n");
    sb.append("    totalIosShipped: ").append(toIndentedString(totalIosShipped)).append("\n");
    sb.append("    totalBlksEvicted: ").append(toIndentedString(totalBlksEvicted)).append("\n");
    sb.append("    cacheBlksInUse: ").append(toIndentedString(cacheBlksInUse)).append("\n");
    sb.append("    cacheWriteWaitHitBytes: ").append(toIndentedString(cacheWriteWaitHitBytes)).append("\n");
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

