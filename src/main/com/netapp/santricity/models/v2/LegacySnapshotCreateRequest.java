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
 * Creates a legacy Snapshot (non-PiT).
 */
@ApiModel(description = "Creates a legacy Snapshot (non-PiT).")
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2017-10-04T15:05:52.333-05:00")
public class LegacySnapshotCreateRequest   {
  
    private String baseVolumeId;

    private String name;

    private Double repositoryPercentage;

    private Integer warningThreshold;


  /**
   * The behavior on when the data repository becomes full.
   */
  public enum FullPolicyEnum {
    failwrites("failwrites"),
    failsnap("failsnap"),
    __UNDEFINED("__UNDEFINED");
;
    private String value;

    FullPolicyEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

    private FullPolicyEnum fullPolicy;

    private String storagePoolId;

  
  /**
   * The identifier of the volume or thin volume for the new snapshot group.
   **/
  public LegacySnapshotCreateRequest baseVolumeId(String baseVolumeId) {
    this.baseVolumeId = baseVolumeId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The identifier of the volume or thin volume for the new snapshot group.")
  @JsonProperty("baseVolumeId")
  public String getBaseVolumeId() {
    return baseVolumeId;
  }
  
  public void setBaseVolumeId(String baseVolumeId) {
    this.baseVolumeId = baseVolumeId;
  }

  
  /**
   * The name of the new snapshot.
   **/
  public LegacySnapshotCreateRequest name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The name of the new snapshot.")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   * Size of the snapshot repository in relation to the base volume capacity
   **/
  public LegacySnapshotCreateRequest repositoryPercentage(Double repositoryPercentage) {
    this.repositoryPercentage = repositoryPercentage;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Size of the snapshot repository in relation to the base volume capacity")
  @JsonProperty("repositoryPercentage")
  public Double getRepositoryPercentage() {
    return repositoryPercentage;
  }
  
  public void setRepositoryPercentage(Double repositoryPercentage) {
    this.repositoryPercentage = repositoryPercentage;
  }

  
  /**
   * Warn the user when the repository is % full.
   **/
  public LegacySnapshotCreateRequest warningThreshold(Integer warningThreshold) {
    this.warningThreshold = warningThreshold;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Warn the user when the repository is % full.")
  @JsonProperty("warningThreshold")
  public Integer getWarningThreshold() {
    return warningThreshold;
  }
  
  public void setWarningThreshold(Integer warningThreshold) {
    this.warningThreshold = warningThreshold;
  }

  
  /**
   * The behavior on when the data repository becomes full.
   **/
  public LegacySnapshotCreateRequest fullPolicy(FullPolicyEnum fullPolicy) {
    this.fullPolicy = fullPolicy;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The behavior on when the data repository becomes full.")
  @JsonProperty("fullPolicy")
  public FullPolicyEnum getFullPolicy() {
    return fullPolicy;
  }
  
  public void setFullPolicy(FullPolicyEnum fullPolicy) {
    this.fullPolicy = fullPolicy;
  }

  
  /**
   * The identifier of the storage pool to allocate the repository volume.
   **/
  public LegacySnapshotCreateRequest storagePoolId(String storagePoolId) {
    this.storagePoolId = storagePoolId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The identifier of the storage pool to allocate the repository volume.")
  @JsonProperty("storagePoolId")
  public String getStoragePoolId() {
    return storagePoolId;
  }
  
  public void setStoragePoolId(String storagePoolId) {
    this.storagePoolId = storagePoolId;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LegacySnapshotCreateRequest legacySnapshotCreateRequest = (LegacySnapshotCreateRequest) o;
    return Objects.equals(this.baseVolumeId, legacySnapshotCreateRequest.baseVolumeId) &&
        Objects.equals(this.name, legacySnapshotCreateRequest.name) &&
        Objects.equals(this.repositoryPercentage, legacySnapshotCreateRequest.repositoryPercentage) &&
        Objects.equals(this.warningThreshold, legacySnapshotCreateRequest.warningThreshold) &&
        Objects.equals(this.fullPolicy, legacySnapshotCreateRequest.fullPolicy) &&
        Objects.equals(this.storagePoolId, legacySnapshotCreateRequest.storagePoolId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(baseVolumeId, name, repositoryPercentage, warningThreshold, fullPolicy, storagePoolId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LegacySnapshotCreateRequest {\n");
    
    sb.append("    baseVolumeId: ").append(toIndentedString(baseVolumeId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    repositoryPercentage: ").append(toIndentedString(repositoryPercentage)).append("\n");
    sb.append("    warningThreshold: ").append(toIndentedString(warningThreshold)).append("\n");
    sb.append("    fullPolicy: ").append(toIndentedString(fullPolicy)).append("\n");
    sb.append("    storagePoolId: ").append(toIndentedString(storagePoolId)).append("\n");
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

