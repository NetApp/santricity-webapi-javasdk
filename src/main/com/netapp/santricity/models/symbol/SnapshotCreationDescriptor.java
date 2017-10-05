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
 * SnapshotCreationDescriptor
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2017-10-04T15:05:55.769-05:00")
public class SnapshotCreationDescriptor   {
  
    private String baseVolume;

    private String snapshotLabel;

    private String repositoryLabel;

    private Long repositoryCapacity;

    private Integer warnThreshold;

    private Long extentStart;

    private Long extentSize;


  /**
   * The policy regarding what will happen when the repository is full.
   */
  public enum RepFullPolicyEnum {
    failwrites("failwrites"),
    failsnap("failsnap"),
    __UNDEFINED("__UNDEFINED");
;
    private String value;

    RepFullPolicyEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

    private RepFullPolicyEnum repFullPolicy;

    private VolumeCandidate candidate;

    private Boolean noMapping;

    private String volumeGroupLabel;

    private Boolean createInStoppedState;

    private OptionalScheduleCreationDescriptor snapshotSchedule;

  
  /**
   * The base volume.
   **/
  public SnapshotCreationDescriptor baseVolume(String baseVolume) {
    this.baseVolume = baseVolume;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The base volume.")
  @JsonProperty("baseVolume")
  public String getBaseVolume() {
    return baseVolume;
  }
  
  public void setBaseVolume(String baseVolume) {
    this.baseVolume = baseVolume;
  }

  
  /**
   * The user assigned snapshot label.
   **/
  public SnapshotCreationDescriptor snapshotLabel(String snapshotLabel) {
    this.snapshotLabel = snapshotLabel;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The user assigned snapshot label.")
  @JsonProperty("snapshotLabel")
  public String getSnapshotLabel() {
    return snapshotLabel;
  }
  
  public void setSnapshotLabel(String snapshotLabel) {
    this.snapshotLabel = snapshotLabel;
  }

  
  /**
   * The user assigned label for the repository volume.
   **/
  public SnapshotCreationDescriptor repositoryLabel(String repositoryLabel) {
    this.repositoryLabel = repositoryLabel;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The user assigned label for the repository volume.")
  @JsonProperty("repositoryLabel")
  public String getRepositoryLabel() {
    return repositoryLabel;
  }
  
  public void setRepositoryLabel(String repositoryLabel) {
    this.repositoryLabel = repositoryLabel;
  }

  
  /**
   * The capacity size of the repository to create in bytes.
   **/
  public SnapshotCreationDescriptor repositoryCapacity(Long repositoryCapacity) {
    this.repositoryCapacity = repositoryCapacity;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The capacity size of the repository to create in bytes.")
  @JsonProperty("repositoryCapacity")
  public Long getRepositoryCapacity() {
    return repositoryCapacity;
  }
  
  public void setRepositoryCapacity(Long repositoryCapacity) {
    this.repositoryCapacity = repositoryCapacity;
  }

  
  /**
   * The repository utilization warning threshold.
   **/
  public SnapshotCreationDescriptor warnThreshold(Integer warnThreshold) {
    this.warnThreshold = warnThreshold;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The repository utilization warning threshold.")
  @JsonProperty("warnThreshold")
  public Integer getWarnThreshold() {
    return warnThreshold;
  }
  
  public void setWarnThreshold(Integer warnThreshold) {
    this.warnThreshold = warnThreshold;
  }

  
  /**
   * The start position of the extent in the base volume (bytes). Not used in this release of software.
   **/
  public SnapshotCreationDescriptor extentStart(Long extentStart) {
    this.extentStart = extentStart;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The start position of the extent in the base volume (bytes). Not used in this release of software.")
  @JsonProperty("extentStart")
  public Long getExtentStart() {
    return extentStart;
  }
  
  public void setExtentStart(Long extentStart) {
    this.extentStart = extentStart;
  }

  
  /**
   * The size of the extent in bytes. Not used in this release of software.
   **/
  public SnapshotCreationDescriptor extentSize(Long extentSize) {
    this.extentSize = extentSize;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The size of the extent in bytes. Not used in this release of software.")
  @JsonProperty("extentSize")
  public Long getExtentSize() {
    return extentSize;
  }
  
  public void setExtentSize(Long extentSize) {
    this.extentSize = extentSize;
  }

  
  /**
   * The policy regarding what will happen when the repository is full.
   **/
  public SnapshotCreationDescriptor repFullPolicy(RepFullPolicyEnum repFullPolicy) {
    this.repFullPolicy = repFullPolicy;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The policy regarding what will happen when the repository is full.")
  @JsonProperty("repFullPolicy")
  public RepFullPolicyEnum getRepFullPolicy() {
    return repFullPolicy;
  }
  
  public void setRepFullPolicy(RepFullPolicyEnum repFullPolicy) {
    this.repFullPolicy = repFullPolicy;
  }

  
  /**
   * The volume candidate for the repository.
   **/
  public SnapshotCreationDescriptor candidate(VolumeCandidate candidate) {
    this.candidate = candidate;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The volume candidate for the repository.")
  @JsonProperty("candidate")
  public VolumeCandidate getCandidate() {
    return candidate;
  }
  
  public void setCandidate(VolumeCandidate candidate) {
    this.candidate = candidate;
  }

  
  /**
   * True tells the controller NOT to create a mapping. False causes the controller to create a default mapping for the new snapshot. (Note: A True value for noMapping when the SPM feature is disabled will cause a RETCODE_PARTITIONS_DISABLED from createSnapshot. This is because a host cannot access the snapshot if partitions are disabled and a default mapping was not created when the snapshot was created.
   **/
  public SnapshotCreationDescriptor noMapping(Boolean noMapping) {
    this.noMapping = noMapping;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "True tells the controller NOT to create a mapping. False causes the controller to create a default mapping for the new snapshot. (Note: A True value for noMapping when the SPM feature is disabled will cause a RETCODE_PARTITIONS_DISABLED from createSnapshot. This is because a host cannot access the snapshot if partitions are disabled and a default mapping was not created when the snapshot was created.")
  @JsonProperty("noMapping")
  public Boolean getNoMapping() {
    return noMapping;
  }
  
  public void setNoMapping(Boolean noMapping) {
    this.noMapping = noMapping;
  }

  
  /**
   * The label to assign to the new volume group for the repository, if any. This field is only used when the repository candidate selection type is CANDIDATE_SEL_MANUAL or CANDIDATE_SEL_COUNT.
   **/
  public SnapshotCreationDescriptor volumeGroupLabel(String volumeGroupLabel) {
    this.volumeGroupLabel = volumeGroupLabel;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The label to assign to the new volume group for the repository, if any. This field is only used when the repository candidate selection type is CANDIDATE_SEL_MANUAL or CANDIDATE_SEL_COUNT.")
  @JsonProperty("volumeGroupLabel")
  public String getVolumeGroupLabel() {
    return volumeGroupLabel;
  }
  
  public void setVolumeGroupLabel(String volumeGroupLabel) {
    this.volumeGroupLabel = volumeGroupLabel;
  }

  
  /**
   * If true, the snapshot will be created in a stopped state, otherwise it will be started on creation.
   **/
  public SnapshotCreationDescriptor createInStoppedState(Boolean createInStoppedState) {
    this.createInStoppedState = createInStoppedState;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "If true, the snapshot will be created in a stopped state, otherwise it will be started on creation.")
  @JsonProperty("createInStoppedState")
  public Boolean getCreateInStoppedState() {
    return createInStoppedState;
  }
  
  public void setCreateInStoppedState(Boolean createInStoppedState) {
    this.createInStoppedState = createInStoppedState;
  }

  
  /**
   * The snapshot schedule. The targetObject in the structure is empty.
   **/
  public SnapshotCreationDescriptor snapshotSchedule(OptionalScheduleCreationDescriptor snapshotSchedule) {
    this.snapshotSchedule = snapshotSchedule;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The snapshot schedule. The targetObject in the structure is empty.")
  @JsonProperty("snapshotSchedule")
  public OptionalScheduleCreationDescriptor getSnapshotSchedule() {
    return snapshotSchedule;
  }
  
  public void setSnapshotSchedule(OptionalScheduleCreationDescriptor snapshotSchedule) {
    this.snapshotSchedule = snapshotSchedule;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SnapshotCreationDescriptor snapshotCreationDescriptor = (SnapshotCreationDescriptor) o;
    return Objects.equals(this.baseVolume, snapshotCreationDescriptor.baseVolume) &&
        Objects.equals(this.snapshotLabel, snapshotCreationDescriptor.snapshotLabel) &&
        Objects.equals(this.repositoryLabel, snapshotCreationDescriptor.repositoryLabel) &&
        Objects.equals(this.repositoryCapacity, snapshotCreationDescriptor.repositoryCapacity) &&
        Objects.equals(this.warnThreshold, snapshotCreationDescriptor.warnThreshold) &&
        Objects.equals(this.extentStart, snapshotCreationDescriptor.extentStart) &&
        Objects.equals(this.extentSize, snapshotCreationDescriptor.extentSize) &&
        Objects.equals(this.repFullPolicy, snapshotCreationDescriptor.repFullPolicy) &&
        Objects.equals(this.candidate, snapshotCreationDescriptor.candidate) &&
        Objects.equals(this.noMapping, snapshotCreationDescriptor.noMapping) &&
        Objects.equals(this.volumeGroupLabel, snapshotCreationDescriptor.volumeGroupLabel) &&
        Objects.equals(this.createInStoppedState, snapshotCreationDescriptor.createInStoppedState) &&
        Objects.equals(this.snapshotSchedule, snapshotCreationDescriptor.snapshotSchedule);
  }

  @Override
  public int hashCode() {
    return Objects.hash(baseVolume, snapshotLabel, repositoryLabel, repositoryCapacity, warnThreshold, extentStart, extentSize, repFullPolicy, candidate, noMapping, volumeGroupLabel, createInStoppedState, snapshotSchedule);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SnapshotCreationDescriptor {\n");
    
    sb.append("    baseVolume: ").append(toIndentedString(baseVolume)).append("\n");
    sb.append("    snapshotLabel: ").append(toIndentedString(snapshotLabel)).append("\n");
    sb.append("    repositoryLabel: ").append(toIndentedString(repositoryLabel)).append("\n");
    sb.append("    repositoryCapacity: ").append(toIndentedString(repositoryCapacity)).append("\n");
    sb.append("    warnThreshold: ").append(toIndentedString(warnThreshold)).append("\n");
    sb.append("    extentStart: ").append(toIndentedString(extentStart)).append("\n");
    sb.append("    extentSize: ").append(toIndentedString(extentSize)).append("\n");
    sb.append("    repFullPolicy: ").append(toIndentedString(repFullPolicy)).append("\n");
    sb.append("    candidate: ").append(toIndentedString(candidate)).append("\n");
    sb.append("    noMapping: ").append(toIndentedString(noMapping)).append("\n");
    sb.append("    volumeGroupLabel: ").append(toIndentedString(volumeGroupLabel)).append("\n");
    sb.append("    createInStoppedState: ").append(toIndentedString(createInStoppedState)).append("\n");
    sb.append("    snapshotSchedule: ").append(toIndentedString(snapshotSchedule)).append("\n");
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

