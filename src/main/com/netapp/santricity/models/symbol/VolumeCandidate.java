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
 * VolumeCandidate
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2017-10-04T15:05:55.769-05:00")
public class VolumeCandidate   {
  

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

    private Boolean trayLossProtection;

    private Long rawSize;

    private Long usableSize;

    private Integer driveCount;

    private String freeExtentRef;

    private DriveRefList driveRefList;


  /**
   * The type of candidate selection that was used to obtain this volume candidate.
   */
  public enum CandidateSelectionTypeEnum {
    freeExtent("freeExtent"),
    manual("manual"),
    count("count"),
    __UNDEFINED("__UNDEFINED");
;
    private String value;

    CandidateSelectionTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

    private CandidateSelectionTypeEnum candidateSelectionType;

    private Boolean spindleSpeedMatch;

    private Integer spindleSpeed;


  /**
   * The physical drive type.
   */
  public enum PhyDriveTypeEnum {
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

    PhyDriveTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

    private PhyDriveTypeEnum phyDriveType;

    private Boolean dssPreallocEnabled;


  /**
   * The desired security level of the drive group.
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


  /**
   * Drive media type (HDD or SSD) of the volume candidate.
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

    private Boolean protectionInformationCapable;

    private ProtectionInformationCapabilities protectionInformationCapabilities;

    private VolumeCandidateTypeData volumeCandidateData;


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

    private Boolean allocateReservedSpace;


  /**
   * Describes the overall security level of the drive set. Values can include: FDE only, FIPS only, mixed, or no security. Used along with the SecurityType field.
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

  
  /**
   * The RAID level of the potential volume.
   **/
  public VolumeCandidate raidLevel(RaidLevelEnum raidLevel) {
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
   * This field is set to true if the candidate has tray loss protection.
   **/
  public VolumeCandidate trayLossProtection(Boolean trayLossProtection) {
    this.trayLossProtection = trayLossProtection;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "This field is set to true if the candidate has tray loss protection.")
  @JsonProperty("trayLossProtection")
  public Boolean getTrayLossProtection() {
    return trayLossProtection;
  }
  
  public void setTrayLossProtection(Boolean trayLossProtection) {
    this.trayLossProtection = trayLossProtection;
  }

  
  /**
   * This value is the maximum allowed user data storage capacity for the volume if the smallest possible segment is used in creating the volume.
   **/
  public VolumeCandidate rawSize(Long rawSize) {
    this.rawSize = rawSize;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "This value is the maximum allowed user data storage capacity for the volume if the smallest possible segment is used in creating the volume.")
  @JsonProperty("rawSize")
  public Long getRawSize() {
    return rawSize;
  }
  
  public void setRawSize(Long rawSize) {
    this.rawSize = rawSize;
  }

  
  /**
   * This value is the maximum allowed user data storage capacity for the volume if the largest possible segment is used in creating the volume.
   **/
  public VolumeCandidate usableSize(Long usableSize) {
    this.usableSize = usableSize;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "This value is the maximum allowed user data storage capacity for the volume if the largest possible segment is used in creating the volume.")
  @JsonProperty("usableSize")
  public Long getUsableSize() {
    return usableSize;
  }
  
  public void setUsableSize(Long usableSize) {
    this.usableSize = usableSize;
  }

  
  /**
   * The number of drives in the potential volume's volume group.
   **/
  public VolumeCandidate driveCount(Integer driveCount) {
    this.driveCount = driveCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The number of drives in the potential volume's volume group.")
  @JsonProperty("driveCount")
  public Integer getDriveCount() {
    return driveCount;
  }
  
  public void setDriveCount(Integer driveCount) {
    this.driveCount = driveCount;
  }

  
  /**
   * The reference value of the free extent on which the potential volume would be created. This field will be valid only if the volume candidate was obtained using a candidate selection type of CANDIDATE_SEL_FREE_EXTENT.
   **/
  public VolumeCandidate freeExtentRef(String freeExtentRef) {
    this.freeExtentRef = freeExtentRef;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The reference value of the free extent on which the potential volume would be created. This field will be valid only if the volume candidate was obtained using a candidate selection type of CANDIDATE_SEL_FREE_EXTENT.")
  @JsonProperty("freeExtentRef")
  public String getFreeExtentRef() {
    return freeExtentRef;
  }
  
  public void setFreeExtentRef(String freeExtentRef) {
    this.freeExtentRef = freeExtentRef;
  }

  
  /**
   * A list of the reference values of the drives on which the volume group for the potential volume would be created. This field will be valid only if the volume candidate was obtained using a candidate selection type of CANDIDATE_SEL_MANUAL.
   **/
  public VolumeCandidate driveRefList(DriveRefList driveRefList) {
    this.driveRefList = driveRefList;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "A list of the reference values of the drives on which the volume group for the potential volume would be created. This field will be valid only if the volume candidate was obtained using a candidate selection type of CANDIDATE_SEL_MANUAL.")
  @JsonProperty("driveRefList")
  public DriveRefList getDriveRefList() {
    return driveRefList;
  }
  
  public void setDriveRefList(DriveRefList driveRefList) {
    this.driveRefList = driveRefList;
  }

  
  /**
   * The type of candidate selection that was used to obtain this volume candidate.
   **/
  public VolumeCandidate candidateSelectionType(CandidateSelectionTypeEnum candidateSelectionType) {
    this.candidateSelectionType = candidateSelectionType;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The type of candidate selection that was used to obtain this volume candidate.")
  @JsonProperty("candidateSelectionType")
  public CandidateSelectionTypeEnum getCandidateSelectionType() {
    return candidateSelectionType;
  }
  
  public void setCandidateSelectionType(CandidateSelectionTypeEnum candidateSelectionType) {
    this.candidateSelectionType = candidateSelectionType;
  }

  
  /**
   * True, if all drives have matching spindle speed.
   **/
  public VolumeCandidate spindleSpeedMatch(Boolean spindleSpeedMatch) {
    this.spindleSpeedMatch = spindleSpeedMatch;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "True, if all drives have matching spindle speed.")
  @JsonProperty("spindleSpeedMatch")
  public Boolean getSpindleSpeedMatch() {
    return spindleSpeedMatch;
  }
  
  public void setSpindleSpeedMatch(Boolean spindleSpeedMatch) {
    this.spindleSpeedMatch = spindleSpeedMatch;
  }

  
  /**
   * True, if all drives have matching spindle speed.
   **/
  public VolumeCandidate spindleSpeed(Integer spindleSpeed) {
    this.spindleSpeed = spindleSpeed;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "True, if all drives have matching spindle speed.")
  @JsonProperty("spindleSpeed")
  public Integer getSpindleSpeed() {
    return spindleSpeed;
  }
  
  public void setSpindleSpeed(Integer spindleSpeed) {
    this.spindleSpeed = spindleSpeed;
  }

  
  /**
   * The physical drive type.
   **/
  public VolumeCandidate phyDriveType(PhyDriveTypeEnum phyDriveType) {
    this.phyDriveType = phyDriveType;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The physical drive type.")
  @JsonProperty("phyDriveType")
  public PhyDriveTypeEnum getPhyDriveType() {
    return phyDriveType;
  }
  
  public void setPhyDriveType(PhyDriveTypeEnum phyDriveType) {
    this.phyDriveType = phyDriveType;
  }

  
  /**
   * True if dynamic segment sizing pre-allocation will be enabled for the volume created from this candidate, otherwise false.
   **/
  public VolumeCandidate dssPreallocEnabled(Boolean dssPreallocEnabled) {
    this.dssPreallocEnabled = dssPreallocEnabled;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "True if dynamic segment sizing pre-allocation will be enabled for the volume created from this candidate, otherwise false.")
  @JsonProperty("dssPreallocEnabled")
  public Boolean getDssPreallocEnabled() {
    return dssPreallocEnabled;
  }
  
  public void setDssPreallocEnabled(Boolean dssPreallocEnabled) {
    this.dssPreallocEnabled = dssPreallocEnabled;
  }

  
  /**
   * The desired security level of the drive group.
   **/
  public VolumeCandidate securityType(SecurityTypeEnum securityType) {
    this.securityType = securityType;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The desired security level of the drive group.")
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
  public VolumeCandidate drawerLossProtection(Boolean drawerLossProtection) {
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
   * Drive media type (HDD or SSD) of the volume candidate.
   **/
  public VolumeCandidate driveMediaType(DriveMediaTypeEnum driveMediaType) {
    this.driveMediaType = driveMediaType;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Drive media type (HDD or SSD) of the volume candidate.")
  @JsonProperty("driveMediaType")
  public DriveMediaTypeEnum getDriveMediaType() {
    return driveMediaType;
  }
  
  public void setDriveMediaType(DriveMediaTypeEnum driveMediaType) {
    this.driveMediaType = driveMediaType;
  }

  
  /**
   * This field is no longer used.
   **/
  public VolumeCandidate protectionInformationCapable(Boolean protectionInformationCapable) {
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
   * This structure contains a protectionInformationCapable field which is set to true if all drives in the volume group where the volume candidate resides are Protection Information (PI) capable. It also contains the protection type for the volume group.
   **/
  public VolumeCandidate protectionInformationCapabilities(ProtectionInformationCapabilities protectionInformationCapabilities) {
    this.protectionInformationCapabilities = protectionInformationCapabilities;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "This structure contains a protectionInformationCapable field which is set to true if all drives in the volume group where the volume candidate resides are Protection Information (PI) capable. It also contains the protection type for the volume group.")
  @JsonProperty("protectionInformationCapabilities")
  public ProtectionInformationCapabilities getProtectionInformationCapabilities() {
    return protectionInformationCapabilities;
  }
  
  public void setProtectionInformationCapabilities(ProtectionInformationCapabilities protectionInformationCapabilities) {
    this.protectionInformationCapabilities = protectionInformationCapabilities;
  }

  
  /**
   * Information about the Volume Candidate.
   **/
  public VolumeCandidate volumeCandidateData(VolumeCandidateTypeData volumeCandidateData) {
    this.volumeCandidateData = volumeCandidateData;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Information about the Volume Candidate.")
  @JsonProperty("volumeCandidateData")
  public VolumeCandidateTypeData getVolumeCandidateData() {
    return volumeCandidateData;
  }
  
  public void setVolumeCandidateData(VolumeCandidateTypeData volumeCandidateData) {
    this.volumeCandidateData = volumeCandidateData;
  }

  
  /**
   * Identifies the drive block format of the volume candidate.
   **/
  public VolumeCandidate driveBlockFormat(DriveBlockFormatEnum driveBlockFormat) {
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
   * Determines whether or not reserved space is allocated on the drives in the volume group.
   **/
  public VolumeCandidate allocateReservedSpace(Boolean allocateReservedSpace) {
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

  
  /**
   * Describes the overall security level of the drive set. Values can include: FDE only, FIPS only, mixed, or no security. Used along with the SecurityType field.
   **/
  public VolumeCandidate securityLevel(SecurityLevelEnum securityLevel) {
    this.securityLevel = securityLevel;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Describes the overall security level of the drive set. Values can include: FDE only, FIPS only, mixed, or no security. Used along with the SecurityType field.")
  @JsonProperty("securityLevel")
  public SecurityLevelEnum getSecurityLevel() {
    return securityLevel;
  }
  
  public void setSecurityLevel(SecurityLevelEnum securityLevel) {
    this.securityLevel = securityLevel;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VolumeCandidate volumeCandidate = (VolumeCandidate) o;
    return Objects.equals(this.raidLevel, volumeCandidate.raidLevel) &&
        Objects.equals(this.trayLossProtection, volumeCandidate.trayLossProtection) &&
        Objects.equals(this.rawSize, volumeCandidate.rawSize) &&
        Objects.equals(this.usableSize, volumeCandidate.usableSize) &&
        Objects.equals(this.driveCount, volumeCandidate.driveCount) &&
        Objects.equals(this.freeExtentRef, volumeCandidate.freeExtentRef) &&
        Objects.equals(this.driveRefList, volumeCandidate.driveRefList) &&
        Objects.equals(this.candidateSelectionType, volumeCandidate.candidateSelectionType) &&
        Objects.equals(this.spindleSpeedMatch, volumeCandidate.spindleSpeedMatch) &&
        Objects.equals(this.spindleSpeed, volumeCandidate.spindleSpeed) &&
        Objects.equals(this.phyDriveType, volumeCandidate.phyDriveType) &&
        Objects.equals(this.dssPreallocEnabled, volumeCandidate.dssPreallocEnabled) &&
        Objects.equals(this.securityType, volumeCandidate.securityType) &&
        Objects.equals(this.drawerLossProtection, volumeCandidate.drawerLossProtection) &&
        Objects.equals(this.driveMediaType, volumeCandidate.driveMediaType) &&
        Objects.equals(this.protectionInformationCapable, volumeCandidate.protectionInformationCapable) &&
        Objects.equals(this.protectionInformationCapabilities, volumeCandidate.protectionInformationCapabilities) &&
        Objects.equals(this.volumeCandidateData, volumeCandidate.volumeCandidateData) &&
        Objects.equals(this.driveBlockFormat, volumeCandidate.driveBlockFormat) &&
        Objects.equals(this.allocateReservedSpace, volumeCandidate.allocateReservedSpace) &&
        Objects.equals(this.securityLevel, volumeCandidate.securityLevel);
  }

  @Override
  public int hashCode() {
    return Objects.hash(raidLevel, trayLossProtection, rawSize, usableSize, driveCount, freeExtentRef, driveRefList, candidateSelectionType, spindleSpeedMatch, spindleSpeed, phyDriveType, dssPreallocEnabled, securityType, drawerLossProtection, driveMediaType, protectionInformationCapable, protectionInformationCapabilities, volumeCandidateData, driveBlockFormat, allocateReservedSpace, securityLevel);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VolumeCandidate {\n");
    
    sb.append("    raidLevel: ").append(toIndentedString(raidLevel)).append("\n");
    sb.append("    trayLossProtection: ").append(toIndentedString(trayLossProtection)).append("\n");
    sb.append("    rawSize: ").append(toIndentedString(rawSize)).append("\n");
    sb.append("    usableSize: ").append(toIndentedString(usableSize)).append("\n");
    sb.append("    driveCount: ").append(toIndentedString(driveCount)).append("\n");
    sb.append("    freeExtentRef: ").append(toIndentedString(freeExtentRef)).append("\n");
    sb.append("    driveRefList: ").append(toIndentedString(driveRefList)).append("\n");
    sb.append("    candidateSelectionType: ").append(toIndentedString(candidateSelectionType)).append("\n");
    sb.append("    spindleSpeedMatch: ").append(toIndentedString(spindleSpeedMatch)).append("\n");
    sb.append("    spindleSpeed: ").append(toIndentedString(spindleSpeed)).append("\n");
    sb.append("    phyDriveType: ").append(toIndentedString(phyDriveType)).append("\n");
    sb.append("    dssPreallocEnabled: ").append(toIndentedString(dssPreallocEnabled)).append("\n");
    sb.append("    securityType: ").append(toIndentedString(securityType)).append("\n");
    sb.append("    drawerLossProtection: ").append(toIndentedString(drawerLossProtection)).append("\n");
    sb.append("    driveMediaType: ").append(toIndentedString(driveMediaType)).append("\n");
    sb.append("    protectionInformationCapable: ").append(toIndentedString(protectionInformationCapable)).append("\n");
    sb.append("    protectionInformationCapabilities: ").append(toIndentedString(protectionInformationCapabilities)).append("\n");
    sb.append("    volumeCandidateData: ").append(toIndentedString(volumeCandidateData)).append("\n");
    sb.append("    driveBlockFormat: ").append(toIndentedString(driveBlockFormat)).append("\n");
    sb.append("    allocateReservedSpace: ").append(toIndentedString(allocateReservedSpace)).append("\n");
    sb.append("    securityLevel: ").append(toIndentedString(securityLevel)).append("\n");
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

