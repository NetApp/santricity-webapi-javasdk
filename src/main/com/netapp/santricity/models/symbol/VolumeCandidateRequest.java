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
 * VolumeCandidateRequest
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2016-08-12T15:32:46.001-05:00")
public class VolumeCandidateRequest   {
  
    private CandidateSelectionTypeData candidateSelectionType;


  /**
   * This field indicates that RAID level in which the caller is interested. It may be set to RAID_ALL if the client wishes to obtain volume candidate information about all possible RAID levels.
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


  /**
   * The desired physical drive type.
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
   * Desired security type of the drive group (i.e. secure vs. not secure).
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

    private Boolean onlyProtectionInformationCapable;

    private VolumeCandidateRequestTypeData volumeCandidateRequestData;

    private Boolean allocateReservedSpace;


  /**
   * The security level describes whether a set of drives should be comprised of FDE only, FIPS only, Mixed, or no security. This field is used along with the SecurityType filed to fully define the drive set.
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
   * This field contains the specification of the type of volume candidates that are desired, along with ancillary information that depends on the type of candidates.
   **/
  public VolumeCandidateRequest candidateSelectionType(CandidateSelectionTypeData candidateSelectionType) {
    this.candidateSelectionType = candidateSelectionType;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "This field contains the specification of the type of volume candidates that are desired, along with ancillary information that depends on the type of candidates.")
  @JsonProperty("candidateSelectionType")
  public CandidateSelectionTypeData getCandidateSelectionType() {
    return candidateSelectionType;
  }
  
  public void setCandidateSelectionType(CandidateSelectionTypeData candidateSelectionType) {
    this.candidateSelectionType = candidateSelectionType;
  }

  
  /**
   * This field indicates that RAID level in which the caller is interested. It may be set to RAID_ALL if the client wishes to obtain volume candidate information about all possible RAID levels.
   **/
  public VolumeCandidateRequest raidLevel(RaidLevelEnum raidLevel) {
    this.raidLevel = raidLevel;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "This field indicates that RAID level in which the caller is interested. It may be set to RAID_ALL if the client wishes to obtain volume candidate information about all possible RAID levels.")
  @JsonProperty("raidLevel")
  public RaidLevelEnum getRaidLevel() {
    return raidLevel;
  }
  
  public void setRaidLevel(RaidLevelEnum raidLevel) {
    this.raidLevel = raidLevel;
  }

  
  /**
   * The desired physical drive type.
   **/
  public VolumeCandidateRequest phyDriveType(PhyDriveTypeEnum phyDriveType) {
    this.phyDriveType = phyDriveType;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The desired physical drive type.")
  @JsonProperty("phyDriveType")
  public PhyDriveTypeEnum getPhyDriveType() {
    return phyDriveType;
  }
  
  public void setPhyDriveType(PhyDriveTypeEnum phyDriveType) {
    this.phyDriveType = phyDriveType;
  }

  
  /**
   * This field indicates whether or not the firmware should base the search for candidates on the DSS preallocation calculation.
   **/
  public VolumeCandidateRequest dssPreallocEnabled(Boolean dssPreallocEnabled) {
    this.dssPreallocEnabled = dssPreallocEnabled;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "This field indicates whether or not the firmware should base the search for candidates on the DSS preallocation calculation.")
  @JsonProperty("dssPreallocEnabled")
  public Boolean getDssPreallocEnabled() {
    return dssPreallocEnabled;
  }
  
  public void setDssPreallocEnabled(Boolean dssPreallocEnabled) {
    this.dssPreallocEnabled = dssPreallocEnabled;
  }

  
  /**
   * Desired security type of the drive group (i.e. secure vs. not secure).
   **/
  public VolumeCandidateRequest securityType(SecurityTypeEnum securityType) {
    this.securityType = securityType;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Desired security type of the drive group (i.e. secure vs. not secure).")
  @JsonProperty("securityType")
  public SecurityTypeEnum getSecurityType() {
    return securityType;
  }
  
  public void setSecurityType(SecurityTypeEnum securityType) {
    this.securityType = securityType;
  }

  
  /**
   * Drive media type (HDD or SSD) of the volume candidate.
   **/
  public VolumeCandidateRequest driveMediaType(DriveMediaTypeEnum driveMediaType) {
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
   * If true, only PI-capable drives considered for volume candidates.
   **/
  public VolumeCandidateRequest onlyProtectionInformationCapable(Boolean onlyProtectionInformationCapable) {
    this.onlyProtectionInformationCapable = onlyProtectionInformationCapable;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "If true, only PI-capable drives considered for volume candidates.")
  @JsonProperty("onlyProtectionInformationCapable")
  public Boolean getOnlyProtectionInformationCapable() {
    return onlyProtectionInformationCapable;
  }
  
  public void setOnlyProtectionInformationCapable(Boolean onlyProtectionInformationCapable) {
    this.onlyProtectionInformationCapable = onlyProtectionInformationCapable;
  }

  
  /**
   * Information about the Volume Candidate Request.
   **/
  public VolumeCandidateRequest volumeCandidateRequestData(VolumeCandidateRequestTypeData volumeCandidateRequestData) {
    this.volumeCandidateRequestData = volumeCandidateRequestData;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Information about the Volume Candidate Request.")
  @JsonProperty("volumeCandidateRequestData")
  public VolumeCandidateRequestTypeData getVolumeCandidateRequestData() {
    return volumeCandidateRequestData;
  }
  
  public void setVolumeCandidateRequestData(VolumeCandidateRequestTypeData volumeCandidateRequestData) {
    this.volumeCandidateRequestData = volumeCandidateRequestData;
  }

  
  /**
   * If true, allocate reserved space when creating a new volume group. Ignore when creating a volume in an existing volume group
   **/
  public VolumeCandidateRequest allocateReservedSpace(Boolean allocateReservedSpace) {
    this.allocateReservedSpace = allocateReservedSpace;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "If true, allocate reserved space when creating a new volume group. Ignore when creating a volume in an existing volume group")
  @JsonProperty("allocateReservedSpace")
  public Boolean getAllocateReservedSpace() {
    return allocateReservedSpace;
  }
  
  public void setAllocateReservedSpace(Boolean allocateReservedSpace) {
    this.allocateReservedSpace = allocateReservedSpace;
  }

  
  /**
   * The security level describes whether a set of drives should be comprised of FDE only, FIPS only, Mixed, or no security. This field is used along with the SecurityType filed to fully define the drive set.
   **/
  public VolumeCandidateRequest securityLevel(SecurityLevelEnum securityLevel) {
    this.securityLevel = securityLevel;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The security level describes whether a set of drives should be comprised of FDE only, FIPS only, Mixed, or no security. This field is used along with the SecurityType filed to fully define the drive set.")
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
    VolumeCandidateRequest volumeCandidateRequest = (VolumeCandidateRequest) o;
    return Objects.equals(this.candidateSelectionType, volumeCandidateRequest.candidateSelectionType) &&
        Objects.equals(this.raidLevel, volumeCandidateRequest.raidLevel) &&
        Objects.equals(this.phyDriveType, volumeCandidateRequest.phyDriveType) &&
        Objects.equals(this.dssPreallocEnabled, volumeCandidateRequest.dssPreallocEnabled) &&
        Objects.equals(this.securityType, volumeCandidateRequest.securityType) &&
        Objects.equals(this.driveMediaType, volumeCandidateRequest.driveMediaType) &&
        Objects.equals(this.onlyProtectionInformationCapable, volumeCandidateRequest.onlyProtectionInformationCapable) &&
        Objects.equals(this.volumeCandidateRequestData, volumeCandidateRequest.volumeCandidateRequestData) &&
        Objects.equals(this.allocateReservedSpace, volumeCandidateRequest.allocateReservedSpace) &&
        Objects.equals(this.securityLevel, volumeCandidateRequest.securityLevel);
  }

  @Override
  public int hashCode() {
    return Objects.hash(candidateSelectionType, raidLevel, phyDriveType, dssPreallocEnabled, securityType, driveMediaType, onlyProtectionInformationCapable, volumeCandidateRequestData, allocateReservedSpace, securityLevel);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VolumeCandidateRequest {\n");
    
    sb.append("    candidateSelectionType: ").append(toIndentedString(candidateSelectionType)).append("\n");
    sb.append("    raidLevel: ").append(toIndentedString(raidLevel)).append("\n");
    sb.append("    phyDriveType: ").append(toIndentedString(phyDriveType)).append("\n");
    sb.append("    dssPreallocEnabled: ").append(toIndentedString(dssPreallocEnabled)).append("\n");
    sb.append("    securityType: ").append(toIndentedString(securityType)).append("\n");
    sb.append("    driveMediaType: ").append(toIndentedString(driveMediaType)).append("\n");
    sb.append("    onlyProtectionInformationCapable: ").append(toIndentedString(onlyProtectionInformationCapable)).append("\n");
    sb.append("    volumeCandidateRequestData: ").append(toIndentedString(volumeCandidateRequestData)).append("\n");
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

