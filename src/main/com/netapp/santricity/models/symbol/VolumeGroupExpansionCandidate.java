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
 * VolumeGroupExpansionCandidate
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2017-10-04T15:05:55.769-05:00")
public class VolumeGroupExpansionCandidate   {
  
    private List<String> drives;

    private Boolean trayLossProtection;

    private Long wastedCapacity;

    private Boolean spindleSpeedMatch;

    private Boolean drawerLossProtection;

    private Long usableCapacity;


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
   * An array of references to drives comprising the set that can be used to expand the volume group.
   **/
  public VolumeGroupExpansionCandidate drives(List<String> drives) {
    this.drives = drives;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "An array of references to drives comprising the set that can be used to expand the volume group.")
  @JsonProperty("drives")
  public List<String> getDrives() {
    return drives;
  }
  
  public void setDrives(List<String> drives) {
    this.drives = drives;
  }

  
  /**
   * Set to true if the expanded volume group will have tray loss protection.
   **/
  public VolumeGroupExpansionCandidate trayLossProtection(Boolean trayLossProtection) {
    this.trayLossProtection = trayLossProtection;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Set to true if the expanded volume group will have tray loss protection.")
  @JsonProperty("trayLossProtection")
  public Boolean getTrayLossProtection() {
    return trayLossProtection;
  }
  
  public void setTrayLossProtection(Boolean trayLossProtection) {
    this.trayLossProtection = trayLossProtection;
  }

  
  /**
   * The number of bytes of wasted capacity in the given drive set if is used to expand the volume. Wasting of capacity occurs when the drives in the set are larger than the drives in the volume group being expanded.
   **/
  public VolumeGroupExpansionCandidate wastedCapacity(Long wastedCapacity) {
    this.wastedCapacity = wastedCapacity;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The number of bytes of wasted capacity in the given drive set if is used to expand the volume. Wasting of capacity occurs when the drives in the set are larger than the drives in the volume group being expanded.")
  @JsonProperty("wastedCapacity")
  public Long getWastedCapacity() {
    return wastedCapacity;
  }
  
  public void setWastedCapacity(Long wastedCapacity) {
    this.wastedCapacity = wastedCapacity;
  }

  
  /**
   * Set to true if the expanded volume group will have uniform spindle speed across its drives.
   **/
  public VolumeGroupExpansionCandidate spindleSpeedMatch(Boolean spindleSpeedMatch) {
    this.spindleSpeedMatch = spindleSpeedMatch;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Set to true if the expanded volume group will have uniform spindle speed across its drives.")
  @JsonProperty("spindleSpeedMatch")
  public Boolean getSpindleSpeedMatch() {
    return spindleSpeedMatch;
  }
  
  public void setSpindleSpeedMatch(Boolean spindleSpeedMatch) {
    this.spindleSpeedMatch = spindleSpeedMatch;
  }

  
  /**
   * Set to true if the expanded volume group will have drawer loss protection.
   **/
  public VolumeGroupExpansionCandidate drawerLossProtection(Boolean drawerLossProtection) {
    this.drawerLossProtection = drawerLossProtection;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Set to true if the expanded volume group will have drawer loss protection.")
  @JsonProperty("drawerLossProtection")
  public Boolean getDrawerLossProtection() {
    return drawerLossProtection;
  }
  
  public void setDrawerLossProtection(Boolean drawerLossProtection) {
    this.drawerLossProtection = drawerLossProtection;
  }

  
  /**
   * The total usable capacity of the expansion candidate in bytes.
   **/
  public VolumeGroupExpansionCandidate usableCapacity(Long usableCapacity) {
    this.usableCapacity = usableCapacity;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The total usable capacity of the expansion candidate in bytes.")
  @JsonProperty("usableCapacity")
  public Long getUsableCapacity() {
    return usableCapacity;
  }
  
  public void setUsableCapacity(Long usableCapacity) {
    this.usableCapacity = usableCapacity;
  }

  
  /**
   * Identifies the drive block format of the volume candidate.
   **/
  public VolumeGroupExpansionCandidate driveBlockFormat(DriveBlockFormatEnum driveBlockFormat) {
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

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VolumeGroupExpansionCandidate volumeGroupExpansionCandidate = (VolumeGroupExpansionCandidate) o;
    return Objects.equals(this.drives, volumeGroupExpansionCandidate.drives) &&
        Objects.equals(this.trayLossProtection, volumeGroupExpansionCandidate.trayLossProtection) &&
        Objects.equals(this.wastedCapacity, volumeGroupExpansionCandidate.wastedCapacity) &&
        Objects.equals(this.spindleSpeedMatch, volumeGroupExpansionCandidate.spindleSpeedMatch) &&
        Objects.equals(this.drawerLossProtection, volumeGroupExpansionCandidate.drawerLossProtection) &&
        Objects.equals(this.usableCapacity, volumeGroupExpansionCandidate.usableCapacity) &&
        Objects.equals(this.driveBlockFormat, volumeGroupExpansionCandidate.driveBlockFormat);
  }

  @Override
  public int hashCode() {
    return Objects.hash(drives, trayLossProtection, wastedCapacity, spindleSpeedMatch, drawerLossProtection, usableCapacity, driveBlockFormat);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VolumeGroupExpansionCandidate {\n");
    
    sb.append("    drives: ").append(toIndentedString(drives)).append("\n");
    sb.append("    trayLossProtection: ").append(toIndentedString(trayLossProtection)).append("\n");
    sb.append("    wastedCapacity: ").append(toIndentedString(wastedCapacity)).append("\n");
    sb.append("    spindleSpeedMatch: ").append(toIndentedString(spindleSpeedMatch)).append("\n");
    sb.append("    drawerLossProtection: ").append(toIndentedString(drawerLossProtection)).append("\n");
    sb.append("    usableCapacity: ").append(toIndentedString(usableCapacity)).append("\n");
    sb.append("    driveBlockFormat: ").append(toIndentedString(driveBlockFormat)).append("\n");
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

