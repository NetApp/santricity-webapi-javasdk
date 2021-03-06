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
 * Storage system performance statistics.
 */
@ApiModel(description = "Storage system performance statistics.")
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2017-10-04T15:05:52.333-05:00")
public class StorageSystemStats   {
  
    private Date observedTime;

    private Long observedTimeInMS;

    private Date lastResetTime;

    private Long lastResetTimeInMS;

    private String arrayId;

    private String arrayWwn;

    private String memberIdsHash;

    private List<StorageSystemControllerStats> controllerStats;

    private Double totalIopsServiced;

    private Double totalBytesServiced;

    private Double cacheHitsIopsTotal;

    private Double cacheHitsBytesTotal;

    private Double randomIosTotal;

    private Double randomBytesTotal;

    private Double readIopsTotal;

    private Double readBytesTotal;

    private Double writeIopsTotal;

    private Double writeBytesTotal;

    private Double mirrorIopsTotal;

    private Double mirrorBytesTotal;

    private Double fullStripeWritesBytes;

    private Double raid0BytesTransferred;

    private Double raid1BytesTransferred;

    private Double raid5BytesTransferred;

    private Double raid6BytesTransferred;

    private Double ddpBytesTransferred;

    private Double maxPossibleBpsUnderCurrentLoad;

    private Double maxPossibleIopsUnderCurrentLoad;

  
  /**
   * End time for this collection as measured by the number of seconds since baseTime.
   **/
  public StorageSystemStats observedTime(Date observedTime) {
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
  public StorageSystemStats observedTimeInMS(Long observedTimeInMS) {
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
  public StorageSystemStats lastResetTime(Date lastResetTime) {
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
  public StorageSystemStats lastResetTimeInMS(Long lastResetTimeInMS) {
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
  public StorageSystemStats arrayId(String arrayId) {
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
  public StorageSystemStats arrayWwn(String arrayWwn) {
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
   * Hash of member controller ids.
   **/
  public StorageSystemStats memberIdsHash(String memberIdsHash) {
    this.memberIdsHash = memberIdsHash;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Hash of member controller ids.")
  @JsonProperty("memberIdsHash")
  public String getMemberIdsHash() {
    return memberIdsHash;
  }
  
  public void setMemberIdsHash(String memberIdsHash) {
    this.memberIdsHash = memberIdsHash;
  }

  
  /**
   * Statistics for each controller.
   **/
  public StorageSystemStats controllerStats(List<StorageSystemControllerStats> controllerStats) {
    this.controllerStats = controllerStats;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Statistics for each controller.")
  @JsonProperty("controllerStats")
  public List<StorageSystemControllerStats> getControllerStats() {
    return controllerStats;
  }
  
  public void setControllerStats(List<StorageSystemControllerStats> controllerStats) {
    this.controllerStats = controllerStats;
  }

  
  /**
   * Total number of IO operations serviced by the controller.
   **/
  public StorageSystemStats totalIopsServiced(Double totalIopsServiced) {
    this.totalIopsServiced = totalIopsServiced;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Total number of IO operations serviced by the controller.")
  @JsonProperty("totalIopsServiced")
  public Double getTotalIopsServiced() {
    return totalIopsServiced;
  }
  
  public void setTotalIopsServiced(Double totalIopsServiced) {
    this.totalIopsServiced = totalIopsServiced;
  }

  
  /**
   * Total number of Bytes serviced by the controller.
   **/
  public StorageSystemStats totalBytesServiced(Double totalBytesServiced) {
    this.totalBytesServiced = totalBytesServiced;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Total number of Bytes serviced by the controller.")
  @JsonProperty("totalBytesServiced")
  public Double getTotalBytesServiced() {
    return totalBytesServiced;
  }
  
  public void setTotalBytesServiced(Double totalBytesServiced) {
    this.totalBytesServiced = totalBytesServiced;
  }

  
  /**
   * Total number of IO operations that hit cache.
   **/
  public StorageSystemStats cacheHitsIopsTotal(Double cacheHitsIopsTotal) {
    this.cacheHitsIopsTotal = cacheHitsIopsTotal;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Total number of IO operations that hit cache.")
  @JsonProperty("cacheHitsIopsTotal")
  public Double getCacheHitsIopsTotal() {
    return cacheHitsIopsTotal;
  }
  
  public void setCacheHitsIopsTotal(Double cacheHitsIopsTotal) {
    this.cacheHitsIopsTotal = cacheHitsIopsTotal;
  }

  
  /**
   * Total number of bytes that hit cache.
   **/
  public StorageSystemStats cacheHitsBytesTotal(Double cacheHitsBytesTotal) {
    this.cacheHitsBytesTotal = cacheHitsBytesTotal;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Total number of bytes that hit cache.")
  @JsonProperty("cacheHitsBytesTotal")
  public Double getCacheHitsBytesTotal() {
    return cacheHitsBytesTotal;
  }
  
  public void setCacheHitsBytesTotal(Double cacheHitsBytesTotal) {
    this.cacheHitsBytesTotal = cacheHitsBytesTotal;
  }

  
  /**
   * Total number of IOs that are categorized as random.
   **/
  public StorageSystemStats randomIosTotal(Double randomIosTotal) {
    this.randomIosTotal = randomIosTotal;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Total number of IOs that are categorized as random.")
  @JsonProperty("randomIosTotal")
  public Double getRandomIosTotal() {
    return randomIosTotal;
  }
  
  public void setRandomIosTotal(Double randomIosTotal) {
    this.randomIosTotal = randomIosTotal;
  }

  
  /**
   * Total number of Bytes that are categorized as random.
   **/
  public StorageSystemStats randomBytesTotal(Double randomBytesTotal) {
    this.randomBytesTotal = randomBytesTotal;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Total number of Bytes that are categorized as random.")
  @JsonProperty("randomBytesTotal")
  public Double getRandomBytesTotal() {
    return randomBytesTotal;
  }
  
  public void setRandomBytesTotal(Double randomBytesTotal) {
    this.randomBytesTotal = randomBytesTotal;
  }

  
  /**
   * Total number of Read IO operations.
   **/
  public StorageSystemStats readIopsTotal(Double readIopsTotal) {
    this.readIopsTotal = readIopsTotal;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Total number of Read IO operations.")
  @JsonProperty("readIopsTotal")
  public Double getReadIopsTotal() {
    return readIopsTotal;
  }
  
  public void setReadIopsTotal(Double readIopsTotal) {
    this.readIopsTotal = readIopsTotal;
  }

  
  /**
   * Total number of Bytes read.
   **/
  public StorageSystemStats readBytesTotal(Double readBytesTotal) {
    this.readBytesTotal = readBytesTotal;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Total number of Bytes read.")
  @JsonProperty("readBytesTotal")
  public Double getReadBytesTotal() {
    return readBytesTotal;
  }
  
  public void setReadBytesTotal(Double readBytesTotal) {
    this.readBytesTotal = readBytesTotal;
  }

  
  /**
   * Total number of Write IO operations.
   **/
  public StorageSystemStats writeIopsTotal(Double writeIopsTotal) {
    this.writeIopsTotal = writeIopsTotal;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Total number of Write IO operations.")
  @JsonProperty("writeIopsTotal")
  public Double getWriteIopsTotal() {
    return writeIopsTotal;
  }
  
  public void setWriteIopsTotal(Double writeIopsTotal) {
    this.writeIopsTotal = writeIopsTotal;
  }

  
  /**
   * Total number of Bytes written.
   **/
  public StorageSystemStats writeBytesTotal(Double writeBytesTotal) {
    this.writeBytesTotal = writeBytesTotal;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Total number of Bytes written.")
  @JsonProperty("writeBytesTotal")
  public Double getWriteBytesTotal() {
    return writeBytesTotal;
  }
  
  public void setWriteBytesTotal(Double writeBytesTotal) {
    this.writeBytesTotal = writeBytesTotal;
  }

  
  /**
   * Total number of IO operations serviced by the controller that are characterized as cache mirroring related. If cache mirroring is disabled, this counter will not have any value.
   **/
  public StorageSystemStats mirrorIopsTotal(Double mirrorIopsTotal) {
    this.mirrorIopsTotal = mirrorIopsTotal;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Total number of IO operations serviced by the controller that are characterized as cache mirroring related. If cache mirroring is disabled, this counter will not have any value.")
  @JsonProperty("mirrorIopsTotal")
  public Double getMirrorIopsTotal() {
    return mirrorIopsTotal;
  }
  
  public void setMirrorIopsTotal(Double mirrorIopsTotal) {
    this.mirrorIopsTotal = mirrorIopsTotal;
  }

  
  /**
   * Total number of Bytes serviced by the controller that are characterized as cache mirroring related. If cache mirroring is disabled, this counter will not have any value.
   **/
  public StorageSystemStats mirrorBytesTotal(Double mirrorBytesTotal) {
    this.mirrorBytesTotal = mirrorBytesTotal;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Total number of Bytes serviced by the controller that are characterized as cache mirroring related. If cache mirroring is disabled, this counter will not have any value.")
  @JsonProperty("mirrorBytesTotal")
  public Double getMirrorBytesTotal() {
    return mirrorBytesTotal;
  }
  
  public void setMirrorBytesTotal(Double mirrorBytesTotal) {
    this.mirrorBytesTotal = mirrorBytesTotal;
  }

  
  /**
   * Bytes written that are categorized as Full stripe writes.
   **/
  public StorageSystemStats fullStripeWritesBytes(Double fullStripeWritesBytes) {
    this.fullStripeWritesBytes = fullStripeWritesBytes;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Bytes written that are categorized as Full stripe writes.")
  @JsonProperty("fullStripeWritesBytes")
  public Double getFullStripeWritesBytes() {
    return fullStripeWritesBytes;
  }
  
  public void setFullStripeWritesBytes(Double fullStripeWritesBytes) {
    this.fullStripeWritesBytes = fullStripeWritesBytes;
  }

  
  /**
   * Bytes transferred that are categorized as RAID 0 transfers.
   **/
  public StorageSystemStats raid0BytesTransferred(Double raid0BytesTransferred) {
    this.raid0BytesTransferred = raid0BytesTransferred;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Bytes transferred that are categorized as RAID 0 transfers.")
  @JsonProperty("raid0BytesTransferred")
  public Double getRaid0BytesTransferred() {
    return raid0BytesTransferred;
  }
  
  public void setRaid0BytesTransferred(Double raid0BytesTransferred) {
    this.raid0BytesTransferred = raid0BytesTransferred;
  }

  
  /**
   * Bytes transferred that are categorized as RAID 1 transfers.
   **/
  public StorageSystemStats raid1BytesTransferred(Double raid1BytesTransferred) {
    this.raid1BytesTransferred = raid1BytesTransferred;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Bytes transferred that are categorized as RAID 1 transfers.")
  @JsonProperty("raid1BytesTransferred")
  public Double getRaid1BytesTransferred() {
    return raid1BytesTransferred;
  }
  
  public void setRaid1BytesTransferred(Double raid1BytesTransferred) {
    this.raid1BytesTransferred = raid1BytesTransferred;
  }

  
  /**
   * Bytes transferred that are categorized as RAID 5 transfers.
   **/
  public StorageSystemStats raid5BytesTransferred(Double raid5BytesTransferred) {
    this.raid5BytesTransferred = raid5BytesTransferred;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Bytes transferred that are categorized as RAID 5 transfers.")
  @JsonProperty("raid5BytesTransferred")
  public Double getRaid5BytesTransferred() {
    return raid5BytesTransferred;
  }
  
  public void setRaid5BytesTransferred(Double raid5BytesTransferred) {
    this.raid5BytesTransferred = raid5BytesTransferred;
  }

  
  /**
   * Bytes transferred that are categorized as RAID 6 transfers.
   **/
  public StorageSystemStats raid6BytesTransferred(Double raid6BytesTransferred) {
    this.raid6BytesTransferred = raid6BytesTransferred;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Bytes transferred that are categorized as RAID 6 transfers.")
  @JsonProperty("raid6BytesTransferred")
  public Double getRaid6BytesTransferred() {
    return raid6BytesTransferred;
  }
  
  public void setRaid6BytesTransferred(Double raid6BytesTransferred) {
    this.raid6BytesTransferred = raid6BytesTransferred;
  }

  
  /**
   * Bytes transferred that are categorized as DDP transfers.
   **/
  public StorageSystemStats ddpBytesTransferred(Double ddpBytesTransferred) {
    this.ddpBytesTransferred = ddpBytesTransferred;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Bytes transferred that are categorized as DDP transfers.")
  @JsonProperty("ddpBytesTransferred")
  public Double getDdpBytesTransferred() {
    return ddpBytesTransferred;
  }
  
  public void setDdpBytesTransferred(Double ddpBytesTransferred) {
    this.ddpBytesTransferred = ddpBytesTransferred;
  }

  
  /**
   * Theoretical maximum possible Bytes per second under current load.
   **/
  public StorageSystemStats maxPossibleBpsUnderCurrentLoad(Double maxPossibleBpsUnderCurrentLoad) {
    this.maxPossibleBpsUnderCurrentLoad = maxPossibleBpsUnderCurrentLoad;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Theoretical maximum possible Bytes per second under current load.")
  @JsonProperty("maxPossibleBpsUnderCurrentLoad")
  public Double getMaxPossibleBpsUnderCurrentLoad() {
    return maxPossibleBpsUnderCurrentLoad;
  }
  
  public void setMaxPossibleBpsUnderCurrentLoad(Double maxPossibleBpsUnderCurrentLoad) {
    this.maxPossibleBpsUnderCurrentLoad = maxPossibleBpsUnderCurrentLoad;
  }

  
  /**
   * Theoretical maximum possible IO per second under current load.
   **/
  public StorageSystemStats maxPossibleIopsUnderCurrentLoad(Double maxPossibleIopsUnderCurrentLoad) {
    this.maxPossibleIopsUnderCurrentLoad = maxPossibleIopsUnderCurrentLoad;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Theoretical maximum possible IO per second under current load.")
  @JsonProperty("maxPossibleIopsUnderCurrentLoad")
  public Double getMaxPossibleIopsUnderCurrentLoad() {
    return maxPossibleIopsUnderCurrentLoad;
  }
  
  public void setMaxPossibleIopsUnderCurrentLoad(Double maxPossibleIopsUnderCurrentLoad) {
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
    StorageSystemStats storageSystemStats = (StorageSystemStats) o;
    return Objects.equals(this.observedTime, storageSystemStats.observedTime) &&
        Objects.equals(this.observedTimeInMS, storageSystemStats.observedTimeInMS) &&
        Objects.equals(this.lastResetTime, storageSystemStats.lastResetTime) &&
        Objects.equals(this.lastResetTimeInMS, storageSystemStats.lastResetTimeInMS) &&
        Objects.equals(this.arrayId, storageSystemStats.arrayId) &&
        Objects.equals(this.arrayWwn, storageSystemStats.arrayWwn) &&
        Objects.equals(this.memberIdsHash, storageSystemStats.memberIdsHash) &&
        Objects.equals(this.controllerStats, storageSystemStats.controllerStats) &&
        Objects.equals(this.totalIopsServiced, storageSystemStats.totalIopsServiced) &&
        Objects.equals(this.totalBytesServiced, storageSystemStats.totalBytesServiced) &&
        Objects.equals(this.cacheHitsIopsTotal, storageSystemStats.cacheHitsIopsTotal) &&
        Objects.equals(this.cacheHitsBytesTotal, storageSystemStats.cacheHitsBytesTotal) &&
        Objects.equals(this.randomIosTotal, storageSystemStats.randomIosTotal) &&
        Objects.equals(this.randomBytesTotal, storageSystemStats.randomBytesTotal) &&
        Objects.equals(this.readIopsTotal, storageSystemStats.readIopsTotal) &&
        Objects.equals(this.readBytesTotal, storageSystemStats.readBytesTotal) &&
        Objects.equals(this.writeIopsTotal, storageSystemStats.writeIopsTotal) &&
        Objects.equals(this.writeBytesTotal, storageSystemStats.writeBytesTotal) &&
        Objects.equals(this.mirrorIopsTotal, storageSystemStats.mirrorIopsTotal) &&
        Objects.equals(this.mirrorBytesTotal, storageSystemStats.mirrorBytesTotal) &&
        Objects.equals(this.fullStripeWritesBytes, storageSystemStats.fullStripeWritesBytes) &&
        Objects.equals(this.raid0BytesTransferred, storageSystemStats.raid0BytesTransferred) &&
        Objects.equals(this.raid1BytesTransferred, storageSystemStats.raid1BytesTransferred) &&
        Objects.equals(this.raid5BytesTransferred, storageSystemStats.raid5BytesTransferred) &&
        Objects.equals(this.raid6BytesTransferred, storageSystemStats.raid6BytesTransferred) &&
        Objects.equals(this.ddpBytesTransferred, storageSystemStats.ddpBytesTransferred) &&
        Objects.equals(this.maxPossibleBpsUnderCurrentLoad, storageSystemStats.maxPossibleBpsUnderCurrentLoad) &&
        Objects.equals(this.maxPossibleIopsUnderCurrentLoad, storageSystemStats.maxPossibleIopsUnderCurrentLoad);
  }

  @Override
  public int hashCode() {
    return Objects.hash(observedTime, observedTimeInMS, lastResetTime, lastResetTimeInMS, arrayId, arrayWwn, memberIdsHash, controllerStats, totalIopsServiced, totalBytesServiced, cacheHitsIopsTotal, cacheHitsBytesTotal, randomIosTotal, randomBytesTotal, readIopsTotal, readBytesTotal, writeIopsTotal, writeBytesTotal, mirrorIopsTotal, mirrorBytesTotal, fullStripeWritesBytes, raid0BytesTransferred, raid1BytesTransferred, raid5BytesTransferred, raid6BytesTransferred, ddpBytesTransferred, maxPossibleBpsUnderCurrentLoad, maxPossibleIopsUnderCurrentLoad);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StorageSystemStats {\n");
    
    sb.append("    observedTime: ").append(toIndentedString(observedTime)).append("\n");
    sb.append("    observedTimeInMS: ").append(toIndentedString(observedTimeInMS)).append("\n");
    sb.append("    lastResetTime: ").append(toIndentedString(lastResetTime)).append("\n");
    sb.append("    lastResetTimeInMS: ").append(toIndentedString(lastResetTimeInMS)).append("\n");
    sb.append("    arrayId: ").append(toIndentedString(arrayId)).append("\n");
    sb.append("    arrayWwn: ").append(toIndentedString(arrayWwn)).append("\n");
    sb.append("    memberIdsHash: ").append(toIndentedString(memberIdsHash)).append("\n");
    sb.append("    controllerStats: ").append(toIndentedString(controllerStats)).append("\n");
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

