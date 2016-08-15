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
 * ObjectGraphChangeEvent
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2016-08-12T15:32:41.671-05:00")
public class ObjectGraphChangeEvent extends Event  {
  
    private Date timestamp;

    private Long eventNumber;


  /**
   * Gets or Sets eventType
   */
  public enum EventTypeEnum {
    objectGraphChangeEvent("objectGraphChangeEvent"),
    passwordStatusEvent("passwordStatusEvent"),
    storageSystemStatusEvent("storageSystemStatusEvent"),
    storageSystemMDChangeEvent("storageSystemMDChangeEvent"),
    folderEvent("folderEvent"),
    metadataTagEvent("metadataTagEvent"),
    softwareDownloadEvent("softwareDownloadEvent"),
    softwareReloadEvent("softwareReloadEvent"),
    asupConfigChangeEvent("asupConfigChangeEvent"),
    iomConfigChangeEvent("iomConfigChangeEvent"),
    alertConfigChangeEvent("alertConfigChangeEvent"),
    firmwareDownloadEvent("firmwareDownloadEvent"),
    criticalMelChangeEvent("criticalMelChangeEvent"),
    statisticsCollectionEvent("statisticsCollectionEvent"),
    melClearEvent("melClearEvent"),
    workload("workload");
;
    private String value;

    EventTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

    private EventTypeEnum eventType;

    private String storageSystemId;

    private Long currentConfigGen;

    private Long previousConfigGen;

    private String systemWWN;

  
  /**
   **/
  public ObjectGraphChangeEvent timestamp(Date timestamp) {
    this.timestamp = timestamp;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("timestamp")
  public Date getObjectGraphChangeEventtimestamp() {
    return timestamp;
  }
  
  public void setTimestamp(Date timestamp) {
    this.timestamp = timestamp;
  }

  
  /**
   **/
  public ObjectGraphChangeEvent eventNumber(Long eventNumber) {
    this.eventNumber = eventNumber;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("eventNumber")
  public Long getObjectGraphChangeEventeventNumber() {
    return eventNumber;
  }
  
  public void setEventNumber(Long eventNumber) {
    this.eventNumber = eventNumber;
  }

  
  /**
   **/
  public ObjectGraphChangeEvent eventType(EventTypeEnum eventType) {
    this.eventType = eventType;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("eventType")
  public EventTypeEnum getObjectGraphChangeEventeventType() {
    return eventType;
  }
  
  public void setEventType(EventTypeEnum eventType) {
    this.eventType = eventType;
  }

  
  /**
   **/
  public ObjectGraphChangeEvent storageSystemId(String storageSystemId) {
    this.storageSystemId = storageSystemId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("storageSystemId")
  public String getObjectGraphChangeEventstorageSystemId() {
    return storageSystemId;
  }
  
  public void setStorageSystemId(String storageSystemId) {
    this.storageSystemId = storageSystemId;
  }

  
  /**
   * The config gen number associated to the with these events.
   **/
  public ObjectGraphChangeEvent currentConfigGen(Long currentConfigGen) {
    this.currentConfigGen = currentConfigGen;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The config gen number associated to the with these events.")
  @JsonProperty("currentConfigGen")
  public Long getObjectGraphChangeEventcurrentConfigGen() {
    return currentConfigGen;
  }
  
  public void setCurrentConfigGen(Long currentConfigGen) {
    this.currentConfigGen = currentConfigGen;
  }

  
  /**
   * The config gen number that was currently known.  It is possible for there to be a gap between currentConfig and previous      Don't expect them to be sequential
   **/
  public ObjectGraphChangeEvent previousConfigGen(Long previousConfigGen) {
    this.previousConfigGen = previousConfigGen;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The config gen number that was currently known.  It is possible for there to be a gap between currentConfig and previous      Don't expect them to be sequential")
  @JsonProperty("previousConfigGen")
  public Long getObjectGraphChangeEventpreviousConfigGen() {
    return previousConfigGen;
  }
  
  public void setPreviousConfigGen(Long previousConfigGen) {
    this.previousConfigGen = previousConfigGen;
  }

  
  /**
   * The storage systems World Wide Name
   **/
  public ObjectGraphChangeEvent systemWWN(String systemWWN) {
    this.systemWWN = systemWWN;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The storage systems World Wide Name")
  @JsonProperty("systemWWN")
  public String getObjectGraphChangeEventsystemWWN() {
    return systemWWN;
  }
  
  public void setSystemWWN(String systemWWN) {
    this.systemWWN = systemWWN;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ObjectGraphChangeEvent objectGraphChangeEvent = (ObjectGraphChangeEvent) o;
    return Objects.equals(this.timestamp, objectGraphChangeEvent.timestamp) &&
        Objects.equals(this.eventNumber, objectGraphChangeEvent.eventNumber) &&
        Objects.equals(this.eventType, objectGraphChangeEvent.eventType) &&
        Objects.equals(this.storageSystemId, objectGraphChangeEvent.storageSystemId) &&
        Objects.equals(this.currentConfigGen, objectGraphChangeEvent.currentConfigGen) &&
        Objects.equals(this.previousConfigGen, objectGraphChangeEvent.previousConfigGen) &&
        Objects.equals(this.systemWWN, objectGraphChangeEvent.systemWWN) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(timestamp, eventNumber, eventType, storageSystemId, currentConfigGen, previousConfigGen, systemWWN, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ObjectGraphChangeEvent {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    eventNumber: ").append(toIndentedString(eventNumber)).append("\n");
    sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
    sb.append("    storageSystemId: ").append(toIndentedString(storageSystemId)).append("\n");
    sb.append("    currentConfigGen: ").append(toIndentedString(currentConfigGen)).append("\n");
    sb.append("    previousConfigGen: ").append(toIndentedString(previousConfigGen)).append("\n");
    sb.append("    systemWWN: ").append(toIndentedString(systemWWN)).append("\n");
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

