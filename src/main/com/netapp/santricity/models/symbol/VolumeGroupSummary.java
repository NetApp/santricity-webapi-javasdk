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
 * VolumeGroupSummary
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2017-10-04T15:05:55.769-05:00")
public class VolumeGroupSummary   {
  
    private Long volumeGroupCapacity;

    private Integer volumeCount;

    private Long volumeCapacity;

    private Boolean trayLossProtection;

    private Boolean spindleSpeedMatch;

    private Integer spindleSpeed;


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

    private Boolean drawerLossProtection;


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

    private Boolean protectionInformationCapable;


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
   * The total usable capacity of the volume group.
   **/
  public VolumeGroupSummary volumeGroupCapacity(Long volumeGroupCapacity) {
    this.volumeGroupCapacity = volumeGroupCapacity;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The total usable capacity of the volume group.")
  @JsonProperty("volumeGroupCapacity")
  public Long getVolumeGroupCapacity() {
    return volumeGroupCapacity;
  }
  
  public void setVolumeGroupCapacity(Long volumeGroupCapacity) {
    this.volumeGroupCapacity = volumeGroupCapacity;
  }

  
  /**
   * The number of volumes in the volume group.
   **/
  public VolumeGroupSummary volumeCount(Integer volumeCount) {
    this.volumeCount = volumeCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The number of volumes in the volume group.")
  @JsonProperty("volumeCount")
  public Integer getVolumeCount() {
    return volumeCount;
  }
  
  public void setVolumeCount(Integer volumeCount) {
    this.volumeCount = volumeCount;
  }

  
  /**
   * The total usable capacity of volume(s).
   **/
  public VolumeGroupSummary volumeCapacity(Long volumeCapacity) {
    this.volumeCapacity = volumeCapacity;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The total usable capacity of volume(s).")
  @JsonProperty("volumeCapacity")
  public Long getVolumeCapacity() {
    return volumeCapacity;
  }
  
  public void setVolumeCapacity(Long volumeCapacity) {
    this.volumeCapacity = volumeCapacity;
  }

  
  /**
   * True, if volume group has tray loss protection.
   **/
  public VolumeGroupSummary trayLossProtection(Boolean trayLossProtection) {
    this.trayLossProtection = trayLossProtection;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "True, if volume group has tray loss protection.")
  @JsonProperty("trayLossProtection")
  public Boolean getTrayLossProtection() {
    return trayLossProtection;
  }
  
  public void setTrayLossProtection(Boolean trayLossProtection) {
    this.trayLossProtection = trayLossProtection;
  }

  
  /**
   * True, if all drives have matching spindle speed.
   **/
  public VolumeGroupSummary spindleSpeedMatch(Boolean spindleSpeedMatch) {
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
  public VolumeGroupSummary spindleSpeed(Integer spindleSpeed) {
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
   * This field is used to specify the volume group security type.
   **/
  public VolumeGroupSummary volumeGroupSecurityType(VolumeGroupSecurityTypeEnum volumeGroupSecurityType) {
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
   * This field is set to true when the volume group has drawer loss protection; otherwise it is set to false
   **/
  public VolumeGroupSummary drawerLossProtection(Boolean drawerLossProtection) {
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
   * This field is set to the desired drive media type of the drive.
   **/
  public VolumeGroupSummary driveMediaType(DriveMediaTypeEnum driveMediaType) {
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
   * True when all drives in the volume group are PI capable.
   **/
  public VolumeGroupSummary protectionInformationCapable(Boolean protectionInformationCapable) {
    this.protectionInformationCapable = protectionInformationCapable;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "True when all drives in the volume group are PI capable.")
  @JsonProperty("protectionInformationCapable")
  public Boolean getProtectionInformationCapable() {
    return protectionInformationCapable;
  }
  
  public void setProtectionInformationCapable(Boolean protectionInformationCapable) {
    this.protectionInformationCapable = protectionInformationCapable;
  }

  
  /**
   * Identifies the drive block format of the volume candidate.
   **/
  public VolumeGroupSummary driveBlockFormat(DriveBlockFormatEnum driveBlockFormat) {
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
   * Refines the information in the securityType field to describe the set of drives.
   **/
  public VolumeGroupSummary volumeGroupSecurityLevel(VolumeGroupSecurityLevelEnum volumeGroupSecurityLevel) {
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
    VolumeGroupSummary volumeGroupSummary = (VolumeGroupSummary) o;
    return Objects.equals(this.volumeGroupCapacity, volumeGroupSummary.volumeGroupCapacity) &&
        Objects.equals(this.volumeCount, volumeGroupSummary.volumeCount) &&
        Objects.equals(this.volumeCapacity, volumeGroupSummary.volumeCapacity) &&
        Objects.equals(this.trayLossProtection, volumeGroupSummary.trayLossProtection) &&
        Objects.equals(this.spindleSpeedMatch, volumeGroupSummary.spindleSpeedMatch) &&
        Objects.equals(this.spindleSpeed, volumeGroupSummary.spindleSpeed) &&
        Objects.equals(this.volumeGroupSecurityType, volumeGroupSummary.volumeGroupSecurityType) &&
        Objects.equals(this.drawerLossProtection, volumeGroupSummary.drawerLossProtection) &&
        Objects.equals(this.driveMediaType, volumeGroupSummary.driveMediaType) &&
        Objects.equals(this.protectionInformationCapable, volumeGroupSummary.protectionInformationCapable) &&
        Objects.equals(this.driveBlockFormat, volumeGroupSummary.driveBlockFormat) &&
        Objects.equals(this.volumeGroupSecurityLevel, volumeGroupSummary.volumeGroupSecurityLevel);
  }

  @Override
  public int hashCode() {
    return Objects.hash(volumeGroupCapacity, volumeCount, volumeCapacity, trayLossProtection, spindleSpeedMatch, spindleSpeed, volumeGroupSecurityType, drawerLossProtection, driveMediaType, protectionInformationCapable, driveBlockFormat, volumeGroupSecurityLevel);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VolumeGroupSummary {\n");
    
    sb.append("    volumeGroupCapacity: ").append(toIndentedString(volumeGroupCapacity)).append("\n");
    sb.append("    volumeCount: ").append(toIndentedString(volumeCount)).append("\n");
    sb.append("    volumeCapacity: ").append(toIndentedString(volumeCapacity)).append("\n");
    sb.append("    trayLossProtection: ").append(toIndentedString(trayLossProtection)).append("\n");
    sb.append("    spindleSpeedMatch: ").append(toIndentedString(spindleSpeedMatch)).append("\n");
    sb.append("    spindleSpeed: ").append(toIndentedString(spindleSpeed)).append("\n");
    sb.append("    volumeGroupSecurityType: ").append(toIndentedString(volumeGroupSecurityType)).append("\n");
    sb.append("    drawerLossProtection: ").append(toIndentedString(drawerLossProtection)).append("\n");
    sb.append("    driveMediaType: ").append(toIndentedString(driveMediaType)).append("\n");
    sb.append("    protectionInformationCapable: ").append(toIndentedString(protectionInformationCapable)).append("\n");
    sb.append("    driveBlockFormat: ").append(toIndentedString(driveBlockFormat)).append("\n");
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

