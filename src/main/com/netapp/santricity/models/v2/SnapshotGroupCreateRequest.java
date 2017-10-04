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
 * Creates a Snapshot Group (PiT Group).
 */
@ApiModel(description = "Creates a Snapshot Group (PiT Group).")
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2017-10-04T15:05:52.333-05:00")
public class SnapshotGroupCreateRequest   {
  
    private String baseMappableObjectId;

    private String name;

    private Double repositoryPercentage;

    private Integer warningThreshold;

    private Integer autoDeleteLimit;


  /**
   * The behavior on when the data repository becomes full. This value is overridden by consistency group setting if this snapshot group is associated with a consistency group.
   */
  public enum FullPolicyEnum {
    unknown("unknown"),
    failbasewrites("failbasewrites"),
    purgepit("purgepit"),
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

    private ConcatVolumeCandidate repositoryCandidate;

    private ScheduleCreateRequest schedule;

  
  /**
   * The identifier of the volume or thin volume to use as the base for the new snapshot group.
   **/
  public SnapshotGroupCreateRequest baseMappableObjectId(String baseMappableObjectId) {
    this.baseMappableObjectId = baseMappableObjectId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The identifier of the volume or thin volume to use as the base for the new snapshot group.")
  @JsonProperty("baseMappableObjectId")
  public String getBaseMappableObjectId() {
    return baseMappableObjectId;
  }
  
  public void setBaseMappableObjectId(String baseMappableObjectId) {
    this.baseMappableObjectId = baseMappableObjectId;
  }

  
  /**
   * The name of the new snapshot group.
   **/
  public SnapshotGroupCreateRequest name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The name of the new snapshot group.")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   * The size of the repository in relation to the size of the base volume.
   **/
  public SnapshotGroupCreateRequest repositoryPercentage(Double repositoryPercentage) {
    this.repositoryPercentage = repositoryPercentage;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The size of the repository in relation to the size of the base volume.")
  @JsonProperty("repositoryPercentage")
  public Double getRepositoryPercentage() {
    return repositoryPercentage;
  }
  
  public void setRepositoryPercentage(Double repositoryPercentage) {
    this.repositoryPercentage = repositoryPercentage;
  }

  
  /**
   * The repository utilization warning threshold, as a percentage of the repository volume capacity.
   **/
  public SnapshotGroupCreateRequest warningThreshold(Integer warningThreshold) {
    this.warningThreshold = warningThreshold;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The repository utilization warning threshold, as a percentage of the repository volume capacity.")
  @JsonProperty("warningThreshold")
  public Integer getWarningThreshold() {
    return warningThreshold;
  }
  
  public void setWarningThreshold(Integer warningThreshold) {
    this.warningThreshold = warningThreshold;
  }

  
  /**
   * The automatic deletion indicator. If non-zero, the oldest snapshot image will be automatically deleted when creating a new snapshot image to keep the total number of snapshot images limited to the number specified. This value is overridden by the consistency group setting if this snapshot group is associated with a consistency group.
   **/
  public SnapshotGroupCreateRequest autoDeleteLimit(Integer autoDeleteLimit) {
    this.autoDeleteLimit = autoDeleteLimit;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The automatic deletion indicator. If non-zero, the oldest snapshot image will be automatically deleted when creating a new snapshot image to keep the total number of snapshot images limited to the number specified. This value is overridden by the consistency group setting if this snapshot group is associated with a consistency group.")
  @JsonProperty("autoDeleteLimit")
  public Integer getAutoDeleteLimit() {
    return autoDeleteLimit;
  }
  
  public void setAutoDeleteLimit(Integer autoDeleteLimit) {
    this.autoDeleteLimit = autoDeleteLimit;
  }

  
  /**
   * The behavior on when the data repository becomes full. This value is overridden by consistency group setting if this snapshot group is associated with a consistency group.
   **/
  public SnapshotGroupCreateRequest fullPolicy(FullPolicyEnum fullPolicy) {
    this.fullPolicy = fullPolicy;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The behavior on when the data repository becomes full. This value is overridden by consistency group setting if this snapshot group is associated with a consistency group.")
  @JsonProperty("fullPolicy")
  public FullPolicyEnum getFullPolicy() {
    return fullPolicy;
  }
  
  public void setFullPolicy(FullPolicyEnum fullPolicy) {
    this.fullPolicy = fullPolicy;
  }

  
  /**
   * The identifier  of the storage pool on which to allocate the repository volume. Ignored if a repositoryCandidate is provided.
   **/
  public SnapshotGroupCreateRequest storagePoolId(String storagePoolId) {
    this.storagePoolId = storagePoolId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The identifier  of the storage pool on which to allocate the repository volume. Ignored if a repositoryCandidate is provided.")
  @JsonProperty("storagePoolId")
  public String getStoragePoolId() {
    return storagePoolId;
  }
  
  public void setStoragePoolId(String storagePoolId) {
    this.storagePoolId = storagePoolId;
  }

  
  /**
   * Allows a repository candidate to be manually specified for use in the creation. By default, the best candidate will be selected.
   **/
  public SnapshotGroupCreateRequest repositoryCandidate(ConcatVolumeCandidate repositoryCandidate) {
    this.repositoryCandidate = repositoryCandidate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Allows a repository candidate to be manually specified for use in the creation. By default, the best candidate will be selected.")
  @JsonProperty("repositoryCandidate")
  public ConcatVolumeCandidate getRepositoryCandidate() {
    return repositoryCandidate;
  }
  
  public void setRepositoryCandidate(ConcatVolumeCandidate repositoryCandidate) {
    this.repositoryCandidate = repositoryCandidate;
  }

  
  /**
   * An optional schedule  to be used to automatically create snapshot images.
   **/
  public SnapshotGroupCreateRequest schedule(ScheduleCreateRequest schedule) {
    this.schedule = schedule;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "An optional schedule  to be used to automatically create snapshot images.")
  @JsonProperty("schedule")
  public ScheduleCreateRequest getSchedule() {
    return schedule;
  }
  
  public void setSchedule(ScheduleCreateRequest schedule) {
    this.schedule = schedule;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SnapshotGroupCreateRequest snapshotGroupCreateRequest = (SnapshotGroupCreateRequest) o;
    return Objects.equals(this.baseMappableObjectId, snapshotGroupCreateRequest.baseMappableObjectId) &&
        Objects.equals(this.name, snapshotGroupCreateRequest.name) &&
        Objects.equals(this.repositoryPercentage, snapshotGroupCreateRequest.repositoryPercentage) &&
        Objects.equals(this.warningThreshold, snapshotGroupCreateRequest.warningThreshold) &&
        Objects.equals(this.autoDeleteLimit, snapshotGroupCreateRequest.autoDeleteLimit) &&
        Objects.equals(this.fullPolicy, snapshotGroupCreateRequest.fullPolicy) &&
        Objects.equals(this.storagePoolId, snapshotGroupCreateRequest.storagePoolId) &&
        Objects.equals(this.repositoryCandidate, snapshotGroupCreateRequest.repositoryCandidate) &&
        Objects.equals(this.schedule, snapshotGroupCreateRequest.schedule);
  }

  @Override
  public int hashCode() {
    return Objects.hash(baseMappableObjectId, name, repositoryPercentage, warningThreshold, autoDeleteLimit, fullPolicy, storagePoolId, repositoryCandidate, schedule);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SnapshotGroupCreateRequest {\n");
    
    sb.append("    baseMappableObjectId: ").append(toIndentedString(baseMappableObjectId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    repositoryPercentage: ").append(toIndentedString(repositoryPercentage)).append("\n");
    sb.append("    warningThreshold: ").append(toIndentedString(warningThreshold)).append("\n");
    sb.append("    autoDeleteLimit: ").append(toIndentedString(autoDeleteLimit)).append("\n");
    sb.append("    fullPolicy: ").append(toIndentedString(fullPolicy)).append("\n");
    sb.append("    storagePoolId: ").append(toIndentedString(storagePoolId)).append("\n");
    sb.append("    repositoryCandidate: ").append(toIndentedString(repositoryCandidate)).append("\n");
    sb.append("    schedule: ").append(toIndentedString(schedule)).append("\n");
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

