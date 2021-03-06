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
 * PITGroupParamsUpdateDescriptor
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2017-10-04T15:05:55.769-05:00")
public class PITGroupParamsUpdateDescriptor   {
  
    private String pitGroupRef;

    private String pitGroupLabel;


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

  
  /**
   * The PITGroup to be updated.
   **/
  public PITGroupParamsUpdateDescriptor pitGroupRef(String pitGroupRef) {
    this.pitGroupRef = pitGroupRef;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The PITGroup to be updated.")
  @JsonProperty("pitGroupRef")
  public String getPitGroupRef() {
    return pitGroupRef;
  }
  
  public void setPitGroupRef(String pitGroupRef) {
    this.pitGroupRef = pitGroupRef;
  }

  
  /**
   * The PiT Group label.
   **/
  public PITGroupParamsUpdateDescriptor pitGroupLabel(String pitGroupLabel) {
    this.pitGroupLabel = pitGroupLabel;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The PiT Group label.")
  @JsonProperty("pitGroupLabel")
  public String getPitGroupLabel() {
    return pitGroupLabel;
  }
  
  public void setPitGroupLabel(String pitGroupLabel) {
    this.pitGroupLabel = pitGroupLabel;
  }

  
  /**
   * Behavior on repository full condition.
   **/
  public PITGroupParamsUpdateDescriptor repFullPolicy(RepFullPolicyEnum repFullPolicy) {
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
   * Repository utilization warning threshold percentage.
   **/
  public PITGroupParamsUpdateDescriptor fullWarnThreshold(Integer fullWarnThreshold) {
    this.fullWarnThreshold = fullWarnThreshold;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Repository utilization warning threshold percentage.")
  @JsonProperty("fullWarnThreshold")
  public Integer getFullWarnThreshold() {
    return fullWarnThreshold;
  }
  
  public void setFullWarnThreshold(Integer fullWarnThreshold) {
    this.fullWarnThreshold = fullWarnThreshold;
  }

  
  /**
   * The auto-delete setting for the PiT Group. A non-zero value indicates auto delete is enabled and limit should be set to value specified.
   **/
  public PITGroupParamsUpdateDescriptor autoDeleteLimit(Integer autoDeleteLimit) {
    this.autoDeleteLimit = autoDeleteLimit;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The auto-delete setting for the PiT Group. A non-zero value indicates auto delete is enabled and limit should be set to value specified.")
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
  public PITGroupParamsUpdateDescriptor rollbackPriority(RollbackPriorityEnum rollbackPriority) {
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

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PITGroupParamsUpdateDescriptor pITGroupParamsUpdateDescriptor = (PITGroupParamsUpdateDescriptor) o;
    return Objects.equals(this.pitGroupRef, pITGroupParamsUpdateDescriptor.pitGroupRef) &&
        Objects.equals(this.pitGroupLabel, pITGroupParamsUpdateDescriptor.pitGroupLabel) &&
        Objects.equals(this.repFullPolicy, pITGroupParamsUpdateDescriptor.repFullPolicy) &&
        Objects.equals(this.fullWarnThreshold, pITGroupParamsUpdateDescriptor.fullWarnThreshold) &&
        Objects.equals(this.autoDeleteLimit, pITGroupParamsUpdateDescriptor.autoDeleteLimit) &&
        Objects.equals(this.rollbackPriority, pITGroupParamsUpdateDescriptor.rollbackPriority);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pitGroupRef, pitGroupLabel, repFullPolicy, fullWarnThreshold, autoDeleteLimit, rollbackPriority);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PITGroupParamsUpdateDescriptor {\n");
    
    sb.append("    pitGroupRef: ").append(toIndentedString(pitGroupRef)).append("\n");
    sb.append("    pitGroupLabel: ").append(toIndentedString(pitGroupLabel)).append("\n");
    sb.append("    repFullPolicy: ").append(toIndentedString(repFullPolicy)).append("\n");
    sb.append("    fullWarnThreshold: ").append(toIndentedString(fullWarnThreshold)).append("\n");
    sb.append("    autoDeleteLimit: ").append(toIndentedString(autoDeleteLimit)).append("\n");
    sb.append("    rollbackPriority: ").append(toIndentedString(rollbackPriority)).append("\n");
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

