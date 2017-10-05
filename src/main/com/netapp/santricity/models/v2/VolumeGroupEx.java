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
 * VolumeGroupEx
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2017-10-04T15:05:52.333-05:00")
public class VolumeGroupEx   {
  
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

    private Long usedSpace;

    private Long totalRaidedSpace;

    private List<FreeExtent> extents;

    private Long largestFreeExtentSize;


  /**
   * The raid status reflects the worst case raid level of any volume on the group
   */
  public enum RaidStatusEnum {
    optimal("optimal"),
    degraded("degraded"),
    failed("failed"),
    impaired("impaired"),
    creating("creating"),
    deleting("deleting"),
    __UNDEFINED("__UNDEFINED");
;
    private String value;

    RaidStatusEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

    private RaidStatusEnum raidStatus;

    private Long freeSpace;


  /**
   * Defines the physical interface type of the underlying drives.
   */
  public enum DrivePhysicalTypeEnum {
    all("all"),
    scsi("scsi"),
    fibre("fibre"),
    sata("sata"),
    pata("pata"),
    fibre520b("fibre520b"),
    sas("sas"),
    unknown("unknown"),
    sas4k("sas4k"),
    __UNDEFINED("__UNDEFINED");
;
    private String value;

    DrivePhysicalTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

    private DrivePhysicalTypeEnum drivePhysicalType;


  /**
   * Defines whether is an SSD or a spinning drive.
   */
  public enum DriveMediaTypeEnum {
    all("all"),
    unknown("unknown"),
    hdd("hdd"),
    ssd("ssd"),
    __UNDEFINED("__UNDEFINED");
;
    private String value;

    DriveMediaTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

    private DriveMediaTypeEnum driveMediaType;


  /**
   * The normalized spindle speed of the drives composing the pool. Ex: 7200, 5400, 15000. If drives have mismatched spindle speeds, this value may not be accurate.
   */
  public enum NormalizedSpindleSpeedEnum {
    spindleSpeedUnknown("spindleSpeedUnknown"),
    spindleSpeedSSD("spindleSpeedSSD"),
    spindleSpeed5400("spindleSpeed5400"),
    spindleSpeed7200("spindleSpeed7200"),
    spindleSpeed10k("spindleSpeed10k"),
    spindleSpeed15k("spindleSpeed15k");
;
    private String value;

    NormalizedSpindleSpeedEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

    private NormalizedSpindleSpeedEnum normalizedSpindleSpeed;

    private Boolean diskPool;

    private String id;

    private String name;

  
  /**
   * A sequence number that uniquely identifies this volume group within the array in which it resides. Sequence numbers are assigned to volume groups when they are created or imported into a storage array. The controller assigns the lowest unused sequence number during a creation or import operation.
   **/
  public VolumeGroupEx sequenceNum(Integer sequenceNum) {
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
  public VolumeGroupEx offline(Boolean offline) {
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
  public VolumeGroupEx raidLevel(RaidLevelEnum raidLevel) {
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
  public VolumeGroupEx worldWideName(String worldWideName) {
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
  public VolumeGroupEx volumeGroupRef(String volumeGroupRef) {
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
  public VolumeGroupEx reserved1(String reserved1) {
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
  public VolumeGroupEx reserved2(String reserved2) {
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
  public VolumeGroupEx trayLossProtection(Boolean trayLossProtection) {
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
  public VolumeGroupEx label(String label) {
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
  public VolumeGroupEx state(StateEnum state) {
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
  public VolumeGroupEx spindleSpeedMatch(Boolean spindleSpeedMatch) {
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
   * The spindle speed of the drives composing the pool (RPM)
   **/
  public VolumeGroupEx spindleSpeed(Integer spindleSpeed) {
    this.spindleSpeed = spindleSpeed;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The spindle speed of the drives composing the pool (RPM)")
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
  public VolumeGroupEx isInaccessible(Boolean isInaccessible) {
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
  public VolumeGroupEx securityType(SecurityTypeEnum securityType) {
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
  public VolumeGroupEx drawerLossProtection(Boolean drawerLossProtection) {
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
  public VolumeGroupEx protectionInformationCapable(Boolean protectionInformationCapable) {
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
  public VolumeGroupEx protectionInformationCapabilities(ProtectionInformationCapabilities protectionInformationCapabilities) {
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
  public VolumeGroupEx volumeGroupData(VolumeGroupTypeData volumeGroupData) {
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
  public VolumeGroupEx usage(UsageEnum usage) {
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
  public VolumeGroupEx driveBlockFormat(DriveBlockFormatEnum driveBlockFormat) {
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
  public VolumeGroupEx reservedSpaceAllocated(Boolean reservedSpaceAllocated) {
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
  public VolumeGroupEx securityLevel(SecurityLevelEnum securityLevel) {
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
  public VolumeGroupEx usedSpace(Long usedSpace) {
    this.usedSpace = usedSpace;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("usedSpace")
  public Long getUsedSpace() {
    return usedSpace;
  }
  
  public void setUsedSpace(Long usedSpace) {
    this.usedSpace = usedSpace;
  }

  
  /**
   * Raw capacity of the volumeGroup
   **/
  public VolumeGroupEx totalRaidedSpace(Long totalRaidedSpace) {
    this.totalRaidedSpace = totalRaidedSpace;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Raw capacity of the volumeGroup")
  @JsonProperty("totalRaidedSpace")
  public Long getTotalRaidedSpace() {
    return totalRaidedSpace;
  }
  
  public void setTotalRaidedSpace(Long totalRaidedSpace) {
    this.totalRaidedSpace = totalRaidedSpace;
  }

  
  /**
   **/
  public VolumeGroupEx extents(List<FreeExtent> extents) {
    this.extents = extents;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("extents")
  public List<FreeExtent> getExtents() {
    return extents;
  }
  
  public void setExtents(List<FreeExtent> extents) {
    this.extents = extents;
  }

  
  /**
   **/
  public VolumeGroupEx largestFreeExtentSize(Long largestFreeExtentSize) {
    this.largestFreeExtentSize = largestFreeExtentSize;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("largestFreeExtentSize")
  public Long getLargestFreeExtentSize() {
    return largestFreeExtentSize;
  }
  
  public void setLargestFreeExtentSize(Long largestFreeExtentSize) {
    this.largestFreeExtentSize = largestFreeExtentSize;
  }

  
  /**
   * The raid status reflects the worst case raid level of any volume on the group
   **/
  public VolumeGroupEx raidStatus(RaidStatusEnum raidStatus) {
    this.raidStatus = raidStatus;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The raid status reflects the worst case raid level of any volume on the group")
  @JsonProperty("raidStatus")
  public RaidStatusEnum getRaidStatus() {
    return raidStatus;
  }
  
  public void setRaidStatus(RaidStatusEnum raidStatus) {
    this.raidStatus = raidStatus;
  }

  
  /**
   **/
  public VolumeGroupEx freeSpace(Long freeSpace) {
    this.freeSpace = freeSpace;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("freeSpace")
  public Long getFreeSpace() {
    return freeSpace;
  }
  
  public void setFreeSpace(Long freeSpace) {
    this.freeSpace = freeSpace;
  }

  
  /**
   * Defines the physical interface type of the underlying drives.
   **/
  public VolumeGroupEx drivePhysicalType(DrivePhysicalTypeEnum drivePhysicalType) {
    this.drivePhysicalType = drivePhysicalType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Defines the physical interface type of the underlying drives.")
  @JsonProperty("drivePhysicalType")
  public DrivePhysicalTypeEnum getDrivePhysicalType() {
    return drivePhysicalType;
  }
  
  public void setDrivePhysicalType(DrivePhysicalTypeEnum drivePhysicalType) {
    this.drivePhysicalType = drivePhysicalType;
  }

  
  /**
   * Defines whether is an SSD or a spinning drive.
   **/
  public VolumeGroupEx driveMediaType(DriveMediaTypeEnum driveMediaType) {
    this.driveMediaType = driveMediaType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Defines whether is an SSD or a spinning drive.")
  @JsonProperty("driveMediaType")
  public DriveMediaTypeEnum getDriveMediaType() {
    return driveMediaType;
  }
  
  public void setDriveMediaType(DriveMediaTypeEnum driveMediaType) {
    this.driveMediaType = driveMediaType;
  }

  
  /**
   * The normalized spindle speed of the drives composing the pool. Ex: 7200, 5400, 15000. If drives have mismatched spindle speeds, this value may not be accurate.
   **/
  public VolumeGroupEx normalizedSpindleSpeed(NormalizedSpindleSpeedEnum normalizedSpindleSpeed) {
    this.normalizedSpindleSpeed = normalizedSpindleSpeed;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The normalized spindle speed of the drives composing the pool. Ex: 7200, 5400, 15000. If drives have mismatched spindle speeds, this value may not be accurate.")
  @JsonProperty("normalizedSpindleSpeed")
  public NormalizedSpindleSpeedEnum getNormalizedSpindleSpeed() {
    return normalizedSpindleSpeed;
  }
  
  public void setNormalizedSpindleSpeed(NormalizedSpindleSpeedEnum normalizedSpindleSpeed) {
    this.normalizedSpindleSpeed = normalizedSpindleSpeed;
  }

  
  /**
   * True if the RAID Level is defined as raidDiskPool.
   **/
  public VolumeGroupEx diskPool(Boolean diskPool) {
    this.diskPool = diskPool;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "True if the RAID Level is defined as raidDiskPool.")
  @JsonProperty("diskPool")
  public Boolean getDiskPool() {
    return diskPool;
  }
  
  public void setDiskPool(Boolean diskPool) {
    this.diskPool = diskPool;
  }

  
  /**
   **/
  public VolumeGroupEx id(String id) {
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

  
  /**
   **/
  public VolumeGroupEx name(String name) {
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

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VolumeGroupEx volumeGroupEx = (VolumeGroupEx) o;
    return Objects.equals(this.sequenceNum, volumeGroupEx.sequenceNum) &&
        Objects.equals(this.offline, volumeGroupEx.offline) &&
        Objects.equals(this.raidLevel, volumeGroupEx.raidLevel) &&
        Objects.equals(this.worldWideName, volumeGroupEx.worldWideName) &&
        Objects.equals(this.volumeGroupRef, volumeGroupEx.volumeGroupRef) &&
        Objects.equals(this.reserved1, volumeGroupEx.reserved1) &&
        Objects.equals(this.reserved2, volumeGroupEx.reserved2) &&
        Objects.equals(this.trayLossProtection, volumeGroupEx.trayLossProtection) &&
        Objects.equals(this.label, volumeGroupEx.label) &&
        Objects.equals(this.state, volumeGroupEx.state) &&
        Objects.equals(this.spindleSpeedMatch, volumeGroupEx.spindleSpeedMatch) &&
        Objects.equals(this.spindleSpeed, volumeGroupEx.spindleSpeed) &&
        Objects.equals(this.isInaccessible, volumeGroupEx.isInaccessible) &&
        Objects.equals(this.securityType, volumeGroupEx.securityType) &&
        Objects.equals(this.drawerLossProtection, volumeGroupEx.drawerLossProtection) &&
        Objects.equals(this.protectionInformationCapable, volumeGroupEx.protectionInformationCapable) &&
        Objects.equals(this.protectionInformationCapabilities, volumeGroupEx.protectionInformationCapabilities) &&
        Objects.equals(this.volumeGroupData, volumeGroupEx.volumeGroupData) &&
        Objects.equals(this.usage, volumeGroupEx.usage) &&
        Objects.equals(this.driveBlockFormat, volumeGroupEx.driveBlockFormat) &&
        Objects.equals(this.reservedSpaceAllocated, volumeGroupEx.reservedSpaceAllocated) &&
        Objects.equals(this.securityLevel, volumeGroupEx.securityLevel) &&
        Objects.equals(this.usedSpace, volumeGroupEx.usedSpace) &&
        Objects.equals(this.totalRaidedSpace, volumeGroupEx.totalRaidedSpace) &&
        Objects.equals(this.extents, volumeGroupEx.extents) &&
        Objects.equals(this.largestFreeExtentSize, volumeGroupEx.largestFreeExtentSize) &&
        Objects.equals(this.raidStatus, volumeGroupEx.raidStatus) &&
        Objects.equals(this.freeSpace, volumeGroupEx.freeSpace) &&
        Objects.equals(this.drivePhysicalType, volumeGroupEx.drivePhysicalType) &&
        Objects.equals(this.driveMediaType, volumeGroupEx.driveMediaType) &&
        Objects.equals(this.normalizedSpindleSpeed, volumeGroupEx.normalizedSpindleSpeed) &&
        Objects.equals(this.diskPool, volumeGroupEx.diskPool) &&
        Objects.equals(this.id, volumeGroupEx.id) &&
        Objects.equals(this.name, volumeGroupEx.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sequenceNum, offline, raidLevel, worldWideName, volumeGroupRef, reserved1, reserved2, trayLossProtection, label, state, spindleSpeedMatch, spindleSpeed, isInaccessible, securityType, drawerLossProtection, protectionInformationCapable, protectionInformationCapabilities, volumeGroupData, usage, driveBlockFormat, reservedSpaceAllocated, securityLevel, usedSpace, totalRaidedSpace, extents, largestFreeExtentSize, raidStatus, freeSpace, drivePhysicalType, driveMediaType, normalizedSpindleSpeed, diskPool, id, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VolumeGroupEx {\n");
    
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
    sb.append("    usedSpace: ").append(toIndentedString(usedSpace)).append("\n");
    sb.append("    totalRaidedSpace: ").append(toIndentedString(totalRaidedSpace)).append("\n");
    sb.append("    extents: ").append(toIndentedString(extents)).append("\n");
    sb.append("    largestFreeExtentSize: ").append(toIndentedString(largestFreeExtentSize)).append("\n");
    sb.append("    raidStatus: ").append(toIndentedString(raidStatus)).append("\n");
    sb.append("    freeSpace: ").append(toIndentedString(freeSpace)).append("\n");
    sb.append("    drivePhysicalType: ").append(toIndentedString(drivePhysicalType)).append("\n");
    sb.append("    driveMediaType: ").append(toIndentedString(driveMediaType)).append("\n");
    sb.append("    normalizedSpindleSpeed: ").append(toIndentedString(normalizedSpindleSpeed)).append("\n");
    sb.append("    diskPool: ").append(toIndentedString(diskPool)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

