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
 * ControllerCounterGroup
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2016-08-12T15:32:46.001-05:00")
public class ControllerCounterGroup   {
  
    private String controllerRef;

    private Long baseTime;

    private Long startTime;

    private Long observedTime;

    private List<CpuUtilizationStats> cpuUtilizationStats;

    private Long totalIopsServiced;

    private Long totalBytesServiced;

    private Long cacheHitsIopsTotal;

    private Long cacheHitsBytesTotal;

    private Long randomIosTotal;

    private Long randomBytesTotal;

    private Long readIopsTotal;

    private Long readBytesTotal;

    private Long writeIopsTotal;

    private Long writeBytesTotal;

    private Long mirrorIopsTotal;

    private Long mirrorBytesTotal;

    private Long fullStripeWritesBytes;

    private Long raid0BytesTransferred;

    private Long raid1BytesTransferred;

    private Long raid5BytesTransferred;

    private Long raid6BytesTransferred;

    private Long ddpBytesTransferred;

    private Long maxPossibleBpsUnderCurrentLoad;

    private Long maxPossibleIopsUnderCurrentLoad;

  
  /**
   * Controller that generated this group.
   **/
  public ControllerCounterGroup controllerRef(String controllerRef) {
    this.controllerRef = controllerRef;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Controller that generated this group.")
  @JsonProperty("controllerRef")
  public String getControllerRef() {
    return controllerRef;
  }
  
  public void setControllerRef(String controllerRef) {
    this.controllerRef = controllerRef;
  }

  
  /**
   * Time the counters were last reset. Time is the number of seconds since midnight, January 1, 1970.
   **/
  public ControllerCounterGroup baseTime(Long baseTime) {
    this.baseTime = baseTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Time the counters were last reset. Time is the number of seconds since midnight, January 1, 1970.")
  @JsonProperty("baseTime")
  public Long getBaseTime() {
    return baseTime;
  }
  
  public void setBaseTime(Long baseTime) {
    this.baseTime = baseTime;
  }

  
  /**
   * Start time for this collection as measured by the number of seconds since baseTime.
   **/
  public ControllerCounterGroup startTime(Long startTime) {
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
  public ControllerCounterGroup observedTime(Long observedTime) {
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
   * CPU utilization statistics structure.
   **/
  public ControllerCounterGroup cpuUtilizationStats(List<CpuUtilizationStats> cpuUtilizationStats) {
    this.cpuUtilizationStats = cpuUtilizationStats;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "CPU utilization statistics structure.")
  @JsonProperty("cpuUtilizationStats")
  public List<CpuUtilizationStats> getCpuUtilizationStats() {
    return cpuUtilizationStats;
  }
  
  public void setCpuUtilizationStats(List<CpuUtilizationStats> cpuUtilizationStats) {
    this.cpuUtilizationStats = cpuUtilizationStats;
  }

  
  /**
   * Total number of IO operations serviced by the controller.
   **/
  public ControllerCounterGroup totalIopsServiced(Long totalIopsServiced) {
    this.totalIopsServiced = totalIopsServiced;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Total number of IO operations serviced by the controller.")
  @JsonProperty("totalIopsServiced")
  public Long getTotalIopsServiced() {
    return totalIopsServiced;
  }
  
  public void setTotalIopsServiced(Long totalIopsServiced) {
    this.totalIopsServiced = totalIopsServiced;
  }

  
  /**
   * Total number of Bytes serviced by the controller.
   **/
  public ControllerCounterGroup totalBytesServiced(Long totalBytesServiced) {
    this.totalBytesServiced = totalBytesServiced;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Total number of Bytes serviced by the controller.")
  @JsonProperty("totalBytesServiced")
  public Long getTotalBytesServiced() {
    return totalBytesServiced;
  }
  
  public void setTotalBytesServiced(Long totalBytesServiced) {
    this.totalBytesServiced = totalBytesServiced;
  }

  
  /**
   * Total number of IO operations that hit cache.
   **/
  public ControllerCounterGroup cacheHitsIopsTotal(Long cacheHitsIopsTotal) {
    this.cacheHitsIopsTotal = cacheHitsIopsTotal;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Total number of IO operations that hit cache.")
  @JsonProperty("cacheHitsIopsTotal")
  public Long getCacheHitsIopsTotal() {
    return cacheHitsIopsTotal;
  }
  
  public void setCacheHitsIopsTotal(Long cacheHitsIopsTotal) {
    this.cacheHitsIopsTotal = cacheHitsIopsTotal;
  }

  
  /**
   * Total number of bytes that hit cache.
   **/
  public ControllerCounterGroup cacheHitsBytesTotal(Long cacheHitsBytesTotal) {
    this.cacheHitsBytesTotal = cacheHitsBytesTotal;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Total number of bytes that hit cache.")
  @JsonProperty("cacheHitsBytesTotal")
  public Long getCacheHitsBytesTotal() {
    return cacheHitsBytesTotal;
  }
  
  public void setCacheHitsBytesTotal(Long cacheHitsBytesTotal) {
    this.cacheHitsBytesTotal = cacheHitsBytesTotal;
  }

  
  /**
   * Total number of IOs that are categorized as random.
   **/
  public ControllerCounterGroup randomIosTotal(Long randomIosTotal) {
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
  public ControllerCounterGroup randomBytesTotal(Long randomBytesTotal) {
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
   * Total number of Read IO operations.
   **/
  public ControllerCounterGroup readIopsTotal(Long readIopsTotal) {
    this.readIopsTotal = readIopsTotal;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Total number of Read IO operations.")
  @JsonProperty("readIopsTotal")
  public Long getReadIopsTotal() {
    return readIopsTotal;
  }
  
  public void setReadIopsTotal(Long readIopsTotal) {
    this.readIopsTotal = readIopsTotal;
  }

  
  /**
   * Total number of Bytes read.
   **/
  public ControllerCounterGroup readBytesTotal(Long readBytesTotal) {
    this.readBytesTotal = readBytesTotal;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Total number of Bytes read.")
  @JsonProperty("readBytesTotal")
  public Long getReadBytesTotal() {
    return readBytesTotal;
  }
  
  public void setReadBytesTotal(Long readBytesTotal) {
    this.readBytesTotal = readBytesTotal;
  }

  
  /**
   * Total number of Write IO operations.
   **/
  public ControllerCounterGroup writeIopsTotal(Long writeIopsTotal) {
    this.writeIopsTotal = writeIopsTotal;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Total number of Write IO operations.")
  @JsonProperty("writeIopsTotal")
  public Long getWriteIopsTotal() {
    return writeIopsTotal;
  }
  
  public void setWriteIopsTotal(Long writeIopsTotal) {
    this.writeIopsTotal = writeIopsTotal;
  }

  
  /**
   * Total number of Bytes written.
   **/
  public ControllerCounterGroup writeBytesTotal(Long writeBytesTotal) {
    this.writeBytesTotal = writeBytesTotal;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Total number of Bytes written.")
  @JsonProperty("writeBytesTotal")
  public Long getWriteBytesTotal() {
    return writeBytesTotal;
  }
  
  public void setWriteBytesTotal(Long writeBytesTotal) {
    this.writeBytesTotal = writeBytesTotal;
  }

  
  /**
   * Total number of IO operations serviced by the controller that are characterized as cache mirroring related. If cache mirroring is disabled, this counter will not have any value.
   **/
  public ControllerCounterGroup mirrorIopsTotal(Long mirrorIopsTotal) {
    this.mirrorIopsTotal = mirrorIopsTotal;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Total number of IO operations serviced by the controller that are characterized as cache mirroring related. If cache mirroring is disabled, this counter will not have any value.")
  @JsonProperty("mirrorIopsTotal")
  public Long getMirrorIopsTotal() {
    return mirrorIopsTotal;
  }
  
  public void setMirrorIopsTotal(Long mirrorIopsTotal) {
    this.mirrorIopsTotal = mirrorIopsTotal;
  }

  
  /**
   * Total number of Bytes serviced by the controller that are characterized as cache mirroring related. If cache mirroring is disabled, this counter will not have any value.
   **/
  public ControllerCounterGroup mirrorBytesTotal(Long mirrorBytesTotal) {
    this.mirrorBytesTotal = mirrorBytesTotal;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Total number of Bytes serviced by the controller that are characterized as cache mirroring related. If cache mirroring is disabled, this counter will not have any value.")
  @JsonProperty("mirrorBytesTotal")
  public Long getMirrorBytesTotal() {
    return mirrorBytesTotal;
  }
  
  public void setMirrorBytesTotal(Long mirrorBytesTotal) {
    this.mirrorBytesTotal = mirrorBytesTotal;
  }

  
  /**
   * Bytes written that are categorized as Full stripe writes.
   **/
  public ControllerCounterGroup fullStripeWritesBytes(Long fullStripeWritesBytes) {
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
   * Bytes transferred that are categorized as RAID 0 transfers.
   **/
  public ControllerCounterGroup raid0BytesTransferred(Long raid0BytesTransferred) {
    this.raid0BytesTransferred = raid0BytesTransferred;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Bytes transferred that are categorized as RAID 0 transfers.")
  @JsonProperty("raid0BytesTransferred")
  public Long getRaid0BytesTransferred() {
    return raid0BytesTransferred;
  }
  
  public void setRaid0BytesTransferred(Long raid0BytesTransferred) {
    this.raid0BytesTransferred = raid0BytesTransferred;
  }

  
  /**
   * Bytes transferred that are categorized as RAID 1 transfers.
   **/
  public ControllerCounterGroup raid1BytesTransferred(Long raid1BytesTransferred) {
    this.raid1BytesTransferred = raid1BytesTransferred;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Bytes transferred that are categorized as RAID 1 transfers.")
  @JsonProperty("raid1BytesTransferred")
  public Long getRaid1BytesTransferred() {
    return raid1BytesTransferred;
  }
  
  public void setRaid1BytesTransferred(Long raid1BytesTransferred) {
    this.raid1BytesTransferred = raid1BytesTransferred;
  }

  
  /**
   * Bytes transferred that are categorized as RAID 5 transfers.
   **/
  public ControllerCounterGroup raid5BytesTransferred(Long raid5BytesTransferred) {
    this.raid5BytesTransferred = raid5BytesTransferred;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Bytes transferred that are categorized as RAID 5 transfers.")
  @JsonProperty("raid5BytesTransferred")
  public Long getRaid5BytesTransferred() {
    return raid5BytesTransferred;
  }
  
  public void setRaid5BytesTransferred(Long raid5BytesTransferred) {
    this.raid5BytesTransferred = raid5BytesTransferred;
  }

  
  /**
   * Bytes transferred that are categorized as RAID 6 transfers.
   **/
  public ControllerCounterGroup raid6BytesTransferred(Long raid6BytesTransferred) {
    this.raid6BytesTransferred = raid6BytesTransferred;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Bytes transferred that are categorized as RAID 6 transfers.")
  @JsonProperty("raid6BytesTransferred")
  public Long getRaid6BytesTransferred() {
    return raid6BytesTransferred;
  }
  
  public void setRaid6BytesTransferred(Long raid6BytesTransferred) {
    this.raid6BytesTransferred = raid6BytesTransferred;
  }

  
  /**
   * Bytes transferred that are categorized as DDP transfers.
   **/
  public ControllerCounterGroup ddpBytesTransferred(Long ddpBytesTransferred) {
    this.ddpBytesTransferred = ddpBytesTransferred;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Bytes transferred that are categorized as DDP transfers.")
  @JsonProperty("ddpBytesTransferred")
  public Long getDdpBytesTransferred() {
    return ddpBytesTransferred;
  }
  
  public void setDdpBytesTransferred(Long ddpBytesTransferred) {
    this.ddpBytesTransferred = ddpBytesTransferred;
  }

  
  /**
   * Theoretical maximum possible Bytes per second under current load.
   **/
  public ControllerCounterGroup maxPossibleBpsUnderCurrentLoad(Long maxPossibleBpsUnderCurrentLoad) {
    this.maxPossibleBpsUnderCurrentLoad = maxPossibleBpsUnderCurrentLoad;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Theoretical maximum possible Bytes per second under current load.")
  @JsonProperty("maxPossibleBpsUnderCurrentLoad")
  public Long getMaxPossibleBpsUnderCurrentLoad() {
    return maxPossibleBpsUnderCurrentLoad;
  }
  
  public void setMaxPossibleBpsUnderCurrentLoad(Long maxPossibleBpsUnderCurrentLoad) {
    this.maxPossibleBpsUnderCurrentLoad = maxPossibleBpsUnderCurrentLoad;
  }

  
  /**
   * Theoretical maximum possible IO per second under current load.
   **/
  public ControllerCounterGroup maxPossibleIopsUnderCurrentLoad(Long maxPossibleIopsUnderCurrentLoad) {
    this.maxPossibleIopsUnderCurrentLoad = maxPossibleIopsUnderCurrentLoad;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Theoretical maximum possible IO per second under current load.")
  @JsonProperty("maxPossibleIopsUnderCurrentLoad")
  public Long getMaxPossibleIopsUnderCurrentLoad() {
    return maxPossibleIopsUnderCurrentLoad;
  }
  
  public void setMaxPossibleIopsUnderCurrentLoad(Long maxPossibleIopsUnderCurrentLoad) {
    this.maxPossibleIopsUnderCurrentLoad = maxPossibleIopsUnderCurrentLoad;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ControllerCounterGroup controllerCounterGroup = (ControllerCounterGroup) o;
    return Objects.equals(this.controllerRef, controllerCounterGroup.controllerRef) &&
        Objects.equals(this.baseTime, controllerCounterGroup.baseTime) &&
        Objects.equals(this.startTime, controllerCounterGroup.startTime) &&
        Objects.equals(this.observedTime, controllerCounterGroup.observedTime) &&
        Objects.equals(this.cpuUtilizationStats, controllerCounterGroup.cpuUtilizationStats) &&
        Objects.equals(this.totalIopsServiced, controllerCounterGroup.totalIopsServiced) &&
        Objects.equals(this.totalBytesServiced, controllerCounterGroup.totalBytesServiced) &&
        Objects.equals(this.cacheHitsIopsTotal, controllerCounterGroup.cacheHitsIopsTotal) &&
        Objects.equals(this.cacheHitsBytesTotal, controllerCounterGroup.cacheHitsBytesTotal) &&
        Objects.equals(this.randomIosTotal, controllerCounterGroup.randomIosTotal) &&
        Objects.equals(this.randomBytesTotal, controllerCounterGroup.randomBytesTotal) &&
        Objects.equals(this.readIopsTotal, controllerCounterGroup.readIopsTotal) &&
        Objects.equals(this.readBytesTotal, controllerCounterGroup.readBytesTotal) &&
        Objects.equals(this.writeIopsTotal, controllerCounterGroup.writeIopsTotal) &&
        Objects.equals(this.writeBytesTotal, controllerCounterGroup.writeBytesTotal) &&
        Objects.equals(this.mirrorIopsTotal, controllerCounterGroup.mirrorIopsTotal) &&
        Objects.equals(this.mirrorBytesTotal, controllerCounterGroup.mirrorBytesTotal) &&
        Objects.equals(this.fullStripeWritesBytes, controllerCounterGroup.fullStripeWritesBytes) &&
        Objects.equals(this.raid0BytesTransferred, controllerCounterGroup.raid0BytesTransferred) &&
        Objects.equals(this.raid1BytesTransferred, controllerCounterGroup.raid1BytesTransferred) &&
        Objects.equals(this.raid5BytesTransferred, controllerCounterGroup.raid5BytesTransferred) &&
        Objects.equals(this.raid6BytesTransferred, controllerCounterGroup.raid6BytesTransferred) &&
        Objects.equals(this.ddpBytesTransferred, controllerCounterGroup.ddpBytesTransferred) &&
        Objects.equals(this.maxPossibleBpsUnderCurrentLoad, controllerCounterGroup.maxPossibleBpsUnderCurrentLoad) &&
        Objects.equals(this.maxPossibleIopsUnderCurrentLoad, controllerCounterGroup.maxPossibleIopsUnderCurrentLoad);
  }

  @Override
  public int hashCode() {
    return Objects.hash(controllerRef, baseTime, startTime, observedTime, cpuUtilizationStats, totalIopsServiced, totalBytesServiced, cacheHitsIopsTotal, cacheHitsBytesTotal, randomIosTotal, randomBytesTotal, readIopsTotal, readBytesTotal, writeIopsTotal, writeBytesTotal, mirrorIopsTotal, mirrorBytesTotal, fullStripeWritesBytes, raid0BytesTransferred, raid1BytesTransferred, raid5BytesTransferred, raid6BytesTransferred, ddpBytesTransferred, maxPossibleBpsUnderCurrentLoad, maxPossibleIopsUnderCurrentLoad);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ControllerCounterGroup {\n");
    
    sb.append("    controllerRef: ").append(toIndentedString(controllerRef)).append("\n");
    sb.append("    baseTime: ").append(toIndentedString(baseTime)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    observedTime: ").append(toIndentedString(observedTime)).append("\n");
    sb.append("    cpuUtilizationStats: ").append(toIndentedString(cpuUtilizationStats)).append("\n");
    sb.append("    totalIopsServiced: ").append(toIndentedString(totalIopsServiced)).append("\n");
    sb.append("    totalBytesServiced: ").append(toIndentedString(totalBytesServiced)).append("\n");
    sb.append("    cacheHitsIopsTotal: ").append(toIndentedString(cacheHitsIopsTotal)).append("\n");
    sb.append("    cacheHitsBytesTotal: ").append(toIndentedString(cacheHitsBytesTotal)).append("\n");
    sb.append("    randomIosTotal: ").append(toIndentedString(randomIosTotal)).append("\n");
    sb.append("    randomBytesTotal: ").append(toIndentedString(randomBytesTotal)).append("\n");
    sb.append("    readIopsTotal: ").append(toIndentedString(readIopsTotal)).append("\n");
    sb.append("    readBytesTotal: ").append(toIndentedString(readBytesTotal)).append("\n");
    sb.append("    writeIopsTotal: ").append(toIndentedString(writeIopsTotal)).append("\n");
    sb.append("    writeBytesTotal: ").append(toIndentedString(writeBytesTotal)).append("\n");
    sb.append("    mirrorIopsTotal: ").append(toIndentedString(mirrorIopsTotal)).append("\n");
    sb.append("    mirrorBytesTotal: ").append(toIndentedString(mirrorBytesTotal)).append("\n");
    sb.append("    fullStripeWritesBytes: ").append(toIndentedString(fullStripeWritesBytes)).append("\n");
    sb.append("    raid0BytesTransferred: ").append(toIndentedString(raid0BytesTransferred)).append("\n");
    sb.append("    raid1BytesTransferred: ").append(toIndentedString(raid1BytesTransferred)).append("\n");
    sb.append("    raid5BytesTransferred: ").append(toIndentedString(raid5BytesTransferred)).append("\n");
    sb.append("    raid6BytesTransferred: ").append(toIndentedString(raid6BytesTransferred)).append("\n");
    sb.append("    ddpBytesTransferred: ").append(toIndentedString(ddpBytesTransferred)).append("\n");
    sb.append("    maxPossibleBpsUnderCurrentLoad: ").append(toIndentedString(maxPossibleBpsUnderCurrentLoad)).append("\n");
    sb.append("    maxPossibleIopsUnderCurrentLoad: ").append(toIndentedString(maxPossibleIopsUnderCurrentLoad)).append("\n");
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

