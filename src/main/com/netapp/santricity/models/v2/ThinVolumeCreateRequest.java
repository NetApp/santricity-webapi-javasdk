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
 * Creates a Thin Volume.
 */
@ApiModel(description = "Creates a Thin Volume.")
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2017-10-04T15:05:52.333-05:00")
public class ThinVolumeCreateRequest   {
  
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

    private Long virtualSize;

    private Long repositorySize;

    private Long maximumRepositorySize;

    private String owningControllerId;

    private Integer growthAlertThreshold;

    private Boolean createDefaultMapping;


  /**
   * Thin Volume expansion policy.      If automatic, the thin volume will be expanded automatically when capacity is exceeded,      if manual, the volume must be expanded manually. Defaults to automatic.
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

    private Boolean cacheReadAhead;

    private Boolean dataAssuranceEnabled;

    private List<VolumeMetadataItem> metaTags;

  
  /**
   * The identifier of the storage pool from which the volume will be allocated.
   **/
  public ThinVolumeCreateRequest poolId(String poolId) {
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
  public ThinVolumeCreateRequest name(String name) {
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
  public ThinVolumeCreateRequest sizeUnit(SizeUnitEnum sizeUnit) {
    this.sizeUnit = sizeUnit;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Unit for \"size\"")
  @JsonProperty("sizeUnit")
  public SizeUnitEnum getSizeUnit() {
    return sizeUnit;
  }
  
  public void setSizeUnit(SizeUnitEnum sizeUnit) {
    this.sizeUnit = sizeUnit;
  }

  
  /**
   * Initial virtual capacity of the volume in units (See sizeUnit).
   **/
  public ThinVolumeCreateRequest virtualSize(Long virtualSize) {
    this.virtualSize = virtualSize;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Initial virtual capacity of the volume in units (See sizeUnit).")
  @JsonProperty("virtualSize")
  public Long getVirtualSize() {
    return virtualSize;
  }
  
  public void setVirtualSize(Long virtualSize) {
    this.virtualSize = virtualSize;
  }

  
  /**
   * Number of units (See sizeUnit) to make the repository volume, which is the backing for the thin volume. Must be between 4GB & 256GB. This value must align along a 4GB boundary. If it does not, it will be automatically adjusted to the next 4GB value.
   **/
  public ThinVolumeCreateRequest repositorySize(Long repositorySize) {
    this.repositorySize = repositorySize;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Number of units (See sizeUnit) to make the repository volume, which is the backing for the thin volume. Must be between 4GB & 256GB. This value must align along a 4GB boundary. If it does not, it will be automatically adjusted to the next 4GB value.")
  @JsonProperty("repositorySize")
  public Long getRepositorySize() {
    return repositorySize;
  }
  
  public void setRepositorySize(Long repositorySize) {
    this.repositorySize = repositorySize;
  }

  
  /**
   * Maximum size (in sizeUnits) to which the thin volume repository can grow.
   **/
  public ThinVolumeCreateRequest maximumRepositorySize(Long maximumRepositorySize) {
    this.maximumRepositorySize = maximumRepositorySize;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Maximum size (in sizeUnits) to which the thin volume repository can grow.")
  @JsonProperty("maximumRepositorySize")
  public Long getMaximumRepositorySize() {
    return maximumRepositorySize;
  }
  
  public void setMaximumRepositorySize(Long maximumRepositorySize) {
    this.maximumRepositorySize = maximumRepositorySize;
  }

  
  /**
   * Set the preferred owning controller. By default this field will alternate between available controllers
   **/
  public ThinVolumeCreateRequest owningControllerId(String owningControllerId) {
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
   * The repository utilization warning threshold (in percent). This  parameter is only required for thin-provisioned volumes. Default: 95
   **/
  public ThinVolumeCreateRequest growthAlertThreshold(Integer growthAlertThreshold) {
    this.growthAlertThreshold = growthAlertThreshold;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The repository utilization warning threshold (in percent). This  parameter is only required for thin-provisioned volumes. Default: 95")
  @JsonProperty("growthAlertThreshold")
  public Integer getGrowthAlertThreshold() {
    return growthAlertThreshold;
  }
  
  public void setGrowthAlertThreshold(Integer growthAlertThreshold) {
    this.growthAlertThreshold = growthAlertThreshold;
  }

  
  /**
   * Create the default volume mapping. Defaults to false.
   **/
  public ThinVolumeCreateRequest createDefaultMapping(Boolean createDefaultMapping) {
    this.createDefaultMapping = createDefaultMapping;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Create the default volume mapping. Defaults to false.")
  @JsonProperty("createDefaultMapping")
  public Boolean getCreateDefaultMapping() {
    return createDefaultMapping;
  }
  
  public void setCreateDefaultMapping(Boolean createDefaultMapping) {
    this.createDefaultMapping = createDefaultMapping;
  }

  
  /**
   * Thin Volume expansion policy.      If automatic, the thin volume will be expanded automatically when capacity is exceeded,      if manual, the volume must be expanded manually. Defaults to automatic.
   **/
  public ThinVolumeCreateRequest expansionPolicy(ExpansionPolicyEnum expansionPolicy) {
    this.expansionPolicy = expansionPolicy;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Thin Volume expansion policy.      If automatic, the thin volume will be expanded automatically when capacity is exceeded,      if manual, the volume must be expanded manually. Defaults to automatic.")
  @JsonProperty("expansionPolicy")
  public ExpansionPolicyEnum getExpansionPolicy() {
    return expansionPolicy;
  }
  
  public void setExpansionPolicy(ExpansionPolicyEnum expansionPolicy) {
    this.expansionPolicy = expansionPolicy;
  }

  
  /**
   * Deprecated(This field is no longer valid for thin volumes): Enable/Disable automatic cache read-ahead
   **/
  public ThinVolumeCreateRequest cacheReadAhead(Boolean cacheReadAhead) {
    this.cacheReadAhead = cacheReadAhead;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Deprecated(This field is no longer valid for thin volumes): Enable/Disable automatic cache read-ahead")
  @JsonProperty("cacheReadAhead")
  public Boolean getCacheReadAhead() {
    return cacheReadAhead;
  }
  
  public void setCacheReadAhead(Boolean cacheReadAhead) {
    this.cacheReadAhead = cacheReadAhead;
  }

  
  /**
   **/
  public ThinVolumeCreateRequest dataAssuranceEnabled(Boolean dataAssuranceEnabled) {
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
   * Optional array of Meta Data tags for the volume.  
   **/
  public ThinVolumeCreateRequest metaTags(List<VolumeMetadataItem> metaTags) {
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
    ThinVolumeCreateRequest thinVolumeCreateRequest = (ThinVolumeCreateRequest) o;
    return Objects.equals(this.poolId, thinVolumeCreateRequest.poolId) &&
        Objects.equals(this.name, thinVolumeCreateRequest.name) &&
        Objects.equals(this.sizeUnit, thinVolumeCreateRequest.sizeUnit) &&
        Objects.equals(this.virtualSize, thinVolumeCreateRequest.virtualSize) &&
        Objects.equals(this.repositorySize, thinVolumeCreateRequest.repositorySize) &&
        Objects.equals(this.maximumRepositorySize, thinVolumeCreateRequest.maximumRepositorySize) &&
        Objects.equals(this.owningControllerId, thinVolumeCreateRequest.owningControllerId) &&
        Objects.equals(this.growthAlertThreshold, thinVolumeCreateRequest.growthAlertThreshold) &&
        Objects.equals(this.createDefaultMapping, thinVolumeCreateRequest.createDefaultMapping) &&
        Objects.equals(this.expansionPolicy, thinVolumeCreateRequest.expansionPolicy) &&
        Objects.equals(this.cacheReadAhead, thinVolumeCreateRequest.cacheReadAhead) &&
        Objects.equals(this.dataAssuranceEnabled, thinVolumeCreateRequest.dataAssuranceEnabled) &&
        Objects.equals(this.metaTags, thinVolumeCreateRequest.metaTags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(poolId, name, sizeUnit, virtualSize, repositorySize, maximumRepositorySize, owningControllerId, growthAlertThreshold, createDefaultMapping, expansionPolicy, cacheReadAhead, dataAssuranceEnabled, metaTags);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ThinVolumeCreateRequest {\n");
    
    sb.append("    poolId: ").append(toIndentedString(poolId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    sizeUnit: ").append(toIndentedString(sizeUnit)).append("\n");
    sb.append("    virtualSize: ").append(toIndentedString(virtualSize)).append("\n");
    sb.append("    repositorySize: ").append(toIndentedString(repositorySize)).append("\n");
    sb.append("    maximumRepositorySize: ").append(toIndentedString(maximumRepositorySize)).append("\n");
    sb.append("    owningControllerId: ").append(toIndentedString(owningControllerId)).append("\n");
    sb.append("    growthAlertThreshold: ").append(toIndentedString(growthAlertThreshold)).append("\n");
    sb.append("    createDefaultMapping: ").append(toIndentedString(createDefaultMapping)).append("\n");
    sb.append("    expansionPolicy: ").append(toIndentedString(expansionPolicy)).append("\n");
    sb.append("    cacheReadAhead: ").append(toIndentedString(cacheReadAhead)).append("\n");
    sb.append("    dataAssuranceEnabled: ").append(toIndentedString(dataAssuranceEnabled)).append("\n");
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

