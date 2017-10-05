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
 * PITGroupCreationDescriptor
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2017-10-04T15:05:55.769-05:00")
public class PITGroupCreationDescriptor   {
  
    private String baseVolume;

    private String pitGroupLabel;

    private ConcatVolumeCreationDescriptor repositoryCandidate;


  /**
   * Behavior on repository full condition.
   */
  public enum RepFullPolicyEnum {
    unknown("unknown"),
    failbasewrites("failbasewrites"),
    purgepit("purgepit"),
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

    private Integer fullWarnThreshold;

    private Integer autoDeleteLimit;


  /**
   * Importance of rollback operation.
   */
  public enum RollbackPriorityEnum {
    highest("highest"),
    high("high"),
    medium("medium"),
    low("low"),
    lowest("lowest"),
    __UNDEFINED("__UNDEFINED");
;
    private String value;

    RollbackPriorityEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

    private RollbackPriorityEnum rollbackPriority;

    private OptionalScheduleCreationDescriptor pitSchedule;

  
  /**
   * The base volume for this PiT Group.
   **/
  public PITGroupCreationDescriptor baseVolume(String baseVolume) {
    this.baseVolume = baseVolume;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The base volume for this PiT Group.")
  @JsonProperty("baseVolume")
  public String getBaseVolume() {
    return baseVolume;
  }
  
  public void setBaseVolume(String baseVolume) {
    this.baseVolume = baseVolume;
  }

  
  /**
   * The user-assigned PiT Group label.
   **/
  public PITGroupCreationDescriptor pitGroupLabel(String pitGroupLabel) {
    this.pitGroupLabel = pitGroupLabel;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The user-assigned PiT Group label.")
  @JsonProperty("pitGroupLabel")
  public String getPitGroupLabel() {
    return pitGroupLabel;
  }
  
  public void setPitGroupLabel(String pitGroupLabel) {
    this.pitGroupLabel = pitGroupLabel;
  }

  
  /**
   * The volume candidate for the repository.
   **/
  public PITGroupCreationDescriptor repositoryCandidate(ConcatVolumeCreationDescriptor repositoryCandidate) {
    this.repositoryCandidate = repositoryCandidate;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The volume candidate for the repository.")
  @JsonProperty("repositoryCandidate")
  public ConcatVolumeCreationDescriptor getRepositoryCandidate() {
    return repositoryCandidate;
  }
  
  public void setRepositoryCandidate(ConcatVolumeCreationDescriptor repositoryCandidate) {
    this.repositoryCandidate = repositoryCandidate;
  }

  
  /**
   * Behavior on repository full condition.
   **/
  public PITGroupCreationDescriptor repFullPolicy(RepFullPolicyEnum repFullPolicy) {
    this.repFullPolicy = repFullPolicy;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Behavior on repository full condition.")
  @JsonProperty("repFullPolicy")
  public RepFullPolicyEnum getRepFullPolicy() {
    return repFullPolicy;
  }
  
  public void setRepFullPolicy(RepFullPolicyEnum repFullPolicy) {
    this.repFullPolicy = repFullPolicy;
  }

  
  /**
   * The repository utilization warning threshold percentage.
   **/
  public PITGroupCreationDescriptor fullWarnThreshold(Integer fullWarnThreshold) {
    this.fullWarnThreshold = fullWarnThreshold;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The repository utilization warning threshold percentage.")
  @JsonProperty("fullWarnThreshold")
  public Integer getFullWarnThreshold() {
    return fullWarnThreshold;
  }
  
  public void setFullWarnThreshold(Integer fullWarnThreshold) {
    this.fullWarnThreshold = fullWarnThreshold;
  }

  
  /**
   * The auto-delete setting for PiT Group. A non-zero value indicates auto delete is enabled and the limit should be set to the value specified.
   **/
  public PITGroupCreationDescriptor autoDeleteLimit(Integer autoDeleteLimit) {
    this.autoDeleteLimit = autoDeleteLimit;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The auto-delete setting for PiT Group. A non-zero value indicates auto delete is enabled and the limit should be set to the value specified.")
  @JsonProperty("autoDeleteLimit")
  public Integer getAutoDeleteLimit() {
    return autoDeleteLimit;
  }
  
  public void setAutoDeleteLimit(Integer autoDeleteLimit) {
    this.autoDeleteLimit = autoDeleteLimit;
  }

  
  /**
   * Importance of rollback operation.
   **/
  public PITGroupCreationDescriptor rollbackPriority(RollbackPriorityEnum rollbackPriority) {
    this.rollbackPriority = rollbackPriority;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Importance of rollback operation.")
  @JsonProperty("rollbackPriority")
  public RollbackPriorityEnum getRollbackPriority() {
    return rollbackPriority;
  }
  
  public void setRollbackPriority(RollbackPriorityEnum rollbackPriority) {
    this.rollbackPriority = rollbackPriority;
  }

  
  /**
   * An optional PiT schedule to be created with the new PITGroup. The target object is empty in this structure (unknown because not yet created, assigned by this creation method).
   **/
  public PITGroupCreationDescriptor pitSchedule(OptionalScheduleCreationDescriptor pitSchedule) {
    this.pitSchedule = pitSchedule;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "An optional PiT schedule to be created with the new PITGroup. The target object is empty in this structure (unknown because not yet created, assigned by this creation method).")
  @JsonProperty("pitSchedule")
  public OptionalScheduleCreationDescriptor getPitSchedule() {
    return pitSchedule;
  }
  
  public void setPitSchedule(OptionalScheduleCreationDescriptor pitSchedule) {
    this.pitSchedule = pitSchedule;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PITGroupCreationDescriptor pITGroupCreationDescriptor = (PITGroupCreationDescriptor) o;
    return Objects.equals(this.baseVolume, pITGroupCreationDescriptor.baseVolume) &&
        Objects.equals(this.pitGroupLabel, pITGroupCreationDescriptor.pitGroupLabel) &&
        Objects.equals(this.repositoryCandidate, pITGroupCreationDescriptor.repositoryCandidate) &&
        Objects.equals(this.repFullPolicy, pITGroupCreationDescriptor.repFullPolicy) &&
        Objects.equals(this.fullWarnThreshold, pITGroupCreationDescriptor.fullWarnThreshold) &&
        Objects.equals(this.autoDeleteLimit, pITGroupCreationDescriptor.autoDeleteLimit) &&
        Objects.equals(this.rollbackPriority, pITGroupCreationDescriptor.rollbackPriority) &&
        Objects.equals(this.pitSchedule, pITGroupCreationDescriptor.pitSchedule);
  }

  @Override
  public int hashCode() {
    return Objects.hash(baseVolume, pitGroupLabel, repositoryCandidate, repFullPolicy, fullWarnThreshold, autoDeleteLimit, rollbackPriority, pitSchedule);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PITGroupCreationDescriptor {\n");
    
    sb.append("    baseVolume: ").append(toIndentedString(baseVolume)).append("\n");
    sb.append("    pitGroupLabel: ").append(toIndentedString(pitGroupLabel)).append("\n");
    sb.append("    repositoryCandidate: ").append(toIndentedString(repositoryCandidate)).append("\n");
    sb.append("    repFullPolicy: ").append(toIndentedString(repFullPolicy)).append("\n");
    sb.append("    fullWarnThreshold: ").append(toIndentedString(fullWarnThreshold)).append("\n");
    sb.append("    autoDeleteLimit: ").append(toIndentedString(autoDeleteLimit)).append("\n");
    sb.append("    rollbackPriority: ").append(toIndentedString(rollbackPriority)).append("\n");
    sb.append("    pitSchedule: ").append(toIndentedString(pitSchedule)).append("\n");
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

