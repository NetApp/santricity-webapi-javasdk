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
 * RecoverVolumeDescriptor
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2017-10-04T15:05:55.769-05:00")
public class RecoverVolumeDescriptor   {
  
    private String label;

    private String manager;

    private Long capacity;


  /**
   * The RAID level of the potential volume.
   */
  public enum RaidLevelEnum {
    raidUnsupported("raidUnsupported"),
    raidAll("raidAll"),
    raid0("raid0"),
    raid1("raid1"),
    raid3("raid3"),
    raid5("raid5"),
    raid6("raid6"),
    raidDiskPool("raidDiskPool"),
    __UNDEFINED("__UNDEFINED");
;
    private String value;

    RaidLevelEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

    private RaidLevelEnum raidLevel;

    private Integer segmentSize;

    private Integer readAhead;

    private Long offset;

    private Integer volumeGroupNumber;

    private Integer driveCount;

    private DriveRefList driveRefList;

    private String volumeGroupLabel;

    private String volumeWWN;

    private Integer volumeSSID;

    private Boolean dssPreallocEnabled;


  /**
   * The protection type of the volume.
   */
  public enum ProtectionTypeEnum {
    type0Protection("type0Protection"),
    type1Protection("type1Protection"),
    type2Protection("type2Protection"),
    type3Protection("type3Protection"),
    __UNDEFINED("__UNDEFINED");
;
    private String value;

    ProtectionTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

    private ProtectionTypeEnum protectionType;

    private Boolean allocateReservedSpace;

  
  /**
   * The user assigned volume name.
   **/
  public RecoverVolumeDescriptor label(String label) {
    this.label = label;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The user assigned volume name.")
  @JsonProperty("label")
  public String getLabel() {
    return label;
  }
  
  public void setLabel(String label) {
    this.label = label;
  }

  
  /**
   * The controller that will manage the volume. This is ignored if shared volume support is active.
   **/
  public RecoverVolumeDescriptor manager(String manager) {
    this.manager = manager;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The controller that will manage the volume. This is ignored if shared volume support is active.")
  @JsonProperty("manager")
  public String getManager() {
    return manager;
  }
  
  public void setManager(String manager) {
    this.manager = manager;
  }

  
  /**
   * The volume capacity in megabytes.
   **/
  public RecoverVolumeDescriptor capacity(Long capacity) {
    this.capacity = capacity;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The volume capacity in megabytes.")
  @JsonProperty("capacity")
  public Long getCapacity() {
    return capacity;
  }
  
  public void setCapacity(Long capacity) {
    this.capacity = capacity;
  }

  
  /**
   * The RAID level of the potential volume.
   **/
  public RecoverVolumeDescriptor raidLevel(RaidLevelEnum raidLevel) {
    this.raidLevel = raidLevel;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The RAID level of the potential volume.")
  @JsonProperty("raidLevel")
  public RaidLevelEnum getRaidLevel() {
    return raidLevel;
  }
  
  public void setRaidLevel(RaidLevelEnum raidLevel) {
    this.raidLevel = raidLevel;
  }

  
  /**
   * The volume segment size (bytes).
   **/
  public RecoverVolumeDescriptor segmentSize(Integer segmentSize) {
    this.segmentSize = segmentSize;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The volume segment size (bytes).")
  @JsonProperty("segmentSize")
  public Integer getSegmentSize() {
    return segmentSize;
  }
  
  public void setSegmentSize(Integer segmentSize) {
    this.segmentSize = segmentSize;
  }

  
  /**
   * A true (non-zero) / false (zero) indicator of whether or not automatic cache read-ahead is enabled.
   **/
  public RecoverVolumeDescriptor readAhead(Integer readAhead) {
    this.readAhead = readAhead;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "A true (non-zero) / false (zero) indicator of whether or not automatic cache read-ahead is enabled.")
  @JsonProperty("readAhead")
  public Integer getReadAhead() {
    return readAhead;
  }
  
  public void setReadAhead(Integer readAhead) {
    this.readAhead = readAhead;
  }

  
  /**
   * Volume begins at this drive offset (bytes).
   **/
  public RecoverVolumeDescriptor offset(Long offset) {
    this.offset = offset;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Volume begins at this drive offset (bytes).")
  @JsonProperty("offset")
  public Long getOffset() {
    return offset;
  }
  
  public void setOffset(Long offset) {
    this.offset = offset;
  }

  
  /**
   * The volume group number.
   **/
  public RecoverVolumeDescriptor volumeGroupNumber(Integer volumeGroupNumber) {
    this.volumeGroupNumber = volumeGroupNumber;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The volume group number.")
  @JsonProperty("volumeGroupNumber")
  public Integer getVolumeGroupNumber() {
    return volumeGroupNumber;
  }
  
  public void setVolumeGroupNumber(Integer volumeGroupNumber) {
    this.volumeGroupNumber = volumeGroupNumber;
  }

  
  /**
   * The number of drives in the volume group.
   **/
  public RecoverVolumeDescriptor driveCount(Integer driveCount) {
    this.driveCount = driveCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The number of drives in the volume group.")
  @JsonProperty("driveCount")
  public Integer getDriveCount() {
    return driveCount;
  }
  
  public void setDriveCount(Integer driveCount) {
    this.driveCount = driveCount;
  }

  
  /**
   * The list of drives to be used.
   **/
  public RecoverVolumeDescriptor driveRefList(DriveRefList driveRefList) {
    this.driveRefList = driveRefList;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The list of drives to be used.")
  @JsonProperty("driveRefList")
  public DriveRefList getDriveRefList() {
    return driveRefList;
  }
  
  public void setDriveRefList(DriveRefList driveRefList) {
    this.driveRefList = driveRefList;
  }

  
  /**
   * The label to assign to the new volume group when unassigned drives are used for recovery.
   **/
  public RecoverVolumeDescriptor volumeGroupLabel(String volumeGroupLabel) {
    this.volumeGroupLabel = volumeGroupLabel;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The label to assign to the new volume group when unassigned drives are used for recovery.")
  @JsonProperty("volumeGroupLabel")
  public String getVolumeGroupLabel() {
    return volumeGroupLabel;
  }
  
  public void setVolumeGroupLabel(String volumeGroupLabel) {
    this.volumeGroupLabel = volumeGroupLabel;
  }

  
  /**
   * The WWN of the volume.
   **/
  public RecoverVolumeDescriptor volumeWWN(String volumeWWN) {
    this.volumeWWN = volumeWWN;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The WWN of the volume.")
  @JsonProperty("volumeWWN")
  public String getVolumeWWN() {
    return volumeWWN;
  }
  
  public void setVolumeWWN(String volumeWWN) {
    this.volumeWWN = volumeWWN;
  }

  
  /**
   * The SSID of the volume.
   **/
  public RecoverVolumeDescriptor volumeSSID(Integer volumeSSID) {
    this.volumeSSID = volumeSSID;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The SSID of the volume.")
  @JsonProperty("volumeSSID")
  public Integer getVolumeSSID() {
    return volumeSSID;
  }
  
  public void setVolumeSSID(Integer volumeSSID) {
    this.volumeSSID = volumeSSID;
  }

  
  /**
   * True if dynamic segment sizing pre-allocation is enabled for the volume.
   **/
  public RecoverVolumeDescriptor dssPreallocEnabled(Boolean dssPreallocEnabled) {
    this.dssPreallocEnabled = dssPreallocEnabled;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "True if dynamic segment sizing pre-allocation is enabled for the volume.")
  @JsonProperty("dssPreallocEnabled")
  public Boolean getDssPreallocEnabled() {
    return dssPreallocEnabled;
  }
  
  public void setDssPreallocEnabled(Boolean dssPreallocEnabled) {
    this.dssPreallocEnabled = dssPreallocEnabled;
  }

  
  /**
   * The protection type of the volume.
   **/
  public RecoverVolumeDescriptor protectionType(ProtectionTypeEnum protectionType) {
    this.protectionType = protectionType;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The protection type of the volume.")
  @JsonProperty("protectionType")
  public ProtectionTypeEnum getProtectionType() {
    return protectionType;
  }
  
  public void setProtectionType(ProtectionTypeEnum protectionType) {
    this.protectionType = protectionType;
  }

  
  /**
   * Determines whether or not reserved space is allocated on the drives in the volume group.
   **/
  public RecoverVolumeDescriptor allocateReservedSpace(Boolean allocateReservedSpace) {
    this.allocateReservedSpace = allocateReservedSpace;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Determines whether or not reserved space is allocated on the drives in the volume group.")
  @JsonProperty("allocateReservedSpace")
  public Boolean getAllocateReservedSpace() {
    return allocateReservedSpace;
  }
  
  public void setAllocateReservedSpace(Boolean allocateReservedSpace) {
    this.allocateReservedSpace = allocateReservedSpace;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RecoverVolumeDescriptor recoverVolumeDescriptor = (RecoverVolumeDescriptor) o;
    return Objects.equals(this.label, recoverVolumeDescriptor.label) &&
        Objects.equals(this.manager, recoverVolumeDescriptor.manager) &&
        Objects.equals(this.capacity, recoverVolumeDescriptor.capacity) &&
        Objects.equals(this.raidLevel, recoverVolumeDescriptor.raidLevel) &&
        Objects.equals(this.segmentSize, recoverVolumeDescriptor.segmentSize) &&
        Objects.equals(this.readAhead, recoverVolumeDescriptor.readAhead) &&
        Objects.equals(this.offset, recoverVolumeDescriptor.offset) &&
        Objects.equals(this.volumeGroupNumber, recoverVolumeDescriptor.volumeGroupNumber) &&
        Objects.equals(this.driveCount, recoverVolumeDescriptor.driveCount) &&
        Objects.equals(this.driveRefList, recoverVolumeDescriptor.driveRefList) &&
        Objects.equals(this.volumeGroupLabel, recoverVolumeDescriptor.volumeGroupLabel) &&
        Objects.equals(this.volumeWWN, recoverVolumeDescriptor.volumeWWN) &&
        Objects.equals(this.volumeSSID, recoverVolumeDescriptor.volumeSSID) &&
        Objects.equals(this.dssPreallocEnabled, recoverVolumeDescriptor.dssPreallocEnabled) &&
        Objects.equals(this.protectionType, recoverVolumeDescriptor.protectionType) &&
        Objects.equals(this.allocateReservedSpace, recoverVolumeDescriptor.allocateReservedSpace);
  }

  @Override
  public int hashCode() {
    return Objects.hash(label, manager, capacity, raidLevel, segmentSize, readAhead, offset, volumeGroupNumber, driveCount, driveRefList, volumeGroupLabel, volumeWWN, volumeSSID, dssPreallocEnabled, protectionType, allocateReservedSpace);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecoverVolumeDescriptor {\n");
    
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    manager: ").append(toIndentedString(manager)).append("\n");
    sb.append("    capacity: ").append(toIndentedString(capacity)).append("\n");
    sb.append("    raidLevel: ").append(toIndentedString(raidLevel)).append("\n");
    sb.append("    segmentSize: ").append(toIndentedString(segmentSize)).append("\n");
    sb.append("    readAhead: ").append(toIndentedString(readAhead)).append("\n");
    sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
    sb.append("    volumeGroupNumber: ").append(toIndentedString(volumeGroupNumber)).append("\n");
    sb.append("    driveCount: ").append(toIndentedString(driveCount)).append("\n");
    sb.append("    driveRefList: ").append(toIndentedString(driveRefList)).append("\n");
    sb.append("    volumeGroupLabel: ").append(toIndentedString(volumeGroupLabel)).append("\n");
    sb.append("    volumeWWN: ").append(toIndentedString(volumeWWN)).append("\n");
    sb.append("    volumeSSID: ").append(toIndentedString(volumeSSID)).append("\n");
    sb.append("    dssPreallocEnabled: ").append(toIndentedString(dssPreallocEnabled)).append("\n");
    sb.append("    protectionType: ").append(toIndentedString(protectionType)).append("\n");
    sb.append("    allocateReservedSpace: ").append(toIndentedString(allocateReservedSpace)).append("\n");
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

