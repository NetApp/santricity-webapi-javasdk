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
 * PITConsistencyGroupCreationDescriptor
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2017-10-04T15:05:55.769-05:00")
public class PITConsistencyGroupCreationDescriptor   {
  
    private String label;


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

    private OptionalScheduleCreationDescriptor cgSchedule;

  
  /**
   * The name of the Consistency Group.
   **/
  public PITConsistencyGroupCreationDescriptor label(String label) {
    this.label = label;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The name of the Consistency Group.")
  @JsonProperty("label")
  public String getLabel() {
    return label;
  }
  
  public void setLabel(String label) {
    this.label = label;
  }

  
  /**
   * Behavior on repository full condition.
   **/
  public PITConsistencyGroupCreationDescriptor repFullPolicy(RepFullPolicyEnum repFullPolicy) {
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
  public PITConsistencyGroupCreationDescriptor fullWarnThreshold(Integer fullWarnThreshold) {
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
   * The auto-delete setting for Consistency Group. A non-zero value indicates auto delete is enabled and limit should be set to value specified.
   **/
  public PITConsistencyGroupCreationDescriptor autoDeleteLimit(Integer autoDeleteLimit) {
    this.autoDeleteLimit = autoDeleteLimit;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The auto-delete setting for Consistency Group. A non-zero value indicates auto delete is enabled and limit should be set to value specified.")
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
  public PITConsistencyGroupCreationDescriptor rollbackPriority(RollbackPriorityEnum rollbackPriority) {
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
   * An optional schedule to be created with the new consistency group. The target object is empty in this structure (unknown because not yet created, assigned by this creation method).
   **/
  public PITConsistencyGroupCreationDescriptor cgSchedule(OptionalScheduleCreationDescriptor cgSchedule) {
    this.cgSchedule = cgSchedule;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "An optional schedule to be created with the new consistency group. The target object is empty in this structure (unknown because not yet created, assigned by this creation method).")
  @JsonProperty("cgSchedule")
  public OptionalScheduleCreationDescriptor getCgSchedule() {
    return cgSchedule;
  }
  
  public void setCgSchedule(OptionalScheduleCreationDescriptor cgSchedule) {
    this.cgSchedule = cgSchedule;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PITConsistencyGroupCreationDescriptor pITConsistencyGroupCreationDescriptor = (PITConsistencyGroupCreationDescriptor) o;
    return Objects.equals(this.label, pITConsistencyGroupCreationDescriptor.label) &&
        Objects.equals(this.repFullPolicy, pITConsistencyGroupCreationDescriptor.repFullPolicy) &&
        Objects.equals(this.fullWarnThreshold, pITConsistencyGroupCreationDescriptor.fullWarnThreshold) &&
        Objects.equals(this.autoDeleteLimit, pITConsistencyGroupCreationDescriptor.autoDeleteLimit) &&
        Objects.equals(this.rollbackPriority, pITConsistencyGroupCreationDescriptor.rollbackPriority) &&
        Objects.equals(this.cgSchedule, pITConsistencyGroupCreationDescriptor.cgSchedule);
  }

  @Override
  public int hashCode() {
    return Objects.hash(label, repFullPolicy, fullWarnThreshold, autoDeleteLimit, rollbackPriority, cgSchedule);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PITConsistencyGroupCreationDescriptor {\n");
    
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    repFullPolicy: ").append(toIndentedString(repFullPolicy)).append("\n");
    sb.append("    fullWarnThreshold: ").append(toIndentedString(fullWarnThreshold)).append("\n");
    sb.append("    autoDeleteLimit: ").append(toIndentedString(autoDeleteLimit)).append("\n");
    sb.append("    rollbackPriority: ").append(toIndentedString(rollbackPriority)).append("\n");
    sb.append("    cgSchedule: ").append(toIndentedString(cgSchedule)).append("\n");
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

