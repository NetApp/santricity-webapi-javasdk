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
 * Identifies the location of an unreable sector.
 */
@ApiModel(description = "Identifies the location of an unreable sector.")
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2017-10-04T15:05:52.333-05:00")
public class UnreadableSectorEntryResult   {
  
    private String driveRef;

    private Long timeStamp;

    private String volumeRef;


  /**
   * Gets or Sets recordType
   */
  public enum RecordTypeEnum {
    physical("physical"),
    logical("logical"),
    injected("injected"),
    edcError("edcError"),
    inconsistent("inconsistent"),
    piError("piError"),
    __UNDEFINED("__UNDEFINED");
;
    private String value;

    RecordTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

    private RecordTypeEnum recordType;

    private Long driveLBA;

    private Integer trayNo;

    private Long volumeLBA;

    private Integer slotNo;

  
  /**
   **/
  public UnreadableSectorEntryResult driveRef(String driveRef) {
    this.driveRef = driveRef;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("driveRef")
  public String getDriveRef() {
    return driveRef;
  }
  
  public void setDriveRef(String driveRef) {
    this.driveRef = driveRef;
  }

  
  /**
   **/
  public UnreadableSectorEntryResult timeStamp(Long timeStamp) {
    this.timeStamp = timeStamp;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("timeStamp")
  public Long getTimeStamp() {
    return timeStamp;
  }
  
  public void setTimeStamp(Long timeStamp) {
    this.timeStamp = timeStamp;
  }

  
  /**
   **/
  public UnreadableSectorEntryResult volumeRef(String volumeRef) {
    this.volumeRef = volumeRef;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("volumeRef")
  public String getVolumeRef() {
    return volumeRef;
  }
  
  public void setVolumeRef(String volumeRef) {
    this.volumeRef = volumeRef;
  }

  
  /**
   **/
  public UnreadableSectorEntryResult recordType(RecordTypeEnum recordType) {
    this.recordType = recordType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("recordType")
  public RecordTypeEnum getRecordType() {
    return recordType;
  }
  
  public void setRecordType(RecordTypeEnum recordType) {
    this.recordType = recordType;
  }

  
  /**
   **/
  public UnreadableSectorEntryResult driveLBA(Long driveLBA) {
    this.driveLBA = driveLBA;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("driveLBA")
  public Long getDriveLBA() {
    return driveLBA;
  }
  
  public void setDriveLBA(Long driveLBA) {
    this.driveLBA = driveLBA;
  }

  
  /**
   **/
  public UnreadableSectorEntryResult trayNo(Integer trayNo) {
    this.trayNo = trayNo;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("trayNo")
  public Integer getTrayNo() {
    return trayNo;
  }
  
  public void setTrayNo(Integer trayNo) {
    this.trayNo = trayNo;
  }

  
  /**
   **/
  public UnreadableSectorEntryResult volumeLBA(Long volumeLBA) {
    this.volumeLBA = volumeLBA;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("volumeLBA")
  public Long getVolumeLBA() {
    return volumeLBA;
  }
  
  public void setVolumeLBA(Long volumeLBA) {
    this.volumeLBA = volumeLBA;
  }

  
  /**
   **/
  public UnreadableSectorEntryResult slotNo(Integer slotNo) {
    this.slotNo = slotNo;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("slotNo")
  public Integer getSlotNo() {
    return slotNo;
  }
  
  public void setSlotNo(Integer slotNo) {
    this.slotNo = slotNo;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UnreadableSectorEntryResult unreadableSectorEntryResult = (UnreadableSectorEntryResult) o;
    return Objects.equals(this.driveRef, unreadableSectorEntryResult.driveRef) &&
        Objects.equals(this.timeStamp, unreadableSectorEntryResult.timeStamp) &&
        Objects.equals(this.volumeRef, unreadableSectorEntryResult.volumeRef) &&
        Objects.equals(this.recordType, unreadableSectorEntryResult.recordType) &&
        Objects.equals(this.driveLBA, unreadableSectorEntryResult.driveLBA) &&
        Objects.equals(this.trayNo, unreadableSectorEntryResult.trayNo) &&
        Objects.equals(this.volumeLBA, unreadableSectorEntryResult.volumeLBA) &&
        Objects.equals(this.slotNo, unreadableSectorEntryResult.slotNo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(driveRef, timeStamp, volumeRef, recordType, driveLBA, trayNo, volumeLBA, slotNo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UnreadableSectorEntryResult {\n");
    
    sb.append("    driveRef: ").append(toIndentedString(driveRef)).append("\n");
    sb.append("    timeStamp: ").append(toIndentedString(timeStamp)).append("\n");
    sb.append("    volumeRef: ").append(toIndentedString(volumeRef)).append("\n");
    sb.append("    recordType: ").append(toIndentedString(recordType)).append("\n");
    sb.append("    driveLBA: ").append(toIndentedString(driveLBA)).append("\n");
    sb.append("    trayNo: ").append(toIndentedString(trayNo)).append("\n");
    sb.append("    volumeLBA: ").append(toIndentedString(volumeLBA)).append("\n");
    sb.append("    slotNo: ").append(toIndentedString(slotNo)).append("\n");
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

