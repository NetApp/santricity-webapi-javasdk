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
 * SscVolumeCreateRequest
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2017-10-04T15:05:52.333-05:00")
public class SscVolumeCreateRequest   {
  
    private String poolId;

    private String name;


  /**
   * The unit for the request capacity
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

    private Boolean readCacheEnable;

    private Boolean writeCacheEnable;

    private Boolean flashCacheEnable;

    private Boolean dataAssuranceEnable;

    private Boolean thinProvision;

    private List<VolumeMetadataItem> metaTags;

  
  /**
   * The id of the storage pool to create the volume on
   **/
  public SscVolumeCreateRequest poolId(String poolId) {
    this.poolId = poolId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The id of the storage pool to create the volume on")
  @JsonProperty("poolId")
  public String getPoolId() {
    return poolId;
  }
  
  public void setPoolId(String poolId) {
    this.poolId = poolId;
  }

  
  /**
   * The name of the volume
   **/
  public SscVolumeCreateRequest name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The name of the volume")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   * The unit for the request capacity
   **/
  public SscVolumeCreateRequest sizeUnit(SizeUnitEnum sizeUnit) {
    this.sizeUnit = sizeUnit;
    return this;
  }
  
  @ApiModelProperty(example = "gb", value = "The unit for the request capacity")
  @JsonProperty("sizeUnit")
  public SizeUnitEnum getSizeUnit() {
    return sizeUnit;
  }
  
  public void setSizeUnit(SizeUnitEnum sizeUnit) {
    this.sizeUnit = sizeUnit;
  }

  
  /**
   * The requested capacity of the volume in units
   **/
  public SscVolumeCreateRequest size(Long size) {
    this.size = size;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The requested capacity of the volume in units")
  @JsonProperty("size")
  public Long getSize() {
    return size;
  }
  
  public void setSize(Long size) {
    this.size = size;
  }

  
  /**
   **/
  public SscVolumeCreateRequest readCacheEnable(Boolean readCacheEnable) {
    this.readCacheEnable = readCacheEnable;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("readCacheEnable")
  public Boolean getReadCacheEnable() {
    return readCacheEnable;
  }
  
  public void setReadCacheEnable(Boolean readCacheEnable) {
    this.readCacheEnable = readCacheEnable;
  }

  
  /**
   **/
  public SscVolumeCreateRequest writeCacheEnable(Boolean writeCacheEnable) {
    this.writeCacheEnable = writeCacheEnable;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("writeCacheEnable")
  public Boolean getWriteCacheEnable() {
    return writeCacheEnable;
  }
  
  public void setWriteCacheEnable(Boolean writeCacheEnable) {
    this.writeCacheEnable = writeCacheEnable;
  }

  
  /**
   * Add this volume to a flashCache
   **/
  public SscVolumeCreateRequest flashCacheEnable(Boolean flashCacheEnable) {
    this.flashCacheEnable = flashCacheEnable;
    return this;
  }
  
  @ApiModelProperty(example = "false", value = "Add this volume to a flashCache")
  @JsonProperty("flashCacheEnable")
  public Boolean getFlashCacheEnable() {
    return flashCacheEnable;
  }
  
  public void setFlashCacheEnable(Boolean flashCacheEnable) {
    this.flashCacheEnable = flashCacheEnable;
  }

  
  /**
   * Enable the dataAssurance capability
   **/
  public SscVolumeCreateRequest dataAssuranceEnable(Boolean dataAssuranceEnable) {
    this.dataAssuranceEnable = dataAssuranceEnable;
    return this;
  }
  
  @ApiModelProperty(example = "false", value = "Enable the dataAssurance capability")
  @JsonProperty("dataAssuranceEnable")
  public Boolean getDataAssuranceEnable() {
    return dataAssuranceEnable;
  }
  
  public void setDataAssuranceEnable(Boolean dataAssuranceEnable) {
    this.dataAssuranceEnable = dataAssuranceEnable;
  }

  
  /**
   * Define a thinProvisioned volume
   **/
  public SscVolumeCreateRequest thinProvision(Boolean thinProvision) {
    this.thinProvision = thinProvision;
    return this;
  }
  
  @ApiModelProperty(example = "false", value = "Define a thinProvisioned volume")
  @JsonProperty("thinProvision")
  public Boolean getThinProvision() {
    return thinProvision;
  }
  
  public void setThinProvision(Boolean thinProvision) {
    this.thinProvision = thinProvision;
  }

  
  /**
   * Optional list of MetaData tags to assign to the volume.
   **/
  public SscVolumeCreateRequest metaTags(List<VolumeMetadataItem> metaTags) {
    this.metaTags = metaTags;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Optional list of MetaData tags to assign to the volume.")
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
    SscVolumeCreateRequest sscVolumeCreateRequest = (SscVolumeCreateRequest) o;
    return Objects.equals(this.poolId, sscVolumeCreateRequest.poolId) &&
        Objects.equals(this.name, sscVolumeCreateRequest.name) &&
        Objects.equals(this.sizeUnit, sscVolumeCreateRequest.sizeUnit) &&
        Objects.equals(this.size, sscVolumeCreateRequest.size) &&
        Objects.equals(this.readCacheEnable, sscVolumeCreateRequest.readCacheEnable) &&
        Objects.equals(this.writeCacheEnable, sscVolumeCreateRequest.writeCacheEnable) &&
        Objects.equals(this.flashCacheEnable, sscVolumeCreateRequest.flashCacheEnable) &&
        Objects.equals(this.dataAssuranceEnable, sscVolumeCreateRequest.dataAssuranceEnable) &&
        Objects.equals(this.thinProvision, sscVolumeCreateRequest.thinProvision) &&
        Objects.equals(this.metaTags, sscVolumeCreateRequest.metaTags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(poolId, name, sizeUnit, size, readCacheEnable, writeCacheEnable, flashCacheEnable, dataAssuranceEnable, thinProvision, metaTags);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SscVolumeCreateRequest {\n");
    
    sb.append("    poolId: ").append(toIndentedString(poolId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    sizeUnit: ").append(toIndentedString(sizeUnit)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    readCacheEnable: ").append(toIndentedString(readCacheEnable)).append("\n");
    sb.append("    writeCacheEnable: ").append(toIndentedString(writeCacheEnable)).append("\n");
    sb.append("    flashCacheEnable: ").append(toIndentedString(flashCacheEnable)).append("\n");
    sb.append("    dataAssuranceEnable: ").append(toIndentedString(dataAssuranceEnable)).append("\n");
    sb.append("    thinProvision: ").append(toIndentedString(thinProvision)).append("\n");
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

