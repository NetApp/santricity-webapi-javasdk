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
 * FreeExtent
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2016-08-12T15:32:46.001-05:00")
public class FreeExtent   {
  
    private Long sectorOffset;

    private Long rawCapacity;


  /**
   * The RAID level of this free extent, which governs the allowed configuration of volumes that can be created on it.
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

    private String volumeGroupRef;

    private String freeExtentRef;

    private String reserved1;

    private String reserved2;

  
  /**
   * The sector offset of this free extent within its volume group. This value is provided only to allow the client application to determine the relative positions of free extents and volumes within a given volume group. No other assumptions or computations should be made with this value.
   **/
  public FreeExtent sectorOffset(Long sectorOffset) {
    this.sectorOffset = sectorOffset;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The sector offset of this free extent within its volume group. This value is provided only to allow the client application to determine the relative positions of free extents and volumes within a given volume group. No other assumptions or computations should be made with this value.")
  @JsonProperty("sectorOffset")
  public Long getSectorOffset() {
    return sectorOffset;
  }
  
  public void setSectorOffset(Long sectorOffset) {
    this.sectorOffset = sectorOffset;
  }

  
  /**
   * The total raw capacity of this free extent. If the storage array supports mixed RAID levels per volume group, this value will represent the raw capacity without accounting for RAID parity requirements. Otherwise, this value will represent the RAID-factored capacity of the free extent, and thus provide an indication of the maximum volume (using the volume group's RAID level) that can be created on this free extent.
   **/
  public FreeExtent rawCapacity(Long rawCapacity) {
    this.rawCapacity = rawCapacity;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The total raw capacity of this free extent. If the storage array supports mixed RAID levels per volume group, this value will represent the raw capacity without accounting for RAID parity requirements. Otherwise, this value will represent the RAID-factored capacity of the free extent, and thus provide an indication of the maximum volume (using the volume group's RAID level) that can be created on this free extent.")
  @JsonProperty("rawCapacity")
  public Long getRawCapacity() {
    return rawCapacity;
  }
  
  public void setRawCapacity(Long rawCapacity) {
    this.rawCapacity = rawCapacity;
  }

  
  /**
   * The RAID level of this free extent, which governs the allowed configuration of volumes that can be created on it.
   **/
  public FreeExtent raidLevel(RaidLevelEnum raidLevel) {
    this.raidLevel = raidLevel;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The RAID level of this free extent, which governs the allowed configuration of volumes that can be created on it.")
  @JsonProperty("raidLevel")
  public RaidLevelEnum getRaidLevel() {
    return raidLevel;
  }
  
  public void setRaidLevel(RaidLevelEnum raidLevel) {
    this.raidLevel = raidLevel;
  }

  
  /**
   * The volume group reference value of the volume group on which this free extent resides.
   **/
  public FreeExtent volumeGroupRef(String volumeGroupRef) {
    this.volumeGroupRef = volumeGroupRef;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The volume group reference value of the volume group on which this free extent resides.")
  @JsonProperty("volumeGroupRef")
  public String getVolumeGroupRef() {
    return volumeGroupRef;
  }
  
  public void setVolumeGroupRef(String volumeGroupRef) {
    this.volumeGroupRef = volumeGroupRef;
  }

  
  /**
   * The unique identification value for this free extent. Other objects may use this reference value to refer to the free extent.
   **/
  public FreeExtent freeExtentRef(String freeExtentRef) {
    this.freeExtentRef = freeExtentRef;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The unique identification value for this free extent. Other objects may use this reference value to refer to the free extent.")
  @JsonProperty("freeExtentRef")
  public String getFreeExtentRef() {
    return freeExtentRef;
  }
  
  public void setFreeExtentRef(String freeExtentRef) {
    this.freeExtentRef = freeExtentRef;
  }

  
  /**
   **/
  public FreeExtent reserved1(String reserved1) {
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
  public FreeExtent reserved2(String reserved2) {
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

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FreeExtent freeExtent = (FreeExtent) o;
    return Objects.equals(this.sectorOffset, freeExtent.sectorOffset) &&
        Objects.equals(this.rawCapacity, freeExtent.rawCapacity) &&
        Objects.equals(this.raidLevel, freeExtent.raidLevel) &&
        Objects.equals(this.volumeGroupRef, freeExtent.volumeGroupRef) &&
        Objects.equals(this.freeExtentRef, freeExtent.freeExtentRef) &&
        Objects.equals(this.reserved1, freeExtent.reserved1) &&
        Objects.equals(this.reserved2, freeExtent.reserved2);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sectorOffset, rawCapacity, raidLevel, volumeGroupRef, freeExtentRef, reserved1, reserved2);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FreeExtent {\n");
    
    sb.append("    sectorOffset: ").append(toIndentedString(sectorOffset)).append("\n");
    sb.append("    rawCapacity: ").append(toIndentedString(rawCapacity)).append("\n");
    sb.append("    raidLevel: ").append(toIndentedString(raidLevel)).append("\n");
    sb.append("    volumeGroupRef: ").append(toIndentedString(volumeGroupRef)).append("\n");
    sb.append("    freeExtentRef: ").append(toIndentedString(freeExtentRef)).append("\n");
    sb.append("    reserved1: ").append(toIndentedString(reserved1)).append("\n");
    sb.append("    reserved2: ").append(toIndentedString(reserved2)).append("\n");
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

