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
 * DriveSelectionRequest
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2016-08-12T15:32:41.671-05:00")
public class DriveSelectionRequest   {
  
    private Integer driveCount;

    private List<Integer> selectedSpindleSpeeds;

    private Boolean fdeCapableOnly;

    private Long driveCapacityMin;


  /**
   * Only consider drives of this media type
   */
  public enum DriveTypeEnum {
    ssd("ssd"),
    hdd("hdd");
;
    private String value;

    DriveTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

    private DriveTypeEnum driveType;


  /**
   * Only consider drives of this interface type
   */
  public enum InterfaceTypeEnum {
    fibre("fibre"),
    sas("sas"),
    sata("sata");
;
    private String value;

    InterfaceTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

    private InterfaceTypeEnum interfaceType;

    private Boolean protectionInformationCapable;


  /**
   * Use this unit for any capacity based parameters
   */
  public enum SizeUnitEnum {
    bytes("bytes"),
    b("b"),
    kb("kb"),
    mb("mb"),
    gb("gb"),
    tb("tb"),
    pb("pb"),
    eb("eb"),
    zb("zb"),
    yb("yb");
;
    private String value;

    SizeUnitEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

    private SizeUnitEnum sizeUnit;


  /**
   * The intended RAID level for the storage-pool.
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

    private Integer targetUsableCapacity;

  
  /**
   * minimum: 1.0
   **/
  public DriveSelectionRequest driveCount(Integer driveCount) {
    this.driveCount = driveCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("driveCount")
  public Integer getDriveCount() {
    return driveCount;
  }
  
  public void setDriveCount(Integer driveCount) {
    this.driveCount = driveCount;
  }

  
  /**
   * Only select drives with these spindle speeds
   **/
  public DriveSelectionRequest selectedSpindleSpeeds(List<Integer> selectedSpindleSpeeds) {
    this.selectedSpindleSpeeds = selectedSpindleSpeeds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Only select drives with these spindle speeds")
  @JsonProperty("selectedSpindleSpeeds")
  public List<Integer> getSelectedSpindleSpeeds() {
    return selectedSpindleSpeeds;
  }
  
  public void setSelectedSpindleSpeeds(List<Integer> selectedSpindleSpeeds) {
    this.selectedSpindleSpeeds = selectedSpindleSpeeds;
  }

  
  /**
   * Only select FDE capable drives
   **/
  public DriveSelectionRequest fdeCapableOnly(Boolean fdeCapableOnly) {
    this.fdeCapableOnly = fdeCapableOnly;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Only select FDE capable drives")
  @JsonProperty("fdeCapableOnly")
  public Boolean getFdeCapableOnly() {
    return fdeCapableOnly;
  }
  
  public void setFdeCapableOnly(Boolean fdeCapableOnly) {
    this.fdeCapableOnly = fdeCapableOnly;
  }

  
  /**
   * Only consider drives with at least this minimum raw capacity in SizeUnits
   * minimum: 0.0
   **/
  public DriveSelectionRequest driveCapacityMin(Long driveCapacityMin) {
    this.driveCapacityMin = driveCapacityMin;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Only consider drives with at least this minimum raw capacity in SizeUnits")
  @JsonProperty("driveCapacityMin")
  public Long getDriveCapacityMin() {
    return driveCapacityMin;
  }
  
  public void setDriveCapacityMin(Long driveCapacityMin) {
    this.driveCapacityMin = driveCapacityMin;
  }

  
  /**
   * Only consider drives of this media type
   **/
  public DriveSelectionRequest driveType(DriveTypeEnum driveType) {
    this.driveType = driveType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Only consider drives of this media type")
  @JsonProperty("driveType")
  public DriveTypeEnum getDriveType() {
    return driveType;
  }
  
  public void setDriveType(DriveTypeEnum driveType) {
    this.driveType = driveType;
  }

  
  /**
   * Only consider drives of this interface type
   **/
  public DriveSelectionRequest interfaceType(InterfaceTypeEnum interfaceType) {
    this.interfaceType = interfaceType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Only consider drives of this interface type")
  @JsonProperty("interfaceType")
  public InterfaceTypeEnum getInterfaceType() {
    return interfaceType;
  }
  
  public void setInterfaceType(InterfaceTypeEnum interfaceType) {
    this.interfaceType = interfaceType;
  }

  
  /**
   * Only consider drives that have Data Assurance capability.
   **/
  public DriveSelectionRequest protectionInformationCapable(Boolean protectionInformationCapable) {
    this.protectionInformationCapable = protectionInformationCapable;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Only consider drives that have Data Assurance capability.")
  @JsonProperty("protectionInformationCapable")
  public Boolean getProtectionInformationCapable() {
    return protectionInformationCapable;
  }
  
  public void setProtectionInformationCapable(Boolean protectionInformationCapable) {
    this.protectionInformationCapable = protectionInformationCapable;
  }

  
  /**
   * Use this unit for any capacity based parameters
   **/
  public DriveSelectionRequest sizeUnit(SizeUnitEnum sizeUnit) {
    this.sizeUnit = sizeUnit;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Use this unit for any capacity based parameters")
  @JsonProperty("sizeUnit")
  public SizeUnitEnum getSizeUnit() {
    return sizeUnit;
  }
  
  public void setSizeUnit(SizeUnitEnum sizeUnit) {
    this.sizeUnit = sizeUnit;
  }

  
  /**
   * The intended RAID level for the storage-pool.
   **/
  public DriveSelectionRequest raidLevel(RaidLevelEnum raidLevel) {
    this.raidLevel = raidLevel;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The intended RAID level for the storage-pool.")
  @JsonProperty("raidLevel")
  public RaidLevelEnum getRaidLevel() {
    return raidLevel;
  }
  
  public void setRaidLevel(RaidLevelEnum raidLevel) {
    this.raidLevel = raidLevel;
  }

  
  /**
   * The aggregate capacity of the selected drives must be at least this many SizeUnits 
   * minimum: 1.0
   **/
  public DriveSelectionRequest targetUsableCapacity(Integer targetUsableCapacity) {
    this.targetUsableCapacity = targetUsableCapacity;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The aggregate capacity of the selected drives must be at least this many SizeUnits ")
  @JsonProperty("targetUsableCapacity")
  public Integer getTargetUsableCapacity() {
    return targetUsableCapacity;
  }
  
  public void setTargetUsableCapacity(Integer targetUsableCapacity) {
    this.targetUsableCapacity = targetUsableCapacity;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DriveSelectionRequest driveSelectionRequest = (DriveSelectionRequest) o;
    return Objects.equals(this.driveCount, driveSelectionRequest.driveCount) &&
        Objects.equals(this.selectedSpindleSpeeds, driveSelectionRequest.selectedSpindleSpeeds) &&
        Objects.equals(this.fdeCapableOnly, driveSelectionRequest.fdeCapableOnly) &&
        Objects.equals(this.driveCapacityMin, driveSelectionRequest.driveCapacityMin) &&
        Objects.equals(this.driveType, driveSelectionRequest.driveType) &&
        Objects.equals(this.interfaceType, driveSelectionRequest.interfaceType) &&
        Objects.equals(this.protectionInformationCapable, driveSelectionRequest.protectionInformationCapable) &&
        Objects.equals(this.sizeUnit, driveSelectionRequest.sizeUnit) &&
        Objects.equals(this.raidLevel, driveSelectionRequest.raidLevel) &&
        Objects.equals(this.targetUsableCapacity, driveSelectionRequest.targetUsableCapacity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(driveCount, selectedSpindleSpeeds, fdeCapableOnly, driveCapacityMin, driveType, interfaceType, protectionInformationCapable, sizeUnit, raidLevel, targetUsableCapacity);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DriveSelectionRequest {\n");
    
    sb.append("    driveCount: ").append(toIndentedString(driveCount)).append("\n");
    sb.append("    selectedSpindleSpeeds: ").append(toIndentedString(selectedSpindleSpeeds)).append("\n");
    sb.append("    fdeCapableOnly: ").append(toIndentedString(fdeCapableOnly)).append("\n");
    sb.append("    driveCapacityMin: ").append(toIndentedString(driveCapacityMin)).append("\n");
    sb.append("    driveType: ").append(toIndentedString(driveType)).append("\n");
    sb.append("    interfaceType: ").append(toIndentedString(interfaceType)).append("\n");
    sb.append("    protectionInformationCapable: ").append(toIndentedString(protectionInformationCapable)).append("\n");
    sb.append("    sizeUnit: ").append(toIndentedString(sizeUnit)).append("\n");
    sb.append("    raidLevel: ").append(toIndentedString(raidLevel)).append("\n");
    sb.append("    targetUsableCapacity: ").append(toIndentedString(targetUsableCapacity)).append("\n");
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

