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
 * VolumeGroup
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2017-10-04T15:05:55.769-05:00")
public class VolumeGroup   {
  
    private Integer sequenceNum;

    private Boolean offline;


  /**
   * The RAID level associated with this volume group. If the storage array supports multiple RAID levels per volume group, this value will be set to RAID_ALL. Otherwise, it will indicate the precise RAID level defined for the volume group.
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

    private String worldWideName;

    private String volumeGroupRef;

    private String reserved1;

    private String reserved2;

    private Boolean trayLossProtection;

    private String label;


  /**
   * The state of the volume group.
   */
  public enum StateEnum {
    contingent("contingent"),
    exported("exported"),
    forced("forced"),
    complete("complete"),
    partial("partial"),
    incomplete("incomplete"),
    missing("missing"),
    __UNDEFINED("__UNDEFINED");
;
    private String value;

    StateEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

    private StateEnum state;

    private Boolean spindleSpeedMatch;

    private Integer spindleSpeed;

    private Boolean isInaccessible;


  /**
   * security status of the drive group
   */
  public enum SecurityTypeEnum {
    unknown("unknown"),
    none("none"),
    capable("capable"),
    enabled("enabled"),
    __UNDEFINED("__UNDEFINED");
;
    private String value;

    SecurityTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

    private SecurityTypeEnum securityType;

    private Boolean drawerLossProtection;

    private Boolean protectionInformationCapable;

    private ProtectionInformationCapabilities protectionInformationCapabilities;

    private VolumeGroupTypeData volumeGroupData;


  /**
   * the volume group usage.
   */
  public enum UsageEnum {
    unknown("unknown"),
    standard("standard"),
    flashcache("flashcache"),
    __UNDEFINED("__UNDEFINED");
;
    private String value;

    UsageEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

    private UsageEnum usage;


  /**
   * Identifies the drive block format of the volume candidate.
   */
  public enum DriveBlockFormatEnum {
    unknown("unknown"),
    allNative("allNative"),
    allEmulated("allEmulated"),
    mixed("mixed"),
    __UNDEFINED("__UNDEFINED");
;
    private String value;

    DriveBlockFormatEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

    private DriveBlockFormatEnum driveBlockFormat;

    private Boolean reservedSpaceAllocated;


  /**
   * Refines the information in the securityType field to describe the set of drives.
   */
  public enum SecurityLevelEnum {
    unknown("unknown"),
    none("none"),
    mixed("mixed"),
    fde("fde"),
    fips("fips"),
    __UNDEFINED("__UNDEFINED");
;
    private String value;

    SecurityLevelEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

    private SecurityLevelEnum securityLevel;

    private String name;

    private String id;

  
  /**
   * A sequence number that uniquely identifies this volume group within the array in which it resides. Sequence numbers are assigned to volume groups when they are created or imported into a storage array. The controller assigns the lowest unused sequence number during a creation or import operation.
   **/
  public VolumeGroup sequenceNum(Integer sequenceNum) {
    this.sequenceNum = sequenceNum;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "A sequence number that uniquely identifies this volume group within the array in which it resides. Sequence numbers are assigned to volume groups when they are created or imported into a storage array. The controller assigns the lowest unused sequence number during a creation or import operation.")
  @JsonProperty("sequenceNum")
  public Integer getSequenceNum() {
    return sequenceNum;
  }
  
  public void setSequenceNum(Integer sequenceNum) {
    this.sequenceNum = sequenceNum;
  }

  
  /**
   * An indication of whether the volume group is currently offline. A volume group can be taken offline by the operator in preparation for removing its drives and transporting them to another storage array.
   **/
  public VolumeGroup offline(Boolean offline) {
    this.offline = offline;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "An indication of whether the volume group is currently offline. A volume group can be taken offline by the operator in preparation for removing its drives and transporting them to another storage array.")
  @JsonProperty("offline")
  public Boolean getOffline() {
    return offline;
  }
  
  public void setOffline(Boolean offline) {
    this.offline = offline;
  }

  
  /**
   * The RAID level associated with this volume group. If the storage array supports multiple RAID levels per volume group, this value will be set to RAID_ALL. Otherwise, it will indicate the precise RAID level defined for the volume group.
   **/
  public VolumeGroup raidLevel(RaidLevelEnum raidLevel) {
    this.raidLevel = raidLevel;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The RAID level associated with this volume group. If the storage array supports multiple RAID levels per volume group, this value will be set to RAID_ALL. Otherwise, it will indicate the precise RAID level defined for the volume group.")
  @JsonProperty("raidLevel")
  public RaidLevelEnum getRaidLevel() {
    return raidLevel;
  }
  
  public void setRaidLevel(RaidLevelEnum raidLevel) {
    this.raidLevel = raidLevel;
  }

  
  /**
   * A variable-length opaque field that provides the volume group's worldwide unique identification value.
   **/
  public VolumeGroup worldWideName(String worldWideName) {
    this.worldWideName = worldWideName;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "A variable-length opaque field that provides the volume group's worldwide unique identification value.")
  @JsonProperty("worldWideName")
  public String getWorldWideName() {
    return worldWideName;
  }
  
  public void setWorldWideName(String worldWideName) {
    this.worldWideName = worldWideName;
  }

  
  /**
   * The unique identification value for this volume group. Other objects may use this reference value to refer to the volume group.
   **/
  public VolumeGroup volumeGroupRef(String volumeGroupRef) {
    this.volumeGroupRef = volumeGroupRef;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The unique identification value for this volume group. Other objects may use this reference value to refer to the volume group.")
  @JsonProperty("volumeGroupRef")
  public String getVolumeGroupRef() {
    return volumeGroupRef;
  }
  
  public void setVolumeGroupRef(String volumeGroupRef) {
    this.volumeGroupRef = volumeGroupRef;
  }

  
  /**
   **/
  public VolumeGroup reserved1(String reserved1) {
    this.reserved1 = reserved1;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("reserved1")
  public String getReserved1() {
    return reserved1;
  }
  
  public void setReserved1(String reserved1) {
    this.reserved1 = reserved1;
  }

  
  /**
   **/
  public VolumeGroup reserved2(String reserved2) {
    this.reserved2 = reserved2;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("reserved2")
  public String getReserved2() {
    return reserved2;
  }
  
  public void setReserved2(String reserved2) {
    this.reserved2 = reserved2;
  }

  
  /**
   * An indication as to whether the volume group has tray loss protection.
   **/
  public VolumeGroup trayLossProtection(Boolean trayLossProtection) {
    this.trayLossProtection = trayLossProtection;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "An indication as to whether the volume group has tray loss protection.")
  @JsonProperty("trayLossProtection")
  public Boolean getTrayLossProtection() {
    return trayLossProtection;
  }
  
  public void setTrayLossProtection(Boolean trayLossProtection) {
    this.trayLossProtection = trayLossProtection;
  }

  
  /**
   * The volume group label, which can be set by the user.
   **/
  public VolumeGroup label(String label) {
    this.label = label;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The volume group label, which can be set by the user.")
  @JsonProperty("label")
  public String getLabel() {
    return label;
  }
  
  public void setLabel(String label) {
    this.label = label;
  }

  
  /**
   * The state of the volume group.
   **/
  public VolumeGroup state(StateEnum state) {
    this.state = state;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The state of the volume group.")
  @JsonProperty("state")
  public StateEnum getState() {
    return state;
  }
  
  public void setState(StateEnum state) {
    this.state = state;
  }

  
  /**
   * Set to true if all of the drives in the group have matching normalized spindle speeds. (Normalized spindle speeds are standardized norms (e.g., 5400, 7200, etc.) that are used for spindle speed matching, even though actual spindle speeds may be within a designated delta of the normalized speed.)
   **/
  public VolumeGroup spindleSpeedMatch(Boolean spindleSpeedMatch) {
    this.spindleSpeedMatch = spindleSpeedMatch;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Set to true if all of the drives in the group have matching normalized spindle speeds. (Normalized spindle speeds are standardized norms (e.g., 5400, 7200, etc.) that are used for spindle speed matching, even though actual spindle speeds may be within a designated delta of the normalized speed.)")
  @JsonProperty("spindleSpeedMatch")
  public Boolean getSpindleSpeedMatch() {
    return spindleSpeedMatch;
  }
  
  public void setSpindleSpeedMatch(Boolean spindleSpeedMatch) {
    this.spindleSpeedMatch = spindleSpeedMatch;
  }

  
  /**
   * Set to true if all of the drives in the group have matching normalized spindle speeds. (Normalized spindle speeds are standardized norms (e.g., 5400, 7200, etc.) that are used for spindle speed matching, even though actual spindle speeds may be within a designated delta of the normalized speed.)
   **/
  public VolumeGroup spindleSpeed(Integer spindleSpeed) {
    this.spindleSpeed = spindleSpeed;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Set to true if all of the drives in the group have matching normalized spindle speeds. (Normalized spindle speeds are standardized norms (e.g., 5400, 7200, etc.) that are used for spindle speed matching, even though actual spindle speeds may be within a designated delta of the normalized speed.)")
  @JsonProperty("spindleSpeed")
  public Integer getSpindleSpeed() {
    return spindleSpeed;
  }
  
  public void setSpindleSpeed(Integer spindleSpeed) {
    this.spindleSpeed = spindleSpeed;
  }

  
  /**
   * True if the volume group contains incompatible drives that have been locked out.
   **/
  public VolumeGroup isInaccessible(Boolean isInaccessible) {
    this.isInaccessible = isInaccessible;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "True if the volume group contains incompatible drives that have been locked out.")
  @JsonProperty("isInaccessible")
  public Boolean getIsInaccessible() {
    return isInaccessible;
  }
  
  public void setIsInaccessible(Boolean isInaccessible) {
    this.isInaccessible = isInaccessible;
  }

  
  /**
   * security status of the drive group
   **/
  public VolumeGroup securityType(SecurityTypeEnum securityType) {
    this.securityType = securityType;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "security status of the drive group")
  @JsonProperty("securityType")
  public SecurityTypeEnum getSecurityType() {
    return securityType;
  }
  
  public void setSecurityType(SecurityTypeEnum securityType) {
    this.securityType = securityType;
  }

  
  /**
   * This field is set to true when the volume group has drawer loss protection; otherwise it is set to false
   **/
  public VolumeGroup drawerLossProtection(Boolean drawerLossProtection) {
    this.drawerLossProtection = drawerLossProtection;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "This field is set to true when the volume group has drawer loss protection; otherwise it is set to false")
  @JsonProperty("drawerLossProtection")
  public Boolean getDrawerLossProtection() {
    return drawerLossProtection;
  }
  
  public void setDrawerLossProtection(Boolean drawerLossProtection) {
    this.drawerLossProtection = drawerLossProtection;
  }

  
  /**
   * This field is no longer used.
   **/
  public VolumeGroup protectionInformationCapable(Boolean protectionInformationCapable) {
    this.protectionInformationCapable = protectionInformationCapable;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "This field is no longer used.")
  @JsonProperty("protectionInformationCapable")
  public Boolean getProtectionInformationCapable() {
    return protectionInformationCapable;
  }
  
  public void setProtectionInformationCapable(Boolean protectionInformationCapable) {
    this.protectionInformationCapable = protectionInformationCapable;
  }

  
  /**
   * This structure contains a protectionInformationCapable field which is set to true if all drives in the volume group are Protection Information (PI) capable. It also contains a field that is set to the protection type for the volume group.
   **/
  public VolumeGroup protectionInformationCapabilities(ProtectionInformationCapabilities protectionInformationCapabilities) {
    this.protectionInformationCapabilities = protectionInformationCapabilities;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "This structure contains a protectionInformationCapable field which is set to true if all drives in the volume group are Protection Information (PI) capable. It also contains a field that is set to the protection type for the volume group.")
  @JsonProperty("protectionInformationCapabilities")
  public ProtectionInformationCapabilities getProtectionInformationCapabilities() {
    return protectionInformationCapabilities;
  }
  
  public void setProtectionInformationCapabilities(ProtectionInformationCapabilities protectionInformationCapabilities) {
    this.protectionInformationCapabilities = protectionInformationCapabilities;
  }

  
  /**
   * Information about the Volume Group.
   **/
  public VolumeGroup volumeGroupData(VolumeGroupTypeData volumeGroupData) {
    this.volumeGroupData = volumeGroupData;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Information about the Volume Group.")
  @JsonProperty("volumeGroupData")
  public VolumeGroupTypeData getVolumeGroupData() {
    return volumeGroupData;
  }
  
  public void setVolumeGroupData(VolumeGroupTypeData volumeGroupData) {
    this.volumeGroupData = volumeGroupData;
  }

  
  /**
   * the volume group usage.
   **/
  public VolumeGroup usage(UsageEnum usage) {
    this.usage = usage;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "the volume group usage.")
  @JsonProperty("usage")
  public UsageEnum getUsage() {
    return usage;
  }
  
  public void setUsage(UsageEnum usage) {
    this.usage = usage;
  }

  
  /**
   * Identifies the drive block format of the volume candidate.
   **/
  public VolumeGroup driveBlockFormat(DriveBlockFormatEnum driveBlockFormat) {
    this.driveBlockFormat = driveBlockFormat;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Identifies the drive block format of the volume candidate.")
  @JsonProperty("driveBlockFormat")
  public DriveBlockFormatEnum getDriveBlockFormat() {
    return driveBlockFormat;
  }
  
  public void setDriveBlockFormat(DriveBlockFormatEnum driveBlockFormat) {
    this.driveBlockFormat = driveBlockFormat;
  }

  
  /**
   * This field will be used to report whether or not reserved space has been claimed on all drives in the volume group. The recovery-volume script will include this field for each volume group record it creates, so that during volume recovery the volume group is recreated correctly.
   **/
  public VolumeGroup reservedSpaceAllocated(Boolean reservedSpaceAllocated) {
    this.reservedSpaceAllocated = reservedSpaceAllocated;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "This field will be used to report whether or not reserved space has been claimed on all drives in the volume group. The recovery-volume script will include this field for each volume group record it creates, so that during volume recovery the volume group is recreated correctly.")
  @JsonProperty("reservedSpaceAllocated")
  public Boolean getReservedSpaceAllocated() {
    return reservedSpaceAllocated;
  }
  
  public void setReservedSpaceAllocated(Boolean reservedSpaceAllocated) {
    this.reservedSpaceAllocated = reservedSpaceAllocated;
  }

  
  /**
   * Refines the information in the securityType field to describe the set of drives.
   **/
  public VolumeGroup securityLevel(SecurityLevelEnum securityLevel) {
    this.securityLevel = securityLevel;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Refines the information in the securityType field to describe the set of drives.")
  @JsonProperty("securityLevel")
  public SecurityLevelEnum getSecurityLevel() {
    return securityLevel;
  }
  
  public void setSecurityLevel(SecurityLevelEnum securityLevel) {
    this.securityLevel = securityLevel;
  }

  
  /**
   **/
  public VolumeGroup name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   **/
  public VolumeGroup id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  
  public void setId(String id) {
    this.id = id;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VolumeGroup volumeGroup = (VolumeGroup) o;
    return Objects.equals(this.sequenceNum, volumeGroup.sequenceNum) &&
        Objects.equals(this.offline, volumeGroup.offline) &&
        Objects.equals(this.raidLevel, volumeGroup.raidLevel) &&
        Objects.equals(this.worldWideName, volumeGroup.worldWideName) &&
        Objects.equals(this.volumeGroupRef, volumeGroup.volumeGroupRef) &&
        Objects.equals(this.reserved1, volumeGroup.reserved1) &&
        Objects.equals(this.reserved2, volumeGroup.reserved2) &&
        Objects.equals(this.trayLossProtection, volumeGroup.trayLossProtection) &&
        Objects.equals(this.label, volumeGroup.label) &&
        Objects.equals(this.state, volumeGroup.state) &&
        Objects.equals(this.spindleSpeedMatch, volumeGroup.spindleSpeedMatch) &&
        Objects.equals(this.spindleSpeed, volumeGroup.spindleSpeed) &&
        Objects.equals(this.isInaccessible, volumeGroup.isInaccessible) &&
        Objects.equals(this.securityType, volumeGroup.securityType) &&
        Objects.equals(this.drawerLossProtection, volumeGroup.drawerLossProtection) &&
        Objects.equals(this.protectionInformationCapable, volumeGroup.protectionInformationCapable) &&
        Objects.equals(this.protectionInformationCapabilities, volumeGroup.protectionInformationCapabilities) &&
        Objects.equals(this.volumeGroupData, volumeGroup.volumeGroupData) &&
        Objects.equals(this.usage, volumeGroup.usage) &&
        Objects.equals(this.driveBlockFormat, volumeGroup.driveBlockFormat) &&
        Objects.equals(this.reservedSpaceAllocated, volumeGroup.reservedSpaceAllocated) &&
        Objects.equals(this.securityLevel, volumeGroup.securityLevel) &&
        Objects.equals(this.name, volumeGroup.name) &&
        Objects.equals(this.id, volumeGroup.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sequenceNum, offline, raidLevel, worldWideName, volumeGroupRef, reserved1, reserved2, trayLossProtection, label, state, spindleSpeedMatch, spindleSpeed, isInaccessible, securityType, drawerLossProtection, protectionInformationCapable, protectionInformationCapabilities, volumeGroupData, usage, driveBlockFormat, reservedSpaceAllocated, securityLevel, name, id);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VolumeGroup {\n");
    
    sb.append("    sequenceNum: ").append(toIndentedString(sequenceNum)).append("\n");
    sb.append("    offline: ").append(toIndentedString(offline)).append("\n");
    sb.append("    raidLevel: ").append(toIndentedString(raidLevel)).append("\n");
    sb.append("    worldWideName: ").append(toIndentedString(worldWideName)).append("\n");
    sb.append("    volumeGroupRef: ").append(toIndentedString(volumeGroupRef)).append("\n");
    sb.append("    reserved1: ").append(toIndentedString(reserved1)).append("\n");
    sb.append("    reserved2: ").append(toIndentedString(reserved2)).append("\n");
    sb.append("    trayLossProtection: ").append(toIndentedString(trayLossProtection)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    spindleSpeedMatch: ").append(toIndentedString(spindleSpeedMatch)).append("\n");
    sb.append("    spindleSpeed: ").append(toIndentedString(spindleSpeed)).append("\n");
    sb.append("    isInaccessible: ").append(toIndentedString(isInaccessible)).append("\n");
    sb.append("    securityType: ").append(toIndentedString(securityType)).append("\n");
    sb.append("    drawerLossProtection: ").append(toIndentedString(drawerLossProtection)).append("\n");
    sb.append("    protectionInformationCapable: ").append(toIndentedString(protectionInformationCapable)).append("\n");
    sb.append("    protectionInformationCapabilities: ").append(toIndentedString(protectionInformationCapabilities)).append("\n");
    sb.append("    volumeGroupData: ").append(toIndentedString(volumeGroupData)).append("\n");
    sb.append("    usage: ").append(toIndentedString(usage)).append("\n");
    sb.append("    driveBlockFormat: ").append(toIndentedString(driveBlockFormat)).append("\n");
    sb.append("    reservedSpaceAllocated: ").append(toIndentedString(reservedSpaceAllocated)).append("\n");
    sb.append("    securityLevel: ").append(toIndentedString(securityLevel)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

