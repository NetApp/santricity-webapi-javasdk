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
 * AutoConfigTemplate
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2016-08-12T15:32:46.001-05:00")
public class AutoConfigTemplate   {
  

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


  /**
   * The RAID level of all the potential volumes.
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

    private Integer volumeGroupWidth;

    private Integer volumesPerGroup;

    private Integer numberHotSpares;

    private Integer numberUnassignedDrives;

    private Integer segmentSize;

    private Integer readAhead;


  /**
   * This field is used to specify the volume group security type.
   */
  public enum VolumeGroupSecurityTypeEnum {
    unknown("unknown"),
    none("none"),
    capable("capable"),
    enabled("enabled"),
    __UNDEFINED("__UNDEFINED");
;
    private String value;

    VolumeGroupSecurityTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

    private VolumeGroupSecurityTypeEnum volumeGroupSecurityType;


  /**
   * This field is set to the desired drive media type of the drive.
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


  /**
   * Refines the information in the securityType field to describe the set of drives.
   */
  public enum VolumeGroupSecurityLevelEnum {
    unknown("unknown"),
    none("none"),
    mixed("mixed"),
    fde("fde"),
    fips("fips"),
    __UNDEFINED("__UNDEFINED");
;
    private String value;

    VolumeGroupSecurityLevelEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

    private VolumeGroupSecurityLevelEnum volumeGroupSecurityLevel;

  
  /**
   * The physical drive type.
   **/
  public AutoConfigTemplate phyDriveType(PhyDriveTypeEnum phyDriveType) {
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
   * The RAID level of all the potential volumes.
   **/
  public AutoConfigTemplate raidLevel(RaidLevelEnum raidLevel) {
    this.raidLevel = raidLevel;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The RAID level of all the potential volumes.")
  @JsonProperty("raidLevel")
  public RaidLevelEnum getRaidLevel() {
    return raidLevel;
  }
  
  public void setRaidLevel(RaidLevelEnum raidLevel) {
    this.raidLevel = raidLevel;
  }

  
  /**
   * The width of the volume group in drives.
   **/
  public AutoConfigTemplate volumeGroupWidth(Integer volumeGroupWidth) {
    this.volumeGroupWidth = volumeGroupWidth;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The width of the volume group in drives.")
  @JsonProperty("volumeGroupWidth")
  public Integer getVolumeGroupWidth() {
    return volumeGroupWidth;
  }
  
  public void setVolumeGroupWidth(Integer volumeGroupWidth) {
    this.volumeGroupWidth = volumeGroupWidth;
  }

  
  /**
   * The number of volumes per volume group.
   **/
  public AutoConfigTemplate volumesPerGroup(Integer volumesPerGroup) {
    this.volumesPerGroup = volumesPerGroup;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The number of volumes per volume group.")
  @JsonProperty("volumesPerGroup")
  public Integer getVolumesPerGroup() {
    return volumesPerGroup;
  }
  
  public void setVolumesPerGroup(Integer volumesPerGroup) {
    this.volumesPerGroup = volumesPerGroup;
  }

  
  /**
   * The number of hot spares to assign.
   **/
  public AutoConfigTemplate numberHotSpares(Integer numberHotSpares) {
    this.numberHotSpares = numberHotSpares;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The number of hot spares to assign.")
  @JsonProperty("numberHotSpares")
  public Integer getNumberHotSpares() {
    return numberHotSpares;
  }
  
  public void setNumberHotSpares(Integer numberHotSpares) {
    this.numberHotSpares = numberHotSpares;
  }

  
  /**
   * The number of drives to leave unassigned.
   **/
  public AutoConfigTemplate numberUnassignedDrives(Integer numberUnassignedDrives) {
    this.numberUnassignedDrives = numberUnassignedDrives;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The number of drives to leave unassigned.")
  @JsonProperty("numberUnassignedDrives")
  public Integer getNumberUnassignedDrives() {
    return numberUnassignedDrives;
  }
  
  public void setNumberUnassignedDrives(Integer numberUnassignedDrives) {
    this.numberUnassignedDrives = numberUnassignedDrives;
  }

  
  /**
   * The segment size for all volumes.
   **/
  public AutoConfigTemplate segmentSize(Integer segmentSize) {
    this.segmentSize = segmentSize;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The segment size for all volumes.")
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
  public AutoConfigTemplate readAhead(Integer readAhead) {
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
   * This field is used to specify the volume group security type.
   **/
  public AutoConfigTemplate volumeGroupSecurityType(VolumeGroupSecurityTypeEnum volumeGroupSecurityType) {
    this.volumeGroupSecurityType = volumeGroupSecurityType;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "This field is used to specify the volume group security type.")
  @JsonProperty("volumeGroupSecurityType")
  public VolumeGroupSecurityTypeEnum getVolumeGroupSecurityType() {
    return volumeGroupSecurityType;
  }
  
  public void setVolumeGroupSecurityType(VolumeGroupSecurityTypeEnum volumeGroupSecurityType) {
    this.volumeGroupSecurityType = volumeGroupSecurityType;
  }

  
  /**
   * This field is set to the desired drive media type of the drive.
   **/
  public AutoConfigTemplate driveMediaType(DriveMediaTypeEnum driveMediaType) {
    this.driveMediaType = driveMediaType;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "This field is set to the desired drive media type of the drive.")
  @JsonProperty("driveMediaType")
  public DriveMediaTypeEnum getDriveMediaType() {
    return driveMediaType;
  }
  
  public void setDriveMediaType(DriveMediaTypeEnum driveMediaType) {
    this.driveMediaType = driveMediaType;
  }

  
  /**
   * If this field is set to true, only PI capable drives will be considered for volume candidates, otherwise both PI capable and non-PI capable drives will be considered.
   **/
  public AutoConfigTemplate onlyProtectionInformationCapable(Boolean onlyProtectionInformationCapable) {
    this.onlyProtectionInformationCapable = onlyProtectionInformationCapable;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "If this field is set to true, only PI capable drives will be considered for volume candidates, otherwise both PI capable and non-PI capable drives will be considered.")
  @JsonProperty("onlyProtectionInformationCapable")
  public Boolean getOnlyProtectionInformationCapable() {
    return onlyProtectionInformationCapable;
  }
  
  public void setOnlyProtectionInformationCapable(Boolean onlyProtectionInformationCapable) {
    this.onlyProtectionInformationCapable = onlyProtectionInformationCapable;
  }

  
  /**
   * Refines the information in the securityType field to describe the set of drives.
   **/
  public AutoConfigTemplate volumeGroupSecurityLevel(VolumeGroupSecurityLevelEnum volumeGroupSecurityLevel) {
    this.volumeGroupSecurityLevel = volumeGroupSecurityLevel;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Refines the information in the securityType field to describe the set of drives.")
  @JsonProperty("volumeGroupSecurityLevel")
  public VolumeGroupSecurityLevelEnum getVolumeGroupSecurityLevel() {
    return volumeGroupSecurityLevel;
  }
  
  public void setVolumeGroupSecurityLevel(VolumeGroupSecurityLevelEnum volumeGroupSecurityLevel) {
    this.volumeGroupSecurityLevel = volumeGroupSecurityLevel;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AutoConfigTemplate autoConfigTemplate = (AutoConfigTemplate) o;
    return Objects.equals(this.phyDriveType, autoConfigTemplate.phyDriveType) &&
        Objects.equals(this.raidLevel, autoConfigTemplate.raidLevel) &&
        Objects.equals(this.volumeGroupWidth, autoConfigTemplate.volumeGroupWidth) &&
        Objects.equals(this.volumesPerGroup, autoConfigTemplate.volumesPerGroup) &&
        Objects.equals(this.numberHotSpares, autoConfigTemplate.numberHotSpares) &&
        Objects.equals(this.numberUnassignedDrives, autoConfigTemplate.numberUnassignedDrives) &&
        Objects.equals(this.segmentSize, autoConfigTemplate.segmentSize) &&
        Objects.equals(this.readAhead, autoConfigTemplate.readAhead) &&
        Objects.equals(this.volumeGroupSecurityType, autoConfigTemplate.volumeGroupSecurityType) &&
        Objects.equals(this.driveMediaType, autoConfigTemplate.driveMediaType) &&
        Objects.equals(this.onlyProtectionInformationCapable, autoConfigTemplate.onlyProtectionInformationCapable) &&
        Objects.equals(this.volumeGroupSecurityLevel, autoConfigTemplate.volumeGroupSecurityLevel);
  }

  @Override
  public int hashCode() {
    return Objects.hash(phyDriveType, raidLevel, volumeGroupWidth, volumesPerGroup, numberHotSpares, numberUnassignedDrives, segmentSize, readAhead, volumeGroupSecurityType, driveMediaType, onlyProtectionInformationCapable, volumeGroupSecurityLevel);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AutoConfigTemplate {\n");
    
    sb.append("    phyDriveType: ").append(toIndentedString(phyDriveType)).append("\n");
    sb.append("    raidLevel: ").append(toIndentedString(raidLevel)).append("\n");
    sb.append("    volumeGroupWidth: ").append(toIndentedString(volumeGroupWidth)).append("\n");
    sb.append("    volumesPerGroup: ").append(toIndentedString(volumesPerGroup)).append("\n");
    sb.append("    numberHotSpares: ").append(toIndentedString(numberHotSpares)).append("\n");
    sb.append("    numberUnassignedDrives: ").append(toIndentedString(numberUnassignedDrives)).append("\n");
    sb.append("    segmentSize: ").append(toIndentedString(segmentSize)).append("\n");
    sb.append("    readAhead: ").append(toIndentedString(readAhead)).append("\n");
    sb.append("    volumeGroupSecurityType: ").append(toIndentedString(volumeGroupSecurityType)).append("\n");
    sb.append("    driveMediaType: ").append(toIndentedString(driveMediaType)).append("\n");
    sb.append("    onlyProtectionInformationCapable: ").append(toIndentedString(onlyProtectionInformationCapable)).append("\n");
    sb.append("    volumeGroupSecurityLevel: ").append(toIndentedString(volumeGroupSecurityLevel)).append("\n");
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

