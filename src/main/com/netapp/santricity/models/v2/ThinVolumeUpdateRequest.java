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
 * Updates a Thin Volume.
 */
@ApiModel(description = "Updates a Thin Volume.")
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2017-10-04T15:05:52.333-05:00")
public class ThinVolumeUpdateRequest   {
  
    private String name;

    private Integer growthAlertThreshold;

    private Boolean flashCache;

    private List<VolumeMetadataItem> metaTags;


  /**
   * Thin Volume expansion policy.      If automatic, the thin volume will be expanded automatically when capacity is exceeded,      if manual, the volume must be expanded manually.
   */
  public enum ExpansionPolicyEnum {
    unknown("unknown"),
    manual("manual"),
    automatic("automatic"),
    __UNDEFINED("__UNDEFINED");
;
    private String value;

    ExpansionPolicyEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

    private ExpansionPolicyEnum expansionPolicy;

    private String owningControllerId;

    private ThinVolumeCacheSettings cacheSettings;

    private VolumeMediaScanParams scanSettings;

  
  /**
   * The user-label to assign to the volume.
   **/
  public ThinVolumeUpdateRequest name(String name) {
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
   * The repository utilization warning threshold (in percent).
   **/
  public ThinVolumeUpdateRequest growthAlertThreshold(Integer growthAlertThreshold) {
    this.growthAlertThreshold = growthAlertThreshold;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The repository utilization warning threshold (in percent).")
  @JsonProperty("growthAlertThreshold")
  public Integer getGrowthAlertThreshold() {
    return growthAlertThreshold;
  }
  
  public void setGrowthAlertThreshold(Integer growthAlertThreshold) {
    this.growthAlertThreshold = growthAlertThreshold;
  }

  
  /**
   * If true, add the volume to the flashCache if one is defined. If false, remove from the flashCache if one exists.
   **/
  public ThinVolumeUpdateRequest flashCache(Boolean flashCache) {
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
   * Optional array of Meta Data tags for the volume.  
   **/
  public ThinVolumeUpdateRequest metaTags(List<VolumeMetadataItem> metaTags) {
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

  
  /**
   * Thin Volume expansion policy.      If automatic, the thin volume will be expanded automatically when capacity is exceeded,      if manual, the volume must be expanded manually.
   **/
  public ThinVolumeUpdateRequest expansionPolicy(ExpansionPolicyEnum expansionPolicy) {
    this.expansionPolicy = expansionPolicy;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Thin Volume expansion policy.      If automatic, the thin volume will be expanded automatically when capacity is exceeded,      if manual, the volume must be expanded manually.")
  @JsonProperty("expansionPolicy")
  public ExpansionPolicyEnum getExpansionPolicy() {
    return expansionPolicy;
  }
  
  public void setExpansionPolicy(ExpansionPolicyEnum expansionPolicy) {
    this.expansionPolicy = expansionPolicy;
  }

  
  /**
   * Set the preferred owning controller
   **/
  public ThinVolumeUpdateRequest owningControllerId(String owningControllerId) {
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
   * Configure cache settings for the volume
   **/
  public ThinVolumeUpdateRequest cacheSettings(ThinVolumeCacheSettings cacheSettings) {
    this.cacheSettings = cacheSettings;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Configure cache settings for the volume")
  @JsonProperty("cacheSettings")
  public ThinVolumeCacheSettings getCacheSettings() {
    return cacheSettings;
  }
  
  public void setCacheSettings(ThinVolumeCacheSettings cacheSettings) {
    this.cacheSettings = cacheSettings;
  }

  
  /**
   * Configure scan settings with regard to the controller's background media scan operation
   **/
  public ThinVolumeUpdateRequest scanSettings(VolumeMediaScanParams scanSettings) {
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

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ThinVolumeUpdateRequest thinVolumeUpdateRequest = (ThinVolumeUpdateRequest) o;
    return Objects.equals(this.name, thinVolumeUpdateRequest.name) &&
        Objects.equals(this.growthAlertThreshold, thinVolumeUpdateRequest.growthAlertThreshold) &&
        Objects.equals(this.flashCache, thinVolumeUpdateRequest.flashCache) &&
        Objects.equals(this.metaTags, thinVolumeUpdateRequest.metaTags) &&
        Objects.equals(this.expansionPolicy, thinVolumeUpdateRequest.expansionPolicy) &&
        Objects.equals(this.owningControllerId, thinVolumeUpdateRequest.owningControllerId) &&
        Objects.equals(this.cacheSettings, thinVolumeUpdateRequest.cacheSettings) &&
        Objects.equals(this.scanSettings, thinVolumeUpdateRequest.scanSettings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, growthAlertThreshold, flashCache, metaTags, expansionPolicy, owningControllerId, cacheSettings, scanSettings);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ThinVolumeUpdateRequest {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    growthAlertThreshold: ").append(toIndentedString(growthAlertThreshold)).append("\n");
    sb.append("    flashCache: ").append(toIndentedString(flashCache)).append("\n");
    sb.append("    metaTags: ").append(toIndentedString(metaTags)).append("\n");
    sb.append("    expansionPolicy: ").append(toIndentedString(expansionPolicy)).append("\n");
    sb.append("    owningControllerId: ").append(toIndentedString(owningControllerId)).append("\n");
    sb.append("    cacheSettings: ").append(toIndentedString(cacheSettings)).append("\n");
    sb.append("    scanSettings: ").append(toIndentedString(scanSettings)).append("\n");
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

