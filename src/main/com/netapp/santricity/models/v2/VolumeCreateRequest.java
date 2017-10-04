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
 * Creates a Volume.
 */
@ApiModel(description = "Creates a Volume.")
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2017-10-04T15:05:52.333-05:00")
public class VolumeCreateRequest   {
  
    private String poolId;

    private String name;


  /**
   * Unit for \"size\"
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

    private Long size;

    private Integer segSize;

    private Boolean dataAssuranceEnabled;

    private String owningControllerId;

    private List<VolumeMetadataItem> metaTags;

  
  /**
   * The identifier of the storage pool from which the volume will be allocated.
   **/
  public VolumeCreateRequest poolId(String poolId) {
    this.poolId = poolId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The identifier of the storage pool from which the volume will be allocated.")
  @JsonProperty("poolId")
  public String getPoolId() {
    return poolId;
  }
  
  public void setPoolId(String poolId) {
    this.poolId = poolId;
  }

  
  /**
   * The user-label to assign to the new volume.
   **/
  public VolumeCreateRequest name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The user-label to assign to the new volume.")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   * Unit for \"size\"
   **/
  public VolumeCreateRequest sizeUnit(SizeUnitEnum sizeUnit) {
    this.sizeUnit = sizeUnit;
    return this;
  }
  
  @ApiModelProperty(example = "gb", value = "Unit for \"size\"")
  @JsonProperty("sizeUnit")
  public SizeUnitEnum getSizeUnit() {
    return sizeUnit;
  }
  
  public void setSizeUnit(SizeUnitEnum sizeUnit) {
    this.sizeUnit = sizeUnit;
  }

  
  /**
   * Number of units (See sizeUnit) to make the volume.
   **/
  public VolumeCreateRequest size(Long size) {
    this.size = size;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Number of units (See sizeUnit) to make the volume.")
  @JsonProperty("size")
  public Long getSize() {
    return size;
  }
  
  public void setSize(Long size) {
    this.size = size;
  }

  
  /**
   * The segment size (KB) of the volume. A zero value will set a system-specific default value.
   **/
  public VolumeCreateRequest segSize(Integer segSize) {
    this.segSize = segSize;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The segment size (KB) of the volume. A zero value will set a system-specific default value.")
  @JsonProperty("segSize")
  public Integer getSegSize() {
    return segSize;
  }
  
  public void setSegSize(Integer segSize) {
    this.segSize = segSize;
  }

  
  /**
   **/
  public VolumeCreateRequest dataAssuranceEnabled(Boolean dataAssuranceEnabled) {
    this.dataAssuranceEnabled = dataAssuranceEnabled;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("dataAssuranceEnabled")
  public Boolean getDataAssuranceEnabled() {
    return dataAssuranceEnabled;
  }
  
  public void setDataAssuranceEnabled(Boolean dataAssuranceEnabled) {
    this.dataAssuranceEnabled = dataAssuranceEnabled;
  }

  
  /**
   * Set the preferred owning controller. By default this field will alternate between available controllers
   **/
  public VolumeCreateRequest owningControllerId(String owningControllerId) {
    this.owningControllerId = owningControllerId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Set the preferred owning controller. By default this field will alternate between available controllers")
  @JsonProperty("owningControllerId")
  public String getOwningControllerId() {
    return owningControllerId;
  }
  
  public void setOwningControllerId(String owningControllerId) {
    this.owningControllerId = owningControllerId;
  }

  
  /**
   * Optional array of Meta Data tags for the volume.  
   **/
  public VolumeCreateRequest metaTags(List<VolumeMetadataItem> metaTags) {
    this.metaTags = metaTags;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Optional array of Meta Data tags for the volume.  ")
  @JsonProperty("metaTags")
  public List<VolumeMetadataItem> getMetaTags() {
    return metaTags;
  }
  
  public void setMetaTags(List<VolumeMetadataItem> metaTags) {
    this.metaTags = metaTags;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VolumeCreateRequest volumeCreateRequest = (VolumeCreateRequest) o;
    return Objects.equals(this.poolId, volumeCreateRequest.poolId) &&
        Objects.equals(this.name, volumeCreateRequest.name) &&
        Objects.equals(this.sizeUnit, volumeCreateRequest.sizeUnit) &&
        Objects.equals(this.size, volumeCreateRequest.size) &&
        Objects.equals(this.segSize, volumeCreateRequest.segSize) &&
        Objects.equals(this.dataAssuranceEnabled, volumeCreateRequest.dataAssuranceEnabled) &&
        Objects.equals(this.owningControllerId, volumeCreateRequest.owningControllerId) &&
        Objects.equals(this.metaTags, volumeCreateRequest.metaTags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(poolId, name, sizeUnit, size, segSize, dataAssuranceEnabled, owningControllerId, metaTags);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VolumeCreateRequest {\n");
    
    sb.append("    poolId: ").append(toIndentedString(poolId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    sizeUnit: ").append(toIndentedString(sizeUnit)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    segSize: ").append(toIndentedString(segSize)).append("\n");
    sb.append("    dataAssuranceEnabled: ").append(toIndentedString(dataAssuranceEnabled)).append("\n");
    sb.append("    owningControllerId: ").append(toIndentedString(owningControllerId)).append("\n");
    sb.append("    metaTags: ").append(toIndentedString(metaTags)).append("\n");
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

