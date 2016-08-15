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
 * Updates a consistency group
 */
@ApiModel(description = "Updates a consistency group")
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2016-08-12T15:32:41.671-05:00")
public class ConsistencyGroupUpdateRequest   {
  
    private String name;

    private Integer fullWarnThresholdPercent;

    private Integer autoDeleteThreshold;


  /**
   * The repository full policy.
   */
  public enum RepositoryFullPolicyEnum {
    unknown("unknown"),
    failbasewrites("failbasewrites"),
    purgepit("purgepit"),
    __UNDEFINED("__UNDEFINED");
;
    private String value;

    RepositoryFullPolicyEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

    private RepositoryFullPolicyEnum repositoryFullPolicy;


  /**
   * Roll-back priority
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
   * The user-label to assign to the new consistency group
   **/
  public ConsistencyGroupUpdateRequest name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The user-label to assign to the new consistency group")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   * The full warning threshold percent
   **/
  public ConsistencyGroupUpdateRequest fullWarnThresholdPercent(Integer fullWarnThresholdPercent) {
    this.fullWarnThresholdPercent = fullWarnThresholdPercent;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The full warning threshold percent")
  @JsonProperty("fullWarnThresholdPercent")
  public Integer getFullWarnThresholdPercent() {
    return fullWarnThresholdPercent;
  }
  
  public void setFullWarnThresholdPercent(Integer fullWarnThresholdPercent) {
    this.fullWarnThresholdPercent = fullWarnThresholdPercent;
  }

  
  /**
   * The auto-delete threshold. Automatically delete snapshots after this many.
   **/
  public ConsistencyGroupUpdateRequest autoDeleteThreshold(Integer autoDeleteThreshold) {
    this.autoDeleteThreshold = autoDeleteThreshold;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The auto-delete threshold. Automatically delete snapshots after this many.")
  @JsonProperty("autoDeleteThreshold")
  public Integer getAutoDeleteThreshold() {
    return autoDeleteThreshold;
  }
  
  public void setAutoDeleteThreshold(Integer autoDeleteThreshold) {
    this.autoDeleteThreshold = autoDeleteThreshold;
  }

  
  /**
   * The repository full policy.
   **/
  public ConsistencyGroupUpdateRequest repositoryFullPolicy(RepositoryFullPolicyEnum repositoryFullPolicy) {
    this.repositoryFullPolicy = repositoryFullPolicy;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The repository full policy.")
  @JsonProperty("repositoryFullPolicy")
  public RepositoryFullPolicyEnum getRepositoryFullPolicy() {
    return repositoryFullPolicy;
  }
  
  public void setRepositoryFullPolicy(RepositoryFullPolicyEnum repositoryFullPolicy) {
    this.repositoryFullPolicy = repositoryFullPolicy;
  }

  
  /**
   * Roll-back priority
   **/
  public ConsistencyGroupUpdateRequest rollbackPriority(RollbackPriorityEnum rollbackPriority) {
    this.rollbackPriority = rollbackPriority;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Roll-back priority")
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
    ConsistencyGroupUpdateRequest consistencyGroupUpdateRequest = (ConsistencyGroupUpdateRequest) o;
    return Objects.equals(this.name, consistencyGroupUpdateRequest.name) &&
        Objects.equals(this.fullWarnThresholdPercent, consistencyGroupUpdateRequest.fullWarnThresholdPercent) &&
        Objects.equals(this.autoDeleteThreshold, consistencyGroupUpdateRequest.autoDeleteThreshold) &&
        Objects.equals(this.repositoryFullPolicy, consistencyGroupUpdateRequest.repositoryFullPolicy) &&
        Objects.equals(this.rollbackPriority, consistencyGroupUpdateRequest.rollbackPriority);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, fullWarnThresholdPercent, autoDeleteThreshold, repositoryFullPolicy, rollbackPriority);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConsistencyGroupUpdateRequest {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    fullWarnThresholdPercent: ").append(toIndentedString(fullWarnThresholdPercent)).append("\n");
    sb.append("    autoDeleteThreshold: ").append(toIndentedString(autoDeleteThreshold)).append("\n");
    sb.append("    repositoryFullPolicy: ").append(toIndentedString(repositoryFullPolicy)).append("\n");
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

