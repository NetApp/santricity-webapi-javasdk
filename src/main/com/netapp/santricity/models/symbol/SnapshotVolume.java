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
 * SnapshotVolume
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2017-10-04T15:05:55.769-05:00")
public class SnapshotVolume   {
  
    private String worldWideName;

    private String snapshotRef;

    private String label;


  /**
   * Indicates status of the snapshot.
   */
  public enum StatusEnum {
    active("active"),
    failed("failed"),
    disabled("disabled"),
    offline("offline"),
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


  /**
   * Long running action.
   */
  public enum ActionEnum {
    none("none"),
    rollback("rollback"),
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

    private String currentManager;

    private String baseVolume;

    private String repositoryVolume;

    private Integer fullWarnThreshold;

    private Boolean overWarnThreshold;

    private Boolean repositoryFull;


  /**
   * Indication of the volume behavior when the repository is full.
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

    private Integer rollbackPriority;

    private Long extentStart;

    private Long extentSize;

    private Long snapshotTime;

    private VolumePerms perms;

    private Boolean childrenInactive;

    private Integer volumeHandle;

    private Integer mgmtClientAttribute;


  /**
   * Status of current action being performed on snapshot.
   */
  public enum RollbackStatusEnum {
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

    private String id;

  
  /**
   * The World Wide Name of the snapshot.
   **/
  public SnapshotVolume worldWideName(String worldWideName) {
    this.worldWideName = worldWideName;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The World Wide Name of the snapshot.")
  @JsonProperty("worldWideName")
  public String getWorldWideName() {
    return worldWideName;
  }
  
  public void setWorldWideName(String worldWideName) {
    this.worldWideName = worldWideName;
  }

  
  /**
   * Reference (key) for the snapshot volume.
   **/
  public SnapshotVolume snapshotRef(String snapshotRef) {
    this.snapshotRef = snapshotRef;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Reference (key) for the snapshot volume.")
  @JsonProperty("snapshotRef")
  public String getSnapshotRef() {
    return snapshotRef;
  }
  
  public void setSnapshotRef(String snapshotRef) {
    this.snapshotRef = snapshotRef;
  }

  
  /**
   * Name of the snapshot.
   **/
  public SnapshotVolume label(String label) {
    this.label = label;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Name of the snapshot.")
  @JsonProperty("label")
  public String getLabel() {
    return label;
  }
  
  public void setLabel(String label) {
    this.label = label;
  }

  
  /**
   * Indicates status of the snapshot.
   **/
  public SnapshotVolume status(StatusEnum status) {
    this.status = status;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Indicates status of the snapshot.")
  @JsonProperty("status")
  public StatusEnum getStatus() {
    return status;
  }
  
  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  
  /**
   * Long running action.
   **/
  public SnapshotVolume action(ActionEnum action) {
    this.action = action;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Long running action.")
  @JsonProperty("action")
  public ActionEnum getAction() {
    return action;
  }
  
  public void setAction(ActionEnum action) {
    this.action = action;
  }

  
  /**
   * Current owner of the snapshot.
   **/
  public SnapshotVolume currentManager(String currentManager) {
    this.currentManager = currentManager;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Current owner of the snapshot.")
  @JsonProperty("currentManager")
  public String getCurrentManager() {
    return currentManager;
  }
  
  public void setCurrentManager(String currentManager) {
    this.currentManager = currentManager;
  }

  
  /**
   * Base volume for this snapshot.
   **/
  public SnapshotVolume baseVolume(String baseVolume) {
    this.baseVolume = baseVolume;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Base volume for this snapshot.")
  @JsonProperty("baseVolume")
  public String getBaseVolume() {
    return baseVolume;
  }
  
  public void setBaseVolume(String baseVolume) {
    this.baseVolume = baseVolume;
  }

  
  /**
   * Repository volume for this snapshot.
   **/
  public SnapshotVolume repositoryVolume(String repositoryVolume) {
    this.repositoryVolume = repositoryVolume;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Repository volume for this snapshot.")
  @JsonProperty("repositoryVolume")
  public String getRepositoryVolume() {
    return repositoryVolume;
  }
  
  public void setRepositoryVolume(String repositoryVolume) {
    this.repositoryVolume = repositoryVolume;
  }

  
  /**
   * Repository utilization warning threshold.
   **/
  public SnapshotVolume fullWarnThreshold(Integer fullWarnThreshold) {
    this.fullWarnThreshold = fullWarnThreshold;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Repository utilization warning threshold.")
  @JsonProperty("fullWarnThreshold")
  public Integer getFullWarnThreshold() {
    return fullWarnThreshold;
  }
  
  public void setFullWarnThreshold(Integer fullWarnThreshold) {
    this.fullWarnThreshold = fullWarnThreshold;
  }

  
  /**
   * True if the repository utilization is over the warning threshold.
   **/
  public SnapshotVolume overWarnThreshold(Boolean overWarnThreshold) {
    this.overWarnThreshold = overWarnThreshold;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "True if the repository utilization is over the warning threshold.")
  @JsonProperty("overWarnThreshold")
  public Boolean getOverWarnThreshold() {
    return overWarnThreshold;
  }
  
  public void setOverWarnThreshold(Boolean overWarnThreshold) {
    this.overWarnThreshold = overWarnThreshold;
  }

  
  /**
   * True, if the repository is full.
   **/
  public SnapshotVolume repositoryFull(Boolean repositoryFull) {
    this.repositoryFull = repositoryFull;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "True, if the repository is full.")
  @JsonProperty("repositoryFull")
  public Boolean getRepositoryFull() {
    return repositoryFull;
  }
  
  public void setRepositoryFull(Boolean repositoryFull) {
    this.repositoryFull = repositoryFull;
  }

  
  /**
   * Indication of the volume behavior when the repository is full.
   **/
  public SnapshotVolume repFullPolicy(RepFullPolicyEnum repFullPolicy) {
    this.repFullPolicy = repFullPolicy;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Indication of the volume behavior when the repository is full.")
  @JsonProperty("repFullPolicy")
  public RepFullPolicyEnum getRepFullPolicy() {
    return repFullPolicy;
  }
  
  public void setRepFullPolicy(RepFullPolicyEnum repFullPolicy) {
    this.repFullPolicy = repFullPolicy;
  }

  
  /**
   * The importance of the rollback operation (0-4). Not used in this release of software.
   **/
  public SnapshotVolume rollbackPriority(Integer rollbackPriority) {
    this.rollbackPriority = rollbackPriority;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The importance of the rollback operation (0-4). Not used in this release of software.")
  @JsonProperty("rollbackPriority")
  public Integer getRollbackPriority() {
    return rollbackPriority;
  }
  
  public void setRollbackPriority(Integer rollbackPriority) {
    this.rollbackPriority = rollbackPriority;
  }

  
  /**
   * The start position of the extent in the base volume (bytes). Not used in this release of software.
   **/
  public SnapshotVolume extentStart(Long extentStart) {
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
  public SnapshotVolume extentSize(Long extentSize) {
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
   * The controller time when the snapshot was created.
   **/
  public SnapshotVolume snapshotTime(Long snapshotTime) {
    this.snapshotTime = snapshotTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The controller time when the snapshot was created.")
  @JsonProperty("snapshotTime")
  public Long getSnapshotTime() {
    return snapshotTime;
  }
  
  public void setSnapshotTime(Long snapshotTime) {
    this.snapshotTime = snapshotTime;
  }

  
  /**
   * Permissions allowed on volume.
   **/
  public SnapshotVolume perms(VolumePerms perms) {
    this.perms = perms;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Permissions allowed on volume.")
  @JsonProperty("perms")
  public VolumePerms getPerms() {
    return perms;
  }
  
  public void setPerms(VolumePerms perms) {
    this.perms = perms;
  }

  
  /**
   * True if all child volumes are offline or failed. Child volumes are the base volume and the REPOSITORY volume.
   **/
  public SnapshotVolume childrenInactive(Boolean childrenInactive) {
    this.childrenInactive = childrenInactive;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "True if all child volumes are offline or failed. Child volumes are the base volume and the REPOSITORY volume.")
  @JsonProperty("childrenInactive")
  public Boolean getChildrenInactive() {
    return childrenInactive;
  }
  
  public void setChildrenInactive(Boolean childrenInactive) {
    this.childrenInactive = childrenInactive;
  }

  
  /**
   * Volume SSID.
   **/
  public SnapshotVolume volumeHandle(Integer volumeHandle) {
    this.volumeHandle = volumeHandle;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Volume SSID.")
  @JsonProperty("volumeHandle")
  public Integer getVolumeHandle() {
    return volumeHandle;
  }
  
  public void setVolumeHandle(Integer volumeHandle) {
    this.volumeHandle = volumeHandle;
  }

  
  /**
   * For use by management client.
   **/
  public SnapshotVolume mgmtClientAttribute(Integer mgmtClientAttribute) {
    this.mgmtClientAttribute = mgmtClientAttribute;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "For use by management client.")
  @JsonProperty("mgmtClientAttribute")
  public Integer getMgmtClientAttribute() {
    return mgmtClientAttribute;
  }
  
  public void setMgmtClientAttribute(Integer mgmtClientAttribute) {
    this.mgmtClientAttribute = mgmtClientAttribute;
  }

  
  /**
   * Status of current action being performed on snapshot.
   **/
  public SnapshotVolume rollbackStatus(RollbackStatusEnum rollbackStatus) {
    this.rollbackStatus = rollbackStatus;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Status of current action being performed on snapshot.")
  @JsonProperty("rollbackStatus")
  public RollbackStatusEnum getRollbackStatus() {
    return rollbackStatus;
  }
  
  public void setRollbackStatus(RollbackStatusEnum rollbackStatus) {
    this.rollbackStatus = rollbackStatus;
  }

  
  /**
   **/
  public SnapshotVolume id(String id) {
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
    SnapshotVolume snapshotVolume = (SnapshotVolume) o;
    return Objects.equals(this.worldWideName, snapshotVolume.worldWideName) &&
        Objects.equals(this.snapshotRef, snapshotVolume.snapshotRef) &&
        Objects.equals(this.label, snapshotVolume.label) &&
        Objects.equals(this.status, snapshotVolume.status) &&
        Objects.equals(this.action, snapshotVolume.action) &&
        Objects.equals(this.currentManager, snapshotVolume.currentManager) &&
        Objects.equals(this.baseVolume, snapshotVolume.baseVolume) &&
        Objects.equals(this.repositoryVolume, snapshotVolume.repositoryVolume) &&
        Objects.equals(this.fullWarnThreshold, snapshotVolume.fullWarnThreshold) &&
        Objects.equals(this.overWarnThreshold, snapshotVolume.overWarnThreshold) &&
        Objects.equals(this.repositoryFull, snapshotVolume.repositoryFull) &&
        Objects.equals(this.repFullPolicy, snapshotVolume.repFullPolicy) &&
        Objects.equals(this.rollbackPriority, snapshotVolume.rollbackPriority) &&
        Objects.equals(this.extentStart, snapshotVolume.extentStart) &&
        Objects.equals(this.extentSize, snapshotVolume.extentSize) &&
        Objects.equals(this.snapshotTime, snapshotVolume.snapshotTime) &&
        Objects.equals(this.perms, snapshotVolume.perms) &&
        Objects.equals(this.childrenInactive, snapshotVolume.childrenInactive) &&
        Objects.equals(this.volumeHandle, snapshotVolume.volumeHandle) &&
        Objects.equals(this.mgmtClientAttribute, snapshotVolume.mgmtClientAttribute) &&
        Objects.equals(this.rollbackStatus, snapshotVolume.rollbackStatus) &&
        Objects.equals(this.id, snapshotVolume.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(worldWideName, snapshotRef, label, status, action, currentManager, baseVolume, repositoryVolume, fullWarnThreshold, overWarnThreshold, repositoryFull, repFullPolicy, rollbackPriority, extentStart, extentSize, snapshotTime, perms, childrenInactive, volumeHandle, mgmtClientAttribute, rollbackStatus, id);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SnapshotVolume {\n");
    
    sb.append("    worldWideName: ").append(toIndentedString(worldWideName)).append("\n");
    sb.append("    snapshotRef: ").append(toIndentedString(snapshotRef)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    currentManager: ").append(toIndentedString(currentManager)).append("\n");
    sb.append("    baseVolume: ").append(toIndentedString(baseVolume)).append("\n");
    sb.append("    repositoryVolume: ").append(toIndentedString(repositoryVolume)).append("\n");
    sb.append("    fullWarnThreshold: ").append(toIndentedString(fullWarnThreshold)).append("\n");
    sb.append("    overWarnThreshold: ").append(toIndentedString(overWarnThreshold)).append("\n");
    sb.append("    repositoryFull: ").append(toIndentedString(repositoryFull)).append("\n");
    sb.append("    repFullPolicy: ").append(toIndentedString(repFullPolicy)).append("\n");
    sb.append("    rollbackPriority: ").append(toIndentedString(rollbackPriority)).append("\n");
    sb.append("    extentStart: ").append(toIndentedString(extentStart)).append("\n");
    sb.append("    extentSize: ").append(toIndentedString(extentSize)).append("\n");
    sb.append("    snapshotTime: ").append(toIndentedString(snapshotTime)).append("\n");
    sb.append("    perms: ").append(toIndentedString(perms)).append("\n");
    sb.append("    childrenInactive: ").append(toIndentedString(childrenInactive)).append("\n");
    sb.append("    volumeHandle: ").append(toIndentedString(volumeHandle)).append("\n");
    sb.append("    mgmtClientAttribute: ").append(toIndentedString(mgmtClientAttribute)).append("\n");
    sb.append("    rollbackStatus: ").append(toIndentedString(rollbackStatus)).append("\n");
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

