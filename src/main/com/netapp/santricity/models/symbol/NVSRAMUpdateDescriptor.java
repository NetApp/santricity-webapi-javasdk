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
 * NVSRAMUpdateDescriptor
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2016-08-12T15:32:46.001-05:00")
public class NVSRAMUpdateDescriptor   {
  

  /**
   * The region identifier for the NVSRAM region to be modified.
   */
  public enum RegionIdEnum {
    allRegions("allRegions"),
    nonUserConfigData("nonUserConfigData"),
    subsystemId("subsystemId"),
    subsystemFaultData("subsystemFaultData"),
    driveFaultData("driveFaultData"),
    hostManagedData("hostManagedData"),
    hostInterfaceData("hostInterfaceData"),
    userConfigData("userConfigData"),
    bootpData("bootpData"),
    extUserConfigData("extUserConfigData"),
    hostTypeDependentData("hostTypeDependentData"),
    __UNDEFINED("__UNDEFINED");
;
    private String value;

    RegionIdEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

    private RegionIdEnum regionId;

    private Integer offset;

    private String regionData;

  
  /**
   * The region identifier for the NVSRAM region to be modified.
   **/
  public NVSRAMUpdateDescriptor regionId(RegionIdEnum regionId) {
    this.regionId = regionId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The region identifier for the NVSRAM region to be modified.")
  @JsonProperty("regionId")
  public RegionIdEnum getRegionId() {
    return regionId;
  }
  
  public void setRegionId(RegionIdEnum regionId) {
    this.regionId = regionId;
  }

  
  /**
   * The offset from the beginning of the region where the update is to begin.
   **/
  public NVSRAMUpdateDescriptor offset(Integer offset) {
    this.offset = offset;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The offset from the beginning of the region where the update is to begin.")
  @JsonProperty("offset")
  public Integer getOffset() {
    return offset;
  }
  
  public void setOffset(Integer offset) {
    this.offset = offset;
  }

  
  /**
   * A variable-length array of bytes that provides the new data to be written to the controller's NVSRAM starting at the location specified by the offset field.
   **/
  public NVSRAMUpdateDescriptor regionData(String regionData) {
    this.regionData = regionData;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "A variable-length array of bytes that provides the new data to be written to the controller's NVSRAM starting at the location specified by the offset field.")
  @JsonProperty("regionData")
  public String getRegionData() {
    return regionData;
  }
  
  public void setRegionData(String regionData) {
    this.regionData = regionData;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NVSRAMUpdateDescriptor nVSRAMUpdateDescriptor = (NVSRAMUpdateDescriptor) o;
    return Objects.equals(this.regionId, nVSRAMUpdateDescriptor.regionId) &&
        Objects.equals(this.offset, nVSRAMUpdateDescriptor.offset) &&
        Objects.equals(this.regionData, nVSRAMUpdateDescriptor.regionData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(regionId, offset, regionData);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NVSRAMUpdateDescriptor {\n");
    
    sb.append("    regionId: ").append(toIndentedString(regionId)).append("\n");
    sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
    sb.append("    regionData: ").append(toIndentedString(regionData)).append("\n");
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

