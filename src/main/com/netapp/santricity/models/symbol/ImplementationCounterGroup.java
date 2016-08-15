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
 * ImplementationCounterGroup
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2016-08-12T15:32:46.001-05:00")
public class ImplementationCounterGroup   {
  
    private String controllerRef;

    private Long baseTime;

    private Long readHitOps;

    private Long readHitBytes;

    private Long readHitTimeTotal;

    private Long readHitTimeMax;

    private Long readHitStripes;

    private Long readHitSegments;

    private Long readOps;

    private Long readBytes;

    private Long readTimeTotal;

    private Long readTimeMax;

    private Long readStripes;

    private Long readSegments;

    private Long writeHitOps;

    private Long writeHitBytes;

    private Long writeHitTimeTotal;

    private Long writeHitTimeMax;

    private Long writeHitStripes;

    private Long writeHitSegments;

    private Long writeOps;

    private Long writeBytes;

    private Long writeTimeTotal;

    private Long writeTimeMax;

    private Long writeStripes;

    private Long writeSegments;

    private Long otherOps;

    private Long otherTimeTotal;

    private Long otherTimeMax;

    private Long idleTime;

    private List<Long> writeOpsByAlgorithm;

    private Long readHitTimeTotalSq;

    private Long readTimeTotalSq;

    private Long writeHitTimeTotalSq;

    private Long writeTimeTotalSq;

    private Long otherTimeTotalSq;

    private Long errRedundancyChkUnrecoveredReads;

    private Long errRedundancyChkRecoveredReads;

    private Long errRedundancyChkIndeterminateReads;

    private Long flashCacheReadHitOps;

    private Long flashCacheReadHitBytes;

    private Long flashCacheReadHitTimeTotal;

    private Long flashCacheReadHitTimeMax;

    private Long flashCacheReadHitTimeTotalSq;

  
  /**
   * A reference to the controller that accumulated the counters for this group.
   **/
  public ImplementationCounterGroup controllerRef(String controllerRef) {
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
  public ImplementationCounterGroup baseTime(Long baseTime) {
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
  public ImplementationCounterGroup readHitOps(Long readHitOps) {
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
  public ImplementationCounterGroup readHitBytes(Long readHitBytes) {
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
  public ImplementationCounterGroup readHitTimeTotal(Long readHitTimeTotal) {
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
  public ImplementationCounterGroup readHitTimeMax(Long readHitTimeMax) {
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
   * The number of stripe reads that hit cache.
   **/
  public ImplementationCounterGroup readHitStripes(Long readHitStripes) {
    this.readHitStripes = readHitStripes;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The number of stripe reads that hit cache.")
  @JsonProperty("readHitStripes")
  public Long getReadHitStripes() {
    return readHitStripes;
  }
  
  public void setReadHitStripes(Long readHitStripes) {
    this.readHitStripes = readHitStripes;
  }

  
  /**
   * The number of segment reads that hit cache.
   **/
  public ImplementationCounterGroup readHitSegments(Long readHitSegments) {
    this.readHitSegments = readHitSegments;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The number of segment reads that hit cache.")
  @JsonProperty("readHitSegments")
  public Long getReadHitSegments() {
    return readHitSegments;
  }
  
  public void setReadHitSegments(Long readHitSegments) {
    this.readHitSegments = readHitSegments;
  }

  
  /**
   * The number of read operations.
   **/
  public ImplementationCounterGroup readOps(Long readOps) {
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
  public ImplementationCounterGroup readBytes(Long readBytes) {
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
  public ImplementationCounterGroup readTimeTotal(Long readTimeTotal) {
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
  public ImplementationCounterGroup readTimeMax(Long readTimeMax) {
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
   * The number of stripe reads.
   **/
  public ImplementationCounterGroup readStripes(Long readStripes) {
    this.readStripes = readStripes;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The number of stripe reads.")
  @JsonProperty("readStripes")
  public Long getReadStripes() {
    return readStripes;
  }
  
  public void setReadStripes(Long readStripes) {
    this.readStripes = readStripes;
  }

  
  /**
   * The number of segment reads.
   **/
  public ImplementationCounterGroup readSegments(Long readSegments) {
    this.readSegments = readSegments;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The number of segment reads.")
  @JsonProperty("readSegments")
  public Long getReadSegments() {
    return readSegments;
  }
  
  public void setReadSegments(Long readSegments) {
    this.readSegments = readSegments;
  }

  
  /**
   * The number of write operations that hit cache.
   **/
  public ImplementationCounterGroup writeHitOps(Long writeHitOps) {
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
  public ImplementationCounterGroup writeHitBytes(Long writeHitBytes) {
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
  public ImplementationCounterGroup writeHitTimeTotal(Long writeHitTimeTotal) {
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
  public ImplementationCounterGroup writeHitTimeMax(Long writeHitTimeMax) {
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
   * The number of stripe writes that hit cache.
   **/
  public ImplementationCounterGroup writeHitStripes(Long writeHitStripes) {
    this.writeHitStripes = writeHitStripes;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The number of stripe writes that hit cache.")
  @JsonProperty("writeHitStripes")
  public Long getWriteHitStripes() {
    return writeHitStripes;
  }
  
  public void setWriteHitStripes(Long writeHitStripes) {
    this.writeHitStripes = writeHitStripes;
  }

  
  /**
   * The number of segment writes that hit cache.
   **/
  public ImplementationCounterGroup writeHitSegments(Long writeHitSegments) {
    this.writeHitSegments = writeHitSegments;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The number of segment writes that hit cache.")
  @JsonProperty("writeHitSegments")
  public Long getWriteHitSegments() {
    return writeHitSegments;
  }
  
  public void setWriteHitSegments(Long writeHitSegments) {
    this.writeHitSegments = writeHitSegments;
  }

  
  /**
   * The number of write operations.
   **/
  public ImplementationCounterGroup writeOps(Long writeOps) {
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
  public ImplementationCounterGroup writeBytes(Long writeBytes) {
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
  public ImplementationCounterGroup writeTimeTotal(Long writeTimeTotal) {
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
  public ImplementationCounterGroup writeTimeMax(Long writeTimeMax) {
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
   * The number of stripe writes.
   **/
  public ImplementationCounterGroup writeStripes(Long writeStripes) {
    this.writeStripes = writeStripes;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The number of stripe writes.")
  @JsonProperty("writeStripes")
  public Long getWriteStripes() {
    return writeStripes;
  }
  
  public void setWriteStripes(Long writeStripes) {
    this.writeStripes = writeStripes;
  }

  
  /**
   * The number of segment writes.
   **/
  public ImplementationCounterGroup writeSegments(Long writeSegments) {
    this.writeSegments = writeSegments;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The number of segment writes.")
  @JsonProperty("writeSegments")
  public Long getWriteSegments() {
    return writeSegments;
  }
  
  public void setWriteSegments(Long writeSegments) {
    this.writeSegments = writeSegments;
  }

  
  /**
   * The number of non-read-write operations.
   **/
  public ImplementationCounterGroup otherOps(Long otherOps) {
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
  public ImplementationCounterGroup otherTimeTotal(Long otherTimeTotal) {
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
  public ImplementationCounterGroup otherTimeMax(Long otherTimeMax) {
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
  public ImplementationCounterGroup idleTime(Long idleTime) {
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
   * This field is used to record the number of write operations for a given RAID implementation algorithm. The algorithms are numbered 0..(NUMBER_OF_ALGORITHMS - 1). The actual algorithm represented by a given algorithm number depends on the RAID level of the object of interest. For RAID 0 objects, algorithm 0 is Single, Algorithm 2 is Complex, and Algorithm 3 is Fast. For RAID 3/5, Algorithm 0 is Full, Algorithm 1 is Partial, Algorithm 2 is RMW, Algorithm 3 is No Parity, and Algorithm 4 is Fast.
   **/
  public ImplementationCounterGroup writeOpsByAlgorithm(List<Long> writeOpsByAlgorithm) {
    this.writeOpsByAlgorithm = writeOpsByAlgorithm;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "This field is used to record the number of write operations for a given RAID implementation algorithm. The algorithms are numbered 0..(NUMBER_OF_ALGORITHMS - 1). The actual algorithm represented by a given algorithm number depends on the RAID level of the object of interest. For RAID 0 objects, algorithm 0 is Single, Algorithm 2 is Complex, and Algorithm 3 is Fast. For RAID 3/5, Algorithm 0 is Full, Algorithm 1 is Partial, Algorithm 2 is RMW, Algorithm 3 is No Parity, and Algorithm 4 is Fast.")
  @JsonProperty("writeOpsByAlgorithm")
  public List<Long> getWriteOpsByAlgorithm() {
    return writeOpsByAlgorithm;
  }
  
  public void setWriteOpsByAlgorithm(List<Long> writeOpsByAlgorithm) {
    this.writeOpsByAlgorithm = writeOpsByAlgorithm;
  }

  
  /**
   * The sum of the squares of microseconds spent in read operations that hit cache.
   **/
  public ImplementationCounterGroup readHitTimeTotalSq(Long readHitTimeTotalSq) {
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
  public ImplementationCounterGroup readTimeTotalSq(Long readTimeTotalSq) {
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
  public ImplementationCounterGroup writeHitTimeTotalSq(Long writeHitTimeTotalSq) {
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
  public ImplementationCounterGroup writeTimeTotalSq(Long writeTimeTotalSq) {
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
  public ImplementationCounterGroup otherTimeTotalSq(Long otherTimeTotalSq) {
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
   * The number of read requests that have failed due to redundancy group inconsistencies.
   **/
  public ImplementationCounterGroup errRedundancyChkUnrecoveredReads(Long errRedundancyChkUnrecoveredReads) {
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
  public ImplementationCounterGroup errRedundancyChkRecoveredReads(Long errRedundancyChkRecoveredReads) {
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
  public ImplementationCounterGroup errRedundancyChkIndeterminateReads(Long errRedundancyChkIndeterminateReads) {
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
   * The number of flash cache read hit operations.
   **/
  public ImplementationCounterGroup flashCacheReadHitOps(Long flashCacheReadHitOps) {
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
  public ImplementationCounterGroup flashCacheReadHitBytes(Long flashCacheReadHitBytes) {
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
   * The sum of all response times for all reads that have cache hits, in microseconds.
   **/
  public ImplementationCounterGroup flashCacheReadHitTimeTotal(Long flashCacheReadHitTimeTotal) {
    this.flashCacheReadHitTimeTotal = flashCacheReadHitTimeTotal;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The sum of all response times for all reads that have cache hits, in microseconds.")
  @JsonProperty("flashCacheReadHitTimeTotal")
  public Long getFlashCacheReadHitTimeTotal() {
    return flashCacheReadHitTimeTotal;
  }
  
  public void setFlashCacheReadHitTimeTotal(Long flashCacheReadHitTimeTotal) {
    this.flashCacheReadHitTimeTotal = flashCacheReadHitTimeTotal;
  }

  
  /**
   * Maximum I/O time in microseconds for any one read I/O that has a cache hit.
   **/
  public ImplementationCounterGroup flashCacheReadHitTimeMax(Long flashCacheReadHitTimeMax) {
    this.flashCacheReadHitTimeMax = flashCacheReadHitTimeMax;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Maximum I/O time in microseconds for any one read I/O that has a cache hit.")
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
  public ImplementationCounterGroup flashCacheReadHitTimeTotalSq(Long flashCacheReadHitTimeTotalSq) {
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

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ImplementationCounterGroup implementationCounterGroup = (ImplementationCounterGroup) o;
    return Objects.equals(this.controllerRef, implementationCounterGroup.controllerRef) &&
        Objects.equals(this.baseTime, implementationCounterGroup.baseTime) &&
        Objects.equals(this.readHitOps, implementationCounterGroup.readHitOps) &&
        Objects.equals(this.readHitBytes, implementationCounterGroup.readHitBytes) &&
        Objects.equals(this.readHitTimeTotal, implementationCounterGroup.readHitTimeTotal) &&
        Objects.equals(this.readHitTimeMax, implementationCounterGroup.readHitTimeMax) &&
        Objects.equals(this.readHitStripes, implementationCounterGroup.readHitStripes) &&
        Objects.equals(this.readHitSegments, implementationCounterGroup.readHitSegments) &&
        Objects.equals(this.readOps, implementationCounterGroup.readOps) &&
        Objects.equals(this.readBytes, implementationCounterGroup.readBytes) &&
        Objects.equals(this.readTimeTotal, implementationCounterGroup.readTimeTotal) &&
        Objects.equals(this.readTimeMax, implementationCounterGroup.readTimeMax) &&
        Objects.equals(this.readStripes, implementationCounterGroup.readStripes) &&
        Objects.equals(this.readSegments, implementationCounterGroup.readSegments) &&
        Objects.equals(this.writeHitOps, implementationCounterGroup.writeHitOps) &&
        Objects.equals(this.writeHitBytes, implementationCounterGroup.writeHitBytes) &&
        Objects.equals(this.writeHitTimeTotal, implementationCounterGroup.writeHitTimeTotal) &&
        Objects.equals(this.writeHitTimeMax, implementationCounterGroup.writeHitTimeMax) &&
        Objects.equals(this.writeHitStripes, implementationCounterGroup.writeHitStripes) &&
        Objects.equals(this.writeHitSegments, implementationCounterGroup.writeHitSegments) &&
        Objects.equals(this.writeOps, implementationCounterGroup.writeOps) &&
        Objects.equals(this.writeBytes, implementationCounterGroup.writeBytes) &&
        Objects.equals(this.writeTimeTotal, implementationCounterGroup.writeTimeTotal) &&
        Objects.equals(this.writeTimeMax, implementationCounterGroup.writeTimeMax) &&
        Objects.equals(this.writeStripes, implementationCounterGroup.writeStripes) &&
        Objects.equals(this.writeSegments, implementationCounterGroup.writeSegments) &&
        Objects.equals(this.otherOps, implementationCounterGroup.otherOps) &&
        Objects.equals(this.otherTimeTotal, implementationCounterGroup.otherTimeTotal) &&
        Objects.equals(this.otherTimeMax, implementationCounterGroup.otherTimeMax) &&
        Objects.equals(this.idleTime, implementationCounterGroup.idleTime) &&
        Objects.equals(this.writeOpsByAlgorithm, implementationCounterGroup.writeOpsByAlgorithm) &&
        Objects.equals(this.readHitTimeTotalSq, implementationCounterGroup.readHitTimeTotalSq) &&
        Objects.equals(this.readTimeTotalSq, implementationCounterGroup.readTimeTotalSq) &&
        Objects.equals(this.writeHitTimeTotalSq, implementationCounterGroup.writeHitTimeTotalSq) &&
        Objects.equals(this.writeTimeTotalSq, implementationCounterGroup.writeTimeTotalSq) &&
        Objects.equals(this.otherTimeTotalSq, implementationCounterGroup.otherTimeTotalSq) &&
        Objects.equals(this.errRedundancyChkUnrecoveredReads, implementationCounterGroup.errRedundancyChkUnrecoveredReads) &&
        Objects.equals(this.errRedundancyChkRecoveredReads, implementationCounterGroup.errRedundancyChkRecoveredReads) &&
        Objects.equals(this.errRedundancyChkIndeterminateReads, implementationCounterGroup.errRedundancyChkIndeterminateReads) &&
        Objects.equals(this.flashCacheReadHitOps, implementationCounterGroup.flashCacheReadHitOps) &&
        Objects.equals(this.flashCacheReadHitBytes, implementationCounterGroup.flashCacheReadHitBytes) &&
        Objects.equals(this.flashCacheReadHitTimeTotal, implementationCounterGroup.flashCacheReadHitTimeTotal) &&
        Objects.equals(this.flashCacheReadHitTimeMax, implementationCounterGroup.flashCacheReadHitTimeMax) &&
        Objects.equals(this.flashCacheReadHitTimeTotalSq, implementationCounterGroup.flashCacheReadHitTimeTotalSq);
  }

  @Override
  public int hashCode() {
    return Objects.hash(controllerRef, baseTime, readHitOps, readHitBytes, readHitTimeTotal, readHitTimeMax, readHitStripes, readHitSegments, readOps, readBytes, readTimeTotal, readTimeMax, readStripes, readSegments, writeHitOps, writeHitBytes, writeHitTimeTotal, writeHitTimeMax, writeHitStripes, writeHitSegments, writeOps, writeBytes, writeTimeTotal, writeTimeMax, writeStripes, writeSegments, otherOps, otherTimeTotal, otherTimeMax, idleTime, writeOpsByAlgorithm, readHitTimeTotalSq, readTimeTotalSq, writeHitTimeTotalSq, writeTimeTotalSq, otherTimeTotalSq, errRedundancyChkUnrecoveredReads, errRedundancyChkRecoveredReads, errRedundancyChkIndeterminateReads, flashCacheReadHitOps, flashCacheReadHitBytes, flashCacheReadHitTimeTotal, flashCacheReadHitTimeMax, flashCacheReadHitTimeTotalSq);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ImplementationCounterGroup {\n");
    
    sb.append("    controllerRef: ").append(toIndentedString(controllerRef)).append("\n");
    sb.append("    baseTime: ").append(toIndentedString(baseTime)).append("\n");
    sb.append("    readHitOps: ").append(toIndentedString(readHitOps)).append("\n");
    sb.append("    readHitBytes: ").append(toIndentedString(readHitBytes)).append("\n");
    sb.append("    readHitTimeTotal: ").append(toIndentedString(readHitTimeTotal)).append("\n");
    sb.append("    readHitTimeMax: ").append(toIndentedString(readHitTimeMax)).append("\n");
    sb.append("    readHitStripes: ").append(toIndentedString(readHitStripes)).append("\n");
    sb.append("    readHitSegments: ").append(toIndentedString(readHitSegments)).append("\n");
    sb.append("    readOps: ").append(toIndentedString(readOps)).append("\n");
    sb.append("    readBytes: ").append(toIndentedString(readBytes)).append("\n");
    sb.append("    readTimeTotal: ").append(toIndentedString(readTimeTotal)).append("\n");
    sb.append("    readTimeMax: ").append(toIndentedString(readTimeMax)).append("\n");
    sb.append("    readStripes: ").append(toIndentedString(readStripes)).append("\n");
    sb.append("    readSegments: ").append(toIndentedString(readSegments)).append("\n");
    sb.append("    writeHitOps: ").append(toIndentedString(writeHitOps)).append("\n");
    sb.append("    writeHitBytes: ").append(toIndentedString(writeHitBytes)).append("\n");
    sb.append("    writeHitTimeTotal: ").append(toIndentedString(writeHitTimeTotal)).append("\n");
    sb.append("    writeHitTimeMax: ").append(toIndentedString(writeHitTimeMax)).append("\n");
    sb.append("    writeHitStripes: ").append(toIndentedString(writeHitStripes)).append("\n");
    sb.append("    writeHitSegments: ").append(toIndentedString(writeHitSegments)).append("\n");
    sb.append("    writeOps: ").append(toIndentedString(writeOps)).append("\n");
    sb.append("    writeBytes: ").append(toIndentedString(writeBytes)).append("\n");
    sb.append("    writeTimeTotal: ").append(toIndentedString(writeTimeTotal)).append("\n");
    sb.append("    writeTimeMax: ").append(toIndentedString(writeTimeMax)).append("\n");
    sb.append("    writeStripes: ").append(toIndentedString(writeStripes)).append("\n");
    sb.append("    writeSegments: ").append(toIndentedString(writeSegments)).append("\n");
    sb.append("    otherOps: ").append(toIndentedString(otherOps)).append("\n");
    sb.append("    otherTimeTotal: ").append(toIndentedString(otherTimeTotal)).append("\n");
    sb.append("    otherTimeMax: ").append(toIndentedString(otherTimeMax)).append("\n");
    sb.append("    idleTime: ").append(toIndentedString(idleTime)).append("\n");
    sb.append("    writeOpsByAlgorithm: ").append(toIndentedString(writeOpsByAlgorithm)).append("\n");
    sb.append("    readHitTimeTotalSq: ").append(toIndentedString(readHitTimeTotalSq)).append("\n");
    sb.append("    readTimeTotalSq: ").append(toIndentedString(readTimeTotalSq)).append("\n");
    sb.append("    writeHitTimeTotalSq: ").append(toIndentedString(writeHitTimeTotalSq)).append("\n");
    sb.append("    writeTimeTotalSq: ").append(toIndentedString(writeTimeTotalSq)).append("\n");
    sb.append("    otherTimeTotalSq: ").append(toIndentedString(otherTimeTotalSq)).append("\n");
    sb.append("    errRedundancyChkUnrecoveredReads: ").append(toIndentedString(errRedundancyChkUnrecoveredReads)).append("\n");
    sb.append("    errRedundancyChkRecoveredReads: ").append(toIndentedString(errRedundancyChkRecoveredReads)).append("\n");
    sb.append("    errRedundancyChkIndeterminateReads: ").append(toIndentedString(errRedundancyChkIndeterminateReads)).append("\n");
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

