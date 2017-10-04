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
 * Updates a Snapshot Group (PiT Group).
 */
@ApiModel(description = "Updates a Snapshot Group (PiT Group).")
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2017-10-04T15:05:52.333-05:00")
public class SnapshotGroupUpdateRequest   {
  
    private String name;

    private Integer warningThreshold;

    private Integer autoDeleteLimit;


  /**
   * The behavior on when the data repository becomes full. This value      is overridden by consistency group setting if this snapshot group is associated with a      consistency group.
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


  /**
   * The importance of the rollback operation. This value is overridden by consistency group setting if this snapshot group is associated with a consistency group.
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
   * The name of the new snapshot group.
   **/
  public SnapshotGroupUpdateRequest name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The name of the new snapshot group.")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   * The repository utilization warning threshold, as a percentage of the      repository volume capacity.
   **/
  public SnapshotGroupUpdateRequest warningThreshold(Integer warningThreshold) {
    this.warningThreshold = warningThreshold;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The repository utilization warning threshold, as a percentage of the      repository volume capacity.")
  @JsonProperty("warningThreshold")
  public Integer getWarningThreshold() {
    return warningThreshold;
  }
  
  public void setWarningThreshold(Integer warningThreshold) {
    this.warningThreshold = warningThreshold;
  }

  
  /**
   * The automatic deletion indicator. If non-zero, the oldest snapshot      image will be automatically deleted when creating a new snapshot image to keep the total      number of snapshot images limited to the number specified.
   **/
  public SnapshotGroupUpdateRequest autoDeleteLimit(Integer autoDeleteLimit) {
    this.autoDeleteLimit = autoDeleteLimit;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The automatic deletion indicator. If non-zero, the oldest snapshot      image will be automatically deleted when creating a new snapshot image to keep the total      number of snapshot images limited to the number specified.")
  @JsonProperty("autoDeleteLimit")
  public Integer getAutoDeleteLimit() {
    return autoDeleteLimit;
  }
  
  public void setAutoDeleteLimit(Integer autoDeleteLimit) {
    this.autoDeleteLimit = autoDeleteLimit;
  }

  
  /**
   * The behavior on when the data repository becomes full. This value      is overridden by consistency group setting if this snapshot group is associated with a      consistency group.
   **/
  public SnapshotGroupUpdateRequest fullPolicy(FullPolicyEnum fullPolicy) {
    this.fullPolicy = fullPolicy;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The behavior on when the data repository becomes full. This value      is overridden by consistency group setting if this snapshot group is associated with a      consistency group.")
  @JsonProperty("fullPolicy")
  public FullPolicyEnum getFullPolicy() {
    return fullPolicy;
  }
  
  public void setFullPolicy(FullPolicyEnum fullPolicy) {
    this.fullPolicy = fullPolicy;
  }

  
  /**
   * The importance of the rollback operation. This value is overridden by consistency group setting if this snapshot group is associated with a consistency group.
   **/
  public SnapshotGroupUpdateRequest rollbackPriority(RollbackPriorityEnum rollbackPriority) {
    this.rollbackPriority = rollbackPriority;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The importance of the rollback operation. This value is overridden by consistency group setting if this snapshot group is associated with a consistency group.")
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
    SnapshotGroupUpdateRequest snapshotGroupUpdateRequest = (SnapshotGroupUpdateRequest) o;
    return Objects.equals(this.name, snapshotGroupUpdateRequest.name) &&
        Objects.equals(this.warningThreshold, snapshotGroupUpdateRequest.warningThreshold) &&
        Objects.equals(this.autoDeleteLimit, snapshotGroupUpdateRequest.autoDeleteLimit) &&
        Objects.equals(this.fullPolicy, snapshotGroupUpdateRequest.fullPolicy) &&
        Objects.equals(this.rollbackPriority, snapshotGroupUpdateRequest.rollbackPriority);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, warningThreshold, autoDeleteLimit, fullPolicy, rollbackPriority);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SnapshotGroupUpdateRequest {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    warningThreshold: ").append(toIndentedString(warningThreshold)).append("\n");
    sb.append("    autoDeleteLimit: ").append(toIndentedString(autoDeleteLimit)).append("\n");
    sb.append("    fullPolicy: ").append(toIndentedString(fullPolicy)).append("\n");
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

