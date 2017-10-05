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
 * PITCGMember
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2017-10-04T15:05:52.333-05:00")
public class PITCGMember   {
  
    private String consistencyGroupId;

    private String volumeId;

    private String volumeWwn;

    private String baseVolumeName;

    private Integer clusterSize;

    private Integer totalRepositoryVolumes;

    private Long totalRepositoryCapacity;

    private Long usedRepositoryCapacity;

    private Integer fullWarnThreshold;

    private Integer totalSnapshotImages;

    private Integer totalSnapshotVolumes;

    private Boolean autoDeleteSnapshots;

    private Integer autoDeleteLimit;

    private String pitGroupId;

    private String repositoryVolume;

  
  /**
   **/
  public PITCGMember consistencyGroupId(String consistencyGroupId) {
    this.consistencyGroupId = consistencyGroupId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("consistencyGroupId")
  public String getConsistencyGroupId() {
    return consistencyGroupId;
  }
  
  public void setConsistencyGroupId(String consistencyGroupId) {
    this.consistencyGroupId = consistencyGroupId;
  }

  
  /**
   **/
  public PITCGMember volumeId(String volumeId) {
    this.volumeId = volumeId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("volumeId")
  public String getVolumeId() {
    return volumeId;
  }
  
  public void setVolumeId(String volumeId) {
    this.volumeId = volumeId;
  }

  
  /**
   **/
  public PITCGMember volumeWwn(String volumeWwn) {
    this.volumeWwn = volumeWwn;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("volumeWwn")
  public String getVolumeWwn() {
    return volumeWwn;
  }
  
  public void setVolumeWwn(String volumeWwn) {
    this.volumeWwn = volumeWwn;
  }

  
  /**
   **/
  public PITCGMember baseVolumeName(String baseVolumeName) {
    this.baseVolumeName = baseVolumeName;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("baseVolumeName")
  public String getBaseVolumeName() {
    return baseVolumeName;
  }
  
  public void setBaseVolumeName(String baseVolumeName) {
    this.baseVolumeName = baseVolumeName;
  }

  
  /**
   * The cluster size (in bytes).
   **/
  public PITCGMember clusterSize(Integer clusterSize) {
    this.clusterSize = clusterSize;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The cluster size (in bytes).")
  @JsonProperty("clusterSize")
  public Integer getClusterSize() {
    return clusterSize;
  }
  
  public void setClusterSize(Integer clusterSize) {
    this.clusterSize = clusterSize;
  }

  
  /**
   * Total number of repository volumes in use by the underlying snapshotGroup
   **/
  public PITCGMember totalRepositoryVolumes(Integer totalRepositoryVolumes) {
    this.totalRepositoryVolumes = totalRepositoryVolumes;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Total number of repository volumes in use by the underlying snapshotGroup")
  @JsonProperty("totalRepositoryVolumes")
  public Integer getTotalRepositoryVolumes() {
    return totalRepositoryVolumes;
  }
  
  public void setTotalRepositoryVolumes(Integer totalRepositoryVolumes) {
    this.totalRepositoryVolumes = totalRepositoryVolumes;
  }

  
  /**
   * Total repository capacity
   **/
  public PITCGMember totalRepositoryCapacity(Long totalRepositoryCapacity) {
    this.totalRepositoryCapacity = totalRepositoryCapacity;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Total repository capacity")
  @JsonProperty("totalRepositoryCapacity")
  public Long getTotalRepositoryCapacity() {
    return totalRepositoryCapacity;
  }
  
  public void setTotalRepositoryCapacity(Long totalRepositoryCapacity) {
    this.totalRepositoryCapacity = totalRepositoryCapacity;
  }

  
  /**
   * The amount of repository capacity that is being utilized
   **/
  public PITCGMember usedRepositoryCapacity(Long usedRepositoryCapacity) {
    this.usedRepositoryCapacity = usedRepositoryCapacity;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The amount of repository capacity that is being utilized")
  @JsonProperty("usedRepositoryCapacity")
  public Long getUsedRepositoryCapacity() {
    return usedRepositoryCapacity;
  }
  
  public void setUsedRepositoryCapacity(Long usedRepositoryCapacity) {
    this.usedRepositoryCapacity = usedRepositoryCapacity;
  }

  
  /**
   * The capacity threshold at which the user will be warned about running out of capacity for the repository
   **/
  public PITCGMember fullWarnThreshold(Integer fullWarnThreshold) {
    this.fullWarnThreshold = fullWarnThreshold;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The capacity threshold at which the user will be warned about running out of capacity for the repository")
  @JsonProperty("fullWarnThreshold")
  public Integer getFullWarnThreshold() {
    return fullWarnThreshold;
  }
  
  public void setFullWarnThreshold(Integer fullWarnThreshold) {
    this.fullWarnThreshold = fullWarnThreshold;
  }

  
  /**
   * The total number of snapshot images defined for this member
   **/
  public PITCGMember totalSnapshotImages(Integer totalSnapshotImages) {
    this.totalSnapshotImages = totalSnapshotImages;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The total number of snapshot images defined for this member")
  @JsonProperty("totalSnapshotImages")
  public Integer getTotalSnapshotImages() {
    return totalSnapshotImages;
  }
  
  public void setTotalSnapshotImages(Integer totalSnapshotImages) {
    this.totalSnapshotImages = totalSnapshotImages;
  }

  
  /**
   * The total number of snapshot volumes defined for this member
   **/
  public PITCGMember totalSnapshotVolumes(Integer totalSnapshotVolumes) {
    this.totalSnapshotVolumes = totalSnapshotVolumes;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The total number of snapshot volumes defined for this member")
  @JsonProperty("totalSnapshotVolumes")
  public Integer getTotalSnapshotVolumes() {
    return totalSnapshotVolumes;
  }
  
  public void setTotalSnapshotVolumes(Integer totalSnapshotVolumes) {
    this.totalSnapshotVolumes = totalSnapshotVolumes;
  }

  
  /**
   * Automatically purge all snapshots over this value
   **/
  public PITCGMember autoDeleteSnapshots(Boolean autoDeleteSnapshots) {
    this.autoDeleteSnapshots = autoDeleteSnapshots;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Automatically purge all snapshots over this value")
  @JsonProperty("autoDeleteSnapshots")
  public Boolean getAutoDeleteSnapshots() {
    return autoDeleteSnapshots;
  }
  
  public void setAutoDeleteSnapshots(Boolean autoDeleteSnapshots) {
    this.autoDeleteSnapshots = autoDeleteSnapshots;
  }

  
  /**
   * If autoDeleteSnapshots is enabled, the maximum number allowed before autoDeletion occurs
   **/
  public PITCGMember autoDeleteLimit(Integer autoDeleteLimit) {
    this.autoDeleteLimit = autoDeleteLimit;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "If autoDeleteSnapshots is enabled, the maximum number allowed before autoDeletion occurs")
  @JsonProperty("autoDeleteLimit")
  public Integer getAutoDeleteLimit() {
    return autoDeleteLimit;
  }
  
  public void setAutoDeleteLimit(Integer autoDeleteLimit) {
    this.autoDeleteLimit = autoDeleteLimit;
  }

  
  /**
   * Reference to the snapshotGroup
   **/
  public PITCGMember pitGroupId(String pitGroupId) {
    this.pitGroupId = pitGroupId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Reference to the snapshotGroup")
  @JsonProperty("pitGroupId")
  public String getPitGroupId() {
    return pitGroupId;
  }
  
  public void setPitGroupId(String pitGroupId) {
    this.pitGroupId = pitGroupId;
  }

  
  /**
   * Reference to the repository volume of the pitGroup/snapshotGroup
   **/
  public PITCGMember repositoryVolume(String repositoryVolume) {
    this.repositoryVolume = repositoryVolume;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Reference to the repository volume of the pitGroup/snapshotGroup")
  @JsonProperty("repositoryVolume")
  public String getRepositoryVolume() {
    return repositoryVolume;
  }
  
  public void setRepositoryVolume(String repositoryVolume) {
    this.repositoryVolume = repositoryVolume;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PITCGMember pITCGMember = (PITCGMember) o;
    return Objects.equals(this.consistencyGroupId, pITCGMember.consistencyGroupId) &&
        Objects.equals(this.volumeId, pITCGMember.volumeId) &&
        Objects.equals(this.volumeWwn, pITCGMember.volumeWwn) &&
        Objects.equals(this.baseVolumeName, pITCGMember.baseVolumeName) &&
        Objects.equals(this.clusterSize, pITCGMember.clusterSize) &&
        Objects.equals(this.totalRepositoryVolumes, pITCGMember.totalRepositoryVolumes) &&
        Objects.equals(this.totalRepositoryCapacity, pITCGMember.totalRepositoryCapacity) &&
        Objects.equals(this.usedRepositoryCapacity, pITCGMember.usedRepositoryCapacity) &&
        Objects.equals(this.fullWarnThreshold, pITCGMember.fullWarnThreshold) &&
        Objects.equals(this.totalSnapshotImages, pITCGMember.totalSnapshotImages) &&
        Objects.equals(this.totalSnapshotVolumes, pITCGMember.totalSnapshotVolumes) &&
        Objects.equals(this.autoDeleteSnapshots, pITCGMember.autoDeleteSnapshots) &&
        Objects.equals(this.autoDeleteLimit, pITCGMember.autoDeleteLimit) &&
        Objects.equals(this.pitGroupId, pITCGMember.pitGroupId) &&
        Objects.equals(this.repositoryVolume, pITCGMember.repositoryVolume);
  }

  @Override
  public int hashCode() {
    return Objects.hash(consistencyGroupId, volumeId, volumeWwn, baseVolumeName, clusterSize, totalRepositoryVolumes, totalRepositoryCapacity, usedRepositoryCapacity, fullWarnThreshold, totalSnapshotImages, totalSnapshotVolumes, autoDeleteSnapshots, autoDeleteLimit, pitGroupId, repositoryVolume);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PITCGMember {\n");
    
    sb.append("    consistencyGroupId: ").append(toIndentedString(consistencyGroupId)).append("\n");
    sb.append("    volumeId: ").append(toIndentedString(volumeId)).append("\n");
    sb.append("    volumeWwn: ").append(toIndentedString(volumeWwn)).append("\n");
    sb.append("    baseVolumeName: ").append(toIndentedString(baseVolumeName)).append("\n");
    sb.append("    clusterSize: ").append(toIndentedString(clusterSize)).append("\n");
    sb.append("    totalRepositoryVolumes: ").append(toIndentedString(totalRepositoryVolumes)).append("\n");
    sb.append("    totalRepositoryCapacity: ").append(toIndentedString(totalRepositoryCapacity)).append("\n");
    sb.append("    usedRepositoryCapacity: ").append(toIndentedString(usedRepositoryCapacity)).append("\n");
    sb.append("    fullWarnThreshold: ").append(toIndentedString(fullWarnThreshold)).append("\n");
    sb.append("    totalSnapshotImages: ").append(toIndentedString(totalSnapshotImages)).append("\n");
    sb.append("    totalSnapshotVolumes: ").append(toIndentedString(totalSnapshotVolumes)).append("\n");
    sb.append("    autoDeleteSnapshots: ").append(toIndentedString(autoDeleteSnapshots)).append("\n");
    sb.append("    autoDeleteLimit: ").append(toIndentedString(autoDeleteLimit)).append("\n");
    sb.append("    pitGroupId: ").append(toIndentedString(pitGroupId)).append("\n");
    sb.append("    repositoryVolume: ").append(toIndentedString(repositoryVolume)).append("\n");
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

