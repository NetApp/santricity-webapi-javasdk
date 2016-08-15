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
 * PITConsistencyGroup
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2016-08-12T15:32:46.001-05:00")
public class PITConsistencyGroup   {
  
    private String cgRef;

    private String label;


  /**
   * The behavior on repository full condition.
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
   * The importance of the rollback operation.
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

    private List<Long> uniqueSequenceNumber;


  /**
   * The status of Pending PiT Creation.
   */
  public enum CreationPendingStatusEnum {
    unknown("unknown"),
    none("none"),
    waiting("waiting"),
    failed("failed"),
    __UNDEFINED("__UNDEFINED");
;
    private String value;

    CreationPendingStatusEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

    private CreationPendingStatusEnum creationPendingStatus;

    private String name;

    private String id;

  
  /**
   * The reference (key) for this PITConsistencyGroup.
   **/
  public PITConsistencyGroup cgRef(String cgRef) {
    this.cgRef = cgRef;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The reference (key) for this PITConsistencyGroup.")
  @JsonProperty("cgRef")
  public String getCgRef() {
    return cgRef;
  }
  
  public void setCgRef(String cgRef) {
    this.cgRef = cgRef;
  }

  
  /**
   * The name of the Consistency Group.
   **/
  public PITConsistencyGroup label(String label) {
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
   * The behavior on repository full condition.
   **/
  public PITConsistencyGroup repFullPolicy(RepFullPolicyEnum repFullPolicy) {
    this.repFullPolicy = repFullPolicy;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The behavior on repository full condition.")
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
  public PITConsistencyGroup fullWarnThreshold(Integer fullWarnThreshold) {
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
   * The auto-delete indicator. If non-zero, the oldest PiT will be automatically deleted when creating a new one to keep the total number of PiTs limited to the number specified.
   **/
  public PITConsistencyGroup autoDeleteLimit(Integer autoDeleteLimit) {
    this.autoDeleteLimit = autoDeleteLimit;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The auto-delete indicator. If non-zero, the oldest PiT will be automatically deleted when creating a new one to keep the total number of PiTs limited to the number specified.")
  @JsonProperty("autoDeleteLimit")
  public Integer getAutoDeleteLimit() {
    return autoDeleteLimit;
  }
  
  public void setAutoDeleteLimit(Integer autoDeleteLimit) {
    this.autoDeleteLimit = autoDeleteLimit;
  }

  
  /**
   * The importance of the rollback operation.
   **/
  public PITConsistencyGroup rollbackPriority(RollbackPriorityEnum rollbackPriority) {
    this.rollbackPriority = rollbackPriority;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The importance of the rollback operation.")
  @JsonProperty("rollbackPriority")
  public RollbackPriorityEnum getRollbackPriority() {
    return rollbackPriority;
  }
  
  public void setRollbackPriority(RollbackPriorityEnum rollbackPriority) {
    this.rollbackPriority = rollbackPriority;
  }

  
  /**
   * A list of all unique sequence numbers for all existing PiTs of members in this consistency group.
   **/
  public PITConsistencyGroup uniqueSequenceNumber(List<Long> uniqueSequenceNumber) {
    this.uniqueSequenceNumber = uniqueSequenceNumber;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "A list of all unique sequence numbers for all existing PiTs of members in this consistency group.")
  @JsonProperty("uniqueSequenceNumber")
  public List<Long> getUniqueSequenceNumber() {
    return uniqueSequenceNumber;
  }
  
  public void setUniqueSequenceNumber(List<Long> uniqueSequenceNumber) {
    this.uniqueSequenceNumber = uniqueSequenceNumber;
  }

  
  /**
   * The status of Pending PiT Creation.
   **/
  public PITConsistencyGroup creationPendingStatus(CreationPendingStatusEnum creationPendingStatus) {
    this.creationPendingStatus = creationPendingStatus;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The status of Pending PiT Creation.")
  @JsonProperty("creationPendingStatus")
  public CreationPendingStatusEnum getCreationPendingStatus() {
    return creationPendingStatus;
  }
  
  public void setCreationPendingStatus(CreationPendingStatusEnum creationPendingStatus) {
    this.creationPendingStatus = creationPendingStatus;
  }

  
  /**
   **/
  public PITConsistencyGroup name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   **/
  public PITConsistencyGroup id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  
  public void setId(String id) {
    this.id = id;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PITConsistencyGroup pITConsistencyGroup = (PITConsistencyGroup) o;
    return Objects.equals(this.cgRef, pITConsistencyGroup.cgRef) &&
        Objects.equals(this.label, pITConsistencyGroup.label) &&
        Objects.equals(this.repFullPolicy, pITConsistencyGroup.repFullPolicy) &&
        Objects.equals(this.fullWarnThreshold, pITConsistencyGroup.fullWarnThreshold) &&
        Objects.equals(this.autoDeleteLimit, pITConsistencyGroup.autoDeleteLimit) &&
        Objects.equals(this.rollbackPriority, pITConsistencyGroup.rollbackPriority) &&
        Objects.equals(this.uniqueSequenceNumber, pITConsistencyGroup.uniqueSequenceNumber) &&
        Objects.equals(this.creationPendingStatus, pITConsistencyGroup.creationPendingStatus) &&
        Objects.equals(this.name, pITConsistencyGroup.name) &&
        Objects.equals(this.id, pITConsistencyGroup.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cgRef, label, repFullPolicy, fullWarnThreshold, autoDeleteLimit, rollbackPriority, uniqueSequenceNumber, creationPendingStatus, name, id);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PITConsistencyGroup {\n");
    
    sb.append("    cgRef: ").append(toIndentedString(cgRef)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    repFullPolicy: ").append(toIndentedString(repFullPolicy)).append("\n");
    sb.append("    fullWarnThreshold: ").append(toIndentedString(fullWarnThreshold)).append("\n");
    sb.append("    autoDeleteLimit: ").append(toIndentedString(autoDeleteLimit)).append("\n");
    sb.append("    rollbackPriority: ").append(toIndentedString(rollbackPriority)).append("\n");
    sb.append("    uniqueSequenceNumber: ").append(toIndentedString(uniqueSequenceNumber)).append("\n");
    sb.append("    creationPendingStatus: ").append(toIndentedString(creationPendingStatus)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

