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
 * SnapshotGroup
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2017-10-04T15:05:52.333-05:00")
public class SnapshotGroup   {
  
    private String pitGroupRef;

    private String label;


  /**
   * The status of the PiT Group.
   */
  public enum StatusEnum {
    unknown("unknown"),
    optimal("optimal"),
    full("full"),
    failed("failed"),
    overThreshold("overThreshold"),
    __UNDEFINED("__UNDEFINED");
;
    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

    private StatusEnum status;

    private String baseVolume;

    private String repositoryVolume;

    private Integer clusterSize;

    private Long maxRepositoryCapacity;

    private Long maxBaseCapacity;

    private Long unusableRepositoryCapacity;


  /**
   * The behavior on repository full condition. Overridden by consistency group setting if this PITGroup is associated with a consistency group.
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
   * Long running operation.
   */
  public enum ActionEnum {
    none("none"),
    copyback("copyback"),
    initializing("initializing"),
    reconstructing("reconstructing"),
    remappingDce("remappingDce"),
    remappingDrm("remappingDrm"),
    remappingDcedrm("remappingDcedrm"),
    remappingDseg("remappingDseg"),
    remappingDve("remappingDve"),
    remappingDcedve("remappingDcedve"),
    remappingInternal("remappingInternal"),
    remappingDefrag("remappingDefrag"),
    formatting("formatting"),
    synchronizing("synchronizing"),
    parityScan("parityScan"),
    volumeCopy("volumeCopy"),
    snapshotRollback("snapshotRollback"),
    pitRollback("pitRollback"),
    asyncMirrorGroupInitialSync("asyncMirrorGroupInitialSync"),
    reconstructingCritical("reconstructingCritical"),
    rebalancing("rebalancing"),
    copyThenFail("copyThenFail"),
    copyThenFailPending("copyThenFailPending"),
    copyThenReplace("copyThenReplace"),
    copyThenReplaceAndFail("copyThenReplaceAndFail"),
    thinDefrag("thinDefrag"),
    creating("creating"),
    deleting("deleting"),
    __UNDEFINED("__UNDEFINED");
;
    private String value;

    ActionEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

    private ActionEnum action;


  /**
   * The status of the rollback (if rollback is indicated in VolumeAction above).
   */
  public enum RollbackStatusEnum {
    unknown("unknown"),
    none("none"),
    inProgress("inProgress"),
    pending("pending"),
    paused("paused"),
    __UNDEFINED("__UNDEFINED");
;
    private String value;

    RollbackStatusEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

    private RollbackStatusEnum rollbackStatus;


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

    private Boolean consistencyGroup;

    private String consistencyGroupRef;


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

    private Integer volumeHandle;

    private String volcopyId;

    private Integer snapshotCount;

    private Long repositoryCapacity;

    private String id;

    private String name;

  
  /**
   * The reference (key) for the PiT Group.
   **/
  public SnapshotGroup pitGroupRef(String pitGroupRef) {
    this.pitGroupRef = pitGroupRef;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The reference (key) for the PiT Group.")
  @JsonProperty("pitGroupRef")
  public String getPitGroupRef() {
    return pitGroupRef;
  }
  
  public void setPitGroupRef(String pitGroupRef) {
    this.pitGroupRef = pitGroupRef;
  }

  
  /**
   * The name of the PiT Group. If this PiT group is part of a consistency group, then this label does not have to be present or unique as the parent consistency group label will be used.
   **/
  public SnapshotGroup label(String label) {
    this.label = label;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The name of the PiT Group. If this PiT group is part of a consistency group, then this label does not have to be present or unique as the parent consistency group label will be used.")
  @JsonProperty("label")
  public String getLabel() {
    return label;
  }
  
  public void setLabel(String label) {
    this.label = label;
  }

  
  /**
   * The status of the PiT Group.
   **/
  public SnapshotGroup status(StatusEnum status) {
    this.status = status;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The status of the PiT Group.")
  @JsonProperty("status")
  public StatusEnum getStatus() {
    return status;
  }
  
  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  
  /**
   * The base volume for this PiT Group.
   **/
  public SnapshotGroup baseVolume(String baseVolume) {
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
   * The copy-on-write (CoW) Repository for this PiT group.
   **/
  public SnapshotGroup repositoryVolume(String repositoryVolume) {
    this.repositoryVolume = repositoryVolume;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The copy-on-write (CoW) Repository for this PiT group.")
  @JsonProperty("repositoryVolume")
  public String getRepositoryVolume() {
    return repositoryVolume;
  }
  
  public void setRepositoryVolume(String repositoryVolume) {
    this.repositoryVolume = repositoryVolume;
  }

  
  /**
   * The cluster size (in bytes).
   **/
  public SnapshotGroup clusterSize(Integer clusterSize) {
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
   * The maximum allowable repository size (in bytes) based on current cluster size. Only applicable if there is at least one PiT in the PiT group.
   **/
  public SnapshotGroup maxRepositoryCapacity(Long maxRepositoryCapacity) {
    this.maxRepositoryCapacity = maxRepositoryCapacity;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The maximum allowable repository size (in bytes) based on current cluster size. Only applicable if there is at least one PiT in the PiT group.")
  @JsonProperty("maxRepositoryCapacity")
  public Long getMaxRepositoryCapacity() {
    return maxRepositoryCapacity;
  }
  
  public void setMaxRepositoryCapacity(Long maxRepositoryCapacity) {
    this.maxRepositoryCapacity = maxRepositoryCapacity;
  }

  
  /**
   * The maximum allowable base volume size (in bytes) based on current cluster size. Only applicable if there is at least one PiT in the PiT group.
   **/
  public SnapshotGroup maxBaseCapacity(Long maxBaseCapacity) {
    this.maxBaseCapacity = maxBaseCapacity;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The maximum allowable base volume size (in bytes) based on current cluster size. Only applicable if there is at least one PiT in the PiT group.")
  @JsonProperty("maxBaseCapacity")
  public Long getMaxBaseCapacity() {
    return maxBaseCapacity;
  }
  
  public void setMaxBaseCapacity(Long maxBaseCapacity) {
    this.maxBaseCapacity = maxBaseCapacity;
  }

  
  /**
   * The amount of repository capacity that is unusable due to limited addressability of the current cluster size.
   **/
  public SnapshotGroup unusableRepositoryCapacity(Long unusableRepositoryCapacity) {
    this.unusableRepositoryCapacity = unusableRepositoryCapacity;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The amount of repository capacity that is unusable due to limited addressability of the current cluster size.")
  @JsonProperty("unusableRepositoryCapacity")
  public Long getUnusableRepositoryCapacity() {
    return unusableRepositoryCapacity;
  }
  
  public void setUnusableRepositoryCapacity(Long unusableRepositoryCapacity) {
    this.unusableRepositoryCapacity = unusableRepositoryCapacity;
  }

  
  /**
   * The behavior on repository full condition. Overridden by consistency group setting if this PITGroup is associated with a consistency group.
   **/
  public SnapshotGroup repFullPolicy(RepFullPolicyEnum repFullPolicy) {
    this.repFullPolicy = repFullPolicy;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The behavior on repository full condition. Overridden by consistency group setting if this PITGroup is associated with a consistency group.")
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
  public SnapshotGroup fullWarnThreshold(Integer fullWarnThreshold) {
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
   * The auto-delete indicator. If non-zero, the oldest PiT will be automatically deleted when creating a new one to keep the total number of PiTs limited to the number specified. This value is overridden by the consistency group setting if this PITGroup is associated with a consistency group.
   **/
  public SnapshotGroup autoDeleteLimit(Integer autoDeleteLimit) {
    this.autoDeleteLimit = autoDeleteLimit;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The auto-delete indicator. If non-zero, the oldest PiT will be automatically deleted when creating a new one to keep the total number of PiTs limited to the number specified. This value is overridden by the consistency group setting if this PITGroup is associated with a consistency group.")
  @JsonProperty("autoDeleteLimit")
  public Integer getAutoDeleteLimit() {
    return autoDeleteLimit;
  }
  
  public void setAutoDeleteLimit(Integer autoDeleteLimit) {
    this.autoDeleteLimit = autoDeleteLimit;
  }

  
  /**
   * Long running operation.
   **/
  public SnapshotGroup action(ActionEnum action) {
    this.action = action;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Long running operation.")
  @JsonProperty("action")
  public ActionEnum getAction() {
    return action;
  }
  
  public void setAction(ActionEnum action) {
    this.action = action;
  }

  
  /**
   * The status of the rollback (if rollback is indicated in VolumeAction above).
   **/
  public SnapshotGroup rollbackStatus(RollbackStatusEnum rollbackStatus) {
    this.rollbackStatus = rollbackStatus;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The status of the rollback (if rollback is indicated in VolumeAction above).")
  @JsonProperty("rollbackStatus")
  public RollbackStatusEnum getRollbackStatus() {
    return rollbackStatus;
  }
  
  public void setRollbackStatus(RollbackStatusEnum rollbackStatus) {
    this.rollbackStatus = rollbackStatus;
  }

  
  /**
   * The importance of the rollback operation.
   **/
  public SnapshotGroup rollbackPriority(RollbackPriorityEnum rollbackPriority) {
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
   * If true, this PiT group is part of a consistency group.
   **/
  public SnapshotGroup consistencyGroup(Boolean consistencyGroup) {
    this.consistencyGroup = consistencyGroup;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "If true, this PiT group is part of a consistency group.")
  @JsonProperty("consistencyGroup")
  public Boolean getConsistencyGroup() {
    return consistencyGroup;
  }
  
  public void setConsistencyGroup(Boolean consistencyGroup) {
    this.consistencyGroup = consistencyGroup;
  }

  
  /**
   * A reference to the parent consistency group, if applicable. This value will be NULL if this PiT group is not part of a consistency group.
   **/
  public SnapshotGroup consistencyGroupRef(String consistencyGroupRef) {
    this.consistencyGroupRef = consistencyGroupRef;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "A reference to the parent consistency group, if applicable. This value will be NULL if this PiT group is not part of a consistency group.")
  @JsonProperty("consistencyGroupRef")
  public String getConsistencyGroupRef() {
    return consistencyGroupRef;
  }
  
  public void setConsistencyGroupRef(String consistencyGroupRef) {
    this.consistencyGroupRef = consistencyGroupRef;
  }

  
  /**
   * The status of Pending PiT Creation.
   **/
  public SnapshotGroup creationPendingStatus(CreationPendingStatusEnum creationPendingStatus) {
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
   * The PiT group SSID. This is provided primarily for debug purposes.
   **/
  public SnapshotGroup volumeHandle(Integer volumeHandle) {
    this.volumeHandle = volumeHandle;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The PiT group SSID. This is provided primarily for debug purposes.")
  @JsonProperty("volumeHandle")
  public Integer getVolumeHandle() {
    return volumeHandle;
  }
  
  public void setVolumeHandle(Integer volumeHandle) {
    this.volumeHandle = volumeHandle;
  }

  
  /**
   **/
  public SnapshotGroup volcopyId(String volcopyId) {
    this.volcopyId = volcopyId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("volcopyId")
  public String getVolcopyId() {
    return volcopyId;
  }
  
  public void setVolcopyId(String volcopyId) {
    this.volcopyId = volcopyId;
  }

  
  /**
   **/
  public SnapshotGroup snapshotCount(Integer snapshotCount) {
    this.snapshotCount = snapshotCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("snapshotCount")
  public Integer getSnapshotCount() {
    return snapshotCount;
  }
  
  public void setSnapshotCount(Integer snapshotCount) {
    this.snapshotCount = snapshotCount;
  }

  
  /**
   * The aggregate capacity of the repository in bytes
   **/
  public SnapshotGroup repositoryCapacity(Long repositoryCapacity) {
    this.repositoryCapacity = repositoryCapacity;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The aggregate capacity of the repository in bytes")
  @JsonProperty("repositoryCapacity")
  public Long getRepositoryCapacity() {
    return repositoryCapacity;
  }
  
  public void setRepositoryCapacity(Long repositoryCapacity) {
    this.repositoryCapacity = repositoryCapacity;
  }

  
  /**
   **/
  public SnapshotGroup id(String id) {
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

  
  /**
   **/
  public SnapshotGroup name(String name) {
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

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SnapshotGroup snapshotGroup = (SnapshotGroup) o;
    return Objects.equals(this.pitGroupRef, snapshotGroup.pitGroupRef) &&
        Objects.equals(this.label, snapshotGroup.label) &&
        Objects.equals(this.status, snapshotGroup.status) &&
        Objects.equals(this.baseVolume, snapshotGroup.baseVolume) &&
        Objects.equals(this.repositoryVolume, snapshotGroup.repositoryVolume) &&
        Objects.equals(this.clusterSize, snapshotGroup.clusterSize) &&
        Objects.equals(this.maxRepositoryCapacity, snapshotGroup.maxRepositoryCapacity) &&
        Objects.equals(this.maxBaseCapacity, snapshotGroup.maxBaseCapacity) &&
        Objects.equals(this.unusableRepositoryCapacity, snapshotGroup.unusableRepositoryCapacity) &&
        Objects.equals(this.repFullPolicy, snapshotGroup.repFullPolicy) &&
        Objects.equals(this.fullWarnThreshold, snapshotGroup.fullWarnThreshold) &&
        Objects.equals(this.autoDeleteLimit, snapshotGroup.autoDeleteLimit) &&
        Objects.equals(this.action, snapshotGroup.action) &&
        Objects.equals(this.rollbackStatus, snapshotGroup.rollbackStatus) &&
        Objects.equals(this.rollbackPriority, snapshotGroup.rollbackPriority) &&
        Objects.equals(this.consistencyGroup, snapshotGroup.consistencyGroup) &&
        Objects.equals(this.consistencyGroupRef, snapshotGroup.consistencyGroupRef) &&
        Objects.equals(this.creationPendingStatus, snapshotGroup.creationPendingStatus) &&
        Objects.equals(this.volumeHandle, snapshotGroup.volumeHandle) &&
        Objects.equals(this.volcopyId, snapshotGroup.volcopyId) &&
        Objects.equals(this.snapshotCount, snapshotGroup.snapshotCount) &&
        Objects.equals(this.repositoryCapacity, snapshotGroup.repositoryCapacity) &&
        Objects.equals(this.id, snapshotGroup.id) &&
        Objects.equals(this.name, snapshotGroup.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pitGroupRef, label, status, baseVolume, repositoryVolume, clusterSize, maxRepositoryCapacity, maxBaseCapacity, unusableRepositoryCapacity, repFullPolicy, fullWarnThreshold, autoDeleteLimit, action, rollbackStatus, rollbackPriority, consistencyGroup, consistencyGroupRef, creationPendingStatus, volumeHandle, volcopyId, snapshotCount, repositoryCapacity, id, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SnapshotGroup {\n");
    
    sb.append("    pitGroupRef: ").append(toIndentedString(pitGroupRef)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    baseVolume: ").append(toIndentedString(baseVolume)).append("\n");
    sb.append("    repositoryVolume: ").append(toIndentedString(repositoryVolume)).append("\n");
    sb.append("    clusterSize: ").append(toIndentedString(clusterSize)).append("\n");
    sb.append("    maxRepositoryCapacity: ").append(toIndentedString(maxRepositoryCapacity)).append("\n");
    sb.append("    maxBaseCapacity: ").append(toIndentedString(maxBaseCapacity)).append("\n");
    sb.append("    unusableRepositoryCapacity: ").append(toIndentedString(unusableRepositoryCapacity)).append("\n");
    sb.append("    repFullPolicy: ").append(toIndentedString(repFullPolicy)).append("\n");
    sb.append("    fullWarnThreshold: ").append(toIndentedString(fullWarnThreshold)).append("\n");
    sb.append("    autoDeleteLimit: ").append(toIndentedString(autoDeleteLimit)).append("\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    rollbackStatus: ").append(toIndentedString(rollbackStatus)).append("\n");
    sb.append("    rollbackPriority: ").append(toIndentedString(rollbackPriority)).append("\n");
    sb.append("    consistencyGroup: ").append(toIndentedString(consistencyGroup)).append("\n");
    sb.append("    consistencyGroupRef: ").append(toIndentedString(consistencyGroupRef)).append("\n");
    sb.append("    creationPendingStatus: ").append(toIndentedString(creationPendingStatus)).append("\n");
    sb.append("    volumeHandle: ").append(toIndentedString(volumeHandle)).append("\n");
    sb.append("    volcopyId: ").append(toIndentedString(volcopyId)).append("\n");
    sb.append("    snapshotCount: ").append(toIndentedString(snapshotCount)).append("\n");
    sb.append("    repositoryCapacity: ").append(toIndentedString(repositoryCapacity)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

