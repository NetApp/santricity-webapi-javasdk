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
 * ThinVolumeCreationDescriptor
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2016-08-12T15:32:46.001-05:00")
public class ThinVolumeCreationDescriptor   {
  
    private ConcatVolumeCreationDescriptor repositoryCreationDescriptor;

    private String volumeLabel;

    private String manager;

    private Long virtualCapacity;

    private Long provisionedCapacityQuota;

    private Integer readAhead;

    private Boolean noMapping;


  /**
   * The expansion policy for the Expandable Repository Volume.
   */
  public enum RepositoryExpansionPolicyEnum {
    unknown("unknown"),
    manual("manual"),
    automatic("automatic"),
    __UNDEFINED("__UNDEFINED");
;
    private String value;

    RepositoryExpansionPolicyEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

    private RepositoryExpansionPolicyEnum repositoryExpansionPolicy;

    private Integer growthAlertThreshold;


  /**
   * Specifies which protection type should be used for the volume.
   */
  public enum ProtectionTypeEnum {
    type0Protection("type0Protection"),
    type1Protection("type1Protection"),
    type2Protection("type2Protection"),
    type3Protection("type3Protection"),
    __UNDEFINED("__UNDEFINED");
;
    private String value;

    ProtectionTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

    private ProtectionTypeEnum protectionType;

  
  /**
   * The repository creation type.
   **/
  public ThinVolumeCreationDescriptor repositoryCreationDescriptor(ConcatVolumeCreationDescriptor repositoryCreationDescriptor) {
    this.repositoryCreationDescriptor = repositoryCreationDescriptor;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The repository creation type.")
  @JsonProperty("repositoryCreationDescriptor")
  public ConcatVolumeCreationDescriptor getRepositoryCreationDescriptor() {
    return repositoryCreationDescriptor;
  }
  
  public void setRepositoryCreationDescriptor(ConcatVolumeCreationDescriptor repositoryCreationDescriptor) {
    this.repositoryCreationDescriptor = repositoryCreationDescriptor;
  }

  
  /**
   * The user assigned volume name.
   **/
  public ThinVolumeCreationDescriptor volumeLabel(String volumeLabel) {
    this.volumeLabel = volumeLabel;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The user assigned volume name.")
  @JsonProperty("volumeLabel")
  public String getVolumeLabel() {
    return volumeLabel;
  }
  
  public void setVolumeLabel(String volumeLabel) {
    this.volumeLabel = volumeLabel;
  }

  
  /**
   * The controller that will manage the volume.
   **/
  public ThinVolumeCreationDescriptor manager(String manager) {
    this.manager = manager;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The controller that will manage the volume.")
  @JsonProperty("manager")
  public String getManager() {
    return manager;
  }
  
  public void setManager(String manager) {
    this.manager = manager;
  }

  
  /**
   * The thin volume capacity (in bytes).
   **/
  public ThinVolumeCreationDescriptor virtualCapacity(Long virtualCapacity) {
    this.virtualCapacity = virtualCapacity;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The thin volume capacity (in bytes).")
  @JsonProperty("virtualCapacity")
  public Long getVirtualCapacity() {
    return virtualCapacity;
  }
  
  public void setVirtualCapacity(Long virtualCapacity) {
    this.virtualCapacity = virtualCapacity;
  }

  
  /**
   * The maximum capacity to which the Expandable Repository Volume can grow (in bytes).
   **/
  public ThinVolumeCreationDescriptor provisionedCapacityQuota(Long provisionedCapacityQuota) {
    this.provisionedCapacityQuota = provisionedCapacityQuota;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The maximum capacity to which the Expandable Repository Volume can grow (in bytes).")
  @JsonProperty("provisionedCapacityQuota")
  public Long getProvisionedCapacityQuota() {
    return provisionedCapacityQuota;
  }
  
  public void setProvisionedCapacityQuota(Long provisionedCapacityQuota) {
    this.provisionedCapacityQuota = provisionedCapacityQuota;
  }

  
  /**
   * If true (non-zero), automatic cache read-ahead is enabled. If false (zero), automatic cache read-ahead is disabled.
   **/
  public ThinVolumeCreationDescriptor readAhead(Integer readAhead) {
    this.readAhead = readAhead;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "If true (non-zero), automatic cache read-ahead is enabled. If false (zero), automatic cache read-ahead is disabled.")
  @JsonProperty("readAhead")
  public Integer getReadAhead() {
    return readAhead;
  }
  
  public void setReadAhead(Integer readAhead) {
    this.readAhead = readAhead;
  }

  
  /**
   * If true, default mapping will not be created.
   **/
  public ThinVolumeCreationDescriptor noMapping(Boolean noMapping) {
    this.noMapping = noMapping;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "If true, default mapping will not be created.")
  @JsonProperty("noMapping")
  public Boolean getNoMapping() {
    return noMapping;
  }
  
  public void setNoMapping(Boolean noMapping) {
    this.noMapping = noMapping;
  }

  
  /**
   * The expansion policy for the Expandable Repository Volume.
   **/
  public ThinVolumeCreationDescriptor repositoryExpansionPolicy(RepositoryExpansionPolicyEnum repositoryExpansionPolicy) {
    this.repositoryExpansionPolicy = repositoryExpansionPolicy;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The expansion policy for the Expandable Repository Volume.")
  @JsonProperty("repositoryExpansionPolicy")
  public RepositoryExpansionPolicyEnum getRepositoryExpansionPolicy() {
    return repositoryExpansionPolicy;
  }
  
  public void setRepositoryExpansionPolicy(RepositoryExpansionPolicyEnum repositoryExpansionPolicy) {
    this.repositoryExpansionPolicy = repositoryExpansionPolicy;
  }

  
  /**
   * The alert threshold percent value for the Expandable Repository Volume.
   **/
  public ThinVolumeCreationDescriptor growthAlertThreshold(Integer growthAlertThreshold) {
    this.growthAlertThreshold = growthAlertThreshold;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The alert threshold percent value for the Expandable Repository Volume.")
  @JsonProperty("growthAlertThreshold")
  public Integer getGrowthAlertThreshold() {
    return growthAlertThreshold;
  }
  
  public void setGrowthAlertThreshold(Integer growthAlertThreshold) {
    this.growthAlertThreshold = growthAlertThreshold;
  }

  
  /**
   * Specifies which protection type should be used for the volume.
   **/
  public ThinVolumeCreationDescriptor protectionType(ProtectionTypeEnum protectionType) {
    this.protectionType = protectionType;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Specifies which protection type should be used for the volume.")
  @JsonProperty("protectionType")
  public ProtectionTypeEnum getProtectionType() {
    return protectionType;
  }
  
  public void setProtectionType(ProtectionTypeEnum protectionType) {
    this.protectionType = protectionType;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ThinVolumeCreationDescriptor thinVolumeCreationDescriptor = (ThinVolumeCreationDescriptor) o;
    return Objects.equals(this.repositoryCreationDescriptor, thinVolumeCreationDescriptor.repositoryCreationDescriptor) &&
        Objects.equals(this.volumeLabel, thinVolumeCreationDescriptor.volumeLabel) &&
        Objects.equals(this.manager, thinVolumeCreationDescriptor.manager) &&
        Objects.equals(this.virtualCapacity, thinVolumeCreationDescriptor.virtualCapacity) &&
        Objects.equals(this.provisionedCapacityQuota, thinVolumeCreationDescriptor.provisionedCapacityQuota) &&
        Objects.equals(this.readAhead, thinVolumeCreationDescriptor.readAhead) &&
        Objects.equals(this.noMapping, thinVolumeCreationDescriptor.noMapping) &&
        Objects.equals(this.repositoryExpansionPolicy, thinVolumeCreationDescriptor.repositoryExpansionPolicy) &&
        Objects.equals(this.growthAlertThreshold, thinVolumeCreationDescriptor.growthAlertThreshold) &&
        Objects.equals(this.protectionType, thinVolumeCreationDescriptor.protectionType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(repositoryCreationDescriptor, volumeLabel, manager, virtualCapacity, provisionedCapacityQuota, readAhead, noMapping, repositoryExpansionPolicy, growthAlertThreshold, protectionType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ThinVolumeCreationDescriptor {\n");
    
    sb.append("    repositoryCreationDescriptor: ").append(toIndentedString(repositoryCreationDescriptor)).append("\n");
    sb.append("    volumeLabel: ").append(toIndentedString(volumeLabel)).append("\n");
    sb.append("    manager: ").append(toIndentedString(manager)).append("\n");
    sb.append("    virtualCapacity: ").append(toIndentedString(virtualCapacity)).append("\n");
    sb.append("    provisionedCapacityQuota: ").append(toIndentedString(provisionedCapacityQuota)).append("\n");
    sb.append("    readAhead: ").append(toIndentedString(readAhead)).append("\n");
    sb.append("    noMapping: ").append(toIndentedString(noMapping)).append("\n");
    sb.append("    repositoryExpansionPolicy: ").append(toIndentedString(repositoryExpansionPolicy)).append("\n");
    sb.append("    growthAlertThreshold: ").append(toIndentedString(growthAlertThreshold)).append("\n");
    sb.append("    protectionType: ").append(toIndentedString(protectionType)).append("\n");
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

