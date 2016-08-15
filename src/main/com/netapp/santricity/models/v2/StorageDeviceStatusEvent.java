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
 * StorageDeviceStatusEvent
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2016-08-12T15:32:41.671-05:00")
public class StorageDeviceStatusEvent extends Event  {
  
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


  /**
   * Gets or Sets previousStatus
   */
  public enum PreviousStatusEnum {
    neverContacted("neverContacted"),
    offline("offline"),
    optimal("optimal"),
    needsAttn("needsAttn"),
    removed("removed"),
    newDevice("newDevice"),
    lockDown("lockDown");
;
    private String value;

    PreviousStatusEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

    private PreviousStatusEnum previousStatus;


  /**
   * Gets or Sets currentStatus
   */
  public enum CurrentStatusEnum {
    neverContacted("neverContacted"),
    offline("offline"),
    optimal("optimal"),
    needsAttn("needsAttn"),
    removed("removed"),
    newDevice("newDevice"),
    lockDown("lockDown");
;
    private String value;

    CurrentStatusEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

    private CurrentStatusEnum currentStatus;

    private String storageSystemId;

    private String systemWWN;

  
  /**
   **/
  public StorageDeviceStatusEvent timestamp(Date timestamp) {
    this.timestamp = timestamp;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("timestamp")
  public Date getStorageDeviceStatusEventtimestamp() {
    return timestamp;
  }
  
  public void setTimestamp(Date timestamp) {
    this.timestamp = timestamp;
  }

  
  /**
   **/
  public StorageDeviceStatusEvent eventNumber(Long eventNumber) {
    this.eventNumber = eventNumber;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("eventNumber")
  public Long getStorageDeviceStatusEventeventNumber() {
    return eventNumber;
  }
  
  public void setEventNumber(Long eventNumber) {
    this.eventNumber = eventNumber;
  }

  
  /**
   **/
  public StorageDeviceStatusEvent eventType(EventTypeEnum eventType) {
    this.eventType = eventType;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("eventType")
  public EventTypeEnum getStorageDeviceStatusEventeventType() {
    return eventType;
  }
  
  public void setEventType(EventTypeEnum eventType) {
    this.eventType = eventType;
  }

  
  /**
   **/
  public StorageDeviceStatusEvent previousStatus(PreviousStatusEnum previousStatus) {
    this.previousStatus = previousStatus;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("previousStatus")
  public PreviousStatusEnum getStorageDeviceStatusEventpreviousStatus() {
    return previousStatus;
  }
  
  public void setPreviousStatus(PreviousStatusEnum previousStatus) {
    this.previousStatus = previousStatus;
  }

  
  /**
   **/
  public StorageDeviceStatusEvent currentStatus(CurrentStatusEnum currentStatus) {
    this.currentStatus = currentStatus;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("currentStatus")
  public CurrentStatusEnum getStorageDeviceStatusEventcurrentStatus() {
    return currentStatus;
  }
  
  public void setCurrentStatus(CurrentStatusEnum currentStatus) {
    this.currentStatus = currentStatus;
  }

  
  /**
   **/
  public StorageDeviceStatusEvent storageSystemId(String storageSystemId) {
    this.storageSystemId = storageSystemId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("storageSystemId")
  public String getStorageDeviceStatusEventstorageSystemId() {
    return storageSystemId;
  }
  
  public void setStorageSystemId(String storageSystemId) {
    this.storageSystemId = storageSystemId;
  }

  
  /**
   **/
  public StorageDeviceStatusEvent systemWWN(String systemWWN) {
    this.systemWWN = systemWWN;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("systemWWN")
  public String getStorageDeviceStatusEventsystemWWN() {
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
    StorageDeviceStatusEvent storageDeviceStatusEvent = (StorageDeviceStatusEvent) o;
    return Objects.equals(this.timestamp, storageDeviceStatusEvent.timestamp) &&
        Objects.equals(this.eventNumber, storageDeviceStatusEvent.eventNumber) &&
        Objects.equals(this.eventType, storageDeviceStatusEvent.eventType) &&
        Objects.equals(this.previousStatus, storageDeviceStatusEvent.previousStatus) &&
        Objects.equals(this.currentStatus, storageDeviceStatusEvent.currentStatus) &&
        Objects.equals(this.storageSystemId, storageDeviceStatusEvent.storageSystemId) &&
        Objects.equals(this.systemWWN, storageDeviceStatusEvent.systemWWN) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(timestamp, eventNumber, eventType, previousStatus, currentStatus, storageSystemId, systemWWN, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StorageDeviceStatusEvent {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    eventNumber: ").append(toIndentedString(eventNumber)).append("\n");
    sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
    sb.append("    previousStatus: ").append(toIndentedString(previousStatus)).append("\n");
    sb.append("    currentStatus: ").append(toIndentedString(currentStatus)).append("\n");
    sb.append("    storageSystemId: ").append(toIndentedString(storageSystemId)).append("\n");
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

