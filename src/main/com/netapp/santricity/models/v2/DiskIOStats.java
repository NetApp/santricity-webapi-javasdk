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
 * Drive I/O performance statistics. Note: the DELETE method clears all statistics  for all drives.
 */
@ApiModel(description = "Drive I/O performance statistics. Note: the DELETE method clears all statistics  for all drives.")
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2017-10-04T15:05:52.333-05:00")
public class DiskIOStats   {
  
    private Date observedTime;

    private Long observedTimeInMS;

    private Date lastResetTime;

    private Long lastResetTimeInMS;

    private String diskId;

    private String serialNumber;

    private String arrayId;

    private String arrayWWN;

    private String driveWWN;

    private String volGroupId;

    private String volGroupName;

    private String volGroupWWN;

    private String trayId;

    private Integer slot;

    private String diskManufacture;

    private String diskSoftwareVersion;

    private Double idleTime;

    private Double otherOps;

    private Double otherTimeMax;

    private Double otherTimeTotal;

    private Double otherTimeTotalSq;

    private Double readBytes;

    private Double readOps;

    private Double readTimeMax;

    private Double readTimeTotal;

    private Double readTimeTotalSq;

    private Double recoveredErrors;

    private Double retriedIos;

    private Double timeouts;

    private Double unrecoveredErrors;

    private Double writeBytes;

    private Double writeOps;

    private Double writeTimeMax;

    private Double writeTimeTotal;

    private Double writeTimeTotalSq;

    private Double queueDepthTotal;

    private Double queueDepthMax;

    private Double randomIosTotal;

    private Double randomBytesTotal;

    private Double cumulativeLBA;

    private Double cumulativeDeltaLBA;

  
  /**
   * End time for this collection as measured by the number of seconds since baseTime.
   **/
  public DiskIOStats observedTime(Date observedTime) {
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
  public DiskIOStats observedTimeInMS(Long observedTimeInMS) {
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
  public DiskIOStats lastResetTime(Date lastResetTime) {
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
  public DiskIOStats lastResetTimeInMS(Long lastResetTimeInMS) {
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
  public DiskIOStats diskId(String diskId) {
    this.diskId = diskId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("diskId")
  public String getDiskId() {
    return diskId;
  }
  
  public void setDiskId(String diskId) {
    this.diskId = diskId;
  }

  
  /**
   **/
  public DiskIOStats serialNumber(String serialNumber) {
    this.serialNumber = serialNumber;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("serialNumber")
  public String getSerialNumber() {
    return serialNumber;
  }
  
  public void setSerialNumber(String serialNumber) {
    this.serialNumber = serialNumber;
  }

  
  /**
   **/
  public DiskIOStats arrayId(String arrayId) {
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
  public DiskIOStats arrayWWN(String arrayWWN) {
    this.arrayWWN = arrayWWN;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("arrayWWN")
  public String getArrayWWN() {
    return arrayWWN;
  }
  
  public void setArrayWWN(String arrayWWN) {
    this.arrayWWN = arrayWWN;
  }

  
  /**
   **/
  public DiskIOStats driveWWN(String driveWWN) {
    this.driveWWN = driveWWN;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("driveWWN")
  public String getDriveWWN() {
    return driveWWN;
  }
  
  public void setDriveWWN(String driveWWN) {
    this.driveWWN = driveWWN;
  }

  
  /**
   **/
  public DiskIOStats volGroupId(String volGroupId) {
    this.volGroupId = volGroupId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("volGroupId")
  public String getVolGroupId() {
    return volGroupId;
  }
  
  public void setVolGroupId(String volGroupId) {
    this.volGroupId = volGroupId;
  }

  
  /**
   **/
  public DiskIOStats volGroupName(String volGroupName) {
    this.volGroupName = volGroupName;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("volGroupName")
  public String getVolGroupName() {
    return volGroupName;
  }
  
  public void setVolGroupName(String volGroupName) {
    this.volGroupName = volGroupName;
  }

  
  /**
   **/
  public DiskIOStats volGroupWWN(String volGroupWWN) {
    this.volGroupWWN = volGroupWWN;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("volGroupWWN")
  public String getVolGroupWWN() {
    return volGroupWWN;
  }
  
  public void setVolGroupWWN(String volGroupWWN) {
    this.volGroupWWN = volGroupWWN;
  }

  
  /**
   **/
  public DiskIOStats trayId(String trayId) {
    this.trayId = trayId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("trayId")
  public String getTrayId() {
    return trayId;
  }
  
  public void setTrayId(String trayId) {
    this.trayId = trayId;
  }

  
  /**
   **/
  public DiskIOStats slot(Integer slot) {
    this.slot = slot;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("slot")
  public Integer getSlot() {
    return slot;
  }
  
  public void setSlot(Integer slot) {
    this.slot = slot;
  }

  
  /**
   **/
  public DiskIOStats diskManufacture(String diskManufacture) {
    this.diskManufacture = diskManufacture;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("diskManufacture")
  public String getDiskManufacture() {
    return diskManufacture;
  }
  
  public void setDiskManufacture(String diskManufacture) {
    this.diskManufacture = diskManufacture;
  }

  
  /**
   **/
  public DiskIOStats diskSoftwareVersion(String diskSoftwareVersion) {
    this.diskSoftwareVersion = diskSoftwareVersion;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("diskSoftwareVersion")
  public String getDiskSoftwareVersion() {
    return diskSoftwareVersion;
  }
  
  public void setDiskSoftwareVersion(String diskSoftwareVersion) {
    this.diskSoftwareVersion = diskSoftwareVersion;
  }

  
  /**
   **/
  public DiskIOStats idleTime(Double idleTime) {
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
  public DiskIOStats otherOps(Double otherOps) {
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
  public DiskIOStats otherTimeMax(Double otherTimeMax) {
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
  public DiskIOStats otherTimeTotal(Double otherTimeTotal) {
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
  public DiskIOStats otherTimeTotalSq(Double otherTimeTotalSq) {
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
  public DiskIOStats readBytes(Double readBytes) {
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
  public DiskIOStats readOps(Double readOps) {
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
  public DiskIOStats readTimeMax(Double readTimeMax) {
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
  public DiskIOStats readTimeTotal(Double readTimeTotal) {
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
  public DiskIOStats readTimeTotalSq(Double readTimeTotalSq) {
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
  public DiskIOStats recoveredErrors(Double recoveredErrors) {
    this.recoveredErrors = recoveredErrors;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("recoveredErrors")
  public Double getRecoveredErrors() {
    return recoveredErrors;
  }
  
  public void setRecoveredErrors(Double recoveredErrors) {
    this.recoveredErrors = recoveredErrors;
  }

  
  /**
   **/
  public DiskIOStats retriedIos(Double retriedIos) {
    this.retriedIos = retriedIos;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("retriedIos")
  public Double getRetriedIos() {
    return retriedIos;
  }
  
  public void setRetriedIos(Double retriedIos) {
    this.retriedIos = retriedIos;
  }

  
  /**
   **/
  public DiskIOStats timeouts(Double timeouts) {
    this.timeouts = timeouts;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("timeouts")
  public Double getTimeouts() {
    return timeouts;
  }
  
  public void setTimeouts(Double timeouts) {
    this.timeouts = timeouts;
  }

  
  /**
   **/
  public DiskIOStats unrecoveredErrors(Double unrecoveredErrors) {
    this.unrecoveredErrors = unrecoveredErrors;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("unrecoveredErrors")
  public Double getUnrecoveredErrors() {
    return unrecoveredErrors;
  }
  
  public void setUnrecoveredErrors(Double unrecoveredErrors) {
    this.unrecoveredErrors = unrecoveredErrors;
  }

  
  /**
   **/
  public DiskIOStats writeBytes(Double writeBytes) {
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
   **/
  public DiskIOStats writeOps(Double writeOps) {
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
   **/
  public DiskIOStats writeTimeMax(Double writeTimeMax) {
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
  public DiskIOStats writeTimeTotal(Double writeTimeTotal) {
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
  public DiskIOStats writeTimeTotalSq(Double writeTimeTotalSq) {
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
   **/
  public DiskIOStats queueDepthTotal(Double queueDepthTotal) {
    this.queueDepthTotal = queueDepthTotal;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("queueDepthTotal")
  public Double getQueueDepthTotal() {
    return queueDepthTotal;
  }
  
  public void setQueueDepthTotal(Double queueDepthTotal) {
    this.queueDepthTotal = queueDepthTotal;
  }

  
  /**
   **/
  public DiskIOStats queueDepthMax(Double queueDepthMax) {
    this.queueDepthMax = queueDepthMax;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("queueDepthMax")
  public Double getQueueDepthMax() {
    return queueDepthMax;
  }
  
  public void setQueueDepthMax(Double queueDepthMax) {
    this.queueDepthMax = queueDepthMax;
  }

  
  /**
   **/
  public DiskIOStats randomIosTotal(Double randomIosTotal) {
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
  public DiskIOStats randomBytesTotal(Double randomBytesTotal) {
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
  public DiskIOStats cumulativeLBA(Double cumulativeLBA) {
    this.cumulativeLBA = cumulativeLBA;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("cumulativeLBA")
  public Double getCumulativeLBA() {
    return cumulativeLBA;
  }
  
  public void setCumulativeLBA(Double cumulativeLBA) {
    this.cumulativeLBA = cumulativeLBA;
  }

  
  /**
   **/
  public DiskIOStats cumulativeDeltaLBA(Double cumulativeDeltaLBA) {
    this.cumulativeDeltaLBA = cumulativeDeltaLBA;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("cumulativeDeltaLBA")
  public Double getCumulativeDeltaLBA() {
    return cumulativeDeltaLBA;
  }
  
  public void setCumulativeDeltaLBA(Double cumulativeDeltaLBA) {
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
    DiskIOStats diskIOStats = (DiskIOStats) o;
    return Objects.equals(this.observedTime, diskIOStats.observedTime) &&
        Objects.equals(this.observedTimeInMS, diskIOStats.observedTimeInMS) &&
        Objects.equals(this.lastResetTime, diskIOStats.lastResetTime) &&
        Objects.equals(this.lastResetTimeInMS, diskIOStats.lastResetTimeInMS) &&
        Objects.equals(this.diskId, diskIOStats.diskId) &&
        Objects.equals(this.serialNumber, diskIOStats.serialNumber) &&
        Objects.equals(this.arrayId, diskIOStats.arrayId) &&
        Objects.equals(this.arrayWWN, diskIOStats.arrayWWN) &&
        Objects.equals(this.driveWWN, diskIOStats.driveWWN) &&
        Objects.equals(this.volGroupId, diskIOStats.volGroupId) &&
        Objects.equals(this.volGroupName, diskIOStats.volGroupName) &&
        Objects.equals(this.volGroupWWN, diskIOStats.volGroupWWN) &&
        Objects.equals(this.trayId, diskIOStats.trayId) &&
        Objects.equals(this.slot, diskIOStats.slot) &&
        Objects.equals(this.diskManufacture, diskIOStats.diskManufacture) &&
        Objects.equals(this.diskSoftwareVersion, diskIOStats.diskSoftwareVersion) &&
        Objects.equals(this.idleTime, diskIOStats.idleTime) &&
        Objects.equals(this.otherOps, diskIOStats.otherOps) &&
        Objects.equals(this.otherTimeMax, diskIOStats.otherTimeMax) &&
        Objects.equals(this.otherTimeTotal, diskIOStats.otherTimeTotal) &&
        Objects.equals(this.otherTimeTotalSq, diskIOStats.otherTimeTotalSq) &&
        Objects.equals(this.readBytes, diskIOStats.readBytes) &&
        Objects.equals(this.readOps, diskIOStats.readOps) &&
        Objects.equals(this.readTimeMax, diskIOStats.readTimeMax) &&
        Objects.equals(this.readTimeTotal, diskIOStats.readTimeTotal) &&
        Objects.equals(this.readTimeTotalSq, diskIOStats.readTimeTotalSq) &&
        Objects.equals(this.recoveredErrors, diskIOStats.recoveredErrors) &&
        Objects.equals(this.retriedIos, diskIOStats.retriedIos) &&
        Objects.equals(this.timeouts, diskIOStats.timeouts) &&
        Objects.equals(this.unrecoveredErrors, diskIOStats.unrecoveredErrors) &&
        Objects.equals(this.writeBytes, diskIOStats.writeBytes) &&
        Objects.equals(this.writeOps, diskIOStats.writeOps) &&
        Objects.equals(this.writeTimeMax, diskIOStats.writeTimeMax) &&
        Objects.equals(this.writeTimeTotal, diskIOStats.writeTimeTotal) &&
        Objects.equals(this.writeTimeTotalSq, diskIOStats.writeTimeTotalSq) &&
        Objects.equals(this.queueDepthTotal, diskIOStats.queueDepthTotal) &&
        Objects.equals(this.queueDepthMax, diskIOStats.queueDepthMax) &&
        Objects.equals(this.randomIosTotal, diskIOStats.randomIosTotal) &&
        Objects.equals(this.randomBytesTotal, diskIOStats.randomBytesTotal) &&
        Objects.equals(this.cumulativeLBA, diskIOStats.cumulativeLBA) &&
        Objects.equals(this.cumulativeDeltaLBA, diskIOStats.cumulativeDeltaLBA);
  }

  @Override
  public int hashCode() {
    return Objects.hash(observedTime, observedTimeInMS, lastResetTime, lastResetTimeInMS, diskId, serialNumber, arrayId, arrayWWN, driveWWN, volGroupId, volGroupName, volGroupWWN, trayId, slot, diskManufacture, diskSoftwareVersion, idleTime, otherOps, otherTimeMax, otherTimeTotal, otherTimeTotalSq, readBytes, readOps, readTimeMax, readTimeTotal, readTimeTotalSq, recoveredErrors, retriedIos, timeouts, unrecoveredErrors, writeBytes, writeOps, writeTimeMax, writeTimeTotal, writeTimeTotalSq, queueDepthTotal, queueDepthMax, randomIosTotal, randomBytesTotal, cumulativeLBA, cumulativeDeltaLBA);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DiskIOStats {\n");
    
    sb.append("    observedTime: ").append(toIndentedString(observedTime)).append("\n");
    sb.append("    observedTimeInMS: ").append(toIndentedString(observedTimeInMS)).append("\n");
    sb.append("    lastResetTime: ").append(toIndentedString(lastResetTime)).append("\n");
    sb.append("    lastResetTimeInMS: ").append(toIndentedString(lastResetTimeInMS)).append("\n");
    sb.append("    diskId: ").append(toIndentedString(diskId)).append("\n");
    sb.append("    serialNumber: ").append(toIndentedString(serialNumber)).append("\n");
    sb.append("    arrayId: ").append(toIndentedString(arrayId)).append("\n");
    sb.append("    arrayWWN: ").append(toIndentedString(arrayWWN)).append("\n");
    sb.append("    driveWWN: ").append(toIndentedString(driveWWN)).append("\n");
    sb.append("    volGroupId: ").append(toIndentedString(volGroupId)).append("\n");
    sb.append("    volGroupName: ").append(toIndentedString(volGroupName)).append("\n");
    sb.append("    volGroupWWN: ").append(toIndentedString(volGroupWWN)).append("\n");
    sb.append("    trayId: ").append(toIndentedString(trayId)).append("\n");
    sb.append("    slot: ").append(toIndentedString(slot)).append("\n");
    sb.append("    diskManufacture: ").append(toIndentedString(diskManufacture)).append("\n");
    sb.append("    diskSoftwareVersion: ").append(toIndentedString(diskSoftwareVersion)).append("\n");
    sb.append("    idleTime: ").append(toIndentedString(idleTime)).append("\n");
    sb.append("    otherOps: ").append(toIndentedString(otherOps)).append("\n");
    sb.append("    otherTimeMax: ").append(toIndentedString(otherTimeMax)).append("\n");
    sb.append("    otherTimeTotal: ").append(toIndentedString(otherTimeTotal)).append("\n");
    sb.append("    otherTimeTotalSq: ").append(toIndentedString(otherTimeTotalSq)).append("\n");
    sb.append("    readBytes: ").append(toIndentedString(readBytes)).append("\n");
    sb.append("    readOps: ").append(toIndentedString(readOps)).append("\n");
    sb.append("    readTimeMax: ").append(toIndentedString(readTimeMax)).append("\n");
    sb.append("    readTimeTotal: ").append(toIndentedString(readTimeTotal)).append("\n");
    sb.append("    readTimeTotalSq: ").append(toIndentedString(readTimeTotalSq)).append("\n");
    sb.append("    recoveredErrors: ").append(toIndentedString(recoveredErrors)).append("\n");
    sb.append("    retriedIos: ").append(toIndentedString(retriedIos)).append("\n");
    sb.append("    timeouts: ").append(toIndentedString(timeouts)).append("\n");
    sb.append("    unrecoveredErrors: ").append(toIndentedString(unrecoveredErrors)).append("\n");
    sb.append("    writeBytes: ").append(toIndentedString(writeBytes)).append("\n");
    sb.append("    writeOps: ").append(toIndentedString(writeOps)).append("\n");
    sb.append("    writeTimeMax: ").append(toIndentedString(writeTimeMax)).append("\n");
    sb.append("    writeTimeTotal: ").append(toIndentedString(writeTimeTotal)).append("\n");
    sb.append("    writeTimeTotalSq: ").append(toIndentedString(writeTimeTotalSq)).append("\n");
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

