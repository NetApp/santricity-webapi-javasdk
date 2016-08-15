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
 * Updates a volume.
 */
@ApiModel(description = "Updates a volume.")
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2016-08-12T15:32:41.671-05:00")
public class SscVolumeUpdateRequest   {
  
    private String name;

    private Long newSize;


  /**
   * Expand the volume to this capacity.
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

    private Boolean flashCache;

    private String owningControllerId;

    private Boolean readCacheEnable;

    private Boolean writeCacheEnable;

    private VolumeMediaScanParams scanSettings;

    private List<VolumeMetadataItem> metaTags;

  
  /**
   * The user-label to assign to the volume.
   **/
  public SscVolumeUpdateRequest name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The user-label to assign to the volume.")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   * Expand the volume to this capacity.
   **/
  public SscVolumeUpdateRequest newSize(Long newSize) {
    this.newSize = newSize;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Expand the volume to this capacity.")
  @JsonProperty("newSize")
  public Long getNewSize() {
    return newSize;
  }
  
  public void setNewSize(Long newSize) {
    this.newSize = newSize;
  }

  
  /**
   * Expand the volume to this capacity.
   **/
  public SscVolumeUpdateRequest sizeUnit(SizeUnitEnum sizeUnit) {
    this.sizeUnit = sizeUnit;
    return this;
  }
  
  @ApiModelProperty(example = "gb", value = "Expand the volume to this capacity.")
  @JsonProperty("sizeUnit")
  public SizeUnitEnum getSizeUnit() {
    return sizeUnit;
  }
  
  public void setSizeUnit(SizeUnitEnum sizeUnit) {
    this.sizeUnit = sizeUnit;
  }

  
  /**
   * If true, add the volume to the flashCache if one is defined. If false, remove from the flashCache if one exists.
   **/
  public SscVolumeUpdateRequest flashCache(Boolean flashCache) {
    this.flashCache = flashCache;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "If true, add the volume to the flashCache if one is defined. If false, remove from the flashCache if one exists.")
  @JsonProperty("flashCache")
  public Boolean getFlashCache() {
    return flashCache;
  }
  
  public void setFlashCache(Boolean flashCache) {
    this.flashCache = flashCache;
  }

  
  /**
   * Set the preferred owning controller
   **/
  public SscVolumeUpdateRequest owningControllerId(String owningControllerId) {
    this.owningControllerId = owningControllerId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Set the preferred owning controller")
  @JsonProperty("owningControllerId")
  public String getOwningControllerId() {
    return owningControllerId;
  }
  
  public void setOwningControllerId(String owningControllerId) {
    this.owningControllerId = owningControllerId;
  }

  
  /**
   **/
  public SscVolumeUpdateRequest readCacheEnable(Boolean readCacheEnable) {
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
  public SscVolumeUpdateRequest writeCacheEnable(Boolean writeCacheEnable) {
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
   * Configure scan settings with regard to the controller's background media scan operation
   **/
  public SscVolumeUpdateRequest scanSettings(VolumeMediaScanParams scanSettings) {
    this.scanSettings = scanSettings;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Configure scan settings with regard to the controller's background media scan operation")
  @JsonProperty("scanSettings")
  public VolumeMediaScanParams getScanSettings() {
    return scanSettings;
  }
  
  public void setScanSettings(VolumeMediaScanParams scanSettings) {
    this.scanSettings = scanSettings;
  }

  
  /**
   * Optional list of MetaData tags to assign to the volume. This will replace any existing tags.
   **/
  public SscVolumeUpdateRequest metaTags(List<VolumeMetadataItem> metaTags) {
    this.metaTags = metaTags;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Optional list of MetaData tags to assign to the volume. This will replace any existing tags.")
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
    SscVolumeUpdateRequest sscVolumeUpdateRequest = (SscVolumeUpdateRequest) o;
    return Objects.equals(this.name, sscVolumeUpdateRequest.name) &&
        Objects.equals(this.newSize, sscVolumeUpdateRequest.newSize) &&
        Objects.equals(this.sizeUnit, sscVolumeUpdateRequest.sizeUnit) &&
        Objects.equals(this.flashCache, sscVolumeUpdateRequest.flashCache) &&
        Objects.equals(this.owningControllerId, sscVolumeUpdateRequest.owningControllerId) &&
        Objects.equals(this.readCacheEnable, sscVolumeUpdateRequest.readCacheEnable) &&
        Objects.equals(this.writeCacheEnable, sscVolumeUpdateRequest.writeCacheEnable) &&
        Objects.equals(this.scanSettings, sscVolumeUpdateRequest.scanSettings) &&
        Objects.equals(this.metaTags, sscVolumeUpdateRequest.metaTags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, newSize, sizeUnit, flashCache, owningControllerId, readCacheEnable, writeCacheEnable, scanSettings, metaTags);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SscVolumeUpdateRequest {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    newSize: ").append(toIndentedString(newSize)).append("\n");
    sb.append("    sizeUnit: ").append(toIndentedString(sizeUnit)).append("\n");
    sb.append("    flashCache: ").append(toIndentedString(flashCache)).append("\n");
    sb.append("    owningControllerId: ").append(toIndentedString(owningControllerId)).append("\n");
    sb.append("    readCacheEnable: ").append(toIndentedString(readCacheEnable)).append("\n");
    sb.append("    writeCacheEnable: ").append(toIndentedString(writeCacheEnable)).append("\n");
    sb.append("    scanSettings: ").append(toIndentedString(scanSettings)).append("\n");
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

