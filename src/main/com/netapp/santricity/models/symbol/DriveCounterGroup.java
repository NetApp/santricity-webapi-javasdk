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
 * DriveCounterGroup
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2017-10-04T15:05:55.769-05:00")
public class DriveCounterGroup   {
  
    private String controllerRef;

    private Long baseTime;

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

    private Long idleTime;

    private Long recoveredErrors;

    private Long unrecoveredErrors;

    private Long timeouts;

    private Long retriedIos;

    private Long readTimeTotalSq;

    private Long writeTimeTotalSq;

    private Long otherTimeTotalSq;

    private Long startTime;

    private Long observedTime;

    private Long queueDepthTotal;

    private Long queueDepthMax;

    private Long randomIosTotal;

    private Long randomBytesTotal;

    private Long cumulativeLBA;

    private Long cumulativeDeltaLBA;

  
  /**
   * A reference to the controller that accumulated the counters for this group.
   **/
  public DriveCounterGroup controllerRef(String controllerRef) {
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
  public DriveCounterGroup baseTime(Long baseTime) {
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
   * The number of read operations.
   **/
  public DriveCounterGroup readOps(Long readOps) {
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
  public DriveCounterGroup readBytes(Long readBytes) {
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
  public DriveCounterGroup readTimeTotal(Long readTimeTotal) {
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
  public DriveCounterGroup readTimeMax(Long readTimeMax) {
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
   * The number of write operations.
   **/
  public DriveCounterGroup writeOps(Long writeOps) {
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
  public DriveCounterGroup writeBytes(Long writeBytes) {
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
  public DriveCounterGroup writeTimeTotal(Long writeTimeTotal) {
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
  public DriveCounterGroup writeTimeMax(Long writeTimeMax) {
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
  public DriveCounterGroup otherOps(Long otherOps) {
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
  public DriveCounterGroup otherTimeTotal(Long otherTimeTotal) {
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
  public DriveCounterGroup otherTimeMax(Long otherTimeMax) {
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
  public DriveCounterGroup idleTime(Long idleTime) {
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
   * The number of recovered errors.
   **/
  public DriveCounterGroup recoveredErrors(Long recoveredErrors) {
    this.recoveredErrors = recoveredErrors;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The number of recovered errors.")
  @JsonProperty("recoveredErrors")
  public Long getRecoveredErrors() {
    return recoveredErrors;
  }
  
  public void setRecoveredErrors(Long recoveredErrors) {
    this.recoveredErrors = recoveredErrors;
  }

  
  /**
   * The number of unrecovered errors.
   **/
  public DriveCounterGroup unrecoveredErrors(Long unrecoveredErrors) {
    this.unrecoveredErrors = unrecoveredErrors;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The number of unrecovered errors.")
  @JsonProperty("unrecoveredErrors")
  public Long getUnrecoveredErrors() {
    return unrecoveredErrors;
  }
  
  public void setUnrecoveredErrors(Long unrecoveredErrors) {
    this.unrecoveredErrors = unrecoveredErrors;
  }

  
  /**
   * The number of timeouts.
   **/
  public DriveCounterGroup timeouts(Long timeouts) {
    this.timeouts = timeouts;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The number of timeouts.")
  @JsonProperty("timeouts")
  public Long getTimeouts() {
    return timeouts;
  }
  
  public void setTimeouts(Long timeouts) {
    this.timeouts = timeouts;
  }

  
  /**
   * The number of retried I/O operations.
   **/
  public DriveCounterGroup retriedIos(Long retriedIos) {
    this.retriedIos = retriedIos;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The number of retried I/O operations.")
  @JsonProperty("retriedIos")
  public Long getRetriedIos() {
    return retriedIos;
  }
  
  public void setRetriedIos(Long retriedIos) {
    this.retriedIos = retriedIos;
  }

  
  /**
   * The sum of the squares of microseconds spent in read operations.
   **/
  public DriveCounterGroup readTimeTotalSq(Long readTimeTotalSq) {
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
   * The sum of the squares of microseconds spent in write operations.
   **/
  public DriveCounterGroup writeTimeTotalSq(Long writeTimeTotalSq) {
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
  public DriveCounterGroup otherTimeTotalSq(Long otherTimeTotalSq) {
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
   * Start time for this collection as measured by the number of seconds since baseTime.
   **/
  public DriveCounterGroup startTime(Long startTime) {
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
  public DriveCounterGroup observedTime(Long observedTime) {
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
  public DriveCounterGroup queueDepthTotal(Long queueDepthTotal) {
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
  public DriveCounterGroup queueDepthMax(Long queueDepthMax) {
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
  public DriveCounterGroup randomIosTotal(Long randomIosTotal) {
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
  public DriveCounterGroup randomBytesTotal(Long randomBytesTotal) {
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
   * Sum of LBA's accessed from the drive within an observation interval.
   **/
  public DriveCounterGroup cumulativeLBA(Long cumulativeLBA) {
    this.cumulativeLBA = cumulativeLBA;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Sum of LBA's accessed from the drive within an observation interval.")
  @JsonProperty("cumulativeLBA")
  public Long getCumulativeLBA() {
    return cumulativeLBA;
  }
  
  public void setCumulativeLBA(Long cumulativeLBA) {
    this.cumulativeLBA = cumulativeLBA;
  }

  
  /**
   * Sum of LBA shifts accessed from the drive within an observation interval.
   **/
  public DriveCounterGroup cumulativeDeltaLBA(Long cumulativeDeltaLBA) {
    this.cumulativeDeltaLBA = cumulativeDeltaLBA;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Sum of LBA shifts accessed from the drive within an observation interval.")
  @JsonProperty("cumulativeDeltaLBA")
  public Long getCumulativeDeltaLBA() {
    return cumulativeDeltaLBA;
  }
  
  public void setCumulativeDeltaLBA(Long cumulativeDeltaLBA) {
    this.cumulativeDeltaLBA = cumulativeDeltaLBA;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DriveCounterGroup driveCounterGroup = (DriveCounterGroup) o;
    return Objects.equals(this.controllerRef, driveCounterGroup.controllerRef) &&
        Objects.equals(this.baseTime, driveCounterGroup.baseTime) &&
        Objects.equals(this.readOps, driveCounterGroup.readOps) &&
        Objects.equals(this.readBytes, driveCounterGroup.readBytes) &&
        Objects.equals(this.readTimeTotal, driveCounterGroup.readTimeTotal) &&
        Objects.equals(this.readTimeMax, driveCounterGroup.readTimeMax) &&
        Objects.equals(this.writeOps, driveCounterGroup.writeOps) &&
        Objects.equals(this.writeBytes, driveCounterGroup.writeBytes) &&
        Objects.equals(this.writeTimeTotal, driveCounterGroup.writeTimeTotal) &&
        Objects.equals(this.writeTimeMax, driveCounterGroup.writeTimeMax) &&
        Objects.equals(this.otherOps, driveCounterGroup.otherOps) &&
        Objects.equals(this.otherTimeTotal, driveCounterGroup.otherTimeTotal) &&
        Objects.equals(this.otherTimeMax, driveCounterGroup.otherTimeMax) &&
        Objects.equals(this.idleTime, driveCounterGroup.idleTime) &&
        Objects.equals(this.recoveredErrors, driveCounterGroup.recoveredErrors) &&
        Objects.equals(this.unrecoveredErrors, driveCounterGroup.unrecoveredErrors) &&
        Objects.equals(this.timeouts, driveCounterGroup.timeouts) &&
        Objects.equals(this.retriedIos, driveCounterGroup.retriedIos) &&
        Objects.equals(this.readTimeTotalSq, driveCounterGroup.readTimeTotalSq) &&
        Objects.equals(this.writeTimeTotalSq, driveCounterGroup.writeTimeTotalSq) &&
        Objects.equals(this.otherTimeTotalSq, driveCounterGroup.otherTimeTotalSq) &&
        Objects.equals(this.startTime, driveCounterGroup.startTime) &&
        Objects.equals(this.observedTime, driveCounterGroup.observedTime) &&
        Objects.equals(this.queueDepthTotal, driveCounterGroup.queueDepthTotal) &&
        Objects.equals(this.queueDepthMax, driveCounterGroup.queueDepthMax) &&
        Objects.equals(this.randomIosTotal, driveCounterGroup.randomIosTotal) &&
        Objects.equals(this.randomBytesTotal, driveCounterGroup.randomBytesTotal) &&
        Objects.equals(this.cumulativeLBA, driveCounterGroup.cumulativeLBA) &&
        Objects.equals(this.cumulativeDeltaLBA, driveCounterGroup.cumulativeDeltaLBA);
  }

  @Override
  public int hashCode() {
    return Objects.hash(controllerRef, baseTime, readOps, readBytes, readTimeTotal, readTimeMax, writeOps, writeBytes, writeTimeTotal, writeTimeMax, otherOps, otherTimeTotal, otherTimeMax, idleTime, recoveredErrors, unrecoveredErrors, timeouts, retriedIos, readTimeTotalSq, writeTimeTotalSq, otherTimeTotalSq, startTime, observedTime, queueDepthTotal, queueDepthMax, randomIosTotal, randomBytesTotal, cumulativeLBA, cumulativeDeltaLBA);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DriveCounterGroup {\n");
    
    sb.append("    controllerRef: ").append(toIndentedString(controllerRef)).append("\n");
    sb.append("    baseTime: ").append(toIndentedString(baseTime)).append("\n");
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
    sb.append("    idleTime: ").append(toIndentedString(idleTime)).append("\n");
    sb.append("    recoveredErrors: ").append(toIndentedString(recoveredErrors)).append("\n");
    sb.append("    unrecoveredErrors: ").append(toIndentedString(unrecoveredErrors)).append("\n");
    sb.append("    timeouts: ").append(toIndentedString(timeouts)).append("\n");
    sb.append("    retriedIos: ").append(toIndentedString(retriedIos)).append("\n");
    sb.append("    readTimeTotalSq: ").append(toIndentedString(readTimeTotalSq)).append("\n");
    sb.append("    writeTimeTotalSq: ").append(toIndentedString(writeTimeTotalSq)).append("\n");
    sb.append("    otherTimeTotalSq: ").append(toIndentedString(otherTimeTotalSq)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    observedTime: ").append(toIndentedString(observedTime)).append("\n");
    sb.append("    queueDepthTotal: ").append(toIndentedString(queueDepthTotal)).append("\n");
    sb.append("    queueDepthMax: ").append(toIndentedString(queueDepthMax)).append("\n");
    sb.append("    randomIosTotal: ").append(toIndentedString(randomIosTotal)).append("\n");
    sb.append("    randomBytesTotal: ").append(toIndentedString(randomBytesTotal)).append("\n");
    sb.append("    cumulativeLBA: ").append(toIndentedString(cumulativeLBA)).append("\n");
    sb.append("    cumulativeDeltaLBA: ").append(toIndentedString(cumulativeDeltaLBA)).append("\n");
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

