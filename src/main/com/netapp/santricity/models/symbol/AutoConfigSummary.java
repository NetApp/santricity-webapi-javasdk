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
 * AutoConfigSummary
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2017-10-04T15:05:55.769-05:00")
public class AutoConfigSummary   {
  
    private Integer totalVolumeGroups;

    private Integer hotSpareCount;

    private Integer unassignedCount;

    private List<VolumeGroupSummary> volumeGroupSummary;

  
  /**
   * The total number of volume groups.
   **/
  public AutoConfigSummary totalVolumeGroups(Integer totalVolumeGroups) {
    this.totalVolumeGroups = totalVolumeGroups;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The total number of volume groups.")
  @JsonProperty("totalVolumeGroups")
  public Integer getTotalVolumeGroups() {
    return totalVolumeGroups;
  }
  
  public void setTotalVolumeGroups(Integer totalVolumeGroups) {
    this.totalVolumeGroups = totalVolumeGroups;
  }

  
  /**
   * The total number of hot spares.
   **/
  public AutoConfigSummary hotSpareCount(Integer hotSpareCount) {
    this.hotSpareCount = hotSpareCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The total number of hot spares.")
  @JsonProperty("hotSpareCount")
  public Integer getHotSpareCount() {
    return hotSpareCount;
  }
  
  public void setHotSpareCount(Integer hotSpareCount) {
    this.hotSpareCount = hotSpareCount;
  }

  
  /**
   * The total number of unassigned drives.
   **/
  public AutoConfigSummary unassignedCount(Integer unassignedCount) {
    this.unassignedCount = unassignedCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The total number of unassigned drives.")
  @JsonProperty("unassignedCount")
  public Integer getUnassignedCount() {
    return unassignedCount;
  }
  
  public void setUnassignedCount(Integer unassignedCount) {
    this.unassignedCount = unassignedCount;
  }

  
  /**
   * The list of volume groups.
   **/
  public AutoConfigSummary volumeGroupSummary(List<VolumeGroupSummary> volumeGroupSummary) {
    this.volumeGroupSummary = volumeGroupSummary;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The list of volume groups.")
  @JsonProperty("volumeGroupSummary")
  public List<VolumeGroupSummary> getVolumeGroupSummary() {
    return volumeGroupSummary;
  }
  
  public void setVolumeGroupSummary(List<VolumeGroupSummary> volumeGroupSummary) {
    this.volumeGroupSummary = volumeGroupSummary;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AutoConfigSummary autoConfigSummary = (AutoConfigSummary) o;
    return Objects.equals(this.totalVolumeGroups, autoConfigSummary.totalVolumeGroups) &&
        Objects.equals(this.hotSpareCount, autoConfigSummary.hotSpareCount) &&
        Objects.equals(this.unassignedCount, autoConfigSummary.unassignedCount) &&
        Objects.equals(this.volumeGroupSummary, autoConfigSummary.volumeGroupSummary);
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalVolumeGroups, hotSpareCount, unassignedCount, volumeGroupSummary);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AutoConfigSummary {\n");
    
    sb.append("    totalVolumeGroups: ").append(toIndentedString(totalVolumeGroups)).append("\n");
    sb.append("    hotSpareCount: ").append(toIndentedString(hotSpareCount)).append("\n");
    sb.append("    unassignedCount: ").append(toIndentedString(unassignedCount)).append("\n");
    sb.append("    volumeGroupSummary: ").append(toIndentedString(volumeGroupSummary)).append("\n");
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

