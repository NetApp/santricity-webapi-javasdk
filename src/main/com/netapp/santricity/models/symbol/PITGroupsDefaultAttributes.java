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
 * PITGroupsDefaultAttributes
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2017-10-04T15:05:55.769-05:00")
public class PITGroupsDefaultAttributes   {
  
    private Integer maxViewsPerPIT;

    private Long minimumRepositoryCapacityInBytes;

    private Integer maxPITGroupRepositoryCapacityAsPercentOfBaseCapacity;

    private Integer maxPITViewRepositoryCapacityAsPercentOfBaseCapacity;

    private Integer defaultRepositoryCapacityAsPercentOfBaseCapacity;

    private Integer defaultRepositoryUtilizationWarningThreshold;

    private Long minimumConcatVolumeCapacityExpansion;

  
  /**
   * The maximum number of views per PiT.
   **/
  public PITGroupsDefaultAttributes maxViewsPerPIT(Integer maxViewsPerPIT) {
    this.maxViewsPerPIT = maxViewsPerPIT;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The maximum number of views per PiT.")
  @JsonProperty("maxViewsPerPIT")
  public Integer getMaxViewsPerPIT() {
    return maxViewsPerPIT;
  }
  
  public void setMaxViewsPerPIT(Integer maxViewsPerPIT) {
    this.maxViewsPerPIT = maxViewsPerPIT;
  }

  
  /**
   * The minimum repository size (in bytes) for PiT Group or PiT View repository. Note that this is the absolute floor on the repository capacity, but a slightly higher minimum may be imposed based on the capacity of the base volume. This is necessary to ensure rollback operations have sufficient repository capacity for metadata.
   **/
  public PITGroupsDefaultAttributes minimumRepositoryCapacityInBytes(Long minimumRepositoryCapacityInBytes) {
    this.minimumRepositoryCapacityInBytes = minimumRepositoryCapacityInBytes;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The minimum repository size (in bytes) for PiT Group or PiT View repository. Note that this is the absolute floor on the repository capacity, but a slightly higher minimum may be imposed based on the capacity of the base volume. This is necessary to ensure rollback operations have sufficient repository capacity for metadata.")
  @JsonProperty("minimumRepositoryCapacityInBytes")
  public Long getMinimumRepositoryCapacityInBytes() {
    return minimumRepositoryCapacityInBytes;
  }
  
  public void setMinimumRepositoryCapacityInBytes(Long minimumRepositoryCapacityInBytes) {
    this.minimumRepositoryCapacityInBytes = minimumRepositoryCapacityInBytes;
  }

  
  /**
   * Maximum repository size for a PiT group as a percentage of the base volume capacity.
   **/
  public PITGroupsDefaultAttributes maxPITGroupRepositoryCapacityAsPercentOfBaseCapacity(Integer maxPITGroupRepositoryCapacityAsPercentOfBaseCapacity) {
    this.maxPITGroupRepositoryCapacityAsPercentOfBaseCapacity = maxPITGroupRepositoryCapacityAsPercentOfBaseCapacity;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Maximum repository size for a PiT group as a percentage of the base volume capacity.")
  @JsonProperty("maxPITGroupRepositoryCapacityAsPercentOfBaseCapacity")
  public Integer getMaxPITGroupRepositoryCapacityAsPercentOfBaseCapacity() {
    return maxPITGroupRepositoryCapacityAsPercentOfBaseCapacity;
  }
  
  public void setMaxPITGroupRepositoryCapacityAsPercentOfBaseCapacity(Integer maxPITGroupRepositoryCapacityAsPercentOfBaseCapacity) {
    this.maxPITGroupRepositoryCapacityAsPercentOfBaseCapacity = maxPITGroupRepositoryCapacityAsPercentOfBaseCapacity;
  }

  
  /**
   * Maximum repository size for a PiT View as a percentage of the base volume capacity.
   **/
  public PITGroupsDefaultAttributes maxPITViewRepositoryCapacityAsPercentOfBaseCapacity(Integer maxPITViewRepositoryCapacityAsPercentOfBaseCapacity) {
    this.maxPITViewRepositoryCapacityAsPercentOfBaseCapacity = maxPITViewRepositoryCapacityAsPercentOfBaseCapacity;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Maximum repository size for a PiT View as a percentage of the base volume capacity.")
  @JsonProperty("maxPITViewRepositoryCapacityAsPercentOfBaseCapacity")
  public Integer getMaxPITViewRepositoryCapacityAsPercentOfBaseCapacity() {
    return maxPITViewRepositoryCapacityAsPercentOfBaseCapacity;
  }
  
  public void setMaxPITViewRepositoryCapacityAsPercentOfBaseCapacity(Integer maxPITViewRepositoryCapacityAsPercentOfBaseCapacity) {
    this.maxPITViewRepositoryCapacityAsPercentOfBaseCapacity = maxPITViewRepositoryCapacityAsPercentOfBaseCapacity;
  }

  
  /**
   * Default repository capacity for PiT View or PiT Group as a percentage of the base volume capacity.
   **/
  public PITGroupsDefaultAttributes defaultRepositoryCapacityAsPercentOfBaseCapacity(Integer defaultRepositoryCapacityAsPercentOfBaseCapacity) {
    this.defaultRepositoryCapacityAsPercentOfBaseCapacity = defaultRepositoryCapacityAsPercentOfBaseCapacity;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Default repository capacity for PiT View or PiT Group as a percentage of the base volume capacity.")
  @JsonProperty("defaultRepositoryCapacityAsPercentOfBaseCapacity")
  public Integer getDefaultRepositoryCapacityAsPercentOfBaseCapacity() {
    return defaultRepositoryCapacityAsPercentOfBaseCapacity;
  }
  
  public void setDefaultRepositoryCapacityAsPercentOfBaseCapacity(Integer defaultRepositoryCapacityAsPercentOfBaseCapacity) {
    this.defaultRepositoryCapacityAsPercentOfBaseCapacity = defaultRepositoryCapacityAsPercentOfBaseCapacity;
  }

  
  /**
   * Default repository utilization warning threshold percentage.
   **/
  public PITGroupsDefaultAttributes defaultRepositoryUtilizationWarningThreshold(Integer defaultRepositoryUtilizationWarningThreshold) {
    this.defaultRepositoryUtilizationWarningThreshold = defaultRepositoryUtilizationWarningThreshold;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Default repository utilization warning threshold percentage.")
  @JsonProperty("defaultRepositoryUtilizationWarningThreshold")
  public Integer getDefaultRepositoryUtilizationWarningThreshold() {
    return defaultRepositoryUtilizationWarningThreshold;
  }
  
  public void setDefaultRepositoryUtilizationWarningThreshold(Integer defaultRepositoryUtilizationWarningThreshold) {
    this.defaultRepositoryUtilizationWarningThreshold = defaultRepositoryUtilizationWarningThreshold;
  }

  
  /**
   * Minimum capacity (in bytes) of a volume to be added to a ConcatVolume for expansion.
   **/
  public PITGroupsDefaultAttributes minimumConcatVolumeCapacityExpansion(Long minimumConcatVolumeCapacityExpansion) {
    this.minimumConcatVolumeCapacityExpansion = minimumConcatVolumeCapacityExpansion;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Minimum capacity (in bytes) of a volume to be added to a ConcatVolume for expansion.")
  @JsonProperty("minimumConcatVolumeCapacityExpansion")
  public Long getMinimumConcatVolumeCapacityExpansion() {
    return minimumConcatVolumeCapacityExpansion;
  }
  
  public void setMinimumConcatVolumeCapacityExpansion(Long minimumConcatVolumeCapacityExpansion) {
    this.minimumConcatVolumeCapacityExpansion = minimumConcatVolumeCapacityExpansion;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PITGroupsDefaultAttributes pITGroupsDefaultAttributes = (PITGroupsDefaultAttributes) o;
    return Objects.equals(this.maxViewsPerPIT, pITGroupsDefaultAttributes.maxViewsPerPIT) &&
        Objects.equals(this.minimumRepositoryCapacityInBytes, pITGroupsDefaultAttributes.minimumRepositoryCapacityInBytes) &&
        Objects.equals(this.maxPITGroupRepositoryCapacityAsPercentOfBaseCapacity, pITGroupsDefaultAttributes.maxPITGroupRepositoryCapacityAsPercentOfBaseCapacity) &&
        Objects.equals(this.maxPITViewRepositoryCapacityAsPercentOfBaseCapacity, pITGroupsDefaultAttributes.maxPITViewRepositoryCapacityAsPercentOfBaseCapacity) &&
        Objects.equals(this.defaultRepositoryCapacityAsPercentOfBaseCapacity, pITGroupsDefaultAttributes.defaultRepositoryCapacityAsPercentOfBaseCapacity) &&
        Objects.equals(this.defaultRepositoryUtilizationWarningThreshold, pITGroupsDefaultAttributes.defaultRepositoryUtilizationWarningThreshold) &&
        Objects.equals(this.minimumConcatVolumeCapacityExpansion, pITGroupsDefaultAttributes.minimumConcatVolumeCapacityExpansion);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maxViewsPerPIT, minimumRepositoryCapacityInBytes, maxPITGroupRepositoryCapacityAsPercentOfBaseCapacity, maxPITViewRepositoryCapacityAsPercentOfBaseCapacity, defaultRepositoryCapacityAsPercentOfBaseCapacity, defaultRepositoryUtilizationWarningThreshold, minimumConcatVolumeCapacityExpansion);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PITGroupsDefaultAttributes {\n");
    
    sb.append("    maxViewsPerPIT: ").append(toIndentedString(maxViewsPerPIT)).append("\n");
    sb.append("    minimumRepositoryCapacityInBytes: ").append(toIndentedString(minimumRepositoryCapacityInBytes)).append("\n");
    sb.append("    maxPITGroupRepositoryCapacityAsPercentOfBaseCapacity: ").append(toIndentedString(maxPITGroupRepositoryCapacityAsPercentOfBaseCapacity)).append("\n");
    sb.append("    maxPITViewRepositoryCapacityAsPercentOfBaseCapacity: ").append(toIndentedString(maxPITViewRepositoryCapacityAsPercentOfBaseCapacity)).append("\n");
    sb.append("    defaultRepositoryCapacityAsPercentOfBaseCapacity: ").append(toIndentedString(defaultRepositoryCapacityAsPercentOfBaseCapacity)).append("\n");
    sb.append("    defaultRepositoryUtilizationWarningThreshold: ").append(toIndentedString(defaultRepositoryUtilizationWarningThreshold)).append("\n");
    sb.append("    minimumConcatVolumeCapacityExpansion: ").append(toIndentedString(minimumConcatVolumeCapacityExpansion)).append("\n");
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

